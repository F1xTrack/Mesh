package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.impl.p022ob.C3762ym;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;

/* renamed from: com.yandex.metrica.impl.ob.hh */
/* loaded from: classes2.dex */
public class C3315hh {

    /* renamed from: a */
    public final String f23588a;

    /* renamed from: b */
    public final String f23589b;

    /* renamed from: c */
    @Deprecated
    public final String f23590c;

    /* renamed from: d */
    public final String f23591d;

    /* renamed from: e */
    public final String f23592e;

    /* renamed from: f */
    public final String f23593f;

    /* renamed from: g */
    public final String f23594g;

    /* renamed from: h */
    public final String f23595h;

    /* renamed from: i */
    public final String f23596i;

    /* renamed from: j */
    public final String f23597j;

    /* renamed from: k */
    public final String f23598k;

    /* renamed from: l */
    public final String f23599l;

    /* renamed from: m */
    public final String f23600m;

    /* renamed from: n */
    public final String f23601n;

    /* renamed from: o */
    public final String f23602o;

    /* renamed from: p */
    public final String f23603p;

    public C3315hh(C3762ym.a aVar) {
        this.f23588a = aVar.m17310c("dId");
        this.f23589b = aVar.m17310c("uId");
        this.f23590c = aVar.m17309b("kitVer");
        this.f23591d = aVar.m17310c("analyticsSdkVersionName");
        this.f23592e = aVar.m17310c("kitBuildNumber");
        this.f23593f = aVar.m17310c("kitBuildType");
        this.f23594g = aVar.m17310c("appVer");
        this.f23595h = aVar.optString("app_debuggable", "0");
        this.f23596i = aVar.m17310c("appBuild");
        this.f23597j = aVar.m17310c("osVer");
        this.f23599l = aVar.m17310c("lang");
        this.f23600m = aVar.m17310c("root");
        this.f23603p = aVar.m17310c("commit_hash");
        this.f23601n = aVar.optString(CommonUrlParts.APP_FRAMEWORK, C2494B2.m13905a());
        int iOptInt = aVar.optInt("osApiLev", -1);
        this.f23598k = iOptInt == -1 ? null : String.valueOf(iOptInt);
        int iOptInt2 = aVar.optInt("attribution_id", 0);
        this.f23602o = iOptInt2 > 0 ? String.valueOf(iOptInt2) : null;
    }

    public C3315hh() {
        this.f23588a = null;
        this.f23589b = null;
        this.f23590c = null;
        this.f23591d = null;
        this.f23592e = null;
        this.f23593f = null;
        this.f23594g = null;
        this.f23595h = null;
        this.f23596i = null;
        this.f23597j = null;
        this.f23598k = null;
        this.f23599l = null;
        this.f23600m = null;
        this.f23601n = null;
        this.f23602o = null;
        this.f23603p = null;
    }
}
