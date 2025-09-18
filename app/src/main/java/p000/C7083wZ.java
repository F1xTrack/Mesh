package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: wZ */
/* loaded from: classes2.dex */
public final class C7083wZ extends AbstractC0189D {

    /* renamed from: l */
    public static final C0055As f44957l = new C0055As(AbstractC10732q41.f40588l, C8340Tt0.m7798e("Function"));

    /* renamed from: m */
    public static final C0055As f44958m = new C0055As(AbstractC10732q41.f40585i, C8340Tt0.m7798e("KFunction"));

    /* renamed from: e */
    public final C8582Yk0 f44959e;

    /* renamed from: f */
    public final C1493Xj f44960f;

    /* renamed from: g */
    public final AbstractC0666KZ f44961g;

    /* renamed from: h */
    public final int f44962h;

    /* renamed from: i */
    public final C7020vZ f44963i;

    /* renamed from: j */
    public final C7209yZ f44964j;

    /* renamed from: k */
    public final List f44965k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7083wZ(C8582Yk0 c8582Yk0, C1493Xj c1493Xj, AbstractC0666KZ abstractC0666KZ, int i) {
        super(c8582Yk0, abstractC0666KZ.m4673a(i));
        O90.m5968f(c1493Xj, "containingDeclaration");
        this.f44959e = c8582Yk0;
        this.f44960f = c1493Xj;
        this.f44961g = abstractC0666KZ;
        this.f44962h = i;
        this.f44963i = new C7020vZ(this);
        this.f44964j = new C7209yZ(c8582Yk0, this);
        ArrayList arrayList = new ArrayList();
        C9461g90 c9461g90 = new C9461g90(1, i, 1);
        ArrayList arrayList2 = new ArrayList(AbstractC7293zu.m26586k(c9461g90));
        Iterator it = c9461g90.iterator();
        while (((C9333f90) it).f27092c) {
            int iM18193a = ((C9333f90) it).m18193a();
            arrayList.add(C10420ne1.m23157B1(this, EnumC9532gi1.f27948d, C8340Tt0.m7798e("P" + iM18193a), arrayList.size(), this.f44959e));
            arrayList2.add(C8313Tf1.f11463a);
        }
        arrayList.add(C10420ne1.m23157B1(this, EnumC9532gi1.f27949e, C8340Tt0.m7798e("R"), arrayList.size(), this.f44959e));
        this.f44965k = AbstractC7167xu.m25982b0(arrayList);
        OL0 ol0 = EnumC7146xZ.f45677a;
        AbstractC0666KZ abstractC0666KZ2 = this.f44961g;
        ol0.getClass();
        O90.m5968f(abstractC0666KZ2, "functionTypeKind");
        if (abstractC0666KZ2.equals(C0414GZ.f3802c) || abstractC0666KZ2.equals(C0603JZ.f5603c) || abstractC0666KZ2.equals(C0477HZ.f4350c)) {
            return;
        }
        abstractC0666KZ2.equals(C0540IZ.f4983c);
    }

    @Override // p000.InterfaceC6976us
    /* renamed from: A */
    public final boolean mo1427A() {
        return false;
    }

    @Override // p000.InterfaceC6976us
    /* renamed from: J */
    public final /* bridge */ /* synthetic */ Collection mo1428J() {
        return C0779MN.f7117a;
    }

    @Override // p000.InterfaceC6976us
    /* renamed from: J0 */
    public final AbstractC8057Oh1 mo1429J0() {
        return null;
    }

    @Override // p000.InterfaceC6976us
    /* renamed from: K */
    public final boolean mo1430K() {
        return false;
    }

    @Override // p000.InterfaceC8902bq0
    /* renamed from: M */
    public final boolean mo111M() {
        return false;
    }

    @Override // p000.InterfaceC0936Os
    /* renamed from: N */
    public final boolean mo1431N() {
        return false;
    }

    @Override // p000.InterfaceC8902bq0
    /* renamed from: Q0 */
    public final boolean mo112Q0() {
        return false;
    }

    @Override // p000.InterfaceC6976us
    /* renamed from: V */
    public final /* bridge */ /* synthetic */ C6707qs mo1432V() {
        return null;
    }

    @Override // p000.InterfaceC6976us
    /* renamed from: W */
    public final /* bridge */ /* synthetic */ InterfaceC10059kq0 mo1433W() {
        return C9931jq0.f35419b;
    }

    @Override // p000.InterfaceC6976us
    /* renamed from: X0 */
    public final boolean mo1434X0() {
        return false;
    }

    @Override // p000.InterfaceC0266ED
    /* renamed from: e */
    public final W21 mo422e() {
        return W21.f12940O0;
    }

    @Override // p000.InterfaceC6976us, p000.InterfaceC8902bq0
    /* renamed from: f */
    public final EnumC10575os0 mo115f() {
        return EnumC10575os0.f39326e;
    }

    @Override // p000.InterfaceC6976us
    /* renamed from: g */
    public final /* bridge */ /* synthetic */ Collection mo1435g() {
        return C0779MN.f7117a;
    }

    @Override // p000.InterfaceC6595p5
    public final InterfaceC0510I5 getAnnotations() {
        return S20.f10539b;
    }

    @Override // p000.InterfaceC6976us, p000.InterfaceC0455HD, p000.InterfaceC8902bq0
    public final C7003vI getVisibility() {
        C7003vI c7003vI = AbstractC7066wI.f44764e;
        O90.m5967e(c7003vI, "PUBLIC");
        return c7003vI;
    }

    @Override // p000.InterfaceC0140CD
    /* renamed from: i */
    public final InterfaceC0140CD mo423i() {
        return this.f44960f;
    }

    @Override // p000.InterfaceC8902bq0
    public final boolean isExternal() {
        return false;
    }

    @Override // p000.InterfaceC6976us
    public final boolean isInline() {
        return false;
    }

    @Override // p000.InterfaceC6976us
    /* renamed from: l */
    public final EnumC0118Bs mo1436l() {
        return EnumC0118Bs.f1061b;
    }

    @Override // p000.AbstractC11725xs0
    /* renamed from: n */
    public final InterfaceC10059kq0 mo1437n(C8054Og0 c8054Og0) {
        return this.f44964j;
    }

    @Override // p000.InterfaceC6976us, p000.InterfaceC0936Os
    /* renamed from: o */
    public final List mo1438o() {
        return this.f44965k;
    }

    public final String toString() {
        String strM7801b = getName().m7801b();
        O90.m5967e(strM7801b, "asString(...)");
        return strM7801b;
    }

    @Override // p000.InterfaceC0873Ns
    /* renamed from: v */
    public final InterfaceC8101Pd1 mo1439v() {
        return this.f44963i;
    }

    @Override // p000.InterfaceC6976us
    /* renamed from: w */
    public final boolean mo1440w() {
        return false;
    }
}
