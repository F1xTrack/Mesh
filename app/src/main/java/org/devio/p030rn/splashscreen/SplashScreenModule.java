package org.devio.p030rn.splashscreen;

import android.app.Activity;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import java.lang.ref.WeakReference;
import p000.AK0;
import p000.NS1;
import p000.RunnableC1251Tt;
import ru.mes.dnevnik.R;

/* loaded from: classes2.dex */
public class SplashScreenModule extends ReactContextBaseJavaModule {
    public SplashScreenModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "SplashScreen";
    }

    @ReactMethod
    public void hide() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            WeakReference weakReference = NS1.f7794b;
            if (weakReference == null) {
                return;
            } else {
                currentActivity = (Activity) weakReference.get();
            }
        }
        if (currentActivity == null) {
            return;
        }
        currentActivity.runOnUiThread(new RunnableC1251Tt(currentActivity, 4));
    }

    @ReactMethod
    public void show() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        NS1.f7794b = new WeakReference(currentActivity);
        currentActivity.runOnUiThread(new AK0(R.style.SplashScreen_SplashTheme, currentActivity, false));
    }
}
