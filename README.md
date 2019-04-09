StrokedTextView
================
<a href="http://developer.android.com/index.html" target="_blank"><img src="https://img.shields.io/badge/platform-android-green.svg"/></a>
<a href="https://android-arsenal.com/api?level=15" target="_blank"><img src="https://img.shields.io/badge/API-19%2B-green.svg?style=flat"/></a> 
<a href="http://opensource.org/licenses/MIT" target="_blank"><img src="https://img.shields.io/badge/License-MIT-blue.svg?style=flat"/></a>


HoldToLoadLayout is a view group that can contain a single child. It draws your child to middle of layout, and performs loading wheel around it with settings you determined.


Sample Screenshot
===========
![Alt text](https://github.com/melihaksoy/StrokedTextView/blob/master/ss/ss.png "Sample screenshot")

# Simple Usage

```kotlin
<com.melih.strokedtextview.StrokedTextView
            android:id="@+id/strokedTextView"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="@string/text1"
            android:layout_marginTop="16dp"
            app:strokeColor="@color/colorPrimaryDark"
            app:strokeThickness="3dp"
            app:layout_constraintTop_toTopOf="parent"
            android:textSize="16sp"
            android:layout_marginEnd="16dp"/>
```

## XML Attributes

```xml
<declare-styleable name="StrokedTextView">
    <attr name="strokeThickness" format="dimension"/>
    <attr name="strokeColor" format="color"/>
</declare-styleable>
```