package defpackage;

import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Build;

/* loaded from: classes.dex */
public abstract class IZ1 {
    public static final InterfaceC1087Ns a(CD cd) {
        O90.f(cd, "<this>");
        CD cdI = cd.i();
        if (cdI == null || (cd instanceof InterfaceC8465zz0)) {
            return null;
        }
        if (!(cdI.i() instanceof InterfaceC8465zz0)) {
            return a(cdI);
        }
        if (cdI instanceof InterfaceC1087Ns) {
            return (InterfaceC1087Ns) cdI;
        }
        return null;
    }

    public static Typeface b(Configuration configuration, Typeface typeface) {
        if (Build.VERSION.SDK_INT < 31 || configuration.fontWeightAdjustment == Integer.MAX_VALUE || configuration.fontWeightAdjustment == 0 || typeface == null) {
            return null;
        }
        return Typeface.create(typeface, AbstractC0565Gz1.a(configuration.fontWeightAdjustment + typeface.getWeight(), 1, 1000), typeface.isItalic());
    }

    public static final InterfaceC7492us c(C0231Cs0 c0231Cs0, KX kx) {
        InterfaceC1087Ns interfaceC1087NsC;
        InterfaceC5578kq0 interfaceC5578kq0I0;
        EnumC8453zv0 enumC8453zv0 = EnumC8453zv0.a;
        O90.f(c0231Cs0, "<this>");
        O90.f(kx, "fqName");
        if (kx.d()) {
            return null;
        }
        KX kxE = kx.e();
        O90.e(kxE, "parent(...)");
        C1835Xh0 c1835Xh0 = (C1835Xh0) c0231Cs0.C0(kxE);
        C1559Tt0 c1559Tt0F = kx.f();
        O90.e(c1559Tt0F, "shortName(...)");
        InterfaceC1087Ns interfaceC1087NsC2 = c1835Xh0.h.c(c1559Tt0F, enumC8453zv0);
        InterfaceC7492us interfaceC7492us = interfaceC1087NsC2 instanceof InterfaceC7492us ? (InterfaceC7492us) interfaceC1087NsC2 : null;
        if (interfaceC7492us != null) {
            return interfaceC7492us;
        }
        KX kxE2 = kx.e();
        O90.e(kxE2, "parent(...)");
        InterfaceC7492us interfaceC7492usC = c(c0231Cs0, kxE2);
        if (interfaceC7492usC == null || (interfaceC5578kq0I0 = interfaceC7492usC.I0()) == null) {
            interfaceC1087NsC = null;
        } else {
            C1559Tt0 c1559Tt0F2 = kx.f();
            O90.e(c1559Tt0F2, "shortName(...)");
            interfaceC1087NsC = interfaceC5578kq0I0.c(c1559Tt0F2, enumC8453zv0);
        }
        if (interfaceC1087NsC instanceof InterfaceC7492us) {
            return (InterfaceC7492us) interfaceC1087NsC;
        }
        return null;
    }
}
