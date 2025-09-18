package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaCodec;
import android.os.Trace;
import android.util.Size;
import com.facebook.soloader.SoLoader;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import kotlin.Pair;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: Fv0 */
/* loaded from: classes.dex */
public class C0474Fv0 implements InterfaceC3727fC0, InterfaceC7986xS0, InterfaceC0940Lv, InterfaceC5839mC, InterfaceC1836Xh1, JB1, InterfaceC1784Wq0, InterfaceC5935mi, InterfaceC7686vt, InterfaceC1646Uw0, QN0, InterfaceC4347iS, C61, InterfaceC6163nu0, InterfaceC5314jS, InterfaceC0609Ho0, InterfaceC0981Mi1, InterfaceC6053nJ1 {
    public static C0474Fv0 b;
    public static final C0474Fv0 c = new C0474Fv0(1);
    public static final C0474Fv0 d = new C0474Fv0(2);
    public static final C0474Fv0 e = new C0474Fv0(3);
    public static final C0474Fv0 f = new C0474Fv0(4);
    public static final /* synthetic */ C0474Fv0 g = new C0474Fv0(5);
    public static final C2032Zv h = new C2032Zv();
    public static final /* synthetic */ C0474Fv0 i = new C0474Fv0(6);
    public final /* synthetic */ int a;

    public /* synthetic */ C0474Fv0(int i2) {
        this.a = i2;
    }

    public static C0322Dw1 s(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject(str2);
        String string = jSONObject.getString("name");
        O90.e(string, "jsonObject.getString(NAME_KEY)");
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        O90.e(jSONObject2, "jsonObject.getJSONObject(DATA_KEY)");
        ArrayList arrayList = new ArrayList();
        Iterator<String> itKeys = jSONObject2.keys();
        O90.e(itKeys, "keys()");
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            arrayList.add(new Pair(next, jSONObject2.get(next).toString()));
        }
        return new C0322Dw1(str, string, AbstractC7096sn0.n(arrayList));
    }

    public static MediaCodec t(C0531Go0 c0531Go0) throws IOException {
        C1076No0 c1076No0 = c0531Go0.a;
        StringBuilder sb = new StringBuilder("createCodec:");
        String str = c1076No0.a;
        sb.append(str);
        Trace.beginSection(sb.toString());
        MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
        Trace.endSection();
        return mediaCodecCreateByCodecName;
    }

    public static synchronized C0474Fv0 u() {
        try {
            if (b == null) {
                b = new C0474Fv0(0);
            }
        } catch (Throwable th) {
            throw th;
        }
        return b;
    }

    @Override // defpackage.JB1
    public void Z(C8325zE1 c8325zE1, ListenerHolder.ListenerKey listenerKey, boolean z, S81 s81) {
        c8325zE1.e(listenerKey, z, s81);
    }

    @Override // defpackage.InterfaceC0981Mi1
    public /* synthetic */ C1981Ze b(Size size, CM cm) {
        return null;
    }

    @Override // defpackage.InterfaceC1646Uw0
    public Object c() {
        return new ConcurrentSkipListMap();
    }

    @Override // defpackage.InterfaceC5314jS
    public Object create() {
        try {
            return new XU0(MessageDigest.getInstance("SHA-256"));
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // defpackage.InterfaceC7986xS0
    public /* bridge */ /* synthetic */ void d(Object obj) {
    }

    @Override // defpackage.InterfaceC0609Ho0
    public InterfaceC0687Io0 e(C0531Go0 c0531Go0) {
        MediaCodec mediaCodecT = null;
        try {
            mediaCodecT = t(c0531Go0);
            Trace.beginSection("configureCodec");
            mediaCodecT.configure(c0531Go0.b, c0531Go0.d, c0531Go0.e, 0);
            Trace.endSection();
            Trace.beginSection("startCodec");
            mediaCodecT.start();
            Trace.endSection();
            return new C5772lr0(mediaCodecT);
        } catch (IOException | RuntimeException e2) {
            if (mediaCodecT != null) {
                mediaCodecT.release();
            }
            throw e2;
        }
    }

    @Override // defpackage.InterfaceC0940Lv
    public Object g(C1241Pr0 c1241Pr0) {
        Object objH = c1241Pr0.h(new C6997sG0(InterfaceC0505Gf1.class, Executor.class));
        O90.e(objH, "c.get(Qualified.qualifie…a, Executor::class.java))");
        return N02.e((Executor) objH);
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new ExecutorC2442c30(Executors.newSingleThreadExecutor());
    }

    @Override // defpackage.QN0
    public AbstractC0663Ig0 getType() {
        throw new IllegalStateException("This method should not be called");
    }

    @Override // defpackage.InterfaceC5935mi
    public Bitmap h(int i2, int i3, Bitmap.Config config) {
        return Bitmap.createBitmap(i2, i3, config);
    }

    @Override // defpackage.InterfaceC5935mi
    public void i(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // defpackage.InterfaceC6163nu0
    public boolean j(String str) {
        return SoLoader.k(0, str);
    }

    @Override // defpackage.InterfaceC5839mC
    public Iterable k(Object obj) {
        InterfaceC5927mf0[] interfaceC5927mf0Arr = C1976Zc0.h;
        return ((InterfaceC8042xl) obj).x1().j();
    }

    @Override // defpackage.InterfaceC0981Mi1
    public /* synthetic */ C1981Ze l(C6496pe c6496pe, CM cm) {
        return null;
    }

    @Override // defpackage.C61
    public D61 n(C5818m5 c5818m5) {
        return new C2348bZ((Context) c5818m5.c, (String) c5818m5.d, (C2359bc1) c5818m5.e, c5818m5.a, c5818m5.b);
    }

    @Override // defpackage.InterfaceC5935mi
    public Bitmap o(int i2, int i3, Bitmap.Config config) {
        return Bitmap.createBitmap(i2, i3, config);
    }

    @Override // defpackage.InterfaceC0981Mi1
    public ArrayList p(CM cm) {
        return new ArrayList();
    }

    @Override // defpackage.InterfaceC1784Wq0
    public boolean q0(MenuC0225Cq0 menuC0225Cq0) {
        return false;
    }

    @Override // defpackage.InterfaceC1836Xh1
    public Object z(AbstractC8396zc0 abstractC8396zc0, float f2) {
        return AbstractC0651Ic0.b(abstractC8396zc0, f2);
    }

    @Override // defpackage.InterfaceC6053nJ1
    public Object zza() {
        switch (this.a) {
            case 26:
                C7434uY1.b.get();
                Boolean bool = (Boolean) HY1.i.a();
                bool.getClass();
                return bool;
            case 27:
                C6095nX1.b.get();
                Boolean bool2 = (Boolean) C7049sX1.b.a();
                bool2.getClass();
                return bool2;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                PW1.b.get();
                Long l = (Long) UW1.h.a();
                l.getClass();
                return l;
            default:
                C4176hY1.b.get();
                Long l2 = (Long) C6480pY1.e.a();
                l2.getClass();
                return l2;
        }
    }

    @Override // defpackage.InterfaceC7686vt
    public void a() {
    }

    @Override // defpackage.InterfaceC7686vt
    public void close() {
    }

    @Override // defpackage.InterfaceC5935mi
    public void r() {
    }

    @Override // defpackage.InterfaceC7686vt
    public void m(String str) {
    }

    @Override // defpackage.InterfaceC5935mi
    public void q(int i2) {
    }

    @Override // defpackage.InterfaceC1784Wq0
    public void f(MenuC0225Cq0 menuC0225Cq0, boolean z) {
    }
}
