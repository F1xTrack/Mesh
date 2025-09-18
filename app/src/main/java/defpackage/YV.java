package defpackage;

/* loaded from: classes2.dex */
public abstract class YV {
    public final int a;
    public final int b;

    public YV(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public static WV a(YV yv) {
        return new WV(yv.a + yv.b, 1);
    }

    public static WV b() {
        return new WV(0, 1);
    }
}
