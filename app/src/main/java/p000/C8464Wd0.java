package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: Wd0 */
/* loaded from: classes2.dex */
public final class C8464Wd0 extends AbstractC8418Vg0 implements InterfaceC6434mZ {

    /* renamed from: e */
    public final /* synthetic */ int f13298e;

    /* renamed from: f */
    public final /* synthetic */ C8620Zd0 f13299f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8464Wd0(C8620Zd0 c8620Zd0, int i) {
        super(0);
        this.f13298e = i;
        this.f13299f = c8620Zd0;
    }

    @Override // p000.InterfaceC6434mZ
    public final Object invoke() {
        switch (this.f13298e) {
            case 0:
                C8620Zd0 c8620Zd0 = this.f13299f;
                c8620Zd0.getClass();
                InterfaceC10293mf0[] interfaceC10293mf0Arr = C8620Zd0.f15049o;
                InterfaceC10293mf0 interfaceC10293mf0 = interfaceC10293mf0Arr[13];
                Object objInvoke = c8620Zd0.f15060m.invoke();
                O90.m5967e(objInvoke, "getValue(...)");
                InterfaceC10293mf0 interfaceC10293mf02 = interfaceC10293mf0Arr[14];
                Object objInvoke2 = c8620Zd0.f15061n.invoke();
                O90.m5967e(objInvoke2, "getValue(...)");
                return AbstractC7167xu.m25968N((Collection) objInvoke, (Collection) objInvoke2);
            case 1:
                C8620Zd0 c8620Zd02 = this.f13299f;
                Collection collectionM9559a = c8620Zd02.m9559a();
                InterfaceC10293mf0 interfaceC10293mf03 = C8620Zd0.f15049o[11];
                Object objInvoke3 = c8620Zd02.f15058k.invoke();
                O90.m5967e(objInvoke3, "getValue(...)");
                return AbstractC7167xu.m25968N(collectionM9559a, (Collection) objInvoke3);
            case 2:
                C8620Zd0 c8620Zd03 = this.f13299f;
                c8620Zd03.getClass();
                InterfaceC10293mf0[] interfaceC10293mf0Arr2 = C8620Zd0.f15049o;
                InterfaceC10293mf0 interfaceC10293mf04 = interfaceC10293mf0Arr2[10];
                Object objInvoke4 = c8620Zd03.f15057j.invoke();
                O90.m5967e(objInvoke4, "getValue(...)");
                InterfaceC10293mf0 interfaceC10293mf05 = interfaceC10293mf0Arr2[12];
                Object objInvoke5 = c8620Zd03.f15059l.invoke();
                O90.m5967e(objInvoke5, "getValue(...)");
                return AbstractC7167xu.m25968N((Collection) objInvoke4, (Collection) objInvoke5);
            case 3:
                return AbstractC7589Fh1.m2752d(this.f13299f.m9560b());
            case 4:
                C8620Zd0 c8620Zd04 = this.f13299f;
                Collection collectionM9559a2 = c8620Zd04.m9559a();
                InterfaceC10293mf0 interfaceC10293mf06 = C8620Zd0.f15049o[10];
                Object objInvoke6 = c8620Zd04.f15057j.invoke();
                O90.m5967e(objInvoke6, "getValue(...)");
                return AbstractC7167xu.m25968N(collectionM9559a2, (Collection) objInvoke6);
            case 5:
                InterfaceC10059kq0 interfaceC10059kq0Mo1486I0 = this.f13299f.m9560b().mo1486I0();
                O90.m5967e(interfaceC10059kq0Mo1486I0, "getUnsubstitutedInnerClassesScope(...)");
                Collection collectionM26148a = AbstractC11797yQ1.m26148a(interfaceC10059kq0Mo1486I0, null, 3);
                ArrayList arrayList = new ArrayList();
                for (Object obj : collectionM26148a) {
                    if (!AbstractC6814sI.m24701m((InterfaceC0140CD) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    InterfaceC0140CD interfaceC0140CD = (InterfaceC0140CD) it.next();
                    InterfaceC6976us interfaceC6976us = interfaceC0140CD instanceof InterfaceC6976us ? (InterfaceC6976us) interfaceC0140CD : null;
                    Class clsM2759k = interfaceC6976us != null ? AbstractC7589Fh1.m2759k(interfaceC6976us) : null;
                    C9139de0 c9139de0 = clsM2759k != null ? new C9139de0(clsM2759k) : null;
                    if (c9139de0 != null) {
                        arrayList2.add(c9139de0);
                    }
                }
                return arrayList2;
            default:
                Collection<InterfaceC6976us> collectionMo1428J = this.f13299f.m9560b().mo1428J();
                O90.m5967e(collectionMo1428J, "getSealedSubclasses(...)");
                ArrayList arrayList3 = new ArrayList();
                for (InterfaceC6976us interfaceC6976us2 : collectionMo1428J) {
                    O90.m5966d(interfaceC6976us2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    Class clsM2759k2 = AbstractC7589Fh1.m2759k(interfaceC6976us2);
                    C9139de0 c9139de02 = clsM2759k2 != null ? new C9139de0(clsM2759k2) : null;
                    if (c9139de02 != null) {
                        arrayList3.add(c9139de02);
                    }
                }
                return arrayList3;
        }
    }
}
