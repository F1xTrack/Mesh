package defpackage;

/* loaded from: classes.dex */
public final class VS0 {
    public static final VS0 d = new VS0(0, false, false);
    public static final VS0 e = new VS0(500, true, false);
    public static final VS0 f;
    public final long a;
    public final boolean b;
    public final boolean c;

    static {
        new VS0(100L, true, false);
        f = new VS0(0L, false, true);
    }

    public VS0(long j, boolean z, boolean z2) {
        this.b = z;
        this.a = j;
        if (z2) {
            AbstractC3377dM1.d("shouldRetry must be false when completeWithoutFailure is set to true", !z);
        }
        this.c = z2;
    }
}
