package defpackage;

/* renamed from: Rq1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1395Rq1 {
    public static final C1395Rq1 b = new C1395Rq1();
    public static final int c;
    public static final int d;
    public final TJ a = new TJ(13);

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        c = iAvailableProcessors + 1;
        d = (iAvailableProcessors * 2) + 1;
    }
}
