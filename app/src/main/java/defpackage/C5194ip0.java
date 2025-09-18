package defpackage;

/* renamed from: ip0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5194ip0 {
    public final long a;

    static {
        new C5194ip0(new SV());
        AbstractC0277Dh1.L(0);
        AbstractC0277Dh1.L(1);
        AbstractC0277Dh1.L(2);
        AbstractC0277Dh1.L(3);
        AbstractC0277Dh1.L(4);
        AbstractC0277Dh1.L(5);
        AbstractC0277Dh1.L(6);
    }

    public C5194ip0(SV sv) {
        sv.getClass();
        int i = AbstractC0277Dh1.a;
        this.a = sv.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5194ip0)) {
            return false;
        }
        C5194ip0 c5194ip0 = (C5194ip0) obj;
        c5194ip0.getClass();
        return this.a == c5194ip0.a;
    }

    public final int hashCode() {
        long j = this.a;
        return ((((int) 0) * 31) + ((int) (j ^ (j >>> 32)))) * 29791;
    }
}
