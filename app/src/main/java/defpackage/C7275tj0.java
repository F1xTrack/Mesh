package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: tj0 */
/* loaded from: classes.dex */
public final class C7275tj0 extends AbstractC8037xj0 {
    public static final Class c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    /* JADX WARN: Multi-variable type inference failed */
    public static List d(long j, Object obj, int i) {
        C2566ci0 c2566ci0;
        List list = (List) AbstractC1131Og1.d.i(j, obj);
        if (list.isEmpty()) {
            List c2566ci02 = list instanceof InterfaceC3823fi0 ? new C2566ci0(i) : ((list instanceof InterfaceC6607qD0) && (list instanceof InterfaceC7739w90)) ? ((InterfaceC7739w90) list).e(i) : new ArrayList(i);
            AbstractC1131Og1.r(j, obj, c2566ci02);
            return c2566ci02;
        }
        if (c.isAssignableFrom(list.getClass())) {
            ArrayList arrayList = new ArrayList(list.size() + i);
            arrayList.addAll(list);
            AbstractC1131Og1.r(j, obj, arrayList);
            c2566ci0 = arrayList;
        } else {
            if (!(list instanceof C6695qg1)) {
                if (!(list instanceof InterfaceC6607qD0) || !(list instanceof InterfaceC7739w90)) {
                    return list;
                }
                InterfaceC7739w90 interfaceC7739w90 = (InterfaceC7739w90) list;
                if (((T0) interfaceC7739w90).a) {
                    return list;
                }
                InterfaceC7739w90 interfaceC7739w90E = interfaceC7739w90.e(list.size() + i);
                AbstractC1131Og1.r(j, obj, interfaceC7739w90E);
                return interfaceC7739w90E;
            }
            C2566ci0 c2566ci03 = new C2566ci0(list.size() + i);
            c2566ci03.addAll((C6695qg1) list);
            AbstractC1131Og1.r(j, obj, c2566ci03);
            c2566ci0 = c2566ci03;
        }
        return c2566ci0;
    }

    @Override // defpackage.AbstractC8037xj0
    public final void a(long j, Object obj) {
        Object objUnmodifiableList;
        List list = (List) AbstractC1131Og1.d.i(j, obj);
        if (list instanceof InterfaceC3823fi0) {
            objUnmodifiableList = ((InterfaceC3823fi0) list).o();
        } else {
            if (c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof InterfaceC6607qD0) && (list instanceof InterfaceC7739w90)) {
                T0 t0 = (T0) ((InterfaceC7739w90) list);
                if (t0.a) {
                    t0.a = false;
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        AbstractC1131Og1.r(j, obj, objUnmodifiableList);
    }

    @Override // defpackage.AbstractC8037xj0
    public final void b(B00 b00, B00 b002, long j) {
        List list = (List) AbstractC1131Og1.d.i(j, b002);
        List listD = d(j, b00, list.size());
        int size = listD.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            listD.addAll(list);
        }
        if (size > 0) {
            list = listD;
        }
        AbstractC1131Og1.r(j, b00, list);
    }

    @Override // defpackage.AbstractC8037xj0
    public final List c(long j, Object obj) {
        return d(j, obj, 10);
    }
}
