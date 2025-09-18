package p000;

import android.os.Build;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;

/* renamed from: c70 */
/* loaded from: classes.dex */
public final class C8940c70 {

    /* renamed from: t */
    public static C8940c70 f17308t;

    /* renamed from: u */
    public static Z60 f17309u;

    /* renamed from: a */
    public final C4238iN f17310a;

    /* renamed from: b */
    public final C8812b70 f17311b;

    /* renamed from: c */
    public final C7978Mu0 f17312c;

    /* renamed from: d */
    public C7442Cm0 f17313d;

    /* renamed from: e */
    public CC0 f17314e;

    /* renamed from: f */
    public C7442Cm0 f17315f;

    /* renamed from: g */
    public CC0 f17316g;

    /* renamed from: h */
    public C0487Hj f17317h;

    /* renamed from: i */
    public C7068wK f17318i;

    /* renamed from: j */
    public ES1 f17319j;

    /* renamed from: k */
    public C10065kt0 f17320k;

    /* renamed from: l */
    public SD0 f17321l;

    /* renamed from: m */
    public VD0 f17322m;

    /* renamed from: n */
    public C0487Hj f17323n;

    /* renamed from: o */
    public C7068wK f17324o;

    /* renamed from: p */
    public HashMap f17325p;

    /* renamed from: q */
    public C1380Vw f17326q;

    /* renamed from: r */
    public C0827N8 f17327r;

    /* renamed from: s */
    public C0890O8 f17328s;

    public C8940c70(C8812b70 c8812b70) {
        AbstractC4250iZ.m19063b();
        c8812b70.getClass();
        this.f17311b = c8812b70;
        c8812b70.f16804t.getClass();
        this.f17310a = new C4238iN((ExecutorService) c8812b70.f16791g.f43619d);
        this.f17312c = new C7978Mu0(c8812b70.f16806v);
        AbstractC4250iZ.m19063b();
    }

