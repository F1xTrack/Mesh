package defpackage;

/* renamed from: ze0 */
/* loaded from: classes2.dex */
public final class C8402ze0 extends AbstractC6881rf0 implements InterfaceC6099nZ {
    public final C0033Ae0 j;

    public C8402ze0(C0033Ae0 c0033Ae0) {
        O90.f(c0033Ae0, "property");
        this.j = c0033Ae0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // defpackage.InterfaceC6099nZ
    public final Object invoke(Object obj) throws C0254Da {
        ((C8402ze0) this.j.p.getValue()).call(obj);
        return C1518Tf1.a;
    }

    @Override // defpackage.InterfaceC1670Ve0
    public final InterfaceC5927mf0 k() {
        return this.j;
    }

    @Override // defpackage.AbstractC6118nf0
    public final AbstractC7263tf0 u() {
        return this.j;
    }
}
