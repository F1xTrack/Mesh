package com.yandex.metrica.impl.ob;

import android.net.Uri;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;

/* renamed from: com.yandex.metrica.impl.ob.qh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3031qh extends AbstractC3006ph<C2856jh> {
    private final C2906lh b;
    private C2807hh c;
    private long d;

    public C3031qh() {
        this(new C2906lh());
    }

    public void a(C2807hh c2807hh) {
        this.c = c2807hh;
    }

    public C3031qh(C2906lh c2906lh) {
        this.b = c2906lh;
    }

    public void a(long j) {
        this.d = j;
    }

    public void a(Uri.Builder builder, C2856jh c2856jh) {
        a(builder);
        builder.path("report");
        C2807hh c2807hh = this.c;
        if (c2807hh != null) {
            builder.appendQueryParameter(CommonUrlParts.DEVICE_ID, O2.a(c2807hh.a, c2856jh.g()));
            builder.appendQueryParameter(CommonUrlParts.UUID, O2.a(this.c.b, c2856jh.x()));
            a(builder, "analytics_sdk_version", this.c.c);
            a(builder, CommonUrlParts.ANALYTICS_SDK_VERSION_NAME, this.c.d);
            builder.appendQueryParameter(CommonUrlParts.APP_VERSION, O2.a(this.c.g, c2856jh.f()));
            builder.appendQueryParameter(CommonUrlParts.APP_VERSION_CODE, O2.a(this.c.i, c2856jh.b()));
            builder.appendQueryParameter("os_version", O2.a(this.c.j, c2856jh.p()));
            a(builder, CommonUrlParts.OS_API_LEVEL, this.c.k);
            a(builder, CommonUrlParts.ANALYTICS_SDK_BUILD_NUMBER, this.c.e);
            a(builder, CommonUrlParts.ANALYTICS_SDK_BUILD_TYPE, this.c.f);
            a(builder, "app_debuggable", this.c.h);
            builder.appendQueryParameter(CommonUrlParts.LOCALE, O2.a(this.c.l, c2856jh.l()));
            builder.appendQueryParameter(CommonUrlParts.ROOT_STATUS, O2.a(this.c.m, c2856jh.i()));
            builder.appendQueryParameter(CommonUrlParts.APP_FRAMEWORK, O2.a(this.c.n, c2856jh.c()));
            a(builder, "attribution_id", this.c.o);
            C2807hh c2807hh2 = this.c;
            String str = c2807hh2.f;
            String str2 = c2807hh2.p;
            if (str != null && str.contains("source") && !TextUtils.isEmpty(str2)) {
                builder.appendQueryParameter("commit_hash", str2);
            }
        }
        builder.appendQueryParameter("api_key_128", c2856jh.C());
        builder.appendQueryParameter("app_id", c2856jh.q());
        builder.appendQueryParameter(CommonUrlParts.APP_PLATFORM, ConstantDeviceInfo.APP_PLATFORM);
        builder.appendQueryParameter(CommonUrlParts.MODEL, c2856jh.n());
        builder.appendQueryParameter("manufacturer", c2856jh.m());
        builder.appendQueryParameter(CommonUrlParts.SCREEN_WIDTH, String.valueOf(c2856jh.v()));
        builder.appendQueryParameter(CommonUrlParts.SCREEN_HEIGHT, String.valueOf(c2856jh.u()));
        builder.appendQueryParameter(CommonUrlParts.SCREEN_DPI, String.valueOf(c2856jh.t()));
        builder.appendQueryParameter(CommonUrlParts.SCALE_FACTOR, String.valueOf(c2856jh.s()));
        builder.appendQueryParameter(CommonUrlParts.DEVICE_TYPE, c2856jh.j());
        a(builder, "clids_set", c2856jh.F());
        builder.appendQueryParameter(CommonUrlParts.APP_SET_ID, c2856jh.d());
        builder.appendQueryParameter(CommonUrlParts.APP_SET_ID_SCOPE, c2856jh.e());
        this.b.a(builder, c2856jh.a());
        builder.appendQueryParameter(CommonUrlParts.REQUEST_ID, String.valueOf(this.d));
    }

    private void a(Uri.Builder builder, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }
}
