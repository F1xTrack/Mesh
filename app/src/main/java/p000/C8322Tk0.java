package p000;

/* renamed from: Tk0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8322Tk0 {

    /* renamed from: a */
    public final C0664KX f11491a;

    /* renamed from: b */
    public final AbstractC8418Vg0 f11492b;

    /* JADX WARN: Multi-variable type inference failed */
    public C8322Tk0(C0664KX c0664kx, InterfaceC6434mZ interfaceC6434mZ) {
        this.f11491a = c0664kx;
        this.f11492b = (AbstractC8418Vg0) interfaceC6434mZ;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C8322Tk0.class == obj.getClass() && this.f11491a.equals(((C8322Tk0) obj).f11491a);
    }

    public final int hashCode() {
        return this.f11491a.hashCode();
    }
}
