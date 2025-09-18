package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class I61 {
    public final ArrayList a = new ArrayList();

    public static void b(ArrayList arrayList, int i, int[] iArr, int i2) {
        if (i2 >= iArr.length) {
            arrayList.add((int[]) iArr.clone());
            return;
        }
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = 0;
            while (true) {
                if (i4 >= i2) {
                    iArr[i2] = i3;
                    b(arrayList, i, iArr, i2 + 1);
                    break;
                } else if (i3 == iArr[i4]) {
                    break;
                } else {
                    i4++;
                }
            }
        }
    }

    public final void a(C0656Ie c0656Ie) {
        this.a.add(c0656Ie);
    }

    public final List c(List list) {
        if (list.isEmpty()) {
            return new ArrayList();
        }
        int size = list.size();
        ArrayList arrayList = this.a;
        if (size != arrayList.size()) {
            return null;
        }
        int size2 = arrayList.size();
        ArrayList arrayList2 = new ArrayList();
        boolean z = false;
        b(arrayList2, size2, new int[size2], 0);
        C0656Ie[] c0656IeArr = new C0656Ie[list.size()];
        Iterator it = arrayList2.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            int[] iArr = (int[]) it.next();
            boolean z2 = true;
            for (int i = 0; i < arrayList.size(); i++) {
                if (iArr[i] < list.size()) {
                    C0656Ie c0656Ie = (C0656Ie) arrayList.get(i);
                    C0656Ie c0656Ie2 = (C0656Ie) list.get(iArr[i]);
                    c0656Ie.getClass();
                    z2 &= c0656Ie2.b.a <= c0656Ie.b.a && c0656Ie2.a == c0656Ie.a;
                    if (!z2) {
                        break;
                    }
                    c0656IeArr[iArr[i]] = (C0656Ie) arrayList.get(i);
                }
            }
            if (z2) {
                z = true;
                break;
            }
        }
        if (z) {
            return Arrays.asList(c0656IeArr);
        }
        return null;
    }
}
