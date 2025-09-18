package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.A;
import io.appmetrica.analytics.impl.C4743ne;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public class G9 extends H9 {
    private static final C3232ye c = new C3232ye("IDENTITY_SEND_TIME", null);
    private static final C3232ye d = new C3232ye("PERMISSIONS_CHECK_TIME", null);
    private static final C3232ye e = new C3232ye("USER_INFO", null);
    private static final C3232ye f = new C3232ye("PROFILE_ID", null);
    private static final C3232ye g = new C3232ye("APP_ENVIRONMENT", null);
    private static final C3232ye h = new C3232ye("APP_ENVIRONMENT_REVISION", null);
    private static final C3232ye i = new C3232ye("LAST_MIGRATION_VERSION", null);
    private static final C3232ye j = new C3232ye("LAST_APP_VERSION_WITH_FEATURES", null);
    private static final C3232ye k = new C3232ye("APPLICATION_FEATURES", null);
    private static final C3232ye l = new C3232ye("LAST_STAT_SENDING_DISABLED_REPORTING_TIMESTAMP", null);
    private static final C3232ye m = new C3232ye("CERTIFICATES_SHA1_FINGERPRINTS", null);
    static final C3232ye n = new C3232ye("DEPRECATED_NATIVE_CRASHES_CHECKED", null);
    private static final C3232ye o = new C3232ye("REFERRER_HANDLED", null);

    public G9(InterfaceC3251z8 interfaceC3251z8) {
        super(interfaceC3251z8);
    }

    public G9 a(A.a aVar) {
        synchronized (this) {
            b(g.a(), aVar.a);
            b(h.a(), aVar.b);
        }
        return this;
    }

    public long b(long j2) {
        return a(c.a(), j2);
    }

    public G9 c(long j2) {
        return (G9) b(c.a(), j2);
    }

    public G9 d(long j2) {
        return (G9) b(l.a(), j2);
    }

    public A.a e() {
        A.a aVar;
        synchronized (this) {
            aVar = new A.a(a(g.a(), "{}"), a(h.a(), 0L));
        }
        return aVar;
    }

    public String f() {
        return a(k.a(), "");
    }

    public G9 g(String str) {
        return (G9) b(k.a(), str);
    }

    public int h() {
        return a(j.a(), -1);
    }

    public G9 i(String str) {
        return (G9) b(e.a(), str);
    }

    public long j() {
        return a(l.a(), 0L);
    }

    public long k() {
        return a(d.a(), 0L);
    }

    public String l() {
        return d(f.a());
    }

    public String m() {
        return a(e.a(), (String) null);
    }

    public boolean n() {
        return a(n.a(), false);
    }

    public G9 o() {
        return (G9) b(n.a(), true);
    }

    @Deprecated
    public G9 p() {
        return (G9) b(o.a(), true);
    }

    @Deprecated
    public G9 q() {
        return (G9) e(i.a());
    }

    @Deprecated
    public G9 r() {
        return (G9) e(o.a());
    }

    @Deprecated
    public Boolean s() {
        C3232ye c3232ye = o;
        if (b(c3232ye.a())) {
            return Boolean.valueOf(a(c3232ye.a(), false));
        }
        return null;
    }

    public G9 c(String str, String str2) {
        return (G9) b(new C3232ye(C4743ne.q, str).a(), str2);
    }

    public String f(String str) {
        return a(new C3232ye(C4743ne.q, str).a(), "");
    }

    public List<String> g() {
        return a(m.a(), Collections.emptyList());
    }

    public G9 h(String str) {
        return (G9) b(f.a(), str);
    }

    @Deprecated
    public Integer i() {
        C3232ye c3232ye = i;
        if (b(c3232ye.a())) {
            return Integer.valueOf((int) a(c3232ye.a(), 0L));
        }
        return null;
    }

    public G9 a(int i2) {
        return (G9) b(j.a(), i2);
    }

    public G9 a(List<String> list) {
        return (G9) b(m.a(), list);
    }

    public G9 e(long j2) {
        return (G9) b(d.a(), j2);
    }
}
