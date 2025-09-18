package p000;

/* renamed from: ft1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC9426ft1 {

    /* renamed from: a */
    public static final ExecutorC1215TJ f27446a = new ExecutorC1215TJ(9);

    /* renamed from: a */
    public static int m18303a(double d) {
        if (Double.isNaN(d)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        if (d > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        }
        if (d < -2.147483648E9d) {
            return Integer.MIN_VALUE;
        }
        return (int) Math.round(d);
    }

    /* renamed from: b */
    public static int m18304b(float f) {
        if (Float.isNaN(f)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f);
    }
}
