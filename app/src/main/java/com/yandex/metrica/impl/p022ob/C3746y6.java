package com.yandex.metrica.impl.p022ob;

import android.text.TextUtils;
import com.yandex.metrica.impl.p022ob.C3762ym;
import io.appmetrica.analytics.impl.C4931Xj;

/* renamed from: com.yandex.metrica.impl.ob.y6 */
/* loaded from: classes2.dex */
public class C3746y6 implements InterfaceC3720x6 {

    /* renamed from: a */
    private final String f25296a;

    /* renamed from: b */
    protected final C2626G9 f25297b;

    /* renamed from: c */
    private C3762ym.a f25298c;

    public C3746y6(C2626G9 c2626g9, String str) {
        this.f25297b = c2626g9;
        this.f25296a = str;
        C3762ym.a aVar = new C3762ym.a();
        try {
            String strM14173f = c2626g9.m14173f(str);
            if (!TextUtils.isEmpty(strM14173f)) {
                aVar = new C3762ym.a(strM14173f);
            }
        } catch (Throwable unused) {
        }
        this.f25298c = aVar;
    }

    /* renamed from: a */
    public C3746y6 m17216a(long j) {
        m17215a(C4931Xj.f31058h, Long.valueOf(j));
        return this;
    }

    /* renamed from: b */
    public C3746y6 m17219b(long j) {
        m17215a(C4931Xj.f31055e, Long.valueOf(j));
        return this;
    }

    /* renamed from: c */
    public Long m17222c() {
        return this.f25298c.m17308a(C4931Xj.f31058h);
    }

    /* renamed from: d */
    public C3746y6 m17223d(long j) {
        m17215a(C4931Xj.f31056f, Long.valueOf(j));
        return this;
    }

    /* renamed from: e */
    public Long m17226e() {
        return this.f25298c.m17308a(C4931Xj.f31057g);
    }

    /* renamed from: f */
    public Long m17227f() {
        return this.f25298c.m17308a(C4931Xj.f31056f);
    }

    /* renamed from: g */
    public Long m17228g() {
        return this.f25298c.m17308a(C4931Xj.f31054d);
    }

    /* renamed from: h */
    public boolean m17229h() {
        return this.f25298c.length() > 0;
    }

    /* renamed from: i */
    public Boolean m17230i() {
        C3762ym.a aVar = this.f25298c;
        aVar.getClass();
        try {
            return Boolean.valueOf(aVar.getBoolean(C4931Xj.f31059i));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public C3746y6 m17217a(boolean z) {
        m17215a(C4931Xj.f31059i, Boolean.valueOf(z));
        return this;
    }

    /* renamed from: b */
    public void m17220b() {
        this.f25297b.m14168c(this.f25296a, this.f25298c.toString());
        this.f25297b.m14258c();
    }

    /* renamed from: c */
    public C3746y6 m17221c(long j) {
        m17215a(C4931Xj.f31057g, Long.valueOf(j));
        return this;
    }

    /* renamed from: d */
    public Long m17224d() {
        return this.f25298c.m17308a(C4931Xj.f31055e);
    }

    /* renamed from: e */
    public C3746y6 m17225e(long j) {
        m17215a(C4931Xj.f31054d, Long.valueOf(j));
        return this;
    }

    /* renamed from: a */
    private void m17215a(String str, Object obj) {
        try {
            this.f25298c.put(str, obj);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public void m17218a() {
        this.f25298c = new C3762ym.a();
        m17220b();
    }
}
