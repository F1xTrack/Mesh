package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: Nk0 */
/* loaded from: classes.dex */
public final class C1064Nk0 implements Y40 {
    public Locale a;
    public HT b = null;
    public boolean c = false;

    public C1064Nk0(Locale locale) {
        this.a = locale;
    }

    @Override // defpackage.Y40
    public final ArrayList a() {
        ArrayList arrayList;
        h();
        if (this.b == null) {
            this.b = AbstractC7140t10.d(this.a.toLanguageTag());
        }
        TreeMap treeMap = (TreeMap) this.b.c;
        return (treeMap == null || (arrayList = (ArrayList) treeMap.get("collation")) == null) ? new ArrayList() : arrayList;
    }

    @Override // defpackage.Y40
    public final String b() {
        h();
        return this.a.toLanguageTag();
    }

    @Override // defpackage.Y40
    public final Y40 d() {
        h();
        return new C1064Nk0(this.a);
    }

    @Override // defpackage.Y40
    public final String e() {
        return c().toLanguageTag();
    }

    @Override // defpackage.Y40
    public final void f(String str, ArrayList arrayList) {
        h();
        if (this.b == null) {
            this.b = AbstractC7140t10.d(this.a.toLanguageTag());
        }
        HT ht = this.b;
        if (((TreeMap) ht.c) == null) {
            ht.c = new TreeMap();
        }
        if (!((TreeMap) this.b.c).containsKey(str)) {
            ((TreeMap) this.b.c).put(str, new ArrayList());
        }
        ((ArrayList) ((TreeMap) this.b.c).get(str)).clear();
        ((ArrayList) ((TreeMap) this.b.c).get(str)).addAll(arrayList);
        this.c = true;
    }

    @Override // defpackage.Y40
    public final Object g() {
        h();
        return this.a;
    }

    public final void h() {
        if (this.c) {
            try {
                j();
                this.c = false;
            } catch (RuntimeException e) {
                throw new C0254Da(e.getMessage(), 10);
            }
        }
    }

    @Override // defpackage.Y40
    /* renamed from: i */
    public final Locale c() throws C0254Da {
        h();
        if (this.b == null) {
            this.b = AbstractC7140t10.d(this.a.toLanguageTag());
        }
        HT ht = new HT();
        ht.a = (T71) this.b.a;
        C1064Nk0 c1064Nk0 = new C1064Nk0();
        c1064Nk0.a = null;
        c1064Nk0.c = false;
        c1064Nk0.b = ht;
        c1064Nk0.j();
        c1064Nk0.h();
        return c1064Nk0.a;
    }

