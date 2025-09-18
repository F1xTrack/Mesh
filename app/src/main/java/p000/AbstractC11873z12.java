package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: z12, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC11873z12 {
    /* renamed from: a */
    public static final Q81 m26304a(C9571h11 c9571h11) {
        Q81 q81 = new Q81();
        K81 k81 = new K81(q81);
        q81.m6584a(new C9552gs1(AbstractC10396nS1.m23145a(c9571h11, new C10320ms1(k81, 0), new C10320ms1(k81, 1)), 0), null);
        return q81;
    }

    /* renamed from: b */
    public static C0225DZ m26305b(C7083wZ c7083wZ, boolean z) {
        String lowerCase;
        O90.m5968f(c7083wZ, "functionClass");
        C0225DZ c0225dz = new C0225DZ(c7083wZ, null, 1, z);
        C10937rh0 c10937rh0Mo1489a1 = c7083wZ.mo1489a1();
        C0779MN c0779mn = C0779MN.f7117a;
        List list = c7083wZ.f44965k;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((InterfaceC10292me1) obj).mo22918O() != EnumC9532gi1.f27948d) {
                break;
            }
            arrayList.add(obj);
        }
        C0702L8 c0702l8M25988h0 = AbstractC7167xu.m25988h0(arrayList);
        ArrayList arrayList2 = new ArrayList(AbstractC7293zu.m26586k(c0702l8M25988h0));
        Iterator it = c0702l8M25988h0.iterator();
        while (true) {
            C1780bM c1780bM = (C1780bM) it;
            if (!c1780bM.f16986b.hasNext()) {
                c0225dz.mo1215D1(null, c10937rh0Mo1489a1, c0779mn, c0779mn, arrayList2, ((InterfaceC10292me1) AbstractC7167xu.m25964J(list)).mo1492m(), EnumC10575os0.f39326e, AbstractC7066wI.f44764e);
                c0225dz.f1448x = true;
                return c0225dz;
            }
            C9843j80 c9843j80 = (C9843j80) c1780bM.next();
            int i = c9843j80.f34932a;
            InterfaceC10292me1 interfaceC10292me1 = (InterfaceC10292me1) c9843j80.f34933b;
            String strM7801b = interfaceC10292me1.getName().m7801b();
            O90.m5967e(strM7801b, "asString(...)");
            if (strM7801b.equals("T")) {
                lowerCase = "instance";
            } else if (strM7801b.equals("E")) {
                lowerCase = "receiver";
            } else {
                lowerCase = strM7801b.toLowerCase(Locale.ROOT);
                O90.m5967e(lowerCase, "toLowerCase(...)");
            }
            C0447H5 c0447h5 = S20.f10539b;
            C8340Tt0 c8340Tt0M7798e = C8340Tt0.m7798e(lowerCase);
            X01 x01Mo1492m = interfaceC10292me1.mo1492m();
            O90.m5967e(x01Mo1492m, "getDefaultType(...)");
            C10937rh0 c10937rh0 = c10937rh0Mo1489a1;
            ArrayList arrayList3 = arrayList2;
            arrayList3.add(new C8473Wh1(c0225dz, null, i, c0447h5, c8340Tt0M7798e, x01Mo1492m, false, false, false, null, W21.f12940O0));
            arrayList2 = arrayList3;
            c10937rh0Mo1489a1 = c10937rh0;
        }
    }
}
