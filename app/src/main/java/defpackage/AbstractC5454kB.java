package defpackage;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.yalantis.ucrop.view.UCropView;
import java.util.Arrays;

/* renamed from: kB, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5454kB extends AbstractC6873rc1 {
    public float A;
    public int B;
    public int C;
    public long D;
    public final RectF s;
    public final Matrix t;
    public float u;
    public float v;
    public InterfaceC4105hB w;
    public RunnableC4296iB x;
    public RunnableC5263jB y;
    public float z;

    public AbstractC5454kB(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.s = new RectF();
        this.t = new Matrix();
        this.v = 10.0f;
        this.y = null;
        this.B = 0;
        this.C = 0;
        this.D = 500L;
    }

    public final void e(float f, float f2) {
        RectF rectF = this.s;
        float fMin = Math.min(Math.min(rectF.width() / f, rectF.width() / f2), Math.min(rectF.height() / f2, rectF.height() / f));
        this.A = fMin;
        this.z = fMin * this.v;
    }

    public final void f() {
        removeCallbacks(this.x);
        removeCallbacks(this.y);
    }

    public final boolean g(float[] fArr) {
        Matrix matrix = this.t;
        matrix.reset();
        matrix.setRotate(-getCurrentAngle());
        float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
        matrix.mapPoints(fArrCopyOf);
        RectF rectF = this.s;
        float f = rectF.left;
        float f2 = rectF.top;
        float f3 = rectF.right;
        float f4 = rectF.bottom;
        float[] fArr2 = {f, f2, f3, f2, f3, f4, f, f4};
        matrix.mapPoints(fArr2);
        return AbstractC3767fP1.d(fArrCopyOf).contains(AbstractC3767fP1.d(fArr2));
    }

    public InterfaceC4105hB getCropBoundsChangeListener() {
        return this.w;
    }

    public float getMaxScale() {
        return this.z;
    }

    public float getMinScale() {
        return this.A;
    }

    public float getTargetAspectRatio() {
        return this.u;
    }

    public final void h(float f, float f2, float f3) {
        if (f > 1.0f && getCurrentScale() * f <= getMaxScale()) {
            if (f != 0.0f) {
                Matrix matrix = this.g;
                matrix.postScale(f, f, f2, f3);
                setImageMatrix(matrix);
                InterfaceC6683qc1 interfaceC6683qc1 = this.j;
                if (interfaceC6683qc1 != null) {
                    ((GQ0) interfaceC6683qc1).c(c(matrix));
                    return;
                }
                return;
            }
            return;
        }
        if (f >= 1.0f || getCurrentScale() * f < getMinScale() || f == 0.0f) {
            return;
        }
        Matrix matrix2 = this.g;
        matrix2.postScale(f, f, f2, f3);
        setImageMatrix(matrix2);
        InterfaceC6683qc1 interfaceC6683qc12 = this.j;
        if (interfaceC6683qc12 != null) {
            ((GQ0) interfaceC6683qc12).c(c(matrix2));
        }
    }

    public final void i(float f, float f2, float f3) {
        if (f <= getMaxScale()) {
            h(f / getCurrentScale(), f2, f3);
        }
    }

    public void setCropBoundsChangeListener(InterfaceC4105hB interfaceC4105hB) {
        this.w = interfaceC4105hB;
    }

    public void setCropRect(RectF rectF) {
        this.u = rectF.width() / rectF.height();
        this.s.set(rectF.left - getPaddingLeft(), rectF.top - getPaddingTop(), rectF.right - getPaddingRight(), rectF.bottom - getPaddingBottom());
        if (getDrawable() != null) {
            e(r6.getIntrinsicWidth(), r6.getIntrinsicHeight());
        }
        setImageToWrapCropBounds(true);
    }

    public void setImageToWrapCropBounds(boolean z) {
        float fMax;
        float f;
        float f2;
        if (this.n) {
            float[] fArr = this.d;
            if (g(fArr)) {
                return;
            }
            float[] fArr2 = this.e;
            float f3 = fArr2[0];
            float f4 = fArr2[1];
            float currentScale = getCurrentScale();
            RectF rectF = this.s;
            float fCenterX = rectF.centerX() - f3;
            float fCenterY = rectF.centerY() - f4;
            Matrix matrix = this.t;
            matrix.reset();
            matrix.setTranslate(fCenterX, fCenterY);
            float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
            matrix.mapPoints(fArrCopyOf);
            boolean zG = g(fArrCopyOf);
            if (zG) {
                matrix.reset();
                matrix.setRotate(-getCurrentAngle());
                float[] fArrCopyOf2 = Arrays.copyOf(fArr, fArr.length);
                float f5 = rectF.left;
                float f6 = rectF.top;
                float f7 = rectF.right;
                float f8 = rectF.bottom;
                float[] fArr3 = {f5, f6, f7, f6, f7, f8, f5, f8};
                matrix.mapPoints(fArrCopyOf2);
                matrix.mapPoints(fArr3);
                RectF rectFD = AbstractC3767fP1.d(fArrCopyOf2);
                RectF rectFD2 = AbstractC3767fP1.d(fArr3);
                float f9 = rectFD.left - rectFD2.left;
                float f10 = rectFD.top - rectFD2.top;
                float f11 = rectFD.right - rectFD2.right;
                float f12 = rectFD.bottom - rectFD2.bottom;
                if (f9 <= 0.0f) {
                    f9 = 0.0f;
                }
                if (f10 <= 0.0f) {
                    f10 = 0.0f;
                }
                if (f11 >= 0.0f) {
                    f11 = 0.0f;
                }
                if (f12 >= 0.0f) {
                    f12 = 0.0f;
                }
                float[] fArr4 = {f9, f10, f11, f12};
                matrix.reset();
                matrix.setRotate(getCurrentAngle());
                matrix.mapPoints(fArr4);
                float f13 = -(fArr4[0] + fArr4[2]);
                float f14 = -(fArr4[1] + fArr4[3]);
                f = f13;
                fMax = 0.0f;
                f2 = f14;
            } else {
                RectF rectF2 = new RectF(rectF);
                matrix.reset();
                matrix.setRotate(getCurrentAngle());
                matrix.mapRect(rectF2);
                float[] fArr5 = {(float) Math.sqrt(Math.pow(fArr[1] - fArr[3], 2.0d) + Math.pow(fArr[0] - fArr[2], 2.0d)), (float) Math.sqrt(Math.pow(fArr[3] - fArr[5], 2.0d) + Math.pow(fArr[2] - fArr[4], 2.0d))};
                fMax = (Math.max(rectF2.width() / fArr5[0], rectF2.height() / fArr5[1]) * currentScale) - currentScale;
                f = fCenterX;
                f2 = fCenterY;
            }
            if (z) {
                RunnableC4296iB runnableC4296iB = new RunnableC4296iB(this, this.D, f3, f4, f, f2, currentScale, fMax, zG);
                this.x = runnableC4296iB;
                post(runnableC4296iB);
            } else {
                d(f, f2);
                if (zG) {
                    return;
                }
                i(currentScale + fMax, rectF.centerX(), rectF.centerY());
            }
        }
    }

    public void setImageToWrapCropBoundsAnimDuration(long j) {
        if (j <= 0) {
            throw new IllegalArgumentException("Animation duration cannot be negative value.");
        }
        this.D = j;
    }

    public void setMaxResultImageSizeX(int i) {
        this.B = i;
    }

    public void setMaxResultImageSizeY(int i) {
        this.C = i;
    }

    public void setMaxScaleMultiplier(float f) {
        this.v = f;
    }

    public void setTargetAspectRatio(float f) {
        if (getDrawable() == null) {
            this.u = f;
            return;
        }
        if (f == 0.0f) {
            this.u = r0.getIntrinsicWidth() / r0.getIntrinsicHeight();
        } else {
            this.u = f;
        }
        InterfaceC4105hB interfaceC4105hB = this.w;
        if (interfaceC4105hB != null) {
            ((UCropView) ((C6446pN0) interfaceC4105hB).b).b.setTargetAspectRatio(this.u);
        }
    }
}
