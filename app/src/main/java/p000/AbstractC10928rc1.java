package p000;

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
public abstract class AbstractC10928rc1 extends C0888O6 {

    /* renamed from: d */
    public final float[] f41757d;

    /* renamed from: e */
    public final float[] f41758e;

    /* renamed from: f */
    public final float[] f41759f;

    /* renamed from: g */
    public final Matrix f41760g;

    /* renamed from: h */
    public int f41761h;

    /* renamed from: i */
    public int f41762i;

    /* renamed from: j */
    public InterfaceC10800qc1 f41763j;

    /* renamed from: k */
    public float[] f41764k;

    /* renamed from: l */
    public float[] f41765l;

    /* renamed from: m */
    public boolean f41766m;

    /* renamed from: n */
    public boolean f41767n;

    /* renamed from: o */
    public int f41768o;

    /* renamed from: p */
    public String f41769p;

    /* renamed from: q */
    public String f41770q;

    /* renamed from: r */
    public C6679qQ f41771r;

    public AbstractC10928rc1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f41757d = new float[8];
        this.f41758e = new float[2];
        this.f41759f = new float[9];
        this.f41760g = new Matrix();
        this.f41766m = false;
        this.f41767n = false;
        this.f41768o = 0;
        GestureCropImageView gestureCropImageView = (GestureCropImageView) this;
        gestureCropImageView.setScaleType(ImageView.ScaleType.MATRIX);
        gestureCropImageView.f20658G = new GestureDetector(gestureCropImageView.getContext(), new N00(0, gestureCropImageView), null, true);
        gestureCropImageView.f20656E = new ScaleGestureDetector(gestureCropImageView.getContext(), new C4077fp(1, gestureCropImageView));
        C7621Fx1 c7621Fx1 = new C7621Fx1(gestureCropImageView);
        C11929zT0 c11929zT0 = new C11929zT0();
        c11929zT0.f46844i = c7621Fx1;
        c11929zT0.f46840e = -1;
        c11929zT0.f46841f = -1;
        gestureCropImageView.f20657F = c11929zT0;
    }

    /* renamed from: c */
    public final float m24432c(Matrix matrix) {
        float[] fArr = this.f41759f;
        matrix.getValues(fArr);
        double dPow = Math.pow(fArr[0], 2.0d);
        matrix.getValues(fArr);
        return (float) Math.sqrt(Math.pow(fArr[3], 2.0d) + dPow);
    }

    /* renamed from: d */
    public final void m24433d(float f, float f2) {
        if (f == 0.0f && f2 == 0.0f) {
            return;
        }
        Matrix matrix = this.f41760g;
        matrix.postTranslate(f, f2);
        setImageMatrix(matrix);
    }

    public float getCurrentAngle() {
        Matrix matrix = this.f41760g;
        float[] fArr = this.f41759f;
        matrix.getValues(fArr);
        double d = fArr[1];
        matrix.getValues(fArr);
        return (float) (-(Math.atan2(d, fArr[0]) * 57.29577951308232d));
    }

    public float getCurrentScale() {
        return m24432c(this.f41760g);
    }

    public C6679qQ getExifInfo() {
        return this.f41771r;
    }

    public String getImageInputPath() {
        return this.f41769p;
    }

    public String getImageOutputPath() {
        return this.f41770q;
    }

    public int getMaxBitmapSize() {
        int iM25069a;
        if (this.f41768o <= 0) {
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
                iM25069a = AbstractC11233u02.m25069a();
            } catch (Exception unused) {
                iM25069a = 0;
            }
            if (iM25069a > 0) {
                iSqrt = Math.min(iSqrt, iM25069a);
            }
            this.f41768o = iSqrt;
        }
        return this.f41768o;
    }

    public Bitmap getViewBitmap() {
        if (getDrawable() == null || !(getDrawable() instanceof C6824sS)) {
            return null;
        }
        return ((C6824sS) getDrawable()).f42435b;
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z || (this.f41766m && !this.f41767n)) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            this.f41761h = width - paddingLeft;
            this.f41762i = height - paddingTop;
            AbstractC6284kB abstractC6284kB = (AbstractC6284kB) this;
            Drawable drawable = abstractC6284kB.getDrawable();
            if (drawable != null) {
                float intrinsicWidth = drawable.getIntrinsicWidth();
                float intrinsicHeight = drawable.getIntrinsicHeight();
                String.format("Image size: [%d:%d]", Integer.valueOf((int) intrinsicWidth), Integer.valueOf((int) intrinsicHeight));
                RectF rectF = new RectF(0.0f, 0.0f, intrinsicWidth, intrinsicHeight);
                float f = rectF.left;
                float f2 = rectF.top;
                float f3 = rectF.right;
                float f4 = rectF.bottom;
                abstractC6284kB.f41764k = new float[]{f, f2, f3, f2, f3, f4, f, f4};
                abstractC6284kB.f41765l = new float[]{rectF.centerX(), rectF.centerY()};
                abstractC6284kB.f41767n = true;
                InterfaceC10800qc1 interfaceC10800qc1 = abstractC6284kB.f41763j;
                if (interfaceC10800qc1 != null) {
                    UCropActivity uCropActivity = (UCropActivity) ((GQ0) interfaceC10800qc1).f3735b;
                    uCropActivity.f20630r.animate().alpha(1.0f).setDuration(300L).setInterpolator(new AccelerateInterpolator());
                    uCropActivity.f20612D.setClickable(false);
                    uCropActivity.f20629q = false;
                    uCropActivity.m18964g().mo3279a();
                }
            }
            Drawable drawable2 = abstractC6284kB.getDrawable();
            if (drawable2 == null) {
                return;
            }
            float intrinsicWidth2 = drawable2.getIntrinsicWidth();
            float intrinsicHeight2 = drawable2.getIntrinsicHeight();
            if (abstractC6284kB.f36340u == 0.0f) {
                abstractC6284kB.f36340u = intrinsicWidth2 / intrinsicHeight2;
            }
            int i5 = abstractC6284kB.f41761h;
            float f5 = i5;
            float f6 = abstractC6284kB.f36340u;
            int i6 = (int) (f5 / f6);
            int i7 = abstractC6284kB.f41762i;
            RectF rectF2 = abstractC6284kB.f36338s;
            if (i6 > i7) {
                float f7 = i7;
                rectF2.set((i5 - ((int) (f6 * f7))) / 2, 0.0f, r4 + r13, f7);
            } else {
                rectF2.set(0.0f, (i7 - i6) / 2, f5, i6 + r6);
            }
            abstractC6284kB.m22160e(intrinsicWidth2, intrinsicHeight2);
            float fWidth = rectF2.width();
            float fHeight = rectF2.height();
            float fMax = Math.max(rectF2.width() / intrinsicWidth2, rectF2.height() / intrinsicHeight2);
            float f8 = ((fWidth - (intrinsicWidth2 * fMax)) / 2.0f) + rectF2.left;
            float f9 = ((fHeight - (intrinsicHeight2 * fMax)) / 2.0f) + rectF2.top;
            Matrix matrix = abstractC6284kB.f41760g;
            matrix.reset();
            matrix.postScale(fMax, fMax);
            matrix.postTranslate(f8, f9);
            abstractC6284kB.setImageMatrix(matrix);
            InterfaceC4163hB interfaceC4163hB = abstractC6284kB.f36342w;
            if (interfaceC4163hB != null) {
                ((UCropView) ((C10641pN0) interfaceC4163hB).f40042b).f20692b.setTargetAspectRatio(abstractC6284kB.f36340u);
            }
            InterfaceC10800qc1 interfaceC10800qc12 = abstractC6284kB.f41763j;
            if (interfaceC10800qc12 != null) {
                ((GQ0) interfaceC10800qc12).m3058c(abstractC6284kB.getCurrentScale());
                InterfaceC10800qc1 interfaceC10800qc13 = abstractC6284kB.f41763j;
                float currentAngle = abstractC6284kB.getCurrentAngle();
                TextView textView = ((UCropActivity) ((GQ0) interfaceC10800qc13).f3735b).f20610B;
                if (textView != null) {
                    textView.setText(String.format(Locale.getDefault(), "%.1f°", Float.valueOf(currentAngle)));
                }
            }
        }
    }

    @Override // p000.C0888O6, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        setImageDrawable(new C6824sS(bitmap));
    }

    @Override // android.widget.ImageView
    public void setImageMatrix(Matrix matrix) {
        super.setImageMatrix(matrix);
        Matrix matrix2 = this.f41760g;
        matrix2.set(matrix);
        matrix2.mapPoints(this.f41757d, this.f41764k);
        matrix2.mapPoints(this.f41758e, this.f41765l);
    }

    public void setMaxBitmapSize(int i) {
        this.f41768o = i;
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType == ImageView.ScaleType.MATRIX) {
            super.setScaleType(scaleType);
        }
    }

    public void setTransformImageListener(InterfaceC10800qc1 interfaceC10800qc1) {
        this.f41763j = interfaceC10800qc1;
    }
}
