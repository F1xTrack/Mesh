package defpackage;

import android.R;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.PictureInPictureParams;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.MediaDrm;
import android.media.UnsupportedSchemeException;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.util.Rational;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.UiThreadUtil;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import kotlin.KotlinVersion;

/* renamed from: rK0 */
/* loaded from: classes.dex */
public final class C6818rK0 extends FrameLayout implements LifecycleEventListener, GB0, InterfaceC0113Bf, InterfaceC2372bh, PL {
    public static final CookieManager H1;
    public float A;
    public long A1;
    public EnumC6293oa B;
    public long B1;
    public float C;
    public boolean C1;
    public int D;
    public int D1;
    public boolean E;
    public final String E1;
    public boolean F;
    public InterfaceC0701It F1;
    public boolean G;
    public final F3 G1;
    public final Handler H;
    public RunnableC5482kK0 I;
    public final RunnableC1492Sx J;
    public boolean K;
    public C3491dz L;
    public final ArrayList M;
    public boolean N;
    public long O;
    public V21 P;
    public boolean Q;
    public String R;
    public String S;
    public String T;
    public String U;
    public String V;
    public String W;
    public final C7467uj1 a;
    public boolean a0;
    public final InterfaceC3751fK0 b;
    public boolean b0;
    public final PE c;
    public boolean c0;
    public C6509pi0 d;
    public boolean d0;
    public View e;
    public float e0;
    public C3580eR f;
    public final C3771fR g;
    public DialogC5335jZ h;
    public WC i;
    public XQ j;
    public C2103aH k;
    public boolean l;
    public ServiceConnectionC6055nK0 m;
    public EP n;
    public boolean o;
    public int p;
    public long q;
    public boolean q1;
    public boolean r;
    public boolean r1;
    public boolean s;
    public boolean s1;
    public boolean t;
    public boolean t1;
    public boolean u;
    public final S91 u1;
    public boolean v;
    public final AudioManager v1;
    public boolean w;
    public final S9 w1;
    public boolean x;
    public final S9 x1;
    public final PictureInPictureParams.Builder y;
    public final C5529ka y1;
    public boolean z;
    public long z1;

    static {
        CookieManager cookieManager = new CookieManager();
        H1 = cookieManager;
        cookieManager.setCookiePolicy(CookiePolicy.ACCEPT_ORIGINAL_SERVER);
    }

    public C6818rK0(S91 s91, InterfaceC3751fK0 interfaceC3751fK0) {
        super(s91);
        this.n = null;
        this.o = false;
        this.w = false;
        this.x = false;
        this.z = false;
        this.A = 1.0f;
        this.B = EnumC6293oa.d;
        this.C = 1.0f;
        this.D = 0;
        this.E = false;
        this.F = false;
        this.G = false;
        this.K = false;
        this.L = new C3491dz();
        this.M = new ArrayList();
        this.N = false;
        this.O = -1L;
        this.P = new V21();
        this.V = "disabled";
        this.b0 = true;
        this.d0 = true;
        this.e0 = 250.0f;
        this.q1 = false;
        this.r1 = false;
        this.t1 = false;
        this.z1 = -1L;
        this.A1 = -1L;
        this.B1 = -1L;
        this.C1 = false;
        this.D1 = 1;
        this.E1 = String.valueOf(UUID.randomUUID());
        this.G1 = new F3(this, Looper.getMainLooper(), 4);
        this.u1 = s91;
        this.a = new C7467uj1();
        this.b = interfaceC3751fK0;
        this.c = (PE) ((C1135Oi) interfaceC3751fK0).c;
        int i = Build.VERSION.SDK_INT;
        if (i >= 26 && this.y == null) {
            this.y = AbstractC2488cI0.f();
        }
        this.H = new Handler();
        CookieHandler cookieHandler = CookieHandler.getDefault();
        CookieManager cookieManager = H1;
        if (cookieHandler != cookieManager) {
            CookieHandler.setDefault(cookieManager);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        C3771fR c3771fR = new C3771fR(getContext());
        this.g = c3771fR;
        c3771fR.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC7486uq(3, this));
        this.g.setLayoutParams(layoutParams);
        addView(this.g, 0, layoutParams);
        this.g.setFocusable(this.b0);
        this.v1 = (AudioManager) s91.getSystemService("audio");
        s91.addLifecycleEventListener(this);
        AbstractActivityC0629Hv abstractActivityC0629HvA = AbstractC6632qL1.a(s91);
        C3690f1 c3690f1 = new C3690f1(this, 12, abstractActivityC0629HvA);
        C6685qd0 c6685qd0 = new C6685qd0(16, this);
        abstractActivityC0629HvA.addOnPictureInPictureModeChangedListener(new C3724fB0(c3690f1));
        if (i >= 24 && i < 31) {
            abstractActivityC0629HvA.addOnUserLeaveHintListener(new RunnableC3533eB0(c6685qd0, 0));
        }
        this.J = new RunnableC1492Sx(s91, c3690f1, c6685qd0, 5);
        this.w1 = new S9(s91);
        this.y1 = new C5529ka(s91, this);
        this.x1 = new S9(s91, this);
    }

    public static C0960Mb1 L(C6666qX c6666qX, int i, InterfaceC5311jR interfaceC5311jR, C1272Qb1 c1272Qb1) {
        C0960Mb1 c0960Mb1 = new C0960Mb1();
        String str = c6666qX.m;
        if (str != null) {
            c0960Mb1.b = str;
        }
        String str2 = c6666qX.d;
        if (str2 != null) {
            c0960Mb1.c = str2;
        }
        String str3 = c6666qX.b;
        if (str3 != null) {
            c0960Mb1.a = str3;
        }
        c0960Mb1.d = (interfaceC5311jR == null || interfaceC5311jR.d() != c1272Qb1 || interfaceC5311jR.t(i) == -1) ? false : true;
        return c0960Mb1;
    }

    public static C1764Wj1 M(C6666qX c6666qX, int i) {
        C1764Wj1 c1764Wj1 = new C1764Wj1();
        c1764Wj1.d = "";
        c1764Wj1.e = -1;
        c1764Wj1.f = "";
        int i2 = c6666qX.s;
        if (i2 == -1) {
            i2 = 0;
        }
        c1764Wj1.a = i2;
        int i3 = c6666qX.t;
        if (i3 == -1) {
            i3 = 0;
        }
        c1764Wj1.b = i3;
        int i4 = c6666qX.i;
        c1764Wj1.c = i4 != -1 ? i4 : 0;
        c1764Wj1.g = c6666qX.v;
        String str = c6666qX.j;
        if (str != null) {
            c1764Wj1.d = str;
        }
        String strValueOf = c6666qX.a;
        if (strValueOf == null) {
            strValueOf = String.valueOf(i);
        }
        O90.f(strValueOf, "<set-?>");
        c1764Wj1.f = strValueOf;
        c1764Wj1.e = i;
        return c1764Wj1;
    }

    public static int O(C1350Rb1 c1350Rb1) throws MissingResourceException {
        if (c1350Rb1.a == 0) {
            return -1;
        }
        String language = Locale.getDefault().getLanguage();
        String iSO3Language = Locale.getDefault().getISO3Language();
        for (int i = 0; i < c1350Rb1.a; i++) {
            String str = c1350Rb1.a(i).d[0].d;
            if (str != null && (str.equals(language) || str.equals(iSO3Language))) {
                return i;
            }
        }
        return 0;
    }

