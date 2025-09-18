package p000;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: Ol1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8065Ol1 extends AbstractC0815Mx {

    /* renamed from: g */
    public boolean f8610g;

    /* renamed from: h */
    public boolean f8611h;

    @Override // p000.AbstractC0815Mx
    /* renamed from: e */
    public void mo5485e(AttributeSet attributeSet) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        super.mo5485e(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, TG0.f11273b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 6) {
                    this.f8610g = true;
                } else if (index == 13) {
                    this.f8611h = true;
                }
            }
        }
    }

    /* renamed from: h */
    public abstract void mo6136h(C6685qW c6685qW, int i, int i2);

    @Override // p000.AbstractC0815Mx, android.view.View
    public final void onAttachedToWindow() throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        ViewParent parent;
        super.onAttachedToWindow();
        if ((this.f8610g || this.f8611h) && (parent = getParent()) != null && (parent instanceof ConstraintLayout)) {
            ConstraintLayout constraintLayout = (ConstraintLayout) parent;
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i = 0; i < this.f7410b; i++) {
                View view = (View) constraintLayout.f16051a.get(this.f7409a[i]);
                if (view != null) {
                    if (this.f8610g) {
                        view.setVisibility(visibility);
                    }
                    if (this.f8611h && elevation > 0.0f) {
                        view.setTranslationZ(view.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        m5483c();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        m5483c();
    }
}
