package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;

/* renamed from: io.appmetrica.analytics.impl.Q5 */
/* loaded from: classes2.dex */
public abstract class AbstractC4750Q5 extends BaseRequestConfig.ComponentLoader {

    /* renamed from: a */
    public final SafePackageManager f30656a;

    public AbstractC4750Q5(Context context, String str) {
        this(context, str, new SafePackageManager());
    }

    @Override // io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.RequestConfigLoader
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C4773R5 load(C4726P5 c4726p5) {
        C4773R5 c4773r5 = (C4773R5) super.load((AbstractC4750Q5) c4726p5);
        String packageName = getContext().getPackageName();
        ApplicationInfo applicationInfo = this.f30656a.getApplicationInfo(getContext(), getPackageName(), 0);
        if (applicationInfo != null) {
            int i = applicationInfo.flags;
            c4773r5.f30676a = (i & 2) != 0 ? "1" : "0";
            c4773r5.f30677b = (i & 1) == 0 ? "0" : "1";
        } else if (TextUtils.equals(packageName, getPackageName())) {
            c4773r5.f30676a = (getContext().getApplicationInfo().flags & 2) != 0 ? "1" : "0";
            c4773r5.f30677b = (getContext().getApplicationInfo().flags & 1) == 0 ? "0" : "1";
        } else {
            c4773r5.f30676a = "0";
            c4773r5.f30677b = "0";
        }
        C5155gl c5155gl = c4726p5.f30602a;
        c4773r5.f30678c = c5155gl;
        c4773r5.setRetryPolicyConfig(c5155gl.f31801t);
        return c4773r5;
    }

    public AbstractC4750Q5(Context context, String str, SafePackageManager safePackageManager) {
        super(context, str);
        this.f30656a = safePackageManager;
    }
}
