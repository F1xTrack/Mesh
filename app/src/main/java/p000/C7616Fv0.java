package p000;

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
public class C7616Fv0 implements InterfaceC9339fC0, InterfaceC11673xS0, InterfaceC0750Lv, InterfaceC6411mC, InterfaceC8525Xh1, JB1, InterfaceC8490Wq0, InterfaceC6443mi, InterfaceC7040vt, InterfaceC8398Uw0, QN0, InterfaceC4243iS, C61, InterfaceC10451nu0, InterfaceC6238jS, InterfaceC7706Ho0, InterfaceC7955Mi1, InterfaceC10378nJ1 {

    /* renamed from: b */
    public static C7616Fv0 f3474b;

    /* renamed from: c */
    public static final C7616Fv0 f3475c = new C7616Fv0(1);

    /* renamed from: d */
    public static final C7616Fv0 f3476d = new C7616Fv0(2);

    /* renamed from: e */
    public static final C7616Fv0 f3477e = new C7616Fv0(3);

    /* renamed from: f */
    public static final C7616Fv0 f3478f = new C7616Fv0(4);

    /* renamed from: g */
    public static final /* synthetic */ C7616Fv0 f3479g = new C7616Fv0(5);

    /* renamed from: h */
    public static final C1631Zv f3480h = new C1631Zv();

    /* renamed from: i */
    public static final /* synthetic */ C7616Fv0 f3481i = new C7616Fv0(6);

    /* renamed from: a */
    public final /* synthetic */ int f3482a;

    public /* synthetic */ C7616Fv0(int i) {
        this.f3482a = i;
    }

