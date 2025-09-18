package p000;

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
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.p019vk.push.common.Logger;
import com.p019vk.push.core.domain.repository.MetadataRepository;
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

/* renamed from: N8 */
/* loaded from: classes.dex */
public final class C0827N8 implements InterfaceC0889O7, InterfaceC10864r61, InterfaceC7034vn, InterfaceC6850ss, InterfaceC11673xS0, InterfaceC7462Cw0, QA0, InterfaceC10467o11, InterfaceC3922dL, RemoteCall {

    /* renamed from: d */
    public static final Object f7521d = new Object();

    /* renamed from: a */
    public final /* synthetic */ int f7522a;

    /* renamed from: b */
    public Object f7523b;

    /* renamed from: c */
    public Object f7524c;

    public /* synthetic */ C0827N8(int i, boolean z) {
        this.f7522a = i;
    }

    /* renamed from: p */
    public static String m5554p(int i) {
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

    @Override // p000.InterfaceC7034vn
    /* renamed from: a */
    public void mo384a(C6551oQ c6551oQ) {
        Integer num;
        CaptureResult captureResult = (CaptureResult) this.f7524c;
        AbstractC7222ym.m26224a(this, c6551oQ);
        try {
            Integer num2 = (Integer) captureResult.get(CaptureResult.JPEG_ORIENTATION);
            if (num2 != null) {
                c6551oQ.m23400g(num2.intValue());
            }
        } catch (BufferUnderflowException unused) {
            AbstractC7806Jm0.m4412f("C2CameraCaptureResult");
        }
        Long l = (Long) captureResult.get(CaptureResult.SENSOR_EXPOSURE_TIME);
        if (l != null) {
            c6551oQ.m23397d(l.longValue());
        }
        Float f = (Float) captureResult.get(CaptureResult.LENS_APERTURE);
        if (f != null) {
            c6551oQ.m23396c(c6551oQ.f38994a, "FNumber", String.valueOf(f.floatValue()));
        }
        Integer numValueOf = (Integer) captureResult.get(CaptureResult.SENSOR_SENSITIVITY);
        if (numValueOf != null) {
            if (Build.VERSION.SDK_INT >= 24 && (num = (Integer) captureResult.get(CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST)) != null) {
                numValueOf = Integer.valueOf(numValueOf.intValue() * ((int) (num.intValue() / 100.0f)));
            }
            c6551oQ.m23399f(numValueOf.intValue());
        }
        Float f2 = (Float) captureResult.get(CaptureResult.LENS_FOCAL_LENGTH);
        if (f2 != null) {
            c6551oQ.m23398e(f2.floatValue());
        }
        Integer num3 = (Integer) captureResult.get(CaptureResult.CONTROL_AWB_MODE);
        if (num3 != null) {
            c6551oQ.m23401h(num3.intValue() == 0 ? 2 : 1);
        }
    }

    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public void accept(Object obj, Object obj2) {
        Api.ClientKey clientKey = RB1.f10059a;
        ((C11900zE1) obj).m26345l((NB1) this.f7523b, (LocationRequest) this.f7524c, (S81) obj2);
    }

    @Override // p000.InterfaceC7034vn
    /* renamed from: b */
    public C10996s81 mo385b() {
        return (C10996s81) this.f7523b;
    }

    /* renamed from: c */
    public W02 m5555c() throws JSONException {
        String str;
        HttpsURLConnection httpsURLConnectionM8198d;
        String string;
        C9108dO1 c9108dO1 = (C9108dO1) ((C8170Qm0) this.f7523b).f9780b;
        String strM25562c = AbstractC11501w51.m25562c("\n            SELECT * FROM metrics_event_table\n            LIMIT 10\n        ");
        ArrayList arrayList = new ArrayList();
        Cursor cursorRawQuery = ((SQLiteDatabase) ((F71) c9108dO1.f26013c).getValue()).rawQuery(strM25562c, new String[0]);
        try {
            int columnIndexOrThrow = cursorRawQuery.getColumnIndexOrThrow(CommonUrlParts.UUID);
            int columnIndexOrThrow2 = cursorRawQuery.getColumnIndexOrThrow("metrics_event");
            while (cursorRawQuery.moveToNext()) {
                String string2 = cursorRawQuery.getString(columnIndexOrThrow);
                O90.m5967e(string2, "cursor.getString(uuidColumnIndex)");
                byte[] blob = cursorRawQuery.getBlob(columnIndexOrThrow2);
                O90.m5967e(blob, "cursor.getBlob(serializedMetricsEventColumnIndex)");
                arrayList.add(new C10667pa0(string2, blob));
            }
            HttpsURLConnection httpsURLConnection = null;
            AbstractC8729aT1.m9749a(cursorRawQuery, null);
            List<C10667pa0> listM25982b0 = AbstractC7167xu.m25982b0(arrayList);
            ArrayList arrayList2 = new ArrayList(AbstractC7293zu.m26586k(listM25982b0));
            for (C10667pa0 c10667pa0 : listM25982b0) {
                O90.m5968f(c10667pa0, "dto");
                String str2 = c10667pa0.f40219a;
                JSONObject jSONObject = new JSONObject(D51.m1549h(c10667pa0.f40220b));
                String string3 = jSONObject.getString("name");
                O90.m5967e(string3, "jsonObject.getString(NAME_KEY)");
                JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                O90.m5967e(jSONObject2, "jsonObject.getJSONObject(DATA_KEY)");
                ArrayList arrayList3 = new ArrayList();
                Iterator<String> itKeys = jSONObject2.keys();
                O90.m5967e(itKeys, "keys()");
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    arrayList3.add(new Pair(next, jSONObject2.get(next).toString()));
                }
                arrayList2.add(new C6285kC(str2, new C8284Sr0(string3, AbstractC11077sn0.m24786n(arrayList3), jSONObject.getLong(CrashHianalyticsData.TIME))));
            }
            if (arrayList2.isEmpty()) {
                return C10180lm1.f37287a;
            }
            T71 t71 = (T71) this.f7524c;
            String packageName = ((Context) ((C8170Qm0) t71.f11174b).f9780b).getPackageName();
            O90.m5967e(packageName, "context.packageName");
            G10 g10 = (G10) t71.f11173a;
            SharedPreferences sharedPreferences = (SharedPreferences) ((C11287uQ0) g10.f3531b).f43693a;
            O90.m5967e(sharedPreferences, "sharedPreferences");
            String string4 = sharedPreferences.getString("USER_ID_KEY", null);
            if (string4 == null) {
                string4 = null;
            }
            if (string4 == null) {
                synchronized (G10.f3529d) {
                    SharedPreferences sharedPreferences2 = (SharedPreferences) ((C11287uQ0) g10.f3531b).f43693a;
                    O90.m5967e(sharedPreferences2, "sharedPreferences");
                    string = sharedPreferences2.getString("USER_ID_KEY", null);
                    if (string == null) {
                        string = null;
                    }
                    if (string == null) {
                        string = UUID.randomUUID().toString();
                        O90.m5967e(string, "randomUUID().toString()");
                        SharedPreferences sharedPreferences3 = (SharedPreferences) ((C11287uQ0) g10.f3531b).f43693a;
                        O90.m5967e(sharedPreferences3, "sharedPreferences");
                        SharedPreferences.Editor editorEdit = sharedPreferences3.edit();
                        editorEdit.putString("USER_ID_KEY", string);
                        editorEdit.apply();
                    }
                }
                str = string;
            } else {
                str = string4;
            }
            C9938jt1 c9938jt1 = (C9938jt1) ((F71) ((C8763ak1) t71.f11176d).f15667c).getValue();
            String str3 = c9938jt1 != null ? c9938jt1.f35445a : null;
            ArrayList arrayList4 = new ArrayList(AbstractC7293zu.m26586k(arrayList2));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                C6285kC c6285kC = (C6285kC) it.next();
                arrayList4.add(new C11485vz0(packageName, c6285kC.f36350a, str, str3, c6285kC.f36351b));
            }
            C8389Ur1 c8389Ur1 = (C8389Ur1) ((C7391Bm1) t71.f11175c).f1022b;
            try {
                String strM8197c = c8389Ur1.m8197c(arrayList4);
                httpsURLConnectionM8198d = c8389Ur1.m8198d();
                OutputStream outputStream = httpsURLConnectionM8198d.getOutputStream();
                try {
                    byte[] bytes = strM8197c.getBytes(AbstractC7038vr.f44561a);
                    O90.m5967e(bytes, "this as java.lang.String).getBytes(charset)");
                    outputStream.write(bytes);
                    outputStream.flush();
                    AbstractC8729aT1.m9749a(outputStream, null);
                } finally {
                }
            } catch (Throwable th) {
                th = th;
            }
            try {
                httpsURLConnectionM8198d.getURL();
                httpsURLConnectionM8198d.getResponseCode();
                httpsURLConnectionM8198d.getRequestProperty("X-Metrics-Request-Time");
                httpsURLConnectionM8198d.disconnect();
                return new C10308mm1(arrayList2);
            } catch (Throwable th2) {
                th = th2;
                httpsURLConnection = httpsURLConnectionM8198d;
                try {
                    throw new C8336Tr0("Http request was failed", th);
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
                AbstractC8729aT1.m9749a(cursorRawQuery, th4);
                throw th5;
            }
        }
    }

