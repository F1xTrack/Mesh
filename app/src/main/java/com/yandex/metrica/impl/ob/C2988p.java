package com.yandex.metrica.impl.ob;

import defpackage.AbstractC1705Vq;

/* renamed from: com.yandex.metrica.impl.ob.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2988p {
    public final int a;
    public final int b;

    public C2988p(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2988p.class != obj.getClass()) {
            return false;
        }
        C2988p c2988p = (C2988p) obj;
        return this.a == c2988p.a && this.b == c2988p.b;
    }

    public int hashCode() {
        return (this.a * 31) + this.b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BillingConfig{sendFrequencySeconds=");
        sb.append(this.a);
        sb.append(", firstCollectingInappMaxAgeSeconds=");
        return AbstractC1705Vq.j(sb, this.b, "}");
    }
}
