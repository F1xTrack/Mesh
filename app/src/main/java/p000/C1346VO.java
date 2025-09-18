package p000;

import java.util.List;

/* renamed from: VO */
/* loaded from: classes2.dex */
public final class C1346VO implements InterfaceC1160SR {
    @Override // p000.InterfaceC1160SR
    /* renamed from: a */
    public EnumC1035QR mo7369a() {
        return EnumC1035QR.f9622b;
    }

    @Override // p000.InterfaceC1160SR
    /* renamed from: b */
    public EnumC1097RR mo7370b(InterfaceC7032vl interfaceC7032vl, InterfaceC7032vl interfaceC7032vl2, InterfaceC6976us interfaceC6976us) {
        O90.m5968f(interfaceC7032vl, "superDescriptor");
        O90.m5968f(interfaceC7032vl2, "subDescriptor");
        boolean z = interfaceC7032vl2 instanceof C9261eb0;
        EnumC1097RR enumC1097RR = EnumC1097RR.f10177c;
        if (!z) {
            return enumC1097RR;
        }
        C9261eb0 c9261eb0 = (C9261eb0) interfaceC7032vl2;
        if (!c9261eb0.getTypeParameters().isEmpty()) {
            return enumC1097RR;
        }
        C11101sz0 c11101sz0M25052i = C11229tz0.m25052i(interfaceC7032vl, interfaceC7032vl2);
        if ((c11101sz0M25052i != null ? c11101sz0M25052i.m24815c() : 0) != 0) {
            return enumC1097RR;
        }
        List listMo1221f0 = c9261eb0.mo1221f0();
        O90.m5967e(listMo1221f0, "getValueParameters(...)");
        C7319Ac1 c7319Ac1M18833l = AbstractC9639hY0.m18833l(AbstractC7167xu.m25992t(listMo1221f0), C6228jI.f35044v);
        AbstractC7742Ig0 abstractC7742Ig0 = c9261eb0.f1432h;
        O90.m5965c(abstractC7742Ig0);
        C1790bW c1790bWM18830i = AbstractC9639hY0.m18830i(AbstractC0576J8.m4177d(new InterfaceC9127dY0[]{c7319Ac1M18833l, AbstractC0576J8.m4177d(new Object[]{abstractC7742Ig0})}));
        C10937rh0 c10937rh0 = c9261eb0.f1434j;
        C7078wU c7078wU = new C7078wU(AbstractC9639hY0.m18830i(AbstractC0576J8.m4177d(new InterfaceC9127dY0[]{c1790bWM18830i, AbstractC7167xu.m25992t(AbstractC7230yu.m26276g(c10937rh0 != null ? c10937rh0.getType() : null))})));
        while (c7078wU.hasNext()) {
            AbstractC7742Ig0 abstractC7742Ig02 = (AbstractC7742Ig0) c7078wU.next();
            if (!abstractC7742Ig02.mo3800u().isEmpty() && !(abstractC7742Ig02.mo3963L() instanceof C10633pJ0)) {
                return enumC1097RR;
            }
        }
        InterfaceC7032vl interfaceC7032vlMo759a = (InterfaceC7032vl) interfaceC7032vl.mo114b(new C11571we1(new C10505oJ0()));
        if (interfaceC7032vlMo759a == null) {
            return enumC1097RR;
        }
        if (interfaceC7032vlMo759a instanceof U01) {
            U01 u01 = (U01) interfaceC7032vlMo759a;
            if (!u01.getTypeParameters().isEmpty()) {
                interfaceC7032vlMo759a = u01.mo228N0().mo771z().mo759a();
                O90.m5965c(interfaceC7032vlMo759a);
            }
        }
        int iM24815c = C11229tz0.f43434c.m25064n(interfaceC7032vlMo759a, interfaceC7032vl2, false).m24815c();
        AbstractC0852NX.m5768q(iM24815c, "getResult(...)");
        return AbstractC1283UO.f11769a[AbstractC7222ym.m26247x(iM24815c)] == 1 ? EnumC1097RR.f10175a : enumC1097RR;
    }
}
