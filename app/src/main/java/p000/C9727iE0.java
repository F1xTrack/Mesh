package p000;

/* renamed from: iE0 */
/* loaded from: classes.dex */
public final class C9727iE0 extends IS0 {

    /* renamed from: a */
    public final IS0 f28971a;

    /* renamed from: b */
    public final C9941jv0 f28972b;

    /* renamed from: c */
    public C11917zN0 f28973c;

    /* renamed from: d */
    public long f28974d = 0;

    public C9727iE0(IS0 is0, C9941jv0 c9941jv0) {
        this.f28971a = is0;
        this.f28972b = c9941jv0;
    }

    @Override // p000.IS0
    /* renamed from: o */
    public final long mo3383o() {
        return this.f28971a.mo3383o();
    }

    @Override // p000.IS0
    /* renamed from: p */
    public final C8540Xp0 mo3384p() {
        return this.f28971a.mo3384p();
    }

    @Override // p000.IS0
    /* renamed from: w */
    public final InterfaceC0676Kj mo3385w() {
        if (this.f28973c == null) {
            this.f28973c = JI1.m4274b(new C1305Uk(this, this.f28971a.mo3385w()));
        }
        return this.f28973c;
    }
}
