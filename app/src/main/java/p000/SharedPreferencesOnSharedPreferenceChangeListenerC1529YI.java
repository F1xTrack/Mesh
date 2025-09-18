package p000;

import android.app.Application;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/* renamed from: YI */
/* loaded from: classes.dex */
public final class SharedPreferencesOnSharedPreferenceChangeListenerC1529YI implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a */
    public final C7616Fv0 f14226a;

    /* renamed from: b */
    public final SharedPreferences f14227b;

    /* renamed from: c */
    public final C7967Mo1 f14228c;

    public SharedPreferencesOnSharedPreferenceChangeListenerC1529YI(Application application, C7616Fv0 c7616Fv0) {
        O90.m5968f(application, "applicationContext");
        this.f14226a = c7616Fv0;
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(application);
        O90.m5967e(defaultSharedPreferences, "getDefaultSharedPreferences(...)");
        this.f14227b = defaultSharedPreferences;
        C7967Mo1 c7967Mo1 = new C7967Mo1();
        c7967Mo1.f7362a = PreferenceManager.getDefaultSharedPreferences(application);
        application.getPackageName();
        c7967Mo1.f7363b = application;
        this.f14228c = c7967Mo1;
        defaultSharedPreferences.registerOnSharedPreferenceChangeListener(this);
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        O90.m5968f(sharedPreferences, "sharedPreferences");
        C7616Fv0 c7616Fv0 = this.f14226a;
        if (c7616Fv0 != null) {
            if ("fps_debug".equals(str) || "js_dev_mode_debug".equals(str) || "start_sampling_profiler_on_init".equals(str) || "js_minify_debug".equals(str)) {
                c7616Fv0.getClass();
            }
        }
    }
}
