package defpackage;

import java.security.MessageDigest;

/* renamed from: Jy0 */
/* loaded from: classes.dex */
public final class C0795Jy0 implements InterfaceC0660If0 {
    public final C6135nl b = new C6135nl();

    @Override // defpackage.InterfaceC0660If0
    public final void a(MessageDigest messageDigest) {
        int i = 0;
        while (true) {
            C6135nl c6135nl = this.b;
            if (i >= c6135nl.c) {
                return;
            }
            C8272yy0 c8272yy0 = (C8272yy0) c6135nl.i(i);
            Object objM = this.b.m(i);
            InterfaceC8082xy0 interfaceC8082xy0 = c8272yy0.b;
            if (c8272yy0.d == null) {
                c8272yy0.d = c8272yy0.c.getBytes(InterfaceC0660If0.a);
            }
            interfaceC8082xy0.b(c8272yy0.d, objM, messageDigest);
            i++;
        }
    }

    public final Object c(C8272yy0 c8272yy0) {
        C6135nl c6135nl = this.b;
        return c6135nl.containsKey(c8272yy0) ? c6135nl.getOrDefault(c8272yy0, null) : c8272yy0.a;
    }

    @Override // defpackage.InterfaceC0660If0
    public final boolean equals(Object obj) {
        if (obj instanceof C0795Jy0) {
            return this.b.equals(((C0795Jy0) obj).b);
        }
        return false;
    }

    @Override // defpackage.InterfaceC0660If0
    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "Options{values=" + this.b + '}';
    }
}
