package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import android.text.TextUtils;
import com.yandex.metrica.impl.p022ob.C2845P3;
import com.yandex.metrica.impl.p022ob.C3211dh;
import com.yandex.metrica.impl.p022ob.C3289gh;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.kh */
/* loaded from: classes2.dex */
public class C3393kh extends C3289gh {

    /* renamed from: o */
    private List<String> f24127o;

    /* renamed from: p */
    private List<String> f24128p;

    /* renamed from: q */
    private String f24129q;

    /* renamed from: r */
    private String f24130r;

    /* renamed from: s */
    private Map<String, String> f24131s;

    /* renamed from: t */
    private C2845P3.a f24132t;

    /* renamed from: u */
    private List<String> f24133u;

    /* renamed from: v */
    private boolean f24134v;

    /* renamed from: w */
    private boolean f24135w;

    /* renamed from: x */
    private String f24136x;

    /* renamed from: y */
    private long f24137y;

    /* renamed from: z */
    private final C2982Ug f24138z;

    /* renamed from: com.yandex.metrica.impl.ob.kh$b */
    public static class b extends C3211dh.a<b, b> implements InterfaceC3185ch<b, b> {

        /* renamed from: d */
        public final String f24139d;

        /* renamed from: e */
        public final String f24140e;

        /* renamed from: f */
        public final Map<String, String> f24141f;

        /* renamed from: g */
        public final boolean f24142g;

        /* renamed from: h */
        public final List<String> f24143h;

        public b(C2944T3 c2944t3) {
            this(c2944t3.m15168b().f20731a.getAsString("CFG_DEVICE_SIZE_TYPE"), c2944t3.m15168b().f20731a.getAsString("CFG_APP_VERSION"), c2944t3.m15168b().f20731a.getAsString("CFG_APP_VERSION_CODE"), c2944t3.m15167a().m15262d(), c2944t3.m15167a().m15263e(), c2944t3.m15167a().m15254a(), c2944t3.m15167a().m15268j(), c2944t3.m15167a().m15258b());
        }

        @Override // com.yandex.metrica.impl.p022ob.InterfaceC3185ch
        /* renamed from: b */
        public /* bridge */ /* synthetic */ boolean mo15414b(b bVar) {
            return false;
        }

        @Override // com.yandex.metrica.impl.p022ob.InterfaceC3185ch
        /* renamed from: a */
        public b mo15413a(b bVar) {
            String str = this.f23270a;
            String str2 = bVar.f23270a;
            if (str != null) {
                str2 = str;
            }
            String str3 = this.f23271b;
            String str4 = bVar.f23271b;
            if (str3 != null) {
                str4 = str3;
            }
            String str5 = this.f23272c;
            String str6 = bVar.f23272c;
            if (str5 != null) {
                str6 = str5;
            }
            String str7 = this.f24139d;
            String str8 = bVar.f24139d;
            if (str7 != null) {
                str8 = str7;
            }
            String str9 = this.f24140e;
            String str10 = bVar.f24140e;
            if (str9 != null) {
                str10 = str9;
            }
            Map<String, String> map = this.f24141f;
            Map<String, String> map2 = bVar.f24141f;
            if (map != null) {
                map2 = map;
            }
            return new b(str2, str4, str6, str8, str10, map2, this.f24142g || bVar.f24142g, bVar.f24142g ? bVar.f24143h : this.f24143h);
        }

        public b(String str, String str2, String str3, String str4, String str5, Map<String, String> map, boolean z, List<String> list) {
            super(str, str2, str3);
            this.f24139d = str4;
            this.f24140e = str5;
            this.f24141f = map;
            this.f24142g = z;
            this.f24143h = list;
        }

