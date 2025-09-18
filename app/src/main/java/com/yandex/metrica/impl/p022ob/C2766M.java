package com.yandex.metrica.impl.p022ob;

import android.content.Intent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.M */
/* loaded from: classes2.dex */
public class C2766M {

    /* renamed from: a */
    private final InterfaceExecutorC3607sn f21670a;

    /* renamed from: b */
    private volatile b f21671b;

    /* renamed from: c */
    private final List<c> f21672c = new ArrayList();

    /* renamed from: d */
    private final InterfaceC2988Um<Intent> f21673d;

    /* renamed from: com.yandex.metrica.impl.ob.M$a */
    public class a implements InterfaceC2988Um<Intent> {
        public a() {
        }

        @Override // com.yandex.metrica.impl.p022ob.InterfaceC2988Um
        /* renamed from: b */
        public void mo13904b(Intent intent) {
            Intent intent2 = intent;
            b bVar = C2766M.this.f21671b;
            b.a aVar = bVar == null ? null : bVar.f21676b;
            b bVarM14558a = C2766M.this.m14558a(intent2);
            C2766M.this.f21671b = bVarM14558a;
            if (aVar != bVarM14558a.f21676b) {
                ((C3581rn) C2766M.this.f21670a).execute(new C2741L(this, bVarM14558a));
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.M$b */
    public static class b {

        /* renamed from: a */
        public final Integer f21675a;

        /* renamed from: b */
        public final a f21676b;

        /* renamed from: com.yandex.metrica.impl.ob.M$b$a */
        public enum a {
            UNKNOWN(-1),
            NONE(0),
            USB(1),
            WIRELESS(2),
            AC(3);


            /* renamed from: a */
            private final int f21683a;

            a(int i) {
                this.f21683a = i;
            }

            /* renamed from: a */
            public int m14568a() {
                return this.f21683a;
            }

            /* renamed from: a */
            public static a m14567a(Integer num) {
                if (num != null) {
                    a[] aVarArrValues = values();
                    for (int i = 0; i < 5; i++) {
                        a aVar = aVarArrValues[i];
                        if (aVar.f21683a == num.intValue()) {
                            return aVar;
                        }
                    }
                }
                return UNKNOWN;
            }
        }

        public b(Integer num, a aVar) {
            this.f21675a = num;
            this.f21676b = aVar;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.M$c */
    public interface c {
        /* renamed from: a */
        void mo14569a(b.a aVar);
    }

    public C2766M(InterfaceExecutorC3607sn interfaceExecutorC3607sn, C2716K c2716k) {
        a aVar = new a();
        this.f21673d = aVar;
        this.f21670a = interfaceExecutorC3607sn;
        this.f21671b = m14558a(c2716k.m14453c(aVar));
    }

    /* renamed from: b */
    public b.a m14566b() {
        b bVar = this.f21671b;
        return bVar == null ? b.a.UNKNOWN : bVar.f21676b;
    }

    /* renamed from: a */
    public Integer m14564a() {
        b bVar = this.f21671b;
        if (bVar == null) {
            return null;
        }
        return bVar.f21675a;
    }

    /* renamed from: a */
    public synchronized void m14565a(c cVar) {
        this.f21672c.add(cVar);
        ((C3078Yc) cVar).mo14569a(m14566b());
    }

    /* renamed from: a */
    public static void m14562a(C2766M c2766m, b.a aVar) {
        synchronized (c2766m) {
            Iterator<c> it = c2766m.f21672c.iterator();
            while (it.hasNext()) {
                it.next().mo14569a(aVar);
            }
        }
    }

    /* renamed from: a */
    public b m14558a(Intent intent) {
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
