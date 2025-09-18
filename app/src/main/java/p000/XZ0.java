package p000;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* loaded from: classes.dex */
public final class XZ0 extends AbstractC8923c01 {

    /* renamed from: c */
    public final ZZ0 f13852c;

    public XZ0(ZZ0 zz0) {
        this.f13852c = zz0;
    }

    @Override // p000.AbstractC8923c01
    /* renamed from: a */
    public final void mo8818a(Matrix matrix, JZ0 jz0, int i, Canvas canvas) {
        ZZ0 zz0 = this.f13852c;
        float f = zz0.f14977f;
        float f2 = zz0.f14978g;
        RectF rectF = new RectF(zz0.f14973b, zz0.f14974c, zz0.f14975d, zz0.f14976e);
        jz0.getClass();
        boolean z = f2 < 0.0f;
        Path path = jz0.f5614g;
        int[] iArr = JZ0.f5606k;
        if (z) {
            iArr[0] = 0;
            iArr[1] = jz0.f5613f;
            iArr[2] = jz0.f5612e;
            iArr[3] = jz0.f5611d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f, f2);
            path.close();
            float f3 = -i;
            rectF.inset(f3, f3);
            iArr[0] = 0;
            iArr[1] = jz0.f5611d;
            iArr[2] = jz0.f5612e;
            iArr[3] = jz0.f5613f;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= 0.0f) {
            return;
        }
        float f4 = 1.0f - (i / fWidth);
        float[] fArr = JZ0.f5607l;
        fArr[1] = f4;
        fArr[2] = ((1.0f - f4) / 2.0f) + f4;
        RadialGradient radialGradient = new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, iArr, fArr, Shader.TileMode.CLAMP);
        Paint paint = jz0.f5609b;
        paint.setShader(radialGradient);
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, jz0.f5615h);
        }
        canvas.drawArc(rectF, f, f2, true, paint);
        canvas.restore();
    }
}
