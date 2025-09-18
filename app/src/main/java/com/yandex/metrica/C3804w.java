package com.yandex.metrica;

import java.util.HashMap;

/* renamed from: com.yandex.metrica.w */
/* loaded from: classes2.dex */
public final class C3804w {

    /* renamed from: a */
    public String f25529a;

    /* renamed from: b */
    public String f25530b;

    /* renamed from: c */
    public HashMap f25531c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3804w.class != obj.getClass()) {
            return false;
        }
        C3804w c3804w = (C3804w) obj;
        String str = this.f25529a;
        if (str == null ? c3804w.f25529a != null : !str.equals(c3804w.f25529a)) {
            return false;
        }
        String str2 = this.f25530b;
        if (str2 == null ? c3804w.f25530b != null : !str2.equals(c3804w.f25530b)) {
            return false;
        }
        HashMap map = this.f25531c;
        HashMap map2 = c3804w.f25531c;
        return map != null ? map.equals(map2) : map2 == null;
    }

    public final int hashCode() {
        String str = this.f25529a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f25530b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        HashMap map = this.f25531c;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }
}
