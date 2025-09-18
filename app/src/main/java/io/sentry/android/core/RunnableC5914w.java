package io.sentry.android.core;

import android.app.ApplicationExitInfo;
import android.content.Context;
import com.yandex.metrica.C3796o;
import io.sentry.C5760E;
import io.sentry.C5825a;
import io.sentry.C6039i1;
import io.sentry.C6052j0;
import io.sentry.C6193y;
import io.sentry.EnumC6069n1;
import io.sentry.android.core.internal.threaddump.C5878a;
import io.sentry.android.core.internal.threaddump.C5879b;
import io.sentry.android.core.internal.threaddump.C5880c;
import io.sentry.config.AbstractC6003a;
import io.sentry.protocol.C6095k;
import io.sentry.protocol.C6104t;
import io.sentry.transport.C6152d;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import p000.CU1;
import p000.JU1;

/* renamed from: io.sentry.android.core.w */
/* loaded from: classes2.dex */
public final class RunnableC5914w implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f33858a = 1;

    /* renamed from: b */
    public long f33859b;

    /* renamed from: c */
    public Object f33860c;

    /* renamed from: d */
    public Object f33861d;

    public /* synthetic */ RunnableC5914w() {
    }

    /* renamed from: a */
    public void m21643a(ApplicationExitInfo applicationExitInfo, boolean z) {
        C3796o c3796o;
        byte[] bArr;
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.f33861d;
        long timestamp = applicationExitInfo.getTimestamp();
        boolean z2 = applicationExitInfo.getImportance() != 100;
        try {
            InputStream traceInputStream = applicationExitInfo.getTraceInputStream();
            try {
                if (traceInputStream == null) {
                    c3796o = new C3796o(EnumC5916y.NO_DUMP);
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
                                    C5878a c5878a = new C5878a();
                                    c5878a.f33728a = line;
                                    arrayList.add(c5878a);
                                }
                                ArrayList arrayListM21580d = new C5880c(sentryAndroidOptions, z2).m21580d(new C5879b(arrayList));
                                if (arrayListM21580d.isEmpty()) {
                                    c3796o = new C3796o(EnumC5916y.NO_DUMP);
                                    bufferedReader.close();
                                } else {
                                    C3796o c3796o2 = new C3796o(EnumC5916y.DUMP, byteArray, arrayListM21580d);
                                    bufferedReader.close();
                                    c3796o = c3796o2;
                                }
                            } finally {
                            }
                        } catch (Throwable th) {
                            sentryAndroidOptions.getLogger().mo21406d(EnumC6069n1.WARNING, "Failed to parse ANR thread dump", th);
                            c3796o = new C3796o(EnumC5916y.ERROR, byteArray);
                        }
                    } finally {
                    }
                }
            } finally {
            }
        } catch (Throwable th2) {
            sentryAndroidOptions.getLogger().mo21406d(EnumC6069n1.WARNING, "Failed to read ANR thread dump", th2);
            c3796o = new C3796o(EnumC5916y.NO_DUMP);
        }
        EnumC5916y enumC5916y = EnumC5916y.NO_DUMP;
        EnumC5916y enumC5916y2 = (EnumC5916y) c3796o.f25478a;
        if (enumC5916y2 == enumC5916y) {
            sentryAndroidOptions.getLogger().mo21407k(EnumC6069n1.WARNING, "Not reporting ANR event as there was no thread dump for the ANR %s", applicationExitInfo.toString());
            return;
        }
        C5915x c5915x = new C5915x(sentryAndroidOptions.getFlushTimeoutMillis(), sentryAndroidOptions.getLogger(), timestamp, z, z2);
        C6193y c6193yM21743b = AbstractC6003a.m21743b(c5915x);
        C6039i1 c6039i1 = new C6039i1();
        if (enumC5916y2 == EnumC5916y.ERROR) {
            C6095k c6095k = new C6095k();
            c6095k.f34391a = "Sentry Android SDK failed to parse system thread dump for this ANR. We recommend enabling [SentryOptions.isAttachAnrThreadDump] option to attach the thread dump as plain text and report this issue on GitHub.";
            c6039i1.f34187q = c6095k;
        } else if (enumC5916y2 == EnumC5916y.DUMP) {
            c6039i1.f34189s = new C6052j0((ArrayList) c3796o.f25480c);
        }
        c6039i1.f34191u = EnumC6069n1.FATAL;
        c6039i1.f34186p = AbstractC6003a.m21753l(timestamp);
        if (sentryAndroidOptions.isAttachAnrThreadDump() && (bArr = (byte[]) c3796o.f25479b) != null) {
            c6193yM21743b.f34743e = new C5825a("thread-dump.txt", "text/plain", bArr);
        }
        if (C5760E.f33234a.mo21369F(c6039i1, c6193yM21743b).equals(C6104t.f34442b) || c5915x.mo21532d()) {
            return;
        }
        sentryAndroidOptions.getLogger().mo21407k(EnumC6069n1.WARNING, "Timed out waiting to flush ANR event to disk. Event: %s", c6039i1.f33416a);
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
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.core.RunnableC5914w.run():void");
    }

    public RunnableC5914w(JU1 ju1, CU1 cu1, long j) {
        this.f33860c = cu1;
        this.f33859b = j;
        this.f33861d = ju1;
    }

    public RunnableC5914w(Context context, SentryAndroidOptions sentryAndroidOptions, C6152d c6152d) {
        this.f33860c = context;
        this.f33861d = sentryAndroidOptions;
        c6152d.getClass();
        this.f33859b = System.currentTimeMillis() - AnrV2Integration.f33507d;
    }
}
