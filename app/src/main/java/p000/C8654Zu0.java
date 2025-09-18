package p000;

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
public final class C8654Zu0 extends AbstractC1392W7 implements InterfaceC11047sY0 {

    /* renamed from: i */
    public static final C6989v4 f15208i = C6989v4.m25319d();

    /* renamed from: a */
    public final List f15209a;

    /* renamed from: b */
    public final GaugeManager f15210b;

    /* renamed from: c */
    public final C8619Zc1 f15211c;

    /* renamed from: d */
    public final C8498Wu0 f15212d;

    /* renamed from: e */
    public final WeakReference f15213e;

    /* renamed from: f */
    public String f15214f;

    /* renamed from: g */
    public boolean f15215g;

    /* renamed from: h */
    public boolean f15216h;

    /* JADX WARN: Illegal instructions before constructor call */
    public C8654Zu0(C8619Zc1 c8619Zc1) {
        C1329V7 c1329v7M8297a = C1329V7.m8297a();
        GaugeManager gaugeManager = GaugeManager.getInstance();
        super(c1329v7M8297a);
        this.f15212d = C8602Yu0.m9398b0();
        this.f15213e = new WeakReference(this);
        this.f15211c = c8619Zc1;
        this.f15210b = gaugeManager;
        this.f15209a = Collections.synchronizedList(new ArrayList());
        registerForAppState();
    }

    /* renamed from: c */
    public static C8654Zu0 m9626c(C8619Zc1 c8619Zc1) {
        return new C8654Zu0(c8619Zc1);
    }

    @Override // p000.InterfaceC11047sY0
    /* renamed from: a */
    public final void mo9627a(JA0 ja0) {
        if (ja0 == null) {
            f15208i.m25324f();
            return;
        }
        C8498Wu0 c8498Wu0 = this.f15212d;
        if (!((C8602Yu0) c8498Wu0.f40483b).m9415T() || ((C8602Yu0) c8498Wu0.f40483b).m9421Z()) {
            return;
        }
        this.f15209a.add(ja0);
    }

    /* renamed from: b */
    public final void m9628b() {
        List listUnmodifiableList;
        SessionManager.getInstance().unregisterForSessionUpdates(this.f15213e);
        unregisterForAppState();
        synchronized (this.f15209a) {
            try {
                ArrayList arrayList = new ArrayList();
                for (JA0 ja0 : this.f15209a) {
                    if (ja0 != null) {
                        arrayList.add(ja0);
                    }
                }
                listUnmodifiableList = Collections.unmodifiableList(arrayList);
            } catch (Throwable th) {
                throw th;
            }
        }
        IA0[] ia0ArrM4241b = JA0.m4241b(listUnmodifiableList);
        if (ia0ArrM4241b != null) {
            C8498Wu0 c8498Wu0 = this.f15212d;
            List listAsList = Arrays.asList(ia0ArrM4241b);
            c8498Wu0.m23922n();
            C8602Yu0.m9393E((C8602Yu0) c8498Wu0.f40483b, listAsList);
        }
        C8602Yu0 c8602Yu0 = (C8602Yu0) this.f15212d.m23920l();
        String str = this.f15214f;
        if (str == null) {
            Pattern pattern = AbstractC8784av0.f16674a;
        } else if (AbstractC8784av0.f16674a.matcher(str).matches()) {
            f15208i.m25320a();
            return;
        }
        if (this.f15215g) {
            if (this.f15216h) {
                f15208i.m25320a();
            }
        } else {
            C8619Zc1 c8619Zc1 = this.f15211c;
            c8619Zc1.f15037i.execute(new RunnableC8176Qp0(c8619Zc1, c8602Yu0, getAppState(), 15));
            this.f15215g = true;
        }
    }

    /* renamed from: d */
    public final void m9629d(String str) {
        int i = 8;
        if (str != null) {
            String upperCase = str.toUpperCase();
            upperCase.getClass();
            switch (upperCase) {
                case "OPTIONS":
                    break;
                case "GET":
                    i = 2;
                    break;
                case "PUT":
                    i = 3;
                    break;
                case "HEAD":
                    i = 6;
                    break;
                case "POST":
                    i = 4;
                    break;
                case "PATCH":
                    i = 7;
                    break;
                case "TRACE":
                    i = 9;
                    break;
                case "CONNECT":
                    i = 10;
                    break;
                case "DELETE":
                    i = 5;
                    break;
                default:
                    i = 1;
                    break;
            }
            C8498Wu0 c8498Wu0 = this.f15212d;
            c8498Wu0.m23922n();
            C8602Yu0.m9394F((C8602Yu0) c8498Wu0.f40483b, i);
        }
    }

