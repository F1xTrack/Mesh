package p000;

/* renamed from: Nc0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC7994Nc0 {

    /* renamed from: a */
    public static final C0664KX f7911a;

    /* renamed from: b */
    public static final C0055As f7912b;

    static {
        C0664KX c0664kx = new C0664KX("kotlin.jvm.JvmField");
        f7911a = c0664kx;
        C0055As.m358j(c0664kx);
        C0055As.m358j(new C0664KX("kotlin.reflect.jvm.internal.ReflectionFactoryImpl"));
        f7912b = C0055As.m357e("kotlin/jvm/internal/RepeatableContainer", false);
    }

    /* renamed from: a */
    public static final String m5784a(String str) {
        O90.m5968f(str, "propertyName");
        if (m5786c(str)) {
            return str;
        }
        return "get" + AbstractC9244eS1.m17991a(str);
    }

    /* renamed from: b */
    public static final String m5785b(String str) {
        String strM17991a;
        StringBuilder sb = new StringBuilder("set");
        if (m5786c(str)) {
            strM17991a = str.substring(2);
            O90.m5967e(strM17991a, "substring(...)");
        } else {
            strM17991a = AbstractC9244eS1.m17991a(str);
        }
        sb.append(strM17991a);
        return sb.toString();
    }

    /* renamed from: c */
    public static final boolean m5786c(String str) {
        O90.m5968f(str, "name");
        if (!D51.m1556o(str, "is", false) || str.length() == 2) {
            return false;
        }
        char cCharAt = str.charAt(2);
        return O90.m5970h(97, cCharAt) > 0 || O90.m5970h(cCharAt, 122) > 0;
    }
}
