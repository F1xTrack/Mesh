package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Pair;
import p000.AbstractC7230yu;

/* renamed from: io.appmetrica.analytics.impl.l5 */
/* loaded from: classes2.dex */
public class C5264l5 {

    /* renamed from: a */
    public final C5214j5 f32121a;

    /* renamed from: b */
    public final C5239k5 f32122b;

    /* renamed from: c */
    protected final Context f32123c;

    /* renamed from: d */
    public final C4964Z4 f32124d;

    /* renamed from: e */
    public final C4411C4 f32125e;

    /* renamed from: f */
    public final AbstractC5089e5 f32126f;

    /* renamed from: g */
    protected final C5155gl f32127g;

    /* renamed from: h */
    public final InterfaceC4398Bg f32128h;

    /* renamed from: i */
    public final C4440D8 f32129i;

    /* renamed from: j */
    public final ICommonExecutor f32130j;

    /* renamed from: k */
    public final C5620zb f32131k;

    /* renamed from: l */
    public final int f32132l;

    public C5264l5(Context context, C4964Z4 c4964z4, C4411C4 c4411c4, AbstractC5089e5 abstractC5089e5, C5155gl c5155gl, InterfaceC4398Bg interfaceC4398Bg, ICommonExecutor iCommonExecutor, int i, C5620zb c5620zb) {
        this(context, c4964z4, c4411c4, abstractC5089e5, c5155gl, interfaceC4398Bg, iCommonExecutor, new C4440D8(), i, new C5214j5(c4411c4.f29938a), new C5239k5(context, c4964z4), c5620zb);
    }

    /* renamed from: c */
    public static C4872V8 m20669c(C5139g5 c5139g5) {
        return new C4872V8(c5139g5);
    }

    /* renamed from: a */
    public final C4561I8 m20671a() {
        Context context = this.f32123c;
        C4964Z4 c4964z4 = this.f32124d;
        return new C4561I8(new C4681N8(context, c4964z4), this.f32132l);
    }

    /* renamed from: b */
    public final C4631L6 m20674b(C5139g5 c5139g5) {
        return new C4631L6(c5139g5, C4966Z6.m20064a(this.f32123c).m20070c(this.f32124d), new C4535H6(c5139g5.mo19230c()), new C5141g7());
    }

    /* renamed from: d */
    public final C5214j5 m20677d() {
        return this.f32121a;
    }

    /* renamed from: e */
    public final C5239k5 m20678e() {
        return this.f32122b;
    }

