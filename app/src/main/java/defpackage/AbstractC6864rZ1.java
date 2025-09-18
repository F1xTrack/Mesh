package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: rZ1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6864rZ1 {
    public static int a = 5;
    public static boolean b = true;

    public static InterfaceC5578kq0 a(String str, Collection collection) {
        O90.f(str, "message");
        O90.f(collection, "types");
        Collection collection2 = collection;
        ArrayList arrayList = new ArrayList(AbstractC8449zu.k(collection2));
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(((AbstractC0663Ig0) it.next()).d0());
        }
        C7718w21 c7718w21F = AbstractC6840rR1.f(arrayList);
        int i = c7718w21F.a;
        InterfaceC5578kq0 c3277cr = i != 0 ? i != 1 ? new C3277cr(str, (InterfaceC5578kq0[]) c7718w21F.toArray(new InterfaceC5578kq0[0])) : (InterfaceC5578kq0) c7718w21F.get(0) : C5387jq0.b;
        return c7718w21F.a <= 1 ? c3277cr : new C1913Yh0(c3277cr);
    }

    public static final void b(String str, String str2) {
        O90.f(str2, "msg");
        if (a <= 3) {
            d(str2);
        }
    }

    public static final void c(String str, String str2) {
        O90.f(str2, "msg");
        if (a <= 6) {
            d(str2);
        }
    }

    public static final void d(String str) {
        if (b) {
            Thread.currentThread().getName();
        }
    }

    public static final void e(String str, String str2) {
        O90.f(str2, "msg");
        if (a <= 5) {
            d(str2);
        }
    }
}
