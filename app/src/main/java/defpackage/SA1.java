package defpackage;

/* loaded from: classes.dex */
public abstract class SA1 {
    public static final C8139yG a = new C8139yG("NO_OWNER");

    public static C1091Nt0 a() {
        return new C1091Nt0(false);
    }

    public static final int b(int i, int i2, int i3) {
        return Math.min(Math.max(0, i3 - i), i2);
    }

    public static final void c(int i, int i2, int i3, int i4, int i5) {
        ML1.c(i4 >= 0, "count (%d) ! >= 0", Integer.valueOf(i4));
        ML1.c(i >= 0, "offset (%d) ! >= 0", Integer.valueOf(i));
        ML1.c(i3 >= 0, "otherOffset (%d) ! >= 0", Integer.valueOf(i3));
        ML1.c(i + i4 <= i5, "offset (%d) + count (%d) ! <= %d", Integer.valueOf(i), Integer.valueOf(i4), Integer.valueOf(i5));
        ML1.c(i3 + i4 <= i2, "otherOffset (%d) + count (%d) ! <= %d", Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i2));
    }
}