    public final void j() throws C0254Da {
        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer stringBuffer2 = new StringBuffer();
        StringBuffer stringBuffer3 = new StringBuffer();
        StringBuffer stringBuffer4 = new StringBuffer();
        String str = (String) ((T71) this.b.a).a;
        if (str != null && !str.isEmpty()) {
            stringBuffer2.append((String) ((T71) this.b.a).a);
        }
        String str2 = (String) ((T71) this.b.a).b;
        if (str2 != null && !str2.isEmpty()) {
            stringBuffer3.append((String) ((T71) this.b.a).b);
        }
        String str3 = (String) ((T71) this.b.a).c;
        if (str3 != null && !str3.isEmpty()) {
            stringBuffer4.append((String) ((T71) this.b.a).c);
        }
        if (stringBuffer2.length() > 0) {
            stringBuffer.append(stringBuffer2.toString());
        }
        if (stringBuffer3.length() > 0) {
            stringBuffer.append("-");
            stringBuffer.append(stringBuffer3.toString());
        }
        if (stringBuffer4.length() > 0) {
            stringBuffer.append("-");
            stringBuffer.append(stringBuffer4.toString());
        }
        ArrayList arrayList = (ArrayList) ((T71) this.b.a).d;
        if (arrayList != null && !arrayList.isEmpty()) {
            stringBuffer.append("-");
            stringBuffer.append(TextUtils.join("-", (ArrayList) ((T71) this.b.a).d));
        }
        TreeMap treeMap = (TreeMap) this.b.f;
        if (treeMap != null) {
            for (Map.Entry entry : treeMap.entrySet()) {
                stringBuffer.append("-");
                stringBuffer.append(entry.getKey());
                stringBuffer.append("-");
                stringBuffer.append(TextUtils.join("-", (Iterable) entry.getValue()));
            }
        }
        HT ht = this.b;
        if (((T71) ht.d) != null || ((TreeMap) ht.e) != null) {
            stringBuffer.append("-t-");
            StringBuffer stringBuffer5 = new StringBuffer();
            T71 t71 = (T71) this.b.d;
            if (t71 != null) {
                stringBuffer5.append((String) t71.a);
                if (((String) ((T71) this.b.d).b) != null) {
                    stringBuffer5.append("-");
                    stringBuffer5.append((String) ((T71) this.b.d).b);
                }
                if (((String) ((T71) this.b.d).c) != null) {
                    stringBuffer5.append("-");
                    stringBuffer5.append((String) ((T71) this.b.d).c);
                }
                ArrayList arrayList2 = (ArrayList) ((T71) this.b.d).d;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    stringBuffer5.append("-");
                    stringBuffer5.append(TextUtils.join("-", (ArrayList) ((T71) this.b.d).d));
                }
            }
            TreeMap treeMap2 = (TreeMap) this.b.e;
            if (treeMap2 != null) {
                for (Map.Entry entry2 : treeMap2.entrySet()) {
                    String str4 = (String) entry2.getKey();
                    ArrayList arrayList3 = (ArrayList) entry2.getValue();
                    stringBuffer5.append("-" + str4);
                    Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        stringBuffer5.append("-" + ((String) it.next()));
                    }
                }
                if (stringBuffer5.length() > 0 && stringBuffer5.charAt(0) == '-') {
                    stringBuffer5.deleteCharAt(0);
                }
            }
            stringBuffer.append(stringBuffer5.toString());
        }
        HT ht2 = this.b;
        if (((ArrayList) ht2.b) != null || ((TreeMap) ht2.c) != null) {
            stringBuffer.append("-u-");
            StringBuffer stringBuffer6 = new StringBuffer();
            ArrayList arrayList4 = (ArrayList) this.b.b;
            if (arrayList4 != null) {
                stringBuffer6.append(TextUtils.join("-", arrayList4));
            }
            TreeMap treeMap3 = (TreeMap) this.b.c;
            if (treeMap3 != null) {
                for (Map.Entry entry3 : treeMap3.entrySet()) {
                    String str5 = (String) entry3.getKey();
                    ArrayList arrayList5 = (ArrayList) entry3.getValue();
                    stringBuffer6.append("-" + str5);
                    Iterator it2 = arrayList5.iterator();
                    while (it2.hasNext()) {
                        stringBuffer6.append("-" + ((String) it2.next()));
                    }
                }
            }
            if (stringBuffer6.length() > 0 && stringBuffer6.charAt(0) == '-') {
                stringBuffer6.deleteCharAt(0);
            }
            stringBuffer.append(stringBuffer6.toString());
        }
        if (((ArrayList) this.b.g) != null) {
            stringBuffer.append("-x-");
            stringBuffer.append(TextUtils.join("-", (ArrayList) this.b.g));
        }
        try {
            this.a = Locale.forLanguageTag(stringBuffer.toString());
            this.c = false;
        } catch (RuntimeException e) {
            throw new C0254Da(e.getMessage(), 10);
        }
    }

    @Override // defpackage.Y40
    /* renamed from: a */
    public final HashMap mo2a() {
        HashMap map = new HashMap();
        TreeMap treeMap = (TreeMap) this.b.c;
        if (treeMap != null) {
            for (String str : treeMap.keySet()) {
                map.put(str, TextUtils.join("-", (ArrayList) ((TreeMap) this.b.c).get(str)));
            }
        }
        return map;
    }
}
