package defpackage;

import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: Zu0 */
/* loaded from: classes.dex */
public final class C2030Zu0 extends W7 implements InterfaceC7051sY0 {
    public static final C7533v4 i = C7533v4.d();
    public final List a;
    public final GaugeManager b;
    public final C1977Zc1 c;
    public final C1796Wu0 d;
    public final WeakReference e;
    public String f;
    public boolean g;
    public boolean h;

    /* JADX WARN: Illegal instructions before constructor call */
    public C2030Zu0(C1977Zc1 c1977Zc1) {
        V7 v7A = V7.a();
        GaugeManager gaugeManager = GaugeManager.getInstance();
        super(v7A);
        this.d = C1952Yu0.b0();
        this.e = new WeakReference(this);
        this.c = c1977Zc1;
        this.b = gaugeManager;
        this.a = Collections.synchronizedList(new ArrayList());
        registerForAppState();
    }

    public static C2030Zu0 c(C1977Zc1 c1977Zc1) {
        return new C2030Zu0(c1977Zc1);
    }

    @Override // defpackage.InterfaceC7051sY0
    public final void a(JA0 ja0) {
        if (ja0 == null) {
            i.f();
            return;
        }
        C1796Wu0 c1796Wu0 = this.d;
        if (!((C1952Yu0) c1796Wu0.b).T() || ((C1952Yu0) c1796Wu0.b).Z()) {
            return;
        }
        this.a.add(ja0);
    }

    public final void b() {
        List listUnmodifiableList;
        SessionManager.getInstance().unregisterForSessionUpdates(this.e);
        unregisterForAppState();
        synchronized (this.a) {
            try {
                ArrayList arrayList = new ArrayList();
                for (JA0 ja0 : this.a) {
                    if (ja0 != null) {
                        arrayList.add(ja0);
                    }
                }
                listUnmodifiableList = Collections.unmodifiableList(arrayList);
            } catch (Throwable th) {
                throw th;
            }
        }
        IA0[] ia0ArrB = JA0.b(listUnmodifiableList);
        if (ia0ArrB != null) {
            C1796Wu0 c1796Wu0 = this.d;
            List listAsList = Arrays.asList(ia0ArrB);
            c1796Wu0.n();
            C1952Yu0.E((C1952Yu0) c1796Wu0.b, listAsList);
        }
        C1952Yu0 c1952Yu0 = (C1952Yu0) this.d.l();
        String str = this.f;
        if (str == null) {
            Pattern pattern = AbstractC2224av0.a;
        } else if (AbstractC2224av0.a.matcher(str).matches()) {
            i.a();
            return;
        }
        if (this.g) {
            if (this.h) {
                i.a();
            }
        } else {
            C1977Zc1 c1977Zc1 = this.c;
            c1977Zc1.i.execute(new RunnableC1313Qp0(c1977Zc1, c1952Yu0, getAppState(), 15));
            this.g = true;
        }
    }

    public final void d(String str) {
        int i2 = 8;
        if (str != null) {
            String upperCase = str.toUpperCase();
            upperCase.getClass();
            switch (upperCase) {
                case "OPTIONS":
                    break;
                case "GET":
                    i2 = 2;
                    break;
                case "PUT":
                    i2 = 3;
                    break;
                case "HEAD":
                    i2 = 6;
                    break;
                case "POST":
                    i2 = 4;
                    break;
                case "PATCH":
                    i2 = 7;
                    break;
                case "TRACE":
                    i2 = 9;
                    break;
                case "CONNECT":
                    i2 = 10;
                    break;
                case "DELETE":
                    i2 = 5;
                    break;
                default:
                    i2 = 1;
                    break;
            }
            C1796Wu0 c1796Wu0 = this.d;
            c1796Wu0.n();
            C1952Yu0.F((C1952Yu0) c1796Wu0.b, i2);
        }
    }

    public final void e(int i2) {
        C1796Wu0 c1796Wu0 = this.d;
        c1796Wu0.n();
        C1952Yu0.w((C1952Yu0) c1796Wu0.b, i2);
    }

    public final void f(long j) {
        C1796Wu0 c1796Wu0 = this.d;
        c1796Wu0.n();
        C1952Yu0.G((C1952Yu0) c1796Wu0.b, j);
    }

    public final void g(long j) {
        JA0 ja0PerfSession = SessionManager.getInstance().perfSession();
        SessionManager.getInstance().registerForSessionUpdates(this.e);
        C1796Wu0 c1796Wu0 = this.d;
        c1796Wu0.n();
        C1952Yu0.z((C1952Yu0) c1796Wu0.b, j);
        a(ja0PerfSession);
        if (ja0PerfSession.c) {
            this.b.collectGaugeMetricOnce(ja0PerfSession.b);
        }
    }

    public final void h(String str) {
        C1796Wu0 c1796Wu0 = this.d;
        if (str == null) {
            c1796Wu0.n();
            C1952Yu0.y((C1952Yu0) c1796Wu0.b);
            return;
        }
        if (str.length() <= 128) {
            for (int i2 = 0; i2 < str.length(); i2++) {
                char cCharAt = str.charAt(i2);
                if (cCharAt > 31 && cCharAt <= 127) {
                }
            }
            c1796Wu0.n();
            C1952Yu0.x((C1952Yu0) c1796Wu0.b, str);
            return;
        }
        "The content type of the response is not a valid content-type:".concat(str);
        i.f();
    }

    public final void i(long j) {
        C1796Wu0 c1796Wu0 = this.d;
        c1796Wu0.n();
        C1952Yu0.H((C1952Yu0) c1796Wu0.b, j);
    }

    public final void j(long j) {
        C1796Wu0 c1796Wu0 = this.d;
        c1796Wu0.n();
        C1952Yu0.C((C1952Yu0) c1796Wu0.b, j);
        if (SessionManager.getInstance().perfSession().c) {
            this.b.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().b);
        }
    }

    public final void k(String str) {
        D40 d40C;
        int iLastIndexOf;
        if (str != null) {
            D40 d40C2 = null;
            try {
                C40 c40 = new C40();
                c40.f(null, str);
                d40C = c40.c();
            } catch (IllegalArgumentException unused) {
                d40C = null;
            }
            if (d40C != null) {
                C40 c40F = d40C.f();
                c40F.b = C0084Av0.v("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 251);
                c40F.c = C0084Av0.v("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 251);
                c40F.g = null;
                c40F.h = null;
                str = c40F.toString();
            }
            if (str.length() > 2000) {
                if (str.charAt(2000) == '/') {
                    str = str.substring(0, 2000);
                } else {
                    try {
                        C40 c402 = new C40();
                        c402.f(null, str);
                        d40C2 = c402.c();
                    } catch (IllegalArgumentException unused2) {
                    }
                    str = (d40C2 != null && d40C2.b().lastIndexOf(47) >= 0 && (iLastIndexOf = str.lastIndexOf(47, 1999)) >= 0) ? str.substring(0, iLastIndexOf) : str.substring(0, 2000);
                }
            }
            C1796Wu0 c1796Wu0 = this.d;
            c1796Wu0.n();
            C1952Yu0.u((C1952Yu0) c1796Wu0.b, str);
        }
    }
}
