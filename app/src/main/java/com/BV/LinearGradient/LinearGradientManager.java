package com.BV.LinearGradient;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.SimpleViewManager;
import defpackage.C1604Ui0;
import defpackage.InterfaceC5297jM0;
import defpackage.S91;

/* loaded from: classes.dex */
public class LinearGradientManager extends SimpleViewManager<C1604Ui0> {
    public static final String PROP_ANGLE = "angle";
    public static final String PROP_ANGLE_CENTER = "angleCenter";
    public static final String PROP_BORDER_RADII = "borderRadii";
    public static final String PROP_COLORS = "colors";
    public static final String PROP_END_POINT = "endPoint";
    public static final String PROP_LOCATIONS = "locations";
    public static final String PROP_START_POINT = "startPoint";
    public static final String PROP_USE_ANGLE = "useAngle";
    public static final String REACT_CLASS = "BVLinearGradient";

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @InterfaceC5297jM0(defaultFloat = 45.0f, name = PROP_ANGLE)
    public void setAngle(C1604Ui0 c1604Ui0, float f) {
        c1604Ui0.setAngle(f);
    }

    @InterfaceC5297jM0(name = PROP_ANGLE_CENTER)
    public void setAngleCenter(C1604Ui0 c1604Ui0, ReadableArray readableArray) {
        c1604Ui0.setAngleCenter(readableArray);
    }

    @InterfaceC5297jM0(name = PROP_BORDER_RADII)
    public void setBorderRadii(C1604Ui0 c1604Ui0, ReadableArray readableArray) {
        c1604Ui0.setBorderRadii(readableArray);
    }

    @InterfaceC5297jM0(name = PROP_COLORS)
    public void setColors(C1604Ui0 c1604Ui0, ReadableArray readableArray) {
        c1604Ui0.setColors(readableArray);
    }

    @InterfaceC5297jM0(name = PROP_END_POINT)
    public void setEndPoint(C1604Ui0 c1604Ui0, ReadableArray readableArray) {
        c1604Ui0.setEndPoint(readableArray);
    }

    @InterfaceC5297jM0(name = PROP_LOCATIONS)
    public void setLocations(C1604Ui0 c1604Ui0, ReadableArray readableArray) {
        if (readableArray != null) {
            c1604Ui0.setLocations(readableArray);
        }
    }

    @InterfaceC5297jM0(name = PROP_START_POINT)
    public void setStartPoint(C1604Ui0 c1604Ui0, ReadableArray readableArray) {
        c1604Ui0.setStartPoint(readableArray);
    }

    @InterfaceC5297jM0(defaultBoolean = false, name = PROP_USE_ANGLE)
    public void setUseAngle(C1604Ui0 c1604Ui0, boolean z) {
        c1604Ui0.setUseAngle(z);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public C1604Ui0 createViewInstance(S91 s91) {
        return new C1604Ui0(s91);
    }
}
