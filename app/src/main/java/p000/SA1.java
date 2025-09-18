package p000;

/* loaded from: classes.dex */
public abstract class SA1 {

    /* renamed from: a */
    public static final C7190yG f10607a = new C7190yG("NO_OWNER");

    /* renamed from: a */
    public static C8028Nt0 m7187a() {
        return new C8028Nt0(false);
    }

    /* renamed from: b */
    public static final int m7188b(int i, int i2, int i3) {
        return Math.min(Math.max(0, i3 - i), i2);
    }

    /* renamed from: c */
    public static final void m7189c(int i, int i2, int i3, int i4, int i5) {
        ML1.m5336c(i4 >= 0, "count (%d) ! >= 0", Integer.valueOf(i4));
        ML1.m5336c(i >= 0, "offset (%d) ! >= 0", Integer.valueOf(i));
        ML1.m5336c(i3 >= 0, "otherOffset (%d) ! >= 0", Integer.valueOf(i3));
        ML1.m5336c(i + i4 <= i5, "offset (%d) + count (%d) ! <= %d", Integer.valueOf(i), Integer.valueOf(i4), Integer.valueOf(i5));
        ML1.m5336c(i3 + i4 <= i2, "otherOffset (%d) + count (%d) ! <= %d", Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i2));
    }
}
