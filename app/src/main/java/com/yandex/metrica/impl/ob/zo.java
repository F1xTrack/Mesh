package com.yandex.metrica.impl.ob;

import java.util.Locale;

/* loaded from: classes2.dex */
public abstract class zo {
    private volatile boolean a;

    public zo(boolean z) {
        this.a = false;
        this.a = z;
    }

    public abstract String a();

    public void a(String str) {
        a(6, str);
    }

    public abstract String b();

    public void b(String str) {
        a(4, str);
    }

    public boolean c() {
        return this.a;
    }

    public void d() {
        this.a = false;
    }

    public void e() {
        this.a = true;
    }

    public boolean f() {
        return this.a;
    }

    private String d(String str, Object[] objArr) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(a());
            if (str == null) {
                str = "";
            }
            sb.append(String.format(Locale.US, str, objArr));
            return sb.toString();
        } catch (Throwable unused) {
            return a();
        }
    }

    public void a(Throwable th, String str, Object... objArr) {
        b();
        d(str, objArr);
    }

    public void b(String str, Object... objArr) {
        b();
        d(str, objArr);
    }

    public void c(String str) {
        a(5, str);
    }

    public void a(int i, String str) {
        if (f()) {
            b();
            a();
        }
    }

    public void c(String str, Object... objArr) {
        if (f()) {
            b();
            d(str, objArr);
        }
    }

    public void a(String str, Object... objArr) {
        if (f()) {
            b();
            d(str, objArr);
        }
    }

    public void a(Throwable th, String str) {
        if (this.a) {
            StringBuilder sb = new StringBuilder();
            sb.append(a());
            if (str == null) {
                str = "";
            }
            sb.append(str);
        }
    }
}
