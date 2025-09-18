package defpackage;

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
    public static final /* synthetic */ int B = 0;
    public RectF A;
    public final Paint w;
    public final Paint x;
    public final Bitmap y;
    public WeakReference z;

    public ET0(Resources resources, Bitmap bitmap, Paint paint) {
        super(new BitmapDrawable(resources, bitmap));
        Paint paint2 = new Paint();
        this.w = paint2;
        Paint paint3 = new Paint(1);
        this.x = paint3;
        this.A = null;
        this.y = bitmap;
        if (paint != null) {
            paint2.set(paint);
        }
        paint2.setFlags(1);
        paint3.setStyle(Paint.Style.STROKE);
    }

    @Override // defpackage.LT0, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        AbstractC4368iZ.b();
        if (!((this.b || this.c > 0.0f) && this.y != null)) {
            super.draw(canvas);
            AbstractC4368iZ.b();
            return;
        }
        e();
        b();
        WeakReference weakReference = this.z;
        Paint paint = this.w;
        Bitmap bitmap = this.y;
        if (weakReference == null || weakReference.get() != bitmap) {
            this.z = new WeakReference(bitmap);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
            this.e = true;
        }
        if (this.e) {
            paint.getShader().setLocalMatrix(this.s);
            this.e = false;
        }
        paint.setFilterBitmap(this.t);
        int iSave = canvas.save();
        canvas.concat(this.r);
        Path path = this.d;
        if (this.A != null) {
            int iSave2 = canvas.save();
            canvas.clipRect(this.A);
            canvas.drawPath(path, paint);
            canvas.restoreToCount(iSave2);
        } else {
            canvas.drawPath(path, paint);
        }
        float f = this.c;
        if (f > 0.0f) {
            Paint paint2 = this.x;
            paint2.setStrokeWidth(f);
            paint2.setColor(AbstractC2432c02.d(this.f, paint.getAlpha()));
            canvas.drawPath(this.g, paint2);
        }
        canvas.restoreToCount(iSave);
        AbstractC4368iZ.b();
    }

    @Override // defpackage.LT0
    public final void e() {
        super.e();
        if (this.A == null) {
            this.A = new RectF();
        }
        this.s.mapRect(this.A, this.l);
    }

    @Override // defpackage.LT0, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        super.setAlpha(i);
        Paint paint = this.w;
        if (i != paint.getAlpha()) {
            paint.setAlpha(i);
            super.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // defpackage.LT0, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
        this.w.setColorFilter(colorFilter);
    }

    @Override // defpackage.LT0, defpackage.DT0
    public final void l() {
    }
}
