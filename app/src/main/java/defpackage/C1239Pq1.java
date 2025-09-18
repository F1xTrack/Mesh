package defpackage;

/* renamed from: Pq1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1239Pq1 {
    public final InterfaceC0772Jq1 a;
    public final InterfaceC1863Xq1 b;
    public final C5782lu1 c;

    public C1239Pq1(InterfaceC0772Jq1 interfaceC0772Jq1, InterfaceC1863Xq1 interfaceC1863Xq1, C5782lu1 c5782lu1) {
        this.a = interfaceC0772Jq1;
        this.b = interfaceC1863Xq1;
        this.c = c5782lu1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1239Pq1)) {
            return false;
        }
        C1239Pq1 c1239Pq1 = (C1239Pq1) obj;
        return O90.a(this.a, c1239Pq1.a) && O90.a(this.b, c1239Pq1.b) && O90.a(this.c, c1239Pq1.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        C5782lu1 c5782lu1 = this.c;
        return iHashCode + (c5782lu1 == null ? 0 : c5782lu1.hashCode());
    }

    public final String toString() {
        return "IPCClientsDto(authIPCClient=" + this.a + ", pushIPCClient=" + this.b + ", testPushIPCClient=" + this.c + ')';
    }
}
