package p000;

/* renamed from: jg1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9912jg1 {
    /* renamed from: a */
    public static boolean m22087a(Object obj, C6455mu c6455mu) throws Z90 {
        int iM22993c = c6455mu.m22993c();
        int i = iM22993c >>> 3;
        int i2 = iM22993c & 7;
        if (i2 == 0) {
            ((C9656hg1) obj).m18846c(i << 3, Long.valueOf(c6455mu.m23013w()));
            return true;
        }
        if (i2 == 1) {
            ((C9656hg1) obj).m18846c((i << 3) | 1, Long.valueOf(c6455mu.m23005o()));
            return true;
        }
        if (i2 == 2) {
            ((C9656hg1) obj).m18846c((i << 3) | 2, c6455mu.m22996f());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw Z90.m9497b();
            }
            ((C9656hg1) obj).m18846c((i << 3) | 5, Integer.valueOf(c6455mu.m23003m()));
            return true;
        }
        C9656hg1 c9656hg1M18844b = C9656hg1.m18844b();
        int i3 = i << 3;
        int i4 = i3 | 4;
        while (c6455mu.m22992b() != Integer.MAX_VALUE && m22087a(c9656hg1M18844b, c6455mu)) {
        }
        if (i4 != c6455mu.m22993c()) {
            throw new Z90("Protocol message end-group tag did not match expected tag.");
        }
        c9656hg1M18844b.f28527e = false;
        ((C9656hg1) obj).m18846c(i3 | 3, c9656hg1M18844b);
        return true;
    }

    /* renamed from: b */
    public static C9656hg1 m22088b() {
        return C9656hg1.m18844b();
    }
}
