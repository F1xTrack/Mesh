package p000;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.yalantis.ucrop.view.UCropView;
import java.util.Arrays;

/* renamed from: kB */
/* loaded from: classes2.dex */
public abstract class AbstractC6284kB extends AbstractC10928rc1 {

    /* renamed from: A */
    public float f36334A;

    /* renamed from: B */
    public int f36335B;

    /* renamed from: C */
    public int f36336C;

    /* renamed from: D */
    public long f36337D;

    /* renamed from: s */
    public final RectF f36338s;

    /* renamed from: t */
    public final Matrix f36339t;

    /* renamed from: u */
    public float f36340u;

    /* renamed from: v */
    public float f36341v;

    /* renamed from: w */
    public InterfaceC4163hB f36342w;

    /* renamed from: x */
    public RunnableC4226iB f36343x;

    /* renamed from: y */
    public RunnableC6221jB f36344y;

    /* renamed from: z */
    public float f36345z;

    public AbstractC6284kB(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36338s = new RectF();
        this.f36339t = new Matrix();
        this.f36341v = 10.0f;
        this.f36344y = null;
        this.f36335B = 0;
        this.f36336C = 0;
        this.f36337D = 500L;
    }

    /* renamed from: e */
    public final void m22160e(float f, float f2) {
        RectF rectF = this.f36338s;
        float fMin = Math.min(Math.min(rectF.width() / f, rectF.width() / f2), Math.min(rectF.height() / f2, rectF.height() / f));
        this.f36334A = fMin;
        this.f36345z = fMin * this.f36341v;
    }

    /* renamed from: f */
    public final void m22161f() {
        removeCallbacks(this.f36343x);
        removeCallbacks(this.f36344y);
    }

    /* renamed from: g */
    public final boolean m22162g(float[] fArr) {
        Matrix matrix = this.f36339t;
        matrix.reset();
        matrix.setRotate(-getCurrentAngle());
        float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
        matrix.mapPoints(fArrCopyOf);
        RectF rectF = this.f36338s;
        float f = rectF.left;
        float f2 = rectF.top;
        float f3 = rectF.right;
        float f4 = rectF.bottom;
        float[] fArr2 = {f, f2, f3, f2, f3, f4, f, f4};
        matrix.mapPoints(fArr2);
        return AbstractC9366fP1.m18232d(fArrCopyOf).contains(AbstractC9366fP1.m18232d(fArr2));
    }

    public InterfaceC4163hB getCropBoundsChangeListener() {
        return this.f36342w;
    }

    public float getMaxScale() {
        return this.f36345z;
    }

    public float getMinScale() {
        return this.f36334A;
    }

    public float getTargetAspectRatio() {
        return this.f36340u;
    }

    /* renamed from: h */
    public final void m22163h(float f, float f2, float f3) {
        if (f > 1.0f && getCurrentScale() * f <= getMaxScale()) {
            if (f != 0.0f) {
                Matrix matrix = this.f41760g;
                matrix.postScale(f, f, f2, f3);
                setImageMatrix(matrix);
                InterfaceC10800qc1 interfaceC10800qc1 = this.f41763j;
                if (interfaceC10800qc1 != null) {
                    ((GQ0) interfaceC10800qc1).m3058c(m24432c(matrix));
                    return;
                }
                return;
            }
            return;
        }
        if (f >= 1.0f || getCurrentScale() * f < getMinScale() || f == 0.0f) {
            return;
        }
        Matrix matrix2 = this.f41760g;
        matrix2.postScale(f, f, f2, f3);
        setImageMatrix(matrix2);
        InterfaceC10800qc1 interfaceC10800qc12 = this.f41763j;
        if (interfaceC10800qc12 != null) {
            ((GQ0) interfaceC10800qc12).m3058c(m24432c(matrix2));
        }
    }

    /* renamed from: i */
    public final void m22164i(float f, float f2, float f3) {
        if (f <= getMaxScale()) {
            m22163h(f / getCurrentScale(), f2, f3);
        }
    }

    public void setCropBoundsChangeListener(InterfaceC4163hB interfaceC4163hB) {
        this.f36342w = interfaceC4163hB;
    }

    public void setCropRect(RectF rectF) {
        this.f36340u = rectF.width() / rectF.height();
        this.f36338s.set(rectF.left - getPaddingLeft(), rectF.top - getPaddingTop(), rectF.right - getPaddingRight(), rectF.bottom - getPaddingBottom());
        if (getDrawable() != null) {
            m22160e(r6.getIntrinsicWidth(), r6.getIntrinsicHeight());
        }
        setImageToWrapCropBounds(true);
    }

    public void setImageToWrapCropBounds(boolean z) {
        float fMax;
        float f;
        float f2;
        if (this.f41767n) {
            float[] fArr = this.f41757d;
            if (m22162g(fArr)) {
                return;
            }
            float[] fArr2 = this.f41758e;
            float f3 = fArr2[0];
            float f4 = fArr2[1];
            float currentScale = getCurrentScale();
            RectF rectF = this.f36338s;
            float fCenterX = rectF.centerX() - f3;
            float fCenterY = rectF.centerY() - f4;
            Matrix matrix = this.f36339t;
            matrix.reset();
            matrix.setTranslate(fCenterX, fCenterY);
            float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
            matrix.mapPoints(fArrCopyOf);
            boolean zM22162g = m22162g(fArrCopyOf);
            if (zM22162g) {
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
                RectF rectFM18232d = AbstractC9366fP1.m18232d(fArrCopyOf2);
                RectF rectFM18232d2 = AbstractC9366fP1.m18232d(fArr3);
                float f9 = rectFM18232d.left - rectFM18232d2.left;
                float f10 = rectFM18232d.top - rectFM18232d2.top;
                float f11 = rectFM18232d.right - rectFM18232d2.right;
                float f12 = rectFM18232d.bottom - rectFM18232d2.bottom;
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
                RunnableC4226iB runnableC4226iB = new RunnableC4226iB(this, this.f36337D, f3, f4, f, f2, currentScale, fMax, zM22162g);
                this.f36343x = runnableC4226iB;
                post(runnableC4226iB);
            } else {
                m24433d(f, f2);
                if (zM22162g) {
                    return;
                }
                m22164i(currentScale + fMax, rectF.centerX(), rectF.centerY());
            }
        }
    }

    public void setImageToWrapCropBoundsAnimDuration(long j) {
        if (j <= 0) {
            throw new IllegalArgumentException("Animation duration cannot be negative value.");
        }
        this.f36337D = j;
    }

    public void setMaxResultImageSizeX(int i) {
        this.f36335B = i;
    }

    public void setMaxResultImageSizeY(int i) {
        this.f36336C = i;
    }

    public void setMaxScaleMultiplier(float f) {
        this.f36341v = f;
    }

    public void setTargetAspectRatio(float f) {
        if (getDrawable() == null) {
            this.f36340u = f;
            return;
        }
        if (f == 0.0f) {
            this.f36340u = r0.getIntrinsicWidth() / r0.getIntrinsicHeight();
        } else {
            this.f36340u = f;
        }
        InterfaceC4163hB interfaceC4163hB = this.f36342w;
        if (interfaceC4163hB != null) {
            ((UCropView) ((C10641pN0) interfaceC4163hB).f40042b).f20692b.setTargetAspectRatio(this.f36340u);
        }
    }
}
