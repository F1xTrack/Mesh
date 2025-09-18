package com.dieam.reactnativepushnotification.modules;

import android.app.Activity;
import android.app.Application;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.firebase.messaging.FirebaseMessaging;
import com.huawei.hms.p015rn.push.constants.Core;
import com.huawei.hms.p015rn.push.constants.NotificationConstants;
import io.appmetrica.analytics.impl.C5094ea;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executors;
import org.json.JSONException;
import org.json.JSONObject;
import p000.AbstractC11615x01;
import p000.AbstractC1374Vq;
import p000.AbstractC3929dS;
import p000.AbstractC7222ym;
import p000.AbstractC8962cI0;
import p000.AbstractC9376fU1;
import p000.C11479vw0;
import p000.C11488w01;
import p000.C1339VH;
import p000.C1668aV;
import p000.C8834bI0;
import p000.C9095dI0;
import p000.C9223eI0;
import p000.C9432fw1;
import p000.RunnableC1789bV;
import p000.S81;

/* loaded from: classes.dex */
public class RNPushNotification extends ReactContextBaseJavaModule implements ActivityEventListener {
    public static ArrayList<Object> IntentHandlers = new ArrayList<>();
    public static final String KEY_TEXT_REPLY = "key_text_reply";
    public static final String LOG_TAG = "RNPushNotification";
    private C9223eI0 mJsDelivery;
    private C9095dI0 mRNPushNotificationHelper;
    private final SecureRandom mRandomNumberGenerator;

    public RNPushNotification(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mRandomNumberGenerator = new SecureRandom();
        reactApplicationContext.addActivityEventListener(this);
        this.mRNPushNotificationHelper = new C9095dI0((Application) reactApplicationContext.getApplicationContext());
        this.mJsDelivery = new C9223eI0(reactApplicationContext);
    }

    private Bundle getBundleFromIntent(Intent intent) {
        Bundle bundleExtra;
        if (intent.hasExtra("notification")) {
            bundleExtra = intent.getBundleExtra("notification");
        } else if (intent.hasExtra("google.message_id")) {
            Bundle bundle = new Bundle();
            bundle.putBundle("data", intent.getExtras());
            bundleExtra = bundle;
        } else {
            bundleExtra = null;
        }
        if (bundleExtra == null) {
            Iterator<Object> it = IntentHandlers.iterator();
            if (it.hasNext()) {
                AbstractC1374Vq.m8597p(it.next());
                throw null;
            }
        }
        if (bundleExtra != null && !bundleExtra.getBoolean(C5094ea.f31575g, false) && !bundleExtra.containsKey("userInteraction")) {
            bundleExtra.putBoolean("userInteraction", true);
        }
        return bundleExtra;
    }

    @ReactMethod
    public void abandonPermissions() {
        FirebaseMessaging firebaseMessagingM11307c = FirebaseMessaging.m11307c();
        if (firebaseMessagingM11307c.m11311f() == null) {
            AbstractC9376fU1.m18244e(null);
        } else {
            Executors.newSingleThreadExecutor(new NamedThreadFactory("Firebase-Messaging-Network-Io")).execute(new RunnableC1789bV(firebaseMessagingM11307c, new S81(), 1));
        }
    }

    @ReactMethod
    public void cancelAllLocalNotifications() throws NumberFormatException {
        C9095dI0 c9095dI0 = this.mRNPushNotificationHelper;
        Iterator<String> it = c9095dI0.f25934c.getAll().keySet().iterator();
        while (it.hasNext()) {
            c9095dI0.m17520a(it.next());
        }
        this.mRNPushNotificationHelper.m17523d().cancelAll();
    }

