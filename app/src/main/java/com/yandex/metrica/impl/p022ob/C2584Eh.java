package com.yandex.metrica.impl.p022ob;

import java.util.Collections;
import java.util.List;
import p000.F91;

/* renamed from: com.yandex.metrica.impl.ob.Eh */
/* loaded from: classes2.dex */
public class C2584Eh {

    /* renamed from: a */
    public final List<C2659Hh> f21117a;

    /* renamed from: b */
    public final String f21118b;

    /* renamed from: c */
    public final long f21119c;

    /* renamed from: d */
    public final boolean f21120d;

    /* renamed from: e */
    public final boolean f21121e;

    public C2584Eh(List<C2659Hh> list, String str, long j, boolean z, boolean z2) {
        this.f21117a = Collections.unmodifiableList(list);
        this.f21118b = str;
        this.f21119c = j;
        this.f21120d = z;
        this.f21121e = z2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SdkFingerprintingState{sdkItemList=");
        sb.append(this.f21117a);
        sb.append(", etag='");
        sb.append(this.f21118b);
        sb.append("', lastAttemptTime=");
        sb.append(this.f21119c);
        sb.append(", hasFirstCollectionOccurred=");
        sb.append(this.f21120d);
        sb.append(", shouldRetry=");
        return F91.m2540w(sb, this.f21121e, '}');
    }
}
