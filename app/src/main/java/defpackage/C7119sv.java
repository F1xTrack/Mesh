package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: sv, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7119sv {
    public final String a;
    public final Set b;
    public final Set c;
    public final int d;
    public final int e;
    public final InterfaceC0940Lv f;
    public final Set g;

    public C7119sv(String str, Set set, Set set2, int i, int i2, InterfaceC0940Lv interfaceC0940Lv, Set set3) {
        this.a = str;
        this.b = Collections.unmodifiableSet(set);
        this.c = Collections.unmodifiableSet(set2);
        this.d = i;
        this.e = i2;
        this.f = interfaceC0940Lv;
        this.g = Collections.unmodifiableSet(set3);
    }

    public static C6928rv a(C6997sG0 c6997sG0) {
        return new C6928rv(c6997sG0, new C6997sG0[0]);
    }

    public static C6928rv b(Class cls) {
        return new C6928rv(cls, new Class[0]);
    }

    public static C7119sv c(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(C6997sG0.a(cls));
        for (Class cls2 : clsArr) {
            RL1.a(cls2, "Null interface");
            hashSet.add(C6997sG0.a(cls2));
        }
        return new C7119sv(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new B7(22, obj), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.b.toArray()) + ">{" + this.d + ", type=" + this.e + ", deps=" + Arrays.toString(this.c.toArray()) + "}";
    }
}
