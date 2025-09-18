package p000;

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
public final class C11228ty1 implements InterfaceC8663Zy1, InterfaceC7885Kz1, Iterable {

    /* renamed from: a */
    public final TreeMap f43429a;

    /* renamed from: b */
    public final TreeMap f43430b;

    public C11228ty1() {
        this.f43429a = new TreeMap();
        this.f43430b = new TreeMap();
    }

    @Override // p000.InterfaceC8663Zy1
    /* renamed from: b */
    public final InterfaceC7885Kz1 mo1956b(String str) {
        InterfaceC7885Kz1 interfaceC7885Kz1;
        return "length".equals(str) ? new C7987My1(Double.valueOf(m25039r())) : (!mo1957d(str) || (interfaceC7885Kz1 = (InterfaceC7885Kz1) this.f43430b.get(str)) == null) ? InterfaceC7885Kz1.f6417i1 : interfaceC7885Kz1;
    }

    @Override // p000.InterfaceC8663Zy1
    /* renamed from: d */
    public final boolean mo1957d(String str) {
        return "length".equals(str) || this.f43430b.containsKey(str);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C11228ty1)) {
            return false;
        }
        C11228ty1 c11228ty1 = (C11228ty1) obj;
        if (m25039r() != c11228ty1.m25039r()) {
            return false;
        }
        TreeMap treeMap = this.f43429a;
        if (treeMap.isEmpty()) {
            return c11228ty1.f43429a.isEmpty();
        }
        for (int iIntValue = ((Integer) treeMap.firstKey()).intValue(); iIntValue <= ((Integer) treeMap.lastKey()).intValue(); iIntValue++) {
            if (!m25037i(iIntValue).equals(c11228ty1.m25037i(iIntValue))) {
                return false;
            }
        }
        return true;
    }

    @Override // p000.InterfaceC8663Zy1
    /* renamed from: h */
    public final void mo1958h(String str, InterfaceC7885Kz1 interfaceC7885Kz1) {
        TreeMap treeMap = this.f43430b;
        if (interfaceC7885Kz1 == null) {
            treeMap.remove(str);
        } else {
            treeMap.put(str, interfaceC7885Kz1);
        }
    }

    public final int hashCode() {
        return this.f43429a.hashCode() * 31;
    }

    /* renamed from: i */
    public final InterfaceC7885Kz1 m25037i(int i) {
        InterfaceC7885Kz1 interfaceC7885Kz1;
        if (i < m25039r()) {
            return (!m25043v(i) || (interfaceC7885Kz1 = (InterfaceC7885Kz1) this.f43429a.get(Integer.valueOf(i))) == null) ? InterfaceC7885Kz1.f6417i1 : interfaceC7885Kz1;
        }
        throw new IndexOutOfBoundsException("Attempting to get element outside of current array");
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C9464gA1(2, this);
    }

    /* renamed from: k */
    public final void m25038k(InterfaceC7885Kz1 interfaceC7885Kz1) {
        m25042u(m25039r(), interfaceC7885Kz1);
    }

    @Override // p000.InterfaceC7885Kz1
    /* renamed from: m */
    public final Iterator mo1959m() {
        return new C10332my1(this.f43429a.keySet().iterator(), this.f43430b.keySet().iterator());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:671:0x041a, code lost:
    
        if (p000.S12.m7150b(r3, r34, (p000.C8197Qz1) r0, java.lang.Boolean.FALSE, java.lang.Boolean.TRUE).m25039r() != m25039r()) goto L672;
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
    @Override // p000.InterfaceC7885Kz1
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p000.InterfaceC7885Kz1 mo1960q(java.lang.String r33, p000.C10919rY0 r34, java.util.ArrayList r35) {
        /*
            Method dump skipped, instructions count: 2494
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C11228ty1.mo1960q(java.lang.String, rY0, java.util.ArrayList):Kz1");
    }

    /* renamed from: r */
    public final int m25039r() {
        TreeMap treeMap = this.f43429a;
        if (treeMap.isEmpty()) {
            return 0;
        }
        return ((Integer) treeMap.lastKey()).intValue() + 1;
    }

    /* renamed from: s */
    public final String m25040s(String str) {
        if (str == null) {
            str = "";
        }
        StringBuilder sb = new StringBuilder();
        if (!this.f43429a.isEmpty()) {
            for (int i = 0; i < m25039r(); i++) {
                InterfaceC7885Kz1 interfaceC7885Kz1M25037i = m25037i(i);
                sb.append(str);
                if (!(interfaceC7885Kz1M25037i instanceof C11000sA1) && !(interfaceC7885Kz1M25037i instanceof C11867yz1)) {
                    sb.append(interfaceC7885Kz1M25037i.zzf());
                }
            }
            sb.delete(0, str.length());
        }
        return sb.toString();
    }

    /* renamed from: t */
    public final void m25041t(int i) {
        TreeMap treeMap = this.f43429a;
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
            treeMap.put(Integer.valueOf(i2), InterfaceC7885Kz1.f6417i1);
            return;
        }
        while (true) {
            i++;
            if (i > ((Integer) treeMap.lastKey()).intValue()) {
                return;
            }
            InterfaceC7885Kz1 interfaceC7885Kz1 = (InterfaceC7885Kz1) treeMap.get(Integer.valueOf(i));
            if (interfaceC7885Kz1 != null) {
                treeMap.put(Integer.valueOf(i - 1), interfaceC7885Kz1);
                treeMap.remove(Integer.valueOf(i));
            }
        }
    }

    public final String toString() {
        return m25040s(StringUtils.COMMA);
    }

    /* renamed from: u */
    public final void m25042u(int i, InterfaceC7885Kz1 interfaceC7885Kz1) {
        if (i > 32468) {
            throw new IllegalStateException("Array too large");
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(AbstractC11153tN0.m24909u(i, "Out of bounds index: "));
        }
        TreeMap treeMap = this.f43429a;
        if (interfaceC7885Kz1 == null) {
            treeMap.remove(Integer.valueOf(i));
        } else {
            treeMap.put(Integer.valueOf(i), interfaceC7885Kz1);
        }
    }

    /* renamed from: v */
    public final boolean m25043v(int i) {
        if (i >= 0) {
            TreeMap treeMap = this.f43429a;
            if (i <= ((Integer) treeMap.lastKey()).intValue()) {
                return treeMap.containsKey(Integer.valueOf(i));
            }
        }
        throw new IndexOutOfBoundsException(AbstractC11153tN0.m24909u(i, "Out of bounds index: "));
    }

    /* renamed from: y */
    public final Iterator m25044y() {
        return this.f43429a.keySet().iterator();
    }

    /* renamed from: z */
    public final ArrayList m25045z() {
        ArrayList arrayList = new ArrayList(m25039r());
        for (int i = 0; i < m25039r(); i++) {
            arrayList.add(m25037i(i));
        }
        return arrayList;
    }

    @Override // p000.InterfaceC7885Kz1
    public final InterfaceC7885Kz1 zzc() {
        C11228ty1 c11228ty1 = new C11228ty1();
        for (Map.Entry entry : this.f43429a.entrySet()) {
            boolean z = entry.getValue() instanceof InterfaceC8663Zy1;
            TreeMap treeMap = c11228ty1.f43429a;
            if (z) {
                treeMap.put((Integer) entry.getKey(), (InterfaceC7885Kz1) entry.getValue());
            } else {
                treeMap.put((Integer) entry.getKey(), ((InterfaceC7885Kz1) entry.getValue()).zzc());
            }
        }
        return c11228ty1;
    }

    @Override // p000.InterfaceC7885Kz1
    public final Boolean zzd() {
        return Boolean.TRUE;
    }

    @Override // p000.InterfaceC7885Kz1
    public final Double zze() {
        TreeMap treeMap = this.f43429a;
        return treeMap.size() == 1 ? m25037i(0).zze() : treeMap.size() <= 0 ? Double.valueOf(ConfigValue.DOUBLE_DEFAULT_VALUE) : Double.valueOf(Double.NaN);
    }

    @Override // p000.InterfaceC7885Kz1
    public final String zzf() {
        return m25040s(StringUtils.COMMA);
    }

    public C11228ty1(List list) {
        this();
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                m25042u(i, (InterfaceC7885Kz1) list.get(i));
            }
        }
    }

    public C11228ty1(InterfaceC7885Kz1... interfaceC7885Kz1Arr) {
        this(Arrays.asList(interfaceC7885Kz1Arr));
    }
}
