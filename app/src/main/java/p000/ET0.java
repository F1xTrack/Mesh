package p000;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class ET0 extends LT0 {

    /* renamed from: B */
    public static final /* synthetic */ int f2712B = 0;

    /* renamed from: A */
    public RectF f2713A;

    /* renamed from: w */
    public final Paint f2714w;

    /* renamed from: x */
    public final Paint f2715x;

    /* renamed from: y */
    public final Bitmap f2716y;

    /* renamed from: z */
    public WeakReference f2717z;

    public ET0(Resources resources, Bitmap bitmap, Paint paint) {
        super(new BitmapDrawable(resources, bitmap));
        Paint paint2 = new Paint();
        this.f2714w = paint2;
        Paint paint3 = new Paint(1);
        this.f2715x = paint3;
        this.f2713A = null;
        this.f2716y = bitmap;
        if (paint != null) {
            paint2.set(paint);
        }
        paint2.setFlags(1);
        paint3.setStyle(Paint.Style.STROKE);
    }

    @Override // p000.LT0, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        AbstractC4250iZ.m19063b();
        if (!((this.f6638b || this.f6639c > 0.0f) && this.f2716y != null)) {
            super.draw(canvas);
            AbstractC4250iZ.m19063b();
            return;
        }
        mo2306e();
        m5004b();
        WeakReference weakReference = this.f2717z;
        Paint paint = this.f2714w;
        Bitmap bitmap = this.f2716y;
        if (weakReference == null || weakReference.get() != bitmap) {
            this.f2717z = new WeakReference(bitmap);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
            this.f6641e = true;
        }
        if (this.f6641e) {
            paint.getShader().setLocalMatrix(this.f6655s);
            this.f6641e = false;
        }
        paint.setFilterBitmap(this.f6656t);
        int iSave = canvas.save();
        canvas.concat(this.f6654r);
        Path path = this.f6640d;
        if (this.f2713A != null) {
            int iSave2 = canvas.save();
            canvas.clipRect(this.f2713A);
            canvas.drawPath(path, paint);
            canvas.restoreToCount(iSave2);
        } else {
            canvas.drawPath(path, paint);
        }
        float f = this.f6639c;
        if (f > 0.0f) {
            Paint paint2 = this.f2715x;
            paint2.setStrokeWidth(f);
            paint2.setColor(AbstractC8924c02.m10556d(this.f6642f, paint.getAlpha()));
            canvas.drawPath(this.f6643g, paint2);
        }
        canvas.restoreToCount(iSave);
        AbstractC4250iZ.m19063b();
    }

    @Override // p000.LT0
    /* renamed from: e */
    public final void mo2306e() {
        super.mo2306e();
        if (this.f2713A == null) {
            this.f2713A = new RectF();
        }
        this.f6655s.mapRect(this.f2713A, this.f6648l);
    }

    @Override // p000.LT0, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        super.setAlpha(i);
        Paint paint = this.f2714w;
        if (i != paint.getAlpha()) {
            paint.setAlpha(i);
            super.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // p000.LT0, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
        this.f2714w.setColorFilter(colorFilter);
    }

    @Override // p000.LT0, p000.DT0
    /* renamed from: l */
    public final void mo1700l() {
    }
}
