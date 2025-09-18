package defpackage;

/* renamed from: Ec, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0338Ec extends AbstractC3283ct {
    public final C6490pc a;

    public C0338Ec(C6490pc c6490pc) {
        this.a = c6490pc;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC3283ct)) {
            return false;
        }
        AbstractC3283ct abstractC3283ct = (AbstractC3283ct) obj;
        Object obj2 = EnumC2408bt.a;
        ((C0338Ec) abstractC3283ct).getClass();
        return obj2.equals(obj2) && this.a.equals(((C0338Ec) abstractC3283ct).a);
    }

    public final int hashCode() {
        return ((EnumC2408bt.a.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode();
    }

    public final String toString() {
        return "ClientInfo{clientType=" + EnumC2408bt.a + ", androidClientInfo=" + this.a + "}";
    }
}
