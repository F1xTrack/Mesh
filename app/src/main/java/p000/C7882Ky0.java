package p000;

import android.util.ArrayMap;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* renamed from: Ky0 */
/* loaded from: classes.dex */
public class C7882Ky0 implements InterfaceC6854sw {

    /* renamed from: b */
    public static final C0295Eg f6402b;

    /* renamed from: c */
    public static final C7882Ky0 f6403c;

    /* renamed from: a */
    public final TreeMap f6404a;

    static {
        C0295Eg c0295Eg = new C0295Eg(17);
        f6402b = c0295Eg;
        f6403c = new C7882Ky0(new TreeMap(c0295Eg));
    }

    public C7882Ky0(TreeMap treeMap) {
        this.f6404a = treeMap;
    }

    /* renamed from: a */
    public static C7882Ky0 m4786a(InterfaceC6854sw interfaceC6854sw) {
        if (C7882Ky0.class.equals(interfaceC6854sw.getClass())) {
            return (C7882Ky0) interfaceC6854sw;
        }
        TreeMap treeMap = new TreeMap(f6402b);
        for (C0480Hc c0480Hc : interfaceC6854sw.mo4793u()) {
            Set<EnumC6791rw> setMo4787A = interfaceC6854sw.mo4787A(c0480Hc);
            ArrayMap arrayMap = new ArrayMap();
            for (EnumC6791rw enumC6791rw : setMo4787A) {
                arrayMap.put(enumC6791rw, interfaceC6854sw.mo4788F(c0480Hc, enumC6791rw));
            }
            treeMap.put(c0480Hc, arrayMap);
        }
        return new C7882Ky0(treeMap);
    }

    @Override // p000.InterfaceC6854sw
    /* renamed from: A */
    public final Set mo4787A(C0480Hc c0480Hc) {
        Map map = (Map) this.f6404a.get(c0480Hc);
        return map == null ? Collections.emptySet() : Collections.unmodifiableSet(map.keySet());
    }

    @Override // p000.InterfaceC6854sw
    /* renamed from: F */
    public final Object mo4788F(C0480Hc c0480Hc, EnumC6791rw enumC6791rw) {
        Map map = (Map) this.f6404a.get(c0480Hc);
        if (map == null) {
            throw new IllegalArgumentException("Option does not exist: " + c0480Hc);
        }
        if (map.containsKey(enumC6791rw)) {
            return map.get(enumC6791rw);
        }
        throw new IllegalArgumentException("Option does not exist: " + c0480Hc + " with priority=" + enumC6791rw);
    }

    @Override // p000.InterfaceC6854sw
    /* renamed from: L */
    public final void mo4789L(InterfaceC6711qw interfaceC6711qw) {
        for (Map.Entry entry : this.f6404a.tailMap(new C0480Hc("camera2.captureRequest.option.", Void.class, null)).entrySet()) {
            if (!((C0480Hc) entry.getKey()).f4362a.startsWith("camera2.captureRequest.option.")) {
                return;
            } else {
                interfaceC6711qw.mo3135c((C0480Hc) entry.getKey());
            }
        }
    }

    @Override // p000.InterfaceC6854sw
    /* renamed from: Q */
    public final boolean mo4790Q(C0480Hc c0480Hc) {
        return this.f6404a.containsKey(c0480Hc);
    }

    @Override // p000.InterfaceC6854sw
    /* renamed from: d0 */
    public final EnumC6791rw mo4791d0(C0480Hc c0480Hc) {
        Map map = (Map) this.f6404a.get(c0480Hc);
        if (map != null) {
            return (EnumC6791rw) Collections.min(map.keySet());
        }
        throw new IllegalArgumentException("Option does not exist: " + c0480Hc);
    }

    @Override // p000.InterfaceC6854sw
    /* renamed from: q */
    public final Object mo4792q(C0480Hc c0480Hc, Object obj) {
        try {
            return mo4794w(c0480Hc);
        } catch (IllegalArgumentException unused) {
            return obj;
        }
    }

    @Override // p000.InterfaceC6854sw
    /* renamed from: u */
    public final Set mo4793u() {
        return Collections.unmodifiableSet(this.f6404a.keySet());
    }

    @Override // p000.InterfaceC6854sw
    /* renamed from: w */
    public final Object mo4794w(C0480Hc c0480Hc) {
        Map map = (Map) this.f6404a.get(c0480Hc);
        if (map != null) {
            return map.get((EnumC6791rw) Collections.min(map.keySet()));
        }
        throw new IllegalArgumentException("Option does not exist: " + c0480Hc);
    }
}
