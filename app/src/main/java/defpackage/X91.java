package defpackage;

/* loaded from: classes2.dex */
public abstract class X91 {
    public static final ThreadLocal a = new ThreadLocal();

    public static KP a() {
        ThreadLocal threadLocal = a;
        KP kp = (KP) threadLocal.get();
        if (kp != null) {
            return kp;
        }
        C0278Di c0278Di = new C0278Di(Thread.currentThread());
        threadLocal.set(c0278Di);
        return c0278Di;
    }
}
