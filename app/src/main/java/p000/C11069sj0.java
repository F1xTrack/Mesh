package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: sj0 */
/* loaded from: classes.dex */
public final class C11069sj0 extends AbstractC11580wj0 {

    /* renamed from: c */
    public static final Class f42571c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    @Override // p000.AbstractC11580wj0
    /* renamed from: a */
    public final void mo24772a(long j, Object obj) {
        Object objUnmodifiableList;
        List list = (List) AbstractC8003Ng1.f7951c.m5056i(j, obj);
        if (list instanceof InterfaceC9147di0) {
            objUnmodifiableList = ((InterfaceC9147di0) list).mo9786o();
        } else {
            if (f42571c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof InterfaceC10621pD0) && (list instanceof InterfaceC11381v90)) {
                AbstractC1133S0 abstractC1133S0 = (AbstractC1133S0) ((InterfaceC11381v90) list);
                boolean z = abstractC1133S0.f10523a;
                if (z && z) {
                    abstractC1133S0.f10523a = false;
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        AbstractC8003Ng1.m5813o(j, obj, objUnmodifiableList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.AbstractC11580wj0
    /* renamed from: b */
    public final void mo24773b(long j, Object obj, Object obj2) {
        C8758ai0 c8758ai0;
        AbstractC7899Lg1 abstractC7899Lg1 = AbstractC8003Ng1.f7951c;
        List list = (List) abstractC7899Lg1.m5056i(j, obj2);
        int size = list.size();
        List listMo9686e = (List) abstractC7899Lg1.m5056i(j, obj);
        if (listMo9686e.isEmpty()) {
            listMo9686e = listMo9686e instanceof InterfaceC9147di0 ? new C8758ai0(size) : ((listMo9686e instanceof InterfaceC10621pD0) && (listMo9686e instanceof InterfaceC11381v90)) ? ((InterfaceC11381v90) listMo9686e).mo9686e(size) : new ArrayList(size);
            AbstractC8003Ng1.m5813o(j, obj, listMo9686e);
        } else {
            if (f42571c.isAssignableFrom(listMo9686e.getClass())) {
                ArrayList arrayList = new ArrayList(listMo9686e.size() + size);
                arrayList.addAll(listMo9686e);
                AbstractC8003Ng1.m5813o(j, obj, arrayList);
                c8758ai0 = arrayList;
            } else if (listMo9686e instanceof C10552og1) {
                C8758ai0 c8758ai02 = new C8758ai0(listMo9686e.size() + size);
                c8758ai02.addAll((C10552og1) listMo9686e);
                AbstractC8003Ng1.m5813o(j, obj, c8758ai02);
                c8758ai0 = c8758ai02;
            } else if ((listMo9686e instanceof InterfaceC10621pD0) && (listMo9686e instanceof InterfaceC11381v90)) {
                InterfaceC11381v90 interfaceC11381v90 = (InterfaceC11381v90) listMo9686e;
                if (!((AbstractC1133S0) interfaceC11381v90).f10523a) {
                    listMo9686e = interfaceC11381v90.mo9686e(listMo9686e.size() + size);
                    AbstractC8003Ng1.m5813o(j, obj, listMo9686e);
                }
            }
            listMo9686e = c8758ai0;
        }
        int size2 = listMo9686e.size();
        int size3 = list.size();
        if (size2 > 0 && size3 > 0) {
            listMo9686e.addAll(list);
        }
        if (size2 > 0) {
            list = listMo9686e;
        }
        AbstractC8003Ng1.m5813o(j, obj, list);
    }
}
