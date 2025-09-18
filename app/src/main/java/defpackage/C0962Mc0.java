package defpackage;

import java.util.Map;

/* renamed from: Mc0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0962Mc0 {
    public final EnumC5694lR0 a;
    public final EnumC5694lR0 b;
    public final Map c;
    public final boolean d;

    public C0962Mc0(EnumC5694lR0 enumC5694lR0, EnumC5694lR0 enumC5694lR02) {
        NN nn = NN.a;
        this.a = enumC5694lR0;
        this.b = enumC5694lR02;
        this.c = nn;
        LB.b(new C3881g1(28, this));
        EnumC5694lR0 enumC5694lR03 = EnumC5694lR0.b;
        this.d = enumC5694lR0 == enumC5694lR03 && enumC5694lR02 == enumC5694lR03;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0962Mc0)) {
            return false;
        }
        C0962Mc0 c0962Mc0 = (C0962Mc0) obj;
        return this.a == c0962Mc0.a && this.b == c0962Mc0.b && O90.a(this.c, c0962Mc0.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        EnumC5694lR0 enumC5694lR0 = this.b;
        return this.c.hashCode() + ((iHashCode + (enumC5694lR0 == null ? 0 : enumC5694lR0.hashCode())) * 31);
    }

    public final String toString() {
        return "Jsr305Settings(globalLevel=" + this.a + ", migrationLevel=" + this.b + ", userDefinedLevelForSpecificAnnotation=" + this.c + ')';
    }
}
