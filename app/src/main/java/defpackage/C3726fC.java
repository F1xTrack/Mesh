package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* renamed from: fC */
/* loaded from: classes.dex */
public final class C3726fC extends C6145no0 {
    public static final /* synthetic */ int z = 0;
    public C3535eC y;

    @Override // defpackage.C6145no0
    public final void e(Canvas canvas) {
        if (this.y.q.isEmpty()) {
            super.e(canvas);
            return;
        }
        canvas.save();
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutRect(this.y.q);
        } else {
            canvas.clipRect(this.y.q, Region.Op.DIFFERENCE);
        }
        super.e(canvas);
        canvas.restore();
    }

    @Override // defpackage.C6145no0, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.y = new C3535eC(this.y);
        return this;
    }

    public final void n(float f, float f2, float f3, float f4) {
        RectF rectF = this.y.q;
        if (f == rectF.left && f2 == rectF.top && f3 == rectF.right && f4 == rectF.bottom) {
            return;
        }
        rectF.set(f, f2, f3, f4);
        invalidateSelf();
    }
}
