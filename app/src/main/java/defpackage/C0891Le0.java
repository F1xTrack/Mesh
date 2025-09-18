package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;

/* renamed from: Le0 */
/* loaded from: classes2.dex */
public final class C0891Le0 extends AbstractC1676Vg0 implements InterfaceC5908mZ {
    public final /* synthetic */ int e;
    public final /* synthetic */ C0968Me0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0891Le0(C0968Me0 c0968Me0, int i) {
        super(0);
        this.e = i;
        this.f = c0968Me0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v7 */
    @Override // defpackage.InterfaceC5908mZ
    public final Object invoke() {
        String[] strArr;
        ?? E;
        switch (this.e) {
            case 0:
                C0968Me0 c0968Me0 = this.f;
                c0968Me0.getClass();
                InterfaceC5927mf0 interfaceC5927mf0 = C0968Me0.g[0];
                C7977xP0 c7977xP0 = (C7977xP0) c0968Me0.c.invoke();
                if (c7977xP0 == null) {
                    return null;
                }
                C5350je c5350je = c7977xP0.b;
                String[] strArr2 = (String[]) c5350je.f;
                if (strArr2 == null || (strArr = (String[]) c5350je.h) == null) {
                    return null;
                }
                Pair pairH = C0732Jd0.h(strArr2, strArr);
                return new C3809fd1((C6303od0) pairH.a, (C5849mF0) pairH.b, (C6112nd0) c5350je.e);
            default:
                C0968Me0 c0968Me02 = this.f;
                c0968Me02.getClass();
                InterfaceC5927mf0 interfaceC5927mf02 = C0968Me0.g[0];
                C7977xP0 c7977xP02 = (C7977xP0) c0968Me02.c.invoke();
                if (c7977xP02 == null) {
                    return C5387jq0.b;
                }
                InterfaceC5927mf0 interfaceC5927mf03 = AbstractC5924me0.b[0];
                Object objInvoke = c0968Me02.a.invoke();
                O90.e(objInvoke, "getValue(...)");
                C5772lr0 c5772lr0 = ((C5894mU0) objInvoke).b;
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) c5772lr0.d;
                Class cls = c7977xP02.a;
                C0074As c0074AsA = VO0.a(cls);
                Object obj = concurrentHashMap.get(c0074AsA);
                if (obj == null) {
                    KX kxG = VO0.a(cls).g();
                    O90.e(kxG, "getPackageFqName(...)");
                    C5350je c5350je2 = c7977xP02.b;
                    EnumC0039Ag0 enumC0039Ag0 = EnumC0039Ag0.h;
                    LI li = (LI) c5772lr0.b;
                    EnumC0039Ag0 enumC0039Ag02 = (EnumC0039Ag0) c5350je2.d;
                    if (enumC0039Ag02 == enumC0039Ag0) {
                        String[] strArr3 = enumC0039Ag02 == enumC0039Ag0 ? (String[]) c5350je2.f : null;
                        List listC = strArr3 != null ? J8.c(strArr3) : null;
                        if (listC == null) {
                            listC = MN.a;
                        }
                        E = new ArrayList();
                        Iterator it = listC.iterator();
                        while (it.hasNext()) {
                            C0074As c0074AsJ = C0074As.j(new KX(C3427dd0.d((String) it.next()).a.replace('/', '.')));
                            O90.f(li.c().c, "<this>");
                            C7977xP0 c7977xP0D = AbstractC6960s4.d((C1562Tu0) c5772lr0.c, c0074AsJ, C6112nd0.g);
                            if (c7977xP0D != null) {
                                E.add(c7977xP0D);
                            }
                        }
                    } else {
                        E = AbstractC8259yu.e(c7977xP02);
                    }
                    ON on = new ON(li.c().b, kxG, 0);
                    ArrayList arrayList = new ArrayList();
                    Iterator it2 = ((Iterable) E).iterator();
                    while (it2.hasNext()) {
                        SI siA = li.a(on, (C7977xP0) it2.next());
                        if (siA != null) {
                            arrayList.add(siA);
                        }
                    }
                    InterfaceC5578kq0 interfaceC5578kq0B = AbstractC8367zS1.b("package " + kxG + " (" + c7977xP02 + ')', AbstractC8069xu.b0(arrayList));
                    Object objPutIfAbsent = concurrentHashMap.putIfAbsent(c0074AsA, interfaceC5578kq0B);
                    obj = objPutIfAbsent == null ? interfaceC5578kq0B : objPutIfAbsent;
                }
                O90.e(obj, "getOrPut(...)");
                return (InterfaceC5578kq0) obj;
        }
    }
}
