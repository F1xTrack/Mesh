package com.yandex.metrica.impl.p022ob;

import android.location.Location;
import com.yandex.metrica.impl.p022ob.C3044X3;
import com.yandex.metrica.impl.p022ob.C3211dh;
import com.yandex.metrica.impl.p022ob.C3289gh;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.jh */
/* loaded from: classes2.dex */
public class C3367jh extends C3289gh {

    /* renamed from: A */
    private String f23732A;

    /* renamed from: B */
    private List<String> f23733B;

    /* renamed from: C */
    private int f23734C;

    /* renamed from: D */
    private long f23735D;

    /* renamed from: E */
    private long f23736E;

    /* renamed from: F */
    private boolean f23737F;

    /* renamed from: G */
    private long f23738G;

    /* renamed from: H */
    private List<String> f23739H;

    /* renamed from: o */
    private boolean f23740o;

    /* renamed from: p */
    private Location f23741p;

    /* renamed from: q */
    private boolean f23742q;

    /* renamed from: r */
    private int f23743r;

    /* renamed from: s */
    private int f23744s;

    /* renamed from: t */
    private int f23745t;

    /* renamed from: u */
    private Boolean f23746u;

    /* renamed from: v */
    private e f23747v;

    /* renamed from: w */
    private final d f23748w;

    /* renamed from: x */
    private String f23749x;

    /* renamed from: y */
    private boolean f23750y;

    /* renamed from: z */
    private boolean f23751z;

    /* renamed from: com.yandex.metrica.impl.ob.jh$a */
    public static final class a extends C3211dh.a<C3044X3.a, a> {

        /* renamed from: d */
        public final String f23752d;

        /* renamed from: e */
        public final Location f23753e;

        /* renamed from: f */
        public final boolean f23754f;

        /* renamed from: g */
        public final boolean f23755g;

        /* renamed from: h */
        public final int f23756h;

        /* renamed from: i */
        public final int f23757i;

        /* renamed from: j */
        public final int f23758j;

        /* renamed from: k */
        public final boolean f23759k;

        /* renamed from: l */
        public final boolean f23760l;

        /* renamed from: m */
        public final Map<String, String> f23761m;

        /* renamed from: n */
        public final int f23762n;

        public a(C3044X3.a aVar) {
            this(aVar.f22751a, aVar.f22752b, aVar.f22753c, aVar.f22754d, aVar.f22755e, aVar.f22756f, aVar.f22757g, aVar.f22758h, aVar.f22759i, aVar.f22760j, aVar.f22761k, aVar.f22762l, aVar.f22763m, aVar.f22764n);
        }

        @Override // com.yandex.metrica.impl.p022ob.InterfaceC3185ch
        /* renamed from: a */
        public Object mo15413a(Object obj) {
            C3044X3.a aVar = (C3044X3.a) obj;
            String str = aVar.f22751a;
            String str2 = this.f23270a;
            if (str != null) {
                str2 = str;
            }
            String str3 = aVar.f22752b;
            String str4 = this.f23271b;
            if (str3 != null) {
                str4 = str3;
            }
            String str5 = aVar.f22753c;
            String str6 = this.f23272c;
            if (str5 != null) {
                str6 = str5;
            }
            String str7 = aVar.f22754d;
            String str8 = this.f23752d;
            if (str7 != null) {
                str8 = str7;
            }
            Boolean bool = aVar.f22755e;
            Boolean boolValueOf = Boolean.valueOf(this.f23754f);
            if (bool != null) {
                boolValueOf = bool;
            }
            Location location = aVar.f22756f;
            Location location2 = this.f23753e;
            if (location != null) {
                location2 = location;
            }
            Boolean bool2 = aVar.f22757g;
            Boolean boolValueOf2 = Boolean.valueOf(this.f23755g);
            if (bool2 != null) {
                boolValueOf2 = bool2;
            }
            Integer num = aVar.f22758h;
            Integer numValueOf = Integer.valueOf(this.f23756h);
            if (num != null) {
                numValueOf = num;
            }
            Integer num2 = aVar.f22759i;
            Integer numValueOf2 = Integer.valueOf(this.f23757i);
            if (num2 != null) {
                numValueOf2 = num2;
            }
            Integer num3 = aVar.f22760j;
            Integer numValueOf3 = Integer.valueOf(this.f23758j);
            if (num3 != null) {
                numValueOf3 = num3;
            }
            Boolean bool3 = aVar.f22761k;
            Boolean boolValueOf3 = Boolean.valueOf(this.f23759k);
            if (bool3 != null) {
                boolValueOf3 = bool3;
            }
            Boolean bool4 = aVar.f22762l;
            Boolean boolValueOf4 = Boolean.valueOf(this.f23760l);
            if (bool4 != null) {
                boolValueOf4 = bool4;
            }
            Map<String, String> map = aVar.f22763m;
            Map<String, String> map2 = this.f23761m;
            if (map != null) {
                map2 = map;
            }
            Integer num4 = aVar.f22764n;
            return new a(str2, str4, str6, str8, boolValueOf, location2, boolValueOf2, numValueOf, numValueOf2, numValueOf3, boolValueOf3, boolValueOf4, map2, num4 == null ? Integer.valueOf(this.f23762n) : num4);
        }

