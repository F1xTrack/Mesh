package io.sentry.android.core;

import android.content.Context;
import com.yandex.metrica.C2460e;
import io.sentry.C5765F1;
import io.sentry.C5774I1;
import io.sentry.C6193y;
import io.sentry.InterfaceC6165u;
import io.sentry.hints.InterfaceC6026a;
import io.sentry.hints.InterfaceC6027b;
import io.sentry.protocol.C6078A;

/* renamed from: io.sentry.android.core.u */
/* loaded from: classes2.dex */
public final class C5912u implements InterfaceC6165u {

    /* renamed from: a */
    public final Context f33854a;

    /* renamed from: b */
    public final SentryAndroidOptions f33855b;

    /* renamed from: c */
    public final C5832D f33856c;

    /* renamed from: d */
    public final C2460e f33857d;

    public C5912u(Context context, C5832D c5832d, SentryAndroidOptions sentryAndroidOptions) {
        Context applicationContext = context.getApplicationContext();
        this.f33854a = applicationContext != null ? applicationContext : context;
        this.f33855b = sentryAndroidOptions;
        this.f33856c = c5832d;
        this.f33857d = new C2460e(new C5774I1(sentryAndroidOptions, 0));
    }

    /* renamed from: b */
    public static boolean m21641b(InterfaceC6027b interfaceC6027b) {
        if (interfaceC6027b instanceof InterfaceC6026a) {
            return "anr_background".equals(((InterfaceC6026a) interfaceC6027b).mo21619e());
        }
        return false;
    }

    @Override // io.sentry.InterfaceC6165u
    /* renamed from: a */
    public final C5765F1 mo21517a(C5765F1 c5765f1, C6193y c6193y) {
        return c5765f1;
    }

    /* JADX WARN: Removed duplicated region for block: B:197:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x050e  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0527  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0561  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0587  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0590  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x059a  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x05d8  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x061d  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0656 A[Catch: all -> 0x0693, TryCatch #0 {all -> 0x0693, blocks: (B:278:0x064c, B:280:0x0656, B:282:0x066a, B:283:0x066f, B:284:0x0677, B:286:0x067d), top: B:292:0x064c }] */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0629 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // io.sentry.InterfaceC6165u
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final io.sentry.C6039i1 mo21519c(io.sentry.C6039i1 r28, io.sentry.C6193y r29) {
        /*
            Method dump skipped, instructions count: 1696
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.core.C5912u.mo21519c(io.sentry.i1, io.sentry.y):io.sentry.i1");
    }

    @Override // io.sentry.InterfaceC6165u
    /* renamed from: e */
    public final C6078A mo21521e(C6078A c6078a, C6193y c6193y) {
        return c6078a;
    }
}
