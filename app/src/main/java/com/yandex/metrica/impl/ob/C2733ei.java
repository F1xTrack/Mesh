package com.yandex.metrica.impl.ob;

import android.content.Context;
import java.io.File;

/* renamed from: com.yandex.metrica.impl.ob.ei, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2733ei {
    private final Context a;
    private final C2932mi b;
    private final Uh c;
    private RunnableC2857ji d;
    private RunnableC2857ji e;
    private Qi f;

    public C2733ei(Context context) {
        this(context, new C2932mi(), new Uh(context));
    }

    public synchronized void a(Qi qi) {
        try {
            this.f = qi;
            RunnableC2857ji runnableC2857ji = this.d;
            if (runnableC2857ji == null) {
                C2932mi c2932mi = this.b;
                Context context = this.a;
                c2932mi.getClass();
                this.d = new RunnableC2857ji(context, qi, new Rh(), new C2882ki(c2932mi), new Wh("open", "http"), new Wh("port_already_in_use", "http"), "Http");
            } else {
                runnableC2857ji.a(qi);
            }
            this.c.a(qi, this);
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void b() {
        try {
            RunnableC2857ji runnableC2857ji = this.d;
            if (runnableC2857ji != null) {
                runnableC2857ji.b();
            }
            RunnableC2857ji runnableC2857ji2 = this.e;
            if (runnableC2857ji2 != null) {
                runnableC2857ji2.b();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public C2733ei(Context context, C2932mi c2932mi, Uh uh) {
        this.a = context;
        this.b = c2932mi;
        this.c = uh;
    }

    public synchronized void b(Qi qi) {
        try {
            this.f = qi;
            this.c.a(qi, this);
            RunnableC2857ji runnableC2857ji = this.d;
            if (runnableC2857ji != null) {
                runnableC2857ji.b(qi);
            }
            RunnableC2857ji runnableC2857ji2 = this.e;
            if (runnableC2857ji2 != null) {
                runnableC2857ji2.b(qi);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void a() {
        try {
            RunnableC2857ji runnableC2857ji = this.d;
            if (runnableC2857ji != null) {
                runnableC2857ji.a();
            }
            RunnableC2857ji runnableC2857ji2 = this.e;
            if (runnableC2857ji2 != null) {
                runnableC2857ji2.a();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void a(File file) {
        try {
            RunnableC2857ji runnableC2857ji = this.e;
            if (runnableC2857ji == null) {
                C2932mi c2932mi = this.b;
                Context context = this.a;
                Qi qi = this.f;
                c2932mi.getClass();
                this.e = new RunnableC2857ji(context, qi, new Vh(file), new C2907li(c2932mi), new Wh("open", "https"), new Wh("port_already_in_use", "https"), "Https");
            } else {
                runnableC2857ji.a(this.f);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
