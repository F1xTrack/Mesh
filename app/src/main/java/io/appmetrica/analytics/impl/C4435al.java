package io.appmetrica.analytics.impl;

import defpackage.AbstractC7209tN0;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.al */
/* loaded from: classes2.dex */
public final class C4435al extends BaseRequestConfig.BaseRequestArguments {
    public final String a;
    public final String b;
    public final Map<String, String> c;
    public final boolean d;
    public final List<String> e;

    public C4435al(Y3 y3) {
        this(y3.a().d(), y3.a().e(), y3.a().a(), y3.a().i(), y3.a().b());
    }

    public final boolean a(C4435al c4435al) {
        return false;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    /* renamed from: b */
    public final C4435al mergeFrom(C4435al c4435al) {
        return new C4435al((String) WrapUtils.getOrDefaultNullable(this.a, c4435al.a), (String) WrapUtils.getOrDefaultNullable(this.b, c4435al.b), (Map) WrapUtils.getOrDefaultNullable(this.c, c4435al.c), this.d || c4435al.d, c4435al.d ? c4435al.e : this.e);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    public final boolean compareWithOtherArguments(Object obj) {
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Arguments{distributionReferrer='");
        sb.append(this.a);
        sb.append("', installReferrerSource='");
        sb.append(this.b);
        sb.append("', clientClids=");
        sb.append(this.c);
        sb.append(", hasNewCustomHosts=");
        sb.append(this.d);
        sb.append(", newCustomHosts=");
        return AbstractC7209tN0.A(sb, this.e, '}');
    }

    public C4435al(String str, String str2, Map<String, String> map, boolean z, List<String> list) {
        this.a = str;
        this.b = str2;
        this.c = map;
        this.d = z;
        this.e = list;
    }

    public C4435al() {
        this(null, null, null, false, null);
    }
}
