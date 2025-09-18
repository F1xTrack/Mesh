package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;

/* renamed from: Ui0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1604Ui0 extends View {
    public final Paint a;
    public Path b;
    public RectF c;
    public float[] d;
    public float[] e;
    public float[] f;
    public int[] g;
    public boolean h;
    public float[] i;
    public float j;
    public int[] k;
    public float[] l;

    public C1604Ui0(S91 s91) {
        super(s91);
        this.a = new Paint(1);
        this.e = new float[]{0.0f, 0.0f};
        this.f = new float[]{0.0f, 1.0f};
        this.h = false;
        this.i = new float[]{0.5f, 0.5f};
        this.j = 45.0f;
        this.k = new int[]{0, 0};
        this.l = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
    }

    public final void a() {
        float[] fArr;
        float[] fArr2;
        float[] fArr3;
        int[] iArr = this.g;
        if (iArr != null) {
            float[] fArr4 = this.d;
            if (fArr4 == null || iArr.length == fArr4.length) {
                if (!this.h || this.i == null) {
                    float[] fArr5 = this.e;
                    float f = fArr5[0];
                    int[] iArr2 = this.k;
                    float f2 = iArr2[0];
                    float f3 = fArr5[1];
                    float f4 = iArr2[1];
                    fArr = new float[]{f * f2, f3 * f4};
                    float[] fArr6 = this.f;
                    fArr2 = new float[]{fArr6[0] * f2, fArr6[1] * f4};
                } else {
                    float f5 = 90.0f - this.j;
                    int[] iArr3 = this.k;
                    float f6 = f5 % 360.0f;
                    if (f6 < 0.0f) {
                        f6 += 360.0f;
                    }
                    if (f6 % 90.0f == 0.0f) {
                        float f7 = iArr3[0] / 2.0f;
                        float f8 = iArr3[1] / 2.0f;
                        fArr3 = f6 == 0.0f ? new float[]{-f7, 0.0f} : f6 == 90.0f ? new float[]{0.0f, -f8} : f6 == 180.0f ? new float[]{f7, 0.0f} : new float[]{0.0f, f8};
                    } else {
                        float fTan = (float) Math.tan((f6 * 3.141592653589793d) / 180.0d);
                        float f9 = (-1.0f) / fTan;
                        float f10 = iArr3[0] / 2.0f;
                        float f11 = iArr3[1] / 2.0f;
                        float[] fArr7 = f6 < 90.0f ? new float[]{-f10, -f11} : f6 < 180.0f ? new float[]{f10, -f11} : f6 < 270.0f ? new float[]{f10, f11} : new float[]{-f10, f11};
                        float f12 = (fArr7[1] - (fArr7[0] * f9)) / (fTan - f9);
                        fArr3 = new float[]{f12, fTan * f12};
                    }
                    float[] fArr8 = this.i;
                    float f13 = fArr8[0];
                    int[] iArr4 = this.k;
                    float[] fArr9 = {f13 * iArr4[0], fArr8[1] * iArr4[1]};
                    fArr = new float[]{fArr9[0] + fArr3[0], fArr9[1] - fArr3[1]};
                    fArr2 = new float[]{fArr9[0] - fArr3[0], fArr9[1] + fArr3[1]};
                }
                this.a.setShader(new LinearGradient(fArr[0], fArr[1], fArr2[0], fArr2[1], this.g, this.d, Shader.TileMode.CLAMP));
                invalidate();
            }
        }
    }

    public final void b() {
        if (this.b == null) {
            this.b = new Path();
            this.c = new RectF();
        }
        this.b.reset();
        RectF rectF = this.c;
        int[] iArr = this.k;
        rectF.set(0.0f, 0.0f, iArr[0], iArr[1]);
        this.b.addRoundRect(this.c, this.l, Path.Direction.CW);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Path path = this.b;
        Paint paint = this.a;
        if (path == null) {
            canvas.drawPaint(paint);
        } else {
            canvas.drawPath(path, paint);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        this.k = new int[]{i, i2};
        b();
        a();
    }

    public void setAngle(float f) {
        this.j = f;
        a();
    }

    public void setAngleCenter(ReadableArray readableArray) {
        this.i = new float[]{(float) readableArray.getDouble(0), (float) readableArray.getDouble(1)};
        a();
    }

    public void setBorderRadii(ReadableArray readableArray) {
        int size = readableArray.size();
        float[] fArr = new float[size];
        for (int i = 0; i < size; i++) {
            fArr[i] = AbstractC7586vL1.b((float) readableArray.getDouble(i));
        }
        this.l = fArr;
        b();
        a();
    }

    public void setColors(ReadableArray readableArray) {
        int size = readableArray.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = readableArray.getType(i) == ReadableType.Map ? ColorPropConverter.getColor(readableArray.getMap(i), getContext()).intValue() : readableArray.getInt(i);
        }
        this.g = iArr;
        a();
    }

    public void setEndPoint(ReadableArray readableArray) {
        this.f = new float[]{(float) readableArray.getDouble(0), (float) readableArray.getDouble(1)};
        a();
    }

    public void setLocations(ReadableArray readableArray) {
        int size = readableArray.size();
        float[] fArr = new float[size];
        for (int i = 0; i < size; i++) {
            fArr[i] = (float) readableArray.getDouble(i);
        }
        this.d = fArr;
        a();
    }

    public void setStartPoint(ReadableArray readableArray) {
        this.e = new float[]{(float) readableArray.getDouble(0), (float) readableArray.getDouble(1)};
        a();
    }

    public void setUseAngle(boolean z) {
        this.h = z;
        a();
    }
}
