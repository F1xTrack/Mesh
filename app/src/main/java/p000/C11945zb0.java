package p000;

import kotlin.KotlinVersion;

/* renamed from: zb0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C11945zb0 extends AbstractC0288EZ implements InterfaceC6497nZ {

    /* renamed from: a */
    public static final C11945zb0 f46884a = new C11945zb0(1);

    @Override // p000.AbstractC7284zl, p000.InterfaceC8152Qd0
    public final String getName() {
        return "getDefaultReportLevelForAnnotation";
    }

    @Override // p000.AbstractC7284zl
    public final InterfaceC10163le0 getOwner() {
        return BP0.f799a.mo3847c(AbstractC9389fb0.class, "compiler.common.jvm");
    }

    @Override // p000.AbstractC7284zl
    public final String getSignature() {
        return "getDefaultReportLevelForAnnotation(Lorg/jetbrains/kotlin/name/FqName;)Lorg/jetbrains/kotlin/load/java/ReportLevel;";
    }

    @Override // p000.InterfaceC6497nZ
    public final Object invoke(Object obj) {
        C0664KX c0664kx = (C0664KX) obj;
        O90.m5968f(c0664kx, "p0");
        C0664KX c0664kx2 = AbstractC9389fb0.f27250a;
        InterfaceC7462Cw0.f1765N0.getClass();
        C0827N8 c0827n8 = C7410Bw0.f1095b;
        KotlinVersion kotlinVersion = new KotlinVersion(1, 7, 20);
        O90.m5968f(c0827n8, "configuredReportLevels");
        EnumC10137lR0 enumC10137lR0 = (EnumC10137lR0) ((C8478Wk0) c0827n8.f7524c).invoke(c0664kx);
        if (enumC10137lR0 != null) {
            return enumC10137lR0;
        }
        C0827N8 c0827n82 = AbstractC9389fb0.f27252c;
        c0827n82.getClass();
        C9517gb0 c9517gb0 = (C9517gb0) ((C8478Wk0) c0827n82.f7524c).invoke(c0664kx);
        if (c9517gb0 == null) {
            return EnumC10137lR0.f37058b;
        }
        KotlinVersion kotlinVersion2 = c9517gb0.f27860b;
        return (kotlinVersion2 == null || kotlinVersion2.compareTo(kotlinVersion) > 0) ? c9517gb0.f27859a : c9517gb0.f27861c;
    }
}
