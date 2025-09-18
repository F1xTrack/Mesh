package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class GT0 extends AbstractC6659qU1 {
    @Override // defpackage.AbstractC6659qU1
    public final void b(C6330om0 c6330om0, float f, float f2) {
        c6330om0.d(f2 * f, 180.0f, 90.0f);
        float f3 = f2 * 2.0f * f;
        ZZ0 zz0 = new ZZ0(0.0f, 0.0f, f3, f3);
        zz0.f = 180.0f;
        zz0.g = 90.0f;
        ((ArrayList) c6330om0.f).add(zz0);
        XZ0 xz0 = new XZ0(zz0);
        c6330om0.a(180.0f);
        ((ArrayList) c6330om0.g).add(xz0);
        c6330om0.d = 270.0f;
        float f4 = (0.0f + f3) * 0.5f;
        float f5 = (f3 - 0.0f) / 2.0f;
        double d = 270.0f;
        c6330om0.b = (((float) Math.cos(Math.toRadians(d))) * f5) + f4;
        c6330om0.c = (f5 * ((float) Math.sin(Math.toRadians(d)))) + f4;
    }
}
