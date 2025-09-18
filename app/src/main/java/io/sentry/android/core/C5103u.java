package io.sentry.android.core;

import android.content.Context;
import io.sentry.C5185y;
import io.sentry.F1;
import io.sentry.I1;
import io.sentry.InterfaceC5173u;

/* renamed from: io.sentry.android.core.u, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5103u implements InterfaceC5173u {
    public final Context a;
    public final SentryAndroidOptions b;
    public final D c;
    public final com.yandex.metrica.e d;

    public C5103u(Context context, D d, SentryAndroidOptions sentryAndroidOptions) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext != null ? applicationContext : context;
        this.b = sentryAndroidOptions;
        this.c = d;
        this.d = new com.yandex.metrica.e(new I1(sentryAndroidOptions, 0));
    }

    public static boolean b(io.sentry.hints.b bVar) {
        if (bVar instanceof io.sentry.hints.a) {
            return "anr_background".equals(((io.sentry.hints.a) bVar).e());
        }
        return false;
    }

    @Override // io.sentry.InterfaceC5173u
    public final F1 a(F1 f1, C5185y c5185y) {
        return f1;
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
    @Override // io.sentry.InterfaceC5173u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final io.sentry.C5133i1 c(io.sentry.C5133i1 r28, io.sentry.C5185y r29) {
        /*
            Method dump skipped, instructions count: 1696
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.core.C5103u.c(io.sentry.i1, io.sentry.y):io.sentry.i1");
    }

    @Override // io.sentry.InterfaceC5173u
    public final io.sentry.protocol.A e(io.sentry.protocol.A a, C5185y c5185y) {
        return a;
    }
}
