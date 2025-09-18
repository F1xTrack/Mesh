package p000;

/* renamed from: ip0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C9801ip0 {

    /* renamed from: a */
    public final long f34755a;

    static {
        new C9801ip0(new C1164SV());
        AbstractC7485Dh1.m1797L(0);
        AbstractC7485Dh1.m1797L(1);
        AbstractC7485Dh1.m1797L(2);
        AbstractC7485Dh1.m1797L(3);
        AbstractC7485Dh1.m1797L(4);
        AbstractC7485Dh1.m1797L(5);
        AbstractC7485Dh1.m1797L(6);
    }

    public C9801ip0(C1164SV c1164sv) {
        c1164sv.getClass();
        int i = AbstractC7485Dh1.f2166a;
        this.f34755a = c1164sv.f10814a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9801ip0)) {
            return false;
        }
        C9801ip0 c9801ip0 = (C9801ip0) obj;
        c9801ip0.getClass();
        return this.f34755a == c9801ip0.f34755a;
    }

    public final int hashCode() {
        long j = this.f34755a;
        return ((((int) 0) * 31) + ((int) (j ^ (j >>> 32)))) * 29791;
    }
}
