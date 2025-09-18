package p000;

import android.content.Intent;
import android.graphics.Color;
import android.hardware.camera2.CaptureResult;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Bundle;
import com.facebook.soloader.SoLoader;
import com.google.android.gms.tasks.Task;
import com.google.firebase.perf.session.SessionManager;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.p019vk.push.core.filedatastore.JsonDeserializer;
import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import javax.inject.Provider;
import org.json.JSONObject;

/* renamed from: Av0 */
/* loaded from: classes.dex */
public final class C7356Av0 implements InterfaceC8525Xh1, InterfaceC0750Lv, InterfaceC1319Uy, QR0, InterfaceC7034vn, InterfaceC8294Sw0, InterfaceC3987eO, Provider, InterfaceC8538Xo0, InterfaceC10175lk0, InterfaceC10907rS0, InterfaceC8088Ox0, JsonDeserializer, InterfaceC10378nJ1 {

    /* renamed from: b */
    public static C7356Av0 f462b;

    /* renamed from: c */
    public static final C7356Av0 f463c = new C7356Av0(1);

    /* renamed from: d */
    public static final C7356Av0 f464d = new C7356Av0(2);

    /* renamed from: e */
    public static final C7356Av0 f465e = new C7356Av0(3);

    /* renamed from: f */
    public static final C7356Av0 f466f = new C7356Av0(4);

    /* renamed from: g */
    public static final /* synthetic */ C7356Av0 f467g = new C7356Av0(6);

    /* renamed from: h */
    public static final C7356Av0 f468h = new C7356Av0(7);

    /* renamed from: a */
    public final /* synthetic */ int f469a;

    public /* synthetic */ C7356Av0(int i) {
        this.f469a = i;
    }

    /* renamed from: A */
    public static EnumC8038Ny0 m372A(int i) {
        return (45 > i || i >= 136) ? (135 > i || i >= 226) ? (225 > i || i >= 316) ? EnumC8038Ny0.f8147c : EnumC8038Ny0.f8148d : EnumC8038Ny0.f8149e : EnumC8038Ny0.f8150f;
    }

    /* renamed from: B */
    public static EnumC8038Ny0 m373B(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? EnumC8038Ny0.f8147c : EnumC8038Ny0.f8150f : EnumC8038Ny0.f8149e : EnumC8038Ny0.f8148d : EnumC8038Ny0.f8147c;
    }

