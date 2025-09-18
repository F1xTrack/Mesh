package p000;

/* renamed from: Ec */
/* loaded from: classes.dex */
public final class C0291Ec extends AbstractC3893ct {

    /* renamed from: a */
    public final C6628pc f2800a;

    public C0291Ec(C6628pc c6628pc) {
        this.f2800a = c6628pc;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC3893ct)) {
            return false;
        }
        AbstractC3893ct abstractC3893ct = (AbstractC3893ct) obj;
        Object obj2 = EnumC1813bt.f17205a;
        ((C0291Ec) abstractC3893ct).getClass();
        return obj2.equals(obj2) && this.f2800a.equals(((C0291Ec) abstractC3893ct).f2800a);
    }

    public final int hashCode() {
        return ((EnumC1813bt.f17205a.hashCode() ^ 1000003) * 1000003) ^ this.f2800a.hashCode();
    }

    public final String toString() {
        return "ClientInfo{clientType=" + EnumC1813bt.f17205a + ", androidClientInfo=" + this.f2800a + "}";
    }
}
