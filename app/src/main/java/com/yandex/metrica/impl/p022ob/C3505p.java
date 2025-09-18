package com.yandex.metrica.impl.p022ob;

import p000.AbstractC1374Vq;

/* renamed from: com.yandex.metrica.impl.ob.p */
/* loaded from: classes2.dex */
public class C3505p {

    /* renamed from: a */
    public final int f24397a;

    /* renamed from: b */
    public final int f24398b;

    public C3505p(int i, int i2) {
        this.f24397a = i;
        this.f24398b = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3505p.class != obj.getClass()) {
            return false;
        }
        C3505p c3505p = (C3505p) obj;
        return this.f24397a == c3505p.f24397a && this.f24398b == c3505p.f24398b;
    }

    public int hashCode() {
        return (this.f24397a * 31) + this.f24398b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BillingConfig{sendFrequencySeconds=");
        sb.append(this.f24397a);
        sb.append(", firstCollectingInappMaxAgeSeconds=");
        return AbstractC1374Vq.m8591j(sb, this.f24398b, "}");
    }
}
