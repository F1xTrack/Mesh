package com.yandex.metrica.impl.ob;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.SparseArray;

@SuppressLint({"NewApi"})
/* loaded from: classes2.dex */
public class Xj implements InterfaceC3263zk<Vj> {

    @SuppressLint({"InlineApi"})
    private static final SparseArray<String> d = new a();
    private final C2859jk a;
    private final InterfaceC2779ge b;
    private final InterfaceC2779ge c;

    public class a extends SparseArray<String> {
        public a() {
            put(0, null);
            put(7, "1xRTT");
            put(4, "CDMA");
            put(2, "EDGE");
            put(14, "eHRPD");
            put(5, "EVDO rev.0");
            put(6, "EVDO rev.A");
            put(12, "EVDO rev.B");
            put(1, "GPRS");
            put(8, "HSDPA");
            put(10, "HSPA");
            put(15, "HSPA+");
            put(9, "HSUPA");
            put(11, "iDen");
            put(3, "UMTS");
            put(12, "EVDO rev.B");
            put(14, "eHRPD");
            put(13, "LTE");
            put(15, "HSPA+");
        }
    }

    public class b implements InterfaceC2779ge {
        final /* synthetic */ C2754fe a;

        public b(Xj xj, C2754fe c2754fe) {
            this.a = c2754fe;
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC2779ge
        public boolean a(Context context) {
            this.a.getClass();
            return false;
        }
    }

    public class c implements InterfaceC2779ge {
        final /* synthetic */ C2754fe a;

        public c(Xj xj, C2754fe c2754fe) {
            this.a = c2754fe;
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC2779ge
        public boolean a(Context context) {
            return this.a.b(context);
        }
    }

    public class d implements InterfaceC2779ge {
        final /* synthetic */ C2754fe a;

        public d(Xj xj, C2754fe c2754fe) {
            this.a = c2754fe;
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC2779ge
        public boolean a(Context context) {
            return this.a.a(context);
        }
    }

    public class e implements InterfaceC2779ge {
        public e(Xj xj) {
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC2779ge
        public boolean a(Context context) {
            return true;
        }
    }

    public Xj(C2859jk c2859jk, C2754fe c2754fe) {
        this.a = c2859jk;
        if (U2.a(29)) {
            this.b = new b(this, c2754fe);
            this.c = new c(this, c2754fe);
        } else {
            this.b = new d(this, c2754fe);
            this.c = new e(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object b() {
        /*
            Method dump skipped, instructions count: 289
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.Xj.b():java.lang.Object");
    }
}
