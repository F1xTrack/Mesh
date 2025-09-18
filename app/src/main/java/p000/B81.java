package p000;

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

    /* renamed from: a */
    public static final Object f586a = new Object();

    /* renamed from: b */
    public static String f587b;

    /* renamed from: c */
    public static B81 f588c;

    /* renamed from: d */
    public static Promise f589d;

    /* renamed from: a */
    public static void m526a(String str) {
        Promise promise = f589d;
        if (promise != null) {
            promise.reject(str);
        }
        f589d = null;
    }

    /* renamed from: b */
    public static void m527b(WritableMap writableMap) {
        Promise promise = f589d;
        if (promise != null) {
            promise.resolve(writableMap);
        }
        f589d = null;
    }

    /* renamed from: c */
    public static IntentSender m528c(ReactContext reactContext) {
        synchronized (f586a) {
            try {
                if (f587b == null) {
                    f587b = reactContext.getPackageName() + "/" + B81.class.getName() + "_ACTION";
                }
                Context applicationContext = reactContext.getApplicationContext();
                B81 b81 = f588c;
                if (b81 != null) {
                    applicationContext.unregisterReceiver(b81);
                }
                f588c = new B81();
                if (Build.VERSION.SDK_INT < 34 || applicationContext.getApplicationInfo().targetSdkVersion < 34) {
                    applicationContext.registerReceiver(f588c, new IntentFilter(f587b));
                } else {
                    applicationContext.registerReceiver(f588c, new IntentFilter(f587b), 2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Intent intent = new Intent(f587b);
        intent.setPackage(reactContext.getPackageName());
        intent.setClass(reactContext.getApplicationContext(), B81.class);
        intent.putExtra("receiver_token", f588c.hashCode());
        return PendingIntent.getBroadcast(reactContext, 0, intent, 1409286144).getIntentSender();
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        synchronized (f586a) {
            try {
                if (f588c != this) {
                    return;
                }
                context.getApplicationContext().unregisterReceiver(f588c);
                f588c = null;
                if (intent.hasExtra("receiver_token") && intent.getIntExtra("receiver_token", 0) == hashCode()) {
                    ComponentName componentName = (ComponentName) intent.getParcelableExtra("android.intent.extra.CHOSEN_COMPONENT");
                    WritableMap writableMapCreateMap = Arguments.createMap();
                    writableMapCreateMap.putBoolean("success", true);
                    if (componentName != null) {
                        writableMapCreateMap.putString("message", componentName.flattenToString());
                    } else {
                        writableMapCreateMap.putString("message", "OK");
                    }
                    m527b(writableMapCreateMap);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
