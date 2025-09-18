package org.wonday.orientation;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import p000.AbstractC3929dS;

/* renamed from: org.wonday.orientation.b */
/* loaded from: classes2.dex */
public final class C6580b extends BroadcastReceiver {

    /* renamed from: a */
    public final /* synthetic */ OrientationModule f39312a;

    public C6580b(OrientationModule orientationModule) {
        this.f39312a = orientationModule;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        OrientationModule orientationModule = this.f39312a;
        String currentOrientation = orientationModule.getCurrentOrientation();
        orientationModule.lastOrientationValue = currentOrientation;
        AbstractC3929dS.m17669b("ReactNative");
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("orientation", currentOrientation);
        if (orientationModule.ctx.hasActiveCatalystInstance()) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) orientationModule.ctx.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("orientationDidChange", writableMapCreateMap);
        }
    }
}
