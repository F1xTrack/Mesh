package p000;

import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public abstract class GY1 {

    /* renamed from: a */
    public static int f3801a;

    /* renamed from: a */
    public static final Object m3082a(long j, Function2 function2, AbstractC1571Yy abstractC1571Yy) {
        Object c6519nv;
        Object objM10801H;
        if (j <= 0) {
            throw new C7575Fa1("Timed out immediately", null);
        }
        RunnableC7627Ga1 runnableC7627Ga1 = new RunnableC7627Ga1(j, abstractC1571Yy);
        M22.m5249c(runnableC7627Ga1, true, new C0839NK(0, AZ1.m235c(runnableC7627Ga1.f5561d.getContext()).mo4311a(runnableC7627Ga1.f3807e, runnableC7627Ga1, runnableC7627Ga1.f3003c)));
        try {
            AbstractC10036ke1.m22229d(2, function2);
            c6519nv = function2.invoke(runnableC7627Ga1, runnableC7627Ga1);
        } catch (Throwable th) {
            c6519nv = new C6519nv(th, false);
        }
        Object obj = EnumC0817Mz.f7418a;
        if (c6519nv == obj || (objM10801H = runnableC7627Ga1.m10801H(c6519nv)) == AbstractC9720iA1.f28866b) {
            return obj;
        }
        if (objM10801H instanceof C6519nv) {
            Throwable th2 = ((C6519nv) objM10801H).f38606a;
            if (!(th2 instanceof C7575Fa1) || ((C7575Fa1) th2).f3315a != runnableC7627Ga1) {
                throw th2;
            }
            if (c6519nv instanceof C6519nv) {
                throw ((C6519nv) c6519nv).f38606a;
            }
        } else {
            c6519nv = AbstractC9720iA1.m18978a(objM10801H);
        }
        return c6519nv;
    }
}
