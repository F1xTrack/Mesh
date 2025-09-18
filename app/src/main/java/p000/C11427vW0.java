package p000;

import android.view.View;
import android.view.ViewParent;

/* renamed from: vW0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11427vW0 extends AbstractC4054fS {

    /* renamed from: a */
    public int f44397a;

    /* renamed from: b */
    public int f44398b;

    /* renamed from: c */
    public EnumC11299uW0 f44399c;

    public final C10915rW0 getConfig() {
        ViewParent parent = getParent();
        C1585ZB c1585zb = parent instanceof C1585ZB ? (C1585ZB) parent : null;
        if (c1585zb != null) {
            return c1585zb.getConfig();
        }
        return null;
    }

    public final EnumC11299uW0 getType() {
        return this.f44399c;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) == 1073741824 && View.MeasureSpec.getMode(i2) == 1073741824) {
            this.f44397a = View.MeasureSpec.getSize(i);
            this.f44398b = View.MeasureSpec.getSize(i2);
            Object parent = getParent();
            if (parent != null) {
                forceLayout();
                ((View) parent).requestLayout();
            }
        }
        setMeasuredDimension(this.f44397a, this.f44398b);
    }

    public final void setType(EnumC11299uW0 enumC11299uW0) {
        O90.m5968f(enumC11299uW0, "<set-?>");
        this.f44399c = enumC11299uW0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
