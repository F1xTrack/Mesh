package p000;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;

/* renamed from: gV0 */
/* loaded from: classes.dex */
public final class C9505gV0 {

    /* renamed from: f */
    public static final Class[] f27813f = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* renamed from: a */
    public final LinkedHashMap f27814a;

    /* renamed from: b */
    public final LinkedHashMap f27815b;

    /* renamed from: c */
    public final LinkedHashMap f27816c;

    /* renamed from: d */
    public final LinkedHashMap f27817d;

    /* renamed from: e */
    public final InterfaceC10017kV0 f27818e;

    public C9505gV0(HashMap map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f27814a = linkedHashMap;
        this.f27815b = new LinkedHashMap();
        this.f27816c = new LinkedHashMap();
        this.f27817d = new LinkedHashMap();
        this.f27818e = new C7042vv(3, this);
        linkedHashMap.putAll(map);
    }

    /* renamed from: a */
    public static Bundle m18574a(C9505gV0 c9505gV0) {
        O90.m5968f(c9505gV0, "this$0");
        Iterator it = AbstractC11077sn0.m24787o(c9505gV0.f27815b).entrySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            LinkedHashMap linkedHashMap = c9505gV0.f27814a;
            if (!zHasNext) {
                Set<String> setKeySet = linkedHashMap.keySet();
                ArrayList arrayList = new ArrayList(setKeySet.size());
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                for (String str : setKeySet) {
                    arrayList.add(str);
                    arrayList2.add(linkedHashMap.get(str));
                }
                return AbstractC10518oP1.m23391a(new Pair("keys", arrayList), new Pair("values", arrayList2));
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str2 = (String) entry.getKey();
            Bundle bundleMo18401a = ((InterfaceC10017kV0) entry.getValue()).mo18401a();
            O90.m5968f(str2, "key");
            if (bundleMo18401a != null) {
                Class[] clsArr = f27813f;
                for (int i = 0; i < 29; i++) {
                    Class cls = clsArr[i];
                    O90.m5965c(cls);
                    if (!cls.isInstance(bundleMo18401a)) {
                    }
                }
                throw new IllegalArgumentException("Can't put value with type " + bundleMo18401a.getClass() + " into saved state");
            }
            Object obj = c9505gV0.f27816c.get(str2);
            C7560Et0 c7560Et0 = obj instanceof C7560Et0 ? (C7560Et0) obj : null;
            if (c7560Et0 != null) {
                c7560Et0.mo2439j(bundleMo18401a);
            } else {
                linkedHashMap.put(str2, bundleMo18401a);
            }
            InterfaceC7820Jt0 interfaceC7820Jt0 = (InterfaceC7820Jt0) c9505gV0.f27817d.get(str2);
            if (interfaceC7820Jt0 != null) {
                ((B41) interfaceC7820Jt0).m490f(bundleMo18401a);
            }
        }
    }

    public C9505gV0() {
        this.f27814a = new LinkedHashMap();
        this.f27815b = new LinkedHashMap();
        this.f27816c = new LinkedHashMap();
        this.f27817d = new LinkedHashMap();
        this.f27818e = new C7042vv(3, this);
    }
}
