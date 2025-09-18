package defpackage;

/* renamed from: Fe0 */
/* loaded from: classes2.dex */
public final class C0423Fe0 extends AbstractC6881rf0 implements InterfaceC6481pZ {
    public final C0501Ge0 j;

    public C0423Fe0(C0501Ge0 c0501Ge0) {
        O90.f(c0501Ge0, "property");
        this.j = c0501Ge0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // defpackage.InterfaceC6481pZ
    public final Object b(Object obj, Object obj2, Object obj3) throws C0254Da {
        ((C0423Fe0) this.j.p.getValue()).call(obj, obj2, obj3);
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
