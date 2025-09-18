package p000;

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
import com.p019vk.push.common.Logger;
import com.p019vk.push.common.clientid.ClientIdCallback;
import com.p019vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
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
public final class C8389Ur1 implements RemoteCall, InterfaceC9435fy0 {

    /* renamed from: a */
    public final /* synthetic */ int f12176a;

    /* renamed from: b */
    public final Object f12177b;

    /* renamed from: c */
    public Object f12178c;

    public /* synthetic */ C8389Ur1(Object obj, int i, Object obj2) {
        this.f12176a = i;
        this.f12177b = obj;
        this.f12178c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0013  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object m8195a(boolean r9, p000.AbstractC1571Yy r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof p000.C10830qr1
            if (r0 == 0) goto L13
            r0 = r10
            qr1 r0 = (p000.C10830qr1) r0
            int r1 = r0.f41217e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f41217e = r1
            goto L18
        L13:
            qr1 r0 = new qr1
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f41215c
            Mz r1 = p000.EnumC0817Mz.f7418a
            int r2 = r0.f41217e
            Tf1 r3 = p000.C8313Tf1.f11463a
            r4 = 3
            r5 = 1
            r6 = 2
            if (r2 == 0) goto L4d
            if (r2 == r5) goto L41
            if (r2 == r6) goto L38
            if (r2 != r4) goto L30
            p000.RQ1.m7017d(r10)
            goto Laa
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            p000.RQ1.m7017d(r10)
            PS0 r10 = (p000.PS0) r10
            r10.getClass()
            goto L8b
        L41:
            boolean r9 = r0.f41214b
            Ur1 r2 = r0.f41213a
            p000.RQ1.m7017d(r10)
            Wq1 r10 = (p000.C8491Wq1) r10
            java.lang.String r10 = r10.f13419a
            goto L62
        L4d:
            p000.RQ1.m7017d(r10)
            r0.f41213a = r8
            r0.f41214b = r9
            r0.f41217e = r5
            java.lang.Object r10 = r8.f12177b
            Vq1 r10 = (p000.InterfaceC8439Vq1) r10
            java.lang.Object r10 = r10.mo6147a(r0)
            if (r10 != r1) goto L61
            return r1
        L61:
            r2 = r8
        L62:
            java.lang.String r10 = (java.lang.String) r10
            boolean r5 = p000.AbstractC11374v51.m25328C(r10)
            r7 = 0
            if (r5 != 0) goto L8c
            if (r9 == 0) goto L8c
            java.lang.Object r9 = r2.f12178c
            F71 r9 = (p000.F71) r9
            java.lang.Object r9 = r9.getValue()
            com.vk.push.common.Logger r9 = (com.p019vk.push.common.Logger) r9
            java.lang.String r4 = "Push token exists, need to remote delete token"
            com.vk.push.common.Logger.DefaultImpls.info$default(r9, r4, r7, r6, r7)
            r0.f41213a = r7
            r0.f41217e = r6
            java.lang.Object r9 = r2.f12177b
            Vq1 r9 = (p000.InterfaceC8439Vq1) r9
            java.lang.Object r9 = r9.mo6148b(r10, r0)
            if (r9 != r1) goto L8b
            return r1
        L8b:
            return r3
        L8c:
            java.lang.Object r9 = r2.f12178c
            F71 r9 = (p000.F71) r9
            java.lang.Object r9 = r9.getValue()
            com.vk.push.common.Logger r9 = (com.p019vk.push.common.Logger) r9
            java.lang.String r10 = "Push token is null, no need to remote delete token"
            com.vk.push.common.Logger.DefaultImpls.info$default(r9, r10, r7, r6, r7)
            r0.f41213a = r7
            r0.f41217e = r4
            java.lang.Object r9 = r2.f12177b
            Vq1 r9 = (p000.InterfaceC8439Vq1) r9
            java.lang.Object r9 = r9.mo6149e(r0)
            if (r9 != r1) goto Laa
            return r1
        Laa:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C8389Ur1.m8195a(boolean, Yy):java.lang.Object");
    }

    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public void accept(Object obj, Object obj2) throws RemoteException {
        Object obj3 = this.f12177b;
        switch (this.f12176a) {
            case 3:
                BinderC10204ly1 binderC10204ly1 = new BinderC10204ly1((S81) obj2);
                C8863bW1 c8863bW1 = (C8863bW1) ((InterfaceC9254eX1) ((C9224eI1) obj).getService());
                Parcel parcelZza = c8863bW1.zza();
                LC1.m4925c(parcelZza, (PendingIntent) obj3);
                LC1.m4925c(parcelZza, (SleepSegmentRequest) this.f12178c);
                LC1.m4926d(parcelZza, binderC10204ly1);
                c8863bW1.zzc(79, parcelZza);
                break;
            default:
                C11900zE1 c11900zE1 = (C11900zE1) obj;
                S81 s81 = (S81) obj2;
                Api.ClientKey clientKey = RB1.f10059a;
                c11900zE1.getContext();
                boolean zM26340g = c11900zE1.m26340g(zzm.zze);
                CurrentLocationRequest currentLocationRequest = (CurrentLocationRequest) obj3;
                AbstractC0933Op abstractC0933Op = (AbstractC0933Op) this.f12178c;
                if (!zM26340g) {
                    ListenerHolder listenerHolderCreateListenerHolder = ListenerHolders.createListenerHolder(new C10494oD1(c11900zE1, s81), RF1.f10096a, "GetCurrentLocation");
                    ListenerHolder.ListenerKey listenerKey = listenerHolderCreateListenerHolder.getListenerKey();
                    listenerKey.getClass();
                    TZ1 tz1 = new TZ1();
                    tz1.f11430a = listenerHolderCreateListenerHolder;
                    tz1.f11431b = s81;
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
                    c11900zE1.m26344k(tz1, builder.build(), s812);
                    s812.f10598a.mo11135b(new GQ0(12, s81));
                    if (abstractC0933Op != null) {
                        GQ0 gq0 = new GQ0(10, new C8389Ur1(c11900zE1, 5, listenerKey));
                        ((FA1) abstractC0933Op).f3084a.mo11138e(Y81.f14171a, gq0);
                        break;
                    }
                } else {
                    InterfaceC9254eX1 interfaceC9254eX1 = (InterfaceC9254eX1) c11900zE1.getService();
                    BinderC10238mD1 binderC10238mD1 = new BinderC10238mD1(1, s81);
                    C8863bW1 c8863bW12 = (C8863bW1) interfaceC9254eX1;
                    Parcel parcelZza2 = c8863bW12.zza();
                    LC1.m4925c(parcelZza2, currentLocationRequest);
                    LC1.m4926d(parcelZza2, binderC10238mD1);
                    Parcel parcelZzb = c8863bW12.zzb(87, parcelZza2);
                    ICancelToken iCancelTokenAsInterface = ICancelToken.Stub.asInterface(parcelZzb.readStrongBinder());
                    parcelZzb.recycle();
                    if (abstractC0933Op != null) {
                        GQ0 gq02 = new GQ0(10, new C11287uQ0(iCancelTokenAsInterface));
                        ((FA1) abstractC0933Op).f3084a.mo11138e(Y81.f14171a, gq02);
                        break;
                    }
                }
                break;
        }
    }

    @Override // p000.InterfaceC9435fy0
    /* renamed from: b */
    public void mo8196b() {
        try {
            ((C11900zE1) this.f12177b).m26337d((ListenerHolder.ListenerKey) this.f12178c, true, new S81());
        } catch (RemoteException unused) {
        }
    }

    /* renamed from: c */
    public String m8197c(ArrayList arrayList) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C11485vz0 c11485vz0 = (C11485vz0) it.next();
            O90.m5968f(c11485vz0, "remoteMetricsEventDto");
            JSONObject jSONObject2 = new JSONObject();
            C8284Sr0 c8284Sr0 = c11485vz0.f44627e;
            jSONObject2.put("event_name", c8284Sr0.f11010a);
            String str = c11485vz0.f44625c;
            jSONObject2.put("user_id", str);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(AnalyticsBaseParamsConstantsKt.PACKAGE_NAME, c11485vz0.f44623a);
            String str2 = c11485vz0.f44626d;
            if (str2 == null) {
                str2 = null;
            }
            jSONObject3.put(AttributionReporter.APP_VERSION, str2);
            jSONObject3.put("userIdSdk", str);
            jSONObject3.put(CrashHianalyticsData.TIME, String.valueOf(c8284Sr0.f11012c));
            for (Map.Entry entry : c8284Sr0.f11011b.entrySet()) {
                jSONObject3.put((String) entry.getKey(), (String) entry.getValue());
            }
            jSONObject2.put("params", jSONObject3);
            String string = jSONObject2.toString();
            O90.m5967e(string, "jsonObject.toString()");
            jSONArray.put(new JSONObject(string));
        }
        jSONObject.put("events", jSONArray);
        String string2 = jSONObject.toString();
        O90.m5967e(string2, "jsonObject.toString()");
        return string2;
    }

    /* renamed from: d */
    public HttpsURLConnection m8198d() throws ProtocolException {
        F71 f71 = (F71) this.f12178c;
        URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(((URL) f71.getValue()).openConnection());
        O90.m5966d(uRLConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) uRLConnection;
        URL url = (URL) f71.getValue();
        O90.m5967e(url, "backendUrl");
        httpsURLConnection.setHostnameVerifier(new C7969Mp1(url, 1));
        httpsURLConnection.setRequestMethod("POST");
        httpsURLConnection.setRequestProperty("content-type", "application/json");
        httpsURLConnection.setRequestProperty("X-Metrics-Request-Time", String.valueOf(System.currentTimeMillis()));
        httpsURLConnection.setConnectTimeout(20000);
        httpsURLConnection.setReadTimeout(20000);
        httpsURLConnection.setDoOutput(true);
        return httpsURLConnection;
    }

    public /* synthetic */ C8389Ur1(C11738xy1 c11738xy1, PendingIntent pendingIntent, SleepSegmentRequest sleepSegmentRequest) {
        this.f12176a = 3;
        this.f12177b = pendingIntent;
        this.f12178c = sleepSegmentRequest;
    }

    public C8389Ur1(C4049fN c4049fN, C7616Fv0 c7616Fv0, C7564Ev0 c7564Ev0) {
        this.f12176a = 2;
        this.f12177b = c4049fN;
        this.f12178c = AbstractC0705LB.m4915b(new S51(16, this));
    }

    public C8389Ur1(InterfaceC8439Vq1 interfaceC8439Vq1, Logger logger) {
        this.f12176a = 0;
        O90.m5968f(logger, "logger");
        this.f12177b = interfaceC8439Vq1;
        this.f12178c = AbstractC0705LB.m4915b(new C7053w5(logger, 29, this));
    }

    public C8389Ur1(C8907bs1 c8907bs1) {
        this.f12176a = 6;
        this.f12178c = new C11979zs0();
        this.f12177b = c8907bs1;
        NV1.m5729D();
    }

    public C8389Ur1(ClientIdCallback clientIdCallback, Logger logger) {
        this.f12176a = 1;
        this.f12177b = clientIdCallback;
        this.f12178c = logger.createLogger("ClientIdDataSource");
    }
}
