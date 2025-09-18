package defpackage;

import android.util.Size;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public interface Y60 extends InterfaceC7400uN0 {
    public static final C0572Hc A0 = new C0572Hc("camerax.core.imageOutput.targetAspectRatio", S8.class, null);
    public static final C0572Hc B0;
    public static final C0572Hc C0;
    public static final C0572Hc D0;
    public static final C0572Hc E0;
    public static final C0572Hc F0;
    public static final C0572Hc G0;
    public static final C0572Hc H0;
    public static final C0572Hc I0;
    public static final C0572Hc J0;

    static {
        Class cls = Integer.TYPE;
        B0 = new C0572Hc("camerax.core.imageOutput.targetRotation", cls, null);
        C0 = new C0572Hc("camerax.core.imageOutput.appTargetRotation", cls, null);
        D0 = new C0572Hc("camerax.core.imageOutput.mirrorMode", cls, null);
        E0 = new C0572Hc("camerax.core.imageOutput.targetResolution", Size.class, null);
        F0 = new C0572Hc("camerax.core.imageOutput.defaultResolution", Size.class, null);
        G0 = new C0572Hc("camerax.core.imageOutput.maxResolution", Size.class, null);
        H0 = new C0572Hc("camerax.core.imageOutput.supportedResolutions", List.class, null);
        I0 = new C0572Hc("camerax.core.imageOutput.resolutionSelector", C3775fS0.class, null);
        J0 = new C0572Hc("camerax.core.imageOutput.customOrderedResolutions", List.class, null);
    }

    ArrayList D();

    C3775fS0 E();

    Size M();

    Size S();

    boolean c0();

    int e0();

    Size l0();

    List n();

    int n0(int i);

    C3775fS0 o();

    int p0();

    int r();
}
