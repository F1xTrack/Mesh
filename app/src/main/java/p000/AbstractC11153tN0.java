package p000;

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
public abstract /* synthetic */ class AbstractC11153tN0 {
    /* renamed from: A */
    public static String m24883A(StringBuilder sb, List list, char c) {
        sb.append(list);
        sb.append(c);
        return sb.toString();
    }

    /* renamed from: B */
    public static void m24884B(int i, J61 j61, long j, I61 i61) {
        i61.m3751a(new C0545Ie(i, j61, j));
    }

    /* renamed from: C */
    public static void m24885C(String str, String str2) {
        AbstractC10872rA1.m24175h(str + str2);
    }

    /* renamed from: D */
    public static /* synthetic */ String m24886D(int i) {
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

    /* renamed from: E */
    public static /* synthetic */ int m24887E(String str) {
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

    /* renamed from: F */
    public static boolean m24888F(C9196e41 c9196e41) {
        Iterator it = c9196e41.m17838B0(SurfaceProcessingQuirk.class).iterator();
        while (it.hasNext()) {
            if (((SurfaceProcessingQuirk) it.next()).mo9885b()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m24889a(InterfaceC11281uN0 interfaceC11281uN0, C0480Hc c0480Hc) {
        return interfaceC11281uN0.getConfig().mo4790Q(c0480Hc);
    }

    /* renamed from: b */
    public static void m24890b(InterfaceC11281uN0 interfaceC11281uN0, InterfaceC6711qw interfaceC6711qw) {
        interfaceC11281uN0.getConfig().mo4789L(interfaceC6711qw);
    }

    /* renamed from: c */
    public static EnumC6791rw m24891c(InterfaceC11281uN0 interfaceC11281uN0, C0480Hc c0480Hc) {
        return interfaceC11281uN0.getConfig().mo4791d0(c0480Hc);
    }

    /* renamed from: d */
    public static Set m24892d(InterfaceC11281uN0 interfaceC11281uN0, C0480Hc c0480Hc) {
        return interfaceC11281uN0.getConfig().mo4787A(c0480Hc);
    }

    /* renamed from: e */
    public static String m24893e(InterfaceC9914jh1 interfaceC9914jh1) {
        return (String) interfaceC9914jh1.mo4794w(C81.f1225R0);
    }

    /* renamed from: f */
    public static String m24894f(InterfaceC9914jh1 interfaceC9914jh1, String str) {
        return (String) interfaceC9914jh1.mo4792q(C81.f1225R0, str);
    }

    /* renamed from: g */
    public static Set m24895g(InterfaceC11281uN0 interfaceC11281uN0) {
        return interfaceC11281uN0.getConfig().mo4793u();
    }

    /* renamed from: h */
    public static C7185yB m24896h(InterfaceC9200e61 interfaceC9200e61, byte[] bArr, int i) {
        M70 m70M6233t = P70.m6233t();
        interfaceC9200e61.mo4562m(bArr, 0, i, C9072d61.f25815c, new C8450Vw0(19, m70M6233t));
        return new C7185yB(m70M6233t.m5273h());
    }

    /* renamed from: i */
    public static Object m24897i(InterfaceC11281uN0 interfaceC11281uN0, C0480Hc c0480Hc) {
        return interfaceC11281uN0.getConfig().mo4794w(c0480Hc);
    }

    /* renamed from: j */
    public static Object m24898j(InterfaceC11281uN0 interfaceC11281uN0, C0480Hc c0480Hc, Object obj) {
        return interfaceC11281uN0.getConfig().mo4792q(c0480Hc, obj);
    }

    /* renamed from: k */
    public static Object m24899k(InterfaceC11281uN0 interfaceC11281uN0, C0480Hc c0480Hc, EnumC6791rw enumC6791rw) {
        return interfaceC11281uN0.getConfig().mo4788F(c0480Hc, enumC6791rw);
    }

    /* renamed from: l */
    public static final void m24900l(int i, View view) {
        O90.m5968f(view, "view");
        int iM26247x = AbstractC7222ym.m26247x(i);
        if (iM26247x == 0) {
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
        if (iM26247x == 1) {
            if (Log.isLoggable("FragmentManager", 2)) {
                view.toString();
            }
            view.setVisibility(0);
        } else if (iM26247x == 2) {
            if (Log.isLoggable("FragmentManager", 2)) {
                view.toString();
            }
            view.setVisibility(8);
        } else {
            if (iM26247x != 3) {
                return;
            }
            if (Log.isLoggable("FragmentManager", 2)) {
                view.toString();
            }
            view.setVisibility(4);
        }
    }

    /* renamed from: m */
    public static int m24901m(int i, int i2, int i3, int i4) {
        return i | i2 | i3 | 128 | i4;
    }

    /* renamed from: n */
    public static int m24902n(int i) {
        return i & 384;
    }

    /* renamed from: o */
    public static int m24903o(int i) {
        return i & 64;
    }

    /* renamed from: p */
    public static /* synthetic */ boolean m24904p(int i) {
        if (i == 1 || i == 2 || i == 3) {
            return false;
        }
        if (i == 4 || i == 5) {
            return true;
        }
        throw null;
    }

    /* renamed from: q */
    public static /* synthetic */ long m24905q(int i) {
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

    /* renamed from: r */
    public static /* synthetic */ String m24906r(int i) {
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

    /* renamed from: s */
    public static boolean m24907s(int i, boolean z) {
        int i2 = i & 7;
        return i2 == 4 || (z && i2 == 3);
    }

    /* renamed from: t */
    public static I61 m24908t(ArrayList arrayList, I61 i61) {
        arrayList.add(i61);
        return new I61();
    }

    /* renamed from: u */
    public static String m24909u(int i, String str) {
        return str + i;
    }

    /* renamed from: v */
    public static String m24910v(Class cls, String str) {
        return str + cls;
    }

    /* renamed from: w */
    public static String m24911w(String str, Uri uri) {
        return str + uri;
    }

    /* renamed from: x */
    public static String m24912x(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    /* renamed from: y */
    public static String m24913y(StringBuilder sb, long j, char c) {
        sb.append(j);
        sb.append(c);
        return sb.toString();
    }

    /* renamed from: z */
    public static String m24914z(StringBuilder sb, String str, String str2, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb.toString();
    }
}
