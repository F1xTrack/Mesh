package p000;

import android.util.ArrayMap;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

/* renamed from: Ft0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7612Ft0 extends C7882Ky0 {
    /* renamed from: b */
    public static C7612Ft0 m2812b() {
        return new C7612Ft0(new TreeMap(C7882Ky0.f6402b));
    }

    /* renamed from: c */
    public static C7612Ft0 m2813c(InterfaceC6854sw interfaceC6854sw) {
        TreeMap treeMap = new TreeMap(C7882Ky0.f6402b);
        for (C0480Hc c0480Hc : interfaceC6854sw.mo4793u()) {
            Set<EnumC6791rw> setMo4787A = interfaceC6854sw.mo4787A(c0480Hc);
            ArrayMap arrayMap = new ArrayMap();
            for (EnumC6791rw enumC6791rw : setMo4787A) {
                arrayMap.put(enumC6791rw, interfaceC6854sw.mo4788F(c0480Hc, enumC6791rw));
            }
            treeMap.put(c0480Hc, arrayMap);
        }
        return new C7612Ft0(treeMap);
    }

    /* renamed from: d */
    public final void m2814d(C0480Hc c0480Hc, EnumC6791rw enumC6791rw, Object obj) {
        EnumC6791rw enumC6791rw2;
        TreeMap treeMap = this.f6404a;
        Map map = (Map) treeMap.get(c0480Hc);
        if (map == null) {
            ArrayMap arrayMap = new ArrayMap();
            treeMap.put(c0480Hc, arrayMap);
            arrayMap.put(enumC6791rw, obj);
            return;
        }
        EnumC6791rw enumC6791rw3 = (EnumC6791rw) Collections.min(map.keySet());
        if (Objects.equals(map.get(enumC6791rw3), obj) || enumC6791rw3 != (enumC6791rw2 = EnumC6791rw.f42161c) || enumC6791rw != enumC6791rw2) {
            map.put(enumC6791rw, obj);
            return;
        }
        throw new IllegalArgumentException("Option values conflicts: " + c0480Hc.f4362a + ", existing value (" + enumC6791rw3 + ")=" + map.get(enumC6791rw3) + ", conflicting (" + enumC6791rw + ")=" + obj);
    }

    /* renamed from: e */
    public final void m2815e(C0480Hc c0480Hc, Object obj) {
        m2814d(c0480Hc, EnumC6791rw.f42162d, obj);
    }
}
