package com.yandex.metrica.impl.ob;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import com.yandex.metrica.impl.ob.C3192x;
import java.lang.ref.WeakReference;

/* renamed from: com.yandex.metrica.impl.ob.z2 */
/* loaded from: classes2.dex */
public class C3245z2 implements C3192x.b {

    @SuppressLint({"StaticFieldLeak"})
    private static volatile C3245z2 g;
    private final Context a;
    private C3170w2 b;
    private WeakReference<Activity> c = new WeakReference<>(null);
    private final F9 d;
    private final C3195x2 e;
    private boolean f;

    public C3245z2(Context context, F9 f9, C3195x2 c3195x2) {
        this.a = context;
        this.d = f9;
        this.e = c3195x2;
        this.b = f9.r();
        this.f = f9.w();
        Y.g().a().a(this);
    }

    public static C3245z2 a(Context context) {
        if (g == null) {
            synchronized (C3245z2.class) {
                try {
                    if (g == null) {
                        g = new C3245z2(context, new F9(Qa.a(context).c()), new C3195x2());
                    }
                } finally {
                }
            }
        }
        return g;
    }

    private void b(Context context) {
        C3170w2 c3170w2A;
        if (context == null || (c3170w2A = this.e.a(context)) == null || c3170w2A.equals(this.b)) {
            return;
        }
        this.b = c3170w2A;
        this.d.a(c3170w2A);
    }

    public synchronized C3170w2 a() {
        try {
            b(this.c.get());
            if (this.b == null) {
                if (U2.a(30)) {
                    if (!this.f) {
                        b(this.a);
                        this.f = true;
                        this.d.y();
                    }
                } else {
                    b(this.a);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.b;
    }

    @Override // com.yandex.metrica.impl.ob.C3192x.b
    public synchronized void a(Activity activity) {
        this.c = new WeakReference<>(activity);
        if (this.b == null) {
            b(activity);
        }
    }
}
