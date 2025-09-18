package p000;

import java.util.Arrays;

/* renamed from: c1 */
/* loaded from: classes2.dex */
public abstract class AbstractC1821c1 {

    /* renamed from: a */
    public AbstractC3902d1[] f17259a;

    /* renamed from: b */
    public int f17260b;

    /* renamed from: c */
    public int f17261c;

    /* renamed from: a */
    public final AbstractC3902d1 m10560a() {
        AbstractC3902d1 abstractC3902d1Mo487b;
        synchronized (this) {
            try {
                AbstractC3902d1[] abstractC3902d1ArrMo488c = this.f17259a;
                if (abstractC3902d1ArrMo488c == null) {
                    abstractC3902d1ArrMo488c = mo488c();
                    this.f17259a = abstractC3902d1ArrMo488c;
                } else if (this.f17260b >= abstractC3902d1ArrMo488c.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(abstractC3902d1ArrMo488c, abstractC3902d1ArrMo488c.length * 2);
                    O90.m5967e(objArrCopyOf, "copyOf(...)");
                    this.f17259a = (AbstractC3902d1[]) objArrCopyOf;
                    abstractC3902d1ArrMo488c = (AbstractC3902d1[]) objArrCopyOf;
                }
                int i = this.f17261c;
                do {
                    abstractC3902d1Mo487b = abstractC3902d1ArrMo488c[i];
                    if (abstractC3902d1Mo487b == null) {
                        abstractC3902d1Mo487b = mo487b();
                        abstractC3902d1ArrMo488c[i] = abstractC3902d1Mo487b;
                    }
                    i++;
                    if (i >= abstractC3902d1ArrMo488c.length) {
                        i = 0;
                    }
                } while (!abstractC3902d1Mo487b.mo977a(this));
                this.f17261c = i;
                this.f17260b++;
            } catch (Throwable th) {
                throw th;
            }
        }
        return abstractC3902d1Mo487b;
    }

    /* renamed from: b */
    public abstract AbstractC3902d1 mo487b();

    /* renamed from: c */
    public abstract AbstractC3902d1[] mo488c();

    /* renamed from: d */
    public final void m10561d(AbstractC3902d1 abstractC3902d1) {
        int i;
        InterfaceC1382Vy[] interfaceC1382VyArrMo978b;
        synchronized (this) {
            try {
                int i2 = this.f17260b - 1;
                this.f17260b = i2;
                if (i2 == 0) {
                    this.f17261c = 0;
                }
                O90.m5966d(abstractC3902d1, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                interfaceC1382VyArrMo978b = abstractC3902d1.mo978b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (InterfaceC1382Vy interfaceC1382Vy : interfaceC1382VyArrMo978b) {
            if (interfaceC1382Vy != null) {
                interfaceC1382Vy.resumeWith(C8313Tf1.f11463a);
            }
        }
    }
}
