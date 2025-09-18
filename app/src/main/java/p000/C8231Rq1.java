package p000;

/* renamed from: Rq1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8231Rq1 {

    /* renamed from: b */
    public static final C8231Rq1 f10456b = new C8231Rq1();

    /* renamed from: c */
    public static final int f10457c;

    /* renamed from: d */
    public static final int f10458d;

    /* renamed from: a */
    public final ExecutorC1215TJ f10459a = new ExecutorC1215TJ(13);

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        f10457c = iAvailableProcessors + 1;
        f10458d = (iAvailableProcessors * 2) + 1;
    }
}
