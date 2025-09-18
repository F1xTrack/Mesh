package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import java.io.File;

/* renamed from: com.yandex.metrica.impl.ob.ei */
/* loaded from: classes2.dex */
public class C3238ei {

    /* renamed from: a */
    private final Context f23365a;

    /* renamed from: b */
    private final C3446mi f23366b;

    /* renamed from: c */
    private final C2983Uh f23367c;

    /* renamed from: d */
    private RunnableC3368ji f23368d;

    /* renamed from: e */
    private RunnableC3368ji f23369e;

    /* renamed from: f */
    private C2885Qi f23370f;

    public C3238ei(Context context) {
        this(context, new C3446mi(), new C2983Uh(context));
    }

    /* renamed from: a */
    public synchronized void m15853a(C2885Qi c2885Qi) {
        try {
            this.f23370f = c2885Qi;
            RunnableC3368ji runnableC3368ji = this.f23368d;
            if (runnableC3368ji == null) {
                C3446mi c3446mi = this.f23366b;
                Context context = this.f23365a;
                c3446mi.getClass();
                this.f23368d = new RunnableC3368ji(context, c2885Qi, new C2908Rh(), new C3394ki(c3446mi), new C3033Wh("open", "http"), new C3033Wh("port_already_in_use", "http"), "Http");
            } else {
                runnableC3368ji.m16180a(c2885Qi);
            }
            this.f23367c.m15286a(c2885Qi, this);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: b */
    public synchronized void m15855b() {
        try {
            RunnableC3368ji runnableC3368ji = this.f23368d;
            if (runnableC3368ji != null) {
                runnableC3368ji.m16186b();
            }
            RunnableC3368ji runnableC3368ji2 = this.f23369e;
            if (runnableC3368ji2 != null) {
                runnableC3368ji2.m16186b();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public C3238ei(Context context, C3446mi c3446mi, C2983Uh c2983Uh) {
        this.f23365a = context;
        this.f23366b = c3446mi;
        this.f23367c = c2983Uh;
    }

    /* renamed from: b */
    public synchronized void m15856b(C2885Qi c2885Qi) {
        try {
            this.f23370f = c2885Qi;
            this.f23367c.m15286a(c2885Qi, this);
            RunnableC3368ji runnableC3368ji = this.f23368d;
            if (runnableC3368ji != null) {
                runnableC3368ji.m16188b(c2885Qi);
            }
            RunnableC3368ji runnableC3368ji2 = this.f23369e;
            if (runnableC3368ji2 != null) {
                runnableC3368ji2.m16188b(c2885Qi);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: a */
    public synchronized void m15852a() {
        try {
            RunnableC3368ji runnableC3368ji = this.f23368d;
            if (runnableC3368ji != null) {
                runnableC3368ji.m16179a();
            }
            RunnableC3368ji runnableC3368ji2 = this.f23369e;
            if (runnableC3368ji2 != null) {
                runnableC3368ji2.m16179a();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: a */
    public synchronized void m15854a(File file) {
        try {
            RunnableC3368ji runnableC3368ji = this.f23369e;
            if (runnableC3368ji == null) {
                C3446mi c3446mi = this.f23366b;
                Context context = this.f23365a;
                C2885Qi c2885Qi = this.f23370f;
                c3446mi.getClass();
                this.f23369e = new RunnableC3368ji(context, c2885Qi, new C3008Vh(file), new C3420li(c3446mi), new C3033Wh("open", "https"), new C3033Wh("port_already_in_use", "https"), "Https");
            } else {
                runnableC3368ji.m16180a(this.f23370f);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
