package defpackage;

import android.app.Application;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/* loaded from: classes.dex */
public final class YI implements SharedPreferences.OnSharedPreferenceChangeListener {
    public final C0474Fv0 a;
    public final SharedPreferences b;
    public final C0999Mo1 c;

    public YI(Application application, C0474Fv0 c0474Fv0) {
        O90.f(application, "applicationContext");
        this.a = c0474Fv0;
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(application);
        O90.e(defaultSharedPreferences, "getDefaultSharedPreferences(...)");
        this.b = defaultSharedPreferences;
        C0999Mo1 c0999Mo1 = new C0999Mo1();
        c0999Mo1.a = PreferenceManager.getDefaultSharedPreferences(application);
        application.getPackageName();
        c0999Mo1.b = application;
        this.c = c0999Mo1;
        defaultSharedPreferences.registerOnSharedPreferenceChangeListener(this);
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        O90.f(sharedPreferences, "sharedPreferences");
        C0474Fv0 c0474Fv0 = this.a;
        if (c0474Fv0 != null) {
            if ("fps_debug".equals(str) || "js_dev_mode_debug".equals(str) || "start_sampling_profiler_on_init".equals(str) || "js_minify_debug".equals(str)) {
                c0474Fv0.getClass();
            }
        }
    }
}
