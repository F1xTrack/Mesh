package defpackage;

import android.view.View;
import android.view.ViewParent;

/* renamed from: vW0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7618vW0 extends AbstractC3774fS {
    public int a;
    public int b;
    public EnumC7427uW0 c;

    public final C6854rW0 getConfig() {
        ViewParent parent = getParent();
        ZB zb = parent instanceof ZB ? (ZB) parent : null;
        if (zb != null) {
            return zb.getConfig();
        }
        return null;
    }

    public final EnumC7427uW0 getType() {
        return this.c;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) == 1073741824 && View.MeasureSpec.getMode(i2) == 1073741824) {
            this.a = View.MeasureSpec.getSize(i);
            this.b = View.MeasureSpec.getSize(i2);
            Object parent = getParent();
            if (parent != null) {
                forceLayout();
                ((View) parent).requestLayout();
            }
        }
        setMeasuredDimension(this.a, this.b);
    }

    public final void setType(EnumC7427uW0 enumC7427uW0) {
        O90.f(enumC7427uW0, "<set-?>");
        this.c = enumC7427uW0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