    /* renamed from: f */
    public final C5482tn m20679f() {
        C5482tn c5482tn;
        InterfaceC5582xn c4945y9;
        C5557wn c5557wnM20615A = C5244ka.f32038C.m20615A();
        C4964Z4 c4964z4 = this.f32124d;
        synchronized (c5557wnM20615A) {
            try {
                String strValueOf = String.valueOf(c4964z4);
                LinkedHashMap linkedHashMap = c5557wnM20615A.f32783b;
                Object c5482tn2 = linkedHashMap.get(strValueOf);
                if (c5482tn2 == null) {
                    C5323ne c5323ne = new C5323ne(C4966Z6.m20064a(c5557wnM20615A.f32782a).m20068b(c4964z4));
                    if (c4964z4.mo20057d()) {
                        String str = "appmetrica_vital_" + c4964z4.f31145b + ".dat";
                        c4945y9 = new C5314n5(AbstractC7230yu.m26275f(new Pair(str, new C4945Y9(c5557wnM20615A.f32782a, str)), new Pair("appmetrica_vital_main.dat", new C4945Y9(c5557wnM20615A.f32782a, "appmetrica_vital_main.dat"))));
                    } else {
                        c4945y9 = new C4945Y9(c5557wnM20615A.f32782a, "appmetrica_vital_" + c4964z4.f31145b + ".dat");
                    }
                    c5482tn2 = new C5482tn(c5323ne, c4945y9, strValueOf);
                    linkedHashMap.put(strValueOf, c5482tn2);
                }
                c5482tn = (C5482tn) c5482tn2;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c5482tn;
    }

    public C5264l5(Context context, C4964Z4 c4964z4, C4411C4 c4411c4, AbstractC5089e5 abstractC5089e5, C5155gl c5155gl, InterfaceC4398Bg interfaceC4398Bg, ICommonExecutor iCommonExecutor, C4440D8 c4440d8, int i, C5214j5 c5214j5, C5239k5 c5239k5, C5620zb c5620zb) {
        this.f32123c = context;
        this.f32124d = c4964z4;
        this.f32125e = c4411c4;
        this.f32126f = abstractC5089e5;
        this.f32127g = c5155gl;
        this.f32128h = interfaceC4398Bg;
        this.f32130j = iCommonExecutor;
        this.f32129i = c4440d8;
        this.f32132l = i;
        this.f32121a = c5214j5;
        this.f32122b = c5239k5;
        this.f32131k = c5620zb;
    }

    /* renamed from: c */
    public final C4668Mj m20675c() {
        return new C4668Mj(this.f32123c, this.f32124d);
    }

    /* renamed from: d */
    public final C4666Mh m20676d(C5139g5 c5139g5) {
        C4666Mh c4666Mh = new C4666Mh(c5139g5, this.f32126f.mo19951a(), this.f32130j);
        C5620zb c5620zb = this.f32131k;
        synchronized (c5620zb) {
            c5620zb.f32919c.add(c4666Mh);
        }
        return c4666Mh;
    }

    /* renamed from: a */
    public final C5175hg m20672a(C5139g5 c5139g5) {
        return new C5175hg(new C4423Cg(c5139g5, this.f32128h, new C4819T3()), this.f32127g, new C5625zg(this.f32125e));
    }

    /* renamed from: a */
    public static C4859Uj m20665a(C5139g5 c5139g5, C5482tn c5482tn, C5114f5 c5114f5) {
        C4835Tj c4835Tj = new C4835Tj(c5482tn);
        return new C4859Uj(c5139g5, c4835Tj, c5114f5, new C5094ea(c5139g5, c4835Tj, new C4931Xj(c5139g5.m20416g(), C5094ea.f31575g), AbstractC5235k1.m20601a(), new SystemTimeProvider()), new C4507G2(c5139g5, c4835Tj, new C4931Xj(c5139g5.m20416g(), "background"), AbstractC5235k1.m20601a(), new SystemTimeProvider()), new C4586J9(c5139g5.f31722a));
    }

    /* renamed from: b */
    public static C5014b5 m20668b() {
        return new C5014b5();
    }

    /* renamed from: a */
    public final C5193i9 m20673a(C5323ne c5323ne, C5482tn c5482tn, C4859Uj c4859Uj, C4631L6 c4631l6, C5009b0 c5009b0, C4668Mj c4668Mj, C4666Mh c4666Mh) {
        return new C5193i9(c5323ne, c5482tn, c4859Uj, c4631l6, c5009b0, this.f32129i, c4668Mj, this.f32132l, new C5189i5(c4666Mh), new C4729P8(c5482tn, new C4753Q8(c5482tn)), new SystemTimeProvider());
    }

    /* renamed from: a */
    public static C4618Kh m20664a(C5139g5 c5139g5, C4872V8 c4872v8) {
        return new C4618Kh(c4872v8, c5139g5);
    }

    /* renamed from: a */
    public static C4437D5 m20663a(C4631L6 c4631l6) {
        return new C4437D5(c4631l6);
    }

    /* renamed from: a */
    public static C5371pc m20667a(C4631L6 c4631l6, C5175hg c5175hg) {
        return new C5371pc(c4631l6, c5175hg);
    }

    /* renamed from: a */
    public static C5343o9 m20666a(ArrayList arrayList, InterfaceC5418r9 interfaceC5418r9) {
        return new C5343o9(arrayList, interfaceC5418r9);
    }

    /* renamed from: a */
    public final C4435D3 m20670a(C5323ne c5323ne) {
        Context context = this.f32123c;
        return new C4435D3(context, c5323ne, context.getPackageName(), new SafePackageManager());
    }
}
