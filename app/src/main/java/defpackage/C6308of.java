package defpackage;

/* renamed from: of */
/* loaded from: classes2.dex */
public final class C6308of implements InterfaceC0143Bp {
    public final C6117nf[] a;

    public C6308of(C6117nf[] c6117nfArr) {
        this.a = c6117nfArr;
    }

    @Override // defpackage.InterfaceC0143Bp
    public final void a(Throwable th) {
        b();
    }

    public final void b() {
        for (C6117nf c6117nf : this.a) {
            MK mk = c6117nf.f;
            if (mk == null) {
                O90.o("handle");
                throw null;
            }
            mk.a();
        }
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.a + ']';
    }
}
