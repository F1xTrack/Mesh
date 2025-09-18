package defpackage;

import java.util.Arrays;
import java.util.List;

/* renamed from: yZ1 */
/* loaded from: classes.dex */
public abstract class AbstractC8198yZ1 {
    public static final X01 a(AbstractC0663Ig0 abstractC0663Ig0) {
        O90.f(abstractC0663Ig0, "<this>");
        AbstractC1521Tg1 abstractC1521Tg1L = abstractC0663Ig0.L();
        X01 x01 = abstractC1521Tg1L instanceof X01 ? (X01) abstractC1521Tg1L : null;
        if (x01 != null) {
            return x01;
        }
        throw new IllegalStateException(("This is should be simple type: " + abstractC0663Ig0).toString());
    }

    public static final X01 b(X01 x01, List list, C0733Jd1 c0733Jd1) {
        O90.f(x01, "<this>");
        O90.f(list, "newArguments");
        O90.f(c0733Jd1, "newAttributes");
        if (list.isEmpty() && c0733Jd1 == x01.B()) {
            return x01;
        }
        if (list.isEmpty()) {
            return x01.T(c0733Jd1);
        }
        if (!(x01 instanceof C4147hP)) {
            return NV1.A(c0733Jd1, x01.E(), list, x01.G());
        }
        C4147hP c4147hP = (C4147hP) x01;
        String[] strArr = c4147hP.g;
        return new C4147hP(c4147hP.b, c4147hP.c, c4147hP.d, list, c4147hP.f, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static AbstractC0663Ig0 c(AbstractC0663Ig0 abstractC0663Ig0, List list, I5 i5, int i) {
        if ((i & 2) != 0) {
            i5 = abstractC0663Ig0.getAnnotations();
        }
        O90.f(abstractC0663Ig0, "<this>");
        O90.f(i5, "newAnnotations");
        if ((list.isEmpty() || list == abstractC0663Ig0.u()) && i5 == abstractC0663Ig0.getAnnotations()) {
            return abstractC0663Ig0;
        }
        C0733Jd1 c0733Jd1B = abstractC0663Ig0.B();
        if ((i5 instanceof C7611vU) && i5.isEmpty()) {
            i5 = S20.b;
        }
        C0733Jd1 c0733Jd1D = AbstractC3988gZ1.d(c0733Jd1B, i5);
        AbstractC1521Tg1 abstractC1521Tg1L = abstractC0663Ig0.L();
        if (abstractC1521Tg1L instanceof AbstractC3405dW) {
            AbstractC3405dW abstractC3405dW = (AbstractC3405dW) abstractC1521Tg1L;
            return NV1.t(b(abstractC3405dW.b, list, c0733Jd1D), b(abstractC3405dW.c, list, c0733Jd1D));
        }
        if (abstractC1521Tg1L instanceof X01) {
            return b((X01) abstractC1521Tg1L, list, c0733Jd1D);
        }
        throw new C7074sg();
    }

    public static /* synthetic */ X01 d(X01 x01, List list, C0733Jd1 c0733Jd1, int i) {
        if ((i & 1) != 0) {
            list = x01.u();
        }
        if ((i & 2) != 0) {
            c0733Jd1 = x01.B();
        }
        return b(x01, list, c0733Jd1);
    }
}
