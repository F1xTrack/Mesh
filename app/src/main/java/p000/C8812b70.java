package p000;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: b70 */
/* loaded from: classes.dex */
public final class C8812b70 {

    /* renamed from: a */
    public final C1022QE f16785a;

    /* renamed from: b */
    public final C7564Ev0 f16786b;

    /* renamed from: c */
    public final C1210TE f16787c;

    /* renamed from: d */
    public final Context f16788d;

    /* renamed from: e */
    public final QQ0 f16789e;

    /* renamed from: f */
    public final C6731rF f16790f;

    /* renamed from: g */
    public final C6937uF f16791g;

    /* renamed from: h */
    public final C7512Dv0 f16792h;

    /* renamed from: i */
    public final C1833cD f16793i;

    /* renamed from: j */
    public final C1778bK f16794j;

    /* renamed from: k */
    public final C7564Ev0 f16795k;

    /* renamed from: l */
    public final AbstractC11920zO1 f16796l;

    /* renamed from: m */
    public final C0197D7 f16797m;

    /* renamed from: n */
    public final C10641pN0 f16798n;

    /* renamed from: o */
    public final Set f16799o;

    /* renamed from: p */
    public final C1156SN f16800p;

    /* renamed from: q */
    public final C1156SN f16801q;

    /* renamed from: r */
    public final boolean f16802r;

    /* renamed from: s */
    public final C1778bK f16803s;

    /* renamed from: t */
    public final C10910rT1 f16804t;

    /* renamed from: u */
    public final boolean f16805u;

    /* renamed from: v */
    public final NV1 f16806v;

    /* renamed from: w */
    public final C7356Av0 f16807w;

    /* renamed from: x */
    public final int f16808x;

    public C8812b70(C8684a70 c8684a70) {
        C1210TE c1210te;
        AbstractC4250iZ.m19063b();
        this.f16804t = new C10910rT1(c8684a70.f15319d);
        Object systemService = c8684a70.f15316a.getSystemService("activity");
        if (systemService == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.f16785a = new C1022QE((ActivityManager) systemService);
        this.f16786b = new C7564Ev0(8);
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        synchronized (C1210TE.class) {
            try {
                if (C1210TE.f11207b == null) {
                    C1210TE.f11207b = new C1210TE(0);
                }
                c1210te = C1210TE.f11207b;
            } catch (Throwable th) {
                throw th;
            }
        }
        O90.m5967e(c1210te, "getInstance()");
        this.f16787c = c1210te;
        this.f16788d = c8684a70.f15316a;
        C4049fN c4049fN = new C4049fN(13);
        QQ0 qq0 = new QQ0();
        qq0.f9619a = c4049fN;
        this.f16789e = qq0;
        this.f16808x = c8684a70.f15321f;
        this.f16790f = new C6731rF();
        C7512Dv0 c7512Dv0M1932t = C7512Dv0.m1932t();
        O90.m5967e(c7512Dv0M1932t, "getInstance()");
        this.f16792h = c7512Dv0M1932t;
        this.f16793i = SI1.f10680a;
        Context context = c8684a70.f15316a;
        AbstractC4250iZ.m19063b();
        C1778bK c1778bK = new C1778bK(new C10910rT1(context, 10));
        this.f16794j = c1778bK;
        C7564Ev0 c7564Ev0M2448i = C7564Ev0.m2448i();
        O90.m5967e(c7564Ev0M2448i, "getInstance()");
        this.f16795k = c7564Ev0M2448i;
        AbstractC4250iZ.m19063b();
        AbstractC11920zO1 abstractC11920zO1 = c8684a70.f15317b;
        this.f16796l = abstractC11920zO1 == null ? new G40() : abstractC11920zO1;
        C9083dC0 c9083dC0 = new C9083dC0(new C11370v32(18));
        C0197D7 c0197d7 = new C0197D7();
        c0197d7.f1847b = c9083dC0;
        this.f16797m = c0197d7;
        this.f16798n = new C10641pN0(4);
        Set set = c8684a70.f15318c;
        this.f16799o = set == null ? C1156SN.f10705a : set;
        C1156SN c1156sn = C1156SN.f10705a;
        this.f16800p = c1156sn;
        this.f16801q = c1156sn;
        this.f16802r = true;
        this.f16803s = c1778bK;
        int i = c9083dC0.f25859c.f26593d;
        C6937uF c6937uF = new C6937uF();
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(2, new ThreadFactoryC11897zD0("FrescoIoBoundExecutor"));
        O90.m5967e(executorServiceNewFixedThreadPool, "newFixedThreadPool(\n    …oIoBoundExecutor\", true))");
        c6937uF.f43616a = executorServiceNewFixedThreadPool;
        ExecutorService executorServiceNewFixedThreadPool2 = Executors.newFixedThreadPool(i, new ThreadFactoryC11897zD0("FrescoDecodeExecutor"));
        O90.m5967e(executorServiceNewFixedThreadPool2, "newFixedThreadPool(\n    …coDecodeExecutor\", true))");
        c6937uF.f43617b = executorServiceNewFixedThreadPool2;
        ExecutorService executorServiceNewFixedThreadPool3 = Executors.newFixedThreadPool(i, new ThreadFactoryC11897zD0("FrescoBackgroundExecutor"));
        O90.m5967e(executorServiceNewFixedThreadPool3, "newFixedThreadPool(\n    …ckgroundExecutor\", true))");
        c6937uF.f43618c = executorServiceNewFixedThreadPool3;
        ExecutorService executorServiceNewFixedThreadPool4 = Executors.newFixedThreadPool(1, new ThreadFactoryC11897zD0("FrescoLightWeightBackgroundExecutor"));
        O90.m5967e(executorServiceNewFixedThreadPool4, "newFixedThreadPool(\n    …ckgroundExecutor\", true))");
        c6937uF.f43619d = executorServiceNewFixedThreadPool4;
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(i, new ThreadFactoryC11897zD0("FrescoBackgroundExecutor"));
        O90.m5967e(scheduledExecutorServiceNewScheduledThreadPool, "newScheduledThreadPool(\n…ckgroundExecutor\", true))");
        c6937uF.f43620e = scheduledExecutorServiceNewScheduledThreadPool;
        this.f16791g = c6937uF;
        this.f16805u = true;
        this.f16806v = c8684a70.f15320e;
        this.f16807w = new C7356Av0(11);
        AbstractC4250iZ.m19063b();
    }
}
