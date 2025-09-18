package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class B40 {
    public static final C7533v4 f = C7533v4.d();
    public final C2030Zu0 a;
    public final C0646Ia1 b;
    public final boolean e;
    public boolean d = false;
    public final ConcurrentHashMap c = new ConcurrentHashMap();

    public B40(String str, String str2, C1977Zc1 c1977Zc1, C0646Ia1 c0646Ia1) {
        this.e = false;
        this.b = c0646Ia1;
        C2030Zu0 c2030Zu0 = new C2030Zu0(c1977Zc1);
        c2030Zu0.k(str);
        c2030Zu0.d(str2);
        this.a = c2030Zu0;
        c2030Zu0.h = true;
        if (C0943Lw.e().u()) {
            return;
        }
        f.e("HttpMetric feature is disabled. URL %s", str);
        this.e = true;
    }
}
