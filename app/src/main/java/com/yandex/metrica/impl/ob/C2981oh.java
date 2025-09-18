package com.yandex.metrica.impl.ob;

import android.net.Uri;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;

/* renamed from: com.yandex.metrica.impl.ob.oh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2981oh extends AbstractC3006ph<Pd> {
    private final C2906lh b;
    private long c;

    public C2981oh() {
        this(new C2906lh());
    }

    public void a(Uri.Builder builder, Pd pd) {
        a(builder);
        builder.appendPath("location");
        builder.appendQueryParameter(CommonUrlParts.DEVICE_ID, pd.g());
        builder.appendQueryParameter(CommonUrlParts.DEVICE_TYPE, pd.j());
        builder.appendQueryParameter(CommonUrlParts.UUID, pd.x());
        builder.appendQueryParameter(CommonUrlParts.ANALYTICS_SDK_VERSION_NAME, "5.0.0");
        builder.appendQueryParameter(CommonUrlParts.ANALYTICS_SDK_BUILD_NUMBER, "45001354");
        builder.appendQueryParameter(CommonUrlParts.ANALYTICS_SDK_BUILD_TYPE, pd.k());
        String strK = pd.k();
        if (strK != null && strK.contains("source") && !TextUtils.isEmpty("f6c3700f69aeb2f115563bfb01aee99b5faed63c")) {
            builder.appendQueryParameter("commit_hash", "f6c3700f69aeb2f115563bfb01aee99b5faed63c");
        }
        builder.appendQueryParameter(CommonUrlParts.APP_VERSION, pd.f());
        builder.appendQueryParameter(CommonUrlParts.APP_VERSION_CODE, pd.b());
        builder.appendQueryParameter("os_version", pd.p());
        builder.appendQueryParameter(CommonUrlParts.OS_API_LEVEL, String.valueOf(pd.o()));
        builder.appendQueryParameter(CommonUrlParts.ROOT_STATUS, pd.i());
        builder.appendQueryParameter(CommonUrlParts.APP_FRAMEWORK, pd.c());
        builder.appendQueryParameter("app_id", pd.q());
        builder.appendQueryParameter(CommonUrlParts.APP_PLATFORM, ConstantDeviceInfo.APP_PLATFORM);
        builder.appendQueryParameter(CommonUrlParts.REQUEST_ID, String.valueOf(this.c));
        builder.appendQueryParameter(CommonUrlParts.APP_SET_ID, pd.d());
        builder.appendQueryParameter(CommonUrlParts.APP_SET_ID_SCOPE, pd.e());
        this.b.a(builder, pd.a());
    }

    public C2981oh(C2906lh c2906lh) {
        this.b = c2906lh;
    }

    public void a(long j) {
        this.c = j;
    }
}