    @ReactMethod
    public void cancelLocalNotification(String str) throws NumberFormatException {
        this.mRNPushNotificationHelper.m17520a(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    @com.facebook.react.bridge.ReactMethod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void channelBlocked(java.lang.String r6, com.facebook.react.bridge.Callback r7) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            dI0 r2 = r5.mRNPushNotificationHelper
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 26
            if (r3 >= r4) goto Lf
            r2.getClass()
        Ld:
            r6 = r1
            goto L24
        Lf:
            android.app.NotificationManager r2 = r2.m17523d()
            if (r2 != 0) goto L16
            goto Ld
        L16:
            android.app.NotificationChannel r6 = p000.M10.m5187b(r2, r6)
            if (r6 != 0) goto L1d
            goto Ld
        L1d:
            int r6 = p000.AbstractC8962cI0.m10643c(r6)
            if (r6 != 0) goto Ld
            r6 = r0
        L24:
            if (r7 == 0) goto L31
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r1] = r6
            r7.invoke(r0)
        L31:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dieam.reactnativepushnotification.modules.RNPushNotification.channelBlocked(java.lang.String, com.facebook.react.bridge.Callback):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    @com.facebook.react.bridge.ReactMethod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void channelExists(java.lang.String r6, com.facebook.react.bridge.Callback r7) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            dI0 r2 = r5.mRNPushNotificationHelper
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 26
            if (r3 >= r4) goto Lf
            r2.getClass()
        Ld:
            r6 = r1
            goto L1d
        Lf:
            android.app.NotificationManager r2 = r2.m17523d()
            if (r2 != 0) goto L16
            goto Ld
        L16:
            android.app.NotificationChannel r6 = p000.M10.m5187b(r2, r6)
            if (r6 == 0) goto Ld
            r6 = r0
        L1d:
            if (r7 == 0) goto L2a
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r1] = r6
            r7.invoke(r0)
        L2a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dieam.reactnativepushnotification.modules.RNPushNotification.channelExists(java.lang.String, com.facebook.react.bridge.Callback):void");
    }

    @ReactMethod
    public void checkPermissions(Promise promise) {
        promise.resolve(Boolean.valueOf(new C11479vw0(getReactApplicationContext()).m25529a()));
    }

    @ReactMethod
    public void clearLocalNotification(String str, int i) {
        NotificationManager notificationManagerM17523d = this.mRNPushNotificationHelper.m17523d();
        if (str != null) {
            notificationManagerM17523d.cancel(str, i);
        } else {
            notificationManagerM17523d.cancel(i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0013  */
    @com.facebook.react.bridge.ReactMethod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void createChannel(com.facebook.react.bridge.ReadableMap r21, com.facebook.react.bridge.Callback r22) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dieam.reactnativepushnotification.modules.RNPushNotification.createChannel(com.facebook.react.bridge.ReadableMap, com.facebook.react.bridge.Callback):void");
    }

    @ReactMethod
    public void deleteChannel(String str) {
        C9095dI0 c9095dI0 = this.mRNPushNotificationHelper;
        if (Build.VERSION.SDK_INT < 26) {
            c9095dI0.getClass();
            return;
        }
        NotificationManager notificationManagerM17523d = c9095dI0.m17523d();
        if (notificationManagerM17523d == null) {
            return;
        }
        notificationManagerM17523d.deleteNotificationChannel(str);
    }

    @ReactMethod
    public void getChannels(Callback callback) {
        NotificationManager notificationManagerM17523d;
        C9095dI0 c9095dI0 = this.mRNPushNotificationHelper;
        c9095dI0.getClass();
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 26 && (notificationManagerM17523d = c9095dI0.m17523d()) != null) {
            Iterator it = notificationManagerM17523d.getNotificationChannels().iterator();
            while (it.hasNext()) {
                arrayList.add(AbstractC8962cI0.m10645e(it.next()).getId());
            }
        }
        WritableArray writableArrayFromList = Arguments.fromList(arrayList);
        if (callback != null) {
            callback.invoke(writableArrayFromList);
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        return new HashMap();
    }

    @ReactMethod
    public void getDeliveredNotifications(Callback callback) {
        C9095dI0 c9095dI0 = this.mRNPushNotificationHelper;
        c9095dI0.getClass();
        WritableArray writableArrayCreateArray = Arguments.createArray();
        StatusBarNotification[] activeNotifications = c9095dI0.m17523d().getActiveNotifications();
        int length = activeNotifications.length;
        for (StatusBarNotification statusBarNotification : activeNotifications) {
            Notification notification = statusBarNotification.getNotification();
            Bundle bundle = notification.extras;
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putString("identifier", "" + statusBarNotification.getId());
            writableMapCreateMap.putString("title", bundle.getString("android.title"));
            writableMapCreateMap.putString("body", bundle.getString("android.text"));
            writableMapCreateMap.putString("tag", statusBarNotification.getTag());
            writableMapCreateMap.putString(NotificationConstants.GROUP, notification.getGroup());
            writableArrayCreateArray.pushMap(writableMapCreateMap);
        }
        callback.invoke(writableArrayCreateArray);
    }

    @ReactMethod
    public void getInitialNotification(Promise promise) {
        Bundle bundleFromIntent;
        String string;
        WritableMap writableMapCreateMap = Arguments.createMap();
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null && (bundleFromIntent = getBundleFromIntent(currentActivity.getIntent())) != null) {
            bundleFromIntent.putBoolean(C5094ea.f31575g, false);
            this.mJsDelivery.getClass();
            try {
                string = C9223eI0.m17897a(bundleFromIntent).toString();
            } catch (JSONException unused) {
                string = null;
            }
            writableMapCreateMap.putString(Core.Event.Result.DATA_JSON, string);
        }
        promise.resolve(writableMapCreateMap);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "ReactNativePushNotification";
    }

    @ReactMethod
    public void getScheduledLocalNotifications(Callback callback) {
        C9095dI0 c9095dI0 = this.mRNPushNotificationHelper;
        c9095dI0.getClass();
        WritableArray writableArrayCreateArray = Arguments.createArray();
        Iterator<Map.Entry<String, ?>> it = c9095dI0.f25934c.getAll().entrySet().iterator();
        while (it.hasNext()) {
            try {
                C8834bI0 c8834bI0 = new C8834bI0(new JSONObject(it.next().getValue().toString()));
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putString("title", c8834bI0.f16948d);
                writableMapCreateMap.putString("message", c8834bI0.f16946b);
                writableMapCreateMap.putString(NotificationConstants.NUMBER, c8834bI0.f16959o);
                writableMapCreateMap.putDouble(NotificationConstants.DATE, c8834bI0.f16947c);
                writableMapCreateMap.putString(NotificationConstants.f19487ID, c8834bI0.f16945a);
                writableMapCreateMap.putString(NotificationConstants.REPEAT_INTERVAL, c8834bI0.f16933B);
                writableMapCreateMap.putString(NotificationConstants.SOUND_NAME, c8834bI0.f16961q);
                writableMapCreateMap.putString("data", c8834bI0.f16944M);
                writableArrayCreateArray.pushMap(writableMapCreateMap);
            } catch (JSONException e) {
                e.getMessage();
            }
        }
        callback.invoke(writableArrayCreateArray);
    }

    @ReactMethod
    public void invokeApp(ReadableMap readableMap) {
        Bundle bundle = readableMap != null ? Arguments.toBundle(readableMap) : null;
        Application application = this.mRNPushNotificationHelper.f25932a;
        try {
            Intent intent = new Intent(application, Class.forName(application.getPackageManager().getLaunchIntentForPackage(application.getPackageName()).getComponent().getClassName()));
            if (bundle != null) {
                intent.putExtra("notification", bundle);
            }
            intent.addFlags(268435456);
            application.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onNewIntent(Intent intent) {
        String string;
        Iterator<Object> it = IntentHandlers.iterator();
        if (it.hasNext()) {
            throw AbstractC7222ym.m26227d(it);
        }
        Bundle bundleFromIntent = getBundleFromIntent(intent);
        if (bundleFromIntent != null) {
            C9223eI0 c9223eI0 = this.mJsDelivery;
            c9223eI0.getClass();
            try {
                string = C9223eI0.m17897a(bundleFromIntent).toString();
            } catch (JSONException unused) {
                string = null;
            }
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putString(Core.Event.Result.DATA_JSON, string);
            c9223eI0.m17898b("remoteNotificationReceived", writableMapCreateMap);
        }
    }

    @ReactMethod
    public void presentLocalNotification(ReadableMap readableMap) {
        Bundle bundle = Arguments.toBundle(readableMap);
        if (bundle.getString(NotificationConstants.f19487ID) == null) {
            bundle.putString(NotificationConstants.f19487ID, String.valueOf(this.mRandomNumberGenerator.nextInt()));
        }
        this.mRNPushNotificationHelper.m17527h(bundle);
    }

    @ReactMethod
    public void removeAllDeliveredNotifications() {
        this.mRNPushNotificationHelper.m17523d().cancelAll();
    }

    @ReactMethod
    public void removeDeliveredNotifications(ReadableArray readableArray) {
        NotificationManager notificationManagerM17523d = this.mRNPushNotificationHelper.m17523d();
        for (int i = 0; i < readableArray.size(); i++) {
            notificationManagerM17523d.cancel(Integer.parseInt(readableArray.getString(i)));
        }
    }

    @ReactMethod
    public void requestPermissions() {
        C9223eI0 c9223eI0 = this.mJsDelivery;
        FirebaseMessaging firebaseMessagingM11307c = FirebaseMessaging.m11307c();
        firebaseMessagingM11307c.getClass();
        S81 s81 = new S81();
        firebaseMessagingM11307c.f18473f.execute(new RunnableC1789bV(firebaseMessagingM11307c, s81, 0));
        s81.f10598a.mo11135b(new C9432fw1(25, c9223eI0));
    }

    @ReactMethod
    public void scheduleLocalNotification(ReadableMap readableMap) throws JSONException, ClassNotFoundException, NumberFormatException {
        Bundle bundle = Arguments.toBundle(readableMap);
        if (bundle.getString(NotificationConstants.f19487ID) == null) {
            bundle.putString(NotificationConstants.f19487ID, String.valueOf(this.mRandomNumberGenerator.nextInt()));
        }
        this.mRNPushNotificationHelper.m17525f(bundle);
    }

    @ReactMethod
    public void setApplicationIconBadgeNumber(int i) {
        boolean z;
        C1339VH c1339vh = C1339VH.f12484d;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        if (((ComponentName) c1339vh.f12487c) == null) {
            c1339vh.f12487c = reactApplicationContext.getPackageManager().getLaunchIntentForPackage(reactApplicationContext.getPackageName()).getComponent();
        }
        Boolean bool = (Boolean) c1339vh.f12486b;
        if (bool != null) {
            if (bool.booleanValue()) {
                try {
                    AbstractC11615x01.m25732a(reactApplicationContext, i);
                    return;
                } catch (C11488w01 unused) {
                    return;
                }
            }
            return;
        }
        try {
            AbstractC11615x01.m25732a(reactApplicationContext, i);
            z = true;
        } catch (C11488w01 unused2) {
            z = false;
        }
        c1339vh.f12486b = Boolean.valueOf(z);
        if (z) {
            AbstractC3929dS.m17677j("ApplicationBadgeHelper");
        } else {
            AbstractC3929dS.m17677j("ApplicationBadgeHelper");
        }
    }

    @ReactMethod
    public void subscribeToTopic(String str) {
        FirebaseMessaging firebaseMessagingM11307c = FirebaseMessaging.m11307c();
        firebaseMessagingM11307c.getClass();
        firebaseMessagingM11307c.f18475h.mo11145l(new C1668aV(str, 0));
    }

    @ReactMethod
    public void unsubscribeFromTopic(String str) {
        FirebaseMessaging firebaseMessagingM11307c = FirebaseMessaging.m11307c();
        firebaseMessagingM11307c.getClass();
        firebaseMessagingM11307c.f18475h.mo11145l(new C1668aV(str, 1));
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onActivityResult(Activity activity, int i, int i2, Intent intent) {
        onActivityResult(i, i2, intent);
    }
}
