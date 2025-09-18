package io.appmetrica.analytics.impl;

import android.text.TextUtils;

/* renamed from: io.appmetrica.analytics.impl.Xj */
/* loaded from: classes2.dex */
public final class C4931Xj {

    /* renamed from: d */
    public static final String f31054d = "SESSION_SLEEP_START";

    /* renamed from: e */
    public static final String f31055e = "SESSION_LAST_EVENT_OFFSET";

    /* renamed from: f */
    public static final String f31056f = "SESSION_ID";

    /* renamed from: g */
    public static final String f31057g = "SESSION_COUNTER_ID";

    /* renamed from: h */
    public static final String f31058h = "SESSION_INIT_TIME";

    /* renamed from: i */
    public static final String f31059i = "SESSION_IS_ALIVE_REPORT_NEEDED";

    /* renamed from: a */
    public final String f31060a;

    /* renamed from: b */
    protected final C5323ne f31061b;

    /* renamed from: c */
    public C4995ab f31062c;

    public C4931Xj(C5323ne c5323ne, String str) {
        this.f31061b = c5323ne;
        this.f31060a = str;
        C4995ab c4995ab = new C4995ab();
        try {
            String strM20830h = c5323ne.m20830h(str);
            if (!TextUtils.isEmpty(strM20830h)) {
                c4995ab = new C4995ab(strM20830h);
            }
        } catch (Throwable unused) {
        }
        this.f31062c = c4995ab;
    }

    /* renamed from: a */
    public final C4931Xj m19983a(long j) {
        m19986a(f31058h, Long.valueOf(j));
        return this;
    }

    /* renamed from: b */
    public final C4931Xj m19987b(long j) {
        m19986a(f31055e, Long.valueOf(j));
        return this;
    }

    /* renamed from: c */
    public final Long m19990c() {
        return this.f31062c.m20118a(f31058h);
    }

    /* renamed from: d */
    public final C4931Xj m19991d(long j) {
        m19986a(f31056f, Long.valueOf(j));
        return this;
    }

    /* renamed from: e */
    public final Long m19994e() {
        return this.f31062c.m20118a(f31057g);
    }

    /* renamed from: f */
    public final Long m19995f() {
        return this.f31062c.m20118a(f31056f);
    }

    /* renamed from: g */
    public final Long m19996g() {
        return this.f31062c.m20118a(f31054d);
    }

    /* renamed from: h */
    public final boolean m19997h() {
        return this.f31062c.length() > 0;
    }

    /* renamed from: i */
    public final Boolean m19998i() {
        C4995ab c4995ab = this.f31062c;
        c4995ab.getClass();
        try {
            return Boolean.valueOf(c4995ab.getBoolean(f31059i));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final C4931Xj m19984a(boolean z) {
        m19986a(f31059i, Boolean.valueOf(z));
        return this;
    }

    /* renamed from: b */
    public final void m19988b() {
        this.f31061b.m20825e(this.f31060a, this.f31062c.toString());
        this.f31061b.m20875b();
    }

    /* renamed from: c */
    public final C4931Xj m19989c(long j) {
        m19986a(f31057g, Long.valueOf(j));
        return this;
    }

    /* renamed from: d */
    public final Long m19992d() {
        return this.f31062c.m20118a(f31055e);
    }

    /* renamed from: e */
    public final C4931Xj m19993e(long j) {
        m19986a(f31054d, Long.valueOf(j));
        return this;
    }

    /* renamed from: a */
    public final void m19986a(String str, Object obj) {
        try {
            this.f31062c.put(str, obj);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public final void m19985a() {
        this.f31062c = new C4995ab();
        m19988b();
    }
}
