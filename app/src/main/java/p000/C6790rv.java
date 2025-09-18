package p000;

import java.util.Collections;
import java.util.HashSet;
import java.util.concurrent.Executors;

/* renamed from: rv */
/* loaded from: classes.dex */
public final class C6790rv {

    /* renamed from: a */
    public int f42151a;

    /* renamed from: b */
    public int f42152b;

    /* renamed from: c */
    public Object f42153c;

    /* renamed from: d */
    public final Object f42154d;

    /* renamed from: e */
    public final Object f42155e;

    /* renamed from: f */
    public final Object f42156f;

    /* renamed from: g */
    public Object f42157g;

    public C6790rv(String str, String str2, String str3, String str4, String str5, int i) {
        this.f42152b = 0;
        this.f42153c = str;
        this.f42154d = str2;
        this.f42155e = str3;
        this.f42156f = str4;
        this.f42157g = str5;
        this.f42151a = i;
        if (str != null) {
            this.f42152b = str.length() / 2;
        }
    }

    /* renamed from: a */
    public void m24548a(C1087RH c1087rh) {
        if (((HashSet) this.f42154d).contains(c1087rh.f10104a)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        ((HashSet) this.f42155e).add(c1087rh);
    }

    /* renamed from: b */
    public C6853sv m24549b() {
        if (((InterfaceC0750Lv) this.f42157g) != null) {
            return new C6853sv((String) this.f42153c, new HashSet((HashSet) this.f42154d), new HashSet((HashSet) this.f42155e), this.f42151a, this.f42152b, (InterfaceC0750Lv) this.f42157g, (HashSet) this.f42156f);
        }
        throw new IllegalStateException("Missing required property: factory.");
    }

    /* renamed from: c */
    public void m24550c(int i) {
        if (!(this.f42151a == 0)) {
            throw new IllegalStateException("Instantiation type has already been set.");
        }
        this.f42151a = i;
    }

    public C6790rv(C4049fN c4049fN) {
        this.f42153c = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new ThreadFactoryC1003Pw(false));
        this.f42154d = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new ThreadFactoryC1003Pw(true));
        int i = AbstractC9034cp1.f25673a;
        this.f42155e = new C8901bp1();
        this.f42156f = new NV1(15);
        this.f42157g = new C8342Tu0(11);
        this.f42151a = Integer.MAX_VALUE;
        this.f42152b = 20;
    }

    public C6790rv(Class cls, Class[] clsArr) {
        this.f42153c = null;
        HashSet hashSet = new HashSet();
        this.f42154d = hashSet;
        this.f42155e = new HashSet();
        this.f42151a = 0;
        this.f42152b = 0;
        this.f42156f = new HashSet();
        hashSet.add(C11011sG0.m24687a(cls));
        for (Class cls2 : clsArr) {
            RL1.m7000a(cls2, "Null interface");
            ((HashSet) this.f42154d).add(C11011sG0.m24687a(cls2));
        }
    }

    public C6790rv(C11011sG0 c11011sG0, C11011sG0[] c11011sG0Arr) {
        this.f42153c = null;
        HashSet hashSet = new HashSet();
        this.f42154d = hashSet;
        this.f42155e = new HashSet();
        this.f42151a = 0;
        this.f42152b = 0;
        this.f42156f = new HashSet();
        hashSet.add(c11011sG0);
        for (C11011sG0 c11011sG02 : c11011sG0Arr) {
            RL1.m7000a(c11011sG02, "Null interface");
        }
        Collections.addAll((HashSet) this.f42154d, c11011sG0Arr);
    }
}
