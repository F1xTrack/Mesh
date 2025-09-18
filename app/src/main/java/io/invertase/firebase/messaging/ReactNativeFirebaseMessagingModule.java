package io.invertase.firebase.messaging;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.invertase.firebase.common.ReactNativeFirebaseModule;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executors;
import org.json.JSONException;
import org.json.JSONObject;
import p000.AbstractC10642pN1;
import p000.AbstractC7222ym;
import p000.AbstractC9376fU1;
import p000.C0786MU;
import p000.C10212m12;
import p000.C11479vw0;
import p000.C1668aV;
import p000.C3994eV;
import p000.C4198hk;
import p000.C6724r8;
import p000.C6821sP;
import p000.C6930u8;
import p000.C7119x8;
import p000.C7621Fx1;
import p000.C9450g32;
import p000.CallableC0361Fj;
import p000.EL0;
import p000.EO1;
import p000.FL0;
import p000.I30;
import p000.IL0;
import p000.JL0;
import p000.M51;
import p000.O22;
import p000.OQ0;
import p000.QQ0;
import p000.RunnableC1789bV;
import p000.S81;
import p000.TA1;

/* loaded from: classes2.dex */
public class ReactNativeFirebaseMessagingModule extends ReactNativeFirebaseModule implements ActivityEventListener {
    private static final String TAG = "Messaging";
    ReadableMap initialNotification;
    private HashMap<String, Boolean> initialNotificationMap;

    public ReactNativeFirebaseMessagingModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext, TAG);
        this.initialNotification = null;
        this.initialNotificationMap = new HashMap<>();
        reactApplicationContext.addActivityEventListener(this);
    }

    public static Object lambda$deleteToken$4(FirebaseMessaging firebaseMessaging) throws Exception {
        C9450g32 c9450g32M18244e;
        if (firebaseMessaging.m11311f() == null) {
            c9450g32M18244e = AbstractC9376fU1.m18244e(null);
        } else {
            S81 s81 = new S81();
            Executors.newSingleThreadExecutor(new NamedThreadFactory("Firebase-Messaging-Network-Io")).execute(new RunnableC1789bV(firebaseMessaging, s81, 1));
            c9450g32M18244e = s81.f10598a;
        }
        AbstractC9376fU1.m18240a(c9450g32M18244e);
        return null;
    }

    public static /* synthetic */ void lambda$deleteToken$5(Promise promise, Task task) {
        if (task.mo11144k()) {
            promise.resolve(task.mo11142i());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.mo11141h());
        }
    }

    public static String lambda$getToken$2(FirebaseMessaging firebaseMessaging) throws Exception {
        firebaseMessaging.getClass();
        S81 s81 = new S81();
        firebaseMessaging.f18473f.execute(new RunnableC1789bV(firebaseMessaging, s81, 0));
        return (String) AbstractC9376fU1.m18240a(s81.f10598a);
    }

    public static /* synthetic */ void lambda$getToken$3(Promise promise, Task task) {
        if (task.mo11144k()) {
            promise.resolve(task.mo11142i());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.mo11141h());
        }
    }

    public Boolean lambda$hasPermission$6() throws Exception {
        return Boolean.valueOf(new C11479vw0(getReactApplicationContext()).m25529a());
    }

    public static /* synthetic */ void lambda$hasPermission$7(Promise promise, Task task) {
        if (task.mo11144k()) {
            promise.resolve(Integer.valueOf(((Boolean) task.mo11142i()).booleanValue() ? 1 : 0));
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.mo11141h());
        }
    }

    public static Object lambda$sendMessage$8(ReadableMap readableMap) throws Exception {
        FirebaseMessaging firebaseMessagingM11307c = FirebaseMessaging.m11307c();
        String string = readableMap.getString("to");
        Bundle bundle = new Bundle();
        C7119x8 c7119x8 = new C7119x8();
        if (TextUtils.isEmpty(string)) {
            throw new IllegalArgumentException(AbstractC7222ym.m26245v("Invalid to: ", string));
        }
        bundle.putString("google.to", string);
        if (readableMap.hasKey("ttl")) {
            bundle.putString("google.ttl", String.valueOf(readableMap.getInt("ttl")));
        }
        if (readableMap.hasKey(RemoteMessageAttributes.MESSAGE_ID)) {
            bundle.putString("google.message_id", readableMap.getString(RemoteMessageAttributes.MESSAGE_ID));
        }
        if (readableMap.hasKey(RemoteMessageAttributes.MESSAGE_TYPE)) {
            bundle.putString(RemoteMessageConst.MSGTYPE, readableMap.getString(RemoteMessageAttributes.MESSAGE_TYPE));
        }
        if (readableMap.hasKey("collapseKey")) {
            bundle.putString("collapse_key", readableMap.getString("collapseKey"));
        }
        if (readableMap.hasKey("data")) {
            ReadableMap map = readableMap.getMap("data");
            ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = map.keySetIterator();
            while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
                String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
                c7119x8.put(strNextKey, map.getString(strNextKey));
            }
        }
        Bundle bundle2 = new Bundle();
        Iterator it = ((C6724r8) c7119x8.entrySet()).iterator();
        while (true) {
            C6930u8 c6930u8 = (C6930u8) it;
            if (!c6930u8.hasNext()) {
                break;
            }
            c6930u8.next();
            bundle2.putString((String) c6930u8.getKey(), (String) c6930u8.getValue());
        }
        bundle2.putAll(bundle);
        bundle.remove("from");
        OQ0 oq0 = new OQ0(bundle2);
        firebaseMessagingM11307c.getClass();
        if (TextUtils.isEmpty(oq0.f8440a.getString("google.to"))) {
            throw new IllegalArgumentException("Missing 'to'");
        }
        Intent intent = new Intent("com.google.android.gcm.intent.SEND");
        Intent intent2 = new Intent();
        intent2.setPackage("com.google.example.invalidpackage");
        Context context = firebaseMessagingM11307c.f18469b;
        intent.putExtra("app", PendingIntent.getBroadcast(context, 0, intent2, 67108864));
        intent.setPackage("com.google.android.gms");
        intent.putExtras(oq0.f8440a);
        context.sendOrderedBroadcast(intent, "com.google.android.gtalkservice.permission.GTALK_SERVICE");
        return null;
    }

    public static /* synthetic */ void lambda$sendMessage$9(Promise promise, Task task) {
        if (task.mo11144k()) {
            promise.resolve(task.mo11142i());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.mo11141h());
        }
    }

    public static Object lambda$setAutoInitEnabled$0(Boolean bool) throws Exception {
        FirebaseMessaging firebaseMessagingM11307c = FirebaseMessaging.m11307c();
        boolean zBooleanValue = bool.booleanValue();
        C4198hk c4198hk = firebaseMessagingM11307c.f18472e;
        synchronized (c4198hk) {
            c4198hk.m18863l();
            C3994eV c3994eV = (C3994eV) c4198hk.f28555c;
            if (c3994eV != null) {
                ((C6821sP) ((M51) c4198hk.f28554b)).m24736d(c3994eV);
                c4198hk.f28555c = null;
            }
            C0786MU c0786mu = ((FirebaseMessaging) c4198hk.f28557e).f18468a;
            c0786mu.m5379a();
            SharedPreferences.Editor editorEdit = c0786mu.f7174a.getSharedPreferences("com.google.firebase.messaging", 0).edit();
            editorEdit.putBoolean("auto_init", zBooleanValue);
            editorEdit.apply();
            if (zBooleanValue) {
                ((FirebaseMessaging) c4198hk.f28557e).m11315j();
            }
            c4198hk.f28556d = bool;
        }
        return null;
    }

    public static void lambda$setAutoInitEnabled$1(Promise promise, Task task) {
        if (task.mo11144k()) {
            promise.resolve(Boolean.valueOf(FirebaseMessaging.m11307c().f18472e.m18864m()));
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.mo11141h());
        }
    }

    public static Object lambda$setDeliveryMetricsExportToBigQuery$12(Boolean bool) throws Exception {
        FirebaseMessaging firebaseMessagingM11307c = FirebaseMessaging.m11307c();
        boolean zBooleanValue = bool.booleanValue();
        firebaseMessagingM11307c.getClass();
        C0786MU c0786muM5375d = C0786MU.m5375d();
        c0786muM5375d.m5379a();
        c0786muM5375d.f7174a.getSharedPreferences("com.google.firebase.messaging", 0).edit().putBoolean("export_to_big_query", zBooleanValue).apply();
        AbstractC10642pN1.m23771d(firebaseMessagingM11307c.f18469b, firebaseMessagingM11307c.f18470c, firebaseMessagingM11307c.m11314i());
        return null;
    }

    public static void lambda$setDeliveryMetricsExportToBigQuery$13(Promise promise, Task task) {
        if (!task.mo11144k()) {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.mo11141h());
        } else {
            FirebaseMessaging.m11307c().getClass();
            promise.resolve(Boolean.valueOf(TA1.m7612b()));
        }
    }

    public static /* synthetic */ void lambda$subscribeToTopic$10(Promise promise, Task task) {
        if (task.mo11144k()) {
            promise.resolve(task.mo11142i());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.mo11141h());
        }
    }

    public static /* synthetic */ void lambda$unsubscribeFromTopic$11(Promise promise, Task task) {
        if (task.mo11144k()) {
            promise.resolve(task.mo11142i());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.mo11141h());
        }
    }

    private WritableMap popRemoteMessageMapFromMessagingStore(String str) {
        if (QQ0.f9618b == null) {
            QQ0 qq0 = new QQ0();
            qq0.f9619a = new C10212m12(19);
            QQ0.f9618b = qq0;
        }
        ((C10212m12) QQ0.f9618b.f9619a).getClass();
        C7621Fx1 c7621Fx1 = C7621Fx1.f3492c;
        WritableMap writableMap = null;
        String string = c7621Fx1.m2849l().getString(str, null);
        if (string != null) {
            try {
                WritableMap writableMapM5943b = O22.m5943b(new JSONObject(string));
                writableMapM5943b.putString("to", str);
                writableMap = writableMapM5943b;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        c7621Fx1.m2849l().edit().remove(str);
        String string2 = c7621Fx1.m2849l().getString("all_notification_ids", "");
        if (!string2.isEmpty()) {
            c7621Fx1.m2849l().edit().putString("all_notification_ids", string2.replace(str + StringUtils.COMMA, "")).apply();
        }
        return writableMap;
    }

    @ReactMethod
    public void deleteToken(String str, String str2, Promise promise) {
        AbstractC9376fU1.m18242c(getExecutor(), new IL0((FirebaseMessaging) C0786MU.m5376e(str).m5380b(FirebaseMessaging.class), 0)).mo11135b(new I30(20, promise));
    }

    @Override // io.invertase.firebase.common.ReactNativeFirebaseModule, com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        HashMap map = new HashMap();
        map.put("isAutoInitEnabled", Boolean.valueOf(FirebaseMessaging.m11307c().f18472e.m18864m()));
        FirebaseMessaging.m11307c().getClass();
        map.put("isDeliveryMetricsExportToBigQueryEnabled", Boolean.valueOf(TA1.m7612b()));
        return map;
    }

    @ReactMethod
    public void getInitialNotification(Promise promise) {
        Intent intent;
        ReadableMap readableMap = this.initialNotification;
        if (readableMap != null) {
            promise.resolve(readableMap);
            this.initialNotification = null;
            return;
        }
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null && (intent = currentActivity.getIntent()) != null && intent.getExtras() != null) {
            String string = intent.getExtras().getString("google.message_id");
            if (string == null) {
                string = intent.getExtras().getString("message_id");
            }
            if (string != null && this.initialNotificationMap.get(string) == null) {
                OQ0 oq0 = (OQ0) ReactNativeFirebaseMessagingReceiver.f33200a.get(string);
                WritableMap writableMapPopRemoteMessageMapFromMessagingStore = oq0 == null ? popRemoteMessageMapFromMessagingStore(string) : EO1.m2210f(oq0);
                if (writableMapPopRemoteMessageMapFromMessagingStore != null) {
                    promise.resolve(writableMapPopRemoteMessageMapFromMessagingStore);
                    this.initialNotificationMap.put(string, Boolean.TRUE);
                    return;
                }
            }
        }
        promise.resolve(null);
    }

    @ReactMethod
    public void getToken(String str, String str2, Promise promise) {
        AbstractC9376fU1.m18242c(getExecutor(), new IL0((FirebaseMessaging) C0786MU.m5376e(str).m5380b(FirebaseMessaging.class), 1)).mo11135b(new I30(23, promise));
    }

    @ReactMethod
    public void hasPermission(Promise promise) {
        AbstractC9376fU1.m18242c(getExecutor(), new CallableC0361Fj(5, this)).mo11135b(new I30(22, promise));
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onActivityResult(Activity activity, int i, int i2, Intent intent) {
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onNewIntent(Intent intent) {
        if (intent == null || intent.getExtras() == null) {
            return;
        }
        String string = intent.getExtras().getString("google.message_id");
        if (string == null) {
            string = intent.getExtras().getString("message_id");
        }
        if (string != null) {
            HashMap map = ReactNativeFirebaseMessagingReceiver.f33200a;
            OQ0 oq0 = (OQ0) map.get(string);
            WritableMap writableMapPopRemoteMessageMapFromMessagingStore = oq0 == null ? popRemoteMessageMapFromMessagingStore(string) : EO1.m2210f(oq0);
            if (writableMapPopRemoteMessageMapFromMessagingStore != null) {
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.merge(writableMapPopRemoteMessageMapFromMessagingStore);
                this.initialNotification = writableNativeMap;
                map.remove(string);
                FL0.f3159g.m2580b(new EL0("messaging_notification_opened", writableMapPopRemoteMessageMapFromMessagingStore));
            }
        }
    }

    @ReactMethod
    public void sendMessage(ReadableMap readableMap, Promise promise) {
        AbstractC9376fU1.m18242c(getExecutor(), new CallableC0361Fj(6, readableMap)).mo11135b(new I30(24, promise));
    }

    @ReactMethod
    public void setAutoInitEnabled(Boolean bool, Promise promise) {
        AbstractC9376fU1.m18242c(getExecutor(), new JL0(0, bool)).mo11135b(new I30(21, promise));
    }

    @ReactMethod
    public void setDeliveryMetricsExportToBigQuery(Boolean bool, Promise promise) {
        AbstractC9376fU1.m18242c(getExecutor(), new JL0(1, bool)).mo11135b(new I30(26, promise));
    }

    @ReactMethod
    public void subscribeToTopic(String str, Promise promise) {
        FirebaseMessaging firebaseMessagingM11307c = FirebaseMessaging.m11307c();
        firebaseMessagingM11307c.getClass();
        firebaseMessagingM11307c.f18475h.mo11145l(new C1668aV(str, 0)).mo11135b(new I30(27, promise));
    }

    @ReactMethod
    public void unsubscribeFromTopic(String str, Promise promise) {
        FirebaseMessaging firebaseMessagingM11307c = FirebaseMessaging.m11307c();
        firebaseMessagingM11307c.getClass();
        firebaseMessagingM11307c.f18475h.mo11145l(new C1668aV(str, 1)).mo11135b(new I30(25, promise));
    }
}
