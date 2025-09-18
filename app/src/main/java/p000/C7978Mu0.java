package p000;

import android.graphics.Rect;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import android.util.Rational;
import android.view.Surface;
import android.view.View;
import androidx.fragment.app.AbstractC1733o;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC1725g;
import androidx.fragment.app.Fragment;
import com.facebook.react.fabric.ReactNativeConfig;
import com.google.android.gms.tasks.Task;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.lang.ref.WeakReference;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import javax.inject.Provider;

/* renamed from: Mu0 */
/* loaded from: classes.dex */
public final class C7978Mu0 implements InterfaceC1074R4, InterfaceC9305ex0, InterfaceC9968k61, InterfaceC6238jS, DK0, Provider, InterfaceC0570J2, InterfaceC8217Rj1, InterfaceC9200e61, InterfaceC8952cD0, InterfaceC11281uN0 {

    /* renamed from: d */
    public static C7978Mu0 f7389d;

    /* renamed from: f */
    public static C7978Mu0 f7391f;

    /* renamed from: a */
    public final /* synthetic */ int f7392a;

    /* renamed from: b */
    public Object f7393b;

    /* renamed from: c */
    public static final Object f7388c = new Object();

    /* renamed from: e */
    public static final C9728iE1 f7390e = new C9728iE1(1);

    public /* synthetic */ C7978Mu0(int i, Object obj) {
        this.f7392a = i;
        this.f7393b = obj;
    }

    /* renamed from: O */
    public static C9450g32 m5462O(Callable callable) {
        S81 s81 = new S81();
        MM1.f7115a.execute(new RunnableC1420WZ(callable, 24, s81));
        return s81.f10598a;
    }

    /* renamed from: b */
    public static String m5463b(String str, EnumC7140xT enumC7140xT, boolean z) {
        String strConcat = enumC7140xT.f45644a;
        if (z) {
            strConcat = ".temp".concat(strConcat);
        }
        String strReplaceAll = str.replaceAll("\\W+", "");
        int length = 242 - strConcat.length();
        if (strReplaceAll.length() > length) {
            try {
                byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(strReplaceAll.getBytes());
                StringBuilder sb = new StringBuilder();
                for (byte b : bArrDigest) {
                    sb.append(String.format("%02x", Byte.valueOf(b)));
                }
                strReplaceAll = sb.toString();
            } catch (NoSuchAlgorithmException unused) {
                strReplaceAll = strReplaceAll.substring(0, length);
            }
        }
        return AbstractC7222ym.m26234k("lottie_cache_", strReplaceAll, strConcat);
    }

