package com.yandex.metrica.impl.p022ob;

import android.content.Context;

/* renamed from: com.yandex.metrica.impl.ob.a2 */
/* loaded from: classes2.dex */
public class C3118a2 {

    /* renamed from: com.yandex.metrica.impl.ob.a2$a */
    public class a implements InterfaceC3286ge {

        /* renamed from: a */
        final /* synthetic */ C3260fe f23023a;

        public a(C3118a2 c3118a2, C3260fe c3260fe) {
            this.f23023a = c3260fe;
        }

        @Override // com.yandex.metrica.impl.p022ob.InterfaceC3286ge
        /* renamed from: a */
        public boolean mo15433a(Context context) {
            this.f23023a.getClass();
            return false;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.a2$b */
    public class b implements InterfaceC3286ge {

        /* renamed from: a */
        final /* synthetic */ C3260fe f23024a;

        public b(C3118a2 c3118a2, C3260fe c3260fe) {
            this.f23024a = c3260fe;
        }

        @Override // com.yandex.metrica.impl.p022ob.InterfaceC3286ge
        /* renamed from: a */
        public boolean mo15433a(Context context) {
            return this.f23024a.m15932a(context) && this.f23024a.m15934c(context);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.a2$c */
    public class c implements InterfaceC3286ge {

        /* renamed from: a */
        final /* synthetic */ C3260fe f23025a;

        public c(C3118a2 c3118a2, C3260fe c3260fe) {
            this.f23025a = c3260fe;
        }

        @Override // com.yandex.metrica.impl.p022ob.InterfaceC3286ge
        /* renamed from: a */
        public boolean mo15433a(Context context) {
            return this.f23025a.m15934c(context);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.a2$d */
    public class d implements InterfaceC3286ge {

        /* renamed from: a */
        final /* synthetic */ C3260fe f23026a;

        public d(C3118a2 c3118a2, C3260fe c3260fe) {
            this.f23026a = c3260fe;
        }

        @Override // com.yandex.metrica.impl.p022ob.InterfaceC3286ge
        /* renamed from: a */
        public boolean mo15433a(Context context) {
            this.f23026a.getClass();
            return false;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.a2$e */
    public class e implements InterfaceC3286ge {

        /* renamed from: a */
        final /* synthetic */ C3260fe f23027a;

        public e(C3118a2 c3118a2, C3260fe c3260fe) {
            this.f23027a = c3260fe;
        }

        @Override // com.yandex.metrica.impl.p022ob.InterfaceC3286ge
        /* renamed from: a */
        public boolean mo15433a(Context context) {
            if (!this.f23027a.m15932a(context)) {
                return false;
            }
            this.f23027a.getClass();
            return false;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.a2$f */
    public class f implements InterfaceC3286ge {

        /* renamed from: a */
        final /* synthetic */ C3260fe f23028a;

        public f(C3118a2 c3118a2, C3260fe c3260fe) {
            this.f23028a = c3260fe;
        }

        @Override // com.yandex.metrica.impl.p022ob.InterfaceC3286ge
        /* renamed from: a */
        public boolean mo15433a(Context context) {
            this.f23028a.getClass();
            return false;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.a2$g */
    public class g implements InterfaceC3286ge {

        /* renamed from: a */
        final /* synthetic */ C3260fe f23029a;

        public g(C3118a2 c3118a2, C3260fe c3260fe) {
            this.f23029a = c3260fe;
        }

        @Override // com.yandex.metrica.impl.p022ob.InterfaceC3286ge
        /* renamed from: a */
        public boolean mo15433a(Context context) {
            this.f23029a.getClass();
            return false;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.a2$h */
    public class h implements InterfaceC3286ge {

        /* renamed from: a */
        final /* synthetic */ C3260fe f23030a;

        public h(C3118a2 c3118a2, C3260fe c3260fe) {
            this.f23030a = c3260fe;
        }

        @Override // com.yandex.metrica.impl.p022ob.InterfaceC3286ge
        /* renamed from: a */
        public boolean mo15433a(Context context) {
            return this.f23030a.m15932a(context);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.a2$i */
    public class i implements InterfaceC3286ge {

        /* renamed from: a */
        final /* synthetic */ C3260fe f23031a;

        public i(C3118a2 c3118a2, C3260fe c3260fe) {
            this.f23031a = c3260fe;
        }

        @Override // com.yandex.metrica.impl.p022ob.InterfaceC3286ge
        /* renamed from: a */
        public boolean mo15433a(Context context) {
            return this.f23031a.m15932a(context);
        }
    }

    /* renamed from: a */
    public InterfaceC3286ge m15595a(C3260fe c3260fe) {
        return new i(this, c3260fe);
    }

    /* renamed from: b */
    public InterfaceC3286ge m15596b(C3260fe c3260fe) {
        return new h(this, c3260fe);
    }

    /* renamed from: c */
    public InterfaceC3286ge m15597c(C3260fe c3260fe) {
        return new g(this, c3260fe);
    }

    /* renamed from: d */
    public InterfaceC3286ge m15598d(C3260fe c3260fe) {
        return C2968U2.m15243a(29) ? new a(this, c3260fe) : C2968U2.m15243a(23) ? new b(this, c3260fe) : new c(this, c3260fe);
    }

    /* renamed from: e */
    public InterfaceC3286ge m15599e(C3260fe c3260fe) {
        return C2968U2.m15243a(29) ? new d(this, c3260fe) : C2968U2.m15243a(23) ? new e(this, c3260fe) : new f(this, c3260fe);
    }
}
