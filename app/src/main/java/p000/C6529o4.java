package p000;

/* renamed from: o4 */
/* loaded from: classes.dex */
public final class C6529o4 {

    /* renamed from: b */
    public static final C6529o4 f38752b = new C6529o4();

    /* renamed from: c */
    public static final int f38753c;

    /* renamed from: d */
    public static final int f38754d;

    /* renamed from: a */
    public final ExecutorC1215TJ f38755a = new ExecutorC1215TJ(5);

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        f38753c = iAvailableProcessors + 1;
        f38754d = (iAvailableProcessors * 2) + 1;
    }
}
