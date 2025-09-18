package p000;

/* renamed from: Ug0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8366Ug0 {

    /* renamed from: a */
    public final String f11973a;

    /* renamed from: b */
    public final String f11974b;

    static {
        AbstractC7485Dh1.m1797L(0);
        AbstractC7485Dh1.m1797L(1);
    }

    public C8366Ug0(String str, String str2) {
        this.f11973a = AbstractC7485Dh1.m1803R(str);
        this.f11974b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C8366Ug0.class != obj.getClass()) {
            return false;
        }
        C8366Ug0 c8366Ug0 = (C8366Ug0) obj;
        return AbstractC7485Dh1.m1812a(this.f11973a, c8366Ug0.f11973a) && AbstractC7485Dh1.m1812a(this.f11974b, c8366Ug0.f11974b);
    }

    public final int hashCode() {
        int iHashCode = this.f11974b.hashCode() * 31;
        String str = this.f11973a;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
