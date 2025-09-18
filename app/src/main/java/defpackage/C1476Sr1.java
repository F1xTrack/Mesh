package defpackage;

/* renamed from: Sr1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1476Sr1 {
    public final InterfaceC0772Jq1 a;
    public final InterfaceC1863Xq1 b;

    public C1476Sr1(InterfaceC0772Jq1 interfaceC0772Jq1, InterfaceC1863Xq1 interfaceC1863Xq1) {
        this.a = interfaceC0772Jq1;
        this.b = interfaceC1863Xq1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1476Sr1)) {
            return false;
        }
        C1476Sr1 c1476Sr1 = (C1476Sr1) obj;
        return O90.a(this.a, c1476Sr1.a) && O90.a(this.b, c1476Sr1.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SubscribeIPCClientsDto(authIPCClient=" + this.a + ", pushIPCClient=" + this.b + ')';
    }
}
