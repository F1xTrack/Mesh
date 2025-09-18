package p000;

import android.text.SpannableStringBuilder;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* renamed from: ld1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10162ld1 {

    /* renamed from: a */
    public final String f37195a;

    /* renamed from: b */
    public final String f37196b;

    /* renamed from: c */
    public final boolean f37197c;

    /* renamed from: d */
    public final long f37198d;

    /* renamed from: e */
    public final long f37199e;

    /* renamed from: f */
    public final C10546od1 f37200f;

    /* renamed from: g */
    public final String[] f37201g;

    /* renamed from: h */
    public final String f37202h;

    /* renamed from: i */
    public final String f37203i;

    /* renamed from: j */
    public final C10162ld1 f37204j;

    /* renamed from: k */
    public final HashMap f37205k;

    /* renamed from: l */
    public final HashMap f37206l;

    /* renamed from: m */
    public ArrayList f37207m;

    public C10162ld1(String str, String str2, long j, long j2, C10546od1 c10546od1, String[] strArr, String str3, String str4, C10162ld1 c10162ld1) {
        this.f37195a = str;
        this.f37196b = str2;
        this.f37203i = str4;
        this.f37200f = c10546od1;
        this.f37201g = strArr;
        this.f37197c = str2 != null;
        this.f37198d = j;
        this.f37199e = j2;
        str3.getClass();
        this.f37202h = str3;
        this.f37204j = c10162ld1;
        this.f37205k = new HashMap();
        this.f37206l = new HashMap();
    }

    /* renamed from: a */
    public static C10162ld1 m22515a(String str) {
        return new C10162ld1(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    /* renamed from: e */
    public static SpannableStringBuilder m22516e(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            C6870tB c6870tB = new C6870tB();
            c6870tB.f42901a = new SpannableStringBuilder();
            treeMap.put(str, c6870tB);
        }
        CharSequence charSequence = ((C6870tB) treeMap.get(str)).f42901a;
        charSequence.getClass();
        return (SpannableStringBuilder) charSequence;
    }

    /* renamed from: b */
    public final C10162ld1 m22517b(int i) {
        ArrayList arrayList = this.f37207m;
        if (arrayList != null) {
            return (C10162ld1) arrayList.get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    /* renamed from: c */
    public final int m22518c() {
        ArrayList arrayList = this.f37207m;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    /* renamed from: d */
    public final void m22519d(TreeSet treeSet, boolean z) {
        String str = this.f37195a;
        boolean zEquals = "p".equals(str);
        boolean zEquals2 = "div".equals(str);
        if (z || zEquals || (zEquals2 && this.f37203i != null)) {
            long j = this.f37198d;
            if (j != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j));
            }
            long j2 = this.f37199e;
            if (j2 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j2));
            }
        }
        if (this.f37207m == null) {
            return;
        }
        for (int i = 0; i < this.f37207m.size(); i++) {
            ((C10162ld1) this.f37207m.get(i)).m22519d(treeSet, z || zEquals);
        }
    }

    /* renamed from: f */
    public final boolean m22520f(long j) {
        long j2 = this.f37198d;
        long j3 = this.f37199e;
        return (j2 == -9223372036854775807L && j3 == -9223372036854775807L) || (j2 <= j && j3 == -9223372036854775807L) || ((j2 == -9223372036854775807L && j < j3) || (j2 <= j && j < j3));
    }

    /* renamed from: g */
    public final void m22521g(long j, String str, ArrayList arrayList) {
        String str2;
        String str3 = this.f37202h;
        if (!"".equals(str3)) {
            str = str3;
        }
        if (m22520f(j) && "div".equals(this.f37195a) && (str2 = this.f37203i) != null) {
            arrayList.add(new Pair(str, str2));
            return;
        }
        for (int i = 0; i < m22518c(); i++) {
            m22517b(i).m22521g(j, str, arrayList);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:142:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02c1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b8  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m22522h(long r20, java.util.Map r22, java.util.HashMap r23, java.lang.String r24, java.util.TreeMap r25) {
        /*
            Method dump skipped, instructions count: 742
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C10162ld1.m22522h(long, java.util.Map, java.util.HashMap, java.lang.String, java.util.TreeMap):void");
    }

    /* renamed from: i */
    public final void m22523i(long j, boolean z, String str, TreeMap treeMap) {
        HashMap map = this.f37205k;
        map.clear();
        HashMap map2 = this.f37206l;
        map2.clear();
        String str2 = this.f37195a;
        if ("metadata".equals(str2)) {
            return;
        }
        String str3 = this.f37202h;
        String str4 = "".equals(str3) ? str : str3;
        if (this.f37197c && z) {
            SpannableStringBuilder spannableStringBuilderM22516e = m22516e(str4, treeMap);
            String str5 = this.f37196b;
            str5.getClass();
            spannableStringBuilderM22516e.append((CharSequence) str5);
            return;
        }
        if ("br".equals(str2) && z) {
            m22516e(str4, treeMap).append('\n');
            return;
        }
        if (m22520f(j)) {
            for (Map.Entry entry : treeMap.entrySet()) {
                String str6 = (String) entry.getKey();
                CharSequence charSequence = ((C6870tB) entry.getValue()).f42901a;
                charSequence.getClass();
                map.put(str6, Integer.valueOf(charSequence.length()));
            }
            boolean zEquals = "p".equals(str2);
            for (int i = 0; i < m22518c(); i++) {
                m22517b(i).m22523i(j, z || zEquals, str4, treeMap);
            }
            if (zEquals) {
                SpannableStringBuilder spannableStringBuilderM22516e2 = m22516e(str4, treeMap);
                int length = spannableStringBuilderM22516e2.length() - 1;
                while (length >= 0 && spannableStringBuilderM22516e2.charAt(length) == ' ') {
                    length--;
                }
                if (length >= 0 && spannableStringBuilderM22516e2.charAt(length) != '\n') {
                    spannableStringBuilderM22516e2.append('\n');
                }
            }
            for (Map.Entry entry2 : treeMap.entrySet()) {
                String str7 = (String) entry2.getKey();
                CharSequence charSequence2 = ((C6870tB) entry2.getValue()).f42901a;
                charSequence2.getClass();
                map2.put(str7, Integer.valueOf(charSequence2.length()));
            }
        }
    }
}
