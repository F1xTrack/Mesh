package p000;

import kotlin.jvm.functions.Function2;

/* renamed from: F */
/* loaded from: classes2.dex */
public abstract class AbstractC0315F extends C9002cc0 implements InterfaceC1382Vy, InterfaceC0754Lz {

    /* renamed from: c */
    public final InterfaceC0125Bz f3003c;

    public AbstractC0315F(InterfaceC0125Bz interfaceC0125Bz, boolean z) {
        super(z);
        m10797C((InterfaceC8044Ob0) interfaceC0125Bz.mo937g(C7564Ev0.f2962e));
        this.f3003c = interfaceC0125Bz.mo936f(this);
    }

    @Override // p000.C9002cc0
    /* renamed from: B */
    public final void mo2466B(C6838sg c6838sg) {
        AbstractC11176tY1.m24942a(this.f3003c, c6838sg);
    }

    @Override // p000.C9002cc0
    /* renamed from: L */
    public final void mo2467L(Object obj) {
        if (obj instanceof C6519nv) {
            C6519nv c6519nv = (C6519nv) obj;
            Throwable th = c6519nv.f38606a;
            c6519nv.getClass();
            C6519nv.f38605b.get(c6519nv);
        }
    }

    /* renamed from: T */
    public final void m2468T(EnumC0943Oz enumC0943Oz, AbstractC0315F abstractC0315F, Function2 function2) {
        Object objInvoke;
        int iOrdinal = enumC0943Oz.ordinal();
        C8313Tf1 c8313Tf1 = C8313Tf1.f11463a;
        if (iOrdinal == 0) {
            try {
                EU0.m2316c(AbstractC10599p22.m23595b(AbstractC10599p22.m23594a(abstractC0315F, this, function2)), c8313Tf1);
                return;
            } finally {
                resumeWith(RQ1.m7015b(th));
            }
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                O90.m5968f(function2, "<this>");
                AbstractC10599p22.m23595b(AbstractC10599p22.m23594a(abstractC0315F, this, function2)).resumeWith(c8313Tf1);
                return;
            }
            if (iOrdinal != 3) {
                throw new C6838sg();
            }
            try {
                InterfaceC0125Bz interfaceC0125Bz = this.f3003c;
                Object objM3817d = IJ1.m3817d(interfaceC0125Bz, null);
                try {
                    if (function2 instanceof AbstractC1300Uf) {
                        AbstractC10036ke1.m22229d(2, function2);
                        objInvoke = function2.invoke(abstractC0315F, this);
                    } else {
                        O90.m5968f(function2, "<this>");
                        C0591JN c0591jn = C0591JN.f5499a;
                        InterfaceC0125Bz interfaceC0125Bz2 = this.f3003c;
                        Object r90 = interfaceC0125Bz2 == c0591jn ? new R90(this) : new S90(this, interfaceC0125Bz2);
                        AbstractC10036ke1.m22229d(2, function2);
                        objInvoke = function2.invoke(abstractC0315F, r90);
                    }
                    if (objInvoke != EnumC0817Mz.f7418a) {
                        resumeWith(objInvoke);
                    }
                } finally {
                    IJ1.m3816c(interfaceC0125Bz, objM3817d);
                }
            } catch (Throwable th) {
            }
        }
    }

    @Override // p000.InterfaceC0754Lz
    /* renamed from: b */
    public final InterfaceC0125Bz mo2469b() {
        return this.f3003c;
    }

    @Override // p000.InterfaceC1382Vy
    public final InterfaceC0125Bz getContext() {
        return this.f3003c;
    }

    @Override // p000.C9002cc0
    /* renamed from: p */
    public final String mo2470p() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // p000.InterfaceC1382Vy
    public final void resumeWith(Object obj) {
        Throwable thM6365a = PS0.m6365a(obj);
        if (thM6365a != null) {
            obj = new C6519nv(thM6365a, false);
        }
        Object objM10801H = m10801H(obj);
        if (objM10801H == AbstractC9720iA1.f28866b) {
            return;
        }
        mo4337h(objM10801H);
    }
}
