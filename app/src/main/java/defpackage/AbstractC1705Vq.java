package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.rn.push.constants.LocalNotification;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;

/* renamed from: Vq */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC1705Vq {
    public static long a(InterfaceC0248Cy interfaceC0248Cy) {
        byte[] bArr = (byte[]) ((YE) interfaceC0248Cy).b.get("exo_len");
        if (bArr != null) {
            return ByteBuffer.wrap(bArr).getLong();
        }
        return -1L;
    }

    public static /* synthetic */ int b(int i) {
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

    public static /* synthetic */ String c(int i) {
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

    public static float d(float f, float f2, float f3, float f4) {
        return ((f - f2) * f3) + f4;
    }

    public static int e(int i, int i2, String str) {
        return (str.hashCode() + i) * i2;
    }

    public static String f(RecyclerView recyclerView, StringBuilder sb) {
        sb.append(recyclerView.C());
        return sb.toString();
    }

    public static String g(File file, String str) {
        return str + file;
    }

    public static String h(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String i(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static String j(StringBuilder sb, int i, String str) {
        sb.append(i);
        sb.append(str);
        return sb.toString();
    }

    public static String k(StringBuilder sb, String str) {
        return str + ((Object) sb);
    }

    public static String l(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static StringBuilder m(String str, String str2, int i, int i2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i2);
        sb.append(str3);
        return sb;
    }

    public static void n(int i, HashMap map, String str, int i2, String str2) {
        map.put(str, Integer.valueOf(i));
        map.put(str2, Integer.valueOf(i2));
    }

    public static void o(C0646Ia1 c0646Ia1, C2030Zu0 c2030Zu0, C2030Zu0 c2030Zu02) {
        c2030Zu0.j(c0646Ia1.a());
        AbstractC2224av0.c(c2030Zu02);
    }

    public static /* synthetic */ void p(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    public static C0873Ky0 q(InterfaceC7122sw interfaceC7122sw, InterfaceC7122sw interfaceC7122sw2) {
        if (interfaceC7122sw == null && interfaceC7122sw2 == null) {
            return C0873Ky0.c;
        }
        C0468Ft0 c0468Ft0C = interfaceC7122sw2 != null ? C0468Ft0.c(interfaceC7122sw2) : C0468Ft0.b();
        if (interfaceC7122sw != null) {
            Iterator it = interfaceC7122sw.u().iterator();
            while (it.hasNext()) {
                r(c0468Ft0C, interfaceC7122sw2, interfaceC7122sw, (C0572Hc) it.next());
            }
        }
        return C0873Ky0.a(c0468Ft0C);
    }

    public static void r(C0468Ft0 c0468Ft0, InterfaceC7122sw interfaceC7122sw, InterfaceC7122sw interfaceC7122sw2, C0572Hc c0572Hc) {
        if (!Objects.equals(c0572Hc, Y60.I0)) {
            c0468Ft0.d(c0572Hc, interfaceC7122sw2.d0(c0572Hc), interfaceC7122sw2.w(c0572Hc));
            return;
        }
        C3775fS0 c3775fS0 = (C3775fS0) interfaceC7122sw2.q(c0572Hc, null);
        C3775fS0 c3775fS02 = (C3775fS0) interfaceC7122sw.q(c0572Hc, null);
        EnumC6931rw enumC6931rwD0 = interfaceC7122sw2.d0(c0572Hc);
        if (c3775fS0 == null) {
            c3775fS0 = c3775fS02;
        } else if (c3775fS02 != null) {
            C4053gv0 c4053gv0 = new C4053gv0();
            c4053gv0.b = c3775fS02.a;
            c4053gv0.c = c3775fS02.b;
            c4053gv0.d = c3775fS02.c;
            c4053gv0.a = c3775fS02.d;
            C1538Tm0 c1538Tm0 = c3775fS0.a;
            if (c1538Tm0 != null) {
                c4053gv0.b = c1538Tm0;
            }
            C4157hS0 c4157hS0 = c3775fS0.b;
            if (c4157hS0 != null) {
                c4053gv0.c = c4157hS0;
            }
            C1724Vw0 c1724Vw0 = c3775fS0.c;
            if (c1724Vw0 != null) {
                c4053gv0.d = c1724Vw0;
            }
            int i = c3775fS0.d;
            if (i != 0) {
                c4053gv0.a = i;
            }
            c3775fS0 = new C3775fS0((C1538Tm0) c4053gv0.b, (C4157hS0) c4053gv0.c, (C1724Vw0) c4053gv0.d, c4053gv0.a);
        }
        c0468Ft0.d(c0572Hc, enumC6931rwD0, c3775fS0);
    }

    public static /* synthetic */ String s(int i) {
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

    public static /* synthetic */ String t(int i) {
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

    public static /* synthetic */ String u(int i) {
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
