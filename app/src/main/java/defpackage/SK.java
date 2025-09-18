package defpackage;

import android.graphics.PointF;

/* loaded from: classes.dex */
public final class SK {
    public String a;
    public String b;
    public float c;
    public int d;
    public int e;
    public float f;
    public float g;
    public int h;
    public int i;
    public float j;
    public boolean k;
    public PointF l;
    public PointF m;

    public final int hashCode() {
        int iX = ((AbstractC8235ym.x(this.d) + (((int) (AbstractC1705Vq.e(this.a.hashCode() * 31, 31, this.b) + this.c)) * 31)) * 31) + this.e;
        long jFloatToRawIntBits = Float.floatToRawIntBits(this.f);
        return (((iX * 31) + ((int) (jFloatToRawIntBits ^ (jFloatToRawIntBits >>> 32)))) * 31) + this.h;
    }
}
