package p000;

import android.graphics.Point;
import com.facebook.yoga.YogaNative;

/* renamed from: lz0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10205lz0 extends C10169lh0 {
    @Override // p000.EM0, p000.DM0
    /* renamed from: g */
    public final void mo1656f(EM0 em0, int i) {
        O90.m5968f(em0, "child");
        super.mo1656f(em0, i);
        S91 s91 = this.f2652d;
        UN1.m7999c(s91);
        Point pointM9753b = AbstractC8731aU1.m9753b(s91);
        YogaNative.jni_YGNodeStyleSetWidthJNI(em0.f2669u.f17997e, pointM9753b.x);
        YogaNative.jni_YGNodeStyleSetHeightJNI(em0.f2669u.f17997e, pointM9753b.y);
    }
}
