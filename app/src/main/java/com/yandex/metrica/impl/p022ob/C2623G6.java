package com.yandex.metrica.impl.p022ob;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;

/* renamed from: com.yandex.metrica.impl.ob.G6 */
/* loaded from: classes2.dex */
public class C2623G6 {

    /* renamed from: a */
    private final c f21282a;

    @TargetApi(26)
    /* renamed from: com.yandex.metrica.impl.ob.G6$a */
    public static class a implements c {

        /* renamed from: a */
        private final C2548D6 f21283a;

        public a(Context context) {
            this.f21283a = new C2548D6(context);
        }

        @Override // com.yandex.metrica.impl.p022ob.C2623G6.c
        /* renamed from: a */
        public InterfaceC2573E6 mo14160a() {
            return this.f21283a;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.G6$b */
    public static class b implements c {

        /* renamed from: a */
        private final C2598F6 f21284a;

        public b(Context context) {
            this.f21284a = new C2598F6(context);
        }

        @Override // com.yandex.metrica.impl.p022ob.C2623G6.c
        /* renamed from: a */
        public InterfaceC2573E6 mo14160a() {
            return this.f21284a;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.G6$c */
    public interface c {
        /* renamed from: a */
        InterfaceC2573E6 mo14160a();
    }

    public C2623G6(Context context) {
        this(Build.VERSION.SDK_INT >= 26 ? new a(context) : new b(context));
    }

    /* renamed from: a */
    public InterfaceC2573E6 m14159a() {
        return this.f21282a.mo14160a();
    }

    public C2623G6(c cVar) {
        this.f21282a = cVar;
    }
}
