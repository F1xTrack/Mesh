package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class U22 {
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    public static final ArrayList a(InterfaceC1667Vd0 interfaceC1667Vd0) {
        O90.f(interfaceC1667Vd0, "<this>");
        C1979Zd0 c1979Zd0 = (C1979Zd0) ((C3430de0) interfaceC1667Vd0).c.getValue();
        c1979Zd0.getClass();
        InterfaceC5927mf0 interfaceC5927mf0 = C1979Zd0.o[13];
        Object objInvoke = c1979Zd0.m.invoke();
        O90.e(objInvoke, "getValue(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : (Collection) objInvoke) {
            AbstractC1589Ud0 abstractC1589Ud0 = (AbstractC1589Ud0) obj;
            if (!(abstractC1589Ud0.p().t0() != null) && (abstractC1589Ud0 instanceof InterfaceC3433df0)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final InterfaceC6878re0 b(InterfaceC1667Vd0 interfaceC1667Vd0) {
        Object next;
        O90.f(interfaceC1667Vd0, "<this>");
        Iterator it = ((C3430de0) interfaceC1667Vd0).g().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            InterfaceC6878re0 interfaceC6878re0 = (InterfaceC6878re0) next;
            O90.d(interfaceC6878re0, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KFunctionImpl");
            if (((InterfaceC6174ny) ((C7260te0) interfaceC6878re0).p()).y()) {
                break;
            }
        }
        return (InterfaceC6878re0) next;
    }
}
