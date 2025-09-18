package p000;

import kotlin.KotlinVersion;

/* renamed from: Ab0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7316Ab0 {

    /* renamed from: c */
    public static final C7316Ab0 f269c;

    /* renamed from: a */
    public final C7942Mc0 f270a;

    /* renamed from: b */
    public final boolean f271b;

    static {
        C0664KX c0664kx = AbstractC9389fb0.f27250a;
        KotlinVersion kotlinVersion = KotlinVersion.CURRENT;
        O90.m5968f(kotlinVersion, "configuredKotlinVersion");
        C9517gb0 c9517gb0 = AbstractC9389fb0.f27253d;
        KotlinVersion kotlinVersion2 = c9517gb0.f27860b;
        EnumC10137lR0 enumC10137lR0 = (kotlinVersion2 == null || kotlinVersion2.compareTo(kotlinVersion) > 0) ? c9517gb0.f27859a : c9517gb0.f27861c;
        O90.m5968f(enumC10137lR0, "globalReportLevel");
        C7942Mc0 c7942Mc0 = new C7942Mc0(enumC10137lR0, enumC10137lR0 == EnumC10137lR0.f37059c ? null : enumC10137lR0);
        C11945zb0 c11945zb0 = C11945zb0.f46884a;
        f269c = new C7316Ab0(c7942Mc0);
    }

    public C7316Ab0(C7942Mc0 c7942Mc0) {
        C11945zb0 c11945zb0 = C11945zb0.f46884a;
        this.f270a = c7942Mc0;
        this.f271b = c7942Mc0.f7268d || c11945zb0.invoke(AbstractC9389fb0.f27250a) == EnumC10137lR0.f37058b;
    }

    public final String toString() {
        return "JavaTypeEnhancementState(jsr305=" + this.f270a + ", getReportLevelForAnnotation=" + C11945zb0.f46884a + ')';
    }
}
