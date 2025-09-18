package p000;

import android.graphics.Path;
import android.graphics.PointF;

/* renamed from: sA0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10999sA0 extends C10551og0 {

    /* renamed from: q */
    public Path f42284q;

    /* renamed from: r */
    public final C10551og0 f42285r;

    public C10999sA0(C8532Xl0 c8532Xl0, C10551og0 c10551og0) {
        super(c8532Xl0, (PointF) c10551og0.f39159b, (PointF) c10551og0.f39160c, c10551og0.f39161d, c10551og0.f39162e, c10551og0.f39163f, c10551og0.f39164g, c10551og0.f39165h);
        this.f42285r = c10551og0;
        m24650d();
    }

    /* renamed from: d */
    public final void m24650d() {
        Object obj;
        Object obj2 = this.f39160c;
        Object obj3 = this.f39159b;
        boolean z = (obj2 == null || obj3 == null || !((PointF) obj3).equals(((PointF) obj2).x, ((PointF) obj2).y)) ? false : true;
        if (obj3 == null || (obj = this.f39160c) == null || z) {
            return;
        }
        PointF pointF = (PointF) obj3;
        PointF pointF2 = (PointF) obj;
        C10551og0 c10551og0 = this.f42285r;
        PointF pointF3 = c10551og0.f39172o;
        PointF pointF4 = c10551og0.f39173p;
        C6809sD c6809sD = AbstractC7745Ih1.f5085a;
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
        this.f42284q = path;
    }
}
