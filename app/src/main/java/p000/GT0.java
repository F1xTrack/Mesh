package p000;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class GT0 extends AbstractC10784qU1 {
    @Override // p000.AbstractC10784qU1
    /* renamed from: b */
    public final void mo3068b(C10563om0 c10563om0, float f, float f2) {
        c10563om0.m23556d(f2 * f, 180.0f, 90.0f);
        float f3 = f2 * 2.0f * f;
        ZZ0 zz0 = new ZZ0(0.0f, 0.0f, f3, f3);
        zz0.f14977f = 180.0f;
        zz0.f14978g = 90.0f;
        ((ArrayList) c10563om0.f39258f).add(zz0);
        XZ0 xz0 = new XZ0(zz0);
        c10563om0.m23553a(180.0f);
        ((ArrayList) c10563om0.f39259g).add(xz0);
        c10563om0.f39256d = 270.0f;
        float f4 = (0.0f + f3) * 0.5f;
        float f5 = (f3 - 0.0f) / 2.0f;
        double d = 270.0f;
        c10563om0.f39254b = (((float) Math.cos(Math.toRadians(d))) * f5) + f4;
        c10563om0.f39255c = (f5 * ((float) Math.sin(Math.toRadians(d)))) + f4;
    }
}
