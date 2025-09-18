package p000;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.hardware.camera2.CaptureRequest;
import android.media.Image;
import android.os.Bundle;
import android.os.Handler;
import android.os.StatFs;
import android.util.Log;
import android.util.Range;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC1733o;
import androidx.fragment.app.Fragment;
import com.dieam.reactnativepushnotification.modules.RNPushNotificationListenerService;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.google.android.gms.tasks.Task;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.p015rn.push.constants.Core;
import com.huawei.hms.p015rn.push.constants.NotificationConstants;
import expo.modules.kotlin.jni.JNIFunctionBody;
import expo.modules.kotlin.jni.JavaScriptModuleObject;
import io.appmetrica.analytics.impl.C5094ea;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.CookieHandler;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.inject.Provider;
import kotlin.Pair;
import org.json.JSONException;
import org.json.JSONObject;
import ru.mes.dnevnik.R;

/* loaded from: classes.dex */
public final class G10 implements InterfaceC10864r61, InterfaceC9305ex0, InterfaceC1451X3, InterfaceC1803bj, InterfaceC7229yt, InterfaceC8398Uw0, InterfaceC9968k61, InterfaceC1208TC, InterfaceC6850ss, InterfaceC6380li, Provider, InterfaceC0570J2, InterfaceC0980PZ, InterfaceC4213hz, K61, JNIFunctionBody, InterfaceC7430Cg0, InterfaceC8633Zj1 {

    /* renamed from: c */
    public static volatile G10 f3528c;

    /* renamed from: d */
    public static final Object f3529d = new Object();

    /* renamed from: a */
    public final /* synthetic */ int f3530a;

    /* renamed from: b */
    public Object f3531b;

    public /* synthetic */ G10(int i, Object obj) {
        this.f3530a = i;
        this.f3531b = obj;
    }

