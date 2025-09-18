package p000;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

/* renamed from: b2 */
/* loaded from: classes.dex */
public final class C1760b2 extends Drawable {

    /* renamed from: a */
    public final ActionBarContainer f16714a;

    public C1760b2(ActionBarContainer actionBarContainer) {
        this.f16714a = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f16714a;
        if (actionBarContainer.f15787g) {
            Drawable drawable = actionBarContainer.f15786f;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f15784d;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Drawable drawable3 = actionBarContainer.f15785e;
        if (drawable3 == null || !actionBarContainer.f15788h) {
            return;
        }
        drawable3.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        ActionBarContainer actionBarContainer = this.f16714a;
        if (actionBarContainer.f15787g) {
            if (actionBarContainer.f15786f != null) {
                actionBarContainer.f15784d.getOutline(outline);
            }
        } else {
            Drawable drawable = actionBarContainer.f15784d;
            if (drawable != null) {
                drawable.getOutline(outline);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
