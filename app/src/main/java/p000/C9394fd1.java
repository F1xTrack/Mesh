package p000;

import java.io.Serializable;

/* renamed from: fd1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9394fd1 implements Serializable {

    /* renamed from: a */
    public final Object f27302a;

    /* renamed from: b */
    public final Object f27303b;

    /* renamed from: c */
    public final Object f27304c;

    public C9394fd1(Object obj, Object obj2, Object obj3) {
        this.f27302a = obj;
        this.f27303b = obj2;
        this.f27304c = obj3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9394fd1)) {
            return false;
        }
        C9394fd1 c9394fd1 = (C9394fd1) obj;
        return O90.m5963a(this.f27302a, c9394fd1.f27302a) && O90.m5963a(this.f27303b, c9394fd1.f27303b) && O90.m5963a(this.f27304c, c9394fd1.f27304c);
    }

    public final int hashCode() {
        Object obj = this.f27302a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f27303b;
        int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.f27304c;
        return iHashCode2 + (obj3 != null ? obj3.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f27302a + ", " + this.f27303b + ", " + this.f27304c + ')';
    }
}
