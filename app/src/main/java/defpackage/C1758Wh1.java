package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: Wh1 */
/* loaded from: classes2.dex */
public class C1758Wh1 extends AbstractC3824fi1 implements InterfaceC2464cA0, InterfaceC3633ei1 {
    public final int g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final AbstractC0663Ig0 k;
    public final C1758Wh1 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1758Wh1(InterfaceC7662vl interfaceC7662vl, C1758Wh1 c1758Wh1, int i, I5 i5, C1559Tt0 c1559Tt0, AbstractC0663Ig0 abstractC0663Ig0, boolean z, boolean z2, boolean z3, AbstractC0663Ig0 abstractC0663Ig02, W21 w21) {
        super(interfaceC7662vl, i5, c1559Tt0, abstractC0663Ig0, w21);
        O90.f(interfaceC7662vl, "containingDeclaration");
        O90.f(i5, "annotations");
        O90.f(c1559Tt0, "name");
        O90.f(abstractC0663Ig0, "outType");
        O90.f(w21, "source");
        this.g = i;
        this.h = z;
        this.i = z2;
        this.j = z3;
        this.k = abstractC0663Ig02;
        this.l = c1758Wh1 == null ? this : c1758Wh1;
    }

    @Override // defpackage.FD, defpackage.CD
    /* renamed from: A1 */
    public final InterfaceC7662vl i() {
        CD cdI = super.i();
        O90.d(cdI, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
        return (InterfaceC7662vl) cdI;
    }

    @Override // defpackage.FD
    /* renamed from: B1 */
    public final C1758Wh1 x1() {
        C1758Wh1 c1758Wh1 = this.l;
        return c1758Wh1 == this ? this : c1758Wh1.x1();
    }

    @Override // defpackage.InterfaceC3633ei1
    public final /* bridge */ /* synthetic */ AbstractC0323Dx Y() {
        return null;
    }

    @Override // defpackage.CD
    public final Object Z(GD gd, Object obj) {
        return gd.e(this, obj);
    }

    @Override // defpackage.R51
    public final ED b(C7833we1 c7833we1) {
        O90.f(c7833we1, "substitutor");
        if (c7833we1.a.e()) {
            return this;
        }
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.HD, defpackage.InterfaceC2400bq0
    public final C7575vI getVisibility() {
        C7575vI c7575vI = AbstractC7765wI.f;
        O90.e(c7575vI, "LOCAL");
        return c7575vI;
    }

    @Override // defpackage.InterfaceC7662vl
    public final Collection j() {
        Collection collectionJ = i().j();
        O90.e(collectionJ, "getOverriddenDescriptors(...)");
        Collection collection = collectionJ;
        ArrayList arrayList = new ArrayList(AbstractC8449zu.k(collection));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add((C1758Wh1) ((InterfaceC7662vl) it.next()).f0().get(this.g));
        }
        return arrayList;
    }

    @Override // defpackage.InterfaceC3633ei1
    public final boolean s0() {
        return false;
    }

    public C1758Wh1 y1(DZ dz, C1559Tt0 c1559Tt0, int i) {
        I5 annotations = getAnnotations();
        O90.e(annotations, "<get-annotations>(...)");
        AbstractC0663Ig0 type = getType();
        O90.e(type, "getType(...)");
        boolean zZ1 = z1();
        C0162Bv0 c0162Bv0 = W21.O0;
        return new C1758Wh1(dz, null, i, annotations, c1559Tt0, type, zZ1, this.i, this.j, this.k, c0162Bv0);
    }

    public final boolean z1() {
        return this.h && ((InterfaceC8042xl) i()).l() != 2;
    }
}
