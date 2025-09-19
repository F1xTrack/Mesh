package io.invertase.firebase.crashlytics;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import org.json.JSONObject;
import p000.CO1;
import p000.GL0;
import p000.HL0;
import p000.LL0;

/* loaded from: classes2.dex */
public class ReactNativeFirebaseCrashlyticsInitProvider extends GL0 {
    /* renamed from: a */
    public static boolean m21331a() {
        ApplicationInfo applicationInfo;
        HL0 hl0 = HL0.f4233b;
        LL0 ll0 = LL0.f6614b;
        boolean zOptBoolean = true;
        if (ll0.m4957c().contains("crashlytics_auto_collection_enabled")) {
            return ll0.m4957c().getBoolean("crashlytics_auto_collection_enabled", true);
        }
        JSONObject jSONObject = hl0.f4234a;
        if (jSONObject == null ? false : jSONObject.has("crashlytics_auto_collection_enabled")) {
            JSONObject jSONObject2 = hl0.f4234a;
            if (jSONObject2 != null) {
                zOptBoolean = jSONObject2.optBoolean("crashlytics_auto_collection_enabled", true);
            }
        } else {
            Bundle bundle = null;
            try {
                Context context = CO1.f1354a;
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null) {
                    bundle = applicationInfo.metaData;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            if (bundle != null) {
                zOptBoolean = bundle.getBoolean("rnfirebase_crashlytics_auto_collection_enabled", true);
            }
        }
        return zOptBoolean;
    }

    @Override // p000.GL0, android.content.ContentProvider
    public final boolean onCreate() {
        super.onCreate();
        try {
            FirebaseCrashlytics.getInstance().setCrashlyticsCollectionEnabled(m21331a());
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
