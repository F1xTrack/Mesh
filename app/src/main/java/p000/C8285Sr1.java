package p000;

/* renamed from: Sr1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8285Sr1 {

    /* renamed from: a */
    public final InterfaceC7815Jq1 f11013a;

    /* renamed from: b */
    public final InterfaceC8543Xq1 f11014b;

    public C8285Sr1(InterfaceC7815Jq1 interfaceC7815Jq1, InterfaceC8543Xq1 interfaceC8543Xq1) {
        this.f11013a = interfaceC7815Jq1;
        this.f11014b = interfaceC8543Xq1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8285Sr1)) {
            return false;
        }
        C8285Sr1 c8285Sr1 = (C8285Sr1) obj;
        return O90.m5963a(this.f11013a, c8285Sr1.f11013a) && O90.m5963a(this.f11014b, c8285Sr1.f11014b);
    }

    public final int hashCode() {
        return this.f11014b.hashCode() + (this.f11013a.hashCode() * 31);
    }

    public final String toString() {
        return "SubscribeIPCClientsDto(authIPCClient=" + this.f11013a + ", pushIPCClient=" + this.f11014b + ')';
    }
}
