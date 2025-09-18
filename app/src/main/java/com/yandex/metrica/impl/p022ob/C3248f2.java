package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import android.os.Bundle;
import com.yandex.metrica.impl.p022ob.C2915S;
import com.yandex.metrica.impl.p022ob.C3044X3;
import com.yandex.metrica.impl.p022ob.C3202d8;
import com.yandex.metrica.impl.p022ob.C3393kh;
import java.io.File;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.f2 */
/* loaded from: classes2.dex */
public class C3248f2 {

    /* renamed from: a */
    private final Context f23388a;

    /* renamed from: b */
    private final InterfaceExecutorC3607sn f23389b;

    /* renamed from: c */
    private final C2546D4 f23390c;

    /* renamed from: d */
    private final C2742L0 f23391d;

    /* renamed from: com.yandex.metrica.impl.ob.f2$a */
    public class a implements InterfaceC2988Um<C2649H7> {
        public a() {
        }

        @Override // com.yandex.metrica.impl.p022ob.InterfaceC2988Um
        /* renamed from: b */
        public void mo13904b(C2649H7 c2649h7) {
            C2649H7 c2649h72 = c2649h7;
            C3248f2 c3248f2 = C3248f2.this;
            C2521C4 c2521c4 = new C2521C4(c2649h72.m14221a(), c2649h72.m14226f(), c2649h72.m14227g(), c2649h72.m14228h(), c2649h72.m14229i());
            String strM14225e = c2649h72.m14225e();
            byte[] bArrM14223c = c2649h72.m14223c();
            int iM14222b = c2649h72.m14222b();
            HashMap<C2915S.a, Integer> mapM14230j = c2649h72.m14230j();
            String strM14224d = c2649h72.m14224d();
            C2689Im c2689ImM17346b = AbstractC3788zm.m17346b(c2649h72.m14221a());
            List<Integer> list = C2692J0.f21482i;
            C2915S c2915sM15098a = new C2915S(bArrM14223c, strM14225e, EnumC3377k1.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE.m16250b(), c2689ImM17346b).m15098a(mapM14230j);
            c2915sM15098a.f23834h = iM14222b;
            c3248f2.m15871a(c2521c4, c2915sM15098a.m16232c(strM14224d), new C3044X3(new C3393kh.b(null, null, null, null, null, null, false, null), new C3044X3.a(), null));
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.f2$b */
    public class b implements InterfaceC2988Um<String> {

        /* renamed from: a */
        private final C2521C4 f23393a;

        /* renamed from: b */
        private final InterfaceC3013Vm<String, C3376k0> f23394b;

        public b(C2521C4 c2521c4, InterfaceC3013Vm<String, C3376k0> interfaceC3013Vm) {
            this.f23393a = c2521c4;
            this.f23394b = interfaceC3013Vm;
        }

        @Override // com.yandex.metrica.impl.p022ob.InterfaceC2988Um
        /* renamed from: b */
        public void mo13904b(String str) {
            C3248f2.this.m15871a(this.f23393a, this.f23394b.mo13948a(str), new C3044X3(new C3393kh.b(null, null, null, null, null, null, false, null), new C3044X3.a(), null));
        }
    }

    public C3248f2(Context context, C2546D4 c2546d4, InterfaceExecutorC3607sn interfaceExecutorC3607sn, C2742L0 c2742l0) {
        this.f23388a = context;
        this.f23389b = interfaceExecutorC3607sn;
        this.f23390c = c2546d4;
        this.f23391d = c2742l0;
    }

    /* renamed from: a */
    public void m15874a(File file) {
        C2674I7 c2674i7 = new C2674I7();
        ((C3581rn) this.f23389b).execute(new RunnableC3149b7(file, c2674i7, c2674i7, new a()));
    }

    /* renamed from: a */
    public void m15871a(C2521C4 c2521c4, C3376k0 c3376k0, C3044X3 c3044x3) {
        this.f23390c.m13980a(c2521c4, c3044x3).mo13840a(c3376k0, c3044x3);
        this.f23390c.m13981a(c2521c4.m13951b(), c2521c4.m13952c().intValue(), c2521c4.m13953d());
    }

    /* renamed from: a */
    public void m15872a(C3098Z7 c3098z7, InterfaceC3013Vm<String, C3376k0> interfaceC3013Vm) {
        InterfaceExecutorC3607sn interfaceExecutorC3607sn = this.f23389b;
        C2742L0 c2742l0 = this.f23391d;
        String str = c3098z7.f22938a.f23179b;
        c2742l0.getClass();
        ((C3581rn) interfaceExecutorC3607sn).execute(new RunnableC3149b7(new File(str), new C2874Q7(new C2724K7(EnumC2824O7.CRASHPAD, c3098z7.f22940c.f24370b), new C2849P7(new C3721x7())), new C3202d8.c(c3098z7.f22938a.f23178a), new b(c3098z7.f22939b, interfaceC3013Vm)));
    }

    /* renamed from: a */
    public void m15873a(C3376k0 c3376k0, Bundle bundle) {
        if (EnumC3377k1.EVENT_TYPE_UNDEFINED.m16250b() == c3376k0.f23831e) {
            return;
        }
        ((C3581rn) this.f23389b).execute(new RunnableC3300h2(this.f23388a, c3376k0, bundle, this.f23390c));
    }
}
