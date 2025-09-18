package com.yandex.metrica.impl.ob;

import defpackage.AbstractC7209tN0;

/* loaded from: classes2.dex */
public class Nc {
    public final long a;
    public final long b;

    public Nc(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("IntervalRange{minInterval=");
        sb.append(this.a);
        sb.append(", maxInterval=");
        return AbstractC7209tN0.y(sb, this.b, '}');
    }
}
