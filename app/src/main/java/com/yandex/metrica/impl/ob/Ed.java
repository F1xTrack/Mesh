package com.yandex.metrica.impl.ob;

import defpackage.AbstractC7209tN0;
import java.util.List;

/* loaded from: classes2.dex */
public class Ed {
    public final long a;
    public final boolean b;
    public final List<Nc> c;

    public Ed(long j, boolean z, List<Nc> list) {
        this.a = j;
        this.b = z;
        this.c = list;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WakeupConfig{collectionDuration=");
        sb.append(this.a);
        sb.append(", aggressiveRelaunch=");
        sb.append(this.b);
        sb.append(", collectionIntervalRanges=");
        return AbstractC7209tN0.A(sb, this.c, '}');
    }
}
