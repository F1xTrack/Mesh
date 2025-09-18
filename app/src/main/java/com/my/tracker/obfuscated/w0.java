package com.my.tracker.obfuscated;

import android.content.Context;
import defpackage.N61;

/* loaded from: classes2.dex */
public final class w0 {
    static int f = 3;
    static volatile w0 g;
    final f0 a;
    final n b;
    final Context c;
    InstallReferrerClient d;
    int e;

    public final class a implements InstallReferrerStateListener {
        public a() {
        }

        public void onInstallReferrerServiceDisconnected() {
            y2.a("HuaweiReferrerHandler: install referrer service is disconnected. Connection attempts: " + w0.this.e);
            w0.this.a(this);
        }

        public void onInstallReferrerSetupFinished(int i) {
            if (i == -1) {
                w0.this.a(this);
            } else {
                y2.a("HuaweiReferrerHandler: install referrer setup is finished");
                w0.this.a(i);
            }
        }
    }

    public w0(f0 f0Var, n nVar, Context context) {
        this.a = f0Var;
        this.b = nVar;
        this.c = context.getApplicationContext();
    }

    public void a(ReferrerDetails referrerDetails) {
        q1 q1VarA = q1.a(this.c);
        if (q1VarA.p()) {
            y2.a("HuaweiReferrerHandler: api referrer has been tracked");
            return;
        }
        String installReferrer = referrerDetails.getInstallReferrer();
        y2.a("HuaweiReferrerHandler: retrieving install referrer is completed. Referrer: " + installReferrer);
        this.a.b(installReferrer, u.b(this.c), referrerDetails.getInstallBeginTimestampSeconds(), referrerDetails.getReferrerClickTimestampSeconds());
        this.b.a(installReferrer);
        q1VarA.t();
    }

    public static void a(f0 f0Var, n nVar, Context context) {
        if (g != null) {
            return;
        }
        synchronized (w0.class) {
            try {
                if (g != null) {
                    return;
                }
                w0 w0Var = new w0(f0Var, nVar, context);
                m.a(new N61(25, w0Var));
                g = w0Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a() {
        if (q1.a(this.c).p()) {
            return;
        }
        try {
            y2.a("HuaweiReferrerHandler: initialize InstallReferrerClient");
            this.d = InstallReferrerClient.newBuilder(this.c).build();
            a(new a());
        } catch (Throwable th) {
            y2.b("HuaweiReferrerHandler: error occurred while initialization InstallReferrerClient", th);
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x002f -> B:17:0x0034). Please report as a decompilation issue!!! */
    public void a(int i) {
        if (this.d == null) {
            y2.b("HuaweiReferrerHandler: install referrer client is null");
            return;
        }
        try {
            if (i == 0) {
                y2.a("HuaweiReferrerHandler: retrieving install referrer");
                a(this.d.getInstallReferrer());
            } else {
                y2.a("HuaweiReferrerHandler: InstallReferrerResponse code: " + i);
            }
        } catch (Throwable th) {
            y2.b("HuaweiReferrerHandler: error occurred while retrieving install referrer", th);
        }
        try {
            this.d.endConnection();
        } catch (Throwable unused) {
        }
        this.d = null;
    }

    public void a(InstallReferrerStateListener installReferrerStateListener) {
        if (this.d == null) {
            y2.a("HuaweiReferrerHandler: InstallReferrerClient is null");
            return;
        }
        int i = this.e;
        if (i >= f) {
            y2.a("HuaweiReferrerHandler: max count of reconnection attempts is reached");
            try {
                this.d.endConnection();
            } catch (Throwable unused) {
            }
            this.d = null;
            return;
        }
        this.e = i + 1;
        try {
            y2.a("HuaweiReferrerHandler: connect to referrer client");
            this.d.startConnection(installReferrerStateListener);
        } catch (Throwable th) {
            y2.b("HuaweiReferrerHandler: error occurred while connection InstallReferrerClient", th);
            a(installReferrerStateListener);
        }
    }
}
