package com.yalantis.ucrop.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.util.AttributeSet;
import android.view.View;
import p000.A61;
import p000.InterfaceC10845qz0;
import ru.mes.dnevnik.R;

/* loaded from: classes2.dex */
public class OverlayView extends View {

    /* renamed from: A */
    public boolean f20664A;

    /* renamed from: a */
    public final RectF f20665a;

    /* renamed from: b */
    public final RectF f20666b;

    /* renamed from: c */
    public int f20667c;

    /* renamed from: d */
    public int f20668d;

    /* renamed from: e */
    public float[] f20669e;

    /* renamed from: f */
    public int f20670f;

    /* renamed from: g */
    public int f20671g;

    /* renamed from: h */
    public float f20672h;

    /* renamed from: i */
    public float[] f20673i;

    /* renamed from: j */
    public boolean f20674j;

    /* renamed from: k */
    public boolean f20675k;

    /* renamed from: l */
    public boolean f20676l;

    /* renamed from: m */
    public int f20677m;

    /* renamed from: n */
    public final Path f20678n;

    /* renamed from: o */
    public final Paint f20679o;

    /* renamed from: p */
    public final Paint f20680p;

    /* renamed from: q */
    public final Paint f20681q;

    /* renamed from: r */
    public final Paint f20682r;

    /* renamed from: s */
    public int f20683s;

    /* renamed from: t */
    public float f20684t;

    /* renamed from: u */
    public float f20685u;

    /* renamed from: v */
    public int f20686v;

    /* renamed from: w */
    public final int f20687w;

    /* renamed from: x */
    public final int f20688x;

    /* renamed from: y */
    public final int f20689y;

    /* renamed from: z */
    public InterfaceC10845qz0 f20690z;