    /* renamed from: s */
    public static C7515Dw1 m2823s(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject(str2);
        String string = jSONObject.getString("name");
        O90.m5967e(string, "jsonObject.getString(NAME_KEY)");
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        O90.m5967e(jSONObject2, "jsonObject.getJSONObject(DATA_KEY)");
        ArrayList arrayList = new ArrayList();
        Iterator<String> itKeys = jSONObject2.keys();
        O90.m5967e(itKeys, "keys()");
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            arrayList.add(new Pair(next, jSONObject2.get(next).toString()));
        }
        return new C7515Dw1(str, string, AbstractC11077sn0.m24786n(arrayList));
    }

    /* renamed from: t */
    public static MediaCodec m2824t(C7654Go0 c7654Go0) throws IOException {
        C8018No0 c8018No0 = c7654Go0.f3907a;
        StringBuilder sb = new StringBuilder("createCodec:");
        String str = c8018No0.f8009a;
        sb.append(str);
        Trace.beginSection(sb.toString());
        MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
        Trace.endSection();
        return mediaCodecCreateByCodecName;
    }

    /* renamed from: u */
    public static synchronized C7616Fv0 m2825u() {
        try {
            if (f3474b == null) {
                f3474b = new C7616Fv0(0);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f3474b;
    }

    @Override // p000.JB1
    /* renamed from: Z */
    public void mo1467Z(C11900zE1 c11900zE1, ListenerHolder.ListenerKey listenerKey, boolean z, S81 s81) {
        c11900zE1.m26338e(listenerKey, z, s81);
    }

    @Override // p000.InterfaceC7955Mi1
    /* renamed from: b */
    public /* synthetic */ C1614Ze mo2827b(Size size, C0149CM c0149cm) {
        return null;
    }

    @Override // p000.InterfaceC8398Uw0
    /* renamed from: c */
    public Object mo913c() {
        return new ConcurrentSkipListMap();
    }

    @Override // p000.InterfaceC6238jS
    public Object create() {
        try {
            return new XU0(MessageDigest.getInstance("SHA-256"));
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // p000.InterfaceC11673xS0
    /* renamed from: d */
    public /* bridge */ /* synthetic */ void mo2828d(Object obj) {
    }

    @Override // p000.InterfaceC7706Ho0
    /* renamed from: e */
    public InterfaceC7758Io0 mo2829e(C7654Go0 c7654Go0) {
        MediaCodec mediaCodecM2824t = null;
        try {
            mediaCodecM2824t = m2824t(c7654Go0);
            Trace.beginSection("configureCodec");
            mediaCodecM2824t.configure(c7654Go0.f3908b, c7654Go0.f3910d, c7654Go0.f3911e, 0);
            Trace.endSection();
            Trace.beginSection("startCodec");
            mediaCodecM2824t.start();
            Trace.endSection();
            return new C10189lr0(mediaCodecM2824t);
        } catch (IOException | RuntimeException e) {
            if (mediaCodecM2824t != null) {
                mediaCodecM2824t.release();
            }
            throw e;
        }
    }

    @Override // p000.InterfaceC0750Lv
    /* renamed from: g */
    public Object mo390g(C8128Pr0 c8128Pr0) {
        Object objMo4071h = c8128Pr0.mo4071h(new C11011sG0(InterfaceC7637Gf1.class, Executor.class));
        O90.m5967e(objMo4071h, "c.get(Qualified.qualifie…a, Executor::class.java))");
        return N02.m5507e((Executor) objMo4071h);
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new ExecutorC8931c30(Executors.newSingleThreadExecutor());
    }

    @Override // p000.QN0
    public AbstractC7742Ig0 getType() {
        throw new IllegalStateException("This method should not be called");
    }

    @Override // p000.InterfaceC6443mi
    /* renamed from: h */
    public Bitmap mo318h(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // p000.InterfaceC6443mi
    /* renamed from: i */
    public void mo319i(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // p000.InterfaceC10451nu0
    /* renamed from: j */
    public boolean mo2830j(String str) {
        return SoLoader.m11077k(0, str);
    }

    @Override // p000.InterfaceC6411mC
    /* renamed from: k */
    public Iterable mo2553k(Object obj) {
        InterfaceC10293mf0[] interfaceC10293mf0Arr = C8618Zc0.f15019h;
        return ((InterfaceC7158xl) obj).mo2089x1().mo1222j();
    }

    @Override // p000.InterfaceC7955Mi1
    /* renamed from: l */
    public /* synthetic */ C1614Ze mo2831l(C6630pe c6630pe, C0149CM c0149cm) {
        return null;
    }

    @Override // p000.C61
    /* renamed from: n */
    public D61 mo984n(C6404m5 c6404m5) {
        return new C1793bZ((Context) c6404m5.f37468c, (String) c6404m5.f37469d, (C8875bc1) c6404m5.f37470e, c6404m5.f37466a, c6404m5.f37467b);
    }

    @Override // p000.InterfaceC6443mi
    /* renamed from: o */
    public Bitmap mo320o(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // p000.InterfaceC7955Mi1
    /* renamed from: p */
    public ArrayList mo2833p(C0149CM c0149cm) {
        return new ArrayList();
    }

    @Override // p000.InterfaceC8490Wq0
    /* renamed from: q0 */
    public boolean mo1907q0(MenuC7450Cq0 menuC7450Cq0) {
        return false;
    }

    @Override // p000.InterfaceC8525Xh1
    /* renamed from: z */
    public Object mo407z(AbstractC11947zc0 abstractC11947zc0, float f) {
        return AbstractC7734Ic0.m3955b(abstractC11947zc0, f);
    }

    @Override // p000.InterfaceC10378nJ1
    public Object zza() {
        switch (this.f3482a) {
            case 26:
                C11304uY1.f43748b.get();
                Boolean bool = (Boolean) HY1.f4348i.m8754a();
                bool.getClass();
                return bool;
            case 27:
                C10406nX1.f38362b.get();
                Boolean bool2 = (Boolean) C11046sX1.f42480b.m8754a();
                bool2.getClass();
                return bool2;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                PW1.f9104b.get();
                Long l = (Long) UW1.f11873h.m8754a();
                l.getClass();
                return l;
            default:
                C9640hY1.f28446b.get();
                Long l2 = (Long) C10664pY1.f40206e.m8754a();
                l2.getClass();
                return l2;
        }
    }

    @Override // p000.InterfaceC7040vt
    /* renamed from: a */
    public void mo2826a() {
    }

    @Override // p000.InterfaceC7040vt
    public void close() {
    }

    @Override // p000.InterfaceC6443mi
    /* renamed from: r */
    public void mo322r() {
    }

    @Override // p000.InterfaceC7040vt
    /* renamed from: m */
    public void mo2832m(String str) {
    }

    @Override // p000.InterfaceC6443mi
    /* renamed from: q */
    public void mo321q(int i) {
    }

    @Override // p000.InterfaceC8490Wq0
    /* renamed from: f */
    public void mo1906f(MenuC7450Cq0 menuC7450Cq0, boolean z) {
    }
}
