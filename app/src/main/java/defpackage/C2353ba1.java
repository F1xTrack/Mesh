package defpackage;

import android.util.Pair;

/* renamed from: ba1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2353ba1 extends AbstractC8332zH {
    public final /* synthetic */ C2543ca1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2353ba1(C2543ca1 c2543ca1, AbstractC1516Tf abstractC1516Tf) {
        super(abstractC1516Tf);
        this.c = c2543ca1;
    }

    @Override // defpackage.AbstractC8332zH, defpackage.AbstractC1516Tf
    public final void d() {
        this.b.c();
        m();
    }

    @Override // defpackage.AbstractC8332zH, defpackage.AbstractC1516Tf
    public final void f(Throwable th) {
        this.b.e(th);
        m();
    }

    @Override // defpackage.AbstractC1516Tf
    public final void h(int i, Object obj) {
        this.b.g(i, obj);
        if (AbstractC1516Tf.a(i)) {
            m();
        }
    }

    public final void m() {
        Pair pair;
        synchronized (this.c) {
            try {
                pair = (Pair) this.c.c.poll();
                if (pair == null) {
                    C2543ca1 c2543ca1 = this.c;
                    c2543ca1.b--;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (pair != null) {
            this.c.d.execute(new XZ(this, pair, false, 21));
        }
    }
}
