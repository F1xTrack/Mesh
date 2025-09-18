package io.sentry.android.core;

import android.app.ApplicationExitInfo;
import android.content.Context;
import defpackage.CU1;
import defpackage.JU1;
import io.sentry.C5081a;
import io.sentry.C5133i1;
import io.sentry.C5135j0;
import io.sentry.C5185y;
import io.sentry.EnumC5148n1;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* renamed from: io.sentry.android.core.w */
/* loaded from: classes2.dex */
public final class RunnableC5105w implements Runnable {
    public final /* synthetic */ int a = 1;
    public long b;
    public Object c;
    public Object d;

    public /* synthetic */ RunnableC5105w() {
    }

    public void a(ApplicationExitInfo applicationExitInfo, boolean z) {
        com.yandex.metrica.o oVar;
        byte[] bArr;
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.d;
        long timestamp = applicationExitInfo.getTimestamp();
        boolean z2 = applicationExitInfo.getImportance() != 100;
        try {
            InputStream traceInputStream = applicationExitInfo.getTraceInputStream();
            try {
                if (traceInputStream == null) {
                    oVar = new com.yandex.metrica.o(EnumC5107y.NO_DUMP);
                    if (traceInputStream != null) {
                        traceInputStream.close();
                    }
                } else {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        byte[] bArr2 = new byte[1024];
                        while (true) {
                            int i = traceInputStream.read(bArr2, 0, 1024);
                            if (i == -1) {
                                break;
                            } else {
                                byteArrayOutputStream.write(bArr2, 0, i);
                            }
                        }
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                        traceInputStream.close();
                        try {
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(byteArray)));
                            try {
                                ArrayList arrayList = new ArrayList();
                                while (true) {
                                    String line = bufferedReader.readLine();
                                    if (line == null) {
                                        break;
                                    }
                                    io.sentry.android.core.internal.threaddump.a aVar = new io.sentry.android.core.internal.threaddump.a();
                                    aVar.a = line;
                                    arrayList.add(aVar);
                                }
                                ArrayList arrayListD = new io.sentry.android.core.internal.threaddump.c(sentryAndroidOptions, z2).d(new io.sentry.android.core.internal.threaddump.b(arrayList));
                                if (arrayListD.isEmpty()) {
                                    oVar = new com.yandex.metrica.o(EnumC5107y.NO_DUMP);
                                    bufferedReader.close();
                                } else {
                                    com.yandex.metrica.o oVar2 = new com.yandex.metrica.o(EnumC5107y.DUMP, byteArray, arrayListD);
                                    bufferedReader.close();
                                    oVar = oVar2;
                                }
                            } finally {
                            }
                        } catch (Throwable th) {
                            sentryAndroidOptions.getLogger().d(EnumC5148n1.WARNING, "Failed to parse ANR thread dump", th);
                            oVar = new com.yandex.metrica.o(EnumC5107y.ERROR, byteArray);
                        }
                    } finally {
                    }
                }
            } finally {
            }
        } catch (Throwable th2) {
            sentryAndroidOptions.getLogger().d(EnumC5148n1.WARNING, "Failed to read ANR thread dump", th2);
            oVar = new com.yandex.metrica.o(EnumC5107y.NO_DUMP);
        }
        EnumC5107y enumC5107y = EnumC5107y.NO_DUMP;
        EnumC5107y enumC5107y2 = (EnumC5107y) oVar.a;
        if (enumC5107y2 == enumC5107y) {
            sentryAndroidOptions.getLogger().k(EnumC5148n1.WARNING, "Not reporting ANR event as there was no thread dump for the ANR %s", applicationExitInfo.toString());
            return;
        }
        C5106x c5106x = new C5106x(sentryAndroidOptions.getFlushTimeoutMillis(), sentryAndroidOptions.getLogger(), timestamp, z, z2);
        C5185y c5185yB = io.sentry.config.a.b(c5106x);
        C5133i1 c5133i1 = new C5133i1();
        if (enumC5107y2 == EnumC5107y.ERROR) {
            io.sentry.protocol.k kVar = new io.sentry.protocol.k();
            kVar.a = "Sentry Android SDK failed to parse system thread dump for this ANR. We recommend enabling [SentryOptions.isAttachAnrThreadDump] option to attach the thread dump as plain text and report this issue on GitHub.";
            c5133i1.q = kVar;
        } else if (enumC5107y2 == EnumC5107y.DUMP) {
            c5133i1.s = new C5135j0((ArrayList) oVar.c);
        }
        c5133i1.u = EnumC5148n1.FATAL;
        c5133i1.p = io.sentry.config.a.l(timestamp);
        if (sentryAndroidOptions.isAttachAnrThreadDump() && (bArr = (byte[]) oVar.b) != null) {
            c5185yB.e = new C5081a("thread-dump.txt", "text/plain", bArr);
        }
        if (io.sentry.E.a.F(c5133i1, c5185yB).equals(io.sentry.protocol.t.b) || c5106x.d()) {
            return;
        }
        sentryAndroidOptions.getLogger().k(EnumC5148n1.WARNING, "Timed out waiting to flush ANR event to disk. Event: %s", c5133i1.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0122 A[SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 464
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.core.RunnableC5105w.run():void");
    }

    public RunnableC5105w(JU1 ju1, CU1 cu1, long j) {
        this.c = cu1;
        this.b = j;
        this.d = ju1;
    }

    public RunnableC5105w(Context context, SentryAndroidOptions sentryAndroidOptions, io.sentry.transport.d dVar) {
        this.c = context;
        this.d = sentryAndroidOptions;
        dVar.getClass();
        this.b = System.currentTimeMillis() - AnrV2Integration.d;
    }
}
