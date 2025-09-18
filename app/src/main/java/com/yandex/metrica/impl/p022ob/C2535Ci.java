package com.yandex.metrica.impl.p022ob;

import p000.AbstractC7222ym;

/* renamed from: com.yandex.metrica.impl.ob.Ci */
/* loaded from: classes2.dex */
public class C2535Ci {

    /* renamed from: a */
    public final int f20984a;

    /* renamed from: b */
    public final int f20985b;

    public C2535Ci(int i, int i2) {
        this.f20984a = i;
        this.f20985b = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2535Ci.class != obj.getClass()) {
            return false;
        }
        C2535Ci c2535Ci = (C2535Ci) obj;
        return this.f20984a == c2535Ci.f20984a && this.f20985b == c2535Ci.f20985b;
    }

    public int hashCode() {
        return (this.f20984a * 31) + this.f20985b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("RetryPolicyConfig{maxIntervalSeconds=");
        sb.append(this.f20984a);
        sb.append(", exponentialMultiplier=");
        return AbstractC7222ym.m26235l(sb, this.f20985b, '}');
    }
}
