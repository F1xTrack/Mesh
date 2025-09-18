package defpackage;

import kotlin.KotlinVersion;

/* renamed from: zb0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C8393zb0 extends EZ implements InterfaceC6099nZ {
    public static final C8393zb0 a = new C8393zb0(1);

    @Override // defpackage.AbstractC8422zl, defpackage.InterfaceC1277Qd0
    public final String getName() {
        return "getDefaultReportLevelForAnnotation";
    }

    @Override // defpackage.AbstractC8422zl
    public final InterfaceC5733le0 getOwner() {
        return BP0.a.c(AbstractC3802fb0.class, "compiler.common.jvm");
    }

    @Override // defpackage.AbstractC8422zl
    public final String getSignature() {
        return "getDefaultReportLevelForAnnotation(Lorg/jetbrains/kotlin/name/FqName;)Lorg/jetbrains/kotlin/load/java/ReportLevel;";
    }

    @Override // defpackage.InterfaceC6099nZ
    public final Object invoke(Object obj) {
        KX kx = (KX) obj;
        O90.f(kx, "p0");
        KX kx2 = AbstractC3802fb0.a;
        InterfaceC0243Cw0.N0.getClass();
        N8 n8 = C0165Bw0.b;
        KotlinVersion kotlinVersion = new KotlinVersion(1, 7, 20);
        O90.f(n8, "configuredReportLevels");
        EnumC5694lR0 enumC5694lR0 = (EnumC5694lR0) ((C1766Wk0) n8.c).invoke(kx);
        if (enumC5694lR0 != null) {
            return enumC5694lR0;
        }
        N8 n82 = AbstractC3802fb0.c;
        n82.getClass();
        C3993gb0 c3993gb0 = (C3993gb0) ((C1766Wk0) n82.c).invoke(kx);
        if (c3993gb0 == null) {
            return EnumC5694lR0.b;
        }
        KotlinVersion kotlinVersion2 = c3993gb0.b;
        return (kotlinVersion2 == null || kotlinVersion2.compareTo(kotlinVersion) > 0) ? c3993gb0.a : c3993gb0.c;
    }
}