    /* renamed from: j */
    public static synchronized void m10587j(C8812b70 c8812b70) {
        try {
            if (f17308t != null) {
                AbstractC3929dS.m17681n(C8940c70.class);
            }
            f17308t = new C8940c70(c8812b70);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: a */
    public final void m10588a() {
        C0827N8 c0827n8M10594g = m10594g();
        C8812b70 c8812b70 = this.f17311b;
        C6937uF c6937uF = c8812b70.f16791g;
        C7442Cm0 c7442Cm0M10589b = m10589b();
        c8812b70.f16804t.getClass();
        c8812b70.f16804t.getClass();
        c8812b70.f16804t.getClass();
        c8812b70.getClass();
        try {
            Class<?> cls = Class.forName("com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl");
            Class<?> cls2 = Boolean.TYPE;
            Constructor<?> constructor = cls.getConstructor(C0827N8.class, C6937uF.class, C7442Cm0.class, cls2, cls2, Integer.TYPE, InterfaceExecutorServiceC10279mY0.class);
            Boolean bool = Boolean.FALSE;
            O90.m5966d(constructor.newInstance(c0827n8M10594g, c6937uF, c7442Cm0M10589b, bool, bool, 30, null), "null cannot be cast to non-null type com.facebook.imagepipeline.animated.factory.AnimatedFactory");
            throw new ClassCastException();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public final C7442Cm0 m10589b() {
        if (this.f17313d == null) {
            C8812b70 c8812b70 = this.f17311b;
            C7356Av0 c7356Av0 = c8812b70.f16807w;
            C1022QE c1022qe = c8812b70.f16785a;
            C7564Ev0 c7564Ev0 = c8812b70.f16795k;
            C7564Ev0 c7564Ev02 = c8812b70.f16786b;
            c8812b70.f16804t.getClass();
            c8812b70.f16804t.getClass();
            c8812b70.getClass();
            c7356Av0.getClass();
            C7442Cm0 c7442Cm0 = new C7442Cm0(new C9937jt0(11), c1022qe);
            c7564Ev0.getClass();
            this.f17313d = c7442Cm0;
        }
        return this.f17313d;
    }

    /* renamed from: c */
    public final CC0 m10590c() {
        if (this.f17314e == null) {
            C7442Cm0 c7442Cm0M10589b = m10589b();
            C7512Dv0 c7512Dv0 = this.f17311b.f16792h;
            c7512Dv0.getClass();
            this.f17314e = new CC0(c7442Cm0M10589b, 17, new QQ0(c7512Dv0));
        }
        return this.f17314e;
    }

    /* renamed from: d */
    public final CC0 m10591d() {
        if (this.f17316g == null) {
            C8812b70 c8812b70 = this.f17311b;
            c8812b70.getClass();
            if (this.f17315f == null) {
                C7442Cm0 c7442Cm0 = new C7442Cm0(new C9937jt0(13), c8812b70.f16790f);
                c8812b70.f16795k.getClass();
                this.f17315f = c7442Cm0;
            }
            C7442Cm0 c7442Cm02 = this.f17315f;
            C7512Dv0 c7512Dv0 = c8812b70.f16792h;
            c7512Dv0.getClass();
            this.f17316g = new CC0(c7442Cm02, 17, new C7391Bm1(16, c7512Dv0));
        }
        return this.f17316g;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v2 Z60, still in use, count: 3, list:
          (r1v2 Z60) from 0x01c7: MOVE (r33v0 Z60) = (r1v2 Z60) (LINE:456)
          (r1v2 Z60) from 0x018d: MOVE (r33v2 Z60) = (r1v2 Z60) (LINE:398)
          (r1v2 Z60) from 0x0081: MOVE (r33v4 Z60) = (r1v2 Z60) (LINE:130)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    /* renamed from: e */
    public final p000.Z60 m10592e() {
        /*
            Method dump skipped, instructions count: 510
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C8940c70.m10592e():Z60");
    }

    /* renamed from: f */
    public final C0487Hj m10593f() {
        if (this.f17317h == null) {
            C7068wK c7068wK = this.f17318i;
            C8812b70 c8812b70 = this.f17311b;
            if (c7068wK == null) {
                this.f17318i = c8812b70.f16789e.m6689H(c8812b70.f16794j);
            }
            C7068wK c7068wK2 = this.f17318i;
            C0197D7 c0197d7 = c8812b70.f16797m;
            c8812b70.getClass();
            C1339VH c1339vhM1559b = c0197d7.m1559b(0);
            C0986Pf c0986PfM1560c = c8812b70.f16797m.m1560c();
            ExecutorService executorService = (ExecutorService) c8812b70.f16791g.f43616a;
            this.f17317h = new C0487Hj(c7068wK2, c1339vhM1559b, c0986PfM1560c, executorService, executorService, c8812b70.f16792h);
        }
        return this.f17317h;
    }

    /* renamed from: g */
    public final C0827N8 m10594g() {
        if (this.f17327r == null) {
            C0197D7 c0197d7 = this.f17311b.f16797m;
            InterfaceC11129tB0 interfaceC11129tB0M10595h = m10595h();
            O90.m5968f(c0197d7, "poolFactory");
            O90.m5968f(interfaceC11129tB0M10595h, "platformDecoder");
            C7978Mu0 c7978Mu0 = this.f17312c;
            O90.m5968f(c7978Mu0, "closeableReferenceFactory");
            InterfaceC6380li interfaceC6380liM1558a = c0197d7.m1558a();
            O90.m5967e(interfaceC6380liM1558a, "poolFactory.bitmapPool");
            this.f17327r = new C0827N8(interfaceC6380liM1558a, c7978Mu0);
        }
        return this.f17327r;
    }

    /* renamed from: h */
    public final InterfaceC11129tB0 m10595h() {
        C0890O8 c0890o8;
        if (this.f17328s == null) {
            C8812b70 c8812b70 = this.f17311b;
            C0197D7 c0197d7 = c8812b70.f16797m;
            c8812b70.f16804t.getClass();
            c8812b70.f16804t.getClass();
            C0856Nb c0856Nb = (C0856Nb) c8812b70.f16804t.f41680d;
            O90.m5968f(c0197d7, "poolFactory");
            O90.m5968f(c0856Nb, "platformDecoderOptions");
            if (Build.VERSION.SDK_INT >= 26) {
                InterfaceC6380li interfaceC6380liM1558a = c0197d7.m1558a();
                O90.m5967e(interfaceC6380liM1558a, "poolFactory.bitmapPool");
                c0890o8 = new C0890O8(interfaceC6380liM1558a, AbstractC11787yL1.m26139a(c0197d7), c0856Nb, 1);
            } else {
                InterfaceC6380li interfaceC6380liM1558a2 = c0197d7.m1558a();
                O90.m5967e(interfaceC6380liM1558a2, "poolFactory.bitmapPool");
                c0890o8 = new C0890O8(interfaceC6380liM1558a2, AbstractC11787yL1.m26139a(c0197d7), c0856Nb, 0);
            }
            this.f17328s = c0890o8;
        }
        return this.f17328s;
    }

    /* renamed from: i */
    public final C0487Hj m10596i() {
        if (this.f17323n == null) {
            C7068wK c7068wK = this.f17324o;
            C8812b70 c8812b70 = this.f17311b;
            if (c7068wK == null) {
                this.f17324o = c8812b70.f16789e.m6689H(c8812b70.f16803s);
            }
            C7068wK c7068wK2 = this.f17324o;
            C0197D7 c0197d7 = c8812b70.f16797m;
            c8812b70.getClass();
            C1339VH c1339vhM1559b = c0197d7.m1559b(0);
            C0986Pf c0986PfM1560c = c8812b70.f16797m.m1560c();
            ExecutorService executorService = (ExecutorService) c8812b70.f16791g.f43616a;
            this.f17323n = new C0487Hj(c7068wK2, c1339vhM1559b, c0986PfM1560c, executorService, executorService, c8812b70.f16792h);
        }
        return this.f17323n;
    }
}
