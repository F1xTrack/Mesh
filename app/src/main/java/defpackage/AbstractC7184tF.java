package defpackage;

/* renamed from: tF, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC7184tF {
    public static final InterfaceC7381uH a;

    static {
        String property;
        C8097y20 c8097y20;
        int i = Z71.a;
        try {
            property = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null ? Boolean.parseBoolean(property) : false) {
            GK gk = GK.a;
            C8097y20 c8097y202 = AbstractC0603Hm0.a;
            C8097y20 c8097y203 = c8097y202.f;
            c8097y20 = !(c8097y202 instanceof InterfaceC7381uH) ? RunnableC6993sF.j : c8097y202;
        } else {
            c8097y20 = RunnableC6993sF.j;
        }
        a = c8097y20;
    }
}
