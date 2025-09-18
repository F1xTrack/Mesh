package p000;

/* renamed from: of */
/* loaded from: classes2.dex */
public final class C6566of implements InterfaceC0115Bp {

    /* renamed from: a */
    public final C6503nf[] f39150a;

    public C6566of(C6503nf[] c6503nfArr) {
        this.f39150a = c6503nfArr;
    }

    @Override // p000.InterfaceC0115Bp
    /* renamed from: a */
    public final void mo324a(Throwable th) {
        m23516b();
    }

    /* renamed from: b */
    public final void m23516b() {
        for (C6503nf c6503nf : this.f39150a) {
            InterfaceC0776MK interfaceC0776MK = c6503nf.f38435f;
            if (interfaceC0776MK == null) {
                O90.m5977o("handle");
                throw null;
            }
            interfaceC0776MK.mo3407a();
        }
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.f39150a + ']';
    }
}
