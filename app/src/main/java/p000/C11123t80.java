package p000;

/* renamed from: t80, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11123t80 extends AbstractC8057Oh1 {

    /* renamed from: a */
    public final C8340Tt0 f42881a;

    /* renamed from: b */
    public final Z01 f42882b;

    public C11123t80(C8340Tt0 c8340Tt0, Z01 z01) {
        O90.m5968f(z01, "underlyingType");
        this.f42881a = c8340Tt0;
        this.f42882b = z01;
    }

    @Override // p000.AbstractC8057Oh1
    /* renamed from: a */
    public final boolean mo6116a(C8340Tt0 c8340Tt0) {
        return this.f42881a.equals(c8340Tt0);
    }

    public final String toString() {
        return "InlineClassRepresentation(underlyingPropertyName=" + this.f42881a + ", underlyingType=" + this.f42882b + ')';
    }
}
