StrokedTextView
================
<a href="" target="_blank"><img src="https://img.shields.io/github/release/melihaksoy/StrokedTextView.svg?color=FF">
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
            app:strokeColor="@color/colorPrimaryDark"
            app:strokeThickness="3dp"/>
```

## XML Attributes

```xml
    <attr name="strokeThickness" format="dimension"/>
    <attr name="strokeColor" format="color"/>
```

## Download
Add Jitpack to your root `build.gradle` repositories.
```groovy
allprojects {
    repositories {
        maven { url 'https://jitpack.io' }
    }
}
```

Add StrokedTextView to your module dependencies.
```groovy
dependencies {
    implementation 'com.github.melihaksoy:StrokedTextView:{currentVersion}'
}
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