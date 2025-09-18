package p000;

import android.media.MediaDrmException;
import android.net.Uri;
import com.p019vk.push.core.filedatastore.JsonDeserializer;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: TE */
/* loaded from: classes.dex */
public final class C1210TE implements InterfaceC6593p3, InterfaceC0843NO, InterfaceC8525Xh1, InterfaceC11800yS0, InterfaceC0689Kw, InterfaceC8294Sw0, InterfaceC0468HQ, InterfaceC1397WC, InterfaceC11329ul0, InterfaceC8217Rj1, JsonDeserializer, InterfaceC8088Ox0, InterfaceC0750Lv, InterfaceC10378nJ1 {

    /* renamed from: b */
    public static C1210TE f11207b;

    /* renamed from: g */
    public static volatile C1210TE f11212g;

    /* renamed from: j */
    public static String f11215j;

    /* renamed from: k */
    public static String f11216k;

    /* renamed from: a */
    public final /* synthetic */ int f11217a;

    /* renamed from: c */
    public static final C1210TE f11208c = new C1210TE(1);

    /* renamed from: d */
    public static final C1210TE f11209d = new C1210TE(2);

    /* renamed from: e */
    public static final C1210TE f11210e = new C1210TE(3);

    /* renamed from: f */
    public static final Object f11211f = new Object();

    /* renamed from: h */
    public static final C1210TE f11213h = new C1210TE(5);

    /* renamed from: i */
    public static final C1210TE f11214i = new C1210TE(6);

    public /* synthetic */ C1210TE(int i) {
        this.f11217a = i;
    }

