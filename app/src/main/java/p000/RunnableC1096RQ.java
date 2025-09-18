package p000;

import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Process;
import android.widget.EditText;
import com.facebook.react.bridge.WritableMap;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.p019vk.push.core.remote.config.omicron.C2423b;
import com.p019vk.push.core.remote.config.omicron.DataId;
import com.p019vk.push.core.remote.config.omicron.OmicronConfig;
import com.p019vk.push.core.remote.config.omicron.retriever.DataQuery;
import com.p019vk.push.core.remote.config.omicron.retriever.NetworkDataRetriever;
import com.p019vk.push.core.remote.config.omicron.timetable.SharedPreferencesUpdateTimetable;
import com.swmansion.reanimated.NodesManager;
import com.yandex.varioqub.config.model.ConfigValue;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import ru.p031ok.tracer.heap.dumps.HeapDumps;

/* renamed from: RQ */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1096RQ implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f10167a;

    /* renamed from: b */
    public final /* synthetic */ Object f10168b;

    /* renamed from: c */
    public final /* synthetic */ Object f10169c;

    public /* synthetic */ RunnableC1096RQ(Object obj, int i, Object obj2) {
        this.f10167a = i;
        this.f10168b = obj;
        this.f10169c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() throws Exception {
        long j;
        boolean z;
        boolean z2;
        boolean z3 = true;
        switch (this.f10167a) {
            case 0:
                C1474XQ c1474xq = (C1474XQ) this.f10168b;
                C1664aR c1664aR = (C1664aR) this.f10169c;
                int i = c1474xq.f13696H - c1664aR.f15509b;
                c1474xq.f13696H = i;
                if (c1664aR.f15512e) {
                    c1474xq.f13697I = c1664aR.f15510c;
                    c1474xq.f13698J = true;
                }
                if (i == 0) {
                    AbstractC7419Ca1 abstractC7419Ca1 = ((BB0) c1664aR.f15513f).f623a;
                    if (!c1474xq.f13743u1.f623a.m1259p() && abstractC7419Ca1.m1259p()) {
                        c1474xq.f13745v1 = -1;
                        c1474xq.f13747w1 = 0L;
                    }
                    if (!abstractC7419Ca1.m1259p()) {
                        List listAsList = Arrays.asList(((SB0) abstractC7419Ca1).f10617h);
                        YN1.m9281f(listAsList.size() == c1474xq.f13733p.size());
                        for (int i2 = 0; i2 < listAsList.size(); i2++) {
                            ((C1411WQ) c1474xq.f13733p.get(i2)).f13177b = (AbstractC7419Ca1) listAsList.get(i2);
                        }
                    }
                    long j2 = -9223372036854775807L;
                    if (c1474xq.f13698J) {
                        if (((BB0) c1664aR.f15513f).f624b.equals(c1474xq.f13743u1.f624b) && ((BB0) c1664aR.f15513f).f626d == c1474xq.f13743u1.f641s) {
                            z3 = false;
                        }
                        if (z3) {
                            if (abstractC7419Ca1.m1259p() || ((BB0) c1664aR.f15513f).f624b.m2791b()) {
                                j2 = ((BB0) c1664aR.f15513f).f626d;
                            } else {
                                BB0 bb0 = (BB0) c1664aR.f15513f;
                                C7604Fp0 c7604Fp0 = bb0.f624b;
                                long j3 = bb0.f626d;
                                Object obj = c7604Fp0.f3430a;
                                C7315Aa1 c7315Aa1 = c1474xq.f13732o;
                                abstractC7419Ca1.mo1250g(obj, c7315Aa1);
                                j2 = j3 + c7315Aa1.f260e;
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
                    c1474xq.f13698J = z;
                    c1474xq.m9033e2((BB0) c1664aR.f15513f, 1, z2, c1474xq.f13697I, j, -1, false);
                    return;
                }
                return;
            case 1:
                QB0 qb0 = (QB0) this.f10169c;
                ((C3928dR) this.f10168b).getClass();
                try {
                    synchronized (qb0) {
                    }
                    try {
                        qb0.f9517a.mo259d(qb0.f9520d, qb0.f9521e);
                        return;
                    } finally {
                        qb0.m6596b(true);
                    }
                } catch (C0531IQ e) {
                    AbstractC10872rA1.m24172e("Unexpected error delivering message on external thread.", e);
                    throw new RuntimeException(e);
                }
            case 2:
                ((C0533IS) this.f10168b).m3870a((Intent) this.f10169c);
                return;
            case 3:
                ((C0411GW) this.f10168b).m3080f((C0300El) this.f10169c);
                return;
            case 4:
                EditText editText = (EditText) this.f10168b;
                O90.m5968f(editText, "$input");
                editText.removeTextChangedListener((C4112gN) this.f10169c);
                return;
            case 5:
                ((C0300El) this.f10168b).m2375b(null);
                ((C0489Hl) this.f10169c).cancel(true);
                return;
            case 6:
                HeapDumps.shrinkAndUpload$lambda$4((Context) this.f10168b, (C10203ly0) this.f10169c);
                return;
            case 7:
                ((C0268EF) ((C9960k30) ((E30) this.f10168b).f2419c.f9780b).f36251b.f3100d.get(((C9832j30) this.f10169c).f34880m)).m2102c(true);
                return;
            case 8:
                M40 m40 = (M40) this.f10168b;
                O90.m5968f(m40, "this$0");
                m40.f6983a.mo1679a((C11415vQ0) this.f10169c);
                return;
            case 9:
                ((MU0) this.f10168b).m5386b();
                MU0 mu0 = (MU0) this.f10169c;
                if (mu0 != null) {
                    mu0.m5386b();
                    return;
                }
                return;
            case 10:
                S81 s81 = (S81) this.f10169c;
                B60 b60 = (B60) this.f10168b;
                b60.getClass();
                try {
                    s81.m7184b(b60.m496m());
                    return;
                } catch (Exception e2) {
                    s81.m7183a(e2);
                    return;
                }
            case 11:
                InterfaceC0048Al interfaceC0048Al = (InterfaceC0048Al) this.f10168b;
                O90.m5968f(interfaceC0048Al, "$cb");
                Bitmap bitmap = (Bitmap) this.f10169c;
                O90.m5968f(bitmap, "$bitmap");
                interfaceC0048Al.invoke(bitmap);
                return;
            case 12:
                int i3 = JobInfoSchedulerService.f18004a;
                ((JobInfoSchedulerService) this.f10168b).jobFinished((JobParameters) this.f10169c, false);
                return;
            case 13:
                C8364Uf0 c8364Uf0 = (C8364Uf0) this.f10168b;
                O90.m5968f(c8364Uf0, "this$0");
                C7705Hn1 c7705Hn1 = (C7705Hn1) this.f10169c;
                double dM8109a = c8364Uf0.m8109a();
                c8364Uf0.f11963h = c8364Uf0.m8111c();
                c8364Uf0.f11962g = dM8109a;
                HashSet hashSet = c8364Uf0.f11967l;
                if (hashSet.contains(c7705Hn1)) {
                    c8364Uf0.f11965j = 0;
                    hashSet.remove(c7705Hn1);
                    return;
                }
                String strConcat = "KeyboardController::".concat(!c8364Uf0.f11963h ? "keyboardDidHide" : "keyboardDidShow");
                WritableMap writableMapM8110b = c8364Uf0.m8110b(dM8109a);
                S91 s91 = c8364Uf0.f11958c;
                T91.m7609b(s91, strConcat, writableMapM8110b);
                C3924dN c3924dN = c8364Uf0.f11956a;
                T91.m7608a(s91, c3924dN.getId(), new C10167lg0(c8364Uf0.f11960e, c3924dN.getId(), C10167lg0.f37238h, dM8109a, !c8364Uf0.f11963h ? ConfigValue.DOUBLE_DEFAULT_VALUE : 1.0d, c8364Uf0.f11965j, c8364Uf0.f11966k));
                c8364Uf0.f11965j = 0;
                T91.m7610c(s91, c3924dN.getId());
                return;
            case 14:
                ((C7560Et0) ((C7967Mo1) this.f10168b).f7362a).mo10135i((C8890bk0) this.f10169c);
                return;
            case 15:
                C9018ck0 c9018ck0 = (C9018ck0) ((C7560Et0) ((C7967Mo1) this.f10168b).f7362a).mo1868d();
                C0300El c0300El = (C0300El) this.f10169c;
                if (c9018ck0 == null) {
                    c0300El.m2377d(new IllegalStateException("Observable has not yet been initialized with a value."));
                    return;
                } else {
                    c0300El.m2375b(c9018ck0.f17719a);
                    return;
                }
            case 16:
                C8890bk0 c8890bk0 = (C8890bk0) this.f10168b;
                if (c8890bk0.f17127a.get()) {
                    C9018ck0 c9018ck02 = (C9018ck0) this.f10169c;
                    c9018ck02.getClass();
                    c8890bk0.f17128b.mo2107a(c9018ck02.f17719a);
                    return;
                }
                return;
            case 17:
                C7764Ir0 c7764Ir0 = (C7764Ir0) this.f10168b;
                c7764Ir0.getClass();
                ((InterfaceC9713i70) this.f10169c).mo504k(c7764Ir0);
                return;
            case 18:
                String str = (String) this.f10168b;
                O90.m5968f(str, "$encodedDataString");
                C9551gs0 c9551gs0 = (C9551gs0) this.f10169c;
                O90.m5968f(c9551gs0, "this$0");
                URL url = new URL("https://stats.mos.ru/eds.gif?o=".concat(str));
                url.toString();
                URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection());
                O90.m5966d(uRLConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setConnectTimeout(5000);
                try {
                    try {
                        if (httpURLConnection.getResponseCode() == 200) {
                            httpURLConnection.getResponseCode();
                            C10189lr0 c10189lr0 = c9551gs0.f28070a;
                            if (c10189lr0 == null) {
                                O90.m5977o("dao");
                                throw null;
                            }
                            c10189lr0.m22549G(str);
                            c9551gs0.m18669a();
                        } else {
                            C10189lr0 c10189lr02 = c9551gs0.f28070a;
                            if (c10189lr02 == null) {
                                O90.m5977o("dao");
                                throw null;
                            }
                            c10189lr02.m22564W(new C9933jr0(0L, str));
                            httpURLConnection.getResponseCode();
                        }
                    } catch (Exception e3) {
                        C10189lr0 c10189lr03 = c9551gs0.f28070a;
                        if (c10189lr03 == null) {
                            O90.m5977o("dao");
                            throw null;
                        }
                        c10189lr03.m22564W(new C9933jr0(0L, str));
                        e3.printStackTrace();
                    }
                    httpURLConnection.disconnect();
                    return;
                } catch (Throwable th) {
                    httpURLConnection.disconnect();
                    throw th;
                }
            case 19:
                ((C0896OE) this.f10169c).m5998a(((C9557gv0) this.f10168b).m18673c());
                return;
            case 20:
                ((NodesManager) this.f10168b).lambda$new$0((InterfaceC6947uP) this.f10169c);
                return;
            case 21:
                C2423b c2423b = (C2423b) this.f10168b;
                C7360Ax0 c7360Ax0 = c2423b.f20539g;
                SharedPreferencesUpdateTimetable sharedPreferencesUpdateTimetable = c7360Ax0.f486c;
                OmicronConfig omicronConfig = c2423b.f47112c;
                long j4 = omicronConfig.f20511g;
                TimeUnit timeUnit = C7360Ax0.f483g;
                DataId dataId = c2423b.f47113d;
                if (sharedPreferencesUpdateTimetable.shouldUpdate(dataId, j4, timeUnit)) {
                    NetworkDataRetriever networkDataRetriever = c7360Ax0.f485b;
                    int i4 = AbstractC11862yx0.f46550b[networkDataRetriever.retrieve(dataId, (DataQuery) this.f10169c).ordinal()];
                    if (i4 == 1) {
                        c7360Ax0.f484a.putData(dataId, networkDataRetriever.getData());
                        c2423b.f47110a.set(networkDataRetriever.getData());
                        omicronConfig.f20510f.onCacheUpdated(dataId);
                    } else if (i4 != 2) {
                        return;
                    }
                    sharedPreferencesUpdateTimetable.setUpdateDate(dataId, c7360Ax0.f487d.getCurrentDate());
                    return;
                }
                return;
            case 22:
                ((InterfaceC6947uP) this.f10168b).mo11046g((C4004ef) this.f10169c);
                return;
            case 23:
                ((InterfaceC8952cD0) this.f10168b).mo5474h((Z61) this.f10169c);
                return;
            case 24:
                ((C10237mD0) ((C7978Mu0) this.f10168b).f7393b).f37563l.mo5474h((Z61) this.f10169c);
                return;
            case 25:
                O90.m5968f((ThreadFactoryC11897zD0) this.f10168b, "this$0");
                Runnable runnable = (Runnable) this.f10169c;
                O90.m5968f(runnable, "$runnable");
                try {
                    Process.setThreadPriority(10);
                } catch (Throwable unused) {
                }
                runnable.run();
                return;
            case 26:
                AbstractC11561wZ1.m25649b(((JD0) this.f10168b).f5389f);
                AbstractC4232iH abstractC4232iH = (AbstractC4232iH) this.f10169c;
                if (abstractC4232iH != null) {
                    abstractC4232iH.m18991b();
                    return;
                }
                return;
            case 27:
                WR0 wr0 = ((OD0) this.f10168b).f8311h;
                DV1.m1716a();
                boolean z4 = wr0.f13185g;
                InterfaceC9457g70 interfaceC9457g70 = (InterfaceC9457g70) this.f10169c;
                if (z4) {
                    interfaceC9457g70.close();
                    return;
                }
                AbstractC9104dM1.m17550i(wr0.f13181c.f4484b.isDone(), "onImageCaptured() must be called before onFinalResult()");
                wr0.m8760a();
                C1110Re c1110Re = wr0.f13179a;
                c1110Re.f10349c.execute(new RunnableC11634x81(c1110Re, interfaceC9457g70, 1));
                return;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                WR0 wr02 = ((OD0) this.f10168b).f8311h;
                DV1.m1716a();
                if (wr02.f13185g) {
                    return;
                }
                AbstractC9104dM1.m17550i(wr02.f13181c.f4484b.isDone(), "onImageCaptured() must be called before onFinalResult()");
                wr02.m8760a();
                C1110Re c1110Re2 = wr02.f13179a;
                c1110Re2.f10349c.execute(new MD0(c1110Re2, 29, (C7564Ev0) this.f10169c));
                return;
            default:
                WR0 wr03 = ((OD0) this.f10168b).f8311h;
                DV1.m1716a();
                if (wr03.f13185g) {
                    return;
                }
                C1110Re c1110Re3 = wr03.f13179a;
                c1110Re3.f10349c.execute(new RunnableC11634x81(c1110Re3, (Bitmap) this.f10169c, 2));
                return;
        }
    }
}
