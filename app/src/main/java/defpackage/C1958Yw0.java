package defpackage;

import java.security.MessageDigest;

/* renamed from: Yw0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1958Yw0 implements InterfaceC0660If0 {
    public final Object b;

    public C1958Yw0(Object obj) {
        IL1.d(obj, "Argument must not be null");
        this.b = obj;
    }

    @Override // defpackage.InterfaceC0660If0
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(this.b.toString().getBytes(InterfaceC0660If0.a));
    }

    @Override // defpackage.InterfaceC0660If0
    public final boolean equals(Object obj) {
        if (obj instanceof C1958Yw0) {
            return this.b.equals(((C1958Yw0) obj).b);
        }
        return false;
    }

    @Override // defpackage.InterfaceC0660If0
    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "ObjectKey{object=" + this.b + '}';
    }
}