    @Override // p000.InterfaceC11673xS0
    /* renamed from: d */
    public void mo2828d(Object obj) {
        AbstractC7292zt abstractC7292ztM1362o;
        C7442Cm0 c7442Cm0 = (C7442Cm0) this.f7524c;
        C1383Vz c1383Vz = (C1383Vz) this.f7523b;
        c7442Cm0.getClass();
        synchronized (c7442Cm0) {
            c7442Cm0.m1352c(c1383Vz);
            c7442Cm0.m1358k(c1383Vz);
            abstractC7292ztM1362o = c7442Cm0.m1362o(c1383Vz);
        }
        AbstractC7292zt.m26569p(abstractC7292ztM1362o);
        c7442Cm0.m1360m();
        c7442Cm0.m1359l();
    }

    /* renamed from: e */
    public void m5556e() {
        synchronized (f7521d) {
            while (true) {
                W02 w02M5555c = ((C0827N8) this.f7524c).m5555c();
                if (!w02M5555c.equals(C10180lm1.f37287a)) {
                    if (w02M5555c instanceof C10308mm1) {
                        ((C8170Qm0) this.f7523b).m6777t(((C10308mm1) w02M5555c).f37913a);
                    }
                }
            }
        }
    }

    @Override // p000.InterfaceC10467o11
    /* renamed from: e0 */
    public void mo1066e0(InterfaceC0651KK interfaceC0651KK) {
        ((InterfaceC10467o11) this.f7523b).mo1066e0(interfaceC0651KK);
    }

