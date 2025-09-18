package com.yandex.metrica.impl.p022ob;

/* renamed from: com.yandex.metrica.impl.ob.H */
/* loaded from: classes2.dex */
public class C2641H {

    /* renamed from: a */
    public final a f21326a;

    /* renamed from: b */
    public final Boolean f21327b;

    /* renamed from: com.yandex.metrica.impl.ob.H$a */
    public enum a {
        ACTIVE,
        WORKING_SET,
        FREQUENT,
        RARE,
        RESTRICTED
    }

    public C2641H(a aVar, Boolean bool) {
        this.f21326a = aVar;
        this.f21327b = bool;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2641H.class != obj.getClass()) {
            return false;
        }
        C2641H c2641h = (C2641H) obj;
        if (this.f21326a != c2641h.f21326a) {
            return false;
        }
        Boolean bool = this.f21327b;
        return bool != null ? bool.equals(c2641h.f21327b) : c2641h.f21327b == null;
    }

    public int hashCode() {
        a aVar = this.f21326a;
        int iHashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        Boolean bool = this.f21327b;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }
}
