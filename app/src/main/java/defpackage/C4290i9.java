package defpackage;

import android.content.ContentValues;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import android.util.Log;
import android.util.Size;
import android.view.View;
import androidx.camera.extensions.a;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.uimanager.UIManagerModule;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
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
public final /* synthetic */ class C4290i9 implements JNIAsyncFunctionBody, InterfaceC6021n9, InterfaceC1651Uy, InterfaceC1373Rj0, InterfaceC8304z71, InterfaceC0443Fl, InterfaceC5441k61, Y61, InterfaceC2116aL0, InterfaceC3680ey0, InterfaceC7612vU0, JNIFunctionBody, InterfaceC0196Cg1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ C4290i9(int i, Object obj, Object obj2, String str) {
        this.a = i;
        this.c = obj;
        this.b = str;
        this.d = obj2;
    }

    @Override // defpackage.InterfaceC0196Cg1
    public Object a() {
        Class cls = (Class) this.d;
        O90.f(cls, "$clazz");
        return ((Method) this.b).invoke(this.c, cls);
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x01d9 A[Catch: all -> 0x0042, TryCatch #1 {all -> 0x0042, CameraAccessException -> 0x01d0, blocks: (B:67:0x001c, B:73:0x002b, B:74:0x003f, B:78:0x0045, B:79:0x004b, B:81:0x0051, B:82:0x0066, B:83:0x00c4, B:85:0x00ca, B:86:0x00e2, B:87:0x0101, B:89:0x0107, B:91:0x0123, B:92:0x0136, B:93:0x0140, B:95:0x0160, B:97:0x0164, B:98:0x016d, B:99:0x018e, B:101:0x0194, B:102:0x01a4, B:104:0x01c1, B:105:0x01c6, B:106:0x01ce, B:109:0x01d1, B:110:0x01d7, B:112:0x01d9, B:113:0x01ee), top: B:119:0x001c }] */
    @Override // defpackage.InterfaceC6021n9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public defpackage.InterfaceFutureC0750Jj0 apply(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 498
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4290i9.apply(java.lang.Object):Jj0");
    }

    @Override // defpackage.Y61
    public void b(C1123Oe c1123Oe) {
        AbstractC4056gw0 abstractC4056gw0;
        C1016Mu0 c1016Mu0 = (C1016Mu0) this.b;
        c1016Mu0.getClass();
        Objects.toString(c1123Oe);
        AbstractC0759Jm0.f("PreviewView");
        boolean z = ((InterfaceC7480uo) this.c).o().j() == 0;
        C5843mD0 c5843mD0 = (C5843mD0) c1016Mu0.b;
        C4303iD0 c4303iD0 = c5843mD0.d;
        Size size = ((Z61) this.d).b;
        c4303iD0.getClass();
        Objects.toString(c1123Oe);
        Objects.toString(size);
        AbstractC0759Jm0.f("PreviewTransform");
        c4303iD0.b = c1123Oe.a;
        c4303iD0.c = c1123Oe.b;
        int i = c1123Oe.c;
        c4303iD0.e = i;
        c4303iD0.a = size;
        c4303iD0.f = z;
        c4303iD0.g = c1123Oe.d;
        c4303iD0.d = c1123Oe.e;
        if (i == -1 || ((abstractC4056gw0 = c5843mD0.b) != null && (abstractC4056gw0 instanceof C2456c71))) {
            c5843mD0.e = true;
        } else {
            c5843mD0.e = false;
        }
        c5843mD0.a();
    }

    public void c() {
        C4112hD0 c4112hD0;
        AtomicReference atomicReference = ((C5843mD0) ((C1016Mu0) this.b).b).g;
        while (true) {
            c4112hD0 = (C4112hD0) this.c;
            if (atomicReference.compareAndSet(c4112hD0, null)) {
                c4112hD0.b(EnumC5652lD0.a);
                break;
            } else if (atomicReference.get() != c4112hD0) {
                break;
            }
        }
        QZ qz = c4112hD0.e;
        if (qz != null) {
            qz.cancel(false);
            c4112hD0.e = null;
        }
        ((InterfaceC7480uo) this.d).a().l(c4112hD0);
    }

    @Override // defpackage.InterfaceC8304z71
    public Object execute() {
        C7949xG c7949xG = (C7949xG) this.b;
        C7992xU0 c7992xU0 = (C7992xU0) c7949xG.d;
        c7992xU0.getClass();
        C1513Te c1513Te = (C1513Te) this.c;
        C0185Cd c0185Cd = (C0185Cd) this.d;
        if (Log.isLoggable(AbstractC0837Km0.b("SQLiteEventStore"), 3)) {
            new StringBuilder("Storing event with priority=").append(c1513Te.c);
        }
        ((Long) c7992xU0.o(new C4290i9(c7992xU0, c0185Cd, c1513Te, 17))).getClass();
        c7949xG.a.a(c1513Te, 1, false);
        return null;
    }

    @Override // defpackage.InterfaceC0443Fl
    public Object h0(C0365El c0365El) {
        switch (this.a) {
            case 6:
                JG jg = (JG) this.b;
                jg.getClass();
                jg.b(new RunnableC6880rf(jg, (CM) this.c, (Map) this.d, c0365El, 6), new A3(1));
                return "Init GlRenderer";
            case 7:
                C0599Hl c0599Hl = (C0599Hl) this.b;
                DE de = new DE(6, c0599Hl);
                ExecutorC5715lY0 executorC5715lY0 = (ExecutorC5715lY0) this.c;
                c0365El.a(de, executorC5715lY0);
                AbstractC1500Sz1.a(c0599Hl, new C0136Bm1(14, c0365El), executorC5715lY0);
                return "surfaceList[" + ((List) this.d) + "]";
            case 8:
                C5869mM c5869mM = (C5869mM) this.b;
                c5869mM.getClass();
                c5869mM.b(new RunnableC6880rf(c5869mM, (CM) this.c, (Map) this.d, c0365El, 7), new A3(1));
                return "Init GlRenderer";
            case 9:
                a.f((C3664et) this.b, (ReactContext) this.c, (CD0) this.d, c0365El);
                return "Initialize extensions";
            default:
                ((C4112hD0) this.b).getClass();
                InterfaceC6907ro interfaceC6907ro = (InterfaceC6907ro) this.c;
                C5756lm c5756lm = new C5756lm(c0365El, interfaceC6907ro);
                ((ArrayList) this.d).add(c5756lm);
                interfaceC6907ro.s(QR1.a(), c5756lm);
                return "waitForCaptureResult";
        }
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [Vg0, nZ] */
    @Override // expo.modules.kotlin.jni.JNIFunctionBody
    public Object invoke(Object[] objArr) throws C5445k8 {
        C7 c7 = (C7) this.d;
        C7734w71 c7734w71 = (C7734w71) this.c;
        O90.f(c7734w71, "this$0");
        String str = (String) this.b;
        O90.f(objArr, "args");
        try {
            return S20.l(c7734w71.d.invoke(c7734w71.c(objArr, c7)), C3759fN.d);
        } catch (Throwable th) {
            throw new C5445k8(c7734w71.a, str, !(th instanceof CodedException) ? th instanceof AbstractC5398ju ? new CodedException(((AbstractC5398ju) th).a(), th.getMessage(), th.getCause()) : new UnexpectedException(th.toString(), th) : (CodedException) th);
        }
    }

    @Override // defpackage.InterfaceC3680ey0
    public void onSuccess(Object obj) throws JSONException {
        Task task = (Task) this.c;
        C7169tA c7169tA = (C7169tA) this.d;
        C6860rY0 c6860rY0 = (C6860rY0) this.b;
        c6860rY0.getClass();
        try {
            C8265yw c8265yw = (C8265yw) task.i();
            if (c8265yw != null) {
                ((Executor) c6860rY0.d).execute(new RunnableC5891mT0(c7169tA, ((N8) c6860rY0.c).l(c8265yw), 1));
            }
        } catch (C6850rV unused) {
        }
    }

    @Override // defpackage.InterfaceC1651Uy
    public Object then(Task task) {
        URL url;
        C8265yw c8265yw;
        switch (this.a) {
            case 2:
                C0710Iw c0710Iw = (C0710Iw) this.b;
                c0710Iw.getClass();
                C3892g32 c3892g32 = (C3892g32) this.c;
                if (!c3892g32.k()) {
                    return AbstractC3782fU1.d(new C6660qV("Firebase Installations failed to get installation auth token for config update listener connection.", c3892g32.h()));
                }
                C3892g32 c3892g322 = (C3892g32) this.d;
                if (!c3892g322.k()) {
                    return AbstractC3782fU1.d(new C6660qV("Firebase Installations failed to get installation ID for config update listener connection.", c3892g322.h()));
                }
                try {
                    try {
                        url = new URL(c0710Iw.c(c0710Iw.l));
                    } catch (MalformedURLException unused) {
                        url = null;
                    }
                    HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                    c0710Iw.j(httpURLConnection, (String) c3892g322.i(), ((C1432Sd) c3892g32.i()).a);
                    return AbstractC3782fU1.e(httpURLConnection);
                } catch (IOException e) {
                    return AbstractC3782fU1.d(new C6660qV("Failed to open HTTP stream connection", e));
                }
            case 3:
                boolean zK = task.k();
                S81 s81 = (S81) this.b;
                if (zK) {
                    s81.d(task.i());
                } else if (task.h() != null) {
                    s81.c(task.h());
                } else if (((AtomicBoolean) this.c).getAndSet(true)) {
                    ((G10) this.d).y();
                }
                return AbstractC3782fU1.e(null);
            default:
                C6469pV c6469pV = (C6469pV) this.b;
                c6469pV.getClass();
                Task task2 = (Task) this.c;
                if (!task2.k() || task2.i() == null) {
                    return AbstractC3782fU1.e(Boolean.FALSE);
                }
                C8265yw c8265yw2 = (C8265yw) task2.i();
                Task task3 = (Task) this.d;
                return (task3.k() && (c8265yw = (C8265yw) task3.i()) != null && c8265yw2.c.equals(c8265yw.c)) ? AbstractC3782fU1.e(Boolean.FALSE) : c6469pV.e.f(c8265yw2).f(c6469pV.c, new C6278oV(c6469pV));
        }
    }

    public /* synthetic */ C4290i9(Y3 y3, C4020gk0 c4020gk0, C7102sp0 c7102sp0, IOException iOException, boolean z) {
        this.a = 4;
        this.b = y3;
        this.c = c7102sp0;
        this.d = iOException;
    }

    public /* synthetic */ C4290i9(C0599Hl c0599Hl, ExecutorC5715lY0 executorC5715lY0, List list) {
        this.a = 7;
        this.b = c0599Hl;
        this.c = executorC5715lY0;
        this.d = list;
    }

    public /* synthetic */ C4290i9(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ C4290i9(WeakReference weakReference, String str, AbstractC1282Qf abstractC1282Qf, C7 c7, int i) {
        this.a = i;
        this.b = str;
        this.c = abstractC1282Qf;
        this.d = c7;
    }

    @Override // expo.modules.kotlin.jni.JNIAsyncFunctionBody
    public void invoke(Object[] objArr, PromiseImpl promiseImpl) throws C7143t2 {
        C1339Qy c1339Qy;
        switch (this.a) {
            case 0:
                String str = (String) this.b;
                C6403p9 c6403p9 = (C6403p9) this.c;
                O90.f(c6403p9, "this$0");
                C7 c7 = (C7) this.d;
                O90.f(objArr, "args");
                O90.f(promiseImpl, "promiseImpl");
                C5257j9 c5257j9 = new C5257j9(promiseImpl, c6403p9, str, objArr, c7, 0);
                int iOrdinal = c6403p9.d.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        return;
                    }
                    AbstractC3767fP1.b(c7.k, null, new C5639l9(c5257j9, null), 3);
                    return;
                }
                O5[] o5Arr = c6403p9.b;
                int length = o5Arr.length;
                boolean z = false;
                int i = 0;
                while (true) {
                    if (i < length) {
                        InterfaceC1667Vd0 interfaceC1667Vd0 = o5Arr[i].a.a;
                        if (!(interfaceC1667Vd0 instanceof InterfaceC1667Vd0)) {
                            interfaceC1667Vd0 = null;
                        }
                        if (interfaceC1667Vd0 == null ? false : View.class.isAssignableFrom(P22.b(interfaceC1667Vd0))) {
                            z = true;
                        } else {
                            i++;
                        }
                    }
                }
                if (z) {
                    ReactApplicationContext reactApplicationContext = (ReactApplicationContext) c7.b.get();
                    if (reactApplicationContext != null) {
                        UIManager uIManagerF = OZ1.f(reactApplicationContext, R02.b(1), true);
                        O90.d(uIManagerF, "null cannot be cast to non-null type com.facebook.react.uimanager.UIManagerModule");
                        ((UIManagerModule) uIManagerF).addUIBlock(new B7(0, c5257j9));
                        return;
                    }
                    throw new C7143t2(9);
                }
                AbstractC3767fP1.b(c7.l, null, new C5830m9(c5257j9, null), 3);
                return;
            default:
                String str2 = (String) this.b;
                C3713f71 c3713f71 = (C3713f71) this.c;
                O90.f(c3713f71, "this$0");
                C7 c72 = (C7) this.d;
                O90.f(objArr, "args");
                O90.f(promiseImpl, "promiseImpl");
                int iOrdinal2 = c3713f71.d.ordinal();
                if (iOrdinal2 == 0) {
                    c1339Qy = c72.l;
                } else if (iOrdinal2 == 1) {
                    c1339Qy = c72.k;
                } else {
                    throw new C7074sg();
                }
                AbstractC3767fP1.b(c1339Qy, null, new C3332d71(promiseImpl, c3713f71, str2, objArr, null), 3);
                return;
        }
    }

    @Override // defpackage.InterfaceC1373Rj0
    public void invoke(Object obj) {
        ((Z3) obj).i((Y3) this.b, (C7102sp0) this.c, (IOException) this.d);
    }

    @Override // defpackage.InterfaceC5441k61
    public Task then(Object obj) {
        String string;
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.c;
        String str = (String) this.b;
        C2450c51 c2450c51 = (C2450c51) this.d;
        String str2 = (String) obj;
        LL0 ll0D = FirebaseMessaging.d(firebaseMessaging.b);
        String strE = firebaseMessaging.e();
        String strA = firebaseMessaging.i.a();
        synchronized (ll0D) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            int i = C2450c51.e;
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("token", str2);
                jSONObject.put(AttributionReporter.APP_VERSION, strA);
                jSONObject.put("timestamp", jCurrentTimeMillis);
                string = jSONObject.toString();
            } catch (JSONException e) {
                e.toString();
                string = null;
            }
            if (string != null) {
                SharedPreferences.Editor editorEdit = ll0D.a.edit();
                editorEdit.putString(LL0.a(strE, str), string);
                editorEdit.commit();
            }
        }
        if (c2450c51 == null || !str2.equals(c2450c51.a)) {
            MU mu = firebaseMessaging.a;
            mu.a();
            if ("[DEFAULT]".equals(mu.b)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    mu.a();
                }
                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                intent.putExtra("token", str2);
                new C0999Mo1(firebaseMessaging.b, 1).w(intent);
            }
        }
        return AbstractC3782fU1.e(str2);
    }

    /* JADX WARN: Finally extract failed */
    @Override // defpackage.InterfaceC7612vU0
    /* renamed from: apply */
    public Object mo3apply(Object obj) {
        long jInsert;
        C7973xO c7973xO;
        C7992xU0 c7992xU0;
        C7973xO c7973xO2;
        EnumC5372jl0 enumC5372jl0;
        EnumC5372jl0 enumC5372jl02;
        int i = 5;
        int i2 = 4;
        int i3 = 3;
        EnumC5372jl0 enumC5372jl03 = EnumC5372jl0.CACHE_FULL;
        int i4 = 2;
        Object obj2 = this.d;
        int i5 = 0;
        Object obj3 = this.c;
        Object obj4 = this.b;
        int i6 = 1;
        switch (this.a) {
            case 17:
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                C7992xU0 c7992xU02 = (C7992xU0) obj4;
                long jSimpleQueryForLong = c7992xU02.m().compileStatement("PRAGMA page_size").simpleQueryForLong() * c7992xU02.m().compileStatement("PRAGMA page_count").simpleQueryForLong();
                C0263Dd c0263Dd = c7992xU02.d;
                long j = c0263Dd.a;
                C0185Cd c0185Cd = (C0185Cd) obj3;
                String str = c0185Cd.a;
                if (jSimpleQueryForLong >= j) {
                    c7992xU02.w(1L, enumC5372jl03, str);
                    return -1L;
                }
                C1513Te c1513Te = (C1513Te) obj2;
                Long lN = C7992xU0.n(sQLiteDatabase, c1513Te);
                if (lN != null) {
                    jInsert = lN.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", c1513Te.a);
                    contentValues.put("priority", Integer.valueOf(AbstractC8131yD0.a(c1513Te.c)));
                    contentValues.put("next_request_ms", (Integer) 0);
                    byte[] bArr = c1513Te.b;
                    if (bArr != null) {
                        contentValues.put("extras", Base64.encodeToString(bArr, 0));
                    }
                    jInsert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                ZN zn = c0185Cd.c;
                byte[] bArr2 = zn.b;
                int length = bArr2.length;
                int i7 = c0263Dd.e;
                boolean z = length <= i7;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(jInsert));
                contentValues2.put("transport_name", str);
                contentValues2.put("timestamp_ms", Long.valueOf(c0185Cd.d));
                contentValues2.put("uptime_ms", Long.valueOf(c0185Cd.e));
                contentValues2.put("payload_encoding", zn.a.a);
                contentValues2.put("code", c0185Cd.b);
                contentValues2.put("num_attempts", (Integer) 0);
                contentValues2.put("inline", Boolean.valueOf(z));
                contentValues2.put("payload", z ? bArr2 : new byte[0]);
                contentValues2.put("product_id", c0185Cd.g);
                contentValues2.put("pseudonymous_id", c0185Cd.h);
                contentValues2.put("experiment_ids_clear_blob", c0185Cd.i);
                contentValues2.put("experiment_ids_encrypted_blob", c0185Cd.j);
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
                for (Map.Entry entry : Collections.unmodifiableMap(c0185Cd.f).entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("event_id", Long.valueOf(jInsert2));
                    contentValues4.put("name", (String) entry.getKey());
                    contentValues4.put("value", (String) entry.getValue());
                    sQLiteDatabase.insert("event_metadata", null, contentValues4);
                }
                return Long.valueOf(jInsert2);
            case 18:
                Cursor cursor = (Cursor) obj;
                C7992xU0 c7992xU03 = (C7992xU0) obj4;
                c7992xU03.getClass();
                while (cursor.moveToNext()) {
                    long j2 = cursor.getLong(0);
                    int i9 = cursor.getInt(7) != 0 ? i6 : 0;
                    C0107Bd c0107Bd = new C0107Bd();
                    c0107Bd.f = new HashMap();
                    String string = cursor.getString(i6);
                    if (string != null) {
                        c0107Bd.a = string;
                        c0107Bd.d = Long.valueOf(cursor.getLong(i4));
                        c0107Bd.e = Long.valueOf(cursor.getLong(3));
                        if (i9 != 0) {
                            String string2 = cursor.getString(4);
                            if (string2 == null) {
                                c7973xO2 = C7992xU0.f;
                            } else {
                                c7973xO2 = new C7973xO(string2);
                            }
                            c0107Bd.c = new ZN(c7973xO2, cursor.getBlob(5));
                            c7992xU0 = c7992xU03;
                        } else {
                            String string3 = cursor.getString(4);
                            if (string3 == null) {
                                c7973xO = C7992xU0.f;
                            } else {
                                c7973xO = new C7973xO(string3);
                            }
                            Cursor cursorQuery = c7992xU03.m().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j2)}, null, null, "sequence_num");
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
                                    C7992xU0 c7992xU04 = c7992xU03;
                                    System.arraycopy(bArr4, 0, bArr3, length3, bArr4.length);
                                    length3 += bArr4.length;
                                    i10++;
                                    arrayList = arrayList2;
                                    c7992xU03 = c7992xU04;
                                }
                                c7992xU0 = c7992xU03;
                                cursorQuery.close();
                                c0107Bd.c = new ZN(c7973xO, bArr3);
                            } catch (Throwable th) {
                                cursorQuery.close();
                                throw th;
                            }
                        }
                        if (!cursor.isNull(6)) {
                            c0107Bd.b = Integer.valueOf(cursor.getInt(6));
                        }
                        if (!cursor.isNull(8)) {
                            c0107Bd.g = Integer.valueOf(cursor.getInt(8));
                        }
                        if (!cursor.isNull(9)) {
                            c0107Bd.h = cursor.getString(9);
                        }
                        if (!cursor.isNull(10)) {
                            c0107Bd.i = cursor.getBlob(10);
                        }
                        if (!cursor.isNull(11)) {
                            c0107Bd.j = cursor.getBlob(11);
                        }
                        ((ArrayList) obj3).add(new C4383ie(j2, (C1513Te) obj2, c0107Bd.b()));
                        c7992xU03 = c7992xU0;
                        i4 = 2;
                        i6 = 1;
                    } else {
                        throw new NullPointerException("Null transportName");
                    }
                }
                return null;
            default:
                Cursor cursor2 = (Cursor) obj;
                C7992xU0 c7992xU05 = (C7992xU0) obj4;
                c7992xU05.getClass();
                while (true) {
                    HashMap map = (HashMap) obj3;
                    if (cursor2.moveToNext()) {
                        String string4 = cursor2.getString(i5);
                        int i11 = cursor2.getInt(1);
                        EnumC5372jl0 enumC5372jl04 = EnumC5372jl0.REASON_UNKNOWN;
                        if (i11 != 0) {
                            if (i11 == 1) {
                                enumC5372jl04 = EnumC5372jl0.MESSAGE_TOO_OLD;
                            } else if (i11 == 2) {
                                enumC5372jl0 = enumC5372jl03;
                                enumC5372jl02 = enumC5372jl0;
                            } else if (i11 == i3) {
                                enumC5372jl04 = EnumC5372jl0.PAYLOAD_TOO_BIG;
                            } else if (i11 == i2) {
                                enumC5372jl04 = EnumC5372jl0.MAX_RETRIES_REACHED;
                            } else if (i11 == i) {
                                enumC5372jl04 = EnumC5372jl0.INVALID_PAYLOD;
                            } else if (i11 == 6) {
                                enumC5372jl04 = EnumC5372jl0.SERVER_ERROR;
                            } else {
                                AbstractC0837Km0.a(Integer.valueOf(i11), "SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN");
                            }
                            enumC5372jl02 = enumC5372jl03;
                            enumC5372jl0 = enumC5372jl04;
                        } else {
                            enumC5372jl02 = enumC5372jl03;
                            enumC5372jl0 = enumC5372jl04;
                        }
                        long j3 = cursor2.getLong(2);
                        if (!map.containsKey(string4)) {
                            map.put(string4, new ArrayList());
                        }
                        ((List) map.get(string4)).add(new C5563kl0(j3, enumC5372jl0));
                        enumC5372jl03 = enumC5372jl02;
                        i = 5;
                        i2 = 4;
                        i3 = 3;
                        i5 = 0;
                    } else {
                        Iterator it = map.entrySet().iterator();
                        while (true) {
                            C6860rY0 c6860rY0 = (C6860rY0) obj2;
                            if (it.hasNext()) {
                                Map.Entry entry2 = (Map.Entry) it.next();
                                int i12 = C5945ml0.c;
                                new ArrayList();
                                ((ArrayList) c6860rY0.d).add(new C5945ml0((String) entry2.getKey(), Collections.unmodifiableList((List) entry2.getValue())));
                            } else {
                                final long jD = c7992xU05.b.d();
                                SQLiteDatabase sQLiteDatabaseM = c7992xU05.m();
                                sQLiteDatabaseM.beginTransaction();
                                try {
                                    C7821wa1 c7821wa1 = (C7821wa1) C7992xU0.D(sQLiteDatabaseM.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new InterfaceC7612vU0() { // from class: uU0
                                        @Override // defpackage.InterfaceC7612vU0
                                        /* renamed from: apply */
                                        public final Object mo3apply(Object obj5) {
                                            Cursor cursor3 = (Cursor) obj5;
                                            cursor3.moveToNext();
                                            return new C7821wa1(cursor3.getLong(0), jD);
                                        }
                                    });
                                    sQLiteDatabaseM.setTransactionSuccessful();
                                    sQLiteDatabaseM.endTransaction();
                                    c6860rY0.c = c7821wa1;
                                    c6860rY0.e = new H10(new C2069a51(c7992xU05.m().compileStatement("PRAGMA page_size").simpleQueryForLong() * c7992xU05.m().compileStatement("PRAGMA page_count").simpleQueryForLong(), C0263Dd.f.a));
                                    c6860rY0.b = (String) c7992xU05.e.get();
                                    return new C3473dt((C7821wa1) c6860rY0.c, Collections.unmodifiableList((ArrayList) c6860rY0.d), (H10) c6860rY0.e, (String) c6860rY0.b);
                                } catch (Throwable th2) {
                                    sQLiteDatabaseM.endTransaction();
                                    throw th2;
                                }
                            }
                        }
                    }
                }
        }
    }
}
