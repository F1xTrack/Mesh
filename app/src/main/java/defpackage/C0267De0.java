package defpackage;

/* renamed from: De0 */
/* loaded from: classes2.dex */
public final class C0267De0 extends AbstractC6881rf0 implements InterfaceC0111Be0 {
    public final C0345Ee0 j;

    public C0267De0(C0345Ee0 c0345Ee0) {
        O90.f(c0345Ee0, "property");
        this.j = c0345Ee0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws C0254Da {
        ((C0267De0) this.j.p.getValue()).call(obj, obj2);
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
