package defpackage;

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
import androidx.fragment.app.Fragment;
import androidx.fragment.app.o;
import com.dieam.reactnativepushnotification.modules.RNPushNotificationListenerService;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.google.android.gms.tasks.Task;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.rn.push.constants.Core;
import com.huawei.hms.rn.push.constants.NotificationConstants;
import expo.modules.kotlin.jni.JNIFunctionBody;
import expo.modules.kotlin.jni.JavaScriptModuleObject;
import io.appmetrica.analytics.impl.C4524ea;
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
public final class G10 implements InterfaceC6777r61, InterfaceC3677ex0, X3, InterfaceC2378bj, InterfaceC8256yt, InterfaceC1646Uw0, InterfaceC5441k61, TC, InterfaceC7110ss, InterfaceC5744li, Provider, J2, PZ, InterfaceC4255hz, K61, JNIFunctionBody, InterfaceC0195Cg0, InterfaceC1998Zj1 {
    public static volatile G10 c;
    public static final Object d = new Object();
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ G10(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public static String J(Bundle bundle, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    public static void w(G10 g10, ReactApplicationContext reactApplicationContext, Bundle bundle) {
        String string;
        g10.getClass();
        if (bundle.getString(NotificationConstants.ID) == null) {
            bundle.putString(NotificationConstants.ID, String.valueOf(new SecureRandom().nextInt()));
        }
        Application application = (Application) reactApplicationContext.getApplicationContext();
        new C0481Fx1(((RNPushNotificationListenerService) g10.b).getApplication());
        C3364dI0 c3364dI0 = new C3364dI0(application);
        boolean zC = c3364dI0.c();
        bundle.putBoolean(C4524ea.g, zC);
        boolean z = false;
        bundle.putBoolean("userInteraction", false);
        String string2 = null;
        try {
            string = C3554eI0.a(bundle).toString();
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
                string2 = C3554eI0.a(bundle).toString();
            } catch (JSONException unused2) {
            }
            WritableMap writableMapCreateMap2 = Arguments.createMap();
            writableMapCreateMap2.putString(Core.Event.Result.DATA_JSON, string2);
            if (reactApplicationContext.hasActiveCatalystInstance()) {
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactApplicationContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("remoteFetch", writableMapCreateMap2);
            }
        }
        try {
            z = C0481Fx1.d.getBoolean("com.dieam.reactnativepushnotification.notification_foreground", false);
        } catch (Exception unused3) {
        }
        if (z || !zC) {
            bundle.toString();
            c3364dI0.h(bundle);
        }
    }

    public synchronized void A(OT0 ot0) {
        O90.f(ot0, "route");
        ((LinkedHashSet) this.b).remove(ot0);
    }

    public long B() {
        BT bt = (BT) this.b;
        if (bt instanceof BT) {
            String path = bt.b.d.getPath();
            O90.e(path, "outputOptions.file.path");
            return new StatFs(path).getAvailableBytes();
        }
        throw new AssertionError("Unknown OutputOptions: " + bt);
    }

    public ByteBuffer C() {
        return ((Image.Plane) this.b).getBuffer();
    }

    public short D(int i) {
        ByteBuffer byteBuffer = (ByteBuffer) this.b;
        if (byteBuffer.remaining() - i >= 2) {
            return byteBuffer.getShort(i);
        }
        return (short) -1;
    }

    public String E(String str, String str2, String[] strArr) {
        int identifier;
        if (str != null) {
            return str;
        }
        Context applicationContext = ((RNPushNotificationListenerService) this.b).getApplicationContext();
        String packageName = applicationContext.getPackageName();
        if (str2 == null || (identifier = applicationContext.getResources().getIdentifier(str2, "string", packageName)) == 0) {
            return null;
        }
        return strArr != null ? applicationContext.getResources().getString(identifier, strArr) : applicationContext.getResources().getString(identifier);
    }

    public int F() {
        return ((Image.Plane) this.b).getPixelStride();
    }

    public Set G() {
        Set setUnmodifiableSet;
        synchronized (((HashSet) this.b)) {
            setUnmodifiableSet = Collections.unmodifiableSet((HashSet) this.b);
        }
        return setUnmodifiableSet;
    }

    public int H() {
        return ((Image.Plane) this.b).getRowStride();
    }

    public void I(Exception exc) {
        AbstractC6789rA1.e("Audio sink error", exc);
        CC0 cc0 = ((C0843Ko0) this.b).R1;
        Handler handler = (Handler) cc0.b;
        if (handler != null) {
            handler.post(new RunnableC7629va(cc0, exc, 1));
        }
    }

    public void K(CaptureRequest.Key key, Object obj) {
        ((C0468Ft0) this.b).e(new C0572Hc("camera2.captureRequest.option." + key.getName(), Object.class, key), obj);
    }

    @Override // defpackage.InterfaceC4255hz
    public void a(D40 d40, List list) throws IOException {
        C40 c40;
        O90.f(d40, "url");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C4064gz c4064gz = (C4064gz) it.next();
            O90.f(c4064gz, "cookie");
            arrayList.add(c4064gz.a(true));
        }
        try {
            ((CookieHandler) this.b).put(d40.h(), AbstractC7287tn0.c(new Pair("Set-Cookie", arrayList)));
        } catch (IOException e) {
            C6601qB0 c6601qB0 = C6601qB0.a;
            C6601qB0 c6601qB02 = C6601qB0.a;
            StringBuilder sb = new StringBuilder("Saving cookies failed for ");
            try {
                c40 = new C40();
                c40.f(d40, "/...");
            } catch (IllegalArgumentException unused) {
                c40 = null;
            }
            D40 d40C = c40 != null ? c40.c() : null;
            O90.c(d40C);
            sb.append(d40C);
            String string = sb.toString();
            c6601qB02.getClass();
            C6601qB0.i(5, string, e);
        }
    }

