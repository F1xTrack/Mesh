package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: Io */
/* loaded from: classes.dex */
public final class C0686Io {
    public static final C0686Io b;
    public static final C0686Io c;
    public final LinkedHashSet a;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new C7844wi0(0));
        b = new C0686Io(linkedHashSet);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        linkedHashSet2.add(new C7844wi0(1));
        c = new C0686Io(linkedHashSet2);
    }

    public C0686Io(LinkedHashSet linkedHashSet) {
        this.a = linkedHashSet;
    }

    public final List a(List list) {
        List arrayList = new ArrayList(list);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            arrayList = ((InterfaceC6335oo) it.next()).a(Collections.unmodifiableList(arrayList));
        }
        arrayList.retainAll(list);
        return arrayList;
    }

    public final Integer b() {
        Iterator it = this.a.iterator();
        Integer num = null;
        while (it.hasNext()) {
            InterfaceC6335oo interfaceC6335oo = (InterfaceC6335oo) it.next();
            if (interfaceC6335oo instanceof C7844wi0) {
                Integer numValueOf = Integer.valueOf(((C7844wi0) interfaceC6335oo).b);
                if (num == null) {
                    num = numValueOf;
                } else if (!num.equals(numValueOf)) {
                    throw new IllegalStateException("Multiple conflicting lens facing requirements exist.");
                }
            }
        }
        return num;
    }

    public final InterfaceC7480uo c(LinkedHashSet linkedHashSet) {
        ArrayList arrayList = new ArrayList();
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC7480uo) it.next()).b());
        }
        List listA = a(arrayList);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            InterfaceC7480uo interfaceC7480uo = (InterfaceC7480uo) it2.next();
            if (listA.contains(interfaceC7480uo.b())) {
                linkedHashSet2.add(interfaceC7480uo);
            }
        }
        Iterator it3 = linkedHashSet2.iterator();
        if (it3.hasNext()) {
            return (InterfaceC7480uo) it3.next();
        }
        throw new IllegalArgumentException("No available camera can be found");
    }
}
