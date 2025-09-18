package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* loaded from: classes.dex */
public final class XZ0 extends AbstractC2431c01 {
    public final ZZ0 c;

    public XZ0(ZZ0 zz0) {
        this.c = zz0;
    }

    @Override // defpackage.AbstractC2431c01
    public final void a(Matrix matrix, JZ0 jz0, int i, Canvas canvas) {
        ZZ0 zz0 = this.c;
        float f = zz0.f;
        float f2 = zz0.g;
        RectF rectF = new RectF(zz0.b, zz0.c, zz0.d, zz0.e);
        jz0.getClass();
        boolean z = f2 < 0.0f;
        Path path = jz0.g;
        int[] iArr = JZ0.k;
        if (z) {
            iArr[0] = 0;
            iArr[1] = jz0.f;
            iArr[2] = jz0.e;
            iArr[3] = jz0.d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f, f2);
            path.close();
            float f3 = -i;
            rectF.inset(f3, f3);
            iArr[0] = 0;
            iArr[1] = jz0.d;
            iArr[2] = jz0.e;
            iArr[3] = jz0.f;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= 0.0f) {
            return;
        }
        float f4 = 1.0f - (i / fWidth);
        float[] fArr = JZ0.l;
        fArr[1] = f4;
        fArr[2] = ((1.0f - f4) / 2.0f) + f4;
        RadialGradient radialGradient = new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, iArr, fArr, Shader.TileMode.CLAMP);
        Paint paint = jz0.b;
        paint.setShader(radialGradient);
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, jz0.h);
        }
        canvas.drawArc(rectF, f, f2, true, paint);
        canvas.restore();
    }
}
