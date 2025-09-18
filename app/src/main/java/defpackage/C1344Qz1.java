package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: Qz1 */
/* loaded from: classes.dex */
public final class C1344Qz1 extends AbstractC4257hz1 {
    public final ArrayList c;
    public final ArrayList d;
    public final C6860rY0 e;

    public C1344Qz1(C1344Qz1 c1344Qz1) {
        super(c1344Qz1.a);
        ArrayList arrayList = new ArrayList(c1344Qz1.c.size());
        this.c = arrayList;
        arrayList.addAll(c1344Qz1.c);
        ArrayList arrayList2 = new ArrayList(c1344Qz1.d.size());
        this.d = arrayList2;
        arrayList2.addAll(c1344Qz1.d);
        this.e = c1344Qz1.e;
    }

    @Override // defpackage.AbstractC4257hz1
    public final InterfaceC0877Kz1 a(C6860rY0 c6860rY0, List list) {
        C6980sA1 c6980sA1;
        C6860rY0 c6860rY0I = this.e.I();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.c;
            int size = arrayList.size();
            c6980sA1 = InterfaceC0877Kz1.i1;
            if (i >= size) {
                break;
            }
            if (i < list.size()) {
                c6860rY0I.M((String) arrayList.get(i), ((C2192ak1) c6860rY0.c).d(c6860rY0, (InterfaceC0877Kz1) list.get(i)));
            } else {
                c6860rY0I.M((String) arrayList.get(i), c6980sA1);
            }
            i++;
        }
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            InterfaceC0877Kz1 interfaceC0877Kz1 = (InterfaceC0877Kz1) it.next();
            C2192ak1 c2192ak1 = (C2192ak1) c6860rY0I.c;
            InterfaceC0877Kz1 interfaceC0877Kz1D = c2192ak1.d(c6860rY0I, interfaceC0877Kz1);
            if (interfaceC0877Kz1D instanceof C2275bA1) {
                interfaceC0877Kz1D = c2192ak1.d(c6860rY0I, interfaceC0877Kz1);
            }
            if (interfaceC0877Kz1D instanceof C1497Sy1) {
                return ((C1497Sy1) interfaceC0877Kz1D).a;
            }
        }
        return c6980sA1;
    }

    @Override // defpackage.AbstractC4257hz1, defpackage.InterfaceC0877Kz1
    public final InterfaceC0877Kz1 zzc() {
        return new C1344Qz1(this);
    }

    public C1344Qz1(String str, ArrayList arrayList, List list, C6860rY0 c6860rY0) {
        super(str);
        this.c = new ArrayList();
        this.e = c6860rY0;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.c.add(((InterfaceC0877Kz1) it.next()).zzf());
            }
        }
        this.d = new ArrayList(list);
    }
}
