package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import com.yandex.metrica.impl.ob.C3240ym;

/* renamed from: com.yandex.metrica.impl.ob.y6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3224y6 implements InterfaceC3199x6 {
    private final String a;
    protected final G9 b;
    private C3240ym.a c;

    public C3224y6(G9 g9, String str) {
        this.b = g9;
        this.a = str;
        C3240ym.a aVar = new C3240ym.a();
        try {
            String strF = g9.f(str);
            if (!TextUtils.isEmpty(strF)) {
                aVar = new C3240ym.a(strF);
            }
        } catch (Throwable unused) {
        }
        this.c = aVar;
    }

    public C3224y6 a(long j) {
        a(io.appmetrica.analytics.impl.Xj.h, Long.valueOf(j));
        return this;
    }

    public C3224y6 b(long j) {
        a(io.appmetrica.analytics.impl.Xj.e, Long.valueOf(j));
        return this;
    }

    public Long c() {
        return this.c.a(io.appmetrica.analytics.impl.Xj.h);
    }

    public C3224y6 d(long j) {
        a(io.appmetrica.analytics.impl.Xj.f, Long.valueOf(j));
        return this;
    }

    public Long e() {
        return this.c.a(io.appmetrica.analytics.impl.Xj.g);
    }

    public Long f() {
        return this.c.a(io.appmetrica.analytics.impl.Xj.f);
    }

    public Long g() {
        return this.c.a(io.appmetrica.analytics.impl.Xj.d);
    }

    public boolean h() {
        return this.c.length() > 0;
    }

    public Boolean i() {
        C3240ym.a aVar = this.c;
        aVar.getClass();
        try {
            return Boolean.valueOf(aVar.getBoolean(io.appmetrica.analytics.impl.Xj.i));
        } catch (Throwable unused) {
            return null;
        }
    }

    public C3224y6 a(boolean z) {
        a(io.appmetrica.analytics.impl.Xj.i, Boolean.valueOf(z));
        return this;
    }

    public void b() {
        this.b.c(this.a, this.c.toString());
        this.b.c();
    }

    public C3224y6 c(long j) {
        a(io.appmetrica.analytics.impl.Xj.g, Long.valueOf(j));
        return this;
    }

    public Long d() {
        return this.c.a(io.appmetrica.analytics.impl.Xj.e);
    }

    public C3224y6 e(long j) {
        a(io.appmetrica.analytics.impl.Xj.d, Long.valueOf(j));
        return this;
    }

    private void a(String str, Object obj) {
        try {
            this.c.put(str, obj);
        } catch (Throwable unused) {
        }
    }

    public void a() {
        this.c = new C3240ym.a();
        b();
    }
}
