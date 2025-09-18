package com.yandex.metrica.impl.ob;

import defpackage.EnumC1323Qs1;
import defpackage.O90;

/* renamed from: com.yandex.metrica.impl.ob.hc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2802hc {
    private final String a;
    private final EnumC1323Qs1 b;

    public C2802hc(String str, EnumC1323Qs1 enumC1323Qs1) {
        this.a = str;
        this.b = enumC1323Qs1;
    }

    public final String a() {
        return this.a;
    }

    public final EnumC1323Qs1 b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2802hc)) {
            return false;
        }
        C2802hc c2802hc = (C2802hc) obj;
        return O90.a(this.a, c2802hc.a) && O90.a(this.b, c2802hc.b);
    }

    public int hashCode() {
        String str = this.a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        EnumC1323Qs1 enumC1323Qs1 = this.b;
        return iHashCode + (enumC1323Qs1 != null ? enumC1323Qs1.hashCode() : 0);
    }

    public String toString() {
        return "AppSetId(id=" + this.a + ", scope=" + this.b + ")";
    }
}
