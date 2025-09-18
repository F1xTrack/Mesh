package defpackage;

import android.util.ArrayMap;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

/* renamed from: Ft0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0468Ft0 extends C0873Ky0 {
    public static C0468Ft0 b() {
        return new C0468Ft0(new TreeMap(C0873Ky0.b));
    }

    public static C0468Ft0 c(InterfaceC7122sw interfaceC7122sw) {
        TreeMap treeMap = new TreeMap(C0873Ky0.b);
        for (C0572Hc c0572Hc : interfaceC7122sw.u()) {
            Set<EnumC6931rw> setA = interfaceC7122sw.A(c0572Hc);
            ArrayMap arrayMap = new ArrayMap();
            for (EnumC6931rw enumC6931rw : setA) {
                arrayMap.put(enumC6931rw, interfaceC7122sw.F(c0572Hc, enumC6931rw));
            }
            treeMap.put(c0572Hc, arrayMap);
        }
        return new C0468Ft0(treeMap);
    }

    public final void d(C0572Hc c0572Hc, EnumC6931rw enumC6931rw, Object obj) {
        EnumC6931rw enumC6931rw2;
        TreeMap treeMap = this.a;
        Map map = (Map) treeMap.get(c0572Hc);
        if (map == null) {
            ArrayMap arrayMap = new ArrayMap();
            treeMap.put(c0572Hc, arrayMap);
            arrayMap.put(enumC6931rw, obj);
            return;
        }
        EnumC6931rw enumC6931rw3 = (EnumC6931rw) Collections.min(map.keySet());
        if (Objects.equals(map.get(enumC6931rw3), obj) || enumC6931rw3 != (enumC6931rw2 = EnumC6931rw.c) || enumC6931rw != enumC6931rw2) {
            map.put(enumC6931rw, obj);
            return;
        }
        throw new IllegalArgumentException("Option values conflicts: " + c0572Hc.a + ", existing value (" + enumC6931rw3 + ")=" + map.get(enumC6931rw3) + ", conflicting (" + enumC6931rw + ")=" + obj);
    }

    public final void e(C0572Hc c0572Hc, Object obj) {
        d(c0572Hc, EnumC6931rw.d, obj);
    }
}
