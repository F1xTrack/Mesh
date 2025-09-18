package p000;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* loaded from: classes.dex */
public final class ZZ0 extends AbstractC8795b01 {

    /* renamed from: h */
    public static final RectF f14972h = new RectF();

    /* renamed from: b */
    public final float f14973b;

    /* renamed from: c */
    public final float f14974c;

    /* renamed from: d */
    public final float f14975d;

    /* renamed from: e */
    public final float f14976e;

    /* renamed from: f */
    public float f14977f;

    /* renamed from: g */
    public float f14978g;

    public ZZ0(float f, float f2, float f3, float f4) {
        this.f14973b = f;
        this.f14974c = f2;
        this.f14975d = f3;
        this.f14976e = f4;
    }

    @Override // p000.AbstractC8795b01
    /* renamed from: a */
    public final void mo9548a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f16704a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        RectF rectF = f14972h;
        rectF.set(this.f14973b, this.f14974c, this.f14975d, this.f14976e);
        path.arcTo(rectF, this.f14977f, this.f14978g, false);
        path.transform(matrix);
    }
}
