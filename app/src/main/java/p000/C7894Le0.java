package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;

/* renamed from: Le0 */
/* loaded from: classes2.dex */
public final class C7894Le0 extends AbstractC8418Vg0 implements InterfaceC6434mZ {

    /* renamed from: e */
    public final /* synthetic */ int f6776e;

    /* renamed from: f */
    public final /* synthetic */ C7946Me0 f6777f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7894Le0(C7946Me0 c7946Me0, int i) {
        super(0);
        this.f6776e = i;
        this.f6777f = c7946Me0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v7 */
    @Override // p000.InterfaceC6434mZ
    public final Object invoke() {
        String[] strArr;
        ?? M26274e;
        switch (this.f6776e) {
            case 0:
                C7946Me0 c7946Me0 = this.f6777f;
                c7946Me0.getClass();
                InterfaceC10293mf0 interfaceC10293mf0 = C7946Me0.f7280g[0];
                C11667xP0 c11667xP0 = (C11667xP0) c7946Me0.f7281c.invoke();
                if (c11667xP0 == null) {
                    return null;
                }
                C6250je c6250je = c11667xP0.f45573b;
                String[] strArr2 = (String[]) c6250je.f35301f;
                if (strArr2 == null || (strArr = (String[]) c6250je.f35303h) == null) {
                    return null;
                }
                Pair pairM4377h = C7788Jd0.m4377h(strArr2, strArr);
                return new C9394fd1((C10545od0) pairM4377h.f36702a, (C10241mF0) pairM4377h.f36703b, (C10417nd0) c6250je.f35300e);
            default:
                C7946Me0 c7946Me02 = this.f6777f;
                c7946Me02.getClass();
                InterfaceC10293mf0 interfaceC10293mf02 = C7946Me0.f7280g[0];
                C11667xP0 c11667xP02 = (C11667xP0) c7946Me02.f7281c.invoke();
                if (c11667xP02 == null) {
                    return C9931jq0.f35419b;
                }
                InterfaceC10293mf0 interfaceC10293mf03 = AbstractC10291me0.f37814b[0];
                Object objInvoke = c7946Me02.f37815a.invoke();
                O90.m5967e(objInvoke, "getValue(...)");
                C10189lr0 c10189lr0 = ((C10271mU0) objInvoke).f37727b;
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) c10189lr0.f37325d;
                Class cls = c11667xP02.f45572a;
                C0055As c0055AsM8433a = VO0.m8433a(cls);
                Object obj = concurrentHashMap.get(c0055AsM8433a);
                if (obj == null) {
                    C0664KX c0664kxM363g = VO0.m8433a(cls).m363g();
                    O90.m5967e(c0664kxM363g, "getPackageFqName(...)");
                    C6250je c6250je2 = c11667xP02.f45573b;
                    EnumC7326Ag0 enumC7326Ag0 = EnumC7326Ag0.f329h;
                    C0712LI c0712li = (C0712LI) c10189lr0.f37323b;
                    EnumC7326Ag0 enumC7326Ag02 = (EnumC7326Ag0) c6250je2.f35299d;
                    if (enumC7326Ag02 == enumC7326Ag0) {
                        String[] strArr3 = enumC7326Ag02 == enumC7326Ag0 ? (String[]) c6250je2.f35301f : null;
                        List listM4176c = strArr3 != null ? AbstractC0576J8.m4176c(strArr3) : null;
                        if (listM4176c == null) {
                            listM4176c = C0779MN.f7117a;
                        }
                        M26274e = new ArrayList();
                        Iterator it = listM4176c.iterator();
                        while (it.hasNext()) {
                            C0055As c0055AsM358j = C0055As.m358j(new C0664KX(C9137dd0.m17717d((String) it.next()).f26169a.replace('/', '.')));
                            O90.m5968f(c0712li.m4944c().f45520c, "<this>");
                            C11667xP0 c11667xP0M24605d = AbstractC6800s4.m24605d((C8342Tu0) c10189lr0.f37324c, c0055AsM358j, C10417nd0.f38414g);
                            if (c11667xP0M24605d != null) {
                                M26274e.add(c11667xP0M24605d);
                            }
                        }
                    } else {
                        M26274e = AbstractC7230yu.m26274e(c11667xP02);
                    }
                    C0905ON c0905on = new C0905ON(c0712li.m4944c().f45519b, c0664kxM363g, 0);
                    ArrayList arrayList = new ArrayList();
                    Iterator it2 = ((Iterable) M26274e).iterator();
                    while (it2.hasNext()) {
                        C1151SI c1151siM4942a = c0712li.m4942a(c0905on, (C11667xP0) it2.next());
                        if (c1151siM4942a != null) {
                            arrayList.add(c1151siM4942a);
                        }
                    }
                    InterfaceC10059kq0 interfaceC10059kq0M26441b = AbstractC11928zS1.m26441b("package " + c0664kxM363g + " (" + c11667xP02 + ')', AbstractC7167xu.m25982b0(arrayList));
                    Object objPutIfAbsent = concurrentHashMap.putIfAbsent(c0055AsM8433a, interfaceC10059kq0M26441b);
                    obj = objPutIfAbsent == null ? interfaceC10059kq0M26441b : objPutIfAbsent;
                }
                O90.m5967e(obj, "getOrPut(...)");
                return (InterfaceC10059kq0) obj;
        }
    }
}
