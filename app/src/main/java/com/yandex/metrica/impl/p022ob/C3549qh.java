package com.yandex.metrica.impl.p022ob;

import android.net.Uri;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;

/* renamed from: com.yandex.metrica.impl.ob.qh */
/* loaded from: classes2.dex */
public class C3549qh extends AbstractC3523ph<C3367jh> {

    /* renamed from: b */
    private final C3419lh f24552b;

    /* renamed from: c */
    private C3315hh f24553c;

    /* renamed from: d */
    private long f24554d;

    public C3549qh() {
        this(new C3419lh());
    }

    /* renamed from: a */
    public void m16629a(C3315hh c3315hh) {
        this.f24553c = c3315hh;
    }

    public C3549qh(C3419lh c3419lh) {
        this.f24552b = c3419lh;
    }

    /* renamed from: a */
    public void m16627a(long j) {
        this.f24554d = j;
    }

    /* renamed from: a */
    public void m16628a(Uri.Builder builder, C3367jh c3367jh) {
        m16588a(builder);
        builder.path("report");
        C3315hh c3315hh = this.f24553c;
        if (c3315hh != null) {
            builder.appendQueryParameter(CommonUrlParts.DEVICE_ID, C2819O2.m14686a(c3315hh.f23588a, c3367jh.m15783g()));
            builder.appendQueryParameter(CommonUrlParts.UUID, C2819O2.m14686a(this.f24553c.f23589b, c3367jh.m15800x()));
            m16626a(builder, "analytics_sdk_version", this.f24553c.f23590c);
            m16626a(builder, CommonUrlParts.ANALYTICS_SDK_VERSION_NAME, this.f24553c.f23591d);
            builder.appendQueryParameter(CommonUrlParts.APP_VERSION, C2819O2.m14686a(this.f24553c.f23594g, c3367jh.m15782f()));
            builder.appendQueryParameter(CommonUrlParts.APP_VERSION_CODE, C2819O2.m14686a(this.f24553c.f23596i, c3367jh.m15774b()));
            builder.appendQueryParameter("os_version", C2819O2.m14686a(this.f24553c.f23597j, c3367jh.m15792p()));
            m16626a(builder, CommonUrlParts.OS_API_LEVEL, this.f24553c.f23598k);
            m16626a(builder, CommonUrlParts.ANALYTICS_SDK_BUILD_NUMBER, this.f24553c.f23592e);
            m16626a(builder, CommonUrlParts.ANALYTICS_SDK_BUILD_TYPE, this.f24553c.f23593f);
            m16626a(builder, "app_debuggable", this.f24553c.f23595h);
            builder.appendQueryParameter(CommonUrlParts.LOCALE, C2819O2.m14686a(this.f24553c.f23599l, c3367jh.m15788l()));
            builder.appendQueryParameter(CommonUrlParts.ROOT_STATUS, C2819O2.m14686a(this.f24553c.f23600m, c3367jh.m15785i()));
            builder.appendQueryParameter(CommonUrlParts.APP_FRAMEWORK, C2819O2.m14686a(this.f24553c.f23601n, c3367jh.m15776c()));
            m16626a(builder, "attribution_id", this.f24553c.f23602o);
            C3315hh c3315hh2 = this.f24553c;
            String str = c3315hh2.f23593f;
            String str2 = c3315hh2.f23603p;
            if (str != null && str.contains("source") && !TextUtils.isEmpty(str2)) {
                builder.appendQueryParameter("commit_hash", str2);
            }
        }
        builder.appendQueryParameter("api_key_128", c3367jh.m16129C());
        builder.appendQueryParameter("app_id", c3367jh.m15793q());
        builder.appendQueryParameter(CommonUrlParts.APP_PLATFORM, ConstantDeviceInfo.APP_PLATFORM);
        builder.appendQueryParameter(CommonUrlParts.MODEL, c3367jh.m15790n());
        builder.appendQueryParameter("manufacturer", c3367jh.m15789m());
        builder.appendQueryParameter(CommonUrlParts.SCREEN_WIDTH, String.valueOf(c3367jh.m15798v()));
        builder.appendQueryParameter(CommonUrlParts.SCREEN_HEIGHT, String.valueOf(c3367jh.m15797u()));
        builder.appendQueryParameter(CommonUrlParts.SCREEN_DPI, String.valueOf(c3367jh.m15796t()));
        builder.appendQueryParameter(CommonUrlParts.SCALE_FACTOR, String.valueOf(c3367jh.m15795s()));
        builder.appendQueryParameter(CommonUrlParts.DEVICE_TYPE, c3367jh.m15786j());
        m16626a(builder, "clids_set", c3367jh.m16132F());
        builder.appendQueryParameter(CommonUrlParts.APP_SET_ID, c3367jh.m15778d());
        builder.appendQueryParameter(CommonUrlParts.APP_SET_ID_SCOPE, c3367jh.m15780e());
        this.f24552b.m16420a(builder, c3367jh.m15767a());
        builder.appendQueryParameter(CommonUrlParts.REQUEST_ID, String.valueOf(this.f24554d));
    }

    /* renamed from: a */
    private void m16626a(Uri.Builder builder, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }
}
