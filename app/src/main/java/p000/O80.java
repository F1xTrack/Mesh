package p000;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class O80 extends Y02 {

    /* renamed from: a */
    public final String f8252a;

    /* renamed from: b */
    public C10585ox0 f8253b;

    /* renamed from: c */
    public InterfaceC7443Cm1 f8254c;

    /* renamed from: d */
    public final Handler f8255d = new Handler(Looper.getMainLooper());

    /* renamed from: e */
    public boolean f8256e;

    /* renamed from: f */
    public final /* synthetic */ P80 f8257f;

    public O80(P80 p80, String str) {
        this.f8257f = p80;
        this.f8252a = str;
    }

    @Override // p000.Y02
    /* renamed from: d */
    public final void mo2415d(int i, String str) {
        this.f8254c = null;
        this.f8257f.m6247a();
        m5961k();
    }

    @Override // p000.Y02
    /* renamed from: f */
    public final void mo2417f(Exception exc) {
        if (this.f8254c != null) {
            AbstractC3929dS.m17675h("InspectorPackagerConnection");
            this.f8257f.m6247a();
            InterfaceC7443Cm1 interfaceC7443Cm1 = this.f8254c;
            if (interfaceC7443Cm1 != null) {
                try {
                    ((MN0) interfaceC7443Cm1).m5350b(1000, "End of session");
                } catch (Exception unused) {
                }
                this.f8254c = null;
            }
        }
        m5961k();
    }

    @Override // p000.Y02
    /* renamed from: h */
    public final void mo2419h(String str) {
        try {
            this.f8257f.m6248b(new JSONObject(str));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override // p000.Y02
    /* renamed from: i */
    public final void mo2420i(InterfaceC7443Cm1 interfaceC7443Cm1, HS0 hs0) {
        this.f8254c = interfaceC7443Cm1;
    }

    /* renamed from: j */
    public final void m5960j() {
        if (this.f8253b == null) {
            C10457nx0 c10457nx0 = new C10457nx0();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            c10457nx0.m23286a(10L, timeUnit);
            c10457nx0.m23289d(10L, timeUnit);
            c10457nx0.m23287b(0L, TimeUnit.MINUTES);
            this.f8253b = new C10585ox0(c10457nx0);
        }
        C6937uF c6937uF = new C6937uF(9, false);
        c6937uF.m25136G(this.f8252a);
        this.f8253b.m23581c(c6937uF.m25141o(), this);
    }

    /* renamed from: k */
    public final void m5961k() {
        if (!this.f8256e) {
            AbstractC3929dS.m17683p("InspectorPackagerConnection");
            this.f8256e = true;
        }
        this.f8255d.postDelayed(new GR0(26, this), 2000L);
    }
}
