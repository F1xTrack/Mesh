package com.yandex.metrica.impl.ob;

import defpackage.AbstractC7209tN0;

/* loaded from: classes2.dex */
public class Dc {
    public final long a;
    public final long b;

    public Dc(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Dc.class != obj.getClass()) {
            return false;
        }
        Dc dc = (Dc) obj;
        return this.a == dc.a && this.b == dc.b;
    }

    public int hashCode() {
        long j = this.a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.b;
        return i + ((int) ((j2 >>> 32) ^ j2));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ForcedCollectingArguments{durationSeconds=");
        sb.append(this.a);
        sb.append(", intervalSeconds=");
        return AbstractC7209tN0.y(sb, this.b, '}');
    }
}
