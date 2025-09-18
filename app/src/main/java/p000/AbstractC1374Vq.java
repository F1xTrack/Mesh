package p000;

import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;

/* renamed from: Vq */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC1374Vq {
    /* renamed from: a */
    public static long m8582a(InterfaceC0187Cy interfaceC0187Cy) {
        byte[] bArr = (byte[]) ((C1525YE) interfaceC0187Cy).f14206b.get("exo_len");
        if (bArr != null) {
            return ByteBuffer.wrap(bArr).getLong();
        }
        return -1L;
    }

    /* renamed from: b */
    public static /* synthetic */ int m8583b(int i) {
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    if (i == 4) {
                        return 4;
                    }
                    throw null;
                }
            }
        }
        return i2;
    }

    /* renamed from: c */
    public static /* synthetic */ String m8584c(int i) {
        switch (i) {
            case 1:
                return "bluetooth";
            case 2:
                return "cellular";
            case 3:
                return "ethernet";
            case 4:
                return LocalNotification.Importance.NONE;
            case 5:
                return "unknown";
            case 6:
                return "wifi";
            case 7:
                return "wimax";
            case 8:
                return "vpn";
            default:
                throw null;
        }
    }

    /* renamed from: d */
    public static float m8585d(float f, float f2, float f3, float f4) {
        return ((f - f2) * f3) + f4;
    }

    /* renamed from: e */
    public static int m8586e(int i, int i2, String str) {
        return (str.hashCode() + i) * i2;
    }

    /* renamed from: f */
    public static String m8587f(RecyclerView recyclerView, StringBuilder sb) {
        sb.append(recyclerView.m10237C());
        return sb.toString();
    }

    /* renamed from: g */
    public static String m8588g(File file, String str) {
        return str + file;
    }

    /* renamed from: h */
    public static String m8589h(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    /* renamed from: i */
    public static String m8590i(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    /* renamed from: j */
    public static String m8591j(StringBuilder sb, int i, String str) {
        sb.append(i);
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: k */
    public static String m8592k(StringBuilder sb, String str) {
        return str + ((Object) sb);
    }

    /* renamed from: l */
    public static String m8593l(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: m */
    public static StringBuilder m8594m(String str, String str2, int i, int i2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i2);
        sb.append(str3);
        return sb;
    }

    /* renamed from: n */
    public static void m8595n(int i, HashMap map, String str, int i2, String str2) {
        map.put(str, Integer.valueOf(i));
        map.put(str2, Integer.valueOf(i2));
    }

    /* renamed from: o */
    public static void m8596o(C7731Ia1 c7731Ia1, C8654Zu0 c8654Zu0, C8654Zu0 c8654Zu02) {
        c8654Zu0.m9635j(c7731Ia1.m3946a());
        AbstractC8784av0.m10381c(c8654Zu02);
    }

    /* renamed from: p */
    public static /* synthetic */ void m8597p(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    /* renamed from: q */
    public static C7882Ky0 m8598q(InterfaceC6854sw interfaceC6854sw, InterfaceC6854sw interfaceC6854sw2) {
        if (interfaceC6854sw == null && interfaceC6854sw2 == null) {
            return C7882Ky0.f6403c;
        }
        C7612Ft0 c7612Ft0M2813c = interfaceC6854sw2 != null ? C7612Ft0.m2813c(interfaceC6854sw2) : C7612Ft0.m2812b();
        if (interfaceC6854sw != null) {
            Iterator it = interfaceC6854sw.mo4793u().iterator();
            while (it.hasNext()) {
                m8599r(c7612Ft0M2813c, interfaceC6854sw2, interfaceC6854sw, (C0480Hc) it.next());
            }
        }
        return C7882Ky0.m4786a(c7612Ft0M2813c);
    }

    /* renamed from: r */
    public static void m8599r(C7612Ft0 c7612Ft0, InterfaceC6854sw interfaceC6854sw, InterfaceC6854sw interfaceC6854sw2, C0480Hc c0480Hc) {
        if (!Objects.equals(c0480Hc, Y60.f14167I0)) {
            c7612Ft0.m2814d(c0480Hc, interfaceC6854sw2.mo4791d0(c0480Hc), interfaceC6854sw2.mo4794w(c0480Hc));
            return;
        }
        C9371fS0 c9371fS0 = (C9371fS0) interfaceC6854sw2.mo4792q(c0480Hc, null);
        C9371fS0 c9371fS02 = (C9371fS0) interfaceC6854sw.mo4792q(c0480Hc, null);
        EnumC6791rw enumC6791rwMo4791d0 = interfaceC6854sw2.mo4791d0(c0480Hc);
        if (c9371fS0 == null) {
            c9371fS0 = c9371fS02;
        } else if (c9371fS02 != null) {
            C9557gv0 c9557gv0 = new C9557gv0();
            c9557gv0.f28086b = c9371fS02.f27203a;
            c9557gv0.f28087c = c9371fS02.f27204b;
            c9557gv0.f28088d = c9371fS02.f27205c;
            c9557gv0.f28085a = c9371fS02.f27206d;
            C8326Tm0 c8326Tm0 = c9371fS0.f27203a;
            if (c8326Tm0 != null) {
                c9557gv0.f28086b = c8326Tm0;
            }
            C9627hS0 c9627hS0 = c9371fS0.f27204b;
            if (c9627hS0 != null) {
                c9557gv0.f28087c = c9627hS0;
            }
            C8450Vw0 c8450Vw0 = c9371fS0.f27205c;
            if (c8450Vw0 != null) {
                c9557gv0.f28088d = c8450Vw0;
            }
            int i = c9371fS0.f27206d;
            if (i != 0) {
                c9557gv0.f28085a = i;
            }
            c9371fS0 = new C9371fS0((C8326Tm0) c9557gv0.f28086b, (C9627hS0) c9557gv0.f28087c, (C8450Vw0) c9557gv0.f28088d, c9557gv0.f28085a);
        }
        c7612Ft0.m2814d(c0480Hc, enumC6791rwMo4791d0, c9371fS0);
    }

    /* renamed from: s */
    public static /* synthetic */ String m8600s(int i) {
        switch (i) {
            case 1:
                return "NONE";
            case 2:
                return "LEFT";
            case 3:
                return "TOP";
            case 4:
                return "RIGHT";
            case 5:
                return "BOTTOM";
            case 6:
                return "BASELINE";
            case 7:
                return "CENTER";
            case 8:
                return "CENTER_X";
            case 9:
                return "CENTER_Y";
            default:
                throw null;
        }
    }

    /* renamed from: t */
    public static /* synthetic */ String m8601t(int i) {
        switch (i) {
            case 1:
                return "INITIALIZE";
            case 2:
                return "RESOURCE_CACHE";
            case 3:
                return "DATA_CACHE";
            case 4:
                return "SOURCE";
            case 5:
                return "ENCODE";
            case 6:
                return "FINISHED";
            default:
                return "null";
        }
    }

    /* renamed from: u */
    public static /* synthetic */ String m8602u(int i) {
        switch (i) {
            case 1:
                return "CONFIGURED";
            case 2:
                return "STARTED";
            case 3:
                return "PAUSED";
            case 4:
                return "STOPPING";
            case 5:
                return "PENDING_START";
            case 6:
                return "PENDING_START_PAUSED";
            case 7:
                return "PENDING_RELEASE";
            case 8:
                return "ERROR";
            case 9:
                return "RELEASED";
            default:
                return "null";
        }
    }
}
