package p000;

import android.content.Context;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: Ov */
/* loaded from: classes.dex */
public final /* synthetic */ class C0939Ov implements InterfaceC9347fG0 {

    /* renamed from: a */
    public final /* synthetic */ int f8676a;

    /* renamed from: b */
    public final /* synthetic */ Object f8677b;

    /* renamed from: c */
    public final /* synthetic */ Object f8678c;

    public /* synthetic */ C0939Ov(Object obj, int i, Object obj2) {
        this.f8676a = i;
        this.f8677b = obj;
        this.f8678c = obj2;
    }

    @Override // p000.InterfaceC9347fG0
    public final Object get() {
        switch (this.f8676a) {
            case 0:
                C1002Pv c1002Pv = (C1002Pv) this.f8677b;
                c1002Pv.getClass();
                C6853sv c6853sv = (C6853sv) this.f8678c;
                InterfaceC0750Lv interfaceC0750Lv = c6853sv.f42724f;
                C8128Pr0 c8128Pr0 = new C8128Pr0();
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = new HashSet();
                HashSet hashSet3 = new HashSet();
                HashSet hashSet4 = new HashSet();
                HashSet hashSet5 = new HashSet();
                for (C1087RH c1087rh : c6853sv.f42721c) {
                    int i = c1087rh.f10106c;
                    boolean z = i == 0;
                    int i2 = c1087rh.f10105b;
                    C11011sG0 c11011sG0 = c1087rh.f10104a;
                    if (z) {
                        if (i2 == 2) {
                            hashSet4.add(c11011sG0);
                        } else {
                            hashSet.add(c11011sG0);
                        }
                    } else if (i == 2) {
                        hashSet3.add(c11011sG0);
                    } else if (i2 == 2) {
                        hashSet5.add(c11011sG0);
                    } else {
                        hashSet2.add(c11011sG0);
                    }
                }
                Set set = c6853sv.f42725g;
                if (!set.isEmpty()) {
                    hashSet.add(C11011sG0.m24687a(InterfaceC9859jG0.class));
                }
                c8128Pr0.f9303a = Collections.unmodifiableSet(hashSet);
                c8128Pr0.f9304b = Collections.unmodifiableSet(hashSet2);
                c8128Pr0.f9305c = Collections.unmodifiableSet(hashSet3);
                c8128Pr0.f9306d = Collections.unmodifiableSet(hashSet4);
                Collections.unmodifiableSet(hashSet5);
                c8128Pr0.f9307e = set;
                c8128Pr0.f9308f = c1002Pv;
                return interfaceC0750Lv.mo390g(c8128Pr0);
            case 1:
                return new V20((Context) this.f8677b, (String) this.f8678c);
            default:
                C0786MU c0786mu = (C0786MU) this.f8677b;
                return new C0265EC((Context) this.f8678c, c0786mu.m5381f(), (InterfaceC9859jG0) c0786mu.f7177d.mo4066a(InterfaceC9859jG0.class));
        }
    }
}
