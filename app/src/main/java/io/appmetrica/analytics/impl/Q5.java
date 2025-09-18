package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;

/* loaded from: classes2.dex */
public abstract class Q5 extends BaseRequestConfig.ComponentLoader {
    public final SafePackageManager a;

    public Q5(Context context, String str) {
        this(context, str, new SafePackageManager());
    }

    @Override // io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.RequestConfigLoader
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public R5 load(P5 p5) {
        R5 r5 = (R5) super.load((Q5) p5);
        String packageName = getContext().getPackageName();
        ApplicationInfo applicationInfo = this.a.getApplicationInfo(getContext(), getPackageName(), 0);
        if (applicationInfo != null) {
            int i = applicationInfo.flags;
            r5.a = (i & 2) != 0 ? "1" : "0";
            r5.b = (i & 1) == 0 ? "0" : "1";
        } else if (TextUtils.equals(packageName, getPackageName())) {
            r5.a = (getContext().getApplicationInfo().flags & 2) != 0 ? "1" : "0";
            r5.b = (getContext().getApplicationInfo().flags & 1) == 0 ? "0" : "1";
        } else {
            r5.a = "0";
            r5.b = "0";
        }
        C4583gl c4583gl = p5.a;
        r5.c = c4583gl;
        r5.setRetryPolicyConfig(c4583gl.t);
        return r5;
    }

    public Q5(Context context, String str, SafePackageManager safePackageManager) {
        super(context, str);
        this.a = safePackageManager;
    }
}
