package defpackage;

/* renamed from: nf0 */
/* loaded from: classes2.dex */
public abstract class AbstractC6118nf0 extends AbstractC1589Ud0 implements InterfaceC6878re0, InterfaceC1670Ve0 {
    @Override // defpackage.InterfaceC6878re0
    public final boolean isExternal() {
        return ((AE0) t()).g;
    }

    @Override // defpackage.InterfaceC6878re0
    public final boolean isInfix() {
        t();
        return false;
    }

    @Override // defpackage.InterfaceC6878re0
    public final boolean isInline() {
        return ((AE0) t()).j;
    }

    @Override // defpackage.InterfaceC6878re0
    public final boolean isOperator() {
        t();
        return false;
    }

    @Override // defpackage.InterfaceC1277Qd0, defpackage.InterfaceC6878re0
    public final boolean isSuspend() {
        t();
        return false;
    }

    @Override // defpackage.AbstractC1589Ud0
    public final AbstractC6497pe0 n() {
        return u().g;
    }

    @Override // defpackage.AbstractC1589Ud0
    public final InterfaceC0755Jl o() {
        return null;
    }

    @Override // defpackage.AbstractC1589Ud0
    public final boolean s() {
        return u().s();
    }

    public abstract InterfaceC8324zE0 t();

    public abstract AbstractC7263tf0 u();
}
