package com.p018my.tracker.obfuscated;

import android.content.Context;
import android.text.TextUtils;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import io.sentry.cache.RunnableC5994f;
import p000.RunnableC10200lw1;

/* renamed from: com.my.tracker.obfuscated.q0 */
/* loaded from: classes2.dex */
public final class C2357q0 {

    /* renamed from: f */
    static int f20094f = 3;

    /* renamed from: g */
    static volatile C2357q0 f20095g;

    /* renamed from: a */
    final C2313f0 f20096a;

    /* renamed from: b */
    final C2344n f20097b;

    /* renamed from: c */
    final Context f20098c;

    /* renamed from: d */
    InstallReferrerClient f20099d;

    /* renamed from: e */
    int f20100e;

    /* renamed from: com.my.tracker.obfuscated.q0$a */
    public final class a implements InstallReferrerStateListener {
        public a() {
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public void onInstallReferrerServiceDisconnected() {
            AbstractC2391y2.m13568a("ReferrerHandler: install referrer service is disconnected. Connection attempts: " + C2357q0.this.f20100e);
            C2357q0.this.m13403a(this);
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public void onInstallReferrerSetupFinished(int i) {
            AbstractC2391y2.m13568a("ReferrerHandler: install referrer setup is finished");
            if (i == -1) {
                C2357q0.this.m13403a(this);
            } else {
                C2357q0.this.m13402a(i);
            }
        }
    }

    public C2357q0(C2313f0 c2313f0, C2344n c2344n, Context context) {
        this.f20096a = c2313f0;
        this.f20097b = c2344n;
        this.f20098c = context.getApplicationContext();
    }

    /* renamed from: a */
    public void m13396b(ReferrerDetails referrerDetails) {
        C2358q1 c2358q1M13407a = C2358q1.m13407a(this.f20098c);
        if (c2358q1M13407a.m13442o()) {
            AbstractC2391y2.m13568a("ReferrerHandler: api referrer has been tracked");
            return;
        }
        String installReferrer = referrerDetails.getInstallReferrer();
        AbstractC2391y2.m13568a("ReferrerHandler: retrieving install referrer is completed. Referrer: " + installReferrer);
        this.f20096a.m13063a(installReferrer, AbstractC2372u.m13513b(this.f20098c), referrerDetails.getInstallBeginTimestampSeconds(), referrerDetails.getReferrerClickTimestampSeconds());
        this.f20097b.m13320a(installReferrer);
        c2358q1M13407a.m13446s();
    }

    /* renamed from: a */
    public static void m13395a(String str, Context context, Runnable runnable) {
        C2357q0 c2357q0 = f20095g;
        if (c2357q0 != null) {
            c2357q0.m13405a(str, runnable);
            return;
        }
        C2358q1 c2358q1M13407a = C2358q1.m13407a(context);
        if (!c2358q1M13407a.m13445r()) {
            c2358q1M13407a.m13439l(str);
        }
        runnable.run();
    }

    /* renamed from: c */
    public /* synthetic */ void m13398c() {
        try {
            AbstractC2391y2.m13568a("ReferrerHandler: initialize InstallReferrerClient");
            this.f20099d = InstallReferrerClient.newBuilder(this.f20098c).build();
            m13403a(new a());
        } catch (Throwable th) {
            AbstractC2391y2.m13573b("ReferrerHandler: error occurred while initialization InstallReferrerClient", th);
        }
    }

    /* renamed from: b */
    public void m13406b() {
        C2358q1 c2358q1M13407a = C2358q1.m13407a(this.f20098c);
        if (c2358q1M13407a.m13445r()) {
            return;
        }
        String strM13440m = c2358q1M13407a.m13440m();
        if (TextUtils.isEmpty(strM13440m)) {
            return;
        }
        m13405a(strM13440m, null);
    }

    /* renamed from: a */
    public void m13405a(String str, Runnable runnable) {
        C2358q1 c2358q1M13407a = C2358q1.m13407a(this.f20098c);
        if (c2358q1M13407a.m13445r()) {
            AbstractC2391y2.m13568a("ReferrerHandler: referrer has been tracked");
            return;
        }
        this.f20096a.m13064a(str, AbstractC2372u.m13513b(this.f20098c), runnable);
        this.f20097b.m13320a(str);
        c2358q1M13407a.m13449v();
    }

    /* renamed from: a */
    public static void m13393a(C2313f0 c2313f0, C2344n c2344n, Context context) {
        if (f20095g != null) {
            return;
        }
        synchronized (C2357q0.class) {
            try {
                if (f20095g != null) {
                    return;
                }
                C2357q0 c2357q0 = new C2357q0(c2313f0, c2344n, context);
                AbstractC2340m.m13290a(new RunnableC10200lw1(c2357q0, 0));
                f20095g = c2357q0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    public void m13401a() {
        if (C2358q1.m13407a(this.f20098c).m13442o()) {
            return;
        }
        AbstractC2340m.m13295f(new RunnableC10200lw1(this, 1));
    }

    /* renamed from: a */
    public static /* synthetic */ void m13394a(C2357q0 c2357q0) {
        c2357q0.m13406b();
        c2357q0.m13401a();
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0036 -> B:37:0x003b). Please report as a decompilation issue!!! */
    /* renamed from: a */
    public void m13402a(int i) {
        if (this.f20099d == null) {
            AbstractC2391y2.m13572b("ReferrerHandler: install referrer client is null");
            return;
        }
        try {
            if (i == 0) {
                AbstractC2391y2.m13568a("ReferrerHandler: retrieving install referrer");
                AbstractC2340m.m13290a(new RunnableC5994f(this, 10, this.f20099d.getInstallReferrer()));
            } else {
                AbstractC2391y2.m13568a("ReferrerHandler: InstallReferrerResponse code: " + i);
            }
        } catch (Throwable th) {
            AbstractC2391y2.m13573b("ReferrerHandler: error occurred while retrieving install referrer", th);
        }
        try {
            this.f20099d.endConnection();
        } catch (Throwable unused) {
        }
        this.f20099d = null;
    }

    /* renamed from: a */
    public void m13403a(InstallReferrerStateListener installReferrerStateListener) {
        InstallReferrerClient installReferrerClient = this.f20099d;
        if (installReferrerClient == null) {
            AbstractC2391y2.m13568a("ReferrerHandler: InstallReferrerClient is null");
            return;
        }
        int i = this.f20100e;
        if (i >= f20094f) {
            try {
                installReferrerClient.endConnection();
            } catch (Throwable unused) {
            }
            this.f20099d = null;
            return;
        }
        this.f20100e = i + 1;
        try {
            AbstractC2391y2.m13568a("ReferrerHandler: connect to referrer client");
            this.f20099d.startConnection(installReferrerStateListener);
        } catch (Throwable th) {
            AbstractC2391y2.m13573b("ReferrerHandler: error occurred while connection InstallReferrerClient", th);
            m13403a(installReferrerStateListener);
        }
    }
}
