package defpackage;

import android.graphics.Rect;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import android.util.Rational;
import android.view.Surface;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.g;
import androidx.fragment.app.o;
import com.facebook.react.fabric.ReactNativeConfig;
import com.google.android.gms.tasks.Task;
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
public final class C1016Mu0 implements R4, InterfaceC3677ex0, InterfaceC5441k61, InterfaceC5314jS, DK0, Provider, J2, InterfaceC1374Rj1, InterfaceC3519e61, InterfaceC2473cD0, InterfaceC7400uN0 {
    public static C1016Mu0 d;
    public static C1016Mu0 f;
    public final /* synthetic */ int a;
    public Object b;
    public static final Object c = new Object();
    public static final C4307iE1 e = new C4307iE1(1);

    public /* synthetic */ C1016Mu0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public static C3892g32 O(Callable callable) {
        S81 s81 = new S81();
        MM1.a.execute(new WZ(callable, 24, s81));
        return s81.a;
    }

    public static String b(String str, EnumC7988xT enumC7988xT, boolean z) {
        String strConcat = enumC7988xT.a;
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
        return AbstractC8235ym.k("lottie_cache_", strReplaceAll, strConcat);
    }

    public static C1016Mu0 f() {
        C1016Mu0 c1016Mu0;
        synchronized (c) {
            try {
                if (d == null) {
                    HandlerThread handlerThread = new HandlerThread("MLHandler", 9);
                    handlerThread.start();
                    d = new C1016Mu0(handlerThread.getLooper());
                }
                c1016Mu0 = d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1016Mu0;
    }

    public static C1016Mu0 i() {
        if (f == null) {
            if (CC0.g == null) {
                CC0.g = new CC0(2);
            }
            f = new C1016Mu0(25, CC0.g);
        }
        return f;
    }

    @Override // defpackage.InterfaceC7122sw
    public /* synthetic */ Set A(C0572Hc c0572Hc) {
        return AbstractC7209tN0.d(this, c0572Hc);
    }

    @Override // defpackage.InterfaceC7122sw
    public /* synthetic */ Object F(C0572Hc c0572Hc, EnumC6931rw enumC6931rw) {
        return AbstractC7209tN0.k(this, c0572Hc, enumC6931rw);
    }

    @Override // defpackage.InterfaceC3519e61
    public int G() {
        return 2;
    }

    public File I() {
        C1286Qg0 c1286Qg0 = (C1286Qg0) this.b;
        c1286Qg0.getClass();
        File file = new File(c1286Qg0.a.getCacheDir(), "lottie_network_cache");
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public synchronized void J(C5995n10 c5995n10) {
        c5995n10.b = null;
        c5995n10.c = null;
        ((ArrayDeque) this.b).offer(c5995n10);
    }

    @Override // defpackage.InterfaceC7122sw
    public /* synthetic */ void L(InterfaceC6741qw interfaceC6741qw) {
        AbstractC7209tN0.b(this, interfaceC6741qw);
    }

    @Override // defpackage.R4
    public AbstractC5738lg M0() {
        ArrayList arrayList = (ArrayList) this.b;
        return ((C6312og0) arrayList.get(0)).c() ? new R10(arrayList, 1) : new C7170tA0(arrayList);
    }

    public File P(String str, InputStream inputStream, EnumC7988xT enumC7988xT) throws IOException {
        File file = new File(I(), b(str, enumC7988xT, true));
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

    @Override // defpackage.InterfaceC7122sw
    public /* synthetic */ boolean Q(C0572Hc c0572Hc) {
        return AbstractC7209tN0.a(this, c0572Hc);
    }

    @Override // defpackage.R4
    public List V0() {
        return (ArrayList) this.b;
    }

    @Override // defpackage.R4
    public boolean Z0() {
        ArrayList arrayList = (ArrayList) this.b;
        return arrayList.size() == 1 && ((C6312og0) arrayList.get(0)).c();
    }

    public void a(String str, Throwable th) {
        O90.f(str, "message");
        l(EnumC6327ol0.e, str, th);
    }

    public File c(String str) {
        File file = new File(I(), b(str, EnumC7988xT.JSON, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(I(), b(str, EnumC7988xT.ZIP, false));
        if (file2.exists()) {
            return file2;
        }
        File file3 = new File(I(), b(str, EnumC7988xT.GZIP, false));
        if (file3.exists()) {
            return file3;
        }
        return null;
    }

    @Override // defpackage.InterfaceC5314jS
    public Object create() {
        VY vy = (VY) this.b;
        return new OD((DO) vy.c, (C1857Xo1) vy.d);
    }

    @Override // defpackage.InterfaceC3519e61
    public /* synthetic */ void d() {
    }

    @Override // defpackage.InterfaceC7122sw
    public /* synthetic */ EnumC6931rw d0(C0572Hc c0572Hc) {
        return AbstractC7209tN0.c(this, c0572Hc);
    }

    @Override // defpackage.InterfaceC1374Rj1
    public void e() {
        C3462dp0 c3462dp0 = (C3462dp0) this.b;
        YN1.h(c3462dp0.d2);
        Surface surface = c3462dp0.d2;
        C1296Qj1 c1296Qj1 = c3462dp0.S1;
        Handler handler = (Handler) c1296Qj1.a;
        if (handler != null) {
            handler.post(new RunnableC5256j81(c1296Qj1, surface, SystemClock.elapsedRealtime(), 1));
        }
        c3462dp0.g2 = true;
    }

    @Override // defpackage.InterfaceC3519e61
    public /* synthetic */ U51 g(byte[] bArr, int i, int i2) {
        return AbstractC7209tN0.h(this, bArr, i2);
    }

    @Override // javax.inject.Provider
    public Object get() {
        XU xu = (XU) ((C1155Oo1) this.b).b;
        AbstractC2501cM1.d(xu);
        return xu;
    }

    @Override // defpackage.InterfaceC7400uN0
    public InterfaceC7122sw getConfig() {
        return (C0873Ky0) this.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC2473cD0
    public void h(Z61 z61) {
        C2456c71 c2456c71;
        if (!DV1.c()) {
            AbstractC3556eJ.c(((C5843mD0) this.b).getContext()).execute(new RQ(this, 24, z61));
            return;
        }
        AbstractC0759Jm0.f("PreviewView");
        InterfaceC7480uo interfaceC7480uo = z61.e;
        ((C5843mD0) this.b).i = interfaceC7480uo.o();
        C6034nD0 c6034nD0 = ((C5843mD0) this.b).h;
        Rect rectP = interfaceC7480uo.g().P();
        c6034nD0.getClass();
        c6034nD0.a = new Rational(rectP.width(), rectP.height());
        synchronized (c6034nD0) {
            c6034nD0.c = rectP;
        }
        z61.c(AbstractC3556eJ.c(((C5843mD0) this.b).getContext()), new C4290i9(this, interfaceC7480uo, z61, 13));
        C5843mD0 c5843mD0 = (C5843mD0) this.b;
        AbstractC4056gw0 abstractC4056gw0 = c5843mD0.b;
        EnumC5270jD0 enumC5270jD0 = c5843mD0.a;
        if (!(abstractC4056gw0 instanceof C2456c71) || C5843mD0.b(z61, enumC5270jD0)) {
            C5843mD0 c5843mD02 = (C5843mD0) this.b;
            if (C5843mD0.b(z61, c5843mD02.a)) {
                C5843mD0 c5843mD03 = (C5843mD0) this.b;
                Q91 q91 = new Q91(c5843mD03, c5843mD03.d);
                q91.i = false;
                q91.k = new AtomicReference();
                c2456c71 = q91;
            } else {
                C5843mD0 c5843mD04 = (C5843mD0) this.b;
                c2456c71 = new C2456c71(c5843mD04, c5843mD04.d);
            }
            c5843mD02.b = c2456c71;
        }
        InterfaceC6907ro interfaceC6907roO = interfaceC7480uo.o();
        C5843mD0 c5843mD05 = (C5843mD0) this.b;
        C4112hD0 c4112hD0 = new C4112hD0(interfaceC6907roO, c5843mD05.f, c5843mD05.b);
        ((C5843mD0) this.b).g.set(c4112hD0);
        interfaceC7480uo.a().a(AbstractC3556eJ.c(((C5843mD0) this.b).getContext()), c4112hD0);
        ((C5843mD0) this.b).b.i(z61, new C4290i9(this, c4112hD0, interfaceC7480uo, 14));
        C5843mD0 c5843mD06 = (C5843mD0) this.b;
        if (c5843mD06.indexOfChild(c5843mD06.c) == -1) {
            C5843mD0 c5843mD07 = (C5843mD0) this.b;
            c5843mD07.addView(c5843mD07.c);
        }
        ((C5843mD0) this.b).getClass();
    }

    public void l(EnumC6327ol0 enumC6327ol0, String str, Throwable th) {
        EnumC6327ol0.b.getClass();
        if (C7304tt.v(enumC6327ol0) >= 4) {
            Iterator it = ((List) this.b).iterator();
            while (it.hasNext()) {
                ((C1100Nw0) it.next()).getClass();
                O90.f(str, "message");
                if (AbstractC1178Ow0.a) {
                    EnumC6327ol0.b.getClass();
                    C7304tt.v(enumC6327ol0);
                } else {
                    String strZ = AbstractC7209tN0.z(new StringBuilder("["), enumC6327ol0.a, "] ExpoModulesCore\t", str);
                    PrintStream printStream = System.out;
                    printStream.println((Object) strZ);
                    if (th != null) {
                        printStream.println((Object) (th.getLocalizedMessage() + "\n" + I02.e(th)));
                    }
                }
            }
        }
    }

    @Override // defpackage.InterfaceC3519e61
    public void m(byte[] bArr, int i, int i2, C3329d61 c3329d61, InterfaceC6365oy interfaceC6365oy) {
        C7363uB c7363uBA;
        C4103hA0 c4103hA0 = (C4103hA0) this.b;
        c4103hA0.E(i + i2, bArr);
        c4103hA0.G(i);
        ArrayList arrayList = new ArrayList();
        while (c4103hA0.a() > 0) {
            YN1.b("Incomplete Mp4Webvtt Top Level box header found.", c4103hA0.a() >= 8);
            int iG = c4103hA0.g();
            if (c4103hA0.g() == 1987343459) {
                int i3 = iG - 8;
                CharSequence charSequenceF = null;
                C7172tB c7172tBA = null;
                while (i3 > 0) {
                    YN1.b("Incomplete vtt cue box header found.", i3 >= 8);
                    int iG2 = c4103hA0.g();
                    int iG3 = c4103hA0.g();
                    int i4 = iG2 - 8;
                    byte[] bArr2 = c4103hA0.a;
                    int i5 = c4103hA0.b;
                    int i6 = AbstractC0277Dh1.a;
                    String str = new String(bArr2, i5, i4, AbstractC8250yr.c);
                    c4103hA0.H(i4);
                    i3 = (i3 - 8) - i4;
                    if (iG3 == 1937011815) {
                        C5952mn1 c5952mn1 = new C5952mn1();
                        AbstractC6143nn1.e(str, c5952mn1);
                        c7172tBA = c5952mn1.a();
                    } else if (iG3 == 1885436268) {
                        charSequenceF = AbstractC6143nn1.f(Collections.emptyList(), null, str.trim());
                    }
                }
                if (charSequenceF == null) {
                    charSequenceF = "";
                }
                if (c7172tBA != null) {
                    c7172tBA.a = charSequenceF;
                    c7363uBA = c7172tBA.a();
                } else {
                    Pattern pattern = AbstractC6143nn1.a;
                    C5952mn1 c5952mn12 = new C5952mn1();
                    c5952mn12.c = charSequenceF;
                    c7363uBA = c5952mn12.a().a();
                }
                arrayList.add(c7363uBA);
            } else {
                c4103hA0.H(iG - 8);
            }
        }
        interfaceC6365oy.b(new C7934xB(arrayList, -9223372036854775807L, -9223372036854775807L));
    }

    @Override // defpackage.J2
    public void onActivityResult(Object obj) {
        I2 i2 = (I2) obj;
        o oVar = (o) this.b;
        C3983gY c3983gY = (C3983gY) oVar.C.pollFirst();
        if (c3983gY == null) {
            return;
        }
        Fragment fragmentC = oVar.c.c(c3983gY.a);
        if (fragmentC == null) {
            return;
        }
        fragmentC.onActivityResult(c3983gY.b, i2.a, i2.b);
    }

    @Override // defpackage.InterfaceC7122sw
    public /* synthetic */ Object q(C0572Hc c0572Hc, Object obj) {
        return AbstractC7209tN0.j(this, c0572Hc, obj);
    }

    @Override // defpackage.InterfaceC3677ex0
    public void r0(Object obj) {
        switch (this.a) {
            case 5:
                if (((Boolean) obj).booleanValue()) {
                    C0431Fh c0431Fh = (C0431Fh) this.b;
                    c0431Fh.r(1);
                    c0431Fh.dismiss();
                    C1210Ph c1210Ph = c0431Fh.b;
                    if (c1210Ph.x == null) {
                        c1210Ph.x = new C0390Et0();
                    }
                    C1210Ph.i(c1210Ph.x, Boolean.FALSE);
                    return;
                }
                return;
            default:
                if (((InterfaceC0903Li0) obj) != null) {
                    g gVar = (g) this.b;
                    if (gVar.mShowsDialog) {
                        View viewRequireView = gVar.requireView();
                        if (viewRequireView.getParent() != null) {
                            throw new IllegalStateException("DialogFragment can not be attached to a container view");
                        }
                        if (gVar.mDialog != null) {
                            if (Log.isLoggable("FragmentManager", 3)) {
                                Objects.toString(gVar.mDialog);
                            }
                            gVar.mDialog.setContentView(viewRequireView);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // defpackage.InterfaceC5441k61
    public Task then(Object obj) {
        if (((BZ0) obj) == null) {
            return AbstractC3782fU1.e(null);
        }
        C4332iN c4332iN = (C4332iN) this.b;
        C5833mA.a((C5833mA) c4332iN.c);
        C5833mA c5833mA = (C5833mA) c4332iN.c;
        ((C1252Pv) c5833mA.m).A((ZA) ((C6846rT1) c5833mA.e).b, null);
        ((S81) c5833mA.q).d(null);
        return AbstractC3782fU1.e(null);
    }

    @Override // defpackage.InterfaceC7122sw
    public /* synthetic */ Set u() {
        return AbstractC7209tN0.g(this);
    }

    @Override // defpackage.InterfaceC1374Rj1
    public void v() {
        ((C3462dp0) this.b).G0(0, 1);
    }

    @Override // defpackage.InterfaceC7122sw
    public /* synthetic */ Object w(C0572Hc c0572Hc) {
        return AbstractC7209tN0.i(this, c0572Hc);
    }

    public C1016Mu0(int i) {
        WG1 wg1;
        this.a = i;
        switch (i) {
            case 6:
                char[] cArr = AbstractC0121Bh1.a;
                this.b = new ArrayDeque(0);
                break;
            case 8:
                TimeUnit timeUnit = TimeUnit.MINUTES;
                O90.f(timeUnit, "timeUnit");
                this.b = new PT(C2272b91.h, timeUnit);
                break;
            case 10:
                this.b = new HashSet();
                break;
            case 22:
                this.b = new C4103hA0();
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                break;
            default:
                try {
                    wg1 = (WG1) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
                } catch (Exception unused) {
                    wg1 = e;
                }
                C6998sG1 c6998sG1 = new C6998sG1(C4307iE1.b, wg1);
                Charset charset = AbstractC3356dF1.a;
                this.b = c6998sG1;
                break;
        }
    }

    public C1016Mu0(Looper looper) {
        this.a = 1;
        HandlerC7197tJ0 handlerC7197tJ0 = new HandlerC7197tJ0(looper, 2);
        Looper.getMainLooper();
        this.b = handlerC7197tJ0;
    }

    public C1016Mu0(C4065gz0 c4065gz0, EnumC1527Ti1 enumC1527Ti1) {
        this.a = 26;
        this.b = c4065gz0;
    }

    public C1016Mu0(C3915gB0 c3915gB0) {
        this.a = 23;
        this.b = c3915gB0;
        c3915gB0.y = false;
    }

    public C1016Mu0(UC uc) {
        this.a = 18;
        this.b = Collections.unmodifiableMap(new HashMap(uc.a));
    }

    public C1016Mu0(NV1 nv1) {
        this.a = 7;
        this.b = new G10(8, nv1);
    }

    public C1016Mu0(WeakReference weakReference, QL0 ql0) {
        this.a = 15;
        ReactNativeConfig reactNativeConfig = ReactNativeConfig.DEFAULT_CONFIG;
        new ArrayList();
        O90.f(ql0, "reactNativeHostWrapper");
        O90.f(reactNativeConfig, "reactNativeConfig");
        this.b = reactNativeConfig;
    }
}
