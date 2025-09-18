package defpackage;

import com.vk.push.common.Logger;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;

/* renamed from: rr1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6918rr1 extends AbstractC4286i71 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6918rr1(K81 k81, InterfaceC1729Vy interfaceC1729Vy, C0700Is1 c0700Is1) {
        super(2, interfaceC1729Vy);
        this.b = k81;
        this.c = c0700Is1;
    }

    @Override // defpackage.AbstractC1594Uf
    public final InterfaceC1729Vy create(Object obj, InterfaceC1729Vy interfaceC1729Vy) {
        switch (this.a) {
            case 0:
                return new C6918rr1((String) this.b, (C0856Ks1) this.c, interfaceC1729Vy);
            default:
                return new C6918rr1((K81) this.b, interfaceC1729Vy, (C0700Is1) this.c);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC1729Vy interfaceC1729Vy = (InterfaceC1729Vy) obj2;
        switch (this.a) {
            case 0:
                return new C6918rr1((String) this.b, (C0856Ks1) this.c, interfaceC1729Vy).invokeSuspend(C1518Tf1.a);
            default:
                C6918rr1 c6918rr1 = new C6918rr1((K81) this.b, interfaceC1729Vy, (C0700Is1) this.c);
                C1518Tf1 c1518Tf1 = C1518Tf1.a;
                c6918rr1.invokeSuspend(c1518Tf1);
                return c1518Tf1;
        }
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        Object objB;
        Object obj2 = this.b;
        Object obj3 = this.c;
        switch (this.a) {
            case 0:
                EnumC1030Mz enumC1030Mz = EnumC1030Mz.a;
                RQ1.d(obj);
                String str = (String) obj2;
                return new Pair(str, Boolean.valueOf(((C0856Ks1) obj3).b.checkAppInstalled(str)));
            default:
                EnumC1030Mz enumC1030Mz2 = EnumC1030Mz.a;
                RQ1.d(obj);
                C0700Is1 c0700Is1 = (C0700Is1) obj3;
                boolean zInvoke = c0700Is1.b.invoke();
                C1518Tf1 c1518Tf1 = C1518Tf1.a;
                Logger logger = c0700Is1.c;
                if (zInvoke) {
                    Logger.DefaultImpls.info$default(logger, "Push is available", null, 2, null);
                    objB = c1518Tf1;
                } else {
                    Logger.DefaultImpls.info$default(logger, "Push is unavailable", null, 2, null);
                    objB = RQ1.b(new C2524cU0("Push is unavailable, need to install host app"));
                }
                K81 k81 = (K81) obj2;
                if (!(objB instanceof OS0)) {
                    k81.b(objB);
                }
                Throwable thA = PS0.a(objB);
                if (thA != null) {
                    k81.a(thA);
                }
                return c1518Tf1;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6918rr1(String str, C0856Ks1 c0856Ks1, InterfaceC1729Vy interfaceC1729Vy) {
        super(2, interfaceC1729Vy);
        this.b = str;
        this.c = c0856Ks1;
    }
}
