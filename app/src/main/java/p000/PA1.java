package p000;

import com.yandex.varioqub.config.model.ConfigValue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class PA1 {

    /* renamed from: a */
    public final C8071Oo1 f8879a;

    /* renamed from: b */
    public C10919rY0 f8880b;

    /* renamed from: c */
    public final C8779as1 f8881c;

    /* renamed from: d */
    public final C1339VH f8882d;

    public PA1() {
        C8071Oo1 c8071Oo1 = new C8071Oo1(18);
        this.f8879a = c8071Oo1;
        this.f8880b = ((C10919rY0) c8071Oo1.f8628b).m24410I();
        C8779as1 c8779as1 = new C8779as1(3);
        c8779as1.f16640b = new C9692hy1("", 0L, null);
        c8779as1.f16641c = new C9692hy1("", 0L, null);
        c8779as1.f16642d = new ArrayList();
        this.f8881c = c8779as1;
        this.f8882d = new C1339VH(27);
        CallableC8453Vx1 callableC8453Vx1 = new CallableC8453Vx1(0);
        callableC8453Vx1.f12887b = this;
        C10226m71 c10226m71 = (C10226m71) c8071Oo1.f8630d;
        ((HashMap) c10226m71.f37493b).put("internal.registerCallback", callableC8453Vx1);
        CallableC8453Vx1 callableC8453Vx12 = new CallableC8453Vx1(1);
        callableC8453Vx12.f12887b = this;
        ((HashMap) c10226m71.f37493b).put("internal.eventLogger", callableC8453Vx12);
    }

    /* renamed from: a */
    public final void m6251a(WL1 wl1) throws MC1 {
        AbstractC9694hz1 abstractC9694hz1;
        C8071Oo1 c8071Oo1 = this.f8879a;
        try {
            this.f8880b = ((C10919rY0) c8071Oo1.f8628b).m24410I();
            if (c8071Oo1.m6146A(this.f8880b, (XL1[]) wl1.m8749n().toArray(new XL1[0])) instanceof C8299Sy1) {
                throw new IllegalStateException("Program loading failed");
            }
            for (VL1 vl1 : wl1.m8748m().m7989o()) {
                LS1 ls1M8421n = vl1.m8421n();
                String strM8420m = vl1.m8420m();
                Iterator it = ls1M8421n.iterator();
                while (it.hasNext()) {
                    InterfaceC7885Kz1 interfaceC7885Kz1M6146A = c8071Oo1.m6146A(this.f8880b, (XL1) it.next());
                    if (!(interfaceC7885Kz1M6146A instanceof C7521Dz1)) {
                        throw new IllegalArgumentException("Invalid rule definition");
                    }
                    C10919rY0 c10919rY0 = this.f8880b;
                    if (c10919rY0.m24415N(strM8420m)) {
                        InterfaceC7885Kz1 interfaceC7885Kz1M24411J = c10919rY0.m24411J(strM8420m);
                        if (!(interfaceC7885Kz1M24411J instanceof AbstractC9694hz1)) {
                            throw new IllegalStateException("Invalid function name: " + strM8420m);
                        }
                        abstractC9694hz1 = (AbstractC9694hz1) interfaceC7885Kz1M24411J;
                    } else {
                        abstractC9694hz1 = null;
                    }
                    if (abstractC9694hz1 == null) {
                        throw new IllegalStateException("Rule function is undefined: " + strM8420m);
                    }
                    abstractC9694hz1.mo6842a(this.f8880b, Collections.singletonList(interfaceC7885Kz1M6146A));
                }
            }
        } catch (Throwable th) {
            throw new MC1(th);
        }
    }

    /* renamed from: b */
    public final boolean m6252b(C9692hy1 c9692hy1) {
        C8779as1 c8779as1 = this.f8881c;
        try {
            c8779as1.f16640b = c9692hy1;
            c8779as1.f16641c = (C9692hy1) c9692hy1.clone();
            ((ArrayList) c8779as1.f16642d).clear();
            ((C10919rY0) this.f8879a.f8629c).m24416O("runtime.counter", new C7987My1(Double.valueOf(ConfigValue.DOUBLE_DEFAULT_VALUE)));
            this.f8882d.m8362F(this.f8880b.m24410I(), c8779as1);
            C8779as1 c8779as12 = this.f8881c;
            if (((C9692hy1) c8779as12.f16641c).equals((C9692hy1) c8779as12.f16640b)) {
                return !((ArrayList) this.f8881c.f16642d).isEmpty();
            }
            return true;
        } catch (Throwable th) {
            throw new MC1(th);
        }
    }
}
