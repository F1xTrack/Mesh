package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.model.ScreenInfo;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import java.lang.ref.WeakReference;
import p000.O90;

/* renamed from: io.appmetrica.analytics.impl.ri */
/* loaded from: classes2.dex */
public final class C5427ri implements InterfaceC5233k {

    /* renamed from: a */
    public C5298me f32513a;

    /* renamed from: b */
    public ScreenInfo f32514b;

    /* renamed from: c */
    public boolean f32515c;

    /* renamed from: d */
    public boolean f32516d;

    /* renamed from: e */
    public final C5402qi f32517e = new C5402qi();

    /* renamed from: f */
    public WeakReference f32518f = new WeakReference(null);

    /* renamed from: a */
    public final synchronized void m21017a(Activity activity) {
        try {
            this.f32518f = new WeakReference(activity);
            if (!this.f32516d) {
                if (this.f32513a == null) {
                    this.f32513a = new C5298me(C4966Z6.m20064a(activity).m20066a());
                }
                C5298me c5298me = this.f32513a;
                O90.m5965c(c5298me);
                this.f32514b = c5298me.m20749p();
                if (this.f32513a == null) {
                    this.f32513a = new C5298me(C4966Z6.m20064a(activity).m20066a());
                }
                C5298me c5298me2 = this.f32513a;
                O90.m5965c(c5298me2);
                this.f32515c = c5298me2.m20753t();
                this.f32516d = true;
            }
            if (this.f32514b == null) {
                m21019b(activity);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: b */
    public final void m21019b(Context context) {
        if (context != null) {
            this.f32517e.getClass();
            ScreenInfo screenInfoM20978a = C5402qi.m20978a(context);
            if (screenInfoM20978a == null || screenInfoM20978a.equals(this.f32514b)) {
                return;
            }
            this.f32514b = screenInfoM20978a;
            if (this.f32513a == null) {
                this.f32513a = new C5298me(C4966Z6.m20064a(context).m20066a());
            }
            C5298me c5298me = this.f32513a;
            O90.m5965c(c5298me);
            c5298me.m20717a(this.f32514b);
        }
    }

    /* renamed from: a */
    public final synchronized ScreenInfo m21016a(Context context) {
        try {
            if (!this.f32516d) {
                if (this.f32513a == null) {
                    this.f32513a = new C5298me(C4966Z6.m20064a(context).m20066a());
                }
                C5298me c5298me = this.f32513a;
                O90.m5965c(c5298me);
                this.f32514b = c5298me.m20749p();
                if (this.f32513a == null) {
                    this.f32513a = new C5298me(C4966Z6.m20064a(context).m20066a());
                }
                C5298me c5298me2 = this.f32513a;
                O90.m5965c(c5298me2);
                this.f32515c = c5298me2.m20753t();
                this.f32516d = true;
            }
            m21019b((Context) this.f32518f.get());
            if (this.f32514b == null) {
                if (AndroidUtils.isApiAchieved(30)) {
                    if (!this.f32515c) {
                        m21019b(context);
                        this.f32515c = true;
                        if (this.f32513a == null) {
                            this.f32513a = new C5298me(C4966Z6.m20064a(context).m20066a());
                        }
                        C5298me c5298me3 = this.f32513a;
                        O90.m5965c(c5298me3);
                        c5298me3.m20755v();
                    }
                } else {
                    m21019b(context);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f32514b;
    }

    /* renamed from: a */
    public final void m21018a(C5298me c5298me) {
        this.f32513a = c5298me;
    }
}
