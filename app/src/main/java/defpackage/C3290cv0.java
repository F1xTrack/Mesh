package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;

/* renamed from: cv0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3290cv0 extends AbstractC2038Zx {
    public final ConnectivityManager f;
    public final C1094Nu0 g;

    public C3290cv0(Context context, C1857Xo1 c1857Xo1) {
        super(context, c1857Xo1);
        Object systemService = ((Context) this.b).getSystemService("connectivity");
        O90.d(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f = (ConnectivityManager) systemService;
        this.g = new C1094Nu0(1, this);
    }

    @Override // defpackage.AbstractC2038Zx
    public final Object c() {
        return AbstractC3480dv0.a(this.f);
    }

    @Override // defpackage.AbstractC2038Zx
    public final void j() {
        try {
            TE teG = TE.G();
            int i = AbstractC3480dv0.a;
            teG.getClass();
            AbstractC0938Lu0.a(this.f, this.g);
        } catch (IllegalArgumentException unused) {
            TE teG2 = TE.G();
            int i2 = AbstractC3480dv0.a;
            teG2.getClass();
        } catch (SecurityException unused2) {
            TE teG3 = TE.G();
            int i3 = AbstractC3480dv0.a;
            teG3.getClass();
        }
    }

    @Override // defpackage.AbstractC2038Zx
    public final void k() {
        try {
            TE teG = TE.G();
            int i = AbstractC3480dv0.a;
            teG.getClass();
            AbstractC0783Ju0.c(this.f, this.g);
        } catch (IllegalArgumentException unused) {
            TE teG2 = TE.G();
            int i2 = AbstractC3480dv0.a;
            teG2.getClass();
        } catch (SecurityException unused2) {
            TE teG3 = TE.G();
            int i3 = AbstractC3480dv0.a;
            teG3.getClass();
        }
    }
}
