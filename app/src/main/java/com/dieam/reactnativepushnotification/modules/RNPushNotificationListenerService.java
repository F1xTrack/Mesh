package com.dieam.reactnativepushnotification.modules;

import android.os.Handler;
import android.os.Looper;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.google.firebase.messaging.FirebaseMessagingService;
import p000.G10;
import p000.RunnableC1192Sx;

/* loaded from: classes.dex */
public class RNPushNotificationListenerService extends FirebaseMessagingService {

    /* renamed from: h */
    public final G10 f17792h;

    public RNPushNotificationListenerService() {
        G10 g10 = new G10(25, false);
        g10.f3531b = this;
        this.f17792h = g10;
    }

    /* renamed from: h */
    public static void m10895h(RNPushNotificationListenerService rNPushNotificationListenerService, ReactApplicationContext reactApplicationContext, String str) {
        rNPushNotificationListenerService.getClass();
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("deviceToken", str);
        if (reactApplicationContext.hasActiveCatalystInstance()) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactApplicationContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("remoteNotificationsRegistered", writableMapCreateMap);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0101  */
    @Override // com.google.firebase.messaging.FirebaseMessagingService
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo10896d(p000.OQ0 r9) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dieam.reactnativepushnotification.modules.RNPushNotificationListenerService.mo10896d(OQ0):void");
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    /* renamed from: f */
    public final void mo10897f(String str) {
        new Handler(Looper.getMainLooper()).post(new RunnableC1192Sx(this, this, str, 7, false));
    }
}
