package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: b70 */
/* loaded from: classes.dex */
public final class C2265b70 {
    public final QE a;
    public final C0396Ev0 b;
    public final TE c;
    public final Context d;
    public final QQ0 e;
    public final C6802rF f;
    public final C7375uF g;
    public final C0318Dv0 h;
    public final C2472cD i;
    public final C2303bK j;
    public final C0396Ev0 k;
    public final AbstractC8355zO1 l;
    public final D7 m;
    public final C6446pN0 n;
    public final Set o;
    public final SN p;
    public final SN q;
    public final boolean r;
    public final C2303bK s;
    public final C6846rT1 t;
    public final boolean u;
    public final NV1 v;
    public final C0084Av0 w;
    public final int x;

    public C2265b70(C2074a70 c2074a70) {
        TE te;
        AbstractC4368iZ.b();
        this.t = new C6846rT1(c2074a70.d);
        Object systemService = c2074a70.a.getSystemService("activity");
        if (systemService == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.a = new QE((ActivityManager) systemService);
        this.b = new C0396Ev0(8);
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        synchronized (TE.class) {
            try {
                if (TE.b == null) {
                    TE.b = new TE(0);
                }
                te = TE.b;
            } catch (Throwable th) {
                throw th;
            }
        }
        O90.e(te, "getInstance()");
        this.c = te;
        this.d = c2074a70.a;
        C3759fN c3759fN = new C3759fN(13);
        QQ0 qq0 = new QQ0();
        qq0.a = c3759fN;
        this.e = qq0;
        this.x = c2074a70.f;
        this.f = new C6802rF();
        C0318Dv0 c0318Dv0T = C0318Dv0.t();
        O90.e(c0318Dv0T, "getInstance()");
        this.h = c0318Dv0T;
        this.i = SI1.a;
        Context context = c2074a70.a;
        AbstractC4368iZ.b();
        C2303bK c2303bK = new C2303bK(new C6846rT1(context, 10));
        this.j = c2303bK;
        C0396Ev0 c0396Ev0I = C0396Ev0.i();
        O90.e(c0396Ev0I, "getInstance()");
        this.k = c0396Ev0I;
        AbstractC4368iZ.b();
        AbstractC8355zO1 abstractC8355zO1 = c2074a70.b;
        this.l = abstractC8355zO1 == null ? new G40() : abstractC8355zO1;
        C3346dC0 c3346dC0 = new C3346dC0(new C7532v32(18));
        D7 d7 = new D7();
        d7.b = c3346dC0;
        this.m = d7;
        this.n = new C6446pN0(4);
        Set set = c2074a70.c;
        this.o = set == null ? SN.a : set;
        SN sn = SN.a;
        this.p = sn;
        this.q = sn;
        this.r = true;
        this.s = c2303bK;
        int i = c3346dC0.c.d;
        C7375uF c7375uF = new C7375uF();
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(2, new ThreadFactoryC8321zD0("FrescoIoBoundExecutor"));
        O90.e(executorServiceNewFixedThreadPool, "newFixedThreadPool(\n    …oIoBoundExecutor\", true))");
        c7375uF.a = executorServiceNewFixedThreadPool;
        ExecutorService executorServiceNewFixedThreadPool2 = Executors.newFixedThreadPool(i, new ThreadFactoryC8321zD0("FrescoDecodeExecutor"));
        O90.e(executorServiceNewFixedThreadPool2, "newFixedThreadPool(\n    …coDecodeExecutor\", true))");
        c7375uF.b = executorServiceNewFixedThreadPool2;
        ExecutorService executorServiceNewFixedThreadPool3 = Executors.newFixedThreadPool(i, new ThreadFactoryC8321zD0("FrescoBackgroundExecutor"));
        O90.e(executorServiceNewFixedThreadPool3, "newFixedThreadPool(\n    …ckgroundExecutor\", true))");
        c7375uF.c = executorServiceNewFixedThreadPool3;
        ExecutorService executorServiceNewFixedThreadPool4 = Executors.newFixedThreadPool(1, new ThreadFactoryC8321zD0("FrescoLightWeightBackgroundExecutor"));
        O90.e(executorServiceNewFixedThreadPool4, "newFixedThreadPool(\n    …ckgroundExecutor\", true))");
        c7375uF.d = executorServiceNewFixedThreadPool4;
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(i, new ThreadFactoryC8321zD0("FrescoBackgroundExecutor"));
        O90.e(scheduledExecutorServiceNewScheduledThreadPool, "newScheduledThreadPool(\n…ckgroundExecutor\", true))");
        c7375uF.e = scheduledExecutorServiceNewScheduledThreadPool;
        this.g = c7375uF;
        this.u = true;
        this.v = c2074a70.e;
        this.w = new C0084Av0(11);
        AbstractC4368iZ.b();
    }
}
