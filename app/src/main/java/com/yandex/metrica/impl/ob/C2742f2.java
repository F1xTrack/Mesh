package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.os.Bundle;
import com.yandex.metrica.impl.ob.C2698d8;
import com.yandex.metrica.impl.ob.C2881kh;
import com.yandex.metrica.impl.ob.S;
import com.yandex.metrica.impl.ob.X3;
import java.io.File;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.f2 */
/* loaded from: classes2.dex */
public class C2742f2 {
    private final Context a;
    private final InterfaceExecutorC3086sn b;
    private final D4 c;
    private final L0 d;

    /* renamed from: com.yandex.metrica.impl.ob.f2$a */
    public class a implements Um<H7> {
        public a() {
        }

        @Override // com.yandex.metrica.impl.ob.Um
        public void b(H7 h7) {
            H7 h72 = h7;
            C2742f2 c2742f2 = C2742f2.this;
            C4 c4 = new C4(h72.a(), h72.f(), h72.g(), h72.h(), h72.i());
            String strE = h72.e();
            byte[] bArrC = h72.c();
            int iB = h72.b();
            HashMap<S.a, Integer> mapJ = h72.j();
            String strD = h72.d();
            Im imB = AbstractC3265zm.b(h72.a());
            List<Integer> list = J0.i;
            S sA = new S(bArrC, strE, EnumC2865k1.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE.b(), imB).a(mapJ);
            sA.h = iB;
            c2742f2.a(c4, sA.c(strD), new X3(new C2881kh.b(null, null, null, null, null, null, false, null), new X3.a(), null));
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.f2$b */
    public class b implements Um<String> {
        private final C4 a;
        private final Vm<String, C2864k0> b;

        public b(C4 c4, Vm<String, C2864k0> vm) {
            this.a = c4;
            this.b = vm;
        }

        @Override // com.yandex.metrica.impl.ob.Um
        public void b(String str) {
            C2742f2.this.a(this.a, this.b.a(str), new X3(new C2881kh.b(null, null, null, null, null, null, false, null), new X3.a(), null));
        }
    }

    public C2742f2(Context context, D4 d4, InterfaceExecutorC3086sn interfaceExecutorC3086sn, L0 l0) {
        this.a = context;
        this.b = interfaceExecutorC3086sn;
        this.c = d4;
        this.d = l0;
    }

    public void a(File file) {
        I7 i7 = new I7();
        ((C3061rn) this.b).execute(new RunnableC2647b7(file, i7, i7, new a()));
    }

    public void a(C4 c4, C2864k0 c2864k0, X3 x3) {
        this.c.a(c4, x3).a(c2864k0, x3);
        this.c.a(c4.b(), c4.c().intValue(), c4.d());
    }

    public void a(Z7 z7, Vm<String, C2864k0> vm) {
        InterfaceExecutorC3086sn interfaceExecutorC3086sn = this.b;
        L0 l0 = this.d;
        String str = z7.a.b;
        l0.getClass();
        ((C3061rn) interfaceExecutorC3086sn).execute(new RunnableC2647b7(new File(str), new Q7(new K7(O7.CRASHPAD, z7.c.b), new P7(new C3200x7())), new C2698d8.c(z7.a.a), new b(z7.b, vm)));
    }

    public void a(C2864k0 c2864k0, Bundle bundle) {
        if (EnumC2865k1.EVENT_TYPE_UNDEFINED.b() == c2864k0.e) {
            return;
        }
        ((C3061rn) this.b).execute(new RunnableC2792h2(this.a, c2864k0, bundle, this.c));
    }
}
