package com.yandex.metrica.impl.p022ob;

import p000.F91;

/* renamed from: com.yandex.metrica.impl.ob.ie */
/* loaded from: classes2.dex */
public class C3338ie {

    /* renamed from: a */
    public final String f23647a;

    /* renamed from: b */
    public final boolean f23648b;

    public C3338ie(String str, boolean z) {
        this.f23647a = str;
        this.f23648b = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3338ie.class != obj.getClass()) {
            return false;
        }
        C3338ie c3338ie = (C3338ie) obj;
        if (this.f23648b != c3338ie.f23648b) {
            return false;
        }
        return this.f23647a.equals(c3338ie.f23647a);
    }

    public int hashCode() {
        return (this.f23647a.hashCode() * 31) + (this.f23648b ? 1 : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PermissionState{name='");
        sb.append(this.f23647a);
        sb.append("', granted=");
        return F91.m2540w(sb, this.f23648b, '}');
    }
}
