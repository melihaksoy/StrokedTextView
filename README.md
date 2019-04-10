StrokedTextView
================
<a href="http://developer.android.com/index.html" target="_blank"><img src="https://img.shields.io/badge/platform-android-green.svg"/></a>
<a href="https://android-arsenal.com/api?level=15" target="_blank"><img src="https://img.shields.io/badge/API-19%2B-green.svg?style=flat"/></a> 
<a href="http://opensource.org/licenses/MIT" target="_blank"><img src="https://img.shields.io/badge/License-MIT-blue.svg?style=flat"/></a>


StrokedTextView is a simple view which draws strokes around your text, including multiline texts.


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
    <attr name="strokeThickness" format="dimension"/>
    <attr name="strokeColor" format="color"/>
```

## License
```
MIT License

Copyright (c) 2019 Melihcan Aksoy

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```