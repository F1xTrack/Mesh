package defpackage;

import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: kA, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class CallableC5451kA implements Callable {
    public final /* synthetic */ long a;
    public final /* synthetic */ Throwable b;
    public final /* synthetic */ Thread c;
    public final /* synthetic */ C1666Vd d;
    public final /* synthetic */ C5833mA e;

    public CallableC5451kA(C5833mA c5833mA, long j, Throwable th, Thread thread, C1666Vd c1666Vd) {
        this.e = c5833mA;
        this.a = j;
        this.b = th;
        this.c = thread;
        this.d = c1666Vd;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws Throwable {
        long j = this.a;
        long j2 = j / 1000;
        C5833mA c5833mA = this.e;
        String strE = c5833mA.e();
        if (strE == null) {
            return AbstractC3782fU1.e(null);
        }
        VH vh = (VH) c5833mA.c;
        vh.getClass();
        try {
            String str = (String) vh.b;
            HT ht = (HT) vh.c;
            ht.getClass();
            new File((File) ht.c, str).createNewFile();
        } catch (IOException unused) {
        }
        C1252Pv c1252Pv = (C1252Pv) c5833mA.m;
        c1252Pv.getClass();
        c1252Pv.w(this.b, this.c, CrashHianalyticsData.EVENT_ID_CRASH, new MP(strE, NN.a, j2), true);
        c5833mA.d(j);
        C1666Vd c1666Vd = this.d;
        c5833mA.b(false, c1666Vd, false);
        c5833mA.c(new C1219Pk().a, Boolean.FALSE);
        return !((DC) c5833mA.b).b() ? AbstractC3782fU1.e(null) : ((S81) ((AtomicReference) c1666Vd.i).get()).a.n((ZA) ((C6846rT1) c5833mA.e).b, new G10(this, 10, strE));
    }
}
