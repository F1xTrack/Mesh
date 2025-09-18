package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;

/* renamed from: eP */
/* loaded from: classes2.dex */
public class C3574eP implements InterfaceC5578kq0 {
    public final String b;

    public C3574eP(EnumC3765fP enumC3765fP, String... strArr) {
        O90.f(strArr, "formatParams");
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
        this.b = String.format(enumC3765fP.a, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    @Override // defpackage.InterfaceC5578kq0
    public Set b() {
        return SN.a;
    }

    @Override // defpackage.InterfaceC3584eS0
    public InterfaceC1087Ns c(C1559Tt0 c1559Tt0, InterfaceC0600Hl0 interfaceC0600Hl0) {
        O90.f(c1559Tt0, "name");
        O90.f(interfaceC0600Hl0, "location");
        XO[] xoArr = XO.a;
        return new WO(C1559Tt0.g(String.format("<Error class: %s>", Arrays.copyOf(new Object[]{c1559Tt0}, 1))));
    }

    @Override // defpackage.InterfaceC5578kq0
    public Set d() {
        return SN.a;
    }

    @Override // defpackage.InterfaceC5578kq0
    public Set f() {
        return SN.a;
    }

    @Override // defpackage.InterfaceC3584eS0
    public Collection g(C4317iI c4317iI, InterfaceC6099nZ interfaceC6099nZ) {
        O90.f(c4317iI, "kindFilter");
        O90.f(interfaceC6099nZ, "nameFilter");
        return MN.a;
    }

    @Override // defpackage.InterfaceC5578kq0
    /* renamed from: h */
    public Set a(C1559Tt0 c1559Tt0, EnumC8453zv0 enumC8453zv0) {
        O90.f(c1559Tt0, "name");
        WO wo = C5496kP.c;
        O90.f(wo, "containingDeclaration");
        H5 h5 = S20.b;
        XO[] xoArr = XO.a;
        YO yo = new YO(wo, null, h5, C1559Tt0.g("<Error function>"), 1, W21.O0);
        MN mn = MN.a;
        yo.D1(null, null, mn, mn, mn, C5496kP.c(EnumC5305jP.e, new String[0]), EnumC6348os0.d, AbstractC7765wI.e);
        return AbstractC7627vZ0.e(yo);
    }

    @Override // defpackage.InterfaceC5578kq0
    /* renamed from: i */
    public Set e(C1559Tt0 c1559Tt0, EnumC8453zv0 enumC8453zv0) {
        O90.f(c1559Tt0, "name");
        return C5496kP.f;
    }

    public String toString() {
        return F91.v(new StringBuilder("ErrorScope{"), this.b, '}');
    }
}
