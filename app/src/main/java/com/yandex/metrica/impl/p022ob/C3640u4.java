package com.yandex.metrica.impl.p022ob;

import android.text.TextUtils;
import com.yandex.metrica.impl.p022ob.C3276g4;

/* renamed from: com.yandex.metrica.impl.ob.u4 */
/* loaded from: classes2.dex */
public class C3640u4 {

    /* renamed from: a */
    private final C2626G9 f24883a;

    /* renamed from: b */
    private final C2675I8 f24884b;

    /* renamed from: c */
    private C3668v6 f24885c;

    /* renamed from: d */
    private C3618t8 f24886d;

    /* renamed from: e */
    private final C3425ln f24887e;

    /* renamed from: f */
    private final C2466A f24888f;

    /* renamed from: g */
    private final C3328i4 f24889g;

    /* renamed from: h */
    private a f24890h;

    /* renamed from: i */
    private final InterfaceC2839Om f24891i;

    /* renamed from: j */
    private final int f24892j;

    /* renamed from: k */
    private long f24893k;

    /* renamed from: l */
    private long f24894l;

    /* renamed from: m */
    private int f24895m;

    /* renamed from: com.yandex.metrica.impl.ob.u4$a */
    public interface a {
    }

    public C3640u4(C2626G9 c2626g9, C2675I8 c2675i8, C3668v6 c3668v6, C3618t8 c3618t8, C2466A c2466a, C3425ln c3425ln, int i, a aVar, C3328i4 c3328i4, InterfaceC2839Om interfaceC2839Om) {
        this.f24883a = c2626g9;
        this.f24884b = c2675i8;
        this.f24885c = c3668v6;
        this.f24886d = c3618t8;
        this.f24888f = c2466a;
        this.f24887e = c3425ln;
        this.f24892j = i;
        this.f24889g = c3328i4;
        this.f24891i = interfaceC2839Om;
        this.f24890h = aVar;
        this.f24893k = c2626g9.m14166b(0L);
        this.f24894l = c2626g9.m14181k();
        this.f24895m = c2626g9.m14176h();
    }

    /* renamed from: a */
    public void m16890a(C3376k0 c3376k0) {
        this.f24885c.m16954c(c3376k0);
    }

    /* renamed from: b */
    public void m16893b(C3376k0 c3376k0) {
        m16891a(c3376k0, this.f24885c.m16953b(c3376k0));
    }

    /* renamed from: c */
    public void m16894c(C3376k0 c3376k0) {
        m16891a(c3376k0, this.f24885c.m16953b(c3376k0));
        int i = this.f24892j;
        this.f24895m = i;
        this.f24883a.m14163a(i).m14258c();
    }

    /* renamed from: d */
    public void m16896d(C3376k0 c3376k0) {
        m16891a(c3376k0, this.f24885c.m16953b(c3376k0));
        long jMo14675b = this.f24891i.mo14675b();
        this.f24893k = jMo14675b;
        this.f24883a.m14167c(jMo14675b).m14258c();
    }

    /* renamed from: e */
    public void m16898e(C3376k0 c3376k0) {
        m16891a(c3376k0, this.f24885c.m16953b(c3376k0));
        long jMo14675b = this.f24891i.mo14675b();
        this.f24894l = jMo14675b;
        this.f24883a.m14171e(jMo14675b).m14258c();
    }

    /* renamed from: f */
    public void m16899f(C3376k0 c3376k0) {
        m16891a(c3376k0, this.f24885c.m16956f(c3376k0));
    }

    /* renamed from: a */
    public void m16891a(C3376k0 c3376k0, C3694w6 c3694w6) {
        if (TextUtils.isEmpty(c3376k0.m16245o())) {
            c3376k0.mo15102e(this.f24883a.m14183m());
        }
        c3376k0.mo15101d(this.f24883a.m14182l());
        c3376k0.m16226a(Integer.valueOf(this.f24884b.m14295g()));
        this.f24886d.m16836a(this.f24887e.m16421a(c3376k0).mo15949a(c3376k0), c3376k0.m16244n(), c3694w6, this.f24888f.m13835a(), this.f24889g);
        ((C3276g4.a) this.f24890h).f23479a.m16423g();
    }

    /* renamed from: b */
    public void m16892b() {
        int i = this.f24892j;
        this.f24895m = i;
        this.f24883a.m14163a(i).m14258c();
    }

    /* renamed from: c */
    public boolean m16895c() {
        return this.f24895m < this.f24892j;
    }

    /* renamed from: d */
    public boolean m16897d() {
        return this.f24891i.mo14675b() - this.f24893k > C3590s6.f24651a;
    }

    /* renamed from: a */
    public long m16889a() {
        return this.f24894l;
    }
}
