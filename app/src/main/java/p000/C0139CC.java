package p000;

import java.security.MessageDigest;

/* renamed from: CC */
/* loaded from: classes.dex */
public final class C0139CC implements InterfaceC7740If0 {

    /* renamed from: b */
    public final InterfaceC7740If0 f1243b;

    /* renamed from: c */
    public final InterfaceC7740If0 f1244c;

    public C0139CC(InterfaceC7740If0 interfaceC7740If0, InterfaceC7740If0 interfaceC7740If02) {
        this.f1243b = interfaceC7740If0;
        this.f1244c = interfaceC7740If02;
    }

    @Override // p000.InterfaceC7740If0
    /* renamed from: a */
    public final void mo967a(MessageDigest messageDigest) {
        this.f1243b.mo967a(messageDigest);
        this.f1244c.mo967a(messageDigest);
    }

    @Override // p000.InterfaceC7740If0
    public final boolean equals(Object obj) {
        if (!(obj instanceof C0139CC)) {
            return false;
        }
        C0139CC c0139cc = (C0139CC) obj;
        return this.f1243b.equals(c0139cc.f1243b) && this.f1244c.equals(c0139cc.f1244c);
    }

    @Override // p000.InterfaceC7740If0
    public final int hashCode() {
        return this.f1244c.hashCode() + (this.f1243b.hashCode() * 31);
    }

    public final String toString() {
        return "DataCacheKey{sourceKey=" + this.f1243b + ", signature=" + this.f1244c + '}';
    }
}
