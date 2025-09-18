package p000;

import android.graphics.PointF;

/* renamed from: sB */
/* loaded from: classes.dex */
public final class C6807sB {

    /* renamed from: a */
    public final PointF f42286a;

    /* renamed from: b */
    public final PointF f42287b;

    /* renamed from: c */
    public final PointF f42288c;

    public C6807sB() {
        this.f42286a = new PointF();
        this.f42287b = new PointF();
        this.f42288c = new PointF();
    }

    public final String toString() {
        PointF pointF = this.f42288c;
        Float fValueOf = Float.valueOf(pointF.x);
        Float fValueOf2 = Float.valueOf(pointF.y);
        PointF pointF2 = this.f42286a;
        Float fValueOf3 = Float.valueOf(pointF2.x);
        Float fValueOf4 = Float.valueOf(pointF2.y);
        PointF pointF3 = this.f42287b;
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", fValueOf, fValueOf2, fValueOf3, fValueOf4, Float.valueOf(pointF3.x), Float.valueOf(pointF3.y));
    }

    public C6807sB(PointF pointF, PointF pointF2, PointF pointF3) {
        this.f42286a = pointF;
        this.f42287b = pointF2;
        this.f42288c = pointF3;
    }
}
