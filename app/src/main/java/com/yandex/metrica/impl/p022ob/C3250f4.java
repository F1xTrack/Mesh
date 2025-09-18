package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import android.text.TextUtils;
import com.yandex.metrica.EnumC2458c;
import com.yandex.metrica.YandexMetrica;
import com.yandex.metrica.impl.p022ob.C2466A;
import com.yandex.metrica.impl.p022ob.C3044X3;
import com.yandex.metrica.impl.p022ob.C3224e4;
import com.yandex.metrica.impl.p022ob.C3367jh;
import com.yandex.metrica.impl.p022ob.C3668v6;
import java.util.ArrayList;

/* renamed from: com.yandex.metrica.impl.ob.f4 */
/* loaded from: classes2.dex */
public class C3250f4 implements InterfaceC3432m4, InterfaceC3354j4, InterfaceC3027Wb, C3367jh.d {

    /* renamed from: a */
    private final Context f23397a;

    /* renamed from: b */
    private final C3172c4 f23398b;

    /* renamed from: c */
    private final C2626G9 f23399c;

    /* renamed from: d */
    private final C2676I9 f23400d;

    /* renamed from: e */
    private final C2576E9 f23401e;

    /* renamed from: f */
    private final C3430m2 f23402f;

    /* renamed from: g */
    private final C3618t8 f23403g;

    /* renamed from: h */
    private final C3277g5 f23404h;

    /* renamed from: i */
    private final C3199d5 f23405i;

    /* renamed from: j */
    private final C2466A f23406j;

    /* renamed from: k */
    private final C2994V3 f23407k;

    /* renamed from: l */
    private final C3668v6 f23408l;

    /* renamed from: m */
    private final C3614t4 f23409m;

    /* renamed from: n */
    private final C3278g6 f23410n;

    /* renamed from: o */
    private final C2689Im f23411o;

    /* renamed from: p */
    private final C3736xm f23412p;

    /* renamed from: q */
    private final C3640u4 f23413q;

    /* renamed from: r */
    private final C3224e4.b f23414r;

    /* renamed from: s */
    private final C3002Vb f23415s;

    /* renamed from: t */
    private final C2927Sb f23416t;

    /* renamed from: u */
    private final C3052Xb f23417u;

    /* renamed from: v */
    private final C2841P f23418v;

    /* renamed from: w */
    private final C2893R2 f23419w;

    /* renamed from: x */
    private final C3170c2 f23420x;

    /* renamed from: y */
    private final C2675I8 f23421y;

    /* renamed from: com.yandex.metrica.impl.ob.f4$a */
    public class a implements C3668v6.a {
        public a() {
        }

        @Override // com.yandex.metrica.impl.p022ob.C3668v6.a
        /* renamed from: a */
        public void mo15926a(C3376k0 c3376k0, C3694w6 c3694w6) {
            C3250f4.this.f23413q.m16891a(c3376k0, c3694w6);
        }
    }

