package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: Qz1 */
/* loaded from: classes.dex */
public final class C8197Qz1 extends AbstractC9694hz1 {

    /* renamed from: c */
    public final ArrayList f9883c;

    /* renamed from: d */
    public final ArrayList f9884d;

    /* renamed from: e */
    public final C10919rY0 f9885e;

    public C8197Qz1(C8197Qz1 c8197Qz1) {
        super(c8197Qz1.f28710a);
        ArrayList arrayList = new ArrayList(c8197Qz1.f9883c.size());
        this.f9883c = arrayList;
        arrayList.addAll(c8197Qz1.f9883c);
        ArrayList arrayList2 = new ArrayList(c8197Qz1.f9884d.size());
        this.f9884d = arrayList2;
        arrayList2.addAll(c8197Qz1.f9884d);
        this.f9885e = c8197Qz1.f9885e;
    }

    @Override // p000.AbstractC9694hz1
    /* renamed from: a */
    public final InterfaceC7885Kz1 mo6842a(C10919rY0 c10919rY0, List list) {
        C11000sA1 c11000sA1;
        C10919rY0 c10919rY0M24410I = this.f9885e.m24410I();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f9883c;
            int size = arrayList.size();
            c11000sA1 = InterfaceC7885Kz1.f6417i1;
            if (i >= size) {
                break;
            }
            if (i < list.size()) {
                c10919rY0M24410I.m24414M((String) arrayList.get(i), ((C8763ak1) c10919rY0.f41729c).m9804d(c10919rY0, (InterfaceC7885Kz1) list.get(i)));
            } else {
                c10919rY0M24410I.m24414M((String) arrayList.get(i), c11000sA1);
            }
            i++;
        }
        Iterator it = this.f9884d.iterator();
        while (it.hasNext()) {
            InterfaceC7885Kz1 interfaceC7885Kz1 = (InterfaceC7885Kz1) it.next();
            C8763ak1 c8763ak1 = (C8763ak1) c10919rY0M24410I.f41729c;
            InterfaceC7885Kz1 interfaceC7885Kz1M9804d = c8763ak1.m9804d(c10919rY0M24410I, interfaceC7885Kz1);
            if (interfaceC7885Kz1M9804d instanceof C8819bA1) {
                interfaceC7885Kz1M9804d = c8763ak1.m9804d(c10919rY0M24410I, interfaceC7885Kz1);
            }
            if (interfaceC7885Kz1M9804d instanceof C8299Sy1) {
                return ((C8299Sy1) interfaceC7885Kz1M9804d).f11083a;
            }
        }
        return c11000sA1;
    }

    @Override // p000.AbstractC9694hz1, p000.InterfaceC7885Kz1
    public final InterfaceC7885Kz1 zzc() {
        return new C8197Qz1(this);
    }

    public C8197Qz1(String str, ArrayList arrayList, List list, C10919rY0 c10919rY0) {
        super(str);
        this.f9883c = new ArrayList();
        this.f9885e = c10919rY0;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.f9883c.add(((InterfaceC7885Kz1) it.next()).zzf());
            }
        }
        this.f9884d = new ArrayList(list);
    }
}
