package p000;

import android.graphics.PointF;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.view.View;
import com.google.mlkit.vision.common.internal.MobileVisionBase;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import javax.net.ssl.SSLSocket;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class NV1 implements InterfaceC8525Xh1, InterfaceC8348Tx0, InterfaceC6542oH, InterfaceC6319kk, InterfaceC8294Sw0, InterfaceC10231mA0, InterfaceC1593ZJ, InterfaceC1538YR, InterfaceC10451nu0, InterfaceC8527Xi1, InterfaceC10378nJ1 {

    /* renamed from: b */
    public static NV1 f7836b;

    /* renamed from: c */
    public static final NV1 f7837c = new NV1(1);

    /* renamed from: d */
    public static final NV1 f7838d = new NV1(2);

    /* renamed from: e */
    public static final NV1 f7839e = new NV1(4);

    /* renamed from: f */
    public static final NV1 f7840f = new NV1(5);

    /* renamed from: g */
    public static final /* synthetic */ NV1 f7841g = new NV1(6);

    /* renamed from: a */
    public final /* synthetic */ int f7842a;

    public /* synthetic */ NV1(int i) {
        this.f7842a = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0074 A[PHI: r1
  0x0074: PHI (r1v10 kq0) = (r1v9 kq0), (r1v12 kq0) binds: [B:76:0x0098, B:67:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p000.X01 m5726A(p000.C7789Jd1 r7, p000.InterfaceC8101Pd1 r8, java.util.List r9, boolean r10) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.NV1.m5726A(Jd1, Pd1, java.util.List, boolean):X01");
    }

    /* renamed from: B */
    public static final X01 m5727B(InterfaceC10059kq0 interfaceC10059kq0, C7789Jd1 c7789Jd1, InterfaceC8101Pd1 interfaceC8101Pd1, List list, boolean z) {
        O90.m5968f(c7789Jd1, "attributes");
        O90.m5968f(interfaceC8101Pd1, "constructor");
        O90.m5968f(list, "arguments");
        O90.m5968f(interfaceC10059kq0, "memberScope");
        Y01 y01 = new Y01(interfaceC8101Pd1, list, z, interfaceC10059kq0, new C7898Lg0(interfaceC10059kq0, c7789Jd1, interfaceC8101Pd1, list, z));
        return c7789Jd1.isEmpty() ? y01 : new C8670a11(y01, c7789Jd1);
    }

    /* renamed from: C */
    public static final X01 m5728C(C7789Jd1 c7789Jd1, InterfaceC8101Pd1 interfaceC8101Pd1, List list, boolean z, InterfaceC10059kq0 interfaceC10059kq0, InterfaceC6497nZ interfaceC6497nZ) {
        O90.m5968f(c7789Jd1, "attributes");
        O90.m5968f(interfaceC8101Pd1, "constructor");
        O90.m5968f(list, "arguments");
        O90.m5968f(interfaceC10059kq0, "memberScope");
        Y01 y01 = new Y01(interfaceC8101Pd1, list, z, interfaceC10059kq0, interfaceC6497nZ);
        return c7789Jd1.isEmpty() ? y01 : new C8670a11(y01, c7789Jd1);
    }

    /* renamed from: D */
    public static synchronized void m5729D() {
        if (f7836b == null) {
            f7836b = new NV1(0);
        }
    }

    /* renamed from: g */
    public static Object m5730g(String str) {
        O90.m5968f(str, "str");
        try {
            JSONObject jSONObject = new JSONObject(str);
            boolean z = jSONObject.getBoolean("is_enabled");
            boolean z2 = jSONObject.getBoolean("is_force");
            JSONArray jSONArray = jSONObject.getJSONArray("package_names");
            C10685pj0 c10685pj0M26272c = AbstractC7230yu.m26272c();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                String string = jSONArray.getString(i);
                O90.m5967e(string, "getString(i)");
                c10685pj0M26272c.add(string);
            }
            return new C8775aq1(AbstractC7230yu.m26271b(c10685pj0M26272c), z, z2);
        } catch (Throwable th) {
            return RQ1.m7015b(th);
        }
    }

    /* renamed from: k */
    public static final int m5731k(C10737q70 c10737q70) {
        String path = c10737q70.f40609b.getPath();
        if (path == null) {
            throw new IllegalStateException("Required value was null.");
        }
        String strSubstring = path.substring(1);
        O90.m5967e(strSubstring, "this as java.lang.String).substring(startIndex)");
        return Integer.parseInt(strSubstring);
    }

    /* renamed from: l */
    public static final boolean m5732l(int i) {
        PointF pointF = T00.f11087l;
        return i == 3 || i == 1 || i == 5;
    }

    /* renamed from: m */
    public static final boolean m5733m(R00 r00, R00 r002) {
        PointF pointF = T00.f11087l;
        if (!r00.m6867q(r002) || r00 == r002 || r00.mo5531E(r002) || r002.mo5531E(r00)) {
            return false;
        }
        return (r00 == r002 || !(r00.f9898H || r00.f9905f == 4)) ? true : r00.mo5530D(r002);
    }

    /* renamed from: n */
    public static final boolean m5734n(R00 r00, R00 r002) {
        GH0 gh0;
        int[] iArr;
        PointF pointF = T00.f11087l;
        if (r00 != r002) {
            r00.getClass();
            O90.m5968f(r002, "handler");
            if (r002 != r00 && (gh0 = r00.f9893C) != null && (iArr = (int[]) gh0.f3662a.get(r00.f9903d)) != null) {
                for (int i : iArr) {
                    if (i == r002.f9903d) {
                        return true;
                    }
                }
            }
            if (r002.mo5532F(r00)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: q */
    public static ArrayList m5735q(List list) {
        O90.m5968f(list, "protocols");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((EnumC9219eG0) obj) != EnumC9219eG0.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC7293zu.m26586k(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((EnumC9219eG0) it.next()).f26631a);
        }
        return arrayList2;
    }

    /* renamed from: r */
    public static AbstractC10804qe1 m5736r(InterfaceC10292me1 interfaceC10292me1, C11818yb0 c11818yb0, ES1 es1, AbstractC7742Ig0 abstractC7742Ig0) {
        O90.m5968f(c11818yb0, "typeAttr");
        O90.m5968f(es1, "typeParameterUpperBoundEraser");
        O90.m5968f(abstractC7742Ig0, "erasedUpperBound");
        if (!c11818yb0.f46328c) {
            c11818yb0 = C11818yb0.m26174a(c11818yb0, EnumC7368Bb0.f934a, false, null, null, 61);
        }
        int iOrdinal = c11818yb0.f46327b.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2) {
                return new C10988s41(abstractC7742Ig0, EnumC9532gi1.f27947c);
            }
            throw new C6838sg();
        }
        if (!interfaceC10292me1.mo22918O().f27952b) {
            return new C10988s41(AbstractC6940uI.m25152e(interfaceC10292me1).m26506n(), EnumC9532gi1.f27947c);
        }
        List parameters = abstractC7742Ig0.mo3797E().getParameters();
        O90.m5967e(parameters, "getParameters(...)");
        return !parameters.isEmpty() ? new C10988s41(abstractC7742Ig0, EnumC9532gi1.f27949e) : AbstractC7375Be1.m793k(interfaceC10292me1, c11818yb0);
    }

    /* renamed from: s */
    public static byte[] m5737s(List list) {
        O90.m5968f(list, "protocols");
        C6507nj c6507nj = new C6507nj();
        Iterator it = m5735q(list).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            c6507nj.m23195r0(str.length());
            c6507nj.m23203x0(str);
        }
        return c6507nj.m23177S(c6507nj.f38488b);
    }

    /* renamed from: t */
    public static final AbstractC8315Tg1 m5738t(X01 x01, X01 x012) {
        O90.m5968f(x01, "lowerBound");
        O90.m5968f(x012, "upperBound");
        return x01.equals(x012) ? x01 : new C4058fW(x01, x012);
    }

    /* renamed from: u */
    public static boolean m5739u() {
        return "Dalvik".equals(System.getProperty("java.vm.name"));
    }

    /* renamed from: v */
    public static boolean m5740v(View view, float f, float f2) {
        return 0.0f <= f && f <= ((float) view.getWidth()) && 0.0f <= f2 && f2 <= ((float) view.getHeight());
    }

    /* renamed from: y */
    public static final X01 m5741y(C7789Jd1 c7789Jd1, InterfaceC6976us interfaceC6976us, List list) {
        O90.m5968f(c7789Jd1, "attributes");
        O90.m5968f(interfaceC6976us, "descriptor");
        O90.m5968f(list, "arguments");
        InterfaceC8101Pd1 interfaceC8101Pd1Mo1439v = interfaceC6976us.mo1439v();
        O90.m5967e(interfaceC8101Pd1Mo1439v, "getTypeConstructor(...)");
        return m5726A(c7789Jd1, interfaceC8101Pd1Mo1439v, list, false);
    }

    @Override // p000.InterfaceC6319kk
    /* renamed from: a */
    public Class mo5742a() {
        return InputStream.class;
    }

    @Override // p000.InterfaceC6542oH
    /* renamed from: b */
    public boolean mo5743b(SSLSocket sSLSocket) {
        return D51.m1556o(sSLSocket.getClass().getName(), "com.google.android.gms.org.conscrypt.", false);
    }

    @Override // p000.InterfaceC8294Sw0
    /* renamed from: c */
    public Object mo386c() {
        return new TreeMap();
    }

    @Override // p000.InterfaceC6542oH
    /* renamed from: e */
    public I21 mo5745e(SSLSocket sSLSocket) {
        Class<?> cls = sSLSocket.getClass();
        Class<?> superclass = cls;
        while (!superclass.getSimpleName().equals("OpenSSLSocketImpl")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                throw new AssertionError(AbstractC11153tN0.m24910v(cls, "No OpenSSLSocketImpl superclass of socket of type "));
            }
        }
        return new C0194D4(superclass);
    }

    @Override // p000.InterfaceC1593ZJ
    /* renamed from: f */
    public File mo5746f(InterfaceC7740If0 interfaceC7740If0) {
        return null;
    }

    @Override // p000.InterfaceC6319kk
    /* renamed from: h */
    public Object mo5747h(byte[] bArr) {
        return new ByteArrayInputStream(bArr);
    }

    @Override // p000.InterfaceC10231mA0
    /* renamed from: i */
    public Object mo5748i(Uri uri, C1771bD c1771bD) {
        return Long.valueOf(AbstractC7485Dh1.m1805T(new BufferedReader(new InputStreamReader(c1771bD)).readLine()));
    }

    @Override // p000.InterfaceC10451nu0
    /* renamed from: j */
    public boolean mo2830j(String str) {
        System.loadLibrary(str);
        return true;
    }

    @Override // p000.InterfaceC8527Xi1
    /* renamed from: o */
    public void mo5749o(MediaMetadataRetriever mediaMetadataRetriever, Object obj) throws IllegalArgumentException {
        mediaMetadataRetriever.setDataSource(new C8475Wi1((ByteBuffer) obj));
    }

    @Override // p000.InterfaceC8348Tx0
    public void onFailure(Exception exc) {
        MobileVisionBase.f18532e.m11112e("MobileVisionBase", "Error preloading model resource", exc);
    }

    @Override // p000.InterfaceC1538YR
    /* renamed from: p */
    public void mo2003p() {
        throw new UnsupportedOperationException();
    }

    @Override // p000.InterfaceC1538YR
    /* renamed from: w */
    public InterfaceC8357Ub1 mo2005w(int i, int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.InterfaceC1538YR
    /* renamed from: x */
    public void mo2006x(CX0 cx0) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.InterfaceC8525Xh1
    /* renamed from: z */
    public Object mo407z(AbstractC11947zc0 abstractC11947zc0, float f) {
        int iMo3517U = abstractC11947zc0.mo3517U();
        if (iMo3517U == 1) {
            return AbstractC7734Ic0.m3955b(abstractC11947zc0, f);
        }
        if (iMo3517U == 3) {
            return AbstractC7734Ic0.m3955b(abstractC11947zc0, f);
        }
        if (iMo3517U != 7) {
            throw new IllegalArgumentException("Cannot convert json to point. Next token is ".concat(AbstractC0852NX.m5770s(iMo3517U)));
        }
        PointF pointF = new PointF(((float) abstractC11947zc0.mo3514D()) * f, ((float) abstractC11947zc0.mo3514D()) * f);
        while (abstractC11947zc0.mo3535x()) {
            abstractC11947zc0.mo3520d0();
        }
        return pointF;
    }

    @Override // p000.InterfaceC10378nJ1
    public Object zza() {
        switch (this.f7842a) {
            case 26:
                OX1.f8476b.get();
                Boolean bool = (Boolean) TX1.f11415a.m8754a();
                bool.getClass();
                return bool;
            case 27:
                PW1.f9104b.get();
                return Integer.valueOf((int) ((Long) UW1.f11840H.m8754a()).longValue());
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                PW1.f9104b.get();
                Long l = (Long) UW1.f11857Y.m8754a();
                l.getClass();
                return l;
            default:
                PW1.f9104b.get();
                return (String) UW1.f11871g.m8754a();
        }
    }

    public NV1(OJ1 oj1) {
        this.f7842a = 24;
    }

    @Override // p000.InterfaceC1593ZJ
    public void clear() {
    }

    @Override // p000.InterfaceC1593ZJ
    /* renamed from: d */
    public void mo5744d(InterfaceC7740If0 interfaceC7740If0, C10189lr0 c10189lr0) {
    }
}
