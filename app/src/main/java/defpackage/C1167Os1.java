package defpackage;

import android.content.Context;
import java.util.HashMap;

/* renamed from: Os1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1167Os1 implements InterfaceC6180o {
    public static final HashMap h = new HashMap();
    public static final Object i = new Object();
    public final Context a;
    public final String b;
    public volatile C2192ak1 c;
    public final Object d = new Object();
    public C5798m e = C5798m.b;
    public final HashMap f = new HashMap();
    public volatile X11 g;

    public C1167Os1(Context context, String str) {
        this.a = context;
        this.b = str;
    }

    public static C1167Os1 c(Context context) {
        C1167Os1 c1167Os1;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        String packageName = context.getPackageName();
        synchronized (i) {
            try {
                HashMap map = h;
                c1167Os1 = (C1167Os1) map.get(packageName);
                if (c1167Os1 == null) {
                    c1167Os1 = new C1167Os1(context, packageName);
                    map.put(packageName, c1167Os1);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1167Os1;
    }

    @Override // defpackage.InterfaceC6180o
    public final C5798m a() {
        if (this.e == C5798m.b && this.c == null) {
            b();
        }
        return this.e;
    }

    public final void b() {
        if (this.c == null) {
            synchronized (this.d) {
                try {
                    if (this.c == null) {
                        this.c = new C2192ak1(this.a, this.b);
                        this.g = new X11(this.c);
                    }
                    if (this.e == C5798m.b && this.c != null) {
                        this.e = AbstractC6756r02.c(this.c.getString("/region", null), this.c.getString("/agcgw/url", null));
                    }
                } finally {
                }
            }
        }
    }

    @Override // defpackage.InterfaceC6180o
    public final Context getContext() {
        return this.a;
    }

    @Override // defpackage.InterfaceC6180o
    public final String getIdentifier() {
        return "DEFAULT_INSTANCE";
    }

    @Override // defpackage.InterfaceC6180o
    public final String getString(String str) {
        C4233hr1 c4233hr1;
        if (this.c == null) {
            b();
        }
        int i2 = 0;
        if (str.length() > 0) {
            while (str.charAt(i2) == '/') {
                i2++;
            }
        }
        String str2 = "/" + str.substring(i2);
        String str3 = (String) this.f.get(str2);
        if (str3 != null) {
            return str3;
        }
        HashMap map = AbstractC8016xc0.a;
        String strA = (map.containsKey(str2) && (c4233hr1 = (C4233hr1) map.get(str2)) != null) ? c4233hr1.a(this) : null;
        if (strA != null) {
            return strA;
        }
        String string = this.c.getString(str2, null);
        return X11.b(string) ? this.g.o(string) : string;
    }
}
