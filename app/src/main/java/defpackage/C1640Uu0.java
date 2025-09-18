package defpackage;

import android.os.Build;

/* renamed from: Uu0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1640Uu0 extends AbstractC0946Lx {
    static {
        O90.e(TE.M("NetworkMeteredCtrlr"), "tagWithPrefix(\"NetworkMeteredCtrlr\")");
    }

    @Override // defpackage.AbstractC0946Lx
    public final boolean a(C1623Uo1 c1623Uo1) {
        O90.f(c1623Uo1, "workSpec");
        return c1623Uo1.j.a == 5;
    }

    @Override // defpackage.AbstractC0946Lx
    public final boolean b(Object obj) {
        C2415bv0 c2415bv0 = (C2415bv0) obj;
        O90.f(c2415bv0, "value");
        int i = Build.VERSION.SDK_INT;
        boolean z = c2415bv0.a;
        if (i < 26) {
            TE.G().getClass();
            if (z) {
                return false;
            }
        } else if (z && c2415bv0.c) {
            return false;
        }
        return true;
    }
}
