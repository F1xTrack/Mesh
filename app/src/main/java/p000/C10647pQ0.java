package p000;

import android.content.Context;
import android.provider.Settings;
import com.facebook.react.bridge.ReactApplicationContext;

/* renamed from: pQ0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10647pQ0 {

    /* renamed from: l */
    public static final Object f40061l = new Object();

    /* renamed from: a */
    public final String f40062a;

    /* renamed from: b */
    public final ReactApplicationContext f40063b;

    /* renamed from: c */
    public String f40064c;

    /* renamed from: d */
    public String f40065d;

    /* renamed from: e */
    public String f40066e;

    /* renamed from: f */
    public String f40067f;

    /* renamed from: g */
    public String f40068g;

    /* renamed from: h */
    public int f40069h;

    /* renamed from: i */
    public InterfaceC0689Kw f40070i;

    /* renamed from: j */
    public InterfaceC10775qQ0 f40071j;

    /* renamed from: k */
    public YZ1 f40072k;

    public C10647pQ0(ReactApplicationContext reactApplicationContext, String str) {
        O90.m5968f(str, "appId");
        this.f40062a = str;
        this.f40063b = reactApplicationContext;
        this.f40070i = new C10212m12(25);
        this.f40071j = new C7983Mw1();
        int i = C6547oM.f38966d;
        this.f40072k = new C8419Vg1(AbstractC9313f02.m18152e(15L, EnumC6738rM.f41612e));
    }

    /* renamed from: a */
    public final void m23775a() {
        synchronized (f40061l) {
            try {
                Context applicationContext = this.f40063b.getApplicationContext();
                O90.m5967e(applicationContext, "context.applicationContext");
                String str = this.f40062a;
                String string = this.f40067f;
                if (string == null) {
                    string = Settings.Secure.getString(this.f40063b.getContentResolver(), "android_id");
                    O90.m5967e(string, "getString(context.conten…olver, Secure.ANDROID_ID)");
                }
                AbstractC1665aS.m9743a(applicationContext, str, new C4218i3(string, this.f40064c, this.f40065d, this.f40066e, this.f40068g, this.f40069h), this.f40072k, this.f40070i, this.f40071j);
                C1848cS c1848cS = C1848cS.f17479N;
                if (c1848cS == null) {
                    throw new C11923zQ0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    public final void m23776b(String str) {
        synchronized (f40061l) {
            this.f40065d = str;
        }
    }

    /* renamed from: c */
    public final void m23777c(String str) {
        synchronized (f40061l) {
            this.f40066e = str;
        }
    }

    /* renamed from: d */
    public final void m23778d(String str) {
        synchronized (f40061l) {
            this.f40068g = str;
        }
    }

    /* renamed from: e */
    public final void m23779e(String str) {
        synchronized (f40061l) {
            this.f40067f = str;
        }
    }

    /* renamed from: f */
    public final void m23780f(int i) {
        synchronized (f40061l) {
            this.f40069h = i;
        }
    }

    /* renamed from: g */
    public final void m23781g(String str) {
        synchronized (f40061l) {
            this.f40064c = str;
        }
    }

    /* renamed from: h */
    public final void m23782h(DQ0 dq0) {
        synchronized (f40061l) {
            this.f40071j = dq0;
        }
    }

    /* renamed from: i */
    public final void m23783i(YZ1 yz1) {
        synchronized (f40061l) {
            this.f40072k = yz1;
        }
    }
}
