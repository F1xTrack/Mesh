package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: Io */
/* loaded from: classes.dex */
public final class C0555Io {

    /* renamed from: b */
    public static final C0555Io f5154b;

    /* renamed from: c */
    public static final C0555Io f5155c;

    /* renamed from: a */
    public final LinkedHashSet f5156a;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new C11578wi0(0));
        f5154b = new C0555Io(linkedHashSet);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        linkedHashSet2.add(new C11578wi0(1));
        f5155c = new C0555Io(linkedHashSet2);
    }

    public C0555Io(LinkedHashSet linkedHashSet) {
        this.f5156a = linkedHashSet;
    }

    /* renamed from: a */
    public final List m4004a(List list) {
        List arrayList = new ArrayList(list);
        Iterator it = this.f5156a.iterator();
        while (it.hasNext()) {
            arrayList = ((InterfaceC6575oo) it.next()).mo23559a(Collections.unmodifiableList(arrayList));
        }
        arrayList.retainAll(list);
        return arrayList;
    }

    /* renamed from: b */
    public final Integer m4005b() {
        Iterator it = this.f5156a.iterator();
        Integer num = null;
        while (it.hasNext()) {
            InterfaceC6575oo interfaceC6575oo = (InterfaceC6575oo) it.next();
            if (interfaceC6575oo instanceof C11578wi0) {
                Integer numValueOf = Integer.valueOf(((C11578wi0) interfaceC6575oo).f45038b);
                if (num == null) {
                    num = numValueOf;
                } else if (!num.equals(numValueOf)) {
                    throw new IllegalStateException("Multiple conflicting lens facing requirements exist.");
                }
            }
        }
        return num;
    }

    /* renamed from: c */
    public final InterfaceC6972uo m4006c(LinkedHashSet linkedHashSet) {
        ArrayList arrayList = new ArrayList();
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC6972uo) it.next()).mo1328b());
        }
        List listM4004a = m4004a(arrayList);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            InterfaceC6972uo interfaceC6972uo = (InterfaceC6972uo) it2.next();
            if (listM4004a.contains(interfaceC6972uo.mo1328b())) {
                linkedHashSet2.add(interfaceC6972uo);
            }
        }
        Iterator it3 = linkedHashSet2.iterator();
        if (it3.hasNext()) {
            return (InterfaceC6972uo) it3.next();
        }
        throw new IllegalArgumentException("No available camera can be found");
    }
}
