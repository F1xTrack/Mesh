package p000;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class B40 {

    /* renamed from: f */
    public static final C6989v4 f545f = C6989v4.m25319d();

    /* renamed from: a */
    public final C8654Zu0 f546a;

    /* renamed from: b */
    public final C7731Ia1 f547b;

    /* renamed from: e */
    public final boolean f550e;

    /* renamed from: d */
    public boolean f549d = false;

    /* renamed from: c */
    public final ConcurrentHashMap f548c = new ConcurrentHashMap();

    public B40(String str, String str2, C8619Zc1 c8619Zc1, C7731Ia1 c7731Ia1) {
        this.f550e = false;
        this.f547b = c7731Ia1;
        C8654Zu0 c8654Zu0 = new C8654Zu0(c8619Zc1);
        c8654Zu0.m9636k(str);
        c8654Zu0.m9629d(str2);
        this.f546a = c8654Zu0;
        c8654Zu0.f15216h = true;
        if (C0751Lw.m5135e().m5156u()) {
            return;
        }
        f545f.m25323e("HttpMetric feature is disabled. URL %s", str);
        this.f550e = true;
    }
}
