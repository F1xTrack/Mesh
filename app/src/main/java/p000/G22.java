package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class G22 {

    /* renamed from: a */
    public static C10919rY0 f3551a;

    /* renamed from: a */
    public static InterfaceC7885Kz1 m2915a(Object obj) {
        if (obj == null) {
            return InterfaceC7885Kz1.f6418j1;
        }
        if (obj instanceof String) {
            return new C8509Wz1((String) obj);
        }
        if (obj instanceof Double) {
            return new C7987My1((Double) obj);
        }
        if (obj instanceof Long) {
            return new C7987My1(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new C7987My1(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new C11865yy1((Boolean) obj);
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            C11228ty1 c11228ty1 = new C11228ty1();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                c11228ty1.m25038k(m2915a(it.next()));
            }
            return c11228ty1;
        }
        C7521Dz1 c7521Dz1 = new C7521Dz1();
        Map map = (Map) obj;
        for (Object string : map.keySet()) {
            InterfaceC7885Kz1 interfaceC7885Kz1M2915a = m2915a(map.get(string));
            if (string != null) {
                if (!(string instanceof String)) {
                    string = string.toString();
                }
                c7521Dz1.mo1958h((String) string, interfaceC7885Kz1M2915a);
            }
        }
        return c7521Dz1;
    }

    /* renamed from: b */
    public static InterfaceC7885Kz1 m2916b(XL1 xl1) {
        if (xl1 == null) {
            return InterfaceC7885Kz1.f6417i1;
        }
        int i = OO1.f8427a[AbstractC7222ym.m26247x(xl1.m8985n())];
        if (i == 1) {
            return xl1.m8992u() ? new C8509Wz1(xl1.m8987p()) : InterfaceC7885Kz1.f6424p1;
        }
        if (i == 2) {
            return xl1.m8991t() ? new C7987My1(Double.valueOf(xl1.m8984m())) : new C7987My1(null);
        }
        if (i == 3) {
            return xl1.m8990s() ? new C11865yy1(Boolean.valueOf(xl1.m8989r())) : new C11865yy1(null);
        }
        if (i != 4) {
            if (i != 5) {
                throw new IllegalStateException("Invalid entity: ".concat(String.valueOf(xl1)));
            }
            throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
        }
        List listM8988q = xl1.m8988q();
        ArrayList arrayList = new ArrayList();
        Iterator it = listM8988q.iterator();
        while (it.hasNext()) {
            arrayList.add(m2916b((XL1) it.next()));
        }
        return new C8819bA1(xl1.m8986o(), arrayList);
    }
}
