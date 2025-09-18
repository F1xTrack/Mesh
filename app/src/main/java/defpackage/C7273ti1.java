package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* renamed from: ti1 */
/* loaded from: classes.dex */
public final class C7273ti1 extends Drawable.ConstantState {
    public final Drawable.ConstantState a;

    public C7273ti1(Drawable.ConstantState constantState) {
        this.a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C7464ui1 c7464ui1 = new C7464ui1();
        c7464ui1.a = (VectorDrawable) this.a.newDrawable();
        return c7464ui1;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        C7464ui1 c7464ui1 = new C7464ui1();
        c7464ui1.a = (VectorDrawable) this.a.newDrawable(resources);
        return c7464ui1;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        C7464ui1 c7464ui1 = new C7464ui1();
        c7464ui1.a = (VectorDrawable) this.a.newDrawable(resources, theme);
        return c7464ui1;
    }
}
