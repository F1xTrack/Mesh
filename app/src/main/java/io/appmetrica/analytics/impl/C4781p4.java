package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.p4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4781p4 {
    public final Object a;
    public final C4710m5 b;
    public final HashMap c;
    public final C4715ma d;
    public final Context e;
    public final C4948w4 f;

    public C4781p4(Context context, C4710m5 c4710m5) {
        this(context, c4710m5, new C4948w4());
    }

    public final InterfaceC4876t4 a(C4518e4 c4518e4, D4 d4) {
        InterfaceC4876t4 interfaceC4876t4A;
        synchronized (this.a) {
            try {
                interfaceC4876t4A = (InterfaceC4876t4) this.c.get(c4518e4);
                if (interfaceC4876t4A == null) {
                    this.f.getClass();
                    interfaceC4876t4A = C4948w4.a(c4518e4).a(this.e, this.b, c4518e4, d4);
                    this.c.put(c4518e4, interfaceC4876t4A);
                    this.d.a(new C4757o4(c4518e4.b, c4518e4.c, c4518e4.d), c4518e4);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4876t4A;
    }

    public C4781p4(Context context, C4710m5 c4710m5, C4948w4 c4948w4) {
        this.a = new Object();
        this.c = new HashMap();
        this.d = new C4715ma();
        this.e = context.getApplicationContext();
        this.b = c4710m5;
        this.f = c4948w4;
    }

    public final void a(int i, String str, String str2) {
        Integer numValueOf = Integer.valueOf(i);
        synchronized (this.a) {
            try {
                C4715ma c4715ma = this.d;
                Collection collection = (Collection) c4715ma.a.remove(new C4757o4(str, numValueOf, str2));
                if (!hn.a(collection)) {
                    collection.size();
                    ArrayList arrayList = new ArrayList(collection.size());
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        arrayList.add((InterfaceC4876t4) this.c.remove((C4518e4) it.next()));
                    }
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        ((InterfaceC4876t4) it2.next()).a();
                    }
                }
            } finally {
            }
        }
    }
}