    /* renamed from: C */
    public static LinkedHashSet m374C(String str, String... strArr) {
        O90.m5968f(str, "internalName");
        O90.m5968f(strArr, "signatures");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str2 : strArr) {
            linkedHashSet.add(str + '.' + str2);
        }
        return linkedHashSet;
    }

    /* renamed from: D */
    public static LinkedHashSet m375D(String str, String... strArr) {
        O90.m5968f(strArr, "signatures");
        return m374C("java/lang/".concat(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* renamed from: E */
    public static LinkedHashSet m376E(String str, String... strArr) {
        return m374C("java/util/".concat(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* renamed from: F */
    public static boolean m377F(int i, int i2, String str) {
        int i3 = i + 2;
        return i3 < i2 && str.charAt(i) == '%' && AbstractC7433Ch1.m1290s(str.charAt(i + 1)) != -1 && AbstractC7433Ch1.m1290s(str.charAt(i3)) != -1;
    }

    /* renamed from: H */
    public static String m378H(String str, int i, boolean z, int i2, int i3) {
        int i4;
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        O90.m5968f(str, "<this>");
        int iCharCount = i;
        while (iCharCount < i2) {
            char cCharAt = str.charAt(iCharCount);
            if (cCharAt == '%' || (cCharAt == '+' && z)) {
                C6507nj c6507nj = new C6507nj();
                c6507nj.m23201w0(i, iCharCount, str);
                while (iCharCount < i2) {
                    int iCodePointAt = str.codePointAt(iCharCount);
                    if (iCodePointAt == 37 && (i4 = iCharCount + 2) < i2) {
                        int iM1290s = AbstractC7433Ch1.m1290s(str.charAt(iCharCount + 1));
                        int iM1290s2 = AbstractC7433Ch1.m1290s(str.charAt(i4));
                        if (iM1290s == -1 || iM1290s2 == -1) {
                            c6507nj.m23204y0(iCodePointAt);
                            iCharCount += Character.charCount(iCodePointAt);
                        } else {
                            c6507nj.m23195r0((iM1290s << 4) + iM1290s2);
                            iCharCount = Character.charCount(iCodePointAt) + i4;
                        }
                    } else if (iCodePointAt == 43 && z) {
                        c6507nj.m23195r0(32);
                        iCharCount++;
                    } else {
                        c6507nj.m23204y0(iCodePointAt);
                        iCharCount += Character.charCount(iCodePointAt);
                    }
                }
                return c6507nj.m23183e0();
            }
            iCharCount++;
        }
        String strSubstring = str.substring(i, i2);
        O90.m5967e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    /* renamed from: I */
    public static ArrayList m379I(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int iM25361z = AbstractC11374v51.m25361z(str, '&', i, false, 4);
            if (iM25361z == -1) {
                iM25361z = str.length();
            }
            int iM25361z2 = AbstractC11374v51.m25361z(str, '=', i, false, 4);
            if (iM25361z2 == -1 || iM25361z2 > iM25361z) {
                String strSubstring = str.substring(i, iM25361z);
                O90.m5967e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(strSubstring);
                arrayList.add(null);
            } else {
                String strSubstring2 = str.substring(i, iM25361z2);
                O90.m5967e(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(strSubstring2);
                String strSubstring3 = str.substring(iM25361z2 + 1, iM25361z);
                O90.m5967e(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(strSubstring3);
            }
            i = iM25361z + 1;
        }
        return arrayList;
    }

    /* renamed from: J */
    public static void m380J(ArrayList arrayList, StringBuilder sb) {
        O90.m5968f(arrayList, "<this>");
        C9205e90 c9205e90M22422g = AbstractC10132lO1.m22422g(AbstractC10132lO1.m22423h(0, arrayList.size()), 2);
        int i = c9205e90M22422g.f26569a;
        int i2 = c9205e90M22422g.f26570b;
        int i3 = c9205e90M22422g.f26571c;
        if ((i3 <= 0 || i > i2) && (i3 >= 0 || i2 > i)) {
            return;
        }
        while (true) {
            String str = (String) arrayList.get(i);
            String str2 = (String) arrayList.get(i + 1);
            if (i > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
            if (i == i2) {
                return;
            } else {
                i += i3;
            }
        }
    }

    /* renamed from: v */
    public static String m381v(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, int i3) {
        int i4 = (i3 & 1) != 0 ? 0 : i;
        int length = (i3 & 2) != 0 ? str.length() : i2;
        boolean z5 = (i3 & 8) != 0 ? false : z;
        boolean z6 = (i3 & 16) != 0 ? false : z2;
        boolean z7 = (i3 & 32) != 0 ? false : z3;
        boolean z8 = (i3 & 64) == 0 ? z4 : false;
        O90.m5968f(str, "<this>");
        int iCharCount = i4;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            int i5 = 32;
            int i6 = 128;
            if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z8) || AbstractC11374v51.m25352q(str2, (char) iCodePointAt) || ((iCodePointAt == 37 && (!z5 || (z6 && !m377F(iCharCount, length, str)))) || (iCodePointAt == 43 && z7)))) {
                C6507nj c6507nj = new C6507nj();
                c6507nj.m23201w0(i4, iCharCount, str);
                C6507nj c6507nj2 = null;
                while (iCharCount < length) {
                    int iCodePointAt2 = str.codePointAt(iCharCount);
                    if (!z5 || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                        if (iCodePointAt2 == 43 && z7) {
                            c6507nj.m23203x0(z5 ? "+" : "%2B");
                        } else if (iCodePointAt2 < i5 || iCodePointAt2 == 127 || ((iCodePointAt2 >= i6 && !z8) || AbstractC11374v51.m25352q(str2, (char) iCodePointAt2) || (iCodePointAt2 == 37 && (!z5 || (z6 && !m377F(iCharCount, length, str)))))) {
                            if (c6507nj2 == null) {
                                c6507nj2 = new C6507nj();
                            }
                            c6507nj2.m23204y0(iCodePointAt2);
                            while (!c6507nj2.m23200w()) {
                                byte bM23176J = c6507nj2.m23176J();
                                c6507nj.m23195r0(37);
                                char[] cArr = D40.f1827j;
                                c6507nj.m23195r0(cArr[((bM23176J & 255) >> 4) & 15]);
                                c6507nj.m23195r0(cArr[bM23176J & 15]);
                            }
                        } else {
                            c6507nj.m23204y0(iCodePointAt2);
                        }
                    }
                    iCharCount += Character.charCount(iCodePointAt2);
                    i5 = 32;
                    i6 = 128;
                }
                return c6507nj.m23183e0();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        String strSubstring = str.substring(i4, length);
        O90.m5967e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    /* renamed from: y */
    public static String[] m382y(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add("<init>(" + str + ")V");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* renamed from: G */
    public synchronized void m383G() {
        SoLoader.m11076j("react_newarchdefaults");
        try {
            SoLoader.m11076j("appmodules");
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    @Override // p000.InterfaceC7034vn
    /* renamed from: a */
    public /* synthetic */ void mo384a(C6551oQ c6551oQ) {
        AbstractC7222ym.m26224a(this, c6551oQ);
    }

    @Override // p000.InterfaceC7034vn
    /* renamed from: b */
    public C10996s81 mo385b() {
        return C10996s81.f42278b;
    }

    @Override // p000.InterfaceC8294Sw0
    /* renamed from: c */
    public Object mo386c() {
        return new ArrayDeque();
    }

    @Override // p000.InterfaceC8538Xo0
    /* renamed from: d */
    public MediaCodecInfo mo387d(int i) {
        return MediaCodecList.getCodecInfoAt(i);
    }

    @Override // p000.InterfaceC10175lk0
    /* renamed from: e */
    public void mo388e() {
        synchronized (II1.f4884a) {
            Object obj = II1.f4885b;
            synchronized (obj) {
                if (II1.f4886c) {
                    return;
                }
                long jM3807a = II1.m3807a();
                synchronized (obj) {
                    II1.f4887d = jM3807a;
                    II1.f4886c = true;
                }
            }
        }
    }

    @Override // com.p019vk.push.core.filedatastore.JsonDeserializer
    public Object fromJson(JSONObject jSONObject) {
        O90.m5968f(jSONObject, "<this>");
        return new C8189Qv1(jSONObject.optInt("notification_id_key"));
    }

    @Override // p000.InterfaceC0750Lv
    /* renamed from: g */
    public Object mo390g(C8128Pr0 c8128Pr0) {
        Object objMo4071h = c8128Pr0.mo4071h(new C11011sG0(InterfaceC8214Ri0.class, Executor.class));
        O90.m5967e(objMo4071h, "c.get(Qualified.qualifie…a, Executor::class.java))");
        return N02.m5507e((Executor) objMo4071h);
    }

    @Override // javax.inject.Provider
    public Object get() {
        SessionManager sessionManager = SessionManager.getInstance();
        AbstractC8971cM1.m10691d(sessionManager);
        return sessionManager;
    }

    @Override // p000.InterfaceC7034vn
    public long getTimestamp() {
        return -1L;
    }

    @Override // p000.InterfaceC7034vn
    /* renamed from: h */
    public EnumC6908tn mo391h() {
        return EnumC6908tn.f43251a;
    }

    @Override // p000.InterfaceC7034vn
    /* renamed from: i */
    public int mo392i() {
        return 1;
    }

    @Override // p000.InterfaceC8538Xo0
    /* renamed from: k */
    public boolean mo394k(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && "video/avc".equals(str2);
    }

    @Override // p000.InterfaceC8538Xo0
    /* renamed from: m */
    public boolean mo396m(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override // p000.InterfaceC1782bO
    /* renamed from: n */
    public boolean mo397n(Object obj, File file, C7830Jy0 c7830Jy0) throws Throwable {
        try {
            AbstractC7031vk.m25481d(((C9025cn1) ((C8483Wm1) ((InterfaceC10011kS0) obj).get()).f13400a.f17293b).f17749a.f12030a.asReadOnlyBuffer(), file);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // p000.InterfaceC7034vn
    /* renamed from: o */
    public EnumC6765rn mo398o() {
        return EnumC6765rn.f41898a;
    }

    @Override // p000.QR0
    public /* synthetic */ void onCaptureBufferLost(RR0 rr0, long j, int i) {
    }

    @Override // p000.QR0
    public /* synthetic */ void onCaptureCompleted(RR0 rr0, InterfaceC7034vn interfaceC7034vn) {
    }

    @Override // p000.QR0
    public /* synthetic */ void onCaptureFailed(RR0 rr0, C6702qn c6702qn) {
    }

    @Override // p000.QR0
    public /* synthetic */ void onCaptureProgressed(RR0 rr0, InterfaceC7034vn interfaceC7034vn) {
    }

    @Override // p000.QR0
    public /* synthetic */ void onCaptureSequenceAborted(int i) {
    }

    @Override // p000.QR0
    public /* synthetic */ void onCaptureSequenceCompleted(int i, long j) {
    }

    @Override // p000.QR0
    public /* synthetic */ void onCaptureStarted(RR0 rr0, long j, long j2) {
    }

    @Override // p000.InterfaceC8538Xo0
    /* renamed from: p */
    public int mo399p() {
        return MediaCodecList.getCodecCount();
    }

    @Override // p000.InterfaceC10907rS0
    /* renamed from: r */
    public int mo401r(C7830Jy0 c7830Jy0) {
        return 1;
    }

    @Override // p000.InterfaceC7034vn
    /* renamed from: t */
    public CaptureResult mo403t() {
        return null;
    }

    @Override // p000.InterfaceC1319Uy
    public Object then(Task task) {
        Intent intent = (Intent) ((Bundle) task.mo11142i()).getParcelable("notification_data");
        if (intent != null) {
            return new C0308Et(intent);
        }
        return null;
    }

    @Override // p000.InterfaceC7034vn
    /* renamed from: u */
    public EnumC6845sn mo404u() {
        return EnumC6845sn.f42594a;
    }

    @Override // p000.InterfaceC8538Xo0
    /* renamed from: w */
    public boolean mo405w() {
        return false;
    }

    /* renamed from: x */
    public void m406x(InterfaceC4050fO interfaceC4050fO) {
        interfaceC4050fO.mo884a(C10721q02.class, C9758iT1.f29195a);
        interfaceC4050fO.mo884a(E22.class, PX1.f9110a);
        interfaceC4050fO.mo884a(AbstractC10849r02.class, C10014kT1.f36506a);
        interfaceC4050fO.mo884a(AbstractC11233u02.class, C10398nT1.f38331a);
        interfaceC4050fO.mo884a(AbstractC10977s02.class, C10142lT1.f37078a);
        interfaceC4050fO.mo884a(AbstractC11105t02.class, C10526oT1.f39026a);
        interfaceC4050fO.mo884a(AbstractC11561wZ1.class, C10266mR1.f37709a);
        interfaceC4050fO.mo884a(AbstractC11306uZ1.class, C10138lR1.f37063a);
        interfaceC4050fO.mo884a(ZZ1.class, CS1.f1378a);
        interfaceC4050fO.mo884a(AbstractC10343n22.class, VW1.f12605a);
        interfaceC4050fO.mo884a(AbstractC10922rZ1.class, C9882jR1.f35151a);
        interfaceC4050fO.mo884a(AbstractC10538oZ1.class, C9370fR1.f27202a);
        interfaceC4050fO.mo884a(AbstractC10084l12.class, C9890jV1.f35164a);
        interfaceC4050fO.mo884a(AbstractC9578h32.class, C9756iS1.f29137a);
        interfaceC4050fO.mo884a(VZ1.class, C10652pS1.f40085a);
        interfaceC4050fO.mo884a(RZ1.class, C9116dS1.f26117a);
        interfaceC4050fO.mo884a(AbstractC10340n12.class, C10146lV1.f37090a);
        interfaceC4050fO.mo884a(AbstractC9959k22.class, NW1.f7855a);
        interfaceC4050fO.mo884a(AbstractC10087l22.class, QW1.f9654a);
        interfaceC4050fO.mo884a(AbstractC9831j22.class, LW1.f6693a);
        interfaceC4050fO.mo884a(B02.class, JT1.f5540a);
        interfaceC4050fO.mo884a(Y22.class, C8851bQ1.f17015a);
        interfaceC4050fO.mo884a(C02.class, LT1.f6659a);
        interfaceC4050fO.mo884a(A12.class, C11934zV1.f46852a);
        interfaceC4050fO.mo884a(D12.class, GV1.f3772a);
        interfaceC4050fO.mo884a(C12.class, EV1.f2727a);
        interfaceC4050fO.mo884a(B12.class, CV1.f1415a);
        interfaceC4050fO.mo884a(M12.class, C9892jW1.f35170a);
        interfaceC4050fO.mo884a(N12.class, C10020kW1.f36522a);
        interfaceC4050fO.mo884a(P12.class, C10404nW1.f38356a);
        interfaceC4050fO.mo884a(O12.class, C10276mW1.f37753a);
        interfaceC4050fO.mo884a(AbstractC11616x02.class, IT1.f4948a);
        interfaceC4050fO.mo884a(Q12.class, C10532oW1.f39066a);
        interfaceC4050fO.mo884a(R12.class, C10660pW1.f40140a);
        interfaceC4050fO.mo884a(S12.class, C10788qW1.f40950a);
        interfaceC4050fO.mo884a(T12.class, C11044sW1.f42473a);
        interfaceC4050fO.mo884a(AbstractC9063d22.class, C11555wW1.f44933a);
        interfaceC4050fO.mo884a(AbstractC8930c22.class, C11682xW1.f45668a);
        interfaceC4050fO.mo884a(L12.class, QV1.f9653a);
        interfaceC4050fO.mo884a(C10810qh1.class, TS1.f11360a);
        interfaceC4050fO.mo884a(J12.class, C9508gW1.f27827a);
        interfaceC4050fO.mo884a(I12.class, UV1.f11830a);
        interfaceC4050fO.mo884a(K12.class, C9764iW1.f29297a);
        interfaceC4050fO.mo884a(AbstractC10215m22.class, SW1.f10823a);
        interfaceC4050fO.mo884a(K22.class, C9384fY1.f27228a);
        interfaceC4050fO.mo884a(MY1.class, C11543wQ1.f44863a);
        interfaceC4050fO.mo884a(IY1.class, C9880jQ1.f35150a);
        interfaceC4050fO.mo884a(GY1.class, C9368fQ1.f27187a);
        interfaceC4050fO.mo884a(KY1.class, C11160tQ1.f43075a);
        interfaceC4050fO.mo884a(RY1.class, DQ1.f2014a);
        interfaceC4050fO.mo884a(OY1.class, C11670xQ1.f45636a);
        interfaceC4050fO.mo884a(UY1.class, FQ1.f3204a);
        interfaceC4050fO.mo884a(WY1.class, GQ1.f3736a);
        interfaceC4050fO.mo884a(YY1.class, LQ1.f6630a);
        interfaceC4050fO.mo884a(AbstractC8869bZ1.class, PQ1.f9069a);
        interfaceC4050fO.mo884a(AbstractC9258eZ1.class, QQ1.f9620a);
        interfaceC4050fO.mo884a(YM1.class, PP1.f9066a);
        interfaceC4050fO.mo884a(AbstractC9746iN1.class, WP1.f13175a);
        interfaceC4050fO.mo884a(AbstractC8717aN1.class, SP1.f10757a);
        interfaceC4050fO.mo884a(AbstractC8796b02.class, MS1.f7170a);
        interfaceC4050fO.mo884a(AbstractC11815yZ1.class, C10778qR1.f40876a);
        interfaceC4050fO.mo884a(JI1.class, C10386nN1.f38299a);
        interfaceC4050fO.mo884a(II1.class, C11026sN1.f42385a);
        interfaceC4050fO.mo884a(PZ1.class, YR1.f14301a);
        interfaceC4050fO.mo884a(SI1.class, C11282uN1.f43687a);
        interfaceC4050fO.mo884a(QI1.class, BN1.f775a);
        interfaceC4050fO.mo884a(AbstractC9358fL1.class, C10772qO1.f40856a);
        interfaceC4050fO.mo884a(AbstractC11658xK1.class, C11156tO1.f43048a);
        interfaceC4050fO.mo884a(C9866jJ1.class, CN1.f1346a);
        interfaceC4050fO.mo884a(C8965cJ1.class, GN1.f3720a);
        interfaceC4050fO.mo884a(BL1.class, SO1.f10714a);
        interfaceC4050fO.mo884a(AbstractC11787yL1.class, XO1.f13688a);
        interfaceC4050fO.mo884a(QL1.class, C9622hP1.f28414a);
        interfaceC4050fO.mo884a(ML1.class, C9750iP1.f29123a);
        interfaceC4050fO.mo884a(XM1.class, LP1.f6628a);
        interfaceC4050fO.mo884a(RM1.class, MP1.f7151a);
        interfaceC4050fO.mo884a(AbstractC8971cM1.class, C10006kP1.f36488a);
        interfaceC4050fO.mo884a(RL1.class, C10774qP1.f40862a);
        interfaceC4050fO.mo884a(AbstractC9360fM1.class, C10902rP1.f41664a);
        interfaceC4050fO.mo884a(AbstractC9104dM1.class, C11541wP1.f44860a);
        interfaceC4050fO.mo884a(S22.class, C9894jX1.f35219a);
        interfaceC4050fO.mo884a(L22.class, C11034sR1.f42433a);
        interfaceC4050fO.mo884a(P22.class, FT1.f3273a);
        interfaceC4050fO.mo884a(O22.class, CT1.f1391a);
        interfaceC4050fO.mo884a(M22.class, C9884jS1.f35152a);
        interfaceC4050fO.mo884a(R22.class, C8737aX1.f15553a);
        interfaceC4050fO.mo884a(Q22.class, YW1.f14330a);
        interfaceC4050fO.mo884a(T22.class, C10150lX1.f37104a);
        interfaceC4050fO.mo884a(N22.class, GS1.f3754a);
        interfaceC4050fO.mo884a(W22.class, C10408nY1.f38364a);
        interfaceC4050fO.mo884a(V22.class, C10792qY1.f41021a);
        interfaceC4050fO.mo884a(U22.class, C10024kY1.f36541a);
        interfaceC4050fO.mo884a(AbstractC10599p22.class, C10918rX1.f41723a);
        interfaceC4050fO.mo884a(AbstractC8668a02.class, JS1.f5526a);
        interfaceC4050fO.mo884a(AbstractC8924c02.class, YS1.f14313a);
        interfaceC4050fO.mo884a(AbstractC11432vY1.class, C9112dQ1.f26060a);
        interfaceC4050fO.mo884a(WZ1.class, C11036sS1.f42441a);
        interfaceC4050fO.mo884a(C10682ph1.class, PS1.f9076a);
        interfaceC4050fO.mo884a(QZ1.class, C8855bS1.f17034a);
        interfaceC4050fO.mo884a(CZ1.class, C11799yR1.f46257a);
        interfaceC4050fO.mo884a(EZ1.class, CR1.f1374a);
        interfaceC4050fO.mo884a(AZ1.class, C11162tR1.f43078a);
        interfaceC4050fO.mo884a(FZ1.class, IR1.f4937a);
        interfaceC4050fO.mo884a(AbstractC11489w02.class, C11930zT1.f46845a);
        interfaceC4050fO.mo884a(AbstractC11361v02.class, C11422vT1.f44387a);
        interfaceC4050fO.mo884a(EI1.class, C9874jN1.f35105a);
        interfaceC4050fO.mo884a(H22.class, XX1.f13840a);
        interfaceC4050fO.mo884a(J22.class, C8995cY1.f17601a);
        interfaceC4050fO.mo884a(I22.class, ZX1.f14961a);
        interfaceC4050fO.mo884a(AbstractC11176tY1.class, ZP1.f14884a);
        interfaceC4050fO.mo884a(AbstractC10154lZ1.class, C8981cR1.f17478a);
        interfaceC4050fO.mo884a(AbstractC9770iZ1.class, ZQ1.f14892a);
        interfaceC4050fO.mo884a(AbstractC9514gZ1.class, UQ1.f11785a);
        interfaceC4050fO.mo884a(AbstractC9444g12.class, C8861bV1.f17052a);
        interfaceC4050fO.mo884a(AbstractC9828j12.class, C9506gV1.f27819a);
        interfaceC4050fO.mo884a(AbstractC9700i12.class, C9378fV1.f27225a);
        interfaceC4050fO.mo884a(AbstractC11276uK1.class, C9492gO1.f27780a);
        interfaceC4050fO.mo884a(AbstractC11148tK1.class, C10260mO1.f37669a);
        interfaceC4050fO.mo884a(AbstractC10468o12.class, C10402nV1.f38353a);
        interfaceC4050fO.mo884a(AbstractC11492w12.class, C11042sV1.f42466a);
        interfaceC4050fO.mo884a(AbstractC10596p12.class, C10658pV1.f40128a);
        interfaceC4050fO.mo884a(AbstractC10724q12.class, C10786qV1.f40913a);
        interfaceC4050fO.mo884a(AbstractC10638pL1.class, C11666xO1.f45571a);
        interfaceC4050fO.mo884a(AbstractC9998kL1.class, BO1.f798a);
        interfaceC4050fO.mo884a(AbstractC11239u22.class, DX1.f2042a);
        interfaceC4050fO.mo884a(AbstractC11111t22.class, BX1.f869a);
        interfaceC4050fO.mo884a(F22.class, SX1.f10845a);
        interfaceC4050fO.mo884a(G22.class, UX1.f11901a);
        interfaceC4050fO.mo884a(E12.class, IV1.f4963a);
        interfaceC4050fO.mo884a(H12.class, OV1.f8465a);
        interfaceC4050fO.mo884a(F12.class, JV1.f5562a);
        interfaceC4050fO.mo884a(G12.class, MV1.f7200a);
        interfaceC4050fO.mo884a(YZ1.class, C11801yS1.f46262a);
        interfaceC4050fO.mo884a(IL1.class, C8721aP1.f15494a);
        interfaceC4050fO.mo884a(FL1.class, C9238eP1.f26696a);
        interfaceC4050fO.mo884a(XZ1.class, C11547wS1.f44890a);
        interfaceC4050fO.mo884a(SZ1.class, C10140lS1.f37074a);
        interfaceC4050fO.mo884a(AbstractC11619x12.class, C11298uV1.f43707a);
        interfaceC4050fO.mo884a(AbstractC11873z12.class, C11807yV1.f46279a);
        interfaceC4050fO.mo884a(AbstractC11746y12.class, C11426vV1.f44393a);
        interfaceC4050fO.mo884a(AbstractC11406vL1.class, FO1.f3200a);
        interfaceC4050fO.mo884a(AbstractC10766qL1.class, GO1.f3729a);
        interfaceC4050fO.mo884a(W02.class, C11932zU1.f46849a);
        interfaceC4050fO.mo884a(X02.class, BU1.f843a);
        interfaceC4050fO.mo884a(Y02.class, DU1.f2021a);
        interfaceC4050fO.mo884a(NJ1.class, WN1.f13157a);
        interfaceC4050fO.mo884a(IJ1.class, XN1.f13685a);
        interfaceC4050fO.mo884a(S02.class, C10656pU1.f40113a);
        interfaceC4050fO.mo884a(T02.class, C11040sU1.f42458a);
        interfaceC4050fO.mo884a(U02.class, C11678xU1.f45660a);
        interfaceC4050fO.mo884a(DJ1.class, KN1.f6039a);
        interfaceC4050fO.mo884a(CJ1.class, SN1.f10709a);
        interfaceC4050fO.mo884a(Z02.class, FU1.f3282a);
        interfaceC4050fO.mo884a(AbstractC8671a12.class, GU1.f3763a);
        interfaceC4050fO.mo884a(AbstractC8799b12.class, IU1.f4957a);
        interfaceC4050fO.mo884a(AbstractC8927c12.class, QU1.f9645a);
        interfaceC4050fO.mo884a(YJ1.class, ZN1.f14875a);
        interfaceC4050fO.mo884a(UJ1.class, C9364fO1.f27175a);
        interfaceC4050fO.mo884a(AbstractC10855r22.class, C11174tX1.f43117a);
        interfaceC4050fO.mo884a(AbstractC10727q22.class, C11557wX1.f44947a);
        interfaceC4050fO.mo884a(AbstractC9057d02.class, ZS1.f14901a);
        interfaceC4050fO.mo884a(AbstractC9313f02.class, C9374fT1.f27213a);
        interfaceC4050fO.mo884a(AbstractC9185e02.class, C9118dT1.f26119a);
        interfaceC4050fO.mo884a(AbstractC9441g02.class, C9630hT1.f28429a);
        interfaceC4050fO.mo884a(AbstractC9191e22.class, C11936zW1.f46858a);
        interfaceC4050fO.mo884a(AbstractC9319f22.class, CW1.f1421a);
        interfaceC4050fO.mo884a(AbstractC11916zM1.class, DP1.f2007a);
        interfaceC4050fO.mo884a(AbstractC11152tM1.class, EP1.f2694a);
        interfaceC4050fO.mo884a(AbstractC11367v22.class, GX1.f3797a);
        interfaceC4050fO.mo884a(U12.class, C11172tW1.f43109a);
        interfaceC4050fO.mo884a(V12.class, C11300uW1.f43718a);
        interfaceC4050fO.mo884a(AbstractC10384nM1.class, C11795yP1.f46253a);
        interfaceC4050fO.mo884a(AbstractC10256mM1.class, BP1.f800a);
        interfaceC4050fO.mo884a(AbstractC10983s22.class, C11811yX1.f46291a);
        interfaceC4050fO.mo884a(R02.class, QT1.f9643a);
        interfaceC4050fO.mo884a(Q02.class, C10144lU1.f37079a);
        interfaceC4050fO.mo884a(N02.class, C8987cU1.f17537a);
        interfaceC4050fO.mo884a(I02.class, ZT1.f14902a);
        interfaceC4050fO.mo884a(O02.class, C9632hU1.f28432a);
        interfaceC4050fO.mo884a(P02.class, C10016kU1.f36509a);
        interfaceC4050fO.mo884a(H02.class, YT1.f14314a);
        interfaceC4050fO.mo884a(E02.class, PT1.f9084a);
        interfaceC4050fO.mo884a(G02.class, VT1.f12590a);
        interfaceC4050fO.mo884a(F02.class, UT1.f11804a);
        interfaceC4050fO.mo884a(AbstractC9188e12.class, WU1.f13218a);
        interfaceC4050fO.mo884a(IZ1.class, PR1.f9073a);
        interfaceC4050fO.mo884a(AbstractC9060d12.class, VU1.f12593a);
        interfaceC4050fO.mo884a(AbstractC9316f12.class, ZU1.f14910a);
        interfaceC4050fO.mo884a(HZ1.class, KR1.f6111a);
        interfaceC4050fO.mo884a(OZ1.class, RR1.f10179a);
        interfaceC4050fO.mo884a(AbstractC10471o22.class, C10534oX1.f39078a);
        interfaceC4050fO.mo884a(AbstractC9447g22.class, FW1.f3293a);
        interfaceC4050fO.mo884a(D22.class, NX1.f7860a);
        interfaceC4050fO.mo884a(AbstractC9703i22.class, JW1.f5576a);
        interfaceC4050fO.mo884a(AbstractC9575h22.class, HW1.f4332a);
        interfaceC4050fO.mo884a(AbstractC11495w22.class, IX1.f4977a);
        interfaceC4050fO.mo884a(GM1.class, FP1.f3203a);
        interfaceC4050fO.mo884a(FM1.class, JP1.f5513a);
        interfaceC4050fO.mo884a(AbstractC11622x22.class, LX1.f6701a);
        interfaceC4050fO.mo884a(GZ1.class, JR1.f5520a);
    }

    @Override // p000.InterfaceC8525Xh1
    /* renamed from: z */
    public Object mo407z(AbstractC11947zc0 abstractC11947zc0, float f) {
        boolean z = abstractC11947zc0.mo3517U() == 1;
        if (z) {
            abstractC11947zc0.mo3523m();
        }
        double dMo3514D = abstractC11947zc0.mo3514D();
        double dMo3514D2 = abstractC11947zc0.mo3514D();
        double dMo3514D3 = abstractC11947zc0.mo3514D();
        double dMo3514D4 = abstractC11947zc0.mo3517U() == 7 ? abstractC11947zc0.mo3514D() : 1.0d;
        if (z) {
            abstractC11947zc0.mo3527o();
        }
        if (dMo3514D <= 1.0d && dMo3514D2 <= 1.0d && dMo3514D3 <= 1.0d) {
            dMo3514D *= 255.0d;
            dMo3514D2 *= 255.0d;
            dMo3514D3 *= 255.0d;
            if (dMo3514D4 <= 1.0d) {
                dMo3514D4 *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) dMo3514D4, (int) dMo3514D, (int) dMo3514D2, (int) dMo3514D3));
    }

    @Override // p000.InterfaceC10378nJ1
    public Object zza() {
        switch (this.f469a) {
            case 26:
                C11304uY1.f43748b.get();
                Boolean bool = (Boolean) HY1.f4347h.m8754a();
                bool.getClass();
                return bool;
            case 27:
                PW1.f9104b.get();
                return Integer.valueOf((int) ((Long) UW1.f11889p.m8754a()).longValue());
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                PW1.f9104b.get();
                Long l = (Long) UW1.f11898y.m8754a();
                l.getClass();
                return l;
            default:
                C9640hY1.f28446b.get();
                Boolean bool2 = (Boolean) C10664pY1.f40202a.m8754a();
                bool2.getClass();
                return bool2;
        }
    }

    public /* synthetic */ C7356Av0(int i, Object obj) {
        this.f469a = i;
    }

    @Override // p000.InterfaceC3987eO
    /* renamed from: j */
    public void mo393j() {
    }

    @Override // p000.InterfaceC10175lk0
    /* renamed from: s */
    public void mo402s() {
    }

    @Override // p000.InterfaceC3987eO
    /* renamed from: f */
    public void mo389f(C0267EE c0267ee) {
    }

    @Override // p000.InterfaceC3987eO
    /* renamed from: l */
    public void mo395l(InterfaceC1345VN interfaceC1345VN) {
    }

    @Override // p000.InterfaceC8088Ox0
    public void onComplete(Throwable th) {
    }

    @Override // p000.InterfaceC3987eO
    /* renamed from: q */
    public void mo400q(C1282UN c1282un) {
    }
}