        /* JADX WARN: Code restructure failed: missing block: B:123:0x01a3, code lost:
        
            if (r2.getExtras() == null) goto L125;
         */
        /* JADX WARN: Code restructure failed: missing block: B:124:0x01a5, code lost:
        
            r8 = r2.getExtras().equals(r8.getExtras());
         */
        /* JADX WARN: Code restructure failed: missing block: B:126:0x01b6, code lost:
        
            if (r8.getExtras() != null) goto L128;
         */
        /* JADX WARN: Removed duplicated region for block: B:134:? A[RETURN, SYNTHETIC] */
        @Override // com.yandex.metrica.impl.p022ob.InterfaceC3185ch
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean mo15414b(java.lang.Object r8) {
            /*
                Method dump skipped, instructions count: 447
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p022ob.C3367jh.a.mo15414b(java.lang.Object):boolean");
        }

        public a(String str, String str2, String str3, String str4, Boolean bool, Location location, Boolean bool2, Integer num, Integer num2, Integer num3, Boolean bool3, Boolean bool4, Map<String, String> map, Integer num4) {
            super(str, str2, str3);
            this.f23752d = str4;
            Boolean bool5 = Boolean.FALSE;
            this.f23754f = ((Boolean) C3762ym.m17269a(bool, bool5)).booleanValue();
            this.f23753e = location;
            this.f23755g = ((Boolean) C3762ym.m17269a(bool2, bool5)).booleanValue();
            this.f23756h = Math.max(10, ((Integer) C3762ym.m17269a((int) num, 10)).intValue());
            this.f23757i = ((Integer) C3762ym.m17269a((int) num2, 7)).intValue();
            this.f23758j = ((Integer) C3762ym.m17269a((int) num3, 90)).intValue();
            this.f23759k = ((Boolean) C3762ym.m17269a(bool3, bool5)).booleanValue();
            this.f23760l = ((Boolean) C3762ym.m17269a(bool4, Boolean.TRUE)).booleanValue();
            this.f23761m = map;
            this.f23762n = ((Integer) C3762ym.m17269a((int) num4, 1000)).intValue();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.jh$b */
    public static abstract class b implements e {

        /* renamed from: a */
        protected final C2769M2 f23763a;

        public b(C2769M2 c2769m2) {
            this.f23763a = c2769m2;
        }

        @Override // com.yandex.metrica.impl.p022ob.C3367jh.e
        /* renamed from: a */
        public boolean mo16165a(Boolean bool) {
            Boolean bool2 = Boolean.TRUE;
            if (bool == null) {
                bool = bool2;
            }
            return bool.booleanValue();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.jh$c */
    public static class c extends C3289gh.a<C3367jh, a> {

        /* renamed from: d */
        private final C3250f4 f23764d;

        /* renamed from: e */
        private final e f23765e;

        /* renamed from: f */
        private final C3576ri f23766f;

        public c(C3250f4 c3250f4, e eVar) {
            this(c3250f4, eVar, new C3576ri());
        }

        @Override // com.yandex.metrica.impl.p022ob.C3211dh.d
        /* renamed from: a */
        public C3211dh mo14785a(Object obj) {
            C3211dh.c cVar = (C3211dh.c) obj;
            C3367jh c3367jhM16004a = m16004a(cVar);
            C3367jh.m16128a(c3367jhM16004a, ((a) cVar.f23276b).f23752d);
            c3367jhM16004a.m16148a(this.f23764d.m15923w().m14289c());
            c3367jhM16004a.m16152a(this.f23764d.m15905d().m14725a());
            c3367jhM16004a.m16162d(((a) cVar.f23276b).f23754f);
            c3367jhM16004a.m16150a(((a) cVar.f23276b).f23753e);
            c3367jhM16004a.m16160c(((a) cVar.f23276b).f23755g);
            c3367jhM16004a.m16161d(((a) cVar.f23276b).f23756h);
            c3367jhM16004a.m16158c(((a) cVar.f23276b).f23757i);
            c3367jhM16004a.m16154b(((a) cVar.f23276b).f23758j);
            a aVar = (a) cVar.f23276b;
            boolean z = aVar.f23759k;
            c3367jhM16004a.m16151a(Boolean.valueOf(aVar.f23760l), this.f23765e);
            c3367jhM16004a.m16149a(((a) cVar.f23276b).f23762n);
            C2885Qi c2885Qi = cVar.f23275a;
            a aVar2 = (a) cVar.f23276b;
            c3367jhM16004a.m16156b(c2885Qi.m14900z().contains(aVar2.f23752d) ? c2885Qi.m14852A() : c2885Qi.m14859H());
            c3367jhM16004a.m16163e(c2885Qi.m14880f().f24710c);
            if (c2885Qi.m14857F() != null) {
                c3367jhM16004a.m16155b(c2885Qi.m14857F().f20869a);
                c3367jhM16004a.m16159c(c2885Qi.m14857F().f20870b);
            }
            c3367jhM16004a.m16157b(c2885Qi.m14880f().f24711d);
            c3367jhM16004a.m16164h(c2885Qi.m14889o());
            c3367jhM16004a.m16153a(this.f23766f.m16696a(aVar2.f23761m, c2885Qi, C2842P0.m14728i().m14735e()));
            return c3367jhM16004a;
        }

        public c(C3250f4 c3250f4, e eVar, C3576ri c3576ri) {
            super(c3250f4.m15908g(), c3250f4.m15906e().m15701b());
            this.f23764d = c3250f4;
            this.f23765e = eVar;
            this.f23766f = c3576ri;
        }

        @Override // com.yandex.metrica.impl.p022ob.C3211dh.b
        /* renamed from: a */
        public C3211dh mo15421a() {
            return new C3367jh(this.f23764d);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.jh$d */
    public interface d {
    }

    /* renamed from: com.yandex.metrica.impl.ob.jh$e */
    public interface e {
        /* renamed from: a */
        boolean mo16165a(Boolean bool);
    }

    public C3367jh(d dVar) {
        this.f23748w = dVar;
    }

    /* renamed from: a */
    public static void m16128a(C3367jh c3367jh, String str) {
        c3367jh.f23749x = str;
    }

    /* renamed from: C */
    public String m16129C() {
        return this.f23749x;
    }

    /* renamed from: D */
    public int m16130D() {
        return this.f23734C;
    }

    /* renamed from: E */
    public List<String> m16131E() {
        return this.f23739H;
    }

    /* renamed from: F */
    public String m16132F() {
        String str = this.f23732A;
        return str == null ? "" : str;
    }

    /* renamed from: G */
    public boolean m16133G() {
        return this.f23747v.mo16165a(this.f23746u);
    }

    /* renamed from: H */
    public int m16134H() {
        return this.f23744s;
    }

    /* renamed from: I */
    public Location m16135I() {
        return this.f23741p;
    }

    /* renamed from: J */
    public int m16136J() {
        return this.f23745t;
    }

    /* renamed from: K */
    public long m16137K() {
        return this.f23738G;
    }

    /* renamed from: L */
    public long m16138L() {
        return this.f23735D;
    }

    /* renamed from: M */
    public long m16139M() {
        return this.f23736E;
    }

    /* renamed from: N */
    public List<String> m16140N() {
        return this.f23733B;
    }

    /* renamed from: O */
    public int m16141O() {
        return this.f23743r;
    }

    /* renamed from: P */
    public boolean m16142P() {
        return this.f23751z;
    }

    /* renamed from: Q */
    public boolean m16143Q() {
        return this.f23742q;
    }

    /* renamed from: R */
    public boolean m16144R() {
        return this.f23740o;
    }

    /* renamed from: S */
    public boolean m16145S() {
        return this.f23750y;
    }

    /* renamed from: T */
    public boolean m16146T() {
        return m15801y() && !C2968U2.m15249b(this.f23733B) && this.f23737F;
    }

    /* renamed from: U */
    public boolean m16147U() {
        return ((C3250f4) this.f23748w).m15898E();
    }

    /* renamed from: b */
    public void m16156b(List<String> list) {
        this.f23733B = list;
    }

    /* renamed from: c */
    public void m16159c(long j) {
        this.f23736E = j;
    }

    /* renamed from: d */
    public void m16162d(boolean z) {
        this.f23740o = z;
    }

    /* renamed from: e */
    public void m16163e(boolean z) {
        this.f23750y = z;
    }

    /* renamed from: h */
    public void m16164h(String str) {
        this.f23732A = str;
    }

    /* renamed from: a */
    public void m16150a(Location location) {
        this.f23741p = location;
    }

    /* renamed from: b */
    public void m16155b(long j) {
        this.f23735D = j;
    }

    /* renamed from: c */
    public void m16160c(boolean z) {
        this.f23742q = z;
    }

    /* renamed from: d */
    public void m16161d(int i) {
        this.f23743r = i;
    }

    /* renamed from: a */
    public void m16148a(int i) {
        this.f23734C = i;
    }

    /* renamed from: b */
    public void m16157b(boolean z) {
        this.f23751z = z;
    }

    /* renamed from: c */
    public void m16158c(int i) {
        this.f23745t = i;
    }

    /* renamed from: a */
    public void m16149a(long j) {
        this.f23738G = j;
    }

    /* renamed from: b */
    public void m16154b(int i) {
        this.f23744s = i;
    }

    /* renamed from: a */
    public void m16152a(List<String> list) {
        this.f23739H = list;
    }

    /* renamed from: a */
    public void m16151a(Boolean bool, e eVar) {
        this.f23746u = bool;
        this.f23747v = eVar;
    }

    /* renamed from: a */
    public void m16153a(boolean z) {
        this.f23737F = z;
    }
}
