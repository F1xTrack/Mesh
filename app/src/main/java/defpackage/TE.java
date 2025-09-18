package defpackage;

import android.media.MediaDrmException;
import android.net.Uri;
import com.vk.push.core.filedatastore.JsonDeserializer;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class TE implements InterfaceC6384p3, NO, InterfaceC1836Xh1, InterfaceC8176yS0, InterfaceC0866Kw, InterfaceC1490Sw0, HQ, WC, InterfaceC7472ul0, InterfaceC1374Rj1, JsonDeserializer, InterfaceC1181Ox0, InterfaceC0940Lv, InterfaceC6053nJ1 {
    public static TE b;
    public static volatile TE g;
    public static String j;
    public static String k;
    public final /* synthetic */ int a;
    public static final TE c = new TE(1);
    public static final TE d = new TE(2);
    public static final TE e = new TE(3);
    public static final Object f = new Object();
    public static final TE h = new TE(5);
    public static final TE i = new TE(6);

    public /* synthetic */ TE(int i2) {
        this.a = i2;
    }

    public static C0674Ik B(String str) {
        int i2;
        char cCharAt;
        O90.f(str, "<this>");
        byte[] bArr = AbstractC3304d.a;
        int length = str.length();
        while (length > 0 && ((cCharAt = str.charAt(length - 1)) == '=' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == ' ' || cCharAt == '\t')) {
            length--;
        }
        int i3 = (int) ((length * 6) / 8);
        byte[] bArrCopyOf = new byte[i3];
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            if (i4 < length) {
                char cCharAt2 = str.charAt(i4);
                if ('A' <= cCharAt2 && cCharAt2 < '[') {
                    i2 = cCharAt2 - 'A';
                } else if ('a' <= cCharAt2 && cCharAt2 < '{') {
                    i2 = cCharAt2 - 'G';
                } else if ('0' <= cCharAt2 && cCharAt2 < ':') {
                    i2 = cCharAt2 + 4;
                } else if (cCharAt2 != '+' && cCharAt2 != '-') {
                    if (cCharAt2 != '/' && cCharAt2 != '_') {
                        if (cCharAt2 != '\n' && cCharAt2 != '\r' && cCharAt2 != ' ' && cCharAt2 != '\t') {
                            break;
                        }
                        i4++;
                    } else {
                        i2 = 63;
                    }
                } else {
                    i2 = 62;
                }
                int i8 = i2 | (i6 << 6);
                i5++;
                if (i5 % 4 == 0) {
                    bArrCopyOf[i7] = (byte) (i8 >> 16);
                    int i9 = i7 + 2;
                    bArrCopyOf[i7 + 1] = (byte) (i8 >> 8);
                    i7 += 3;
                    bArrCopyOf[i9] = (byte) i8;
                }
                i6 = i8;
                i4++;
            } else {
                int i10 = i5 % 4;
                if (i10 != 1) {
                    if (i10 == 2) {
                        bArrCopyOf[i7] = (byte) ((i6 << 12) >> 16);
                        i7 = 1 + i7;
                    } else if (i10 == 3) {
                        int i11 = i6 << 6;
                        int i12 = 1 + i7;
                        bArrCopyOf[i7] = (byte) (i11 >> 16);
                        i7 += 2;
                        bArrCopyOf[i12] = (byte) (i11 >> 8);
                    }
                    if (i7 != i3) {
                        bArrCopyOf = Arrays.copyOf(bArrCopyOf, i7);
                        O90.e(bArrCopyOf, "copyOf(this, newSize)");
                    }
                }
            }
        }
        bArrCopyOf = null;
        if (bArrCopyOf != null) {
            return new C0674Ik(bArrCopyOf);
        }
        return null;
    }

    public static C0674Ik C(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i2 * 2;
            bArr[i2] = (byte) (S8.a(str.charAt(i3 + 1)) + (S8.a(str.charAt(i3)) << 4));
        }
        return new C0674Ik(bArr);
    }

    public static C0674Ik D(String str) {
        O90.f(str, "<this>");
        byte[] bytes = str.getBytes(AbstractC7680vr.a);
        O90.e(bytes, "this as java.lang.String).getBytes(charset)");
        C0674Ik c0674Ik = new C0674Ik(bytes);
        c0674Ik.c = str;
        return c0674Ik;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:176:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0199  */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v24 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.C6943s E(defpackage.X01 r17, defpackage.C3690f1 r18, int r19, defpackage.EnumC1122Od1 r20, boolean r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 668
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.TE.E(X01, f1, int, Od1, boolean, boolean):s");
    }

    public static C1204Pf F(AbstractC1521Tg1 abstractC1521Tg1, C3690f1 c3690f1, int i2, boolean z) {
        AbstractC0663Ig0 abstractC0663Ig0T;
        Object objN = null;
        if (S8.b(abstractC1521Tg1)) {
            return new C1204Pf((Object) null, 1, 8);
        }
        if (!(abstractC1521Tg1 instanceof AbstractC3405dW)) {
            if (!(abstractC1521Tg1 instanceof X01)) {
                throw new C7074sg();
            }
            C6943s c6943sE = E((X01) abstractC1521Tg1, c3690f1, i2, EnumC1122Od1.c, false, z);
            boolean z2 = c6943sE.b;
            AbstractC0663Ig0 abstractC0663Ig0N = (X01) c6943sE.c;
            if (z2) {
                abstractC0663Ig0N = EZ1.n(abstractC1521Tg1, abstractC0663Ig0N);
            }
            return new C1204Pf(abstractC0663Ig0N, c6943sE.a, 8);
        }
        boolean z3 = abstractC1521Tg1 instanceof C6434pJ0;
        AbstractC3405dW abstractC3405dW = (AbstractC3405dW) abstractC1521Tg1;
        C6943s c6943sE2 = E(abstractC3405dW.b, c3690f1, i2, EnumC1122Od1.a, z3, z);
        C6943s c6943sE3 = E(abstractC3405dW.c, c3690f1, i2, EnumC1122Od1.b, z3, z);
        X01 x01 = (X01) c6943sE3.c;
        X01 x012 = (X01) c6943sE2.c;
        if (x012 != null || x01 != null) {
            if (c6943sE2.b || c6943sE3.b) {
                if (x01 != null) {
                    if (x012 == null) {
                        x012 = x01;
                    }
                    abstractC0663Ig0T = NV1.t(x012, x01);
                } else {
                    O90.c(x012);
                    abstractC0663Ig0T = x012;
                }
                objN = EZ1.n(abstractC1521Tg1, abstractC0663Ig0T);
            } else {
                X01 x013 = abstractC3405dW.c;
                X01 x014 = abstractC3405dW.b;
                X01 x015 = x012;
                if (z3) {
                    X01 x016 = x012;
                    if (x012 == null) {
                        x016 = x014;
                    }
                    if (x01 == null) {
                        x01 = x013;
                    }
                    objN = new C6434pJ0(x016, x01);
                } else {
                    if (x012 == null) {
                        x015 = x014;
                    }
                    if (x01 == null) {
                        x01 = x013;
                    }
                    objN = NV1.t(x015, x01);
                }
            }
        }
        return new C1204Pf(objN, c6943sE2.a, 8);
    }

    public static TE G() {
        TE te;
        synchronized (f) {
            try {
                if (g == null) {
                    g = new TE(4);
                }
                te = g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return te;
    }

    public static String J(MW0 mw0) {
        O90.f(mw0, "type");
        int iOrdinal = mw0.ordinal();
        if (iOrdinal == 0) {
            return "topScrollBeginDrag";
        }
        if (iOrdinal == 1) {
            return "topScrollEndDrag";
        }
        if (iOrdinal == 2) {
            return "topScroll";
        }
        if (iOrdinal == 3) {
            return "topMomentumScrollBegin";
        }
        if (iOrdinal == 4) {
            return "topMomentumScrollEnd";
        }
        throw new C7074sg();
    }

    public static C0674Ik L(byte[] bArr) {
        C0674Ik c0674Ik = C0674Ik.d;
        int length = bArr.length;
        AbstractC1525Ti.b(bArr.length, 0, length);
        return new C0674Ik(J8.i(bArr, 0, length));
    }

    public static String M(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        if (length >= 20) {
            sb.append(str.substring(0, 20));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    public static void N(Object obj) {
        C3949gM1 c3949gM1 = ((QG1) obj).zzc;
        if (c3949gM1.e) {
            c3949gM1.e = false;
        }
    }

    @Override // defpackage.InterfaceC7472ul0
    public void A(Level level, String str, Throwable th) {
        PrintStream printStream = System.out;
        printStream.println("[" + level + "] " + str);
        th.printStackTrace(printStream);
    }

    public C4204hi H(C6589q70 c6589q70, Object obj) {
        C4204hi c4204hi = new C4204hi(c6589q70.b.toString(), c6589q70.h, c6589q70.i, c6589q70.g, null, null);
        c4204hi.g = obj;
        return c4204hi;
    }

    public O01 I(Uri uri) {
        return new O01(uri.toString());
    }

    public C4204hi K(C6589q70 c6589q70, Object obj) {
        InterfaceC4213hl interfaceC4213hl;
        String name;
        InterfaceC6604qC0 interfaceC6604qC0 = c6589q70.p;
        if (interfaceC6604qC0 != null) {
            InterfaceC4213hl interfaceC4213hlB = interfaceC6604qC0.b();
            name = interfaceC6604qC0.getClass().getName();
            interfaceC4213hl = interfaceC4213hlB;
        } else {
            interfaceC4213hl = null;
            name = null;
        }
        C4204hi c4204hi = new C4204hi(c6589q70.b.toString(), c6589q70.h, c6589q70.i, c6589q70.g, interfaceC4213hl, name);
        c4204hi.g = obj;
        return c4204hi;
    }

    @Override // defpackage.InterfaceC7472ul0
    public void a(Level level, String str) {
        System.out.println("[" + level + "] " + str);
    }

    @Override // defpackage.HQ
    public Map b(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // defpackage.InterfaceC1490Sw0
    public Object c() {
        return new C5939mj0(true, 0);
    }

    @Override // defpackage.InterfaceC6384p3
    public Collection d(InterfaceC7492us interfaceC7492us) {
        O90.f(interfaceC7492us, "classDescriptor");
        return MN.a;
    }

    @Override // defpackage.InterfaceC6384p3
    public Collection f(C1559Tt0 c1559Tt0, InterfaceC7492us interfaceC7492us) {
        O90.f(c1559Tt0, "name");
        O90.f(interfaceC7492us, "classDescriptor");
        return MN.a;
    }

    @Override // com.vk.push.core.filedatastore.JsonDeserializer
    public Object fromJson(JSONObject jSONObject) throws JSONException {
        O90.f(jSONObject, "<this>");
        String string = jSONObject.getString("last_delivered_push_token");
        O90.e(string, "getString(\"last_delivered_push_token\")");
        return new C7491ur1(string, jSONObject.optBoolean("push_token_delivered"));
    }

    @Override // defpackage.InterfaceC0940Lv
    public Object g(C1241Pr0 c1241Pr0) {
        return new C6920rs0();
    }

    @Override // defpackage.HQ
    public GQ h() {
        throw new IllegalStateException();
    }

    @Override // defpackage.InterfaceC6384p3
    public Collection i(InterfaceC7492us interfaceC7492us) {
        O90.f(interfaceC7492us, "classDescriptor");
        return MN.a;
    }

    @Override // defpackage.InterfaceC6384p3
    public Collection j(InterfaceC7492us interfaceC7492us) {
        O90.f(interfaceC7492us, "classDescriptor");
        return MN.a;
    }

    @Override // defpackage.HQ
    public InterfaceC5836mB l(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // defpackage.HQ
    public byte[] m() throws MediaDrmException {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override // defpackage.HQ
    public void n(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // defpackage.InterfaceC0866Kw
    public C0788Jw p() {
        return new C0788Jw(k, j);
    }

    @Override // defpackage.HQ
    public byte[] q(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // defpackage.HQ
    public void r(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // defpackage.HQ
    public EQ s(byte[] bArr, List list, int i2, HashMap map) {
        throw new IllegalStateException();
    }

    @Override // defpackage.WC
    public ZC s0() {
        return new C7226tT(false);
    }

    @Override // defpackage.HQ
    public int u() {
        return 1;
    }

    @Override // defpackage.HQ
    public /* synthetic */ void w(byte[] bArr, NB0 nb0) {
    }

    @Override // defpackage.NO
    public Boolean x() {
        return null;
    }

    @Override // defpackage.HQ
    public boolean y(String str, byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // defpackage.InterfaceC1836Xh1
    public Object z(AbstractC8396zc0 abstractC8396zc0, float f2) {
        return Integer.valueOf(Math.round(AbstractC0651Ic0.d(abstractC8396zc0) * f2));
    }

    @Override // defpackage.InterfaceC6053nJ1
    public Object zza() {
        switch (this.a) {
            case 27:
                PW1.b.get();
                return Integer.valueOf((int) ((Long) UW1.e0.a()).longValue());
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                PW1.b.get();
                Long l = (Long) UW1.I.a();
                l.getClass();
                return l;
            default:
                PW1.b.get();
                Long l2 = (Long) UW1.h0.a();
                l2.getClass();
                return l2;
        }
    }

    public TE(C1339Qy c1339Qy) {
        this.a = 25;
    }

    @Override // defpackage.InterfaceC1374Rj1
    public void e() {
    }

    @Override // defpackage.HQ
    public void release() {
    }

    @Override // defpackage.InterfaceC1374Rj1
    public void v() {
    }

    @Override // defpackage.HQ
    public void k(C1304Qm0 c1304Qm0) {
    }

    @Override // defpackage.HQ
    public void o(byte[] bArr) {
    }

    @Override // defpackage.InterfaceC1181Ox0
    public void onComplete(Throwable th) {
    }

    @Override // defpackage.InterfaceC8176yS0
    public InterfaceC5506kS0 t(InterfaceC5506kS0 interfaceC5506kS0, C0795Jy0 c0795Jy0) {
        return interfaceC5506kS0;
    }
}
