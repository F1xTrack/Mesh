package defpackage;

import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class CC implements InterfaceC0660If0 {
    public final InterfaceC0660If0 b;
    public final InterfaceC0660If0 c;

    public CC(InterfaceC0660If0 interfaceC0660If0, InterfaceC0660If0 interfaceC0660If02) {
        this.b = interfaceC0660If0;
        this.c = interfaceC0660If02;
    }

    @Override // defpackage.InterfaceC0660If0
    public final void a(MessageDigest messageDigest) {
        this.b.a(messageDigest);
        this.c.a(messageDigest);
    }

    @Override // defpackage.InterfaceC0660If0
    public final boolean equals(Object obj) {
        if (!(obj instanceof CC)) {
            return false;
        }
        CC cc = (CC) obj;
        return this.b.equals(cc.b) && this.c.equals(cc.c);
    }

    @Override // defpackage.InterfaceC0660If0
    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "DataCacheKey{sourceKey=" + this.b + ", signature=" + this.c + '}';
    }
}
