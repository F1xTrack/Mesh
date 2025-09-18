package p000;

/* renamed from: c4 */
/* loaded from: classes.dex */
public abstract class AbstractC1824c4 {

    /* renamed from: a */
    public static final Class f17277a;

    /* renamed from: b */
    public static final boolean f17278b;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f17277a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f17278b = cls2 != null;
    }

    /* renamed from: a */
    public static boolean m10584a() {
        return (f17277a == null || f17278b) ? false : true;
    }
}
