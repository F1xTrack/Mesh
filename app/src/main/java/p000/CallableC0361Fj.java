package p000;

import androidx.work.impl.WorkDatabase;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p019vk.push.core.remote.config.omicron.C2425d;
import com.p019vk.push.core.remote.config.omicron.Data;
import com.p019vk.push.core.remote.config.omicron.DataId;
import com.p019vk.push.core.remote.config.omicron.retriever.DataQuery;
import com.p019vk.push.core.remote.config.omicron.retriever.NetworkDataRetriever;
import io.appmetrica.analytics.impl.C5309n0;
import io.invertase.firebase.messaging.ReactNativeFirebaseMessagingModule;
import io.sentry.C5751B;
import io.sentry.metrics.AbstractC6065c;
import io.sentry.metrics.C6063a;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.InetAddress;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: Fj */
/* loaded from: classes.dex */
public final /* synthetic */ class CallableC0361Fj implements Callable {

    /* renamed from: a */
    public final /* synthetic */ int f3400a;

    /* renamed from: b */
    public final /* synthetic */ Object f3401b;

    public /* synthetic */ CallableC0361Fj(int i, Object obj) {
        this.f3400a = i;
        this.f3401b = obj;
    }

    /* renamed from: a */
    private final Object m2763a() {
        C7232yw c7232ywM26285a;
        FileInputStream fileInputStreamOpenFileInput;
        Throwable th;
        C0940Ow c0940Ow = (C0940Ow) this.f3401b;
        synchronized (c0940Ow) {
            c7232ywM26285a = null;
            try {
                fileInputStreamOpenFileInput = c0940Ow.f8690a.openFileInput(c0940Ow.f8691b);
                try {
                    int iAvailable = fileInputStreamOpenFileInput.available();
                    byte[] bArr = new byte[iAvailable];
                    fileInputStreamOpenFileInput.read(bArr, 0, iAvailable);
                    c7232ywM26285a = C7232yw.m26285a(new JSONObject(new String(bArr, "UTF-8")));
                    fileInputStreamOpenFileInput.close();
                } catch (FileNotFoundException | JSONException unused) {
                    if (fileInputStreamOpenFileInput != null) {
                        fileInputStreamOpenFileInput.close();
                    }
                    return c7232ywM26285a;
                } catch (Throwable th2) {
                    th = th2;
                    if (fileInputStreamOpenFileInput != null) {
                        fileInputStreamOpenFileInput.close();
                    }
                    throw th;
                }
            } catch (FileNotFoundException | JSONException unused2) {
                fileInputStreamOpenFileInput = null;
            } catch (Throwable th3) {
                fileInputStreamOpenFileInput = null;
                th = th3;
            }
        }
        return c7232ywM26285a;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        boolean z = true;
        boolean z2 = false;
        Data data = null;
        switch (this.f3400a) {
            case 0:
                C0487Hj c0487Hj = (C0487Hj) this.f3401b;
                O90.m5968f(c0487Hj, "this$0");
                ((C9196e41) c0487Hj.f4451h).m17861w0();
                C7068wK c7068wK = (C7068wK) ((InterfaceC6428mT) c0487Hj.f4445b);
                synchronized (c7068wK.f44820m) {
                    try {
                        c7068wK.f44815h.m694a();
                        c7068wK.f44812e.clear();
                        c7068wK.f44811d.getClass();
                    } catch (IOException | NullPointerException e) {
                        C7356Av0 c7356Av0 = c7068wK.f44817j;
                        e.getMessage();
                        c7356Av0.getClass();
                    }
                    c7068wK.f44818k.m25168c();
                }
                return null;
            case 1:
                return m2763a();
            case 2:
                C6409mA c6409mA = ((C6663qA) this.f3401b).f40645h;
                c6409mA.getClass();
                C10910rT1.m24366p();
                C1339VH c1339vh = (C1339VH) c6409mA.f37529c;
                String str = (String) c1339vh.f12486b;
                C0471HT c0471ht = (C0471HT) c1339vh.f12487c;
                c0471ht.getClass();
                if (new File((File) c0471ht.f4311c, str).exists()) {
                    String str2 = (String) c1339vh.f12486b;
                    c0471ht.getClass();
                    new File((File) c0471ht.f4311c, str2).delete();
                } else {
                    String strM22696e = c6409mA.m22696e();
                    if (strM22696e == null || !((C6806sA) c6409mA.f37536j).mo7024c(strM22696e)) {
                        z = false;
                    }
                }
                return Boolean.valueOf(z);
            case 3:
                WorkDatabase workDatabase = (WorkDatabase) ((C9432fw1) this.f3401b).f27505b;
                Long lM1052Y0 = workDatabase.mo10324q().m1052Y0("next_alarm_manager_id");
                int iLongValue = lM1052Y0 != null ? (int) lM1052Y0.longValue() : 0;
                workDatabase.mo10324q().m1056a1(new BC0("next_alarm_manager_id", Long.valueOf(iLongValue != Integer.MAX_VALUE ? iLongValue + 1 : 0)));
                return Integer.valueOf(iLongValue);
            case 4:
                C2425d c2425d = (C2425d) this.f3401b;
                C7360Ax0 c7360Ax0 = c2425d.f20543g;
                NetworkDataRetriever networkDataRetriever = c7360Ax0.f485b;
                DataQuery dataQueryM26590a = c2425d.m26590a();
                DataId dataId = c2425d.f47113d;
                int i = AbstractC11862yx0.f46550b[networkDataRetriever.retrieve(dataId, dataQueryM26590a).ordinal()];
                if (i != 1) {
                    if (i == 2) {
                    }
                    return data;
                }
                data = networkDataRetriever.getData();
                c7360Ax0.f484a.putData(dataId, data);
                c2425d.f47110a.set(data);
                c2425d.f47112c.f20510f.onCacheUpdated(dataId);
                c7360Ax0.f486c.setUpdateDate(dataId, c7360Ax0.f487d.getCurrentDate());
                return data;
            case 5:
                return ((ReactNativeFirebaseMessagingModule) this.f3401b).lambda$hasPermission$6();
            case 6:
                return ReactNativeFirebaseMessagingModule.lambda$sendMessage$8((ReadableMap) this.f3401b);
            case 7:
                return ((C11159tQ0) this.f3401b).m24930b("firebase");
            case 8:
                C1361Vd c1361Vd = (C1361Vd) ((ES1) this.f3401b).f2709c;
                IZ0 iz0 = (IZ0) c1361Vd.f12663d;
                C7190yG c7190yG = (C7190yG) c1361Vd.f12666g;
                c7190yG.getClass();
                C10910rT1.m24367r();
                try {
                    HashMap mapM26107c = C7190yG.m26107c(iz0);
                    C10189lr0 c10189lr0 = new C10189lr0(c7190yG.f46161b, mapM26107c);
                    HashMap map = (HashMap) c10189lr0.f37325d;
                    map.put("User-Agent", "Crashlytics Android SDK/19.4.0");
                    map.put("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
                    C7190yG.m26105a(c10189lr0, iz0);
                    mapM26107c.toString();
                    C0986Pf c0986PfM22553K = c10189lr0.m22553K();
                    int i2 = c0986PfM22553K.f9216b;
                    if (i2 == 200 || i2 == 201 || i2 == 202 || i2 == 203) {
                        return new JSONObject((String) c0986PfM22553K.f9217c);
                    }
                    return null;
                } catch (IOException | Exception unused) {
                    return null;
                }
            case 9:
                CG1 cg1 = FirebaseAnalytics.getInstance((ReactApplicationContext) ((C8755ag1) this.f3401b).f2474b).f18443a;
                cg1.getClass();
                cg1.m1136f(new CH1(cg1));
                return null;
            case 10:
                C5751B c5751b = (C5751B) this.f3401b;
                c5751b.getClass();
                try {
                    c5751b.f33216e.getClass();
                    c5751b.f33213b = InetAddress.getLocalHost().getCanonicalHostName();
                    c5751b.f33214c = System.currentTimeMillis() + c5751b.f33212a;
                    return null;
                } finally {
                    c5751b.f33215d.set(false);
                }
            case 11:
                StringBuilder sb = new StringBuilder();
                for (Map.Entry entry : ((C6063a) this.f3401b).f34241a.entrySet()) {
                    ((Long) entry.getKey()).getClass();
                    Collection collectionValues = ((Map) entry.getValue()).values();
                    int i3 = AbstractC6065c.f34244b;
                    Iterator it = collectionValues.iterator();
                    if (it.hasNext()) {
                        throw AbstractC7222ym.m26227d(it);
                    }
                }
                return sb.toString().getBytes(C6063a.f34240b);
            default:
                return ((C5309n0) this.f3401b).m20791p();
        }
    }
}
