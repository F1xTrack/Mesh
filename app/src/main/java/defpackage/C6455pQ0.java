package defpackage;

import android.content.Context;
import android.provider.Settings;
import com.facebook.react.bridge.ReactApplicationContext;

/* renamed from: pQ0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6455pQ0 {
    public static final Object l = new Object();
    public final String a;
    public final ReactApplicationContext b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public int h;
    public InterfaceC0866Kw i;
    public InterfaceC6646qQ0 j;
    public YZ1 k;

    public C6455pQ0(ReactApplicationContext reactApplicationContext, String str) {
        O90.f(str, "appId");
        this.a = str;
        this.b = reactApplicationContext;
        this.i = new C5806m12(25);
        this.j = new C1023Mw1();
        int i = C6251oM.d;
        this.k = new C1677Vg1(AbstractC3689f02.e(15L, EnumC6823rM.e));
    }

    public final void a() {
        synchronized (l) {
            try {
                Context applicationContext = this.b.getApplicationContext();
                O90.e(applicationContext, "context.applicationContext");
                String str = this.a;
                String string = this.f;
                if (string == null) {
                    string = Settings.Secure.getString(this.b.getContentResolver(), "android_id");
                    O90.e(string, "getString(context.conten…olver, Secure.ANDROID_ID)");
                }
                AbstractC2136aS.a(applicationContext, str, new C4271i3(string, this.c, this.d, this.e, this.g, this.h), this.k, this.i, this.j);
                C2517cS c2517cS = C2517cS.N;
                if (c2517cS == null) {
                    throw new C8360zQ0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(String str) {
        synchronized (l) {
            this.d = str;
        }
    }

    public final void c(String str) {
        synchronized (l) {
            this.e = str;
        }
    }

    public final void d(String str) {
        synchronized (l) {
            this.g = str;
        }
    }

    public final void e(String str) {
        synchronized (l) {
            this.f = str;
        }
    }

    public final void f(int i) {
        synchronized (l) {
            this.h = i;
        }
    }

    public final void g(String str) {
        synchronized (l) {
            this.c = str;
        }
    }

    public final void h(DQ0 dq0) {
        synchronized (l) {
            this.j = dq0;
        }
    }

    public final void i(YZ1 yz1) {
        synchronized (l) {
            this.k = yz1;
        }
    }
}
