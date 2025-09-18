package p000;

import java.util.Locale;

/* renamed from: v4 */
/* loaded from: classes.dex */
public final class C6989v4 {

    /* renamed from: c */
    public static volatile C6989v4 f44131c;

    /* renamed from: a */
    public final C10689pl0 f44132a;

    /* renamed from: b */
    public boolean f44133b = false;

    public C6989v4() {
        C10689pl0 c10689pl0;
        synchronized (C10689pl0.class) {
            try {
                if (C10689pl0.f40365b == null) {
                    C10689pl0.f40365b = new C10689pl0(0);
                }
                c10689pl0 = C10689pl0.f40365b;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f44132a = c10689pl0;
    }

    /* renamed from: d */
    public static C6989v4 m25319d() {
        if (f44131c == null) {
            synchronized (C6989v4.class) {
                try {
                    if (f44131c == null) {
                        f44131c = new C6989v4();
                    }
                } finally {
                }
            }
        }
        return f44131c;
    }

    /* renamed from: a */
    public final void m25320a() {
        if (this.f44133b) {
            this.f44132a.getClass();
        }
    }

    /* renamed from: b */
    public final void m25321b(String str, Object... objArr) {
        if (this.f44133b) {
            String.format(Locale.ENGLISH, str, objArr);
            this.f44132a.getClass();
        }
    }

    /* renamed from: c */
    public final void m25322c(String str, Object... objArr) {
        if (this.f44133b) {
            String.format(Locale.ENGLISH, str, objArr);
            this.f44132a.getClass();
        }
    }

    /* renamed from: e */
    public final void m25323e(String str, Object... objArr) {
        if (this.f44133b) {
            String.format(Locale.ENGLISH, str, objArr);
            this.f44132a.getClass();
        }
    }

    /* renamed from: f */
    public final void m25324f() {
        if (this.f44133b) {
            this.f44132a.getClass();
        }
    }

    /* renamed from: g */
    public final void m25325g(String str, Object... objArr) {
        if (this.f44133b) {
            String.format(Locale.ENGLISH, str, objArr);
            this.f44132a.getClass();
        }
    }
}
