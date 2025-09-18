package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.ScaleGestureDetector;
import android.view.WindowManager;
import android.view.animation.AccelerateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import com.yalantis.ucrop.UCropActivity;
import com.yalantis.ucrop.view.GestureCropImageView;
import com.yalantis.ucrop.view.UCropView;
import java.util.Locale;

/* renamed from: rc1 */
/* loaded from: classes2.dex */
public abstract class AbstractC6873rc1 extends O6 {
    public final float[] d;
    public final float[] e;
    public final float[] f;
    public final Matrix g;
    public int h;
    public int i;
    public InterfaceC6683qc1 j;
    public float[] k;
    public float[] l;
    public boolean m;
    public boolean n;
    public int o;
    public String p;
    public String q;
    public C6645qQ r;

    public AbstractC6873rc1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.d = new float[8];
        this.e = new float[2];
        this.f = new float[9];
        this.g = new Matrix();
        this.m = false;
        this.n = false;
        this.o = 0;
        GestureCropImageView gestureCropImageView = (GestureCropImageView) this;
        gestureCropImageView.setScaleType(ImageView.ScaleType.MATRIX);
        gestureCropImageView.G = new GestureDetector(gestureCropImageView.getContext(), new N00(0, gestureCropImageView), null, true);
        gestureCropImageView.E = new ScaleGestureDetector(gestureCropImageView.getContext(), new C3843fp(1, gestureCropImageView));
        C0481Fx1 c0481Fx1 = new C0481Fx1(gestureCropImageView);
        C8369zT0 c8369zT0 = new C8369zT0();
        c8369zT0.i = c0481Fx1;
        c8369zT0.e = -1;
        c8369zT0.f = -1;
        gestureCropImageView.F = c8369zT0;
    }

    public final float c(Matrix matrix) {
        float[] fArr = this.f;
        matrix.getValues(fArr);
        double dPow = Math.pow(fArr[0], 2.0d);
        matrix.getValues(fArr);
        return (float) Math.sqrt(Math.pow(fArr[3], 2.0d) + dPow);
    }

    public final void d(float f, float f2) {
        if (f == 0.0f && f2 == 0.0f) {
            return;
        }
        Matrix matrix = this.g;
        matrix.postTranslate(f, f2);
        setImageMatrix(matrix);
    }

    public float getCurrentAngle() {
        Matrix matrix = this.g;
        float[] fArr = this.f;
        matrix.getValues(fArr);
        double d = fArr[1];
        matrix.getValues(fArr);
        return (float) (-(Math.atan2(d, fArr[0]) * 57.29577951308232d));
    }

    public float getCurrentScale() {
        return c(this.g);
    }

    public C6645qQ getExifInfo() {
        return this.r;
    }

    public String getImageInputPath() {
        return this.p;
    }

    public String getImageOutputPath() {
        return this.q;
    }

    public int getMaxBitmapSize() {
        int iA;
        if (this.o <= 0) {
            WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
            Point point = new Point();
            if (windowManager != null) {
                windowManager.getDefaultDisplay().getSize(point);
            }
            int i = point.x;
            int iSqrt = (int) Math.sqrt(Math.pow(point.y, 2.0d) + Math.pow(i, 2.0d));
            Canvas canvas = new Canvas();
            int iMin = Math.min(canvas.getMaximumBitmapWidth(), canvas.getMaximumBitmapHeight());
            if (iMin > 0) {
                iSqrt = Math.min(iSqrt, iMin);
            }
            try {
                iA = AbstractC7329u02.a();
            } catch (Exception unused) {
                iA = 0;
            }
            if (iA > 0) {
                iSqrt = Math.min(iSqrt, iA);
            }
            this.o = iSqrt;
        }
        return this.o;
    }

    public Bitmap getViewBitmap() {
        if (getDrawable() == null || !(getDrawable() instanceof C7032sS)) {
            return null;
        }
        return ((C7032sS) getDrawable()).b;
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z || (this.m && !this.n)) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            this.h = width - paddingLeft;
            this.i = height - paddingTop;
            AbstractC5454kB abstractC5454kB = (AbstractC5454kB) this;
            Drawable drawable = abstractC5454kB.getDrawable();
            if (drawable != null) {
                float intrinsicWidth = drawable.getIntrinsicWidth();
                float intrinsicHeight = drawable.getIntrinsicHeight();
                String.format("Image size: [%d:%d]", Integer.valueOf((int) intrinsicWidth), Integer.valueOf((int) intrinsicHeight));
                RectF rectF = new RectF(0.0f, 0.0f, intrinsicWidth, intrinsicHeight);
                float f = rectF.left;
                float f2 = rectF.top;
                float f3 = rectF.right;
                float f4 = rectF.bottom;
                abstractC5454kB.k = new float[]{f, f2, f3, f2, f3, f4, f, f4};
                abstractC5454kB.l = new float[]{rectF.centerX(), rectF.centerY()};
                abstractC5454kB.n = true;
                InterfaceC6683qc1 interfaceC6683qc1 = abstractC5454kB.j;
                if (interfaceC6683qc1 != null) {
                    UCropActivity uCropActivity = (UCropActivity) ((GQ0) interfaceC6683qc1).b;
                    uCropActivity.r.animate().alpha(1.0f).setDuration(300L).setInterpolator(new AccelerateInterpolator());
                    uCropActivity.D.setClickable(false);
                    uCropActivity.q = false;
                    uCropActivity.g().a();
                }
            }
            Drawable drawable2 = abstractC5454kB.getDrawable();
            if (drawable2 == null) {
                return;
            }
            float intrinsicWidth2 = drawable2.getIntrinsicWidth();
            float intrinsicHeight2 = drawable2.getIntrinsicHeight();
            if (abstractC5454kB.u == 0.0f) {
                abstractC5454kB.u = intrinsicWidth2 / intrinsicHeight2;
            }
            int i5 = abstractC5454kB.h;
            float f5 = i5;
            float f6 = abstractC5454kB.u;
            int i6 = (int) (f5 / f6);
            int i7 = abstractC5454kB.i;
            RectF rectF2 = abstractC5454kB.s;
            if (i6 > i7) {
                float f7 = i7;
                rectF2.set((i5 - ((int) (f6 * f7))) / 2, 0.0f, r4 + r13, f7);
            } else {
                rectF2.set(0.0f, (i7 - i6) / 2, f5, i6 + r6);
            }
            abstractC5454kB.e(intrinsicWidth2, intrinsicHeight2);
            float fWidth = rectF2.width();
            float fHeight = rectF2.height();
            float fMax = Math.max(rectF2.width() / intrinsicWidth2, rectF2.height() / intrinsicHeight2);
            float f8 = ((fWidth - (intrinsicWidth2 * fMax)) / 2.0f) + rectF2.left;
            float f9 = ((fHeight - (intrinsicHeight2 * fMax)) / 2.0f) + rectF2.top;
            Matrix matrix = abstractC5454kB.g;
            matrix.reset();
            matrix.postScale(fMax, fMax);
            matrix.postTranslate(f8, f9);
            abstractC5454kB.setImageMatrix(matrix);
            InterfaceC4105hB interfaceC4105hB = abstractC5454kB.w;
            if (interfaceC4105hB != null) {
                ((UCropView) ((C6446pN0) interfaceC4105hB).b).b.setTargetAspectRatio(abstractC5454kB.u);
            }
            InterfaceC6683qc1 interfaceC6683qc12 = abstractC5454kB.j;
            if (interfaceC6683qc12 != null) {
                ((GQ0) interfaceC6683qc12).c(abstractC5454kB.getCurrentScale());
                InterfaceC6683qc1 interfaceC6683qc13 = abstractC5454kB.j;
                float currentAngle = abstractC5454kB.getCurrentAngle();
                TextView textView = ((UCropActivity) ((GQ0) interfaceC6683qc13).b).B;
                if (textView != null) {
                    textView.setText(String.format(Locale.getDefault(), "%.1f°", Float.valueOf(currentAngle)));
                }
            }
        }
    }

    @Override // defpackage.O6, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        setImageDrawable(new C7032sS(bitmap));
    }

    @Override // android.widget.ImageView
    public void setImageMatrix(Matrix matrix) {
        super.setImageMatrix(matrix);
        Matrix matrix2 = this.g;
        matrix2.set(matrix);
        matrix2.mapPoints(this.d, this.k);
        matrix2.mapPoints(this.e, this.l);
    }

    public void setMaxBitmapSize(int i) {
        this.o = i;
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType == ImageView.ScaleType.MATRIX) {
            super.setScaleType(scaleType);
        }
    }

    public void setTransformImageListener(InterfaceC6683qc1 interfaceC6683qc1) {
        this.j = interfaceC6683qc1;
    }
}
