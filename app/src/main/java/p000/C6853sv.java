package p000;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: sv */
/* loaded from: classes.dex */
public final class C6853sv {

    /* renamed from: a */
    public final String f42719a;

    /* renamed from: b */
    public final Set f42720b;

    /* renamed from: c */
    public final Set f42721c;

    /* renamed from: d */
    public final int f42722d;

    /* renamed from: e */
    public final int f42723e;

    /* renamed from: f */
    public final InterfaceC0750Lv f42724f;

    /* renamed from: g */
    public final Set f42725g;

    public C6853sv(String str, Set set, Set set2, int i, int i2, InterfaceC0750Lv interfaceC0750Lv, Set set3) {
        this.f42719a = str;
        this.f42720b = Collections.unmodifiableSet(set);
        this.f42721c = Collections.unmodifiableSet(set2);
        this.f42722d = i;
        this.f42723e = i2;
        this.f42724f = interfaceC0750Lv;
        this.f42725g = Collections.unmodifiableSet(set3);
    }

    /* renamed from: a */
    public static C6790rv m24809a(C11011sG0 c11011sG0) {
        return new C6790rv(c11011sG0, new C11011sG0[0]);
    }

    /* renamed from: b */
    public static C6790rv m24810b(Class cls) {
        return new C6790rv(cls, new Class[0]);
    }

    /* renamed from: c */
    public static C6853sv m24811c(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(C11011sG0.m24687a(cls));
        for (Class cls2 : clsArr) {
            RL1.m7000a(cls2, "Null interface");
            hashSet.add(C11011sG0.m24687a(cls2));
        }
        return new C6853sv(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new C0071B7(22, obj), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f42720b.toArray()) + ">{" + this.f42722d + ", type=" + this.f42723e + ", deps=" + Arrays.toString(this.f42721c.toArray()) + "}";
    }
}
