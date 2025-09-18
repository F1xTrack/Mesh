package p000;

/* renamed from: Fc */
/* loaded from: classes.dex */
public final class C0354Fc extends AbstractC6710qv {

    /* renamed from: a */
    public final C0418Gd f3325a;

    public C0354Fc(C0418Gd c0418Gd) {
        EnumC6647pv enumC6647pv = EnumC6647pv.f40432a;
        this.f3325a = c0418Gd;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC6710qv)) {
            return false;
        }
        AbstractC6710qv abstractC6710qv = (AbstractC6710qv) obj;
        if (this.f3325a.equals(((C0354Fc) abstractC6710qv).f3325a)) {
            Object obj2 = EnumC6647pv.f40432a;
            ((C0354Fc) abstractC6710qv).getClass();
            if (obj2.equals(obj2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f3325a.hashCode() ^ 1000003) * 1000003) ^ EnumC6647pv.f40432a.hashCode();
    }

    public final String toString() {
        return "ComplianceData{privacyContext=" + this.f3325a + ", productIdOrigin=" + EnumC6647pv.f40432a + "}";
    }
}
