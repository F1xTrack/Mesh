package p000;

import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Build;

/* loaded from: classes.dex */
public abstract class IZ1 {
    /* renamed from: a */
    public static final InterfaceC0873Ns m3935a(InterfaceC0140CD interfaceC0140CD) {
        O90.m5968f(interfaceC0140CD, "<this>");
        InterfaceC0140CD interfaceC0140CDMo423i = interfaceC0140CD.mo423i();
        if (interfaceC0140CDMo423i == null || (interfaceC0140CD instanceof InterfaceC11993zz0)) {
            return null;
        }
        if (!(interfaceC0140CDMo423i.mo423i() instanceof InterfaceC11993zz0)) {
            return m3935a(interfaceC0140CDMo423i);
        }
        if (interfaceC0140CDMo423i instanceof InterfaceC0873Ns) {
            return (InterfaceC0873Ns) interfaceC0140CDMo423i;
        }
        return null;
    }

    /* renamed from: b */
    public static Typeface m3936b(Configuration configuration, Typeface typeface) {
        if (Build.VERSION.SDK_INT < 31 || configuration.fontWeightAdjustment == Integer.MAX_VALUE || configuration.fontWeightAdjustment == 0 || typeface == null) {
            return null;
        }
        return Typeface.create(typeface, AbstractC7677Gz1.m3204a(configuration.fontWeightAdjustment + typeface.getWeight(), 1, 1000), typeface.isItalic());
    }

    /* renamed from: c */
    public static final InterfaceC6976us m3937c(C7454Cs0 c7454Cs0, C0664KX c0664kx) {
        InterfaceC0873Ns interfaceC0873NsMo1770c;
        InterfaceC10059kq0 interfaceC10059kq0Mo1486I0;
        EnumC11985zv0 enumC11985zv0 = EnumC11985zv0.f47094a;
        O90.m5968f(c7454Cs0, "<this>");
        O90.m5968f(c0664kx, "fqName");
        if (c0664kx.m4656d()) {
            return null;
        }
        C0664KX c0664kxM4657e = c0664kx.m4657e();
        O90.m5967e(c0664kxM4657e, "parent(...)");
        C8524Xh0 c8524Xh0 = (C8524Xh0) c7454Cs0.mo895C0(c0664kxM4657e);
        C8340Tt0 c8340Tt0M4658f = c0664kx.m4658f();
        O90.m5967e(c8340Tt0M4658f, "shortName(...)");
        InterfaceC0873Ns interfaceC0873NsMo1770c2 = c8524Xh0.f13926h.mo1770c(c8340Tt0M4658f, enumC11985zv0);
        InterfaceC6976us interfaceC6976us = interfaceC0873NsMo1770c2 instanceof InterfaceC6976us ? (InterfaceC6976us) interfaceC0873NsMo1770c2 : null;
        if (interfaceC6976us != null) {
            return interfaceC6976us;
        }
        C0664KX c0664kxM4657e2 = c0664kx.m4657e();
        O90.m5967e(c0664kxM4657e2, "parent(...)");
        InterfaceC6976us interfaceC6976usM3937c = m3937c(c7454Cs0, c0664kxM4657e2);
        if (interfaceC6976usM3937c == null || (interfaceC10059kq0Mo1486I0 = interfaceC6976usM3937c.mo1486I0()) == null) {
            interfaceC0873NsMo1770c = null;
        } else {
            C8340Tt0 c8340Tt0M4658f2 = c0664kx.m4658f();
            O90.m5967e(c8340Tt0M4658f2, "shortName(...)");
            interfaceC0873NsMo1770c = interfaceC10059kq0Mo1486I0.mo1770c(c8340Tt0M4658f2, enumC11985zv0);
        }
        if (interfaceC0873NsMo1770c instanceof InterfaceC6976us) {
            return (InterfaceC6976us) interfaceC0873NsMo1770c;
        }
        return null;
    }
}
