package defpackage;

import android.util.Size;

/* renamed from: g60, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3900g60 {
    public static final C6013n60 a;

    static {
        Object size = new Size(640, 480);
        CM cm = CM.d;
        C1538Tm0 c1538Tm0 = C1538Tm0.b;
        Size size2 = AbstractC3696f21.c;
        C4157hS0 c4157hS0 = new C4157hS0();
        c4157hS0.a = size2;
        c4157hS0.b = 1;
        Object c3775fS0 = new C3775fS0(c1538Tm0, c4157hS0, null, 0);
        C3709f60 c3709f60 = new C3709f60(0);
        C0572Hc c0572Hc = Y60.F0;
        C0468Ft0 c0468Ft0 = c3709f60.b;
        c0468Ft0.e(c0572Hc, size);
        c0468Ft0.e(InterfaceC5361jh1.Y0, 1);
        c0468Ft0.e(Y60.A0, 0);
        c0468Ft0.e(Y60.I0, c3775fS0);
        if (!cm.equals(cm)) {
            throw new UnsupportedOperationException("ImageAnalysis currently only supports SDR");
        }
        c0468Ft0.e(M60.z0, cm);
        a = c3709f60.b();
    }
}
