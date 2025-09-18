package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class O80 extends Y02 {
    public final String a;
    public C6363ox0 b;
    public InterfaceC0214Cm1 c;
    public final Handler d = new Handler(Looper.getMainLooper());
    public boolean e;
    public final /* synthetic */ P80 f;

    public O80(P80 p80, String str) {
        this.f = p80;
        this.a = str;
    }

    @Override // defpackage.Y02
    public final void d(int i, String str) {
        this.c = null;
        this.f.a();
        k();
    }

    @Override // defpackage.Y02
    public final void f(Exception exc) {
        if (this.c != null) {
            AbstractC3393dS.h("InspectorPackagerConnection");
            this.f.a();
            InterfaceC0214Cm1 interfaceC0214Cm1 = this.c;
            if (interfaceC0214Cm1 != null) {
                try {
                    ((MN0) interfaceC0214Cm1).b(1000, "End of session");
                } catch (Exception unused) {
                }
                this.c = null;
            }
        }
        k();
    }

    @Override // defpackage.Y02
    public final void h(String str) {
        try {
            this.f.b(new JSONObject(str));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override // defpackage.Y02
    public final void i(InterfaceC0214Cm1 interfaceC0214Cm1, HS0 hs0) {
        this.c = interfaceC0214Cm1;
    }

    public final void j() {
        if (this.b == null) {
            C6172nx0 c6172nx0 = new C6172nx0();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            c6172nx0.a(10L, timeUnit);
            c6172nx0.d(10L, timeUnit);
            c6172nx0.b(0L, TimeUnit.MINUTES);
            this.b = new C6363ox0(c6172nx0);
        }
        C7375uF c7375uF = new C7375uF(9, false);
        c7375uF.G(this.a);
        this.b.c(c7375uF.o(), this);
    }

    public final void k() {
        if (!this.e) {
            AbstractC3393dS.p("InspectorPackagerConnection");
            this.e = true;
        }
        this.d.postDelayed(new GR0(26, this), 2000L);
    }
}
