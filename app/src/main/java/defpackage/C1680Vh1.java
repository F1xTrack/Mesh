package defpackage;

/* renamed from: Vh1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1680Vh1 extends C1758Wh1 {
    public final F71 m;

    public C1680Vh1(AZ az, C1758Wh1 c1758Wh1, int i, I5 i5, C1559Tt0 c1559Tt0, AbstractC0663Ig0 abstractC0663Ig0, boolean z, boolean z2, boolean z3, AbstractC0663Ig0 abstractC0663Ig02, W21 w21, InterfaceC5908mZ interfaceC5908mZ) {
        super(az, c1758Wh1, i, i5, c1559Tt0, abstractC0663Ig0, z, z2, z3, abstractC0663Ig02, w21);
        this.m = LB.b(interfaceC5908mZ);
    }

    @Override // defpackage.C1758Wh1
    public final C1758Wh1 y1(DZ dz, C1559Tt0 c1559Tt0, int i) {
        I5 annotations = getAnnotations();
        O90.e(annotations, "<get-annotations>(...)");
        AbstractC0663Ig0 type = getType();
        O90.e(type, "getType(...)");
        boolean zZ1 = z1();
        C0162Bv0 c0162Bv0 = W21.O0;
        S51 s51 = new S51(3, this);
        return new C1680Vh1(dz, null, i, annotations, c1559Tt0, type, zZ1, this.i, this.j, this.k, c0162Bv0, s51);
    }
}
