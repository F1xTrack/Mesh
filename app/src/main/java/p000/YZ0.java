package p000;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

/* loaded from: classes.dex */
public final class YZ0 extends AbstractC8923c01 {

    /* renamed from: c */
    public final C8667a01 f14343c;

    /* renamed from: d */
    public final float f14344d;

    /* renamed from: e */
    public final float f14345e;

    public YZ0(C8667a01 c8667a01, float f, float f2) {
        this.f14343c = c8667a01;
        this.f14344d = f;
        this.f14345e = f2;
    }

    @Override // p000.AbstractC8923c01
    /* renamed from: a */
    public final void mo8818a(Matrix matrix, JZ0 jz0, int i, Canvas canvas) {
        C8667a01 c8667a01 = this.f14343c;
        float f = c8667a01.f15280c;
        float f2 = this.f14345e;
        float f3 = c8667a01.f15279b;
        float f4 = this.f14344d;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f - f2, f3 - f4), 0.0f);
        Matrix matrix2 = this.f17258a;
        matrix2.set(matrix);
        matrix2.preTranslate(f4, f2);
        matrix2.preRotate(m9311b());
        jz0.getClass();
        rectF.bottom += i;
        rectF.offset(0.0f, -i);
        int[] iArr = JZ0.f5604i;
        iArr[0] = jz0.f5613f;
        iArr[1] = jz0.f5612e;
        iArr[2] = jz0.f5611d;
        Paint paint = jz0.f5610c;
        float f5 = rectF.left;
        paint.setShader(new LinearGradient(f5, rectF.top, f5, rectF.bottom, iArr, JZ0.f5605j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    /* renamed from: b */
    public final float m9311b() {
        C8667a01 c8667a01 = this.f14343c;
        return (float) Math.toDegrees(Math.atan((c8667a01.f15280c - this.f14345e) / (c8667a01.f15279b - this.f14344d)));
    }
}
