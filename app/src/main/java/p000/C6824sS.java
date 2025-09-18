package p000;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import kotlin.KotlinVersion;

/* renamed from: sS */
/* loaded from: classes2.dex */
public final class C6824sS extends Drawable {

    /* renamed from: b */
    public final Bitmap f42435b;

    /* renamed from: d */
    public final int f42437d;

    /* renamed from: e */
    public final int f42438e;

    /* renamed from: a */
    public final Paint f42434a = new Paint(2);

    /* renamed from: c */
    public int f42436c = KotlinVersion.MAX_COMPONENT_VALUE;

    public C6824sS(Bitmap bitmap) {
        this.f42435b = bitmap;
        if (bitmap != null) {
            this.f42437d = bitmap.getWidth();
            this.f42438e = this.f42435b.getHeight();
        } else {
            this.f42438e = 0;
            this.f42437d = 0;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Bitmap bitmap = this.f42435b;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        canvas.drawBitmap(this.f42435b, (Rect) null, getBounds(), this.f42434a);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f42436c;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f42438e;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f42437d;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return this.f42438e;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return this.f42437d;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f42436c = i;
        this.f42434a.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f42434a.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z) {
        this.f42434a.setFilterBitmap(z);
    }
}
