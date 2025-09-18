package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class J20 {

    /* renamed from: a */
    public final ArrayList f5287a;

    public J20(int i) {
        this.f5287a = new ArrayList(i);
    }

    /* renamed from: a */
    public void m4134a(Object obj) {
        this.f5287a.add(obj);
    }

    /* renamed from: b */
    public void m4135b(String str, String str2) {
        O90.m5968f(str, "name");
        O90.m5968f(str2, "value");
        K12.m4520a(str);
        K12.m4521b(str2, str);
        m4137d(str, str2);
    }

    /* renamed from: c */
    public void m4136c(String str) {
        int iM25361z = AbstractC11374v51.m25361z(str, ':', 1, false, 4);
        if (iM25361z != -1) {
            String strSubstring = str.substring(0, iM25361z);
            O90.m5967e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            String strSubstring2 = str.substring(iM25361z + 1);
            O90.m5967e(strSubstring2, "this as java.lang.String).substring(startIndex)");
            m4137d(strSubstring, strSubstring2);
            return;
        }
        if (str.charAt(0) != ':') {
            m4137d("", str);
            return;
        }
        String strSubstring3 = str.substring(1);
        O90.m5967e(strSubstring3, "this as java.lang.String).substring(startIndex)");
        m4137d("", strSubstring3);
    }

    /* renamed from: d */
    public void m4137d(String str, String str2) {
        O90.m5968f(str, "name");
        O90.m5968f(str2, "value");
        ArrayList arrayList = this.f5287a;
        arrayList.add(str);
        arrayList.add(AbstractC11374v51.m25350Y(str2).toString());
    }

    /* renamed from: e */
    public void m4138e(Object obj) {
        if (obj == null) {
            return;
        }
        boolean z = obj instanceof Object[];
        ArrayList arrayList = this.f5287a;
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

    /* renamed from: f */
    public void m4139f(String str, String str2) {
        if (str.length() <= 0) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if ('!' > cCharAt || cCharAt >= 127) {
                throw new IllegalArgumentException(AbstractC7433Ch1.m1281j("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i), str).toString());
            }
        }
        m4137d(str, str2);
    }

    /* renamed from: g */
    public K20 m4140g() {
        return new K20((String[]) this.f5287a.toArray(new String[0]));
    }

    /* renamed from: h */
    public String m4141h(String str) {
        O90.m5968f(str, "name");
        ArrayList arrayList = this.f5287a;
        int size = arrayList.size() - 2;
        int iM24880a = AbstractC11152tM1.m24880a(size, 0, -2);
        if (iM24880a > size) {
            return null;
        }
        while (!str.equalsIgnoreCase((String) arrayList.get(size))) {
            if (size == iM24880a) {
                return null;
            }
            size -= 2;
        }
        return (String) arrayList.get(size + 1);
    }

    /* renamed from: i */
    public void m4142i(String str) {
        O90.m5968f(str, "name");
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f5287a;
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
        this.f5287a = new ArrayList(20);
    }
}
