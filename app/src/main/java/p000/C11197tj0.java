package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: tj0 */
/* loaded from: classes.dex */
public final class C11197tj0 extends AbstractC11707xj0 {

    /* renamed from: c */
    public static final Class f43229c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    public static List m24972d(long j, Object obj, int i) {
        C9014ci0 c9014ci0;
        List list = (List) AbstractC8055Og1.f8565d.m5421i(j, obj);
        if (list.isEmpty()) {
            List c9014ci02 = list instanceof InterfaceC9403fi0 ? new C9014ci0(i) : ((list instanceof InterfaceC10749qD0) && (list instanceof InterfaceC11508w90)) ? ((InterfaceC11508w90) list).mo10442e(i) : new ArrayList(i);
            AbstractC8055Og1.m6115r(j, obj, c9014ci02);
            return c9014ci02;
        }
        if (f43229c.isAssignableFrom(list.getClass())) {
            ArrayList arrayList = new ArrayList(list.size() + i);
            arrayList.addAll(list);
            AbstractC8055Og1.m6115r(j, obj, arrayList);
            c9014ci0 = arrayList;
        } else {
            if (!(list instanceof C10808qg1)) {
                if (!(list instanceof InterfaceC10749qD0) || !(list instanceof InterfaceC11508w90)) {
                    return list;
                }
                InterfaceC11508w90 interfaceC11508w90 = (InterfaceC11508w90) list;
                if (((AbstractC1196T0) interfaceC11508w90).f11086a) {
                    return list;
                }
                InterfaceC11508w90 interfaceC11508w90Mo10442e = interfaceC11508w90.mo10442e(list.size() + i);
                AbstractC8055Og1.m6115r(j, obj, interfaceC11508w90Mo10442e);
                return interfaceC11508w90Mo10442e;
            }
            C9014ci0 c9014ci03 = new C9014ci0(list.size() + i);
            c9014ci03.addAll((C10808qg1) list);
            AbstractC8055Og1.m6115r(j, obj, c9014ci03);
            c9014ci0 = c9014ci03;
        }
        return c9014ci0;
    }

    @Override // p000.AbstractC11707xj0
    /* renamed from: a */
    public final void mo24973a(long j, Object obj) {
        Object objUnmodifiableList;
        List list = (List) AbstractC8055Og1.f8565d.m5421i(j, obj);
        if (list instanceof InterfaceC9403fi0) {
            objUnmodifiableList = ((InterfaceC9403fi0) list).mo10832o();
        } else {
            if (f43229c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof InterfaceC10749qD0) && (list instanceof InterfaceC11508w90)) {
                AbstractC1196T0 abstractC1196T0 = (AbstractC1196T0) ((InterfaceC11508w90) list);
                if (abstractC1196T0.f11086a) {
                    abstractC1196T0.f11086a = false;
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        AbstractC8055Og1.m6115r(j, obj, objUnmodifiableList);
    }

    @Override // p000.AbstractC11707xj0
    /* renamed from: b */
    public final void mo24974b(B00 b00, B00 b002, long j) {
        List list = (List) AbstractC8055Og1.f8565d.m5421i(j, b002);
        List listM24972d = m24972d(j, b00, list.size());
        int size = listM24972d.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            listM24972d.addAll(list);
        }
        if (size > 0) {
            list = listM24972d;
        }
        AbstractC8055Og1.m6115r(j, b00, list);
    }

    @Override // p000.AbstractC11707xj0
    /* renamed from: c */
    public final List mo24975c(long j, Object obj) {
        return m24972d(j, obj, 10);
    }
}
