package com.my.tracker.obfuscated;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.appset.AppSet;
import defpackage.BH;
import defpackage.N8;
import defpackage.O7;
import defpackage.P7;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class h {
    private final AtomicReference a = new AtomicReference();
    protected boolean b = false;

    public static final class a {
        public static final boolean a;

        static {
            boolean z = false;
            try {
                if (AppSet.class.equals(AppSet.class) && O7.class.equals(O7.class)) {
                    if (P7.class.equals(P7.class)) {
                        z = true;
                    }
                }
            } catch (Throwable th) {
                y2.a("AppSetIdProvider: error occurred while working with App Set library classes", th);
            }
            a = z;
        }
    }

    private void b(Context context) {
        q1 q1VarA = q1.a(context);
        String strD = q1VarA.d();
        long jE = q1VarA.e();
        if (!TextUtils.isEmpty(strD)) {
            this.a.set(new g(strD, jE));
        }
        if (!a.a) {
            y2.a("AppSetIdProvider: app set library is not available");
            return;
        }
        try {
            new N8(context, 1).n().e(m.c, new BH(this, jE, q1VarA, strD));
        } catch (Throwable th) {
            y2.a("AppSetIdProvider: error occurred while trying to access app set id info", th);
        }
        a();
    }

    public void a(long j, q1 q1Var, String str, P7 p7) {
        int i = p7.b;
        long j2 = i;
        if (j2 != j) {
            q1Var.a(i);
        }
        String str2 = p7.a;
        if (!str2.equals(str)) {
            q1Var.f(str2);
            y2.a("AppSetIdProvider: new id value has been received: ".concat(str2));
        }
        if (TextUtils.isEmpty(str2) || i == -1) {
            this.a.set(null);
        } else {
            this.a.set(new g(str2, j2));
        }
        synchronized (this.a) {
            this.a.notify();
        }
    }

    private void a() {
        try {
            g gVar = (g) this.a.get();
            if (gVar != null) {
                y2.a("AppSetIdProvider: app set id has been collected, value: " + gVar.a);
            } else {
                synchronized (this.a) {
                    this.a.wait(300L);
                }
                y2.a("AppSetIdProvider: timeout for collecting id has exceeded");
            }
        } catch (Throwable th) {
            y2.a("AppSetIdProvider: attempt to block thread retrieving app set id finished unsuccessfully", th);
        }
    }

    public g a(Context context) {
        if (!this.b) {
            b(context);
            this.b = true;
        }
        return (g) this.a.get();
    }
}
