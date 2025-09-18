package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;
import java.util.List;
import java.util.Map;
import p000.AbstractC11153tN0;

/* renamed from: io.appmetrica.analytics.impl.al */
/* loaded from: classes2.dex */
public final class C5005al extends BaseRequestConfig.BaseRequestArguments {

    /* renamed from: a */
    public final String f31266a;

    /* renamed from: b */
    public final String f31267b;

    /* renamed from: c */
    public final Map<String, String> f31268c;

    /* renamed from: d */
    public final boolean f31269d;

    /* renamed from: e */
    public final List<String> f31270e;

    public C5005al(C4939Y3 c4939y3) {
        this(c4939y3.m20019a().m19768d(), c4939y3.m20019a().m19770e(), c4939y3.m20019a().m19762a(), c4939y3.m20019a().m19774i(), c4939y3.m20019a().m19764b());
    }

    /* renamed from: a */
    public final boolean m20129a(C5005al c5005al) {
        return false;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    /* renamed from: b */
    public final C5005al mergeFrom(C5005al c5005al) {
        return new C5005al((String) WrapUtils.getOrDefaultNullable(this.f31266a, c5005al.f31266a), (String) WrapUtils.getOrDefaultNullable(this.f31267b, c5005al.f31267b), (Map) WrapUtils.getOrDefaultNullable(this.f31268c, c5005al.f31268c), this.f31269d || c5005al.f31269d, c5005al.f31269d ? c5005al.f31270e : this.f31270e);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    public final boolean compareWithOtherArguments(Object obj) {
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Arguments{distributionReferrer='");
        sb.append(this.f31266a);
        sb.append("', installReferrerSource='");
        sb.append(this.f31267b);
        sb.append("', clientClids=");
        sb.append(this.f31268c);
        sb.append(", hasNewCustomHosts=");
        sb.append(this.f31269d);
        sb.append(", newCustomHosts=");
        return AbstractC11153tN0.m24883A(sb, this.f31270e, '}');
    }

    public C5005al(String str, String str2, Map<String, String> map, boolean z, List<String> list) {
        this.f31266a = str;
        this.f31267b = str2;
        this.f31268c = map;
        this.f31269d = z;
        this.f31270e = list;
    }

    public C5005al() {
        this(null, null, null, false, null);
    }
}
