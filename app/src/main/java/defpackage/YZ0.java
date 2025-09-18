package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

/* loaded from: classes.dex */
public final class YZ0 extends AbstractC2431c01 {
    public final C2050a01 c;
    public final float d;
    public final float e;

    public YZ0(C2050a01 c2050a01, float f, float f2) {
        this.c = c2050a01;
        this.d = f;
        this.e = f2;
    }

    @Override // defpackage.AbstractC2431c01
    public final void a(Matrix matrix, JZ0 jz0, int i, Canvas canvas) {
        C2050a01 c2050a01 = this.c;
        float f = c2050a01.c;
        float f2 = this.e;
        float f3 = c2050a01.b;
        float f4 = this.d;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f - f2, f3 - f4), 0.0f);
        Matrix matrix2 = this.a;
        matrix2.set(matrix);
        matrix2.preTranslate(f4, f2);
        matrix2.preRotate(b());
        jz0.getClass();
        rectF.bottom += i;
        rectF.offset(0.0f, -i);
        int[] iArr = JZ0.i;
        iArr[0] = jz0.f;
        iArr[1] = jz0.e;
        iArr[2] = jz0.d;
        Paint paint = jz0.c;
        float f5 = rectF.left;
        paint.setShader(new LinearGradient(f5, rectF.top, f5, rectF.bottom, iArr, JZ0.j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    public final float b() {
        C2050a01 c2050a01 = this.c;
        return (float) Math.toDegrees(Math.atan((c2050a01.c - this.e) / (c2050a01.b - this.d)));
    }
}
