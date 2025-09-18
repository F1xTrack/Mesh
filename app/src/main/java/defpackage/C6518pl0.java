package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import com.vk.push.core.remote.config.omicron.OmicronEnvironment;
import java.nio.charset.Charset;
import java.util.List;
import java.util.TreeSet;
import java.util.regex.Pattern;

/* renamed from: pl0 */
/* loaded from: classes.dex */
public final class C6518pl0 implements InterfaceC7412uR0, InterfaceC8207yc1, InterfaceC1646Uw0, InterfaceC4255hz, InterfaceC8101y30, OmicronEnvironment, InterfaceC7986xS0, InterfaceC1181Ox0, InterfaceC0940Lv, InterfaceC6053nJ1 {
    public static C6518pl0 b;
    public static C3383dO1 f;
    public static C6518pl0 k;
    public final /* synthetic */ int a;
    public static final C6518pl0 c = new C6518pl0(1);
    public static final C6518pl0 d = new C6518pl0(2);
    public static final C6518pl0 e = new C6518pl0(3);
    public static final C6518pl0 g = new C6518pl0(4);
    public static final C6518pl0 h = new C6518pl0(5);
    public static final C6518pl0 i = new C6518pl0(6);
    public static final /* synthetic */ C6518pl0 j = new C6518pl0(7);

    public /* synthetic */ C6518pl0(int i2) {
        this.a = i2;
    }

    public static final String b(Uri uri) {
        String string = uri.toString();
        O90.e(string, "uri.toString()");
        if (string.length() <= 30) {
            return string;
        }
        String strSubstring = string.substring(0, 30);
        O90.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring.concat("...");
    }

    public static final HS0 e(HS0 hs0) {
        if ((hs0 != null ? hs0.g : null) == null) {
            return hs0;
        }
        GS0 gs0O = hs0.o();
        gs0O.g = null;
        return gs0O.a();
    }

    public static C7030sR0 h(int i2, int i3, C1859Xp0 c1859Xp0, byte[] bArr) {
        O90.f(bArr, "<this>");
        AbstractC0199Ch1.c(bArr.length, i2, i3);
        return new C7030sR0(i3, i2, c1859Xp0, bArr);
    }

    public static C7030sR0 i(String str, C1859Xp0 c1859Xp0) {
        O90.f(str, "<this>");
        Charset charset = AbstractC7680vr.a;
        if (c1859Xp0 != null) {
            Pattern pattern = C1859Xp0.d;
            Charset charsetA = c1859Xp0.a(null);
            if (charsetA == null) {
                c1859Xp0 = AbstractC7743wA1.c(c1859Xp0 + "; charset=utf-8");
            } else {
                charset = charsetA;
            }
        }
        byte[] bytes = str.getBytes(charset);
        O90.e(bytes, "this as java.lang.String).getBytes(charset)");
        return h(0, bytes.length, c1859Xp0, bytes);
    }

    public static C6518pl0 l() {
        if (k == null) {
            k = new C6518pl0(21);
        }
        return k;
    }

    public static boolean m(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    @Override // defpackage.InterfaceC4255hz
    public void a(D40 d40, List list) {
        O90.f(d40, "url");
    }

    @Override // defpackage.InterfaceC8207yc1
    public Object apply(Object obj) {
        return (byte[]) obj;
    }

    @Override // defpackage.InterfaceC1646Uw0
    public Object c() {
        return new TreeSet();
    }

    @Override // defpackage.InterfaceC7986xS0
    public void d(Object obj) {
        ((Bitmap) obj).recycle();
    }

    @Override // defpackage.InterfaceC8101y30
    public InterfaceC5834mA0 f(C7339u30 c7339u30, C6576q30 c6576q30) {
        return new C7911x30(c7339u30, c6576q30);
    }

    @Override // defpackage.InterfaceC0940Lv
    public Object g(C1241Pr0 c1241Pr0) {
        return new C3471ds0();
    }

    @Override // defpackage.InterfaceC8101y30
    public InterfaceC5834mA0 j() {
        return new C7911x30(C7339u30.n, null);
    }

    public AbstractC5507kS1 k(C6666qX c6666qX) {
        String str = c6666qX.m;
        if (str != null) {
            switch (str) {
                case "application/vnd.dvb.ait":
                    return new H7(0);
                case "application/x-icy":
                    return new P50();
                case "application/id3":
                    return new U50(null);
                case "application/x-emsg":
                    return new H7(1);
                case "application/x-scte35":
                    return new C6195o31();
            }
        }
        throw new IllegalArgumentException(AbstractC8235ym.v("Attempted to create decoder for unsupported MIME type: ", str));
    }

    public C6085nU0 n(InterfaceC2355bb0 interfaceC2355bb0) {
        O90.f(interfaceC2355bb0, "javaElement");
        return new C6085nU0((AbstractC5497kP0) interfaceC2355bb0);
    }

    @Override // com.vk.push.core.remote.config.omicron.OmicronEnvironment
    public String name() {
        return "BETA";
    }

    public boolean o(C6666qX c6666qX) {
        String str = c6666qX.m;
        return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
    }

    @Override // defpackage.InterfaceC4255hz
    public List s(D40 d40) {
        O90.f(d40, "url");
        return MN.a;
    }

    @Override // defpackage.InterfaceC6053nJ1
    public Object zza() {
        switch (this.a) {
            case 27:
                PW1.b.get();
                return Integer.valueOf((int) ((Long) UW1.f0.a()).longValue());
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                PW1.b.get();
                Long l = (Long) UW1.X.a();
                l.getClass();
                return l;
            default:
                PW1.b.get();
                Long l2 = (Long) UW1.k.a();
                l2.getClass();
                return l2;
        }
    }

    public C6518pl0(C1339Qy c1339Qy) {
        this.a = 25;
    }

    public C6518pl0(C0474Fv0 c0474Fv0, OJ1 oj1, C7304tt c7304tt, C0240Cv0 c0240Cv0) {
        this.a = 8;
    }

    @Override // defpackage.InterfaceC7412uR0
    public AbstractC7221tR0 G(C1888Xz c1888Xz) {
        return c1888Xz;
    }

    @Override // defpackage.InterfaceC1181Ox0
    public void onComplete(Throwable th) {
    }
}