    public C3250f4(Context context, C3172c4 c3172c4, C2994V3 c2994v3, C2893R2 c2893r2, C3276g4 c3276g4) {
        this.f23397a = context.getApplicationContext();
        this.f23398b = c3172c4;
        this.f23407k = c2994v3;
        this.f23419w = c2893r2;
        C2675I8 c2675i8M15971d = c3276g4.m15971d();
        this.f23421y = c2675i8M15971d;
        this.f23420x = C2842P0.m14728i().m14742m();
        C3614t4 c3614t4M15964a = c3276g4.m15964a(this);
        this.f23409m = c3614t4M15964a;
        C2689Im c2689ImM15975b = c3276g4.m15967b().m15975b();
        this.f23411o = c2689ImM15975b;
        C3736xm c3736xmM15974a = c3276g4.m15967b().m15974a();
        this.f23412p = c3736xmM15974a;
        C2626G9 c2626g9M15976a = c3276g4.m15970c().m15976a();
        this.f23399c = c2626g9M15976a;
        this.f23401e = c3276g4.m15970c().m15977b();
        this.f23400d = C2842P0.m14728i().m14750u();
        C2466A c2466aM15300a = c2994v3.m15300a(c3172c4, c2689ImM15975b, c2626g9M15976a);
        this.f23406j = c2466aM15300a;
        this.f23410n = c3276g4.m15963a();
        C3618t8 c3618t8M15968b = c3276g4.m15968b(this);
        this.f23403g = c3618t8M15968b;
        C3430m2<C3250f4> c3430m2M15973e = c3276g4.m15973e(this);
        this.f23402f = c3430m2M15973e;
        this.f23414r = c3276g4.m15972d(this);
        C3052Xb c3052XbM15961a = c3276g4.m15961a(c3618t8M15968b, c3614t4M15964a);
        this.f23417u = c3052XbM15961a;
        C2927Sb c2927SbM15959a = c3276g4.m15959a(c3618t8M15968b);
        this.f23416t = c2927SbM15959a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(c3052XbM15961a);
        arrayList.add(c2927SbM15959a);
        this.f23415s = c3276g4.m15960a(arrayList, this);
        m15893y();
        C3668v6 c3668v6M15966a = c3276g4.m15966a(this, c2675i8M15971d, new a());
        this.f23408l = c3668v6M15966a;
        if (c3736xmM15974a.m17370c()) {
            c3736xmM15974a.m17363a("Read app environment for component %s. Value: %s", c3172c4.toString(), c2466aM15300a.m13835a().f20825a);
        }
        this.f23413q = c3276g4.m15965a(c2626g9M15976a, c2675i8M15971d, c3668v6M15966a, c3618t8M15968b, c2466aM15300a, c3430m2M15973e);
        C3199d5 c3199d5M15969c = c3276g4.m15969c(this);
        this.f23405i = c3199d5M15969c;
        this.f23404h = c3276g4.m15962a(this, c3199d5M15969c);
        this.f23418v = c3276g4.m15958a(c2626g9M15976a);
        c3618t8M15968b.m16842e();
    }

    /* renamed from: y */
    private void m15893y() {
        int libraryApiLevel = YandexMetrica.getLibraryApiLevel();
        Integer numM14179i = this.f23399c.m14179i();
        if (numM14179i == null) {
            numM14179i = Integer.valueOf(this.f23421y.m14293e());
        }
        if (numM14179i.intValue() < libraryApiLevel) {
            this.f23414r.m15819a(new C3520pe(new C3546qe(this.f23397a, this.f23398b.m15700a()))).m15818a();
            this.f23421y.m14286b(libraryApiLevel);
        }
    }

    /* renamed from: A */
    public boolean m15894A() {
        return this.f23413q.m16897d() && m15914m().m15801y();
    }

    /* renamed from: B */
    public boolean m15895B() {
        return this.f23413q.m16895c() && m15914m().m16142P() && m15914m().m15801y();
    }

    /* renamed from: C */
    public void m15896C() {
        this.f23409m.m15945e();
    }

    /* renamed from: D */
    public boolean m15897D() {
        C3367jh c3367jhM15914m = m15914m();
        return c3367jhM15914m.m16145S() && this.f23419w.m14970b(this.f23413q.m16889a(), c3367jhM15914m.m16139M(), "should force send permissions");
    }

    /* renamed from: E */
    public boolean m15898E() {
        return !(this.f23420x.m13874a().f21641d && this.f23409m.m15944d().m14865N());
    }

