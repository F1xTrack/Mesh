package defpackage;

import android.graphics.drawable.Drawable;

/* renamed from: ix1 */
/* loaded from: classes.dex */
public final class C5218ix1 extends Drawable.ConstantState {
    public int a;
    public int b;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new C5600kx1(this);
    }
}
