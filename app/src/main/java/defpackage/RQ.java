package defpackage;

import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Process;
import android.widget.EditText;
import com.facebook.react.bridge.WritableMap;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.swmansion.reanimated.NodesManager;
import com.vk.push.core.remote.config.omicron.DataId;
import com.vk.push.core.remote.config.omicron.OmicronConfig;
import com.vk.push.core.remote.config.omicron.b;
import com.vk.push.core.remote.config.omicron.retriever.DataQuery;
import com.vk.push.core.remote.config.omicron.retriever.NetworkDataRetriever;
import com.vk.push.core.remote.config.omicron.timetable.SharedPreferencesUpdateTimetable;
import com.yandex.varioqub.config.model.ConfigValue;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import ru.ok.tracer.heap.dumps.HeapDumps;

/* loaded from: classes.dex */
public final /* synthetic */ class RQ implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ RQ(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() throws Exception {
        long j;
        boolean z;
        boolean z2;
        boolean z3 = true;
        switch (this.a) {
            case 0:
                XQ xq = (XQ) this.b;
                C2133aR c2133aR = (C2133aR) this.c;
                int i = xq.H - c2133aR.b;
                xq.H = i;
                if (c2133aR.e) {
                    xq.I = c2133aR.c;
                    xq.J = true;
                }
                if (i == 0) {
                    AbstractC0178Ca1 abstractC0178Ca1 = ((BB0) c2133aR.f).a;
                    if (!xq.u1.a.p() && abstractC0178Ca1.p()) {
                        xq.v1 = -1;
                        xq.w1 = 0L;
                    }
                    if (!abstractC0178Ca1.p()) {
                        List listAsList = Arrays.asList(((SB0) abstractC0178Ca1).h);
                        YN1.f(listAsList.size() == xq.p.size());
                        for (int i2 = 0; i2 < listAsList.size(); i2++) {
                            ((WQ) xq.p.get(i2)).b = (AbstractC0178Ca1) listAsList.get(i2);
                        }
                    }
                    long j2 = -9223372036854775807L;
                    if (xq.J) {
                        if (((BB0) c2133aR.f).b.equals(xq.u1.b) && ((BB0) c2133aR.f).d == xq.u1.s) {
                            z3 = false;
                        }
                        if (z3) {
                            if (abstractC0178Ca1.p() || ((BB0) c2133aR.f).b.b()) {
                                j2 = ((BB0) c2133aR.f).d;
                            } else {
                                BB0 bb0 = (BB0) c2133aR.f;
                                C0456Fp0 c0456Fp0 = bb0.b;
                                long j3 = bb0.d;
                                Object obj = c0456Fp0.a;
                                C0022Aa1 c0022Aa1 = xq.o;
                                abstractC0178Ca1.g(obj, c0022Aa1);
                                j2 = j3 + c0022Aa1.e;
                            }
                        }
                        z2 = z3;
                        j = j2;
                        z = false;
                    } else {
                        j = -9223372036854775807L;
                        z = false;
                        z2 = false;
                    }
                    xq.J = z;
                    xq.e2((BB0) c2133aR.f, 1, z2, xq.I, j, -1, false);
                    return;
                }
                return;
            case 1:
                QB0 qb0 = (QB0) this.c;
                ((C3390dR) this.b).getClass();
                try {
                    synchronized (qb0) {
                    }
                    try {
                        qb0.a.d(qb0.d, qb0.e);
                        return;
                    } finally {
                        qb0.b(true);
                    }
                } catch (IQ e) {
                    AbstractC6789rA1.e("Unexpected error delivering message on external thread.", e);
                    throw new RuntimeException(e);
                }
            case 2:
                ((IS) this.b).a((Intent) this.c);
                return;
            case 3:
                ((GW) this.b).f((C0365El) this.c);
                return;
            case 4:
                EditText editText = (EditText) this.b;
                O90.f(editText, "$input");
                editText.removeTextChangedListener((C3950gN) this.c);
                return;
            case 5:
                ((C0365El) this.b).b(null);
                ((C0599Hl) this.c).cancel(true);
                return;
            case 6:
                HeapDumps.shrinkAndUpload$lambda$4((Context) this.b, (C5793ly0) this.c);
                return;
            case 7:
                ((EF) ((C5430k30) ((E30) this.b).c.b).b.d.get(((C5239j30) this.c).m)).c(true);
                return;
            case 8:
                M40 m40 = (M40) this.b;
                O90.f(m40, "this$0");
                m40.a.a((C7600vQ0) this.c);
                return;
            case 9:
                ((MU0) this.b).b();
                MU0 mu0 = (MU0) this.c;
                if (mu0 != null) {
                    mu0.b();
                    return;
                }
                return;
            case 10:
                S81 s81 = (S81) this.c;
                B60 b60 = (B60) this.b;
                b60.getClass();
                try {
                    s81.b(b60.m());
                    return;
                } catch (Exception e2) {
                    s81.a(e2);
                    return;
                }
            case 11:
                InterfaceC0053Al interfaceC0053Al = (InterfaceC0053Al) this.b;
                O90.f(interfaceC0053Al, "$cb");
                Bitmap bitmap = (Bitmap) this.c;
                O90.f(bitmap, "$bitmap");
                interfaceC0053Al.invoke(bitmap);
                return;
            case 12:
                int i3 = JobInfoSchedulerService.a;
                ((JobInfoSchedulerService) this.b).jobFinished((JobParameters) this.c, false);
                return;
            case 13:
                C1595Uf0 c1595Uf0 = (C1595Uf0) this.b;
                O90.f(c1595Uf0, "this$0");
                C0607Hn1 c0607Hn1 = (C0607Hn1) this.c;
                double dA = c1595Uf0.a();
                c1595Uf0.h = c1595Uf0.c();
                c1595Uf0.g = dA;
                HashSet hashSet = c1595Uf0.l;
                if (hashSet.contains(c0607Hn1)) {
                    c1595Uf0.j = 0;
                    hashSet.remove(c0607Hn1);
                    return;
                }
                String strConcat = "KeyboardController::".concat(!c1595Uf0.h ? "keyboardDidHide" : "keyboardDidShow");
                WritableMap writableMapB = c1595Uf0.b(dA);
                S91 s91 = c1595Uf0.c;
                T91.b(s91, strConcat, writableMapB);
                C3378dN c3378dN = c1595Uf0.a;
                T91.a(s91, c3378dN.getId(), new C5739lg0(c1595Uf0.e, c3378dN.getId(), C5739lg0.h, dA, !c1595Uf0.h ? ConfigValue.DOUBLE_DEFAULT_VALUE : 1.0d, c1595Uf0.j, c1595Uf0.k));
                c1595Uf0.j = 0;
                T91.c(s91, c3378dN.getId());
                return;
            case 14:
                ((C0390Et0) ((C0999Mo1) this.b).a).i((C2382bk0) this.c);
                return;
            case 15:
                C2572ck0 c2572ck0 = (C2572ck0) ((C0390Et0) ((C0999Mo1) this.b).a).d();
                C0365El c0365El = (C0365El) this.c;
                if (c2572ck0 == null) {
                    c0365El.d(new IllegalStateException("Observable has not yet been initialized with a value."));
                    return;
                } else {
                    c0365El.b(c2572ck0.a);
                    return;
                }
            case 16:
                C2382bk0 c2382bk0 = (C2382bk0) this.b;
                if (c2382bk0.a.get()) {
                    C2572ck0 c2572ck02 = (C2572ck0) this.c;
                    c2572ck02.getClass();
                    c2382bk0.b.a(c2572ck02.a);
                    return;
                }
                return;
            case 17:
                C0696Ir0 c0696Ir0 = (C0696Ir0) this.b;
                c0696Ir0.getClass();
                ((InterfaceC4285i70) this.c).k(c0696Ir0);
                return;
            case 18:
                String str = (String) this.b;
                O90.f(str, "$encodedDataString");
                C4044gs0 c4044gs0 = (C4044gs0) this.c;
                O90.f(c4044gs0, "this$0");
                URL url = new URL("https://stats.mos.ru/eds.gif?o=".concat(str));
                url.toString();
                URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection());
                O90.d(uRLConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setConnectTimeout(5000);
                try {
                    try {
                        if (httpURLConnection.getResponseCode() == 200) {
                            httpURLConnection.getResponseCode();
                            C5772lr0 c5772lr0 = c4044gs0.a;
                            if (c5772lr0 == null) {
                                O90.o("dao");
                                throw null;
                            }
                            c5772lr0.G(str);
                            c4044gs0.a();
                        } else {
                            C5772lr0 c5772lr02 = c4044gs0.a;
                            if (c5772lr02 == null) {
                                O90.o("dao");
                                throw null;
                            }
                            c5772lr02.W(new C5390jr0(0L, str));
                            httpURLConnection.getResponseCode();
                        }
                    } catch (Exception e3) {
                        C5772lr0 c5772lr03 = c4044gs0.a;
                        if (c5772lr03 == null) {
                            O90.o("dao");
                            throw null;
                        }
                        c5772lr03.W(new C5390jr0(0L, str));
                        e3.printStackTrace();
                    }
                    httpURLConnection.disconnect();
                    return;
                } catch (Throwable th) {
                    httpURLConnection.disconnect();
                    throw th;
                }
            case 19:
                ((OE) this.c).a(((C4053gv0) this.b).c());
                return;
            case 20:
                ((NodesManager) this.b).lambda$new$0((InterfaceC7405uP) this.c);
                return;
            case 21:
                b bVar = (b) this.b;
                C0090Ax0 c0090Ax0 = bVar.g;
                SharedPreferencesUpdateTimetable sharedPreferencesUpdateTimetable = c0090Ax0.c;
                OmicronConfig omicronConfig = bVar.c;
                long j4 = omicronConfig.g;
                TimeUnit timeUnit = C0090Ax0.g;
                DataId dataId = bVar.d;
                if (sharedPreferencesUpdateTimetable.shouldUpdate(dataId, j4, timeUnit)) {
                    NetworkDataRetriever networkDataRetriever = c0090Ax0.b;
                    int i4 = AbstractC8269yx0.b[networkDataRetriever.retrieve(dataId, (DataQuery) this.c).ordinal()];
                    if (i4 == 1) {
                        c0090Ax0.a.putData(dataId, networkDataRetriever.getData());
                        bVar.a.set(networkDataRetriever.getData());
                        omicronConfig.f.onCacheUpdated(dataId);
                    } else if (i4 != 2) {
                        return;
                    }
                    sharedPreferencesUpdateTimetable.setUpdateDate(dataId, c0090Ax0.d.getCurrentDate());
                    return;
                }
                return;
            case 22:
                ((InterfaceC7405uP) this.b).g((C3622ef) this.c);
                return;
            case 23:
                ((InterfaceC2473cD0) this.b).h((Z61) this.c);
                return;
            case 24:
                ((C5843mD0) ((C1016Mu0) this.b).b).l.h((Z61) this.c);
                return;
            case 25:
                O90.f((ThreadFactoryC8321zD0) this.b, "this$0");
                Runnable runnable = (Runnable) this.c;
                O90.f(runnable, "$runnable");
                try {
                    Process.setThreadPriority(10);
                } catch (Throwable unused) {
                }
                runnable.run();
                return;
            case 26:
                AbstractC7818wZ1.b(((JD0) this.b).f);
                AbstractC4314iH abstractC4314iH = (AbstractC4314iH) this.c;
                if (abstractC4314iH != null) {
                    abstractC4314iH.b();
                    return;
                }
                return;
            case 27:
                WR0 wr0 = ((OD0) this.b).h;
                DV1.a();
                boolean z4 = wr0.g;
                InterfaceC3903g70 interfaceC3903g70 = (InterfaceC3903g70) this.c;
                if (z4) {
                    interfaceC3903g70.close();
                    return;
                }
                AbstractC3377dM1.i(wr0.c.b.isDone(), "onImageCaptured() must be called before onFinalResult()");
                wr0.a();
                C1357Re c1357Re = wr0.a;
                c1357Re.c.execute(new RunnableC7927x81(c1357Re, interfaceC3903g70, 1));
                return;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                WR0 wr02 = ((OD0) this.b).h;
                DV1.a();
                if (wr02.g) {
                    return;
                }
                AbstractC3377dM1.i(wr02.c.b.isDone(), "onImageCaptured() must be called before onFinalResult()");
                wr02.a();
                C1357Re c1357Re2 = wr02.a;
                c1357Re2.c.execute(new MD0(c1357Re2, 29, (C0396Ev0) this.c));
                return;
            default:
                WR0 wr03 = ((OD0) this.b).h;
                DV1.a();
                if (wr03.g) {
                    return;
                }
                C1357Re c1357Re3 = wr03.a;
                c1357Re3.c.execute(new RunnableC7927x81(c1357Re3, (Bitmap) this.c, 2));
                return;
        }
    }
}