    public OverlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f20665a = new RectF();
        this.f20666b = new RectF();
        this.f20673i = null;
        this.f20678n = new Path();
        this.f20679o = new Paint(1);
        this.f20680p = new Paint(1);
        this.f20681q = new Paint(1);
        this.f20682r = new Paint(1);
        this.f20683s = 0;
        this.f20684t = -1.0f;
        this.f20685u = -1.0f;
        this.f20686v = -1;
        this.f20687w = getResources().getDimensionPixelSize(R.dimen.ucrop_default_crop_rect_corner_touch_threshold);
        this.f20688x = getResources().getDimensionPixelSize(R.dimen.ucrop_default_crop_rect_min_size);
        this.f20689y = getResources().getDimensionPixelSize(R.dimen.ucrop_default_crop_rect_corner_touch_area_line_length);
    }

    /* renamed from: a */
    public final void m13763a() {
        RectF rectF = this.f20665a;
        float f = rectF.left;
        float f2 = rectF.top;
        float f3 = rectF.right;
        float f4 = rectF.bottom;
        this.f20669e = new float[]{f, f2, f3, f2, f3, f4, f, f4};
        rectF.centerX();
        rectF.centerY();
        this.f20673i = null;
        Path path = this.f20678n;
        path.reset();
        path.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width(), rectF.height()) / 2.0f, Path.Direction.CW);
    }

    public RectF getCropViewRect() {
        return this.f20665a;
    }

    public int getFreestyleCropMode() {
        return this.f20683s;
    }

    public InterfaceC10845qz0 getOverlayViewChangeListener() {
        return this.f20690z;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        boolean z = this.f20676l;
        RectF rectF = this.f20665a;
        if (z) {
            canvas.clipPath(this.f20678n, Region.Op.DIFFERENCE);
        } else {
            canvas.clipRect(rectF, Region.Op.DIFFERENCE);
        }
        canvas.drawColor(this.f20677m);
        canvas.restore();
        if (this.f20676l) {
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width(), rectF.height()) / 2.0f, this.f20679o);
        }
        if (this.f20675k) {
            if (this.f20673i == null && !rectF.isEmpty()) {
                this.f20673i = new float[(this.f20671g * 4) + (this.f20670f * 4)];
                int i = 0;
                for (int i2 = 0; i2 < this.f20670f; i2++) {
                    float[] fArr = this.f20673i;
                    fArr[i] = rectF.left;
                    float f = i2 + 1.0f;
                    fArr[i + 1] = ((f / (this.f20670f + 1)) * rectF.height()) + rectF.top;
                    float[] fArr2 = this.f20673i;
                    int i3 = i + 3;
                    fArr2[i + 2] = rectF.right;
                    i += 4;
                    fArr2[i3] = ((f / (this.f20670f + 1)) * rectF.height()) + rectF.top;
                }
                for (int i4 = 0; i4 < this.f20671g; i4++) {
                    float f2 = i4 + 1.0f;
                    this.f20673i[i] = ((f2 / (this.f20671g + 1)) * rectF.width()) + rectF.left;
                    float[] fArr3 = this.f20673i;
                    fArr3[i + 1] = rectF.top;
                    int i5 = i + 3;
                    fArr3[i + 2] = ((f2 / (this.f20671g + 1)) * rectF.width()) + rectF.left;
                    i += 4;
                    this.f20673i[i5] = rectF.bottom;
                }
            }
            float[] fArr4 = this.f20673i;
            if (fArr4 != null) {
                canvas.drawLines(fArr4, this.f20680p);
            }
        }
        if (this.f20674j) {
            canvas.drawRect(rectF, this.f20681q);
        }
        if (this.f20683s != 0) {
            canvas.save();
            RectF rectF2 = this.f20666b;
            rectF2.set(rectF);
            int i6 = this.f20689y;
            float f3 = i6;
            float f4 = -i6;
            rectF2.inset(f3, f4);
            Region.Op op = Region.Op.DIFFERENCE;
            canvas.clipRect(rectF2, op);
            rectF2.set(rectF);
            rectF2.inset(f4, f3);
            canvas.clipRect(rectF2, op);
            canvas.drawRect(rectF, this.f20682r);
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            this.f20667c = width - paddingLeft;
            this.f20668d = height - paddingTop;
            if (this.f20664A) {
                this.f20664A = false;
                setTargetAspectRatio(this.f20672h);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0080  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r19) {
        /*
            Method dump skipped, instructions count: 429
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yalantis.ucrop.view.OverlayView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setCircleDimmedLayer(boolean z) {
        this.f20676l = z;
    }

    public void setCropFrameColor(int i) {
        this.f20681q.setColor(i);
    }

    public void setCropFrameStrokeWidth(int i) {
        this.f20681q.setStrokeWidth(i);
    }

    public void setCropGridColor(int i) {
        this.f20680p.setColor(i);
    }

    public void setCropGridColumnCount(int i) {
        this.f20671g = i;
        this.f20673i = null;
    }

    public void setCropGridCornerColor(int i) {
        this.f20682r.setColor(i);
    }

    public void setCropGridRowCount(int i) {
        this.f20670f = i;
        this.f20673i = null;
    }

    public void setCropGridStrokeWidth(int i) {
        this.f20680p.setStrokeWidth(i);
    }

    public void setDimmedColor(int i) {
        this.f20677m = i;
    }

    @Deprecated
    public void setFreestyleCropEnabled(boolean z) {
        this.f20683s = z ? 1 : 0;
    }

    public void setFreestyleCropMode(int i) {
        this.f20683s = i;
        postInvalidate();
    }

    public void setOverlayViewChangeListener(InterfaceC10845qz0 interfaceC10845qz0) {
        this.f20690z = interfaceC10845qz0;
    }

    public void setShowCropFrame(boolean z) {
        this.f20674j = z;
    }

    public void setShowCropGrid(boolean z) {
        this.f20675k = z;
    }

    public void setTargetAspectRatio(float f) {
        this.f20672h = f;
        int i = this.f20667c;
        if (i <= 0) {
            this.f20664A = true;
            return;
        }
        int i2 = (int) (i / f);
        int i3 = this.f20668d;
        RectF rectF = this.f20665a;
        if (i2 > i3) {
            int i4 = (i - ((int) (i3 * f))) / 2;
            rectF.set(getPaddingLeft() + i4, getPaddingTop(), getPaddingLeft() + r7 + i4, getPaddingTop() + this.f20668d);
        } else {
            int i5 = (i3 - i2) / 2;
            rectF.set(getPaddingLeft(), getPaddingTop() + i5, getPaddingLeft() + this.f20667c, getPaddingTop() + i2 + i5);
        }
        InterfaceC10845qz0 interfaceC10845qz0 = this.f20690z;
        if (interfaceC10845qz0 != null) {
            ((UCropView) ((A61) interfaceC10845qz0).f73b).f20691a.setCropRect(rectF);
        }
        m13763a();
        postInvalidate();
    }
}
