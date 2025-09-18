package defpackage;

/* renamed from: fb1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3803fb1 extends N02 {
    public final /* synthetic */ int a;
    public boolean b;
    public int c;
    public final /* synthetic */ Object d;

    public C3803fb1(C3994gb1 c3994gb1, int i) {
        this.a = 0;
        this.d = c3994gb1;
        this.c = i;
        this.b = false;
    }

    @Override // defpackage.N02, defpackage.InterfaceC6900rl1
    public void a() {
        switch (this.a) {
            case 0:
                this.b = true;
                break;
        }
    }

    @Override // defpackage.N02, defpackage.InterfaceC6900rl1
    public final void b() {
        switch (this.a) {
            case 0:
                ((C3994gb1) this.d).a.setVisibility(0);
                break;
            default:
                if (!this.b) {
                    this.b = true;
                    N02 n02 = ((C6710ql1) this.d).d;
                    if (n02 != null) {
                        n02.b();
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.InterfaceC6900rl1
    public final void c() {
        switch (this.a) {
            case 0:
                if (!this.b) {
                    ((C3994gb1) this.d).a.setVisibility(this.c);
                    break;
                }
                break;
            default:
                int i = this.c + 1;
                this.c = i;
                C6710ql1 c6710ql1 = (C6710ql1) this.d;
                if (i == c6710ql1.a.size()) {
                    N02 n02 = c6710ql1.d;
                    if (n02 != null) {
                        n02.c();
                    }
                    this.c = 0;
                    this.b = false;
                    c6710ql1.e = false;
                    break;
                }
                break;
        }
    }

    public C3803fb1(C6710ql1 c6710ql1) {
        this.a = 1;
        this.d = c6710ql1;
        this.b = false;
        this.c = 0;
    }
}
