package p000;

/* renamed from: hE0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9599hE0 extends AbstractC11161tR0 {

    /* renamed from: a */
    public final AbstractC11161tR0 f28326a;

    /* renamed from: b */
    public final C0303Eo f28327b;

    /* renamed from: c */
    public long f28328c = 0;

    public C9599hE0(AbstractC11161tR0 abstractC11161tR0, C0303Eo c0303Eo) {
        this.f28326a = abstractC11161tR0;
        this.f28327b = c0303Eo;
    }

    @Override // p000.AbstractC11161tR0
    /* renamed from: a */
    public final long mo9186a() {
        if (this.f28328c == 0) {
            this.f28328c = this.f28326a.mo9186a();
        }
        return this.f28328c;
    }

    @Override // p000.AbstractC11161tR0
    /* renamed from: b */
    public final C8540Xp0 mo9187b() {
        return this.f28326a.mo9187b();
    }

    @Override // p000.AbstractC11161tR0
    /* renamed from: d */
    public final void mo9188d(InterfaceC0613Jj interfaceC0613Jj) {
        C11790yN0 c11790yN0M4273a = JI1.m4273a(JI1.m4276d(new C9471gE0(this, interfaceC0613Jj.mo4395g0())));
        mo9186a();
        this.f28326a.mo9188d(c11790yN0M4273a);
        c11790yN0M4273a.flush();
    }
}
