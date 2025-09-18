package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: Zv, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2032Zv implements H71 {
    public final void a(C6045nH c6045nH, InterfaceC7492us interfaceC7492us, ArrayList arrayList) {
        O90.f(c6045nH, "$context_receiver_0");
        O90.f(interfaceC7492us, "thisDescriptor");
        Iterator<E> it = MN.a.iterator();
        while (it.hasNext()) {
            ((C2032Zv) ((H71) it.next())).a(c6045nH, interfaceC7492us, arrayList);
        }
    }

    public final void b(C6045nH c6045nH, InterfaceC7492us interfaceC7492us, C1559Tt0 c1559Tt0, ArrayList arrayList) {
        O90.f(c6045nH, "$context_receiver_0");
        O90.f(interfaceC7492us, "thisDescriptor");
        O90.f(c1559Tt0, "name");
        Iterator<E> it = MN.a.iterator();
        while (it.hasNext()) {
            ((C2032Zv) ((H71) it.next())).b(c6045nH, interfaceC7492us, c1559Tt0, arrayList);
        }
    }

    public final void c(C6045nH c6045nH, InterfaceC7492us interfaceC7492us, C1559Tt0 c1559Tt0, C6512pj0 c6512pj0) {
        O90.f(c6045nH, "$context_receiver_0");
        O90.f(interfaceC7492us, "thisDescriptor");
        O90.f(c1559Tt0, "name");
        Iterator<E> it = MN.a.iterator();
        while (it.hasNext()) {
            ((C2032Zv) ((H71) it.next())).c(c6045nH, interfaceC7492us, c1559Tt0, c6512pj0);
        }
    }

    public final void d(C6045nH c6045nH, C8411zh0 c8411zh0, C1559Tt0 c1559Tt0, ArrayList arrayList) {
        O90.f(c6045nH, "$context_receiver_0");
        O90.f(c8411zh0, "thisDescriptor");
        O90.f(c1559Tt0, "name");
        Iterator<E> it = MN.a.iterator();
        while (it.hasNext()) {
            ((C2032Zv) ((H71) it.next())).d(c6045nH, c8411zh0, c1559Tt0, arrayList);
        }
    }

    public final ArrayList e(C6045nH c6045nH, InterfaceC7492us interfaceC7492us) {
        O90.f(c6045nH, "$context_receiver_0");
        O90.f(interfaceC7492us, "thisDescriptor");
        MN mn = MN.a;
        ArrayList arrayList = new ArrayList();
        Iterator<E> it = mn.iterator();
        while (it.hasNext()) {
            AbstractC0314Du.m(arrayList, ((C2032Zv) ((H71) it.next())).e(c6045nH, interfaceC7492us));
        }
        return arrayList;
    }

    public final ArrayList f(C6045nH c6045nH, InterfaceC7492us interfaceC7492us) {
        O90.f(c6045nH, "$context_receiver_0");
        O90.f(interfaceC7492us, "thisDescriptor");
        MN mn = MN.a;
        ArrayList arrayList = new ArrayList();
        Iterator<E> it = mn.iterator();
        while (it.hasNext()) {
            AbstractC0314Du.m(arrayList, ((C2032Zv) ((H71) it.next())).f(c6045nH, interfaceC7492us));
        }
        return arrayList;
    }

    public final ArrayList g(C6045nH c6045nH, C8411zh0 c8411zh0) {
        O90.f(c6045nH, "$context_receiver_0");
        O90.f(c8411zh0, "thisDescriptor");
        MN mn = MN.a;
        ArrayList arrayList = new ArrayList();
        Iterator<E> it = mn.iterator();
        while (it.hasNext()) {
            AbstractC0314Du.m(arrayList, ((C2032Zv) ((H71) it.next())).g(c6045nH, c8411zh0));
        }
        return arrayList;
    }

    public final EE0 h(C6045nH c6045nH, InterfaceC7492us interfaceC7492us, EE0 ee0) {
        O90.f(c6045nH, "$context_receiver_0");
        O90.f(ee0, "propertyDescriptor");
        Iterator<E> it = MN.a.iterator();
        while (it.hasNext()) {
            ee0 = ((C2032Zv) ((H71) it.next())).h(c6045nH, interfaceC7492us, ee0);
        }
        return ee0;
    }
}
