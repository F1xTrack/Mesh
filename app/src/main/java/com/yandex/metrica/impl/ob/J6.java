package com.yandex.metrica.impl.ob;

import android.os.Bundle;

/* loaded from: classes2.dex */
public class J6 {
    private final InterfaceExecutorC3086sn a;

    public static class a implements Runnable {
        private final P6 a;
        private final Bundle b;
        private final O6 c;

        public a(P6 p6, Bundle bundle, O6 o6) {
            this.a = p6;
            this.b = bundle;
            this.c = o6;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.a.a(this.b, this.c);
            } catch (Throwable unused) {
                O6 o6 = this.c;
                if (o6 != null) {
                    o6.a();
                }
            }
        }
    }

    public J6() {
        this(P0.i().s().a());
    }

    public void a(P6 p6, Bundle bundle) {
        ((C3061rn) this.a).execute(new a(p6, bundle, null));
    }

    public J6(InterfaceExecutorC3086sn interfaceExecutorC3086sn) {
        this.a = interfaceExecutorC3086sn;
    }

    public void a(P6 p6, Bundle bundle, O6 o6) {
        ((C3061rn) this.a).execute(new a(p6, bundle, o6));
    }

    public InterfaceExecutorC3086sn a() {
        return this.a;
    }
}
