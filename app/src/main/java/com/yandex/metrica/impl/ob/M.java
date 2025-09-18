package com.yandex.metrica.impl.ob;

import android.content.Intent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class M {
    private final InterfaceExecutorC3086sn a;
    private volatile b b;
    private final List<c> c = new ArrayList();
    private final Um<Intent> d;

    public class a implements Um<Intent> {
        public a() {
        }

        @Override // com.yandex.metrica.impl.ob.Um
        public void b(Intent intent) {
            Intent intent2 = intent;
            b bVar = M.this.b;
            b.a aVar = bVar == null ? null : bVar.b;
            b bVarA = M.this.a(intent2);
            M.this.b = bVarA;
            if (aVar != bVarA.b) {
                ((C3061rn) M.this.a).execute(new L(this, bVarA));
            }
        }
    }

    public static class b {
        public final Integer a;
        public final a b;

        public enum a {
            UNKNOWN(-1),
            NONE(0),
            USB(1),
            WIRELESS(2),
            AC(3);

            private final int a;

            a(int i) {
                this.a = i;
            }

            public int a() {
                return this.a;
            }

            public static a a(Integer num) {
                if (num != null) {
                    a[] aVarArrValues = values();
                    for (int i = 0; i < 5; i++) {
                        a aVar = aVarArrValues[i];
                        if (aVar.a == num.intValue()) {
                            return aVar;
                        }
                    }
                }
                return UNKNOWN;
            }
        }

        public b(Integer num, a aVar) {
            this.a = num;
            this.b = aVar;
        }
    }

    public interface c {
        void a(b.a aVar);
    }

    public M(InterfaceExecutorC3086sn interfaceExecutorC3086sn, K k) {
        a aVar = new a();
        this.d = aVar;
        this.a = interfaceExecutorC3086sn;
        this.b = a(k.c(aVar));
    }

    public b.a b() {
        b bVar = this.b;
        return bVar == null ? b.a.UNKNOWN : bVar.b;
    }

    public Integer a() {
        b bVar = this.b;
        if (bVar == null) {
            return null;
        }
        return bVar.a;
    }

    public synchronized void a(c cVar) {
        this.c.add(cVar);
        ((Yc) cVar).a(b());
    }

    public static void a(M m, b.a aVar) {
        synchronized (m) {
            Iterator<c> it = m.c.iterator();
            while (it.hasNext()) {
                it.next().a(aVar);
            }
        }
    }

    public b a(Intent intent) {
        b.a aVar = b.a.UNKNOWN;
        Integer numValueOf = null;
        if (intent != null) {
            int intExtra = intent.getIntExtra("level", -1);
            int intExtra2 = intent.getIntExtra("scale", -1);
            if (intExtra > 0 && intExtra2 > 0) {
                numValueOf = Integer.valueOf((intExtra * 100) / intExtra2);
            }
            int intExtra3 = intent.getIntExtra("plugged", -1);
            aVar = b.a.NONE;
            if (intExtra3 == 1) {
                aVar = b.a.AC;
            } else if (intExtra3 == 2) {
                aVar = b.a.USB;
            } else if (intExtra3 == 4) {
                aVar = b.a.WIRELESS;
            }
        }
        return new b(numValueOf, aVar);
    }
}
