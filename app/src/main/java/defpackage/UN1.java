package defpackage;

import android.Manifest;
import android.content.ComponentCallbacks2;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;

/* loaded from: classes.dex */
public abstract class UN1 {
    public static int a;

    public static void a(boolean z) {
        if (!z) {
            throw new AssertionError();
        }
    }

    public static void b(boolean z, String str) {
        if (!z) {
            throw new AssertionError(str);
        }
    }

    public static void c(Object obj) {
        if (obj == null) {
            throw new AssertionError();
        }
    }

    public static void d(Object obj, String str) {
        if (obj == null) {
            throw new AssertionError(str);
        }
    }

    public static WritableMap e(ReactApplicationContext reactApplicationContext, String str) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        boolean zA = new C7696vw0(reactApplicationContext).a();
        WritableMap writableMapCreateMap = Arguments.createMap();
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        if (zA) {
            str = "granted";
        }
        writableMapCreateMap.putString("status", str);
        writableMapCreateMap.putMap("settings", writableMapCreateMap2);
        return writableMapCreateMap;
    }

    public static PA0 f(ReactApplicationContext reactApplicationContext) {
        ComponentCallbacks2 currentActivity = reactApplicationContext.getCurrentActivity();
        if (currentActivity == null) {
            throw new IllegalStateException("Tried to use permissions API while not attached to an Activity.");
        }
        if (currentActivity instanceof PA0) {
            return (PA0) currentActivity;
        }
        throw new IllegalStateException("Tried to use permissions API but the host Activity doesn't implement PermissionAwareActivity.");
    }

    public static boolean g(String str) throws NoSuchFieldException {
        try {
            Manifest.permission.class.getField(str.replace("android.permission.", "").replace("com.android.voicemail.permission.", ""));
            return false;
        } catch (NoSuchFieldException unused) {
            return true;
        }
    }
}