        public b() {
            this(null, null, null, null, null, null, false, null);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.kh$c */
    public static class c extends C3289gh.a<C3393kh, b> {

        /* renamed from: d */
        private final C2866Q f24144d;

        public c(Context context, String str) {
            this(context, str, new C3039Wn(), C2842P0.m14728i().m14735e());
        }

        @Override // com.yandex.metrica.impl.p022ob.C3211dh.d
        /* renamed from: a */
        public C3211dh mo14785a(Object obj) {
            C3211dh.c cVar = (C3211dh.c) obj;
            C3393kh c3393khM16004a = m16004a(cVar);
            C2885Qi c2885Qi = cVar.f23275a;
            c3393khM16004a.m16333c(c2885Qi.m14894t());
            c3393khM16004a.m16331b(c2885Qi.m14893s());
            String str = ((b) cVar.f23276b).f24139d;
            if (str != null) {
                C3393kh.m16312a(c3393khM16004a, str);
                C3393kh.m16313b(c3393khM16004a, ((b) cVar.f23276b).f24140e);
            }
            Map<String, String> map = ((b) cVar.f23276b).f24141f;
            c3393khM16004a.m16328a(map);
            c3393khM16004a.m16326a(this.f24144d.m13875a(new C2845P3.a(map, EnumC2567E0.APP)));
            c3393khM16004a.m16329a(((b) cVar.f23276b).f24142g);
            c3393khM16004a.m16327a(((b) cVar.f23276b).f24143h);
            c3393khM16004a.m16332b(cVar.f23275a.m14892r());
            c3393khM16004a.m16334h(cVar.f23275a.m14881g());
            c3393khM16004a.m16330b(cVar.f23275a.m14890p());
            return c3393khM16004a;
        }

        public c(Context context, String str, C3039Wn c3039Wn, C2866Q c2866q) {
            super(context, str, c3039Wn);
            this.f24144d = c2866q;
        }

        @Override // com.yandex.metrica.impl.p022ob.C3211dh.b
        /* renamed from: a */
        public C3211dh mo15421a() {
            return new C3393kh();
        }
    }

    public /* synthetic */ C3393kh(a aVar) {
        this();
    }

    /* renamed from: C */
    public C2845P3.a m16314C() {
        return this.f24132t;
    }

    /* renamed from: D */
    public Map<String, String> m16315D() {
        return this.f24131s;
    }

    /* renamed from: E */
    public String m16316E() {
        return this.f24136x;
    }

    /* renamed from: F */
    public String m16317F() {
        return this.f24129q;
    }

    /* renamed from: G */
    public String m16318G() {
        return this.f24130r;
    }

    /* renamed from: H */
    public List<String> m16319H() {
        return this.f24133u;
    }

    /* renamed from: I */
    public C2982Ug m16320I() {
        return this.f24138z;
    }

    /* renamed from: J */
    public List<String> m16321J() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (!C2968U2.m15249b(this.f24127o)) {
            linkedHashSet.addAll(this.f24127o);
        }
        if (!C2968U2.m15249b(this.f24128p)) {
            linkedHashSet.addAll(this.f24128p);
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

    /* renamed from: K */
    public List<String> m16322K() {
        return this.f24128p;
    }

    /* renamed from: L */
    public boolean m16323L() {
        return this.f24134v;
    }

    /* renamed from: M */
    public boolean m16324M() {
        return this.f24135w;
    }

    /* renamed from: a */
    public long m16325a(long j) {
        if (this.f24137y == 0) {
            this.f24137y = j;
        }
        return this.f24137y;
    }

    /* renamed from: b */
    public void m16332b(boolean z) {
        this.f24135w = z;
    }

    /* renamed from: c */
    public void m16333c(List<String> list) {
        this.f24127o = list;
    }

    /* renamed from: h */
    public void m16334h(String str) {
        this.f24136x = str;
    }

    @Override // com.yandex.metrica.impl.p022ob.C3289gh
    public String toString() {
        return "StartupRequestConfig{mStartupHostsFromStartup=" + this.f24127o + ", mStartupHostsFromClient=" + this.f24128p + ", mDistributionReferrer='" + this.f24129q + "', mInstallReferrerSource='" + this.f24130r + "', mClidsFromClient=" + this.f24131s + ", mNewCustomHosts=" + this.f24133u + ", mHasNewCustomHosts=" + this.f24134v + ", mSuccessfulStartup=" + this.f24135w + ", mCountryInit='" + this.f24136x + "', mFirstStartupTime=" + this.f24137y + ", mReferrerHolder=" + this.f24138z + "} " + super.toString();
    }

    private C3393kh() {
        this(C2842P0.m14728i().m14744o());
    }

    /* renamed from: b */
    public void m16330b(long j) {
        if (this.f24137y == 0) {
            this.f24137y = j;
        }
    }

    public C3393kh(C2982Ug c2982Ug) {
        this.f24132t = new C2845P3.a(null, EnumC2567E0.APP);
        this.f24137y = 0L;
        this.f24138z = c2982Ug;
    }

    /* renamed from: a */
    public void m16328a(Map<String, String> map) {
        this.f24131s = map;
    }

    /* renamed from: b */
    public void m16331b(List<String> list) {
        this.f24128p = list;
    }

    /* renamed from: b */
    public static void m16313b(C3393kh c3393kh, String str) {
        c3393kh.f24130r = str;
    }

    /* renamed from: a */
    public void m16326a(C2845P3.a aVar) {
        this.f24132t = aVar;
    }

    /* renamed from: a */
    public static void m16312a(C3393kh c3393kh, String str) {
        c3393kh.f24129q = str;
    }

    /* renamed from: a */
    public void m16327a(List<String> list) {
        this.f24133u = list;
    }

    /* renamed from: a */
    public void m16329a(boolean z) {
        this.f24134v = z;
    }
}
