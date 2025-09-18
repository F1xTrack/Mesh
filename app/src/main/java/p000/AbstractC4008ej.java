package p000;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* renamed from: ej */
/* loaded from: classes.dex */
public abstract class AbstractC4008ej extends AbstractC1633Zx {

    /* renamed from: f */
    public final C0196D6 f26813f;

    public AbstractC4008ej(Context context, C8539Xo1 c8539Xo1) {
        super(context, c8539Xo1);
        this.f26813f = new C0196D6(2, this);
    }

    @Override // p000.AbstractC1633Zx
    /* renamed from: j */
    public final void mo9650j() {
        C1210TE c1210teM7634G = C1210TE.m7634G();
        int i = AbstractC4071fj.f27353a;
        c1210teM7634G.getClass();
        ((Context) this.f15236b).registerReceiver(this.f26813f, mo9100l());
    }

    @Override // p000.AbstractC1633Zx
    /* renamed from: k */
    public final void mo9651k() {
        C1210TE c1210teM7634G = C1210TE.m7634G();
        int i = AbstractC4071fj.f27353a;
        c1210teM7634G.getClass();
        ((Context) this.f15236b).unregisterReceiver(this.f26813f);
    }

    /* renamed from: l */
    public abstract IntentFilter mo9100l();

    /* renamed from: m */
    public abstract void mo9101m(Intent intent);
}
