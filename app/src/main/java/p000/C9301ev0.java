package p000;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;

/* renamed from: ev0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9301ev0 extends AbstractC4008ej {

    /* renamed from: g */
    public final ConnectivityManager f26940g;

    public C9301ev0(Context context, C8539Xo1 c8539Xo1) {
        super(context, c8539Xo1);
        Object systemService = ((Context) this.f15236b).getSystemService("connectivity");
        O90.m5966d(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f26940g = (ConnectivityManager) systemService;
    }

    @Override // p000.AbstractC1633Zx
    /* renamed from: c */
    public final Object mo9099c() {
        return AbstractC9173dv0.m17776a(this.f26940g);
    }

    @Override // p000.AbstractC4008ej
    /* renamed from: l */
    public final IntentFilter mo9100l() {
        return new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
    }

    @Override // p000.AbstractC4008ej
    /* renamed from: m */
    public final void mo9101m(Intent intent) {
        O90.m5968f(intent, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
        if (O90.m5963a(intent.getAction(), "android.net.conn.CONNECTIVITY_CHANGE")) {
            C1210TE c1210teM7634G = C1210TE.m7634G();
            int i = AbstractC9173dv0.f26389a;
            c1210teM7634G.getClass();
            m9649i(AbstractC9173dv0.m17776a(this.f26940g));
        }
    }
}
