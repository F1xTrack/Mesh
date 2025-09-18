package defpackage;

import android.os.Build;

/* renamed from: Wg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1753Wg extends AbstractC0946Lx {
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1753Wg(AbstractC2038Zx abstractC2038Zx, int i) {
        super(abstractC2038Zx);
        this.f = i;
    }

    @Override // defpackage.AbstractC0946Lx
    public final boolean a(C1623Uo1 c1623Uo1) {
        switch (this.f) {
            case 0:
                O90.f(c1623Uo1, "workSpec");
                return c1623Uo1.j.b;
            case 1:
                O90.f(c1623Uo1, "workSpec");
                return c1623Uo1.j.d;
            case 2:
                O90.f(c1623Uo1, "workSpec");
                return c1623Uo1.j.a == 2;
            case 3:
                O90.f(c1623Uo1, "workSpec");
                int i = c1623Uo1.j.a;
                return i == 3 || (Build.VERSION.SDK_INT >= 30 && i == 6);
            default:
                O90.f(c1623Uo1, "workSpec");
                return c1623Uo1.j.e;
        }
    }

    @Override // defpackage.AbstractC0946Lx
    public final boolean b(Object obj) {
        switch (this.f) {
            case 0:
                return !((Boolean) obj).booleanValue();
            case 1:
                return !((Boolean) obj).booleanValue();
            case 2:
                C2415bv0 c2415bv0 = (C2415bv0) obj;
                O90.f(c2415bv0, "value");
                int i = Build.VERSION.SDK_INT;
                boolean z = c2415bv0.a;
                if (i >= 26) {
                    if (!z || !c2415bv0.b) {
                        return true;
                    }
                } else if (!z) {
                    return true;
                }
                return false;
            case 3:
                C2415bv0 c2415bv02 = (C2415bv0) obj;
                O90.f(c2415bv02, "value");
                return !c2415bv02.a || c2415bv02.c;
            default:
                return !((Boolean) obj).booleanValue();
        }
    }
}
