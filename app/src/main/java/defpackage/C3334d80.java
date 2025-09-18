package defpackage;

/* renamed from: d80 */
/* loaded from: classes.dex */
public final class C3334d80 implements InterfaceC4302iD {
    public final int a;
    public final /* synthetic */ C3524e80 b;

    public C3334d80(C3524e80 c3524e80, int i) {
        this.b = c3524e80;
        this.a = i;
    }

    @Override // defpackage.InterfaceC4302iD
    public final void onFailure(YC yc) {
        C3524e80.n(this.b, this.a, yc);
    }

    @Override // defpackage.InterfaceC4302iD
    public final void onNewResult(YC yc) {
        Throwable th;
        int i;
        if (!yc.a()) {
            if (((I) yc).g()) {
                C3524e80.n(this.b, this.a, yc);
                return;
            }
            return;
        }
        C3524e80 c3524e80 = this.b;
        int i2 = this.a;
        c3524e80.getClass();
        I i3 = (I) yc;
        boolean zG = i3.g();
        synchronized (c3524e80) {
            try {
                int i4 = c3524e80.i;
                if (i3 == c3524e80.p(i2) && i2 != c3524e80.i) {
                    if (c3524e80.q() == null || (zG && i2 < c3524e80.i)) {
                        c3524e80.i = i2;
                        i = i2;
                    } else {
                        i = i4;
                    }
                    while (i4 > i) {
                        YC ycO = c3524e80.o(i4);
                        if (ycO != null) {
                            ycO.close();
                        }
                        i4--;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (i3 == c3524e80.q()) {
            c3524e80.k(null, i2 == 0 && i3.g(), i3.a);
        }
        if (c3524e80.k.incrementAndGet() != c3524e80.j || (th = c3524e80.l) == null) {
            return;
        }
        c3524e80.i(th, c3524e80.m);
    }

    @Override // defpackage.InterfaceC4302iD
    public final void onProgressUpdate(YC yc) {
        if (this.a == 0) {
            this.b.j(((I) yc).d());
        }
    }

    @Override // defpackage.InterfaceC4302iD
    public final void onCancellation(YC yc) {
    }
}
