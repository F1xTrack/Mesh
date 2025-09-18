package p000;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: bn1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8897bn1 implements InterfaceC7740If0 {

    /* renamed from: b */
    public final C8606Yw0 f17158b;

    /* renamed from: c */
    public final int f17159c;

    public C8897bn1(C8606Yw0 c8606Yw0, int i) {
        this.f17158b = c8606Yw0;
        this.f17159c = i;
    }

    @Override // p000.InterfaceC7740If0
    /* renamed from: a */
    public final void mo967a(MessageDigest messageDigest) {
        messageDigest.update(ByteBuffer.allocate(12).putInt(this.f17159c).array());
        this.f17158b.mo967a(messageDigest);
    }

    @Override // p000.InterfaceC7740If0
    public final boolean equals(Object obj) {
        if (!(obj instanceof C8897bn1)) {
            return false;
        }
        C8897bn1 c8897bn1 = (C8897bn1) obj;
        return this.f17158b.equals(c8897bn1.f17158b) && this.f17159c == c8897bn1.f17159c;
    }

    @Override // p000.InterfaceC7740If0
    public final int hashCode() {
        return (this.f17158b.f14620b.hashCode() * 31) + this.f17159c;
    }
}
