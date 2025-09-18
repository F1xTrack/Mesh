package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: eC, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3535eC extends C5954mo0 {
    public final RectF q;

    public C3535eC(LZ0 lz0, RectF rectF) {
        super(lz0);
        this.q = rectF;
    }

    @Override // defpackage.C5954mo0, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C3726fC c3726fC = new C3726fC(this);
        c3726fC.y = this;
        c3726fC.invalidateSelf();
        return c3726fC;
    }

    public C3535eC(C3535eC c3535eC) {
        super(c3535eC);
        this.q = c3535eC.q;
    }
}
