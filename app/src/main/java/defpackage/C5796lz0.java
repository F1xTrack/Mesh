package defpackage;

import android.graphics.Point;
import com.facebook.yoga.YogaNative;

/* renamed from: lz0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5796lz0 extends C5742lh0 {
    @Override // defpackage.EM0, defpackage.DM0
    /* renamed from: g */
    public final void f(EM0 em0, int i) {
        O90.f(em0, "child");
        super.f(em0, i);
        S91 s91 = this.d;
        UN1.c(s91);
        Point pointB = AbstractC2144aU1.b(s91);
        YogaNative.jni_YGNodeStyleSetWidthJNI(em0.u.e, pointB.x);
        YogaNative.jni_YGNodeStyleSetHeightJNI(em0.u.e, pointB.y);
    }
}
