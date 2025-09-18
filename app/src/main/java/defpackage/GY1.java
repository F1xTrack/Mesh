package defpackage;

import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public abstract class GY1 {
    public static int a;

    public static final Object a(long j, Function2 function2, AbstractC1963Yy abstractC1963Yy) {
        Object c6165nv;
        Object objH;
        if (j <= 0) {
            throw new C0412Fa1("Timed out immediately", null);
        }
        RunnableC0490Ga1 runnableC0490Ga1 = new RunnableC0490Ga1(j, abstractC1963Yy);
        M22.c(runnableC0490Ga1, true, new NK(0, AZ1.c(runnableC0490Ga1.d.getContext()).a(runnableC0490Ga1.e, runnableC0490Ga1, runnableC0490Ga1.c)));
        try {
            AbstractC5543ke1.d(2, function2);
            c6165nv = function2.invoke(runnableC0490Ga1, runnableC0490Ga1);
        } catch (Throwable th) {
            c6165nv = new C6165nv(th, false);
        }
        Object obj = EnumC1030Mz.a;
        if (c6165nv == obj || (objH = runnableC0490Ga1.H(c6165nv)) == AbstractC4295iA1.b) {
            return obj;
        }
        if (objH instanceof C6165nv) {
            Throwable th2 = ((C6165nv) objH).a;
            if (!(th2 instanceof C0412Fa1) || ((C0412Fa1) th2).a != runnableC0490Ga1) {
                throw th2;
            }
            if (c6165nv instanceof C6165nv) {
                throw ((C6165nv) c6165nv).a;
            }
        } else {
            c6165nv = AbstractC4295iA1.a(objH);
        }
        return c6165nv;
    }
}
