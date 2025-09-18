package defpackage;

import android.graphics.Canvas;

/* loaded from: classes.dex */
public final class MT0 extends LT0 {
    @Override // defpackage.LT0, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        AbstractC4368iZ.b();
        if (!this.b && this.c <= 0.0f) {
            super.draw(canvas);
            AbstractC4368iZ.b();
            return;
        }
        e();
        b();
        canvas.clipPath(this.d);
        super.draw(canvas);
        AbstractC4368iZ.b();
    }
}
