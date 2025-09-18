package io.appmetrica.analytics.impl;

import android.text.TextUtils;

/* loaded from: classes2.dex */
public final class Xj {
    public static final String d = "SESSION_SLEEP_START";
    public static final String e = "SESSION_LAST_EVENT_OFFSET";
    public static final String f = "SESSION_ID";
    public static final String g = "SESSION_COUNTER_ID";
    public static final String h = "SESSION_INIT_TIME";
    public static final String i = "SESSION_IS_ALIVE_REPORT_NEEDED";
    public final String a;
    protected final C4743ne b;
    public C4425ab c;

    public Xj(C4743ne c4743ne, String str) {
        this.b = c4743ne;
        this.a = str;
        C4425ab c4425ab = new C4425ab();
        try {
            String strH = c4743ne.h(str);
            if (!TextUtils.isEmpty(strH)) {
                c4425ab = new C4425ab(strH);
            }
        } catch (Throwable unused) {
        }
        this.c = c4425ab;
    }

    public final Xj a(long j) {
        a(h, Long.valueOf(j));
        return this;
    }

    public final Xj b(long j) {
        a(e, Long.valueOf(j));
        return this;
    }

    public final Long c() {
        return this.c.a(h);
    }

    public final Xj d(long j) {
        a(f, Long.valueOf(j));
        return this;
    }

    public final Long e() {
        return this.c.a(g);
    }

    public final Long f() {
        return this.c.a(f);
    }

    public final Long g() {
        return this.c.a(d);
    }

    public final boolean h() {
        return this.c.length() > 0;
    }

    public final Boolean i() {
        C4425ab c4425ab = this.c;
        c4425ab.getClass();
        try {
            return Boolean.valueOf(c4425ab.getBoolean(i));
        } catch (Throwable unused) {
            return null;
        }
    }

    public final Xj a(boolean z) {
        a(i, Boolean.valueOf(z));
        return this;
    }

    public final void b() {
        this.b.e(this.a, this.c.toString());
        this.b.b();
    }

    public final Xj c(long j) {
        a(g, Long.valueOf(j));
        return this;
    }

    public final Long d() {
        return this.c.a(e);
    }

    public final Xj e(long j) {
        a(d, Long.valueOf(j));
        return this;
    }

    public final void a(String str, Object obj) {
        try {
            this.c.put(str, obj);
        } catch (Throwable unused) {
        }
    }

    public final void a() {
        this.c = new C4425ab();
        b();
    }
}
