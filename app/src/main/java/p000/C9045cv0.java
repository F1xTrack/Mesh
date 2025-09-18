package p000;

import android.content.Context;
import android.net.ConnectivityManager;

/* renamed from: cv0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9045cv0 extends AbstractC1633Zx {

    /* renamed from: f */
    public final ConnectivityManager f25720f;

    /* renamed from: g */
    public final C8030Nu0 f25721g;

    public C9045cv0(Context context, C8539Xo1 c8539Xo1) {
        super(context, c8539Xo1);
        Object systemService = ((Context) this.f15236b).getSystemService("connectivity");
        O90.m5966d(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f25720f = (ConnectivityManager) systemService;
        this.f25721g = new C8030Nu0(1, this);
    }

    @Override // p000.AbstractC1633Zx
    /* renamed from: c */
    public final Object mo9099c() {
        return AbstractC9173dv0.m17776a(this.f25720f);
    }

    @Override // p000.AbstractC1633Zx
    /* renamed from: j */
    public final void mo9650j() {
        try {
            C1210TE c1210teM7634G = C1210TE.m7634G();
            int i = AbstractC9173dv0.f26389a;
            c1210teM7634G.getClass();
            AbstractC7926Lu0.m5134a(this.f25720f, this.f25721g);
        } catch (IllegalArgumentException unused) {
            C1210TE c1210teM7634G2 = C1210TE.m7634G();
            int i2 = AbstractC9173dv0.f26389a;
            c1210teM7634G2.getClass();
        } catch (SecurityException unused2) {
            C1210TE c1210teM7634G3 = C1210TE.m7634G();
            int i3 = AbstractC9173dv0.f26389a;
            c1210teM7634G3.getClass();
        }
    }

    @Override // p000.AbstractC1633Zx
    /* renamed from: k */
    public final void mo9651k() {
        try {
            C1210TE c1210teM7634G = C1210TE.m7634G();
            int i = AbstractC9173dv0.f26389a;
            c1210teM7634G.getClass();
            AbstractC7822Ju0.m4465c(this.f25720f, this.f25721g);
        } catch (IllegalArgumentException unused) {
            C1210TE c1210teM7634G2 = C1210TE.m7634G();
            int i2 = AbstractC9173dv0.f26389a;
            c1210teM7634G2.getClass();
        } catch (SecurityException unused2) {
            C1210TE c1210teM7634G3 = C1210TE.m7634G();
            int i3 = AbstractC9173dv0.f26389a;
            c1210teM7634G3.getClass();
        }
    }
}
