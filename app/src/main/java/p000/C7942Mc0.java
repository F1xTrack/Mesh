package p000;

import java.util.Map;

/* renamed from: Mc0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7942Mc0 {

    /* renamed from: a */
    public final EnumC10137lR0 f7265a;

    /* renamed from: b */
    public final EnumC10137lR0 f7266b;

    /* renamed from: c */
    public final Map f7267c;

    /* renamed from: d */
    public final boolean f7268d;

    public C7942Mc0(EnumC10137lR0 enumC10137lR0, EnumC10137lR0 enumC10137lR02) {
        C0842NN c0842nn = C0842NN.f7735a;
        this.f7265a = enumC10137lR0;
        this.f7266b = enumC10137lR02;
        this.f7267c = c0842nn;
        AbstractC0705LB.m4915b(new C4090g1(28, this));
        EnumC10137lR0 enumC10137lR03 = EnumC10137lR0.f37058b;
        this.f7268d = enumC10137lR0 == enumC10137lR03 && enumC10137lR02 == enumC10137lR03;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7942Mc0)) {
            return false;
        }
        C7942Mc0 c7942Mc0 = (C7942Mc0) obj;
        return this.f7265a == c7942Mc0.f7265a && this.f7266b == c7942Mc0.f7266b && O90.m5963a(this.f7267c, c7942Mc0.f7267c);
    }

    public final int hashCode() {
        int iHashCode = this.f7265a.hashCode() * 31;
        EnumC10137lR0 enumC10137lR0 = this.f7266b;
        return this.f7267c.hashCode() + ((iHashCode + (enumC10137lR0 == null ? 0 : enumC10137lR0.hashCode())) * 31);
    }

    public final String toString() {
        return "Jsr305Settings(globalLevel=" + this.f7265a + ", migrationLevel=" + this.f7266b + ", userDefinedLevelForSpecificAnnotation=" + this.f7267c + ')';
    }
}
