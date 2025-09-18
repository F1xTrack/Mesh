package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* renamed from: od0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10545od0 implements InterfaceC8392Ut0 {

    /* renamed from: d */
    public static final List f39125d;

    /* renamed from: a */
    public final String[] f39126a;

    /* renamed from: b */
    public final Set f39127b;

    /* renamed from: c */
    public final ArrayList f39128c;

    static {
        String strM25962H = AbstractC7167xu.m25962H(AbstractC7230yu.m26275f('k', 'o', 't', 'l', 'i', 'n'), "", null, null, null, 62);
        List listM26275f = AbstractC7230yu.m26275f(strM25962H.concat("/Any"), strM25962H.concat("/Nothing"), strM25962H.concat("/Unit"), strM25962H.concat("/Throwable"), strM25962H.concat("/Number"), strM25962H.concat("/Byte"), strM25962H.concat("/Double"), strM25962H.concat("/Float"), strM25962H.concat("/Int"), strM25962H.concat("/Long"), strM25962H.concat("/Short"), strM25962H.concat("/Boolean"), strM25962H.concat("/Char"), strM25962H.concat("/CharSequence"), strM25962H.concat("/String"), strM25962H.concat("/Comparable"), strM25962H.concat("/Enum"), strM25962H.concat("/Array"), strM25962H.concat("/ByteArray"), strM25962H.concat("/DoubleArray"), strM25962H.concat("/FloatArray"), strM25962H.concat("/IntArray"), strM25962H.concat("/LongArray"), strM25962H.concat("/ShortArray"), strM25962H.concat("/BooleanArray"), strM25962H.concat("/CharArray"), strM25962H.concat("/Cloneable"), strM25962H.concat("/Annotation"), strM25962H.concat("/collections/Iterable"), strM25962H.concat("/collections/MutableIterable"), strM25962H.concat("/collections/Collection"), strM25962H.concat("/collections/MutableCollection"), strM25962H.concat("/collections/List"), strM25962H.concat("/collections/MutableList"), strM25962H.concat("/collections/Set"), strM25962H.concat("/collections/MutableSet"), strM25962H.concat("/collections/Map"), strM25962H.concat("/collections/MutableMap"), strM25962H.concat("/collections/Map.Entry"), strM25962H.concat("/collections/MutableMap.MutableEntry"), strM25962H.concat("/collections/Iterator"), strM25962H.concat("/collections/MutableIterator"), strM25962H.concat("/collections/ListIterator"), strM25962H.concat("/collections/MutableListIterator"));
        f39125d = listM26275f;
        C0702L8 c0702l8M25988h0 = AbstractC7167xu.m25988h0(listM26275f);
        int iM24983b = AbstractC11205tn0.m24983b(AbstractC7293zu.m26586k(c0702l8M25988h0));
        if (iM24983b < 16) {
            iM24983b = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM24983b);
        Iterator it = c0702l8M25988h0.iterator();
        while (true) {
            C1780bM c1780bM = (C1780bM) it;
            if (!c1780bM.f16986b.hasNext()) {
                return;
            }
            C9843j80 c9843j80 = (C9843j80) c1780bM.next();
            linkedHashMap.put((String) c9843j80.f34933b, Integer.valueOf(c9843j80.f34932a));
        }
    }

    public C10545od0(C7684Hd0 c7684Hd0, String[] strArr) {
        O90.m5968f(strArr, "strings");
        List list = c7684Hd0.f4383c;
        Set setM25987g0 = list.isEmpty() ? C1156SN.f10705a : AbstractC7167xu.m25987g0(list);
        List<C7632Gd0> list2 = c7684Hd0.f4382b;
        O90.m5967e(list2, "getRecordList(...)");
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(list2.size());
        for (C7632Gd0 c7632Gd0 : list2) {
            int i = c7632Gd0.f3828c;
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(c7632Gd0);
            }
        }
        arrayList.trimToSize();
        this.f39126a = strArr;
        this.f39127b = setM25987g0;
        this.f39128c = arrayList;
    }

    @Override // p000.InterfaceC8392Ut0
    /* renamed from: c */
    public final String mo5440c(int i) {
        return getString(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    @Override // p000.InterfaceC8392Ut0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String getString(int r10) {
        /*
            r9 = this;
            java.util.ArrayList r0 = r9.f39128c
            java.lang.Object r0 = r0.get(r10)
            Gd0 r0 = (p000.C7632Gd0) r0
            int r1 = r0.f3827b
            r2 = r1 & 4
            r3 = 2
            r4 = 4
            if (r2 != r4) goto L29
            java.lang.Object r10 = r0.f3830e
            boolean r1 = r10 instanceof java.lang.String
            if (r1 == 0) goto L19
            java.lang.String r10 = (java.lang.String) r10
            goto L43
        L19:
            Hk r10 = (p000.AbstractC0488Hk) r10
            java.lang.String r1 = r10.m3583z()
            boolean r10 = r10.mo3578r()
            if (r10 == 0) goto L27
            r0.f3830e = r1
        L27:
            r10 = r1
            goto L43
        L29:
            r1 = r1 & r3
            if (r1 != r3) goto L3f
            java.util.List r1 = p000.C10545od0.f39125d
            int r2 = r1.size()
            int r4 = r0.f3829d
            if (r4 < 0) goto L3f
            if (r4 >= r2) goto L3f
            java.lang.Object r10 = r1.get(r4)
            java.lang.String r10 = (java.lang.String) r10
            goto L43
        L3f:
            java.lang.String[] r1 = r9.f39126a
            r10 = r1[r10]
        L43:
            java.util.List r1 = r0.f3832g
            int r1 = r1.size()
            java.lang.String r2 = "substring(...)"
            r4 = 0
            r5 = 1
            if (r1 < r3) goto L8f
            java.util.List r1 = r0.f3832g
            p000.O90.m5965c(r1)
            java.lang.Object r6 = r1.get(r4)
            java.lang.Integer r6 = (java.lang.Integer) r6
            java.lang.Object r1 = r1.get(r5)
            java.lang.Integer r1 = (java.lang.Integer) r1
            p000.O90.m5965c(r6)
            int r7 = r6.intValue()
            if (r7 < 0) goto L8f
            int r7 = r6.intValue()
            p000.O90.m5965c(r1)
            int r8 = r1.intValue()
            if (r7 > r8) goto L8f
            int r7 = r1.intValue()
            int r8 = r10.length()
            if (r7 > r8) goto L8f
            int r6 = r6.intValue()
            int r1 = r1.intValue()
            java.lang.String r10 = r10.substring(r6, r1)
            p000.O90.m5967e(r10, r2)
        L8f:
            java.util.List r1 = r0.f3834i
            int r1 = r1.size()
            if (r1 < r3) goto Lb9
            java.util.List r1 = r0.f3834i
            p000.O90.m5965c(r1)
            java.lang.Object r4 = r1.get(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            java.lang.Object r1 = r1.get(r5)
            java.lang.Integer r1 = (java.lang.Integer) r1
            p000.O90.m5965c(r10)
            int r4 = r4.intValue()
            char r4 = (char) r4
            int r1 = r1.intValue()
            char r1 = (char) r1
            java.lang.String r10 = p000.D51.m1553l(r10, r4, r1)
        Lb9:
            Fd0 r0 = r0.f3831f
            if (r0 != 0) goto Lbf
            Fd0 r0 = p000.EnumC7580Fd0.NONE
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
            p000.O90.m5967e(r10, r2)
        Lde:
            java.lang.String r10 = p000.D51.m1553l(r10, r4, r1)
            goto Lea
        Le3:
            p000.O90.m5965c(r10)
            java.lang.String r10 = p000.D51.m1553l(r10, r4, r1)
        Lea:
            p000.O90.m5965c(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C10545od0.getString(int):java.lang.String");
    }

    @Override // p000.InterfaceC8392Ut0
    /* renamed from: k */
    public final boolean mo5446k(int i) {
        return this.f39127b.contains(Integer.valueOf(i));
    }
}
