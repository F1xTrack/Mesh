package com.yandex.metrica.impl.ob;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class D4 {
    private final Object a;
    private final J4 b;
    private final HashMap<C4, E4> c;
    private final Zm<a, C4> d;
    private final Context e;
    private volatile int f;
    private final G4 g;

    public static final class a {
        private final String a;
        private final Integer b;
        private final String c;

        public a(String str, Integer num, String str2) {
            this.a = str;
            this.b = num;
            this.c = str2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (!this.a.equals(aVar.a)) {
                return false;
            }
            Integer num = this.b;
            if (num == null ? aVar.b != null : !num.equals(aVar.b)) {
                return false;
            }
            String str = this.c;
            String str2 = aVar.c;
            return str != null ? str.equals(str2) : str2 == null;
        }

        public int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            Integer num = this.b;
            int iHashCode2 = (iHashCode + (num != null ? num.hashCode() : 0)) * 31;
            String str = this.c;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }
    }

    public D4(Context context, J4 j4) {
        this(context, j4, new G4());
    }

    public E4 a(C4 c4, X3 x3) {
        E4 e4A;
        synchronized (this.a) {
            try {
                e4A = this.c.get(c4);
                if (e4A == null) {
                    e4A = this.g.a(c4).a(this.e, this.b, c4, x3);
                    this.c.put(c4, e4A);
                    this.d.a(new a(c4.b(), c4.c(), c4.d()), c4);
                    this.f++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return e4A;
    }

    public D4(Context context, J4 j4, G4 g4) {
        this.a = new Object();
        this.c = new HashMap<>();
        this.d = new Zm<>();
        this.f = 0;
        this.e = context.getApplicationContext();
        this.b = j4;
        this.g = g4;
    }

    public void a(String str, int i, String str2) {
        Integer numValueOf = Integer.valueOf(i);
        synchronized (this.a) {
            try {
                Collection<C4> collectionB = this.d.b(new a(str, numValueOf, str2));
                if (!U2.b(collectionB)) {
                    this.f -= collectionB.size();
                    ArrayList arrayList = new ArrayList(collectionB.size());
                    Iterator<C4> it = collectionB.iterator();
                    while (it.hasNext()) {
                        arrayList.add(this.c.remove(it.next()));
                    }
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        ((E4) it2.next()).a();
                    }
                }
            } finally {
            }
        }
    }
}
