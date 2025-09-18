package p000;

import android.view.View;
import android.view.animation.Animation;

/* renamed from: nh0 */
/* loaded from: classes.dex */
public final class C10425nh0 extends AbstractC6525o0 {
    @Override // p000.AbstractC6525o0
    /* renamed from: b */
    public final Animation mo23168b(View view, int i, int i2, int i3, int i4) {
        O90.m5968f(view, "view");
        boolean z = true;
        boolean z2 = (((int) view.getX()) == i && ((int) view.getY()) == i2) ? false : true;
        if (view.getWidth() == i3 && view.getHeight() == i4) {
            z = false;
        }
        if (z2 || z) {
            return new C10491oC0(view, i, i2, i3, i4);
        }
        return null;
    }

    @Override // p000.AbstractC6525o0
    /* renamed from: d */
    public final boolean mo23169d() {
        return this.f38666d > 0;
    }
}