    /* renamed from: f */
    public static C7978Mu0 m5464f() {
        C7978Mu0 c7978Mu0;
        synchronized (f7388c) {
            try {
                if (f7389d == null) {
                    HandlerThread handlerThread = new HandlerThread("MLHandler", 9);
                    handlerThread.start();
                    f7389d = new C7978Mu0(handlerThread.getLooper());
                }
                c7978Mu0 = f7389d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c7978Mu0;
    }

    /* renamed from: i */
    public static C7978Mu0 m5465i() {
        if (f7391f == null) {
            if (CC0.f1248g == null) {
                CC0.f1248g = new CC0(2);
            }
            f7391f = new C7978Mu0(25, CC0.f1248g);
        }
        return f7391f;
    }

    @Override // p000.InterfaceC6854sw
    /* renamed from: A */
    public /* synthetic */ Set mo4787A(C0480Hc c0480Hc) {
        return AbstractC11153tN0.m24892d(this, c0480Hc);
    }

    @Override // p000.InterfaceC6854sw
    /* renamed from: F */
    public /* synthetic */ Object mo4788F(C0480Hc c0480Hc, EnumC6791rw enumC6791rw) {
        return AbstractC11153tN0.m24899k(this, c0480Hc, enumC6791rw);
    }

    @Override // p000.InterfaceC9200e61
    /* renamed from: G */
    public int mo4559G() {
        return 2;
    }

    /* renamed from: I */
    public File m5466I() {
        C8158Qg0 c8158Qg0 = (C8158Qg0) this.f7393b;
        c8158Qg0.getClass();
        File file = new File(c8158Qg0.f9725a.getCacheDir(), "lottie_network_cache");
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* renamed from: J */
    public synchronized void m5467J(C10338n10 c10338n10) {
        c10338n10.f38042b = null;
        c10338n10.f38043c = null;
        ((ArrayDeque) this.f7393b).offer(c10338n10);
    }

    @Override // p000.InterfaceC6854sw
    /* renamed from: L */
    public /* synthetic */ void mo4789L(InterfaceC6711qw interfaceC6711qw) {
        AbstractC11153tN0.m24890b(this, interfaceC6711qw);
    }

    @Override // p000.InterfaceC1074R4
    /* renamed from: M0 */
    public AbstractC6378lg mo4553M0() {
        ArrayList arrayList = (ArrayList) this.f7393b;
        return ((C10551og0) arrayList.get(0)).m23519c() ? new R10(arrayList, 1) : new C11127tA0(arrayList);
    }

    /* renamed from: P */
    public File m5468P(String str, InputStream inputStream, EnumC7140xT enumC7140xT) throws IOException {
        File file = new File(m5466I(), m5463b(str, enumC7140xT, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i = inputStream.read(bArr);
                    if (i == -1) {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        return file;
                    }
                    fileOutputStream.write(bArr, 0, i);
                }
            } catch (Throwable th) {
                fileOutputStream.close();
                throw th;
            }
        } finally {
            inputStream.close();
        }
    }

    @Override // p000.InterfaceC6854sw
    /* renamed from: Q */
    public /* synthetic */ boolean mo4790Q(C0480Hc c0480Hc) {
        return AbstractC11153tN0.m24889a(this, c0480Hc);
    }

    @Override // p000.InterfaceC1074R4
    /* renamed from: V0 */
    public List mo5469V0() {
        return (ArrayList) this.f7393b;
    }

    @Override // p000.InterfaceC1074R4
    /* renamed from: Z0 */
    public boolean mo5470Z0() {
        ArrayList arrayList = (ArrayList) this.f7393b;
        return arrayList.size() == 1 && ((C10551og0) arrayList.get(0)).m23519c();
    }

    /* renamed from: a */
    public void m5471a(String str, Throwable th) {
        O90.m5968f(str, "message");
        m5475l(EnumC10561ol0.f39226e, str, th);
    }

    /* renamed from: c */
    public File m5472c(String str) {
        File file = new File(m5466I(), m5463b(str, EnumC7140xT.JSON, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(m5466I(), m5463b(str, EnumC7140xT.ZIP, false));
        if (file2.exists()) {
            return file2;
        }
        File file3 = new File(m5466I(), m5463b(str, EnumC7140xT.GZIP, false));
        if (file3.exists()) {
            return file3;
        }
        return null;
    }

    @Override // p000.InterfaceC6238jS
    public Object create() {
        C1356VY c1356vy = (C1356VY) this.f7393b;
        return new RunnableC0895OD((C0214DO) c1356vy.f12612c, (C8539Xo1) c1356vy.f12613d);
    }

    @Override // p000.InterfaceC9200e61
    /* renamed from: d */
    public /* synthetic */ void mo4560d() {
    }

    @Override // p000.InterfaceC6854sw
    /* renamed from: d0 */
    public /* synthetic */ EnumC6791rw mo4791d0(C0480Hc c0480Hc) {
        return AbstractC11153tN0.m24891c(this, c0480Hc);
    }

    @Override // p000.InterfaceC8217Rj1
    /* renamed from: e */
    public void mo5473e() {
        C9161dp0 c9161dp0 = (C9161dp0) this.f7393b;
        YN1.m9283h(c9161dp0.f26298d2);
        Surface surface = c9161dp0.f26298d2;
        C8165Qj1 c8165Qj1 = c9161dp0.f26287S1;
        Handler handler = (Handler) c8165Qj1.f9756a;
        if (handler != null) {
            handler.post(new RunnableC9844j81(c8165Qj1, surface, SystemClock.elapsedRealtime(), 1));
        }
        c9161dp0.f26301g2 = true;
    }

    @Override // p000.InterfaceC9200e61
    /* renamed from: g */
    public /* synthetic */ U51 mo4561g(byte[] bArr, int i, int i2) {
        return AbstractC11153tN0.m24896h(this, bArr, i2);
    }

    @Override // javax.inject.Provider
    public Object get() {
        InterfaceC1478XU interfaceC1478XU = (InterfaceC1478XU) ((C8071Oo1) this.f7393b).f8628b;
        AbstractC8971cM1.m10691d(interfaceC1478XU);
        return interfaceC1478XU;
    }

    @Override // p000.InterfaceC11281uN0
    public InterfaceC6854sw getConfig() {
        return (C7882Ky0) this.f7393b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.InterfaceC8952cD0
    /* renamed from: h */
    public void mo5474h(Z61 z61) {
        C8941c71 c8941c71;
        if (!DV1.m1718c()) {
            AbstractC3982eJ.m17901c(((C10237mD0) this.f7393b).getContext()).execute(new RunnableC1096RQ(this, 24, z61));
            return;
        }
        AbstractC7806Jm0.m4412f("PreviewView");
        InterfaceC6972uo interfaceC6972uo = z61.f14741e;
        ((C10237mD0) this.f7393b).f37560i = interfaceC6972uo.mo1341o();
        C10365nD0 c10365nD0 = ((C10237mD0) this.f7393b).f37559h;
        Rect rectMo905P = interfaceC6972uo.mo1333g().mo905P();
        c10365nD0.getClass();
        c10365nD0.f8094a = new Rational(rectMo905P.width(), rectMo905P.height());
        synchronized (c10365nD0) {
            c10365nD0.f38183c = rectMo905P;
        }
        z61.m9492c(AbstractC3982eJ.m17901c(((C10237mD0) this.f7393b).getContext()), new C4224i9(this, interfaceC6972uo, z61, 13));
        C10237mD0 c10237mD0 = (C10237mD0) this.f7393b;
        AbstractC9559gw0 abstractC9559gw0 = c10237mD0.f37553b;
        EnumC9853jD0 enumC9853jD0 = c10237mD0.f37552a;
        if (!(abstractC9559gw0 instanceof C8941c71) || C10237mD0.m22703b(z61, enumC9853jD0)) {
            C10237mD0 c10237mD02 = (C10237mD0) this.f7393b;
            if (C10237mD0.m22703b(z61, c10237mD02.f37552a)) {
                C10237mD0 c10237mD03 = (C10237mD0) this.f7393b;
                Q91 q91 = new Q91(c10237mD03, c10237mD03.f37555d);
                q91.f9508i = false;
                q91.f9510k = new AtomicReference();
                c8941c71 = q91;
            } else {
                C10237mD0 c10237mD04 = (C10237mD0) this.f7393b;
                c8941c71 = new C8941c71(c10237mD04, c10237mD04.f37555d);
            }
            c10237mD02.f37553b = c8941c71;
        }
        InterfaceC6766ro interfaceC6766roMo1341o = interfaceC6972uo.mo1341o();
        C10237mD0 c10237mD05 = (C10237mD0) this.f7393b;
        C9597hD0 c9597hD0 = new C9597hD0(interfaceC6766roMo1341o, c10237mD05.f37557f, c10237mD05.f37553b);
        ((C10237mD0) this.f7393b).f37558g.set(c9597hD0);
        interfaceC6972uo.mo1327a().mo1479a(AbstractC3982eJ.m17901c(((C10237mD0) this.f7393b).getContext()), c9597hD0);
        ((C10237mD0) this.f7393b).f37553b.mo6592i(z61, new C4224i9(this, c9597hD0, interfaceC6972uo, 14));
        C10237mD0 c10237mD06 = (C10237mD0) this.f7393b;
        if (c10237mD06.indexOfChild(c10237mD06.f37554c) == -1) {
            C10237mD0 c10237mD07 = (C10237mD0) this.f7393b;
            c10237mD07.addView(c10237mD07.f37554c);
        }
        ((C10237mD0) this.f7393b).getClass();
    }

    /* renamed from: l */
    public void m5475l(EnumC10561ol0 enumC10561ol0, String str, Throwable th) {
        EnumC10561ol0.f39223b.getClass();
        if (C6914tt.m25027v(enumC10561ol0) >= 4) {
            Iterator it = ((List) this.f7393b).iterator();
            while (it.hasNext()) {
                ((C8034Nw0) it.next()).getClass();
                O90.m5968f(str, "message");
                if (AbstractC8086Ow0.f8692a) {
                    EnumC10561ol0.f39223b.getClass();
                    C6914tt.m25027v(enumC10561ol0);
                } else {
                    String strM24914z = AbstractC11153tN0.m24914z(new StringBuilder("["), enumC10561ol0.f39228a, "] ExpoModulesCore\t", str);
                    PrintStream printStream = System.out;
                    printStream.println((Object) strM24914z);
                    if (th != null) {
                        printStream.println((Object) (th.getLocalizedMessage() + "\n" + I02.m3691e(th)));
                    }
                }
            }
        }
    }

    @Override // p000.InterfaceC9200e61
    /* renamed from: m */
    public void mo4562m(byte[] bArr, int i, int i2, C9072d61 c9072d61, InterfaceC6587oy interfaceC6587oy) {
        C6933uB c6933uBM24850a;
        C9591hA0 c9591hA0 = (C9591hA0) this.f7393b;
        c9591hA0.m18739E(i + i2, bArr);
        c9591hA0.m18741G(i);
        ArrayList arrayList = new ArrayList();
        while (c9591hA0.m18743a() > 0) {
            YN1.m9277b("Incomplete Mp4Webvtt Top Level box header found.", c9591hA0.m18743a() >= 8);
            int iM18749g = c9591hA0.m18749g();
            if (c9591hA0.m18749g() == 1987343459) {
                int i3 = iM18749g - 8;
                CharSequence charSequenceM23227f = null;
                C6870tB c6870tBM22968a = null;
                while (i3 > 0) {
                    YN1.m9277b("Incomplete vtt cue box header found.", i3 >= 8);
                    int iM18749g2 = c9591hA0.m18749g();
                    int iM18749g3 = c9591hA0.m18749g();
                    int i4 = iM18749g2 - 8;
                    byte[] bArr2 = c9591hA0.f28293a;
                    int i5 = c9591hA0.f28294b;
                    int i6 = AbstractC7485Dh1.f2166a;
                    String str = new String(bArr2, i5, i4, AbstractC7227yr.f46511c);
                    c9591hA0.m18742H(i4);
                    i3 = (i3 - 8) - i4;
                    if (iM18749g3 == 1937011815) {
                        C10310mn1 c10310mn1 = new C10310mn1();
                        AbstractC10438nn1.m23226e(str, c10310mn1);
                        c6870tBM22968a = c10310mn1.m22968a();
                    } else if (iM18749g3 == 1885436268) {
                        charSequenceM23227f = AbstractC10438nn1.m23227f(Collections.emptyList(), null, str.trim());
                    }
                }
                if (charSequenceM23227f == null) {
                    charSequenceM23227f = "";
                }
                if (c6870tBM22968a != null) {
                    c6870tBM22968a.f42901a = charSequenceM23227f;
                    c6933uBM24850a = c6870tBM22968a.m24850a();
                } else {
                    Pattern pattern = AbstractC10438nn1.f38508a;
                    C10310mn1 c10310mn12 = new C10310mn1();
                    c10310mn12.f37922c = charSequenceM23227f;
                    c6933uBM24850a = c10310mn12.m22968a().m24850a();
                }
                arrayList.add(c6933uBM24850a);
            } else {
                c9591hA0.m18742H(iM18749g - 8);
            }
        }
        interfaceC6587oy.mo4000b(new C7122xB(arrayList, -9223372036854775807L, -9223372036854775807L));
    }

    @Override // p000.InterfaceC0570J2
    public void onActivityResult(Object obj) {
        C0507I2 c0507i2 = (C0507I2) obj;
        AbstractC1733o abstractC1733o = (AbstractC1733o) this.f7393b;
        C4123gY c4123gY = (C4123gY) abstractC1733o.f16202C.pollFirst();
        if (c4123gY == null) {
            return;
        }
        Fragment fragmentM10109c = abstractC1733o.f16215c.m10109c(c4123gY.f27831a);
        if (fragmentM10109c == null) {
            return;
        }
        fragmentM10109c.onActivityResult(c4123gY.f27832b, c0507i2.f4659a, c0507i2.f4660b);
    }

    @Override // p000.InterfaceC6854sw
    /* renamed from: q */
    public /* synthetic */ Object mo4792q(C0480Hc c0480Hc, Object obj) {
        return AbstractC11153tN0.m24898j(this, c0480Hc, obj);
    }

    @Override // p000.InterfaceC9305ex0
    /* renamed from: r0 */
    public void mo505r0(Object obj) {
        switch (this.f7392a) {
            case 5:
                if (((Boolean) obj).booleanValue()) {
                    C0359Fh c0359Fh = (C0359Fh) this.f7393b;
                    c0359Fh.m2739r(1);
                    c0359Fh.dismiss();
                    C0988Ph c0988Ph = c0359Fh.f3389b;
                    if (c0988Ph.f9247x == null) {
                        c0988Ph.f9247x = new C7560Et0();
                    }
                    C0988Ph.m6411i(c0988Ph.f9247x, Boolean.FALSE);
                    return;
                }
                return;
            default:
                if (((InterfaceC7902Li0) obj) != null) {
                    DialogInterfaceOnCancelListenerC1725g dialogInterfaceOnCancelListenerC1725g = (DialogInterfaceOnCancelListenerC1725g) this.f7393b;
                    if (dialogInterfaceOnCancelListenerC1725g.mShowsDialog) {
                        View viewRequireView = dialogInterfaceOnCancelListenerC1725g.requireView();
                        if (viewRequireView.getParent() != null) {
                            throw new IllegalStateException("DialogFragment can not be attached to a container view");
                        }
                        if (dialogInterfaceOnCancelListenerC1725g.mDialog != null) {
                            if (Log.isLoggable("FragmentManager", 3)) {
                                Objects.toString(dialogInterfaceOnCancelListenerC1725g.mDialog);
                            }
                            dialogInterfaceOnCancelListenerC1725g.mDialog.setContentView(viewRequireView);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // p000.InterfaceC9968k61
    public Task then(Object obj) {
        if (((BZ0) obj) == null) {
            return AbstractC9376fU1.m18244e(null);
        }
        C4238iN c4238iN = (C4238iN) this.f7393b;
        C6409mA.m22692a((C6409mA) c4238iN.f29114c);
        C6409mA c6409mA = (C6409mA) c4238iN.f29114c;
        ((C1002Pv) c6409mA.f37539m).m6481A((ExecutorC1584ZA) ((C10910rT1) c6409mA.f37531e).f41678b, null);
        ((S81) c6409mA.f37543q).m7186d(null);
        return AbstractC9376fU1.m18244e(null);
    }

    @Override // p000.InterfaceC6854sw
    /* renamed from: u */
    public /* synthetic */ Set mo4793u() {
        return AbstractC11153tN0.m24895g(this);
    }

    @Override // p000.InterfaceC8217Rj1
    /* renamed from: v */
    public void mo5476v() {
        ((C9161dp0) this.f7393b).m17754G0(0, 1);
    }

    @Override // p000.InterfaceC6854sw
    /* renamed from: w */
    public /* synthetic */ Object mo4794w(C0480Hc c0480Hc) {
        return AbstractC11153tN0.m24897i(this, c0480Hc);
    }

    public C7978Mu0(int i) {
        WG1 wg1;
        this.f7392a = i;
        switch (i) {
            case 6:
                char[] cArr = AbstractC7381Bh1.f976a;
                this.f7393b = new ArrayDeque(0);
                break;
            case 8:
                TimeUnit timeUnit = TimeUnit.MINUTES;
                O90.m5968f(timeUnit, "timeUnit");
                this.f7393b = new C0974PT(C8817b91.f16828h, timeUnit);
                break;
            case 10:
                this.f7393b = new HashSet();
                break;
            case 22:
                this.f7393b = new C9591hA0();
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                break;
            default:
                try {
                    wg1 = (WG1) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
                } catch (Exception unused) {
                    wg1 = f7390e;
                }
                C11012sG1 c11012sG1 = new C11012sG1(C9728iE1.f28975b, wg1);
                Charset charset = AbstractC9090dF1.f25904a;
                this.f7393b = c11012sG1;
                break;
        }
    }

    public C7978Mu0(Looper looper) {
        this.f7392a = 1;
        HandlerC11145tJ0 handlerC11145tJ0 = new HandlerC11145tJ0(looper, 2);
        Looper.getMainLooper();
        this.f7393b = handlerC11145tJ0;
    }

    public C7978Mu0(C9565gz0 c9565gz0, EnumC8319Ti1 enumC8319Ti1) {
        this.f7392a = 26;
        this.f7393b = c9565gz0;
    }

    public C7978Mu0(C9465gB0 c9465gB0) {
        this.f7392a = 23;
        this.f7393b = c9465gB0;
        c9465gB0.f9924y = false;
    }

    public C7978Mu0(C1271UC c1271uc) {
        this.f7392a = 18;
        this.f7393b = Collections.unmodifiableMap(new HashMap(c1271uc.f11684a));
    }

    public C7978Mu0(NV1 nv1) {
        this.f7392a = 7;
        this.f7393b = new G10(8, nv1);
    }

    public C7978Mu0(WeakReference weakReference, QL0 ql0) {
        this.f7392a = 15;
        ReactNativeConfig reactNativeConfig = ReactNativeConfig.DEFAULT_CONFIG;
        new ArrayList();
        O90.m5968f(ql0, "reactNativeHostWrapper");
        O90.m5968f(reactNativeConfig, "reactNativeConfig");
        this.f7393b = reactNativeConfig;
    }
}
