package p000;

/* loaded from: classes2.dex */
public abstract class X91 {

    /* renamed from: a */
    public static final ThreadLocal f13583a = new ThreadLocal();

    /* renamed from: a */
    public static AbstractC0656KP m8938a() {
        ThreadLocal threadLocal = f13583a;
        AbstractC0656KP abstractC0656KP = (AbstractC0656KP) threadLocal.get();
        if (abstractC0656KP != null) {
            return abstractC0656KP;
        }
        C0234Di c0234Di = new C0234Di(Thread.currentThread());
        threadLocal.set(c0234Di);
        return c0234Di;
    }
}
