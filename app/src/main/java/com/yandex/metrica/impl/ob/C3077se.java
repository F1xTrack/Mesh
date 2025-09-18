package com.yandex.metrica.impl.ob;

import android.content.Context;
import java.util.Map;

@Deprecated
/* renamed from: com.yandex.metrica.impl.ob.se, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3077se extends AbstractC3052re {
    private static final C3232ye l = new C3232ye("UUID", null);
    private static final C3232ye m = new C3232ye("DEVICEID_3", null);
    private static final C3232ye n = new C3232ye("AD_URL_GET", null);
    private static final C3232ye o = new C3232ye("AD_URL_REPORT", null);
    private static final C3232ye p = new C3232ye("HOST_URL", null);
    private static final C3232ye q = new C3232ye("SERVER_TIME_OFFSET", null);
    private static final C3232ye r = new C3232ye("CLIDS", null);
    private C3232ye f;
    private C3232ye g;
    private C3232ye h;
    private C3232ye i;
    private C3232ye j;
    private C3232ye k;

    public C3077se(Context context) {
        super(context, null);
        this.f = new C3232ye(l.b());
        this.g = new C3232ye(m.b());
        this.h = new C3232ye(n.b());
        this.i = new C3232ye(o.b());
        new C3232ye(p.b());
        this.j = new C3232ye(q.b());
        this.k = new C3232ye(r.b());
    }

    public long a(long j) {
        return this.b.getLong(this.j.b(), j);
    }

    public String b(String str) {
        return this.b.getString(this.h.a(), null);
    }

    public String c(String str) {
        return this.b.getString(this.i.a(), null);
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC3052re
    public String d() {
        return "_startupinfopreferences";
    }

    public String e(String str) {
        return this.b.getString(this.g.a(), null);
    }

    public String f(String str) {
        return this.b.getString(this.f.a(), null);
    }

    public Map<String, ?> g() {
        return this.b.getAll();
    }

    public String d(String str) {
        return this.b.getString(this.k.a(), null);
    }

    public C3077se f() {
        return (C3077se) e();
    }
}
