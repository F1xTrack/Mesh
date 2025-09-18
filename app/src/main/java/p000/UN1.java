package p000;

import android.Manifest;
import android.content.ComponentCallbacks2;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;

/* loaded from: classes.dex */
public abstract class UN1 {

    /* renamed from: a */
    public static int f11768a;

    /* renamed from: a */
    public static void m7997a(boolean z) {
        if (!z) {
            throw new AssertionError();
        }
    }

    /* renamed from: b */
    public static void m7998b(boolean z, String str) {
        if (!z) {
            throw new AssertionError(str);
        }
    }

    /* renamed from: c */
    public static void m7999c(Object obj) {
        if (obj == null) {
            throw new AssertionError();
        }
    }

    /* renamed from: d */
    public static void m8000d(Object obj, String str) {
        if (obj == null) {
            throw new AssertionError(str);
        }
    }

    /* renamed from: e */
    public static WritableMap m8001e(ReactApplicationContext reactApplicationContext, String str) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        boolean zM25529a = new C11479vw0(reactApplicationContext).m25529a();
        WritableMap writableMapCreateMap = Arguments.createMap();
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        if (zM25529a) {
            str = "granted";
        }
        writableMapCreateMap.putString("status", str);
        writableMapCreateMap.putMap("settings", writableMapCreateMap2);
        return writableMapCreateMap;
    }

    /* renamed from: f */
    public static PA0 m8002f(ReactApplicationContext reactApplicationContext) {
        ComponentCallbacks2 currentActivity = reactApplicationContext.getCurrentActivity();
        if (currentActivity == null) {
            throw new IllegalStateException("Tried to use permissions API while not attached to an Activity.");
        }
        if (currentActivity instanceof PA0) {
            return (PA0) currentActivity;
        }
        throw new IllegalStateException("Tried to use permissions API but the host Activity doesn't implement PermissionAwareActivity.");
    }

    /* renamed from: g */
    public static boolean m8003g(String str) throws NoSuchFieldException {
        try {
            Manifest.permission.class.getField(str.replace("android.permission.", "").replace("com.android.voicemail.permission.", ""));
            return false;
        } catch (NoSuchFieldException unused) {
            return true;
        }
    }
}
