package defpackage;

import android.os.Build;

/* renamed from: Vu0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1718Vu0 extends AbstractC0946Lx {
    static {
        O90.e(TE.M("NetworkNotRoamingCtrlr"), "tagWithPrefix(\"NetworkNotRoamingCtrlr\")");
    }

    @Override // defpackage.AbstractC0946Lx
    public final boolean a(C1623Uo1 c1623Uo1) {
        O90.f(c1623Uo1, "workSpec");
        return c1623Uo1.j.a == 4;
    }

    @Override // defpackage.AbstractC0946Lx
    public final boolean b(Object obj) {
        C2415bv0 c2415bv0 = (C2415bv0) obj;
        O90.f(c2415bv0, "value");
        int i = Build.VERSION.SDK_INT;
        boolean z = c2415bv0.a;
        if (i < 24) {
            TE.G().getClass();
            if (z) {
                return false;
            }
        } else if (z && c2415bv0.d) {
            return false;
        }
        return true;
    }
}
