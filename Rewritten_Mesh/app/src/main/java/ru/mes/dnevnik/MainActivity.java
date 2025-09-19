package ru.mes.dnevnik;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import com.facebook.react.ReactActivity;
import ru.mes.dnevnik.R;

// import java.lang.ref.WeakReference;
// import java.lang.reflect.InvocationTargetException;
// import kotlin.Metadata;
// import p000.AK0;
// import p000.AbstractActivityC11909zJ0;
// import p000.NS1;
// import p000.O90;


public class MainActivity extends ReactActivity {

    @Override
    public void applyOverrideConfiguration(Configuration configuration) {
        if (configuration == null) {
            // O90.m5968f(configuration, "overrideConfiguration");
        }
        if (Build.VERSION.SDK_INT <= 25) {
            return;
        }
        super.applyOverrideConfiguration(configuration);
    }

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        if (configuration == null) {
            // O90.m5968f(configuration, "newConfig");
        }
        super.onConfigurationChanged(configuration);
        Intent intent = new Intent("onConfigurationChanged");
        intent.putExtra("newConfig", configuration);
        sendBroadcast(intent);
    }

    @Override
    public void onCreate(Bundle bundle) {
        // NS1.f7794b = new WeakReference(this);
        // runOnUiThread(new AK0(R.style.SplashScreen_Fullscreen, this, true));
        super.onCreate(null); // Passing null to avoid issues with saved state during rewrite
        // if (getResources().getBoolean(R.bool.is_tablet)) {
        //     setRequestedOrientation(2);
        // }
    }

    @Override
    public void onNewIntent(Intent intent) {
        if (intent == null) {
             // O90.m5968f(intent, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
        }
        super.onNewIntent(intent);
        setIntent(intent);
    }
}
