package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.Promise;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.Task;
import com.vk.push.common.Logger;
import com.vk.push.core.domain.repository.MetadataRepository;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.BufferUnderflowException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import javax.net.ssl.HttpsURLConnection;
import kotlin.Pair;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class N8 implements O7, InterfaceC6777r61, InterfaceC7668vn, InterfaceC7110ss, InterfaceC7986xS0, InterfaceC0243Cw0, QA0, InterfaceC6187o11, InterfaceC3372dL, RemoteCall {
    public static final Object d = new Object();
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ N8(int i, boolean z) {
        this.a = i;
    }

    public static String p(int i) {
        if (i == 0) {
            return ":camera:camera-extensions-EXTENSION_MODE_NONE";
        }
        if (i == 1) {
            return ":camera:camera-extensions-EXTENSION_MODE_BOKEH";
        }
        if (i == 2) {
            return ":camera:camera-extensions-EXTENSION_MODE_HDR";
        }
        if (i == 3) {
            return ":camera:camera-extensions-EXTENSION_MODE_NIGHT";
        }
        if (i == 4) {
            return ":camera:camera-extensions-EXTENSION_MODE_FACE_RETOUCH";
        }
        if (i == 5) {
            return ":camera:camera-extensions-EXTENSION_MODE_AUTO";
        }
        throw new IllegalArgumentException("Invalid extension mode!");
    }

    @Override // defpackage.InterfaceC7668vn
    public void a(C6263oQ c6263oQ) {
        Integer num;
        CaptureResult captureResult = (CaptureResult) this.c;
        AbstractC8235ym.a(this, c6263oQ);
        try {
            Integer num2 = (Integer) captureResult.get(CaptureResult.JPEG_ORIENTATION);
            if (num2 != null) {
                c6263oQ.g(num2.intValue());
            }
        } catch (BufferUnderflowException unused) {
            AbstractC0759Jm0.f("C2CameraCaptureResult");
        }
        Long l = (Long) captureResult.get(CaptureResult.SENSOR_EXPOSURE_TIME);
        if (l != null) {
            c6263oQ.d(l.longValue());
        }
        Float f = (Float) captureResult.get(CaptureResult.LENS_APERTURE);
        if (f != null) {
            c6263oQ.c(c6263oQ.a, "FNumber", String.valueOf(f.floatValue()));
        }
        Integer numValueOf = (Integer) captureResult.get(CaptureResult.SENSOR_SENSITIVITY);
        if (numValueOf != null) {
            if (Build.VERSION.SDK_INT >= 24 && (num = (Integer) captureResult.get(CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST)) != null) {
                numValueOf = Integer.valueOf(numValueOf.intValue() * ((int) (num.intValue() / 100.0f)));
            }
            c6263oQ.f(numValueOf.intValue());
        }
        Float f2 = (Float) captureResult.get(CaptureResult.LENS_FOCAL_LENGTH);
        if (f2 != null) {
            c6263oQ.e(f2.floatValue());
        }
        Integer num3 = (Integer) captureResult.get(CaptureResult.CONTROL_AWB_MODE);
        if (num3 != null) {
            c6263oQ.h(num3.intValue() == 0 ? 2 : 1);
        }
    }

    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public void accept(Object obj, Object obj2) {
        Api.ClientKey clientKey = RB1.a;
        ((C8325zE1) obj).l((NB1) this.b, (LocationRequest) this.c, (S81) obj2);
    }

    @Override // defpackage.InterfaceC7668vn
    public C6974s81 b() {
        return (C6974s81) this.b;
    }

    public W02 c() throws JSONException {
        String str;
        HttpsURLConnection httpsURLConnectionD;
        String string;
        C3383dO1 c3383dO1 = (C3383dO1) ((C1304Qm0) this.b).b;
        String strC = AbstractC7728w51.c("\n            SELECT * FROM metrics_event_table\n            LIMIT 10\n        ");
        ArrayList arrayList = new ArrayList();
        Cursor cursorRawQuery = ((SQLiteDatabase) ((F71) c3383dO1.c).getValue()).rawQuery(strC, new String[0]);
        try {
            int columnIndexOrThrow = cursorRawQuery.getColumnIndexOrThrow(CommonUrlParts.UUID);
            int columnIndexOrThrow2 = cursorRawQuery.getColumnIndexOrThrow("metrics_event");
            while (cursorRawQuery.moveToNext()) {
                String string2 = cursorRawQuery.getString(columnIndexOrThrow);
                O90.e(string2, "cursor.getString(uuidColumnIndex)");
                byte[] blob = cursorRawQuery.getBlob(columnIndexOrThrow2);
                O90.e(blob, "cursor.getBlob(serializedMetricsEventColumnIndex)");
                arrayList.add(new C6485pa0(string2, blob));
            }
            HttpsURLConnection httpsURLConnection = null;
            AbstractC2141aT1.a(cursorRawQuery, null);
            List<C6485pa0> listB0 = AbstractC8069xu.b0(arrayList);
            ArrayList arrayList2 = new ArrayList(AbstractC8449zu.k(listB0));
            for (C6485pa0 c6485pa0 : listB0) {
                O90.f(c6485pa0, "dto");
                String str2 = c6485pa0.a;
                JSONObject jSONObject = new JSONObject(D51.h(c6485pa0.b));
                String string3 = jSONObject.getString("name");
                O90.e(string3, "jsonObject.getString(NAME_KEY)");
                JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                O90.e(jSONObject2, "jsonObject.getJSONObject(DATA_KEY)");
                ArrayList arrayList3 = new ArrayList();
                Iterator<String> itKeys = jSONObject2.keys();
                O90.e(itKeys, "keys()");
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    arrayList3.add(new Pair(next, jSONObject2.get(next).toString()));
                }
                arrayList2.add(new C5457kC(str2, new C1475Sr0(string3, AbstractC7096sn0.n(arrayList3), jSONObject.getLong(CrashHianalyticsData.TIME))));
            }
            if (arrayList2.isEmpty()) {
                return C5758lm1.a;
            }
            T71 t71 = (T71) this.c;
            String packageName = ((Context) ((C1304Qm0) t71.b).b).getPackageName();
            O90.e(packageName, "context.packageName");
            G10 g10 = (G10) t71.a;
            SharedPreferences sharedPreferences = (SharedPreferences) ((C7409uQ0) g10.b).a;
            O90.e(sharedPreferences, "sharedPreferences");
            String string4 = sharedPreferences.getString("USER_ID_KEY", null);
            if (string4 == null) {
                string4 = null;
            }
            if (string4 == null) {
                synchronized (G10.d) {
                    SharedPreferences sharedPreferences2 = (SharedPreferences) ((C7409uQ0) g10.b).a;
                    O90.e(sharedPreferences2, "sharedPreferences");
                    string = sharedPreferences2.getString("USER_ID_KEY", null);
                    if (string == null) {
                        string = null;
                    }
                    if (string == null) {
                        string = UUID.randomUUID().toString();
                        O90.e(string, "randomUUID().toString()");
                        SharedPreferences sharedPreferences3 = (SharedPreferences) ((C7409uQ0) g10.b).a;
                        O90.e(sharedPreferences3, "sharedPreferences");
                        SharedPreferences.Editor editorEdit = sharedPreferences3.edit();
                        editorEdit.putString("USER_ID_KEY", string);
                        editorEdit.apply();
                    }
                }
                str = string;
            } else {
                str = string4;
            }
            C5397jt1 c5397jt1 = (C5397jt1) ((F71) ((C2192ak1) t71.d).c).getValue();
            String str3 = c5397jt1 != null ? c5397jt1.a : null;
            ArrayList arrayList4 = new ArrayList(AbstractC8449zu.k(arrayList2));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                C5457kC c5457kC = (C5457kC) it.next();
                arrayList4.add(new C7705vz0(packageName, c5457kC.a, str, str3, c5457kC.b));
            }
            C1632Ur1 c1632Ur1 = (C1632Ur1) ((C0136Bm1) t71.c).b;
            try {
                String strC2 = c1632Ur1.c(arrayList4);
                httpsURLConnectionD = c1632Ur1.d();
                OutputStream outputStream = httpsURLConnectionD.getOutputStream();
                try {
                    byte[] bytes = strC2.getBytes(AbstractC7680vr.a);
                    O90.e(bytes, "this as java.lang.String).getBytes(charset)");
                    outputStream.write(bytes);
                    outputStream.flush();
                    AbstractC2141aT1.a(outputStream, null);
                } finally {
                }
            } catch (Throwable th) {
                th = th;
            }
            try {
                httpsURLConnectionD.getURL();
                httpsURLConnectionD.getResponseCode();
                httpsURLConnectionD.getRequestProperty("X-Metrics-Request-Time");
                httpsURLConnectionD.disconnect();
                return new C5949mm1(arrayList2);
            } catch (Throwable th2) {
                th = th2;
                httpsURLConnection = httpsURLConnectionD;
                try {
                    throw new C1553Tr0("Http request was failed", th);
                } catch (Throwable th3) {
                    if (httpsURLConnection != null) {
                        httpsURLConnection.disconnect();
                    }
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                AbstractC2141aT1.a(cursorRawQuery, th4);
                throw th5;
            }
        }
    }

    @Override // defpackage.InterfaceC7986xS0
    public void d(Object obj) {
        AbstractC8446zt abstractC8446ztO;
        C0213Cm0 c0213Cm0 = (C0213Cm0) this.c;
        C1732Vz c1732Vz = (C1732Vz) this.b;
        c0213Cm0.getClass();
        synchronized (c0213Cm0) {
            c0213Cm0.c(c1732Vz);
            c0213Cm0.k(c1732Vz);
            abstractC8446ztO = c0213Cm0.o(c1732Vz);
        }
        AbstractC8446zt.p(abstractC8446ztO);
        c0213Cm0.m();
        c0213Cm0.l();
    }

    public void e() {
        synchronized (d) {
            while (true) {
                W02 w02C = ((N8) this.c).c();
                if (!w02C.equals(C5758lm1.a)) {
                    if (w02C instanceof C5949mm1) {
                        ((C1304Qm0) this.b).t(((C5949mm1) w02C).a);
                    }
                }
            }
        }
    }

    @Override // defpackage.InterfaceC6187o11
    public void e0(KK kk) {
        ((InterfaceC6187o11) this.b).e0(kk);
    }

    public void f() {
        this.b = null;
        this.c = null;
    }

    public AbstractC8446zt g(int i, int i2, Bitmap.Config config) {
        O90.f(config, "bitmapConfig");
        int iC = AbstractC6699qi.c(i, i2, config);
        InterfaceC5744li interfaceC5744li = (InterfaceC5744li) this.b;
        Bitmap bitmap = (Bitmap) interfaceC5744li.get(iC);
        if (bitmap.getAllocationByteCount() < AbstractC6699qi.b(config) * i * i2) {
            throw new IllegalStateException("Check failed.");
        }
        bitmap.reconfigure(i, i2, config);
        UE ueS = AbstractC8446zt.S(bitmap, interfaceC5744li, (G10) ((C1016Mu0) this.c).b);
        O90.e(ueS, "closeableReferenceFactor…reate(bitmap, bitmapPool)");
        return ueS;
    }

    @Override // defpackage.InterfaceC6777r61, javax.inject.Provider
    public Object get() {
        C7253tc c7253tc = (C7253tc) this.b;
        int i = c7253tc.c;
        if (i == -1) {
            AbstractC0759Jm0.f("AudioConfigUtil");
            i = 5;
        } else {
            AbstractC0759Jm0.f("AudioConfigUtil");
        }
        int i2 = c7253tc.b;
        if (i2 == -1) {
            AbstractC0759Jm0.f("AudioConfigUtil");
            i2 = 2;
        } else {
            AbstractC0759Jm0.f("AudioConfigUtil");
        }
        C8018xd c8018xd = (C8018xd) this.c;
        int i3 = c8018xd.e;
        int i4 = c7253tc.e;
        if (i4 == -1) {
            AbstractC0759Jm0.f("AudioSrcAdPrflRslvr");
        } else {
            AbstractC0759Jm0.f("AudioSrcAdPrflRslvr");
            i3 = i4;
        }
        int iC = AbstractC3573eO1.c(c7253tc.d, i3, i2, c8018xd.d);
        AbstractC0759Jm0.f("AudioSrcAdPrflRslvr");
        List list = C7062sc.e;
        T71 t71 = new T71();
        t71.a = -1;
        t71.b = -1;
        t71.c = -1;
        t71.d = -1;
        t71.a = Integer.valueOf(i);
        t71.d = Integer.valueOf(i2);
        t71.c = Integer.valueOf(i3);
        t71.b = Integer.valueOf(iC);
        return t71.y();
    }

    @Override // defpackage.InterfaceC7668vn
    public long getTimestamp() {
        Long l = (Long) ((CaptureResult) this.c).get(CaptureResult.SENSOR_TIMESTAMP);
        if (l == null) {
            return -1L;
        }
        return l.longValue();
    }

    @Override // defpackage.InterfaceC7668vn
    public EnumC7286tn h() {
        Integer num = (Integer) ((CaptureResult) this.c).get(CaptureResult.CONTROL_AWB_STATE);
        EnumC7286tn enumC7286tn = EnumC7286tn.a;
        if (num == null) {
            return enumC7286tn;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            return EnumC7286tn.b;
        }
        if (iIntValue == 1) {
            return EnumC7286tn.c;
        }
        if (iIntValue == 2) {
            return EnumC7286tn.d;
        }
        if (iIntValue == 3) {
            return EnumC7286tn.e;
        }
        AbstractC0759Jm0.f("C2CameraCaptureResult");
        return enumC7286tn;
    }

    @Override // defpackage.InterfaceC7668vn
    public int i() {
        Integer num = (Integer) ((CaptureResult) this.c).get(CaptureResult.FLASH_STATE);
        if (num == null) {
            return 1;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0 || iIntValue == 1) {
            return 2;
        }
        if (iIntValue == 2) {
            return 3;
        }
        if (iIntValue == 3 || iIntValue == 4) {
            return 4;
        }
        AbstractC0759Jm0.f("C2CameraCaptureResult");
        return 1;
    }

    @Override // defpackage.InterfaceC7110ss
    public C6919rs j(C0074As c0074As) {
        O90.f(c0074As, "classId");
        LI li = (LI) this.c;
        O90.f(li.c().c, "<this>");
        C7977xP0 c7977xP0D = AbstractC6960s4.d((C1562Tu0) this.b, c0074As, C6112nd0.g);
        if (c7977xP0D == null) {
            return null;
        }
        VO0.a(c7977xP0D.a).equals(c0074As);
        return li.f(c7977xP0D);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [Vg0, nZ] */
    public Object k(Class cls) {
        O90.f(cls, "key");
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.c;
        Object obj = concurrentHashMap.get(cls);
        if (obj != null) {
            return obj;
        }
        Object objInvoke = ((AbstractC1676Vg0) this.b).invoke(cls);
        Object objPutIfAbsent = concurrentHashMap.putIfAbsent(cls, objInvoke);
        return objPutIfAbsent == null ? objInvoke : objPutIfAbsent;
    }

    public C7641ve l(C8265yw c8265yw) throws JSONException, C6660qV {
        String string;
        JSONArray jSONArray = c8265yw.g;
        long j = c8265yw.f;
        HashSet hashSet = new HashSet();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String string2 = jSONObject.getString("rolloutId");
                JSONArray jSONArray2 = jSONObject.getJSONArray("affectedParameterKeys");
                if (jSONArray2.length() > 1) {
                    String.format("Rollout has multiple affected parameter keys.Only the first key will be included in RolloutsState. rolloutId: %s, affectedParameterKeys: %s", string2, jSONArray2);
                }
                String strOptString = jSONArray2.optString(0, "");
                C8265yw c8265ywD = ((C8075xw) this.b).d();
                String string3 = null;
                if (c8265ywD == null) {
                    string = null;
                } else {
                    try {
                        string = c8265ywD.b.getString(strOptString);
                    } catch (JSONException unused) {
                    }
                }
                if (string == null) {
                    C8265yw c8265ywD2 = ((C8075xw) this.c).d();
                    if (c8265ywD2 != null) {
                        try {
                            string3 = c8265ywD2.b.getString(strOptString);
                        } catch (JSONException unused2) {
                        }
                    }
                    string = string3 != null ? string3 : "";
                }
                int i2 = AbstractC5318jT0.a;
                C7068se c7068se = new C7068se();
                if (string2 == null) {
                    throw new NullPointerException("Null rolloutId");
                }
                c7068se.a = string2;
                String string4 = jSONObject.getString("variantId");
                if (string4 == null) {
                    throw new NullPointerException("Null variantId");
                }
                c7068se.b = string4;
                if (strOptString == null) {
                    throw new NullPointerException("Null parameterKey");
                }
                c7068se.c = strOptString;
                c7068se.d = string;
                c7068se.e = j;
                c7068se.f = (byte) (c7068se.f | 1);
                hashSet.add(c7068se.a());
            } catch (JSONException e) {
                throw new C6660qV("Exception parsing rollouts metadata to create RolloutsState.", e);
            }
        }
        return new C7641ve(hashSet);
    }

    @Override // defpackage.InterfaceC3372dL
    public void m() {
        C6258oO0 c6258oO0 = (C6258oO0) this.b;
        synchronized (c6258oO0) {
            c6258oO0.c = c6258oO0.a.length;
        }
    }

    public Task n() {
        C8385zY1 c8385zY1 = (C8385zY1) this.b;
        Task taskDoRead = c8385zY1.b.isGooglePlayServicesAvailable(c8385zY1.a, 212800000) == 0 ? c8385zY1.doRead(TaskApiCall.builder().setFeatures(AbstractC5853mG1.a).run(new C7192tH1()).setAutoResolveMissingFeatures(false).setMethodKey(27601).build()) : AbstractC3782fU1.d(new ApiException(new Status(17)));
        A61 a61 = new A61(11, this);
        C3892g32 c3892g32 = (C3892g32) taskDoRead;
        c3892g32.getClass();
        return c3892g32.g(Y81.a, a61);
    }

    @Override // defpackage.InterfaceC7668vn
    public EnumC6904rn o() {
        Integer num = (Integer) ((CaptureResult) this.c).get(CaptureResult.CONTROL_AE_STATE);
        EnumC6904rn enumC6904rn = EnumC6904rn.a;
        if (num == null) {
            return enumC6904rn;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            return EnumC6904rn.b;
        }
        if (iIntValue != 1) {
            if (iIntValue == 2) {
                return EnumC6904rn.e;
            }
            if (iIntValue == 3) {
                return EnumC6904rn.f;
            }
            if (iIntValue == 4) {
                return EnumC6904rn.d;
            }
            if (iIntValue != 5) {
                AbstractC0759Jm0.f("C2CameraCaptureResult");
                return enumC6904rn;
            }
        }
        return EnumC6904rn.c;
    }

    @Override // defpackage.InterfaceC6187o11
    public void onError(Throwable th) {
        O90.f(th, "e");
        ((InterfaceC6187o11) this.b).onError(th);
    }

    @Override // defpackage.QA0
    public boolean onRequestPermissionsResult(int i, String[] strArr, int[] iArr) throws Exception {
        if (i == 1) {
            int i2 = 0;
            while (true) {
                int length = strArr.length;
                Promise promise = (Promise) this.b;
                if (i2 < length) {
                    String str = strArr[i2];
                    if (iArr[i2] == -1) {
                        if (str.equals("android.permission.CAMERA")) {
                            promise.reject("E_NO_CAMERA_PERMISSION", "User did not grant camera permission.");
                        } else if (str.equals("android.permission.WRITE_EXTERNAL_STORAGE")) {
                            promise.reject("E_NO_LIBRARY_PERMISSION", "User did not grant library permission.");
                        } else {
                            promise.reject("E_NO_LIBRARY_PERMISSION", "Required permission missing");
                        }
                        return true;
                    }
                    i2++;
                } else {
                    try {
                        ((Callable) this.c).call();
                        break;
                    } catch (Exception e) {
                        promise.reject("E_CALLBACK_ERROR", "Unknown error", e);
                    }
                }
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [Vg0, nZ] */
    @Override // defpackage.InterfaceC6187o11
    public void onSuccess(Object obj) {
        Object objB;
        try {
            ((C4265i11) this.c).c.invoke(obj);
            objB = C1518Tf1.a;
        } catch (Throwable th) {
            objB = RQ1.b(th);
        }
        boolean z = objB instanceof OS0;
        InterfaceC6187o11 interfaceC6187o11 = (InterfaceC6187o11) this.b;
        if (!z) {
            interfaceC6187o11.onSuccess(obj);
        }
        Throwable thA = PS0.a(objB);
        if (thA != null) {
            interfaceC6187o11.onError(thA);
        }
    }

    public synchronized Map q() {
        try {
            if (((Map) this.c) == null) {
                this.c = Collections.unmodifiableMap(new HashMap((HashMap) this.b));
            }
        } catch (Throwable th) {
            throw th;
        }
        return (Map) this.c;
    }

    public C8455zw r() {
        if (((C8455zw) this.c) == null) {
            this.c = new C8455zw(this);
        }
        return (C8455zw) this.c;
    }

    @Override // defpackage.InterfaceC3372dL
    public void s(InterfaceC5935mi interfaceC5935mi, Bitmap bitmap) throws IOException {
        IOException iOException = ((UP) this.c).b;
        if (iOException != null) {
            if (bitmap == null) {
                throw iOException;
            }
            interfaceC5935mi.i(bitmap);
            throw iOException;
        }
    }

    @Override // defpackage.InterfaceC7668vn
    public CaptureResult t() {
        return (CaptureResult) this.c;
    }

    public String toString() {
        switch (this.a) {
            case 24:
                return ((String) this.b) + ", " + ((String) this.c);
            default:
                return super.toString();
        }
    }

    @Override // defpackage.InterfaceC7668vn
    public EnumC7095sn u() {
        Integer num = (Integer) ((CaptureResult) this.c).get(CaptureResult.CONTROL_AF_STATE);
        EnumC7095sn enumC7095sn = EnumC7095sn.a;
        if (num == null) {
            return enumC7095sn;
        }
        switch (num.intValue()) {
            case 0:
                break;
            case 1:
            case 3:
                break;
            case 2:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            default:
                AbstractC0759Jm0.f("C2CameraCaptureResult");
                break;
        }
        return enumC7095sn;
    }

    public void v(int i, Bundle bundle) {
        Locale locale = Locale.US;
        bundle.toString();
        String string = bundle.getString("name");
        if (string != null) {
            Bundle bundle2 = bundle.getBundle("params");
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            X3 x3 = "clx".equals(bundle2.getString("_o")) ? (C6860rY0) this.b : (G10) this.c;
            if (x3 == null) {
                return;
            }
            x3.i(bundle2, string);
        }
    }

    public void w(Class cls, Class cls2, Class cls3, List list) {
        synchronized (((C7925x8) this.c)) {
            ((C7925x8) this.c).put(new C4047gt0(cls, cls2, cls3), list);
        }
    }

    public /* synthetic */ N8(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public N8(Context context, int i) {
        C6846rT1 c6846rT1;
        this.a = i;
        switch (i) {
            case 9:
                this.b = context;
                return;
            case 10:
                this.b = context;
                this.c = null;
                return;
            default:
                this.b = new C8385zY1(context, GoogleApiAvailabilityLight.getInstance());
                synchronized (C6846rT1.class) {
                    try {
                        Preconditions.checkNotNull(context, "Context must not be null");
                        if (C6846rT1.e == null) {
                            C6846rT1.e = new C6846rT1(context.getApplicationContext(), 0);
                        }
                        c6846rT1 = C6846rT1.e;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                this.c = c6846rT1;
                return;
        }
    }

    public N8(Context context, Logger logger) {
        this.a = 25;
        O90.f(logger, "logger");
        this.b = context;
        this.c = logger;
    }

    public N8(MetadataRepository metadataRepository, A61 a61, C3738fG c3738fG) {
        this.a = 26;
        this.b = metadataRepository;
        this.c = Logger.DefaultImpls.createLogger(c3738fG, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public N8(InterfaceC6099nZ interfaceC6099nZ) {
        this.a = 7;
        this.b = (AbstractC1676Vg0) interfaceC6099nZ;
        this.c = new ConcurrentHashMap();
    }

    public N8(InterfaceC5744li interfaceC5744li, C1016Mu0 c1016Mu0) {
        this.a = 0;
        O90.f(c1016Mu0, "closeableReferenceFactory");
        this.b = interfaceC5744li;
        this.c = c1016Mu0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public N8(TotalCaptureResult totalCaptureResult) {
        this(C6974s81.b, 5, totalCaptureResult);
        this.a = 5;
    }

    public N8(InterfaceC0296Do interfaceC0296Do) {
        this.a = 11;
        this.b = interfaceC0296Do;
        this.c = new C6799rE(24);
    }

    public N8(Map map) {
        this.a = 17;
        this.b = map;
        this.c = new C1922Yk0("Java nullability annotation states").c(new C8277z(28, this));
    }

    public N8(Handler handler) {
        this.a = 6;
        this.b = new HashMap();
        this.c = handler;
    }

    public N8(JavaScriptExecutorFactory javaScriptExecutorFactory, JSBundleLoader jSBundleLoader) {
        this.a = 19;
        UN1.c(javaScriptExecutorFactory);
        this.b = javaScriptExecutorFactory;
        UN1.c(jSBundleLoader);
        this.c = jSBundleLoader;
    }

    public N8(C0213Cm0 c0213Cm0, C1732Vz c1732Vz) {
        this.a = 15;
        this.c = c0213Cm0;
        this.b = c1732Vz;
    }

    public N8(int i) {
        this.a = i;
        switch (i) {
            case 13:
                this.b = new HashMap();
                break;
            case 16:
                this.b = new AtomicReference();
                this.c = new C7925x8();
                break;
            default:
                this.b = new Rect();
                this.c = new Rect();
                break;
        }
    }
}
