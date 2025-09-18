package p000;

/* renamed from: Pq1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8127Pq1 {

    /* renamed from: a */
    public final InterfaceC7815Jq1 f9297a;

    /* renamed from: b */
    public final InterfaceC8543Xq1 f9298b;

    /* renamed from: c */
    public final C10196lu1 f9299c;

    public C8127Pq1(InterfaceC7815Jq1 interfaceC7815Jq1, InterfaceC8543Xq1 interfaceC8543Xq1, C10196lu1 c10196lu1) {
        this.f9297a = interfaceC7815Jq1;
        this.f9298b = interfaceC8543Xq1;
        this.f9299c = c10196lu1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8127Pq1)) {
            return false;
        }
        C8127Pq1 c8127Pq1 = (C8127Pq1) obj;
        return O90.m5963a(this.f9297a, c8127Pq1.f9297a) && O90.m5963a(this.f9298b, c8127Pq1.f9298b) && O90.m5963a(this.f9299c, c8127Pq1.f9299c);
    }

    public final int hashCode() {
        int iHashCode = (this.f9298b.hashCode() + (this.f9297a.hashCode() * 31)) * 31;
        C10196lu1 c10196lu1 = this.f9299c;
        return iHashCode + (c10196lu1 == null ? 0 : c10196lu1.hashCode());
    }

    public final String toString() {
        return "IPCClientsDto(authIPCClient=" + this.f9297a + ", pushIPCClient=" + this.f9298b + ", testPushIPCClient=" + this.f9299c + ')';
    }
}
