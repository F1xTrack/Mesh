package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* renamed from: c5 */
/* loaded from: classes.dex */
public final class C2448c5 extends Drawable.ConstantState {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ C2448c5(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public boolean canApplyTheme() {
        switch (this.a) {
            case 0:
                return ((Drawable.ConstantState) this.b).canApplyTheme();
            default:
                return super.canApplyTheme();
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        switch (this.a) {
            case 0:
                return ((Drawable.ConstantState) this.b).getChangingConfigurations();
            case 1:
                return 0;
            default:
                return 0;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        switch (this.a) {
            case 0:
                C3324d5 c3324d5 = new C3324d5(null);
                Drawable drawableNewDrawable = ((Drawable.ConstantState) this.b).newDrawable();
                c3324d5.a = drawableNewDrawable;
                drawableNewDrawable.setCallback(c3324d5.f);
                return c3324d5;
            case 1:
                return new C3500e10(this);
            default:
                return new C1773Wm1(this);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        switch (this.a) {
            case 0:
                C3324d5 c3324d5 = new C3324d5(null);
                Drawable drawableNewDrawable = ((Drawable.ConstantState) this.b).newDrawable(resources);
                c3324d5.a = drawableNewDrawable;
                drawableNewDrawable.setCallback(c3324d5.f);
                return c3324d5;
            case 1:
                return new C3500e10(this);
            default:
                return new C1773Wm1(this);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources, Resources.Theme theme) {
        switch (this.a) {
            case 0:
                C3324d5 c3324d5 = new C3324d5(null);
                Drawable drawableNewDrawable = ((Drawable.ConstantState) this.b).newDrawable(resources, theme);
                c3324d5.a = drawableNewDrawable;
                drawableNewDrawable.setCallback(c3324d5.f);
                return c3324d5;
            default:
                return super.newDrawable(resources, theme);
        }
    }
}
