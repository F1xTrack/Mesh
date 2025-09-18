package p000;

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
public final class C10891rK0 extends FrameLayout implements LifecycleEventListener, GB0, InterfaceC0105Bf, InterfaceC1801bh, InterfaceC0966PL {

    /* renamed from: H1 */
    public static final CookieManager f41528H1;

    /* renamed from: A */
    public float f41529A;

    /* renamed from: A1 */
    public long f41530A1;

    /* renamed from: B */
    public EnumC6561oa f41531B;

    /* renamed from: B1 */
    public long f41532B1;

    /* renamed from: C */
    public float f41533C;

    /* renamed from: C1 */
    public boolean f41534C1;

    /* renamed from: D */
    public int f41535D;

    /* renamed from: D1 */
    public int f41536D1;

    /* renamed from: E */
    public boolean f41537E;

    /* renamed from: E1 */
    public final String f41538E1;

    /* renamed from: F */
    public boolean f41539F;

    /* renamed from: F1 */
    public InterfaceC0560It f41540F1;

    /* renamed from: G */
    public boolean f41541G;

    /* renamed from: G1 */
    public final HandlerC0319F3 f41542G1;

    /* renamed from: H */
    public final Handler f41543H;

    /* renamed from: I */
    public RunnableC9995kK0 f41544I;

    /* renamed from: J */
    public final RunnableC1192Sx f41545J;

    /* renamed from: K */
    public boolean f41546K;

    /* renamed from: L */
    public C3961dz f41547L;

    /* renamed from: M */
    public final ArrayList f41548M;

    /* renamed from: N */
    public boolean f41549N;

    /* renamed from: O */
    public long f41550O;

    /* renamed from: P */
    public V21 f41551P;

    /* renamed from: Q */
    public boolean f41552Q;

    /* renamed from: R */
    public String f41553R;

    /* renamed from: S */
    public String f41554S;

    /* renamed from: T */
    public String f41555T;

    /* renamed from: U */
    public String f41556U;

    /* renamed from: V */
    public String f41557V;

    /* renamed from: W */
    public String f41558W;

    /* renamed from: a */
    public final C11326uj1 f41559a;

    /* renamed from: a0 */
    public boolean f41560a0;

    /* renamed from: b */
    public final InterfaceC9355fK0 f41561b;

    /* renamed from: b0 */
    public boolean f41562b0;

    /* renamed from: c */
    public final C0959PE f41563c;

    /* renamed from: c0 */
    public boolean f41564c0;

    /* renamed from: d */
    public C10683pi0 f41565d;

    /* renamed from: d0 */
    public boolean f41566d0;

    /* renamed from: e */
    public View f41567e;

    /* renamed from: e0 */
    public float f41568e0;

    /* renamed from: f */
    public C3990eR f41569f;

    /* renamed from: g */
    public final C4053fR f41570g;

    /* renamed from: h */
    public DialogC6245jZ f41571h;

    /* renamed from: i */
    public InterfaceC1397WC f41572i;

    /* renamed from: j */
    public C1474XQ f41573j;

    /* renamed from: k */
    public C1654aH f41574k;

    /* renamed from: l */
    public boolean f41575l;

    /* renamed from: m */
    public ServiceConnectionC10379nK0 f41576m;

    /* renamed from: n */
    public C0278EP f41577n;

    /* renamed from: o */
    public boolean f41578o;

    /* renamed from: p */
    public int f41579p;

    /* renamed from: q */
    public long f41580q;

    /* renamed from: q1 */
    public boolean f41581q1;

    /* renamed from: r */
    public boolean f41582r;

    /* renamed from: r1 */
    public boolean f41583r1;

    /* renamed from: s */
    public boolean f41584s;

    /* renamed from: s1 */
    public boolean f41585s1;

    /* renamed from: t */
    public boolean f41586t;

    /* renamed from: t1 */
    public boolean f41587t1;

    /* renamed from: u */
    public boolean f41588u;

    /* renamed from: u1 */
    public final S91 f41589u1;

    /* renamed from: v */
    public boolean f41590v;

    /* renamed from: v1 */
    public final AudioManager f41591v1;

    /* renamed from: w */
    public boolean f41592w;

    /* renamed from: w1 */
    public final C1142S9 f41593w1;

    /* renamed from: x */
    public boolean f41594x;

    /* renamed from: x1 */
    public final C1142S9 f41595x1;

    /* renamed from: y */
    public final PictureInPictureParams.Builder f41596y;

    /* renamed from: y1 */
    public final C6309ka f41597y1;

    /* renamed from: z */
    public boolean f41598z;

    /* renamed from: z1 */
    public long f41599z1;

    static {
        CookieManager cookieManager = new CookieManager();
        f41528H1 = cookieManager;
        cookieManager.setCookiePolicy(CookiePolicy.ACCEPT_ORIGINAL_SERVER);
    }

    public C10891rK0(S91 s91, InterfaceC9355fK0 interfaceC9355fK0) {
        super(s91);
        this.f41577n = null;
        this.f41578o = false;
        this.f41592w = false;
        this.f41594x = false;
        this.f41598z = false;
        this.f41529A = 1.0f;
        this.f41531B = EnumC6561oa.f39094d;
        this.f41533C = 1.0f;
        this.f41535D = 0;
        this.f41537E = false;
        this.f41539F = false;
        this.f41541G = false;
        this.f41546K = false;
        this.f41547L = new C3961dz();
        this.f41548M = new ArrayList();
        this.f41549N = false;
        this.f41550O = -1L;
        this.f41551P = new V21();
        this.f41557V = "disabled";
        this.f41562b0 = true;
        this.f41566d0 = true;
        this.f41568e0 = 250.0f;
        this.f41581q1 = false;
        this.f41583r1 = false;
        this.f41587t1 = false;
        this.f41599z1 = -1L;
        this.f41530A1 = -1L;
        this.f41532B1 = -1L;
        this.f41534C1 = false;
        this.f41536D1 = 1;
        this.f41538E1 = String.valueOf(UUID.randomUUID());
        this.f41542G1 = new HandlerC0319F3(this, Looper.getMainLooper(), 4);
        this.f41589u1 = s91;
        this.f41559a = new C11326uj1();
        this.f41561b = interfaceC9355fK0;
        this.f41563c = (C0959PE) ((C0926Oi) interfaceC9355fK0).f8576c;
        int i = Build.VERSION.SDK_INT;
        if (i >= 26 && this.f41596y == null) {
            this.f41596y = AbstractC8962cI0.m10646f();
        }
        this.f41543H = new Handler();
        CookieHandler cookieHandler = CookieHandler.getDefault();
        CookieManager cookieManager = f41528H1;
        if (cookieHandler != cookieManager) {
            CookieHandler.setDefault(cookieManager);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        C4053fR c4053fR = new C4053fR(getContext());
        this.f41570g = c4053fR;
        c4053fR.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC6974uq(3, this));
        this.f41570g.setLayoutParams(layoutParams);
        addView(this.f41570g, 0, layoutParams);
        this.f41570g.setFocusable(this.f41562b0);
        this.f41591v1 = (AudioManager) s91.getSystemService("audio");
        s91.addLifecycleEventListener(this);
        AbstractActivityC0499Hv abstractActivityC0499HvM23985a = AbstractC10766qL1.m23985a(s91);
        C4027f1 c4027f1 = new C4027f1(this, 12, abstractActivityC0499HvM23985a);
        C10801qd0 c10801qd0 = new C10801qd0(16, this);
        abstractActivityC0499HvM23985a.addOnPictureInPictureModeChangedListener(new C9337fB0(c4027f1));
        if (i >= 24 && i < 31) {
            abstractActivityC0499HvM23985a.addOnUserLeaveHintListener(new RunnableC9209eB0(c10801qd0, 0));
        }
        this.f41545J = new RunnableC1192Sx(s91, c4027f1, c10801qd0, 5);
        this.f41593w1 = new C1142S9(s91);
        this.f41597y1 = new C6309ka(s91, this);
        this.f41595x1 = new C1142S9(s91, this);
    }

    /* renamed from: L */
    public static C7941Mb1 m24288L(C6686qX c6686qX, int i, InterfaceC6237jR interfaceC6237jR, C8149Qb1 c8149Qb1) {
        C7941Mb1 c7941Mb1 = new C7941Mb1();
        String str = c6686qX.f40974m;
        if (str != null) {
            c7941Mb1.f7252b = str;
        }
        String str2 = c6686qX.f40965d;
        if (str2 != null) {
            c7941Mb1.f7253c = str2;
        }
        String str3 = c6686qX.f40963b;
        if (str3 != null) {
            c7941Mb1.f7251a = str3;
        }
        c7941Mb1.f7254d = (interfaceC6237jR == null || interfaceC6237jR.mo2724d() != c8149Qb1 || interfaceC6237jR.mo2737t(i) == -1) ? false : true;
        return c7941Mb1;
    }

