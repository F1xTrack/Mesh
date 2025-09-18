package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: Wd0 */
/* loaded from: classes2.dex */
public final class C1745Wd0 extends AbstractC1676Vg0 implements InterfaceC5908mZ {
    public final /* synthetic */ int e;
    public final /* synthetic */ C1979Zd0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1745Wd0(C1979Zd0 c1979Zd0, int i) {
        super(0);
        this.e = i;
        this.f = c1979Zd0;
    }

    @Override // defpackage.InterfaceC5908mZ
    public final Object invoke() {
        switch (this.e) {
            case 0:
                C1979Zd0 c1979Zd0 = this.f;
                c1979Zd0.getClass();
                InterfaceC5927mf0[] interfaceC5927mf0Arr = C1979Zd0.o;
                InterfaceC5927mf0 interfaceC5927mf0 = interfaceC5927mf0Arr[13];
                Object objInvoke = c1979Zd0.m.invoke();
                O90.e(objInvoke, "getValue(...)");
                InterfaceC5927mf0 interfaceC5927mf02 = interfaceC5927mf0Arr[14];
                Object objInvoke2 = c1979Zd0.n.invoke();
                O90.e(objInvoke2, "getValue(...)");
                return AbstractC8069xu.N((Collection) objInvoke, (Collection) objInvoke2);
            case 1:
                C1979Zd0 c1979Zd02 = this.f;
                Collection collectionA = c1979Zd02.a();
                InterfaceC5927mf0 interfaceC5927mf03 = C1979Zd0.o[11];
                Object objInvoke3 = c1979Zd02.k.invoke();
                O90.e(objInvoke3, "getValue(...)");
                return AbstractC8069xu.N(collectionA, (Collection) objInvoke3);
            case 2:
                C1979Zd0 c1979Zd03 = this.f;
                c1979Zd03.getClass();
                InterfaceC5927mf0[] interfaceC5927mf0Arr2 = C1979Zd0.o;
                InterfaceC5927mf0 interfaceC5927mf04 = interfaceC5927mf0Arr2[10];
                Object objInvoke4 = c1979Zd03.j.invoke();
                O90.e(objInvoke4, "getValue(...)");
                InterfaceC5927mf0 interfaceC5927mf05 = interfaceC5927mf0Arr2[12];
                Object objInvoke5 = c1979Zd03.l.invoke();
                O90.e(objInvoke5, "getValue(...)");
                return AbstractC8069xu.N((Collection) objInvoke4, (Collection) objInvoke5);
            case 3:
                return AbstractC0433Fh1.d(this.f.b());
            case 4:
                C1979Zd0 c1979Zd04 = this.f;
                Collection collectionA2 = c1979Zd04.a();
                InterfaceC5927mf0 interfaceC5927mf06 = C1979Zd0.o[10];
                Object objInvoke6 = c1979Zd04.j.invoke();
                O90.e(objInvoke6, "getValue(...)");
                return AbstractC8069xu.N(collectionA2, (Collection) objInvoke6);
            case 5:
                InterfaceC5578kq0 interfaceC5578kq0I0 = this.f.b().I0();
                O90.e(interfaceC5578kq0I0, "getUnsubstitutedInnerClassesScope(...)");
                Collection collectionA3 = AbstractC8171yQ1.a(interfaceC5578kq0I0, null, 3);
                ArrayList arrayList = new ArrayList();
                for (Object obj : collectionA3) {
                    if (!AbstractC7002sI.m((CD) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    CD cd = (CD) it.next();
                    InterfaceC7492us interfaceC7492us = cd instanceof InterfaceC7492us ? (InterfaceC7492us) cd : null;
                    Class clsK = interfaceC7492us != null ? AbstractC0433Fh1.k(interfaceC7492us) : null;
                    C3430de0 c3430de0 = clsK != null ? new C3430de0(clsK) : null;
                    if (c3430de0 != null) {
                        arrayList2.add(c3430de0);
                    }
                }
                return arrayList2;
            default:
                Collection<InterfaceC7492us> collectionJ = this.f.b().J();
                O90.e(collectionJ, "getSealedSubclasses(...)");
                ArrayList arrayList3 = new ArrayList();
                for (InterfaceC7492us interfaceC7492us2 : collectionJ) {
                    O90.d(interfaceC7492us2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    Class clsK2 = AbstractC0433Fh1.k(interfaceC7492us2);
                    C3430de0 c3430de02 = clsK2 != null ? new C3430de0(clsK2) : null;
                    if (c3430de02 != null) {
                        arrayList3.add(c3430de02);
                    }
                }
                return arrayList3;
        }
    }
}
