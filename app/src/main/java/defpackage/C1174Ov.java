package defpackage;

import android.content.Context;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: Ov, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1174Ov implements InterfaceC3739fG0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ C1174Ov(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.InterfaceC3739fG0
    public final Object get() {
        switch (this.a) {
            case 0:
                C1252Pv c1252Pv = (C1252Pv) this.b;
                c1252Pv.getClass();
                C7119sv c7119sv = (C7119sv) this.c;
                InterfaceC0940Lv interfaceC0940Lv = c7119sv.f;
                C1241Pr0 c1241Pr0 = new C1241Pr0();
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = new HashSet();
                HashSet hashSet3 = new HashSet();
                HashSet hashSet4 = new HashSet();
                HashSet hashSet5 = new HashSet();
                for (RH rh : c7119sv.c) {
                    int i = rh.c;
                    boolean z = i == 0;
                    int i2 = rh.b;
                    C6997sG0 c6997sG0 = rh.a;
                    if (z) {
                        if (i2 == 2) {
                            hashSet4.add(c6997sG0);
                        } else {
                            hashSet.add(c6997sG0);
                        }
                    } else if (i == 2) {
                        hashSet3.add(c6997sG0);
                    } else if (i2 == 2) {
                        hashSet5.add(c6997sG0);
                    } else {
                        hashSet2.add(c6997sG0);
                    }
                }
                Set set = c7119sv.g;
                if (!set.isEmpty()) {
                    hashSet.add(C6997sG0.a(InterfaceC5279jG0.class));
                }
                c1241Pr0.a = Collections.unmodifiableSet(hashSet);
                c1241Pr0.b = Collections.unmodifiableSet(hashSet2);
                c1241Pr0.c = Collections.unmodifiableSet(hashSet3);
                c1241Pr0.d = Collections.unmodifiableSet(hashSet4);
                Collections.unmodifiableSet(hashSet5);
                c1241Pr0.e = set;
                c1241Pr0.f = c1252Pv;
                return interfaceC0940Lv.g(c1241Pr0);
            case 1:
                return new V20((Context) this.b, (String) this.c);
            default:
                MU mu = (MU) this.b;
                return new EC((Context) this.c, mu.f(), (InterfaceC5279jG0) mu.d.a(InterfaceC5279jG0.class));
        }
    }
}
