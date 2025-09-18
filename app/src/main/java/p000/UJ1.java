package p000;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes.dex */
public abstract class UJ1 {

    /* renamed from: a */
    public static final int[] f11737a = new int[2];

    /* renamed from: a */
    public static final void m7984a(C9527gg0 c9527gg0, Rect rect) {
        O90.m5968f(rect, "rect");
        if (c9527gg0.isAttachedToWindow()) {
            rect.set(0, 0, c9527gg0.getWidth(), c9527gg0.getHeight());
            int[] iArr = f11737a;
            c9527gg0.getLocationInWindow(iArr);
            rect.offset(iArr[0], iArr[1]);
        }
    }

    /* renamed from: b */
    public static final Collection m7985b(Collection collection, InterfaceC6497nZ interfaceC6497nZ) {
        O90.m5968f(collection, "<this>");
        if (collection.size() <= 1) {
            return collection;
        }
        LinkedList linkedList = new LinkedList(collection);
        C11748y21 c11748y21 = new C11748y21();
        while (!linkedList.isEmpty()) {
            Object objM25955A = AbstractC7167xu.m25955A(linkedList);
            C11748y21 c11748y212 = new C11748y21();
            ArrayList arrayListM25051g = C11229tz0.m25051g(objM25955A, linkedList, interfaceC6497nZ, new C7236z(29, c11748y212));
            if (arrayListM25051g.size() == 1 && c11748y212.isEmpty()) {
                Object objM25971Q = AbstractC7167xu.m25971Q(arrayListM25051g);
                O90.m5967e(objM25971Q, "single(...)");
                c11748y21.add(objM25971Q);
            } else {
                Object objM25059s = C11229tz0.m25059s(arrayListM25051g, interfaceC6497nZ);
                InterfaceC7032vl interfaceC7032vl = (InterfaceC7032vl) interfaceC6497nZ.invoke(objM25059s);
                Iterator it = arrayListM25051g.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    O90.m5965c(next);
                    if (!C11229tz0.m25054k(interfaceC7032vl, (InterfaceC7032vl) interfaceC6497nZ.invoke(next))) {
                        c11748y212.add(next);
                    }
                }
                if (!c11748y212.isEmpty()) {
                    c11748y21.addAll(c11748y212);
                }
                c11748y21.add(objM25059s);
            }
        }
        return c11748y21;
    }
}
