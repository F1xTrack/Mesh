package defpackage;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.os.Build;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;

/* loaded from: classes.dex */
public final class B81 extends BroadcastReceiver {
    public static final Object a = new Object();
    public static String b;
    public static B81 c;
    public static Promise d;

    public static void a(String str) {
        Promise promise = d;
        if (promise != null) {
            promise.reject(str);
        }
        d = null;
    }

    public static void b(WritableMap writableMap) {
        Promise promise = d;
        if (promise != null) {
            promise.resolve(writableMap);
        }
        d = null;
    }

    public static IntentSender c(ReactContext reactContext) {
        synchronized (a) {
            try {
                if (b == null) {
                    b = reactContext.getPackageName() + "/" + B81.class.getName() + "_ACTION";
                }
                Context applicationContext = reactContext.getApplicationContext();
                B81 b81 = c;
                if (b81 != null) {
                    applicationContext.unregisterReceiver(b81);
                }
                c = new B81();
                if (Build.VERSION.SDK_INT < 34 || applicationContext.getApplicationInfo().targetSdkVersion < 34) {
                    applicationContext.registerReceiver(c, new IntentFilter(b));
                } else {
                    applicationContext.registerReceiver(c, new IntentFilter(b), 2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Intent intent = new Intent(b);
        intent.setPackage(reactContext.getPackageName());
        intent.setClass(reactContext.getApplicationContext(), B81.class);
        intent.putExtra("receiver_token", c.hashCode());
        return PendingIntent.getBroadcast(reactContext, 0, intent, 1409286144).getIntentSender();
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        synchronized (a) {
            try {
                if (c != this) {
                    return;
                }
                context.getApplicationContext().unregisterReceiver(c);
                c = null;
                if (intent.hasExtra("receiver_token") && intent.getIntExtra("receiver_token", 0) == hashCode()) {
                    ComponentName componentName = (ComponentName) intent.getParcelableExtra("android.intent.extra.CHOSEN_COMPONENT");
                    WritableMap writableMapCreateMap = Arguments.createMap();
                    writableMapCreateMap.putBoolean("success", true);
                    if (componentName != null) {
                        writableMapCreateMap.putString("message", componentName.flattenToString());
                    } else {
                        writableMapCreateMap.putString("message", "OK");
                    }
                    b(writableMapCreateMap);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
