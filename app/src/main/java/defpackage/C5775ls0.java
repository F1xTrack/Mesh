package defpackage;

import android.graphics.Point;
import com.facebook.yoga.YogaNative;

/* renamed from: ls0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5775ls0 extends C5742lh0 {
    @Override // defpackage.EM0, defpackage.DM0
    /* renamed from: g */
    public final void f(EM0 em0, int i) {
        O90.f(em0, "child");
        super.f(em0, i);
        S91 s91 = this.d;
        UN1.c(s91);
        Point pointA = AbstractC5584ks0.a(s91);
        YogaNative.jni_YGNodeStyleSetWidthJNI(em0.u.e, pointA.x);
        YogaNative.jni_YGNodeStyleSetHeightJNI(em0.u.e, pointA.y);
    }
}
