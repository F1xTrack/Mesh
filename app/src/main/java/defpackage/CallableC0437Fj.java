package defpackage;

import androidx.work.impl.WorkDatabase;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.vk.push.core.remote.config.omicron.Data;
import com.vk.push.core.remote.config.omicron.DataId;
import com.vk.push.core.remote.config.omicron.d;
import com.vk.push.core.remote.config.omicron.retriever.DataQuery;
import com.vk.push.core.remote.config.omicron.retriever.NetworkDataRetriever;
import io.appmetrica.analytics.impl.C4729n0;
import io.invertase.firebase.messaging.ReactNativeFirebaseMessagingModule;
import io.sentry.B;
import io.sentry.metrics.a;
import io.sentry.metrics.c;
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

/* renamed from: Fj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class CallableC0437Fj implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ CallableC0437Fj(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final Object a() {
        C8265yw c8265ywA;
        FileInputStream fileInputStreamOpenFileInput;
        Throwable th;
        C1177Ow c1177Ow = (C1177Ow) this.b;
        synchronized (c1177Ow) {
            c8265ywA = null;
            try {
                fileInputStreamOpenFileInput = c1177Ow.a.openFileInput(c1177Ow.b);
                try {
                    int iAvailable = fileInputStreamOpenFileInput.available();
                    byte[] bArr = new byte[iAvailable];
                    fileInputStreamOpenFileInput.read(bArr, 0, iAvailable);
                    c8265ywA = C8265yw.a(new JSONObject(new String(bArr, "UTF-8")));
                    fileInputStreamOpenFileInput.close();
                } catch (FileNotFoundException | JSONException unused) {
                    if (fileInputStreamOpenFileInput != null) {
                        fileInputStreamOpenFileInput.close();
                    }
                    return c8265ywA;
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
        return c8265ywA;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        boolean z = true;
        boolean z2 = false;
        Data data = null;
        switch (this.a) {
            case 0:
                C0593Hj c0593Hj = (C0593Hj) this.b;
                O90.f(c0593Hj, "this$0");
                ((C3513e41) c0593Hj.h).w0();
                C7771wK c7771wK = (C7771wK) ((InterfaceC5890mT) c0593Hj.b);
                synchronized (c7771wK.m) {
                    try {
                        c7771wK.h.a();
                        c7771wK.e.clear();
                        c7771wK.d.getClass();
                    } catch (IOException | NullPointerException e) {
                        C0084Av0 c0084Av0 = c7771wK.j;
                        e.getMessage();
                        c0084Av0.getClass();
                    }
                    c7771wK.k.c();
                }
                return null;
            case 1:
                return a();
            case 2:
                C5833mA c5833mA = ((C6597qA) this.b).h;
                c5833mA.getClass();
                C6846rT1.p();
                VH vh = (VH) c5833mA.c;
                String str = (String) vh.b;
                HT ht = (HT) vh.c;
                ht.getClass();
                if (new File((File) ht.c, str).exists()) {
                    String str2 = (String) vh.b;
                    ht.getClass();
                    new File((File) ht.c, str2).delete();
                } else {
                    String strE = c5833mA.e();
                    if (strE == null || !((C6978sA) c5833mA.j).c(strE)) {
                        z = false;
                    }
                }
                return Boolean.valueOf(z);
            case 3:
                WorkDatabase workDatabase = (WorkDatabase) ((C3866fw1) this.b).b;
                Long lY0 = workDatabase.q().Y0("next_alarm_manager_id");
                int iLongValue = lY0 != null ? (int) lY0.longValue() : 0;
                workDatabase.q().a1(new BC0("next_alarm_manager_id", Long.valueOf(iLongValue != Integer.MAX_VALUE ? iLongValue + 1 : 0)));
                return Integer.valueOf(iLongValue);
            case 4:
                d dVar = (d) this.b;
                C0090Ax0 c0090Ax0 = dVar.g;
                NetworkDataRetriever networkDataRetriever = c0090Ax0.b;
                DataQuery dataQueryA = dVar.a();
                DataId dataId = dVar.d;
                int i = AbstractC8269yx0.b[networkDataRetriever.retrieve(dataId, dataQueryA).ordinal()];
                if (i != 1) {
                    if (i == 2) {
                    }
                    return data;
                }
                data = networkDataRetriever.getData();
                c0090Ax0.a.putData(dataId, data);
                dVar.a.set(data);
                dVar.c.f.onCacheUpdated(dataId);
                c0090Ax0.c.setUpdateDate(dataId, c0090Ax0.d.getCurrentDate());
                return data;
            case 5:
                return ((ReactNativeFirebaseMessagingModule) this.b).lambda$hasPermission$6();
            case 6:
                return ReactNativeFirebaseMessagingModule.lambda$sendMessage$8((ReadableMap) this.b);
            case 7:
                return ((C7218tQ0) this.b).b("firebase");
            case 8:
                C1666Vd c1666Vd = (C1666Vd) ((ES1) this.b).c;
                IZ0 iz0 = (IZ0) c1666Vd.d;
                C8139yG c8139yG = (C8139yG) c1666Vd.g;
                c8139yG.getClass();
                C6846rT1.r();
                try {
                    HashMap mapC = C8139yG.c(iz0);
                    C5772lr0 c5772lr0 = new C5772lr0(c8139yG.b, mapC);
                    HashMap map = (HashMap) c5772lr0.d;
                    map.put("User-Agent", "Crashlytics Android SDK/19.4.0");
                    map.put("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
                    C8139yG.a(c5772lr0, iz0);
                    mapC.toString();
                    C1204Pf c1204PfK = c5772lr0.K();
                    int i2 = c1204PfK.b;
                    if (i2 == 200 || i2 == 201 || i2 == 202 || i2 == 203) {
                        return new JSONObject((String) c1204PfK.c);
                    }
                    return null;
                } catch (IOException | Exception unused) {
                    return null;
                }
            case 9:
                CG1 cg1 = FirebaseAnalytics.getInstance((ReactApplicationContext) ((C2180ag1) this.b).b).a;
                cg1.getClass();
                cg1.f(new CH1(cg1));
                return null;
            case 10:
                B b = (B) this.b;
                b.getClass();
                try {
                    b.e.getClass();
                    b.b = InetAddress.getLocalHost().getCanonicalHostName();
                    b.c = System.currentTimeMillis() + b.a;
                    return null;
                } finally {
                    b.d.set(false);
                }
            case 11:
                StringBuilder sb = new StringBuilder();
                for (Map.Entry entry : ((a) this.b).a.entrySet()) {
                    ((Long) entry.getKey()).getClass();
                    Collection collectionValues = ((Map) entry.getValue()).values();
                    int i3 = c.b;
                    Iterator it = collectionValues.iterator();
                    if (it.hasNext()) {
                        throw AbstractC8235ym.d(it);
                    }
                }
                return sb.toString().getBytes(a.b);
            default:
                return ((C4729n0) this.b).p();
        }
    }
}
