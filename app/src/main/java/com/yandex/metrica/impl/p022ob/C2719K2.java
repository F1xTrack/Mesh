package com.yandex.metrica.impl.p022ob;

import android.net.Uri;
import com.yandex.metrica.impl.p022ob.AbstractC2942T1;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.K2 */
/* loaded from: classes2.dex */
public class C2719K2 extends AbstractC3042X1<C3575rh, C3681vj> {

    /* renamed from: o */
    private final C2934Si f21568o;

    /* renamed from: p */
    private C3681vj f21569p;

    /* renamed from: q */
    private EnumC2660Hi f21570q;

    /* renamed from: r */
    private final C3393kh f21571r;

    public C2719K2(C2934Si c2934Si, C3393kh c3393kh) {
        this(c2934Si, c3393kh, new C3575rh(new C3341ih()), new C2694J2());
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC2942T1
    /* renamed from: a */
    public void mo14458a(Uri.Builder builder) {
        ((C3575rh) this.f22346j).m16695a(builder, this.f21571r);
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC2942T1
    /* renamed from: b */
    public void mo14460b(Throwable th) {
        this.f21570q = EnumC2660Hi.NETWORK;
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC2942T1
    /* renamed from: j */
    public C2535Ci mo14461j() {
        return this.f21571r.m15794r();
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC2942T1
    /* renamed from: o */
    public boolean mo14462o() {
        m15144a("Accept-Encoding", "encrypted");
        return this.f21568o.m15136d();
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC2942T1
    /* renamed from: r */
    public boolean mo14463r() {
        C3681vj c3681vjM15409B = m15409B();
        this.f21569p = c3681vjM15409B;
        boolean z = c3681vjM15409B != null;
        if (!z) {
            this.f21570q = EnumC2660Hi.PARSE;
        }
        return z;
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC2942T1
    /* renamed from: s */
    public void mo14464s() {
        super.mo14464s();
        this.f21570q = EnumC2660Hi.NETWORK;
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC2942T1
    /* renamed from: t */
    public void mo14465t() {
        Map<String, List<String>> map;
        C3681vj c3681vj = this.f21569p;
        if (c3681vj == null || (map = this.f22343g) == null) {
            return;
        }
        this.f21568o.m15132a(c3681vj, this.f21571r, map);
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC2942T1
    /* renamed from: y */
    public void mo14466y() {
        if (this.f21570q == null) {
            this.f21570q = EnumC2660Hi.UNKNOWN;
        }
        this.f21568o.m15130a(this.f21570q);
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC2942T1
    /* renamed from: z */
    public boolean mo14467z() {
        return true;
    }

    public C2719K2(C2934Si c2934Si, C3393kh c3393kh, C3575rh c3575rh, C2694J2 c2694j2) {
        super(c2694j2, c3575rh);
        this.f21568o = c2934Si;
        this.f21571r = c3393kh;
        m15146a(c3393kh.m16321J());
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC2942T1
    /* renamed from: a */
    public String mo14457a() {
        return "Startup task for component: " + this.f21568o.m15129a().toString();
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC2942T1
    /* renamed from: b */
    public AbstractC2942T1.a mo14459b() {
        return AbstractC2942T1.a.STARTUP;
    }
}
