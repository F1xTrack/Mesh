package p000;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* renamed from: c5 */
/* loaded from: classes.dex */
public final class C1825c5 extends Drawable.ConstantState {

    /* renamed from: a */
    public final /* synthetic */ int f17292a;

    /* renamed from: b */
    public final Object f17293b;

    public /* synthetic */ C1825c5(int i, Object obj) {
        this.f17292a = i;
        this.f17293b = obj;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public boolean canApplyTheme() {
        switch (this.f17292a) {
            case 0:
                return ((Drawable.ConstantState) this.f17293b).canApplyTheme();
            default:
                return super.canApplyTheme();
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        switch (this.f17292a) {
            case 0:
                return ((Drawable.ConstantState) this.f17293b).getChangingConfigurations();
            case 1:
                return 0;
            default:
                return 0;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        switch (this.f17292a) {
            case 0:
                C3906d5 c3906d5 = new C3906d5(null);
                Drawable drawableNewDrawable = ((Drawable.ConstantState) this.f17293b).newDrawable();
                c3906d5.f37260a = drawableNewDrawable;
                drawableNewDrawable.setCallback(c3906d5.f25807f);
                return c3906d5;
            case 1:
                return new C9186e10(this);
            default:
                return new C8483Wm1(this);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        switch (this.f17292a) {
            case 0:
                C3906d5 c3906d5 = new C3906d5(null);
                Drawable drawableNewDrawable = ((Drawable.ConstantState) this.f17293b).newDrawable(resources);
                c3906d5.f37260a = drawableNewDrawable;
                drawableNewDrawable.setCallback(c3906d5.f25807f);
                return c3906d5;
            case 1:
                return new C9186e10(this);
            default:
                return new C8483Wm1(this);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources, Resources.Theme theme) {
        switch (this.f17292a) {
            case 0:
                C3906d5 c3906d5 = new C3906d5(null);
                Drawable drawableNewDrawable = ((Drawable.ConstantState) this.f17293b).newDrawable(resources, theme);
                c3906d5.f37260a = drawableNewDrawable;
                drawableNewDrawable.setCallback(c3906d5.f25807f);
                return c3906d5;
            default:
                return super.newDrawable(resources, theme);
        }
    }
}
