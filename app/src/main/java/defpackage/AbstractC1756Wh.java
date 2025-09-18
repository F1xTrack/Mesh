package defpackage;

/* renamed from: Wh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1756Wh {
    public static final int a;
    public static final int b;
    public static volatile C1678Vh c;

    static {
        int iMin = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        a = ((long) iMin) > 16777216 ? (iMin / 4) * 3 : iMin / 2;
        b = 384;
    }
}
