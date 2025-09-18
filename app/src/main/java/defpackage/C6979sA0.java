package defpackage;

import android.graphics.Path;
import android.graphics.PointF;

/* renamed from: sA0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6979sA0 extends C6312og0 {
    public Path q;
    public final C6312og0 r;

    public C6979sA0(C1847Xl0 c1847Xl0, C6312og0 c6312og0) {
        super(c1847Xl0, (PointF) c6312og0.b, (PointF) c6312og0.c, c6312og0.d, c6312og0.e, c6312og0.f, c6312og0.g, c6312og0.h);
        this.r = c6312og0;
        d();
    }

    public final void d() {
        Object obj;
        Object obj2 = this.c;
        Object obj3 = this.b;
        boolean z = (obj2 == null || obj3 == null || !((PointF) obj3).equals(((PointF) obj2).x, ((PointF) obj2).y)) ? false : true;
        if (obj3 == null || (obj = this.c) == null || z) {
            return;
        }
        PointF pointF = (PointF) obj3;
        PointF pointF2 = (PointF) obj;
        C6312og0 c6312og0 = this.r;
        PointF pointF3 = c6312og0.o;
        PointF pointF4 = c6312og0.p;
        C6987sD c6987sD = AbstractC0667Ih1.a;
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 == null || pointF4 == null || (pointF3.length() == 0.0f && pointF4.length() == 0.0f)) {
            path.lineTo(pointF2.x, pointF2.y);
        } else {
            float f = pointF3.x + pointF.x;
            float f2 = pointF.y + pointF3.y;
            float f3 = pointF2.x;
            float f4 = f3 + pointF4.x;
            float f5 = pointF2.y;
            path.cubicTo(f, f2, f4, f5 + pointF4.y, f3, f5);
        }
        this.q = path;
    }
}
