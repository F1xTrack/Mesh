package defpackage;

import java.util.Locale;

/* renamed from: v4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7533v4 {
    public static volatile C7533v4 c;
    public final C6518pl0 a;
    public boolean b = false;

    public C7533v4() {
        C6518pl0 c6518pl0;
        synchronized (C6518pl0.class) {
            try {
                if (C6518pl0.b == null) {
                    C6518pl0.b = new C6518pl0(0);
                }
                c6518pl0 = C6518pl0.b;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.a = c6518pl0;
    }

    public static C7533v4 d() {
        if (c == null) {
            synchronized (C7533v4.class) {
                try {
                    if (c == null) {
                        c = new C7533v4();
                    }
                } finally {
                }
            }
        }
        return c;
    }

    public final void a() {
        if (this.b) {
            this.a.getClass();
        }
    }

    public final void b(String str, Object... objArr) {
        if (this.b) {
            String.format(Locale.ENGLISH, str, objArr);
            this.a.getClass();
        }
    }

    public final void c(String str, Object... objArr) {
        if (this.b) {
            String.format(Locale.ENGLISH, str, objArr);
            this.a.getClass();
        }
    }

    public final void e(String str, Object... objArr) {
        if (this.b) {
            String.format(Locale.ENGLISH, str, objArr);
            this.a.getClass();
        }
    }

    public final void f() {
        if (this.b) {
            this.a.getClass();
        }
    }

    public final void g(String str, Object... objArr) {
        if (this.b) {
            String.format(Locale.ENGLISH, str, objArr);
            this.a.getClass();
        }
    }
}
