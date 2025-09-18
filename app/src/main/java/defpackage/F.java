package defpackage;

import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public abstract class F extends C2548cc0 implements InterfaceC1729Vy, InterfaceC0952Lz {
    public final InterfaceC0173Bz c;

    public F(InterfaceC0173Bz interfaceC0173Bz, boolean z) {
        super(z);
        C((InterfaceC1115Ob0) interfaceC0173Bz.g(C0396Ev0.e));
        this.c = interfaceC0173Bz.f(this);
    }

    @Override // defpackage.C2548cc0
    public final void B(C7074sg c7074sg) {
        AbstractC7243tY1.a(this.c, c7074sg);
    }

    @Override // defpackage.C2548cc0
    public final void L(Object obj) {
        if (obj instanceof C6165nv) {
            C6165nv c6165nv = (C6165nv) obj;
            Throwable th = c6165nv.a;
            c6165nv.getClass();
            C6165nv.b.get(c6165nv);
        }
    }

    public final void T(EnumC1186Oz enumC1186Oz, F f, Function2 function2) {
        Object objInvoke;
        int iOrdinal = enumC1186Oz.ordinal();
        C1518Tf1 c1518Tf1 = C1518Tf1.a;
        if (iOrdinal == 0) {
            try {
                EU0.c(AbstractC6383p22.b(AbstractC6383p22.a(f, this, function2)), c1518Tf1);
                return;
            } finally {
                resumeWith(RQ1.b(th));
            }
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                O90.f(function2, "<this>");
                AbstractC6383p22.b(AbstractC6383p22.a(f, this, function2)).resumeWith(c1518Tf1);
                return;
            }
            if (iOrdinal != 3) {
                throw new C7074sg();
            }
            try {
                InterfaceC0173Bz interfaceC0173Bz = this.c;
                Object objD = IJ1.d(interfaceC0173Bz, null);
                try {
                    if (function2 instanceof AbstractC1594Uf) {
                        AbstractC5543ke1.d(2, function2);
                        objInvoke = function2.invoke(f, this);
                    } else {
                        O90.f(function2, "<this>");
                        JN jn = JN.a;
                        InterfaceC0173Bz interfaceC0173Bz2 = this.c;
                        Object r90 = interfaceC0173Bz2 == jn ? new R90(this) : new S90(this, interfaceC0173Bz2);
                        AbstractC5543ke1.d(2, function2);
                        objInvoke = function2.invoke(f, r90);
                    }
                    if (objInvoke != EnumC1030Mz.a) {
                        resumeWith(objInvoke);
                    }
                } finally {
                    IJ1.c(interfaceC0173Bz, objD);
                }
            } catch (Throwable th) {
            }
        }
    }

    @Override // defpackage.InterfaceC0952Lz
    public final InterfaceC0173Bz b() {
        return this.c;
    }

    @Override // defpackage.InterfaceC1729Vy
    public final InterfaceC0173Bz getContext() {
        return this.c;
    }

    @Override // defpackage.C2548cc0
    public final String p() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // defpackage.InterfaceC1729Vy
    public final void resumeWith(Object obj) {
        Throwable thA = PS0.a(obj);
        if (thA != null) {
            obj = new C6165nv(thA, false);
        }
        Object objH = H(obj);
        if (objH == AbstractC4295iA1.b) {
            return;
        }
        h(objH);
    }
}
