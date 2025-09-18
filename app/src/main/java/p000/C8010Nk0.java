package p000;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: Nk0 */
/* loaded from: classes.dex */
public final class C8010Nk0 implements Y40 {

    /* renamed from: a */
    public Locale f7982a;

    /* renamed from: b */
    public C0471HT f7983b = null;

    /* renamed from: c */
    public boolean f7984c = false;

    public C8010Nk0(Locale locale) {
        this.f7982a = locale;
    }

    @Override // p000.Y40
    /* renamed from: a */
    public final ArrayList mo5819a() {
        ArrayList arrayList;
        m5827h();
        if (this.f7983b == null) {
            this.f7983b = AbstractC11106t10.m24829d(this.f7982a.toLanguageTag());
        }
        TreeMap treeMap = (TreeMap) this.f7983b.f4311c;
        return (treeMap == null || (arrayList = (ArrayList) treeMap.get("collation")) == null) ? new ArrayList() : arrayList;
    }

    @Override // p000.Y40
    /* renamed from: b */
    public final String mo5821b() {
        m5827h();
        return this.f7982a.toLanguageTag();
    }

    @Override // p000.Y40
    /* renamed from: d */
    public final Y40 mo5823d() {
        m5827h();
        return new C8010Nk0(this.f7982a);
    }

    @Override // p000.Y40
    /* renamed from: e */
    public final String mo5824e() {
        return mo5822c().toLanguageTag();
    }

    @Override // p000.Y40
    /* renamed from: f */
    public final void mo5825f(String str, ArrayList arrayList) {
        m5827h();
        if (this.f7983b == null) {
            this.f7983b = AbstractC11106t10.m24829d(this.f7982a.toLanguageTag());
        }
        C0471HT c0471ht = this.f7983b;
        if (((TreeMap) c0471ht.f4311c) == null) {
            c0471ht.f4311c = new TreeMap();
        }
        if (!((TreeMap) this.f7983b.f4311c).containsKey(str)) {
            ((TreeMap) this.f7983b.f4311c).put(str, new ArrayList());
        }
        ((ArrayList) ((TreeMap) this.f7983b.f4311c).get(str)).clear();
        ((ArrayList) ((TreeMap) this.f7983b.f4311c).get(str)).addAll(arrayList);
        this.f7984c = true;
    }

    @Override // p000.Y40
    /* renamed from: g */
    public final Object mo5826g() {
        m5827h();
        return this.f7982a;
    }

    /* renamed from: h */
    public final void m5827h() {
        if (this.f7984c) {
            try {
                m5829j();
                this.f7984c = false;
            } catch (RuntimeException e) {
                throw new C0226Da(e.getMessage(), 10);
            }
        }
    }

    @Override // p000.Y40
    /* renamed from: i */
    public final Locale mo5822c() throws C0226Da {
        m5827h();
        if (this.f7983b == null) {
            this.f7983b = AbstractC11106t10.m24829d(this.f7982a.toLanguageTag());
        }
        C0471HT c0471ht = new C0471HT();
        c0471ht.f4309a = (T71) this.f7983b.f4309a;
        C8010Nk0 c8010Nk0 = new C8010Nk0();
        c8010Nk0.f7982a = null;
        c8010Nk0.f7984c = false;
        c8010Nk0.f7983b = c0471ht;
        c8010Nk0.m5829j();
        c8010Nk0.m5827h();
        return c8010Nk0.f7982a;
    }

    /* renamed from: j */
    public final void m5829j() throws C0226Da {
        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer stringBuffer2 = new StringBuffer();
        StringBuffer stringBuffer3 = new StringBuffer();
        StringBuffer stringBuffer4 = new StringBuffer();
        String str = (String) ((T71) this.f7983b.f4309a).f11173a;
        if (str != null && !str.isEmpty()) {
            stringBuffer2.append((String) ((T71) this.f7983b.f4309a).f11173a);
        }
        String str2 = (String) ((T71) this.f7983b.f4309a).f11174b;
        if (str2 != null && !str2.isEmpty()) {
            stringBuffer3.append((String) ((T71) this.f7983b.f4309a).f11174b);
        }
        String str3 = (String) ((T71) this.f7983b.f4309a).f11175c;
        if (str3 != null && !str3.isEmpty()) {
            stringBuffer4.append((String) ((T71) this.f7983b.f4309a).f11175c);
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
        ArrayList arrayList = (ArrayList) ((T71) this.f7983b.f4309a).f11176d;
        if (arrayList != null && !arrayList.isEmpty()) {
            stringBuffer.append("-");
            stringBuffer.append(TextUtils.join("-", (ArrayList) ((T71) this.f7983b.f4309a).f11176d));
        }
        TreeMap treeMap = (TreeMap) this.f7983b.f4314f;
        if (treeMap != null) {
            for (Map.Entry entry : treeMap.entrySet()) {
                stringBuffer.append("-");
                stringBuffer.append(entry.getKey());
                stringBuffer.append("-");
                stringBuffer.append(TextUtils.join("-", (Iterable) entry.getValue()));
            }
        }
        C0471HT c0471ht = this.f7983b;
        if (((T71) c0471ht.f4312d) != null || ((TreeMap) c0471ht.f4313e) != null) {
            stringBuffer.append("-t-");
            StringBuffer stringBuffer5 = new StringBuffer();
            T71 t71 = (T71) this.f7983b.f4312d;
            if (t71 != null) {
                stringBuffer5.append((String) t71.f11173a);
                if (((String) ((T71) this.f7983b.f4312d).f11174b) != null) {
                    stringBuffer5.append("-");
                    stringBuffer5.append((String) ((T71) this.f7983b.f4312d).f11174b);
                }
                if (((String) ((T71) this.f7983b.f4312d).f11175c) != null) {
                    stringBuffer5.append("-");
                    stringBuffer5.append((String) ((T71) this.f7983b.f4312d).f11175c);
                }
                ArrayList arrayList2 = (ArrayList) ((T71) this.f7983b.f4312d).f11176d;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    stringBuffer5.append("-");
                    stringBuffer5.append(TextUtils.join("-", (ArrayList) ((T71) this.f7983b.f4312d).f11176d));
                }
            }
            TreeMap treeMap2 = (TreeMap) this.f7983b.f4313e;
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
        C0471HT c0471ht2 = this.f7983b;
        if (((ArrayList) c0471ht2.f4310b) != null || ((TreeMap) c0471ht2.f4311c) != null) {
            stringBuffer.append("-u-");
            StringBuffer stringBuffer6 = new StringBuffer();
            ArrayList arrayList4 = (ArrayList) this.f7983b.f4310b;
            if (arrayList4 != null) {
                stringBuffer6.append(TextUtils.join("-", arrayList4));
            }
            TreeMap treeMap3 = (TreeMap) this.f7983b.f4311c;
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
        if (((ArrayList) this.f7983b.f4315g) != null) {
            stringBuffer.append("-x-");
            stringBuffer.append(TextUtils.join("-", (ArrayList) this.f7983b.f4315g));
        }
        try {
            this.f7982a = Locale.forLanguageTag(stringBuffer.toString());
            this.f7984c = false;
        } catch (RuntimeException e) {
            throw new C0226Da(e.getMessage(), 10);
        }
    }

    @Override // p000.Y40
    /* renamed from: a */
    public final HashMap mo5820a() {
        HashMap map = new HashMap();
        TreeMap treeMap = (TreeMap) this.f7983b.f4311c;
        if (treeMap != null) {
            for (String str : treeMap.keySet()) {
                map.put(str, TextUtils.join("-", (ArrayList) ((TreeMap) this.f7983b.f4311c).get(str)));
            }
        }
        return map;
    }
}
