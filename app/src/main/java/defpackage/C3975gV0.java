package defpackage;

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
public final class C3975gV0 {
    public static final Class[] f = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};
    public final LinkedHashMap a;
    public final LinkedHashMap b;
    public final LinkedHashMap c;
    public final LinkedHashMap d;
    public final InterfaceC5515kV0 e;

    public C3975gV0(HashMap map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.a = linkedHashMap;
        this.b = new LinkedHashMap();
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.e = new C7692vv(3, this);
        linkedHashMap.putAll(map);
    }

    public static Bundle a(C3975gV0 c3975gV0) {
        O90.f(c3975gV0, "this$0");
        Iterator it = AbstractC7096sn0.o(c3975gV0.b).entrySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            LinkedHashMap linkedHashMap = c3975gV0.a;
            if (!zHasNext) {
                Set<String> setKeySet = linkedHashMap.keySet();
                ArrayList arrayList = new ArrayList(setKeySet.size());
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                for (String str : setKeySet) {
                    arrayList.add(str);
                    arrayList2.add(linkedHashMap.get(str));
                }
                return AbstractC6262oP1.a(new Pair("keys", arrayList), new Pair("values", arrayList2));
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str2 = (String) entry.getKey();
            Bundle bundleA = ((InterfaceC5515kV0) entry.getValue()).a();
            O90.f(str2, "key");
            if (bundleA != null) {
                Class[] clsArr = f;
                for (int i = 0; i < 29; i++) {
                    Class cls = clsArr[i];
                    O90.c(cls);
                    if (!cls.isInstance(bundleA)) {
                    }
                }
                throw new IllegalArgumentException("Can't put value with type " + bundleA.getClass() + " into saved state");
            }
            Object obj = c3975gV0.c.get(str2);
            C0390Et0 c0390Et0 = obj instanceof C0390Et0 ? (C0390Et0) obj : null;
            if (c0390Et0 != null) {
                c0390Et0.j(bundleA);
            } else {
                linkedHashMap.put(str2, bundleA);
            }
            InterfaceC0780Jt0 interfaceC0780Jt0 = (InterfaceC0780Jt0) c3975gV0.d.get(str2);
            if (interfaceC0780Jt0 != null) {
                ((B41) interfaceC0780Jt0).f(bundleA);
            }
        }
    }

    public C3975gV0() {
        this.a = new LinkedHashMap();
        this.b = new LinkedHashMap();
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.e = new C7692vv(3, this);
    }
}
