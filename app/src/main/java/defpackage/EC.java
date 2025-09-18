package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class EC {
    public final Context a;
    public final SharedPreferences b;
    public final InterfaceC5279jG0 c;
    public boolean d;

    public EC(Context context, String str, InterfaceC5279jG0 interfaceC5279jG0) {
        int i = Build.VERSION.SDK_INT;
        context = i >= 24 ? i >= 24 ? AbstractC0949Ly.a(context) : null : context;
        this.a = context;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.b = sharedPreferences;
        this.c = interfaceC5279jG0;
        this.d = sharedPreferences.contains("firebase_data_collection_default_enabled") ? sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true) : a();
    }

    public final boolean a() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        Context context = this.a;
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

    public final synchronized void b(boolean z) {
        if (this.d != z) {
            this.d = z;
            this.c.a(new C6069nP(new FC(z, false)));
        }
    }
}
