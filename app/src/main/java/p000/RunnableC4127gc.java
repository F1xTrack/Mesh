package p000;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.SystemClock;

/* renamed from: gc */
/* loaded from: classes.dex */
public final class RunnableC4127gc extends C7081wX implements Runnable {

    /* renamed from: d */
    public int f27877d;

    /* renamed from: e */
    public boolean f27878e;

    /* renamed from: f */
    public float f27879f;

    /* renamed from: g */
    public boolean f27880g;

    @Override // p000.C7081wX, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int iSave = canvas.save();
        Rect bounds = getBounds();
        int i = bounds.right - bounds.left;
        int i2 = bounds.bottom - bounds.top;
        float f = this.f27879f;
        if (!this.f27878e) {
            f = 360.0f - f;
        }
        canvas.rotate(f, (i / 2) + r3, (i2 / 2) + r1);
        super.draw(canvas);
        canvas.restoreToCount(iSave);
        if (this.f27880g) {
            return;
        }
        this.f27880g = true;
        scheduleSelf(this, SystemClock.uptimeMillis() + 20);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f27880g = false;
        this.f27879f += (int) ((20.0f / this.f27877d) * 360.0f);
        invalidateSelf();
    }
}
