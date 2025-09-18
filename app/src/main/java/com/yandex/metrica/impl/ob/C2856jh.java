package com.yandex.metrica.impl.ob;

import android.location.Location;
import com.yandex.metrica.impl.ob.C2707dh;
import com.yandex.metrica.impl.ob.C2782gh;
import com.yandex.metrica.impl.ob.X3;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.jh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2856jh extends C2782gh {
    private String A;
    private List<String> B;
    private int C;
    private long D;
    private long E;
    private boolean F;
    private long G;
    private List<String> H;
    private boolean o;
    private Location p;
    private boolean q;
    private int r;
    private int s;
    private int t;
    private Boolean u;
    private e v;
    private final d w;
    private String x;
    private boolean y;
    private boolean z;

    /* renamed from: com.yandex.metrica.impl.ob.jh$a */
    public static final class a extends C2707dh.a<X3.a, a> {
        public final String d;
        public final Location e;
        public final boolean f;
        public final boolean g;
        public final int h;
        public final int i;
        public final int j;
        public final boolean k;
        public final boolean l;
        public final Map<String, String> m;
        public final int n;

        public a(X3.a aVar) {
            this(aVar.a, aVar.b, aVar.c, aVar.d, aVar.e, aVar.f, aVar.g, aVar.h, aVar.i, aVar.j, aVar.k, aVar.l, aVar.m, aVar.n);
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC2682ch
        public Object a(Object obj) {
            X3.a aVar = (X3.a) obj;
            String str = aVar.a;
            String str2 = this.a;
            if (str != null) {
                str2 = str;
            }
            String str3 = aVar.b;
            String str4 = this.b;
            if (str3 != null) {
                str4 = str3;
            }
            String str5 = aVar.c;
            String str6 = this.c;
            if (str5 != null) {
                str6 = str5;
            }
            String str7 = aVar.d;
            String str8 = this.d;
            if (str7 != null) {
                str8 = str7;
            }
            Boolean bool = aVar.e;
            Boolean boolValueOf = Boolean.valueOf(this.f);
            if (bool != null) {
                boolValueOf = bool;
            }
            Location location = aVar.f;
            Location location2 = this.e;
            if (location != null) {
                location2 = location;
            }
            Boolean bool2 = aVar.g;
            Boolean boolValueOf2 = Boolean.valueOf(this.g);
            if (bool2 != null) {
                boolValueOf2 = bool2;
            }
            Integer num = aVar.h;
            Integer numValueOf = Integer.valueOf(this.h);
            if (num != null) {
                numValueOf = num;
            }
            Integer num2 = aVar.i;
            Integer numValueOf2 = Integer.valueOf(this.i);
            if (num2 != null) {
                numValueOf2 = num2;
            }
            Integer num3 = aVar.j;
            Integer numValueOf3 = Integer.valueOf(this.j);
            if (num3 != null) {
                numValueOf3 = num3;
            }
            Boolean bool3 = aVar.k;
            Boolean boolValueOf3 = Boolean.valueOf(this.k);
            if (bool3 != null) {
                boolValueOf3 = bool3;
            }
            Boolean bool4 = aVar.l;
            Boolean boolValueOf4 = Boolean.valueOf(this.l);
            if (bool4 != null) {
                boolValueOf4 = bool4;
            }
            Map<String, String> map = aVar.m;
            Map<String, String> map2 = this.m;
            if (map != null) {
                map2 = map;
            }
            Integer num4 = aVar.n;
            return new a(str2, str4, str6, str8, boolValueOf, location2, boolValueOf2, numValueOf, numValueOf2, numValueOf3, boolValueOf3, boolValueOf4, map2, num4 == null ? Integer.valueOf(this.n) : num4);
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
        @Override // com.yandex.metrica.impl.ob.InterfaceC2682ch
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean b(java.lang.Object r8) {
            /*
                Method dump skipped, instructions count: 447
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.C2856jh.a.b(java.lang.Object):boolean");
        }

        public a(String str, String str2, String str3, String str4, Boolean bool, Location location, Boolean bool2, Integer num, Integer num2, Integer num3, Boolean bool3, Boolean bool4, Map<String, String> map, Integer num4) {
            super(str, str2, str3);
            this.d = str4;
            Boolean bool5 = Boolean.FALSE;
            this.f = ((Boolean) C3240ym.a(bool, bool5)).booleanValue();
            this.e = location;
            this.g = ((Boolean) C3240ym.a(bool2, bool5)).booleanValue();
            this.h = Math.max(10, ((Integer) C3240ym.a((int) num, 10)).intValue());
            this.i = ((Integer) C3240ym.a((int) num2, 7)).intValue();
            this.j = ((Integer) C3240ym.a((int) num3, 90)).intValue();
            this.k = ((Boolean) C3240ym.a(bool3, bool5)).booleanValue();
            this.l = ((Boolean) C3240ym.a(bool4, Boolean.TRUE)).booleanValue();
            this.m = map;
            this.n = ((Integer) C3240ym.a((int) num4, 1000)).intValue();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.jh$b */
    public static abstract class b implements e {
        protected final M2 a;

        public b(M2 m2) {
            this.a = m2;
        }

        @Override // com.yandex.metrica.impl.ob.C2856jh.e
        public boolean a(Boolean bool) {
            Boolean bool2 = Boolean.TRUE;
            if (bool == null) {
                bool = bool2;
            }
            return bool.booleanValue();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.jh$c */
    public static class c extends C2782gh.a<C2856jh, a> {
        private final C2744f4 d;
        private final e e;
        private final C3056ri f;

        public c(C2744f4 c2744f4, e eVar) {
            this(c2744f4, eVar, new C3056ri());
        }

        @Override // com.yandex.metrica.impl.ob.C2707dh.d
        public C2707dh a(Object obj) {
            C2707dh.c cVar = (C2707dh.c) obj;
            C2856jh c2856jhA = a(cVar);
            C2856jh.a(c2856jhA, ((a) cVar.b).d);
            c2856jhA.a(this.d.w().c());
            c2856jhA.a(this.d.d().a());
            c2856jhA.d(((a) cVar.b).f);
            c2856jhA.a(((a) cVar.b).e);
            c2856jhA.c(((a) cVar.b).g);
            c2856jhA.d(((a) cVar.b).h);
            c2856jhA.c(((a) cVar.b).i);
            c2856jhA.b(((a) cVar.b).j);
            a aVar = (a) cVar.b;
            boolean z = aVar.k;
            c2856jhA.a(Boolean.valueOf(aVar.l), this.e);
            c2856jhA.a(((a) cVar.b).n);
            Qi qi = cVar.a;
            a aVar2 = (a) cVar.b;
            c2856jhA.b(qi.z().contains(aVar2.d) ? qi.A() : qi.H());
            c2856jhA.e(qi.f().c);
            if (qi.F() != null) {
                c2856jhA.b(qi.F().a);
                c2856jhA.c(qi.F().b);
            }
            c2856jhA.b(qi.f().d);
            c2856jhA.h(qi.o());
            c2856jhA.a(this.f.a(aVar2.m, qi, P0.i().e()));
            return c2856jhA;
        }

        public c(C2744f4 c2744f4, e eVar, C3056ri c3056ri) {
            super(c2744f4.g(), c2744f4.e().b());
            this.d = c2744f4;
            this.e = eVar;
            this.f = c3056ri;
        }

        @Override // com.yandex.metrica.impl.ob.C2707dh.b
        public C2707dh a() {
            return new C2856jh(this.d);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.jh$d */
    public interface d {
    }

    /* renamed from: com.yandex.metrica.impl.ob.jh$e */
    public interface e {
        boolean a(Boolean bool);
    }

    public C2856jh(d dVar) {
        this.w = dVar;
    }

    public static void a(C2856jh c2856jh, String str) {
        c2856jh.x = str;
    }

    public String C() {
        return this.x;
    }

    public int D() {
        return this.C;
    }

    public List<String> E() {
        return this.H;
    }

    public String F() {
        String str = this.A;
        return str == null ? "" : str;
    }

    public boolean G() {
        return this.v.a(this.u);
    }

    public int H() {
        return this.s;
    }

    public Location I() {
        return this.p;
    }

    public int J() {
        return this.t;
    }

    public long K() {
        return this.G;
    }

    public long L() {
        return this.D;
    }

    public long M() {
        return this.E;
    }

    public List<String> N() {
        return this.B;
    }

    public int O() {
        return this.r;
    }

    public boolean P() {
        return this.z;
    }

    public boolean Q() {
        return this.q;
    }

    public boolean R() {
        return this.o;
    }

    public boolean S() {
        return this.y;
    }

    public boolean T() {
        return y() && !U2.b(this.B) && this.F;
    }

    public boolean U() {
        return ((C2744f4) this.w).E();
    }

    public void b(List<String> list) {
        this.B = list;
    }

    public void c(long j) {
        this.E = j;
    }

    public void d(boolean z) {
        this.o = z;
    }

    public void e(boolean z) {
        this.y = z;
    }

    public void h(String str) {
        this.A = str;
    }

    public void a(Location location) {
        this.p = location;
    }

    public void b(long j) {
        this.D = j;
    }

    public void c(boolean z) {
        this.q = z;
    }

    public void d(int i) {
        this.r = i;
    }

    public void a(int i) {
        this.C = i;
    }

    public void b(boolean z) {
        this.z = z;
    }

    public void c(int i) {
        this.t = i;
    }

    public void a(long j) {
        this.G = j;
    }

    public void b(int i) {
        this.s = i;
    }

    public void a(List<String> list) {
        this.H = list;
    }

    public void a(Boolean bool, e eVar) {
        this.u = bool;
        this.v = eVar;
    }

    public void a(boolean z) {
        this.F = z;
    }
}
