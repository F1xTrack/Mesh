package com.p019vk.push.core.remote.config.omicron.fingerprint;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.util.Map;

/* loaded from: classes2.dex */
public class AppFingerprint implements OmicronFingerprint {

    /* renamed from: a */
    public final Context f20544a;

    public AppFingerprint(Context context) {
        this.f20544a = context.getApplicationContext();
    }

    @Override // com.p019vk.push.core.remote.config.omicron.fingerprint.OmicronFingerprint
    public void collect(Map<String, Object> map) throws PackageManager.NameNotFoundException {
        Context context = this.f20544a;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            map.put("app_id", context.getPackageName());
            map.put("app_build", Integer.valueOf(packageInfo.versionCode));
            map.put("app_version", "6.9.1");
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalStateException(e);
        }
    }
}
