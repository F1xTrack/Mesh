package defpackage;

/* renamed from: jg1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5358jg1 {
    public static boolean a(Object obj, C5971mu c5971mu) throws Z90 {
        int iC = c5971mu.c();
        int i = iC >>> 3;
        int i2 = iC & 7;
        if (i2 == 0) {
            ((C4200hg1) obj).c(i << 3, Long.valueOf(c5971mu.w()));
            return true;
        }
        if (i2 == 1) {
            ((C4200hg1) obj).c((i << 3) | 1, Long.valueOf(c5971mu.o()));
            return true;
        }
        if (i2 == 2) {
            ((C4200hg1) obj).c((i << 3) | 2, c5971mu.f());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw Z90.b();
            }
            ((C4200hg1) obj).c((i << 3) | 5, Integer.valueOf(c5971mu.m()));
            return true;
        }
        C4200hg1 c4200hg1B = C4200hg1.b();
        int i3 = i << 3;
        int i4 = i3 | 4;
        while (c5971mu.b() != Integer.MAX_VALUE && a(c4200hg1B, c5971mu)) {
        }
        if (i4 != c5971mu.c()) {
            throw new Z90("Protocol message end-group tag did not match expected tag.");
        }
        c4200hg1B.e = false;
        ((C4200hg1) obj).c(i3 | 3, c4200hg1B);
        return true;
    }

    public static C4200hg1 b() {
        return C4200hg1.b();
    }
}
