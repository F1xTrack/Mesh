package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;

/* renamed from: ev0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3671ev0 extends AbstractC3634ej {
    public final ConnectivityManager g;

    public C3671ev0(Context context, C1857Xo1 c1857Xo1) {
        super(context, c1857Xo1);
        Object systemService = ((Context) this.b).getSystemService("connectivity");
        O90.d(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.g = (ConnectivityManager) systemService;
    }

    @Override // defpackage.AbstractC2038Zx
    public final Object c() {
        return AbstractC3480dv0.a(this.g);
    }

    @Override // defpackage.AbstractC3634ej
    public final IntentFilter l() {
        return new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
    }

    @Override // defpackage.AbstractC3634ej
    public final void m(Intent intent) {
        O90.f(intent, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
        if (O90.a(intent.getAction(), "android.net.conn.CONNECTIVITY_CHANGE")) {
            TE teG = TE.G();
            int i = AbstractC3480dv0.a;
            teG.getClass();
            i(AbstractC3480dv0.a(this.g));
        }
    }
}
