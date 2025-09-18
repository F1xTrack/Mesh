package defpackage;

import android.app.usage.UsageStatsManager;
import android.media.Image;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.impl.B2;
import io.appmetrica.analytics.impl.C4491d2;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes2.dex */
public final /* synthetic */ class B7 implements InterfaceC1905Ye1, InterfaceC0443Fl, FunctionWithThrowable, InterfaceC0701It, InterfaceC3677ex0, InterfaceC6021n9, InterfaceC4285i70, InterfaceC3680ey0, InterfaceC1571Tx0, InterfaceC1103Nx0, InterfaceC0940Lv, InterfaceC5441k61, InterfaceC5281jH, InterfaceC1651Uy, InterfaceC3599eX0, WC {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ B7(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final Object b(C0365El c0365El) {
        C7375uF c7375uF = (C7375uF) this.b;
        synchronized (c7375uF.a) {
            c7375uF.e = c0365El;
        }
        return "CameraRepository-deinit";
    }

    public C0374Eo a(Object obj) throws IOException {
        C0302Dq c0302Dq = (C0302Dq) obj;
        C0380Eq c0380Eq = (C0380Eq) this.b;
        URL url = c0302Dq.a;
        if (Log.isLoggable(AbstractC0837Km0.b("CctTransportBackend"), 4)) {
            String.format("Making request to: %s", url);
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) c0302Dq.a.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(c0380Eq.g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.3.0 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = c0302Dq.c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    C1304Qm0 c1304Qm0 = c0380Eq.a;
                    C8015xc c8015xc = c0302Dq.b;
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                    C6109nc0 c6109nc0 = (C6109nc0) c1304Qm0.b;
                    C0729Jc0 c0729Jc0 = new C0729Jc0(bufferedWriter, c6109nc0.a, c6109nc0.b, c6109nc0.c, c6109nc0.d);
                    c0729Jc0.g(c8015xc);
                    c0729Jc0.i();
                    c0729Jc0.b.flush();
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    Integer numValueOf = Integer.valueOf(responseCode);
                    if (Log.isLoggable(AbstractC0837Km0.b("CctTransportBackend"), 4)) {
                        String.format("Status Code: %d", numValueOf);
                    }
                    AbstractC0837Km0.a(httpURLConnection.getHeaderField("Content-Type"), "CctTransportBackend", "Content-Type: %s");
                    AbstractC0837Km0.a(httpURLConnection.getHeaderField("Content-Encoding"), "CctTransportBackend", "Content-Encoding: %s");
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new C0374Eo(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new C0374Eo(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                        try {
                            C0374Eo c0374Eo = new C0374Eo(responseCode, null, C1900Yd.a(new BufferedReader(new InputStreamReader(gZIPInputStream))).a);
                            if (gZIPInputStream != null) {
                                gZIPInputStream.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return c0374Eo;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } catch (ConnectException | UnknownHostException unused) {
            AbstractC0837Km0.b("CctTransportBackend");
            return new C0374Eo(500, null, 0L);
        } catch (IOException | C8163yO unused2) {
            AbstractC0837Km0.b("CctTransportBackend");
            return new C0374Eo(400, null, 0L);
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable, defpackage.InterfaceC6021n9
    public Object apply(Object obj) {
        return B2.a((C4491d2) this.b, (UsageStatsManager) obj);
    }

    @Override // defpackage.InterfaceC3599eX0
    public boolean f() {
        NB nb = (NB) this.b;
        O90.f(nb, "this$0");
        InterfaceC3599eX0 interfaceC3599eX0 = nb.v1;
        boolean zF = interfaceC3599eX0 != null ? interfaceC3599eX0.f() : false;
        C6553px c6553px = nb.x1;
        if (c6553px.a) {
            Iterator it = ((MB) c6553px.d).b.iterator();
            while (it.hasNext()) {
                ((InterfaceC0533Gp) it.next()).cancel();
            }
            c6553px.a = false;
        }
        return zF;
    }

    /* JADX WARN: Removed duplicated region for block: B:237:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x051e  */
    @Override // defpackage.InterfaceC0940Lv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object g(defpackage.C1241Pr0 r46) throws java.util.concurrent.ExecutionException, java.lang.InterruptedException, android.content.res.Resources.NotFoundException, android.content.pm.PackageManager.NameNotFoundException, java.util.concurrent.TimeoutException {
        /*
            Method dump skipped, instructions count: 1354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.B7.g(Pr0):java.lang.Object");
    }

    @Override // defpackage.InterfaceC5281jH
    public void h(InterfaceC3739fG0 interfaceC3739fG0) {
        C6978sA c6978sA = (C6978sA) this.b;
        c6978sA.getClass();
        c6978sA.b.set((InterfaceC6787rA) interfaceC3739fG0.get());
    }

    @Override // defpackage.InterfaceC0443Fl
    public Object h0(C0365El c0365El) {
        InterfaceFutureC0750Jj0 interfaceFutureC0750Jj0;
        switch (this.a) {
            case 1:
                C0644Ia c0644Ia = (C0644Ia) this.b;
                c0644Ia.a.execute(new RunnableC6769r4(c0644Ia, 8, c0365El));
                return "AudioSource-release";
            case 2:
            case 3:
            case 5:
            case 6:
            case 10:
            default:
                C8054xp c8054xp = (C8054xp) this.b;
                C7375uF c7375uF = c8054xp.a;
                synchronized (c7375uF.a) {
                    try {
                        if (((LinkedHashMap) c7375uF.b).isEmpty()) {
                            interfaceFutureC0750Jj0 = (C0599Hl) c7375uF.d;
                            if (interfaceFutureC0750Jj0 == null) {
                                interfaceFutureC0750Jj0 = F70.c;
                            }
                        } else {
                            C0599Hl c0599HlB = (C0599Hl) c7375uF.d;
                            if (c0599HlB == null) {
                                c0599HlB = AbstractC8171yQ1.b(new B7(12, c7375uF));
                                c7375uF.d = c0599HlB;
                            }
                            ((HashSet) c7375uF.c).addAll(((LinkedHashMap) c7375uF.b).values());
                            for (InterfaceC7480uo interfaceC7480uo : ((LinkedHashMap) c7375uF.b).values()) {
                                interfaceC7480uo.release().d(new RunnableC6769r4(c7375uF, 22, interfaceC7480uo), QR1.a());
                            }
                            ((LinkedHashMap) c7375uF.b).clear();
                            interfaceFutureC0750Jj0 = c0599HlB;
                        }
                    } finally {
                    }
                }
                interfaceFutureC0750Jj0.d(new RunnableC6769r4(c8054xp, 23, c0365El), c8054xp.d);
                return "CameraX shutdownInternal";
            case 4:
                C6329om c6329om = (C6329om) this.b;
                c6329om.getClass();
                c6329om.b.execute(new RunnableC6769r4(c6329om, 15, c0365El));
                return "updateSessionConfigAsync";
            case 7:
                C0758Jm c0758Jm = (C0758Jm) this.b;
                c0758Jm.a.g.f(c0365El);
                c0758Jm.b.b = true;
                return "AePreCapture";
            case 8:
                ((C0914Lm) this.b).b.i.c();
                c0365El.b(null);
                return "invokePostCaptureFuture";
            case 9:
                ((C2005Zm) this.b).b(new C1225Pm(0, c0365El));
                return "submitStillCapture";
            case 11:
                ((C1537Tm) this.b).a = c0365El;
                return "waitFor3AResult";
            case 12:
                return b(c0365El);
        }
    }

    @Override // defpackage.InterfaceC1905Ye1
    public void i(C8260yu0 c8260yu0) {
        ((C5257j9) this.b).invoke();
    }

    @Override // defpackage.InterfaceC0701It
    public C22 j(C6721qp0 c6721qp0) {
        C3513e41 c3513e41 = (C3513e41) this.b;
        String string = UUID.randomUUID().toString();
        QQ0 qq0 = new QQ0(c3513e41);
        int i = ((C1375Rk) c3513e41.b).e;
        int i2 = 0;
        if (i != 0) {
            if (i != 1) {
                AbstractC6864rZ1.c("CMCDConfig", "Unsupported mode: " + i + ", fallback on MODE_REQUEST_HEADER");
            } else {
                i2 = 1;
            }
        }
        return new C22(string, c6721qp0.a, qq0, i2);
    }

    @Override // defpackage.InterfaceC4285i70
    public void k(InterfaceC5252j70 interfaceC5252j70) {
        Image imageZ;
        C2399bq c2399bq = (C2399bq) this.b;
        synchronized (c2399bq.a) {
            try {
                if (c2399bq.d) {
                    return;
                }
                InterfaceC3903g70 interfaceC3903g70N = interfaceC5252j70.n();
                if (interfaceC3903g70N != null && (imageZ = interfaceC3903g70N.Z()) != null) {
                    if (c2399bq.g) {
                        long j = c2399bq.h;
                        if (j != -1) {
                            imageZ.setTimestamp(j);
                        }
                    }
                    c2399bq.b.queueInputImage(imageZ);
                }
            } finally {
            }
        }
    }

    @Override // defpackage.InterfaceC1103Nx0
    public void onComplete(Task task) {
        C8197yZ0 c8197yZ0 = (C8197yZ0) this.b;
        O90.f(task, "it");
        c8197yZ0.close();
    }

    @Override // defpackage.InterfaceC1571Tx0
    public void onFailure(Exception exc) {
        XY xy = (XY) this.b;
        O90.f(xy, "this$0");
        O90.f(exc, "error");
        ((C4034gp) xy.b).a(exc);
    }

    @Override // defpackage.InterfaceC3680ey0
    public void onSuccess(Object obj) throws InterruptedException {
        ((C3690f1) this.b).invoke(obj);
    }

    @Override // defpackage.InterfaceC3677ex0
    public void r0(Object obj) throws InterruptedException {
        switch (this.a) {
            case 6:
                ((C0290Dm) this.b).j(obj);
                break;
            case 13:
                ((C3690f1) this.b).invoke(obj);
                break;
            default:
                ((C3690f1) this.b).invoke(obj);
                break;
        }
    }

    @Override // defpackage.WC
    public ZC s0() {
        Z8 z8 = (Z8) this.b;
        O90.f(z8, "$rawResourceDataSource");
        return z8;
    }

    @Override // defpackage.InterfaceC1651Uy
    public Object then(Task task) {
        switch (this.a) {
            case 26:
                return (Task) ((CallableC5451kA) this.b).call();
            default:
                ((Runnable) this.b).run();
                return AbstractC3782fU1.e(null);
        }
    }

    public /* synthetic */ B7(C1303Qm c1303Qm, C2005Zm c2005Zm) {
        this.a = 9;
        this.b = c2005Zm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable, defpackage.InterfaceC6021n9
    public InterfaceFutureC0750Jj0 apply(Object obj) {
        C1303Qm c1303Qm = (C1303Qm) this.b;
        c1303Qm.getClass();
        if (!Boolean.TRUE.equals((Boolean) obj)) {
            return F70.c;
        }
        long j = c1303Qm.g;
        C4403il c4403il = new C4403il(6);
        long millis = TimeUnit.NANOSECONDS.toMillis(j);
        C1537Tm c1537Tm = new C1537Tm(c4403il);
        C6329om c6329om = c1303Qm.d;
        c6329om.a(c1537Tm);
        RunnableC6769r4 runnableC6769r4 = new RunnableC6769r4(c6329om, 21, c1537Tm);
        C0599Hl c0599Hl = c1537Tm.b;
        c0599Hl.b.d(runnableC6769r4, c6329om.b);
        return AbstractC8171yQ1.b(new C0086Aw(c0599Hl, c1303Qm.c, millis, 2));
    }

    @Override // defpackage.InterfaceC5441k61
    public Task then(Object obj) {
        return AbstractC3782fU1.e((C0242Cw) this.b);
    }
}
