package p000;

import android.graphics.drawable.Drawable;

/* renamed from: ix1 */
/* loaded from: classes.dex */
public final class C9818ix1 extends Drawable.ConstantState {

    /* renamed from: a */
    public int f34817a;

    /* renamed from: b */
    public int f34818b;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f34817a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new C10074kx1(this);
    }
}
