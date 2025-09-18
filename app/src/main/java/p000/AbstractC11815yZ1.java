package p000;

import java.util.Arrays;
import java.util.List;

/* renamed from: yZ1 */
/* loaded from: classes.dex */
public abstract class AbstractC11815yZ1 {
    /* renamed from: a */
    public static final X01 m26170a(AbstractC7742Ig0 abstractC7742Ig0) {
        O90.m5968f(abstractC7742Ig0, "<this>");
        AbstractC8315Tg1 abstractC8315Tg1Mo3963L = abstractC7742Ig0.mo3963L();
        X01 x01 = abstractC8315Tg1Mo3963L instanceof X01 ? (X01) abstractC8315Tg1Mo3963L : null;
        if (x01 != null) {
            return x01;
        }
        throw new IllegalStateException(("This is should be simple type: " + abstractC7742Ig0).toString());
    }

    /* renamed from: b */
    public static final X01 m26171b(X01 x01, List list, C7789Jd1 c7789Jd1) {
        O90.m5968f(x01, "<this>");
        O90.m5968f(list, "newArguments");
        O90.m5968f(c7789Jd1, "newAttributes");
        if (list.isEmpty() && c7789Jd1 == x01.mo3796B()) {
            return x01;
        }
        if (list.isEmpty()) {
            return x01.mo252T(c7789Jd1);
        }
        if (!(x01 instanceof C4177hP)) {
            return NV1.m5726A(c7789Jd1, x01.mo3797E(), list, x01.mo3798G());
        }
        C4177hP c4177hP = (C4177hP) x01;
        String[] strArr = c4177hP.f28411g;
        return new C4177hP(c4177hP.f28406b, c4177hP.f28407c, c4177hP.f28408d, list, c4177hP.f28410f, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* renamed from: c */
    public static AbstractC7742Ig0 m26172c(AbstractC7742Ig0 abstractC7742Ig0, List list, InterfaceC0510I5 interfaceC0510I5, int i) {
        if ((i & 2) != 0) {
            interfaceC0510I5 = abstractC7742Ig0.getAnnotations();
        }
        O90.m5968f(abstractC7742Ig0, "<this>");
        O90.m5968f(interfaceC0510I5, "newAnnotations");
        if ((list.isEmpty() || list == abstractC7742Ig0.mo3800u()) && interfaceC0510I5 == abstractC7742Ig0.getAnnotations()) {
            return abstractC7742Ig0;
        }
        C7789Jd1 c7789Jd1Mo3796B = abstractC7742Ig0.mo3796B();
        if ((interfaceC0510I5 instanceof C7015vU) && interfaceC0510I5.isEmpty()) {
            interfaceC0510I5 = S20.f10539b;
        }
        C7789Jd1 c7789Jd1M18583d = AbstractC9514gZ1.m18583d(c7789Jd1Mo3796B, interfaceC0510I5);
        AbstractC8315Tg1 abstractC8315Tg1Mo3963L = abstractC7742Ig0.mo3963L();
        if (abstractC8315Tg1Mo3963L instanceof AbstractC3933dW) {
            AbstractC3933dW abstractC3933dW = (AbstractC3933dW) abstractC8315Tg1Mo3963L;
            return NV1.m5738t(m26171b(abstractC3933dW.f26126b, list, c7789Jd1M18583d), m26171b(abstractC3933dW.f26127c, list, c7789Jd1M18583d));
        }
        if (abstractC8315Tg1Mo3963L instanceof X01) {
            return m26171b((X01) abstractC8315Tg1Mo3963L, list, c7789Jd1M18583d);
        }
        throw new C6838sg();
    }

    /* renamed from: d */
    public static /* synthetic */ X01 m26173d(X01 x01, List list, C7789Jd1 c7789Jd1, int i) {
        if ((i & 1) != 0) {
            list = x01.mo3800u();
        }
        if ((i & 2) != 0) {
            c7789Jd1 = x01.mo3796B();
        }
        return m26171b(x01, list, c7789Jd1);
    }
}
