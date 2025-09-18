package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;

/* renamed from: EC */
/* loaded from: classes.dex */
public final class C0265EC {

    /* renamed from: a */
    public final Context f2535a;

    /* renamed from: b */
    public final SharedPreferences f2536b;

    /* renamed from: c */
    public final InterfaceC9859jG0 f2537c;

    /* renamed from: d */
    public boolean f2538d;

    public C0265EC(Context context, String str, InterfaceC9859jG0 interfaceC9859jG0) {
        int i = Build.VERSION.SDK_INT;
        context = i >= 24 ? i >= 24 ? AbstractC0753Ly.m5167a(context) : null : context;
        this.f2535a = context;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f2536b = sharedPreferences;
        this.f2537c = interfaceC9859jG0;
        this.f2538d = sharedPreferences.contains("firebase_data_collection_default_enabled") ? sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true) : m2065a();
    }

    /* renamed from: a */
    public final boolean m2065a() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        Context context = this.f2535a;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_data_collection_default_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    /* renamed from: b */
    public final synchronized void m2066b(boolean z) {
        if (this.f2538d != z) {
            this.f2538d = z;
            this.f2537c.mo5003a(new C6487nP(new C0328FC(z, false)));
        }
    }
}
