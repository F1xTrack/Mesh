package p000;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: To */
/* loaded from: classes.dex */
public final class C1246To {

    /* renamed from: a */
    public final StringBuilder f11517a = new StringBuilder();

    /* renamed from: b */
    public final Object f11518b;

    /* renamed from: c */
    public int f11519c;

    /* renamed from: d */
    public final C8875bc1 f11520d;

    /* renamed from: e */
    public final HashMap f11521e;

    /* renamed from: f */
    public int f11522f;

    public C1246To(C8875bc1 c8875bc1) {
        Object obj = new Object();
        this.f11518b = obj;
        this.f11521e = new HashMap();
        this.f11519c = 1;
        synchronized (obj) {
            this.f11520d = c8875bc1;
            this.f11522f = this.f11519c;
        }
    }

    /* renamed from: c */
    public static void m7772c(C0175Cm c0175Cm, EnumC6909to enumC6909to) {
        if (OY1.m6086d()) {
            OY1.m6087e(enumC6909to.ordinal(), "CX:State[" + c0175Cm + "]");
        }
    }

    /* renamed from: a */
    public final C1183So m7773a(String str) {
        HashMap map = this.f11521e;
        for (InterfaceC6385ln interfaceC6385ln : map.keySet()) {
            if (str.equals(interfaceC6385ln.mo1328b().mo2393e())) {
                return (C1183So) map.get(interfaceC6385ln);
            }
        }
        return null;
    }

    /* renamed from: b */
    public final void m7774b() {
        boolean zM4411e = AbstractC7806Jm0.m4411e("CameraStateRegistry");
        StringBuilder sb = this.f11517a;
        if (zM4411e) {
            sb.setLength(0);
            sb.append("Recalculating open cameras:\n");
            sb.append(String.format(Locale.US, "%-45s%-22s\n", "Camera", "State"));
            sb.append("-------------------------------------------------------------------\n");
        }
        int i = 0;
        for (Map.Entry entry : this.f11521e.entrySet()) {
            if (AbstractC7806Jm0.m4411e("CameraStateRegistry")) {
                sb.append(String.format(Locale.US, "%-45s%-22s\n", ((InterfaceC6385ln) entry.getKey()).toString(), ((C1183So) entry.getValue()).f10982a != null ? ((C1183So) entry.getValue()).f10982a.toString() : GrsBaseInfo.CountryCodeSource.UNKNOWN));
            }
            EnumC6909to enumC6909to = ((C1183So) entry.getValue()).f10982a;
            if (enumC6909to != null && enumC6909to.f43268a) {
                i++;
            }
        }
        if (AbstractC7806Jm0.m4411e("CameraStateRegistry")) {
            sb.append("-------------------------------------------------------------------\n");
            Locale locale = Locale.US;
            sb.append(AbstractC7222ym.m26233j("Open count: ", " (Max allowed: ", i, this.f11519c, ")"));
            AbstractC7806Jm0.m4412f("CameraStateRegistry");
        }
        this.f11522f = Math.max(this.f11519c - i, 0);
    }

    /* renamed from: d */
    public final boolean m7775d(C0175Cm c0175Cm) {
        boolean z;
        synchronized (this.f11518b) {
            try {
                C1183So c1183So = (C1183So) this.f11521e.get(c0175Cm);
                AbstractC9104dM1.m17549h(c1183So, "Camera must first be registered with registerCamera()");
                z = true;
                if (AbstractC7806Jm0.m4411e("CameraStateRegistry")) {
                    this.f11517a.setLength(0);
                    StringBuilder sb = this.f11517a;
                    Locale locale = Locale.US;
                    int i = this.f11522f;
                    EnumC6909to enumC6909to = c1183So.f10982a;
                    boolean z2 = enumC6909to != null && enumC6909to.f43268a;
                    sb.append("tryOpenCamera(" + c0175Cm + ") [Available Cameras: " + i + ", Already Open: " + z2 + " (Previous state: " + c1183So.f10982a + ")]");
                }
                if (this.f11522f > 0) {
                    EnumC6909to enumC6909to2 = EnumC6909to.OPENING;
                    c1183So.f10982a = enumC6909to2;
                    m7772c(c0175Cm, enumC6909to2);
                } else {
                    EnumC6909to enumC6909to3 = c1183So.f10982a;
                    if (enumC6909to3 != null && enumC6909to3.f43268a) {
                        EnumC6909to enumC6909to22 = EnumC6909to.OPENING;
                        c1183So.f10982a = enumC6909to22;
                        m7772c(c0175Cm, enumC6909to22);
                    } else {
                        z = false;
                    }
                }
                if (AbstractC7806Jm0.m4411e("CameraStateRegistry")) {
                    StringBuilder sb2 = this.f11517a;
                    Locale locale2 = Locale.US;
                    sb2.append(" --> ".concat(z ? "SUCCESS" : "FAIL"));
                    AbstractC7806Jm0.m4412f("CameraStateRegistry");
                }
                if (z) {
                    m7774b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    /* renamed from: e */
    public final boolean m7776e(String str, String str2) {
        synchronized (this.f11518b) {
            try {
                boolean z = true;
                if (this.f11520d.f17088a != 2) {
                    return true;
                }
                C1183So c1183SoM7773a = m7773a(str);
                EnumC6909to enumC6909to = c1183SoM7773a != null ? c1183SoM7773a.f10982a : null;
                C1183So c1183SoM7773a2 = str2 != null ? m7773a(str2) : null;
                EnumC6909to enumC6909to2 = c1183SoM7773a2 != null ? c1183SoM7773a2.f10982a : null;
                EnumC6909to enumC6909to3 = EnumC6909to.OPEN;
                boolean z2 = enumC6909to3.equals(enumC6909to) || EnumC6909to.CONFIGURED.equals(enumC6909to);
                boolean z3 = enumC6909to3.equals(enumC6909to2) || EnumC6909to.CONFIGURED.equals(enumC6909to2);
                if (!z2 || !z3) {
                    z = false;
                }
                return z;
            } finally {
            }
        }
    }
}
