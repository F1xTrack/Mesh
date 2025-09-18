package p000;

/* renamed from: tF */
/* loaded from: classes2.dex */
public abstract class AbstractC6874tF {

    /* renamed from: a */
    public static final InterfaceC6939uH f42962a;

    static {
        String property;
        C11747y20 c11747y20;
        int i = Z71.f14753a;
        try {
            property = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null ? Boolean.parseBoolean(property) : false) {
            C0399GK c0399gk = C0399GK.f3694a;
            C11747y20 c11747y202 = AbstractC7702Hm0.f4486a;
            C11747y20 c11747y203 = c11747y202.f46046f;
            c11747y20 = !(c11747y202 instanceof InterfaceC6939uH) ? RunnableC6811sF.f42334j : c11747y202;
        } else {
            c11747y20 = RunnableC6811sF.f42334j;
        }
        f42962a = c11747y20;
    }
}
