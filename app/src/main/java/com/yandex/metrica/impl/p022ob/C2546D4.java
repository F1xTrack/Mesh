package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: com.yandex.metrica.impl.ob.D4 */
/* loaded from: classes2.dex */
public class C2546D4 {

    /* renamed from: a */
    private final Object f20996a;

    /* renamed from: b */
    private final C2696J4 f20997b;

    /* renamed from: c */
    private final HashMap<C2521C4, InterfaceC2571E4> f20998c;

    /* renamed from: d */
    private final C3113Zm<a, C2521C4> f20999d;

    /* renamed from: e */
    private final Context f21000e;

    /* renamed from: f */
    private volatile int f21001f;

    /* renamed from: g */
    private final C2621G4 f21002g;

    /* renamed from: com.yandex.metrica.impl.ob.D4$a */
    public static final class a {

        /* renamed from: a */
        private final String f21003a;

        /* renamed from: b */
        private final Integer f21004b;

        /* renamed from: c */
        private final String f21005c;

        public a(String str, Integer num, String str2) {
            this.f21003a = str;
            this.f21004b = num;
            this.f21005c = str2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (!this.f21003a.equals(aVar.f21003a)) {
                return false;
            }
            Integer num = this.f21004b;
            if (num == null ? aVar.f21004b != null : !num.equals(aVar.f21004b)) {
                return false;
            }
            String str = this.f21005c;
            String str2 = aVar.f21005c;
            return str != null ? str.equals(str2) : str2 == null;
        }

        public int hashCode() {
            int iHashCode = this.f21003a.hashCode() * 31;
            Integer num = this.f21004b;
            int iHashCode2 = (iHashCode + (num != null ? num.hashCode() : 0)) * 31;
            String str = this.f21005c;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }
    }

    public C2546D4(Context context, C2696J4 c2696j4) {
        this(context, c2696j4, new C2621G4());
    }

    /* renamed from: a */
    public InterfaceC2571E4 m13980a(C2521C4 c2521c4, C3044X3 c3044x3) {
        InterfaceC2571E4 interfaceC2571E4Mo14062a;
        synchronized (this.f20996a) {
            try {
                interfaceC2571E4Mo14062a = this.f20998c.get(c2521c4);
                if (interfaceC2571E4Mo14062a == null) {
                    interfaceC2571E4Mo14062a = this.f21002g.m14157a(c2521c4).mo14062a(this.f21000e, this.f20997b, c2521c4, c3044x3);
                    this.f20998c.put(c2521c4, interfaceC2571E4Mo14062a);
                    this.f20999d.m15567a(new a(c2521c4.m13951b(), c2521c4.m13952c(), c2521c4.m13953d()), c2521c4);
                    this.f21001f++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC2571E4Mo14062a;
    }

    public C2546D4(Context context, C2696J4 c2696j4, C2621G4 c2621g4) {
        this.f20996a = new Object();
        this.f20998c = new HashMap<>();
        this.f20999d = new C3113Zm<>();
        this.f21001f = 0;
        this.f21000e = context.getApplicationContext();
        this.f20997b = c2696j4;
        this.f21002g = c2621g4;
    }

    /* renamed from: a */
    public void m13981a(String str, int i, String str2) {
        Integer numValueOf = Integer.valueOf(i);
        synchronized (this.f20996a) {
            try {
                Collection<C2521C4> collectionM15569b = this.f20999d.m15569b(new a(str, numValueOf, str2));
                if (!C2968U2.m15249b(collectionM15569b)) {
                    this.f21001f -= collectionM15569b.size();
                    ArrayList arrayList = new ArrayList(collectionM15569b.size());
                    Iterator<C2521C4> it = collectionM15569b.iterator();
                    while (it.hasNext()) {
                        arrayList.add(this.f20998c.remove(it.next()));
                    }
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        ((InterfaceC2571E4) it2.next()).mo13839a();
                    }
                }
            } finally {
            }
        }
    }
}
