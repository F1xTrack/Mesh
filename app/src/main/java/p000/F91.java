package p000;

import android.net.Uri;
import android.util.Range;
import com.android.billingclient.api.BillingResult;
import java.text.BreakIterator;
import java.util.Collections;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract /* synthetic */ class F91 {
    /* renamed from: A */
    public static C10076ky1 m2511A(HashMap map, int i) {
        Collections.unmodifiableMap(new HashMap(map));
        return new C10076ky1(i);
    }

    /* renamed from: B */
    public static void m2512B(C6623pX c6623pX, InterfaceC8357Ub1 interfaceC8357Ub1) {
        interfaceC8357Ub1.mo965f(new C6686qX(c6623pX));
    }

    /* renamed from: C */
    public static /* synthetic */ void m2513C(YE1 ye1) {
        if (ye1 != null) {
            throw new ClassCastException();
        }
    }

    /* renamed from: D */
    public static /* synthetic */ void m2514D(NH1 nh1) {
        if (nh1 != null) {
            throw new ClassCastException();
        }
    }

    /* renamed from: E */
    public static int m2515E(int i, int i2, int i3) {
        return C9854jD1.m21992r(i) + i2 + i3;
    }

    /* renamed from: F */
    public static /* synthetic */ String m2516F(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "RELEASED" : "READY" : "PENDING_RELEASE" : "INITIALIZING" : "NOT_INITIALIZED";
    }

    /* renamed from: G */
    public static /* synthetic */ String m2517G(int i) {
        switch (i) {
            case 1:
                return "ENQUEUED";
            case 2:
                return "RUNNING";
            case 3:
                return "SUCCEEDED";
            case 4:
                return "FAILED";
            case 5:
                return "BLOCKED";
            case 6:
                return "CANCELLED";
            default:
                return "null";
        }
    }

    /* renamed from: a */
    public static Executor m2518a(C10351n60 c10351n60, ExecutorC8931c30 executorC8931c30) {
        C0480Hc c0480Hc = U91.f11663T0;
        c10351n60.getClass();
        return (Executor) AbstractC11153tN0.m24898j(c10351n60, c0480Hc, executorC8931c30);
    }

    /* renamed from: b */
    public static EnumC10170lh1 m2519b(InterfaceC9914jh1 interfaceC9914jh1) {
        return (EnumC10170lh1) interfaceC9914jh1.mo4794w(InterfaceC9914jh1.f35332c1);
    }

    /* renamed from: c */
    public static C11812yY0 m2520c(InterfaceC9914jh1 interfaceC9914jh1) {
        return (C11812yY0) interfaceC9914jh1.mo4794w(InterfaceC9914jh1.f35324U0);
    }

    /* renamed from: d */
    public static C11812yY0 m2521d(InterfaceC9914jh1 interfaceC9914jh1) {
        return (C11812yY0) interfaceC9914jh1.mo4792q(InterfaceC9914jh1.f35324U0, null);
    }

    /* renamed from: e */
    public static int m2522e(InterfaceC9914jh1 interfaceC9914jh1) {
        return ((Integer) interfaceC9914jh1.mo4792q(InterfaceC9914jh1.f35333d1, 0)).intValue();
    }

    /* renamed from: f */
    public static C6259jn m2523f(InterfaceC9914jh1 interfaceC9914jh1) {
        return (C6259jn) interfaceC9914jh1.mo4792q(InterfaceC9914jh1.f35326W0, null);
    }

    /* renamed from: g */
    public static int m2524g(InterfaceC9914jh1 interfaceC9914jh1) {
        return ((Integer) interfaceC9914jh1.mo4792q(InterfaceC9914jh1.f35328Y0, 0)).intValue();
    }

    /* renamed from: h */
    public static C9658hh1 m2525h(InterfaceC9914jh1 interfaceC9914jh1) {
        C9658hh1 c9658hh1 = (C9658hh1) interfaceC9914jh1.mo4792q(InterfaceC9914jh1.f35335f1, new C9658hh1());
        Objects.requireNonNull(c9658hh1);
        return c9658hh1;
    }

    /* renamed from: i */
    public static Range m2526i(InterfaceC9914jh1 interfaceC9914jh1, Range range) {
        return (Range) interfaceC9914jh1.mo4792q(InterfaceC9914jh1.f35329Z0, range);
    }

    /* renamed from: j */
    public static int m2527j(InterfaceC9914jh1 interfaceC9914jh1) {
        return ((Integer) interfaceC9914jh1.mo4792q(InterfaceC9914jh1.f35334e1, 0)).intValue();
    }

    /* renamed from: k */
    public static boolean m2528k(InterfaceC9914jh1 interfaceC9914jh1) {
        return ((Boolean) interfaceC9914jh1.mo4792q(InterfaceC9914jh1.f35331b1, Boolean.FALSE)).booleanValue();
    }

    /* renamed from: l */
    public static boolean m2529l(InterfaceC8889bj1 interfaceC8889bj1, int i, int i2) {
        return interfaceC8889bj1.mo10494K0(i, i2) || (interfaceC8889bj1.mo10496U() && interfaceC8889bj1.mo10494K0(i2, i));
    }

    /* renamed from: m */
    public static boolean m2530m(InterfaceC9914jh1 interfaceC9914jh1) {
        return ((Boolean) interfaceC9914jh1.mo4792q(InterfaceC9914jh1.f35330a1, Boolean.FALSE)).booleanValue();
    }

    /* renamed from: n */
    public static void m2531n(InterfaceC8357Ub1 interfaceC8357Ub1, C9591hA0 c9591hA0, int i) {
        interfaceC8357Ub1.mo961b(c9591hA0, i, 0);
    }

    /* renamed from: o */
    public static boolean m2532o(InterfaceC7331Ai1 interfaceC7331Ai1) {
        C1299Ue c1299Ue = C1299Ue.f11946g;
        if (C4018et.m18063c(c1299Ue) || AbstractC0783MR.m5367g(c1299Ue)) {
            return false;
        }
        return !interfaceC7331Ai1.mo294d().isEmpty();
    }

    /* renamed from: p */
    public static String m2533p(int i, String str) {
        if (str == null) {
            return null;
        }
        int iM26247x = AbstractC7222ym.m26247x(i);
        if (iM26247x == 1) {
            return str.toUpperCase();
        }
        if (iM26247x == 2) {
            return str.toLowerCase();
        }
        if (iM26247x != 3) {
            return str;
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance();
        wordInstance.setText(str);
        StringBuilder sb = new StringBuilder(str.length());
        int iFirst = wordInstance.first();
        while (true) {
            int i2 = iFirst;
            iFirst = wordInstance.next();
            if (iFirst == -1) {
                return sb.toString();
            }
            String strSubstring = str.substring(i2, iFirst);
            if (Character.isLetterOrDigit(strSubstring.charAt(0))) {
                sb.append(Character.toUpperCase(strSubstring.charAt(0)));
                sb.append(strSubstring.substring(1).toLowerCase());
            } else {
                sb.append(strSubstring);
            }
        }
    }

    /* renamed from: q */
    public static int m2534q(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            default:
                throw new IllegalArgumentException(AbstractC11153tN0.m24909u(i, "Unknown enum value: "));
        }
    }

    /* renamed from: r */
    public static final boolean m2535r(int i) {
        return i == 3 || i == 4 || i == 6;
    }

    /* renamed from: s */
    public static int m2536s(int i, int i2, int i3) {
        return WE1.m8717b(i) + i2 + i3;
    }

    /* renamed from: t */
    public static BillingResult m2537t(int i, String str) {
        BillingResult.Builder builderNewBuilder = BillingResult.newBuilder();
        builderNewBuilder.setResponseCode(i);
        builderNewBuilder.setDebugMessage(str);
        return builderNewBuilder.build();
    }

    /* renamed from: u */
    public static String m2538u(String str, Uri uri, String str2) {
        return str + uri + str2;
    }

    /* renamed from: v */
    public static String m2539v(StringBuilder sb, String str, char c) {
        sb.append(str);
        sb.append(c);
        return sb.toString();
    }

    /* renamed from: w */
    public static String m2540w(StringBuilder sb, boolean z, char c) {
        sb.append(z);
        sb.append(c);
        return sb.toString();
    }

    /* renamed from: x */
    public static StringBuilder m2541x(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        sb.append(str5);
        return sb;
    }

    /* renamed from: y */
    public static HashMap m2542y(Class cls, C10076ky1 c10076ky1) {
        HashMap map = new HashMap();
        map.put(cls, c10076ky1);
        return map;
    }

    /* renamed from: z */
    public static HashMap m2543z(Class cls, XH1 xh1) {
        HashMap map = new HashMap();
        map.put(cls, xh1);
        return map;
    }
}
