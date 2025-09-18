package io.appmetrica.analytics.impl;

import org.json.JSONObject;
import p000.AbstractC7222ym;

/* renamed from: io.appmetrica.analytics.impl.Vj */
/* loaded from: classes2.dex */
public final class C4883Vj {

    /* renamed from: a */
    public final String f30868a;

    /* renamed from: b */
    public final String f30869b;

    /* renamed from: c */
    public final String f30870c;

    /* renamed from: d */
    public final String f30871d;

    /* renamed from: e */
    public final String f30872e;

    /* renamed from: f */
    public final int f30873f;

    /* renamed from: g */
    public final int f30874g;

    public C4883Vj(JSONObject jSONObject) {
        this.f30868a = jSONObject.optString("analyticsSdkVersionName", "");
        this.f30869b = jSONObject.optString("kitBuildNumber", "");
        this.f30870c = jSONObject.optString("appVer", "");
        this.f30871d = jSONObject.optString("appBuild", "");
        this.f30872e = jSONObject.optString("osVer", "");
        this.f30873f = jSONObject.optInt("osApiLev", -1);
        this.f30874g = jSONObject.optInt("attribution_id", 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionRequestParams(kitVersionName='");
        sb.append(this.f30868a);
        sb.append("', kitBuildNumber='");
        sb.append(this.f30869b);
        sb.append("', appVersion='");
        sb.append(this.f30870c);
        sb.append("', appBuild='");
        sb.append(this.f30871d);
        sb.append("', osVersion='");
        sb.append(this.f30872e);
        sb.append("', apiLevel=");
        sb.append(this.f30873f);
        sb.append(", attributionId=");
        return AbstractC7222ym.m26235l(sb, this.f30874g, ')');
    }
}
