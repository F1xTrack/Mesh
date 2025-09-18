package p000;

import java.security.MessageDigest;

/* renamed from: Yw0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8606Yw0 implements InterfaceC7740If0 {

    /* renamed from: b */
    public final Object f14620b;

    public C8606Yw0(Object obj) {
        IL1.m3830d(obj, "Argument must not be null");
        this.f14620b = obj;
    }

    @Override // p000.InterfaceC7740If0
    /* renamed from: a */
    public final void mo967a(MessageDigest messageDigest) {
        messageDigest.update(this.f14620b.toString().getBytes(InterfaceC7740If0.f5069a));
    }

    @Override // p000.InterfaceC7740If0
    public final boolean equals(Object obj) {
        if (obj instanceof C8606Yw0) {
            return this.f14620b.equals(((C8606Yw0) obj).f14620b);
        }
        return false;
    }

    @Override // p000.InterfaceC7740If0
    public final int hashCode() {
        return this.f14620b.hashCode();
    }

    public final String toString() {
        return "ObjectKey{object=" + this.f14620b + '}';
    }
}
