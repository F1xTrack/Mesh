package defpackage;

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
    public static C5603ky1 A(HashMap map, int i) {
        Collections.unmodifiableMap(new HashMap(map));
        return new C5603ky1(i);
    }

    public static void B(C6475pX c6475pX, InterfaceC1584Ub1 interfaceC1584Ub1) {
        interfaceC1584Ub1.f(new C6666qX(c6475pX));
    }

    public static /* synthetic */ void C(YE1 ye1) {
        if (ye1 != null) {
            throw new ClassCastException();
        }
    }

    public static /* synthetic */ void D(NH1 nh1) {
        if (nh1 != null) {
            throw new ClassCastException();
        }
    }

    public static int E(int i, int i2, int i3) {
        return C5271jD1.r(i) + i2 + i3;
    }

    public static /* synthetic */ String F(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "RELEASED" : "READY" : "PENDING_RELEASE" : "INITIALIZING" : "NOT_INITIALIZED";
    }

    public static /* synthetic */ String G(int i) {
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

    public static Executor a(C6013n60 c6013n60, ExecutorC2442c30 executorC2442c30) {
        C0572Hc c0572Hc = U91.T0;
        c6013n60.getClass();
        return (Executor) AbstractC7209tN0.j(c6013n60, c0572Hc, executorC2442c30);
    }

    public static EnumC5743lh1 b(InterfaceC5361jh1 interfaceC5361jh1) {
        return (EnumC5743lh1) interfaceC5361jh1.w(InterfaceC5361jh1.c1);
    }

    public static C8194yY0 c(InterfaceC5361jh1 interfaceC5361jh1) {
        return (C8194yY0) interfaceC5361jh1.w(InterfaceC5361jh1.U0);
    }

    public static C8194yY0 d(InterfaceC5361jh1 interfaceC5361jh1) {
        return (C8194yY0) interfaceC5361jh1.q(InterfaceC5361jh1.U0, null);
    }

    public static int e(InterfaceC5361jh1 interfaceC5361jh1) {
        return ((Integer) interfaceC5361jh1.q(InterfaceC5361jh1.d1, 0)).intValue();
    }

    public static C5377jn f(InterfaceC5361jh1 interfaceC5361jh1) {
        return (C5377jn) interfaceC5361jh1.q(InterfaceC5361jh1.W0, null);
    }

    public static int g(InterfaceC5361jh1 interfaceC5361jh1) {
        return ((Integer) interfaceC5361jh1.q(InterfaceC5361jh1.Y0, 0)).intValue();
    }

    public static C4203hh1 h(InterfaceC5361jh1 interfaceC5361jh1) {
        C4203hh1 c4203hh1 = (C4203hh1) interfaceC5361jh1.q(InterfaceC5361jh1.f1, new C4203hh1());
        Objects.requireNonNull(c4203hh1);
        return c4203hh1;
    }

    public static Range i(InterfaceC5361jh1 interfaceC5361jh1, Range range) {
        return (Range) interfaceC5361jh1.q(InterfaceC5361jh1.Z0, range);
    }

    public static int j(InterfaceC5361jh1 interfaceC5361jh1) {
        return ((Integer) interfaceC5361jh1.q(InterfaceC5361jh1.e1, 0)).intValue();
    }

    public static boolean k(InterfaceC5361jh1 interfaceC5361jh1) {
        return ((Boolean) interfaceC5361jh1.q(InterfaceC5361jh1.b1, Boolean.FALSE)).booleanValue();
    }

    public static boolean l(InterfaceC2380bj1 interfaceC2380bj1, int i, int i2) {
        return interfaceC2380bj1.K0(i, i2) || (interfaceC2380bj1.U() && interfaceC2380bj1.K0(i2, i));
    }

    public static boolean m(InterfaceC5361jh1 interfaceC5361jh1) {
        return ((Boolean) interfaceC5361jh1.q(InterfaceC5361jh1.a1, Boolean.FALSE)).booleanValue();
    }

    public static void n(InterfaceC1584Ub1 interfaceC1584Ub1, C4103hA0 c4103hA0, int i) {
        interfaceC1584Ub1.b(c4103hA0, i, 0);
    }

    public static boolean o(InterfaceC0046Ai1 interfaceC0046Ai1) {
        C1591Ue c1591Ue = C1591Ue.g;
        if (C3664et.c(c1591Ue) || MR.g(c1591Ue)) {
            return false;
        }
        return !interfaceC0046Ai1.d().isEmpty();
    }

    public static String p(int i, String str) {
        if (str == null) {
            return null;
        }
        int iX = AbstractC8235ym.x(i);
        if (iX == 1) {
            return str.toUpperCase();
        }
        if (iX == 2) {
            return str.toLowerCase();
        }
        if (iX != 3) {
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

    public static int q(int i) {
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
                throw new IllegalArgumentException(AbstractC7209tN0.u(i, "Unknown enum value: "));
        }
    }

    public static final boolean r(int i) {
        return i == 3 || i == 4 || i == 6;
    }

    public static int s(int i, int i2, int i3) {
        return WE1.b(i) + i2 + i3;
    }

    public static BillingResult t(int i, String str) {
        BillingResult.Builder builderNewBuilder = BillingResult.newBuilder();
        builderNewBuilder.setResponseCode(i);
        builderNewBuilder.setDebugMessage(str);
        return builderNewBuilder.build();
    }

    public static String u(String str, Uri uri, String str2) {
        return str + uri + str2;
    }

    public static String v(StringBuilder sb, String str, char c) {
        sb.append(str);
        sb.append(c);
        return sb.toString();
    }

    public static String w(StringBuilder sb, boolean z, char c) {
        sb.append(z);
        sb.append(c);
        return sb.toString();
    }

    public static StringBuilder x(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        sb.append(str5);
        return sb;
    }

    public static HashMap y(Class cls, C5603ky1 c5603ky1) {
        HashMap map = new HashMap();
        map.put(cls, c5603ky1);
        return map;
    }

    public static HashMap z(Class cls, XH1 xh1) {
        HashMap map = new HashMap();
        map.put(cls, xh1);
        return map;
    }
}
