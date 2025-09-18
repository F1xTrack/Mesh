package defpackage;

import com.yandex.varioqub.config.model.ConfigValue;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: ty1 */
/* loaded from: classes.dex */
public final class C7321ty1 implements InterfaceC2043Zy1, InterfaceC0877Kz1, Iterable {
    public final TreeMap a;
    public final TreeMap b;

    public C7321ty1() {
        this.a = new TreeMap();
        this.b = new TreeMap();
    }

    @Override // defpackage.InterfaceC2043Zy1
    public final InterfaceC0877Kz1 b(String str) {
        InterfaceC0877Kz1 interfaceC0877Kz1;
        return "length".equals(str) ? new C1029My1(Double.valueOf(r())) : (!d(str) || (interfaceC0877Kz1 = (InterfaceC0877Kz1) this.b.get(str)) == null) ? InterfaceC0877Kz1.i1 : interfaceC0877Kz1;
    }

    @Override // defpackage.InterfaceC2043Zy1
    public final boolean d(String str) {
        return "length".equals(str) || this.b.containsKey(str);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7321ty1)) {
            return false;
        }
        C7321ty1 c7321ty1 = (C7321ty1) obj;
        if (r() != c7321ty1.r()) {
            return false;
        }
        TreeMap treeMap = this.a;
        if (treeMap.isEmpty()) {
            return c7321ty1.a.isEmpty();
        }
        for (int iIntValue = ((Integer) treeMap.firstKey()).intValue(); iIntValue <= ((Integer) treeMap.lastKey()).intValue(); iIntValue++) {
            if (!i(iIntValue).equals(c7321ty1.i(iIntValue))) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.InterfaceC2043Zy1
    public final void h(String str, InterfaceC0877Kz1 interfaceC0877Kz1) {
        TreeMap treeMap = this.b;
        if (interfaceC0877Kz1 == null) {
            treeMap.remove(str);
        } else {
            treeMap.put(str, interfaceC0877Kz1);
        }
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final InterfaceC0877Kz1 i(int i) {
        InterfaceC0877Kz1 interfaceC0877Kz1;
        if (i < r()) {
            return (!v(i) || (interfaceC0877Kz1 = (InterfaceC0877Kz1) this.a.get(Integer.valueOf(i))) == null) ? InterfaceC0877Kz1.i1 : interfaceC0877Kz1;
        }
        throw new IndexOutOfBoundsException("Attempting to get element outside of current array");
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C3913gA1(2, this);
    }

    public final void k(InterfaceC0877Kz1 interfaceC0877Kz1) {
        u(r(), interfaceC0877Kz1);
    }

    @Override // defpackage.InterfaceC0877Kz1
    public final Iterator m() {
        return new C5985my1(this.a.keySet().iterator(), this.b.keySet().iterator());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:671:0x041a, code lost:
    
        if (defpackage.S12.b(r3, r34, (defpackage.C1344Qz1) r0, java.lang.Boolean.FALSE, java.lang.Boolean.TRUE).r() != r()) goto L672;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:517:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:519:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:523:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:527:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:531:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:535:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:539:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:543:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:547:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:551:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:556:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:560:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:564:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:568:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:572:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:577:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:581:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:585:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:590:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:594:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:598:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:603:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:605:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:630:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:644:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:645:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:662:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:666:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:676:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:690:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:704:0x04fc  */
    /* JADX WARN: Removed duplicated region for block: B:711:0x0532  */
    /* JADX WARN: Removed duplicated region for block: B:725:0x0577  */
    /* JADX WARN: Removed duplicated region for block: B:729:0x0590  */
    /* JADX WARN: Removed duplicated region for block: B:737:0x05c9  */
    /* JADX WARN: Removed duplicated region for block: B:756:0x0658  */
    /* JADX WARN: Removed duplicated region for block: B:782:0x0704  */
    /* JADX WARN: Removed duplicated region for block: B:790:0x0737  */
    /* JADX WARN: Removed duplicated region for block: B:834:0x0857  */
    /* JADX WARN: Removed duplicated region for block: B:835:0x0862  */
    /* JADX WARN: Removed duplicated region for block: B:847:0x08c8  */
    /* JADX WARN: Removed duplicated region for block: B:863:0x092b  */
    /* JADX WARN: Type inference failed for: r0v110 */
    /* JADX WARN: Type inference failed for: r0v114, types: [My1] */
    /* JADX WARN: Type inference failed for: r0v115, types: [My1] */
    /* JADX WARN: Type inference failed for: r0v116, types: [My1] */
    /* JADX WARN: Type inference failed for: r0v43, types: [My1] */
    /* JADX WARN: Type inference failed for: r0v44, types: [My1] */
    /* JADX WARN: Type inference failed for: r0v45, types: [My1] */
    /* JADX WARN: Type inference failed for: r0v50, types: [My1] */
    /* JADX WARN: Type inference failed for: r0v6, types: [Wz1] */
    /* JADX WARN: Type inference failed for: r0v65, types: [Wz1] */
    /* JADX WARN: Type inference failed for: r0v71, types: [My1] */
    /* JADX WARN: Type inference failed for: r0v8, types: [ty1] */
    /* JADX WARN: Type inference failed for: r0v99, types: [ty1] */
    /* JADX WARN: Type inference failed for: r33v0, types: [java.lang.Object, java.lang.String] */
    @Override // defpackage.InterfaceC0877Kz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.InterfaceC0877Kz1 q(java.lang.String r33, defpackage.C6860rY0 r34, java.util.ArrayList r35) {
        /*
            Method dump skipped, instructions count: 2494
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7321ty1.q(java.lang.String, rY0, java.util.ArrayList):Kz1");
    }

    public final int r() {
        TreeMap treeMap = this.a;
        if (treeMap.isEmpty()) {
            return 0;
        }
        return ((Integer) treeMap.lastKey()).intValue() + 1;
    }

    public final String s(String str) {
        if (str == null) {
            str = "";
        }
        StringBuilder sb = new StringBuilder();
        if (!this.a.isEmpty()) {
            for (int i = 0; i < r(); i++) {
                InterfaceC0877Kz1 interfaceC0877Kz1I = i(i);
                sb.append(str);
                if (!(interfaceC0877Kz1I instanceof C6980sA1) && !(interfaceC0877Kz1I instanceof C8276yz1)) {
                    sb.append(interfaceC0877Kz1I.zzf());
                }
            }
            sb.delete(0, str.length());
        }
        return sb.toString();
    }

    public final void t(int i) {
        TreeMap treeMap = this.a;
        int iIntValue = ((Integer) treeMap.lastKey()).intValue();
        if (i > iIntValue || i < 0) {
            return;
        }
        treeMap.remove(Integer.valueOf(i));
        if (i == iIntValue) {
            int i2 = i - 1;
            if (treeMap.containsKey(Integer.valueOf(i2)) || i2 < 0) {
                return;
            }
            treeMap.put(Integer.valueOf(i2), InterfaceC0877Kz1.i1);
            return;
        }
        while (true) {
            i++;
            if (i > ((Integer) treeMap.lastKey()).intValue()) {
                return;
            }
            InterfaceC0877Kz1 interfaceC0877Kz1 = (InterfaceC0877Kz1) treeMap.get(Integer.valueOf(i));
            if (interfaceC0877Kz1 != null) {
                treeMap.put(Integer.valueOf(i - 1), interfaceC0877Kz1);
                treeMap.remove(Integer.valueOf(i));
            }
        }
    }

    public final String toString() {
        return s(StringUtils.COMMA);
    }

    public final void u(int i, InterfaceC0877Kz1 interfaceC0877Kz1) {
        if (i > 32468) {
            throw new IllegalStateException("Array too large");
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(AbstractC7209tN0.u(i, "Out of bounds index: "));
        }
        TreeMap treeMap = this.a;
        if (interfaceC0877Kz1 == null) {
            treeMap.remove(Integer.valueOf(i));
        } else {
            treeMap.put(Integer.valueOf(i), interfaceC0877Kz1);
        }
    }

    public final boolean v(int i) {
        if (i >= 0) {
            TreeMap treeMap = this.a;
            if (i <= ((Integer) treeMap.lastKey()).intValue()) {
                return treeMap.containsKey(Integer.valueOf(i));
            }
        }
        throw new IndexOutOfBoundsException(AbstractC7209tN0.u(i, "Out of bounds index: "));
    }

    public final Iterator y() {
        return this.a.keySet().iterator();
    }

    public final ArrayList z() {
        ArrayList arrayList = new ArrayList(r());
        for (int i = 0; i < r(); i++) {
            arrayList.add(i(i));
        }
        return arrayList;
    }

    @Override // defpackage.InterfaceC0877Kz1
    public final InterfaceC0877Kz1 zzc() {
        C7321ty1 c7321ty1 = new C7321ty1();
        for (Map.Entry entry : this.a.entrySet()) {
            boolean z = entry.getValue() instanceof InterfaceC2043Zy1;
            TreeMap treeMap = c7321ty1.a;
            if (z) {
                treeMap.put((Integer) entry.getKey(), (InterfaceC0877Kz1) entry.getValue());
            } else {
                treeMap.put((Integer) entry.getKey(), ((InterfaceC0877Kz1) entry.getValue()).zzc());
            }
        }
        return c7321ty1;
    }

    @Override // defpackage.InterfaceC0877Kz1
    public final Boolean zzd() {
        return Boolean.TRUE;
    }

    @Override // defpackage.InterfaceC0877Kz1
    public final Double zze() {
        TreeMap treeMap = this.a;
        return treeMap.size() == 1 ? i(0).zze() : treeMap.size() <= 0 ? Double.valueOf(ConfigValue.DOUBLE_DEFAULT_VALUE) : Double.valueOf(Double.NaN);
    }

    @Override // defpackage.InterfaceC0877Kz1
    public final String zzf() {
        return s(StringUtils.COMMA);
    }

    public C7321ty1(List list) {
        this();
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                u(i, (InterfaceC0877Kz1) list.get(i));
            }
        }
    }

    public C7321ty1(InterfaceC0877Kz1... interfaceC0877Kz1Arr) {
        this(Arrays.asList(interfaceC0877Kz1Arr));
    }
}
