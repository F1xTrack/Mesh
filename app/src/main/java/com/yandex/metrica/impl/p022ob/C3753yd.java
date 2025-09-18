package com.yandex.metrica.impl.p022ob;

import p000.F91;

/* renamed from: com.yandex.metrica.impl.ob.yd */
/* loaded from: classes2.dex */
public class C3753yd {

    /* renamed from: a */
    public final boolean f25306a;

    /* renamed from: b */
    public final boolean f25307b;

    public C3753yd(boolean z, boolean z2) {
        this.f25306a = z;
        this.f25307b = z2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3753yd.class != obj.getClass()) {
            return false;
        }
        C3753yd c3753yd = (C3753yd) obj;
        return this.f25306a == c3753yd.f25306a && this.f25307b == c3753yd.f25307b;
    }

    public int hashCode() {
        return ((this.f25306a ? 1 : 0) * 31) + (this.f25307b ? 1 : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ProviderAccessFlags{lastKnownEnabled=");
        sb.append(this.f25306a);
        sb.append(", scanningEnabled=");
        return F91.m2540w(sb, this.f25307b, '}');
    }
}
