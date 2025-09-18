package p000;

import android.os.Build;

/* renamed from: Wg */
/* loaded from: classes.dex */
public final class C1427Wg extends AbstractC0752Lx {

    /* renamed from: f */
    public final /* synthetic */ int f13316f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1427Wg(AbstractC1633Zx abstractC1633Zx, int i) {
        super(abstractC1633Zx);
        this.f13316f = i;
    }

    @Override // p000.AbstractC0752Lx
    /* renamed from: a */
    public final boolean mo5157a(C8383Uo1 c8383Uo1) {
        switch (this.f13316f) {
            case 0:
                O90.m5968f(c8383Uo1, "workSpec");
                return c8383Uo1.f12143j.f28117b;
            case 1:
                O90.m5968f(c8383Uo1, "workSpec");
                return c8383Uo1.f12143j.f28119d;
            case 2:
                O90.m5968f(c8383Uo1, "workSpec");
                return c8383Uo1.f12143j.f28116a == 2;
            case 3:
                O90.m5968f(c8383Uo1, "workSpec");
                int i = c8383Uo1.f12143j.f28116a;
                return i == 3 || (Build.VERSION.SDK_INT >= 30 && i == 6);
            default:
                O90.m5968f(c8383Uo1, "workSpec");
                return c8383Uo1.f12143j.f28120e;
        }
    }

    @Override // p000.AbstractC0752Lx
    /* renamed from: b */
    public final boolean mo5158b(Object obj) {
        switch (this.f13316f) {
            case 0:
                return !((Boolean) obj).booleanValue();
            case 1:
                return !((Boolean) obj).booleanValue();
            case 2:
                C8912bv0 c8912bv0 = (C8912bv0) obj;
                O90.m5968f(c8912bv0, "value");
                int i = Build.VERSION.SDK_INT;
                boolean z = c8912bv0.f17225a;
                if (i >= 26) {
                    if (!z || !c8912bv0.f17226b) {
                        return true;
                    }
                } else if (!z) {
                    return true;
                }
                return false;
            case 3:
                C8912bv0 c8912bv02 = (C8912bv0) obj;
                O90.m5968f(c8912bv02, "value");
                return !c8912bv02.f17225a || c8912bv02.f17227c;
            default:
                return !((Boolean) obj).booleanValue();
        }
    }
}
