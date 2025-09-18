package defpackage;

/* renamed from: Tk0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1532Tk0 {
    public final KX a;
    public final AbstractC1676Vg0 b;

    /* JADX WARN: Multi-variable type inference failed */
    public C1532Tk0(KX kx, InterfaceC5908mZ interfaceC5908mZ) {
        this.a = kx;
        this.b = (AbstractC1676Vg0) interfaceC5908mZ;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C1532Tk0.class == obj.getClass() && this.a.equals(((C1532Tk0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
