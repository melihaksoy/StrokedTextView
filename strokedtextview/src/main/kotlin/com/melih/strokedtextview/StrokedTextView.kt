package com.melih.strokedtextview

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.os.Build
import android.text.Layout
import android.text.StaticLayout
import android.text.TextPaint
import android.util.AttributeSet
import android.util.Log
import androidx.appcompat.widget.AppCompatTextView

class StrokedTextView : AppCompatTextView {

    //region Constructors

    constructor(ctx: Context) : super(ctx, null)
    constructor(ctx: Context, attr: AttributeSet?) : super(ctx, attr, 0) {
        getStyledAttributes(attr)
    }

    constructor(ctx: Context, attr: AttributeSet?, defStyleAttr: Int) : super(ctx, attr, defStyleAttr) {
        getStyledAttributes(attr)
    }
    //endregion

    //region Members

    private var calcWidth = 0

    var strokeWidth = 4f
    var strokeColor = Color.RED

    /**
     * Static layout values are not mutable so we need to initialize it after text is set
     */
    private lateinit var staticLayout: StaticLayout

    private val staticLayoutPaint by lazy {
        TextPaint(Paint.ANTI_ALIAS_FLAG).apply {
            textSize = this@StrokedTextView.textSize
            typeface = this@StrokedTextView.typeface
        }
    }
    //endregion

    //region Methods

    private fun getStyledAttributes(attr: AttributeSet?) {
        context.obtainStyledAttributes(attr, R.styleable.StrokedTextView).apply {
            strokeWidth = getDimensionPixelSize(R.styleable.StrokedTextView_strokeThickness, 4).toFloat()
            strokeColor = getColor(R.styleable.StrokedTextView_strokeColor, Color.RED)
            recycle()
        }
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        // Just grabbing the width for static layout
        setPadding(paddingStart + strokeWidth.toInt() / 2, paddingTop, paddingRight + strokeWidth.toInt() / 2, paddingBottom)
        calcWidth = (MeasureSpec.getSize(widthMeasureSpec) - paddingStart)
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
    }

    override fun onDraw(canvas: Canvas?) {
        if (canvas == null) return

        reinitialzieStaticLayout()
        with(canvas) {
            save()
            translate(paddingStart.toFloat(), 0f)

            // Draw stroke first
            staticLayoutPaint.configureForStroke()
            staticLayout.draw(this)

            // Draw text
            staticLayoutPaint.configureForFill()
            staticLayout.draw(this)

            restore()
        }
    }

    private fun reinitialzieStaticLayout() {
        staticLayout = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            StaticLayout.Builder
                .obtain(text, 0, text.length, staticLayoutPaint, calcWidth)
                .setLineSpacing(lineSpacingExtra, lineSpacingMultiplier)
                .build()
        } else {
            StaticLayout(
                text,
                staticLayoutPaint,
                calcWidth,
                Layout.Alignment.ALIGN_NORMAL,
                lineSpacingMultiplier,
                lineSpacingExtra,
                true
            )
        }
    }

    private fun Paint.configureForFill() {
        style = Paint.Style.FILL
        color = textColors.defaultColor
    }

    private fun Paint.configureForStroke() {
        style = Paint.Style.STROKE
        color = strokeColor
        strokeWidth = this@StrokedTextView.strokeWidth
    }
    //endregion
}