    /* renamed from: f */
    public void m5557f() {
        this.f7523b = null;
        this.f7524c = null;
    }

    /* renamed from: g */
    public AbstractC7292zt m5558g(int i, int i2, Bitmap.Config config) {
        O90.m5968f(config, "bitmapConfig");
        int iM24050c = AbstractC6697qi.m24050c(i, i2, config);
        InterfaceC6380li interfaceC6380li = (InterfaceC6380li) this.f7523b;
        Bitmap bitmap = (Bitmap) interfaceC6380li.get(iM24050c);
        if (bitmap.getAllocationByteCount() < AbstractC6697qi.m24049b(config) * i * i2) {
            throw new IllegalStateException("Check failed.");
        }
        bitmap.reconfigure(i, i2, config);
        C1273UE c1273ueM26567S = AbstractC7292zt.m26567S(bitmap, interfaceC6380li, (G10) ((C7978Mu0) this.f7524c).f7393b);
        O90.m5967e(c1273ueM26567S, "closeableReferenceFactor…reate(bitmap, bitmapPool)");
        return c1273ueM26567S;
    }

    @Override // p000.InterfaceC10864r61, javax.inject.Provider
    public Object get() {
        C6897tc c6897tc = (C6897tc) this.f7523b;
        int i = c6897tc.f43169c;
        if (i == -1) {
            AbstractC7806Jm0.m4412f("AudioConfigUtil");
            i = 5;
        } else {
            AbstractC7806Jm0.m4412f("AudioConfigUtil");
        }
        int i2 = c6897tc.f43168b;
        if (i2 == -1) {
            AbstractC7806Jm0.m4412f("AudioConfigUtil");
            i2 = 2;
        } else {
            AbstractC7806Jm0.m4412f("AudioConfigUtil");
        }
        C7150xd c7150xd = (C7150xd) this.f7524c;
        int i3 = c7150xd.f45716e;
        int i4 = c6897tc.f43171e;
        if (i4 == -1) {
            AbstractC7806Jm0.m4412f("AudioSrcAdPrflRslvr");
        } else {
            AbstractC7806Jm0.m4412f("AudioSrcAdPrflRslvr");
            i3 = i4;
        }
        int iM17924c = AbstractC9236eO1.m17924c(c6897tc.f43170d, i3, i2, c7150xd.f45715d);
        AbstractC7806Jm0.m4412f("AudioSrcAdPrflRslvr");
        List list = C6834sc.f42495e;
        T71 t71 = new T71();
        t71.f11173a = -1;
        t71.f11174b = -1;
        t71.f11175c = -1;
        t71.f11176d = -1;
        t71.f11173a = Integer.valueOf(i);
        t71.f11176d = Integer.valueOf(i2);
        t71.f11175c = Integer.valueOf(i3);
        t71.f11174b = Integer.valueOf(iM17924c);
        return t71.m7574y();
    }

