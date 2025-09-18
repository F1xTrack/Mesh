package com.my.tracker.obfuscated;

import android.content.Context;
import android.text.TextUtils;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import defpackage.RunnableC5788lw1;

/* loaded from: classes2.dex */
public final class q0 {
    static int f = 3;
    static volatile q0 g;
    final f0 a;
    final n b;
    final Context c;
    InstallReferrerClient d;
    int e;

    public final class a implements InstallReferrerStateListener {
        public a() {
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public void onInstallReferrerServiceDisconnected() {
            y2.a("ReferrerHandler: install referrer service is disconnected. Connection attempts: " + q0.this.e);
            q0.this.a(this);
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public void onInstallReferrerSetupFinished(int i) {
            y2.a("ReferrerHandler: install referrer setup is finished");
            if (i == -1) {
                q0.this.a(this);
            } else {
                q0.this.a(i);
            }
        }
    }

    public q0(f0 f0Var, n nVar, Context context) {
        this.a = f0Var;
        this.b = nVar;
        this.c = context.getApplicationContext();
    }

    /* renamed from: a */
    public void b(ReferrerDetails referrerDetails) {
        q1 q1VarA = q1.a(this.c);
        if (q1VarA.o()) {
            y2.a("ReferrerHandler: api referrer has been tracked");
            return;
        }
        String installReferrer = referrerDetails.getInstallReferrer();
        y2.a("ReferrerHandler: retrieving install referrer is completed. Referrer: " + installReferrer);
        this.a.a(installReferrer, u.b(this.c), referrerDetails.getInstallBeginTimestampSeconds(), referrerDetails.getReferrerClickTimestampSeconds());
        this.b.a(installReferrer);
        q1VarA.s();
    }

    public static void a(String str, Context context, Runnable runnable) {
        q0 q0Var = g;
        if (q0Var != null) {
            q0Var.a(str, runnable);
            return;
        }
        q1 q1VarA = q1.a(context);
        if (!q1VarA.r()) {
            q1VarA.l(str);
        }
        runnable.run();
    }

    public /* synthetic */ void c() {
        try {
            y2.a("ReferrerHandler: initialize InstallReferrerClient");
            this.d = InstallReferrerClient.newBuilder(this.c).build();
            a(new a());
        } catch (Throwable th) {
            y2.b("ReferrerHandler: error occurred while initialization InstallReferrerClient", th);
        }
    }

    public void b() {
        q1 q1VarA = q1.a(this.c);
        if (q1VarA.r()) {
            return;
        }
        String strM = q1VarA.m();
        if (TextUtils.isEmpty(strM)) {
            return;
        }
        a(strM, null);
    }

    public void a(String str, Runnable runnable) {
        q1 q1VarA = q1.a(this.c);
        if (q1VarA.r()) {
            y2.a("ReferrerHandler: referrer has been tracked");
            return;
        }
        this.a.a(str, u.b(this.c), runnable);
        this.b.a(str);
        q1VarA.v();
    }

    public static void a(f0 f0Var, n nVar, Context context) {
        if (g != null) {
            return;
        }
        synchronized (q0.class) {
            try {
                if (g != null) {
                    return;
                }
                q0 q0Var = new q0(f0Var, nVar, context);
                m.a(new RunnableC5788lw1(q0Var, 0));
                g = q0Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a() {
        if (q1.a(this.c).o()) {
            return;
        }
        m.f(new RunnableC5788lw1(this, 1));
    }

    public static /* synthetic */ void a(q0 q0Var) {
        q0Var.b();
        q0Var.a();
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0036 -> B:37:0x003b). Please report as a decompilation issue!!! */
    public void a(int i) {
        if (this.d == null) {
            y2.b("ReferrerHandler: install referrer client is null");
            return;
        }
        try {
            if (i == 0) {
                y2.a("ReferrerHandler: retrieving install referrer");
                m.a(new io.sentry.cache.f(this, 10, this.d.getInstallReferrer()));
            } else {
                y2.a("ReferrerHandler: InstallReferrerResponse code: " + i);
            }
        } catch (Throwable th) {
            y2.b("ReferrerHandler: error occurred while retrieving install referrer", th);
        }
        try {
            this.d.endConnection();
        } catch (Throwable unused) {
        }
        this.d = null;
    }

    public void a(InstallReferrerStateListener installReferrerStateListener) {
        InstallReferrerClient installReferrerClient = this.d;
        if (installReferrerClient == null) {
            y2.a("ReferrerHandler: InstallReferrerClient is null");
            return;
        }
        int i = this.e;
        if (i >= f) {
            try {
                installReferrerClient.endConnection();
            } catch (Throwable unused) {
            }
            this.d = null;
            return;
        }
        this.e = i + 1;
        try {
            y2.a("ReferrerHandler: connect to referrer client");
            this.d.startConnection(installReferrerStateListener);
        } catch (Throwable th) {
            y2.b("ReferrerHandler: error occurred while connection InstallReferrerClient", th);
            a(installReferrerStateListener);
        }
    }
}
