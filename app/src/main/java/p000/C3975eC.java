package p000;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: eC */
/* loaded from: classes.dex */
public final class C3975eC extends C10311mo0 {

    /* renamed from: q */
    public final RectF f26589q;

    public C3975eC(LZ0 lz0, RectF rectF) {
        super(lz0);
        this.f26589q = rectF;
    }

    @Override // p000.C10311mo0, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C4038fC c4038fC = new C4038fC(this);
        c4038fC.f27108y = this;
        c4038fC.invalidateSelf();
        return c4038fC;
    }

    public C3975eC(C3975eC c3975eC) {
        super(c3975eC);
        this.f26589q = c3975eC.f26589q;
    }
}
