package com.p018my.tracker.obfuscated;

import android.content.Context;
import com.huawei.hms.ads.installreferrer.api.InstallReferrerClient;
import com.huawei.hms.ads.installreferrer.api.InstallReferrerStateListener;
import com.huawei.hms.ads.installreferrer.api.ReferrerDetails;
import p000.N61;

/* renamed from: com.my.tracker.obfuscated.w0 */
/* loaded from: classes2.dex */
public final class C2381w0 {

    /* renamed from: f */
    static int f20136f = 3;

    /* renamed from: g */
    static volatile C2381w0 f20137g;

    /* renamed from: a */
    final C2313f0 f20138a;

    /* renamed from: b */
    final C2344n f20139b;

    /* renamed from: c */
    final Context f20140c;

    /* renamed from: d */
    InstallReferrerClient f20141d;

    /* renamed from: e */
    int f20142e;

    /* renamed from: com.my.tracker.obfuscated.w0$a */
    public final class a implements InstallReferrerStateListener {
        public a() {
        }

        public void onInstallReferrerServiceDisconnected() {
            AbstractC2391y2.m13568a("HuaweiReferrerHandler: install referrer service is disconnected. Connection attempts: " + C2381w0.this.f20142e);
            C2381w0.this.m13526a(this);
        }

        public void onInstallReferrerSetupFinished(int i) {
            if (i == -1) {
                C2381w0.this.m13526a(this);
            } else {
                AbstractC2391y2.m13568a("HuaweiReferrerHandler: install referrer setup is finished");
                C2381w0.this.m13525a(i);
            }
        }
    }

    public C2381w0(C2313f0 c2313f0, C2344n c2344n, Context context) {
        this.f20138a = c2313f0;
        this.f20139b = c2344n;
        this.f20140c = context.getApplicationContext();
    }

    /* renamed from: a */
    public void m13527a(ReferrerDetails referrerDetails) {
        C2358q1 c2358q1M13407a = C2358q1.m13407a(this.f20140c);
        if (c2358q1M13407a.m13443p()) {
            AbstractC2391y2.m13568a("HuaweiReferrerHandler: api referrer has been tracked");
            return;
        }
        String installReferrer = referrerDetails.getInstallReferrer();
        AbstractC2391y2.m13568a("HuaweiReferrerHandler: retrieving install referrer is completed. Referrer: " + installReferrer);
        this.f20138a.m13079b(installReferrer, AbstractC2372u.m13513b(this.f20140c), referrerDetails.getInstallBeginTimestampSeconds(), referrerDetails.getReferrerClickTimestampSeconds());
        this.f20139b.m13320a(installReferrer);
        c2358q1M13407a.m13447t();
    }

    /* renamed from: a */
    public static void m13523a(C2313f0 c2313f0, C2344n c2344n, Context context) {
        if (f20137g != null) {
            return;
        }
        synchronized (C2381w0.class) {
            try {
                if (f20137g != null) {
                    return;
                }
                C2381w0 c2381w0 = new C2381w0(c2313f0, c2344n, context);
                AbstractC2340m.m13290a(new N61(25, c2381w0));
                f20137g = c2381w0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    public void m13524a() {
        if (C2358q1.m13407a(this.f20140c).m13443p()) {
            return;
        }
        try {
            AbstractC2391y2.m13568a("HuaweiReferrerHandler: initialize InstallReferrerClient");
            this.f20141d = InstallReferrerClient.newBuilder(this.f20140c).build();
            m13526a(new a());
        } catch (Throwable th) {
            AbstractC2391y2.m13573b("HuaweiReferrerHandler: error occurred while initialization InstallReferrerClient", th);
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x002f -> B:17:0x0034). Please report as a decompilation issue!!! */
    /* renamed from: a */
    public void m13525a(int i) {
        if (this.f20141d == null) {
            AbstractC2391y2.m13572b("HuaweiReferrerHandler: install referrer client is null");
            return;
        }
        try {
            if (i == 0) {
                AbstractC2391y2.m13568a("HuaweiReferrerHandler: retrieving install referrer");
                m13527a(this.f20141d.getInstallReferrer());
            } else {
                AbstractC2391y2.m13568a("HuaweiReferrerHandler: InstallReferrerResponse code: " + i);
            }
        } catch (Throwable th) {
            AbstractC2391y2.m13573b("HuaweiReferrerHandler: error occurred while retrieving install referrer", th);
        }
        try {
            this.f20141d.endConnection();
        } catch (Throwable unused) {
        }
        this.f20141d = null;
    }

    /* renamed from: a */
    public void m13526a(InstallReferrerStateListener installReferrerStateListener) {
        if (this.f20141d == null) {
            AbstractC2391y2.m13568a("HuaweiReferrerHandler: InstallReferrerClient is null");
            return;
        }
        int i = this.f20142e;
        if (i >= f20136f) {
            AbstractC2391y2.m13568a("HuaweiReferrerHandler: max count of reconnection attempts is reached");
            try {
                this.f20141d.endConnection();
            } catch (Throwable unused) {
            }
            this.f20141d = null;
            return;
        }
        this.f20142e = i + 1;
        try {
            AbstractC2391y2.m13568a("HuaweiReferrerHandler: connect to referrer client");
            this.f20141d.startConnection(installReferrerStateListener);
        } catch (Throwable th) {
            AbstractC2391y2.m13573b("HuaweiReferrerHandler: error occurred while connection InstallReferrerClient", th);
            m13526a(installReferrerStateListener);
        }
    }
}
