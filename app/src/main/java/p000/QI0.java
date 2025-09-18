package p000;

import android.app.Activity;
import android.content.Intent;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;

/* loaded from: classes.dex */
public final class QI0 implements ActivityEventListener {

    /* renamed from: a */
    public static ReactApplicationContext f9561a;

    @Override // com.facebook.react.bridge.ActivityEventListener
    public final void onActivityResult(Activity activity, int i, int i2, Intent intent) {
        if (i == 16845) {
            if (i2 == 0) {
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putBoolean("success", false);
                writableMapCreateMap.putString("message", "CANCELED");
                B81.m527b(writableMapCreateMap);
                return;
            }
            if (i2 == -1) {
                WritableMap writableMapCreateMap2 = Arguments.createMap();
                writableMapCreateMap2.putBoolean("success", true);
                B81.m527b(writableMapCreateMap2);
            }
        }
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public final void onNewIntent(Intent intent) {
    }
}
