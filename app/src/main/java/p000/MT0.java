package p000;

import android.graphics.Canvas;

/* loaded from: classes.dex */
public final class MT0 extends LT0 {
    @Override // p000.LT0, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        AbstractC4250iZ.m19063b();
        if (!this.f6638b && this.f6639c <= 0.0f) {
            super.draw(canvas);
            AbstractC4250iZ.m19063b();
            return;
        }
        mo2306e();
        m5004b();
        canvas.clipPath(this.f6640d);
        super.draw(canvas);
        AbstractC4250iZ.m19063b();
    }
}