    @Override // defpackage.TC
    public void b() {
        switch (this.a) {
            case 11:
                break;
            default:
                ((C6258oO0) this.b).release();
                break;
        }
    }

    @Override // defpackage.InterfaceC1646Uw0
    public Object c() {
        Type type = (Type) this.b;
        if (!(type instanceof ParameterizedType)) {
            throw new C7074sg("Invalid EnumMap type: " + type.toString());
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof Class) {
            return new EnumMap((Class) type2);
        }
        throw new C7074sg("Invalid EnumMap type: " + type.toString());
    }

    @Override // defpackage.InterfaceC7986xS0
    public void d(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        O90.f(bitmap, "value");
        ((Set) this.b).remove(bitmap);
        bitmap.recycle();
    }

    @Override // defpackage.InterfaceC1998Zj1
    public int e(View view) {
        AO0 ao0 = (AO0) view.getLayoutParams();
        ((AbstractC8354zO0) this.b).getClass();
        return (view.getTop() - ((AO0) view.getLayoutParams()).b.top) - ((ViewGroup.MarginLayoutParams) ao0).topMargin;
    }

    @Override // defpackage.InterfaceC1998Zj1
    public int f() {
        return ((AbstractC8354zO0) this.b).G();
    }

    @Override // defpackage.InterfaceC8256yt
    public void g() {
        ((NV1) this.b).getClass();
    }