    /* renamed from: M */
    public static C8477Wj1 m24289M(C6686qX c6686qX, int i) {
        C8477Wj1 c8477Wj1 = new C8477Wj1();
        c8477Wj1.f13352d = "";
        c8477Wj1.f13353e = -1;
        c8477Wj1.f13354f = "";
        int i2 = c6686qX.f40980s;
        if (i2 == -1) {
            i2 = 0;
        }
        c8477Wj1.f13349a = i2;
        int i3 = c6686qX.f40981t;
        if (i3 == -1) {
            i3 = 0;
        }
        c8477Wj1.f13350b = i3;
        int i4 = c6686qX.f40970i;
        c8477Wj1.f13351c = i4 != -1 ? i4 : 0;
        c8477Wj1.f13355g = c6686qX.f40983v;
        String str = c6686qX.f40971j;
        if (str != null) {
            c8477Wj1.f13352d = str;
        }
        String strValueOf = c6686qX.f40962a;
        if (strValueOf == null) {
            strValueOf = String.valueOf(i);
        }
        O90.m5968f(strValueOf, "<set-?>");
        c8477Wj1.f13354f = strValueOf;
        c8477Wj1.f13353e = i;
        return c8477Wj1;
    }

    /* renamed from: O */
    public static int m24290O(C8201Rb1 c8201Rb1) throws MissingResourceException {
        if (c8201Rb1.f10321a == 0) {
            return -1;
        }
        String language = Locale.getDefault().getLanguage();
        String iSO3Language = Locale.getDefault().getISO3Language();
        for (int i = 0; i < c8201Rb1.f10321a; i++) {
            String str = c8201Rb1.m7046a(i).f9690d[0].f40965d;
            if (str != null && (str.equals(language) || str.equals(iSO3Language))) {
                return i;
            }
        }
        return 0;
    }

    /* renamed from: T */
    public static boolean m24291T(C6686qX c6686qX) {
        int i = c6686qX.f40980s;
        if (i == -1) {
            i = 0;
        }
        int i2 = c6686qX.f40981t;
        int i3 = i2 != -1 ? i2 : 0;
        float f = c6686qX.f40982u;
        if (f == -1.0f) {
            f = 0.0f;
        }
        String str = c6686qX.f40974m;
        if (str == null) {
            return true;
        }
        try {
            return AbstractC8642Zo0.m9603e(str).m5853f(f, i, i3);
        } catch (Exception unused) {
            return true;
        }
    }

