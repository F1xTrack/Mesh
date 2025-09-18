package p000;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* renamed from: i0 */
/* loaded from: classes.dex */
public final class C4215i0 extends AbstractC8971cM1 {

    /* renamed from: a */
    public static final Unsafe f28743a;

    /* renamed from: b */
    public static final long f28744b;

    /* renamed from: c */
    public static final long f28745c;

    /* renamed from: d */
    public static final long f28746d;

    /* renamed from: e */
    public static final long f28747e;

    /* renamed from: f */
    public static final long f28748f;

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new C4152h0());
            }
            try {
                f28745c = unsafe.objectFieldOffset(AbstractC6336l0.class.getDeclaredField("c"));
                f28744b = unsafe.objectFieldOffset(AbstractC6336l0.class.getDeclaredField("b"));
                f28746d = unsafe.objectFieldOffset(AbstractC6336l0.class.getDeclaredField("a"));
                f28747e = unsafe.objectFieldOffset(C6210j0.class.getDeclaredField("a"));
                f28748f = unsafe.objectFieldOffset(C6210j0.class.getDeclaredField("b"));
                f28743a = unsafe;
            } catch (NoSuchFieldException e) {
                throw new RuntimeException(e);
            }
        } catch (PrivilegedActionException e2) {
            throw new RuntimeException("Could not initialize intrinsics", e2.getCause());
        }
    }

    @Override // p000.AbstractC8971cM1
    /* renamed from: a */
    public final boolean mo9190a(AbstractC6336l0 abstractC6336l0, C1384W c1384w, C1384W c1384w2) {
        return AbstractC4026f0.m18144a(f28743a, abstractC6336l0, f28744b, c1384w, c1384w2);
    }

    @Override // p000.AbstractC8971cM1
    /* renamed from: b */
    public final boolean mo9191b(AbstractC6336l0 abstractC6336l0, Object obj, Object obj2) {
        return AbstractC4089g0.m18374a(f28743a, abstractC6336l0, f28746d, obj, obj2);
    }

    @Override // p000.AbstractC8971cM1
    /* renamed from: c */
    public final boolean mo9192c(AbstractC6336l0 abstractC6336l0, C6210j0 c6210j0, C6210j0 c6210j02) {
        return AbstractC3963e0.m17811a(f28743a, abstractC6336l0, f28745c, c6210j0, c6210j02);
    }

    @Override // p000.AbstractC8971cM1
    /* renamed from: e */
    public final C1384W mo9193e(AbstractC6336l0 abstractC6336l0) {
        C1384W c1384w;
        C1384W c1384w2 = C1384W.f12911d;
        do {
            c1384w = abstractC6336l0.f36800b;
            if (c1384w2 == c1384w) {
                return c1384w;
            }
        } while (!mo9190a(abstractC6336l0, c1384w, c1384w2));
        return c1384w;
    }

    @Override // p000.AbstractC8971cM1
    /* renamed from: f */
    public final C6210j0 mo9194f(AbstractC6336l0 abstractC6336l0) {
        C6210j0 c6210j0;
        C6210j0 c6210j02 = C6210j0.f34836c;
        do {
            c6210j0 = abstractC6336l0.f36801c;
            if (c6210j02 == c6210j0) {
                return c6210j0;
            }
        } while (!mo9192c(abstractC6336l0, c6210j0, c6210j02));
        return c6210j0;
    }

    @Override // p000.AbstractC8971cM1
    /* renamed from: g */
    public final void mo9195g(C6210j0 c6210j0, C6210j0 c6210j02) {
        f28743a.putObject(c6210j0, f28748f, c6210j02);
    }

    @Override // p000.AbstractC8971cM1
    /* renamed from: h */
    public final void mo9196h(C6210j0 c6210j0, Thread thread) {
        f28743a.putObject(c6210j0, f28747e, thread);
    }
}
