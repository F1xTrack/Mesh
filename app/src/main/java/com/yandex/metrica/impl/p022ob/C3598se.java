package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import java.util.Map;

@Deprecated
/* renamed from: com.yandex.metrica.impl.ob.se */
/* loaded from: classes2.dex */
public class C3598se extends AbstractC3572re {

    /* renamed from: l */
    private static final C3754ye f24668l = new C3754ye("UUID", null);

    /* renamed from: m */
    private static final C3754ye f24669m = new C3754ye("DEVICEID_3", null);

    /* renamed from: n */
    private static final C3754ye f24670n = new C3754ye("AD_URL_GET", null);

    /* renamed from: o */
    private static final C3754ye f24671o = new C3754ye("AD_URL_REPORT", null);

    /* renamed from: p */
    private static final C3754ye f24672p = new C3754ye("HOST_URL", null);

    /* renamed from: q */
    private static final C3754ye f24673q = new C3754ye("SERVER_TIME_OFFSET", null);

    /* renamed from: r */
    private static final C3754ye f24674r = new C3754ye("CLIDS", null);

    /* renamed from: f */
    private C3754ye f24675f;

    /* renamed from: g */
    private C3754ye f24676g;

    /* renamed from: h */
    private C3754ye f24677h;

    /* renamed from: i */
    private C3754ye f24678i;

    /* renamed from: j */
    private C3754ye f24679j;

    /* renamed from: k */
    private C3754ye f24680k;

    public C3598se(Context context) {
        super(context, null);
        this.f24675f = new C3754ye(f24668l.m17236b());
        this.f24676g = new C3754ye(f24669m.m17236b());
        this.f24677h = new C3754ye(f24670n.m17236b());
        this.f24678i = new C3754ye(f24671o.m17236b());
        new C3754ye(f24672p.m17236b());
        this.f24679j = new C3754ye(f24673q.m17236b());
        this.f24680k = new C3754ye(f24674r.m17236b());
    }

    /* renamed from: a */
    public long m16725a(long j) {
        return this.f24614b.getLong(this.f24679j.m17236b(), j);
    }

    /* renamed from: b */
    public String m16726b(String str) {
        return this.f24614b.getString(this.f24677h.m17234a(), null);
    }

    /* renamed from: c */
    public String m16727c(String str) {
        return this.f24614b.getString(this.f24678i.m17234a(), null);
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC3572re
    /* renamed from: d */
    public String mo16612d() {
        return "_startupinfopreferences";
    }

    /* renamed from: e */
    public String m16729e(String str) {
        return this.f24614b.getString(this.f24676g.m17234a(), null);
    }

    /* renamed from: f */
    public String m16731f(String str) {
        return this.f24614b.getString(this.f24675f.m17234a(), null);
    }

    /* renamed from: g */
    public Map<String, ?> m16732g() {
        return this.f24614b.getAll();
    }

    /* renamed from: d */
    public String m16728d(String str) {
        return this.f24614b.getString(this.f24680k.m17234a(), null);
    }

    /* renamed from: f */
    public C3598se m16730f() {
        return (C3598se) m16692e();
    }
}
