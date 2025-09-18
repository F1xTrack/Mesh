package defpackage;

/* renamed from: t80, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7164t80 extends AbstractC1134Oh1 {
    public final C1559Tt0 a;
    public final Z01 b;

    public C7164t80(C1559Tt0 c1559Tt0, Z01 z01) {
        O90.f(z01, "underlyingType");
        this.a = c1559Tt0;
        this.b = z01;
    }

    @Override // defpackage.AbstractC1134Oh1
    public final boolean a(C1559Tt0 c1559Tt0) {
        return this.a.equals(c1559Tt0);
    }

    public final String toString() {
        return "InlineClassRepresentation(underlyingPropertyName=" + this.a + ", underlyingType=" + this.b + ')';
    }
}
