package p000;

import java.security.MessageDigest;

/* renamed from: Jy0 */
/* loaded from: classes.dex */
public final class C7830Jy0 implements InterfaceC7740If0 {

    /* renamed from: b */
    public final C6509nl f5819b = new C6509nl();

    @Override // p000.InterfaceC7740If0
    /* renamed from: a */
    public final void mo967a(MessageDigest messageDigest) {
        int i = 0;
        while (true) {
            C6509nl c6509nl = this.f5819b;
            if (i >= c6509nl.f6450c) {
                return;
            }
            C11864yy0 c11864yy0 = (C11864yy0) c6509nl.m4827i(i);
            Object objM4831m = this.f5819b.m4831m(i);
            InterfaceC11737xy0 interfaceC11737xy0 = c11864yy0.f46559b;
            if (c11864yy0.f46561d == null) {
                c11864yy0.f46561d = c11864yy0.f46560c.getBytes(InterfaceC7740If0.f5069a);
            }
            interfaceC11737xy0.mo4933b(c11864yy0.f46561d, objM4831m, messageDigest);
            i++;
        }
    }

    /* renamed from: c */
    public final Object m4482c(C11864yy0 c11864yy0) {
        C6509nl c6509nl = this.f5819b;
        return c6509nl.containsKey(c11864yy0) ? c6509nl.getOrDefault(c11864yy0, null) : c11864yy0.f46558a;
    }

    @Override // p000.InterfaceC7740If0
    public final boolean equals(Object obj) {
        if (obj instanceof C7830Jy0) {
            return this.f5819b.equals(((C7830Jy0) obj).f5819b);
        }
        return false;
    }

    @Override // p000.InterfaceC7740If0
    public final int hashCode() {
        return this.f5819b.hashCode();
    }

    public final String toString() {
        return "Options{values=" + this.f5819b + '}';
    }
}
