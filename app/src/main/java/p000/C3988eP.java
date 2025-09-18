package p000;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;

/* renamed from: eP */
/* loaded from: classes2.dex */
public class C3988eP implements InterfaceC10059kq0 {

    /* renamed from: b */
    public final String f26694b;

    public C3988eP(EnumC4051fP enumC4051fP, String... strArr) {
        O90.m5968f(strArr, "formatParams");
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
        this.f26694b = String.format(enumC4051fP.f27182a, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    @Override // p000.InterfaceC10059kq0
    /* renamed from: b */
    public Set mo6677b() {
        return C1156SN.f10705a;
    }

    @Override // p000.InterfaceC9243eS0
    /* renamed from: c */
    public InterfaceC0873Ns mo1770c(C8340Tt0 c8340Tt0, InterfaceC7700Hl0 interfaceC7700Hl0) {
        O90.m5968f(c8340Tt0, "name");
        O90.m5968f(interfaceC7700Hl0, "location");
        EnumC1472XO[] enumC1472XOArr = EnumC1472XO.f13686a;
        return new C1409WO(C8340Tt0.m7800g(String.format("<Error class: %s>", Arrays.copyOf(new Object[]{c8340Tt0}, 1))));
    }

    @Override // p000.InterfaceC10059kq0
    /* renamed from: d */
    public Set mo4153d() {
        return C1156SN.f10705a;
    }

    @Override // p000.InterfaceC10059kq0
    /* renamed from: f */
    public Set mo6678f() {
        return C1156SN.f10705a;
    }

    @Override // p000.InterfaceC9243eS0
    /* renamed from: g */
    public Collection mo2108g(C4233iI c4233iI, InterfaceC6497nZ interfaceC6497nZ) {
        O90.m5968f(c4233iI, "kindFilter");
        O90.m5968f(interfaceC6497nZ, "nameFilter");
        return C0779MN.f7117a;
    }

    @Override // p000.InterfaceC10059kq0
    /* renamed from: h */
    public Set mo1769a(C8340Tt0 c8340Tt0, EnumC11985zv0 enumC11985zv0) {
        O90.m5968f(c8340Tt0, "name");
        C1409WO c1409wo = C6298kP.f36484c;
        O90.m5968f(c1409wo, "containingDeclaration");
        C0447H5 c0447h5 = S20.f10539b;
        EnumC1472XO[] enumC1472XOArr = EnumC1472XO.f13686a;
        C1535YO c1535yo = new C1535YO(c1409wo, null, c0447h5, C8340Tt0.m7800g("<Error function>"), 1, W21.f12940O0);
        C0779MN c0779mn = C0779MN.f7117a;
        c1535yo.mo1215D1(null, null, c0779mn, c0779mn, c0779mn, C6298kP.m22197c(EnumC6235jP.f35120e, new String[0]), EnumC10575os0.f39325d, AbstractC7066wI.f44764e);
        return AbstractC11433vZ0.m25454e(c1535yo);
    }

    @Override // p000.InterfaceC10059kq0
    /* renamed from: i */
    public Set mo1771e(C8340Tt0 c8340Tt0, EnumC11985zv0 enumC11985zv0) {
        O90.m5968f(c8340Tt0, "name");
        return C6298kP.f36487f;
    }

    public String toString() {
        return F91.m2539v(new StringBuilder("ErrorScope{"), this.f26694b, '}');
    }
}
