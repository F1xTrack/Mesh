package defpackage;

/* loaded from: classes2.dex */
public abstract class B51 extends A51 {
    public static Double e(String str) {
        O90.f(str, "<this>");
        try {
            if (AbstractC2340bW0.a.b(str)) {
                return Double.valueOf(Double.parseDouble(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}
