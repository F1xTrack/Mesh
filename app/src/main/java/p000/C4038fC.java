package p000;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* renamed from: fC */
/* loaded from: classes.dex */
public final class C4038fC extends C10439no0 {

    /* renamed from: z */
    public static final /* synthetic */ int f27107z = 0;

    /* renamed from: y */
    public C3975eC f27108y;

    @Override // p000.C10439no0
    /* renamed from: e */
    public final void mo18194e(Canvas canvas) {
        if (this.f27108y.f26589q.isEmpty()) {
            super.mo18194e(canvas);
            return;
        }
        canvas.save();
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutRect(this.f27108y.f26589q);
        } else {
            canvas.clipRect(this.f27108y.f26589q, Region.Op.DIFFERENCE);
        }
        super.mo18194e(canvas);
        canvas.restore();
    }

    @Override // p000.C10439no0, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.f27108y = new C3975eC(this.f27108y);
        return this;
    }

    /* renamed from: n */
    public final void m18195n(float f, float f2, float f3, float f4) {
        RectF rectF = this.f27108y.f26589q;
        if (f == rectF.left && f2 == rectF.top && f3 == rectF.right && f4 == rectF.bottom) {
            return;
        }
        rectF.set(f, f2, f3, f4);
        invalidateSelf();
    }
}
