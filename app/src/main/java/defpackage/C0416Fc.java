package defpackage;

/* renamed from: Fc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0416Fc extends AbstractC6738qv {
    public final C0497Gd a;

    public C0416Fc(C0497Gd c0497Gd) {
        EnumC6547pv enumC6547pv = EnumC6547pv.a;
        this.a = c0497Gd;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC6738qv)) {
            return false;
        }
        AbstractC6738qv abstractC6738qv = (AbstractC6738qv) obj;
        if (this.a.equals(((C0416Fc) abstractC6738qv).a)) {
            Object obj2 = EnumC6547pv.a;
            ((C0416Fc) abstractC6738qv).getClass();
            if (obj2.equals(obj2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ EnumC6547pv.a.hashCode();
    }

    public final String toString() {
        return "ComplianceData{privacyContext=" + this.a + ", productIdOrigin=" + EnumC6547pv.a + "}";
    }
}
