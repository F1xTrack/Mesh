package p000;

import com.p019vk.push.common.Logger;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;

/* renamed from: rr1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10958rr1 extends AbstractC9714i71 implements Function2 {

    /* renamed from: a */
    public final /* synthetic */ int f41932a = 1;

    /* renamed from: b */
    public final /* synthetic */ Object f41933b;

    /* renamed from: c */
    public final /* synthetic */ Object f41934c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10958rr1(K81 k81, InterfaceC1382Vy interfaceC1382Vy, C7767Is1 c7767Is1) {
        super(2, interfaceC1382Vy);
        this.f41933b = k81;
        this.f41934c = c7767Is1;
    }

    @Override // p000.AbstractC1300Uf
    public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
        switch (this.f41932a) {
            case 0:
                return new C10958rr1((String) this.f41933b, (C7871Ks1) this.f41934c, interfaceC1382Vy);
            default:
                return new C10958rr1((K81) this.f41933b, interfaceC1382Vy, (C7767Is1) this.f41934c);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC1382Vy interfaceC1382Vy = (InterfaceC1382Vy) obj2;
        switch (this.f41932a) {
            case 0:
                return new C10958rr1((String) this.f41933b, (C7871Ks1) this.f41934c, interfaceC1382Vy).invokeSuspend(C8313Tf1.f11463a);
            default:
                C10958rr1 c10958rr1 = new C10958rr1((K81) this.f41933b, interfaceC1382Vy, (C7767Is1) this.f41934c);
                C8313Tf1 c8313Tf1 = C8313Tf1.f11463a;
                c10958rr1.invokeSuspend(c8313Tf1);
                return c8313Tf1;
        }
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        Object objM7015b;
        Object obj2 = this.f41933b;
        Object obj3 = this.f41934c;
        switch (this.f41932a) {
            case 0:
                EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
                RQ1.m7017d(obj);
                String str = (String) obj2;
                return new Pair(str, Boolean.valueOf(((C7871Ks1) obj3).f6372b.checkAppInstalled(str)));
            default:
                EnumC0817Mz enumC0817Mz2 = EnumC0817Mz.f7418a;
                RQ1.m7017d(obj);
                C7767Is1 c7767Is1 = (C7767Is1) obj3;
                boolean zInvoke = c7767Is1.f5194b.invoke();
                C8313Tf1 c8313Tf1 = C8313Tf1.f11463a;
                Logger logger = c7767Is1.f5195c;
                if (zInvoke) {
                    Logger.DefaultImpls.info$default(logger, "Push is available", null, 2, null);
                    objM7015b = c8313Tf1;
                } else {
                    Logger.DefaultImpls.info$default(logger, "Push is unavailable", null, 2, null);
                    objM7015b = RQ1.m7015b(new C8986cU0("Push is unavailable, need to install host app"));
                }
                K81 k81 = (K81) obj2;
                if (!(objM7015b instanceof OS0)) {
                    k81.m4569b(objM7015b);
                }
                Throwable thM6365a = PS0.m6365a(objM7015b);
                if (thM6365a != null) {
                    k81.m4568a(thM6365a);
                }
                return c8313Tf1;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10958rr1(String str, C7871Ks1 c7871Ks1, InterfaceC1382Vy interfaceC1382Vy) {
        super(2, interfaceC1382Vy);
        this.f41933b = str;
        this.f41934c = c7871Ks1;
    }
}
