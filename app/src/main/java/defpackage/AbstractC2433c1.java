package defpackage;

import java.util.Arrays;

/* renamed from: c1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2433c1 {
    public AbstractC3309d1[] a;
    public int b;
    public int c;

    public final AbstractC3309d1 a() {
        AbstractC3309d1 abstractC3309d1B;
        synchronized (this) {
            try {
                AbstractC3309d1[] abstractC3309d1ArrC = this.a;
                if (abstractC3309d1ArrC == null) {
                    abstractC3309d1ArrC = c();
                    this.a = abstractC3309d1ArrC;
                } else if (this.b >= abstractC3309d1ArrC.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(abstractC3309d1ArrC, abstractC3309d1ArrC.length * 2);
                    O90.e(objArrCopyOf, "copyOf(...)");
                    this.a = (AbstractC3309d1[]) objArrCopyOf;
                    abstractC3309d1ArrC = (AbstractC3309d1[]) objArrCopyOf;
                }
                int i = this.c;
                do {
                    abstractC3309d1B = abstractC3309d1ArrC[i];
                    if (abstractC3309d1B == null) {
                        abstractC3309d1B = b();
                        abstractC3309d1ArrC[i] = abstractC3309d1B;
                    }
                    i++;
                    if (i >= abstractC3309d1ArrC.length) {
                        i = 0;
                    }
                } while (!abstractC3309d1B.a(this));
                this.c = i;
                this.b++;
            } catch (Throwable th) {
                throw th;
            }
        }
        return abstractC3309d1B;
    }

    public abstract AbstractC3309d1 b();

    public abstract AbstractC3309d1[] c();

    public final void d(AbstractC3309d1 abstractC3309d1) {
        int i;
        InterfaceC1729Vy[] interfaceC1729VyArrB;
        synchronized (this) {
            try {
                int i2 = this.b - 1;
                this.b = i2;
                if (i2 == 0) {
                    this.c = 0;
                }
                O90.d(abstractC3309d1, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                interfaceC1729VyArrB = abstractC3309d1.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (InterfaceC1729Vy interfaceC1729Vy : interfaceC1729VyArrB) {
            if (interfaceC1729Vy != null) {
                interfaceC1729Vy.resumeWith(C1518Tf1.a);
            }
        }
    }
}
