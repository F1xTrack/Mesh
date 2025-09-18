package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.concurrent.Executors;

/* renamed from: rv */
/* loaded from: classes.dex */
public final class C6928rv {
    public int a;
    public int b;
    public Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public Object g;

    public C6928rv(String str, String str2, String str3, String str4, String str5, int i) {
        this.b = 0;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.a = i;
        if (str != null) {
            this.b = str.length() / 2;
        }
    }

    public void a(RH rh) {
        if (((HashSet) this.d).contains(rh.a)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        ((HashSet) this.e).add(rh);
    }

    public C7119sv b() {
        if (((InterfaceC0940Lv) this.g) != null) {
            return new C7119sv((String) this.c, new HashSet((HashSet) this.d), new HashSet((HashSet) this.e), this.a, this.b, (InterfaceC0940Lv) this.g, (HashSet) this.f);
        }
        throw new IllegalStateException("Missing required property: factory.");
    }

    public void c(int i) {
        if (!(this.a == 0)) {
            throw new IllegalStateException("Instantiation type has already been set.");
        }
        this.a = i;
    }

    public C6928rv(C3759fN c3759fN) {
        this.c = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new ThreadFactoryC1255Pw(false));
        this.d = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new ThreadFactoryC1255Pw(true));
        int i = AbstractC3273cp1.a;
        this.e = new C2398bp1();
        this.f = new NV1(15);
        this.g = new C1562Tu0(11);
        this.a = Integer.MAX_VALUE;
        this.b = 20;
    }

    public C6928rv(Class cls, Class[] clsArr) {
        this.c = null;
        HashSet hashSet = new HashSet();
        this.d = hashSet;
        this.e = new HashSet();
        this.a = 0;
        this.b = 0;
        this.f = new HashSet();
        hashSet.add(C6997sG0.a(cls));
        for (Class cls2 : clsArr) {
            RL1.a(cls2, "Null interface");
            ((HashSet) this.d).add(C6997sG0.a(cls2));
        }
    }

    public C6928rv(C6997sG0 c6997sG0, C6997sG0[] c6997sG0Arr) {
        this.c = null;
        HashSet hashSet = new HashSet();
        this.d = hashSet;
        this.e = new HashSet();
        this.a = 0;
        this.b = 0;
        this.f = new HashSet();
        hashSet.add(c6997sG0);
        for (C6997sG0 c6997sG02 : c6997sG0Arr) {
            RL1.a(c6997sG02, "Null interface");
        }
        Collections.addAll((HashSet) this.d, c6997sG0Arr);
    }
}
