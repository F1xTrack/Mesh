package io.appmetrica.analytics.impl;

import defpackage.AbstractC1705Vq;
import io.appmetrica.analytics.coreutils.internal.services.FrameworkDetector;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;

/* renamed from: io.appmetrica.analytics.impl.m7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4712m7 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;

    public C4712m7(C4425ab c4425ab) {
        this.a = c4425ab.b("dId");
        this.b = c4425ab.b("uId");
        this.c = c4425ab.b("analyticsSdkVersionName");
        this.d = c4425ab.b("kitBuildNumber");
        this.e = c4425ab.b("kitBuildType");
        this.f = c4425ab.b("appVer");
        this.g = c4425ab.optString("app_debuggable", "0");
        this.h = c4425ab.b("appBuild");
        this.i = c4425ab.b("osVer");
        this.k = c4425ab.b("lang");
        this.l = c4425ab.b("root");
        this.m = c4425ab.optString(CommonUrlParts.APP_FRAMEWORK, FrameworkDetector.framework());
        int iOptInt = c4425ab.optInt("osApiLev", -1);
        this.j = iOptInt == -1 ? null : String.valueOf(iOptInt);
        int iOptInt2 = c4425ab.optInt("attribution_id", 0);
        this.n = iOptInt2 > 0 ? String.valueOf(iOptInt2) : null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DbNetworkTaskConfig{deviceId='");
        sb.append(this.a);
        sb.append("', uuid='");
        sb.append(this.b);
        sb.append("', analyticsSdkVersionName='");
        sb.append(this.c);
        sb.append("', kitBuildNumber='");
        sb.append(this.d);
        sb.append("', kitBuildType='");
        sb.append(this.e);
        sb.append("', appVersion='");
        sb.append(this.f);
        sb.append("', appDebuggable='");
        sb.append(this.g);
        sb.append("', appBuildNumber='");
        sb.append(this.h);
        sb.append("', osVersion='");
        sb.append(this.i);
        sb.append("', osApiLevel='");
        sb.append(this.j);
        sb.append("', locale='");
        sb.append(this.k);
        sb.append("', deviceRootStatus='");
        sb.append(this.l);
        sb.append("', appFramework='");
        sb.append(this.m);
        sb.append("', attributionId='");
        return AbstractC1705Vq.l(sb, this.n, "'}");
    }

    public C4712m7() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = null;
    }
}
