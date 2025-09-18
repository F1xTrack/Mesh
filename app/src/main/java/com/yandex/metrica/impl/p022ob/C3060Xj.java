package com.yandex.metrica.impl.p022ob;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.SparseArray;

@SuppressLint({"NewApi"})
/* renamed from: com.yandex.metrica.impl.ob.Xj */
/* loaded from: classes2.dex */
public class C3060Xj implements InterfaceC3786zk<C3010Vj> {

    /* renamed from: d */
    @SuppressLint({"InlineApi"})
    private static final SparseArray<String> f22818d = new a();

    /* renamed from: a */
    private final C3370jk f22819a;

    /* renamed from: b */
    private final InterfaceC3286ge f22820b;

    /* renamed from: c */
    private final InterfaceC3286ge f22821c;

    /* renamed from: com.yandex.metrica.impl.ob.Xj$a */
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

    /* renamed from: com.yandex.metrica.impl.ob.Xj$b */
    public class b implements InterfaceC3286ge {

        /* renamed from: a */
        final /* synthetic */ C3260fe f22822a;

        public b(C3060Xj c3060Xj, C3260fe c3260fe) {
            this.f22822a = c3260fe;
        }

        @Override // com.yandex.metrica.impl.p022ob.InterfaceC3286ge
        /* renamed from: a */
        public boolean mo15433a(Context context) {
            this.f22822a.getClass();
            return false;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Xj$c */
    public class c implements InterfaceC3286ge {

        /* renamed from: a */
        final /* synthetic */ C3260fe f22823a;

        public c(C3060Xj c3060Xj, C3260fe c3260fe) {
            this.f22823a = c3260fe;
        }

        @Override // com.yandex.metrica.impl.p022ob.InterfaceC3286ge
        /* renamed from: a */
        public boolean mo15433a(Context context) {
            return this.f22823a.m15933b(context);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Xj$d */
    public class d implements InterfaceC3286ge {

        /* renamed from: a */
        final /* synthetic */ C3260fe f22824a;

        public d(C3060Xj c3060Xj, C3260fe c3260fe) {
            this.f22824a = c3260fe;
        }

        @Override // com.yandex.metrica.impl.p022ob.InterfaceC3286ge
        /* renamed from: a */
        public boolean mo15433a(Context context) {
            return this.f22824a.m15932a(context);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Xj$e */
    public class e implements InterfaceC3286ge {
        public e(C3060Xj c3060Xj) {
        }

        @Override // com.yandex.metrica.impl.p022ob.InterfaceC3286ge
        /* renamed from: a */
        public boolean mo15433a(Context context) {
            return true;
        }
    }

    public C3060Xj(C3370jk c3370jk, C3260fe c3260fe) {
        this.f22819a = c3370jk;
        if (C2968U2.m15243a(29)) {
            this.f22820b = new b(this, c3260fe);
            this.f22821c = new c(this, c3260fe);
        } else {
            this.f22820b = new d(this, c3260fe);
            this.f22821c = new e(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00cb  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object m15432b() {
        /*
            Method dump skipped, instructions count: 289
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p022ob.C3060Xj.m15432b():java.lang.Object");
    }
}
