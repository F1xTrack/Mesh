package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: rZ1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10922rZ1 {

    /* renamed from: a */
    public static int f41734a = 5;

    /* renamed from: b */
    public static boolean f41735b = true;

    /* renamed from: a */
    public static InterfaceC10059kq0 m24427a(String str, Collection collection) {
        O90.m5968f(str, "message");
        O90.m5968f(collection, "types");
        Collection collection2 = collection;
        ArrayList arrayList = new ArrayList(AbstractC7293zu.m26586k(collection2));
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(((AbstractC7742Ig0) it.next()).mo3799d0());
        }
        C11494w21 c11494w21M24341f = AbstractC10906rR1.m24341f(arrayList);
        int i = c11494w21M24341f.f44659a;
        InterfaceC10059kq0 c3891cr = i != 0 ? i != 1 ? new C3891cr(str, (InterfaceC10059kq0[]) c11494w21M24341f.toArray(new InterfaceC10059kq0[0])) : (InterfaceC10059kq0) c11494w21M24341f.get(0) : C9931jq0.f35419b;
        return c11494w21M24341f.f44659a <= 1 ? c3891cr : new C8576Yh0(c3891cr);
    }

    /* renamed from: b */
    public static final void m24428b(String str, String str2) {
        O90.m5968f(str2, "msg");
        if (f41734a <= 3) {
            m24430d(str2);
        }
    }

    /* renamed from: c */
    public static final void m24429c(String str, String str2) {
        O90.m5968f(str2, "msg");
        if (f41734a <= 6) {
            m24430d(str2);
        }
    }

    /* renamed from: d */
    public static final void m24430d(String str) {
        if (f41735b) {
            Thread.currentThread().getName();
        }
    }

    /* renamed from: e */
    public static final void m24431e(String str, String str2) {
        O90.m5968f(str2, "msg");
        if (f41734a <= 5) {
            m24430d(str2);
        }
    }
}