    /* renamed from: F */
    public void mo15899F() {
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2760Li
    /* renamed from: a */
    public synchronized void mo14543a(EnumC2660Hi enumC2660Hi, C2885Qi c2885Qi) {
    }

    /* renamed from: b */
    public void m15902b(C3376k0 c3376k0) {
        this.f23406j.m13836a(c3376k0.m16229b());
        C2466A.a aVarM13835a = this.f23406j.m13835a();
        C2994V3 c2994v3 = this.f23407k;
        C2626G9 c2626g9 = this.f23399c;
        synchronized (c2994v3) {
            if (aVarM13835a.f20826b > c2626g9.m14170e().f20826b) {
                c2626g9.m14164a(aVarM13835a).m14258c();
                if (this.f23411o.m17370c()) {
                    this.f23411o.m17363a("Save new app environment for %s. Value: %s", this.f23398b, aVarM13835a.f20825a);
                }
            }
        }
    }

    /* renamed from: c */
    public synchronized void m15904c() {
        this.f23402f.m14809d();
    }

    /* renamed from: d */
    public C2841P m15905d() {
        return this.f23418v;
    }

    /* renamed from: e */
    public C3172c4 m15906e() {
        return this.f23398b;
    }

    /* renamed from: f */
    public C2626G9 m15907f() {
        return this.f23399c;
    }

    /* renamed from: g */
    public Context m15908g() {
        return this.f23397a;
    }

    /* renamed from: h */
    public String m15909h() {
        return this.f23399c.m14183m();
    }

    /* renamed from: i */
    public C3618t8 m15910i() {
        return this.f23403g;
    }

    /* renamed from: j */
    public C3278g6 m15911j() {
        return this.f23410n;
    }

    /* renamed from: k */
    public C3199d5 m15912k() {
        return this.f23405i;
    }

    /* renamed from: l */
    public C3002Vb m15913l() {
        return this.f23415s;
    }

    /* renamed from: m */
    public C3367jh m15914m() {
        return (C3367jh) this.f23409m.m15942b();
    }

    @Deprecated
    /* renamed from: n */
    public final C3546qe m15915n() {
        return new C3546qe(this.f23397a, this.f23398b.m15700a());
    }

    /* renamed from: o */
    public C2576E9 m15916o() {
        return this.f23401e;
    }

    /* renamed from: p */
    public String m15917p() {
        return this.f23399c.m14182l();
    }

    /* renamed from: q */
    public C2689Im m15918q() {
        return this.f23411o;
    }

    /* renamed from: r */
    public C3640u4 m15919r() {
        return this.f23413q;
    }

    /* renamed from: s */
    public EnumC2458c mo15382s() {
        return EnumC2458c.MANUAL;
    }

    /* renamed from: t */
    public C2676I9 m15920t() {
        return this.f23400d;
    }

    /* renamed from: u */
    public C3668v6 m15921u() {
        return this.f23408l;
    }

    /* renamed from: v */
    public C2885Qi m15922v() {
        return this.f23409m.m15944d();
    }

    /* renamed from: w */
    public C2675I8 m15923w() {
        return this.f23421y;
    }

    /* renamed from: x */
    public void m15924x() {
        this.f23413q.m16892b();
    }

    /* renamed from: z */
    public boolean m15925z() {
        C3367jh c3367jhM15914m = m15914m();
        return c3367jhM15914m.m16145S() && c3367jhM15914m.m15801y() && this.f23419w.m14970b(this.f23413q.m16889a(), c3367jhM15914m.m16138L(), "need to check permissions");
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3432m4
    /* renamed from: a */
    public void mo15171a(C3376k0 c3376k0) {
        if (this.f23411o.m17370c()) {
            C2689Im c2689Im = this.f23411o;
            c2689Im.getClass();
            if (C2692J0.m14404c(c3376k0.m16244n())) {
                StringBuilder sb = new StringBuilder("Event received on service: ");
                sb.append(c3376k0.m16237g());
                if (C2692J0.m14406e(c3376k0.m16244n()) && !TextUtils.isEmpty(c3376k0.m16246p())) {
                    sb.append(" with value ");
                    sb.append(c3376k0.m16246p());
                }
                c2689Im.m17366b(sb.toString());
            }
        }
        String strM15700a = this.f23398b.m15700a();
        if (TextUtils.isEmpty(strM15700a) || ResultCode.ERROR.equals(strM15700a)) {
            return;
        }
        this.f23404h.m15978a(c3376k0);
    }

    /* renamed from: b */
    public void m15901b() {
        this.f23406j.m13837b();
        C2994V3 c2994v3 = this.f23407k;
        C2466A.a aVarM13835a = this.f23406j.m13835a();
        C2626G9 c2626g9 = this.f23399c;
        synchronized (c2994v3) {
            c2626g9.m14164a(aVarM13835a).m14258c();
        }
    }

    /* renamed from: b */
    public void m15903b(String str) {
        this.f23399c.m14177h(str).m14258c();
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3432m4
    /* renamed from: a */
    public synchronized void mo15170a(C3044X3.a aVar) {
        try {
            C3614t4 c3614t4 = this.f23409m;
            synchronized (c3614t4) {
                c3614t4.m15941a((C3614t4) aVar);
            }
            if (Boolean.TRUE.equals(aVar.f22761k)) {
                this.f23411o.m17372e();
            } else {
                if (Boolean.FALSE.equals(aVar.f22761k)) {
                    this.f23411o.m17371d();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2760Li
    /* renamed from: a */
    public synchronized void mo14544a(C2885Qi c2885Qi) {
        this.f23409m.m15939a(c2885Qi);
        this.f23403g.m16840b(c2885Qi);
        this.f23415s.m15305c();
    }

    /* renamed from: a */
    public void m15900a(String str) {
        this.f23399c.m14178i(str).m14258c();
    }
}
