package p000;

import android.os.Looper;
import android.util.Pair;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public final class E40 extends AbstractC7090wg {

    /* renamed from: a */
    public final /* synthetic */ int f2448a;

    /* renamed from: b */
    public final /* synthetic */ Object f2449b;

    /* renamed from: c */
    public final /* synthetic */ Object f2450c;

    public /* synthetic */ E40(Object obj, int i, Object obj2) {
        this.f2448a = i;
        this.f2449b = obj;
        this.f2450c = obj2;
    }

    /* renamed from: e */
    private final void m2009e() {
        boolean zRemove;
        ArrayList arrayList;
        C7027vg c7027vg;
        ArrayList arrayListM26585l;
        ArrayList arrayListM26583j;
        synchronized (((C11981zt0) this.f2450c)) {
            try {
                zRemove = ((C11981zt0) this.f2450c).f47078b.remove((Pair) this.f2449b);
                arrayList = null;
                if (!zRemove) {
                    c7027vg = null;
                    arrayListM26585l = null;
                } else if (((C11981zt0) this.f2450c).f47078b.isEmpty()) {
                    c7027vg = ((C11981zt0) this.f2450c).f47082f;
                    arrayListM26585l = null;
                } else {
                    ArrayList arrayListM26584k = ((C11981zt0) this.f2450c).m26584k();
                    arrayListM26585l = ((C11981zt0) this.f2450c).m26585l();
                    arrayListM26583j = ((C11981zt0) this.f2450c).m26583j();
                    c7027vg = null;
                    arrayList = arrayListM26584k;
                }
                arrayListM26583j = arrayListM26585l;
            } catch (Throwable th) {
                throw th;
            }
        }
        C7027vg.m25460c(arrayList);
        C7027vg.m25461d(arrayListM26585l);
        C7027vg.m25459b(arrayListM26583j);
        if (c7027vg != null) {
            ((C11981zt0) this.f2450c).f47084h.getClass();
            c7027vg.m25463e();
        }
        if (zRemove) {
            ((AbstractC1237Tf) ((Pair) this.f2449b).first).m7717c();
        }
    }

    @Override // p000.AbstractC7090wg
    /* renamed from: a */
    public final void mo2010a() {
        switch (this.f2448a) {
            case 0:
                if (((Future) this.f2449b).cancel(false)) {
                    ES1 es1 = (ES1) this.f2450c;
                    ((C8290Su0) es1.f2709c).getClass();
                    AbstractC1666aT abstractC1666aT = (AbstractC1666aT) es1.f2708b;
                    ((E90) abstractC1666aT.m9748a()).mo753k(abstractC1666aT.f15523b, "NetworkFetchProducer");
                    abstractC1666aT.f15522a.m7717c();
                    return;
                }
                return;
            case 1:
                m2009e();
                return;
            case 2:
                boolean zM5963a = O90.m5963a(Looper.myLooper(), Looper.getMainLooper());
                DN0 dn0 = (DN0) this.f2449b;
                if (zM5963a) {
                    ((C10969rx0) this.f2450c).f42175b.execute(new RunnableC0204DE(27, dn0));
                    return;
                } else {
                    dn0.m1668e();
                    return;
                }
            case 3:
                C8726aS0 c8726aS0 = (C8726aS0) this.f2450c;
                c8726aS0.f15519g.m9093a();
                c8726aS0.f15518f = true;
                ((AbstractC1237Tf) this.f2449b).m7717c();
                return;
            default:
                ((C7386Bk0) this.f2449b).m3259a();
                C4238iN c4238iN = (C4238iN) ((W91) this.f2450c).f13015c;
                C7386Bk0 c7386Bk0 = (C7386Bk0) this.f2449b;
                synchronized (c4238iN) {
                    ((ArrayDeque) c4238iN.f29114c).remove(c7386Bk0);
                }
                return;
        }
    }

    @Override // p000.AbstractC7090wg
    /* renamed from: b */
    public void mo2011b() {
        switch (this.f2448a) {
            case 1:
                C7027vg.m25459b(((C11981zt0) this.f2450c).m26583j());
                break;
            case 3:
                C8726aS0 c8726aS0 = (C8726aS0) this.f2450c;
                if (((C7027vg) c8726aS0.f15517e).m25465g()) {
                    c8726aS0.f15519g.m9096d();
                    break;
                }
                break;
        }
    }

    @Override // p000.AbstractC7090wg
    /* renamed from: c */
    public void mo2012c() {
        switch (this.f2448a) {
            case 1:
                C7027vg.m25460c(((C11981zt0) this.f2450c).m26584k());
                break;
        }
    }

    @Override // p000.AbstractC7090wg
    /* renamed from: d */
    public void mo2013d() {
        switch (this.f2448a) {
            case 1:
                C7027vg.m25461d(((C11981zt0) this.f2450c).m26585l());
                break;
        }
    }

    public /* synthetic */ E40(Object obj, Object obj2, boolean z, int i) {
        this.f2448a = i;
        this.f2450c = obj;
        this.f2449b = obj2;
    }
}
