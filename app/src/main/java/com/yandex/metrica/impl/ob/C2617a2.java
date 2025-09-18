package com.yandex.metrica.impl.ob;

import android.content.Context;

/* renamed from: com.yandex.metrica.impl.ob.a2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2617a2 {

    /* renamed from: com.yandex.metrica.impl.ob.a2$a */
    public class a implements InterfaceC2779ge {
        final /* synthetic */ C2754fe a;

        public a(C2617a2 c2617a2, C2754fe c2754fe) {
            this.a = c2754fe;
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC2779ge
        public boolean a(Context context) {
            this.a.getClass();
            return false;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.a2$b */
    public class b implements InterfaceC2779ge {
        final /* synthetic */ C2754fe a;

        public b(C2617a2 c2617a2, C2754fe c2754fe) {
            this.a = c2754fe;
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC2779ge
        public boolean a(Context context) {
            return this.a.a(context) && this.a.c(context);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.a2$c */
    public class c implements InterfaceC2779ge {
        final /* synthetic */ C2754fe a;

        public c(C2617a2 c2617a2, C2754fe c2754fe) {
            this.a = c2754fe;
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC2779ge
        public boolean a(Context context) {
            return this.a.c(context);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.a2$d */
    public class d implements InterfaceC2779ge {
        final /* synthetic */ C2754fe a;

        public d(C2617a2 c2617a2, C2754fe c2754fe) {
            this.a = c2754fe;
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC2779ge
        public boolean a(Context context) {
            this.a.getClass();
            return false;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.a2$e */
    public class e implements InterfaceC2779ge {
        final /* synthetic */ C2754fe a;

        public e(C2617a2 c2617a2, C2754fe c2754fe) {
            this.a = c2754fe;
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC2779ge
        public boolean a(Context context) {
            if (!this.a.a(context)) {
                return false;
            }
            this.a.getClass();
            return false;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.a2$f */
    public class f implements InterfaceC2779ge {
        final /* synthetic */ C2754fe a;

        public f(C2617a2 c2617a2, C2754fe c2754fe) {
            this.a = c2754fe;
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC2779ge
        public boolean a(Context context) {
            this.a.getClass();
            return false;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.a2$g */
    public class g implements InterfaceC2779ge {
        final /* synthetic */ C2754fe a;

        public g(C2617a2 c2617a2, C2754fe c2754fe) {
            this.a = c2754fe;
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC2779ge
        public boolean a(Context context) {
            this.a.getClass();
            return false;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.a2$h */
    public class h implements InterfaceC2779ge {
        final /* synthetic */ C2754fe a;

        public h(C2617a2 c2617a2, C2754fe c2754fe) {
            this.a = c2754fe;
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC2779ge
        public boolean a(Context context) {
            return this.a.a(context);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.a2$i */
    public class i implements InterfaceC2779ge {
        final /* synthetic */ C2754fe a;

        public i(C2617a2 c2617a2, C2754fe c2754fe) {
            this.a = c2754fe;
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC2779ge
        public boolean a(Context context) {
            return this.a.a(context);
        }
    }

    public InterfaceC2779ge a(C2754fe c2754fe) {
        return new i(this, c2754fe);
    }

    public InterfaceC2779ge b(C2754fe c2754fe) {
        return new h(this, c2754fe);
    }

    public InterfaceC2779ge c(C2754fe c2754fe) {
        return new g(this, c2754fe);
    }

    public InterfaceC2779ge d(C2754fe c2754fe) {
        return U2.a(29) ? new a(this, c2754fe) : U2.a(23) ? new b(this, c2754fe) : new c(this, c2754fe);
    }

    public InterfaceC2779ge e(C2754fe c2754fe) {
        return U2.a(29) ? new d(this, c2754fe) : U2.a(23) ? new e(this, c2754fe) : new f(this, c2754fe);
    }
}