    /* renamed from: e */
    public final void m9630e(int i) {
        C8498Wu0 c8498Wu0 = this.f15212d;
        c8498Wu0.m23922n();
        C8602Yu0.m9401w((C8602Yu0) c8498Wu0.f40483b, i);
    }

    /* renamed from: f */
    public final void m9631f(long j) {
        C8498Wu0 c8498Wu0 = this.f15212d;
        c8498Wu0.m23922n();
        C8602Yu0.m9395G((C8602Yu0) c8498Wu0.f40483b, j);
    }

    /* renamed from: g */
    public final void m9632g(long j) {
        JA0 ja0PerfSession = SessionManager.getInstance().perfSession();
        SessionManager.getInstance().registerForSessionUpdates(this.f15213e);
        C8498Wu0 c8498Wu0 = this.f15212d;
        c8498Wu0.m23922n();
        C8602Yu0.m9404z((C8602Yu0) c8498Wu0.f40483b, j);
        mo9627a(ja0PerfSession);
        if (ja0PerfSession.f5370c) {
            this.f15210b.collectGaugeMetricOnce(ja0PerfSession.f5369b);
        }
    }

    /* renamed from: h */
    public final void m9633h(String str) {
        C8498Wu0 c8498Wu0 = this.f15212d;
        if (str == null) {
            c8498Wu0.m23922n();
            C8602Yu0.m9403y((C8602Yu0) c8498Wu0.f40483b);
            return;
        }
        if (str.length() <= 128) {
            for (int i = 0; i < str.length(); i++) {
                char cCharAt = str.charAt(i);
                if (cCharAt > 31 && cCharAt <= 127) {
                }
            }
            c8498Wu0.m23922n();
            C8602Yu0.m9402x((C8602Yu0) c8498Wu0.f40483b, str);
            return;
        }
        "The content type of the response is not a valid content-type:".concat(str);
        f15208i.m25324f();
    }

    /* renamed from: i */
    public final void m9634i(long j) {
        C8498Wu0 c8498Wu0 = this.f15212d;
        c8498Wu0.m23922n();
        C8602Yu0.m9396H((C8602Yu0) c8498Wu0.f40483b, j);
    }

    /* renamed from: j */
    public final void m9635j(long j) {
        C8498Wu0 c8498Wu0 = this.f15212d;
        c8498Wu0.m23922n();
        C8602Yu0.m9391C((C8602Yu0) c8498Wu0.f40483b, j);
        if (SessionManager.getInstance().perfSession().f5370c) {
            this.f15210b.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().f5369b);
        }
    }

    /* renamed from: k */
    public final void m9636k(String str) {
        D40 d40M970c;
        int iLastIndexOf;
        if (str != null) {
            D40 d40M970c2 = null;
            try {
                C40 c40 = new C40();
                c40.m973f(null, str);
                d40M970c = c40.m970c();
            } catch (IllegalArgumentException unused) {
                d40M970c = null;
            }
            if (d40M970c != null) {
                C40 c40M1533f = d40M970c.m1533f();
                c40M1533f.f1170b = C7356Av0.m381v("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 251);
                c40M1533f.f1171c = C7356Av0.m381v("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 251);
                c40M1533f.f1175g = null;
                c40M1533f.f1176h = null;
                str = c40M1533f.toString();
            }
            if (str.length() > 2000) {
                if (str.charAt(2000) == '/') {
                    str = str.substring(0, 2000);
                } else {
                    try {
                        C40 c402 = new C40();
                        c402.m973f(null, str);
                        d40M970c2 = c402.m970c();
                    } catch (IllegalArgumentException unused2) {
                    }
                    str = (d40M970c2 != null && d40M970c2.m1529b().lastIndexOf(47) >= 0 && (iLastIndexOf = str.lastIndexOf(47, 1999)) >= 0) ? str.substring(0, iLastIndexOf) : str.substring(0, 2000);
                }
            }
            C8498Wu0 c8498Wu0 = this.f15212d;
            c8498Wu0.m23922n();
            C8602Yu0.m9399u((C8602Yu0) c8498Wu0.f40483b, str);
        }
    }
}
