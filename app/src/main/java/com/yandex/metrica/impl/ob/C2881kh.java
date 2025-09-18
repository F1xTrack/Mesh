package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.text.TextUtils;
import com.yandex.metrica.impl.ob.C2707dh;
import com.yandex.metrica.impl.ob.C2782gh;
import com.yandex.metrica.impl.ob.P3;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.kh */
/* loaded from: classes2.dex */
public class C2881kh extends C2782gh {
    private List<String> o;
    private List<String> p;
    private String q;
    private String r;
    private Map<String, String> s;
    private P3.a t;
    private List<String> u;
    private boolean v;
    private boolean w;
    private String x;
    private long y;
    private final Ug z;

    /* renamed from: com.yandex.metrica.impl.ob.kh$b */
    public static class b extends C2707dh.a<b, b> implements InterfaceC2682ch<b, b> {
        public final String d;
        public final String e;
        public final Map<String, String> f;
        public final boolean g;
        public final List<String> h;

        public b(T3 t3) {
            this(t3.b().a.getAsString("CFG_DEVICE_SIZE_TYPE"), t3.b().a.getAsString("CFG_APP_VERSION"), t3.b().a.getAsString("CFG_APP_VERSION_CODE"), t3.a().d(), t3.a().e(), t3.a().a(), t3.a().j(), t3.a().b());
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC2682ch
        public /* bridge */ /* synthetic */ boolean b(b bVar) {
            return false;
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC2682ch
        public b a(b bVar) {
            String str = this.a;
            String str2 = bVar.a;
            if (str != null) {
                str2 = str;
            }
            String str3 = this.b;
            String str4 = bVar.b;
            if (str3 != null) {
                str4 = str3;
            }
            String str5 = this.c;
            String str6 = bVar.c;
            if (str5 != null) {
                str6 = str5;
            }
            String str7 = this.d;
            String str8 = bVar.d;
            if (str7 != null) {
                str8 = str7;
            }
            String str9 = this.e;
            String str10 = bVar.e;
            if (str9 != null) {
                str10 = str9;
            }
            Map<String, String> map = this.f;
            Map<String, String> map2 = bVar.f;
            if (map != null) {
                map2 = map;
            }
            return new b(str2, str4, str6, str8, str10, map2, this.g || bVar.g, bVar.g ? bVar.h : this.h);
        }

        public b(String str, String str2, String str3, String str4, String str5, Map<String, String> map, boolean z, List<String> list) {
            super(str, str2, str3);
            this.d = str4;
            this.e = str5;
            this.f = map;
            this.g = z;
            this.h = list;
        }

        public b() {
            this(null, null, null, null, null, null, false, null);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.kh$c */
    public static class c extends C2782gh.a<C2881kh, b> {
        private final Q d;

        public c(Context context, String str) {
            this(context, str, new Wn(), P0.i().e());
        }

        @Override // com.yandex.metrica.impl.ob.C2707dh.d
        public C2707dh a(Object obj) {
            C2707dh.c cVar = (C2707dh.c) obj;
            C2881kh c2881khA = a(cVar);
            Qi qi = cVar.a;
            c2881khA.c(qi.t());
            c2881khA.b(qi.s());
            String str = ((b) cVar.b).d;
            if (str != null) {
                C2881kh.a(c2881khA, str);
                C2881kh.b(c2881khA, ((b) cVar.b).e);
            }
            Map<String, String> map = ((b) cVar.b).f;
            c2881khA.a(map);
            c2881khA.a(this.d.a(new P3.a(map, E0.APP)));
            c2881khA.a(((b) cVar.b).g);
            c2881khA.a(((b) cVar.b).h);
            c2881khA.b(cVar.a.r());
            c2881khA.h(cVar.a.g());
            c2881khA.b(cVar.a.p());
            return c2881khA;
        }

        public c(Context context, String str, Wn wn, Q q) {
            super(context, str, wn);
            this.d = q;
        }

        @Override // com.yandex.metrica.impl.ob.C2707dh.b
        public C2707dh a() {
            return new C2881kh();
        }
    }

    public /* synthetic */ C2881kh(a aVar) {
        this();
    }

    public P3.a C() {
        return this.t;
    }

    public Map<String, String> D() {
        return this.s;
    }

    public String E() {
        return this.x;
    }

    public String F() {
        return this.q;
    }

    public String G() {
        return this.r;
    }

    public List<String> H() {
        return this.u;
    }

    public Ug I() {
        return this.z;
    }

    public List<String> J() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (!U2.b(this.o)) {
            linkedHashSet.addAll(this.o);
        }
        if (!U2.b(this.p)) {
            linkedHashSet.addAll(this.p);
        }
        linkedHashSet.add("https://startup.mobile.yandex.net/");
        if (!TextUtils.isEmpty("")) {
            linkedHashSet.add("");
        }
        if (!TextUtils.isEmpty("")) {
            linkedHashSet.add("");
        }
        if (!TextUtils.isEmpty("")) {
            linkedHashSet.add("");
        }
        return new ArrayList(linkedHashSet);
    }

    public List<String> K() {
        return this.p;
    }

    public boolean L() {
        return this.v;
    }

    public boolean M() {
        return this.w;
    }

    public long a(long j) {
        if (this.y == 0) {
            this.y = j;
        }
        return this.y;
    }

    public void b(boolean z) {
        this.w = z;
    }

    public void c(List<String> list) {
        this.o = list;
    }

    public void h(String str) {
        this.x = str;
    }

    @Override // com.yandex.metrica.impl.ob.C2782gh
    public String toString() {
        return "StartupRequestConfig{mStartupHostsFromStartup=" + this.o + ", mStartupHostsFromClient=" + this.p + ", mDistributionReferrer='" + this.q + "', mInstallReferrerSource='" + this.r + "', mClidsFromClient=" + this.s + ", mNewCustomHosts=" + this.u + ", mHasNewCustomHosts=" + this.v + ", mSuccessfulStartup=" + this.w + ", mCountryInit='" + this.x + "', mFirstStartupTime=" + this.y + ", mReferrerHolder=" + this.z + "} " + super.toString();
    }

    private C2881kh() {
        this(P0.i().o());
    }

    public void b(long j) {
        if (this.y == 0) {
            this.y = j;
        }
    }

    public C2881kh(Ug ug) {
        this.t = new P3.a(null, E0.APP);
        this.y = 0L;
        this.z = ug;
    }

    public void a(Map<String, String> map) {
        this.s = map;
    }

    public void b(List<String> list) {
        this.p = list;
    }

    public static void b(C2881kh c2881kh, String str) {
        c2881kh.r = str;
    }

    public void a(P3.a aVar) {
        this.t = aVar;
    }

    public static void a(C2881kh c2881kh, String str) {
        c2881kh.q = str;
    }

    public void a(List<String> list) {
        this.u = list;
    }

    public void a(boolean z) {
        this.v = z;
    }
}
