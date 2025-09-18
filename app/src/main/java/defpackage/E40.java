package defpackage;

import android.os.Looper;
import android.util.Pair;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public final class E40 extends AbstractC7837wg {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ E40(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    private final void e() {
        boolean zRemove;
        ArrayList arrayList;
        C7647vg c7647vg;
        ArrayList arrayListL;
        ArrayList arrayListJ;
        synchronized (((C8447zt0) this.c)) {
            try {
                zRemove = ((C8447zt0) this.c).b.remove((Pair) this.b);
                arrayList = null;
                if (!zRemove) {
                    c7647vg = null;
                    arrayListL = null;
                } else if (((C8447zt0) this.c).b.isEmpty()) {
                    c7647vg = ((C8447zt0) this.c).f;
                    arrayListL = null;
                } else {
                    ArrayList arrayListK = ((C8447zt0) this.c).k();
                    arrayListL = ((C8447zt0) this.c).l();
                    arrayListJ = ((C8447zt0) this.c).j();
                    c7647vg = null;
                    arrayList = arrayListK;
                }
                arrayListJ = arrayListL;
            } catch (Throwable th) {
                throw th;
            }
        }
        C7647vg.c(arrayList);
        C7647vg.d(arrayListL);
        C7647vg.b(arrayListJ);
        if (c7647vg != null) {
            ((C8447zt0) this.c).h.getClass();
            c7647vg.e();
        }
        if (zRemove) {
            ((AbstractC1516Tf) ((Pair) this.b).first).c();
        }
    }

    @Override // defpackage.AbstractC7837wg
    public final void a() {
        switch (this.a) {
            case 0:
                if (((Future) this.b).cancel(false)) {
                    ES1 es1 = (ES1) this.c;
                    ((C1484Su0) es1.c).getClass();
                    AbstractC2139aT abstractC2139aT = (AbstractC2139aT) es1.b;
                    ((E90) abstractC2139aT.a()).k(abstractC2139aT.b, "NetworkFetchProducer");
                    abstractC2139aT.a.c();
                    return;
                }
                return;
            case 1:
                e();
                return;
            case 2:
                boolean zA = O90.a(Looper.myLooper(), Looper.getMainLooper());
                DN0 dn0 = (DN0) this.b;
                if (zA) {
                    ((C6935rx0) this.c).b.execute(new DE(27, dn0));
                    return;
                } else {
                    dn0.e();
                    return;
                }
            case 3:
                C2137aS0 c2137aS0 = (C2137aS0) this.c;
                c2137aS0.g.a();
                c2137aS0.f = true;
                ((AbstractC1516Tf) this.b).c();
                return;
            default:
                ((C0129Bk0) this.b).a();
                C4332iN c4332iN = (C4332iN) ((W91) this.c).c;
                C0129Bk0 c0129Bk0 = (C0129Bk0) this.b;
                synchronized (c4332iN) {
                    ((ArrayDeque) c4332iN.c).remove(c0129Bk0);
                }
                return;
        }
    }

    @Override // defpackage.AbstractC7837wg
    public void b() {
        switch (this.a) {
            case 1:
                C7647vg.b(((C8447zt0) this.c).j());
                break;
            case 3:
                C2137aS0 c2137aS0 = (C2137aS0) this.c;
                if (((C7647vg) c2137aS0.e).g()) {
                    c2137aS0.g.d();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.AbstractC7837wg
    public void c() {
        switch (this.a) {
            case 1:
                C7647vg.c(((C8447zt0) this.c).k());
                break;
        }
    }

    @Override // defpackage.AbstractC7837wg
    public void d() {
        switch (this.a) {
            case 1:
                C7647vg.d(((C8447zt0) this.c).l());
                break;
        }
    }

    public /* synthetic */ E40(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }
}
