package defpackage;

import android.util.ArrayMap;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* renamed from: Ky0 */
/* loaded from: classes.dex */
public class C0873Ky0 implements InterfaceC7122sw {
    public static final C0350Eg b;
    public static final C0873Ky0 c;
    public final TreeMap a;

    static {
        C0350Eg c0350Eg = new C0350Eg(17);
        b = c0350Eg;
        c = new C0873Ky0(new TreeMap(c0350Eg));
    }

    public C0873Ky0(TreeMap treeMap) {
        this.a = treeMap;
    }

    public static C0873Ky0 a(InterfaceC7122sw interfaceC7122sw) {
        if (C0873Ky0.class.equals(interfaceC7122sw.getClass())) {
            return (C0873Ky0) interfaceC7122sw;
        }
        TreeMap treeMap = new TreeMap(b);
        for (C0572Hc c0572Hc : interfaceC7122sw.u()) {
            Set<EnumC6931rw> setA = interfaceC7122sw.A(c0572Hc);
            ArrayMap arrayMap = new ArrayMap();
            for (EnumC6931rw enumC6931rw : setA) {
                arrayMap.put(enumC6931rw, interfaceC7122sw.F(c0572Hc, enumC6931rw));
            }
            treeMap.put(c0572Hc, arrayMap);
        }
        return new C0873Ky0(treeMap);
    }

    @Override // defpackage.InterfaceC7122sw
    public final Set A(C0572Hc c0572Hc) {
        Map map = (Map) this.a.get(c0572Hc);
        return map == null ? Collections.emptySet() : Collections.unmodifiableSet(map.keySet());
    }

    @Override // defpackage.InterfaceC7122sw
    public final Object F(C0572Hc c0572Hc, EnumC6931rw enumC6931rw) {
        Map map = (Map) this.a.get(c0572Hc);
        if (map == null) {
            throw new IllegalArgumentException("Option does not exist: " + c0572Hc);
        }
        if (map.containsKey(enumC6931rw)) {
            return map.get(enumC6931rw);
        }
        throw new IllegalArgumentException("Option does not exist: " + c0572Hc + " with priority=" + enumC6931rw);
    }

    @Override // defpackage.InterfaceC7122sw
    public final void L(InterfaceC6741qw interfaceC6741qw) {
        for (Map.Entry entry : this.a.tailMap(new C0572Hc("camera2.captureRequest.option.", Void.class, null)).entrySet()) {
            if (!((C0572Hc) entry.getKey()).a.startsWith("camera2.captureRequest.option.")) {
                return;
            } else {
                interfaceC6741qw.c((C0572Hc) entry.getKey());
            }
        }
    }

    @Override // defpackage.InterfaceC7122sw
    public final boolean Q(C0572Hc c0572Hc) {
        return this.a.containsKey(c0572Hc);
    }

    @Override // defpackage.InterfaceC7122sw
    public final EnumC6931rw d0(C0572Hc c0572Hc) {
        Map map = (Map) this.a.get(c0572Hc);
        if (map != null) {
            return (EnumC6931rw) Collections.min(map.keySet());
        }
        throw new IllegalArgumentException("Option does not exist: " + c0572Hc);
    }

    @Override // defpackage.InterfaceC7122sw
    public final Object q(C0572Hc c0572Hc, Object obj) {
        try {
            return w(c0572Hc);
        } catch (IllegalArgumentException unused) {
            return obj;
        }
    }

    @Override // defpackage.InterfaceC7122sw
    public final Set u() {
        return Collections.unmodifiableSet(this.a.keySet());
    }

    @Override // defpackage.InterfaceC7122sw
    public final Object w(C0572Hc c0572Hc) {
        Map map = (Map) this.a.get(c0572Hc);
        if (map != null) {
            return map.get((EnumC6931rw) Collections.min(map.keySet()));
        }
        throw new IllegalArgumentException("Option does not exist: " + c0572Hc);
    }
}
