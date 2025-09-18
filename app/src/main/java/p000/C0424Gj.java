package p000;

import android.animation.Animator;
import android.content.Intent;
import android.net.Uri;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import androidx.fragment.app.C1740v;
import com.facebook.react.bridge.ReactContext;
import com.google.android.gms.tasks.Task;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: Gj */
/* loaded from: classes.dex */
public final /* synthetic */ class C0424Gj implements InterfaceC6471n9, InterfaceC0363Fl, InterfaceC6711qw, InterfaceC0750Lv, InterfaceC9968k61, InterfaceC1319Uy, InterfaceC8216Rj0, InterfaceC8268Sj0, InterfaceC1601ZR, InterfaceC0682Kp, Y61, InterfaceC1464XG, InterfaceC8036Nx0 {

    /* renamed from: a */
    public final /* synthetic */ int f3859a;

    /* renamed from: b */
    public final /* synthetic */ Object f3860b;

    /* renamed from: c */
    public final /* synthetic */ Object f3861c;

    public /* synthetic */ C0424Gj(C1514Y3 c1514y3, Object obj, long j) {
        this.f3859a = 21;
        this.f3860b = c1514y3;
        this.f3861c = obj;
    }

    /* renamed from: d */
    private final Object m3132d(Task task) {
        C0248Dw c0248Dw = (C0248Dw) this.f3860b;
        Date date = (Date) this.f3861c;
        c0248Dw.getClass();
        if (task.mo11144k()) {
            C0877Nw c0877Nw = c0248Dw.f2320h;
            synchronized (c0877Nw.f8137b) {
                c0877Nw.f8136a.edit().putInt("last_fetch_status", -1).putLong("last_fetch_time_in_millis", date.getTime()).apply();
            }
        } else {
            Exception excMo11141h = task.mo11141h();
            if (excMo11141h != null) {
                if (excMo11141h instanceof C6827sV) {
                    c0248Dw.f2320h.m5914h();
                } else {
                    c0248Dw.f2320h.m5913g();
                }
            }
        }
        return task;
    }

    @Override // p000.InterfaceC1601ZR
    /* renamed from: a */
    public InterfaceC1412WR[] mo3133a(Uri uri, Map map) {
        C6415mG c6415mG = (C6415mG) this.f3860b;
        C7408Bv0 c7408Bv0 = c6415mG.f37602c;
        C6686qX c6686qX = (C6686qX) this.f3861c;
        return new InterfaceC1412WR[]{c7408Bv0.mo911b(c6686qX) ? new Z51(c6415mG.f37602c.mo916f(c6686qX), c6686qX) : new C6352lG(c6686qX)};
    }

    @Override // p000.InterfaceC6471n9
    public InterfaceFutureC7800Jj0 apply(Object obj) {
        switch (this.f3859a) {
            case 1:
                C4141gq c4141gq = (C4141gq) this.f3860b;
                c4141gq.close();
                ((G70) this.f3861c).mo6573a();
                return c4141gq.release();
            default:
                C1433Wm c1433Wm = (C1433Wm) this.f3860b;
                c1433Wm.getClass();
                return AbstractC11797yQ1.m26149b(new C0059Aw((C0489Hl) this.f3861c, c1433Wm.f13397c, TimeUnit.SECONDS.toMillis(3L), 2));
        }
    }

    @Override // p000.Y61
    /* renamed from: b */
    public void mo3134b(C0922Oe c0922Oe) {
        C0584JG c0584jg = (C0584JG) this.f3860b;
        c0584jg.getClass();
        EnumC8666a00 enumC8666a00 = EnumC8666a00.f15276b;
        if (((Z61) this.f3861c).f14739c.m1146a() && c0922Oe.f8550d) {
            enumC8666a00 = EnumC8666a00.f15277c;
        }
        C10715py0 c10715py0 = c0584jg.f5430a;
        AbstractC9055d00.m17455d((AtomicBoolean) c10715py0.f40464d, true);
        AbstractC9055d00.m17454c((Thread) c10715py0.f40466f);
        if (((EnumC8666a00) c10715py0.f40474n) != enumC8666a00) {
            c10715py0.f40474n = enumC8666a00;
            c10715py0.m23917m(c10715py0.f40463c);
        }
    }

    @Override // p000.InterfaceC6711qw
    /* renamed from: c */
    public void mo3135c(C0480Hc c0480Hc) {
        C1869cn c1869cn = (C1869cn) this.f3860b;
        InterfaceC6854sw interfaceC6854sw = (InterfaceC6854sw) this.f3861c;
        c1869cn.f17745b.m2814d(c0480Hc, interfaceC6854sw.mo4791d0(c0480Hc), interfaceC6854sw.mo4794w(c0480Hc));
    }

    @Override // p000.InterfaceC0682Kp
    /* renamed from: e */
    public void mo3136e() throws SecurityException, IllegalArgumentException {
        switch (this.f3859a) {
            case 23:
                C1740v c1740v = (C1740v) this.f3861c;
                O90.m5968f(c1740v, "$operation");
                ((Animator) this.f3860b).end();
                if (Log.isLoggable("FragmentManager", 2)) {
                    c1740v.toString();
                    break;
                }
                break;
            default:
                ((AbstractC7579Fc1) this.f3860b).mo2696e();
                ((RunnableC3973eA) this.f3861c).run();
                break;
        }
    }

    @Override // p000.InterfaceC8268Sj0
    /* renamed from: f */
    public void mo3137f(Object obj, C1353VV c1353vv) {
        ((InterfaceC1577Z3) obj).mo2220E((IB0) this.f3861c, new C4238iN(c1353vv, ((C7251zE) this.f3860b).f46735e));
    }

    @Override // p000.InterfaceC0750Lv
    /* renamed from: g */
    public Object mo390g(C8128Pr0 c8128Pr0) {
        String str = (String) this.f3860b;
        C6853sv c6853sv = (C6853sv) this.f3861c;
        try {
            Trace.beginSection(str);
            return c6853sv.f42724f.mo390g(c8128Pr0);
        } finally {
            Trace.endSection();
        }
    }

    @Override // p000.InterfaceC0363Fl
    /* renamed from: h0 */
    public Object mo411h0(C0300El c0300El) {
        switch (this.f3859a) {
            case 2:
                C1433Wm c1433Wm = (C1433Wm) this.f3860b;
                c1433Wm.getClass();
                QR1.m6710h().execute(new RunnableC8339Ts1(c1433Wm, (AtomicReference) this.f3861c, c0300El, 9));
                return "OnScreenFlashStart";
            case 4:
                C7162xp c7162xp = (C7162xp) this.f3860b;
                c7162xp.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                ReactContext reactContext = (ReactContext) this.f3861c;
                Executor executor = c7162xp.f45805d;
                executor.execute(new RunnableC7099wp(c7162xp, reactContext, executor, 1, c0300El, jElapsedRealtime));
                return "CameraX initInternal";
            case 11:
                C6353lH c6353lH = (C6353lH) this.f3860b;
                c6353lH.m10798D(true, new C0839NK(1, new C4027f1(c0300El, 6, c6353lH)));
                return this.f3861c;
            default:
                C0411GW c0411gw = (C0411GW) this.f3860b;
                c0411gw.getClass();
                c0411gw.f3775b.execute(new RunnableC8339Ts1(c0411gw, c0300El, (C0974PT) this.f3861c, 25));
                return "startFocusAndMetering";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0084  */
    @Override // p000.InterfaceC1464XG
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p000.C9367fQ0 mo2075i(int r17, p000.C8149Qb1 r18, int[] r19) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0424Gj.mo2075i(int, Qb1, int[]):fQ0");
    }

    @Override // p000.InterfaceC8216Rj0
    public void invoke(Object obj) {
        InterfaceC1577Z3 interfaceC1577Z3 = (InterfaceC1577Z3) obj;
        switch (this.f3859a) {
            case 12:
                interfaceC1577Z3.mo2244f((C1514Y3) this.f3860b, (CB0) this.f3861c);
                break;
            case 13:
            default:
                interfaceC1577Z3.mo2249k((C1514Y3) this.f3860b, this.f3861c);
                break;
            case 14:
                interfaceC1577Z3.mo2256r((C1514Y3) this.f3860b, (C1017Q9) this.f3861c);
                break;
            case 15:
                interfaceC1577Z3.mo2246h((C1514Y3) this.f3860b, (C7660Gr0) this.f3861c);
                break;
            case 16:
                interfaceC1577Z3.mo2251m((C1514Y3) this.f3860b, (C0531IQ) this.f3861c);
                break;
            case 17:
                interfaceC1577Z3.mo2230O((C1514Y3) this.f3860b, (C9264ec1) this.f3861c);
                break;
            case 18:
                interfaceC1577Z3.mo2223H((C1514Y3) this.f3860b, (C1398WD) this.f3861c);
                break;
            case 19:
                interfaceC1577Z3.mo2231P((C1514Y3) this.f3860b, (Exception) this.f3861c);
                break;
            case 20:
                C1514Y3 c1514y3 = (C1514Y3) this.f3860b;
                C8321Tj1 c8321Tj1 = (C8321Tj1) this.f3861c;
                interfaceC1577Z3.mo2259u(c1514y3, c8321Tj1);
                int i = c8321Tj1.f11487a;
                break;
        }
    }

    @Override // p000.InterfaceC8036Nx0
    public void onComplete(Task task) {
        ((AbstractServiceC0655KO) this.f3860b).m4622a((Intent) this.f3861c);
    }

    @Override // p000.InterfaceC9968k61
    public Task then(Object obj) {
        C7169xw c7169xw = (C7169xw) this.f3860b;
        C7232yw c7232yw = (C7232yw) this.f3861c;
        synchronized (c7169xw) {
            c7169xw.f45908c = AbstractC9376fU1.m18244e(c7232yw);
        }
        return AbstractC9376fU1.m18244e(c7232yw);
    }

    public /* synthetic */ C0424Gj(Object obj, int i, Object obj2) {
        this.f3859a = i;
        this.f3860b = obj;
        this.f3861c = obj2;
    }

    @Override // p000.InterfaceC1319Uy
    public Object then(Task task) throws Throwable {
        Integer numValueOf;
        Throwable th;
        HttpURLConnection httpURLConnection;
        C7016vV c7016vV;
        int responseCode;
        boolean zM4075d;
        switch (this.f3859a) {
            case 8:
                return ((C0248Dw) this.f3860b).m1949c(task, 0L, (HashMap) this.f3861c);
            case 9:
                m3132d(task);
                return task;
            default:
                C0563Iw c0563Iw = (C0563Iw) this.f3860b;
                C9450g32 c9450g32 = (C9450g32) this.f3861c;
                c0563Iw.getClass();
                try {
                } catch (IOException unused) {
                    httpURLConnection = null;
                    numValueOf = null;
                } catch (Throwable th2) {
                    numValueOf = null;
                    th = th2;
                    httpURLConnection = null;
                }
                if (c9450g32.mo11144k()) {
                    c0563Iw.m4082i(true);
                    httpURLConnection = (HttpURLConnection) c9450g32.mo11142i();
                    try {
                        responseCode = httpURLConnection.getResponseCode();
                        numValueOf = Integer.valueOf(responseCode);
                        if (responseCode == 200) {
                            try {
                                synchronized (c0563Iw) {
                                    c0563Iw.f5212c = 8;
                                }
                                c0563Iw.f5224o.m5912f(0, C0877Nw.f8135g);
                                c0563Iw.m4084k(httpURLConnection).m22223c();
                            } catch (IOException unused2) {
                                C0563Iw.m4074b(httpURLConnection);
                                c0563Iw.m4082i(false);
                                boolean z = numValueOf == null || C0563Iw.m4075d(numValueOf.intValue());
                                if (z) {
                                    c0563Iw.m4085l(new Date(c0563Iw.f5223n.currentTimeMillis()));
                                }
                                if (!z && numValueOf.intValue() != 200) {
                                    String strM4076f = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", numValueOf);
                                    if (numValueOf.intValue() == 403) {
                                        strM4076f = C0563Iw.m4076f(httpURLConnection.getErrorStream());
                                    }
                                    c7016vV = new C7016vV(numValueOf.intValue(), strM4076f, 0);
                                    c0563Iw.m4080g(c7016vV);
                                    return AbstractC9376fU1.m18244e(null);
                                }
                                c0563Iw.m4081h();
                                return AbstractC9376fU1.m18244e(null);
                            } catch (Throwable th3) {
                                th = th3;
                                C0563Iw.m4074b(httpURLConnection);
                                c0563Iw.m4082i(false);
                                boolean z2 = numValueOf == null || C0563Iw.m4075d(numValueOf.intValue());
                                if (z2) {
                                    c0563Iw.m4085l(new Date(c0563Iw.f5223n.currentTimeMillis()));
                                }
                                if (!z2 && numValueOf.intValue() != 200) {
                                    String strM4076f2 = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", numValueOf);
                                    if (numValueOf.intValue() == 403) {
                                        strM4076f2 = C0563Iw.m4076f(httpURLConnection.getErrorStream());
                                    }
                                    c0563Iw.m4080g(new C7016vV(numValueOf.intValue(), strM4076f2, 0));
                                } else {
                                    c0563Iw.m4081h();
                                }
                                throw th;
                            }
                        }
                        C0563Iw.m4074b(httpURLConnection);
                        c0563Iw.m4082i(false);
                        zM4075d = C0563Iw.m4075d(responseCode);
                        if (zM4075d) {
                            c0563Iw.m4085l(new Date(c0563Iw.f5223n.currentTimeMillis()));
                        }
                    } catch (IOException unused3) {
                        numValueOf = null;
                    } catch (Throwable th4) {
                        numValueOf = null;
                        th = th4;
                    }
                    if (!zM4075d && responseCode != 200) {
                        String strM4076f3 = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", numValueOf);
                        if (responseCode == 403) {
                            strM4076f3 = C0563Iw.m4076f(httpURLConnection.getErrorStream());
                        }
                        c7016vV = new C7016vV(responseCode, strM4076f3, 0);
                        c0563Iw.m4080g(c7016vV);
                        return AbstractC9376fU1.m18244e(null);
                    }
                    c0563Iw.m4081h();
                    return AbstractC9376fU1.m18244e(null);
                }
                throw new IOException(c9450g32.mo11141h());
        }
    }
}
