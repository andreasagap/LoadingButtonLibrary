# LoadingButton
[![](https://jitpack.io/v/andreasagap/LoadingButtonLibrary.svg)](https://jitpack.io/#andreasagap/LoadingButtonLibrary)
[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)
</br>
</br>

<img src="https://raw.githubusercontent.com/andreasagap/LoadingButton/master/demofiles/demo.gif" alt="Demo"/>

## Usage

### Step 1
Add it in your root build.gradle at the end of repositories:
```
allprojects {
  repositories {
    ...
    maven { url 'https://jitpack.io' }
  }
}
``` 
Add dependency in your app level build.gradle.
```
dependencies {
  implementation 'com.github.andreasagap:LoadingButtonLibrary:v1.0'
}
``` 

### Step 2
**In xml** 
```xml
<android.support.constraint.ConstraintLayout 
xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:id="@+id/root"
    android:layout_height="match_parent">

    <andreasagap.loadingbutton.ButtonLoading
        android:id="@+id/loadingbutton"
        android:layout_width="match_parent"
        android:layout_height="48dp"
        app:BL_backgroundColor="#9c9b9999"
        app:BL_circleColor="#00AFEF"
        app:BL_circleColorSecond="#8000AFEF"
        app:BL_enable="true"
        app:BL_stateShow="normal"
        app:BL_text="Login"
        app:BL_textColor="#ffffff"
        app:BL_textSize="16sp"/>

</android.support.constraint.ConstraintLayout>
```

**In activity or fragment**

```java
ConstraintLayout root=findViewById(R.id.root);
ButtonLoading buttonLoading=findViewById(R.id.loadingbutton);
buttonLoading.setRoot(buttonLoading,this,root);
buttonLoading.setOnButtonLoadingListener(new ButtonLoading.OnButtonLoadingListener() {
    @Override
    public void onClick() {
                //...
    }
    @Override
    public void onStart() {

                //...
    }
    @Override
    public void onFinish() {
                //...

    }
});
```
## End Progress
Just call ```buttonLoading.cancel();``` and the button moves to its original position.
</br>
:exclamation: Without cancel(), the function onFinish() doesn't start. 

## Configure XML
* BL_backgroundColor
* BL_circleColor color
* BL_circleColorSecond
* BL_stateShow: normal,animationStart,progress,animationFinish | default value is normal
* BL_text: text button
* BL_textColor
* BL_textSize
* BL_font: address font in assets. example: file in assetst > fonts > arial.ttf ==> fonts/arial.ttf 

## Credits
This library was based on this repo: https://github.com/rasoulmiri/ButtonLoading :clap:

