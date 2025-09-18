package defpackage;

import android.app.Activity;
import android.content.Intent;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;

/* loaded from: classes.dex */
public final class QI0 implements ActivityEventListener {
    public static ReactApplicationContext a;

    @Override // com.facebook.react.bridge.ActivityEventListener
    public final void onActivityResult(Activity activity, int i, int i2, Intent intent) {
        if (i == 16845) {
            if (i2 == 0) {
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putBoolean("success", false);
                writableMapCreateMap.putString("message", "CANCELED");
                B81.b(writableMapCreateMap);
                return;
            }
            if (i2 == -1) {
                WritableMap writableMapCreateMap2 = Arguments.createMap();
                writableMapCreateMap2.putBoolean("success", true);
                B81.b(writableMapCreateMap2);
            }
        }
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public final void onNewIntent(Intent intent) {
    }
}
