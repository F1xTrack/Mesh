package p000;

import android.graphics.Bitmap;
import android.net.Uri;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.p019vk.push.core.remote.config.omicron.OmicronEnvironment;
import java.nio.charset.Charset;
import java.util.List;
import java.util.TreeSet;
import java.util.regex.Pattern;

/* renamed from: pl0 */
/* loaded from: classes.dex */
public final class C10689pl0 implements InterfaceC11289uR0, InterfaceC11821yc1, InterfaceC8398Uw0, InterfaceC4213hz, InterfaceC11750y30, OmicronEnvironment, InterfaceC11673xS0, InterfaceC8088Ox0, InterfaceC0750Lv, InterfaceC10378nJ1 {

    /* renamed from: b */
    public static C10689pl0 f40365b;

    /* renamed from: f */
    public static C9108dO1 f40369f;

    /* renamed from: k */
    public static C10689pl0 f40374k;

    /* renamed from: a */
    public final /* synthetic */ int f40375a;

    /* renamed from: c */
    public static final C10689pl0 f40366c = new C10689pl0(1);

    /* renamed from: d */
    public static final C10689pl0 f40367d = new C10689pl0(2);

    /* renamed from: e */
    public static final C10689pl0 f40368e = new C10689pl0(3);

    /* renamed from: g */
    public static final C10689pl0 f40370g = new C10689pl0(4);

    /* renamed from: h */
    public static final C10689pl0 f40371h = new C10689pl0(5);

    /* renamed from: i */
    public static final C10689pl0 f40372i = new C10689pl0(6);

    /* renamed from: j */
    public static final /* synthetic */ C10689pl0 f40373j = new C10689pl0(7);

    public /* synthetic */ C10689pl0(int i) {
        this.f40375a = i;
    }

    /* renamed from: b */
    public static final String m23861b(Uri uri) {
        String string = uri.toString();
        O90.m5967e(string, "uri.toString()");
        if (string.length() <= 30) {
            return string;
        }
        String strSubstring = string.substring(0, 30);
        O90.m5967e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring.concat("...");
    }

    /* renamed from: e */
    public static final HS0 m23862e(HS0 hs0) {
        if ((hs0 != null ? hs0.f4301g : null) == null) {
            return hs0;
        }
        GS0 gs0M3429o = hs0.m3429o();
        gs0M3429o.f3747g = null;
        return gs0M3429o.m3066a();
    }

    /* renamed from: h */
    public static C11033sR0 m23863h(int i, int i2, C8540Xp0 c8540Xp0, byte[] bArr) {
        O90.m5968f(bArr, "<this>");
        AbstractC7433Ch1.m1274c(bArr.length, i, i2);
        return new C11033sR0(i2, i, c8540Xp0, bArr);
    }

    /* renamed from: i */
    public static C11033sR0 m23864i(String str, C8540Xp0 c8540Xp0) {
        O90.m5968f(str, "<this>");
        Charset charset = AbstractC7038vr.f44561a;
        if (c8540Xp0 != null) {
            Pattern pattern = C8540Xp0.f13986d;
            Charset charsetM9156a = c8540Xp0.m9156a(null);
            if (charsetM9156a == null) {
                c8540Xp0 = AbstractC11511wA1.m25570c(c8540Xp0 + "; charset=utf-8");
            } else {
                charset = charsetM9156a;
            }
        }
        byte[] bytes = str.getBytes(charset);
        O90.m5967e(bytes, "this as java.lang.String).getBytes(charset)");
        return m23863h(0, bytes.length, c8540Xp0, bytes);
    }

    /* renamed from: l */
    public static C10689pl0 m23865l() {
        if (f40374k == null) {
            f40374k = new C10689pl0(21);
        }
        return f40374k;
    }

    /* renamed from: m */
    public static boolean m23866m(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    @Override // p000.InterfaceC4213hz
    /* renamed from: a */
    public void mo2894a(D40 d40, List list) {
        O90.m5968f(d40, "url");
    }

    @Override // p000.InterfaceC11821yc1
    public Object apply(Object obj) {
        return (byte[]) obj;
    }

    @Override // p000.InterfaceC8398Uw0
    /* renamed from: c */
    public Object mo913c() {
        return new TreeSet();
    }

    @Override // p000.InterfaceC11673xS0
    /* renamed from: d */
    public void mo2828d(Object obj) {
        ((Bitmap) obj).recycle();
    }

    @Override // p000.InterfaceC11750y30
    /* renamed from: f */
    public InterfaceC10231mA0 mo5442f(C11240u30 c11240u30, C10728q30 c10728q30) {
        return new C11623x30(c11240u30, c10728q30);
    }

    @Override // p000.InterfaceC0750Lv
    /* renamed from: g */
    public Object mo390g(C8128Pr0 c8128Pr0) {
        return new C9167ds0();
    }

    @Override // p000.InterfaceC11750y30
    /* renamed from: j */
    public InterfaceC10231mA0 mo5445j() {
        return new C11623x30(C11240u30.f43455n, null);
    }

    /* renamed from: k */
    public AbstractC10012kS1 m23867k(C6686qX c6686qX) {
        String str = c6686qX.f40974m;
        if (str != null) {
            switch (str) {
                case "application/vnd.dvb.ait":
                    return new C0449H7(0);
                case "application/x-icy":
                    return new P50();
                case "application/id3":
                    return new U50(null);
                case "application/x-emsg":
                    return new C0449H7(1);
                case "application/x-scte35":
                    return new C10473o31();
            }
        }
        throw new IllegalArgumentException(AbstractC7222ym.m26245v("Attempted to create decoder for unsupported MIME type: ", str));
    }

    /* renamed from: n */
    public C10399nU0 m23868n(InterfaceC8872bb0 interfaceC8872bb0) {
        O90.m5968f(interfaceC8872bb0, "javaElement");
        return new C10399nU0((AbstractC10005kP0) interfaceC8872bb0);
    }

    @Override // com.p019vk.push.core.remote.config.omicron.OmicronEnvironment
    public String name() {
        return "BETA";
    }

    /* renamed from: o */
    public boolean m23869o(C6686qX c6686qX) {
        String str = c6686qX.f40974m;
        return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
    }

    @Override // p000.InterfaceC4213hz
    /* renamed from: s */
    public List mo2904s(D40 d40) {
        O90.m5968f(d40, "url");
        return C0779MN.f7117a;
    }

    @Override // p000.InterfaceC10378nJ1
    public Object zza() {
        switch (this.f40375a) {
            case 27:
                PW1.f9104b.get();
                return Integer.valueOf((int) ((Long) UW1.f11870f0.m8754a()).longValue());
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                PW1.f9104b.get();
                Long l = (Long) UW1.f11856X.m8754a();
                l.getClass();
                return l;
            default:
                PW1.f9104b.get();
                Long l2 = (Long) UW1.f11879k.m8754a();
                l2.getClass();
                return l2;
        }
    }

    public C10689pl0(C1068Qy c1068Qy) {
        this.f40375a = 25;
    }

    public C10689pl0(C7616Fv0 c7616Fv0, OJ1 oj1, C6914tt c6914tt, C7460Cv0 c7460Cv0) {
        this.f40375a = 8;
    }

    @Override // p000.InterfaceC11289uR0
    /* renamed from: G */
    public AbstractC11161tR0 mo17843G(C1509Xz c1509Xz) {
        return c1509Xz;
    }

    @Override // p000.InterfaceC8088Ox0
    public void onComplete(Throwable th) {
    }
}
