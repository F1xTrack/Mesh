package defpackage;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: Ol1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1146Ol1 extends AbstractC1024Mx {
    public boolean g;
    public boolean h;

    @Override // defpackage.AbstractC1024Mx
    public void e(AttributeSet attributeSet) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        super.e(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, TG0.b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 6) {
                    this.g = true;
                } else if (index == 13) {
                    this.h = true;
                }
            }
        }
    }

    public abstract void h(C6663qW c6663qW, int i, int i2);

    @Override // defpackage.AbstractC1024Mx, android.view.View
    public final void onAttachedToWindow() throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        ViewParent parent;
        super.onAttachedToWindow();
        if ((this.g || this.h) && (parent = getParent()) != null && (parent instanceof ConstraintLayout)) {
            ConstraintLayout constraintLayout = (ConstraintLayout) parent;
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i = 0; i < this.b; i++) {
                View view = (View) constraintLayout.a.get(this.a[i]);
                if (view != null) {
                    if (this.g) {
                        view.setVisibility(visibility);
                    }
                    if (this.h && elevation > 0.0f) {
                        view.setTranslationZ(view.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        c();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        c();
    }
}
