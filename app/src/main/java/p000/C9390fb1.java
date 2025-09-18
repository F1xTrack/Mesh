package p000;

/* renamed from: fb1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9390fb1 extends N02 {

    /* renamed from: a */
    public final /* synthetic */ int f27254a;

    /* renamed from: b */
    public boolean f27255b;

    /* renamed from: c */
    public int f27256c;

    /* renamed from: d */
    public final /* synthetic */ Object f27257d;

    public C9390fb1(C9518gb1 c9518gb1, int i) {
        this.f27254a = 0;
        this.f27257d = c9518gb1;
        this.f27256c = i;
        this.f27255b = false;
    }

    @Override // p000.N02, p000.InterfaceC10946rl1
    /* renamed from: a */
    public void mo5508a() {
        switch (this.f27254a) {
            case 0:
                this.f27255b = true;
                break;
        }
    }

    @Override // p000.N02, p000.InterfaceC10946rl1
    /* renamed from: b */
    public final void mo5509b() {
        switch (this.f27254a) {
            case 0:
                ((C9518gb1) this.f27257d).f27862a.setVisibility(0);
                break;
            default:
                if (!this.f27255b) {
                    this.f27255b = true;
                    N02 n02 = ((C10818ql1) this.f27257d).f41131d;
                    if (n02 != null) {
                        n02.mo5509b();
                        break;
                    }
                }
                break;
        }
    }

    @Override // p000.InterfaceC10946rl1
    /* renamed from: c */
    public final void mo18261c() {
        switch (this.f27254a) {
            case 0:
                if (!this.f27255b) {
                    ((C9518gb1) this.f27257d).f27862a.setVisibility(this.f27256c);
                    break;
                }
                break;
            default:
                int i = this.f27256c + 1;
                this.f27256c = i;
                C10818ql1 c10818ql1 = (C10818ql1) this.f27257d;
                if (i == c10818ql1.f41128a.size()) {
                    N02 n02 = c10818ql1.f41131d;
                    if (n02 != null) {
                        n02.mo18261c();
                    }
                    this.f27256c = 0;
                    this.f27255b = false;
                    c10818ql1.f41132e = false;
                    break;
                }
                break;
        }
    }

    public C9390fb1(C10818ql1 c10818ql1) {
        this.f27254a = 1;
        this.f27257d = c10818ql1;
        this.f27255b = false;
        this.f27256c = 0;
    }
}
