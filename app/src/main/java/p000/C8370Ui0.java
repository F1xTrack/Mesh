package p000;

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
public final class C8370Ui0 extends View {

    /* renamed from: a */
    public final Paint f11983a;

    /* renamed from: b */
    public Path f11984b;

    /* renamed from: c */
    public RectF f11985c;

    /* renamed from: d */
    public float[] f11986d;

    /* renamed from: e */
    public float[] f11987e;

    /* renamed from: f */
    public float[] f11988f;

    /* renamed from: g */
    public int[] f11989g;

    /* renamed from: h */
    public boolean f11990h;

    /* renamed from: i */
    public float[] f11991i;

    /* renamed from: j */
    public float f11992j;

    /* renamed from: k */
    public int[] f11993k;

    /* renamed from: l */
    public float[] f11994l;

    public C8370Ui0(S91 s91) {
        super(s91);
        this.f11983a = new Paint(1);
        this.f11987e = new float[]{0.0f, 0.0f};
        this.f11988f = new float[]{0.0f, 1.0f};
        this.f11990h = false;
        this.f11991i = new float[]{0.5f, 0.5f};
        this.f11992j = 45.0f;
        this.f11993k = new int[]{0, 0};
        this.f11994l = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
    }

    /* renamed from: a */
    public final void m8123a() {
        float[] fArr;
        float[] fArr2;
        float[] fArr3;
        int[] iArr = this.f11989g;
        if (iArr != null) {
            float[] fArr4 = this.f11986d;
            if (fArr4 == null || iArr.length == fArr4.length) {
                if (!this.f11990h || this.f11991i == null) {
                    float[] fArr5 = this.f11987e;
                    float f = fArr5[0];
                    int[] iArr2 = this.f11993k;
                    float f2 = iArr2[0];
                    float f3 = fArr5[1];
                    float f4 = iArr2[1];
                    fArr = new float[]{f * f2, f3 * f4};
                    float[] fArr6 = this.f11988f;
                    fArr2 = new float[]{fArr6[0] * f2, fArr6[1] * f4};
                } else {
                    float f5 = 90.0f - this.f11992j;
                    int[] iArr3 = this.f11993k;
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
                    float[] fArr8 = this.f11991i;
                    float f13 = fArr8[0];
                    int[] iArr4 = this.f11993k;
                    float[] fArr9 = {f13 * iArr4[0], fArr8[1] * iArr4[1]};
                    fArr = new float[]{fArr9[0] + fArr3[0], fArr9[1] - fArr3[1]};
                    fArr2 = new float[]{fArr9[0] - fArr3[0], fArr9[1] + fArr3[1]};
                }
                this.f11983a.setShader(new LinearGradient(fArr[0], fArr[1], fArr2[0], fArr2[1], this.f11989g, this.f11986d, Shader.TileMode.CLAMP));
                invalidate();
            }
        }
    }

    /* renamed from: b */
    public final void m8124b() {
        if (this.f11984b == null) {
            this.f11984b = new Path();
            this.f11985c = new RectF();
        }
        this.f11984b.reset();
        RectF rectF = this.f11985c;
        int[] iArr = this.f11993k;
        rectF.set(0.0f, 0.0f, iArr[0], iArr[1]);
        this.f11984b.addRoundRect(this.f11985c, this.f11994l, Path.Direction.CW);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Path path = this.f11984b;
        Paint paint = this.f11983a;
        if (path == null) {
            canvas.drawPaint(paint);
        } else {
            canvas.drawPath(path, paint);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        this.f11993k = new int[]{i, i2};
        m8124b();
        m8123a();
    }

    public void setAngle(float f) {
        this.f11992j = f;
        m8123a();
    }

    public void setAngleCenter(ReadableArray readableArray) {
        this.f11991i = new float[]{(float) readableArray.getDouble(0), (float) readableArray.getDouble(1)};
        m8123a();
    }

    public void setBorderRadii(ReadableArray readableArray) {
        int size = readableArray.size();
        float[] fArr = new float[size];
        for (int i = 0; i < size; i++) {
            fArr[i] = AbstractC11406vL1.m25403b((float) readableArray.getDouble(i));
        }
        this.f11994l = fArr;
        m8124b();
        m8123a();
    }

    public void setColors(ReadableArray readableArray) {
        int size = readableArray.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = readableArray.getType(i) == ReadableType.Map ? ColorPropConverter.getColor(readableArray.getMap(i), getContext()).intValue() : readableArray.getInt(i);
        }
        this.f11989g = iArr;
        m8123a();
    }

    public void setEndPoint(ReadableArray readableArray) {
        this.f11988f = new float[]{(float) readableArray.getDouble(0), (float) readableArray.getDouble(1)};
        m8123a();
    }

    public void setLocations(ReadableArray readableArray) {
        int size = readableArray.size();
        float[] fArr = new float[size];
        for (int i = 0; i < size; i++) {
            fArr[i] = (float) readableArray.getDouble(i);
        }
        this.f11986d = fArr;
        m8123a();
    }

    public void setStartPoint(ReadableArray readableArray) {
        this.f11987e = new float[]{(float) readableArray.getDouble(0), (float) readableArray.getDouble(1)};
        m8123a();
    }

    public void setUseAngle(boolean z) {
        this.f11990h = z;
        m8123a();
    }
}
