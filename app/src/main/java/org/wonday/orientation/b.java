package org.wonday.orientation;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import defpackage.AbstractC3393dS;

/* loaded from: classes2.dex */
public final class b extends BroadcastReceiver {
    public final /* synthetic */ OrientationModule a;

    public b(OrientationModule orientationModule) {
        this.a = orientationModule;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        OrientationModule orientationModule = this.a;
        String currentOrientation = orientationModule.getCurrentOrientation();
        orientationModule.lastOrientationValue = currentOrientation;
        AbstractC3393dS.b("ReactNative");
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("orientation", currentOrientation);
        if (orientationModule.ctx.hasActiveCatalystInstance()) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) orientationModule.ctx.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("orientationDidChange", writableMapCreateMap);
        }
    }
}
