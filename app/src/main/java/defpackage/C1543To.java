package defpackage;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: To */
/* loaded from: classes.dex */
public final class C1543To {
    public final StringBuilder a = new StringBuilder();
    public final Object b;
    public int c;
    public final C2359bc1 d;
    public final HashMap e;
    public int f;

    public C1543To(C2359bc1 c2359bc1) {
        Object obj = new Object();
        this.b = obj;
        this.e = new HashMap();
        this.c = 1;
        synchronized (obj) {
            this.d = c2359bc1;
            this.f = this.c;
        }
    }

    public static void c(C0212Cm c0212Cm, EnumC7289to enumC7289to) {
        if (OY1.d()) {
            OY1.e(enumC7289to.ordinal(), "CX:State[" + c0212Cm + "]");
        }
    }

    public final C1465So a(String str) {
        HashMap map = this.e;
        for (InterfaceC5759ln interfaceC5759ln : map.keySet()) {
            if (str.equals(interfaceC5759ln.b().e())) {
                return (C1465So) map.get(interfaceC5759ln);
            }
        }
        return null;
    }

    public final void b() {
        boolean zE = AbstractC0759Jm0.e("CameraStateRegistry");
        StringBuilder sb = this.a;
        if (zE) {
            sb.setLength(0);
            sb.append("Recalculating open cameras:\n");
            sb.append(String.format(Locale.US, "%-45s%-22s\n", "Camera", "State"));
            sb.append("-------------------------------------------------------------------\n");
        }
        int i = 0;
        for (Map.Entry entry : this.e.entrySet()) {
            if (AbstractC0759Jm0.e("CameraStateRegistry")) {
                sb.append(String.format(Locale.US, "%-45s%-22s\n", ((InterfaceC5759ln) entry.getKey()).toString(), ((C1465So) entry.getValue()).a != null ? ((C1465So) entry.getValue()).a.toString() : GrsBaseInfo.CountryCodeSource.UNKNOWN));
            }
            EnumC7289to enumC7289to = ((C1465So) entry.getValue()).a;
            if (enumC7289to != null && enumC7289to.a) {
                i++;
            }
        }
        if (AbstractC0759Jm0.e("CameraStateRegistry")) {
            sb.append("-------------------------------------------------------------------\n");
            Locale locale = Locale.US;
            sb.append(AbstractC8235ym.j("Open count: ", " (Max allowed: ", i, this.c, ")"));
            AbstractC0759Jm0.f("CameraStateRegistry");
        }
        this.f = Math.max(this.c - i, 0);
    }

    public final boolean d(C0212Cm c0212Cm) {
        boolean z;
        synchronized (this.b) {
            try {
                C1465So c1465So = (C1465So) this.e.get(c0212Cm);
                AbstractC3377dM1.h(c1465So, "Camera must first be registered with registerCamera()");
                z = true;
                if (AbstractC0759Jm0.e("CameraStateRegistry")) {
                    this.a.setLength(0);
                    StringBuilder sb = this.a;
                    Locale locale = Locale.US;
                    int i = this.f;
                    EnumC7289to enumC7289to = c1465So.a;
                    boolean z2 = enumC7289to != null && enumC7289to.a;
                    sb.append("tryOpenCamera(" + c0212Cm + ") [Available Cameras: " + i + ", Already Open: " + z2 + " (Previous state: " + c1465So.a + ")]");
                }
                if (this.f > 0) {
                    EnumC7289to enumC7289to2 = EnumC7289to.OPENING;
                    c1465So.a = enumC7289to2;
                    c(c0212Cm, enumC7289to2);
                } else {
                    EnumC7289to enumC7289to3 = c1465So.a;
                    if (enumC7289to3 != null && enumC7289to3.a) {
                        EnumC7289to enumC7289to22 = EnumC7289to.OPENING;
                        c1465So.a = enumC7289to22;
                        c(c0212Cm, enumC7289to22);
                    } else {
                        z = false;
                    }
                }
                if (AbstractC0759Jm0.e("CameraStateRegistry")) {
                    StringBuilder sb2 = this.a;
                    Locale locale2 = Locale.US;
                    sb2.append(" --> ".concat(z ? "SUCCESS" : "FAIL"));
                    AbstractC0759Jm0.f("CameraStateRegistry");
                }
                if (z) {
                    b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    public final boolean e(String str, String str2) {
        synchronized (this.b) {
            try {
                boolean z = true;
                if (this.d.a != 2) {
                    return true;
                }
                C1465So c1465SoA = a(str);
                EnumC7289to enumC7289to = c1465SoA != null ? c1465SoA.a : null;
                C1465So c1465SoA2 = str2 != null ? a(str2) : null;
                EnumC7289to enumC7289to2 = c1465SoA2 != null ? c1465SoA2.a : null;
                EnumC7289to enumC7289to3 = EnumC7289to.OPEN;
                boolean z2 = enumC7289to3.equals(enumC7289to) || EnumC7289to.CONFIGURED.equals(enumC7289to);
                boolean z3 = enumC7289to3.equals(enumC7289to2) || EnumC7289to.CONFIGURED.equals(enumC7289to2);
                if (!z2 || !z3) {
                    z = false;
                }
                return z;
            } finally {
            }
        }
    }
}
