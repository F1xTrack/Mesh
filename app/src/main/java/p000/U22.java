package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class U22 {
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    /* renamed from: a */
    public static final ArrayList m7866a(InterfaceC8412Vd0 interfaceC8412Vd0) {
        O90.m5968f(interfaceC8412Vd0, "<this>");
        C8620Zd0 c8620Zd0 = (C8620Zd0) ((C9139de0) interfaceC8412Vd0).f26179c.getValue();
        c8620Zd0.getClass();
        InterfaceC10293mf0 interfaceC10293mf0 = C8620Zd0.f15049o[13];
        Object objInvoke = c8620Zd0.f15060m.invoke();
        O90.m5967e(objInvoke, "getValue(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : (Collection) objInvoke) {
            AbstractC8360Ud0 abstractC8360Ud0 = (AbstractC8360Ud0) obj;
            if (!(abstractC8360Ud0.mo8094p().mo121t0() != null) && (abstractC8360Ud0 instanceof InterfaceC9141df0)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public static final InterfaceC10931re0 m7867b(InterfaceC8412Vd0 interfaceC8412Vd0) {
        Object next;
        O90.m5968f(interfaceC8412Vd0, "<this>");
        Iterator it = ((C9139de0) interfaceC8412Vd0).mo2809g().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            InterfaceC10931re0 interfaceC10931re0 = (InterfaceC10931re0) next;
            O90.m5966d(interfaceC10931re0, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KFunctionImpl");
            if (((InterfaceC6522ny) ((C11187te0) interfaceC10931re0).mo8094p()).mo2718y()) {
                break;
            }
        }
        return (InterfaceC10931re0) next;
    }
}
