package com.yandex.metrica.impl.p022ob;

import android.net.Uri;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;

/* renamed from: com.yandex.metrica.impl.ob.oh */
/* loaded from: classes2.dex */
public class C3497oh extends AbstractC3523ph<C2855Pd> {

    /* renamed from: b */
    private final C3419lh f24391b;

    /* renamed from: c */
    private long f24392c;

    public C3497oh() {
        this(new C3419lh());
    }

    /* renamed from: a */
    public void m16545a(Uri.Builder builder, C2855Pd c2855Pd) {
        m16588a(builder);
        builder.appendPath("location");
        builder.appendQueryParameter(CommonUrlParts.DEVICE_ID, c2855Pd.m15783g());
        builder.appendQueryParameter(CommonUrlParts.DEVICE_TYPE, c2855Pd.m15786j());
        builder.appendQueryParameter(CommonUrlParts.UUID, c2855Pd.m15800x());
        builder.appendQueryParameter(CommonUrlParts.ANALYTICS_SDK_VERSION_NAME, "5.0.0");
        builder.appendQueryParameter(CommonUrlParts.ANALYTICS_SDK_BUILD_NUMBER, "45001354");
        builder.appendQueryParameter(CommonUrlParts.ANALYTICS_SDK_BUILD_TYPE, c2855Pd.m15787k());
        String strM15787k = c2855Pd.m15787k();
        if (strM15787k != null && strM15787k.contains("source") && !TextUtils.isEmpty("f6c3700f69aeb2f115563bfb01aee99b5faed63c")) {
            builder.appendQueryParameter("commit_hash", "f6c3700f69aeb2f115563bfb01aee99b5faed63c");
        }
        builder.appendQueryParameter(CommonUrlParts.APP_VERSION, c2855Pd.m15782f());
        builder.appendQueryParameter(CommonUrlParts.APP_VERSION_CODE, c2855Pd.m15774b());
        builder.appendQueryParameter("os_version", c2855Pd.m15792p());
        builder.appendQueryParameter(CommonUrlParts.OS_API_LEVEL, String.valueOf(c2855Pd.m15791o()));
        builder.appendQueryParameter(CommonUrlParts.ROOT_STATUS, c2855Pd.m15785i());
        builder.appendQueryParameter(CommonUrlParts.APP_FRAMEWORK, c2855Pd.m15776c());
        builder.appendQueryParameter("app_id", c2855Pd.m15793q());
        builder.appendQueryParameter(CommonUrlParts.APP_PLATFORM, ConstantDeviceInfo.APP_PLATFORM);
        builder.appendQueryParameter(CommonUrlParts.REQUEST_ID, String.valueOf(this.f24392c));
        builder.appendQueryParameter(CommonUrlParts.APP_SET_ID, c2855Pd.m15778d());
        builder.appendQueryParameter(CommonUrlParts.APP_SET_ID_SCOPE, c2855Pd.m15780e());
        this.f24391b.m16420a(builder, c2855Pd.m15767a());
    }

    public C3497oh(C3419lh c3419lh) {
        this.f24391b = c3419lh;
    }

    /* renamed from: a */
    public void m16544a(long j) {
        this.f24392c = j;
    }
}
