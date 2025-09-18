package p000;

/* renamed from: d4 */
/* loaded from: classes.dex */
public abstract class AbstractC3905d4 {

    /* renamed from: a */
    public static final Class f25790a;

    /* renamed from: b */
    public static final boolean f25791b;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f25790a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f25791b = cls2 != null;
    }

    /* renamed from: a */
    public static boolean m17482a() {
        return (f25790a == null || f25791b) ? false : true;
    }
}
