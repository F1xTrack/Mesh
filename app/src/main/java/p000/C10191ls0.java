package p000;

import android.graphics.Point;
import com.facebook.yoga.YogaNative;

/* renamed from: ls0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10191ls0 extends C10169lh0 {
    @Override // p000.EM0, p000.DM0
    /* renamed from: g */
    public final void mo1656f(EM0 em0, int i) {
        O90.m5968f(em0, "child");
        super.mo1656f(em0, i);
        S91 s91 = this.f2652d;
        UN1.m7999c(s91);
        Point pointM22278a = AbstractC10063ks0.m22278a(s91);
        YogaNative.jni_YGNodeStyleSetWidthJNI(em0.f2669u.f17997e, pointM22278a.x);
        YogaNative.jni_YGNodeStyleSetHeightJNI(em0.f2669u.f17997e, pointM22278a.y);
    }
}