    @Override // p000.InterfaceC7034vn
    public long getTimestamp() {
        Long l = (Long) ((CaptureResult) this.f7524c).get(CaptureResult.SENSOR_TIMESTAMP);
        if (l == null) {
            return -1L;
        }
        return l.longValue();
    }

    @Override // p000.InterfaceC7034vn
    /* renamed from: h */
    public EnumC6908tn mo391h() {
        Integer num = (Integer) ((CaptureResult) this.f7524c).get(CaptureResult.CONTROL_AWB_STATE);
        EnumC6908tn enumC6908tn = EnumC6908tn.f43251a;
        if (num == null) {
            return enumC6908tn;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            return EnumC6908tn.f43252b;
        }
        if (iIntValue == 1) {
            return EnumC6908tn.f43253c;
        }
        if (iIntValue == 2) {
            return EnumC6908tn.f43254d;
        }
        if (iIntValue == 3) {
            return EnumC6908tn.f43255e;
        }
        AbstractC7806Jm0.m4412f("C2CameraCaptureResult");
        return enumC6908tn;
    }

    @Override // p000.InterfaceC7034vn
    /* renamed from: i */
    public int mo392i() {
        Integer num = (Integer) ((CaptureResult) this.f7524c).get(CaptureResult.FLASH_STATE);
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
        AbstractC7806Jm0.m4412f("C2CameraCaptureResult");
        return 1;
    }

