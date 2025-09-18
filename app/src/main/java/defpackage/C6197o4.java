package defpackage;

/* renamed from: o4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6197o4 {
    public static final C6197o4 b = new C6197o4();
    public static final int c;
    public static final int d;
    public final TJ a = new TJ(5);

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        c = iAvailableProcessors + 1;
        d = (iAvailableProcessors * 2) + 1;
    }
}
