package p000;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* renamed from: ti1 */
/* loaded from: classes.dex */
public final class C11196ti1 extends Drawable.ConstantState {

    /* renamed from: a */
    public final Drawable.ConstantState f43224a;

    public C11196ti1(Drawable.ConstantState constantState) {
        this.f43224a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.f43224a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f43224a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C11324ui1 c11324ui1 = new C11324ui1();
        c11324ui1.f37260a = (VectorDrawable) this.f43224a.newDrawable();
        return c11324ui1;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        C11324ui1 c11324ui1 = new C11324ui1();
        c11324ui1.f37260a = (VectorDrawable) this.f43224a.newDrawable(resources);
        return c11324ui1;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        C11324ui1 c11324ui1 = new C11324ui1();
        c11324ui1.f37260a = (VectorDrawable) this.f43224a.newDrawable(resources, theme);
        return c11324ui1;
    }
}
