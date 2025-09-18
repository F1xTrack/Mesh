package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: h71, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC9586h71 {

    /* renamed from: a */
    public static final C7456Ct0 f28268a;

    static {
        C6298kP c6298kP = C6298kP.f36482a;
        C0905ON c0905on = new C0905ON(C6298kP.f36483b, AbstractC10732q41.f40582f, 0);
        EnumC0118Bs enumC0118Bs = EnumC0118Bs.f1060a;
        C8340Tt0 c8340Tt0M4658f = AbstractC10732q41.f40583g.m4658f();
        C8114Pk0 c8114Pk0 = C8582Yk0.f14497e;
        C7456Ct0 c7456Ct0 = new C7456Ct0(c0905on, c8340Tt0M4658f, c8114Pk0);
        c7456Ct0.f1745h = EnumC10575os0.f39326e;
        C7003vI c7003vI = AbstractC7066wI.f44764e;
        if (c7003vI == null) {
            C7456Ct0.m1426r(9);
            throw null;
        }
        c7456Ct0.f1746i = c7003vI;
        List listM26274e = AbstractC7230yu.m26274e(C10420ne1.m23157B1(c7456Ct0, EnumC9532gi1.f27948d, C8340Tt0.m7798e("T"), 0, c8114Pk0));
        if (c7456Ct0.f1748k != null) {
            throw new IllegalStateException("Type parameters are already set for " + c7456Ct0.getName());
        }
        ArrayList arrayList = new ArrayList(listM26274e);
        c7456Ct0.f1748k = arrayList;
        c7456Ct0.f1747j = new C0496Hs(c7456Ct0, arrayList, c7456Ct0.f1749l, c7456Ct0.f1750m);
        Set setEmptySet = Collections.emptySet();
        if (setEmptySet == null) {
            C7456Ct0.m1426r(13);
            throw null;
        }
        Iterator it = setEmptySet.iterator();
        while (it.hasNext()) {
            ((C6707qs) ((InterfaceC0036AZ) it.next())).f1432h = c7456Ct0.mo1492m();
        }
        f28268a = c7456Ct0;
    }
}