    /* renamed from: J */
    public static String m2881J(Bundle bundle, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    /* renamed from: w */
    public static void m2882w(G10 g10, ReactApplicationContext reactApplicationContext, Bundle bundle) {
        String string;
        g10.getClass();
        if (bundle.getString(NotificationConstants.f19487ID) == null) {
            bundle.putString(NotificationConstants.f19487ID, String.valueOf(new SecureRandom().nextInt()));
        }
        Application application = (Application) reactApplicationContext.getApplicationContext();
        new C7621Fx1(((RNPushNotificationListenerService) g10.f3531b).getApplication());
        C9095dI0 c9095dI0 = new C9095dI0(application);
        boolean zM17522c = c9095dI0.m17522c();
        bundle.putBoolean(C5094ea.f31575g, zM17522c);
        boolean z = false;
        bundle.putBoolean("userInteraction", false);
        String string2 = null;
        try {
            string = C9223eI0.m17897a(bundle).toString();
        } catch (JSONException unused) {
            string = null;
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString(Core.Event.Result.DATA_JSON, string);
        if (reactApplicationContext.hasActiveCatalystInstance()) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactApplicationContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("remoteNotificationReceived", writableMapCreateMap);
        }
        if (bundle.getString("contentAvailable", "false").equalsIgnoreCase("true")) {
            try {
                string2 = C9223eI0.m17897a(bundle).toString();
            } catch (JSONException unused2) {
            }
            WritableMap writableMapCreateMap2 = Arguments.createMap();
            writableMapCreateMap2.putString(Core.Event.Result.DATA_JSON, string2);
            if (reactApplicationContext.hasActiveCatalystInstance()) {
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactApplicationContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("remoteFetch", writableMapCreateMap2);
            }
        }
        try {
            z = C7621Fx1.f3493d.getBoolean("com.dieam.reactnativepushnotification.notification_foreground", false);
        } catch (Exception unused3) {
        }
        if (z || !zM17522c) {
            bundle.toString();
            c9095dI0.m17527h(bundle);
        }
    }

    /* renamed from: A */
    public synchronized void m2884A(OT0 ot0) {
        O90.m5968f(ot0, "route");
        ((LinkedHashSet) this.f3531b).remove(ot0);
    }

    /* renamed from: B */
    public long m2885B() {
        C0093BT c0093bt = (C0093BT) this.f3531b;
        if (c0093bt instanceof C0093BT) {
            String path = c0093bt.f829b.f5048d.getPath();
            O90.m5967e(path, "outputOptions.file.path");
            return new StatFs(path).getAvailableBytes();
        }
        throw new AssertionError("Unknown OutputOptions: " + c0093bt);
    }

    /* renamed from: C */
    public ByteBuffer m2886C() {
        return ((Image.Plane) this.f3531b).getBuffer();
    }

    /* renamed from: D */
    public short m2887D(int i) {
        ByteBuffer byteBuffer = (ByteBuffer) this.f3531b;
        if (byteBuffer.remaining() - i >= 2) {
            return byteBuffer.getShort(i);
        }
        return (short) -1;
    }

    /* renamed from: E */
    public String m2888E(String str, String str2, String[] strArr) {
        int identifier;
        if (str != null) {
            return str;
        }
        Context applicationContext = ((RNPushNotificationListenerService) this.f3531b).getApplicationContext();
        String packageName = applicationContext.getPackageName();
        if (str2 == null || (identifier = applicationContext.getResources().getIdentifier(str2, "string", packageName)) == 0) {
            return null;
        }
        return strArr != null ? applicationContext.getResources().getString(identifier, strArr) : applicationContext.getResources().getString(identifier);
    }

    /* renamed from: F */
    public int m2889F() {
        return ((Image.Plane) this.f3531b).getPixelStride();
    }

    /* renamed from: G */
    public Set m2890G() {
        Set setUnmodifiableSet;
        synchronized (((HashSet) this.f3531b)) {
            setUnmodifiableSet = Collections.unmodifiableSet((HashSet) this.f3531b);
        }
        return setUnmodifiableSet;
    }

    /* renamed from: H */
    public int m2891H() {
        return ((Image.Plane) this.f3531b).getRowStride();
    }

    /* renamed from: I */
    public void m2892I(Exception exc) {
        AbstractC10872rA1.m24172e("Audio sink error", exc);
        CC0 cc0 = ((C7862Ko0) this.f3531b).f6299R1;
        Handler handler = (Handler) cc0.f1250b;
        if (handler != null) {
            handler.post(new RunnableC7021va(cc0, exc, 1));
        }
    }

    /* renamed from: K */
    public void m2893K(CaptureRequest.Key key, Object obj) {
        ((C7612Ft0) this.f3531b).m2815e(new C0480Hc("camera2.captureRequest.option." + key.getName(), Object.class, key), obj);
    }

    @Override // p000.InterfaceC4213hz
    /* renamed from: a */
    public void mo2894a(D40 d40, List list) throws IOException {
        C40 c40;
        O90.m5968f(d40, "url");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C4150gz c4150gz = (C4150gz) it.next();
            O90.m5968f(c4150gz, "cookie");
            arrayList.add(c4150gz.m18678a(true));
        }
        try {
            ((CookieHandler) this.f3531b).put(d40.m1535h(), AbstractC11205tn0.m24984c(new Pair("Set-Cookie", arrayList)));
        } catch (IOException e) {
            C10745qB0 c10745qB0 = C10745qB0.f40658a;
            C10745qB0 c10745qB02 = C10745qB0.f40658a;
            StringBuilder sb = new StringBuilder("Saving cookies failed for ");
            try {
                c40 = new C40();
                c40.m973f(d40, "/...");
            } catch (IllegalArgumentException unused) {
                c40 = null;
            }
            D40 d40M970c = c40 != null ? c40.m970c() : null;
            O90.m5965c(d40M970c);
            sb.append(d40M970c);
            String string = sb.toString();
            c10745qB02.getClass();
            C10745qB0.m23946i(5, string, e);
        }
    }

    @Override // p000.InterfaceC1208TC
    /* renamed from: b */
    public void mo2895b() {
        switch (this.f3530a) {
            case 11:
                break;
            default:
                ((C10515oO0) this.f3531b).release();
                break;
        }
    }

    @Override // p000.InterfaceC8398Uw0
    /* renamed from: c */
    public Object mo913c() {
        Type type = (Type) this.f3531b;
        if (!(type instanceof ParameterizedType)) {
            throw new C6838sg("Invalid EnumMap type: " + type.toString());
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof Class) {
            return new EnumMap((Class) type2);
        }
        throw new C6838sg("Invalid EnumMap type: " + type.toString());
    }

