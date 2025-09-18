package com.yandex.metrica.impl.p022ob;

import java.util.Locale;

/* renamed from: com.yandex.metrica.impl.ob.zo */
/* loaded from: classes2.dex */
public abstract class AbstractC3790zo {

    /* renamed from: a */
    private volatile boolean f25465a;

    public AbstractC3790zo(boolean z) {
        this.f25465a = false;
        this.f25465a = z;
    }

    /* renamed from: a */
    public abstract String mo13872a();

    /* renamed from: a */
    public void m17362a(String str) {
        m17361a(6, str);
    }

    /* renamed from: b */
    public abstract String mo14371b();

    /* renamed from: b */
    public void m17366b(String str) {
        m17361a(4, str);
    }

    /* renamed from: c */
    public boolean m17370c() {
        return this.f25465a;
    }

    /* renamed from: d */
    public void m17371d() {
        this.f25465a = false;
    }

    /* renamed from: e */
    public void m17372e() {
        this.f25465a = true;
    }

    /* renamed from: f */
    public boolean mo17197f() {
        return this.f25465a;
    }

    /* renamed from: d */
    private String m17360d(String str, Object[] objArr) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(mo13872a());
            if (str == null) {
                str = "";
            }
            sb.append(String.format(Locale.US, str, objArr));
            return sb.toString();
        } catch (Throwable unused) {
            return mo13872a();
        }
    }

    /* renamed from: a */
    public void m17365a(Throwable th, String str, Object... objArr) {
        mo14371b();
        m17360d(str, objArr);
    }

    /* renamed from: b */
    public void m17367b(String str, Object... objArr) {
        mo14371b();
        m17360d(str, objArr);
    }

    /* renamed from: c */
    public void m17368c(String str) {
        m17361a(5, str);
    }

    /* renamed from: a */
    public void m17361a(int i, String str) {
        if (mo17197f()) {
            mo14371b();
            mo13872a();
        }
    }

    /* renamed from: c */
    public void m17369c(String str, Object... objArr) {
        if (mo17197f()) {
            mo14371b();
            m17360d(str, objArr);
        }
    }

    /* renamed from: a */
    public void m17363a(String str, Object... objArr) {
        if (mo17197f()) {
            mo14371b();
            m17360d(str, objArr);
        }
    }

    /* renamed from: a */
    public void m17364a(Throwable th, String str) {
        if (this.f25465a) {
            StringBuilder sb = new StringBuilder();
            sb.append(mo13872a());
            if (str == null) {
                str = "";
            }
            sb.append(str);
        }
    }
}
