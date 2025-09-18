package defpackage;

import android.os.CancellationSignal;
import android.view.animation.LinearInterpolator;

/* renamed from: h12 */
/* loaded from: classes.dex */
public abstract class AbstractC4075h12 {
    public static AV1 a;

    public static final boolean d(AbstractC0663Ig0 abstractC0663Ig0) {
        O90.f(abstractC0663Ig0, "<this>");
        return abstractC0663Ig0.L() instanceof AbstractC3405dW;
    }

    public static final X01 e(AbstractC0663Ig0 abstractC0663Ig0) {
        O90.f(abstractC0663Ig0, "<this>");
        AbstractC1521Tg1 abstractC1521Tg1L = abstractC0663Ig0.L();
        if (abstractC1521Tg1L instanceof AbstractC3405dW) {
            return ((AbstractC3405dW) abstractC1521Tg1L).b;
        }
        if (abstractC1521Tg1L instanceof X01) {
            return (X01) abstractC1521Tg1L;
        }
        throw new C7074sg();
    }

    public static final X01 j(AbstractC0663Ig0 abstractC0663Ig0) {
        O90.f(abstractC0663Ig0, "<this>");
        AbstractC1521Tg1 abstractC1521Tg1L = abstractC0663Ig0.L();
        if (abstractC1521Tg1L instanceof AbstractC3405dW) {
            return ((AbstractC3405dW) abstractC1521Tg1L).c;
        }
        if (abstractC1521Tg1L instanceof X01) {
            return (X01) abstractC1521Tg1L;
        }
        throw new C7074sg();
    }

    public static synchronized V02 k(D02 d02) {
        try {
            if (a == null) {
                a = new AV1(1);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (V02) a.g1(d02);
    }

    public abstract void a(LinearInterpolator linearInterpolator, CancellationSignal cancellationSignal, C1907Yf0 c1907Yf0);

    public abstract int b();

    public abstract void c(int i);

    public abstract void g(boolean z);

    public abstract void h(int i);

    public abstract void i(int i);

    public void f(boolean z) {
    }
}