    @Override // p000.InterfaceC6850ss
    /* renamed from: j */
    public C6770rs mo2901j(C0055As c0055As) {
        O90.m5968f(c0055As, "classId");
        C0712LI c0712li = (C0712LI) this.f7524c;
        O90.m5968f(c0712li.m4944c().f45520c, "<this>");
        C11667xP0 c11667xP0M24605d = AbstractC6800s4.m24605d((C8342Tu0) this.f7523b, c0055As, C10417nd0.f38414g);
        if (c11667xP0M24605d == null) {
            return null;
        }
        VO0.m8433a(c11667xP0M24605d.f45572a).equals(c0055As);
        return c0712li.m4947f(c11667xP0M24605d);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [Vg0, nZ] */
    /* renamed from: k */
    public Object m5559k(Class cls) {
        O90.m5968f(cls, "key");
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f7524c;
        Object obj = concurrentHashMap.get(cls);
        if (obj != null) {
            return obj;
        }
        Object objInvoke = ((AbstractC8418Vg0) this.f7523b).invoke(cls);
        Object objPutIfAbsent = concurrentHashMap.putIfAbsent(cls, objInvoke);
        return objPutIfAbsent == null ? objInvoke : objPutIfAbsent;
    }

    /* renamed from: l */
    public C7025ve m5560l(C7232yw c7232yw) throws JSONException, C6684qV {
        String string;
        JSONArray jSONArray = c7232yw.f46548g;
        long j = c7232yw.f46547f;
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
                C7232yw c7232ywM26006d = ((C7169xw) this.f7523b).m26006d();
                String string3 = null;
                if (c7232ywM26006d == null) {
                    string = null;
                } else {
                    try {
                        string = c7232ywM26006d.f46543b.getString(strOptString);
                    } catch (JSONException unused) {
                    }
                }
                if (string == null) {
                    C7232yw c7232ywM26006d2 = ((C7169xw) this.f7524c).m26006d();
                    if (c7232ywM26006d2 != null) {
                        try {
                            string3 = c7232ywM26006d2.f46543b.getString(strOptString);
                        } catch (JSONException unused2) {
                        }
                    }
                    string = string3 != null ? string3 : "";
                }
                int i2 = AbstractC9885jT0.f35158a;
                C6836se c6836se = new C6836se();
                if (string2 == null) {
                    throw new NullPointerException("Null rolloutId");
                }
                c6836se.f42534a = string2;
                String string4 = jSONObject.getString("variantId");
                if (string4 == null) {
                    throw new NullPointerException("Null variantId");
                }
                c6836se.f42535b = string4;
                if (strOptString == null) {
                    throw new NullPointerException("Null parameterKey");
                }
                c6836se.f42536c = strOptString;
                c6836se.f42537d = string;
                c6836se.f42538e = j;
                c6836se.f42539f = (byte) (c6836se.f42539f | 1);
                hashSet.add(c6836se.m24761a());
            } catch (JSONException e) {
                throw new C6684qV("Exception parsing rollouts metadata to create RolloutsState.", e);
            }
        }
        return new C7025ve(hashSet);
    }

    @Override // p000.InterfaceC3922dL
    /* renamed from: m */
    public void mo5561m() {
        C10515oO0 c10515oO0 = (C10515oO0) this.f7523b;
        synchronized (c10515oO0) {
            c10515oO0.f38986c = c10515oO0.f38984a.length;
        }
    }

    /* renamed from: n */
    public Task m5562n() {
        C11940zY1 c11940zY1 = (C11940zY1) this.f7523b;
        Task taskDoRead = c11940zY1.f46872b.isGooglePlayServicesAvailable(c11940zY1.f46871a, 212800000) == 0 ? c11940zY1.doRead(TaskApiCall.builder().setFeatures(AbstractC10244mG1.f37612a).run(new C11142tH1()).setAutoResolveMissingFeatures(false).setMethodKey(27601).build()) : AbstractC9376fU1.m18243d(new ApiException(new Status(17)));
        A61 a61 = new A61(11, this);
        C9450g32 c9450g32 = (C9450g32) taskDoRead;
        c9450g32.getClass();
        return c9450g32.mo11140g(Y81.f14171a, a61);
    }

    @Override // p000.InterfaceC7034vn
    /* renamed from: o */
    public EnumC6765rn mo398o() {
        Integer num = (Integer) ((CaptureResult) this.f7524c).get(CaptureResult.CONTROL_AE_STATE);
        EnumC6765rn enumC6765rn = EnumC6765rn.f41898a;
        if (num == null) {
            return enumC6765rn;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            return EnumC6765rn.f41899b;
        }
        if (iIntValue != 1) {
            if (iIntValue == 2) {
                return EnumC6765rn.f41902e;
            }
            if (iIntValue == 3) {
                return EnumC6765rn.f41903f;
            }
            if (iIntValue == 4) {
                return EnumC6765rn.f41901d;
            }
            if (iIntValue != 5) {
                AbstractC7806Jm0.m4412f("C2CameraCaptureResult");
                return enumC6765rn;
            }
        }
        return EnumC6765rn.f41900c;
    }

    @Override // p000.InterfaceC10467o11
    public void onError(Throwable th) {
        O90.m5968f(th, "e");
        ((InterfaceC10467o11) this.f7523b).onError(th);
    }

    @Override // p000.QA0
    public boolean onRequestPermissionsResult(int i, String[] strArr, int[] iArr) throws Exception {
        if (i == 1) {
            int i2 = 0;
            while (true) {
                int length = strArr.length;
                Promise promise = (Promise) this.f7523b;
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
                        ((Callable) this.f7524c).call();
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
    @Override // p000.InterfaceC10467o11
    public void onSuccess(Object obj) {
        Object objM7015b;
        try {
            ((C9699i11) this.f7524c).f28761c.invoke(obj);
            objM7015b = C8313Tf1.f11463a;
        } catch (Throwable th) {
            objM7015b = RQ1.m7015b(th);
        }
        boolean z = objM7015b instanceof OS0;
        InterfaceC10467o11 interfaceC10467o11 = (InterfaceC10467o11) this.f7523b;
        if (!z) {
            interfaceC10467o11.onSuccess(obj);
        }
        Throwable thM6365a = PS0.m6365a(objM7015b);
        if (thM6365a != null) {
            interfaceC10467o11.onError(thM6365a);
        }
    }

    /* renamed from: q */
    public synchronized Map m5563q() {
        try {
            if (((Map) this.f7524c) == null) {
                this.f7524c = Collections.unmodifiableMap(new HashMap((HashMap) this.f7523b));
            }
        } catch (Throwable th) {
            throw th;
        }
        return (Map) this.f7524c;
    }

    /* renamed from: r */
    public C7295zw m5564r() {
        if (((C7295zw) this.f7524c) == null) {
            this.f7524c = new C7295zw(this);
        }
        return (C7295zw) this.f7524c;
    }

    @Override // p000.InterfaceC3922dL
    /* renamed from: s */
    public void mo5565s(InterfaceC6443mi interfaceC6443mi, Bitmap bitmap) throws IOException {
        IOException iOException = ((C1284UP) this.f7524c).f11773b;
        if (iOException != null) {
            if (bitmap == null) {
                throw iOException;
            }
            interfaceC6443mi.mo319i(bitmap);
            throw iOException;
        }
    }

    @Override // p000.InterfaceC7034vn
    /* renamed from: t */
    public CaptureResult mo403t() {
        return (CaptureResult) this.f7524c;
    }

    public String toString() {
        switch (this.f7522a) {
            case 24:
                return ((String) this.f7523b) + ", " + ((String) this.f7524c);
            default:
                return super.toString();
        }
    }

    @Override // p000.InterfaceC7034vn
    /* renamed from: u */
    public EnumC6845sn mo404u() {
        Integer num = (Integer) ((CaptureResult) this.f7524c).get(CaptureResult.CONTROL_AF_STATE);
        EnumC6845sn enumC6845sn = EnumC6845sn.f42594a;
        if (num == null) {
            return enumC6845sn;
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
                AbstractC7806Jm0.m4412f("C2CameraCaptureResult");
                break;
        }
        return enumC6845sn;
    }

    /* renamed from: v */
    public void m5566v(int i, Bundle bundle) {
        Locale locale = Locale.US;
        bundle.toString();
        String string = bundle.getString("name");
        if (string != null) {
            Bundle bundle2 = bundle.getBundle("params");
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            InterfaceC1451X3 interfaceC1451X3 = "clx".equals(bundle2.getString("_o")) ? (C10919rY0) this.f7523b : (G10) this.f7524c;
            if (interfaceC1451X3 == null) {
                return;
            }
            interfaceC1451X3.mo2900i(bundle2, string);
        }
    }

    /* renamed from: w */
    public void m5567w(Class cls, Class cls2, Class cls3, List list) {
        synchronized (((C7119x8) this.f7524c)) {
            ((C7119x8) this.f7524c).put(new C9553gt0(cls, cls2, cls3), list);
        }
    }

    public /* synthetic */ C0827N8(Object obj, int i, Object obj2) {
        this.f7522a = i;
        this.f7523b = obj;
        this.f7524c = obj2;
    }

    public C0827N8(Context context, int i) {
        C10910rT1 c10910rT1;
        this.f7522a = i;
        switch (i) {
            case 9:
                this.f7523b = context;
                return;
            case 10:
                this.f7523b = context;
                this.f7524c = null;
                return;
            default:
                this.f7523b = new C11940zY1(context, GoogleApiAvailabilityLight.getInstance());
                synchronized (C10910rT1.class) {
                    try {
                        Preconditions.checkNotNull(context, "Context must not be null");
                        if (C10910rT1.f41673e == null) {
                            C10910rT1.f41673e = new C10910rT1(context.getApplicationContext(), 0);
                        }
                        c10910rT1 = C10910rT1.f41673e;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                this.f7524c = c10910rT1;
                return;
        }
    }

    public C0827N8(Context context, Logger logger) {
        this.f7522a = 25;
        O90.m5968f(logger, "logger");
        this.f7523b = context;
        this.f7524c = logger;
    }

    public C0827N8(MetadataRepository metadataRepository, A61 a61, C4042fG c4042fG) {
        this.f7522a = 26;
        this.f7523b = metadataRepository;
        this.f7524c = Logger.DefaultImpls.createLogger(c4042fG, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0827N8(InterfaceC6497nZ interfaceC6497nZ) {
        this.f7522a = 7;
        this.f7523b = (AbstractC8418Vg0) interfaceC6497nZ;
        this.f7524c = new ConcurrentHashMap();
    }

    public C0827N8(InterfaceC6380li interfaceC6380li, C7978Mu0 c7978Mu0) {
        this.f7522a = 0;
        O90.m5968f(c7978Mu0, "closeableReferenceFactory");
        this.f7523b = interfaceC6380li;
        this.f7524c = c7978Mu0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0827N8(TotalCaptureResult totalCaptureResult) {
        this(C10996s81.f42278b, 5, totalCaptureResult);
        this.f7522a = 5;
    }

    public C0827N8(InterfaceC0240Do interfaceC0240Do) {
        this.f7522a = 11;
        this.f7523b = interfaceC0240Do;
        this.f7524c = new C6730rE(24);
    }

    public C0827N8(Map map) {
        this.f7522a = 17;
        this.f7523b = map;
        this.f7524c = new C8582Yk0("Java nullability annotation states").m9351c(new C7236z(28, this));
    }

    public C0827N8(Handler handler) {
        this.f7522a = 6;
        this.f7523b = new HashMap();
        this.f7524c = handler;
    }

    public C0827N8(JavaScriptExecutorFactory javaScriptExecutorFactory, JSBundleLoader jSBundleLoader) {
        this.f7522a = 19;
        UN1.m7999c(javaScriptExecutorFactory);
        this.f7523b = javaScriptExecutorFactory;
        UN1.m7999c(jSBundleLoader);
        this.f7524c = jSBundleLoader;
    }

    public C0827N8(C7442Cm0 c7442Cm0, C1383Vz c1383Vz) {
        this.f7522a = 15;
        this.f7524c = c7442Cm0;
        this.f7523b = c1383Vz;
    }

    public C0827N8(int i) {
        this.f7522a = i;
        switch (i) {
            case 13:
                this.f7523b = new HashMap();
                break;
            case 16:
                this.f7523b = new AtomicReference();
                this.f7524c = new C7119x8();
                break;
            default:
                this.f7523b = new Rect();
                this.f7524c = new Rect();
                break;
        }
    }
}
