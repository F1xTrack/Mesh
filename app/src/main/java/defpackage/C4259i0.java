package defpackage;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* renamed from: i0 */
/* loaded from: classes.dex */
public final class C4259i0 extends AbstractC2501cM1 {
    public static final Unsafe a;
    public static final long b;
    public static final long c;
    public static final long d;
    public static final long e;
    public static final long f;

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new C4068h0());
            }
            try {
                c = unsafe.objectFieldOffset(AbstractC5608l0.class.getDeclaredField("c"));
                b = unsafe.objectFieldOffset(AbstractC5608l0.class.getDeclaredField("b"));
                d = unsafe.objectFieldOffset(AbstractC5608l0.class.getDeclaredField("a"));
                e = unsafe.objectFieldOffset(C5226j0.class.getDeclaredField("a"));
                f = unsafe.objectFieldOffset(C5226j0.class.getDeclaredField("b"));
                a = unsafe;
            } catch (NoSuchFieldException e2) {
                throw new RuntimeException(e2);
            }
        } catch (PrivilegedActionException e3) {
            throw new RuntimeException("Could not initialize intrinsics", e3.getCause());
        }
    }

    @Override // defpackage.AbstractC2501cM1
    public final boolean a(AbstractC5608l0 abstractC5608l0, W w, W w2) {
        return AbstractC3686f0.a(a, abstractC5608l0, b, w, w2);
    }

    @Override // defpackage.AbstractC2501cM1
    public final boolean b(AbstractC5608l0 abstractC5608l0, Object obj, Object obj2) {
        return AbstractC3877g0.a(a, abstractC5608l0, d, obj, obj2);
    }

    @Override // defpackage.AbstractC2501cM1
    public final boolean c(AbstractC5608l0 abstractC5608l0, C5226j0 c5226j0, C5226j0 c5226j02) {
        return AbstractC3495e0.a(a, abstractC5608l0, c, c5226j0, c5226j02);
    }

    @Override // defpackage.AbstractC2501cM1
    public final W e(AbstractC5608l0 abstractC5608l0) {
        W w;
        W w2 = W.d;
        do {
            w = abstractC5608l0.b;
            if (w2 == w) {
                return w;
            }
        } while (!a(abstractC5608l0, w, w2));
        return w;
    }

    @Override // defpackage.AbstractC2501cM1
    public final C5226j0 f(AbstractC5608l0 abstractC5608l0) {
        C5226j0 c5226j0;
        C5226j0 c5226j02 = C5226j0.c;
        do {
            c5226j0 = abstractC5608l0.c;
            if (c5226j02 == c5226j0) {
                return c5226j0;
            }
        } while (!c(abstractC5608l0, c5226j0, c5226j02));
        return c5226j0;
    }

    @Override // defpackage.AbstractC2501cM1
    public final void g(C5226j0 c5226j0, C5226j0 c5226j02) {
        a.putObject(c5226j0, f, c5226j02);
    }

    @Override // defpackage.AbstractC2501cM1
    public final void h(C5226j0 c5226j0, Thread thread) {
        a.putObject(c5226j0, e, thread);
    }
}
