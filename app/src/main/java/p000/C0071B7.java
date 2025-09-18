package p000;

import android.app.usage.UsageStatsManager;
import android.media.Image;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.impl.C4384B2;
import io.appmetrica.analytics.impl.C5061d2;
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

/* renamed from: B7 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0071B7 implements InterfaceC8571Ye1, InterfaceC0363Fl, FunctionWithThrowable, InterfaceC0560It, InterfaceC9305ex0, InterfaceC6471n9, InterfaceC9713i70, InterfaceC9307ey0, InterfaceC8348Tx0, InterfaceC8036Nx0, InterfaceC0750Lv, InterfaceC9968k61, InterfaceC6227jH, InterfaceC1319Uy, InterfaceC9253eX0, InterfaceC1397WC {

    /* renamed from: a */
    public final /* synthetic */ int f578a;

    /* renamed from: b */
    public final /* synthetic */ Object f579b;

    public /* synthetic */ C0071B7(int i, Object obj) {
        this.f578a = i;
        this.f579b = obj;
    }

    /* renamed from: b */
    private final Object m499b(C0300El c0300El) {
        C6937uF c6937uF = (C6937uF) this.f579b;
        synchronized (c6937uF.f43616a) {
            c6937uF.f43620e = c0300El;
        }
        return "CameraRepository-deinit";
    }

    /* renamed from: a */
    public C0303Eo m500a(Object obj) throws IOException {
        C0242Dq c0242Dq = (C0242Dq) obj;
        C0305Eq c0305Eq = (C0305Eq) this.f579b;
        URL url = c0242Dq.f2265a;
        if (Log.isLoggable(AbstractC7858Km0.m4712b("CctTransportBackend"), 4)) {
            String.format("Making request to: %s", url);
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) c0242Dq.f2265a.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(c0305Eq.f2922g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.3.0 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = c0242Dq.f2267c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    C8170Qm0 c8170Qm0 = c0305Eq.f2916a;
                    C7149xc c7149xc = c0242Dq.f2266b;
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                    C10415nc0 c10415nc0 = (C10415nc0) c8170Qm0.f9780b;
                    C7786Jc0 c7786Jc0 = new C7786Jc0(bufferedWriter, c10415nc0.f38406a, c10415nc0.f38407b, c10415nc0.f38408c, c10415nc0.f38409d);
                    c7786Jc0.m4365g(c7149xc);
                    c7786Jc0.m4367i();
                    c7786Jc0.f5639b.flush();
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    Integer numValueOf = Integer.valueOf(responseCode);
                    if (Log.isLoggable(AbstractC7858Km0.m4712b("CctTransportBackend"), 4)) {
                        String.format("Status Code: %d", numValueOf);
                    }
                    AbstractC7858Km0.m4711a(httpURLConnection.getHeaderField("Content-Type"), "CctTransportBackend", "Content-Type: %s");
                    AbstractC7858Km0.m4711a(httpURLConnection.getHeaderField("Content-Encoding"), "CctTransportBackend", "Content-Encoding: %s");
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new C0303Eo(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new C0303Eo(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                        try {
                            C0303Eo c0303Eo = new C0303Eo(responseCode, null, C1550Yd.m9324a(new BufferedReader(new InputStreamReader(gZIPInputStream))).f14395a);
                            if (gZIPInputStream != null) {
                                gZIPInputStream.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return c0303Eo;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } catch (ConnectException | UnknownHostException unused) {
            AbstractC7858Km0.m4712b("CctTransportBackend");
            return new C0303Eo(500, null, 0L);
        } catch (IOException | C7198yO unused2) {
            AbstractC7858Km0.m4712b("CctTransportBackend");
            return new C0303Eo(400, null, 0L);
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable, p000.InterfaceC6471n9
    public Object apply(Object obj) {
        return C4384B2.m19220a((C5061d2) this.f579b, (UsageStatsManager) obj);
    }

    @Override // p000.InterfaceC9253eX0
    /* renamed from: f */
    public boolean mo501f() {
        C0830NB c0830nb = (C0830NB) this.f579b;
        O90.m5968f(c0830nb, "this$0");
        InterfaceC9253eX0 interfaceC9253eX0 = c0830nb.f7535v1;
        boolean zMo501f = interfaceC9253eX0 != null ? interfaceC9253eX0.mo501f() : false;
        C6649px c6649px = c0830nb.f7537x1;
        if (c6649px.f40445a) {
            Iterator it = ((C0767MB) c6649px.f40448d).f7027b.iterator();
            while (it.hasNext()) {
                ((InterfaceC0430Gp) it.next()).cancel();
            }
            c6649px.f40445a = false;
        }
        return zMo501f;
    }

    /* JADX WARN: Removed duplicated region for block: B:237:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x051e  */
    @Override // p000.InterfaceC0750Lv
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object mo390g(p000.C8128Pr0 r46) throws java.util.concurrent.ExecutionException, java.lang.InterruptedException, android.content.res.Resources.NotFoundException, android.content.pm.PackageManager.NameNotFoundException, java.util.concurrent.TimeoutException {
        /*
            Method dump skipped, instructions count: 1354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0071B7.mo390g(Pr0):java.lang.Object");
    }

    @Override // p000.InterfaceC6227jH
    /* renamed from: h */
    public void mo410h(InterfaceC9347fG0 interfaceC9347fG0) {
        C6806sA c6806sA = (C6806sA) this.f579b;
        c6806sA.getClass();
        c6806sA.f42283b.set((InterfaceC6726rA) interfaceC9347fG0.get());
    }

    @Override // p000.InterfaceC0363Fl
    /* renamed from: h0 */
    public Object mo411h0(C0300El c0300El) {
        InterfaceFutureC7800Jj0 interfaceFutureC7800Jj0;
        switch (this.f578a) {
            case 1:
                C0541Ia c0541Ia = (C0541Ia) this.f579b;
                c0541Ia.f4993a.execute(new RunnableC6720r4(c0541Ia, 8, c0300El));
                return "AudioSource-release";
            case 2:
            case 3:
            case 5:
            case 6:
            case 10:
            default:
                C7162xp c7162xp = (C7162xp) this.f579b;
                C6937uF c6937uF = c7162xp.f45802a;
                synchronized (c6937uF.f43616a) {
                    try {
                        if (((LinkedHashMap) c6937uF.f43617b).isEmpty()) {
                            interfaceFutureC7800Jj0 = (C0489Hl) c6937uF.f43619d;
                            if (interfaceFutureC7800Jj0 == null) {
                                interfaceFutureC7800Jj0 = F70.f3069c;
                            }
                        } else {
                            C0489Hl c0489HlM26149b = (C0489Hl) c6937uF.f43619d;
                            if (c0489HlM26149b == null) {
                                c0489HlM26149b = AbstractC11797yQ1.m26149b(new C0071B7(12, c6937uF));
                                c6937uF.f43619d = c0489HlM26149b;
                            }
                            ((HashSet) c6937uF.f43618c).addAll(((LinkedHashMap) c6937uF.f43617b).values());
                            for (InterfaceC6972uo interfaceC6972uo : ((LinkedHashMap) c6937uF.f43617b).values()) {
                                interfaceC6972uo.release().mo2494d(new RunnableC6720r4(c6937uF, 22, interfaceC6972uo), QR1.m6703a());
                            }
                            ((LinkedHashMap) c6937uF.f43617b).clear();
                            interfaceFutureC7800Jj0 = c0489HlM26149b;
                        }
                    } finally {
                    }
                }
                interfaceFutureC7800Jj0.mo2494d(new RunnableC6720r4(c7162xp, 23, c0300El), c7162xp.f45805d);
                return "CameraX shutdownInternal";
            case 4:
                C6573om c6573om = (C6573om) this.f579b;
                c6573om.getClass();
                c6573om.f39230b.execute(new RunnableC6720r4(c6573om, 15, c0300El));
                return "updateSessionConfigAsync";
            case 7:
                C0616Jm c0616Jm = (C0616Jm) this.f579b;
                c0616Jm.f5683a.f39235g.m3080f(c0300El);
                c0616Jm.f5684b.f7895b = true;
                return "AePreCapture";
            case 8:
                ((C0741Lm) this.f579b).f6848b.f9777i.mo4406c();
                c0300El.m2375b(null);
                return "invokePostCaptureFuture";
            case 9:
                ((C1622Zm) this.f579b).m9589b(new C0993Pm(0, c0300El));
                return "submitStillCapture";
            case 11:
                ((C1244Tm) this.f579b).f11502a = c0300El;
                return "waitFor3AResult";
            case 12:
                return m499b(c0300El);
        }
    }

    @Override // p000.InterfaceC8571Ye1
    /* renamed from: i */
    public void mo502i(C11856yu0 c11856yu0) {
        ((C6219j9) this.f579b).invoke();
    }

    @Override // p000.InterfaceC0560It
    /* renamed from: j */
    public C22 mo503j(C10825qp0 c10825qp0) {
        C9196e41 c9196e41 = (C9196e41) this.f579b;
        String string = UUID.randomUUID().toString();
        QQ0 qq0 = new QQ0(c9196e41);
        int i = ((C1116Rk) c9196e41.f26532b).f10407e;
        int i2 = 0;
        if (i != 0) {
            if (i != 1) {
                AbstractC10922rZ1.m24429c("CMCDConfig", "Unsupported mode: " + i + ", fallback on MODE_REQUEST_HEADER");
            } else {
                i2 = 1;
            }
        }
        return new C22(string, c10825qp0.f41185a, qq0, i2);
    }

    @Override // p000.InterfaceC9713i70
    /* renamed from: k */
    public void mo504k(InterfaceC9841j70 interfaceC9841j70) {
        Image imageMo18404Z;
        C1810bq c1810bq = (C1810bq) this.f579b;
        synchronized (c1810bq.f17174a) {
            try {
                if (c1810bq.f17177d) {
                    return;
                }
                InterfaceC9457g70 interfaceC9457g70Mo4049n = interfaceC9841j70.mo4049n();
                if (interfaceC9457g70Mo4049n != null && (imageMo18404Z = interfaceC9457g70Mo4049n.mo18404Z()) != null) {
                    if (c1810bq.f17180g) {
                        long j = c1810bq.f17181h;
                        if (j != -1) {
                            imageMo18404Z.setTimestamp(j);
                        }
                    }
                    c1810bq.f17175b.queueInputImage(imageMo18404Z);
                }
            } finally {
            }
        }
    }

    @Override // p000.InterfaceC8036Nx0
    public void onComplete(Task task) {
        C11814yZ0 c11814yZ0 = (C11814yZ0) this.f579b;
        O90.m5968f(task, "it");
        c11814yZ0.close();
    }

    @Override // p000.InterfaceC8348Tx0
    public void onFailure(Exception exc) {
        C1482XY c1482xy = (C1482XY) this.f579b;
        O90.m5968f(c1482xy, "this$0");
        O90.m5968f(exc, "error");
        ((C4140gp) c1482xy.f13844b).m18648a(exc);
    }

    @Override // p000.InterfaceC9307ey0
    public void onSuccess(Object obj) throws InterruptedException {
        ((C4027f1) this.f579b).invoke(obj);
    }

    @Override // p000.InterfaceC9305ex0
    /* renamed from: r0 */
    public void mo505r0(Object obj) throws InterruptedException {
        switch (this.f578a) {
            case 6:
                ((C0238Dm) this.f579b).mo2439j(obj);
                break;
            case 13:
                ((C4027f1) this.f579b).invoke(obj);
                break;
            default:
                ((C4027f1) this.f579b).invoke(obj);
                break;
        }
    }

    @Override // p000.InterfaceC1397WC
    /* renamed from: s0 */
    public InterfaceC1586ZC mo506s0() {
        C1582Z8 c1582z8 = (C1582Z8) this.f579b;
        O90.m5968f(c1582z8, "$rawResourceDataSource");
        return c1582z8;
    }

    @Override // p000.InterfaceC1319Uy
    public Object then(Task task) {
        switch (this.f578a) {
            case 26:
                return (Task) ((CallableC6283kA) this.f579b).call();
            default:
                ((Runnable) this.f579b).run();
                return AbstractC9376fU1.m18244e(null);
        }
    }

    public /* synthetic */ C0071B7(C1056Qm c1056Qm, C1622Zm c1622Zm) {
        this.f578a = 9;
        this.f579b = c1622Zm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable, p000.InterfaceC6471n9
    public InterfaceFutureC7800Jj0 apply(Object obj) {
        C1056Qm c1056Qm = (C1056Qm) this.f579b;
        c1056Qm.getClass();
        if (!Boolean.TRUE.equals((Boolean) obj)) {
            return F70.f3069c;
        }
        long j = c1056Qm.f9775g;
        C4262il c4262il = new C4262il(6);
        long millis = TimeUnit.NANOSECONDS.toMillis(j);
        C1244Tm c1244Tm = new C1244Tm(c4262il);
        C6573om c6573om = c1056Qm.f9772d;
        c6573om.m23543a(c1244Tm);
        RunnableC6720r4 runnableC6720r4 = new RunnableC6720r4(c6573om, 21, c1244Tm);
        C0489Hl c0489Hl = c1244Tm.f11503b;
        c0489Hl.f4484b.mo2494d(runnableC6720r4, c6573om.f39230b);
        return AbstractC11797yQ1.m26149b(new C0059Aw(c0489Hl, c1056Qm.f9771c, millis, 2));
    }

    @Override // p000.InterfaceC9968k61
    public Task then(Object obj) {
        return AbstractC9376fU1.m18244e((C0185Cw) this.f579b);
    }
}
