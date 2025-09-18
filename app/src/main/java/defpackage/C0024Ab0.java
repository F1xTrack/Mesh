package defpackage;

import kotlin.KotlinVersion;

/* renamed from: Ab0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0024Ab0 {
    public static final C0024Ab0 c;
    public final C0962Mc0 a;
    public final boolean b;

    static {
        KX kx = AbstractC3802fb0.a;
        KotlinVersion kotlinVersion = KotlinVersion.CURRENT;
        O90.f(kotlinVersion, "configuredKotlinVersion");
        C3993gb0 c3993gb0 = AbstractC3802fb0.d;
        KotlinVersion kotlinVersion2 = c3993gb0.b;
        EnumC5694lR0 enumC5694lR0 = (kotlinVersion2 == null || kotlinVersion2.compareTo(kotlinVersion) > 0) ? c3993gb0.a : c3993gb0.c;
        O90.f(enumC5694lR0, "globalReportLevel");
        C0962Mc0 c0962Mc0 = new C0962Mc0(enumC5694lR0, enumC5694lR0 == EnumC5694lR0.c ? null : enumC5694lR0);
        C8393zb0 c8393zb0 = C8393zb0.a;
        c = new C0024Ab0(c0962Mc0);
    }

    public C0024Ab0(C0962Mc0 c0962Mc0) {
        C8393zb0 c8393zb0 = C8393zb0.a;
        this.a = c0962Mc0;
        this.b = c0962Mc0.d || c8393zb0.invoke(AbstractC3802fb0.a) == EnumC5694lR0.b;
    }

    public final String toString() {
        return "JavaTypeEnhancementState(jsr305=" + this.a + ", getReportLevelForAnnotation=" + C8393zb0.a + ')';
    }
}
