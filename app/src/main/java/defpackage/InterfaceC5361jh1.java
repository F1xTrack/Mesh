package defpackage;

import android.util.Range;

/* renamed from: jh1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC5361jh1 extends C81, M60 {
    public static final C0572Hc U0 = new C0572Hc("camerax.core.useCase.defaultSessionConfig", C8194yY0.class, null);
    public static final C0572Hc V0 = new C0572Hc("camerax.core.useCase.defaultCaptureConfig", C1702Vp.class, null);
    public static final C0572Hc W0 = new C0572Hc("camerax.core.useCase.sessionConfigUnpacker", C5377jn.class, null);
    public static final C0572Hc X0 = new C0572Hc("camerax.core.useCase.captureConfigUnpacker", C0602Hm.class, null);
    public static final C0572Hc Y0;
    public static final C0572Hc Z0;
    public static final C0572Hc a1;
    public static final C0572Hc b1;
    public static final C0572Hc c1;
    public static final C0572Hc d1;
    public static final C0572Hc e1;
    public static final C0572Hc f1;

    static {
        Class cls = Integer.TYPE;
        Y0 = new C0572Hc("camerax.core.useCase.surfaceOccupancyPriority", cls, null);
        Z0 = new C0572Hc("camerax.core.useCase.targetFrameRate", Range.class, null);
        Class cls2 = Boolean.TYPE;
        a1 = new C0572Hc("camerax.core.useCase.zslDisabled", cls2, null);
        b1 = new C0572Hc("camerax.core.useCase.highResolutionDisabled", cls2, null);
        c1 = new C0572Hc("camerax.core.useCase.captureType", EnumC5743lh1.class, null);
        d1 = new C0572Hc("camerax.core.useCase.previewStabilizationMode", cls, null);
        e1 = new C0572Hc("camerax.core.useCase.videoStabilizationMode", cls, null);
        f1 = new C0572Hc("camerax.core.useCase.takePictureManagerProvider", C4203hh1.class, null);
    }

    boolean C();

    C8194yY0 H();

    EnumC5743lh1 T();

    int U();

    Range Z(Range range);

    int g0();

    boolean m0();

    C4203hh1 s();

    C8194yY0 x();

    int y();

    C5377jn z();
}
