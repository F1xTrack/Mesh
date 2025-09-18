package p000;

import android.location.Location;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.net.Uri;
import android.os.Build;
import android.util.Pair;
import android.util.Size;
import android.view.Surface;
import androidx.camera.video.internal.compat.quirk.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import androidx.camera.video.internal.compat.quirk.EncoderNotUsePersistentInputSurfaceQuirk;
import androidx.camera.video.internal.compat.quirk.NegativeLatLongSavesIncorrectlyQuirk;
import com.yandex.varioqub.config.model.ConfigValue;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: gO0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9491gO0 implements InterfaceC7645Gj1 {

    /* renamed from: j0 */
    public static final Set f27709j0 = Collections.unmodifiableSet(EnumSet.of(EnumC9363fO0.f27166b, EnumC9363fO0.f27167c));

    /* renamed from: k0 */
    public static final Set f27710k0 = Collections.unmodifiableSet(EnumSet.of(EnumC9363fO0.f27165a, EnumC9363fO0.f27168d, EnumC9363fO0.f27172h, EnumC9363fO0.f27171g, EnumC9363fO0.f27173i));

    /* renamed from: l0 */
    public static final C1551Ye f27711l0;

    /* renamed from: m0 */
    public static final C1613Zd f27712m0;

    /* renamed from: n0 */
    public static final RuntimeException f27713n0;

    /* renamed from: o0 */
    public static final C1686an f27714o0;

    /* renamed from: p0 */
    public static final C1686an f27715p0;

    /* renamed from: q0 */
    public static final ExecutorC10151lY0 f27716q0;

    /* renamed from: r0 */
    public static final int f27717r0;

    /* renamed from: s0 */
    public static final long f27718s0;

    /* renamed from: A */
    public Surface f27719A;

    /* renamed from: B */
    public Surface f27720B;

    /* renamed from: C */
    public MediaMuxer f27721C;

    /* renamed from: D */
    public final C0611Jh f27722D;

    /* renamed from: E */
    public C0541Ia f27723E;

    /* renamed from: F */
    public C6820sO f27724F;

    /* renamed from: G */
    public C0267EE f27725G;

    /* renamed from: H */
    public C6820sO f27726H;

    /* renamed from: I */
    public C0267EE f27727I;

    /* renamed from: J */
    public Uri f27728J;

    /* renamed from: K */
    public long f27729K;

    /* renamed from: L */
    public long f27730L;

    /* renamed from: M */
    public long f27731M;

    /* renamed from: N */
    public long f27732N;

    /* renamed from: O */
    public long f27733O;

    /* renamed from: P */
    public long f27734P;

    /* renamed from: Q */
    public long f27735Q;

    /* renamed from: R */
    public long f27736R;

    /* renamed from: S */
    public int f27737S;

    /* renamed from: T */
    public Exception f27738T;

    /* renamed from: U */
    public InterfaceC1345VN f27739U;

    /* renamed from: V */
    public final C22 f27740V;

    /* renamed from: W */
    public Throwable f27741W;

    /* renamed from: X */
    public boolean f27742X;

    /* renamed from: Y */
    public ScheduledFuture f27743Y;

    /* renamed from: Z */
    public boolean f27744Z;

    /* renamed from: a */
    public final C0611Jh f27745a;

    /* renamed from: a0 */
    public C10715py0 f27746a0;

    /* renamed from: b */
    public final C0611Jh f27747b;

    /* renamed from: b0 */
    public C10715py0 f27748b0;

    /* renamed from: c */
    public final Executor f27749c;

    /* renamed from: c0 */
    public double f27750c0;

    /* renamed from: d */
    public final ExecutorC10151lY0 f27751d;

    /* renamed from: d0 */
    public boolean f27752d0;

    /* renamed from: e */
    public final C1686an f27753e;

    /* renamed from: e0 */
    public C9235eO0 f27754e0;

    /* renamed from: f */
    public final C1686an f27755f;

    /* renamed from: f0 */
    public G10 f27756f0;

    /* renamed from: g */
    public final C1686an f27757g;

    /* renamed from: g0 */
    public long f27758g0;

    /* renamed from: h */
    public final Object f27759h = new Object();

    /* renamed from: h0 */
    public int f27760h0;

    /* renamed from: i */
    public final boolean f27761i;

    /* renamed from: i0 */
    public int f27762i0;

    /* renamed from: j */
    public final long f27763j;

    /* renamed from: k */
    public EnumC9363fO0 f27764k;

    /* renamed from: l */
    public EnumC9363fO0 f27765l;

    /* renamed from: m */
    public int f27766m;

    /* renamed from: n */
    public C6693qe f27767n;

    /* renamed from: o */
    public C6693qe f27768o;

    /* renamed from: p */
    public long f27769p;

    /* renamed from: q */
    public C6693qe f27770q;

    /* renamed from: r */
    public boolean f27771r;

    /* renamed from: s */
    public C0922Oe f27772s;

    /* renamed from: t */
    public C0922Oe f27773t;

    /* renamed from: u */
    public C1614Ze f27774u;

    /* renamed from: v */
    public final ArrayList f27775v;

    /* renamed from: w */
    public Integer f27776w;

    /* renamed from: x */
    public Integer f27777x;

    /* renamed from: y */
    public Z61 f27778y;

    /* renamed from: z */
    public EnumC11690xa1 f27779z;

    static {
        C6630pe c6630pe = C6630pe.f40250f;
        C9108dO1 c9108dO1M17560w = C9108dO1.m17560w(Arrays.asList(c6630pe, C6630pe.f40249e, C6630pe.f40248d), new C0481Hd(c6630pe, 1));
        C10919rY0 c10919rY0M9333a = C1551Ye.m9333a();
        c10919rY0M9333a.f41728b = c9108dO1M17560w;
        c10919rY0M9333a.f41731e = -1;
        C1551Ye c1551YeM24419q = c10919rY0M9333a.m24419q();
        f27711l0 = c1551YeM24419q;
        C6897tc c6897tcM23115a = C6897tc.m24946a().m23115a();
        C1551Ye.m9333a().m24419q();
        f27712m0 = new C1613Zd(c1551YeM24419q, c6897tcM23115a, -1);
        f27713n0 = new RuntimeException("The video frame producer became inactive before any data was received.");
        f27714o0 = new C1686an();
        f27715p0 = new C1686an();
        f27716q0 = new ExecutorC10151lY0(QR1.m6709g());
        f27717r0 = 3;
        f27718s0 = 1000L;
    }

    public C9491gO0(C1613Zd c1613Zd, C1686an c1686an, C1686an c1686an2, C1686an c1686an3, long j) {
        this.f27761i = AbstractC6941uJ.f43644a.m17864z0(EncoderNotUsePersistentInputSurfaceQuirk.class) != null;
        this.f27764k = EnumC9363fO0.f27165a;
        this.f27765l = null;
        this.f27766m = 0;
        this.f27767n = null;
        this.f27768o = null;
        this.f27769p = 0L;
        this.f27770q = null;
        this.f27771r = false;
        this.f27772s = null;
        this.f27773t = null;
        this.f27774u = null;
        this.f27775v = new ArrayList();
        this.f27776w = null;
        this.f27777x = null;
        this.f27719A = null;
        this.f27720B = null;
        this.f27721C = null;
        this.f27723E = null;
        this.f27724F = null;
        this.f27725G = null;
        this.f27726H = null;
        this.f27727I = null;
        this.f27760h0 = 1;
        this.f27728J = Uri.EMPTY;
        this.f27729K = 0L;
        this.f27730L = 0L;
        this.f27731M = Long.MAX_VALUE;
        this.f27732N = Long.MAX_VALUE;
        this.f27733O = Long.MAX_VALUE;
        this.f27734P = Long.MAX_VALUE;
        this.f27735Q = 0L;
        this.f27736R = 0L;
        this.f27737S = 1;
        this.f27738T = null;
        this.f27739U = null;
        this.f27740V = new C22(60, (C1686an) null);
        this.f27741W = null;
        this.f27742X = false;
        this.f27762i0 = 3;
        this.f27743Y = null;
        this.f27744Z = false;
        this.f27748b0 = null;
        this.f27750c0 = ConfigValue.DOUBLE_DEFAULT_VALUE;
        this.f27752d0 = false;
        this.f27754e0 = null;
        this.f27756f0 = null;
        this.f27758g0 = Long.MAX_VALUE;
        ExecutorC9387fa0 executorC9387fa0M6709g = QR1.m6709g();
        this.f27749c = executorC9387fa0M6709g;
        ExecutorC10151lY0 executorC10151lY0 = new ExecutorC10151lY0(executorC9387fa0M6709g);
        this.f27751d = executorC10151lY0;
        C1551Ye c1551YeM24419q = c1613Zd.f15046a;
        C6897tc c6897tc = c1613Zd.f15047b;
        int i = c1613Zd.f15048c;
        if (c1613Zd.f15046a.f14412d == -1) {
            if (c1551YeM24419q == null) {
                throw new IllegalStateException("Property \"videoSpec\" has not been set");
            }
            C10919rY0 c10919rY0 = new C10919rY0(3, false);
            c10919rY0.f41728b = c1551YeM24419q.f14409a;
            c10919rY0.f41729c = c1551YeM24419q.f14410b;
            c10919rY0.f41730d = c1551YeM24419q.f14411c;
            c10919rY0.f41731e = Integer.valueOf(c1551YeM24419q.f14412d);
            c10919rY0.f41731e = Integer.valueOf(f27711l0.f14412d);
            c1551YeM24419q = c10919rY0.m24419q();
        }
        String strConcat = c1551YeM24419q == null ? " videoSpec" : "";
        strConcat = c6897tc == null ? strConcat.concat(" audioSpec") : strConcat;
        if (!strConcat.isEmpty()) {
            throw new IllegalStateException("Missing required properties:".concat(strConcat));
        }
        this.f27722D = new C0611Jh(new C1613Zd(c1551YeM24419q, c6897tc, i));
        this.f27745a = new C0611Jh(new C0356Fe(this.f27766m, m18481l(this.f27764k), null));
        this.f27747b = new C0611Jh(Boolean.FALSE);
        this.f27753e = c1686an;
        this.f27755f = c1686an2;
        this.f27757g = c1686an3;
        this.f27746a0 = new C10715py0(c1686an, executorC10151lY0, executorC9387fa0M6709g);
        j = j == -1 ? 52428800L : j;
        this.f27763j = j;
        AbstractC8729aT1.m9750b(j);
        AbstractC7806Jm0.m4412f("Recorder");
    }

    /* renamed from: k */
    public static Object m18480k(C0611Jh c0611Jh) {
        try {
            return c0611Jh.mo1480g().get();
        } catch (InterruptedException | ExecutionException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: l */
    public static int m18481l(EnumC9363fO0 enumC9363fO0) {
        return (enumC9363fO0 == EnumC9363fO0.f27169e || (enumC9363fO0 == EnumC9363fO0.f27171g && ((DeactivateEncoderSurfaceBeforeStopEncoderQuirk) AbstractC6941uJ.f43644a.m17864z0(DeactivateEncoderSurfaceBeforeStopEncoderQuirk.class)) == null)) ? 1 : 2;
    }

    /* renamed from: o */
    public static boolean m18482o(C9619hO0 c9619hO0, C6693qe c6693qe) {
        return c6693qe != null && c9619hO0.f28403c == c6693qe.f41089m;
    }

    /* renamed from: q */
    public static void m18483q(C6820sO c6820sO) {
        if (c6820sO instanceof C6820sO) {
            c6820sO.f42398h.execute(new RunnableC4239iO(c6820sO, 5));
        }
    }

    /* renamed from: A */
    public final void m18484A(Surface surface) {
        int iHashCode;
        if (this.f27719A == surface) {
            return;
        }
        this.f27719A = surface;
        synchronized (this.f27759h) {
            if (surface != null) {
                try {
                    iHashCode = surface.hashCode();
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                iHashCode = 0;
            }
            m18486C(iHashCode);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    /* renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m18485B(p000.EnumC9363fO0 r4) {
        /*
            r3 = this;
            fO0 r0 = r3.f27764k
            if (r0 == r4) goto L67
            java.util.Objects.toString(r0)
            java.util.Objects.toString(r4)
            java.lang.String r0 = "Recorder"
            p000.AbstractC7806Jm0.m4412f(r0)
            java.util.Set r0 = p000.C9491gO0.f27709j0
            boolean r1 = r0.contains(r4)
            if (r1 == 0) goto L48
            fO0 r1 = r3.f27764k
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L4f
            java.util.Set r0 = p000.C9491gO0.f27710k0
            fO0 r1 = r3.f27764k
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L32
            fO0 r0 = r3.f27764k
            r3.f27765l = r0
            int r0 = m18481l(r0)
            goto L50
        L32:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Invalid state transition. Should not be transitioning to a PENDING state from state "
            r0.<init>(r1)
            fO0 r1 = r3.f27764k
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
        L48:
            fO0 r0 = r3.f27765l
            if (r0 == 0) goto L4f
            r0 = 0
            r3.f27765l = r0
        L4f:
            r0 = 0
        L50:
            r3.f27764k = r4
            if (r0 != 0) goto L58
            int r0 = m18481l(r4)
        L58:
            int r4 = r3.f27766m
            Oe r1 = r3.f27772s
            Fe r2 = new Fe
            r2.<init>(r4, r0, r1)
            Jh r4 = r3.f27745a
            r4.m4389e(r2)
            return
        L67:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Attempted to transition to state "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r2 = ", but Recorder is already in state "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C9491gO0.m18485B(fO0):void");
    }

    /* renamed from: C */
    public final void m18486C(int i) {
        if (this.f27766m == i) {
            return;
        }
        AbstractC7806Jm0.m4412f("Recorder");
        this.f27766m = i;
        this.f27745a.m4389e(new C0356Fe(i, m18481l(this.f27764k), this.f27772s));
    }

    /* renamed from: D */
    public final void m18487D(C6693qe c6693qe) {
        String message;
        int i = 2;
        int i2 = 0;
        if (this.f27721C != null) {
            throw new AssertionError("Unable to set up media muxer when one already exists.");
        }
        boolean zM18500m = m18500m();
        C22 c22 = this.f27740V;
        if (zM18500m && c22.m956d()) {
            throw new AssertionError("Audio is enabled but no audio sample is ready. Cannot start media muxer.");
        }
        InterfaceC1345VN interfaceC1345VN = this.f27739U;
        if (interfaceC1345VN == null) {
            throw new AssertionError("Media muxer cannot be started without an encoded video frame.");
        }
        try {
            this.f27739U = null;
            long jMo8428Y = interfaceC1345VN.mo8428Y();
            ArrayList arrayList = new ArrayList();
            while (!c22.m956d()) {
                InterfaceC1345VN interfaceC1345VN2 = (InterfaceC1345VN) c22.m953a();
                if (interfaceC1345VN2.mo8428Y() >= jMo8428Y) {
                    arrayList.add(interfaceC1345VN2);
                }
            }
            long size = interfaceC1345VN.size();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                size += ((InterfaceC1345VN) it.next()).size();
            }
            long j = this.f27735Q;
            if (j != 0 && size > j) {
                String.format("Initial data exceeds file size limit %d > %d", Long.valueOf(size), Long.valueOf(this.f27735Q));
                AbstractC7806Jm0.m4412f("Recorder");
                m18503r(c6693qe, 2, null);
                interfaceC1345VN.close();
                return;
            }
            int i3 = 3;
            try {
                int i4 = ((C1613Zd) m18480k(this.f27722D)).f15048c;
                if (i4 == -1) {
                    C1614Ze c1614Ze = this.f27774u;
                    int i5 = f27712m0.f15048c != 1 ? 0 : 1;
                    if (c1614Ze == null) {
                        i = i5;
                    } else {
                        int i6 = c1614Ze.f15064b;
                        if (i6 != 1) {
                            if (i6 != 2) {
                                if (i6 != 9) {
                                    i = i5;
                                }
                                i = 1;
                            }
                        } else if (Build.VERSION.SDK_INT < 26) {
                        }
                        i = 0;
                    }
                } else {
                    if (i4 != 1) {
                        i = 0;
                    }
                    i = 1;
                }
                MediaMuxer mediaMuxerM24035f = c6693qe.m24035f(i, new WN0(i2, this));
                C0922Oe c0922Oe = this.f27773t;
                if (c0922Oe != null) {
                    m18511z(c0922Oe);
                    mediaMuxerM24035f.setOrientationHint(c0922Oe.f8548b);
                }
                Location location = c6693qe.f41084h.f828a.f5047c;
                if (location != null) {
                    try {
                        double latitude = location.getLatitude();
                        double longitude = location.getLongitude();
                        if (AbstractC6941uJ.f43644a.m17864z0(NegativeLatLongSavesIncorrectlyQuirk.class) != null) {
                            if (latitude < ConfigValue.DOUBLE_DEFAULT_VALUE) {
                                latitude = ((latitude * 10000.0d) - 1.0d) / 10000.0d;
                            }
                            if (longitude < ConfigValue.DOUBLE_DEFAULT_VALUE) {
                                longitude = ((longitude * 10000.0d) - 1.0d) / 10000.0d;
                            }
                        }
                        Pair pairCreate = Pair.create(Double.valueOf(latitude), Double.valueOf(longitude));
                        mediaMuxerM24035f.setLocation((float) ((Double) pairCreate.first).doubleValue(), (float) ((Double) pairCreate.second).doubleValue());
                    } catch (IllegalArgumentException e) {
                        mediaMuxerM24035f.release();
                        m18503r(c6693qe, 5, e);
                        interfaceC1345VN.close();
                        return;
                    }
                }
                this.f27777x = Integer.valueOf(mediaMuxerM24035f.addTrack((MediaFormat) this.f27725G.f2543b));
                if (m18500m()) {
                    this.f27776w = Integer.valueOf(mediaMuxerM24035f.addTrack((MediaFormat) this.f27727I.f2543b));
                }
                try {
                    mediaMuxerM24035f.start();
                    this.f27721C = mediaMuxerM24035f;
                    m18495L(interfaceC1345VN, c6693qe);
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        m18494K((InterfaceC1345VN) it2.next(), c6693qe);
                    }
                    interfaceC1345VN.close();
                } catch (IllegalStateException e2) {
                    G10 g10 = this.f27756f0;
                    g10.getClass();
                    m18503r(c6693qe, g10.m2885B() < this.f27763j ? 3 : 1, e2);
                    interfaceC1345VN.close();
                }
            } catch (IOException e3) {
                if (!(e3 instanceof FileNotFoundException) || (message = e3.getMessage()) == null || !AbstractC11374v51.m25351p(message, "No space left on device", false)) {
                    i3 = 5;
                }
                m18503r(c6693qe, i3, e3);
                interfaceC1345VN.close();
            }
        } finally {
        }
    }

    /* renamed from: E */
    public final void m18488E(C6693qe c6693qe) {
        int i;
        String str;
        C7150xd c7150xd;
        InterfaceC10864r61 c8875bc1;
        C1613Zd c1613Zd = (C1613Zd) m18480k(this.f27722D);
        C1614Ze c1614Ze = this.f27774u;
        int i2 = c1613Zd.f15048c;
        String str2 = i2 != 1 ? "audio/mp4a-latm" : "audio/vorbis";
        int i3 = (i2 != 1 ? "audio/mp4a-latm" : "audio/vorbis").equals("audio/mp4a-latm") ? 2 : -1;
        if (c1614Ze == null || (c7150xd = c1614Ze.f15067e) == null) {
            i = i3;
            str = str2;
            c7150xd = null;
        } else {
            String str3 = c7150xd.f45713b;
            if (Objects.equals(str3, "audio/none")) {
                AbstractC7806Jm0.m4412f("AudioConfigUtil");
            } else {
                int i4 = c7150xd.f45717f;
                if (i2 == -1) {
                    AbstractC7806Jm0.m4412f("AudioConfigUtil");
                    i = i4;
                } else if (str2.equals(str3) && i3 == i4) {
                    AbstractC7806Jm0.m4412f("AudioConfigUtil");
                    i = i3;
                } else {
                    AbstractC7806Jm0.m4412f("AudioConfigUtil");
                }
                str = str3;
            }
            i = i3;
            str = str2;
            c7150xd = null;
        }
        if (str == null) {
            throw new NullPointerException("Null mimeType");
        }
        C7150xd c7150xd2 = c7150xd != null ? c7150xd : null;
        C6897tc c6897tc = c1613Zd.f15047b;
        C6834sc c6834sc = (C6834sc) (c7150xd2 != null ? new C0827N8(c6897tc, 4, c7150xd2) : new G10(3, c6897tc)).get();
        if (this.f27723E != null) {
            m18505t();
        }
        if (!c6693qe.f41087k) {
            throw new AssertionError("Recording does not have audio enabled. Unable to create audio source for recording " + c6693qe);
        }
        InterfaceC9107dO0 interfaceC9107dO0 = (InterfaceC9107dO0) c6693qe.f41080d.getAndSet(null);
        if (interfaceC9107dO0 == null) {
            throw new AssertionError("One-time audio source creation has already occurred for recording " + c6693qe);
        }
        C0541Ia c0541IaMo10451a = interfaceC9107dO0.mo10451a(c6834sc, f27716q0);
        this.f27723E = c0541IaMo10451a;
        String.format("Set up new audio source: 0x%x", Integer.valueOf(c0541IaMo10451a.hashCode()));
        AbstractC7806Jm0.m4412f("Recorder");
        C6897tc c6897tc2 = c1613Zd.f15047b;
        if (c7150xd2 != null) {
            c8875bc1 = new C8875bc1(str, i, c6897tc2, c6834sc, c7150xd2);
        } else {
            C9557gv0 c9557gv0 = new C9557gv0();
            c9557gv0.f28086b = str;
            c9557gv0.f28085a = i;
            c9557gv0.f28087c = c6897tc2;
            c9557gv0.f28088d = c6834sc;
            c8875bc1 = c9557gv0;
        }
        C6754rc c6754rc = (C6754rc) c8875bc1.get();
        getClass();
        C6820sO c6820sO = new C6820sO(this.f27749c, c6754rc);
        this.f27726H = c6820sO;
        InterfaceC1661aO interfaceC1661aO = c6820sO.f42396f;
        if (!(interfaceC1661aO instanceof C6549oO)) {
            throw new AssertionError("The EncoderInput of audio isn't a ByteBufferInput.");
        }
        C0541Ia c0541Ia = this.f27723E;
        c0541Ia.f4993a.execute(new RunnableC6720r4(c0541Ia, 7, (C6549oO) interfaceC1661aO));
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* renamed from: F */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m18489F(p000.C6693qe r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C9491gO0.m18489F(qe, boolean):void");
    }

    /* renamed from: G */
    public final void m18490G(C6693qe c6693qe, long j, int i, Exception exc) throws Exception {
        if (this.f27770q != c6693qe || this.f27771r) {
            return;
        }
        this.f27771r = true;
        this.f27737S = i;
        this.f27738T = exc;
        if (m18500m()) {
            while (true) {
                C22 c22 = this.f27740V;
                if (c22.m956d()) {
                    break;
                } else {
                    c22.m953a();
                }
            }
            C6820sO c6820sO = this.f27726H;
            c6820sO.f42407q.getClass();
            c6820sO.f42398h.execute(new RunnableC6297kO(c6820sO, j, C10212m12.m22629h(), 0));
        }
        InterfaceC1345VN interfaceC1345VN = this.f27739U;
        if (interfaceC1345VN != null) {
            interfaceC1345VN.close();
            this.f27739U = null;
        }
        if (this.f27762i0 != 2) {
            RunnableC4239iO runnableC4239iO = new RunnableC4239iO(this.f27724F, 6);
            this.f27743Y = QR1.m6710h().schedule(new MD0(this.f27751d, 16, runnableC4239iO), 1000L, TimeUnit.MILLISECONDS);
        } else {
            m18483q(this.f27724F);
        }
        C6820sO c6820sO2 = this.f27724F;
        c6820sO2.f42407q.getClass();
        c6820sO2.f42398h.execute(new RunnableC6297kO(c6820sO2, j, C10212m12.m22629h(), 0));
    }

    /* renamed from: H */
    public final void m18491H(final C6693qe c6693qe, boolean z) {
        ArrayList arrayList = this.f27775v;
        if (!arrayList.isEmpty()) {
            C11834yj0 c11834yj0M7479b = AbstractC8301Sz1.m7479b(arrayList);
            if (!c11834yj0M7479b.isDone()) {
                c11834yj0M7479b.cancel(true);
            }
            arrayList.clear();
        }
        final int i = 0;
        arrayList.add(AbstractC11797yQ1.m26149b(new InterfaceC0363Fl(this) { // from class: ZN0

            /* renamed from: b */
            public final /* synthetic */ C9491gO0 f14873b;

            {
                this.f14873b = this;
            }

            /* renamed from: a */
            private final Object m9526a(C0300El c0300El) {
                C9491gO0 c9491gO0 = this.f14873b;
                C6820sO c6820sO = c9491gO0.f27724F;
                C10910rT1 c10910rT1 = new C10910rT1(c9491gO0, c0300El, c6693qe);
                ExecutorC10151lY0 executorC10151lY0 = c9491gO0.f27751d;
                synchronized (c6820sO.f42392b) {
                    c6820sO.f42408r = c10910rT1;
                    c6820sO.f42409s = executorC10151lY0;
                }
                return "videoEncodingFuture";
            }

            @Override // p000.InterfaceC0363Fl
            /* renamed from: h0 */
            public final Object mo411h0(C0300El c0300El) {
                switch (i) {
                    case 0:
                        return m9526a(c0300El);
                    default:
                        C9491gO0 c9491gO0 = this.f14873b;
                        c9491gO0.getClass();
                        C1372Vo c1372Vo = new C1372Vo(c9491gO0, 3, c0300El);
                        C0541Ia c0541Ia = c9491gO0.f27723E;
                        ExecutorC10151lY0 executorC10151lY0 = c9491gO0.f27751d;
                        c0541Ia.f4993a.execute(new RunnableC8339Ts1(c0541Ia, executorC10151lY0, new C7967Mo1(c9491gO0, c1372Vo, false), 3));
                        C6820sO c6820sO = c9491gO0.f27726H;
                        C8071Oo1 c8071Oo1 = new C8071Oo1(c9491gO0, c0300El, c1372Vo, c6693qe);
                        synchronized (c6820sO.f42392b) {
                            c6820sO.f42408r = c8071Oo1;
                            c6820sO.f42409s = executorC10151lY0;
                        }
                        return "audioEncodingFuture";
                }
            }
        }));
        if (m18500m() && !z) {
            final int i2 = 1;
            arrayList.add(AbstractC11797yQ1.m26149b(new InterfaceC0363Fl(this) { // from class: ZN0

                /* renamed from: b */
                public final /* synthetic */ C9491gO0 f14873b;

                {
                    this.f14873b = this;
                }

                /* renamed from: a */
                private final Object m9526a(C0300El c0300El) {
                    C9491gO0 c9491gO0 = this.f14873b;
                    C6820sO c6820sO = c9491gO0.f27724F;
                    C10910rT1 c10910rT1 = new C10910rT1(c9491gO0, c0300El, c6693qe);
                    ExecutorC10151lY0 executorC10151lY0 = c9491gO0.f27751d;
                    synchronized (c6820sO.f42392b) {
                        c6820sO.f42408r = c10910rT1;
                        c6820sO.f42409s = executorC10151lY0;
                    }
                    return "videoEncodingFuture";
                }

                @Override // p000.InterfaceC0363Fl
                /* renamed from: h0 */
                public final Object mo411h0(C0300El c0300El) {
                    switch (i2) {
                        case 0:
                            return m9526a(c0300El);
                        default:
                            C9491gO0 c9491gO0 = this.f14873b;
                            c9491gO0.getClass();
                            C1372Vo c1372Vo = new C1372Vo(c9491gO0, 3, c0300El);
                            C0541Ia c0541Ia = c9491gO0.f27723E;
                            ExecutorC10151lY0 executorC10151lY0 = c9491gO0.f27751d;
                            c0541Ia.f4993a.execute(new RunnableC8339Ts1(c0541Ia, executorC10151lY0, new C7967Mo1(c9491gO0, c1372Vo, false), 3));
                            C6820sO c6820sO = c9491gO0.f27726H;
                            C8071Oo1 c8071Oo1 = new C8071Oo1(c9491gO0, c0300El, c1372Vo, c6693qe);
                            synchronized (c6820sO.f42392b) {
                                c6820sO.f42408r = c8071Oo1;
                                c6820sO.f42409s = executorC10151lY0;
                            }
                            return "audioEncodingFuture";
                    }
                }
            }));
        }
        AbstractC8301Sz1.m7478a(AbstractC8301Sz1.m7479b(arrayList), new C8170Qm0(29, this), QR1.m6703a());
    }

    /* renamed from: I */
    public final void m18492I() {
        C6693qe c6693qe = this.f27770q;
        if (c6693qe != null) {
            c6693qe.m24036g(new C7957Mj1(c6693qe.f41084h, m18499j()));
        }
    }

    /* renamed from: J */
    public final void m18493J(EnumC9363fO0 enumC9363fO0) {
        if (!f27709j0.contains(this.f27764k)) {
            throw new AssertionError("Can only updated non-pending state from a pending state, but state is " + this.f27764k);
        }
        if (!f27710k0.contains(enumC9363fO0)) {
            throw new AssertionError("Invalid state transition. State is not a valid non-pending state while in a pending state: " + enumC9363fO0);
        }
        if (this.f27765l != enumC9363fO0) {
            this.f27765l = enumC9363fO0;
            this.f27745a.m4389e(new C0356Fe(this.f27766m, m18481l(enumC9363fO0), this.f27772s));
        }
    }

    /* renamed from: K */
    public final void m18494K(InterfaceC1345VN interfaceC1345VN, C6693qe c6693qe) throws Exception {
        long size = interfaceC1345VN.size() + this.f27729K;
        long j = this.f27735Q;
        if (j != 0 && size > j) {
            String.format("Reach file size limit %d > %d", Long.valueOf(size), Long.valueOf(this.f27735Q));
            AbstractC7806Jm0.m4412f("Recorder");
            m18503r(c6693qe, 2, null);
            return;
        }
        long jMo8428Y = interfaceC1345VN.mo8428Y();
        long j2 = this.f27732N;
        if (j2 == Long.MAX_VALUE) {
            this.f27732N = jMo8428Y;
            String.format("First audio time: %d (%s)", Long.valueOf(jMo8428Y), AbstractC11306uZ1.m25210c(this.f27732N));
            AbstractC7806Jm0.m4412f("Recorder");
        } else {
            TimeUnit timeUnit = TimeUnit.MICROSECONDS;
            long nanos = timeUnit.toNanos(jMo8428Y - Math.min(this.f27731M, j2));
            AbstractC9104dM1.m17550i(this.f27734P != Long.MAX_VALUE, "There should be a previous data for adjusting the duration.");
            long nanos2 = timeUnit.toNanos(jMo8428Y - this.f27734P) + nanos;
            long j3 = this.f27736R;
            if (j3 != 0 && nanos2 > j3) {
                String.format("Audio data reaches duration limit %d > %d", Long.valueOf(nanos2), Long.valueOf(this.f27736R));
                AbstractC7806Jm0.m4412f("Recorder");
                m18503r(c6693qe, 9, null);
                return;
            }
        }
        try {
            this.f27721C.writeSampleData(this.f27776w.intValue(), interfaceC1345VN.mo8427Q(), interfaceC1345VN.mo8425C());
            this.f27729K = size;
            this.f27734P = jMo8428Y;
        } catch (IllegalStateException e) {
            G10 g10 = this.f27756f0;
            g10.getClass();
            m18503r(c6693qe, g10.m2885B() < this.f27763j ? 3 : 1, e);
        }
    }

    /* renamed from: L */
    public final void m18495L(InterfaceC1345VN interfaceC1345VN, C6693qe c6693qe) throws Exception {
        String str;
        long nanos;
        long j = this.f27763j;
        if (this.f27777x == null) {
            throw new AssertionError("Video data comes before the track is added to MediaMuxer.");
        }
        long size = interfaceC1345VN.size() + this.f27729K;
        long j2 = this.f27735Q;
        if (j2 != 0 && size > j2) {
            String.format("Reach file size limit %d > %d", Long.valueOf(size), Long.valueOf(this.f27735Q));
            AbstractC7806Jm0.m4412f("Recorder");
            m18503r(c6693qe, 2, null);
            return;
        }
        long jMo8428Y = interfaceC1345VN.mo8428Y();
        long j3 = this.f27731M;
        if (j3 == Long.MAX_VALUE) {
            this.f27731M = jMo8428Y;
            String.format("First video time: %d (%s)", Long.valueOf(jMo8428Y), AbstractC11306uZ1.m25210c(this.f27731M));
            AbstractC7806Jm0.m4412f("Recorder");
            str = "Recorder";
            nanos = 0;
        } else {
            TimeUnit timeUnit = TimeUnit.MICROSECONDS;
            str = "Recorder";
            nanos = timeUnit.toNanos(jMo8428Y - Math.min(j3, this.f27732N));
            AbstractC9104dM1.m17550i(this.f27733O != Long.MAX_VALUE, "There should be a previous data for adjusting the duration.");
            long nanos2 = timeUnit.toNanos(jMo8428Y - this.f27733O) + nanos;
            long j4 = this.f27736R;
            if (j4 != 0 && nanos2 > j4) {
                String.format("Video data reaches duration limit %d > %d", Long.valueOf(nanos2), Long.valueOf(this.f27736R));
                AbstractC7806Jm0.m4412f(str);
                m18503r(c6693qe, 9, null);
                return;
            }
        }
        try {
            this.f27721C.writeSampleData(this.f27777x.intValue(), interfaceC1345VN.mo8427Q(), interfaceC1345VN.mo8425C());
            this.f27729K = size;
            this.f27730L = nanos;
            this.f27733O = jMo8428Y;
            m18492I();
            if (size > this.f27758g0) {
                G10 g10 = this.f27756f0;
                g10.getClass();
                long jM2885B = g10.m2885B();
                AbstractC8729aT1.m9750b(jM2885B);
                AbstractC7806Jm0.m4412f(str);
                if (jM2885B < j) {
                    m18503r(c6693qe, 3, new IOException(String.format("Insufficient storage space. The available storage (%d bytes) is below the required threshold of %d bytes.", Long.valueOf(jM2885B), Long.valueOf(j))));
                } else {
                    this.f27758g0 = jM2885B - j;
                }
            }
        } catch (IllegalStateException e) {
            G10 g102 = this.f27756f0;
            g102.getClass();
            m18503r(c6693qe, g102.m2885B() >= j ? 1 : 3, e);
        }
    }

    @Override // p000.InterfaceC7645Gj1
    /* renamed from: a */
    public final InterfaceC9177dx0 mo3138a() {
        return this.f27722D;
    }

    @Override // p000.InterfaceC7645Gj1
    /* renamed from: b */
    public final void mo3139b(int i) {
        this.f27751d.execute(new RunnableC6246ja(this, i, 10));
    }

    @Override // p000.InterfaceC7645Gj1
    /* renamed from: c */
    public final InterfaceC9177dx0 mo3140c() {
        return this.f27745a;
    }

    @Override // p000.InterfaceC7645Gj1
    /* renamed from: d */
    public final InterfaceC9177dx0 mo3141d() {
        return this.f27747b;
    }

    @Override // p000.InterfaceC7645Gj1
    /* renamed from: e */
    public final void mo3142e(Z61 z61, EnumC11690xa1 enumC11690xa1) {
        synchronized (this.f27759h) {
            try {
                Objects.toString(this.f27764k);
                AbstractC7806Jm0.m4412f("Recorder");
                if (this.f27764k == EnumC9363fO0.f27173i) {
                    m18485B(EnumC9363fO0.f27165a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f27751d.execute(new RunnableC8176Qp0(this, z61, enumC11690xa1, 4));
    }

    @Override // p000.InterfaceC7645Gj1
    /* renamed from: f */
    public final InterfaceC7955Mi1 mo3143f(InterfaceC6766ro interfaceC6766ro) {
        return new C1338VG(interfaceC6766ro);
    }

    /* renamed from: g */
    public final void m18496g(Z61 z61, EnumC11690xa1 enumC11690xa1, boolean z) {
        Object value;
        C6630pe c6630pe;
        if (z61.m9490a()) {
            AbstractC7806Jm0.m4412f("Recorder");
            return;
        }
        VN0 vn0 = new VN0(this);
        ExecutorC10151lY0 executorC10151lY0 = this.f27751d;
        z61.m9492c(executorC10151lY0, vn0);
        C1338VG c1338vg = new C1338VG(z61.f14741e.mo1328b());
        C0149CM c0149cm = z61.f14739c;
        C1121Rp c1121RpM8344h = c1338vg.m8344h(c0149cm);
        Size size = z61.f14738b;
        if (c1121RpM8344h == null) {
            c6630pe = C6630pe.f40254j;
        } else {
            TreeMap treeMap = c1121RpM8344h.f10437b;
            Size size2 = AbstractC9318f21.f27016a;
            Map.Entry entryCeilingEntry = treeMap.ceilingEntry(size);
            if (entryCeilingEntry != null) {
                value = entryCeilingEntry.getValue();
            } else {
                Map.Entry entryFloorEntry = treeMap.floorEntry(size);
                value = entryFloorEntry != null ? entryFloorEntry.getValue() : null;
            }
            c6630pe = (C6630pe) value;
            if (c6630pe == null) {
                c6630pe = C6630pe.f40254j;
            }
        }
        Objects.toString(c6630pe);
        Objects.toString(size);
        AbstractC7806Jm0.m4412f("Recorder");
        if (c6630pe != C6630pe.f40254j) {
            C1614Ze c1614ZeMo2831l = c1338vg.mo2831l(c6630pe, c0149cm);
            this.f27774u = c1614ZeMo2831l;
            if (c1614ZeMo2831l == null) {
                throw new AssertionError("Camera advertised available quality but did not produce EncoderProfiles  for advertised quality.");
            }
        }
        C9235eO0 c9235eO0 = this.f27754e0;
        if (c9235eO0 != null && !c9235eO0.f26690d) {
            c9235eO0.f26690d = true;
            ScheduledFuture scheduledFuture = c9235eO0.f26692f;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                c9235eO0.f26692f = null;
            }
        }
        C9235eO0 c9235eO02 = new C9235eO0(this, z61, enumC11690xa1, z ? f27717r0 : 0);
        this.f27754e0 = c9235eO02;
        Objects.toString(this.f27724F);
        AbstractC7806Jm0.m4412f("Recorder");
        C10715py0 c10715py0 = this.f27746a0;
        c10715py0.m23906a();
        AbstractC8301Sz1.m7489l((InterfaceFutureC7800Jj0) c10715py0.f40471k).mo2494d(new RunnableC8176Qp0(c9235eO02, z61, enumC11690xa1, 5), executorC10151lY0);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00c5 A[EDGE_INSN: B:110:0x00c5->B:32:0x00c5 BREAK  A[LOOP:0: B:29:0x00b9->B:31:0x00c1], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c1 A[LOOP:0: B:29:0x00b9->B:31:0x00c1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0158 A[Catch: all -> 0x0122, TryCatch #0 {all -> 0x0122, blocks: (B:45:0x00f5, B:47:0x00f9, B:48:0x0106, B:85:0x019f, B:52:0x0111, B:54:0x0115, B:56:0x011b, B:62:0x0126, B:63:0x0133, B:65:0x013d, B:66:0x0150, B:69:0x0154, B:71:0x0158, B:72:0x0169, B:74:0x016d, B:76:0x0173, B:80:0x017b, B:81:0x0187, B:83:0x018b, B:99:0x01c8, B:100:0x01cf), top: B:107:0x00f5 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0169 A[Catch: all -> 0x0122, TryCatch #0 {all -> 0x0122, blocks: (B:45:0x00f5, B:47:0x00f9, B:48:0x0106, B:85:0x019f, B:52:0x0111, B:54:0x0115, B:56:0x011b, B:62:0x0126, B:63:0x0133, B:65:0x013d, B:66:0x0150, B:69:0x0154, B:71:0x0158, B:72:0x0169, B:74:0x016d, B:76:0x0173, B:80:0x017b, B:81:0x0187, B:83:0x018b, B:99:0x01c8, B:100:0x01cf), top: B:107:0x00f5 }] */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m18497h(int r17, java.lang.Throwable r18) {
        /*
            Method dump skipped, instructions count: 500
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C9491gO0.m18497h(int, java.lang.Throwable):void");
    }

    /* renamed from: i */
    public final void m18498i(C6693qe c6693qe, int i, Throwable th) {
        Uri uri = Uri.EMPTY;
        c6693qe.m24032a(uri);
        C6756re c6756reM24436a = C6756re.m24436a(0L, 0L, new C6960uc(1, ConfigValue.DOUBLE_DEFAULT_VALUE, this.f27741W));
        AbstractC9104dM1.m17549h(uri, "OutputUri cannot be null.");
        C3941de c3941de = new C3941de(uri);
        AbstractC9104dM1.m17545d("An error type is required.", i != 0);
        c6693qe.m24036g(new C7749Ij1(c6693qe.f41084h, c6756reM24436a, c3941de, i, th));
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0040  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p000.C6756re m18499j() {
        /*
            r9 = this;
            long r0 = r9.f27730L
            long r2 = r9.f27729K
            int r4 = r9.f27760h0
            int r5 = p000.AbstractC7222ym.m26247x(r4)
            if (r5 == 0) goto L40
            r6 = 2
            if (r5 == r6) goto L40
            r7 = 5
            r8 = 3
            if (r5 == r8) goto L2b
            r6 = 4
            if (r5 == r6) goto L29
            if (r5 != r7) goto L19
            goto L41
        L19:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r1 = p000.AbstractC11153tN0.m24886D(r4)
            java.lang.String r2 = "Invalid internal audio state: "
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        L29:
            r6 = r8
            goto L41
        L2b:
            qe r4 = r9.f27770q
            if (r4 == 0) goto L39
            java.util.concurrent.atomic.AtomicBoolean r4 = r4.f41082f
            boolean r4 = r4.get()
            if (r4 == 0) goto L39
            r6 = r7
            goto L41
        L39:
            boolean r4 = r9.f27742X
            if (r4 == 0) goto L3e
            goto L41
        L3e:
            r6 = 0
            goto L41
        L40:
            r6 = 1
        L41:
            java.lang.Throwable r4 = r9.f27741W
            double r7 = r9.f27750c0
            uc r5 = new uc
            r5.<init>(r6, r7, r4)
            re r0 = p000.C6756re.m24436a(r0, r2, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C9491gO0.m18499j():re");
    }

    /* renamed from: m */
    public final boolean m18500m() {
        return this.f27760h0 == 4;
    }

    /* renamed from: n */
    public final boolean m18501n() {
        C6693qe c6693qe = this.f27770q;
        return c6693qe != null && c6693qe.f41088l;
    }

    /* renamed from: p */
    public final C6693qe m18502p(EnumC9363fO0 enumC9363fO0) {
        boolean z;
        if (enumC9363fO0 == EnumC9363fO0.f27167c) {
            z = true;
        } else {
            if (enumC9363fO0 != EnumC9363fO0.f27166b) {
                throw new AssertionError("makePendingRecordingActiveLocked() can only be called from a pending state.");
            }
            z = false;
        }
        if (this.f27767n != null) {
            throw new AssertionError("Cannot make pending recording active because another recording is already active.");
        }
        C6693qe c6693qe = this.f27768o;
        if (c6693qe == null) {
            throw new AssertionError("Pending recording should exist when in a PENDING state.");
        }
        this.f27767n = c6693qe;
        c6693qe.f41083g.mo1479a(QR1.m6703a(), new EG0(1, this));
        this.f27768o = null;
        if (z) {
            m18485B(EnumC9363fO0.f27170f);
        } else {
            m18485B(EnumC9363fO0.f27169e);
        }
        return c6693qe;
    }

    /* renamed from: r */
    public final void m18503r(C6693qe c6693qe, int i, Exception exc) throws Exception {
        boolean z;
        if (c6693qe != this.f27770q) {
            throw new AssertionError("Internal error occurred on recording that is not the current in-progress recording.");
        }
        synchronized (this.f27759h) {
            try {
                z = false;
                switch (this.f27764k.ordinal()) {
                    case 0:
                    case 3:
                    case 8:
                        throw new AssertionError("In-progress recording error occurred while in unexpected state: " + this.f27764k);
                    case 4:
                    case 5:
                        m18485B(EnumC9363fO0.f27171g);
                        z = true;
                    case 1:
                    case 2:
                    case 6:
                    case 7:
                        if (c6693qe != this.f27767n) {
                            throw new AssertionError("Internal error occurred for recording but it is not the active recording.");
                        }
                        break;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            m18490G(c6693qe, -1L, i, exc);
        }
    }

    /* renamed from: s */
    public final void m18504s(C6693qe c6693qe) {
        if (this.f27770q != c6693qe || this.f27771r) {
            return;
        }
        if (m18500m()) {
            this.f27726H.m24721e();
        }
        this.f27724F.m24721e();
        C6693qe c6693qe2 = this.f27770q;
        c6693qe2.m24036g(new C7801Jj1(c6693qe2.f41084h, m18499j()));
    }

    /* renamed from: t */
    public final void m18505t() {
        int i = 1;
        C0541Ia c0541Ia = this.f27723E;
        if (c0541Ia == null) {
            throw new AssertionError("Cannot release null audio source.");
        }
        this.f27723E = null;
        String.format("Releasing audio source: 0x%x", Integer.valueOf(c0541Ia.hashCode()));
        AbstractC7806Jm0.m4412f("Recorder");
        AbstractC8301Sz1.m7478a(AbstractC11797yQ1.m26149b(new C0071B7(i, c0541Ia)), new C8342Tu0(25, c0541Ia), QR1.m6703a());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: u */
    public final void m18506u(boolean z) {
        boolean z2;
        boolean z3;
        synchronized (this.f27759h) {
            try {
                z2 = true;
                z3 = false;
                switch (this.f27764k.ordinal()) {
                    case 0:
                    case 3:
                    case 8:
                        break;
                    case 1:
                    case 2:
                        m18493J(EnumC9363fO0.f27172h);
                        break;
                    case 4:
                    case 5:
                        AbstractC9104dM1.m17550i(this.f27770q != null, "In-progress recording shouldn't be null when in state " + this.f27764k);
                        if (this.f27767n != this.f27770q) {
                            throw new AssertionError("In-progress recording does not match the active recording. Unable to reset encoder.");
                        }
                        if (!m18501n()) {
                            m18485B(EnumC9363fO0.f27172h);
                            z3 = true;
                            z2 = false;
                        }
                        break;
                    case 6:
                        m18485B(EnumC9363fO0.f27172h);
                        z2 = false;
                        break;
                    case 7:
                    default:
                        z2 = false;
                        break;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z2) {
            if (z3) {
                m18490G(this.f27770q, -1L, 4, null);
            }
        } else if (z) {
            m18508w();
        } else {
            m18507v();
        }
    }

    /* renamed from: v */
    public final void m18507v() {
        if (this.f27726H != null) {
            AbstractC7806Jm0.m4412f("Recorder");
            C6820sO c6820sO = this.f27726H;
            c6820sO.getClass();
            c6820sO.f42398h.execute(new RunnableC4239iO(c6820sO, 4));
            this.f27726H = null;
            this.f27727I = null;
        }
        if (this.f27723E != null) {
            m18505t();
        }
        m18510y(1);
        m18508w();
    }

    /* renamed from: w */
    public final void m18508w() {
        Z61 z61;
        boolean z = true;
        if (this.f27724F != null) {
            AbstractC7806Jm0.m4412f("Recorder");
            C10715py0 c10715py0 = this.f27748b0;
            if (c10715py0 != null) {
                AbstractC9104dM1.m17550i(((C6820sO) c10715py0.f40467g) == this.f27724F, null);
                Objects.toString(this.f27724F);
                AbstractC7806Jm0.m4412f("Recorder");
                this.f27748b0.m23916l();
                this.f27748b0 = null;
                this.f27724F = null;
                this.f27725G = null;
                m18484A(null);
            } else {
                Objects.toString(this.f27724F);
                AbstractC7806Jm0.m4412f("Recorder");
                C10715py0 c10715py02 = this.f27746a0;
                c10715py02.m23906a();
                AbstractC8301Sz1.m7489l((InterfaceFutureC7800Jj0) c10715py02.f40471k);
            }
        }
        synchronized (this.f27759h) {
            try {
                switch (this.f27764k.ordinal()) {
                    case 1:
                    case 2:
                        m18493J(EnumC9363fO0.f27165a);
                        break;
                    case 4:
                    case 5:
                    case 8:
                        if (m18501n()) {
                            z = false;
                            break;
                        }
                    case 3:
                    case 6:
                    case 7:
                        m18485B(EnumC9363fO0.f27165a);
                        break;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f27744Z = false;
        if (!z || (z61 = this.f27778y) == null || z61.m9490a()) {
            return;
        }
        m18496g(this.f27778y, this.f27779z, false);
    }

    /* renamed from: x */
    public final void m18509x() {
        if (f27709j0.contains(this.f27764k)) {
            m18485B(this.f27765l);
        } else {
            throw new AssertionError("Cannot restore non-pending state when in state " + this.f27764k);
        }
    }

    /* renamed from: y */
    public final void m18510y(int i) {
        AbstractC7806Jm0.m4412f("Recorder");
        this.f27760h0 = i;
    }

    /* renamed from: z */
    public final void m18511z(C0922Oe c0922Oe) {
        Objects.toString(c0922Oe);
        AbstractC7806Jm0.m4412f("Recorder");
        this.f27772s = c0922Oe;
        synchronized (this.f27759h) {
            this.f27745a.m4389e(new C0356Fe(this.f27766m, m18481l(this.f27764k), c0922Oe));
        }
    }
}
