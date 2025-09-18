package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: Wh1 */
/* loaded from: classes2.dex */
public class C8473Wh1 extends AbstractC9404fi1 implements InterfaceC8946cA0, InterfaceC9276ei1 {

    /* renamed from: g */
    public final int f13323g;

    /* renamed from: h */
    public final boolean f13324h;

    /* renamed from: i */
    public final boolean f13325i;

    /* renamed from: j */
    public final boolean f13326j;

    /* renamed from: k */
    public final AbstractC7742Ig0 f13327k;

    /* renamed from: l */
    public final C8473Wh1 f13328l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8473Wh1(InterfaceC7032vl interfaceC7032vl, C8473Wh1 c8473Wh1, int i, InterfaceC0510I5 interfaceC0510I5, C8340Tt0 c8340Tt0, AbstractC7742Ig0 abstractC7742Ig0, boolean z, boolean z2, boolean z3, AbstractC7742Ig0 abstractC7742Ig02, W21 w21) {
        super(interfaceC7032vl, interfaceC0510I5, c8340Tt0, abstractC7742Ig0, w21);
        O90.m5968f(interfaceC7032vl, "containingDeclaration");
        O90.m5968f(interfaceC0510I5, "annotations");
        O90.m5968f(c8340Tt0, "name");
        O90.m5968f(abstractC7742Ig0, "outType");
        O90.m5968f(w21, "source");
        this.f13323g = i;
        this.f13324h = z;
        this.f13325i = z2;
        this.f13326j = z3;
        this.f13327k = abstractC7742Ig02;
        this.f13328l = c8473Wh1 == null ? this : c8473Wh1;
    }

    @Override // p000.AbstractC0329FD, p000.InterfaceC0140CD
    /* renamed from: A1 */
    public final InterfaceC7032vl mo423i() {
        InterfaceC0140CD interfaceC0140CDMo423i = super.mo423i();
        O90.m5966d(interfaceC0140CDMo423i, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
        return (InterfaceC7032vl) interfaceC0140CDMo423i;
    }

    @Override // p000.AbstractC0329FD
    /* renamed from: B1 */
    public final C8473Wh1 mo2089x1() {
        C8473Wh1 c8473Wh1 = this.f13328l;
        return c8473Wh1 == this ? this : c8473Wh1.mo2089x1();
    }

    @Override // p000.InterfaceC9276ei1
    /* renamed from: Y */
    public final /* bridge */ /* synthetic */ AbstractC0249Dx mo2086Y() {
        return null;
    }

    @Override // p000.InterfaceC0140CD
    /* renamed from: Z */
    public final Object mo421Z(InterfaceC0392GD interfaceC0392GD, Object obj) {
        return interfaceC0392GD.mo2842e(this, obj);
    }

    @Override // p000.R51
    /* renamed from: b */
    public final InterfaceC0266ED mo114b(C11571we1 c11571we1) {
        O90.m5968f(c11571we1, "substitutor");
        if (c11571we1.f45011a.mo7050e()) {
            return this;
        }
        throw new UnsupportedOperationException();
    }

    @Override // p000.InterfaceC0455HD, p000.InterfaceC8902bq0
    public final C7003vI getVisibility() {
        C7003vI c7003vI = AbstractC7066wI.f44765f;
        O90.m5967e(c7003vI, "LOCAL");
        return c7003vI;
    }

    @Override // p000.InterfaceC7032vl
    /* renamed from: j */
    public final Collection mo1222j() {
        Collection collectionMo1222j = mo423i().mo1222j();
        O90.m5967e(collectionMo1222j, "getOverriddenDescriptors(...)");
        Collection collection = collectionMo1222j;
        ArrayList arrayList = new ArrayList(AbstractC7293zu.m26586k(collection));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add((C8473Wh1) ((InterfaceC7032vl) it.next()).mo1221f0().get(this.f13323g));
        }
        return arrayList;
    }

    @Override // p000.InterfaceC9276ei1
    /* renamed from: s0 */
    public final boolean mo2087s0() {
        return false;
    }

    /* renamed from: y1 */
    public C8473Wh1 mo8540y1(C0225DZ c0225dz, C8340Tt0 c8340Tt0, int i) {
        InterfaceC0510I5 annotations = getAnnotations();
        O90.m5967e(annotations, "<get-annotations>(...)");
        AbstractC7742Ig0 type = getType();
        O90.m5967e(type, "getType(...)");
        boolean zM8832z1 = m8832z1();
        C7408Bv0 c7408Bv0 = W21.f12940O0;
        return new C8473Wh1(c0225dz, null, i, annotations, c8340Tt0, type, zM8832z1, this.f13325i, this.f13326j, this.f13327k, c7408Bv0);
    }

    /* renamed from: z1 */
    public final boolean m8832z1() {
        return this.f13324h && ((InterfaceC7158xl) mo423i()).mo116l() != 2;
    }
}