    @Override // defpackage.InterfaceC2470cC0
    public Object get(int i) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, (int) Math.ceil(i / 2.0d), Bitmap.Config.RGB_565);
        O90.e(bitmapCreateBitmap, "createBitmap(\n          …   Bitmap.Config.RGB_565)");
        ((Set) this.b).add(bitmapCreateBitmap);
        return bitmapCreateBitmap;
    }

    @Override // defpackage.InterfaceC1998Zj1
    public int h() {
        AbstractC8354zO0 abstractC8354zO0 = (AbstractC8354zO0) this.b;
        return abstractC8354zO0.o - abstractC8354zO0.D();
    }

    @Override // defpackage.X3
    public void i(Bundle bundle, String str) {
        C6406pA c6406pA = (C6406pA) this.b;
        if (c6406pA != null) {
            try {
                String str2 = "$A$:" + J(bundle, str);
                C6597qA c6597qA = c6406pA.a;
                c6597qA.getClass();
                ((ZA) c6597qA.p.b).a(new RunnableC6215oA(c6597qA, System.currentTimeMillis() - c6597qA.d, str2, 0));
            } catch (JSONException unused) {
            }
        }
    }

    @Override // expo.modules.kotlin.jni.JNIFunctionBody
    public Object invoke(Object[] objArr) {
        O90.f(objArr, "it");
        return ((JavaScriptModuleObject) this.b).a;
    }

    @Override // defpackage.InterfaceC7110ss
    public C6919rs j(C0074As c0074As) {
        C6919rs c6919rsJ;
        O90.f(c0074As, "classId");
        KX kxG = c0074As.g();
        O90.e(kxG, "getPackageFqName(...)");
        Iterator it = AbstractC7201tK1.c((InterfaceC0330Dz0) this.b, kxG).iterator();
        while (it.hasNext()) {
            InterfaceC8465zz0 interfaceC8465zz0 = (InterfaceC8465zz0) it.next();
            if ((interfaceC8465zz0 instanceof C1840Xj) && (c6919rsJ = ((C1840Xj) interfaceC8465zz0).j.j(c0074As)) != null) {
                return c6919rsJ;
            }
        }
        return null;
    }

    @Override // defpackage.InterfaceC0195Cg0
    public void l(C1559Tt0 c1559Tt0, Object obj) {
        String strB = c1559Tt0.b();
        boolean zEquals = "version".equals(strB);
        C6827rN0 c6827rN0 = (C6827rN0) this.b;
        if (zEquals) {
            if (obj instanceof int[]) {
                c6827rN0.a = (int[]) obj;
            }
        } else if ("multifileClassName".equals(strB)) {
            c6827rN0.b = obj instanceof String ? (String) obj : null;
        }
    }

    @Override // defpackage.TC
    public Object m() {
        switch (this.a) {
            case 11:
                return this.b;
            default:
                C6258oO0 c6258oO0 = (C6258oO0) this.b;
                c6258oO0.reset();
                return c6258oO0;
        }
    }

    @Override // defpackage.InterfaceC0195Cg0
    public void n(C1559Tt0 c1559Tt0, C0230Cs c0230Cs) {
    }

    @Override // defpackage.InterfaceC0195Cg0
    public InterfaceC0273Dg0 o(C1559Tt0 c1559Tt0) {
        String strB = c1559Tt0.b();
        if ("data".equals(strB) || "filePartClassNames".equals(strB)) {
            return new C6637qN0(this, 0);
        }
        if ("strings".equals(strB)) {
            return new C6637qN0(this, 1);
        }
        return null;
    }

    @Override // defpackage.J2
    public void onActivityResult(Object obj) {
        I2 i2 = (I2) obj;
        o oVar = (o) this.b;
        C3983gY c3983gY = (C3983gY) oVar.C.pollLast();
        if (c3983gY == null) {
            return;
        }
        Fragment fragmentC = oVar.c.c(c3983gY.a);
        if (fragmentC == null) {
            return;
        }
        fragmentC.onActivityResult(c3983gY.b, i2.a, i2.b);
    }

    @Override // defpackage.PZ
    public void onFailure(Throwable th) throws Exception {
        ((InterfaceC3903g70) this.b).close();
    }

    @Override // defpackage.PZ
    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
    }

    @Override // defpackage.InterfaceC0195Cg0
    public void p(C1559Tt0 c1559Tt0, C0074As c0074As, C1559Tt0 c1559Tt02) {
    }

    @Override // defpackage.InterfaceC8256yt
    public void q(C6946s01 c6946s01, Throwable th) {
        ((NV1) this.b).getClass();
        O90.f(c6946s01, "reference");
        Object objD = c6946s01.d();
        AbstractC3393dS.q("Fresco", "Finalized without closing: %x %x (type = %s).\nStack:\n%s", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(c6946s01)), objD != null ? objD.getClass().getName() : "<value is null>", th == null ? "" : Log.getStackTraceString(th));
    }

    @Override // defpackage.InterfaceC0195Cg0
    public InterfaceC0195Cg0 r(C0074As c0074As, C1559Tt0 c1559Tt0) {
        return null;
    }

    @Override // defpackage.InterfaceC3677ex0
    public void r0(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            C0431Fh c0431Fh = (C0431Fh) this.b;
            if (c0431Fh.t()) {
                c0431Fh.v();
            } else {
                CharSequence charSequenceD = c0431Fh.b.d();
                if (charSequenceD == null) {
                    charSequenceD = c0431Fh.getString(R.string.default_error_msg);
                }
                c0431Fh.w(13, charSequenceD);
                c0431Fh.r(2);
            }
            c0431Fh.b.h(false);
        }
    }

    @Override // defpackage.InterfaceC4255hz
    public List s(D40 d40) throws IOException {
        C40 c40;
        MN mn = MN.a;
        O90.f(d40, "url");
        ArrayList arrayList = null;
        try {
            Map<String, List<String>> map = ((CookieHandler) this.b).get(d40.h(), NN.a);
            O90.e(map, "cookieHeaders");
            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                String key = entry.getKey();
                List<String> value = entry.getValue();
                if ("Cookie".equalsIgnoreCase(key) || "Cookie2".equalsIgnoreCase(key)) {
                    O90.e(value, "value");
                    if (value.isEmpty()) {
                        continue;
                    } else {
                        for (String str : value) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            O90.e(str, "header");
                            ArrayList arrayList2 = new ArrayList();
                            int length = str.length();
                            int i = 0;
                            while (i < length) {
                                int iF = AbstractC0199Ch1.f(i, str, length, ";,");
                                int iG = AbstractC0199Ch1.g(str, '=', i, iF);
                                String strA = AbstractC0199Ch1.A(i, iG, str);
                                if (!D51.o(strA, "$", false)) {
                                    String strA2 = iG < iF ? AbstractC0199Ch1.A(iG + 1, iF, str) : "";
                                    if (D51.o(strA2, "\"", false) && D51.i(strA2, "\"")) {
                                        strA2 = strA2.substring(1, strA2.length() - 1);
                                        O90.e(strA2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                                    }
                                    if (!O90.a(AbstractC7538v51.Y(strA).toString(), strA)) {
                                        throw new IllegalArgumentException("name is not trimmed");
                                    }
                                    if (!O90.a(AbstractC7538v51.Y(strA2).toString(), strA2)) {
                                        throw new IllegalArgumentException("value is not trimmed");
                                    }
                                    String str2 = d40.d;
                                    O90.f(str2, "domain");
                                    String strB = M12.b(str2);
                                    if (strB == null) {
                                        throw new IllegalArgumentException("unexpected domain: ".concat(str2));
                                    }
                                    arrayList2.add(new C4064gz(strA, strA2, 253402300799999L, strB, "/", false, false, false, false));
                                }
                                i = iF + 1;
                            }
                            arrayList.addAll(arrayList2);
                        }
                    }
                }
            }
            if (arrayList == null) {
                return mn;
            }
            List listUnmodifiableList = Collections.unmodifiableList(arrayList);
            O90.e(listUnmodifiableList, "Collections.unmodifiableList(cookies)");
            return listUnmodifiableList;
        } catch (IOException e) {
            C6601qB0 c6601qB0 = C6601qB0.a;
            C6601qB0 c6601qB02 = C6601qB0.a;
            StringBuilder sb = new StringBuilder("Loading cookies failed for ");
            try {
                c40 = new C40();
                c40.f(d40, "/...");
            } catch (IllegalArgumentException unused) {
                c40 = null;
            }
            D40 d40C = c40 != null ? c40.c() : null;
            O90.c(d40C);
            sb.append(d40C);
            String string = sb.toString();
            c6601qB02.getClass();
            C6601qB0.i(5, string, e);
            return mn;
        }
    }

    @Override // defpackage.InterfaceC1998Zj1
    public View t(int i) {
        return ((AbstractC8354zO0) this.b).u(i);
    }

    @Override // defpackage.InterfaceC5441k61
    public Task then(Object obj) {
        if (((BZ0) obj) == null) {
            return AbstractC3782fU1.e(null);
        }
        CallableC5451kA callableC5451kA = (CallableC5451kA) this.b;
        C3892g32 c3892g32A = C5833mA.a(callableC5451kA.e);
        C5833mA c5833mA = callableC5451kA.e;
        return AbstractC3782fU1.g(Arrays.asList(c3892g32A, ((C1252Pv) c5833mA.m).A((ZA) ((C6846rT1) c5833mA.e).b, null)));
    }

    @Override // defpackage.InterfaceC1998Zj1
    public int u(View view) {
        AO0 ao0 = (AO0) view.getLayoutParams();
        ((AbstractC8354zO0) this.b).getClass();
        return view.getBottom() + ((AO0) view.getLayoutParams()).b.bottom + ((ViewGroup.MarginLayoutParams) ao0).bottomMargin;
    }

    @Override // defpackage.InterfaceC2378bj
    public void v(C6406pA c6406pA) {
        this.b = c6406pA;
    }

    public C1016Mu0 x() {
        C0873Ky0 c0873Ky0A = C0873Ky0.a((C0468Ft0) this.b);
        C1016Mu0 c1016Mu0 = new C1016Mu0(28);
        c1016Mu0.b = c0873Ky0A;
        return c1016Mu0;
    }

    public void y() {
        ((FA1) this.b).a.r(null);
    }

    public /* synthetic */ G10(int i, boolean z) {
        this.a = i;
    }

    public /* synthetic */ G10(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
    }

    public G10(InputStream inputStream, C8426zm0 c8426zm0) {
        this.a = 18;
        C6258oO0 c6258oO0 = new C6258oO0(inputStream, c8426zm0);
        this.b = c6258oO0;
        c6258oO0.mark(5242880);
    }

    @Override // defpackage.InterfaceC6777r61, javax.inject.Provider
    public Object get() {
        int iC;
        switch (this.a) {
            case 3:
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
                int i3 = c7253tc.e;
                if (i3 == -1) {
                    AbstractC0759Jm0.f("DefAudioResolver");
                    i3 = 1;
                } else {
                    AbstractC0759Jm0.f("DefAudioResolver");
                }
                Range range = C7253tc.g;
                Range range2 = c7253tc.d;
                if (range.equals(range2)) {
                    AbstractC0759Jm0.f("DefAudioResolver");
                    iC = 44100;
                } else {
                    iC = AbstractC3573eO1.c(range2, i3, i2, ((Integer) range2.getUpper()).intValue());
                    AbstractC0759Jm0.f("DefAudioResolver");
                }
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
            default:
                MU mu = (MU) ((C1155Oo1) this.b).a;
                AbstractC2501cM1.d(mu);
                return mu;
        }
    }

    public G10(InterfaceC2490cJ interfaceC2490cJ) {
        this.a = 20;
        O90.f(interfaceC2490cJ, "devSupportManager");
        this.b = interfaceC2490cJ;
    }

    public G10(CookieHandler cookieHandler) {
        this.a = 19;
        O90.f(cookieHandler, "cookieHandler");
        this.b = cookieHandler;
    }

    public G10(int i) {
        this.a = i;
        switch (i) {
            case 7:
                this.b = new FA1();
                break;
            case 14:
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
                O90.e(setNewSetFromMap, "newIdentityHashSet()");
                this.b = setNewSetFromMap;
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                this.b = C0468Ft0.b();
                break;
            case 29:
                this.b = new LinkedHashSet();
                break;
            default:
                this.b = new HashSet();
                break;
        }
    }

    public G10(BT bt) {
        this.a = 23;
        O90.f(bt, "outputOptions");
        this.b = bt;
    }

    public G10(byte[] bArr, int i) {
        this.a = 12;
        this.b = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
    }

    private final void z() {
    }

    @Override // defpackage.InterfaceC0195Cg0
    public void k() {
    }
}
