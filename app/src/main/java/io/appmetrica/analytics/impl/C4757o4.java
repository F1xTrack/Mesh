package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.o4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4757o4 {
    public final String a;
    public final Integer b;
    public final String c;

    public C4757o4(String str, Integer num, String str2) {
        this.a = str;
        this.b = num;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4757o4.class != obj.getClass()) {
            return false;
        }
        C4757o4 c4757o4 = (C4757o4) obj;
        if (!this.a.equals(c4757o4.a)) {
            return false;
        }
        Integer num = this.b;
        if (num == null ? c4757o4.b != null : !num.equals(c4757o4.b)) {
            return false;
        }
        String str = this.c;
        String str2 = c4757o4.c;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num != null ? num.hashCode() : 0)) * 31;
        String str = this.c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }
}
