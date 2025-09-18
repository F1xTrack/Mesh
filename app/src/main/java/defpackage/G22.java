package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class G22 {
    public static C6860rY0 a;

    public static InterfaceC0877Kz1 a(Object obj) {
        if (obj == null) {
            return InterfaceC0877Kz1.j1;
        }
        if (obj instanceof String) {
            return new C1812Wz1((String) obj);
        }
        if (obj instanceof Double) {
            return new C1029My1((Double) obj);
        }
        if (obj instanceof Long) {
            return new C1029My1(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new C1029My1(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new C8273yy1((Boolean) obj);
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            C7321ty1 c7321ty1 = new C7321ty1();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                c7321ty1.k(a(it.next()));
            }
            return c7321ty1;
        }
        C0331Dz1 c0331Dz1 = new C0331Dz1();
        Map map = (Map) obj;
        for (Object string : map.keySet()) {
            InterfaceC0877Kz1 interfaceC0877Kz1A = a(map.get(string));
            if (string != null) {
                if (!(string instanceof String)) {
                    string = string.toString();
                }
                c0331Dz1.h((String) string, interfaceC0877Kz1A);
            }
        }
        return c0331Dz1;
    }

    public static InterfaceC0877Kz1 b(XL1 xl1) {
        if (xl1 == null) {
            return InterfaceC0877Kz1.i1;
        }
        int i = OO1.a[AbstractC8235ym.x(xl1.n())];
        if (i == 1) {
            return xl1.u() ? new C1812Wz1(xl1.p()) : InterfaceC0877Kz1.p1;
        }
        if (i == 2) {
            return xl1.t() ? new C1029My1(Double.valueOf(xl1.m())) : new C1029My1(null);
        }
        if (i == 3) {
            return xl1.s() ? new C8273yy1(Boolean.valueOf(xl1.r())) : new C8273yy1(null);
        }
        if (i != 4) {
            if (i != 5) {
                throw new IllegalStateException("Invalid entity: ".concat(String.valueOf(xl1)));
            }
            throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
        }
        List listQ = xl1.q();
        ArrayList arrayList = new ArrayList();
        Iterator it = listQ.iterator();
        while (it.hasNext()) {
            arrayList.add(b((XL1) it.next()));
        }
        return new C2275bA1(xl1.o(), arrayList);
    }
}
