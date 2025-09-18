package defpackage;

/* renamed from: jf0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5354jf0 extends AbstractC6500pf0 implements InterfaceC4196hf0 {
    public final C5736lf0 j;

    public C5354jf0(C5736lf0 c5736lf0) {
        O90.f(c5736lf0, "property");
        this.j = c5736lf0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C5354jf0) this.j.n.getValue()).call(obj, obj2);
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
