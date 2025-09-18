package defpackage;

import android.net.Uri;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: tN0 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC7209tN0 {
    public static String A(StringBuilder sb, List list, char c) {
        sb.append(list);
        sb.append(c);
        return sb.toString();
    }

    public static void B(int i, J61 j61, long j, I61 i61) {
        i61.a(new C0656Ie(i, j61, j));
    }

    public static void C(String str, String str2) {
        AbstractC6789rA1.h(str + str2);
    }

    public static /* synthetic */ String D(int i) {
        switch (i) {
            case 1:
                return "INITIALIZING";
            case 2:
                return "IDLING";
            case 3:
                return "DISABLED";
            case 4:
                return "ENABLED";
            case 5:
                return "ERROR_ENCODER";
            case 6:
                return "ERROR_SOURCE";
            default:
                return "null";
        }
    }

    public static /* synthetic */ int E(String str) {
        if (str == null) {
            throw new NullPointerException("Name is null");
        }
        if (str.equals("sharp")) {
            return 1;
        }
        if (str.equals("smooth")) {
            return 2;
        }
        throw new IllegalArgumentException("No enum constant com.horcrux.svg.TextProperties.TextPathMidLine.".concat(str));
    }

    public static boolean F(C3513e41 c3513e41) {
        Iterator it = c3513e41.B0(SurfaceProcessingQuirk.class).iterator();
        while (it.hasNext()) {
            if (((SurfaceProcessingQuirk) it.next()).b()) {
                return true;
            }
        }
        return false;
    }

    public static boolean a(InterfaceC7400uN0 interfaceC7400uN0, C0572Hc c0572Hc) {
        return interfaceC7400uN0.getConfig().Q(c0572Hc);
    }

    public static void b(InterfaceC7400uN0 interfaceC7400uN0, InterfaceC6741qw interfaceC6741qw) {
        interfaceC7400uN0.getConfig().L(interfaceC6741qw);
    }

    public static EnumC6931rw c(InterfaceC7400uN0 interfaceC7400uN0, C0572Hc c0572Hc) {
        return interfaceC7400uN0.getConfig().d0(c0572Hc);
    }

    public static Set d(InterfaceC7400uN0 interfaceC7400uN0, C0572Hc c0572Hc) {
        return interfaceC7400uN0.getConfig().A(c0572Hc);
    }

    public static String e(InterfaceC5361jh1 interfaceC5361jh1) {
        return (String) interfaceC5361jh1.w(C81.R0);
    }

    public static String f(InterfaceC5361jh1 interfaceC5361jh1, String str) {
        return (String) interfaceC5361jh1.q(C81.R0, str);
    }

    public static Set g(InterfaceC7400uN0 interfaceC7400uN0) {
        return interfaceC7400uN0.getConfig().u();
    }

    public static C8124yB h(InterfaceC3519e61 interfaceC3519e61, byte[] bArr, int i) {
        M70 m70T = P70.t();
        interfaceC3519e61.m(bArr, 0, i, C3329d61.c, new C1724Vw0(19, m70T));
        return new C8124yB(m70T.h());
    }

    public static Object i(InterfaceC7400uN0 interfaceC7400uN0, C0572Hc c0572Hc) {
        return interfaceC7400uN0.getConfig().w(c0572Hc);
    }

    public static Object j(InterfaceC7400uN0 interfaceC7400uN0, C0572Hc c0572Hc, Object obj) {
        return interfaceC7400uN0.getConfig().q(c0572Hc, obj);
    }

    public static Object k(InterfaceC7400uN0 interfaceC7400uN0, C0572Hc c0572Hc, EnumC6931rw enumC6931rw) {
        return interfaceC7400uN0.getConfig().F(c0572Hc, enumC6931rw);
    }

    public static final void l(int i, View view) {
        O90.f(view, "view");
        int iX = AbstractC8235ym.x(i);
        if (iX == 0) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    view.toString();
                    viewGroup.toString();
                }
                viewGroup.removeView(view);
                return;
            }
            return;
        }
        if (iX == 1) {
            if (Log.isLoggable("FragmentManager", 2)) {
                view.toString();
            }
            view.setVisibility(0);
        } else if (iX == 2) {
            if (Log.isLoggable("FragmentManager", 2)) {
                view.toString();
            }
            view.setVisibility(8);
        } else {
            if (iX != 3) {
                return;
            }
            if (Log.isLoggable("FragmentManager", 2)) {
                view.toString();
            }
            view.setVisibility(4);
        }
    }

    public static int m(int i, int i2, int i3, int i4) {
        return i | i2 | i3 | 128 | i4;
    }

    public static int n(int i) {
        return i & 384;
    }

    public static int o(int i) {
        return i & 64;
    }

    public static /* synthetic */ boolean p(int i) {
        if (i == 1 || i == 2 || i == 3) {
            return false;
        }
        if (i == 4 || i == 5) {
            return true;
        }
        throw null;
    }

    public static /* synthetic */ long q(int i) {
        if (i == 1) {
            return 1099511627776L;
        }
        if (i == 2) {
            return 1073741824L;
        }
        if (i == 3) {
            return 1048576L;
        }
        if (i == 4) {
            return 1024L;
        }
        if (i == 5) {
            return 1L;
        }
        throw null;
    }

    public static /* synthetic */ String r(int i) {
        switch (i) {
            case 1:
                return "kotlin";
            case 2:
                return "unity";
            case 3:
                return "flutter";
            case 4:
                return "unreal-engine";
            case 5:
                return "godot";
            case 6:
                return "react-native";
            default:
                throw null;
        }
    }

    public static boolean s(int i, boolean z) {
        int i2 = i & 7;
        return i2 == 4 || (z && i2 == 3);
    }

    public static I61 t(ArrayList arrayList, I61 i61) {
        arrayList.add(i61);
        return new I61();
    }

    public static String u(int i, String str) {
        return str + i;
    }

    public static String v(Class cls, String str) {
        return str + cls;
    }

    public static String w(String str, Uri uri) {
        return str + uri;
    }

    public static String x(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    public static String y(StringBuilder sb, long j, char c) {
        sb.append(j);
        sb.append(c);
        return sb.toString();
    }

    public static String z(StringBuilder sb, String str, String str2, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb.toString();
    }
}
