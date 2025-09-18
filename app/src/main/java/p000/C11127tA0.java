package p000;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.ArrayList;

/* renamed from: tA0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11127tA0 extends AbstractC10679pg0 {

    /* renamed from: i */
    public final PointF f42893i;

    /* renamed from: j */
    public final float[] f42894j;

    /* renamed from: k */
    public final float[] f42895k;

    /* renamed from: l */
    public final PathMeasure f42896l;

    /* renamed from: m */
    public C10999sA0 f42897m;

    public C11127tA0(ArrayList arrayList) {
        super(arrayList);
        this.f42893i = new PointF();
        this.f42894j = new float[2];
        this.f42895k = new float[2];
        this.f42896l = new PathMeasure();
    }

    @Override // p000.AbstractC6378lg
    /* renamed from: f */
    public final Object mo3189f(C10551og0 c10551og0, float f) {
        C10999sA0 c10999sA0 = (C10999sA0) c10551og0;
        Path path = c10999sA0.f42284q;
        ES1 es1 = this.f37232e;
        if (es1 != null && c10551og0.f39165h != null) {
            PointF pointF = (PointF) es1.m2303z(c10999sA0.f39164g, c10999sA0.f39165h.floatValue(), (PointF) c10999sA0.f39159b, (PointF) c10999sA0.f39160c, m22529d(), f, this.f37231d);
            if (pointF != null) {
                return pointF;
            }
        }
        if (path == null) {
            return (PointF) c10551og0.f39159b;
        }
        C10999sA0 c10999sA02 = this.f42897m;
        PathMeasure pathMeasure = this.f42896l;
        if (c10999sA02 != c10999sA0) {
            pathMeasure.setPath(path, false);
            this.f42897m = c10999sA0;
        }
        float length = pathMeasure.getLength();
        float f2 = f * length;
        float[] fArr = this.f42894j;
        float[] fArr2 = this.f42895k;
        pathMeasure.getPosTan(f2, fArr, fArr2);
        PointF pointF2 = this.f42893i;
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
