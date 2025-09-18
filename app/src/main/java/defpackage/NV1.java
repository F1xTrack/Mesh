package defpackage;

import android.graphics.PointF;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.view.View;
import com.google.mlkit.vision.common.internal.MobileVisionBase;
import com.huawei.hms.adapter.internal.AvailableCode;
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
public final class NV1 implements InterfaceC1836Xh1, InterfaceC1571Tx0, InterfaceC6236oH, InterfaceC5559kk, InterfaceC1490Sw0, InterfaceC5834mA0, ZJ, YR, InterfaceC6163nu0, InterfaceC1839Xi1, InterfaceC6053nJ1 {
    public static NV1 b;
    public static final NV1 c = new NV1(1);
    public static final NV1 d = new NV1(2);
    public static final NV1 e = new NV1(4);
    public static final NV1 f = new NV1(5);
    public static final /* synthetic */ NV1 g = new NV1(6);
    public final /* synthetic */ int a;

    public /* synthetic */ NV1(int i) {
        this.a = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0074 A[PHI: r1
  0x0074: PHI (r1v10 kq0) = (r1v9 kq0), (r1v12 kq0) binds: [B:76:0x0098, B:67:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.X01 A(defpackage.C0733Jd1 r7, defpackage.InterfaceC1200Pd1 r8, java.util.List r9, boolean r10) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.NV1.A(Jd1, Pd1, java.util.List, boolean):X01");
    }

    public static final X01 B(InterfaceC5578kq0 interfaceC5578kq0, C0733Jd1 c0733Jd1, InterfaceC1200Pd1 interfaceC1200Pd1, List list, boolean z) {
        O90.f(c0733Jd1, "attributes");
        O90.f(interfaceC1200Pd1, "constructor");
        O90.f(list, "arguments");
        O90.f(interfaceC5578kq0, "memberScope");
        Y01 y01 = new Y01(interfaceC1200Pd1, list, z, interfaceC5578kq0, new C0897Lg0(interfaceC5578kq0, c0733Jd1, interfaceC1200Pd1, list, z));
        return c0733Jd1.isEmpty() ? y01 : new C2054a11(y01, c0733Jd1);
    }

    public static final X01 C(C0733Jd1 c0733Jd1, InterfaceC1200Pd1 interfaceC1200Pd1, List list, boolean z, InterfaceC5578kq0 interfaceC5578kq0, InterfaceC6099nZ interfaceC6099nZ) {
        O90.f(c0733Jd1, "attributes");
        O90.f(interfaceC1200Pd1, "constructor");
        O90.f(list, "arguments");
        O90.f(interfaceC5578kq0, "memberScope");
        Y01 y01 = new Y01(interfaceC1200Pd1, list, z, interfaceC5578kq0, interfaceC6099nZ);
        return c0733Jd1.isEmpty() ? y01 : new C2054a11(y01, c0733Jd1);
    }

    public static synchronized void D() {
        if (b == null) {
            b = new NV1(0);
        }
    }

    public static Object g(String str) {
        O90.f(str, "str");
        try {
            JSONObject jSONObject = new JSONObject(str);
            boolean z = jSONObject.getBoolean("is_enabled");
            boolean z2 = jSONObject.getBoolean("is_force");
            JSONArray jSONArray = jSONObject.getJSONArray("package_names");
            C6512pj0 c6512pj0C = AbstractC8259yu.c();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                String string = jSONArray.getString(i);
                O90.e(string, "getString(i)");
                c6512pj0C.add(string);
            }
            return new C2210aq1(AbstractC8259yu.b(c6512pj0C), z, z2);
        } catch (Throwable th) {
            return RQ1.b(th);
        }
    }

    public static final int k(C6589q70 c6589q70) {
        String path = c6589q70.b.getPath();
        if (path == null) {
            throw new IllegalStateException("Required value was null.");
        }
        String strSubstring = path.substring(1);
        O90.e(strSubstring, "this as java.lang.String).substring(startIndex)");
        return Integer.parseInt(strSubstring);
    }

    public static final boolean l(int i) {
        PointF pointF = T00.l;
        return i == 3 || i == 1 || i == 5;
    }

    public static final boolean m(R00 r00, R00 r002) {
        PointF pointF = T00.l;
        if (!r00.q(r002) || r00 == r002 || r00.E(r002) || r002.E(r00)) {
            return false;
        }
        return (r00 == r002 || !(r00.H || r00.f == 4)) ? true : r00.D(r002);
    }

    public static final boolean n(R00 r00, R00 r002) {
        GH0 gh0;
        int[] iArr;
        PointF pointF = T00.l;
        if (r00 != r002) {
            r00.getClass();
            O90.f(r002, "handler");
            if (r002 != r00 && (gh0 = r00.C) != null && (iArr = (int[]) gh0.a.get(r00.d)) != null) {
                for (int i : iArr) {
                    if (i == r002.d) {
                        return true;
                    }
                }
            }
            if (r002.F(r00)) {
                return true;
            }
        }
        return false;
    }

    public static ArrayList q(List list) {
        O90.f(list, "protocols");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((EnumC3548eG0) obj) != EnumC3548eG0.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC8449zu.k(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((EnumC3548eG0) it.next()).a);
        }
        return arrayList2;
    }