    public static boolean T(C6666qX c6666qX) {
        int i = c6666qX.s;
        if (i == -1) {
            i = 0;
        }
        int i2 = c6666qX.t;
        int i3 = i2 != -1 ? i2 : 0;
        float f = c6666qX.u;
        if (f == -1.0f) {
            f = 0.0f;
        }
        String str = c6666qX.m;
        if (str == null) {
            return true;
        }
        try {
            return AbstractC2012Zo0.e(str).f(f, i, i3);
        } catch (Exception unused) {
            return true;
        }
    }

    public static /* synthetic */ void f(C6818rK0 c6818rK0, long j, long j2, int i, int i2, ArrayList arrayList, ArrayList arrayList2, String str) {
        ArrayList<C1764Wj1> videoTrackInfoFromManifest = c6818rK0.getVideoTrackInfoFromManifest();
        if (videoTrackInfoFromManifest != null) {
            c6818rK0.F = true;
        }
        c6818rK0.a.b.a(Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), Integer.valueOf(i2), arrayList, arrayList2, videoTrackInfoFromManifest, str);
    }

    private ArrayList<C0960Mb1> getAudioTrackInfo() {
        ArrayList<C0960Mb1> arrayList = new ArrayList<>();
        C2103aH c2103aH = this.k;
        if (c2103aH == null) {
            return arrayList;
        }
        C4271i3 c4271i3 = c2103aH.c;
        int iP = P(1);
        if (c4271i3 != null && iP != -1) {
            C1350Rb1 c1350Rb1 = ((C1350Rb1[]) c4271i3.c)[iP];
            XQ xq = this.j;
            xq.g2();
            InterfaceC5311jR[] interfaceC5311jRArr = (InterfaceC5311jR[]) xq.u1.i.c;
            int length = interfaceC5311jRArr.length;
            InterfaceC5311jR interfaceC5311jR = interfaceC5311jRArr[1];
            for (int i = 0; i < c1350Rb1.a; i++) {
                C1272Qb1 c1272Qb1A = c1350Rb1.a(i);
                C6666qX c6666qX = c1272Qb1A.d[0];
                C0960Mb1 c0960Mb1L = L(c6666qX, i, interfaceC5311jR, c1272Qb1A);
                int i2 = c6666qX.i;
                if (i2 == -1) {
                    i2 = 0;
                }
                c0960Mb1L.e = i2;
                arrayList.add(c0960Mb1L);
            }
        }
        return arrayList;
    }

    private ArrayList<C0960Mb1> getTextTrackInfo() {
        ArrayList<C0960Mb1> arrayList = new ArrayList<>();
        C2103aH c2103aH = this.k;
        if (c2103aH == null) {
            return arrayList;
        }
        C4271i3 c4271i3 = c2103aH.c;
        int iP = P(3);
        if (c4271i3 != null && iP != -1) {
            XQ xq = this.j;
            xq.g2();
            InterfaceC5311jR[] interfaceC5311jRArr = (InterfaceC5311jR[]) xq.u1.i.c;
            int length = interfaceC5311jRArr.length;
            InterfaceC5311jR interfaceC5311jR = interfaceC5311jRArr[2];
            C1350Rb1 c1350Rb1 = ((C1350Rb1[]) c4271i3.c)[iP];
            for (int i = 0; i < c1350Rb1.a; i++) {
                C1272Qb1 c1272Qb1A = c1350Rb1.a(i);
                arrayList.add(L(c1272Qb1A.d[0], i, interfaceC5311jR, c1272Qb1A));
            }
        }
        return arrayList;
    }

    private ArrayList<C1764Wj1> getVideoTrackInfo() {
        ArrayList<C1764Wj1> arrayList = new ArrayList<>();
        C2103aH c2103aH = this.k;
        if (c2103aH == null) {
            return arrayList;
        }
        C4271i3 c4271i3 = c2103aH.c;
        int iP = P(2);
        if (c4271i3 != null && iP != -1) {
            C1350Rb1 c1350Rb1 = ((C1350Rb1[]) c4271i3.c)[iP];
            for (int i = 0; i < c1350Rb1.a; i++) {
                C1272Qb1 c1272Qb1A = c1350Rb1.a(i);
                for (int i2 = 0; i2 < c1272Qb1A.a; i2++) {
                    C6666qX c6666qX = c1272Qb1A.d[i2];
                    if (T(c6666qX)) {
                        arrayList.add(M(c6666qX, i2));
                    }
                }
            }
        }
        return arrayList;
    }

    private ArrayList<C1764Wj1> getVideoTrackInfoFromManifest() {
        return Q(0);
    }

    public static void h0(int i, View view, boolean z) {
        if (z) {
            view.setVisibility(i);
        } else if (view.getVisibility() == i) {
            view.setVisibility(0);
        }
    }

    private void setPlayWhenReady(boolean z) {
        XQ xq = this.j;
        if (xq == null) {
            return;
        }
        if (!z) {
            xq.W1(false);
            return;
        }
        boolean z2 = this.a0 || this.P.b == null || this.z || this.v1.requestAudioFocus(this.y1, 3, 1) == 1;
        this.z = z2;
        if (z2) {
            this.j.W1(true);
        }
    }

    @Override // defpackage.GB0
    public final /* synthetic */ void A(List list) {
    }

    @Override // defpackage.GB0
    public final /* synthetic */ void B(int i, boolean z) {
    }

    @Override // defpackage.GB0
    public final void C(CB0 cb0) {
        this.a.t.invoke(Float.valueOf(cb0.a));
    }

    @Override // defpackage.GB0
    public final /* synthetic */ void D(EB0 eb0) {
    }

    public final void E(EnumC6293oa enumC6293oa) {
        if (this.j != null) {
            int i = enumC6293oa.b;
            int i2 = AbstractC0277Dh1.a;
            int i3 = 4;
            int i4 = i != 0 ? i != 1 ? i != 2 ? i != 4 ? i != 5 ? i != 8 ? 1 : 3 : 5 : 4 : 6 : 13 : 2;
            if (i == 0) {
                i3 = 1;
            } else if (i != 1 && i != 2 && i != 4 && i != 5 && i != 8) {
                i3 = 2;
            }
            Q9 q9 = new Q9(i3, i4);
            XQ xq = this.j;
            xq.g2();
            if (!xq.r1) {
                boolean zA = AbstractC0277Dh1.a(xq.a0, q9);
                C1607Uj0 c1607Uj0 = xq.m;
                if (!zA) {
                    xq.a0 = q9;
                    xq.U1(1, 3, q9);
                    c1607Uj0.c(20, new EE(6, q9));
                }
                C5720la c5720la = xq.B;
                c5720la.b(null);
                xq.i.b(q9);
                boolean zJ1 = xq.J1();
                int iD = c5720la.d(xq.K1(), zJ1);
                xq.d2(iD, iD != -1 ? 1 : 2, zJ1);
                c1607Uj0.b();
            }
            AudioManager audioManager = (AudioManager) this.u1.getSystemService("audio");
            boolean z = enumC6293oa == EnumC6293oa.d;
            audioManager.setMode(z ? 0 : 3);
            audioManager.setSpeakerphoneOn(z);
        }
    }

    @Override // defpackage.GB0
    public final void F(C0540Gr0 c0540Gr0) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            InterfaceC0384Er0[] interfaceC0384Er0Arr = c0540Gr0.a;
            if (i >= interfaceC0384Er0Arr.length) {
                this.a.q.invoke(arrayList);
                return;
            }
            InterfaceC0384Er0 interfaceC0384Er0 = interfaceC0384Er0Arr[i];
            if (interfaceC0384Er0 instanceof V50) {
                V50 v50 = (V50) interfaceC0384Er0;
                arrayList.add(new C8201ya1(v50.a, v50 instanceof C6596q91 ? ((C6596q91) v50).c : ""));
            } else if (interfaceC0384Er0 instanceof LP) {
                LP lp = (LP) interfaceC0384Er0;
                arrayList.add(new C8201ya1(lp.a, lp.b));
            } else {
                AbstractC6864rZ1.b("ReactExoplayerView", "unhandled metadata " + interfaceC0384Er0);
            }
            i++;
        }
    }

    @Override // defpackage.GB0
    public final /* synthetic */ void G(C6721qp0 c6721qp0, int i) {
    }

    @Override // defpackage.GB0
    public final /* synthetic */ void H(int i, int i2) {
    }

    @Override // defpackage.GB0
    public final void I(boolean z) {
        C7467uj1 c7467uj1 = this.a;
        if (z && this.N) {
            c7467uj1.g.invoke(Long.valueOf(this.j.E1()), Long.valueOf(this.O));
        }
        PictureInPictureParams.Builder builder = this.y;
        boolean z2 = !z;
        S91 s91 = this.u1;
        O90.f(s91, "context");
        S9 s9 = this.x1;
        O90.f(s9, "receiver");
        if (builder != null && Build.VERSION.SDK_INT >= 26) {
            builder.setActions(AbstractC6441pL1.b(s91, z2, s9));
            PictureInPictureParams pictureInPictureParamsBuild = builder.build();
            O90.e(pictureInPictureParamsBuild, "build(...)");
            AbstractC6441pL1.d(s91, pictureInPictureParamsBuild);
        }
        c7467uj1.f.invoke(Boolean.valueOf(z), Boolean.valueOf(this.N));
        if (z) {
            this.N = false;
        }
    }

    public final void J() {
        PictureInPictureParams pictureInPictureParamsBuild;
        int i = Build.VERSION.SDK_INT;
        S91 s91 = this.u1;
        if (i >= 26) {
            this.y.setActions(AbstractC6441pL1.b(s91, this.u, this.x1));
            PictureInPictureParams.Builder builder = this.y;
            XQ xq = this.j;
            O90.f(xq, "player");
            xq.g2();
            int i2 = xq.s1.a;
            xq.g2();
            Rational rational = new Rational(i2, xq.s1.b);
            Rational rational2 = new Rational(239, 100);
            Rational rational3 = new Rational(100, 239);
            if (rational.floatValue() > rational2.floatValue()) {
                rational = rational2;
            } else if (rational.floatValue() < rational3.floatValue()) {
                rational = rational3;
            }
            pictureInPictureParamsBuild = builder.setAspectRatio(rational).build();
        } else {
            pictureInPictureParamsBuild = null;
        }
        O90.f(s91, "context");
        if (AbstractC6441pL1.c(s91)) {
            if ((i >= 26) && pictureInPictureParamsBuild != null) {
                try {
                    AbstractC6632qL1.a(s91).enterPictureInPictureMode(pictureInPictureParamsBuild);
                    return;
                } catch (IllegalStateException e) {
                    AbstractC6864rZ1.c("PictureInPictureUtil", e.toString());
                    return;
                }
            }
            if (i >= 24) {
                try {
                    AbstractC6632qL1.a(s91).enterPictureInPictureMode();
                } catch (IllegalStateException e2) {
                    AbstractC6864rZ1.c("PictureInPictureUtil", e2.toString());
                }
            }
        }
    }

    public final void K() {
        Activity currentActivity = this.u1.a.getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) currentActivity.getWindow().getDecorView().findViewById(R.id.content);
        ArrayList arrayList = this.M;
        if (!arrayList.isEmpty()) {
            if (this.g.getParent().equals(viewGroup)) {
                viewGroup.removeView(this.g);
            }
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                viewGroup.getChildAt(i).setVisibility(((Integer) arrayList.get(i)).intValue());
            }
            arrayList.clear();
        }
        if (Build.VERSION.SDK_INT < 24 || !currentActivity.isInPictureInPictureMode()) {
            return;
        }
        currentActivity.moveTaskToBack(false);
    }

    @Override // defpackage.PL
    public final void N(int i, C0456Fp0 c0456Fp0) {
        AbstractC6864rZ1.b("DRM Info", "onDrmKeysRestored");
    }

    public final int P(int i) {
        XQ xq = this.j;
        if (xq == null) {
            return -1;
        }
        xq.g2();
        int length = xq.h.length;
        for (int i2 = 0; i2 < length; i2++) {
            XQ xq2 = this.j;
            xq2.g2();
            if (xq2.h[i2].b == i) {
                return i2;
            }
        }
        return -1;
    }

    public final ArrayList Q(int i) {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        try {
            ArrayList arrayList = (ArrayList) executorServiceNewSingleThreadExecutor.submit(new CallableC6246oK0(this, this.i.s0(), this.P.b, (r1.h * 1000) - 100)).get(3000L, TimeUnit.MILLISECONDS);
            if (arrayList == null && i < 1) {
                return Q(i + 1);
            }
            executorServiceNewSingleThreadExecutor.shutdown();
            return arrayList;
        } catch (Exception e) {
            AbstractC6864rZ1.e("ReactExoplayerView", "error in getVideoTrackInfoFromManifest handling request:" + e.getMessage());
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void R(C6818rK0 c6818rK0) {
        C2103aH c2103aH = new C2103aH(getContext(), new OL0(7));
        c6818rK0.k = c2103aH;
        TG tgF = this.k.f();
        tgF.getClass();
        SG sg = new SG(tgF);
        int i = this.D;
        if (i == 0) {
            i = Integer.MAX_VALUE;
        }
        sg.d = i;
        c2103aH.l(new TG(sg));
        C5272jE c5272jE = new C5272jE();
        C6511pj c6511pj = this.P.p;
        int i2 = c6511pj.b;
        if (i2 == -1) {
            i2 = 50000;
        }
        int i3 = c6511pj.c;
        if (i3 == -1) {
            i3 = 50000;
        }
        int i4 = c6511pj.d;
        if (i4 == -1) {
            i4 = 2500;
        }
        int i5 = i4;
        int i6 = c6511pj.e;
        if (i6 == -1) {
            i6 = 5000;
        }
        int i7 = i6;
        int i8 = c6511pj.f;
        if (i8 == -1) {
            i8 = 0;
        }
        C6628qK0 c6628qK0 = new C6628qK0(c5272jE, i2, i3, i5, i7, true, i8);
        Runtime.getRuntime();
        ActivityManager activityManager = (ActivityManager) this.u1.getSystemService("activity");
        double d = c6511pj.g;
        if (d == -1.0d) {
            d = 1.0d;
        }
        Math.floor(activityManager.getMemoryClass() * d * 1024.0d * 1024.0d);
        X11 x11 = new X11(getContext(), 4);
        x11.b = true;
        ((C1204Pf) x11.d).b = 1;
        C5851mG c5851mG = new C5851mG(this.i);
        if (this.K) {
            C6860rY0 c6860rY0V = v(true);
            N01 n01 = AbstractC2317bO1.a;
            if (n01 != null) {
                C5772lr0 c5772lr0 = new C5772lr0(7);
                c5772lr0.c = new TE(14);
                c5772lr0.b = n01;
                c5772lr0.d = c6860rY0V;
                c6860rY0V = c5772lr0;
            }
            c5851mG.b = c6860rY0V;
            C5469kG c5469kG = c5851mG.a;
            if (c6860rY0V != c5469kG.d) {
                c5469kG.d = c6860rY0V;
                c5469kG.b.clear();
                c5469kG.c.clear();
            }
        }
        new C0681Im0(this, 18);
        this.g.getClass();
        KQ kq = new KQ(getContext(), x11);
        C2103aH c2103aH2 = c6818rK0.k;
        YN1.f(!kq.u);
        c2103aH2.getClass();
        kq.e = new C5278jG(3, c2103aH2);
        YN1.f(!kq.u);
        PE pe = this.c;
        pe.getClass();
        kq.g = new C5278jG(2, pe);
        YN1.f(!kq.u);
        kq.f = new C5278jG(1, c6628qK0);
        YN1.f(!kq.u);
        kq.d = new C5278jG(4, c5851mG);
        YN1.f(!kq.u);
        kq.u = true;
        this.j = new XQ(kq);
        VL0.c.A().a(this.E1, this.j);
        Y();
        XQ xq = this.j;
        xq.getClass();
        xq.m.a(c6818rK0);
        this.j.a2(this.w ? 0.0f : this.C * 1.0f);
        this.g.setPlayer(this.j);
        S9 s9 = this.w1;
        s9.getClass();
        s9.b = c6818rK0;
        AbstractC3556eJ.f(s9.c, s9, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"), 4);
        S9 s92 = this.x1;
        s92.getClass();
        AbstractC3556eJ.f((S91) s92.c, s92, new IntentFilter("rnv_media_control"), 4);
        Handler handler = new Handler();
        QQ0 qq0 = pe.b;
        qq0.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) qq0.a;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            C0035Af c0035Af = (C0035Af) it.next();
            if (c0035Af.b == c6818rK0) {
                c0035Af.c = true;
                copyOnWriteArrayList.remove(c0035Af);
            }
        }
        copyOnWriteArrayList.add(new C0035Af(handler, c6818rK0));
        setPlayWhenReady(!this.u);
        this.l = true;
        this.j.X1(new CB0(this.A, 1.0f));
        E(this.B);
        if (this.t1) {
            c0();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:219:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x0422 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:411:0x0437 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void S(defpackage.V21 r47) {
        /*
            Method dump skipped, instructions count: 1434
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6818rK0.S(V21):void");
    }

    public final void U(boolean z) {
        if (this.v == z) {
            return;
        }
        boolean z2 = this.u;
        C7467uj1 c7467uj1 = this.a;
        if (z2 && this.N && !z) {
            c7467uj1.g.invoke(Long.valueOf(this.j.E1()), Long.valueOf(this.O));
            this.N = false;
        }
        this.v = z;
        c7467uj1.n.invoke(Boolean.valueOf(z));
    }

    public final void V() {
        XQ xq = this.j;
        if (xq != null && xq.J1()) {
            setPlayWhenReady(false);
        }
        setKeepScreenOn(false);
    }

    public final void W(View view) {
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
        view.layout(view.getLeft(), view.getTop(), view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public final void X() {
        boolean zA;
        String str;
        C6509pi0 c6509pi0 = this.d;
        if (c6509pi0 == null || this.j == null || !this.s1) {
            return;
        }
        LinearLayout linearLayout = (LinearLayout) c6509pi0.findViewById(ru.mes.dnevnik.R.id.exo_live_container);
        TextView textView = (TextView) this.d.findViewById(ru.mes.dnevnik.R.id.exo_live_label);
        AbstractC0178Ca1 abstractC0178Ca1G1 = this.j.G1();
        if (abstractC0178Ca1G1.p()) {
            zA = false;
        } else {
            C0100Ba1 c0100Ba1 = new C0100Ba1();
            abstractC0178Ca1G1.n(this.j.D1(), c0100Ba1);
            zA = c0100Ba1.a();
        }
        if (!zA || (str = this.L.l) == null) {
            linearLayout.setVisibility(8);
        } else {
            textView.setText(str);
            linearLayout.setVisibility(0);
        }
        ImageButton imageButton = (ImageButton) this.d.findViewById(ru.mes.dnevnik.R.id.exo_play);
        ImageButton imageButton2 = (ImageButton) this.d.findViewById(ru.mes.dnevnik.R.id.exo_pause);
        if (this.L.d) {
            this.e.setAlpha(0.0f);
            imageButton.setClickable(false);
            imageButton2.setClickable(false);
        } else {
            this.e.setAlpha(1.0f);
            imageButton.setClickable(true);
            imageButton2.setClickable(true);
        }
        d0(ru.mes.dnevnik.R.id.exo_ffwd, this.L.e);
        d0(ru.mes.dnevnik.R.id.exo_rew, this.L.f);
        d0(ru.mes.dnevnik.R.id.exo_next, this.L.g);
        d0(ru.mes.dnevnik.R.id.exo_prev, this.L.h);
        h0(8, this.d.findViewById(ru.mes.dnevnik.R.id.exo_fullscreen), this.L.i);
        h0(8, this.d.findViewById(ru.mes.dnevnik.R.id.exo_position), this.L.c);
        h0(4, this.d.findViewById(ru.mes.dnevnik.R.id.exo_progress), this.L.a);
        h0(8, this.d.findViewById(ru.mes.dnevnik.R.id.exo_duration), this.L.b);
        h0(8, this.d.findViewById(ru.mes.dnevnik.R.id.exo_settings), this.L.m);
    }

    public final void Y() {
        XQ xq = this.j;
        if (xq == null) {
            return;
        }
        if (this.o) {
            EP ep = new EP();
            this.n = ep;
            C8323zE c8323zE = this.j.r;
            c8323zE.getClass();
            c8323zE.f.a(ep);
            return;
        }
        EP ep2 = this.n;
        if (ep2 != null) {
            xq.g2();
            xq.r.f.e(ep2);
            this.n = null;
        }
    }

    public final void Z() {
        RunnableC5482kK0 runnableC5482kK0;
        String str;
        AudioTrack audioTrack;
        if (this.j != null) {
            g0();
            XQ xq = this.j;
            xq.getClass();
            StringBuilder sb = new StringBuilder("Release ");
            sb.append(Integer.toHexString(System.identityHashCode(xq)));
            sb.append(" [AndroidXMedia3/1.4.1] [");
            sb.append(AbstractC0277Dh1.e);
            sb.append("] [");
            HashSet hashSet = AbstractC6911rp0.a;
            synchronized (AbstractC6911rp0.class) {
                str = AbstractC6911rp0.b;
            }
            sb.append(str);
            sb.append("]");
            AbstractC6789rA1.g(sb.toString());
            xq.g2();
            if (AbstractC0277Dh1.a < 21 && (audioTrack = xq.Q) != null) {
                audioTrack.release();
                xq.Q = null;
            }
            xq.A.r();
            xq.C.getClass();
            xq.D.getClass();
            C5720la c5720la = xq.B;
            c5720la.c = null;
            c5720la.a();
            c5720la.c(0);
            if (!xq.l.x()) {
                xq.m.f(10, new C6799rE(21));
            }
            xq.m.d();
            xq.j.a.removeCallbacksAndMessages(null);
            InterfaceC0191Cf interfaceC0191Cf = xq.t;
            C8323zE c8323zE = xq.r;
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) ((PE) interfaceC0191Cf).b.a;
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                C0035Af c0035Af = (C0035Af) it.next();
                if (c0035Af.b == c8323zE) {
                    c0035Af.c = true;
                    copyOnWriteArrayList.remove(c0035Af);
                }
            }
            BB0 bb0 = xq.u1;
            if (bb0.p) {
                xq.u1 = bb0.a();
            }
            BB0 bb0G = xq.u1.g(1);
            xq.u1 = bb0G;
            BB0 bb0B = bb0G.b(bb0G.b);
            xq.u1 = bb0B;
            bb0B.q = bb0B.s;
            xq.u1.r = 0L;
            C8323zE c8323zE2 = xq.r;
            R71 r71 = c8323zE2.h;
            YN1.h(r71);
            r71.c(new G4(29, c8323zE2));
            xq.i.a();
            xq.T1();
            Surface surface = xq.S;
            if (surface != null) {
                surface.release();
                xq.S = null;
            }
            int i = C7554vB.b;
            xq.r1 = true;
            this.j.R1(this);
            AbstractC6441pL1.a(this.u1, this.y, false);
            if (this.J != null) {
                new Handler().post(this.J);
            }
            this.k = null;
            VL0.c.A().b(this.E1, this.j);
            this.j = null;
        }
        this.G1.removeMessages(1);
        S9 s9 = this.w1;
        s9.getClass();
        s9.b = C2181ah.a;
        try {
            s9.c.unregisterReceiver(s9);
        } catch (Exception unused) {
        }
        S9 s92 = this.x1;
        s92.getClass();
        try {
            ((S91) s92.c).unregisterReceiver(s92);
        } catch (Exception unused2) {
        }
        CopyOnWriteArrayList copyOnWriteArrayList2 = (CopyOnWriteArrayList) this.c.b.a;
        Iterator it2 = copyOnWriteArrayList2.iterator();
        while (it2.hasNext()) {
            C0035Af c0035Af2 = (C0035Af) it2.next();
            if (c0035Af2.b == this) {
                c0035Af2.c = true;
                copyOnWriteArrayList2.remove(c0035Af2);
            }
        }
        Handler handler = this.H;
        if (handler == null || (runnableC5482kK0 = this.I) == null) {
            return;
        }
        handler.removeCallbacks(runnableC5482kK0);
        this.I = null;
    }

    @Override // defpackage.GB0
    public final /* synthetic */ void a(int i) {
    }

    /* JADX WARN: Removed duplicated region for block: B:254:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x016e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a0(int r18, java.lang.String r19, java.lang.String r20) throws java.util.MissingResourceException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 675
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6818rK0.a0(int, java.lang.String, java.lang.String):void");
    }

    @Override // defpackage.GB0
    public final /* synthetic */ void b(Q9 q9) {
    }

    @Override // defpackage.PL
    public final void b0(int i, C0456Fp0 c0456Fp0) {
        AbstractC6864rZ1.b("DRM Info", "onDrmKeysLoaded");
    }

    @Override // defpackage.PL
    public final void c(int i, C0456Fp0 c0456Fp0, Exception exc) {
        AbstractC6864rZ1.b("DRM Info", "onDrmSessionManagerError");
        this.a.c.b("onDrmSessionManagerError", exc, "3002");
    }

    public final void c0() {
        if (!this.t1 || this.j == null) {
            return;
        }
        this.m = new ServiceConnectionC6055nK0(this);
        S91 s91 = this.u1;
        Intent intent = new Intent(s91, (Class<?>) AbstractServiceC0595Hj1.class);
        intent.setAction("androidx.media3.session.MediaSessionService");
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            s91.startForegroundService(intent);
        } else {
            s91.startService(intent);
        }
        s91.bindService(intent, this.m, i >= 29 ? 4097 : 1);
    }

    @Override // defpackage.InterfaceC2372bh
    public final void d() {
        this.a.r.invoke();
    }

    public final void d0(int i, boolean z) {
        ImageButton imageButton = (ImageButton) this.d.findViewById(i);
        if (z) {
            imageButton.setImageAlpha(0);
            imageButton.setClickable(false);
        } else {
            imageButton.setImageAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
            imageButton.setClickable(true);
        }
    }

    @Override // defpackage.GB0
    public final /* synthetic */ void e(C1530Tj1 c1530Tj1) {
    }

    public final void e0() {
        DialogC5335jZ dialogC5335jZ;
        C6509pi0 c6509pi0 = this.d;
        if (c6509pi0 != null) {
            ImageButton imageButton = (ImageButton) c6509pi0.findViewById(ru.mes.dnevnik.R.id.exo_fullscreen);
            if (!this.s || (dialogC5335jZ = this.h) == null || dialogC5335jZ.isShowing()) {
                imageButton.setVisibility(0);
            } else {
                imageButton.setVisibility(8);
            }
        }
    }

    public final void f0() {
        long jZ1;
        XQ xq = this.j;
        if (xq != null) {
            if (this.d != null && xq != null && xq.M1() && this.s1) {
                this.d.a();
            }
            XQ xq2 = this.j;
            xq2.getClass();
            xq2.g2();
            if (xq2.M1()) {
                BB0 bb0 = xq2.u1;
                jZ1 = bb0.k.equals(bb0.b) ? AbstractC0277Dh1.d0(xq2.u1.q) : xq2.I1();
            } else {
                jZ1 = xq2.z1();
            }
            long jI1 = xq2.I1();
            int iJ = 0;
            if (jZ1 != -9223372036854775807L && jI1 != -9223372036854775807L) {
                iJ = jI1 == 0 ? 100 : AbstractC0277Dh1.j((int) ((jZ1 * 100) / jI1), 0, 100);
            }
            long jI12 = (this.j.I1() * iJ) / 100;
            long jI13 = this.j.I1();
            long jE1 = this.j.E1();
            if (jE1 > jI13) {
                jE1 = jI13;
            }
            if (this.z1 == jE1 && this.A1 == jI12 && this.B1 == jI13) {
                return;
            }
            this.z1 = jE1;
            this.A1 = jI12;
            this.B1 = jI13;
            C6513pj1 c6513pj1 = this.a.d;
            Long lValueOf = Long.valueOf(jE1);
            Long lValueOf2 = Long.valueOf(jI12);
            Long lValueOf3 = Long.valueOf(this.j.I1());
            C0100Ba1 c0100Ba1 = new C0100Ba1();
            if (!this.j.G1().p()) {
                this.j.G1().n(this.j.D1(), c0100Ba1);
            }
            c6513pj1.a(lValueOf, lValueOf2, lValueOf3, Double.valueOf(c0100Ba1.f + jE1));
        }
    }

    public final void g0() {
        this.p = this.j.D1();
        this.q = this.j.l1() ? Math.max(0L, this.j.E1()) : -9223372036854775807L;
    }

    public boolean getPreventsDisplaySleepDuringVideoPlayback() {
        return this.d0;
    }

    @Override // defpackage.GB0
    public final /* synthetic */ void h(int i, boolean z) {
    }

    @Override // defpackage.GB0
    public final void i(float f) {
        this.a.u.invoke(Float.valueOf(f));
    }

    @Override // defpackage.GB0
    public final /* synthetic */ void j(int i) {
    }

    @Override // defpackage.InterfaceC0113Bf
    public final void k(int i, long j, long j2) {
        int i2;
        if (this.r1) {
            XQ xq = this.j;
            C7467uj1 c7467uj1 = this.a;
            if (xq == null) {
                c7467uj1.e.a(Long.valueOf(j2), 0, 0, null);
                return;
            }
            xq.g2();
            C6666qX c6666qX = xq.P;
            boolean z = c6666qX != null && ((i2 = c6666qX.v) == 90 || i2 == 270);
            c7467uj1.e.a(Long.valueOf(j2), Integer.valueOf(c6666qX != null ? z ? c6666qX.s : c6666qX.t : 0), Integer.valueOf(c6666qX != null ? z ? c6666qX.t : c6666qX.s : 0), c6666qX != null ? c6666qX.a : null);
        }
    }

    @Override // defpackage.PL
    public final void k0(int i, C0456Fp0 c0456Fp0) {
        AbstractC6864rZ1.b("DRM Info", "onDrmSessionReleased");
    }

    @Override // defpackage.PL
    public final void l(int i, C0456Fp0 c0456Fp0, int i2) {
        AbstractC6864rZ1.b("DRM Info", "onDrmSessionAcquired");
    }

    @Override // defpackage.GB0
    public final /* synthetic */ void m(boolean z) {
    }

    @Override // defpackage.GB0
    public final void n(C7554vB c7554vB) {
        if (c7554vB.a.isEmpty()) {
            return;
        }
        P70 p70 = c7554vB.a;
        if (((C7363uB) p70.get(0)).a != null) {
            this.a.y.invoke(((C7363uB) p70.get(0)).a.toString());
        }
    }

    public final RL o(UUID uuid, C6030nC c6030nC, int i) throws C1443Sg1 {
        if (AbstractC0277Dh1.a < 18) {
            return null;
        }
        try {
            try {
                try {
                    C1857Xo1 c1857Xo1 = new C1857Xo1(c6030nC.b, v(false));
                    String[] strArr = c6030nC.c;
                    for (int i2 = 0; i2 < strArr.length - 1; i2 += 2) {
                        try {
                            c1857Xo1.R(strArr[i2], strArr[i2 + 1]);
                        } catch (Exception e) {
                            e = e;
                            if (i < 3) {
                                return o(uuid, c6030nC, i + 1);
                            }
                            this.a.c.b(e.toString(), e, "3006");
                            return null;
                        }
                    }
                    try {
                        VY vy = new VY(uuid);
                        if (this.E) {
                            ((MediaDrm) vy.d).setPropertyString("securityLevel", "L3");
                        }
                        HashMap map = new HashMap();
                        UUID uuid2 = AbstractC1063Nk.a;
                        int[] iArr = new int[0];
                        C3547eG c3547eG = new C3547eG(-1, 0);
                        C1724Vw0 c1724Vw0 = new C1724Vw0(8, vy);
                        map.clear();
                        return new C6039nF(uuid, c1724Vw0, c1857Xo1, map, c6030nC.d, iArr, true, c3547eG, 300000L);
                    } catch (UnsupportedSchemeException e2) {
                        throw new C1443Sg1(1, e2);
                    } catch (Exception e3) {
                        throw new C1443Sg1(2, e3);
                    }
                } catch (C1443Sg1 e4) {
                    throw e4;
                }
            } catch (Exception e5) {
                e = e5;
            }
        } catch (C1443Sg1 e6) {
            throw e6;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        try {
            ServiceConnectionC6055nK0 serviceConnectionC6055nK0 = this.m;
            if (serviceConnectionC6055nK0 != null) {
                this.u1.unbindService(serviceConnectionC6055nK0);
            }
        } catch (Exception unused) {
            AbstractC6864rZ1.e("ReactExoplayerView", "Cloud not cleanup playback service");
        }
        super.onDetachedFromWindow();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostDestroy() {
        this.v1.abandonAudioFocus(this.y1);
        Z();
        this.u1.removeLifecycleEventListener(this);
        Z();
        this.C1 = true;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostPause() {
        this.t = true;
        Activity currentActivity = this.u1.a.getCurrentActivity();
        int i = AbstractC0277Dh1.a;
        boolean z = i >= 24 && currentActivity != null && currentActivity.isInPictureInPictureMode();
        boolean z2 = i >= 24 && currentActivity != null && currentActivity.isInMultiWindowMode();
        if (this.q1 || z || z2) {
            return;
        }
        setPlayWhenReady(false);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostResume() {
        if (!this.q1 || !this.t) {
            setPlayWhenReady(!this.u);
        }
        this.t = false;
    }

    @Override // defpackage.GB0
    public final void p(C3615ec1 c3615ec1) {
        C7467uj1 c7467uj1 = this.a;
        c7467uj1.w.invoke(getTextTrackInfo());
        c7467uj1.v.invoke(getAudioTrackInfo());
        c7467uj1.x.invoke(getVideoTrackInfo());
    }

    @Override // defpackage.GB0
    public final void q(IB0 ib0, FB0 fb0) throws MissingResourceException, NumberFormatException {
        String strI;
        int i;
        int i2;
        int i3;
        VV vv = fb0.a;
        if (vv.a.get(4) || vv.a.get(5)) {
            XQ xq = (XQ) ib0;
            int iK1 = xq.K1();
            boolean zJ1 = xq.J1();
            String str = "onStateChanged: playWhenReady=" + zJ1 + ", playbackState=";
            C7467uj1 c7467uj1 = this.a;
            c7467uj1.t.invoke(Float.valueOf((zJ1 && iK1 == 3) ? 1.0f : 0.0f));
            F3 f3 = this.G1;
            boolean z = true;
            if (iK1 == 1) {
                String strI2 = AbstractC8235ym.i(str, "idle");
                c7467uj1.p.invoke();
                f3.removeMessages(1);
                if (!xq.J1()) {
                    setKeepScreenOn(false);
                }
                strI = strI2;
            } else if (iK1 == 2) {
                strI = str + "buffering";
                U(true);
                f3.removeMessages(1);
                setKeepScreenOn(this.d0);
            } else if (iK1 == 3) {
                String strI3 = AbstractC8235ym.i(str, "ready");
                c7467uj1.m.invoke();
                U(false);
                f3.removeMessages(1);
                f3.sendEmptyMessage(1);
                if (!this.j.M1() && this.r) {
                    this.r = false;
                    String str2 = this.R;
                    if (str2 != null) {
                        String str3 = this.S;
                        this.R = str2;
                        this.S = str3;
                        a0(1, str2, str3);
                    }
                    String str4 = this.T;
                    if (str4 != null) {
                        String str5 = this.U;
                        this.T = str4;
                        this.U = str5;
                        if (!this.r) {
                            a0(2, str4, str5);
                        }
                    }
                    String str6 = this.V;
                    if (str6 != null) {
                        String str7 = this.W;
                        this.V = str6;
                        this.W = str7;
                        a0(3, str6, str7);
                    }
                    XQ xq2 = this.j;
                    xq2.g2();
                    C6666qX c6666qX = xq2.P;
                    if (c6666qX == null || ((i3 = c6666qX.v) != 90 && i3 != 270)) {
                        z = false;
                    }
                    if (c6666qX != null) {
                        i = z ? c6666qX.t : c6666qX.s;
                    } else {
                        i = 0;
                    }
                    if (c6666qX != null) {
                        i2 = z ? c6666qX.s : c6666qX.t;
                    } else {
                        i2 = 0;
                    }
                    final String str8 = c6666qX != null ? c6666qX.a : null;
                    final long jI1 = this.j.I1();
                    final long jE1 = this.j.E1();
                    final ArrayList<C0960Mb1> audioTrackInfo = getAudioTrackInfo();
                    final ArrayList<C0960Mb1> textTrackInfo = getTextTrackInfo();
                    if (this.P.h != -1) {
                        final int i4 = i;
                        final int i5 = i2;
                        Executors.newSingleThreadExecutor().execute(new Runnable() { // from class: iK0
                            @Override // java.lang.Runnable
                            public final void run() {
                                C6818rK0.f(this.a, jI1, jE1, i4, i5, audioTrackInfo, textTrackInfo, str8);
                            }
                        });
                    } else {
                        c7467uj1.b.a(Long.valueOf(jI1), Long.valueOf(jE1), Integer.valueOf(i), Integer.valueOf(i2), audioTrackInfo, textTrackInfo, getVideoTrackInfo(), str8);
                        X();
                    }
                }
                if (this.G && this.F) {
                    this.G = false;
                    a0(2, this.T, this.U);
                }
                C6509pi0 c6509pi0 = this.d;
                if (c6509pi0 != null) {
                    c6509pi0.e();
                }
                setKeepScreenOn(this.d0);
                strI = strI3;
            } else if (iK1 != 4) {
                strI = AbstractC8235ym.i(str, "unknown");
            } else {
                strI = str + "ended";
                f0();
                c7467uj1.h.invoke();
                this.v1.abandonAudioFocus(this.y1);
                setKeepScreenOn(false);
            }
            AbstractC6864rZ1.b("ReactExoplayerView", strI);
        }
    }

    @Override // defpackage.GB0
    public final void r(int i, HB0 hb0, HB0 hb02) throws MissingResourceException, NumberFormatException {
        if (i == 1) {
            this.N = true;
            this.O = hb02.f;
            if (this.F) {
                a0(2, this.T, this.U);
            }
        }
        if (this.l) {
            g0();
        }
        if (this.F) {
            a0(2, this.T, this.U);
            this.G = true;
        }
        if (i == 0) {
            XQ xq = this.j;
            xq.g2();
            if (xq.F == 1) {
                f0();
                this.a.h.invoke();
            }
        }
    }

    public void setAudioOutput(EnumC6293oa enumC6293oa) {
        if (this.B != enumC6293oa) {
            this.B = enumC6293oa;
            E(enumC6293oa);
        }
    }

    public void setCmcdConfigurationFactory(InterfaceC0701It interfaceC0701It) {
        this.F1 = interfaceC0701It;
    }

    public void setControls(boolean z) {
        this.s1 = z;
        if (z) {
            if (this.d != null) {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                this.d.setLayoutParams(layoutParams);
                int iIndexOfChild = indexOfChild(this.d);
                if (iIndexOfChild != -1) {
                    removeViewAt(iIndexOfChild);
                }
                addView(this.d, 1, layoutParams);
                W(this.d);
            }
            e0();
        } else {
            int iIndexOfChild2 = indexOfChild(this.d);
            if (iIndexOfChild2 != -1) {
                removeViewAt(iIndexOfChild2);
            }
        }
        X();
    }

    public void setControlsStyles(C3491dz c3491dz) {
        this.L = c3491dz;
        X();
    }

    public void setDebug(boolean z) {
        this.o = z;
        Y();
    }

    public void setDisableDisconnectError(boolean z) {
        this.c0 = z;
    }

    public void setDisableFocus(boolean z) {
        this.a0 = z;
    }

    public void setEnterPictureInPictureOnLeave(boolean z) {
        boolean z2 = Build.VERSION.SDK_INT >= 24 && z;
        this.x = z2;
        AbstractC6441pL1.a(this.u1, this.y, z2);
    }

    @Override // android.view.View
    public void setFocusable(boolean z) {
        this.b0 = z;
        this.g.setFocusable(z);
    }

    public void setFullscreen(boolean z) {
        if (z == this.s) {
            return;
        }
        this.s = z;
        if (this.u1.a.getCurrentActivity() == null) {
            return;
        }
        boolean z2 = this.s;
        C7467uj1 c7467uj1 = this.a;
        if (z2) {
            this.h = new DialogC5335jZ(getContext(), this.g, this, this.d, new MB(this, 2), this.L);
            c7467uj1.i.invoke();
            DialogC5335jZ dialogC5335jZ = this.h;
            if (dialogC5335jZ != null) {
                dialogC5335jZ.show();
            }
            UiThreadUtil.runOnUiThread(new RunnableC5673lK0(this, 0));
        } else {
            c7467uj1.k.invoke();
            DialogC5335jZ dialogC5335jZ2 = this.h;
            if (dialogC5335jZ2 != null) {
                dialogC5335jZ2.dismiss();
                W(this.g);
                W(this.d);
                setControls(this.s1);
            }
            UiThreadUtil.runOnUiThread(new RunnableC5673lK0(this, 1));
        }
        e0();
    }

    public void setHideShutterView(boolean z) {
        this.g.setHideShutterView(z);
    }

    public void setIsInPictureInPicture(boolean z) {
        this.a.z.invoke(Boolean.valueOf(z));
        DialogC5335jZ dialogC5335jZ = this.h;
        int i = 0;
        if (dialogC5335jZ != null && dialogC5335jZ.isShowing()) {
            if (z) {
                DialogC5335jZ dialogC5335jZ2 = this.h;
                FrameLayout frameLayout = dialogC5335jZ2.g;
                int childCount = frameLayout.getChildCount();
                while (i < childCount) {
                    if (frameLayout.getChildAt(i) != dialogC5335jZ2.a) {
                        frameLayout.getChildAt(i).setVisibility(8);
                    }
                    i++;
                }
                return;
            }
            return;
        }
        Activity currentActivity = this.u1.a.getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) currentActivity.getWindow().getDecorView().findViewById(R.id.content);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        ArrayList arrayList = this.M;
        if (!z) {
            viewGroup.removeView(this.g);
            if (arrayList.isEmpty()) {
                return;
            }
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                viewGroup.getChildAt(i2).setVisibility(((Integer) arrayList.get(i2)).intValue());
            }
            addView(this.g, 0, layoutParams);
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) this.g.getParent();
        if (viewGroup2 != null) {
            viewGroup2.removeView(this.g);
        }
        while (i < viewGroup.getChildCount()) {
            if (viewGroup.getChildAt(i) != this.g) {
                arrayList.add(Integer.valueOf(viewGroup.getChildAt(i).getVisibility()));
                viewGroup.getChildAt(i).setVisibility(8);
            }
            i++;
        }
        viewGroup.addView(this.g, layoutParams);
    }

    public void setMaxBitRateModifier(int i) {
        this.D = i;
        if (this.j != null) {
            String str = this.T;
            if (str == null || "auto".equals(str)) {
                C2103aH c2103aH = this.k;
                TG tgF = c2103aH.f();
                tgF.getClass();
                SG sg = new SG(tgF);
                int i2 = this.D;
                if (i2 == 0) {
                    i2 = Integer.MAX_VALUE;
                }
                sg.d = i2;
                c2103aH.l(new TG(sg));
            }
        }
    }

    public void setMutedModifier(boolean z) {
        this.w = z;
        XQ xq = this.j;
        if (xq != null) {
            xq.a2(z ? 0.0f : this.C);
        }
    }

    public void setPausedModifier(boolean z) {
        this.u = z;
        XQ xq = this.j;
        if (xq != null) {
            if (z) {
                V();
                return;
            }
            if (!xq.J1()) {
                setPlayWhenReady(true);
            }
            setKeepScreenOn(this.d0);
        }
    }

    public void setPlayInBackground(boolean z) {
        this.q1 = z;
    }

    public void setPreventsDisplaySleepDuringVideoPlayback(boolean z) {
        this.d0 = z;
    }

    public void setProgressUpdateInterval(float f) {
        this.e0 = f;
    }

    public void setRateModifier(float f) {
        if (f <= 0.0f) {
            AbstractC6864rZ1.e("ReactExoplayerView", "cannot set rate <= 0");
            return;
        }
        this.A = f;
        if (this.j != null) {
            this.j.X1(new CB0(this.A, 1.0f));
        }
    }

    public void setRepeatModifier(boolean z) {
        XQ xq = this.j;
        if (xq != null) {
            if (z) {
                xq.Y1(1);
            } else {
                xq.Y1(0);
            }
        }
        this.Q = z;
    }

    public void setReportBandwidth(boolean z) {
        this.r1 = z;
    }

    public void setResizeModeModifier(int i) {
        C3771fR c3771fR = this.g;
        if (c3771fR != null) {
            c3771fR.setResizeMode(i);
        }
    }

    public void setShowNotificationControls(boolean z) {
        this.t1 = z;
        ServiceConnectionC6055nK0 serviceConnectionC6055nK0 = this.m;
        if (serviceConnectionC6055nK0 == null && z) {
            c0();
            return;
        }
        if (z || serviceConnectionC6055nK0 == null || serviceConnectionC6055nK0 == null) {
            return;
        }
        try {
            this.u1.unbindService(serviceConnectionC6055nK0);
        } catch (Exception unused) {
            AbstractC6864rZ1.e("ReactExoplayerView", "Cloud not cleanup playback service");
        }
    }

    public void setShutterColor(Integer num) {
        this.g.setShutterColor(num.intValue());
    }

    public void setSrc(V21 v21) {
        WC wc;
        XQ xq;
        Pair pairO1;
        if (v21.b != null) {
            this.p = -1;
            this.q = -9223372036854775807L;
            V21 v212 = this.P;
            O90.f(v212, "source");
            boolean zEquals = v21.equals(v212);
            this.E = false;
            this.P = v21;
            this.i = AbstractC3988gZ1.b(this.u1, this.c, v21.l);
            C1375Rk c1375Rk = v21.o;
            if (c1375Rk != null) {
                setCmcdConfigurationFactory(new B7(3, new C3513e41(c1375Rk)));
            } else {
                setCmcdConfigurationFactory(null);
            }
            if (zEquals) {
                return;
            }
            this.l = true;
            RunnableC5482kK0 runnableC5482kK0 = new RunnableC5482kK0(this, this.P, this, this.u1.a.getCurrentActivity());
            this.I = runnableC5482kK0;
            this.H.postDelayed(runnableC5482kK0, 1L);
            return;
        }
        if (this.P.b != null && (xq = this.j) != null) {
            xq.g2();
            xq.B.d(1, xq.J1());
            xq.b2(null);
            C3769fQ0 c3769fQ0 = C3769fQ0.e;
            long j = xq.u1.s;
            new C7554vB(c3769fQ0);
            XQ xq2 = this.j;
            xq2.getClass();
            xq2.g2();
            ArrayList arrayList = xq2.p;
            int size = arrayList.size();
            int iMin = Math.min(Integer.MAX_VALUE, size);
            if (size > 0 && iMin != 0) {
                BB0 bb0 = xq2.u1;
                int iH1 = xq2.H1(bb0);
                long jA1 = xq2.A1(bb0);
                int size2 = arrayList.size();
                xq2.H++;
                xq2.S1(iMin);
                SB0 sb0 = new SB0(xq2.p, xq2.L);
                AbstractC0178Ca1 abstractC0178Ca1 = bb0.a;
                if (abstractC0178Ca1.p() || sb0.p()) {
                    boolean z = !abstractC0178Ca1.p() && sb0.p();
                    int i = z ? -1 : iH1;
                    if (z) {
                        jA1 = -9223372036854775807L;
                    }
                    pairO1 = xq2.O1(sb0, i, jA1);
                } else {
                    pairO1 = abstractC0178Ca1.i((C0100Ba1) xq2.b, xq2.o, iH1, AbstractC0277Dh1.Q(jA1));
                    Object obj = pairO1.first;
                    if (sb0.b(obj) == -1) {
                        int iH = C3390dR.H((C0100Ba1) xq2.b, xq2.o, xq2.F, xq2.G, obj, abstractC0178Ca1, sb0);
                        if (iH != -1) {
                            C0100Ba1 c0100Ba1 = (C0100Ba1) xq2.b;
                            sb0.m(iH, c0100Ba1, 0L);
                            pairO1 = xq2.O1(sb0, iH, AbstractC0277Dh1.d0(c0100Ba1.l));
                        } else {
                            pairO1 = xq2.O1(sb0, -1, -9223372036854775807L);
                        }
                    }
                }
                BB0 bb0N1 = xq2.N1(bb0, sb0, pairO1);
                int i2 = bb0N1.e;
                BB0 bb0G = (i2 == 1 || i2 == 4 || iMin <= 0 || iMin != size2 || iH1 < bb0N1.a.o()) ? bb0N1 : bb0N1.g(4);
                C8280z01 c8280z01 = xq2.L;
                R71 r71 = xq2.l.h;
                r71.getClass();
                Q71 q71B = R71.b();
                q71B.a = r71.a.obtainMessage(20, 0, iMin, c8280z01);
                q71B.b();
                xq2.e2(bb0G, 0, !bb0G.b.a.equals(xq2.u1.b.a), 4, xq2.F1(bb0G), -1, false);
            }
        }
        C3771fR c3771fR = this.g;
        if (c3771fR.m) {
            c3771fR.e.removeView(c3771fR.i);
            wc = null;
            c3771fR.i = null;
            c3771fR.m = false;
        } else {
            wc = null;
        }
        this.P = new V21();
        this.i = wc;
        this.p = -1;
        this.q = -9223372036854775807L;
    }

    public void setSubtitleStyle(C3710f61 c3710f61) {
        this.g.setSubtitleStyle(c3710f61);
    }

    public void setViewType(int i) {
        this.g.d(i);
    }

    public void setVolumeModifier(float f) {
        this.C = f;
        XQ xq = this.j;
        if (xq != null) {
            xq.a2(f);
        }
    }

    @Override // defpackage.GB0
    public final /* synthetic */ void t(C7484up0 c7484up0) {
    }

    @Override // defpackage.GB0
    public final /* synthetic */ void u(IQ iq) {
    }

    public final C6860rY0 v(boolean z) {
        PE pe = z ? this.c : null;
        HashMap map = this.P.l;
        S91 s91 = this.u1;
        O90.f(s91, "context");
        if (AbstractC3988gZ1.b == null || (map != null && !map.isEmpty())) {
            AbstractC3988gZ1.b = AbstractC3988gZ1.a(s91, pe, map);
        }
        C6860rY0 c6860rY0 = AbstractC3988gZ1.b;
        O90.d(c6860rY0, "null cannot be cast to non-null type androidx.media3.datasource.HttpDataSource.Factory");
        return c6860rY0;
    }

    @Override // defpackage.GB0
    public final /* synthetic */ void w(int i) {
    }

    @Override // defpackage.GB0
    public final void x(IQ iq) {
        String strConcat = "ExoPlaybackException: ".concat(AB0.a(iq.a));
        StringBuilder sb = new StringBuilder("2");
        int i = iq.a;
        sb.append(i);
        String string = sb.toString();
        if ((i == 6000 || i == 6002 || i == 6004 || i == 6006 || i == 6007) && !this.E) {
            this.E = true;
            this.l = true;
            g0();
            RunnableC5482kK0 runnableC5482kK0 = new RunnableC5482kK0(this, this.P, this, this.u1.a.getCurrentActivity());
            this.I = runnableC5482kK0;
            this.H.postDelayed(runnableC5482kK0, 1L);
            setPlayWhenReady(true);
            return;
        }
        this.a.c.b(strConcat, iq, string);
        this.l = true;
        if (i != 1002) {
            g0();
            return;
        }
        this.p = -1;
        this.q = -9223372036854775807L;
        XQ xq = this.j;
        if (xq != null) {
            xq.o1(xq.D1(), -9223372036854775807L, false);
            this.j.Q1();
        }
    }

    @Override // defpackage.GB0
    public final /* synthetic */ void y() {
    }

    @Override // defpackage.GB0
    public final /* synthetic */ void z(boolean z) {
    }

    @Override // defpackage.GB0
    public final void g(boolean z) {
    }

    @Override // defpackage.GB0
    public final void s(int i) {
    }

    public void setBufferingStrategy(EnumC0905Lj enumC0905Lj) {
    }
}
