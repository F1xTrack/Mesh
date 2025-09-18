package defpackage;

/* renamed from: cM1 */
/* loaded from: classes.dex */
public abstract class AbstractC2501cM1 {
    public static void d(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    public abstract boolean a(AbstractC5608l0 abstractC5608l0, W w, W w2);

    public abstract boolean b(AbstractC5608l0 abstractC5608l0, Object obj, Object obj2);

    public abstract boolean c(AbstractC5608l0 abstractC5608l0, C5226j0 c5226j0, C5226j0 c5226j02);

    public abstract W e(AbstractC5608l0 abstractC5608l0);

    public abstract C5226j0 f(AbstractC5608l0 abstractC5608l0);

    public abstract void g(C5226j0 c5226j0, C5226j0 c5226j02);

    public abstract void h(C5226j0 c5226j0, Thread thread);
}
