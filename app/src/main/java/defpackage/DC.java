package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class DC {
    public final SharedPreferences a;
    public final MU b;
    public final Object c;
    public S81 d;
    public boolean e;
    public Boolean f;
    public final S81 g;

    public DC(MU mu) {
        Object obj = new Object();
        this.c = obj;
        this.d = new S81();
        this.e = false;
        this.g = new S81();
        mu.a();
        Context context = mu.a;
        this.b = mu;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.crashlytics", 0);
        this.a = sharedPreferences;
        Boolean boolValueOf = sharedPreferences.contains("firebase_crashlytics_collection_enabled") ? Boolean.valueOf(sharedPreferences.getBoolean("firebase_crashlytics_collection_enabled", true)) : null;
        this.f = boolValueOf == null ? a(context) : boolValueOf;
        synchronized (obj) {
            try {
                if (b()) {
                    this.d.d(null);
                    this.e = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Boolean a(Context context) {
        PackageManager packageManager;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            packageManager = context.getPackageManager();
        } catch (PackageManager.NameNotFoundException unused) {
        }
        Boolean boolValueOf = (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_crashlytics_collection_enabled")) ? null : Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_crashlytics_collection_enabled"));
        if (boolValueOf == null) {
            return null;
        }
        return Boolean.valueOf(Boolean.TRUE.equals(boolValueOf));
    }

    public final synchronized boolean b() {
        boolean zJ;
        Boolean bool = this.f;
        if (bool != null) {
            zJ = bool.booleanValue();
        } else {
            try {
                zJ = this.b.j();
            } catch (IllegalStateException unused) {
                zJ = false;
            }
        }
        return zJ;
    }
}
