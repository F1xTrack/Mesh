package p000;

/* renamed from: vS */
/* loaded from: classes.dex */
public final class C7013vS extends IS0 {

    /* renamed from: a */
    public final String f44377a;

    /* renamed from: b */
    public final IS0 f44378b;

    /* renamed from: c */
    public final InterfaceC7076wS f44379c;

    /* renamed from: d */
    public C11917zN0 f44380d;

    public C7013vS(String str, IS0 is0, InterfaceC7076wS interfaceC7076wS) {
        this.f44377a = str;
        this.f44378b = is0;
        this.f44379c = interfaceC7076wS;
    }

    @Override // p000.IS0
    /* renamed from: o */
    public final long mo3383o() {
        return this.f44378b.mo3383o();
    }

    @Override // p000.IS0
    /* renamed from: p */
    public final C8540Xp0 mo3384p() {
        return this.f44378b.mo3384p();
    }

    @Override // p000.IS0
    /* renamed from: w */
    public final InterfaceC0676Kj mo3385w() {
        if (this.f44380d == null) {
            this.f44380d = JI1.m4274b(new C6950uS(this, this.f44378b.mo3385w()));
        }
        return this.f44380d;
    }
}