    @Override // p000.InterfaceC11673xS0
    /* renamed from: d */
    public void mo2828d(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        O90.m5968f(bitmap, "value");
        ((Set) this.f3531b).remove(bitmap);
        bitmap.recycle();
    }

    @Override // p000.InterfaceC8633Zj1
    /* renamed from: e */
    public int mo2896e(View view) {
        AO0 ao0 = (AO0) view.getLayoutParams();
        ((AbstractC11919zO0) this.f3531b).getClass();
        return (view.getTop() - ((AO0) view.getLayoutParams()).f183b.top) - ((ViewGroup.MarginLayoutParams) ao0).topMargin;
    }

    @Override // p000.InterfaceC8633Zj1
    /* renamed from: f */
    public int mo2897f() {
        return ((AbstractC11919zO0) this.f3531b).m26413G();
    }

    @Override // p000.InterfaceC7229yt
    /* renamed from: g */
    public void mo2898g() {
        ((NV1) this.f3531b).getClass();
    }

    @Override // p000.InterfaceC8950cC0
    public Object get(int i) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, (int) Math.ceil(i / 2.0d), Bitmap.Config.RGB_565);
        O90.m5967e(bitmapCreateBitmap, "createBitmap(\n          …   Bitmap.Config.RGB_565)");
        ((Set) this.f3531b).add(bitmapCreateBitmap);
        return bitmapCreateBitmap;
    }

    @Override // p000.InterfaceC8633Zj1
    /* renamed from: h */
    public int mo2899h() {
        AbstractC11919zO0 abstractC11919zO0 = (AbstractC11919zO0) this.f3531b;
        return abstractC11919zO0.f46827o - abstractC11919zO0.m26410D();
    }

    @Override // p000.InterfaceC1451X3
    /* renamed from: i */
    public void mo2900i(Bundle bundle, String str) {
        C6600pA c6600pA = (C6600pA) this.f3531b;
        if (c6600pA != null) {
            try {
                String str2 = "$A$:" + m2881J(bundle, str);
                C6663qA c6663qA = c6600pA.f39878a;
                c6663qA.getClass();
                ((ExecutorC1584ZA) c6663qA.f40653p.f41678b).m9502a(new RunnableC6535oA(c6663qA, System.currentTimeMillis() - c6663qA.f40641d, str2, 0));
            } catch (JSONException unused) {
            }
        }
    }

    @Override // expo.modules.kotlin.jni.JNIFunctionBody
    public Object invoke(Object[] objArr) {
        O90.m5968f(objArr, "it");
        return ((JavaScriptModuleObject) this.f3531b).f26959a;
    }

    @Override // p000.InterfaceC6850ss
    /* renamed from: j */
    public C6770rs mo2901j(C0055As c0055As) {
        C6770rs c6770rsMo2901j;
        O90.m5968f(c0055As, "classId");
        C0664KX c0664kxM363g = c0055As.m363g();
        O90.m5967e(c0664kxM363g, "getPackageFqName(...)");
        Iterator it = AbstractC11148tK1.m24878c((InterfaceC7520Dz0) this.f3531b, c0664kxM363g).iterator();
        while (it.hasNext()) {
            InterfaceC11993zz0 interfaceC11993zz0 = (InterfaceC11993zz0) it.next();
            if ((interfaceC11993zz0 instanceof C1493Xj) && (c6770rsMo2901j = ((C1493Xj) interfaceC11993zz0).f13933j.mo2901j(c0055As)) != null) {
                return c6770rsMo2901j;
            }
        }
        return null;
    }

    @Override // p000.InterfaceC7430Cg0
    /* renamed from: l */
    public void mo1264l(C8340Tt0 c8340Tt0, Object obj) {
        String strM7801b = c8340Tt0.m7801b();
        boolean zEquals = "version".equals(strM7801b);
        C10897rN0 c10897rN0 = (C10897rN0) this.f3531b;
        if (zEquals) {
            if (obj instanceof int[]) {
                c10897rN0.f41625a = (int[]) obj;
            }
        } else if ("multifileClassName".equals(strM7801b)) {
            c10897rN0.f41626b = obj instanceof String ? (String) obj : null;
        }
    }

    @Override // p000.InterfaceC1208TC
    /* renamed from: m */
    public Object mo2902m() {
        switch (this.f3530a) {
            case 11:
                return this.f3531b;
            default:
                C10515oO0 c10515oO0 = (C10515oO0) this.f3531b;
                c10515oO0.reset();
                return c10515oO0;
        }
    }

    @Override // p000.InterfaceC7430Cg0
    /* renamed from: n */
    public void mo1265n(C8340Tt0 c8340Tt0, C0181Cs c0181Cs) {
    }

    @Override // p000.InterfaceC7430Cg0
    /* renamed from: o */
    public InterfaceC7482Dg0 mo1266o(C8340Tt0 c8340Tt0) {
        String strM7801b = c8340Tt0.m7801b();
        if ("data".equals(strM7801b) || "filePartClassNames".equals(strM7801b)) {
            return new C10769qN0(this, 0);
        }
        if ("strings".equals(strM7801b)) {
            return new C10769qN0(this, 1);
        }
        return null;
    }

    @Override // p000.InterfaceC0570J2
    public void onActivityResult(Object obj) {
        C0507I2 c0507i2 = (C0507I2) obj;
        AbstractC1733o abstractC1733o = (AbstractC1733o) this.f3531b;
        C4123gY c4123gY = (C4123gY) abstractC1733o.f16202C.pollLast();
        if (c4123gY == null) {
            return;
        }
        Fragment fragmentM10109c = abstractC1733o.f16215c.m10109c(c4123gY.f27831a);
        if (fragmentM10109c == null) {
            return;
        }
        fragmentM10109c.onActivityResult(c4123gY.f27832b, c0507i2.f4659a, c0507i2.f4660b);
    }

    @Override // p000.InterfaceC0980PZ
    public void onFailure(Throwable th) throws Exception {
        ((InterfaceC9457g70) this.f3531b).close();
    }

    @Override // p000.InterfaceC0980PZ
    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
    }

    @Override // p000.InterfaceC7430Cg0
    /* renamed from: p */
    public void mo1267p(C8340Tt0 c8340Tt0, C0055As c0055As, C8340Tt0 c8340Tt02) {
    }

    @Override // p000.InterfaceC7229yt
    /* renamed from: q */
    public void mo2903q(C10976s01 c10976s01, Throwable th) {
        ((NV1) this.f3531b).getClass();
        O90.m5968f(c10976s01, "reference");
        Object objM24574d = c10976s01.m24574d();
        AbstractC3929dS.m17684q("Fresco", "Finalized without closing: %x %x (type = %s).\nStack:\n%s", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(c10976s01)), objM24574d != null ? objM24574d.getClass().getName() : "<value is null>", th == null ? "" : Log.getStackTraceString(th));
    }

    @Override // p000.InterfaceC7430Cg0
    /* renamed from: r */
    public InterfaceC7430Cg0 mo1268r(C0055As c0055As, C8340Tt0 c8340Tt0) {
        return null;
    }

    @Override // p000.InterfaceC9305ex0
    /* renamed from: r0 */
    public void mo505r0(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            C0359Fh c0359Fh = (C0359Fh) this.f3531b;
            if (c0359Fh.m2741t()) {
                c0359Fh.m2743v();
            } else {
                CharSequence charSequenceM6413d = c0359Fh.f3389b.m6413d();
                if (charSequenceM6413d == null) {
                    charSequenceM6413d = c0359Fh.getString(R.string.default_error_msg);
                }
                c0359Fh.m2744w(13, charSequenceM6413d);
                c0359Fh.m2739r(2);
            }
            c0359Fh.f3389b.m6417h(false);
        }
    }

    @Override // p000.InterfaceC4213hz
    /* renamed from: s */
    public List mo2904s(D40 d40) throws IOException {
        C40 c40;
        C0779MN c0779mn = C0779MN.f7117a;
        O90.m5968f(d40, "url");
        ArrayList arrayList = null;
        try {
            Map<String, List<String>> map = ((CookieHandler) this.f3531b).get(d40.m1535h(), C0842NN.f7735a);
            O90.m5967e(map, "cookieHeaders");
            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                String key = entry.getKey();
                List<String> value = entry.getValue();
                if ("Cookie".equalsIgnoreCase(key) || "Cookie2".equalsIgnoreCase(key)) {
                    O90.m5967e(value, "value");
                    if (value.isEmpty()) {
                        continue;
                    } else {
                        for (String str : value) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            O90.m5967e(str, "header");
                            ArrayList arrayList2 = new ArrayList();
                            int length = str.length();
                            int i = 0;
                            while (i < length) {
                                int iM1277f = AbstractC7433Ch1.m1277f(i, str, length, ";,");
                                int iM1278g = AbstractC7433Ch1.m1278g(str, '=', i, iM1277f);
                                String strM1271A = AbstractC7433Ch1.m1271A(i, iM1278g, str);
                                if (!D51.m1556o(strM1271A, "$", false)) {
                                    String strM1271A2 = iM1278g < iM1277f ? AbstractC7433Ch1.m1271A(iM1278g + 1, iM1277f, str) : "";
                                    if (D51.m1556o(strM1271A2, "\"", false) && D51.m1550i(strM1271A2, "\"")) {
                                        strM1271A2 = strM1271A2.substring(1, strM1271A2.length() - 1);
                                        O90.m5967e(strM1271A2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                                    }
                                    if (!O90.m5963a(AbstractC11374v51.m25350Y(strM1271A).toString(), strM1271A)) {
                                        throw new IllegalArgumentException("name is not trimmed");
                                    }
                                    if (!O90.m5963a(AbstractC11374v51.m25350Y(strM1271A2).toString(), strM1271A2)) {
                                        throw new IllegalArgumentException("value is not trimmed");
                                    }
                                    String str2 = d40.f1831d;
                                    O90.m5968f(str2, "domain");
                                    String strM5214b = M12.m5214b(str2);
                                    if (strM5214b == null) {
                                        throw new IllegalArgumentException("unexpected domain: ".concat(str2));
                                    }
                                    arrayList2.add(new C4150gz(strM1271A, strM1271A2, 253402300799999L, strM5214b, "/", false, false, false, false));
                                }
                                i = iM1277f + 1;
                            }
                            arrayList.addAll(arrayList2);
                        }
                    }
                }
            }
            if (arrayList == null) {
                return c0779mn;
            }
            List listUnmodifiableList = Collections.unmodifiableList(arrayList);
            O90.m5967e(listUnmodifiableList, "Collections.unmodifiableList(cookies)");
            return listUnmodifiableList;
        } catch (IOException e) {
            C10745qB0 c10745qB0 = C10745qB0.f40658a;
            C10745qB0 c10745qB02 = C10745qB0.f40658a;
            StringBuilder sb = new StringBuilder("Loading cookies failed for ");
            try {
                c40 = new C40();
                c40.m973f(d40, "/...");
            } catch (IllegalArgumentException unused) {
                c40 = null;
            }
            D40 d40M970c = c40 != null ? c40.m970c() : null;
            O90.m5965c(d40M970c);
            sb.append(d40M970c);
            String string = sb.toString();
            c10745qB02.getClass();
            C10745qB0.m23946i(5, string, e);
            return c0779mn;
        }
    }

    @Override // p000.InterfaceC8633Zj1
    /* renamed from: t */
    public View mo2905t(int i) {
        return ((AbstractC11919zO0) this.f3531b).m26425u(i);
    }

    @Override // p000.InterfaceC9968k61
    public Task then(Object obj) {
        if (((BZ0) obj) == null) {
            return AbstractC9376fU1.m18244e(null);
        }
        CallableC6283kA callableC6283kA = (CallableC6283kA) this.f3531b;
        C9450g32 c9450g32M22692a = C6409mA.m22692a(callableC6283kA.f36333e);
        C6409mA c6409mA = callableC6283kA.f36333e;
        return AbstractC9376fU1.m18246g(Arrays.asList(c9450g32M22692a, ((C1002Pv) c6409mA.f37539m).m6481A((ExecutorC1584ZA) ((C10910rT1) c6409mA.f37531e).f41678b, null)));
    }

    @Override // p000.InterfaceC8633Zj1
    /* renamed from: u */
    public int mo2906u(View view) {
        AO0 ao0 = (AO0) view.getLayoutParams();
        ((AbstractC11919zO0) this.f3531b).getClass();
        return view.getBottom() + ((AO0) view.getLayoutParams()).f183b.bottom + ((ViewGroup.MarginLayoutParams) ao0).bottomMargin;
    }

    @Override // p000.InterfaceC1803bj
    /* renamed from: v */
    public void mo2907v(C6600pA c6600pA) {
        this.f3531b = c6600pA;
    }

    /* renamed from: x */
    public C7978Mu0 m2908x() {
        C7882Ky0 c7882Ky0M4786a = C7882Ky0.m4786a((C7612Ft0) this.f3531b);
        C7978Mu0 c7978Mu0 = new C7978Mu0(28);
        c7978Mu0.f7393b = c7882Ky0M4786a;
        return c7978Mu0;
    }

    /* renamed from: y */
    public void m2909y() {
        ((FA1) this.f3531b).f3084a.m18391r(null);
    }

    public /* synthetic */ G10(int i, boolean z) {
        this.f3530a = i;
    }

    public /* synthetic */ G10(Object obj, int i, Object obj2) {
        this.f3530a = i;
        this.f3531b = obj;
    }

    public G10(InputStream inputStream, C11967zm0 c11967zm0) {
        this.f3530a = 18;
        C10515oO0 c10515oO0 = new C10515oO0(inputStream, c11967zm0);
        this.f3531b = c10515oO0;
        c10515oO0.mark(5242880);
    }

    @Override // p000.InterfaceC10864r61, javax.inject.Provider
    public Object get() {
        int iM17924c;
        switch (this.f3530a) {
            case 3:
                C6897tc c6897tc = (C6897tc) this.f3531b;
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
                int i3 = c6897tc.f43171e;
                if (i3 == -1) {
                    AbstractC7806Jm0.m4412f("DefAudioResolver");
                    i3 = 1;
                } else {
                    AbstractC7806Jm0.m4412f("DefAudioResolver");
                }
                Range range = C6897tc.f43166g;
                Range range2 = c6897tc.f43170d;
                if (range.equals(range2)) {
                    AbstractC7806Jm0.m4412f("DefAudioResolver");
                    iM17924c = 44100;
                } else {
                    iM17924c = AbstractC9236eO1.m17924c(range2, i3, i2, ((Integer) range2.getUpper()).intValue());
                    AbstractC7806Jm0.m4412f("DefAudioResolver");
                }
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
            default:
                C0786MU c0786mu = (C0786MU) ((C8071Oo1) this.f3531b).f8627a;
                AbstractC8971cM1.m10691d(c0786mu);
                return c0786mu;
        }
    }

    public G10(InterfaceC1839cJ interfaceC1839cJ) {
        this.f3530a = 20;
        O90.m5968f(interfaceC1839cJ, "devSupportManager");
        this.f3531b = interfaceC1839cJ;
    }

    public G10(CookieHandler cookieHandler) {
        this.f3530a = 19;
        O90.m5968f(cookieHandler, "cookieHandler");
        this.f3531b = cookieHandler;
    }

    public G10(int i) {
        this.f3530a = i;
        switch (i) {
            case 7:
                this.f3531b = new FA1();
                break;
            case 14:
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
                O90.m5967e(setNewSetFromMap, "newIdentityHashSet()");
                this.f3531b = setNewSetFromMap;
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                this.f3531b = C7612Ft0.m2812b();
                break;
            case 29:
                this.f3531b = new LinkedHashSet();
                break;
            default:
                this.f3531b = new HashSet();
                break;
        }
    }

    public G10(C0093BT c0093bt) {
        this.f3530a = 23;
        O90.m5968f(c0093bt, "outputOptions");
        this.f3531b = c0093bt;
    }

    public G10(byte[] bArr, int i) {
        this.f3530a = 12;
        this.f3531b = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
    }

    /* renamed from: z */
    private final void m2883z() {
    }

    @Override // p000.InterfaceC7430Cg0
    /* renamed from: k */
    public void mo1263k() {
    }
}
