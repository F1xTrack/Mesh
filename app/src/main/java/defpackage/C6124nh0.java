package defpackage;

import android.view.View;
import android.view.animation.Animation;

/* renamed from: nh0 */
/* loaded from: classes.dex */
public final class C6124nh0 extends AbstractC6181o0 {
    @Override // defpackage.AbstractC6181o0
    public final Animation b(View view, int i, int i2, int i3, int i4) {
        O90.f(view, "view");
        boolean z = true;
        boolean z2 = (((int) view.getX()) == i && ((int) view.getY()) == i2) ? false : true;
        if (view.getWidth() == i3 && view.getHeight() == i4) {
            z = false;
        }
        if (z2 || z) {
            return new C6222oC0(view, i, i2, i3, i4);
        }
        return null;
    }

    @Override // defpackage.AbstractC6181o0
    public final boolean d() {
        return this.d > 0;
    }
}
