package io.sentry.util;

/* renamed from: io.sentry.util.e */
/* loaded from: classes2.dex */
public abstract class AbstractC6172e {

    /* renamed from: a */
    public static final boolean f34662a;

    /* renamed from: b */
    public static final boolean f34663b;

    static {
        try {
            f34662a = "The Android Project".equals(System.getProperty("java.vendor"));
        } catch (Throwable unused) {
            f34662a = false;
        }
        try {
            String property = System.getProperty("java.specification.version");
            if (property != null) {
                f34663b = Double.valueOf(property).doubleValue() >= 9.0d;
            } else {
                f34663b = false;
            }
        } catch (Throwable unused2) {
            f34663b = false;
        }
    }
}