    /* renamed from: f */
    public static /* synthetic */ void m24292f(C10891rK0 c10891rK0, long j, long j2, int i, int i2, ArrayList arrayList, ArrayList arrayList2, String str) {
        ArrayList<C8477Wj1> videoTrackInfoFromManifest = c10891rK0.getVideoTrackInfoFromManifest();
        if (videoTrackInfoFromManifest != null) {
            c10891rK0.f41539F = true;
        }
        c10891rK0.f41559a.f43813b.m22936a(Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), Integer.valueOf(i2), arrayList, arrayList2, videoTrackInfoFromManifest, str);
    }

    private ArrayList<C7941Mb1> getAudioTrackInfo() {
        ArrayList<C7941Mb1> arrayList = new ArrayList<>();
        C1654aH c1654aH = this.f41574k;
        if (c1654aH == null) {
            return arrayList;
        }
        C4218i3 c4218i3 = c1654aH.f41155c;
        int iM24297P = m24297P(1);
        if (c4218i3 != null && iM24297P != -1) {
            C8201Rb1 c8201Rb1 = ((C8201Rb1[]) c4218i3.f28783c)[iM24297P];
            C1474XQ c1474xq = this.f41573j;
            c1474xq.m9035g2();
            InterfaceC6237jR[] interfaceC6237jRArr = (InterfaceC6237jR[]) c1474xq.f13743u1.f631i.f17090c;
            int length = interfaceC6237jRArr.length;
            InterfaceC6237jR interfaceC6237jR = interfaceC6237jRArr[1];
            for (int i = 0; i < c8201Rb1.f10321a; i++) {
                C8149Qb1 c8149Qb1M7046a = c8201Rb1.m7046a(i);
                C6686qX c6686qX = c8149Qb1M7046a.f9690d[0];
                C7941Mb1 c7941Mb1M24288L = m24288L(c6686qX, i, interfaceC6237jR, c8149Qb1M7046a);
                int i2 = c6686qX.f40970i;
                if (i2 == -1) {
                    i2 = 0;
                }
                c7941Mb1M24288L.f7255e = i2;
                arrayList.add(c7941Mb1M24288L);
            }
        }
        return arrayList;
    }

    private ArrayList<C7941Mb1> getTextTrackInfo() {
        ArrayList<C7941Mb1> arrayList = new ArrayList<>();
        C1654aH c1654aH = this.f41574k;
        if (c1654aH == null) {
            return arrayList;
        }
        C4218i3 c4218i3 = c1654aH.f41155c;
        int iM24297P = m24297P(3);
        if (c4218i3 != null && iM24297P != -1) {
            C1474XQ c1474xq = this.f41573j;
            c1474xq.m9035g2();
            InterfaceC6237jR[] interfaceC6237jRArr = (InterfaceC6237jR[]) c1474xq.f13743u1.f631i.f17090c;
            int length = interfaceC6237jRArr.length;
            InterfaceC6237jR interfaceC6237jR = interfaceC6237jRArr[2];
            C8201Rb1 c8201Rb1 = ((C8201Rb1[]) c4218i3.f28783c)[iM24297P];
            for (int i = 0; i < c8201Rb1.f10321a; i++) {
                C8149Qb1 c8149Qb1M7046a = c8201Rb1.m7046a(i);
                arrayList.add(m24288L(c8149Qb1M7046a.f9690d[0], i, interfaceC6237jR, c8149Qb1M7046a));
            }
        }
        return arrayList;
    }

    private ArrayList<C8477Wj1> getVideoTrackInfo() {
        ArrayList<C8477Wj1> arrayList = new ArrayList<>();
        C1654aH c1654aH = this.f41574k;
        if (c1654aH == null) {
            return arrayList;
        }
        C4218i3 c4218i3 = c1654aH.f41155c;
        int iM24297P = m24297P(2);
        if (c4218i3 != null && iM24297P != -1) {
            C8201Rb1 c8201Rb1 = ((C8201Rb1[]) c4218i3.f28783c)[iM24297P];
            for (int i = 0; i < c8201Rb1.f10321a; i++) {
                C8149Qb1 c8149Qb1M7046a = c8201Rb1.m7046a(i);
                for (int i2 = 0; i2 < c8149Qb1M7046a.f9687a; i2++) {
                    C6686qX c6686qX = c8149Qb1M7046a.f9690d[i2];
                    if (m24291T(c6686qX)) {
                        arrayList.add(m24289M(c6686qX, i2));
                    }
                }
            }
        }
        return arrayList;
    }

    private ArrayList<C8477Wj1> getVideoTrackInfoFromManifest() {
        return m24298Q(0);
    }

    /* renamed from: h0 */
    public static void m24293h0(int i, View view, boolean z) {
        if (z) {
            view.setVisibility(i);
        } else if (view.getVisibility() == i) {
            view.setVisibility(0);
        }
    }

    private void setPlayWhenReady(boolean z) {
        C1474XQ c1474xq = this.f41573j;
        if (c1474xq == null) {
            return;
        }
        if (!z) {
            c1474xq.m9025W1(false);
            return;
        }
        boolean z2 = this.f41560a0 || this.f41551P.f12315b == null || this.f41598z || this.f41591v1.requestAudioFocus(this.f41597y1, 3, 1) == 1;
        this.f41598z = z2;
        if (z2) {
            this.f41573j.m9025W1(true);
        }
    }

    @Override // p000.GB0
    /* renamed from: A */
    public final /* synthetic */ void mo2940A(List list) {
    }

    @Override // p000.GB0
    /* renamed from: B */
    public final /* synthetic */ void mo2941B(int i, boolean z) {
    }

    @Override // p000.GB0
    /* renamed from: C */
    public final void mo2942C(CB0 cb0) {
        this.f41559a.f43831t.invoke(Float.valueOf(cb0.f1239a));
    }

    @Override // p000.GB0
    /* renamed from: D */
    public final /* synthetic */ void mo2943D(EB0 eb0) {
    }

    /* renamed from: E */
    public final void m24294E(EnumC6561oa enumC6561oa) {
        if (this.f41573j != null) {
            int i = enumC6561oa.f39097b;
            int i2 = AbstractC7485Dh1.f2166a;
            int i3 = 4;
            int i4 = i != 0 ? i != 1 ? i != 2 ? i != 4 ? i != 5 ? i != 8 ? 1 : 3 : 5 : 4 : 6 : 13 : 2;
            if (i == 0) {
                i3 = 1;
            } else if (i != 1 && i != 2 && i != 4 && i != 5 && i != 8) {
                i3 = 2;
            }
            C1017Q9 c1017q9 = new C1017Q9(i3, i4);
            C1474XQ c1474xq = this.f41573j;
            c1474xq.m9035g2();
            if (!c1474xq.f13737r1) {
                boolean zM1812a = AbstractC7485Dh1.m1812a(c1474xq.f13715a0, c1017q9);
                C8372Uj0 c8372Uj0 = c1474xq.f13730m;
                if (!zM1812a) {
                    c1474xq.f13715a0 = c1017q9;
                    c1474xq.m9023U1(1, 3, c1017q9);
                    c8372Uj0.m8131c(20, new C0267EE(6, c1017q9));
                }
                C6372la c6372la = c1474xq.f13690B;
                c6372la.m22507b(null);
                c1474xq.f13726i.mo9693b(c1017q9);
                boolean zM9013J1 = c1474xq.m9013J1();
                int iM22509d = c6372la.m22509d(c1474xq.m9014K1(), zM9013J1);
                c1474xq.m9032d2(iM22509d, iM22509d != -1 ? 1 : 2, zM9013J1);
                c8372Uj0.m8130b();
            }
            AudioManager audioManager = (AudioManager) this.f41589u1.getSystemService("audio");
            boolean z = enumC6561oa == EnumC6561oa.f39094d;
            audioManager.setMode(z ? 0 : 3);
            audioManager.setSpeakerphoneOn(z);
        }
    }

    @Override // p000.GB0
    /* renamed from: F */
    public final void mo2944F(C7660Gr0 c7660Gr0) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            InterfaceC7556Er0[] interfaceC7556Er0Arr = c7660Gr0.f3928a;
            if (i >= interfaceC7556Er0Arr.length) {
                this.f41559a.f43828q.invoke(arrayList);
                return;
            }
            InterfaceC7556Er0 interfaceC7556Er0 = interfaceC7556Er0Arr[i];
            if (interfaceC7556Er0 instanceof V50) {
                V50 v50 = (V50) interfaceC7556Er0;
                arrayList.add(new C11817ya1(v50.f12347a, v50 instanceof C10742q91 ? ((C10742q91) v50).f40636c : ""));
            } else if (interfaceC7556Er0 instanceof C0719LP) {
                C0719LP c0719lp = (C0719LP) interfaceC7556Er0;
                arrayList.add(new C11817ya1(c0719lp.f6622a, c0719lp.f6623b));
            } else {
                AbstractC10922rZ1.m24428b("ReactExoplayerView", "unhandled metadata " + interfaceC7556Er0);
            }
            i++;
        }
    }

    @Override // p000.GB0
    /* renamed from: G */
    public final /* synthetic */ void mo2945G(C10825qp0 c10825qp0, int i) {
    }

    @Override // p000.GB0
    /* renamed from: H */
    public final /* synthetic */ void mo2946H(int i, int i2) {
    }

    @Override // p000.GB0
    /* renamed from: I */
    public final void mo2947I(boolean z) {
        C11326uj1 c11326uj1 = this.f41559a;
        if (z && this.f41549N) {
            c11326uj1.f43818g.invoke(Long.valueOf(this.f41573j.m9008E1()), Long.valueOf(this.f41550O));
        }
        PictureInPictureParams.Builder builder = this.f41596y;
        boolean z2 = !z;
        S91 s91 = this.f41589u1;
        O90.m5968f(s91, "context");
        C1142S9 c1142s9 = this.f41595x1;
        O90.m5968f(c1142s9, "receiver");
        if (builder != null && Build.VERSION.SDK_INT >= 26) {
            builder.setActions(AbstractC10638pL1.m23742b(s91, z2, c1142s9));
            PictureInPictureParams pictureInPictureParamsBuild = builder.build();
            O90.m5967e(pictureInPictureParamsBuild, "build(...)");
            AbstractC10638pL1.m23744d(s91, pictureInPictureParamsBuild);
        }
        c11326uj1.f43817f.invoke(Boolean.valueOf(z), Boolean.valueOf(this.f41549N));
        if (z) {
            this.f41549N = false;
        }
    }

    /* renamed from: J */
    public final void m24295J() {
        PictureInPictureParams pictureInPictureParamsBuild;
        int i = Build.VERSION.SDK_INT;
        S91 s91 = this.f41589u1;
        if (i >= 26) {
            this.f41596y.setActions(AbstractC10638pL1.m23742b(s91, this.f41588u, this.f41595x1));
            PictureInPictureParams.Builder builder = this.f41596y;
            C1474XQ c1474xq = this.f41573j;
            O90.m5968f(c1474xq, "player");
            c1474xq.m9035g2();
            int i2 = c1474xq.f13739s1.f11487a;
            c1474xq.m9035g2();
            Rational rational = new Rational(i2, c1474xq.f13739s1.f11488b);
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
        O90.m5968f(s91, "context");
        if (AbstractC10638pL1.m23743c(s91)) {
            if ((i >= 26) && pictureInPictureParamsBuild != null) {
                try {
                    AbstractC10766qL1.m23985a(s91).enterPictureInPictureMode(pictureInPictureParamsBuild);
                    return;
                } catch (IllegalStateException e) {
                    AbstractC10922rZ1.m24429c("PictureInPictureUtil", e.toString());
                    return;
                }
            }
            if (i >= 24) {
                try {
                    AbstractC10766qL1.m23985a(s91).enterPictureInPictureMode();
                } catch (IllegalStateException e2) {
                    AbstractC10922rZ1.m24429c("PictureInPictureUtil", e2.toString());
                }
            }
        }
    }

    /* renamed from: K */
    public final void m24296K() {
        Activity currentActivity = this.f41589u1.f10602a.getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) currentActivity.getWindow().getDecorView().findViewById(R.id.content);
        ArrayList arrayList = this.f41548M;
        if (!arrayList.isEmpty()) {
            if (this.f41570g.getParent().equals(viewGroup)) {
                viewGroup.removeView(this.f41570g);
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

    @Override // p000.InterfaceC0966PL
    /* renamed from: N */
    public final void mo1030N(int i, C7604Fp0 c7604Fp0) {
        AbstractC10922rZ1.m24428b("DRM Info", "onDrmKeysRestored");
    }

    /* renamed from: P */
    public final int m24297P(int i) {
        C1474XQ c1474xq = this.f41573j;
        if (c1474xq == null) {
            return -1;
        }
        c1474xq.m9035g2();
        int length = c1474xq.f13725h.length;
        for (int i2 = 0; i2 < length; i2++) {
            C1474XQ c1474xq2 = this.f41573j;
            c1474xq2.m9035g2();
            if (c1474xq2.f13725h[i2].f307b == i) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: Q */
    public final ArrayList m24298Q(int i) {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        try {
            ArrayList arrayList = (ArrayList) executorServiceNewSingleThreadExecutor.submit(new CallableC10507oK0(this, this.f41572i.mo506s0(), this.f41551P.f12315b, (r1.f12321h * 1000) - 100)).get(3000L, TimeUnit.MILLISECONDS);
            if (arrayList == null && i < 1) {
                return m24298Q(i + 1);
            }
            executorServiceNewSingleThreadExecutor.shutdown();
            return arrayList;
        } catch (Exception e) {
            AbstractC10922rZ1.m24431e("ReactExoplayerView", "error in getVideoTrackInfoFromManifest handling request:" + e.getMessage());
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: R */
    public final void m24299R(C10891rK0 c10891rK0) {
        C1654aH c1654aH = new C1654aH(getContext(), new OL0(7));
        c10891rK0.f41574k = c1654aH;
        C1212TG c1212tgM9694f = this.f41574k.m9694f();
        c1212tgM9694f.getClass();
        C1149SG c1149sg = new C1149SG(c1212tgM9694f);
        int i = this.f41535D;
        if (i == 0) {
            i = Integer.MAX_VALUE;
        }
        c1149sg.f14371d = i;
        c1654aH.m9698l(new C1212TG(c1149sg));
        C6224jE c6224jE = new C6224jE();
        C6635pj c6635pj = this.f41551P.f12329p;
        int i2 = c6635pj.f40341b;
        if (i2 == -1) {
            i2 = 50000;
        }
        int i3 = c6635pj.f40342c;
        if (i3 == -1) {
            i3 = 50000;
        }
        int i4 = c6635pj.f40343d;
        if (i4 == -1) {
            i4 = 2500;
        }
        int i5 = i4;
        int i6 = c6635pj.f40344e;
        if (i6 == -1) {
            i6 = 5000;
        }
        int i7 = i6;
        int i8 = c6635pj.f40345f;
        if (i8 == -1) {
            i8 = 0;
        }
        C10763qK0 c10763qK0 = new C10763qK0(c6224jE, i2, i3, i5, i7, true, i8);
        Runtime.getRuntime();
        ActivityManager activityManager = (ActivityManager) this.f41589u1.getSystemService("activity");
        double d = c6635pj.f40346g;
        if (d == -1.0d) {
            d = 1.0d;
        }
        Math.floor(activityManager.getMemoryClass() * d * 1024.0d * 1024.0d);
        X11 x11 = new X11(getContext(), 4);
        x11.f13487b = true;
        ((C0986Pf) x11.f13489d).f9216b = 1;
        C6415mG c6415mG = new C6415mG(this.f41572i);
        if (this.f41546K) {
            C10919rY0 c10919rY0M24314v = m24314v(true);
            N01 n01 = AbstractC8847bO1.f17003a;
            if (n01 != null) {
                C10189lr0 c10189lr0 = new C10189lr0(7);
                c10189lr0.f37324c = new C1210TE(14);
                c10189lr0.f37323b = n01;
                c10189lr0.f37325d = c10919rY0M24314v;
                c10919rY0M24314v = c10189lr0;
            }
            c6415mG.f37601b = c10919rY0M24314v;
            C6289kG c6289kG = c6415mG.f37600a;
            if (c10919rY0M24314v != c6289kG.f36400d) {
                c6289kG.f36400d = c10919rY0M24314v;
                c6289kG.f36398b.clear();
                c6289kG.f36399c.clear();
            }
        }
        new C7754Im0(this, 18);
        this.f41570g.getClass();
        C0657KQ c0657kq = new C0657KQ(getContext(), x11);
        C1654aH c1654aH2 = c10891rK0.f41574k;
        YN1.m9281f(!c0657kq.f6093u);
        c1654aH2.getClass();
        c0657kq.f6077e = new C6226jG(3, c1654aH2);
        YN1.m9281f(!c0657kq.f6093u);
        C0959PE c0959pe = this.f41563c;
        c0959pe.getClass();
        c0657kq.f6079g = new C6226jG(2, c0959pe);
        YN1.m9281f(!c0657kq.f6093u);
        c0657kq.f6078f = new C6226jG(1, c10763qK0);
        YN1.m9281f(!c0657kq.f6093u);
        c0657kq.f6076d = new C6226jG(4, c6415mG);
        YN1.m9281f(!c0657kq.f6093u);
        c0657kq.f6093u = true;
        this.f41573j = new C1474XQ(c0657kq);
        VL0.f12523c.m25317A().m8418a(this.f41538E1, this.f41573j);
        m24305Y();
        C1474XQ c1474xq = this.f41573j;
        c1474xq.getClass();
        c1474xq.f13730m.m8129a(c10891rK0);
        this.f41573j.m9029a2(this.f41592w ? 0.0f : this.f41533C * 1.0f);
        this.f41570g.setPlayer(this.f41573j);
        C1142S9 c1142s9 = this.f41593w1;
        c1142s9.getClass();
        c1142s9.f10600b = c10891rK0;
        AbstractC3982eJ.m17904f(c1142s9.f10601c, c1142s9, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"), 4);
        C1142S9 c1142s92 = this.f41595x1;
        c1142s92.getClass();
        AbstractC3982eJ.m17904f((S91) c1142s92.f10601c, c1142s92, new IntentFilter("rnv_media_control"), 4);
        Handler handler = new Handler();
        QQ0 qq0 = c0959pe.f8918b;
        qq0.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) qq0.f9619a;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            C0042Af c0042Af = (C0042Af) it.next();
            if (c0042Af.f302b == c10891rK0) {
                c0042Af.f303c = true;
                copyOnWriteArrayList.remove(c0042Af);
            }
        }
        copyOnWriteArrayList.add(new C0042Af(handler, c10891rK0));
        setPlayWhenReady(!this.f41588u);
        this.f41575l = true;
        this.f41573j.m9026X1(new CB0(this.f41529A, 1.0f));
        m24294E(this.f41531B);
        if (this.f41587t1) {
            m24308c0();
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
    /* renamed from: S */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m24300S(p000.V21 r47) {
        /*
            Method dump skipped, instructions count: 1434
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C10891rK0.m24300S(V21):void");
    }

    /* renamed from: U */
    public final void m24301U(boolean z) {
        if (this.f41590v == z) {
            return;
        }
        boolean z2 = this.f41588u;
        C11326uj1 c11326uj1 = this.f41559a;
        if (z2 && this.f41549N && !z) {
            c11326uj1.f43818g.invoke(Long.valueOf(this.f41573j.m9008E1()), Long.valueOf(this.f41550O));
            this.f41549N = false;
        }
        this.f41590v = z;
        c11326uj1.f43825n.invoke(Boolean.valueOf(z));
    }

    /* renamed from: V */
    public final void m24302V() {
        C1474XQ c1474xq = this.f41573j;
        if (c1474xq != null && c1474xq.m9013J1()) {
            setPlayWhenReady(false);
        }
        setKeepScreenOn(false);
    }

    /* renamed from: W */
    public final void m24303W(View view) {
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
        view.layout(view.getLeft(), view.getTop(), view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    /* renamed from: X */
    public final void m24304X() {
        boolean zM772a;
        String str;
        C10683pi0 c10683pi0 = this.f41565d;
        if (c10683pi0 == null || this.f41573j == null || !this.f41585s1) {
            return;
        }
        LinearLayout linearLayout = (LinearLayout) c10683pi0.findViewById(ru.mes.dnevnik.R.id.exo_live_container);
        TextView textView = (TextView) this.f41565d.findViewById(ru.mes.dnevnik.R.id.exo_live_label);
        AbstractC7419Ca1 abstractC7419Ca1M9010G1 = this.f41573j.m9010G1();
        if (abstractC7419Ca1M9010G1.m1259p()) {
            zM772a = false;
        } else {
            C7367Ba1 c7367Ba1 = new C7367Ba1();
            abstractC7419Ca1M9010G1.m1257n(this.f41573j.m9007D1(), c7367Ba1);
            zM772a = c7367Ba1.m772a();
        }
        if (!zM772a || (str = this.f41547L.f26468l) == null) {
            linearLayout.setVisibility(8);
        } else {
            textView.setText(str);
            linearLayout.setVisibility(0);
        }
        ImageButton imageButton = (ImageButton) this.f41565d.findViewById(ru.mes.dnevnik.R.id.exo_play);
        ImageButton imageButton2 = (ImageButton) this.f41565d.findViewById(ru.mes.dnevnik.R.id.exo_pause);
        if (this.f41547L.f26460d) {
            this.f41567e.setAlpha(0.0f);
            imageButton.setClickable(false);
            imageButton2.setClickable(false);
        } else {
            this.f41567e.setAlpha(1.0f);
            imageButton.setClickable(true);
            imageButton2.setClickable(true);
        }
        m24309d0(ru.mes.dnevnik.R.id.exo_ffwd, this.f41547L.f26461e);
        m24309d0(ru.mes.dnevnik.R.id.exo_rew, this.f41547L.f26462f);
        m24309d0(ru.mes.dnevnik.R.id.exo_next, this.f41547L.f26463g);
        m24309d0(ru.mes.dnevnik.R.id.exo_prev, this.f41547L.f26464h);
        m24293h0(8, this.f41565d.findViewById(ru.mes.dnevnik.R.id.exo_fullscreen), this.f41547L.f26465i);
        m24293h0(8, this.f41565d.findViewById(ru.mes.dnevnik.R.id.exo_position), this.f41547L.f26459c);
        m24293h0(4, this.f41565d.findViewById(ru.mes.dnevnik.R.id.exo_progress), this.f41547L.f26457a);
        m24293h0(8, this.f41565d.findViewById(ru.mes.dnevnik.R.id.exo_duration), this.f41547L.f26458b);
        m24293h0(8, this.f41565d.findViewById(ru.mes.dnevnik.R.id.exo_settings), this.f41547L.f26469m);
    }

    /* renamed from: Y */
    public final void m24305Y() {
        C1474XQ c1474xq = this.f41573j;
        if (c1474xq == null) {
            return;
        }
        if (this.f41578o) {
            C0278EP c0278ep = new C0278EP();
            this.f41577n = c0278ep;
            C7251zE c7251zE = this.f41573j.f13736r;
            c7251zE.getClass();
            c7251zE.f46736f.m8129a(c0278ep);
            return;
        }
        C0278EP c0278ep2 = this.f41577n;
        if (c0278ep2 != null) {
            c1474xq.m9035g2();
            c1474xq.f13736r.f46736f.m8133e(c0278ep2);
            this.f41577n = null;
        }
    }

    /* renamed from: Z */
    public final void m24306Z() {
        RunnableC9995kK0 runnableC9995kK0;
        String str;
        AudioTrack audioTrack;
        if (this.f41573j != null) {
            m24312g0();
            C1474XQ c1474xq = this.f41573j;
            c1474xq.getClass();
            StringBuilder sb = new StringBuilder("Release ");
            sb.append(Integer.toHexString(System.identityHashCode(c1474xq)));
            sb.append(" [AndroidXMedia3/1.4.1] [");
            sb.append(AbstractC7485Dh1.f2170e);
            sb.append("] [");
            HashSet hashSet = AbstractC10953rp0.f41924a;
            synchronized (AbstractC10953rp0.class) {
                str = AbstractC10953rp0.f41925b;
            }
            sb.append(str);
            sb.append("]");
            AbstractC10872rA1.m24174g(sb.toString());
            c1474xq.m9035g2();
            if (AbstractC7485Dh1.f2166a < 21 && (audioTrack = c1474xq.f13705Q) != null) {
                audioTrack.release();
                c1474xq.f13705Q = null;
            }
            c1474xq.f13689A.m8921r();
            c1474xq.f13691C.getClass();
            c1474xq.f13692D.getClass();
            C6372la c6372la = c1474xq.f13690B;
            c6372la.f37157c = null;
            c6372la.m22506a();
            c6372la.m22508c(0);
            if (!c1474xq.f13729l.m17663x()) {
                c1474xq.f13730m.m8134f(10, new C6730rE(21));
            }
            c1474xq.f13730m.m8132d();
            c1474xq.f13727j.f10020a.removeCallbacksAndMessages(null);
            InterfaceC0168Cf interfaceC0168Cf = c1474xq.f13740t;
            C7251zE c7251zE = c1474xq.f13736r;
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) ((C0959PE) interfaceC0168Cf).f8918b.f9619a;
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                C0042Af c0042Af = (C0042Af) it.next();
                if (c0042Af.f302b == c7251zE) {
                    c0042Af.f303c = true;
                    copyOnWriteArrayList.remove(c0042Af);
                }
            }
            BB0 bb0 = c1474xq.f13743u1;
            if (bb0.f638p) {
                c1474xq.f13743u1 = bb0.m545a();
            }
            BB0 bb0M551g = c1474xq.f13743u1.m551g(1);
            c1474xq.f13743u1 = bb0M551g;
            BB0 bb0M546b = bb0M551g.m546b(bb0M551g.f624b);
            c1474xq.f13743u1 = bb0M546b;
            bb0M546b.f639q = bb0M546b.f641s;
            c1474xq.f13743u1.f640r = 0L;
            C7251zE c7251zE2 = c1474xq.f13736r;
            R71 r71 = c7251zE2.f46738h;
            YN1.m9283h(r71);
            r71.m6905c(new RunnableC0383G4(29, c7251zE2));
            c1474xq.f13726i.mo9692a();
            c1474xq.m9022T1();
            Surface surface = c1474xq.f13707S;
            if (surface != null) {
                surface.release();
                c1474xq.f13707S = null;
            }
            int i = C6996vB.f44235b;
            c1474xq.f13737r1 = true;
            this.f41573j.m9020R1(this);
            AbstractC10638pL1.m23741a(this.f41589u1, this.f41596y, false);
            if (this.f41545J != null) {
                new Handler().post(this.f41545J);
            }
            this.f41574k = null;
            VL0.f12523c.m25317A().m8419b(this.f41538E1, this.f41573j);
            this.f41573j = null;
        }
        this.f41542G1.removeMessages(1);
        C1142S9 c1142s9 = this.f41593w1;
        c1142s9.getClass();
        c1142s9.f10600b = C1680ah.f15613a;
        try {
            c1142s9.f10601c.unregisterReceiver(c1142s9);
        } catch (Exception unused) {
        }
        C1142S9 c1142s92 = this.f41595x1;
        c1142s92.getClass();
        try {
            ((S91) c1142s92.f10601c).unregisterReceiver(c1142s92);
        } catch (Exception unused2) {
        }
        CopyOnWriteArrayList copyOnWriteArrayList2 = (CopyOnWriteArrayList) this.f41563c.f8918b.f9619a;
        Iterator it2 = copyOnWriteArrayList2.iterator();
        while (it2.hasNext()) {
            C0042Af c0042Af2 = (C0042Af) it2.next();
            if (c0042Af2.f302b == this) {
                c0042Af2.f303c = true;
                copyOnWriteArrayList2.remove(c0042Af2);
            }
        }
        Handler handler = this.f41543H;
        if (handler == null || (runnableC9995kK0 = this.f41544I) == null) {
            return;
        }
        handler.removeCallbacks(runnableC9995kK0);
        this.f41544I = null;
    }

    @Override // p000.GB0
    /* renamed from: a */
    public final /* synthetic */ void mo2948a(int i) {
    }

    /* JADX WARN: Removed duplicated region for block: B:254:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x016e  */
    /* renamed from: a0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m24307a0(int r18, java.lang.String r19, java.lang.String r20) throws java.util.MissingResourceException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 675
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C10891rK0.m24307a0(int, java.lang.String, java.lang.String):void");
    }

    @Override // p000.GB0
    /* renamed from: b */
    public final /* synthetic */ void mo2949b(C1017Q9 c1017q9) {
    }

    @Override // p000.InterfaceC0966PL
    /* renamed from: b0 */
    public final void mo1058b0(int i, C7604Fp0 c7604Fp0) {
        AbstractC10922rZ1.m24428b("DRM Info", "onDrmKeysLoaded");
    }

    @Override // p000.InterfaceC0966PL
    /* renamed from: c */
    public final void mo1059c(int i, C7604Fp0 c7604Fp0, Exception exc) {
        AbstractC10922rZ1.m24428b("DRM Info", "onDrmSessionManagerError");
        this.f41559a.f43814c.mo300b("onDrmSessionManagerError", exc, "3002");
    }

    /* renamed from: c0 */
    public final void m24308c0() {
        if (!this.f41587t1 || this.f41573j == null) {
            return;
        }
        this.f41576m = new ServiceConnectionC10379nK0(this);
        S91 s91 = this.f41589u1;
        Intent intent = new Intent(s91, (Class<?>) AbstractServiceC7697Hj1.class);
        intent.setAction("androidx.media3.session.MediaSessionService");
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            s91.startForegroundService(intent);
        } else {
            s91.startService(intent);
        }
        s91.bindService(intent, this.f41576m, i >= 29 ? 4097 : 1);
    }

    @Override // p000.InterfaceC1801bh
    /* renamed from: d */
    public final void mo914d() {
        this.f41559a.f43829r.invoke();
    }

    /* renamed from: d0 */
    public final void m24309d0(int i, boolean z) {
        ImageButton imageButton = (ImageButton) this.f41565d.findViewById(i);
        if (z) {
            imageButton.setImageAlpha(0);
            imageButton.setClickable(false);
        } else {
            imageButton.setImageAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
            imageButton.setClickable(true);
        }
    }

    @Override // p000.GB0
    /* renamed from: e */
    public final /* synthetic */ void mo2950e(C8321Tj1 c8321Tj1) {
    }

    /* renamed from: e0 */
    public final void m24310e0() {
        DialogC6245jZ dialogC6245jZ;
        C10683pi0 c10683pi0 = this.f41565d;
        if (c10683pi0 != null) {
            ImageButton imageButton = (ImageButton) c10683pi0.findViewById(ru.mes.dnevnik.R.id.exo_fullscreen);
            if (!this.f41584s || (dialogC6245jZ = this.f41571h) == null || dialogC6245jZ.isShowing()) {
                imageButton.setVisibility(0);
            } else {
                imageButton.setVisibility(8);
            }
        }
    }

    /* renamed from: f0 */
    public final void m24311f0() {
        long jM9039z1;
        C1474XQ c1474xq = this.f41573j;
        if (c1474xq != null) {
            if (this.f41565d != null && c1474xq != null && c1474xq.m9015M1() && this.f41585s1) {
                this.f41565d.m23839a();
            }
            C1474XQ c1474xq2 = this.f41573j;
            c1474xq2.getClass();
            c1474xq2.m9035g2();
            if (c1474xq2.m9015M1()) {
                BB0 bb0 = c1474xq2.f13743u1;
                jM9039z1 = bb0.f633k.equals(bb0.f624b) ? AbstractC7485Dh1.m1819d0(c1474xq2.f13743u1.f639q) : c1474xq2.m9012I1();
            } else {
                jM9039z1 = c1474xq2.m9039z1();
            }
            long jM9012I1 = c1474xq2.m9012I1();
            int iM1825j = 0;
            if (jM9039z1 != -9223372036854775807L && jM9012I1 != -9223372036854775807L) {
                iM1825j = jM9012I1 == 0 ? 100 : AbstractC7485Dh1.m1825j((int) ((jM9039z1 * 100) / jM9012I1), 0, 100);
            }
            long jM9012I12 = (this.f41573j.m9012I1() * iM1825j) / 100;
            long jM9012I13 = this.f41573j.m9012I1();
            long jM9008E1 = this.f41573j.m9008E1();
            if (jM9008E1 > jM9012I13) {
                jM9008E1 = jM9012I13;
            }
            if (this.f41599z1 == jM9008E1 && this.f41530A1 == jM9012I12 && this.f41532B1 == jM9012I13) {
                return;
            }
            this.f41599z1 = jM9008E1;
            this.f41530A1 = jM9012I12;
            this.f41532B1 = jM9012I13;
            C10686pj1 c10686pj1 = this.f41559a.f43815d;
            Long lValueOf = Long.valueOf(jM9008E1);
            Long lValueOf2 = Long.valueOf(jM9012I12);
            Long lValueOf3 = Long.valueOf(this.f41573j.m9012I1());
            C7367Ba1 c7367Ba1 = new C7367Ba1();
            if (!this.f41573j.m9010G1().m1259p()) {
                this.f41573j.m9010G1().m1257n(this.f41573j.m9007D1(), c7367Ba1);
            }
            c10686pj1.m23859a(lValueOf, lValueOf2, lValueOf3, Double.valueOf(c7367Ba1.f919f + jM9008E1));
        }
    }

    /* renamed from: g0 */
    public final void m24312g0() {
        this.f41579p = this.f41573j.m9007D1();
        this.f41580q = this.f41573j.m7843l1() ? Math.max(0L, this.f41573j.m9008E1()) : -9223372036854775807L;
    }

    public boolean getPreventsDisplaySleepDuringVideoPlayback() {
        return this.f41566d0;
    }

    @Override // p000.GB0
    /* renamed from: h */
    public final /* synthetic */ void mo2952h(int i, boolean z) {
    }

    @Override // p000.GB0
    /* renamed from: i */
    public final void mo2953i(float f) {
        this.f41559a.f43832u.invoke(Float.valueOf(f));
    }

    @Override // p000.GB0
    /* renamed from: j */
    public final /* synthetic */ void mo2954j(int i) {
    }

    @Override // p000.InterfaceC0105Bf
    /* renamed from: k */
    public final void mo795k(int i, long j, long j2) {
        int i2;
        if (this.f41583r1) {
            C1474XQ c1474xq = this.f41573j;
            C11326uj1 c11326uj1 = this.f41559a;
            if (c1474xq == null) {
                c11326uj1.f43816e.m23859a(Long.valueOf(j2), 0, 0, null);
                return;
            }
            c1474xq.m9035g2();
            C6686qX c6686qX = c1474xq.f13704P;
            boolean z = c6686qX != null && ((i2 = c6686qX.f40983v) == 90 || i2 == 270);
            c11326uj1.f43816e.m23859a(Long.valueOf(j2), Integer.valueOf(c6686qX != null ? z ? c6686qX.f40980s : c6686qX.f40981t : 0), Integer.valueOf(c6686qX != null ? z ? c6686qX.f40981t : c6686qX.f40980s : 0), c6686qX != null ? c6686qX.f40962a : null);
        }
    }

    @Override // p000.InterfaceC0966PL
    /* renamed from: k0 */
    public final void mo1084k0(int i, C7604Fp0 c7604Fp0) {
        AbstractC10922rZ1.m24428b("DRM Info", "onDrmSessionReleased");
    }

    @Override // p000.InterfaceC0966PL
    /* renamed from: l */
    public final void mo1086l(int i, C7604Fp0 c7604Fp0, int i2) {
        AbstractC10922rZ1.m24428b("DRM Info", "onDrmSessionAcquired");
    }

    @Override // p000.GB0
    /* renamed from: m */
    public final /* synthetic */ void mo2955m(boolean z) {
    }

    @Override // p000.GB0
    /* renamed from: n */
    public final void mo2956n(C6996vB c6996vB) {
        if (c6996vB.f44236a.isEmpty()) {
            return;
        }
        P70 p70 = c6996vB.f44236a;
        if (((C6933uB) p70.get(0)).f43566a != null) {
            this.f41559a.f43836y.invoke(((C6933uB) p70.get(0)).f43566a.toString());
        }
    }

    /* renamed from: o */
    public final InterfaceC1091RL m24313o(UUID uuid, C6474nC c6474nC, int i) throws C8263Sg1 {
        if (AbstractC7485Dh1.f2166a < 18) {
            return null;
        }
        try {
            try {
                try {
                    C8539Xo1 c8539Xo1 = new C8539Xo1(c6474nC.f38169b, m24314v(false));
                    String[] strArr = c6474nC.f38170c;
                    for (int i2 = 0; i2 < strArr.length - 1; i2 += 2) {
                        try {
                            c8539Xo1.m9135R(strArr[i2], strArr[i2 + 1]);
                        } catch (Exception e) {
                            e = e;
                            if (i < 3) {
                                return m24313o(uuid, c6474nC, i + 1);
                            }
                            this.f41559a.f43814c.mo300b(e.toString(), e, "3006");
                            return null;
                        }
                    }
                    try {
                        C1356VY c1356vy = new C1356VY(uuid);
                        if (this.f41537E) {
                            ((MediaDrm) c1356vy.f12613d).setPropertyString("securityLevel", "L3");
                        }
                        HashMap map = new HashMap();
                        UUID uuid2 = AbstractC0865Nk.f7977a;
                        int[] iArr = new int[0];
                        C3979eG c3979eG = new C3979eG(-1, 0);
                        C8450Vw0 c8450Vw0 = new C8450Vw0(8, c1356vy);
                        map.clear();
                        return new C6477nF(uuid, c8450Vw0, c8539Xo1, map, c6474nC.f38171d, iArr, true, c3979eG, 300000L);
                    } catch (UnsupportedSchemeException e2) {
                        throw new C8263Sg1(1, e2);
                    } catch (Exception e3) {
                        throw new C8263Sg1(2, e3);
                    }
                } catch (C8263Sg1 e4) {
                    throw e4;
                }
            } catch (Exception e5) {
                e = e5;
            }
        } catch (C8263Sg1 e6) {
            throw e6;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        try {
            ServiceConnectionC10379nK0 serviceConnectionC10379nK0 = this.f41576m;
            if (serviceConnectionC10379nK0 != null) {
                this.f41589u1.unbindService(serviceConnectionC10379nK0);
            }
        } catch (Exception unused) {
            AbstractC10922rZ1.m24431e("ReactExoplayerView", "Cloud not cleanup playback service");
        }
        super.onDetachedFromWindow();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostDestroy() {
        this.f41591v1.abandonAudioFocus(this.f41597y1);
        m24306Z();
        this.f41589u1.removeLifecycleEventListener(this);
        m24306Z();
        this.f41534C1 = true;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostPause() {
        this.f41586t = true;
        Activity currentActivity = this.f41589u1.f10602a.getCurrentActivity();
        int i = AbstractC7485Dh1.f2166a;
        boolean z = i >= 24 && currentActivity != null && currentActivity.isInPictureInPictureMode();
        boolean z2 = i >= 24 && currentActivity != null && currentActivity.isInMultiWindowMode();
        if (this.f41581q1 || z || z2) {
            return;
        }
        setPlayWhenReady(false);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostResume() {
        if (!this.f41581q1 || !this.f41586t) {
            setPlayWhenReady(!this.f41588u);
        }
        this.f41586t = false;
    }

    @Override // p000.GB0
    /* renamed from: p */
    public final void mo2957p(C9264ec1 c9264ec1) {
        C11326uj1 c11326uj1 = this.f41559a;
        c11326uj1.f43834w.invoke(getTextTrackInfo());
        c11326uj1.f43833v.invoke(getAudioTrackInfo());
        c11326uj1.f43835x.invoke(getVideoTrackInfo());
    }

    @Override // p000.GB0
    /* renamed from: q */
    public final void mo2958q(IB0 ib0, FB0 fb0) throws MissingResourceException, NumberFormatException {
        String strM26232i;
        int i;
        int i2;
        int i3;
        C1353VV c1353vv = fb0.f3085a;
        if (c1353vv.f12594a.get(4) || c1353vv.f12594a.get(5)) {
            C1474XQ c1474xq = (C1474XQ) ib0;
            int iM9014K1 = c1474xq.m9014K1();
            boolean zM9013J1 = c1474xq.m9013J1();
            String str = "onStateChanged: playWhenReady=" + zM9013J1 + ", playbackState=";
            C11326uj1 c11326uj1 = this.f41559a;
            c11326uj1.f43831t.invoke(Float.valueOf((zM9013J1 && iM9014K1 == 3) ? 1.0f : 0.0f));
            HandlerC0319F3 handlerC0319F3 = this.f41542G1;
            boolean z = true;
            if (iM9014K1 == 1) {
                String strM26232i2 = AbstractC7222ym.m26232i(str, "idle");
                c11326uj1.f43827p.invoke();
                handlerC0319F3.removeMessages(1);
                if (!c1474xq.m9013J1()) {
                    setKeepScreenOn(false);
                }
                strM26232i = strM26232i2;
            } else if (iM9014K1 == 2) {
                strM26232i = str + "buffering";
                m24301U(true);
                handlerC0319F3.removeMessages(1);
                setKeepScreenOn(this.f41566d0);
            } else if (iM9014K1 == 3) {
                String strM26232i3 = AbstractC7222ym.m26232i(str, "ready");
                c11326uj1.f43824m.invoke();
                m24301U(false);
                handlerC0319F3.removeMessages(1);
                handlerC0319F3.sendEmptyMessage(1);
                if (!this.f41573j.m9015M1() && this.f41582r) {
                    this.f41582r = false;
                    String str2 = this.f41553R;
                    if (str2 != null) {
                        String str3 = this.f41554S;
                        this.f41553R = str2;
                        this.f41554S = str3;
                        m24307a0(1, str2, str3);
                    }
                    String str4 = this.f41555T;
                    if (str4 != null) {
                        String str5 = this.f41556U;
                        this.f41555T = str4;
                        this.f41556U = str5;
                        if (!this.f41582r) {
                            m24307a0(2, str4, str5);
                        }
                    }
                    String str6 = this.f41557V;
                    if (str6 != null) {
                        String str7 = this.f41558W;
                        this.f41557V = str6;
                        this.f41558W = str7;
                        m24307a0(3, str6, str7);
                    }
                    C1474XQ c1474xq2 = this.f41573j;
                    c1474xq2.m9035g2();
                    C6686qX c6686qX = c1474xq2.f13704P;
                    if (c6686qX == null || ((i3 = c6686qX.f40983v) != 90 && i3 != 270)) {
                        z = false;
                    }
                    if (c6686qX != null) {
                        i = z ? c6686qX.f40981t : c6686qX.f40980s;
                    } else {
                        i = 0;
                    }
                    if (c6686qX != null) {
                        i2 = z ? c6686qX.f40980s : c6686qX.f40981t;
                    } else {
                        i2 = 0;
                    }
                    final String str8 = c6686qX != null ? c6686qX.f40962a : null;
                    final long jM9012I1 = this.f41573j.m9012I1();
                    final long jM9008E1 = this.f41573j.m9008E1();
                    final ArrayList<C7941Mb1> audioTrackInfo = getAudioTrackInfo();
                    final ArrayList<C7941Mb1> textTrackInfo = getTextTrackInfo();
                    if (this.f41551P.f12321h != -1) {
                        final int i4 = i;
                        final int i5 = i2;
                        Executors.newSingleThreadExecutor().execute(new Runnable() { // from class: iK0
                            @Override // java.lang.Runnable
                            public final void run() {
                                C10891rK0.m24292f(this.f29085a, jM9012I1, jM9008E1, i4, i5, audioTrackInfo, textTrackInfo, str8);
                            }
                        });
                    } else {
                        c11326uj1.f43813b.m22936a(Long.valueOf(jM9012I1), Long.valueOf(jM9008E1), Integer.valueOf(i), Integer.valueOf(i2), audioTrackInfo, textTrackInfo, getVideoTrackInfo(), str8);
                        m24304X();
                    }
                }
                if (this.f41541G && this.f41539F) {
                    this.f41541G = false;
                    m24307a0(2, this.f41555T, this.f41556U);
                }
                C10683pi0 c10683pi0 = this.f41565d;
                if (c10683pi0 != null) {
                    c10683pi0.m23843e();
                }
                setKeepScreenOn(this.f41566d0);
                strM26232i = strM26232i3;
            } else if (iM9014K1 != 4) {
                strM26232i = AbstractC7222ym.m26232i(str, "unknown");
            } else {
                strM26232i = str + "ended";
                m24311f0();
                c11326uj1.f43819h.invoke();
                this.f41591v1.abandonAudioFocus(this.f41597y1);
                setKeepScreenOn(false);
            }
            AbstractC10922rZ1.m24428b("ReactExoplayerView", strM26232i);
        }
    }

    @Override // p000.GB0
    /* renamed from: r */
    public final void mo2959r(int i, HB0 hb0, HB0 hb02) throws MissingResourceException, NumberFormatException {
        if (i == 1) {
            this.f41549N = true;
            this.f41550O = hb02.f4158f;
            if (this.f41539F) {
                m24307a0(2, this.f41555T, this.f41556U);
            }
        }
        if (this.f41575l) {
            m24312g0();
        }
        if (this.f41539F) {
            m24307a0(2, this.f41555T, this.f41556U);
            this.f41541G = true;
        }
        if (i == 0) {
            C1474XQ c1474xq = this.f41573j;
            c1474xq.m9035g2();
            if (c1474xq.f13694F == 1) {
                m24311f0();
                this.f41559a.f43819h.invoke();
            }
        }
    }

    public void setAudioOutput(EnumC6561oa enumC6561oa) {
        if (this.f41531B != enumC6561oa) {
            this.f41531B = enumC6561oa;
            m24294E(enumC6561oa);
        }
    }

    public void setCmcdConfigurationFactory(InterfaceC0560It interfaceC0560It) {
        this.f41540F1 = interfaceC0560It;
    }

    public void setControls(boolean z) {
        this.f41585s1 = z;
        if (z) {
            if (this.f41565d != null) {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                this.f41565d.setLayoutParams(layoutParams);
                int iIndexOfChild = indexOfChild(this.f41565d);
                if (iIndexOfChild != -1) {
                    removeViewAt(iIndexOfChild);
                }
                addView(this.f41565d, 1, layoutParams);
                m24303W(this.f41565d);
            }
            m24310e0();
        } else {
            int iIndexOfChild2 = indexOfChild(this.f41565d);
            if (iIndexOfChild2 != -1) {
                removeViewAt(iIndexOfChild2);
            }
        }
        m24304X();
    }

    public void setControlsStyles(C3961dz c3961dz) {
        this.f41547L = c3961dz;
        m24304X();
    }

    public void setDebug(boolean z) {
        this.f41578o = z;
        m24305Y();
    }

    public void setDisableDisconnectError(boolean z) {
        this.f41564c0 = z;
    }

    public void setDisableFocus(boolean z) {
        this.f41560a0 = z;
    }

    public void setEnterPictureInPictureOnLeave(boolean z) {
        boolean z2 = Build.VERSION.SDK_INT >= 24 && z;
        this.f41594x = z2;
        AbstractC10638pL1.m23741a(this.f41589u1, this.f41596y, z2);
    }

    @Override // android.view.View
    public void setFocusable(boolean z) {
        this.f41562b0 = z;
        this.f41570g.setFocusable(z);
    }

    public void setFullscreen(boolean z) {
        if (z == this.f41584s) {
            return;
        }
        this.f41584s = z;
        if (this.f41589u1.f10602a.getCurrentActivity() == null) {
            return;
        }
        boolean z2 = this.f41584s;
        C11326uj1 c11326uj1 = this.f41559a;
        if (z2) {
            this.f41571h = new DialogC6245jZ(getContext(), this.f41570g, this, this.f41565d, new C0767MB(this, 2), this.f41547L);
            c11326uj1.f43820i.invoke();
            DialogC6245jZ dialogC6245jZ = this.f41571h;
            if (dialogC6245jZ != null) {
                dialogC6245jZ.show();
            }
            UiThreadUtil.runOnUiThread(new RunnableC10123lK0(this, 0));
        } else {
            c11326uj1.f43822k.invoke();
            DialogC6245jZ dialogC6245jZ2 = this.f41571h;
            if (dialogC6245jZ2 != null) {
                dialogC6245jZ2.dismiss();
                m24303W(this.f41570g);
                m24303W(this.f41565d);
                setControls(this.f41585s1);
            }
            UiThreadUtil.runOnUiThread(new RunnableC10123lK0(this, 1));
        }
        m24310e0();
    }

    public void setHideShutterView(boolean z) {
        this.f41570g.setHideShutterView(z);
    }

    public void setIsInPictureInPicture(boolean z) {
        this.f41559a.f43837z.invoke(Boolean.valueOf(z));
        DialogC6245jZ dialogC6245jZ = this.f41571h;
        int i = 0;
        if (dialogC6245jZ != null && dialogC6245jZ.isShowing()) {
            if (z) {
                DialogC6245jZ dialogC6245jZ2 = this.f41571h;
                FrameLayout frameLayout = dialogC6245jZ2.f35229g;
                int childCount = frameLayout.getChildCount();
                while (i < childCount) {
                    if (frameLayout.getChildAt(i) != dialogC6245jZ2.f35223a) {
                        frameLayout.getChildAt(i).setVisibility(8);
                    }
                    i++;
                }
                return;
            }
            return;
        }
        Activity currentActivity = this.f41589u1.f10602a.getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) currentActivity.getWindow().getDecorView().findViewById(R.id.content);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        ArrayList arrayList = this.f41548M;
        if (!z) {
            viewGroup.removeView(this.f41570g);
            if (arrayList.isEmpty()) {
                return;
            }
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                viewGroup.getChildAt(i2).setVisibility(((Integer) arrayList.get(i2)).intValue());
            }
            addView(this.f41570g, 0, layoutParams);
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) this.f41570g.getParent();
        if (viewGroup2 != null) {
            viewGroup2.removeView(this.f41570g);
        }
        while (i < viewGroup.getChildCount()) {
            if (viewGroup.getChildAt(i) != this.f41570g) {
                arrayList.add(Integer.valueOf(viewGroup.getChildAt(i).getVisibility()));
                viewGroup.getChildAt(i).setVisibility(8);
            }
            i++;
        }
        viewGroup.addView(this.f41570g, layoutParams);
    }

    public void setMaxBitRateModifier(int i) {
        this.f41535D = i;
        if (this.f41573j != null) {
            String str = this.f41555T;
            if (str == null || "auto".equals(str)) {
                C1654aH c1654aH = this.f41574k;
                C1212TG c1212tgM9694f = c1654aH.m9694f();
                c1212tgM9694f.getClass();
                C1149SG c1149sg = new C1149SG(c1212tgM9694f);
                int i2 = this.f41535D;
                if (i2 == 0) {
                    i2 = Integer.MAX_VALUE;
                }
                c1149sg.f14371d = i2;
                c1654aH.m9698l(new C1212TG(c1149sg));
            }
        }
    }

    public void setMutedModifier(boolean z) {
        this.f41592w = z;
        C1474XQ c1474xq = this.f41573j;
        if (c1474xq != null) {
            c1474xq.m9029a2(z ? 0.0f : this.f41533C);
        }
    }

    public void setPausedModifier(boolean z) {
        this.f41588u = z;
        C1474XQ c1474xq = this.f41573j;
        if (c1474xq != null) {
            if (z) {
                m24302V();
                return;
            }
            if (!c1474xq.m9013J1()) {
                setPlayWhenReady(true);
            }
            setKeepScreenOn(this.f41566d0);
        }
    }

    public void setPlayInBackground(boolean z) {
        this.f41581q1 = z;
    }

    public void setPreventsDisplaySleepDuringVideoPlayback(boolean z) {
        this.f41566d0 = z;
    }

    public void setProgressUpdateInterval(float f) {
        this.f41568e0 = f;
    }

    public void setRateModifier(float f) {
        if (f <= 0.0f) {
            AbstractC10922rZ1.m24431e("ReactExoplayerView", "cannot set rate <= 0");
            return;
        }
        this.f41529A = f;
        if (this.f41573j != null) {
            this.f41573j.m9026X1(new CB0(this.f41529A, 1.0f));
        }
    }

    public void setRepeatModifier(boolean z) {
        C1474XQ c1474xq = this.f41573j;
        if (c1474xq != null) {
            if (z) {
                c1474xq.m9027Y1(1);
            } else {
                c1474xq.m9027Y1(0);
            }
        }
        this.f41552Q = z;
    }

    public void setReportBandwidth(boolean z) {
        this.f41583r1 = z;
    }

    public void setResizeModeModifier(int i) {
        C4053fR c4053fR = this.f41570g;
        if (c4053fR != null) {
            c4053fR.setResizeMode(i);
        }
    }

    public void setShowNotificationControls(boolean z) {
        this.f41587t1 = z;
        ServiceConnectionC10379nK0 serviceConnectionC10379nK0 = this.f41576m;
        if (serviceConnectionC10379nK0 == null && z) {
            m24308c0();
            return;
        }
        if (z || serviceConnectionC10379nK0 == null || serviceConnectionC10379nK0 == null) {
            return;
        }
        try {
            this.f41589u1.unbindService(serviceConnectionC10379nK0);
        } catch (Exception unused) {
            AbstractC10922rZ1.m24431e("ReactExoplayerView", "Cloud not cleanup playback service");
        }
    }

    public void setShutterColor(Integer num) {
        this.f41570g.setShutterColor(num.intValue());
    }

    public void setSrc(V21 v21) {
        InterfaceC1397WC interfaceC1397WC;
        C1474XQ c1474xq;
        Pair pairM9017O1;
        if (v21.f12315b != null) {
            this.f41579p = -1;
            this.f41580q = -9223372036854775807L;
            V21 v212 = this.f41551P;
            O90.m5968f(v212, "source");
            boolean zEquals = v21.equals(v212);
            this.f41537E = false;
            this.f41551P = v21;
            this.f41572i = AbstractC9514gZ1.m18581b(this.f41589u1, this.f41563c, v21.f12325l);
            C1116Rk c1116Rk = v21.f12328o;
            if (c1116Rk != null) {
                setCmcdConfigurationFactory(new C0071B7(3, new C9196e41(c1116Rk)));
            } else {
                setCmcdConfigurationFactory(null);
            }
            if (zEquals) {
                return;
            }
            this.f41575l = true;
            RunnableC9995kK0 runnableC9995kK0 = new RunnableC9995kK0(this, this.f41551P, this, this.f41589u1.f10602a.getCurrentActivity());
            this.f41544I = runnableC9995kK0;
            this.f41543H.postDelayed(runnableC9995kK0, 1L);
            return;
        }
        if (this.f41551P.f12315b != null && (c1474xq = this.f41573j) != null) {
            c1474xq.m9035g2();
            c1474xq.f13690B.m22509d(1, c1474xq.m9013J1());
            c1474xq.m9030b2(null);
            C9367fQ0 c9367fQ0 = C9367fQ0.f27184e;
            long j = c1474xq.f13743u1.f641s;
            new C6996vB(c9367fQ0);
            C1474XQ c1474xq2 = this.f41573j;
            c1474xq2.getClass();
            c1474xq2.m9035g2();
            ArrayList arrayList = c1474xq2.f13733p;
            int size = arrayList.size();
            int iMin = Math.min(Integer.MAX_VALUE, size);
            if (size > 0 && iMin != 0) {
                BB0 bb0 = c1474xq2.f13743u1;
                int iM9011H1 = c1474xq2.m9011H1(bb0);
                long jM9004A1 = c1474xq2.m9004A1(bb0);
                int size2 = arrayList.size();
                c1474xq2.f13696H++;
                c1474xq2.m9021S1(iMin);
                SB0 sb0 = new SB0(c1474xq2.f13733p, c1474xq2.f13700L);
                AbstractC7419Ca1 abstractC7419Ca1 = bb0.f623a;
                if (abstractC7419Ca1.m1259p() || sb0.m1259p()) {
                    boolean z = !abstractC7419Ca1.m1259p() && sb0.m1259p();
                    int i = z ? -1 : iM9011H1;
                    if (z) {
                        jM9004A1 = -9223372036854775807L;
                    }
                    pairM9017O1 = c1474xq2.m9017O1(sb0, i, jM9004A1);
                } else {
                    pairM9017O1 = abstractC7419Ca1.m1252i((C7367Ba1) c1474xq2.f11615b, c1474xq2.f13732o, iM9011H1, AbstractC7485Dh1.m1802Q(jM9004A1));
                    Object obj = pairM9017O1.first;
                    if (sb0.mo1245b(obj) == -1) {
                        int iM17606H = C3928dR.m17606H((C7367Ba1) c1474xq2.f11615b, c1474xq2.f13732o, c1474xq2.f13694F, c1474xq2.f13695G, obj, abstractC7419Ca1, sb0);
                        if (iM17606H != -1) {
                            C7367Ba1 c7367Ba1 = (C7367Ba1) c1474xq2.f11615b;
                            sb0.mo1256m(iM17606H, c7367Ba1, 0L);
                            pairM9017O1 = c1474xq2.m9017O1(sb0, iM17606H, AbstractC7485Dh1.m1819d0(c7367Ba1.f925l));
                        } else {
                            pairM9017O1 = c1474xq2.m9017O1(sb0, -1, -9223372036854775807L);
                        }
                    }
                }
                BB0 bb0M9016N1 = c1474xq2.m9016N1(bb0, sb0, pairM9017O1);
                int i2 = bb0M9016N1.f627e;
                BB0 bb0M551g = (i2 == 1 || i2 == 4 || iMin <= 0 || iMin != size2 || iM9011H1 < bb0M9016N1.f623a.mo1258o()) ? bb0M9016N1 : bb0M9016N1.m551g(4);
                C11869z01 c11869z01 = c1474xq2.f13700L;
                R71 r71 = c1474xq2.f13729l.f26088h;
                r71.getClass();
                Q71 q71M6903b = R71.m6903b();
                q71M6903b.f9486a = r71.f10020a.obtainMessage(20, 0, iMin, c11869z01);
                q71M6903b.m6576b();
                c1474xq2.m9033e2(bb0M551g, 0, !bb0M551g.f624b.f3430a.equals(c1474xq2.f13743u1.f624b.f3430a), 4, c1474xq2.m9009F1(bb0M551g), -1, false);
            }
        }
        C4053fR c4053fR = this.f41570g;
        if (c4053fR.f27200m) {
            c4053fR.f27192e.removeView(c4053fR.f27196i);
            interfaceC1397WC = null;
            c4053fR.f27196i = null;
            c4053fR.f27200m = false;
        } else {
            interfaceC1397WC = null;
        }
        this.f41551P = new V21();
        this.f41572i = interfaceC1397WC;
        this.f41579p = -1;
        this.f41580q = -9223372036854775807L;
    }

    public void setSubtitleStyle(C9328f61 c9328f61) {
        this.f41570g.setSubtitleStyle(c9328f61);
    }

    public void setViewType(int i) {
        this.f41570g.m18237d(i);
    }

    public void setVolumeModifier(float f) {
        this.f41533C = f;
        C1474XQ c1474xq = this.f41573j;
        if (c1474xq != null) {
            c1474xq.m9029a2(f);
        }
    }

    @Override // p000.GB0
    /* renamed from: t */
    public final /* synthetic */ void mo2961t(C11337up0 c11337up0) {
    }

    @Override // p000.GB0
    /* renamed from: u */
    public final /* synthetic */ void mo2962u(C0531IQ c0531iq) {
    }

    /* renamed from: v */
    public final C10919rY0 m24314v(boolean z) {
        C0959PE c0959pe = z ? this.f41563c : null;
        HashMap map = this.f41551P.f12325l;
        S91 s91 = this.f41589u1;
        O90.m5968f(s91, "context");
        if (AbstractC9514gZ1.f27850b == null || (map != null && !map.isEmpty())) {
            AbstractC9514gZ1.f27850b = AbstractC9514gZ1.m18580a(s91, c0959pe, map);
        }
        C10919rY0 c10919rY0 = AbstractC9514gZ1.f27850b;
        O90.m5966d(c10919rY0, "null cannot be cast to non-null type androidx.media3.datasource.HttpDataSource.Factory");
        return c10919rY0;
    }

    @Override // p000.GB0
    /* renamed from: w */
    public final /* synthetic */ void mo2963w(int i) {
    }

    @Override // p000.GB0
    /* renamed from: x */
    public final void mo2964x(C0531IQ c0531iq) {
        String strConcat = "ExoPlaybackException: ".concat(AB0.m102a(c0531iq.f104a));
        StringBuilder sb = new StringBuilder("2");
        int i = c0531iq.f104a;
        sb.append(i);
        String string = sb.toString();
        if ((i == 6000 || i == 6002 || i == 6004 || i == 6006 || i == 6007) && !this.f41537E) {
            this.f41537E = true;
            this.f41575l = true;
            m24312g0();
            RunnableC9995kK0 runnableC9995kK0 = new RunnableC9995kK0(this, this.f41551P, this, this.f41589u1.f10602a.getCurrentActivity());
            this.f41544I = runnableC9995kK0;
            this.f41543H.postDelayed(runnableC9995kK0, 1L);
            setPlayWhenReady(true);
            return;
        }
        this.f41559a.f43814c.mo300b(strConcat, c0531iq, string);
        this.f41575l = true;
        if (i != 1002) {
            m24312g0();
            return;
        }
        this.f41579p = -1;
        this.f41580q = -9223372036854775807L;
        C1474XQ c1474xq = this.f41573j;
        if (c1474xq != null) {
            c1474xq.mo7846o1(c1474xq.m9007D1(), -9223372036854775807L, false);
            this.f41573j.m9019Q1();
        }
    }

    @Override // p000.GB0
    /* renamed from: y */
    public final /* synthetic */ void mo2965y() {
    }

    @Override // p000.GB0
    /* renamed from: z */
    public final /* synthetic */ void mo2966z(boolean z) {
    }

    @Override // p000.GB0
    /* renamed from: g */
    public final void mo2951g(boolean z) {
    }

    @Override // p000.GB0
    /* renamed from: s */
    public final void mo2960s(int i) {
    }

    public void setBufferingStrategy(EnumC0738Lj enumC0738Lj) {
    }
}
