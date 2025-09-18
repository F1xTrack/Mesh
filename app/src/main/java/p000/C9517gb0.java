package p000;

import kotlin.KotlinVersion;

/* renamed from: gb0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9517gb0 {

    /* renamed from: d */
    public static final C9517gb0 f27858d = new C9517gb0(EnumC10137lR0.f37060d, 6);

    /* renamed from: a */
    public final EnumC10137lR0 f27859a;

    /* renamed from: b */
    public final KotlinVersion f27860b;

    /* renamed from: c */
    public final EnumC10137lR0 f27861c;

    public C9517gb0(EnumC10137lR0 enumC10137lR0, KotlinVersion kotlinVersion, EnumC10137lR0 enumC10137lR02) {
        O90.m5968f(enumC10137lR02, "reportLevelAfter");
        this.f27859a = enumC10137lR0;
        this.f27860b = kotlinVersion;
        this.f27861c = enumC10137lR02;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9517gb0)) {
            return false;
        }
        C9517gb0 c9517gb0 = (C9517gb0) obj;
        return this.f27859a == c9517gb0.f27859a && O90.m5963a(this.f27860b, c9517gb0.f27860b) && this.f27861c == c9517gb0.f27861c;
    }

    public final int hashCode() {
        int iHashCode = this.f27859a.hashCode() * 31;
        KotlinVersion kotlinVersion = this.f27860b;
        return this.f27861c.hashCode() + ((iHashCode + (kotlinVersion == null ? 0 : kotlinVersion.getVersion())) * 31);
    }

    public final String toString() {
        return "JavaNullabilityAnnotationsStatus(reportLevelBefore=" + this.f27859a + ", sinceVersion=" + this.f27860b + ", reportLevelAfter=" + this.f27861c + ')';
    }

    public /* synthetic */ C9517gb0(EnumC10137lR0 enumC10137lR0, int i) {
        this(enumC10137lR0, (i & 2) != 0 ? new KotlinVersion(1, 0) : null, enumC10137lR0);
    }
}
