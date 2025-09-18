package p000;

import android.animation.AnimatorSet;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;

/* renamed from: b5 */
/* loaded from: classes.dex */
public final class C1763b5 extends Drawable.ConstantState {

    /* renamed from: a */
    public C11324ui1 f16737a;

    /* renamed from: b */
    public AnimatorSet f16738b;

    /* renamed from: c */
    public ArrayList f16739c;

    /* renamed from: d */
    public C7119x8 f16740d;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }
}
