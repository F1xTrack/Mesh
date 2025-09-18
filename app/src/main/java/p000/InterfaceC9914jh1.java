package p000;

import android.util.Range;

/* renamed from: jh1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC9914jh1 extends C81, M60 {

    /* renamed from: U0 */
    public static final C0480Hc f35324U0 = new C0480Hc("camerax.core.useCase.defaultSessionConfig", C11812yY0.class, null);

    /* renamed from: V0 */
    public static final C0480Hc f35325V0 = new C0480Hc("camerax.core.useCase.defaultCaptureConfig", C1373Vp.class, null);

    /* renamed from: W0 */
    public static final C0480Hc f35326W0 = new C0480Hc("camerax.core.useCase.sessionConfigUnpacker", C6259jn.class, null);

    /* renamed from: X0 */
    public static final C0480Hc f35327X0 = new C0480Hc("camerax.core.useCase.captureConfigUnpacker", C0490Hm.class, null);

    /* renamed from: Y0 */
    public static final C0480Hc f35328Y0;

    /* renamed from: Z0 */
    public static final C0480Hc f35329Z0;

    /* renamed from: a1 */
    public static final C0480Hc f35330a1;

    /* renamed from: b1 */
    public static final C0480Hc f35331b1;

    /* renamed from: c1 */
    public static final C0480Hc f35332c1;

    /* renamed from: d1 */
    public static final C0480Hc f35333d1;

    /* renamed from: e1 */
    public static final C0480Hc f35334e1;

    /* renamed from: f1 */
    public static final C0480Hc f35335f1;

    static {
        Class cls = Integer.TYPE;
        f35328Y0 = new C0480Hc("camerax.core.useCase.surfaceOccupancyPriority", cls, null);
        f35329Z0 = new C0480Hc("camerax.core.useCase.targetFrameRate", Range.class, null);
        Class cls2 = Boolean.TYPE;
        f35330a1 = new C0480Hc("camerax.core.useCase.zslDisabled", cls2, null);
        f35331b1 = new C0480Hc("camerax.core.useCase.highResolutionDisabled", cls2, null);
        f35332c1 = new C0480Hc("camerax.core.useCase.captureType", EnumC10170lh1.class, null);
        f35333d1 = new C0480Hc("camerax.core.useCase.previewStabilizationMode", cls, null);
        f35334e1 = new C0480Hc("camerax.core.useCase.videoStabilizationMode", cls, null);
        f35335f1 = new C0480Hc("camerax.core.useCase.takePictureManagerProvider", C9658hh1.class, null);
    }

    /* renamed from: C */
    boolean mo6164C();

    /* renamed from: H */
    C11812yY0 mo6165H();

    /* renamed from: T */
    EnumC10170lh1 mo6166T();

    /* renamed from: U */
    int mo6167U();

    /* renamed from: Z */
    Range mo6168Z(Range range);

    /* renamed from: g0 */
    int mo6169g0();

    /* renamed from: m0 */
    boolean mo6170m0();

    /* renamed from: s */
    C9658hh1 mo6171s();

    /* renamed from: x */
    C11812yY0 mo6172x();

    /* renamed from: y */
    int mo6173y();

    /* renamed from: z */
    C6259jn mo6174z();
}
