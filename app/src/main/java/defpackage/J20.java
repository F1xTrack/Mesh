package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class J20 {
    public final ArrayList a;

    public J20(int i) {
        this.a = new ArrayList(i);
    }

    public void a(Object obj) {
        this.a.add(obj);
    }

    public void b(String str, String str2) {
        O90.f(str, "name");
        O90.f(str2, "value");
        K12.a(str);
        K12.b(str2, str);
        d(str, str2);
    }

    public void c(String str) {
        int iZ = AbstractC7538v51.z(str, ':', 1, false, 4);
        if (iZ != -1) {
            String strSubstring = str.substring(0, iZ);
            O90.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            String strSubstring2 = str.substring(iZ + 1);
            O90.e(strSubstring2, "this as java.lang.String).substring(startIndex)");
            d(strSubstring, strSubstring2);
            return;
        }
        if (str.charAt(0) != ':') {
            d("", str);
            return;
        }
        String strSubstring3 = str.substring(1);
        O90.e(strSubstring3, "this as java.lang.String).substring(startIndex)");
        d("", strSubstring3);
    }

    public void d(String str, String str2) {
        O90.f(str, "name");
        O90.f(str2, "value");
        ArrayList arrayList = this.a;
        arrayList.add(str);
        arrayList.add(AbstractC7538v51.Y(str2).toString());
    }

    public void e(Object obj) {
        if (obj == null) {
            return;
        }
        boolean z = obj instanceof Object[];
        ArrayList arrayList = this.a;
        if (z) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length > 0) {
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll(arrayList, objArr);
                return;
            }
            return;
        }
        if (obj instanceof Collection) {
            arrayList.addAll((Collection) obj);
            return;
        }
        if (obj instanceof Iterable) {
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        } else {
            if (!(obj instanceof Iterator)) {
                throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
            }
            Iterator it2 = (Iterator) obj;
            while (it2.hasNext()) {
                arrayList.add(it2.next());
            }
        }
    }

    public void f(String str, String str2) {
        if (str.length() <= 0) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if ('!' > cCharAt || cCharAt >= 127) {
                throw new IllegalArgumentException(AbstractC0199Ch1.j("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i), str).toString());
            }
        }
        d(str, str2);
    }

    public K20 g() {
        return new K20((String[]) this.a.toArray(new String[0]));
    }

    public String h(String str) {
        O90.f(str, "name");
        ArrayList arrayList = this.a;
        int size = arrayList.size() - 2;
        int iA = AbstractC7207tM1.a(size, 0, -2);
        if (iA > size) {
            return null;
        }
        while (!str.equalsIgnoreCase((String) arrayList.get(size))) {
            if (size == iA) {
                return null;
            }
            size -= 2;
        }
        return (String) arrayList.get(size + 1);
    }

    public void i(String str) {
        O90.f(str, "name");
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                return;
            }
            if (str.equalsIgnoreCase((String) arrayList.get(i))) {
                arrayList.remove(i);
                arrayList.remove(i);
                i -= 2;
            }
            i += 2;
        }
    }

    public J20() {
        this.a = new ArrayList(20);
    }
}
