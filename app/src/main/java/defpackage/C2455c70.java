package defpackage;

import android.os.Build;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;

/* renamed from: c70 */
/* loaded from: classes.dex */
public final class C2455c70 {
    public static C2455c70 t;
    public static Z60 u;
    public final C4332iN a;
    public final C2265b70 b;
    public final C1016Mu0 c;
    public C0213Cm0 d;
    public CC0 e;
    public C0213Cm0 f;
    public CC0 g;
    public C0593Hj h;
    public C7771wK i;
    public ES1 j;
    public C5587kt0 k;
    public SD0 l;
    public VD0 m;
    public C0593Hj n;
    public C7771wK o;
    public HashMap p;
    public C1723Vw q;
    public N8 r;
    public O8 s;

    public C2455c70(C2265b70 c2265b70) {
        AbstractC4368iZ.b();
        c2265b70.getClass();
        this.b = c2265b70;
        c2265b70.t.getClass();
        this.a = new C4332iN((ExecutorService) c2265b70.g.d);
        this.c = new C1016Mu0(c2265b70.v);
        AbstractC4368iZ.b();
    }

    public static synchronized void j(C2265b70 c2265b70) {
        try {
            if (t != null) {
                AbstractC3393dS.n(C2455c70.class);
            }
            t = new C2455c70(c2265b70);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void a() {
        N8 n8G = g();
        C2265b70 c2265b70 = this.b;
        C7375uF c7375uF = c2265b70.g;
        C0213Cm0 c0213Cm0B = b();
        c2265b70.t.getClass();
        c2265b70.t.getClass();
        c2265b70.t.getClass();
        c2265b70.getClass();
        try {
            Class<?> cls = Class.forName("com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl");
            Class<?> cls2 = Boolean.TYPE;
            Constructor<?> constructor = cls.getConstructor(N8.class, C7375uF.class, C0213Cm0.class, cls2, cls2, Integer.TYPE, InterfaceExecutorServiceC5906mY0.class);
            Boolean bool = Boolean.FALSE;
            O90.d(constructor.newInstance(n8G, c7375uF, c0213Cm0B, bool, bool, 30, null), "null cannot be cast to non-null type com.facebook.imagepipeline.animated.factory.AnimatedFactory");
            throw new ClassCastException();
        } catch (Throwable unused) {
        }
    }

    public final C0213Cm0 b() {
        if (this.d == null) {
            C2265b70 c2265b70 = this.b;
            C0084Av0 c0084Av0 = c2265b70.w;
            QE qe = c2265b70.a;
            C0396Ev0 c0396Ev0 = c2265b70.k;
            C0396Ev0 c0396Ev02 = c2265b70.b;
            c2265b70.t.getClass();
            c2265b70.t.getClass();
            c2265b70.getClass();
            c0084Av0.getClass();
            C0213Cm0 c0213Cm0 = new C0213Cm0(new C5396jt0(11), qe);
            c0396Ev0.getClass();
            this.d = c0213Cm0;
        }
        return this.d;
    }

    public final CC0 c() {
        if (this.e == null) {
            C0213Cm0 c0213Cm0B = b();
            C0318Dv0 c0318Dv0 = this.b.h;
            c0318Dv0.getClass();
            this.e = new CC0(c0213Cm0B, 17, new QQ0(c0318Dv0));
        }
        return this.e;
    }

    public final CC0 d() {
        if (this.g == null) {
            C2265b70 c2265b70 = this.b;
            c2265b70.getClass();
            if (this.f == null) {
                C0213Cm0 c0213Cm0 = new C0213Cm0(new C5396jt0(13), c2265b70.f);
                c2265b70.k.getClass();
                this.f = c0213Cm0;
            }
            C0213Cm0 c0213Cm02 = this.f;
            C0318Dv0 c0318Dv0 = c2265b70.h;
            c0318Dv0.getClass();
            this.g = new CC0(c0213Cm02, 17, new C0136Bm1(16, c0318Dv0));
        }
        return this.g;
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
    public final defpackage.Z60 e() {
        /*
            Method dump skipped, instructions count: 510
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2455c70.e():Z60");
    }

    public final C0593Hj f() {
        if (this.h == null) {
            C7771wK c7771wK = this.i;
            C2265b70 c2265b70 = this.b;
            if (c7771wK == null) {
                this.i = c2265b70.e.H(c2265b70.j);
            }
            C7771wK c7771wK2 = this.i;
            D7 d7 = c2265b70.m;
            c2265b70.getClass();
            VH vhB = d7.b(0);
            C1204Pf c1204PfC = c2265b70.m.c();
            ExecutorService executorService = (ExecutorService) c2265b70.g.a;
            this.h = new C0593Hj(c7771wK2, vhB, c1204PfC, executorService, executorService, c2265b70.h);
        }
        return this.h;
    }

    public final N8 g() {
        if (this.r == null) {
            D7 d7 = this.b.m;
            InterfaceC7173tB0 interfaceC7173tB0H = h();
            O90.f(d7, "poolFactory");
            O90.f(interfaceC7173tB0H, "platformDecoder");
            C1016Mu0 c1016Mu0 = this.c;
            O90.f(c1016Mu0, "closeableReferenceFactory");
            InterfaceC5744li interfaceC5744liA = d7.a();
            O90.e(interfaceC5744liA, "poolFactory.bitmapPool");
            this.r = new N8(interfaceC5744liA, c1016Mu0);
        }
        return this.r;
    }

    public final InterfaceC7173tB0 h() {
        O8 o8;
        if (this.s == null) {
            C2265b70 c2265b70 = this.b;
            D7 d7 = c2265b70.m;
            c2265b70.t.getClass();
            c2265b70.t.getClass();
            C1036Nb c1036Nb = (C1036Nb) c2265b70.t.d;
            O90.f(d7, "poolFactory");
            O90.f(c1036Nb, "platformDecoderOptions");
            if (Build.VERSION.SDK_INT >= 26) {
                InterfaceC5744li interfaceC5744liA = d7.a();
                O90.e(interfaceC5744liA, "poolFactory.bitmapPool");
                o8 = new O8(interfaceC5744liA, AbstractC8156yL1.a(d7), c1036Nb, 1);
            } else {
                InterfaceC5744li interfaceC5744liA2 = d7.a();
                O90.e(interfaceC5744liA2, "poolFactory.bitmapPool");
                o8 = new O8(interfaceC5744liA2, AbstractC8156yL1.a(d7), c1036Nb, 0);
            }
            this.s = o8;
        }
        return this.s;
    }

    public final C0593Hj i() {
        if (this.n == null) {
            C7771wK c7771wK = this.o;
            C2265b70 c2265b70 = this.b;
            if (c7771wK == null) {
                this.o = c2265b70.e.H(c2265b70.s);
            }
            C7771wK c7771wK2 = this.o;
            D7 d7 = c2265b70.m;
            c2265b70.getClass();
            VH vhB = d7.b(0);
            C1204Pf c1204PfC = c2265b70.m.c();
            ExecutorService executorService = (ExecutorService) c2265b70.g.a;
            this.n = new C0593Hj(c7771wK2, vhB, c1204PfC, executorService, executorService, c2265b70.h);
        }
        return this.n;
    }
}
