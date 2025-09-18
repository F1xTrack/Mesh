package ru.mes.dnevnik;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import com.huawei.hms.support.api.entity.core.CommonCode;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import p000.AK0;
import p000.AbstractActivityC11909zJ0;
import p000.NS1;
import p000.O90;

@Metadata(m22266d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m22267d2 = {"Lru/mes/dnevnik/MainActivity;", "LzJ0;", "<init>", "()V", "app_moscowRelease"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class MainActivity extends AbstractActivityC11909zJ0 {
    @Override // android.view.ContextThemeWrapper
    public final void applyOverrideConfiguration(Configuration configuration) {
        O90.m5968f(configuration, "overrideConfiguration");
        if (Build.VERSION.SDK_INT <= 25) {
            return;
        }
        super.applyOverrideConfiguration(configuration);
    }

    @Override // p000.AbstractActivityC11909zJ0, p000.AbstractActivityC4221i6, p000.AbstractActivityC0499Hv, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, PackageManager.NameNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        O90.m5968f(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        Intent intent = new Intent("onConfigurationChanged");
        intent.putExtra("newConfig", configuration);
        sendBroadcast(intent);
    }

    @Override // p000.AbstractActivityC11909zJ0, androidx.fragment.app.AbstractActivityC1730l, p000.AbstractActivityC0499Hv, p000.AbstractActivityC0436Gv, android.app.Activity
    public final void onCreate(Bundle bundle) {
        NS1.f7794b = new WeakReference(this);
        runOnUiThread(new AK0(R.style.SplashScreen_Fullscreen, this, true));
        super.onCreate(null);
        if (getResources().getBoolean(R.bool.is_tablet)) {
            setRequestedOrientation(2);
        }
    }

    @Override // p000.AbstractActivityC11909zJ0, p000.AbstractActivityC0499Hv, android.app.Activity
    public final void onNewIntent(Intent intent) {
        O90.m5968f(intent, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
        super.onNewIntent(intent);
        setIntent(intent);
    }
}
