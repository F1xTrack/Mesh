package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;

/* loaded from: classes2.dex */
public class Uh {
    private final Context a;
    private final L0 b;
    private final InterfaceExecutorC3086sn c;
    private final Qd d;
    private final Ph e;
    private final Om f;
    private final Ud g;
    private final C3167w h;
    private boolean i;

    public Uh(Context context) {
        this(context, new L0(), new Qd(), new Nm(), new Rd(context), P0.i().s().h(), P0.i().u(), P0.i().a());
    }

    public static void c(Uh uh) {
        synchronized (uh) {
            uh.i = false;
        }
    }

    public synchronized void a(Qi qi, C2733ei c2733ei) {
        try {
            Ei eiM = qi.M();
            if (eiM == null) {
                return;
            }
            File fileA = this.b.a(this.a, "certificate.p12");
            boolean z = fileA != null && fileA.exists();
            if (z) {
                c2733ei.a(fileA);
            }
            long jB = this.f.b();
            long jA = this.e.a();
            if ((!z || jB >= jA) && !this.i) {
                String strE = qi.e();
                if (!TextUtils.isEmpty(strE) && this.g.a()) {
                    this.i = true;
                    this.h.a(C3167w.c, this.c, new Sh(this, strE, fileA, c2733ei, eiM));
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public Uh(Context context, L0 l0, Qd qd, Om om, Ud ud, InterfaceExecutorC3086sn interfaceExecutorC3086sn, Ph ph, C3167w c3167w) {
        this.i = false;
        this.a = context;
        this.b = l0;
        this.d = qd;
        this.f = om;
        this.g = ud;
        this.c = interfaceExecutorC3086sn;
        this.e = ph;
        this.h = c3167w;
    }

    public static void a(Uh uh, long j) {
        uh.e.a(uh.f.b() + j);
    }
}
