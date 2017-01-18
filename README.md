# DigitSpeedView

[![API](https://img.shields.io/badge/API-14%2B-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=14)
[![Download](https://api.bintray.com/packages/capur16/maven/DigitSpeedView/images/download.svg?version=1.0.2) ](https://bintray.com/capur16/maven/DigitSpeedView/1.0.2/link)

Awesome digital speedometer for android, [see project on GitHub](https://github.com/capur16/DigitSpeedView).

<img src="https://github.com/capur16/DigitSpeedView/blob/master/images/DigitSpeedView1.png" width="33%" />
<img src="https://github.com/capur16/DigitSpeedView/blob/master/images/DigitSpeedView2.png" width="33%" />
<img src="https://github.com/capur16/DigitSpeedView/blob/master/images/DigitSpeedView3.png" width="33%" />

Compatibility
-------------

This library is compatible from API 14 (Android 4.0).

Download
-------------

**add this line to** `build.gradle`

```gradle

dependencies {
	    compile 'com.github.capur16:digitspeedviewlib:1.0.2'
}

```

for **maven**

```maven
<dependency>
  <groupId>com.github.capur16</groupId>
  <artifactId>digitspeedviewlib</artifactId>
  <version>1.0.2</version>
  <type>pom</type>
</dependency>
```

Simple Usage
-------------
add DigitSpeedView to your `Layout.xml`.<br>
```xml

<com.github.capur16.digitspeedviewlib.DigitSpeedView
            android:id="@+id/digit_speed_view"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            app:speed="16" />

```

Advanced Usage
-------------

```xml

<com.github.capur16.digitspeedviewlib.DigitSpeedView
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                app:backgroundColor="@color/my_background_color"
                app:disableBackgroundImage="false"
                app:showUnit="true"
                app:backgroundDrawable="@drawable/my_background_image"
                app:speed="30"
                app:speedTextColor="@android:color/holo_blue_light"
                app:speedTextSize="20dp"
                app:unit="mph"
                app:unitTextColor="@android:color/holo_blue_light"
                app:unitTextSize="5dp" />

```

License
-------

    Copyright 2017 Riccardo Capuani

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at
    
       http://www.apache.org/licenses/LICENSE-2.0
    
    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.