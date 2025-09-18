package com.yandex.metrica.impl.p022ob;

import java.util.List;
import p000.AbstractC11153tN0;

/* renamed from: com.yandex.metrica.impl.ob.Ed */
/* loaded from: classes2.dex */
public class C2580Ed {

    /* renamed from: a */
    public final long f21113a;

    /* renamed from: b */
    public final boolean f21114b;

    /* renamed from: c */
    public final List<C2804Nc> f21115c;

    public C2580Ed(long j, boolean z, List<C2804Nc> list) {
        this.f21113a = j;
        this.f21114b = z;
        this.f21115c = list;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WakeupConfig{collectionDuration=");
        sb.append(this.f21113a);
        sb.append(", aggressiveRelaunch=");
        sb.append(this.f21114b);
        sb.append(", collectionIntervalRanges=");
        return AbstractC11153tN0.m24883A(sb, this.f21115c, '}');
    }
}
