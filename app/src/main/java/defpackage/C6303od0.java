package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* renamed from: od0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6303od0 implements InterfaceC1637Ut0 {
    public static final List d;
    public final String[] a;
    public final Set b;
    public final ArrayList c;

    static {
        String strH = AbstractC8069xu.H(AbstractC8259yu.f('k', 'o', 't', 'l', 'i', 'n'), "", null, null, null, 62);
        List listF = AbstractC8259yu.f(strH.concat("/Any"), strH.concat("/Nothing"), strH.concat("/Unit"), strH.concat("/Throwable"), strH.concat("/Number"), strH.concat("/Byte"), strH.concat("/Double"), strH.concat("/Float"), strH.concat("/Int"), strH.concat("/Long"), strH.concat("/Short"), strH.concat("/Boolean"), strH.concat("/Char"), strH.concat("/CharSequence"), strH.concat("/String"), strH.concat("/Comparable"), strH.concat("/Enum"), strH.concat("/Array"), strH.concat("/ByteArray"), strH.concat("/DoubleArray"), strH.concat("/FloatArray"), strH.concat("/IntArray"), strH.concat("/LongArray"), strH.concat("/ShortArray"), strH.concat("/BooleanArray"), strH.concat("/CharArray"), strH.concat("/Cloneable"), strH.concat("/Annotation"), strH.concat("/collections/Iterable"), strH.concat("/collections/MutableIterable"), strH.concat("/collections/Collection"), strH.concat("/collections/MutableCollection"), strH.concat("/collections/List"), strH.concat("/collections/MutableList"), strH.concat("/collections/Set"), strH.concat("/collections/MutableSet"), strH.concat("/collections/Map"), strH.concat("/collections/MutableMap"), strH.concat("/collections/Map.Entry"), strH.concat("/collections/MutableMap.MutableEntry"), strH.concat("/collections/Iterator"), strH.concat("/collections/MutableIterator"), strH.concat("/collections/ListIterator"), strH.concat("/collections/MutableListIterator"));
        d = listF;
        L8 l8H0 = AbstractC8069xu.h0(listF);
        int iB = AbstractC7287tn0.b(AbstractC8449zu.k(l8H0));
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
        Iterator it = l8H0.iterator();
        while (true) {
            C2309bM c2309bM = (C2309bM) it;
            if (!c2309bM.b.hasNext()) {
                return;
            }
            C5255j80 c5255j80 = (C5255j80) c2309bM.next();
            linkedHashMap.put((String) c5255j80.b, Integer.valueOf(c5255j80.a));
        }
    }

    public C6303od0(C0576Hd0 c0576Hd0, String[] strArr) {
        O90.f(strArr, "strings");
        List list = c0576Hd0.c;
        Set setG0 = list.isEmpty() ? SN.a : AbstractC8069xu.g0(list);
        List<C0498Gd0> list2 = c0576Hd0.b;
        O90.e(list2, "getRecordList(...)");
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(list2.size());
        for (C0498Gd0 c0498Gd0 : list2) {
            int i = c0498Gd0.c;
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(c0498Gd0);
            }
        }
        arrayList.trimToSize();
        this.a = strArr;
        this.b = setG0;
        this.c = arrayList;
    }

    @Override // defpackage.InterfaceC1637Ut0
    public final String c(int i) {
        return getString(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    @Override // defpackage.InterfaceC1637Ut0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String getString(int r10) {
        /*
            r9 = this;
            java.util.ArrayList r0 = r9.c
            java.lang.Object r0 = r0.get(r10)
            Gd0 r0 = (defpackage.C0498Gd0) r0
            int r1 = r0.b
            r2 = r1 & 4
            r3 = 2
            r4 = 4
            if (r2 != r4) goto L29
            java.lang.Object r10 = r0.e
            boolean r1 = r10 instanceof java.lang.String
            if (r1 == 0) goto L19
            java.lang.String r10 = (java.lang.String) r10
            goto L43
        L19:
            Hk r10 = (defpackage.AbstractC0596Hk) r10
            java.lang.String r1 = r10.z()
            boolean r10 = r10.r()
            if (r10 == 0) goto L27
            r0.e = r1
        L27:
            r10 = r1
            goto L43
        L29:
            r1 = r1 & r3
            if (r1 != r3) goto L3f
            java.util.List r1 = defpackage.C6303od0.d
            int r2 = r1.size()
            int r4 = r0.d
            if (r4 < 0) goto L3f
            if (r4 >= r2) goto L3f
            java.lang.Object r10 = r1.get(r4)
            java.lang.String r10 = (java.lang.String) r10
            goto L43
        L3f:
            java.lang.String[] r1 = r9.a
            r10 = r1[r10]
        L43:
            java.util.List r1 = r0.g
            int r1 = r1.size()
            java.lang.String r2 = "substring(...)"
            r4 = 0
            r5 = 1
            if (r1 < r3) goto L8f
            java.util.List r1 = r0.g
            defpackage.O90.c(r1)
            java.lang.Object r6 = r1.get(r4)
            java.lang.Integer r6 = (java.lang.Integer) r6
            java.lang.Object r1 = r1.get(r5)
            java.lang.Integer r1 = (java.lang.Integer) r1
            defpackage.O90.c(r6)
            int r7 = r6.intValue()
            if (r7 < 0) goto L8f
            int r7 = r6.intValue()
            defpackage.O90.c(r1)
            int r8 = r1.intValue()
            if (r7 > r8) goto L8f
            int r7 = r1.intValue()
            int r8 = r10.length()
            if (r7 > r8) goto L8f
            int r6 = r6.intValue()
            int r1 = r1.intValue()
            java.lang.String r10 = r10.substring(r6, r1)
            defpackage.O90.e(r10, r2)
        L8f:
            java.util.List r1 = r0.i
            int r1 = r1.size()
            if (r1 < r3) goto Lb9
            java.util.List r1 = r0.i
            defpackage.O90.c(r1)
            java.lang.Object r4 = r1.get(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            java.lang.Object r1 = r1.get(r5)
            java.lang.Integer r1 = (java.lang.Integer) r1
            defpackage.O90.c(r10)
            int r4 = r4.intValue()
            char r4 = (char) r4
            int r1 = r1.intValue()
            char r1 = (char) r1
            java.lang.String r10 = defpackage.D51.l(r10, r4, r1)
        Lb9:
            Fd0 r0 = r0.f
            if (r0 != 0) goto Lbf
            Fd0 r0 = defpackage.EnumC0420Fd0.NONE
        Lbf:
            int r0 = r0.ordinal()
            r1 = 46
            r4 = 36
            if (r0 == r5) goto Le3
            if (r0 == r3) goto Lcc
            goto Lea
        Lcc:
            int r0 = r10.length()
            if (r0 < r3) goto Lde
            int r0 = r10.length()
            int r0 = r0 - r5
            java.lang.String r10 = r10.substring(r5, r0)
            defpackage.O90.e(r10, r2)
        Lde:
            java.lang.String r10 = defpackage.D51.l(r10, r4, r1)
            goto Lea
        Le3:
            defpackage.O90.c(r10)
            java.lang.String r10 = defpackage.D51.l(r10, r4, r1)
        Lea:
            defpackage.O90.c(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6303od0.getString(int):java.lang.String");
    }

    @Override // defpackage.InterfaceC1637Ut0
    public final boolean k(int i) {
        return this.b.contains(Integer.valueOf(i));
    }
}
