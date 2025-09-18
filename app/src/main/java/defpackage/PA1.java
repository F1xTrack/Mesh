package defpackage;

import com.yandex.varioqub.config.model.ConfigValue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class PA1 {
    public final C1155Oo1 a;
    public C6860rY0 b;
    public final C2216as1 c;
    public final VH d;

    public PA1() {
        C1155Oo1 c1155Oo1 = new C1155Oo1(18);
        this.a = c1155Oo1;
        this.b = ((C6860rY0) c1155Oo1.b).I();
        C2216as1 c2216as1 = new C2216as1(3);
        c2216as1.b = new C4254hy1("", 0L, null);
        c2216as1.c = new C4254hy1("", 0L, null);
        c2216as1.d = new ArrayList();
        this.c = c2216as1;
        this.d = new VH(27);
        CallableC1728Vx1 callableC1728Vx1 = new CallableC1728Vx1(0);
        callableC1728Vx1.b = this;
        C5826m71 c5826m71 = (C5826m71) c1155Oo1.d;
        ((HashMap) c5826m71.b).put("internal.registerCallback", callableC1728Vx1);
        CallableC1728Vx1 callableC1728Vx12 = new CallableC1728Vx1(1);
        callableC1728Vx12.b = this;
        ((HashMap) c5826m71.b).put("internal.eventLogger", callableC1728Vx12);
    }

    public final void a(WL1 wl1) throws MC1 {
        AbstractC4257hz1 abstractC4257hz1;
        C1155Oo1 c1155Oo1 = this.a;
        try {
            this.b = ((C6860rY0) c1155Oo1.b).I();
            if (c1155Oo1.A(this.b, (XL1[]) wl1.n().toArray(new XL1[0])) instanceof C1497Sy1) {
                throw new IllegalStateException("Program loading failed");
            }
            for (VL1 vl1 : wl1.m().o()) {
                LS1 ls1N = vl1.n();
                String strM = vl1.m();
                Iterator it = ls1N.iterator();
                while (it.hasNext()) {
                    InterfaceC0877Kz1 interfaceC0877Kz1A = c1155Oo1.A(this.b, (XL1) it.next());
                    if (!(interfaceC0877Kz1A instanceof C0331Dz1)) {
                        throw new IllegalArgumentException("Invalid rule definition");
                    }
                    C6860rY0 c6860rY0 = this.b;
                    if (c6860rY0.N(strM)) {
                        InterfaceC0877Kz1 interfaceC0877Kz1J = c6860rY0.J(strM);
                        if (!(interfaceC0877Kz1J instanceof AbstractC4257hz1)) {
                            throw new IllegalStateException("Invalid function name: " + strM);
                        }
                        abstractC4257hz1 = (AbstractC4257hz1) interfaceC0877Kz1J;
                    } else {
                        abstractC4257hz1 = null;
                    }
                    if (abstractC4257hz1 == null) {
                        throw new IllegalStateException("Rule function is undefined: " + strM);
                    }
                    abstractC4257hz1.a(this.b, Collections.singletonList(interfaceC0877Kz1A));
                }
            }
        } catch (Throwable th) {
            throw new MC1(th);
        }
    }

    public final boolean b(C4254hy1 c4254hy1) {
        C2216as1 c2216as1 = this.c;
        try {
            c2216as1.b = c4254hy1;
            c2216as1.c = (C4254hy1) c4254hy1.clone();
            ((ArrayList) c2216as1.d).clear();
            ((C6860rY0) this.a.c).O("runtime.counter", new C1029My1(Double.valueOf(ConfigValue.DOUBLE_DEFAULT_VALUE)));
            this.d.F(this.b.I(), c2216as1);
            C2216as1 c2216as12 = this.c;
            if (((C4254hy1) c2216as12.c).equals((C4254hy1) c2216as12.b)) {
                return !((ArrayList) this.c.d).isEmpty();
            }
            return true;
        } catch (Throwable th) {
            throw new MC1(th);
        }
    }
}