    public static AbstractC6689qe1 r(InterfaceC5925me1 interfaceC5925me1, C8203yb0 c8203yb0, ES1 es1, AbstractC0663Ig0 abstractC0663Ig0) {
        O90.f(c8203yb0, "typeAttr");
        O90.f(es1, "typeParameterUpperBoundEraser");
        O90.f(abstractC0663Ig0, "erasedUpperBound");
        if (!c8203yb0.c) {
            c8203yb0 = C8203yb0.a(c8203yb0, EnumC0102Bb0.a, false, null, null, 61);
        }
        int iOrdinal = c8203yb0.b.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2) {
                return new C6962s41(abstractC0663Ig0, EnumC4015gi1.c);
            }
            throw new C7074sg();
        }
        if (!interfaceC5925me1.O().b) {
            return new C6962s41(AbstractC7384uI.e(interfaceC5925me1).n(), EnumC4015gi1.c);
        }
        List parameters = abstractC0663Ig0.E().getParameters();
        O90.e(parameters, "getParameters(...)");
        return !parameters.isEmpty() ? new C6962s41(abstractC0663Ig0, EnumC4015gi1.e) : AbstractC0112Be1.k(interfaceC5925me1, c8203yb0);
    }

    public static byte[] s(List list) {
        O90.f(list, "protocols");
        C6129nj c6129nj = new C6129nj();
        Iterator it = q(list).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            c6129nj.r0(str.length());
            c6129nj.x0(str);
        }
        return c6129nj.S(c6129nj.b);
    }

    public static final AbstractC1521Tg1 t(X01 x01, X01 x012) {
        O90.f(x01, "lowerBound");
        O90.f(x012, "upperBound");
        return x01.equals(x012) ? x01 : new C3786fW(x01, x012);
    }

    public static boolean u() {
        return "Dalvik".equals(System.getProperty("java.vm.name"));
    }

    public static boolean v(View view, float f2, float f3) {
        return 0.0f <= f2 && f2 <= ((float) view.getWidth()) && 0.0f <= f3 && f3 <= ((float) view.getHeight());
    }

    public static final X01 y(C0733Jd1 c0733Jd1, InterfaceC7492us interfaceC7492us, List list) {
        O90.f(c0733Jd1, "attributes");
        O90.f(interfaceC7492us, "descriptor");
        O90.f(list, "arguments");
        InterfaceC1200Pd1 interfaceC1200Pd1V = interfaceC7492us.v();
        O90.e(interfaceC1200Pd1V, "getTypeConstructor(...)");
        return A(c0733Jd1, interfaceC1200Pd1V, list, false);
    }

    @Override // defpackage.InterfaceC5559kk
    public Class a() {
        return InputStream.class;
    }

    @Override // defpackage.InterfaceC6236oH
    public boolean b(SSLSocket sSLSocket) {
        return D51.o(sSLSocket.getClass().getName(), "com.google.android.gms.org.conscrypt.", false);
    }

    @Override // defpackage.InterfaceC1490Sw0
    public Object c() {
        return new TreeMap();
    }

    @Override // defpackage.InterfaceC6236oH
    public I21 e(SSLSocket sSLSocket) {
        Class<?> cls = sSLSocket.getClass();
        Class<?> superclass = cls;
        while (!superclass.getSimpleName().equals("OpenSSLSocketImpl")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                throw new AssertionError(AbstractC7209tN0.v(cls, "No OpenSSLSocketImpl superclass of socket of type "));
            }
        }
        return new D4(superclass);
    }

    @Override // defpackage.ZJ
    public File f(InterfaceC0660If0 interfaceC0660If0) {
        return null;
    }

    @Override // defpackage.InterfaceC5559kk
    public Object h(byte[] bArr) {
        return new ByteArrayInputStream(bArr);
    }

    @Override // defpackage.InterfaceC5834mA0
    public Object i(Uri uri, C2282bD c2282bD) {
        return Long.valueOf(AbstractC0277Dh1.T(new BufferedReader(new InputStreamReader(c2282bD)).readLine()));
    }

    @Override // defpackage.InterfaceC6163nu0
    public boolean j(String str) {
        System.loadLibrary(str);
        return true;
    }

    @Override // defpackage.InterfaceC1839Xi1
    public void o(MediaMetadataRetriever mediaMetadataRetriever, Object obj) throws IllegalArgumentException {
        mediaMetadataRetriever.setDataSource(new C1761Wi1((ByteBuffer) obj));
    }

    @Override // defpackage.InterfaceC1571Tx0
    public void onFailure(Exception exc) {
        MobileVisionBase.e.e("MobileVisionBase", "Error preloading model resource", exc);
    }

    @Override // defpackage.YR
    public void p() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.YR
    public InterfaceC1584Ub1 w(int i, int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.YR
    public void x(CX0 cx0) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.InterfaceC1836Xh1
    public Object z(AbstractC8396zc0 abstractC8396zc0, float f2) {
        int iU = abstractC8396zc0.U();
        if (iU == 1) {
            return AbstractC0651Ic0.b(abstractC8396zc0, f2);
        }
        if (iU == 3) {
            return AbstractC0651Ic0.b(abstractC8396zc0, f2);
        }
        if (iU != 7) {
            throw new IllegalArgumentException("Cannot convert json to point. Next token is ".concat(NX.s(iU)));
        }
        PointF pointF = new PointF(((float) abstractC8396zc0.D()) * f2, ((float) abstractC8396zc0.D()) * f2);
        while (abstractC8396zc0.x()) {
            abstractC8396zc0.d0();
        }
        return pointF;
    }

    @Override // defpackage.InterfaceC6053nJ1
    public Object zza() {
        switch (this.a) {
            case 26:
                OX1.b.get();
                Boolean bool = (Boolean) TX1.a.a();
                bool.getClass();
                return bool;
            case 27:
                PW1.b.get();
                return Integer.valueOf((int) ((Long) UW1.H.a()).longValue());
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                PW1.b.get();
                Long l = (Long) UW1.Y.a();
                l.getClass();
                return l;
            default:
                PW1.b.get();
                return (String) UW1.g.a();
        }
    }

    public NV1(OJ1 oj1) {
        this.a = 24;
    }

    @Override // defpackage.ZJ
    public void clear() {
    }

    @Override // defpackage.ZJ
    public void d(InterfaceC0660If0 interfaceC0660If0, C5772lr0 c5772lr0) {
    }
}
