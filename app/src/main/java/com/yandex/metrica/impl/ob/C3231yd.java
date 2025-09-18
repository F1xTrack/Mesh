package com.yandex.metrica.impl.ob;

import defpackage.F91;

/* renamed from: com.yandex.metrica.impl.ob.yd, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3231yd {
    public final boolean a;
    public final boolean b;

    public C3231yd(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3231yd.class != obj.getClass()) {
            return false;
        }
        C3231yd c3231yd = (C3231yd) obj;
        return this.a == c3231yd.a && this.b == c3231yd.b;
    }

    public int hashCode() {
        return ((this.a ? 1 : 0) * 31) + (this.b ? 1 : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ProviderAccessFlags{lastKnownEnabled=");
        sb.append(this.a);
        sb.append(", scanningEnabled=");
        return F91.w(sb, this.b, '}');
    }
}
