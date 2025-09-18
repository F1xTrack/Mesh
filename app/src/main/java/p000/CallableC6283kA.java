package p000;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: kA */
/* loaded from: classes.dex */
public final class CallableC6283kA implements Callable {

    /* renamed from: a */
    public final /* synthetic */ long f36329a;

    /* renamed from: b */
    public final /* synthetic */ Throwable f36330b;

    /* renamed from: c */
    public final /* synthetic */ Thread f36331c;

    /* renamed from: d */
    public final /* synthetic */ C1361Vd f36332d;

    /* renamed from: e */
    public final /* synthetic */ C6409mA f36333e;

    public CallableC6283kA(C6409mA c6409mA, long j, Throwable th, Thread thread, C1361Vd c1361Vd) {
        this.f36333e = c6409mA;
        this.f36329a = j;
        this.f36330b = th;
        this.f36331c = thread;
        this.f36332d = c1361Vd;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws Throwable {
        long j = this.f36329a;
        long j2 = j / 1000;
        C6409mA c6409mA = this.f36333e;
        String strM22696e = c6409mA.m22696e();
        if (strM22696e == null) {
            return AbstractC9376fU1.m18244e(null);
        }
        C1339VH c1339vh = (C1339VH) c6409mA.f37529c;
        c1339vh.getClass();
        try {
            String str = (String) c1339vh.f12486b;
            C0471HT c0471ht = (C0471HT) c1339vh.f12487c;
            c0471ht.getClass();
            new File((File) c0471ht.f4311c, str).createNewFile();
        } catch (IOException unused) {
        }
        C1002Pv c1002Pv = (C1002Pv) c6409mA.f37539m;
        c1002Pv.getClass();
        c1002Pv.m6484w(this.f36330b, this.f36331c, CrashHianalyticsData.EVENT_ID_CRASH, new C0781MP(strM22696e, C0842NN.f7735a, j2), true);
        c6409mA.m22695d(j);
        C1361Vd c1361Vd = this.f36332d;
        c6409mA.m22693b(false, c1361Vd, false);
        c6409mA.m22694c(new C0991Pk().f9270a, Boolean.FALSE);
        return !((C0202DC) c6409mA.f37528b).m1590b() ? AbstractC9376fU1.m18244e(null) : ((S81) ((AtomicReference) c1361Vd.f12668i).get()).f10598a.m18387n((ExecutorC1584ZA) ((C10910rT1) c6409mA.f37531e).f41678b, new G10(this, 10, strM22696e));
    }
}
