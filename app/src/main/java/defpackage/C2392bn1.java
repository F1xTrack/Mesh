package defpackage;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: bn1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2392bn1 implements InterfaceC0660If0 {
    public final C1958Yw0 b;
    public final int c;

    public C2392bn1(C1958Yw0 c1958Yw0, int i) {
        this.b = c1958Yw0;
        this.c = i;
    }

    @Override // defpackage.InterfaceC0660If0
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(ByteBuffer.allocate(12).putInt(this.c).array());
        this.b.a(messageDigest);
    }

    @Override // defpackage.InterfaceC0660If0
    public final boolean equals(Object obj) {
        if (!(obj instanceof C2392bn1)) {
            return false;
        }
        C2392bn1 c2392bn1 = (C2392bn1) obj;
        return this.b.equals(c2392bn1.b) && this.c == c2392bn1.c;
    }

    @Override // defpackage.InterfaceC0660If0
    public final int hashCode() {
        return (this.b.b.hashCode() * 31) + this.c;
    }
}
