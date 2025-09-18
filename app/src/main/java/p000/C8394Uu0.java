package p000;

import android.os.Build;

/* renamed from: Uu0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8394Uu0 extends AbstractC0752Lx {
    static {
        O90.m5967e(C1210TE.m7637M("NetworkMeteredCtrlr"), "tagWithPrefix(\"NetworkMeteredCtrlr\")");
    }

    @Override // p000.AbstractC0752Lx
    /* renamed from: a */
    public final boolean mo5157a(C8383Uo1 c8383Uo1) {
        O90.m5968f(c8383Uo1, "workSpec");
        return c8383Uo1.f12143j.f28116a == 5;
    }

    @Override // p000.AbstractC0752Lx
    /* renamed from: b */
    public final boolean mo5158b(Object obj) {
        C8912bv0 c8912bv0 = (C8912bv0) obj;
        O90.m5968f(c8912bv0, "value");
        int i = Build.VERSION.SDK_INT;
        boolean z = c8912bv0.f17225a;
        if (i < 26) {
            C1210TE.m7634G().getClass();
            if (z) {
                return false;
            }
        } else if (z && c8912bv0.f17227c) {
            return false;
        }
        return true;
    }
}
