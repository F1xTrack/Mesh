package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.SystemClock;

/* renamed from: gc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC3995gc extends C7810wX implements Runnable {
    public int d;
    public boolean e;
    public float f;
    public boolean g;

    @Override // defpackage.C7810wX, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int iSave = canvas.save();
        Rect bounds = getBounds();
        int i = bounds.right - bounds.left;
        int i2 = bounds.bottom - bounds.top;
        float f = this.f;
        if (!this.e) {
            f = 360.0f - f;
        }
        canvas.rotate(f, (i / 2) + r3, (i2 / 2) + r1);
        super.draw(canvas);
        canvas.restoreToCount(iSave);
        if (this.g) {
            return;
        }
        this.g = true;
        scheduleSelf(this, SystemClock.uptimeMillis() + 20);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.g = false;
        this.f += (int) ((20.0f / this.d) * 360.0f);
        invalidateSelf();
    }
}
