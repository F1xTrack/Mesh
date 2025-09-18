package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: sj0 */
/* loaded from: classes.dex */
public final class C7084sj0 extends AbstractC7847wj0 {
    public static final Class c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    @Override // defpackage.AbstractC7847wj0
    public final void a(long j, Object obj) {
        Object objUnmodifiableList;
        List list = (List) AbstractC1053Ng1.c.i(j, obj);
        if (list instanceof InterfaceC3442di0) {
            objUnmodifiableList = ((InterfaceC3442di0) list).o();
        } else {
            if (c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof InterfaceC6416pD0) && (list instanceof InterfaceC7549v90)) {
                S0 s0 = (S0) ((InterfaceC7549v90) list);
                boolean z = s0.a;
                if (z && z) {
                    s0.a = false;
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        AbstractC1053Ng1.o(j, obj, objUnmodifiableList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.AbstractC7847wj0
    public final void b(long j, Object obj, Object obj2) {
        C2185ai0 c2185ai0;
        AbstractC0898Lg1 abstractC0898Lg1 = AbstractC1053Ng1.c;
        List list = (List) abstractC0898Lg1.i(j, obj2);
        int size = list.size();
        List listE = (List) abstractC0898Lg1.i(j, obj);
        if (listE.isEmpty()) {
            listE = listE instanceof InterfaceC3442di0 ? new C2185ai0(size) : ((listE instanceof InterfaceC6416pD0) && (listE instanceof InterfaceC7549v90)) ? ((InterfaceC7549v90) listE).e(size) : new ArrayList(size);
            AbstractC1053Ng1.o(j, obj, listE);
        } else {
            if (c.isAssignableFrom(listE.getClass())) {
                ArrayList arrayList = new ArrayList(listE.size() + size);
                arrayList.addAll(listE);
                AbstractC1053Ng1.o(j, obj, arrayList);
                c2185ai0 = arrayList;
            } else if (listE instanceof C6313og1) {
                C2185ai0 c2185ai02 = new C2185ai0(listE.size() + size);
                c2185ai02.addAll((C6313og1) listE);
                AbstractC1053Ng1.o(j, obj, c2185ai02);
                c2185ai0 = c2185ai02;
            } else if ((listE instanceof InterfaceC6416pD0) && (listE instanceof InterfaceC7549v90)) {
                InterfaceC7549v90 interfaceC7549v90 = (InterfaceC7549v90) listE;
                if (!((S0) interfaceC7549v90).a) {
                    listE = interfaceC7549v90.e(listE.size() + size);
                    AbstractC1053Ng1.o(j, obj, listE);
                }
            }
            listE = c2185ai0;
        }
        int size2 = listE.size();
        int size3 = list.size();
        if (size2 > 0 && size3 > 0) {
            listE.addAll(list);
        }
        if (size2 > 0) {
            list = listE;
        }
        AbstractC1053Ng1.o(j, obj, list);
    }
}
