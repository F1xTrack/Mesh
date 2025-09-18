package p000;

import android.os.Build;

/* renamed from: Vu0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8446Vu0 extends AbstractC0752Lx {
    static {
        O90.m5967e(C1210TE.m7637M("NetworkNotRoamingCtrlr"), "tagWithPrefix(\"NetworkNotRoamingCtrlr\")");
    }

    @Override // p000.AbstractC0752Lx
    /* renamed from: a */
    public final boolean mo5157a(C8383Uo1 c8383Uo1) {
        O90.m5968f(c8383Uo1, "workSpec");
        return c8383Uo1.f12143j.f28116a == 4;
    }

    @Override // p000.AbstractC0752Lx
    /* renamed from: b */
    public final boolean mo5158b(Object obj) {
        C8912bv0 c8912bv0 = (C8912bv0) obj;
        O90.m5968f(c8912bv0, "value");
        int i = Build.VERSION.SDK_INT;
        boolean z = c8912bv0.f17225a;
        if (i < 24) {
            C1210TE.m7634G().getClass();
            if (z) {
                return false;
            }
        } else if (z && c8912bv0.f17228d) {
            return false;
        }
        return true;
    }
}
