package defpackage;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class C4 implements InterfaceC0660If0 {
    public final int b;
    public final InterfaceC0660If0 c;

    public C4(int i, InterfaceC0660If0 interfaceC0660If0) {
        this.b = i;
        this.c = interfaceC0660If0;
    }

    @Override // defpackage.InterfaceC0660If0
    public final void a(MessageDigest messageDigest) {
        this.c.a(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.b).array());
    }

    @Override // defpackage.InterfaceC0660If0
    public final boolean equals(Object obj) {
        if (!(obj instanceof C4)) {
            return false;
        }
        C4 c4 = (C4) obj;
        return this.b == c4.b && this.c.equals(c4.c);
    }

    @Override // defpackage.InterfaceC0660If0
    public final int hashCode() {
        return AbstractC0121Bh1.h(this.b, this.c);
    }
}
