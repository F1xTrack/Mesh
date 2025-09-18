package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* renamed from: ej, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3634ej extends AbstractC2038Zx {
    public final D6 f;

    public AbstractC3634ej(Context context, C1857Xo1 c1857Xo1) {
        super(context, c1857Xo1);
        this.f = new D6(2, this);
    }

    @Override // defpackage.AbstractC2038Zx
    public final void j() {
        TE teG = TE.G();
        int i = AbstractC3825fj.a;
        teG.getClass();
        ((Context) this.b).registerReceiver(this.f, l());
    }

    @Override // defpackage.AbstractC2038Zx
    public final void k() {
        TE teG = TE.G();
        int i = AbstractC3825fj.a;
        teG.getClass();
        ((Context) this.b).unregisterReceiver(this.f);
    }

    public abstract IntentFilter l();

    public abstract void m(Intent intent);
}
