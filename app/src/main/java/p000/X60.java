package p000;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract /* synthetic */ class X60 {

    /* renamed from: a */
    public static final /* synthetic */ int f13566a = 0;

    static {
        C0480Hc c0480Hc = Y60.f14159A0;
    }

    /* renamed from: a */
    public static int m8928a(Y60 y60) {
        return ((Integer) y60.mo4792q(Y60.f14161C0, -1)).intValue();
    }

    /* renamed from: b */
    public static ArrayList m8929b(Y60 y60) {
        List list = (List) y60.mo4792q(Y60.f14168J0, null);
        if (list != null) {
            return new ArrayList(list);
        }
        return null;
    }

    /* renamed from: c */
    public static int m8930c(Y60 y60) {
        return ((Integer) y60.mo4792q(Y60.f14162D0, -1)).intValue();
    }

    /* renamed from: d */
    public static List m8931d(Y60 y60) {
        return (List) y60.mo4792q(Y60.f14166H0, null);
    }

    /* renamed from: e */
    public static int m8932e(Y60 y60) {
        return ((Integer) y60.mo4794w(Y60.f14159A0)).intValue();
    }

    /* renamed from: f */
    public static int m8933f(Y60 y60, int i) {
        return ((Integer) y60.mo4792q(Y60.f14160B0, Integer.valueOf(i))).intValue();
    }

    /* renamed from: g */
    public static void m8934g(Y60 y60) {
        boolean zMo7425c0 = y60.mo7425c0();
        boolean z = y60.mo7424S() != null;
        if (zMo7425c0 && z) {
            throw new IllegalArgumentException("Cannot use both setTargetResolution and setTargetAspectRatio on the same config.");
        }
        if (y60.mo7422E() != null) {
            if (zMo7425c0 || z) {
                throw new IllegalArgumentException("Cannot use setTargetResolution or setTargetAspectRatio with setResolutionSelector on the same config.");
            }
        }
    }
}
