package defpackage;

import kotlin.KotlinVersion;

/* renamed from: gb0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3993gb0 {
    public static final C3993gb0 d = new C3993gb0(EnumC5694lR0.d, 6);
    public final EnumC5694lR0 a;
    public final KotlinVersion b;
    public final EnumC5694lR0 c;

    public C3993gb0(EnumC5694lR0 enumC5694lR0, KotlinVersion kotlinVersion, EnumC5694lR0 enumC5694lR02) {
        O90.f(enumC5694lR02, "reportLevelAfter");
        this.a = enumC5694lR0;
        this.b = kotlinVersion;
        this.c = enumC5694lR02;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3993gb0)) {
            return false;
        }
        C3993gb0 c3993gb0 = (C3993gb0) obj;
        return this.a == c3993gb0.a && O90.a(this.b, c3993gb0.b) && this.c == c3993gb0.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        KotlinVersion kotlinVersion = this.b;
        return this.c.hashCode() + ((iHashCode + (kotlinVersion == null ? 0 : kotlinVersion.getVersion())) * 31);
    }

    public final String toString() {
        return "JavaNullabilityAnnotationsStatus(reportLevelBefore=" + this.a + ", sinceVersion=" + this.b + ", reportLevelAfter=" + this.c + ')';
    }

    public /* synthetic */ C3993gb0(EnumC5694lR0 enumC5694lR0, int i) {
        this(enumC5694lR0, (i & 2) != 0 ? new KotlinVersion(1, 0) : null, enumC5694lR0);
    }
}
