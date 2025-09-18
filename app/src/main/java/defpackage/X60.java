package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract /* synthetic */ class X60 {
    public static final /* synthetic */ int a = 0;

    static {
        C0572Hc c0572Hc = Y60.A0;
    }

    public static int a(Y60 y60) {
        return ((Integer) y60.q(Y60.C0, -1)).intValue();
    }

    public static ArrayList b(Y60 y60) {
        List list = (List) y60.q(Y60.J0, null);
        if (list != null) {
            return new ArrayList(list);
        }
        return null;
    }

    public static int c(Y60 y60) {
        return ((Integer) y60.q(Y60.D0, -1)).intValue();
    }

    public static List d(Y60 y60) {
        return (List) y60.q(Y60.H0, null);
    }

    public static int e(Y60 y60) {
        return ((Integer) y60.w(Y60.A0)).intValue();
    }

    public static int f(Y60 y60, int i) {
        return ((Integer) y60.q(Y60.B0, Integer.valueOf(i))).intValue();
    }

    public static void g(Y60 y60) {
        boolean zC0 = y60.c0();
        boolean z = y60.S() != null;
        if (zC0 && z) {
            throw new IllegalArgumentException("Cannot use both setTargetResolution and setTargetAspectRatio on the same config.");
        }
        if (y60.E() != null) {
            if (zC0 || z) {
                throw new IllegalArgumentException("Cannot use setTargetResolution or setTargetAspectRatio with setResolutionSelector on the same config.");
            }
        }
    }
}
