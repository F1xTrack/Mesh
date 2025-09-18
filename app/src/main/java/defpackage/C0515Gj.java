package defpackage;

import android.animation.Animator;
import android.content.Intent;
import android.net.Uri;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import androidx.fragment.app.v;
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
public final /* synthetic */ class C0515Gj implements InterfaceC6021n9, InterfaceC0443Fl, InterfaceC6741qw, InterfaceC0940Lv, InterfaceC5441k61, InterfaceC1651Uy, InterfaceC1373Rj0, InterfaceC1451Sj0, ZR, InterfaceC0845Kp, Y61, XG, InterfaceC1103Nx0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ C0515Gj(Y3 y3, Object obj, long j) {
        this.a = 21;
        this.b = y3;
        this.c = obj;
    }

    private final Object d(Task task) {
        C0320Dw c0320Dw = (C0320Dw) this.b;
        Date date = (Date) this.c;
        c0320Dw.getClass();
        if (task.k()) {
            C1099Nw c1099Nw = c0320Dw.h;
            synchronized (c1099Nw.b) {
                c1099Nw.a.edit().putInt("last_fetch_status", -1).putLong("last_fetch_time_in_millis", date.getTime()).apply();
            }
        } else {
            Exception excH = task.h();
            if (excH != null) {
                if (excH instanceof C7041sV) {
                    c0320Dw.h.h();
                } else {
                    c0320Dw.h.g();
                }
            }
        }
        return task;
    }

    @Override // defpackage.ZR
    public WR[] a(Uri uri, Map map) {
        C5851mG c5851mG = (C5851mG) this.b;
        C0162Bv0 c0162Bv0 = c5851mG.c;
        C6666qX c6666qX = (C6666qX) this.c;
        return new WR[]{c0162Bv0.b(c6666qX) ? new Z51(c5851mG.c.f(c6666qX), c6666qX) : new C5660lG(c6666qX)};
    }

    @Override // defpackage.InterfaceC6021n9
    public InterfaceFutureC0750Jj0 apply(Object obj) {
        switch (this.a) {
            case 1:
                C4037gq c4037gq = (C4037gq) this.b;
                c4037gq.close();
                ((G70) this.c).a();
                return c4037gq.release();
            default:
                C1771Wm c1771Wm = (C1771Wm) this.b;
                c1771Wm.getClass();
                return AbstractC8171yQ1.b(new C0086Aw((C0599Hl) this.c, c1771Wm.c, TimeUnit.SECONDS.toMillis(3L), 2));
        }
    }

    @Override // defpackage.Y61
    public void b(C1123Oe c1123Oe) {
        JG jg = (JG) this.b;
        jg.getClass();
        EnumC2049a00 enumC2049a00 = EnumC2049a00.b;
        if (((Z61) this.c).c.a() && c1123Oe.d) {
            enumC2049a00 = EnumC2049a00.c;
        }
        C6557py0 c6557py0 = jg.a;
        AbstractC3306d00.d((AtomicBoolean) c6557py0.d, true);
        AbstractC3306d00.c((Thread) c6557py0.f);
        if (((EnumC2049a00) c6557py0.n) != enumC2049a00) {
            c6557py0.n = enumC2049a00;
            c6557py0.m(c6557py0.c);
        }
    }

    @Override // defpackage.InterfaceC6741qw
    public void c(C0572Hc c0572Hc) {
        C2580cn c2580cn = (C2580cn) this.b;
        InterfaceC7122sw interfaceC7122sw = (InterfaceC7122sw) this.c;
        c2580cn.b.d(c0572Hc, interfaceC7122sw.d0(c0572Hc), interfaceC7122sw.w(c0572Hc));
    }

    @Override // defpackage.InterfaceC0845Kp
    public void e() throws SecurityException, IllegalArgumentException {
        switch (this.a) {
            case 23:
                v vVar = (v) this.c;
                O90.f(vVar, "$operation");
                ((Animator) this.b).end();
                if (Log.isLoggable("FragmentManager", 2)) {
                    vVar.toString();
                    break;
                }
                break;
            default:
                ((AbstractC0418Fc1) this.b).e();
                ((RunnableC3529eA) this.c).run();
                break;
        }
    }

    @Override // defpackage.InterfaceC1451Sj0
    public void f(Object obj, VV vv) {
        ((Z3) obj).E((IB0) this.c, new C4332iN(vv, ((C8323zE) this.b).e));
    }

    @Override // defpackage.InterfaceC0940Lv
    public Object g(C1241Pr0 c1241Pr0) {
        String str = (String) this.b;
        C7119sv c7119sv = (C7119sv) this.c;
        try {
            Trace.beginSection(str);
            return c7119sv.f.g(c1241Pr0);
        } finally {
            Trace.endSection();
        }
    }

    @Override // defpackage.InterfaceC0443Fl
    public Object h0(C0365El c0365El) {
        switch (this.a) {
            case 2:
                C1771Wm c1771Wm = (C1771Wm) this.b;
                c1771Wm.getClass();
                QR1.h().execute(new RunnableC1557Ts1(c1771Wm, (AtomicReference) this.c, c0365El, 9));
                return "OnScreenFlashStart";
            case 4:
                C8054xp c8054xp = (C8054xp) this.b;
                c8054xp.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                ReactContext reactContext = (ReactContext) this.c;
                Executor executor = c8054xp.d;
                executor.execute(new RunnableC7864wp(c8054xp, reactContext, executor, 1, c0365El, jElapsedRealtime));
                return "CameraX initInternal";
            case 11:
                C5663lH c5663lH = (C5663lH) this.b;
                c5663lH.D(true, new NK(1, new C3690f1(c0365El, 6, c5663lH)));
                return this.c;
            default:
                GW gw = (GW) this.b;
                gw.getClass();
                gw.b.execute(new RunnableC1557Ts1(gw, c0365El, (PT) this.c, 25));
                return "startFocusAndMetering";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0084  */
    @Override // defpackage.XG
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public defpackage.C3769fQ0 i(int r17, defpackage.C1272Qb1 r18, int[] r19) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0515Gj.i(int, Qb1, int[]):fQ0");
    }

    @Override // defpackage.InterfaceC1373Rj0
    public void invoke(Object obj) {
        Z3 z3 = (Z3) obj;
        switch (this.a) {
            case 12:
                z3.f((Y3) this.b, (CB0) this.c);
                break;
            case 13:
            default:
                z3.k((Y3) this.b, this.c);
                break;
            case 14:
                z3.r((Y3) this.b, (Q9) this.c);
                break;
            case 15:
                z3.h((Y3) this.b, (C0540Gr0) this.c);
                break;
            case 16:
                z3.m((Y3) this.b, (IQ) this.c);
                break;
            case 17:
                z3.O((Y3) this.b, (C3615ec1) this.c);
                break;
            case 18:
                z3.H((Y3) this.b, (WD) this.c);
                break;
            case 19:
                z3.P((Y3) this.b, (Exception) this.c);
                break;
            case 20:
                Y3 y3 = (Y3) this.b;
                C1530Tj1 c1530Tj1 = (C1530Tj1) this.c;
                z3.u(y3, c1530Tj1);
                int i = c1530Tj1.a;
                break;
        }
    }

    @Override // defpackage.InterfaceC1103Nx0
    public void onComplete(Task task) {
        ((KO) this.b).a((Intent) this.c);
    }

    @Override // defpackage.InterfaceC5441k61
    public Task then(Object obj) {
        C8075xw c8075xw = (C8075xw) this.b;
        C8265yw c8265yw = (C8265yw) this.c;
        synchronized (c8075xw) {
            c8075xw.c = AbstractC3782fU1.e(c8265yw);
        }
        return AbstractC3782fU1.e(c8265yw);
    }

    public /* synthetic */ C0515Gj(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.InterfaceC1651Uy
    public Object then(Task task) throws Throwable {
        Integer numValueOf;
        Throwable th;
        HttpURLConnection httpURLConnection;
        C7614vV c7614vV;
        int responseCode;
        boolean zD;
        switch (this.a) {
            case 8:
                return ((C0320Dw) this.b).c(task, 0L, (HashMap) this.c);
            case 9:
                d(task);
                return task;
            default:
                C0710Iw c0710Iw = (C0710Iw) this.b;
                C3892g32 c3892g32 = (C3892g32) this.c;
                c0710Iw.getClass();
                try {
                } catch (IOException unused) {
                    httpURLConnection = null;
                    numValueOf = null;
                } catch (Throwable th2) {
                    numValueOf = null;
                    th = th2;
                    httpURLConnection = null;
                }
                if (c3892g32.k()) {
                    c0710Iw.i(true);
                    httpURLConnection = (HttpURLConnection) c3892g32.i();
                    try {
                        responseCode = httpURLConnection.getResponseCode();
                        numValueOf = Integer.valueOf(responseCode);
                        if (responseCode == 200) {
                            try {
                                synchronized (c0710Iw) {
                                    c0710Iw.c = 8;
                                }
                                c0710Iw.o.f(0, C1099Nw.g);
                                c0710Iw.k(httpURLConnection).c();
                            } catch (IOException unused2) {
                                C0710Iw.b(httpURLConnection);
                                c0710Iw.i(false);
                                boolean z = numValueOf == null || C0710Iw.d(numValueOf.intValue());
                                if (z) {
                                    c0710Iw.l(new Date(c0710Iw.n.currentTimeMillis()));
                                }
                                if (!z && numValueOf.intValue() != 200) {
                                    String strF = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", numValueOf);
                                    if (numValueOf.intValue() == 403) {
                                        strF = C0710Iw.f(httpURLConnection.getErrorStream());
                                    }
                                    c7614vV = new C7614vV(numValueOf.intValue(), strF, 0);
                                    c0710Iw.g(c7614vV);
                                    return AbstractC3782fU1.e(null);
                                }
                                c0710Iw.h();
                                return AbstractC3782fU1.e(null);
                            } catch (Throwable th3) {
                                th = th3;
                                C0710Iw.b(httpURLConnection);
                                c0710Iw.i(false);
                                boolean z2 = numValueOf == null || C0710Iw.d(numValueOf.intValue());
                                if (z2) {
                                    c0710Iw.l(new Date(c0710Iw.n.currentTimeMillis()));
                                }
                                if (!z2 && numValueOf.intValue() != 200) {
                                    String strF2 = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", numValueOf);
                                    if (numValueOf.intValue() == 403) {
                                        strF2 = C0710Iw.f(httpURLConnection.getErrorStream());
                                    }
                                    c0710Iw.g(new C7614vV(numValueOf.intValue(), strF2, 0));
                                } else {
                                    c0710Iw.h();
                                }
                                throw th;
                            }
                        }
                        C0710Iw.b(httpURLConnection);
                        c0710Iw.i(false);
                        zD = C0710Iw.d(responseCode);
                        if (zD) {
                            c0710Iw.l(new Date(c0710Iw.n.currentTimeMillis()));
                        }
                    } catch (IOException unused3) {
                        numValueOf = null;
                    } catch (Throwable th4) {
                        numValueOf = null;
                        th = th4;
                    }
                    if (!zD && responseCode != 200) {
                        String strF3 = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", numValueOf);
                        if (responseCode == 403) {
                            strF3 = C0710Iw.f(httpURLConnection.getErrorStream());
                        }
                        c7614vV = new C7614vV(responseCode, strF3, 0);
                        c0710Iw.g(c7614vV);
                        return AbstractC3782fU1.e(null);
                    }
                    c0710Iw.h();
                    return AbstractC3782fU1.e(null);
                }
                throw new IOException(c3892g32.h());
        }
    }
}
