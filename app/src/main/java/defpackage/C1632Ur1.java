package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.internal.ICancelToken;
import com.google.android.gms.location.CurrentLocationRequest;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.SleepSegmentRequest;
import com.google.android.gms.location.zzm;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.huawei.hms.push.AttributionReporter;
import com.vk.push.common.Logger;
import com.vk.push.common.clientid.ClientIdCallback;
import com.vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: Ur1 */
/* loaded from: classes2.dex */
public final class C1632Ur1 implements RemoteCall, InterfaceC3871fy0 {
    public final /* synthetic */ int a;
    public final Object b;
    public Object c;

    public /* synthetic */ C1632Ur1(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(boolean r9, defpackage.AbstractC1963Yy r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.C6728qr1
            if (r0 == 0) goto L13
            r0 = r10
            qr1 r0 = (defpackage.C6728qr1) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            qr1 r0 = new qr1
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.c
            Mz r1 = defpackage.EnumC1030Mz.a
            int r2 = r0.e
            Tf1 r3 = defpackage.C1518Tf1.a
            r4 = 3
            r5 = 1
            r6 = 2
            if (r2 == 0) goto L4d
            if (r2 == r5) goto L41
            if (r2 == r6) goto L38
            if (r2 != r4) goto L30
            defpackage.RQ1.d(r10)
            goto Laa
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            defpackage.RQ1.d(r10)
            PS0 r10 = (defpackage.PS0) r10
            r10.getClass()
            goto L8b
        L41:
            boolean r9 = r0.b
            Ur1 r2 = r0.a
            defpackage.RQ1.d(r10)
            Wq1 r10 = (defpackage.C1785Wq1) r10
            java.lang.String r10 = r10.a
            goto L62
        L4d:
            defpackage.RQ1.d(r10)
            r0.a = r8
            r0.b = r9
            r0.e = r5
            java.lang.Object r10 = r8.b
            Vq1 r10 = (defpackage.InterfaceC1707Vq1) r10
            java.lang.Object r10 = r10.a(r0)
            if (r10 != r1) goto L61
            return r1
        L61:
            r2 = r8
        L62:
            java.lang.String r10 = (java.lang.String) r10
            boolean r5 = defpackage.AbstractC7538v51.C(r10)
            r7 = 0
            if (r5 != 0) goto L8c
            if (r9 == 0) goto L8c
            java.lang.Object r9 = r2.c
            F71 r9 = (defpackage.F71) r9
            java.lang.Object r9 = r9.getValue()
            com.vk.push.common.Logger r9 = (com.vk.push.common.Logger) r9
            java.lang.String r4 = "Push token exists, need to remote delete token"
            com.vk.push.common.Logger.DefaultImpls.info$default(r9, r4, r7, r6, r7)
            r0.a = r7
            r0.e = r6
            java.lang.Object r9 = r2.b
            Vq1 r9 = (defpackage.InterfaceC1707Vq1) r9
            java.lang.Object r9 = r9.b(r10, r0)
            if (r9 != r1) goto L8b
            return r1
        L8b:
            return r3
        L8c:
            java.lang.Object r9 = r2.c
            F71 r9 = (defpackage.F71) r9
            java.lang.Object r9 = r9.getValue()
            com.vk.push.common.Logger r9 = (com.vk.push.common.Logger) r9
            java.lang.String r10 = "Push token is null, no need to remote delete token"
            com.vk.push.common.Logger.DefaultImpls.info$default(r9, r10, r7, r6, r7)
            r0.a = r7
            r0.e = r4
            java.lang.Object r9 = r2.b
            Vq1 r9 = (defpackage.InterfaceC1707Vq1) r9
            java.lang.Object r9 = r9.e(r0)
            if (r9 != r1) goto Laa
            return r1
        Laa:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1632Ur1.a(boolean, Yy):java.lang.Object");
    }

    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public void accept(Object obj, Object obj2) throws RemoteException {
        Object obj3 = this.b;
        switch (this.a) {
            case 3:
                BinderC5794ly1 binderC5794ly1 = new BinderC5794ly1((S81) obj2);
                C2341bW1 c2341bW1 = (C2341bW1) ((InterfaceC3600eX1) ((C3555eI1) obj).getService());
                Parcel parcelZza = c2341bW1.zza();
                LC1.c(parcelZza, (PendingIntent) obj3);
                LC1.c(parcelZza, (SleepSegmentRequest) this.c);
                LC1.d(parcelZza, binderC5794ly1);
                c2341bW1.zzc(79, parcelZza);
                break;
            default:
                C8325zE1 c8325zE1 = (C8325zE1) obj;
                S81 s81 = (S81) obj2;
                Api.ClientKey clientKey = RB1.a;
                c8325zE1.getContext();
                boolean zG = c8325zE1.g(zzm.zze);
                CurrentLocationRequest currentLocationRequest = (CurrentLocationRequest) obj3;
                AbstractC1156Op abstractC1156Op = (AbstractC1156Op) this.c;
                if (!zG) {
                    ListenerHolder listenerHolderCreateListenerHolder = ListenerHolders.createListenerHolder(new C6226oD1(c8325zE1, s81), RF1.a, "GetCurrentLocation");
                    ListenerHolder.ListenerKey listenerKey = listenerHolderCreateListenerHolder.getListenerKey();
                    listenerKey.getClass();
                    TZ1 tz1 = new TZ1();
                    tz1.a = listenerHolderCreateListenerHolder;
                    tz1.b = s81;
                    S81 s812 = new S81();
                    LocationRequest.Builder builder = new LocationRequest.Builder(currentLocationRequest.getPriority(), 0L);
                    builder.setMinUpdateIntervalMillis(0L);
                    builder.setDurationMillis(currentLocationRequest.getDurationMillis());
                    builder.setGranularity(currentLocationRequest.getGranularity());
                    builder.setMaxUpdateAgeMillis(currentLocationRequest.getMaxUpdateAgeMillis());
                    builder.zza(currentLocationRequest.zze());
                    builder.zzc(currentLocationRequest.zza());
                    builder.setWaitForAccurateLocation(true);
                    builder.zzb(currentLocationRequest.zzd());
                    builder.zzd(currentLocationRequest.zzb());
                    c8325zE1.k(tz1, builder.build(), s812);
                    s812.a.b(new GQ0(12, s81));
                    if (abstractC1156Op != null) {
                        GQ0 gq0 = new GQ0(10, new C1632Ur1(c8325zE1, 5, listenerKey));
                        ((FA1) abstractC1156Op).a.e(Y81.a, gq0);
                        break;
                    }
                } else {
                    InterfaceC3600eX1 interfaceC3600eX1 = (InterfaceC3600eX1) c8325zE1.getService();
                    BinderC5844mD1 binderC5844mD1 = new BinderC5844mD1(1, s81);
                    C2341bW1 c2341bW12 = (C2341bW1) interfaceC3600eX1;
                    Parcel parcelZza2 = c2341bW12.zza();
                    LC1.c(parcelZza2, currentLocationRequest);
                    LC1.d(parcelZza2, binderC5844mD1);
                    Parcel parcelZzb = c2341bW12.zzb(87, parcelZza2);
                    ICancelToken iCancelTokenAsInterface = ICancelToken.Stub.asInterface(parcelZzb.readStrongBinder());
                    parcelZzb.recycle();
                    if (abstractC1156Op != null) {
                        GQ0 gq02 = new GQ0(10, new C7409uQ0(iCancelTokenAsInterface));
                        ((FA1) abstractC1156Op).a.e(Y81.a, gq02);
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.InterfaceC3871fy0
    public void b() {
        try {
            ((C8325zE1) this.b).d((ListenerHolder.ListenerKey) this.c, true, new S81());
        } catch (RemoteException unused) {
        }
    }

    public String c(ArrayList arrayList) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C7705vz0 c7705vz0 = (C7705vz0) it.next();
            O90.f(c7705vz0, "remoteMetricsEventDto");
            JSONObject jSONObject2 = new JSONObject();
            C1475Sr0 c1475Sr0 = c7705vz0.e;
            jSONObject2.put("event_name", c1475Sr0.a);
            String str = c7705vz0.c;
            jSONObject2.put("user_id", str);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(AnalyticsBaseParamsConstantsKt.PACKAGE_NAME, c7705vz0.a);
            String str2 = c7705vz0.d;
            if (str2 == null) {
                str2 = null;
            }
            jSONObject3.put(AttributionReporter.APP_VERSION, str2);
            jSONObject3.put("userIdSdk", str);
            jSONObject3.put(CrashHianalyticsData.TIME, String.valueOf(c1475Sr0.c));
            for (Map.Entry entry : c1475Sr0.b.entrySet()) {
                jSONObject3.put((String) entry.getKey(), (String) entry.getValue());
            }
            jSONObject2.put("params", jSONObject3);
            String string = jSONObject2.toString();
            O90.e(string, "jsonObject.toString()");
            jSONArray.put(new JSONObject(string));
        }
        jSONObject.put("events", jSONArray);
        String string2 = jSONObject.toString();
        O90.e(string2, "jsonObject.toString()");
        return string2;
    }

    public HttpsURLConnection d() throws ProtocolException {
        F71 f71 = (F71) this.c;
        URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(((URL) f71.getValue()).openConnection());
        O90.d(uRLConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) uRLConnection;
        URL url = (URL) f71.getValue();
        O90.e(url, "backendUrl");
        httpsURLConnection.setHostnameVerifier(new C1002Mp1(url, 1));
        httpsURLConnection.setRequestMethod("POST");
        httpsURLConnection.setRequestProperty("content-type", "application/json");
        httpsURLConnection.setRequestProperty("X-Metrics-Request-Time", String.valueOf(System.currentTimeMillis()));
        httpsURLConnection.setConnectTimeout(20000);
        httpsURLConnection.setReadTimeout(20000);
        httpsURLConnection.setDoOutput(true);
        return httpsURLConnection;
    }

    public /* synthetic */ C1632Ur1(C8083xy1 c8083xy1, PendingIntent pendingIntent, SleepSegmentRequest sleepSegmentRequest) {
        this.a = 3;
        this.b = pendingIntent;
        this.c = sleepSegmentRequest;
    }

    public C1632Ur1(C3759fN c3759fN, C0474Fv0 c0474Fv0, C0396Ev0 c0396Ev0) {
        this.a = 2;
        this.b = c3759fN;
        this.c = LB.b(new S51(16, this));
    }

    public C1632Ur1(InterfaceC1707Vq1 interfaceC1707Vq1, Logger logger) {
        this.a = 0;
        O90.f(logger, "logger");
        this.b = interfaceC1707Vq1;
        this.c = LB.b(new C7726w5(logger, 29, this));
    }

    public C1632Ur1(C2407bs1 c2407bs1) {
        this.a = 6;
        this.c = new C8444zs0();
        this.b = c2407bs1;
        NV1.D();
    }

    public C1632Ur1(ClientIdCallback clientIdCallback, Logger logger) {
        this.a = 1;
        this.b = clientIdCallback;
        this.c = logger.createLogger("ClientIdDataSource");
    }
}
