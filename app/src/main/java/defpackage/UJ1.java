package defpackage;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes.dex */
public abstract class UJ1 {
    public static final int[] a = new int[2];

    public static final void a(C4008gg0 c4008gg0, Rect rect) {
        O90.f(rect, "rect");
        if (c4008gg0.isAttachedToWindow()) {
            rect.set(0, 0, c4008gg0.getWidth(), c4008gg0.getHeight());
            int[] iArr = a;
            c4008gg0.getLocationInWindow(iArr);
            rect.offset(iArr[0], iArr[1]);
        }
    }

    public static final Collection b(Collection collection, InterfaceC6099nZ interfaceC6099nZ) {
        O90.f(collection, "<this>");
        if (collection.size() <= 1) {
            return collection;
        }
        LinkedList linkedList = new LinkedList(collection);
        C8098y21 c8098y21 = new C8098y21();
        while (!linkedList.isEmpty()) {
            Object objA = AbstractC8069xu.A(linkedList);
            C8098y21 c8098y212 = new C8098y21();
            ArrayList arrayListG = C7323tz0.g(objA, linkedList, interfaceC6099nZ, new C8277z(29, c8098y212));
            if (arrayListG.size() == 1 && c8098y212.isEmpty()) {
                Object objQ = AbstractC8069xu.Q(arrayListG);
                O90.e(objQ, "single(...)");
                c8098y21.add(objQ);
            } else {
                Object objS = C7323tz0.s(arrayListG, interfaceC6099nZ);
                InterfaceC7662vl interfaceC7662vl = (InterfaceC7662vl) interfaceC6099nZ.invoke(objS);
                Iterator it = arrayListG.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    O90.c(next);
                    if (!C7323tz0.k(interfaceC7662vl, (InterfaceC7662vl) interfaceC6099nZ.invoke(next))) {
                        c8098y212.add(next);
                    }
                }
                if (!c8098y212.isEmpty()) {
                    c8098y21.addAll(c8098y212);
                }
                c8098y21.add(objS);
            }
        }
        return c8098y21;
    }
}
