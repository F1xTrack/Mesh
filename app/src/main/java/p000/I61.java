package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class I61 {

    /* renamed from: a */
    public final ArrayList f4699a = new ArrayList();

    /* renamed from: b */
    public static void m3750b(ArrayList arrayList, int i, int[] iArr, int i2) {
        if (i2 >= iArr.length) {
            arrayList.add((int[]) iArr.clone());
            return;
        }
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = 0;
            while (true) {
                if (i4 >= i2) {
                    iArr[i2] = i3;
                    m3750b(arrayList, i, iArr, i2 + 1);
                    break;
                } else if (i3 == iArr[i4]) {
                    break;
                } else {
                    i4++;
                }
            }
        }
    }

    /* renamed from: a */
    public final void m3751a(C0545Ie c0545Ie) {
        this.f4699a.add(c0545Ie);
    }

    /* renamed from: c */
    public final List m3752c(List list) {
        if (list.isEmpty()) {
            return new ArrayList();
        }
        int size = list.size();
        ArrayList arrayList = this.f4699a;
        if (size != arrayList.size()) {
            return null;
        }
        int size2 = arrayList.size();
        ArrayList arrayList2 = new ArrayList();
        boolean z = false;
        m3750b(arrayList2, size2, new int[size2], 0);
        C0545Ie[] c0545IeArr = new C0545Ie[list.size()];
        Iterator it = arrayList2.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            int[] iArr = (int[]) it.next();
            boolean z2 = true;
            for (int i = 0; i < arrayList.size(); i++) {
                if (iArr[i] < list.size()) {
                    C0545Ie c0545Ie = (C0545Ie) arrayList.get(i);
                    C0545Ie c0545Ie2 = (C0545Ie) list.get(iArr[i]);
                    c0545Ie.getClass();
                    z2 &= c0545Ie2.f5064b.f5348a <= c0545Ie.f5064b.f5348a && c0545Ie2.f5063a == c0545Ie.f5063a;
                    if (!z2) {
                        break;
                    }
                    c0545IeArr[iArr[i]] = (C0545Ie) arrayList.get(i);
                }
            }
            if (z2) {
                z = true;
                break;
            }
        }
        if (z) {
            return Arrays.asList(c0545IeArr);
        }
        return null;
    }
}
