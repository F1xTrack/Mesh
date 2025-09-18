package org.wonday.orientation;

import android.view.OrientationEventListener;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import p000.AbstractC3929dS;

/* renamed from: org.wonday.orientation.a */
/* loaded from: classes2.dex */
public final class C6579a extends OrientationEventListener {

    /* renamed from: a */
    public final /* synthetic */ OrientationModule f39311a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6579a(OrientationModule orientationModule, ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext, 2);
        this.f39311a = orientationModule;
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i) {
        AbstractC3929dS.m17669b("ReactNative");
        OrientationModule orientationModule = this.f39311a;
        String str = orientationModule.lastDeviceOrientationValue;
        if (i == -1) {
            str = GrsBaseInfo.CountryCodeSource.UNKNOWN;
        } else if (i > 355 || i < 5) {
            str = "PORTRAIT";
        } else if (i > 85 && i < 95) {
            str = "LANDSCAPE-RIGHT";
        } else if (i > 175 && i < 185) {
            str = "PORTRAIT-UPSIDEDOWN";
        } else if (i > 265 && i < 275) {
            str = "LANDSCAPE-LEFT";
        }
        if (!orientationModule.lastDeviceOrientationValue.equals(str)) {
            orientationModule.lastDeviceOrientationValue = str;
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putString("deviceOrientation", str);
            if (orientationModule.ctx.hasActiveCatalystInstance()) {
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) orientationModule.ctx.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("deviceOrientationDidChange", writableMapCreateMap);
            }
        }
        String currentOrientation = orientationModule.getCurrentOrientation();
        if (orientationModule.lastOrientationValue.equals(currentOrientation)) {
            return;
        }
        orientationModule.lastOrientationValue = currentOrientation;
        AbstractC3929dS.m17669b("ReactNative");
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.putString("orientation", currentOrientation);
        if (orientationModule.ctx.hasActiveCatalystInstance()) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) orientationModule.ctx.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("orientationDidChange", writableMapCreateMap2);
        }
    }
}
