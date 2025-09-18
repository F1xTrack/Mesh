package p000;

/* renamed from: Wh */
/* loaded from: classes.dex */
public abstract class AbstractC1428Wh {

    /* renamed from: a */
    public static final int f13318a;

    /* renamed from: b */
    public static final int f13319b;

    /* renamed from: c */
    public static volatile C1365Vh f13320c;

    static {
        int iMin = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        f13318a = ((long) iMin) > 16777216 ? (iMin / 4) * 3 : iMin / 2;
        f13319b = 384;
    }
}
