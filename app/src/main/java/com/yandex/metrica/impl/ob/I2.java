package com.yandex.metrica.impl.ob;

import android.app.Activity;
import com.yandex.metrica.impl.ob.C3217y;
import com.yandex.metrica.impl.ob.C3242z;

/* loaded from: classes2.dex */
public class I2 {
    private final W0 a;
    private final C3217y b;
    private final C3036qm<C3064s1> c;
    private final C3217y.b d;
    private final C3217y.b e;
    private final C3242z f;
    private final C3192x g;

    public class a implements C3217y.b {

        /* renamed from: com.yandex.metrica.impl.ob.I2$a$a, reason: collision with other inner class name */
        public class C0006a implements Y1<C3064s1> {
            final /* synthetic */ Activity a;

            public C0006a(Activity activity) {
                this.a = activity;
            }

            @Override // com.yandex.metrica.impl.ob.Y1
            public void b(C3064s1 c3064s1) {
                I2.a(I2.this, this.a, c3064s1);
            }
        }

        public a() {
        }

        @Override // com.yandex.metrica.impl.ob.C3217y.b
        public void a(Activity activity, C3217y.a aVar) {
            I2.this.c.a((Y1) new C0006a(activity));
        }
    }

    public class b implements C3217y.b {

        public class a implements Y1<C3064s1> {
            final /* synthetic */ Activity a;

            public a(Activity activity) {
                this.a = activity;
            }

            @Override // com.yandex.metrica.impl.ob.Y1
            public void b(C3064s1 c3064s1) {
                I2.b(I2.this, this.a, c3064s1);
            }
        }

        public b() {
        }

        @Override // com.yandex.metrica.impl.ob.C3217y.b
        public void a(Activity activity, C3217y.a aVar) {
            I2.this.c.a((Y1) new a(activity));
        }
    }

    public I2(C3217y c3217y, InterfaceExecutorC3086sn interfaceExecutorC3086sn, C3192x c3192x) {
        this(Oh.a(), c3217y, c3192x, new C3036qm(interfaceExecutorC3086sn), new C3242z());
    }

    public void b(Activity activity, U0 u0) {
        if (activity != null) {
            this.g.a(activity);
        }
        if (this.f.a(activity, C3242z.a.RESUMED)) {
            u0.a(activity);
        }
    }

    public C3217y.c a(boolean z) {
        this.b.a(this.d, C3217y.a.RESUMED);
        this.b.a(this.e, C3217y.a.PAUSED);
        C3217y.c cVarA = this.b.a();
        if (cVarA == C3217y.c.WATCHING) {
            this.a.reportEvent(z ? "session_auto_tracking_listener_registered_auto" : "session_auto_tracking_listener_registered_manual");
        }
        return cVarA;
    }

    public I2(W0 w0, C3217y c3217y, C3192x c3192x, C3036qm<C3064s1> c3036qm, C3242z c3242z) {
        this.b = c3217y;
        this.a = w0;
        this.g = c3192x;
        this.c = c3036qm;
        this.f = c3242z;
        this.d = new a();
        this.e = new b();
    }

    public static void b(I2 i2, Activity activity, U0 u0) {
        if (i2.f.a(activity, C3242z.a.PAUSED)) {
            ((C3064s1) u0).b(activity);
        }
    }

    public void a(Activity activity, U0 u0) {
        if (activity != null) {
            this.g.a(activity);
        }
        if (this.f.a(activity, C3242z.a.PAUSED)) {
            u0.b(activity);
        }
    }

    public void a(C3064s1 c3064s1) {
        this.c.a((C3036qm<C3064s1>) c3064s1);
    }

    public static void a(I2 i2, Activity activity, U0 u0) {
        if (i2.f.a(activity, C3242z.a.RESUMED)) {
            ((C3064s1) u0).a(activity);
        }
    }
}
