package p000;

import android.content.Context;
import java.util.HashMap;

/* renamed from: Os1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8079Os1 implements InterfaceC6524o {

    /* renamed from: h */
    public static final HashMap f8645h = new HashMap();

    /* renamed from: i */
    public static final Object f8646i = new Object();

    /* renamed from: a */
    public final Context f8647a;

    /* renamed from: b */
    public final String f8648b;

    /* renamed from: c */
    public volatile C8763ak1 f8649c;

    /* renamed from: d */
    public final Object f8650d = new Object();

    /* renamed from: e */
    public C6398m f8651e = C6398m.f37371b;

    /* renamed from: f */
    public final HashMap f8652f = new HashMap();

    /* renamed from: g */
    public volatile X11 f8653g;

    public C8079Os1(Context context, String str) {
        this.f8647a = context;
        this.f8648b = str;
    }

    /* renamed from: c */
    public static C8079Os1 m6176c(Context context) {
        C8079Os1 c8079Os1;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        String packageName = context.getPackageName();
        synchronized (f8646i) {
            try {
                HashMap map = f8645h;
                c8079Os1 = (C8079Os1) map.get(packageName);
                if (c8079Os1 == null) {
                    c8079Os1 = new C8079Os1(context, packageName);
                    map.put(packageName, c8079Os1);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c8079Os1;
    }

    @Override // p000.InterfaceC6524o
    /* renamed from: a */
    public final C6398m mo6177a() {
        if (this.f8651e == C6398m.f37371b && this.f8649c == null) {
            m6178b();
        }
        return this.f8651e;
    }

    /* renamed from: b */
    public final void m6178b() {
        if (this.f8649c == null) {
            synchronized (this.f8650d) {
                try {
                    if (this.f8649c == null) {
                        this.f8649c = new C8763ak1(this.f8647a, this.f8648b);
                        this.f8653g = new X11(this.f8649c);
                    }
                    if (this.f8651e == C6398m.f37371b && this.f8649c != null) {
                        this.f8651e = AbstractC10849r02.m24145c(this.f8649c.getString("/region", null), this.f8649c.getString("/agcgw/url", null));
                    }
                } finally {
                }
            }
        }
    }

    @Override // p000.InterfaceC6524o
    public final Context getContext() {
        return this.f8647a;
    }

    @Override // p000.InterfaceC6524o
    public final String getIdentifier() {
        return "DEFAULT_INSTANCE";
    }

    @Override // p000.InterfaceC6524o
    public final String getString(String str) {
        C9678hr1 c9678hr1;
        if (this.f8649c == null) {
            m6178b();
        }
        int i = 0;
        if (str.length() > 0) {
            while (str.charAt(i) == '/') {
                i++;
            }
        }
        String str2 = "/" + str.substring(i);
        String str3 = (String) this.f8652f.get(str2);
        if (str3 != null) {
            return str3;
        }
        HashMap map = AbstractC11693xc0.f45710a;
        String strM18883a = (map.containsKey(str2) && (c9678hr1 = (C9678hr1) map.get(str2)) != null) ? c9678hr1.m18883a(this) : null;
        if (strM18883a != null) {
            return strM18883a;
        }
        String string = this.f8649c.getString(str2, null);
        return X11.m8910b(string) ? this.f8653g.m8920o(string) : string;
    }
}
