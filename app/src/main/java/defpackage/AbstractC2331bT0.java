package defpackage;

/* renamed from: bT0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2331bT0 implements InterfaceC8440zr {
    public final AbstractC1676Vg0 a;
    public final String b;

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC2331bT0(String str, InterfaceC6099nZ interfaceC6099nZ) {
        this.a = (AbstractC1676Vg0) interfaceC6099nZ;
        this.b = "must return ".concat(str);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Vg0, nZ] */
    @Override // defpackage.InterfaceC8440zr
    public final boolean a(C3611eb0 c3611eb0) {
        return O90.a(c3611eb0.h, this.a.invoke(AbstractC7384uI.e(c3611eb0)));
    }

    @Override // defpackage.InterfaceC8440zr
    public final String b(C3611eb0 c3611eb0) {
        return KS1.a(this, c3611eb0);
    }

    @Override // defpackage.InterfaceC8440zr
    public final String getDescription() {
        return this.b;
    }
}
