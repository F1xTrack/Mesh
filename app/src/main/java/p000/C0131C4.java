package p000;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: C4 */
/* loaded from: classes.dex */
public final class C0131C4 implements InterfaceC7740If0 {

    /* renamed from: b */
    public final int f1167b;

    /* renamed from: c */
    public final InterfaceC7740If0 f1168c;

    public C0131C4(int i, InterfaceC7740If0 interfaceC7740If0) {
        this.f1167b = i;
        this.f1168c = interfaceC7740If0;
    }

    @Override // p000.InterfaceC7740If0
    /* renamed from: a */
    public final void mo967a(MessageDigest messageDigest) {
        this.f1168c.mo967a(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f1167b).array());
    }

    @Override // p000.InterfaceC7740If0
    public final boolean equals(Object obj) {
        if (!(obj instanceof C0131C4)) {
            return false;
        }
        C0131C4 c0131c4 = (C0131C4) obj;
        return this.f1167b == c0131c4.f1167b && this.f1168c.equals(c0131c4.f1168c);
    }

    @Override // p000.InterfaceC7740If0
    public final int hashCode() {
        return AbstractC7381Bh1.m809h(this.f1167b, this.f1168c);
    }
}
