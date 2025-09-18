package defpackage;

/* renamed from: hE0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4115hE0 extends AbstractC7221tR0 {
    public final AbstractC7221tR0 a;
    public final C0374Eo b;
    public long c = 0;

    public C4115hE0(AbstractC7221tR0 abstractC7221tR0, C0374Eo c0374Eo) {
        this.a = abstractC7221tR0;
        this.b = c0374Eo;
    }

    @Override // defpackage.AbstractC7221tR0
    public final long a() {
        if (this.c == 0) {
            this.c = this.a.a();
        }
        return this.c;
    }

    @Override // defpackage.AbstractC7221tR0
    public final C1859Xp0 b() {
        return this.a.b();
    }

    @Override // defpackage.AbstractC7221tR0
    public final void d(InterfaceC0749Jj interfaceC0749Jj) {
        C8161yN0 c8161yN0A = JI1.a(JI1.d(new C3924gE0(this, interfaceC0749Jj.g0())));
        a();
        this.a.d(c8161yN0A);
        c8161yN0A.flush();
    }
}
