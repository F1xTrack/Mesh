package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.services.FrameworkDetector;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import p000.AbstractC1374Vq;

/* renamed from: io.appmetrica.analytics.impl.m7 */
/* loaded from: classes2.dex */
public final class C5291m7 {

    /* renamed from: a */
    public final String f32173a;

    /* renamed from: b */
    public final String f32174b;

    /* renamed from: c */
    public final String f32175c;

    /* renamed from: d */
    public final String f32176d;

    /* renamed from: e */
    public final String f32177e;

    /* renamed from: f */
    public final String f32178f;

    /* renamed from: g */
    public final String f32179g;

    /* renamed from: h */
    public final String f32180h;

    /* renamed from: i */
    public final String f32181i;

    /* renamed from: j */
    public final String f32182j;

    /* renamed from: k */
    public final String f32183k;

    /* renamed from: l */
    public final String f32184l;

    /* renamed from: m */
    public final String f32185m;

    /* renamed from: n */
    public final String f32186n;

    public C5291m7(C4995ab c4995ab) {
        this.f32173a = c4995ab.m20119b("dId");
        this.f32174b = c4995ab.m20119b("uId");
        this.f32175c = c4995ab.m20119b("analyticsSdkVersionName");
        this.f32176d = c4995ab.m20119b("kitBuildNumber");
        this.f32177e = c4995ab.m20119b("kitBuildType");
        this.f32178f = c4995ab.m20119b("appVer");
        this.f32179g = c4995ab.optString("app_debuggable", "0");
        this.f32180h = c4995ab.m20119b("appBuild");
        this.f32181i = c4995ab.m20119b("osVer");
        this.f32183k = c4995ab.m20119b("lang");
        this.f32184l = c4995ab.m20119b("root");
        this.f32185m = c4995ab.optString(CommonUrlParts.APP_FRAMEWORK, FrameworkDetector.framework());
        int iOptInt = c4995ab.optInt("osApiLev", -1);
        this.f32182j = iOptInt == -1 ? null : String.valueOf(iOptInt);
        int iOptInt2 = c4995ab.optInt("attribution_id", 0);
        this.f32186n = iOptInt2 > 0 ? String.valueOf(iOptInt2) : null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DbNetworkTaskConfig{deviceId='");
        sb.append(this.f32173a);
        sb.append("', uuid='");
        sb.append(this.f32174b);
        sb.append("', analyticsSdkVersionName='");
        sb.append(this.f32175c);
        sb.append("', kitBuildNumber='");
        sb.append(this.f32176d);
        sb.append("', kitBuildType='");
        sb.append(this.f32177e);
        sb.append("', appVersion='");
        sb.append(this.f32178f);
        sb.append("', appDebuggable='");
        sb.append(this.f32179g);
        sb.append("', appBuildNumber='");
        sb.append(this.f32180h);
        sb.append("', osVersion='");
        sb.append(this.f32181i);
        sb.append("', osApiLevel='");
        sb.append(this.f32182j);
        sb.append("', locale='");
        sb.append(this.f32183k);
        sb.append("', deviceRootStatus='");
        sb.append(this.f32184l);
        sb.append("', appFramework='");
        sb.append(this.f32185m);
        sb.append("', attributionId='");
        return AbstractC1374Vq.m8593l(sb, this.f32186n, "'}");
    }

    public C5291m7() {
        this.f32173a = null;
        this.f32174b = null;
        this.f32175c = null;
        this.f32176d = null;
        this.f32177e = null;
        this.f32178f = null;
        this.f32179g = null;
        this.f32180h = null;
        this.f32181i = null;
        this.f32182j = null;
        this.f32183k = null;
        this.f32184l = null;
        this.f32185m = null;
        this.f32186n = null;
    }
}
