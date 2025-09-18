package com.p003BV.LinearGradient;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.SimpleViewManager;
import p000.C8370Ui0;
import p000.InterfaceC9871jM0;
import p000.S91;

/* loaded from: classes.dex */
public class LinearGradientManager extends SimpleViewManager<C8370Ui0> {
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

    @InterfaceC9871jM0(defaultFloat = 45.0f, name = PROP_ANGLE)
    public void setAngle(C8370Ui0 c8370Ui0, float f) {
        c8370Ui0.setAngle(f);
    }

    @InterfaceC9871jM0(name = PROP_ANGLE_CENTER)
    public void setAngleCenter(C8370Ui0 c8370Ui0, ReadableArray readableArray) {
        c8370Ui0.setAngleCenter(readableArray);
    }

    @InterfaceC9871jM0(name = PROP_BORDER_RADII)
    public void setBorderRadii(C8370Ui0 c8370Ui0, ReadableArray readableArray) {
        c8370Ui0.setBorderRadii(readableArray);
    }

    @InterfaceC9871jM0(name = PROP_COLORS)
    public void setColors(C8370Ui0 c8370Ui0, ReadableArray readableArray) {
        c8370Ui0.setColors(readableArray);
    }

    @InterfaceC9871jM0(name = PROP_END_POINT)
    public void setEndPoint(C8370Ui0 c8370Ui0, ReadableArray readableArray) {
        c8370Ui0.setEndPoint(readableArray);
    }

    @InterfaceC9871jM0(name = PROP_LOCATIONS)
    public void setLocations(C8370Ui0 c8370Ui0, ReadableArray readableArray) {
        if (readableArray != null) {
            c8370Ui0.setLocations(readableArray);
        }
    }

    @InterfaceC9871jM0(name = PROP_START_POINT)
    public void setStartPoint(C8370Ui0 c8370Ui0, ReadableArray readableArray) {
        c8370Ui0.setStartPoint(readableArray);
    }

    @InterfaceC9871jM0(defaultBoolean = false, name = PROP_USE_ANGLE)
    public void setUseAngle(C8370Ui0 c8370Ui0, boolean z) {
        c8370Ui0.setUseAngle(z);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public C8370Ui0 createViewInstance(S91 s91) {
        return new C8370Ui0(s91);
    }
}
