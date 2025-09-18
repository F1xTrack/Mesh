package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import com.yandex.metrica.impl.p022ob.C3044X3;
import com.yandex.metrica.impl.p022ob.C3224e4;
import com.yandex.metrica.impl.p022ob.C3367jh;
import com.yandex.metrica.impl.p022ob.C3640u4;
import com.yandex.metrica.impl.p022ob.C3668v6;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.g4 */
/* loaded from: classes2.dex */
class C3276g4 {

    /* renamed from: a */
    private final b f23467a;

    /* renamed from: b */
    private final c f23468b;

    /* renamed from: c */
    protected final Context f23469c;

    /* renamed from: d */
    private final C3172c4 f23470d;

    /* renamed from: e */
    private final C3044X3.a f23471e;

    /* renamed from: f */
    private final AbstractC3034Wi f23472f;

    /* renamed from: g */
    protected final C2885Qi f23473g;

    /* renamed from: h */
    private final C3367jh.e f23474h;

    /* renamed from: i */
    private final C3425ln f23475i;

    /* renamed from: j */
    private final InterfaceExecutorC3607sn f23476j;

    /* renamed from: k */
    private final C3481o1 f23477k;

    /* renamed from: l */
    private final int f23478l;

    /* renamed from: com.yandex.metrica.impl.ob.g4$a */
    public class a implements C3640u4.a {

        /* renamed from: a */
        final /* synthetic */ C3430m2 f23479a;

        public a(C3276g4 c3276g4, C3430m2 c3430m2) {
            this.f23479a = c3430m2;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.g4$b */
    public static class b {

        /* renamed from: a */
        private final String f23480a;

        public b(String str) {
            this.f23480a = str;
        }

        /* renamed from: a */
        public C3736xm m15974a() {
            return AbstractC3788zm.m17345a(this.f23480a);
        }

        /* renamed from: b */
        public C2689Im m15975b() {
            return AbstractC3788zm.m17346b(this.f23480a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.g4$c */
    public static class c {

        /* renamed from: a */
        private final C3172c4 f23481a;

        /* renamed from: b */
        private final C2877Qa f23482b;

        public c(Context context, C3172c4 c3172c4) {
            this(c3172c4, C2877Qa.m14815a(context));
        }

        /* renamed from: a */
        public C2626G9 m15976a() {
            return new C2626G9(this.f23482b.m14825b(this.f23481a));
        }

        /* renamed from: b */
        public C2576E9 m15977b() {
            return new C2576E9(this.f23482b.m14825b(this.f23481a));
        }

        public c(C3172c4 c3172c4, C2877Qa c2877Qa) {
            this.f23481a = c3172c4;
            this.f23482b = c2877Qa;
        }
    }

    public C3276g4(Context context, C3172c4 c3172c4, C3044X3.a aVar, AbstractC3034Wi abstractC3034Wi, C2885Qi c2885Qi, C3367jh.e eVar, InterfaceExecutorC3607sn interfaceExecutorC3607sn, int i, C3481o1 c3481o1) {
        this(context, c3172c4, aVar, abstractC3034Wi, c2885Qi, eVar, interfaceExecutorC3607sn, new C3425ln(), i, new b(aVar.f22754d), new c(context, c3172c4), c3481o1);
    }

    /* renamed from: a */
    public C3278g6 m15963a() {
        return new C3278g6(this.f23469c, this.f23470d, this.f23478l);
    }

    /* renamed from: b */
    public b m15967b() {
        return this.f23467a;
    }

    /* renamed from: c */
    public c m15970c() {
        return this.f23468b;
    }

    /* renamed from: d */
    public C3224e4.b m15972d(C3250f4 c3250f4) {
        return new C3224e4.b(c3250f4);
    }

    /* renamed from: e */
    public C3430m2<C3250f4> m15973e(C3250f4 c3250f4) {
        C3430m2<C3250f4> c3430m2 = new C3430m2<>(c3250f4, this.f23472f.mo15395a(), this.f23476j);
        this.f23477k.m16500a(c3430m2);
        return c3430m2;
    }

    public C3276g4(Context context, C3172c4 c3172c4, C3044X3.a aVar, AbstractC3034Wi abstractC3034Wi, C2885Qi c2885Qi, C3367jh.e eVar, InterfaceExecutorC3607sn interfaceExecutorC3607sn, C3425ln c3425ln, int i, b bVar, c cVar, C3481o1 c3481o1) {
        this.f23469c = context;
        this.f23470d = c3172c4;
        this.f23471e = aVar;
        this.f23472f = abstractC3034Wi;
        this.f23473g = c2885Qi;
        this.f23474h = eVar;
        this.f23476j = interfaceExecutorC3607sn;
        this.f23475i = c3425ln;
        this.f23478l = i;
        this.f23467a = bVar;
        this.f23468b = cVar;
        this.f23477k = c3481o1;
    }

    /* renamed from: a */
    public C3614t4 m15964a(C3250f4 c3250f4) {
        return new C3614t4(new C3367jh.c(c3250f4, this.f23474h), this.f23473g, new C3367jh.a(this.f23471e));
    }

    /* renamed from: b */
    public C3618t8 m15968b(C3250f4 c3250f4) {
        return new C3618t8(c3250f4, C2877Qa.m14815a(this.f23469c).m14826c(this.f23470d), new C3592s8(c3250f4.mo15382s()));
    }

    /* renamed from: c */
    public C3199d5 m15969c(C3250f4 c3250f4) {
        return new C3199d5(c3250f4);
    }

    /* renamed from: d */
    public C2675I8 m15971d() {
        return C2842P0.m14728i().m14754y().m14472a(this.f23470d.m15700a());
    }

    /* renamed from: a */
    public C3668v6 m15966a(C3250f4 c3250f4, C2675I8 c2675i8, C3668v6.a aVar) {
        return new C3668v6(c3250f4, new C3642u6(c2675i8), aVar);
    }

    /* renamed from: a */
    public C3640u4 m15965a(C2626G9 c2626g9, C2675I8 c2675i8, C3668v6 c3668v6, C3618t8 c3618t8, C2466A c2466a, C3430m2 c3430m2) {
        return new C3640u4(c2626g9, c2675i8, c3668v6, c3618t8, c2466a, this.f23475i, this.f23478l, new a(this, c3430m2), new C3328i4(c2675i8, new C2526C9(c2675i8)), new C2814Nm());
    }

    /* renamed from: a */
    public C3277g5<AbstractC3589s5, C3250f4> m15962a(C3250f4 c3250f4, C3199d5 c3199d5) {
        return new C3277g5<>(c3199d5, c3250f4);
    }

    /* renamed from: a */
    public C2927Sb m15959a(C3618t8 c3618t8) {
        return new C2927Sb(c3618t8);
    }

    /* renamed from: a */
    public C3052Xb m15961a(C3618t8 c3618t8, C3614t4 c3614t4) {
        return new C3052Xb(c3618t8, c3614t4);
    }

    /* renamed from: a */
    public C3002Vb m15960a(List<InterfaceC2952Tb> list, InterfaceC3027Wb interfaceC3027Wb) {
        return new C3002Vb(list, interfaceC3027Wb);
    }

    /* renamed from: a */
    public C2841P m15958a(C2626G9 c2626g9) {
        return new C2841P(this.f23469c, c2626g9);
    }
}
