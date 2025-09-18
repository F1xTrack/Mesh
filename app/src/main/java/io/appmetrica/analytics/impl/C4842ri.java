package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.content.Context;
import defpackage.O90;
import io.appmetrica.analytics.coreapi.internal.model.ScreenInfo;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import java.lang.ref.WeakReference;

/* renamed from: io.appmetrica.analytics.impl.ri */
/* loaded from: classes2.dex */
public final class C4842ri implements InterfaceC4656k {
    public C4719me a;
    public ScreenInfo b;
    public boolean c;
    public boolean d;
    public final C4819qi e = new C4819qi();
    public WeakReference f = new WeakReference(null);

    public final synchronized void a(Activity activity) {
        try {
            this.f = new WeakReference(activity);
            if (!this.d) {
                if (this.a == null) {
                    this.a = new C4719me(Z6.a(activity).a());
                }
                C4719me c4719me = this.a;
                O90.c(c4719me);
                this.b = c4719me.p();
                if (this.a == null) {
                    this.a = new C4719me(Z6.a(activity).a());
                }
                C4719me c4719me2 = this.a;
                O90.c(c4719me2);
                this.c = c4719me2.t();
                this.d = true;
            }
            if (this.b == null) {
                b(activity);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void b(Context context) {
        if (context != null) {
            this.e.getClass();
            ScreenInfo screenInfoA = C4819qi.a(context);
            if (screenInfoA == null || screenInfoA.equals(this.b)) {
                return;
            }
            this.b = screenInfoA;
            if (this.a == null) {
                this.a = new C4719me(Z6.a(context).a());
            }
            C4719me c4719me = this.a;
            O90.c(c4719me);
            c4719me.a(this.b);
        }
    }

    public final synchronized ScreenInfo a(Context context) {
        try {
            if (!this.d) {
                if (this.a == null) {
                    this.a = new C4719me(Z6.a(context).a());
                }
                C4719me c4719me = this.a;
                O90.c(c4719me);
                this.b = c4719me.p();
                if (this.a == null) {
                    this.a = new C4719me(Z6.a(context).a());
                }
                C4719me c4719me2 = this.a;
                O90.c(c4719me2);
                this.c = c4719me2.t();
                this.d = true;
            }
            b((Context) this.f.get());
            if (this.b == null) {
                if (AndroidUtils.isApiAchieved(30)) {
                    if (!this.c) {
                        b(context);
                        this.c = true;
                        if (this.a == null) {
                            this.a = new C4719me(Z6.a(context).a());
                        }
                        C4719me c4719me3 = this.a;
                        O90.c(c4719me3);
                        c4719me3.v();
                    }
                } else {
                    b(context);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.b;
    }

    public final void a(C4719me c4719me) {
        this.a = c4719me;
    }
}
