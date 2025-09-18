package p000;

/* loaded from: classes.dex */
public final class VS0 {

    /* renamed from: d */
    public static final VS0 f12579d = new VS0(0, false, false);

    /* renamed from: e */
    public static final VS0 f12580e = new VS0(500, true, false);

    /* renamed from: f */
    public static final VS0 f12581f;

    /* renamed from: a */
    public final long f12582a;

    /* renamed from: b */
    public final boolean f12583b;

    /* renamed from: c */
    public final boolean f12584c;

    static {
        new VS0(100L, true, false);
        f12581f = new VS0(0L, false, true);
    }

    public VS0(long j, boolean z, boolean z2) {
        this.f12583b = z;
        this.f12582a = j;
        if (z2) {
            AbstractC9104dM1.m17545d("shouldRetry must be false when completeWithoutFailure is set to true", !z);
        }
        this.f12584c = z2;
    }
}
