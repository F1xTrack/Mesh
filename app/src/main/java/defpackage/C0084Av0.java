package defpackage;

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
import com.vk.push.core.filedatastore.JsonDeserializer;
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
public final class C0084Av0 implements InterfaceC1836Xh1, InterfaceC0940Lv, InterfaceC1651Uy, QR0, InterfaceC7668vn, InterfaceC1490Sw0, InterfaceC3571eO, Provider, InterfaceC1856Xo0, InterfaceC5751lk0, InterfaceC6842rS0, InterfaceC1181Ox0, JsonDeserializer, InterfaceC6053nJ1 {
    public static C0084Av0 b;
    public static final C0084Av0 c = new C0084Av0(1);
    public static final C0084Av0 d = new C0084Av0(2);
    public static final C0084Av0 e = new C0084Av0(3);
    public static final C0084Av0 f = new C0084Av0(4);
    public static final /* synthetic */ C0084Av0 g = new C0084Av0(6);
    public static final C0084Av0 h = new C0084Av0(7);
    public final /* synthetic */ int a;

    public /* synthetic */ C0084Av0(int i) {
        this.a = i;
    }

    public static EnumC1106Ny0 A(int i) {
        return (45 > i || i >= 136) ? (135 > i || i >= 226) ? (225 > i || i >= 316) ? EnumC1106Ny0.c : EnumC1106Ny0.d : EnumC1106Ny0.e : EnumC1106Ny0.f;
    }

    public static EnumC1106Ny0 B(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? EnumC1106Ny0.c : EnumC1106Ny0.f : EnumC1106Ny0.e : EnumC1106Ny0.d : EnumC1106Ny0.c;
    }

