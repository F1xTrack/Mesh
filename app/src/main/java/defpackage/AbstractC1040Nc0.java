package defpackage;

/* renamed from: Nc0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1040Nc0 {
    public static final KX a;
    public static final C0074As b;

    static {
        KX kx = new KX("kotlin.jvm.JvmField");
        a = kx;
        C0074As.j(kx);
        C0074As.j(new KX("kotlin.reflect.jvm.internal.ReflectionFactoryImpl"));
        b = C0074As.e("kotlin/jvm/internal/RepeatableContainer", false);
    }

    public static final String a(String str) {
        O90.f(str, "propertyName");
        if (c(str)) {
            return str;
        }
        return "get" + AbstractC3585eS1.a(str);
    }

    public static final String b(String str) {
        String strA;
        StringBuilder sb = new StringBuilder("set");
        if (c(str)) {
            strA = str.substring(2);
            O90.e(strA, "substring(...)");
        } else {
            strA = AbstractC3585eS1.a(str);
        }
        sb.append(strA);
        return sb.toString();
    }

    public static final boolean c(String str) {
        O90.f(str, "name");
        if (!D51.o(str, "is", false) || str.length() == 2) {
            return false;
        }
        char cCharAt = str.charAt(2);
        return O90.h(97, cCharAt) > 0 || O90.h(cCharAt, 122) > 0;
    }
}