    /* renamed from: B */
    public static C0551Ik m7629B(String str) {
        int i;
        char cCharAt;
        O90.m5968f(str, "<this>");
        byte[] bArr = AbstractC3900d.f25749a;
        int length = str.length();
        while (length > 0 && ((cCharAt = str.charAt(length - 1)) == '=' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == ' ' || cCharAt == '\t')) {
            length--;
        }
        int i2 = (int) ((length * 6) / 8);
        byte[] bArrCopyOf = new byte[i2];
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            if (i3 < length) {
                char cCharAt2 = str.charAt(i3);
                if ('A' <= cCharAt2 && cCharAt2 < '[') {
                    i = cCharAt2 - 'A';
                } else if ('a' <= cCharAt2 && cCharAt2 < '{') {
                    i = cCharAt2 - 'G';
                } else if ('0' <= cCharAt2 && cCharAt2 < ':') {
                    i = cCharAt2 + 4;
                } else if (cCharAt2 != '+' && cCharAt2 != '-') {
                    if (cCharAt2 != '/' && cCharAt2 != '_') {
                        if (cCharAt2 != '\n' && cCharAt2 != '\r' && cCharAt2 != ' ' && cCharAt2 != '\t') {
                            break;
                        }
                        i3++;
                    } else {
                        i = 63;
                    }
                } else {
                    i = 62;
                }
                int i7 = i | (i5 << 6);
                i4++;
                if (i4 % 4 == 0) {
                    bArrCopyOf[i6] = (byte) (i7 >> 16);
                    int i8 = i6 + 2;
                    bArrCopyOf[i6 + 1] = (byte) (i7 >> 8);
                    i6 += 3;
                    bArrCopyOf[i8] = (byte) i7;
                }
                i5 = i7;
                i3++;
            } else {
                int i9 = i4 % 4;
                if (i9 != 1) {
                    if (i9 == 2) {
                        bArrCopyOf[i6] = (byte) ((i5 << 12) >> 16);
                        i6 = 1 + i6;
                    } else if (i9 == 3) {
                        int i10 = i5 << 6;
                        int i11 = 1 + i6;
                        bArrCopyOf[i6] = (byte) (i10 >> 16);
                        i6 += 2;
                        bArrCopyOf[i11] = (byte) (i10 >> 8);
                    }
                    if (i6 != i2) {
                        bArrCopyOf = Arrays.copyOf(bArrCopyOf, i6);
                        O90.m5967e(bArrCopyOf, "copyOf(this, newSize)");
                    }
                }
            }
        }
        bArrCopyOf = null;
        if (bArrCopyOf != null) {
            return new C0551Ik(bArrCopyOf);
        }
        return null;
    }

    /* renamed from: C */
    public static C0551Ik m7630C(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) (AbstractC1141S8.m7181a(str.charAt(i2 + 1)) + (AbstractC1141S8.m7181a(str.charAt(i2)) << 4));
        }
        return new C0551Ik(bArr);
    }

    /* renamed from: D */
    public static C0551Ik m7631D(String str) {
        O90.m5968f(str, "<this>");
        byte[] bytes = str.getBytes(AbstractC7038vr.f44561a);
        O90.m5967e(bytes, "this as java.lang.String).getBytes(charset)");
        C0551Ik c0551Ik = new C0551Ik(bytes);
        c0551Ik.f5119c = str;
        return c0551Ik;
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
    /* renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p000.C6795s m7632E(p000.X01 r17, p000.C4027f1 r18, int r19, p000.EnumC8049Od1 r20, boolean r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 668
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1210TE.m7632E(X01, f1, int, Od1, boolean, boolean):s");
    }

    /* renamed from: F */
    public static C0986Pf m7633F(AbstractC8315Tg1 abstractC8315Tg1, C4027f1 c4027f1, int i, boolean z) {
        AbstractC7742Ig0 abstractC7742Ig0M5738t;
        Object objM2354n = null;
        if (AbstractC1141S8.m7182b(abstractC8315Tg1)) {
            return new C0986Pf((Object) null, 1, 8);
        }
        if (!(abstractC8315Tg1 instanceof AbstractC3933dW)) {
            if (!(abstractC8315Tg1 instanceof X01)) {
                throw new C6838sg();
            }
            C6795s c6795sM7632E = m7632E((X01) abstractC8315Tg1, c4027f1, i, EnumC8049Od1.f8545c, false, z);
            boolean z2 = c6795sM7632E.f42188b;
            AbstractC7742Ig0 abstractC7742Ig0M2354n = (X01) c6795sM7632E.f42189c;
            if (z2) {
                abstractC7742Ig0M2354n = EZ1.m2354n(abstractC8315Tg1, abstractC7742Ig0M2354n);
            }
            return new C0986Pf(abstractC7742Ig0M2354n, c6795sM7632E.f42187a, 8);
        }
        boolean z3 = abstractC8315Tg1 instanceof C10633pJ0;
        AbstractC3933dW abstractC3933dW = (AbstractC3933dW) abstractC8315Tg1;
        C6795s c6795sM7632E2 = m7632E(abstractC3933dW.f26126b, c4027f1, i, EnumC8049Od1.f8543a, z3, z);
        C6795s c6795sM7632E3 = m7632E(abstractC3933dW.f26127c, c4027f1, i, EnumC8049Od1.f8544b, z3, z);
        X01 x01 = (X01) c6795sM7632E3.f42189c;
        X01 x012 = (X01) c6795sM7632E2.f42189c;
        if (x012 != null || x01 != null) {
            if (c6795sM7632E2.f42188b || c6795sM7632E3.f42188b) {
                if (x01 != null) {
                    if (x012 == null) {
                        x012 = x01;
                    }
                    abstractC7742Ig0M5738t = NV1.m5738t(x012, x01);
                } else {
                    O90.m5965c(x012);
                    abstractC7742Ig0M5738t = x012;
                }
                objM2354n = EZ1.m2354n(abstractC8315Tg1, abstractC7742Ig0M5738t);
            } else {
                X01 x013 = abstractC3933dW.f26127c;
                X01 x014 = abstractC3933dW.f26126b;
                X01 x015 = x012;
                if (z3) {
                    X01 x016 = x012;
                    if (x012 == null) {
                        x016 = x014;
                    }
                    if (x01 == null) {
                        x01 = x013;
                    }
                    objM2354n = new C10633pJ0(x016, x01);
                } else {
                    if (x012 == null) {
                        x015 = x014;
                    }
                    if (x01 == null) {
                        x01 = x013;
                    }
                    objM2354n = NV1.m5738t(x015, x01);
                }
            }
        }
        return new C0986Pf(objM2354n, c6795sM7632E2.f42187a, 8);
    }

    /* renamed from: G */
    public static C1210TE m7634G() {
        C1210TE c1210te;
        synchronized (f11211f) {
            try {
                if (f11212g == null) {
                    f11212g = new C1210TE(4);
                }
                c1210te = f11212g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1210te;
    }

    /* renamed from: J */
    public static String m7635J(MW0 mw0) {
        O90.m5968f(mw0, "type");
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
        throw new C6838sg();
    }

    /* renamed from: L */
    public static C0551Ik m7636L(byte[] bArr) {
        C0551Ik c0551Ik = C0551Ik.f5116d;
        int length = bArr.length;
        AbstractC1240Ti.m7729b(bArr.length, 0, length);
        return new C0551Ik(AbstractC0576J8.m4182i(bArr, 0, length));
    }

    /* renamed from: M */
    public static String m7637M(String str) {
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

    /* renamed from: N */
    public static void m7638N(Object obj) {
        C9488gM1 c9488gM1 = ((QG1) obj).zzc;
        if (c9488gM1.f27704e) {
            c9488gM1.f27704e = false;
        }
    }

    @Override // p000.InterfaceC11329ul0
    /* renamed from: A */
    public void mo7639A(Level level, String str, Throwable th) {
        PrintStream printStream = System.out;
        printStream.println("[" + level + "] " + str);
        th.printStackTrace(printStream);
    }

    /* renamed from: H */
    public C4196hi m7640H(C10737q70 c10737q70, Object obj) {
        C4196hi c4196hi = new C4196hi(c10737q70.f40609b.toString(), c10737q70.f40615h, c10737q70.f40616i, c10737q70.f40614g, null, null);
        c4196hi.f28535g = obj;
        return c4196hi;
    }

    /* renamed from: I */
    public O01 m7641I(Uri uri) {
        return new O01(uri.toString());
    }

    /* renamed from: K */
    public C4196hi m7642K(C10737q70 c10737q70, Object obj) {
        InterfaceC4199hl interfaceC4199hl;
        String name;
        InterfaceC10747qC0 interfaceC10747qC0 = c10737q70.f40623p;
        if (interfaceC10747qC0 != null) {
            InterfaceC4199hl interfaceC4199hlMo22219b = interfaceC10747qC0.mo22219b();
            name = interfaceC10747qC0.getClass().getName();
            interfaceC4199hl = interfaceC4199hlMo22219b;
        } else {
            interfaceC4199hl = null;
            name = null;
        }
        C4196hi c4196hi = new C4196hi(c10737q70.f40609b.toString(), c10737q70.f40615h, c10737q70.f40616i, c10737q70.f40614g, interfaceC4199hl, name);
        c4196hi.f28535g = obj;
        return c4196hi;
    }

    @Override // p000.InterfaceC11329ul0
    /* renamed from: a */
    public void mo7643a(Level level, String str) {
        System.out.println("[" + level + "] " + str);
    }

    @Override // p000.InterfaceC0468HQ
    /* renamed from: b */
    public Map mo3411b(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // p000.InterfaceC8294Sw0
    /* renamed from: c */
    public Object mo386c() {
        return new C10301mj0(true, 0);
    }

    @Override // p000.InterfaceC6593p3
    /* renamed from: d */
    public Collection mo7644d(InterfaceC6976us interfaceC6976us) {
        O90.m5968f(interfaceC6976us, "classDescriptor");
        return C0779MN.f7117a;
    }

    @Override // p000.InterfaceC6593p3
    /* renamed from: f */
    public Collection mo7645f(C8340Tt0 c8340Tt0, InterfaceC6976us interfaceC6976us) {
        O90.m5968f(c8340Tt0, "name");
        O90.m5968f(interfaceC6976us, "classDescriptor");
        return C0779MN.f7117a;
    }

    @Override // com.p019vk.push.core.filedatastore.JsonDeserializer
    public Object fromJson(JSONObject jSONObject) throws JSONException {
        O90.m5968f(jSONObject, "<this>");
        String string = jSONObject.getString("last_delivered_push_token");
        O90.m5967e(string, "getString(\"last_delivered_push_token\")");
        return new C11342ur1(string, jSONObject.optBoolean("push_token_delivered"));
    }

    @Override // p000.InterfaceC0750Lv
    /* renamed from: g */
    public Object mo390g(C8128Pr0 c8128Pr0) {
        return new C10959rs0();
    }

    @Override // p000.InterfaceC0468HQ
    /* renamed from: h */
    public C0405GQ mo3412h() {
        throw new IllegalStateException();
    }

    @Override // p000.InterfaceC6593p3
    /* renamed from: i */
    public Collection mo7646i(InterfaceC6976us interfaceC6976us) {
        O90.m5968f(interfaceC6976us, "classDescriptor");
        return C0779MN.f7117a;
    }

    @Override // p000.InterfaceC6593p3
    /* renamed from: j */
    public Collection mo7647j(InterfaceC6976us interfaceC6976us) {
        O90.m5968f(interfaceC6976us, "classDescriptor");
        return C0779MN.f7117a;
    }

    @Override // p000.InterfaceC0468HQ
    /* renamed from: l */
    public InterfaceC6410mB mo3414l(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // p000.InterfaceC0468HQ
    /* renamed from: m */
    public byte[] mo3415m() throws MediaDrmException {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override // p000.InterfaceC0468HQ
    /* renamed from: n */
    public void mo3416n(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // p000.InterfaceC0689Kw
    /* renamed from: p */
    public C0626Jw mo4780p() {
        return new C0626Jw(f11216k, f11215j);
    }

    @Override // p000.InterfaceC0468HQ
    /* renamed from: q */
    public byte[] mo3418q(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // p000.InterfaceC0468HQ
    /* renamed from: r */
    public void mo3419r(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // p000.InterfaceC0468HQ
    /* renamed from: s */
    public C0279EQ mo3420s(byte[] bArr, List list, int i, HashMap map) {
        throw new IllegalStateException();
    }

    @Override // p000.InterfaceC1397WC
    /* renamed from: s0 */
    public InterfaceC1586ZC mo506s0() {
        return new C6888tT(false);
    }

    @Override // p000.InterfaceC0468HQ
    /* renamed from: u */
    public int mo3421u() {
        return 1;
    }

    @Override // p000.InterfaceC0468HQ
    /* renamed from: w */
    public /* synthetic */ void mo3422w(byte[] bArr, NB0 nb0) {
    }

    @Override // p000.InterfaceC0843NO
    /* renamed from: x */
    public Boolean mo5667x() {
        return null;
    }

    @Override // p000.InterfaceC0468HQ
    /* renamed from: y */
    public boolean mo3423y(String str, byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // p000.InterfaceC8525Xh1
    /* renamed from: z */
    public Object mo407z(AbstractC11947zc0 abstractC11947zc0, float f) {
        return Integer.valueOf(Math.round(AbstractC7734Ic0.m3957d(abstractC11947zc0) * f));
    }

    @Override // p000.InterfaceC10378nJ1
    public Object zza() {
        switch (this.f11217a) {
            case 27:
                PW1.f9104b.get();
                return Integer.valueOf((int) ((Long) UW1.f11868e0.m8754a()).longValue());
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                PW1.f9104b.get();
                Long l = (Long) UW1.f11841I.m8754a();
                l.getClass();
                return l;
            default:
                PW1.f9104b.get();
                Long l2 = (Long) UW1.f11874h0.m8754a();
                l2.getClass();
                return l2;
        }
    }

    public C1210TE(C1068Qy c1068Qy) {
        this.f11217a = 25;
    }

    @Override // p000.InterfaceC8217Rj1
    /* renamed from: e */
    public void mo5473e() {
    }

    @Override // p000.InterfaceC0468HQ
    public void release() {
    }

    @Override // p000.InterfaceC8217Rj1
    /* renamed from: v */
    public void mo5476v() {
    }

    @Override // p000.InterfaceC0468HQ
    /* renamed from: k */
    public void mo3413k(C8170Qm0 c8170Qm0) {
    }

    @Override // p000.InterfaceC0468HQ
    /* renamed from: o */
    public void mo3417o(byte[] bArr) {
    }

    @Override // p000.InterfaceC8088Ox0
    public void onComplete(Throwable th) {
    }

    @Override // p000.InterfaceC11800yS0
    /* renamed from: t */
    public InterfaceC10011kS0 mo875t(InterfaceC10011kS0 interfaceC10011kS0, C7830Jy0 c7830Jy0) {
        return interfaceC10011kS0;
    }
}