    public static LinkedHashSet C(String str, String... strArr) {
        O90.f(str, "internalName");
        O90.f(strArr, "signatures");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str2 : strArr) {
            linkedHashSet.add(str + '.' + str2);
        }
        return linkedHashSet;
    }

    public static LinkedHashSet D(String str, String... strArr) {
        O90.f(strArr, "signatures");
        return C("java/lang/".concat(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static LinkedHashSet E(String str, String... strArr) {
        return C("java/util/".concat(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static boolean F(int i, int i2, String str) {
        int i3 = i + 2;
        return i3 < i2 && str.charAt(i) == '%' && AbstractC0199Ch1.s(str.charAt(i + 1)) != -1 && AbstractC0199Ch1.s(str.charAt(i3)) != -1;
    }

    public static String H(String str, int i, boolean z, int i2, int i3) {
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
        O90.f(str, "<this>");
        int iCharCount = i;
        while (iCharCount < i2) {
            char cCharAt = str.charAt(iCharCount);
            if (cCharAt == '%' || (cCharAt == '+' && z)) {
                C6129nj c6129nj = new C6129nj();
                c6129nj.w0(i, iCharCount, str);
                while (iCharCount < i2) {
                    int iCodePointAt = str.codePointAt(iCharCount);
                    if (iCodePointAt == 37 && (i4 = iCharCount + 2) < i2) {
                        int iS = AbstractC0199Ch1.s(str.charAt(iCharCount + 1));
                        int iS2 = AbstractC0199Ch1.s(str.charAt(i4));
                        if (iS == -1 || iS2 == -1) {
                            c6129nj.y0(iCodePointAt);
                            iCharCount += Character.charCount(iCodePointAt);
                        } else {
                            c6129nj.r0((iS << 4) + iS2);
                            iCharCount = Character.charCount(iCodePointAt) + i4;
                        }
                    } else if (iCodePointAt == 43 && z) {
                        c6129nj.r0(32);
                        iCharCount++;
                    } else {
                        c6129nj.y0(iCodePointAt);
                        iCharCount += Character.charCount(iCodePointAt);
                    }
                }
                return c6129nj.e0();
            }
            iCharCount++;
        }
        String strSubstring = str.substring(i, i2);
        O90.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static ArrayList I(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int iZ = AbstractC7538v51.z(str, '&', i, false, 4);
            if (iZ == -1) {
                iZ = str.length();
            }
            int iZ2 = AbstractC7538v51.z(str, '=', i, false, 4);
            if (iZ2 == -1 || iZ2 > iZ) {
                String strSubstring = str.substring(i, iZ);
                O90.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(strSubstring);
                arrayList.add(null);
            } else {
                String strSubstring2 = str.substring(i, iZ2);
                O90.e(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(strSubstring2);
                String strSubstring3 = str.substring(iZ2 + 1, iZ);
                O90.e(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(strSubstring3);
            }
            i = iZ + 1;
        }
        return arrayList;
    }

    public static void J(ArrayList arrayList, StringBuilder sb) {
        O90.f(arrayList, "<this>");
        C3527e90 c3527e90G = AbstractC5686lO1.g(AbstractC5686lO1.h(0, arrayList.size()), 2);
        int i = c3527e90G.a;
        int i2 = c3527e90G.b;
        int i3 = c3527e90G.c;
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

    public static String v(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, int i3) {
        int i4 = (i3 & 1) != 0 ? 0 : i;
        int length = (i3 & 2) != 0 ? str.length() : i2;
        boolean z5 = (i3 & 8) != 0 ? false : z;
        boolean z6 = (i3 & 16) != 0 ? false : z2;
        boolean z7 = (i3 & 32) != 0 ? false : z3;
        boolean z8 = (i3 & 64) == 0 ? z4 : false;
        O90.f(str, "<this>");
        int iCharCount = i4;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            int i5 = 32;
            int i6 = 128;
            if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z8) || AbstractC7538v51.q(str2, (char) iCodePointAt) || ((iCodePointAt == 37 && (!z5 || (z6 && !F(iCharCount, length, str)))) || (iCodePointAt == 43 && z7)))) {
                C6129nj c6129nj = new C6129nj();
                c6129nj.w0(i4, iCharCount, str);
                C6129nj c6129nj2 = null;
                while (iCharCount < length) {
                    int iCodePointAt2 = str.codePointAt(iCharCount);
                    if (!z5 || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                        if (iCodePointAt2 == 43 && z7) {
                            c6129nj.x0(z5 ? "+" : "%2B");
                        } else if (iCodePointAt2 < i5 || iCodePointAt2 == 127 || ((iCodePointAt2 >= i6 && !z8) || AbstractC7538v51.q(str2, (char) iCodePointAt2) || (iCodePointAt2 == 37 && (!z5 || (z6 && !F(iCharCount, length, str)))))) {
                            if (c6129nj2 == null) {
                                c6129nj2 = new C6129nj();
                            }
                            c6129nj2.y0(iCodePointAt2);
                            while (!c6129nj2.w()) {
                                byte bJ = c6129nj2.J();
                                c6129nj.r0(37);
                                char[] cArr = D40.j;
                                c6129nj.r0(cArr[((bJ & 255) >> 4) & 15]);
                                c6129nj.r0(cArr[bJ & 15]);
                            }
                        } else {
                            c6129nj.y0(iCodePointAt2);
                        }
                    }
                    iCharCount += Character.charCount(iCodePointAt2);
                    i5 = 32;
                    i6 = 128;
                }
                return c6129nj.e0();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        String strSubstring = str.substring(i4, length);
        O90.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static String[] y(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add("<init>(" + str + ")V");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public synchronized void G() {
        SoLoader.j("react_newarchdefaults");
        try {
            SoLoader.j("appmodules");
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    @Override // defpackage.InterfaceC7668vn
    public /* synthetic */ void a(C6263oQ c6263oQ) {
        AbstractC8235ym.a(this, c6263oQ);
    }

    @Override // defpackage.InterfaceC7668vn
    public C6974s81 b() {
        return C6974s81.b;
    }

    @Override // defpackage.InterfaceC1490Sw0
    public Object c() {
        return new ArrayDeque();
    }

    @Override // defpackage.InterfaceC1856Xo0
    public MediaCodecInfo d(int i) {
        return MediaCodecList.getCodecInfoAt(i);
    }

    @Override // defpackage.InterfaceC5751lk0
    public void e() {
        synchronized (II1.a) {
            Object obj = II1.b;
            synchronized (obj) {
                if (II1.c) {
                    return;
                }
                long jA = II1.a();
                synchronized (obj) {
                    II1.d = jA;
                    II1.c = true;
                }
            }
        }
    }

    @Override // com.vk.push.core.filedatastore.JsonDeserializer
    public Object fromJson(JSONObject jSONObject) {
        O90.f(jSONObject, "<this>");
        return new C1332Qv1(jSONObject.optInt("notification_id_key"));
    }

    @Override // defpackage.InterfaceC0940Lv
    public Object g(C1241Pr0 c1241Pr0) {
        Object objH = c1241Pr0.h(new C6997sG0(InterfaceC1370Ri0.class, Executor.class));
        O90.e(objH, "c.get(Qualified.qualifie…a, Executor::class.java))");
        return N02.e((Executor) objH);
    }

    @Override // javax.inject.Provider
    public Object get() {
        SessionManager sessionManager = SessionManager.getInstance();
        AbstractC2501cM1.d(sessionManager);
        return sessionManager;
    }

    @Override // defpackage.InterfaceC7668vn
    public long getTimestamp() {
        return -1L;
    }

    @Override // defpackage.InterfaceC7668vn
    public EnumC7286tn h() {
        return EnumC7286tn.a;
    }

    @Override // defpackage.InterfaceC7668vn
    public int i() {
        return 1;
    }

    @Override // defpackage.InterfaceC1856Xo0
    public boolean k(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && "video/avc".equals(str2);
    }

    @Override // defpackage.InterfaceC1856Xo0
    public boolean m(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override // defpackage.InterfaceC2315bO
    public boolean n(Object obj, File file, C0795Jy0 c0795Jy0) throws Throwable {
        try {
            AbstractC7659vk.d(((C2582cn1) ((C1773Wm1) ((InterfaceC5506kS0) obj).get()).a.b).a.a.asReadOnlyBuffer(), file);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // defpackage.InterfaceC7668vn
    public EnumC6904rn o() {
        return EnumC6904rn.a;
    }

    @Override // defpackage.QR0
    public /* synthetic */ void onCaptureBufferLost(RR0 rr0, long j, int i) {
    }

    @Override // defpackage.QR0
    public /* synthetic */ void onCaptureCompleted(RR0 rr0, InterfaceC7668vn interfaceC7668vn) {
    }

    @Override // defpackage.QR0
    public /* synthetic */ void onCaptureFailed(RR0 rr0, C6714qn c6714qn) {
    }

    @Override // defpackage.QR0
    public /* synthetic */ void onCaptureProgressed(RR0 rr0, InterfaceC7668vn interfaceC7668vn) {
    }

    @Override // defpackage.QR0
    public /* synthetic */ void onCaptureSequenceAborted(int i) {
    }

    @Override // defpackage.QR0
    public /* synthetic */ void onCaptureSequenceCompleted(int i, long j) {
    }

    @Override // defpackage.QR0
    public /* synthetic */ void onCaptureStarted(RR0 rr0, long j, long j2) {
    }

    @Override // defpackage.InterfaceC1856Xo0
    public int p() {
        return MediaCodecList.getCodecCount();
    }

    @Override // defpackage.InterfaceC6842rS0
    public int r(C0795Jy0 c0795Jy0) {
        return 1;
    }

    @Override // defpackage.InterfaceC7668vn
    public CaptureResult t() {
        return null;
    }

    @Override // defpackage.InterfaceC1651Uy
    public Object then(Task task) {
        Intent intent = (Intent) ((Bundle) task.i()).getParcelable("notification_data");
        if (intent != null) {
            return new C0389Et(intent);
        }
        return null;
    }

    @Override // defpackage.InterfaceC7668vn
    public EnumC7095sn u() {
        return EnumC7095sn.a;
    }

    @Override // defpackage.InterfaceC1856Xo0
    public boolean w() {
        return false;
    }

    public void x(InterfaceC3762fO interfaceC3762fO) {
        interfaceC3762fO.a(C6566q02.class, C4352iT1.a);
        interfaceC3762fO.a(E22.class, PX1.a);
        interfaceC3762fO.a(AbstractC6756r02.class, C5510kT1.a);
        interfaceC3762fO.a(AbstractC7329u02.class, C6083nT1.a);
        interfaceC3762fO.a(AbstractC6947s02.class, C5701lT1.a);
        interfaceC3762fO.a(AbstractC7138t02.class, C6274oT1.a);
        interfaceC3762fO.a(AbstractC7818wZ1.class, C5886mR1.a);
        interfaceC3762fO.a(AbstractC7437uZ1.class, C5695lR1.a);
        interfaceC3762fO.a(ZZ1.class, CS1.a);
        interfaceC3762fO.a(AbstractC6001n22.class, VW1.a);
        interfaceC3762fO.a(AbstractC6864rZ1.class, C5313jR1.a);
        interfaceC3762fO.a(AbstractC6292oZ1.class, C3773fR1.a);
        interfaceC3762fO.a(AbstractC5615l12.class, C5325jV1.a);
        interfaceC3762fO.a(AbstractC4083h32.class, C4349iS1.a);
        interfaceC3762fO.a(VZ1.class, C6462pS1.a);
        interfaceC3762fO.a(RZ1.class, C3395dS1.a);
        interfaceC3762fO.a(AbstractC5997n12.class, C5707lV1.a);
        interfaceC3762fO.a(AbstractC5428k22.class, NW1.a);
        interfaceC3762fO.a(AbstractC5619l22.class, QW1.a);
        interfaceC3762fO.a(AbstractC5237j22.class, LW1.a);
        interfaceC3762fO.a(B02.class, JT1.a);
        interfaceC3762fO.a(Y22.class, C2323bQ1.a);
        interfaceC3762fO.a(C02.class, LT1.a);
        interfaceC3762fO.a(A12.class, C8376zV1.a);
        interfaceC3762fO.a(D12.class, GV1.a);
        interfaceC3762fO.a(C12.class, EV1.a);
        interfaceC3762fO.a(B12.class, CV1.a);
        interfaceC3762fO.a(M12.class, C5328jW1.a);
        interfaceC3762fO.a(N12.class, C5519kW1.a);
        interfaceC3762fO.a(P12.class, C6092nW1.a);
        interfaceC3762fO.a(O12.class, C5901mW1.a);
        interfaceC3762fO.a(AbstractC7901x02.class, IT1.a);
        interfaceC3762fO.a(Q12.class, C6283oW1.a);
        interfaceC3762fO.a(R12.class, C6474pW1.a);
        interfaceC3762fO.a(S12.class, C6665qW1.a);
        interfaceC3762fO.a(T12.class, C7046sW1.a);
        interfaceC3762fO.a(AbstractC3316d22.class, C7809wW1.a);
        interfaceC3762fO.a(AbstractC2440c22.class, C7999xW1.a);
        interfaceC3762fO.a(L12.class, QV1.a);
        interfaceC3762fO.a(C6698qh1.class, TS1.a);
        interfaceC3762fO.a(J12.class, C3979gW1.a);
        interfaceC3762fO.a(I12.class, UV1.a);
        interfaceC3762fO.a(K12.class, C4361iW1.a);
        interfaceC3762fO.a(AbstractC5810m22.class, SW1.a);
        interfaceC3762fO.a(K22.class, C3794fY1.a);
        interfaceC3762fO.a(MY1.class, C7791wQ1.a);
        interfaceC3762fO.a(IY1.class, C5310jQ1.a);
        interfaceC3762fO.a(GY1.class, C3770fQ1.a);
        interfaceC3762fO.a(KY1.class, C7219tQ1.a);
        interfaceC3762fO.a(RY1.class, DQ1.a);
        interfaceC3762fO.a(OY1.class, C7981xQ1.a);
        interfaceC3762fO.a(UY1.class, FQ1.a);
        interfaceC3762fO.a(WY1.class, GQ1.a);
        interfaceC3762fO.a(YY1.class, LQ1.a);
        interfaceC3762fO.a(AbstractC2350bZ1.class, PQ1.a);
        interfaceC3762fO.a(AbstractC3606eZ1.class, QQ1.a);
        interfaceC3762fO.a(YM1.class, PP1.a);
        interfaceC3762fO.a(AbstractC4334iN1.class, WP1.a);
        interfaceC3762fO.a(AbstractC2123aN1.class, SP1.a);
        interfaceC3762fO.a(AbstractC2242b02.class, MS1.a);
        interfaceC3762fO.a(AbstractC8198yZ1.class, C6650qR1.a);
        interfaceC3762fO.a(JI1.class, C6065nN1.a);
        interfaceC3762fO.a(II1.class, C7019sN1.a);
        interfaceC3762fO.a(PZ1.class, YR1.a);
        interfaceC3762fO.a(SI1.class, C7401uN1.a);
        interfaceC3762fO.a(QI1.class, BN1.a);
        interfaceC3762fO.a(AbstractC3755fL1.class, C6641qO1.a);
        interfaceC3762fO.a(AbstractC7963xK1.class, C7213tO1.a);
        interfaceC3762fO.a(C5289jJ1.class, CN1.a);
        interfaceC3762fO.a(C2492cJ1.class, GN1.a);
        interfaceC3762fO.a(BL1.class, SO1.a);
        interfaceC3762fO.a(AbstractC8156yL1.class, XO1.a);
        interfaceC3762fO.a(QL1.class, C4149hP1.a);
        interfaceC3762fO.a(ML1.class, C4340iP1.a);
        interfaceC3762fO.a(XM1.class, LP1.a);
        interfaceC3762fO.a(RM1.class, MP1.a);
        interfaceC3762fO.a(AbstractC2501cM1.class, C5498kP1.a);
        interfaceC3762fO.a(RL1.class, C6644qP1.a);
        interfaceC3762fO.a(AbstractC3758fM1.class, C6834rP1.a);
        interfaceC3762fO.a(AbstractC3377dM1.class, C7788wP1.a);
        interfaceC3762fO.a(S22.class, C5331jX1.a);
        interfaceC3762fO.a(L22.class, C7031sR1.a);
        interfaceC3762fO.a(P22.class, FT1.a);
        interfaceC3762fO.a(O22.class, CT1.a);
        interfaceC3762fO.a(M22.class, C5316jS1.a);
        interfaceC3762fO.a(R22.class, C2153aX1.a);
        interfaceC3762fO.a(Q22.class, YW1.a);
        interfaceC3762fO.a(T22.class, C5713lX1.a);
        interfaceC3762fO.a(N22.class, GS1.a);
        interfaceC3762fO.a(W22.class, C6098nY1.a);
        interfaceC3762fO.a(V22.class, C6671qY1.a);
        interfaceC3762fO.a(U22.class, C5525kY1.a);
        interfaceC3762fO.a(AbstractC6383p22.class, C6858rX1.a);
        interfaceC3762fO.a(AbstractC2051a02.class, JS1.a);
        interfaceC3762fO.a(AbstractC2432c02.class, YS1.a);
        interfaceC3762fO.a(AbstractC7625vY1.class, C3389dQ1.a);
        interfaceC3762fO.a(WZ1.class, C7034sS1.a);
        interfaceC3762fO.a(C6507ph1.class, PS1.a);
        interfaceC3762fO.a(QZ1.class, C2329bS1.a);
        interfaceC3762fO.a(CZ1.class, C8174yR1.a);
        interfaceC3762fO.a(EZ1.class, CR1.a);
        interfaceC3762fO.a(AZ1.class, C7222tR1.a);
        interfaceC3762fO.a(FZ1.class, IR1.a);
        interfaceC3762fO.a(AbstractC7711w02.class, C8370zT1.a);
        interfaceC3762fO.a(AbstractC7520v02.class, C7610vT1.a);
        interfaceC3762fO.a(EI1.class, C5301jN1.a);
        interfaceC3762fO.a(H22.class, XX1.a);
        interfaceC3762fO.a(J22.class, C2537cY1.a);
        interfaceC3762fO.a(I22.class, ZX1.a);
        interfaceC3762fO.a(AbstractC7243tY1.class, ZP1.a);
        interfaceC3762fO.a(AbstractC5719lZ1.class, C2516cR1.a);
        interfaceC3762fO.a(AbstractC4370iZ1.class, ZQ1.a);
        interfaceC3762fO.a(AbstractC3988gZ1.class, UQ1.a);
        interfaceC3762fO.a(AbstractC3884g12.class, C2338bV1.a);
        interfaceC3762fO.a(AbstractC5233j12.class, C3976gV1.a);
        interfaceC3762fO.a(AbstractC4266i12.class, C3785fV1.a);
        interfaceC3762fO.a(AbstractC7392uK1.class, C3955gO1.a);
        interfaceC3762fO.a(AbstractC7201tK1.class, C5877mO1.a);
        interfaceC3762fO.a(AbstractC6188o12.class, C6089nV1.a);
        interfaceC3762fO.a(AbstractC7715w12.class, C7043sV1.a);
        interfaceC3762fO.a(AbstractC6379p12.class, C6471pV1.a);
        interfaceC3762fO.a(AbstractC6570q12.class, C6662qV1.a);
        interfaceC3762fO.a(AbstractC6441pL1.class, C7975xO1.a);
        interfaceC3762fO.a(AbstractC5486kL1.class, BO1.a);
        interfaceC3762fO.a(AbstractC7337u22.class, DX1.a);
        interfaceC3762fO.a(AbstractC7146t22.class, BX1.a);
        interfaceC3762fO.a(F22.class, SX1.a);
        interfaceC3762fO.a(G22.class, UX1.a);
        interfaceC3762fO.a(E12.class, IV1.a);
        interfaceC3762fO.a(H12.class, OV1.a);
        interfaceC3762fO.a(F12.class, JV1.a);
        interfaceC3762fO.a(G12.class, MV1.a);
        interfaceC3762fO.a(YZ1.class, C8177yS1.a);
        interfaceC3762fO.a(IL1.class, C2129aP1.a);
        interfaceC3762fO.a(FL1.class, C3576eP1.a);
        interfaceC3762fO.a(XZ1.class, C7797wS1.a);
        interfaceC3762fO.a(SZ1.class, C5698lS1.a);
        interfaceC3762fO.a(AbstractC7905x12.class, C7425uV1.a);
        interfaceC3762fO.a(AbstractC8285z12.class, C8186yV1.a);
        interfaceC3762fO.a(AbstractC8095y12.class, C7616vV1.a);
        interfaceC3762fO.a(AbstractC7586vL1.class, FO1.a);
        interfaceC3762fO.a(AbstractC6632qL1.class, GO1.a);
        interfaceC3762fO.a(W02.class, C8373zU1.a);
        interfaceC3762fO.a(X02.class, BU1.a);
        interfaceC3762fO.a(Y02.class, DU1.a);
        interfaceC3762fO.a(NJ1.class, WN1.a);
        interfaceC3762fO.a(IJ1.class, XN1.a);
        interfaceC3762fO.a(S02.class, C6468pU1.a);
        interfaceC3762fO.a(T02.class, C7040sU1.a);
        interfaceC3762fO.a(U02.class, C7993xU1.a);
        interfaceC3762fO.a(DJ1.class, KN1.a);
        interfaceC3762fO.a(CJ1.class, SN1.a);
        interfaceC3762fO.a(Z02.class, FU1.a);
        interfaceC3762fO.a(AbstractC2055a12.class, GU1.a);
        interfaceC3762fO.a(AbstractC2246b12.class, IU1.a);
        interfaceC3762fO.a(AbstractC2436c12.class, QU1.a);
        interfaceC3762fO.a(YJ1.class, ZN1.a);
        interfaceC3762fO.a(UJ1.class, C3764fO1.a);
        interfaceC3762fO.a(AbstractC6764r22.class, C7240tX1.a);
        interfaceC3762fO.a(AbstractC6574q22.class, C7812wX1.a);
        interfaceC3762fO.a(AbstractC3308d02.class, ZS1.a);
        interfaceC3762fO.a(AbstractC3689f02.class, C3779fT1.a);
        interfaceC3762fO.a(AbstractC3498e02.class, C3398dT1.a);
        interfaceC3762fO.a(AbstractC3880g02.class, C4161hT1.a);
        interfaceC3762fO.a(AbstractC3506e22.class, C8379zW1.a);
        interfaceC3762fO.a(AbstractC3697f22.class, CW1.a);
        interfaceC3762fO.a(AbstractC8349zM1.class, DP1.a);
        interfaceC3762fO.a(AbstractC7207tM1.class, EP1.a);
        interfaceC3762fO.a(AbstractC7528v22.class, GX1.a);
        interfaceC3762fO.a(U12.class, C7237tW1.a);
        interfaceC3762fO.a(V12.class, C7428uW1.a);
        interfaceC3762fO.a(AbstractC6062nM1.class, C8168yP1.a);
        interfaceC3762fO.a(AbstractC5871mM1.class, BP1.a);
        interfaceC3762fO.a(AbstractC6955s22.class, C8192yX1.a);
        interfaceC3762fO.a(R02.class, QT1.a);
        interfaceC3762fO.a(Q02.class, C5704lU1.a);
        interfaceC3762fO.a(N02.class, C2525cU1.a);
        interfaceC3762fO.a(I02.class, ZT1.a);
        interfaceC3762fO.a(O02.class, C4164hU1.a);
        interfaceC3762fO.a(P02.class, C5513kU1.a);
        interfaceC3762fO.a(H02.class, YT1.a);
        interfaceC3762fO.a(E02.class, PT1.a);
        interfaceC3762fO.a(G02.class, VT1.a);
        interfaceC3762fO.a(F02.class, UT1.a);
        interfaceC3762fO.a(AbstractC3502e12.class, WU1.a);
        interfaceC3762fO.a(IZ1.class, PR1.a);
        interfaceC3762fO.a(AbstractC3312d12.class, VU1.a);
        interfaceC3762fO.a(AbstractC3693f12.class, ZU1.a);
        interfaceC3762fO.a(HZ1.class, KR1.a);
        interfaceC3762fO.a(OZ1.class, RR1.a);
        interfaceC3762fO.a(AbstractC6192o22.class, C6286oX1.a);
        interfaceC3762fO.a(AbstractC3888g22.class, FW1.a);
        interfaceC3762fO.a(D22.class, NX1.a);
        interfaceC3762fO.a(AbstractC4270i22.class, JW1.a);
        interfaceC3762fO.a(AbstractC4079h22.class, HW1.a);
        interfaceC3762fO.a(AbstractC7719w22.class, IX1.a);
        interfaceC3762fO.a(GM1.class, FP1.a);
        interfaceC3762fO.a(FM1.class, JP1.a);
        interfaceC3762fO.a(AbstractC7909x22.class, LX1.a);
        interfaceC3762fO.a(GZ1.class, JR1.a);
    }

    @Override // defpackage.InterfaceC1836Xh1
    public Object z(AbstractC8396zc0 abstractC8396zc0, float f2) {
        boolean z = abstractC8396zc0.U() == 1;
        if (z) {
            abstractC8396zc0.m();
        }
        double D = abstractC8396zc0.D();
        double D2 = abstractC8396zc0.D();
        double D3 = abstractC8396zc0.D();
        double D4 = abstractC8396zc0.U() == 7 ? abstractC8396zc0.D() : 1.0d;
        if (z) {
            abstractC8396zc0.o();
        }
        if (D <= 1.0d && D2 <= 1.0d && D3 <= 1.0d) {
            D *= 255.0d;
            D2 *= 255.0d;
            D3 *= 255.0d;
            if (D4 <= 1.0d) {
                D4 *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) D4, (int) D, (int) D2, (int) D3));
    }

    @Override // defpackage.InterfaceC6053nJ1
    public Object zza() {
        switch (this.a) {
            case 26:
                C7434uY1.b.get();
                Boolean bool = (Boolean) HY1.h.a();
                bool.getClass();
                return bool;
            case 27:
                PW1.b.get();
                return Integer.valueOf((int) ((Long) UW1.p.a()).longValue());
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                PW1.b.get();
                Long l = (Long) UW1.y.a();
                l.getClass();
                return l;
            default:
                C4176hY1.b.get();
                Boolean bool2 = (Boolean) C6480pY1.a.a();
                bool2.getClass();
                return bool2;
        }
    }

    public /* synthetic */ C0084Av0(int i, Object obj) {
        this.a = i;
    }

    @Override // defpackage.InterfaceC3571eO
    public void j() {
    }

    @Override // defpackage.InterfaceC5751lk0
    public void s() {
    }

    @Override // defpackage.InterfaceC3571eO
    public void f(EE ee) {
    }

    @Override // defpackage.InterfaceC3571eO
    public void l(VN vn) {
    }

    @Override // defpackage.InterfaceC1181Ox0
    public void onComplete(Throwable th) {
    }

    @Override // defpackage.InterfaceC3571eO
    public void q(UN un) {
    }
}
