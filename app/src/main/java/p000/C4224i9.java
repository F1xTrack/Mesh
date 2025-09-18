package p000;

import android.content.ContentValues;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import android.util.Log;
import android.util.Size;
import android.view.View;
import androidx.camera.extensions.C1691a;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.uimanager.UIManagerModule;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import com.huawei.hms.push.AttributionReporter;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.UnexpectedException;
import expo.modules.kotlin.jni.JNIAsyncFunctionBody;
import expo.modules.kotlin.jni.JNIFunctionBody;
import expo.modules.kotlin.jni.PromiseImpl;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: i9 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C4224i9 implements JNIAsyncFunctionBody, InterfaceC6471n9, InterfaceC1319Uy, InterfaceC8216Rj0, InterfaceC11886z71, InterfaceC0363Fl, InterfaceC9968k61, Y61, InterfaceC8712aL0, InterfaceC9307ey0, InterfaceC11423vU0, JNIFunctionBody, InterfaceC7431Cg1 {

    /* renamed from: a */
    public final /* synthetic */ int f28836a;

    /* renamed from: b */
    public final /* synthetic */ Object f28837b;

    /* renamed from: c */
    public final /* synthetic */ Object f28838c;

    /* renamed from: d */
    public final /* synthetic */ Object f28839d;

    public /* synthetic */ C4224i9(int i, Object obj, Object obj2, String str) {
        this.f28836a = i;
        this.f28838c = obj;
        this.f28837b = str;
        this.f28839d = obj2;
    }

    @Override // p000.InterfaceC7431Cg1
    /* renamed from: a */
    public Object mo1269a() {
        Class cls = (Class) this.f28839d;
        O90.m5968f(cls, "$clazz");
        return ((Method) this.f28837b).invoke(this.f28838c, cls);
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x01d9 A[Catch: all -> 0x0042, TryCatch #1 {all -> 0x0042, CameraAccessException -> 0x01d0, blocks: (B:67:0x001c, B:73:0x002b, B:74:0x003f, B:78:0x0045, B:79:0x004b, B:81:0x0051, B:82:0x0066, B:83:0x00c4, B:85:0x00ca, B:86:0x00e2, B:87:0x0101, B:89:0x0107, B:91:0x0123, B:92:0x0136, B:93:0x0140, B:95:0x0160, B:97:0x0164, B:98:0x016d, B:99:0x018e, B:101:0x0194, B:102:0x01a4, B:104:0x01c1, B:105:0x01c6, B:106:0x01ce, B:109:0x01d1, B:110:0x01d7, B:112:0x01d9, B:113:0x01ee), top: B:119:0x001c }] */
    @Override // p000.InterfaceC6471n9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p000.InterfaceFutureC7800Jj0 apply(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 498
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C4224i9.apply(java.lang.Object):Jj0");
    }

    @Override // p000.Y61
    /* renamed from: b */
    public void mo3134b(C0922Oe c0922Oe) {
        AbstractC9559gw0 abstractC9559gw0;
        C7978Mu0 c7978Mu0 = (C7978Mu0) this.f28837b;
        c7978Mu0.getClass();
        Objects.toString(c0922Oe);
        AbstractC7806Jm0.m4412f("PreviewView");
        boolean z = ((InterfaceC6972uo) this.f28838c).mo1341o().mo2398j() == 0;
        C10237mD0 c10237mD0 = (C10237mD0) c7978Mu0.f7393b;
        C9725iD0 c9725iD0 = c10237mD0.f37555d;
        Size size = ((Z61) this.f28839d).f14738b;
        c9725iD0.getClass();
        Objects.toString(c0922Oe);
        Objects.toString(size);
        AbstractC7806Jm0.m4412f("PreviewTransform");
        c9725iD0.f28961b = c0922Oe.f8547a;
        c9725iD0.f28962c = c0922Oe.f8548b;
        int i = c0922Oe.f8549c;
        c9725iD0.f28964e = i;
        c9725iD0.f28960a = size;
        c9725iD0.f28965f = z;
        c9725iD0.f28966g = c0922Oe.f8550d;
        c9725iD0.f28963d = c0922Oe.f8551e;
        if (i == -1 || ((abstractC9559gw0 = c10237mD0.f37553b) != null && (abstractC9559gw0 instanceof C8941c71))) {
            c10237mD0.f37556e = true;
        } else {
            c10237mD0.f37556e = false;
        }
        c10237mD0.m22704a();
    }

    /* renamed from: c */
    public void m18973c() {
        C9597hD0 c9597hD0;
        AtomicReference atomicReference = ((C10237mD0) ((C7978Mu0) this.f28837b).f7393b).f37558g;
        while (true) {
            c9597hD0 = (C9597hD0) this.f28838c;
            if (atomicReference.compareAndSet(c9597hD0, null)) {
                c9597hD0.m18785b(EnumC10109lD0.f36974a);
                break;
            } else if (atomicReference.get() != c9597hD0) {
                break;
            }
        }
        C1043QZ c1043qz = c9597hD0.f28321e;
        if (c1043qz != null) {
            c1043qz.cancel(false);
            c9597hD0.f28321e = null;
        }
        ((InterfaceC6972uo) this.f28839d).mo1327a().mo1481l(c9597hD0);
    }

    @Override // p000.InterfaceC11886z71
    public Object execute() {
        C7127xG c7127xG = (C7127xG) this.f28837b;
        C11677xU0 c11677xU0 = (C11677xU0) c7127xG.f45504d;
        c11677xU0.getClass();
        C1236Te c1236Te = (C1236Te) this.f28838c;
        C0166Cd c0166Cd = (C0166Cd) this.f28839d;
        if (Log.isLoggable(AbstractC7858Km0.m4712b("SQLiteEventStore"), 3)) {
            new StringBuilder("Storing event with priority=").append(c1236Te.f11452c);
        }
        ((Long) c11677xU0.m25902o(new C4224i9(c11677xU0, c0166Cd, c1236Te, 17))).getClass();
        c7127xG.f45501a.m7045a(c1236Te, 1, false);
        return null;
    }

    @Override // p000.InterfaceC0363Fl
    /* renamed from: h0 */
    public Object mo411h0(C0300El c0300El) {
        switch (this.f28836a) {
            case 6:
                C0584JG c0584jg = (C0584JG) this.f28837b;
                c0584jg.getClass();
                c0584jg.m4267b(new RunnableC6757rf(c0584jg, (C0149CM) this.f28838c, (Map) this.f28839d, c0300El, 6), new RunnableC0004A3(1));
                return "Init GlRenderer";
            case 7:
                C0489Hl c0489Hl = (C0489Hl) this.f28837b;
                RunnableC0204DE runnableC0204DE = new RunnableC0204DE(6, c0489Hl);
                ExecutorC10151lY0 executorC10151lY0 = (ExecutorC10151lY0) this.f28838c;
                c0300El.m2374a(runnableC0204DE, executorC10151lY0);
                AbstractC8301Sz1.m7478a(c0489Hl, new C7391Bm1(14, c0300El), executorC10151lY0);
                return "surfaceList[" + ((List) this.f28839d) + "]";
            case 8:
                C6421mM c6421mM = (C6421mM) this.f28837b;
                c6421mM.getClass();
                c6421mM.m22809b(new RunnableC6757rf(c6421mM, (C0149CM) this.f28838c, (Map) this.f28839d, c0300El, 7), new RunnableC0004A3(1));
                return "Init GlRenderer";
            case 9:
                C1691a.m9901f((C4018et) this.f28837b, (ReactContext) this.f28838c, (CD0) this.f28839d, c0300El);
                return "Initialize extensions";
            default:
                ((C9597hD0) this.f28837b).getClass();
                InterfaceC6766ro interfaceC6766ro = (InterfaceC6766ro) this.f28838c;
                C6384lm c6384lm = new C6384lm(c0300El, interfaceC6766ro);
                ((ArrayList) this.f28839d).add(c6384lm);
                interfaceC6766ro.mo2407s(QR1.m6703a(), c6384lm);
                return "waitForCaptureResult";
        }
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [Vg0, nZ] */
    @Override // expo.modules.kotlin.jni.JNIFunctionBody
    public Object invoke(Object[] objArr) throws C6281k8 {
        C0134C7 c0134c7 = (C0134C7) this.f28839d;
        C11505w71 c11505w71 = (C11505w71) this.f28838c;
        O90.m5968f(c11505w71, "this$0");
        String str = (String) this.f28837b;
        O90.m5968f(objArr, "args");
        try {
            return S20.m7154l(c11505w71.f44683d.invoke(c11505w71.m5540c(objArr, c0134c7)), C4049fN.f27159d);
        } catch (Throwable th) {
            throw new C6281k8(c11505w71.f7489a, str, !(th instanceof CodedException) ? th instanceof AbstractC6266ju ? new CodedException(((AbstractC6266ju) th).mo2811a(), th.getMessage(), th.getCause()) : new UnexpectedException(th.toString(), th) : (CodedException) th);
        }
    }

    @Override // p000.InterfaceC9307ey0
    public void onSuccess(Object obj) throws JSONException {
        Task task = (Task) this.f28838c;
        C6869tA c6869tA = (C6869tA) this.f28839d;
        C10919rY0 c10919rY0 = (C10919rY0) this.f28837b;
        c10919rY0.getClass();
        try {
            C7232yw c7232yw = (C7232yw) task.mo11142i();
            if (c7232yw != null) {
                ((Executor) c10919rY0.f41730d).execute(new RunnableC10269mT0(c6869tA, ((C0827N8) c10919rY0.f41729c).m5560l(c7232yw), 1));
            }
        } catch (C6747rV unused) {
        }
    }

    @Override // p000.InterfaceC1319Uy
    public Object then(Task task) {
        URL url;
        C7232yw c7232yw;
        switch (this.f28836a) {
            case 2:
                C0563Iw c0563Iw = (C0563Iw) this.f28837b;
                c0563Iw.getClass();
                C9450g32 c9450g32 = (C9450g32) this.f28838c;
                if (!c9450g32.mo11144k()) {
                    return AbstractC9376fU1.m18243d(new C6684qV("Firebase Installations failed to get installation auth token for config update listener connection.", c9450g32.mo11141h()));
                }
                C9450g32 c9450g322 = (C9450g32) this.f28839d;
                if (!c9450g322.mo11144k()) {
                    return AbstractC9376fU1.m18243d(new C6684qV("Firebase Installations failed to get installation ID for config update listener connection.", c9450g322.mo11141h()));
                }
                try {
                    try {
                        url = new URL(c0563Iw.m4078c(c0563Iw.f5221l));
                    } catch (MalformedURLException unused) {
                        url = null;
                    }
                    HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                    c0563Iw.m4083j(httpURLConnection, (String) c9450g322.mo11142i(), ((C1172Sd) c9450g32.mo11142i()).f10878a);
                    return AbstractC9376fU1.m18244e(httpURLConnection);
                } catch (IOException e) {
                    return AbstractC9376fU1.m18243d(new C6684qV("Failed to open HTTP stream connection", e));
                }
            case 3:
                boolean zMo11144k = task.mo11144k();
                S81 s81 = (S81) this.f28837b;
                if (zMo11144k) {
                    s81.m7186d(task.mo11142i());
                } else if (task.mo11141h() != null) {
                    s81.m7185c(task.mo11141h());
                } else if (((AtomicBoolean) this.f28838c).getAndSet(true)) {
                    ((G10) this.f28839d).m2909y();
                }
                return AbstractC9376fU1.m18244e(null);
            default:
                C6621pV c6621pV = (C6621pV) this.f28837b;
                c6621pV.getClass();
                Task task2 = (Task) this.f28838c;
                if (!task2.mo11144k() || task2.mo11142i() == null) {
                    return AbstractC9376fU1.m18244e(Boolean.FALSE);
                }
                C7232yw c7232yw2 = (C7232yw) task2.mo11142i();
                Task task3 = (Task) this.f28839d;
                return (task3.mo11144k() && (c7232yw = (C7232yw) task3.mo11142i()) != null && c7232yw2.f46544c.equals(c7232yw.f46544c)) ? AbstractC9376fU1.m18244e(Boolean.FALSE) : c6621pV.f40118e.m26007f(c7232yw2).mo11139f(c6621pV.f40116c, new C6556oV(c6621pV));
        }
    }

    public /* synthetic */ C4224i9(C1514Y3 c1514y3, C9535gk0 c9535gk0, C11081sp0 c11081sp0, IOException iOException, boolean z) {
        this.f28836a = 4;
        this.f28837b = c1514y3;
        this.f28838c = c11081sp0;
        this.f28839d = iOException;
    }

    public /* synthetic */ C4224i9(C0489Hl c0489Hl, ExecutorC10151lY0 executorC10151lY0, List list) {
        this.f28836a = 7;
        this.f28837b = c0489Hl;
        this.f28838c = executorC10151lY0;
        this.f28839d = list;
    }

    public /* synthetic */ C4224i9(Object obj, Object obj2, Object obj3, int i) {
        this.f28836a = i;
        this.f28837b = obj;
        this.f28838c = obj2;
        this.f28839d = obj3;
    }

    public /* synthetic */ C4224i9(WeakReference weakReference, String str, AbstractC1049Qf abstractC1049Qf, C0134C7 c0134c7, int i) {
        this.f28836a = i;
        this.f28837b = str;
        this.f28838c = abstractC1049Qf;
        this.f28839d = c0134c7;
    }

    @Override // expo.modules.kotlin.jni.JNIAsyncFunctionBody
    public void invoke(Object[] objArr, PromiseImpl promiseImpl) throws C6861t2 {
        C1068Qy c1068Qy;
        switch (this.f28836a) {
            case 0:
                String str = (String) this.f28837b;
                C6599p9 c6599p9 = (C6599p9) this.f28838c;
                O90.m5968f(c6599p9, "this$0");
                C0134C7 c0134c7 = (C0134C7) this.f28839d;
                O90.m5968f(objArr, "args");
                O90.m5968f(promiseImpl, "promiseImpl");
                C6219j9 c6219j9 = new C6219j9(promiseImpl, c6599p9, str, objArr, c0134c7, 0);
                int iOrdinal = c6599p9.f9708d.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        return;
                    }
                    AbstractC9366fP1.m18230b(c0134c7.f1206k, null, new C6345l9(c6219j9, null), 3);
                    return;
                }
                C0887O5[] c0887o5Arr = c6599p9.f7490b;
                int length = c0887o5Arr.length;
                boolean z = false;
                int i = 0;
                while (true) {
                    if (i < length) {
                        InterfaceC8412Vd0 interfaceC8412Vd0 = c0887o5Arr[i].f8215a.f12693a;
                        if (!(interfaceC8412Vd0 instanceof InterfaceC8412Vd0)) {
                            interfaceC8412Vd0 = null;
                        }
                        if (interfaceC8412Vd0 == null ? false : View.class.isAssignableFrom(P22.m6213b(interfaceC8412Vd0))) {
                            z = true;
                        } else {
                            i++;
                        }
                    }
                }
                if (z) {
                    ReactApplicationContext reactApplicationContext = (ReactApplicationContext) c0134c7.f1197b.get();
                    if (reactApplicationContext != null) {
                        UIManager uIManagerM6095f = OZ1.m6095f(reactApplicationContext, R02.m6874b(1), true);
                        O90.m5966d(uIManagerM6095f, "null cannot be cast to non-null type com.facebook.react.uimanager.UIManagerModule");
                        ((UIManagerModule) uIManagerM6095f).addUIBlock(new C0071B7(0, c6219j9));
                        return;
                    }
                    throw new C6861t2(9);
                }
                AbstractC9366fP1.m18230b(c0134c7.f1207l, null, new C6408m9(c6219j9, null), 3);
                return;
            default:
                String str2 = (String) this.f28837b;
                C9330f71 c9330f71 = (C9330f71) this.f28838c;
                O90.m5968f(c9330f71, "this$0");
                C0134C7 c0134c72 = (C0134C7) this.f28839d;
                O90.m5968f(objArr, "args");
                O90.m5968f(promiseImpl, "promiseImpl");
                int iOrdinal2 = c9330f71.f9708d.ordinal();
                if (iOrdinal2 == 0) {
                    c1068Qy = c0134c72.f1207l;
                } else if (iOrdinal2 == 1) {
                    c1068Qy = c0134c72.f1206k;
                } else {
                    throw new C6838sg();
                }
                AbstractC9366fP1.m18230b(c1068Qy, null, new C9074d71(promiseImpl, c9330f71, str2, objArr, null), 3);
                return;
        }
    }

    @Override // p000.InterfaceC8216Rj0
    public void invoke(Object obj) {
        ((InterfaceC1577Z3) obj).mo2247i((C1514Y3) this.f28837b, (C11081sp0) this.f28838c, (IOException) this.f28839d);
    }

    @Override // p000.InterfaceC9968k61
    public Task then(Object obj) {
        String string;
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f28838c;
        String str = (String) this.f28837b;
        C8937c51 c8937c51 = (C8937c51) this.f28839d;
        String str2 = (String) obj;
        LL0 ll0M11308d = FirebaseMessaging.m11308d(firebaseMessaging.f18469b);
        String strM11310e = firebaseMessaging.m11310e();
        String strM2801a = firebaseMessaging.f18476i.m2801a();
        synchronized (ll0M11308d) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            int i = C8937c51.f17296e;
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("token", str2);
                jSONObject.put(AttributionReporter.APP_VERSION, strM2801a);
                jSONObject.put("timestamp", jCurrentTimeMillis);
                string = jSONObject.toString();
            } catch (JSONException e) {
                e.toString();
                string = null;
            }
            if (string != null) {
                SharedPreferences.Editor editorEdit = ll0M11308d.f6615a.edit();
                editorEdit.putString(LL0.m4955a(strM11310e, str), string);
                editorEdit.commit();
            }
        }
        if (c8937c51 == null || !str2.equals(c8937c51.f17297a)) {
            C0786MU c0786mu = firebaseMessaging.f18468a;
            c0786mu.m5379a();
            if ("[DEFAULT]".equals(c0786mu.f7175b)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    c0786mu.m5379a();
                }
                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                intent.putExtra("token", str2);
                new C7967Mo1(firebaseMessaging.f18469b, 1).m5454w(intent);
            }
        }
        return AbstractC9376fU1.m18244e(str2);
    }

    /* JADX WARN: Finally extract failed */
    @Override // p000.InterfaceC11423vU0
    /* renamed from: apply */
    public Object mo26597apply(Object obj) {
        long jInsert;
        C7135xO c7135xO;
        C11677xU0 c11677xU0;
        C7135xO c7135xO2;
        EnumC9921jl0 enumC9921jl0;
        EnumC9921jl0 enumC9921jl02;
        int i = 5;
        int i2 = 4;
        int i3 = 3;
        EnumC9921jl0 enumC9921jl03 = EnumC9921jl0.CACHE_FULL;
        int i4 = 2;
        Object obj2 = this.f28839d;
        int i5 = 0;
        Object obj3 = this.f28838c;
        Object obj4 = this.f28837b;
        int i6 = 1;
        switch (this.f28836a) {
            case 17:
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                C11677xU0 c11677xU02 = (C11677xU0) obj4;
                long jSimpleQueryForLong = c11677xU02.m25901m().compileStatement("PRAGMA page_size").simpleQueryForLong() * c11677xU02.m25901m().compileStatement("PRAGMA page_count").simpleQueryForLong();
                C0229Dd c0229Dd = c11677xU02.f45658d;
                long j = c0229Dd.f2084a;
                C0166Cd c0166Cd = (C0166Cd) obj3;
                String str = c0166Cd.f1483a;
                if (jSimpleQueryForLong >= j) {
                    c11677xU02.m25904w(1L, enumC9921jl03, str);
                    return -1L;
                }
                C1236Te c1236Te = (C1236Te) obj2;
                Long lM25900n = C11677xU0.m25900n(sQLiteDatabase, c1236Te);
                if (lM25900n != null) {
                    jInsert = lM25900n.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", c1236Te.f11450a);
                    contentValues.put("priority", Integer.valueOf(AbstractC11770yD0.m26100a(c1236Te.f11452c)));
                    contentValues.put("next_request_ms", (Integer) 0);
                    byte[] bArr = c1236Te.f11451b;
                    if (bArr != null) {
                        contentValues.put("extras", Base64.encodeToString(bArr, 0));
                    }
                    jInsert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                C1597ZN c1597zn = c0166Cd.f1485c;
                byte[] bArr2 = c1597zn.f14871b;
                int length = bArr2.length;
                int i7 = c0229Dd.f2088e;
                boolean z = length <= i7;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(jInsert));
                contentValues2.put("transport_name", str);
                contentValues2.put("timestamp_ms", Long.valueOf(c0166Cd.f1486d));
                contentValues2.put("uptime_ms", Long.valueOf(c0166Cd.f1487e));
                contentValues2.put("payload_encoding", c1597zn.f14870a.f45570a);
                contentValues2.put("code", c0166Cd.f1484b);
                contentValues2.put("num_attempts", (Integer) 0);
                contentValues2.put("inline", Boolean.valueOf(z));
                contentValues2.put("payload", z ? bArr2 : new byte[0]);
                contentValues2.put("product_id", c0166Cd.f1489g);
                contentValues2.put("pseudonymous_id", c0166Cd.f1490h);
                contentValues2.put("experiment_ids_clear_blob", c0166Cd.f1491i);
                contentValues2.put("experiment_ids_encrypted_blob", c0166Cd.f1492j);
                long jInsert2 = sQLiteDatabase.insert("events", null, contentValues2);
                if (!z) {
                    int iCeil = (int) Math.ceil(bArr2.length / i7);
                    for (int i8 = 1; i8 <= iCeil; i8++) {
                        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr2, (i8 - 1) * i7, Math.min(i8 * i7, bArr2.length));
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("event_id", Long.valueOf(jInsert2));
                        contentValues3.put("sequence_num", Integer.valueOf(i8));
                        contentValues3.put("bytes", bArrCopyOfRange);
                        sQLiteDatabase.insert("event_payloads", null, contentValues3);
                    }
                }
                for (Map.Entry entry : Collections.unmodifiableMap(c0166Cd.f1488f).entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("event_id", Long.valueOf(jInsert2));
                    contentValues4.put("name", (String) entry.getKey());
                    contentValues4.put("value", (String) entry.getValue());
                    sQLiteDatabase.insert("event_metadata", null, contentValues4);
                }
                return Long.valueOf(jInsert2);
            case 18:
                Cursor cursor = (Cursor) obj;
                C11677xU0 c11677xU03 = (C11677xU0) obj4;
                c11677xU03.getClass();
                while (cursor.moveToNext()) {
                    long j2 = cursor.getLong(0);
                    int i9 = cursor.getInt(7) != 0 ? i6 : 0;
                    C0103Bd c0103Bd = new C0103Bd();
                    c0103Bd.f947f = new HashMap();
                    String string = cursor.getString(i6);
                    if (string != null) {
                        c0103Bd.f942a = string;
                        c0103Bd.f945d = Long.valueOf(cursor.getLong(i4));
                        c0103Bd.f946e = Long.valueOf(cursor.getLong(3));
                        if (i9 != 0) {
                            String string2 = cursor.getString(4);
                            if (string2 == null) {
                                c7135xO2 = C11677xU0.f45654f;
                            } else {
                                c7135xO2 = new C7135xO(string2);
                            }
                            c0103Bd.f944c = new C1597ZN(c7135xO2, cursor.getBlob(5));
                            c11677xU0 = c11677xU03;
                        } else {
                            String string3 = cursor.getString(4);
                            if (string3 == null) {
                                c7135xO = C11677xU0.f45654f;
                            } else {
                                c7135xO = new C7135xO(string3);
                            }
                            Cursor cursorQuery = c11677xU03.m25901m().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j2)}, null, null, "sequence_num");
                            try {
                                ArrayList arrayList = new ArrayList();
                                int length2 = 0;
                                while (cursorQuery.moveToNext()) {
                                    byte[] blob = cursorQuery.getBlob(0);
                                    arrayList.add(blob);
                                    length2 += blob.length;
                                }
                                byte[] bArr3 = new byte[length2];
                                int i10 = 0;
                                int length3 = 0;
                                while (i10 < arrayList.size()) {
                                    byte[] bArr4 = (byte[]) arrayList.get(i10);
                                    ArrayList arrayList2 = arrayList;
                                    C11677xU0 c11677xU04 = c11677xU03;
                                    System.arraycopy(bArr4, 0, bArr3, length3, bArr4.length);
                                    length3 += bArr4.length;
                                    i10++;
                                    arrayList = arrayList2;
                                    c11677xU03 = c11677xU04;
                                }
                                c11677xU0 = c11677xU03;
                                cursorQuery.close();
                                c0103Bd.f944c = new C1597ZN(c7135xO, bArr3);
                            } catch (Throwable th) {
                                cursorQuery.close();
                                throw th;
                            }
                        }
                        if (!cursor.isNull(6)) {
                            c0103Bd.f943b = Integer.valueOf(cursor.getInt(6));
                        }
                        if (!cursor.isNull(8)) {
                            c0103Bd.f948g = Integer.valueOf(cursor.getInt(8));
                        }
                        if (!cursor.isNull(9)) {
                            c0103Bd.f949h = cursor.getString(9);
                        }
                        if (!cursor.isNull(10)) {
                            c0103Bd.f950i = cursor.getBlob(10);
                        }
                        if (!cursor.isNull(11)) {
                            c0103Bd.f951j = cursor.getBlob(11);
                        }
                        ((ArrayList) obj3).add(new C4255ie(j2, (C1236Te) obj2, c0103Bd.m779b()));
                        c11677xU03 = c11677xU0;
                        i4 = 2;
                        i6 = 1;
                    } else {
                        throw new NullPointerException("Null transportName");
                    }
                }
                return null;
            default:
                Cursor cursor2 = (Cursor) obj;
                C11677xU0 c11677xU05 = (C11677xU0) obj4;
                c11677xU05.getClass();
                while (true) {
                    HashMap map = (HashMap) obj3;
                    if (cursor2.moveToNext()) {
                        String string4 = cursor2.getString(i5);
                        int i11 = cursor2.getInt(1);
                        EnumC9921jl0 enumC9921jl04 = EnumC9921jl0.REASON_UNKNOWN;
                        if (i11 != 0) {
                            if (i11 == 1) {
                                enumC9921jl04 = EnumC9921jl0.MESSAGE_TOO_OLD;
                            } else if (i11 == 2) {
                                enumC9921jl0 = enumC9921jl03;
                                enumC9921jl02 = enumC9921jl0;
                            } else if (i11 == i3) {
                                enumC9921jl04 = EnumC9921jl0.PAYLOAD_TOO_BIG;
                            } else if (i11 == i2) {
                                enumC9921jl04 = EnumC9921jl0.MAX_RETRIES_REACHED;
                            } else if (i11 == i) {
                                enumC9921jl04 = EnumC9921jl0.INVALID_PAYLOD;
                            } else if (i11 == 6) {
                                enumC9921jl04 = EnumC9921jl0.SERVER_ERROR;
                            } else {
                                AbstractC7858Km0.m4711a(Integer.valueOf(i11), "SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN");
                            }
                            enumC9921jl02 = enumC9921jl03;
                            enumC9921jl0 = enumC9921jl04;
                        } else {
                            enumC9921jl02 = enumC9921jl03;
                            enumC9921jl0 = enumC9921jl04;
                        }
                        long j3 = cursor2.getLong(2);
                        if (!map.containsKey(string4)) {
                            map.put(string4, new ArrayList());
                        }
                        ((List) map.get(string4)).add(new C10049kl0(j3, enumC9921jl0));
                        enumC9921jl03 = enumC9921jl02;
                        i = 5;
                        i2 = 4;
                        i3 = 3;
                        i5 = 0;
                    } else {
                        Iterator it = map.entrySet().iterator();
                        while (true) {
                            C10919rY0 c10919rY0 = (C10919rY0) obj2;
                            if (it.hasNext()) {
                                Map.Entry entry2 = (Map.Entry) it.next();
                                int i12 = C10305ml0.f37859c;
                                new ArrayList();
                                ((ArrayList) c10919rY0.f41730d).add(new C10305ml0((String) entry2.getKey(), Collections.unmodifiableList((List) entry2.getValue())));
                            } else {
                                final long jMo2451d = c11677xU05.f45656b.mo2451d();
                                SQLiteDatabase sQLiteDatabaseM25901m = c11677xU05.m25901m();
                                sQLiteDatabaseM25901m.beginTransaction();
                                try {
                                    C11563wa1 c11563wa1 = (C11563wa1) C11677xU0.m25899D(sQLiteDatabaseM25901m.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new InterfaceC11423vU0() { // from class: uU0
                                        @Override // p000.InterfaceC11423vU0
                                        /* renamed from: apply */
                                        public final Object mo26597apply(Object obj5) {
                                            Cursor cursor3 = (Cursor) obj5;
                                            cursor3.moveToNext();
                                            return new C11563wa1(cursor3.getLong(0), jMo2451d);
                                        }
                                    });
                                    sQLiteDatabaseM25901m.setTransactionSuccessful();
                                    sQLiteDatabaseM25901m.endTransaction();
                                    c10919rY0.f41729c = c11563wa1;
                                    c10919rY0.f41731e = new H10(new C8681a51(c11677xU05.m25901m().compileStatement("PRAGMA page_size").simpleQueryForLong() * c11677xU05.m25901m().compileStatement("PRAGMA page_count").simpleQueryForLong(), C0229Dd.f2083f.f2084a));
                                    c10919rY0.f41728b = (String) c11677xU05.f45659e.get();
                                    return new C3955dt((C11563wa1) c10919rY0.f41729c, Collections.unmodifiableList((ArrayList) c10919rY0.f41730d), (H10) c10919rY0.f41731e, (String) c10919rY0.f41728b);
                                } catch (Throwable th2) {
                                    sQLiteDatabaseM25901m.endTransaction();
                                    throw th2;
                                }
                            }
                        }
                    }
                }
        }
    }
}
