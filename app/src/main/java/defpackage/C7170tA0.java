package defpackage;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.ArrayList;

/* renamed from: tA0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7170tA0 extends AbstractC6503pg0 {
    public final PointF i;
    public final float[] j;
    public final float[] k;
    public final PathMeasure l;
    public C6979sA0 m;

    public C7170tA0(ArrayList arrayList) {
        super(arrayList);
        this.i = new PointF();
        this.j = new float[2];
        this.k = new float[2];
        this.l = new PathMeasure();
    }

    @Override // defpackage.AbstractC5738lg
    public final Object f(C6312og0 c6312og0, float f) {
        C6979sA0 c6979sA0 = (C6979sA0) c6312og0;
        Path path = c6979sA0.q;
        ES1 es1 = this.e;
        if (es1 != null && c6312og0.h != null) {
            PointF pointF = (PointF) es1.z(c6979sA0.g, c6979sA0.h.floatValue(), (PointF) c6979sA0.b, (PointF) c6979sA0.c, d(), f, this.d);
            if (pointF != null) {
                return pointF;
            }
        }
        if (path == null) {
            return (PointF) c6312og0.b;
        }
        C6979sA0 c6979sA02 = this.m;
        PathMeasure pathMeasure = this.l;
        if (c6979sA02 != c6979sA0) {
            pathMeasure.setPath(path, false);
            this.m = c6979sA0;
        }
        float length = pathMeasure.getLength();
        float f2 = f * length;
        float[] fArr = this.j;
        float[] fArr2 = this.k;
        pathMeasure.getPosTan(f2, fArr, fArr2);
        PointF pointF2 = this.i;
        pointF2.set(fArr[0], fArr[1]);
        if (f2 < 0.0f) {
            pointF2.offset(fArr2[0] * f2, fArr2[1] * f2);
            return pointF2;
        }
        if (f2 <= length) {
            return pointF2;
        }
        float f3 = f2 - length;
        pointF2.offset(fArr2[0] * f3, fArr2[1] * f3);
        return pointF2;
    }
}
