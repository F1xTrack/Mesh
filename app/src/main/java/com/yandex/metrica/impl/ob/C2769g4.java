package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.impl.ob.C2719e4;
import com.yandex.metrica.impl.ob.C2856jh;
import com.yandex.metrica.impl.ob.C3117u4;
import com.yandex.metrica.impl.ob.C3144v6;
import com.yandex.metrica.impl.ob.X3;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.g4 */
/* loaded from: classes2.dex */
class C2769g4 {
    private final b a;
    private final c b;
    protected final Context c;
    private final C2669c4 d;
    private final X3.a e;
    private final Wi f;
    protected final Qi g;
    private final C2856jh.e h;
    private final C2912ln i;
    private final InterfaceExecutorC3086sn j;
    private final C2965o1 k;
    private final int l;

    /* renamed from: com.yandex.metrica.impl.ob.g4$a */
    public class a implements C3117u4.a {
        final /* synthetic */ C2916m2 a;

        public a(C2769g4 c2769g4, C2916m2 c2916m2) {
            this.a = c2916m2;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.g4$b */
    public static class b {
        private final String a;

        public b(String str) {
            this.a = str;
        }

        public C3215xm a() {
            return AbstractC3265zm.a(this.a);
        }

        public Im b() {
            return AbstractC3265zm.b(this.a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.g4$c */
    public static class c {
        private final C2669c4 a;
        private final Qa b;

        public c(Context context, C2669c4 c2669c4) {
            this(c2669c4, Qa.a(context));
        }

        public G9 a() {
            return new G9(this.b.b(this.a));
        }

        public E9 b() {
            return new E9(this.b.b(this.a));
        }

        public c(C2669c4 c2669c4, Qa qa) {
            this.a = c2669c4;
            this.b = qa;
        }
    }

    public C2769g4(Context context, C2669c4 c2669c4, X3.a aVar, Wi wi, Qi qi, C2856jh.e eVar, InterfaceExecutorC3086sn interfaceExecutorC3086sn, int i, C2965o1 c2965o1) {
        this(context, c2669c4, aVar, wi, qi, eVar, interfaceExecutorC3086sn, new C2912ln(), i, new b(aVar.d), new c(context, c2669c4), c2965o1);
    }

    public C2771g6 a() {
        return new C2771g6(this.c, this.d, this.l);
    }

    public b b() {
        return this.a;
    }

    public c c() {
        return this.b;
    }

    public C2719e4.b d(C2744f4 c2744f4) {
        return new C2719e4.b(c2744f4);
    }

    public C2916m2<C2744f4> e(C2744f4 c2744f4) {
        C2916m2<C2744f4> c2916m2 = new C2916m2<>(c2744f4, this.f.a(), this.j);
        this.k.a(c2916m2);
        return c2916m2;
    }

    public C2769g4(Context context, C2669c4 c2669c4, X3.a aVar, Wi wi, Qi qi, C2856jh.e eVar, InterfaceExecutorC3086sn interfaceExecutorC3086sn, C2912ln c2912ln, int i, b bVar, c cVar, C2965o1 c2965o1) {
        this.c = context;
        this.d = c2669c4;
        this.e = aVar;
        this.f = wi;
        this.g = qi;
        this.h = eVar;
        this.j = interfaceExecutorC3086sn;
        this.i = c2912ln;
        this.l = i;
        this.a = bVar;
        this.b = cVar;
        this.k = c2965o1;
    }

    public C3092t4 a(C2744f4 c2744f4) {
        return new C3092t4(new C2856jh.c(c2744f4, this.h), this.g, new C2856jh.a(this.e));
    }

    public C3096t8 b(C2744f4 c2744f4) {
        return new C3096t8(c2744f4, Qa.a(this.c).c(this.d), new C3071s8(c2744f4.s()));
    }

    public C2695d5 c(C2744f4 c2744f4) {
        return new C2695d5(c2744f4);
    }

    public I8 d() {
        return P0.i().y().a(this.d.a());
    }

    public C3144v6 a(C2744f4 c2744f4, I8 i8, C3144v6.a aVar) {
        return new C3144v6(c2744f4, new C3119u6(i8), aVar);
    }

    public C3117u4 a(G9 g9, I8 i8, C3144v6 c3144v6, C3096t8 c3096t8, A a2, C2916m2 c2916m2) {
        return new C3117u4(g9, i8, c3144v6, c3096t8, a2, this.i, this.l, new a(this, c2916m2), new C2819i4(i8, new C9(i8)), new Nm());
    }

    public C2770g5<AbstractC3068s5, C2744f4> a(C2744f4 c2744f4, C2695d5 c2695d5) {
        return new C2770g5<>(c2695d5, c2744f4);
    }

    public Sb a(C3096t8 c3096t8) {
        return new Sb(c3096t8);
    }

    public Xb a(C3096t8 c3096t8, C3092t4 c3092t4) {
        return new Xb(c3096t8, c3092t4);
    }

    public Vb a(List<Tb> list, Wb wb) {
        return new Vb(list, wb);
    }

    public P a(G9 g9) {
        return new P(this.c, g9);
    }
}
