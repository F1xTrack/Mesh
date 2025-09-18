package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.impl.ob.A;

@Deprecated
/* renamed from: com.yandex.metrica.impl.ob.te, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3102te extends AbstractC3052re {
    private C3232ye f;
    private C3232ye g;
    private C3232ye h;
    private C3232ye i;
    private C3232ye j;
    private C3232ye k;
    private C3232ye l;
    private C3232ye m;
    private C3232ye n;
    private C3232ye o;
    private C3232ye p;
    private C3232ye q;
    private C3232ye r;
    private C3232ye s;
    private C3232ye t;
    private static final C3232ye u = new C3232ye("SESSION_SLEEP_START_", null);
    private static final C3232ye v = new C3232ye("SESSION_ID_", null);
    private static final C3232ye w = new C3232ye("SESSION_COUNTER_ID_", null);
    private static final C3232ye x = new C3232ye("SESSION_INIT_TIME_", null);
    private static final C3232ye y = new C3232ye("SESSION_ALIVE_TIME_", null);
    private static final C3232ye z = new C3232ye("SESSION_IS_ALIVE_REPORT_NEEDED_", null);
    private static final C3232ye A = new C3232ye("BG_SESSION_ID_", null);
    private static final C3232ye B = new C3232ye("BG_SESSION_SLEEP_START_", null);
    private static final C3232ye C = new C3232ye("BG_SESSION_COUNTER_ID_", null);
    private static final C3232ye D = new C3232ye("BG_SESSION_INIT_TIME_", null);
    private static final C3232ye E = new C3232ye("IDENTITY_SEND_TIME_", null);
    private static final C3232ye F = new C3232ye("USER_INFO_", null);
    private static final C3232ye G = new C3232ye("REFERRER_", null);

    @Deprecated
    public static final C3232ye H = new C3232ye("APP_ENVIRONMENT", null);

    @Deprecated
    public static final C3232ye I = new C3232ye("APP_ENVIRONMENT_REVISION", null);
    private static final C3232ye J = new C3232ye("APP_ENVIRONMENT_", null);
    private static final C3232ye K = new C3232ye("APP_ENVIRONMENT_REVISION_", null);

    public C3102te(Context context, String str) {
        super(context, str);
        this.f = new C3232ye(u.b(), c());
        this.g = new C3232ye(v.b(), c());
        this.h = new C3232ye(w.b(), c());
        this.i = new C3232ye(x.b(), c());
        this.j = new C3232ye(y.b(), c());
        this.k = new C3232ye(z.b(), c());
        this.l = new C3232ye(A.b(), c());
        this.m = new C3232ye(B.b(), c());
        this.n = new C3232ye(C.b(), c());
        this.o = new C3232ye(D.b(), c());
        this.p = new C3232ye(E.b(), c());
        this.q = new C3232ye(F.b(), c());
        this.r = new C3232ye(G.b(), c());
        this.s = new C3232ye(J.b(), c());
        this.t = new C3232ye(K.b(), c());
        a(-1);
        c(0);
        b(0);
    }

    public long a(long j) {
        return this.b.getLong(this.o.a(), j);
    }

    public long b(long j) {
        return this.b.getLong(this.n.a(), j);
    }

    public long c(long j) {
        return this.b.getLong(this.l.a(), j);
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC3052re
    public String d() {
        return "_boundentrypreferences";
    }

    public long e(long j) {
        return this.b.getLong(this.i.a(), j);
    }

    public long f(long j) {
        return this.b.getLong(this.h.a(), j);
    }

    public long g(long j) {
        return this.b.getLong(this.g.a(), j);
    }

    public long h(long j) {
        return this.b.getLong(this.f.a(), j);
    }

    public long i(long j) {
        return this.b.getLong(this.p.a(), j);
    }

    public long d(long j) {
        return this.b.getLong(this.m.a(), j);
    }

    private void c(int i) {
        C2814i.a(this.b, this.f.a(), i);
    }

    public Boolean a(boolean z2) {
        return Boolean.valueOf(this.b.getBoolean(this.k.a(), z2));
    }

    public String b(String str) {
        return this.b.getString(this.q.a(), null);
    }

    public A.a f() {
        synchronized (this) {
            try {
                if (!this.b.contains(this.s.a()) || !this.b.contains(this.t.a())) {
                    return null;
                }
                return new A.a(this.b.getString(this.s.a(), "{}"), this.b.getLong(this.t.a(), 0L));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean g() {
        return this.b.contains(this.i.a()) || this.b.contains(this.j.a()) || this.b.contains(this.k.a()) || this.b.contains(this.f.a()) || this.b.contains(this.g.a()) || this.b.contains(this.h.a()) || this.b.contains(this.o.a()) || this.b.contains(this.m.a()) || this.b.contains(this.l.a()) || this.b.contains(this.n.a()) || this.b.contains(this.s.a()) || this.b.contains(this.q.a()) || this.b.contains(this.r.a()) || this.b.contains(this.p.a());
    }

    public void h() {
        this.b.edit().remove(this.o.a()).remove(this.n.a()).remove(this.l.a()).remove(this.m.a()).remove(this.i.a()).remove(this.h.a()).remove(this.g.a()).remove(this.f.a()).remove(this.k.a()).remove(this.j.a()).remove(this.q.a()).remove(this.s.a()).remove(this.t.a()).remove(this.r.a()).remove(this.p.a()).apply();
    }

    public C3102te i() {
        return (C3102te) a(this.r.a());
    }

    private void b(int i) {
        C2814i.a(this.b, this.h.a(), i);
    }

    public C3102te a(A.a aVar) {
        synchronized (this) {
            a(this.s.a(), aVar.a);
            a(this.t.a(), Long.valueOf(aVar.b));
        }
        return this;
    }

    private void a(int i) {
        C2814i.a(this.b, this.j.a(), i);
    }
}
