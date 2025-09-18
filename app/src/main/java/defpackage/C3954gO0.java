package defpackage;

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
public final class C3954gO0 implements InterfaceC0517Gj1 {
    public static final Set j0 = Collections.unmodifiableSet(EnumSet.of(EnumC3763fO0.b, EnumC3763fO0.c));
    public static final Set k0 = Collections.unmodifiableSet(EnumSet.of(EnumC3763fO0.a, EnumC3763fO0.d, EnumC3763fO0.h, EnumC3763fO0.g, EnumC3763fO0.i));
    public static final C1903Ye l0;
    public static final C1978Zd m0;
    public static final RuntimeException n0;
    public static final C2199an o0;
    public static final C2199an p0;
    public static final ExecutorC5715lY0 q0;
    public static final int r0;
    public static final long s0;
    public Surface A;
    public Surface B;
    public MediaMuxer C;
    public final C0743Jh D;
    public C0644Ia E;
    public C7020sO F;
    public EE G;
    public C7020sO H;
    public EE I;
    public Uri J;
    public long K;
    public long L;
    public long M;
    public long N;
    public long O;
    public long P;
    public long Q;
    public long R;
    public int S;
    public Exception T;
    public VN U;
    public final C22 V;
    public Throwable W;
    public boolean X;
    public ScheduledFuture Y;
    public boolean Z;
    public final C0743Jh a;
    public C6557py0 a0;
    public final C0743Jh b;
    public C6557py0 b0;
    public final Executor c;
    public double c0;
    public final ExecutorC5715lY0 d;
    public boolean d0;
    public final C2199an e;
    public C3572eO0 e0;
    public final C2199an f;
    public G10 f0;
    public final C2199an g;
    public long g0;
    public final Object h = new Object();
    public int h0;
    public final boolean i;
    public int i0;
    public final long j;
    public EnumC3763fO0 k;
    public EnumC3763fO0 l;
    public int m;
    public C6687qe n;
    public C6687qe o;
    public long p;
    public C6687qe q;
    public boolean r;
    public C1123Oe s;
    public C1123Oe t;
    public C1981Ze u;
    public final ArrayList v;
    public Integer w;
    public Integer x;
    public Z61 y;
    public EnumC8011xa1 z;

    static {
        C6496pe c6496pe = C6496pe.f;
        C3383dO1 c3383dO1W = C3383dO1.w(Arrays.asList(c6496pe, C6496pe.e, C6496pe.d), new C0575Hd(c6496pe, 1));
        C6860rY0 c6860rY0A = C1903Ye.a();
        c6860rY0A.b = c3383dO1W;
        c6860rY0A.e = -1;
        C1903Ye c1903YeQ = c6860rY0A.q();
        l0 = c1903YeQ;
        C7253tc c7253tcA = C7253tc.a().a();
        C1903Ye.a().q();
        m0 = new C1978Zd(c1903YeQ, c7253tcA, -1);
        n0 = new RuntimeException("The video frame producer became inactive before any data was received.");
        o0 = new C2199an();
        p0 = new C2199an();
        q0 = new ExecutorC5715lY0(QR1.g());
        r0 = 3;
        s0 = 1000L;
    }

    public C3954gO0(C1978Zd c1978Zd, C2199an c2199an, C2199an c2199an2, C2199an c2199an3, long j) {
        this.i = AbstractC7387uJ.a.z0(EncoderNotUsePersistentInputSurfaceQuirk.class) != null;
        this.k = EnumC3763fO0.a;
        this.l = null;
        this.m = 0;
        this.n = null;
        this.o = null;
        this.p = 0L;
        this.q = null;
        this.r = false;
        this.s = null;
        this.t = null;
        this.u = null;
        this.v = new ArrayList();
        this.w = null;
        this.x = null;
        this.A = null;
        this.B = null;
        this.C = null;
        this.E = null;
        this.F = null;
        this.G = null;
        this.H = null;
        this.I = null;
        this.h0 = 1;
        this.J = Uri.EMPTY;
        this.K = 0L;
        this.L = 0L;
        this.M = Long.MAX_VALUE;
        this.N = Long.MAX_VALUE;
        this.O = Long.MAX_VALUE;
        this.P = Long.MAX_VALUE;
        this.Q = 0L;
        this.R = 0L;
        this.S = 1;
        this.T = null;
        this.U = null;
        this.V = new C22(60, (C2199an) null);
        this.W = null;
        this.X = false;
        this.i0 = 3;
        this.Y = null;
        this.Z = false;
        this.b0 = null;
        this.c0 = ConfigValue.DOUBLE_DEFAULT_VALUE;
        this.d0 = false;
        this.e0 = null;
        this.f0 = null;
        this.g0 = Long.MAX_VALUE;
        ExecutorC3799fa0 executorC3799fa0G = QR1.g();
        this.c = executorC3799fa0G;
        ExecutorC5715lY0 executorC5715lY0 = new ExecutorC5715lY0(executorC3799fa0G);
        this.d = executorC5715lY0;
        C1903Ye c1903YeQ = c1978Zd.a;
        C7253tc c7253tc = c1978Zd.b;
        int i = c1978Zd.c;
        if (c1978Zd.a.d == -1) {
            if (c1903YeQ == null) {
                throw new IllegalStateException("Property \"videoSpec\" has not been set");
            }
            C6860rY0 c6860rY0 = new C6860rY0(3, false);
            c6860rY0.b = c1903YeQ.a;
            c6860rY0.c = c1903YeQ.b;
            c6860rY0.d = c1903YeQ.c;
            c6860rY0.e = Integer.valueOf(c1903YeQ.d);
            c6860rY0.e = Integer.valueOf(l0.d);
            c1903YeQ = c6860rY0.q();
        }
        String strConcat = c1903YeQ == null ? " videoSpec" : "";
        strConcat = c7253tc == null ? strConcat.concat(" audioSpec") : strConcat;
        if (!strConcat.isEmpty()) {
            throw new IllegalStateException("Missing required properties:".concat(strConcat));
        }
        this.D = new C0743Jh(new C1978Zd(c1903YeQ, c7253tc, i));
        this.a = new C0743Jh(new C0422Fe(this.m, l(this.k), null));
        this.b = new C0743Jh(Boolean.FALSE);
        this.e = c2199an;
        this.f = c2199an2;
        this.g = c2199an3;
        this.a0 = new C6557py0(c2199an, executorC5715lY0, executorC3799fa0G);
        j = j == -1 ? 52428800L : j;
        this.j = j;
        AbstractC2141aT1.b(j);
        AbstractC0759Jm0.f("Recorder");
    }

    public static Object k(C0743Jh c0743Jh) {
        try {
            return c0743Jh.g().get();
        } catch (InterruptedException | ExecutionException e) {
            throw new IllegalStateException(e);
        }
    }

    public static int l(EnumC3763fO0 enumC3763fO0) {
        return (enumC3763fO0 == EnumC3763fO0.e || (enumC3763fO0 == EnumC3763fO0.g && ((DeactivateEncoderSurfaceBeforeStopEncoderQuirk) AbstractC7387uJ.a.z0(DeactivateEncoderSurfaceBeforeStopEncoderQuirk.class)) == null)) ? 1 : 2;
    }

    public static boolean o(C4145hO0 c4145hO0, C6687qe c6687qe) {
        return c6687qe != null && c4145hO0.c == c6687qe.m;
    }

    public static void q(C7020sO c7020sO) {
        if (c7020sO instanceof C7020sO) {
            c7020sO.h.execute(new RunnableC4335iO(c7020sO, 5));
        }
    }

    public final void A(Surface surface) {
        int iHashCode;
        if (this.A == surface) {
            return;
        }
        this.A = surface;
        synchronized (this.h) {
            if (surface != null) {
                try {
                    iHashCode = surface.hashCode();
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                iHashCode = 0;
            }
            C(iHashCode);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void B(defpackage.EnumC3763fO0 r4) {
        /*
            r3 = this;
            fO0 r0 = r3.k
            if (r0 == r4) goto L67
            java.util.Objects.toString(r0)
            java.util.Objects.toString(r4)
            java.lang.String r0 = "Recorder"
            defpackage.AbstractC0759Jm0.f(r0)
            java.util.Set r0 = defpackage.C3954gO0.j0
            boolean r1 = r0.contains(r4)
            if (r1 == 0) goto L48
            fO0 r1 = r3.k
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L4f
            java.util.Set r0 = defpackage.C3954gO0.k0
            fO0 r1 = r3.k
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L32
            fO0 r0 = r3.k
            r3.l = r0
            int r0 = l(r0)
            goto L50
        L32:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Invalid state transition. Should not be transitioning to a PENDING state from state "
            r0.<init>(r1)
            fO0 r1 = r3.k
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
        L48:
            fO0 r0 = r3.l
            if (r0 == 0) goto L4f
            r0 = 0
            r3.l = r0
        L4f:
            r0 = 0
        L50:
            r3.k = r4
            if (r0 != 0) goto L58
            int r0 = l(r4)
        L58:
            int r4 = r3.m
            Oe r1 = r3.s
            Fe r2 = new Fe
            r2.<init>(r4, r0, r1)
            Jh r4 = r3.a
            r4.e(r2)
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3954gO0.B(fO0):void");
    }

    public final void C(int i) {
        if (this.m == i) {
            return;
        }
        AbstractC0759Jm0.f("Recorder");
        this.m = i;
        this.a.e(new C0422Fe(i, l(this.k), this.s));
    }

    public final void D(C6687qe c6687qe) {
        String message;
        int i = 2;
        int i2 = 0;
        if (this.C != null) {
            throw new AssertionError("Unable to set up media muxer when one already exists.");
        }
        boolean zM = m();
        C22 c22 = this.V;
        if (zM && c22.d()) {
            throw new AssertionError("Audio is enabled but no audio sample is ready. Cannot start media muxer.");
        }
        VN vn = this.U;
        if (vn == null) {
            throw new AssertionError("Media muxer cannot be started without an encoded video frame.");
        }
        try {
            this.U = null;
            long jY = vn.Y();
            ArrayList arrayList = new ArrayList();
            while (!c22.d()) {
                VN vn2 = (VN) c22.a();
                if (vn2.Y() >= jY) {
                    arrayList.add(vn2);
                }
            }
            long size = vn.size();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                size += ((VN) it.next()).size();
            }
            long j = this.Q;
            if (j != 0 && size > j) {
                String.format("Initial data exceeds file size limit %d > %d", Long.valueOf(size), Long.valueOf(this.Q));
                AbstractC0759Jm0.f("Recorder");
                r(c6687qe, 2, null);
                vn.close();
                return;
            }
            int i3 = 3;
            try {
                int i4 = ((C1978Zd) k(this.D)).c;
                if (i4 == -1) {
                    C1981Ze c1981Ze = this.u;
                    int i5 = m0.c != 1 ? 0 : 1;
                    if (c1981Ze == null) {
                        i = i5;
                    } else {
                        int i6 = c1981Ze.b;
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
                MediaMuxer mediaMuxerF = c6687qe.f(i, new WN0(i2, this));
                C1123Oe c1123Oe = this.t;
                if (c1123Oe != null) {
                    z(c1123Oe);
                    mediaMuxerF.setOrientationHint(c1123Oe.b);
                }
                Location location = c6687qe.h.a.c;
                if (location != null) {
                    try {
                        double latitude = location.getLatitude();
                        double longitude = location.getLongitude();
                        if (AbstractC7387uJ.a.z0(NegativeLatLongSavesIncorrectlyQuirk.class) != null) {
                            if (latitude < ConfigValue.DOUBLE_DEFAULT_VALUE) {
                                latitude = ((latitude * 10000.0d) - 1.0d) / 10000.0d;
                            }
                            if (longitude < ConfigValue.DOUBLE_DEFAULT_VALUE) {
                                longitude = ((longitude * 10000.0d) - 1.0d) / 10000.0d;
                            }
                        }
                        Pair pairCreate = Pair.create(Double.valueOf(latitude), Double.valueOf(longitude));
                        mediaMuxerF.setLocation((float) ((Double) pairCreate.first).doubleValue(), (float) ((Double) pairCreate.second).doubleValue());
                    } catch (IllegalArgumentException e) {
                        mediaMuxerF.release();
                        r(c6687qe, 5, e);
                        vn.close();
                        return;
                    }
                }
                this.x = Integer.valueOf(mediaMuxerF.addTrack((MediaFormat) this.G.b));
                if (m()) {
                    this.w = Integer.valueOf(mediaMuxerF.addTrack((MediaFormat) this.I.b));
                }
                try {
                    mediaMuxerF.start();
                    this.C = mediaMuxerF;
                    L(vn, c6687qe);
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        K((VN) it2.next(), c6687qe);
                    }
                    vn.close();
                } catch (IllegalStateException e2) {
                    G10 g10 = this.f0;
                    g10.getClass();
                    r(c6687qe, g10.B() < this.j ? 3 : 1, e2);
                    vn.close();
                }
            } catch (IOException e3) {
                if (!(e3 instanceof FileNotFoundException) || (message = e3.getMessage()) == null || !AbstractC7538v51.p(message, "No space left on device", false)) {
                    i3 = 5;
                }
                r(c6687qe, i3, e3);
                vn.close();
            }
        } finally {
        }
    }

    public final void E(C6687qe c6687qe) {
        int i;
        String str;
        C8018xd c8018xd;
        InterfaceC6777r61 c2359bc1;
        C1978Zd c1978Zd = (C1978Zd) k(this.D);
        C1981Ze c1981Ze = this.u;
        int i2 = c1978Zd.c;
        String str2 = i2 != 1 ? "audio/mp4a-latm" : "audio/vorbis";
        int i3 = (i2 != 1 ? "audio/mp4a-latm" : "audio/vorbis").equals("audio/mp4a-latm") ? 2 : -1;
        if (c1981Ze == null || (c8018xd = c1981Ze.e) == null) {
            i = i3;
            str = str2;
            c8018xd = null;
        } else {
            String str3 = c8018xd.b;
            if (Objects.equals(str3, "audio/none")) {
                AbstractC0759Jm0.f("AudioConfigUtil");
            } else {
                int i4 = c8018xd.f;
                if (i2 == -1) {
                    AbstractC0759Jm0.f("AudioConfigUtil");
                    i = i4;
                } else if (str2.equals(str3) && i3 == i4) {
                    AbstractC0759Jm0.f("AudioConfigUtil");
                    i = i3;
                } else {
                    AbstractC0759Jm0.f("AudioConfigUtil");
                }
                str = str3;
            }
            i = i3;
            str = str2;
            c8018xd = null;
        }
        if (str == null) {
            throw new NullPointerException("Null mimeType");
        }
        C8018xd c8018xd2 = c8018xd != null ? c8018xd : null;
        C7253tc c7253tc = c1978Zd.b;
        C7062sc c7062sc = (C7062sc) (c8018xd2 != null ? new N8(c7253tc, 4, c8018xd2) : new G10(3, c7253tc)).get();
        if (this.E != null) {
            t();
        }
        if (!c6687qe.k) {
            throw new AssertionError("Recording does not have audio enabled. Unable to create audio source for recording " + c6687qe);
        }
        InterfaceC3382dO0 interfaceC3382dO0 = (InterfaceC3382dO0) c6687qe.d.getAndSet(null);
        if (interfaceC3382dO0 == null) {
            throw new AssertionError("One-time audio source creation has already occurred for recording " + c6687qe);
        }
        C0644Ia c0644IaA = interfaceC3382dO0.a(c7062sc, q0);
        this.E = c0644IaA;
        String.format("Set up new audio source: 0x%x", Integer.valueOf(c0644IaA.hashCode()));
        AbstractC0759Jm0.f("Recorder");
        C7253tc c7253tc2 = c1978Zd.b;
        if (c8018xd2 != null) {
            c2359bc1 = new C2359bc1(str, i, c7253tc2, c7062sc, c8018xd2);
        } else {
            C4053gv0 c4053gv0 = new C4053gv0();
            c4053gv0.b = str;
            c4053gv0.a = i;
            c4053gv0.c = c7253tc2;
            c4053gv0.d = c7062sc;
            c2359bc1 = c4053gv0;
        }
        C6871rc c6871rc = (C6871rc) c2359bc1.get();
        getClass();
        C7020sO c7020sO = new C7020sO(this.c, c6871rc);
        this.H = c7020sO;
        InterfaceC2124aO interfaceC2124aO = c7020sO.f;
        if (!(interfaceC2124aO instanceof C6257oO)) {
            throw new AssertionError("The EncoderInput of audio isn't a ByteBufferInput.");
        }
        C0644Ia c0644Ia = this.E;
        c0644Ia.a.execute(new RunnableC6769r4(c0644Ia, 7, (C6257oO) interfaceC2124aO));
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void F(defpackage.C6687qe r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3954gO0.F(qe, boolean):void");
    }

    public final void G(C6687qe c6687qe, long j, int i, Exception exc) throws Exception {
        if (this.q != c6687qe || this.r) {
            return;
        }
        this.r = true;
        this.S = i;
        this.T = exc;
        if (m()) {
            while (true) {
                C22 c22 = this.V;
                if (c22.d()) {
                    break;
                } else {
                    c22.a();
                }
            }
            C7020sO c7020sO = this.H;
            c7020sO.q.getClass();
            c7020sO.h.execute(new RunnableC5493kO(c7020sO, j, C5806m12.h(), 0));
        }
        VN vn = this.U;
        if (vn != null) {
            vn.close();
            this.U = null;
        }
        if (this.i0 != 2) {
            RunnableC4335iO runnableC4335iO = new RunnableC4335iO(this.F, 6);
            this.Y = QR1.h().schedule(new MD0(this.d, 16, runnableC4335iO), 1000L, TimeUnit.MILLISECONDS);
        } else {
            q(this.F);
        }
        C7020sO c7020sO2 = this.F;
        c7020sO2.q.getClass();
        c7020sO2.h.execute(new RunnableC5493kO(c7020sO2, j, C5806m12.h(), 0));
    }

    public final void H(final C6687qe c6687qe, boolean z) {
        ArrayList arrayList = this.v;
        if (!arrayList.isEmpty()) {
            C8227yj0 c8227yj0B = AbstractC1500Sz1.b(arrayList);
            if (!c8227yj0B.isDone()) {
                c8227yj0B.cancel(true);
            }
            arrayList.clear();
        }
        final int i = 0;
        arrayList.add(AbstractC8171yQ1.b(new InterfaceC0443Fl(this) { // from class: ZN0
            public final /* synthetic */ C3954gO0 b;

            {
                this.b = this;
            }

            private final Object a(C0365El c0365El) {
                C3954gO0 c3954gO0 = this.b;
                C7020sO c7020sO = c3954gO0.F;
                C6846rT1 c6846rT1 = new C6846rT1(c3954gO0, c0365El, c6687qe);
                ExecutorC5715lY0 executorC5715lY0 = c3954gO0.d;
                synchronized (c7020sO.b) {
                    c7020sO.r = c6846rT1;
                    c7020sO.s = executorC5715lY0;
                }
                return "videoEncodingFuture";
            }

            @Override // defpackage.InterfaceC0443Fl
            public final Object h0(C0365El c0365El) {
                switch (i) {
                    case 0:
                        return a(c0365El);
                    default:
                        C3954gO0 c3954gO0 = this.b;
                        c3954gO0.getClass();
                        C1699Vo c1699Vo = new C1699Vo(c3954gO0, 3, c0365El);
                        C0644Ia c0644Ia = c3954gO0.E;
                        ExecutorC5715lY0 executorC5715lY0 = c3954gO0.d;
                        c0644Ia.a.execute(new RunnableC1557Ts1(c0644Ia, executorC5715lY0, new C0999Mo1(c3954gO0, c1699Vo, false), 3));
                        C7020sO c7020sO = c3954gO0.H;
                        C1155Oo1 c1155Oo1 = new C1155Oo1(c3954gO0, c0365El, c1699Vo, c6687qe);
                        synchronized (c7020sO.b) {
                            c7020sO.r = c1155Oo1;
                            c7020sO.s = executorC5715lY0;
                        }
                        return "audioEncodingFuture";
                }
            }
        }));
        if (m() && !z) {
            final int i2 = 1;
            arrayList.add(AbstractC8171yQ1.b(new InterfaceC0443Fl(this) { // from class: ZN0
                public final /* synthetic */ C3954gO0 b;

                {
                    this.b = this;
                }

                private final Object a(C0365El c0365El) {
                    C3954gO0 c3954gO0 = this.b;
                    C7020sO c7020sO = c3954gO0.F;
                    C6846rT1 c6846rT1 = new C6846rT1(c3954gO0, c0365El, c6687qe);
                    ExecutorC5715lY0 executorC5715lY0 = c3954gO0.d;
                    synchronized (c7020sO.b) {
                        c7020sO.r = c6846rT1;
                        c7020sO.s = executorC5715lY0;
                    }
                    return "videoEncodingFuture";
                }

                @Override // defpackage.InterfaceC0443Fl
                public final Object h0(C0365El c0365El) {
                    switch (i2) {
                        case 0:
                            return a(c0365El);
                        default:
                            C3954gO0 c3954gO0 = this.b;
                            c3954gO0.getClass();
                            C1699Vo c1699Vo = new C1699Vo(c3954gO0, 3, c0365El);
                            C0644Ia c0644Ia = c3954gO0.E;
                            ExecutorC5715lY0 executorC5715lY0 = c3954gO0.d;
                            c0644Ia.a.execute(new RunnableC1557Ts1(c0644Ia, executorC5715lY0, new C0999Mo1(c3954gO0, c1699Vo, false), 3));
                            C7020sO c7020sO = c3954gO0.H;
                            C1155Oo1 c1155Oo1 = new C1155Oo1(c3954gO0, c0365El, c1699Vo, c6687qe);
                            synchronized (c7020sO.b) {
                                c7020sO.r = c1155Oo1;
                                c7020sO.s = executorC5715lY0;
                            }
                            return "audioEncodingFuture";
                    }
                }
            }));
        }
        AbstractC1500Sz1.a(AbstractC1500Sz1.b(arrayList), new C1304Qm0(29, this), QR1.a());
    }

    public final void I() {
        C6687qe c6687qe = this.q;
        if (c6687qe != null) {
            c6687qe.g(new C0984Mj1(c6687qe.h, j()));
        }
    }

    public final void J(EnumC3763fO0 enumC3763fO0) {
        if (!j0.contains(this.k)) {
            throw new AssertionError("Can only updated non-pending state from a pending state, but state is " + this.k);
        }
        if (!k0.contains(enumC3763fO0)) {
            throw new AssertionError("Invalid state transition. State is not a valid non-pending state while in a pending state: " + enumC3763fO0);
        }
        if (this.l != enumC3763fO0) {
            this.l = enumC3763fO0;
            this.a.e(new C0422Fe(this.m, l(enumC3763fO0), this.s));
        }
    }

    public final void K(VN vn, C6687qe c6687qe) throws Exception {
        long size = vn.size() + this.K;
        long j = this.Q;
        if (j != 0 && size > j) {
            String.format("Reach file size limit %d > %d", Long.valueOf(size), Long.valueOf(this.Q));
            AbstractC0759Jm0.f("Recorder");
            r(c6687qe, 2, null);
            return;
        }
        long jY = vn.Y();
        long j2 = this.N;
        if (j2 == Long.MAX_VALUE) {
            this.N = jY;
            String.format("First audio time: %d (%s)", Long.valueOf(jY), AbstractC7437uZ1.c(this.N));
            AbstractC0759Jm0.f("Recorder");
        } else {
            TimeUnit timeUnit = TimeUnit.MICROSECONDS;
            long nanos = timeUnit.toNanos(jY - Math.min(this.M, j2));
            AbstractC3377dM1.i(this.P != Long.MAX_VALUE, "There should be a previous data for adjusting the duration.");
            long nanos2 = timeUnit.toNanos(jY - this.P) + nanos;
            long j3 = this.R;
            if (j3 != 0 && nanos2 > j3) {
                String.format("Audio data reaches duration limit %d > %d", Long.valueOf(nanos2), Long.valueOf(this.R));
                AbstractC0759Jm0.f("Recorder");
                r(c6687qe, 9, null);
                return;
            }
        }
        try {
            this.C.writeSampleData(this.w.intValue(), vn.Q(), vn.C());
            this.K = size;
            this.P = jY;
        } catch (IllegalStateException e) {
            G10 g10 = this.f0;
            g10.getClass();
            r(c6687qe, g10.B() < this.j ? 3 : 1, e);
        }
    }

    public final void L(VN vn, C6687qe c6687qe) throws Exception {
        String str;
        long nanos;
        long j = this.j;
        if (this.x == null) {
            throw new AssertionError("Video data comes before the track is added to MediaMuxer.");
        }
        long size = vn.size() + this.K;
        long j2 = this.Q;
        if (j2 != 0 && size > j2) {
            String.format("Reach file size limit %d > %d", Long.valueOf(size), Long.valueOf(this.Q));
            AbstractC0759Jm0.f("Recorder");
            r(c6687qe, 2, null);
            return;
        }
        long jY = vn.Y();
        long j3 = this.M;
        if (j3 == Long.MAX_VALUE) {
            this.M = jY;
            String.format("First video time: %d (%s)", Long.valueOf(jY), AbstractC7437uZ1.c(this.M));
            AbstractC0759Jm0.f("Recorder");
            str = "Recorder";
            nanos = 0;
        } else {
            TimeUnit timeUnit = TimeUnit.MICROSECONDS;
            str = "Recorder";
            nanos = timeUnit.toNanos(jY - Math.min(j3, this.N));
            AbstractC3377dM1.i(this.O != Long.MAX_VALUE, "There should be a previous data for adjusting the duration.");
            long nanos2 = timeUnit.toNanos(jY - this.O) + nanos;
            long j4 = this.R;
            if (j4 != 0 && nanos2 > j4) {
                String.format("Video data reaches duration limit %d > %d", Long.valueOf(nanos2), Long.valueOf(this.R));
                AbstractC0759Jm0.f(str);
                r(c6687qe, 9, null);
                return;
            }
        }
        try {
            this.C.writeSampleData(this.x.intValue(), vn.Q(), vn.C());
            this.K = size;
            this.L = nanos;
            this.O = jY;
            I();
            if (size > this.g0) {
                G10 g10 = this.f0;
                g10.getClass();
                long jB = g10.B();
                AbstractC2141aT1.b(jB);
                AbstractC0759Jm0.f(str);
                if (jB < j) {
                    r(c6687qe, 3, new IOException(String.format("Insufficient storage space. The available storage (%d bytes) is below the required threshold of %d bytes.", Long.valueOf(jB), Long.valueOf(j))));
                } else {
                    this.g0 = jB - j;
                }
            }
        } catch (IllegalStateException e) {
            G10 g102 = this.f0;
            g102.getClass();
            r(c6687qe, g102.B() >= j ? 1 : 3, e);
        }
    }

    @Override // defpackage.InterfaceC0517Gj1
    public final InterfaceC3486dx0 a() {
        return this.D;
    }

    @Override // defpackage.InterfaceC0517Gj1
    public final void b(int i) {
        this.d.execute(new RunnableC5338ja(this, i, 10));
    }

    @Override // defpackage.InterfaceC0517Gj1
    public final InterfaceC3486dx0 c() {
        return this.a;
    }

    @Override // defpackage.InterfaceC0517Gj1
    public final InterfaceC3486dx0 d() {
        return this.b;
    }

    @Override // defpackage.InterfaceC0517Gj1
    public final void e(Z61 z61, EnumC8011xa1 enumC8011xa1) {
        synchronized (this.h) {
            try {
                Objects.toString(this.k);
                AbstractC0759Jm0.f("Recorder");
                if (this.k == EnumC3763fO0.i) {
                    B(EnumC3763fO0.a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.d.execute(new RunnableC1313Qp0(this, z61, enumC8011xa1, 4));
    }

    @Override // defpackage.InterfaceC0517Gj1
    public final InterfaceC0981Mi1 f(InterfaceC6907ro interfaceC6907ro) {
        return new VG(interfaceC6907ro);
    }

    public final void g(Z61 z61, EnumC8011xa1 enumC8011xa1, boolean z) {
        Object value;
        C6496pe c6496pe;
        if (z61.a()) {
            AbstractC0759Jm0.f("Recorder");
            return;
        }
        VN0 vn0 = new VN0(this);
        ExecutorC5715lY0 executorC5715lY0 = this.d;
        z61.c(executorC5715lY0, vn0);
        VG vg = new VG(z61.e.b());
        CM cm = z61.c;
        C1390Rp c1390RpH = vg.h(cm);
        Size size = z61.b;
        if (c1390RpH == null) {
            c6496pe = C6496pe.j;
        } else {
            TreeMap treeMap = c1390RpH.b;
            Size size2 = AbstractC3696f21.a;
            Map.Entry entryCeilingEntry = treeMap.ceilingEntry(size);
            if (entryCeilingEntry != null) {
                value = entryCeilingEntry.getValue();
            } else {
                Map.Entry entryFloorEntry = treeMap.floorEntry(size);
                value = entryFloorEntry != null ? entryFloorEntry.getValue() : null;
            }
            c6496pe = (C6496pe) value;
            if (c6496pe == null) {
                c6496pe = C6496pe.j;
            }
        }
        Objects.toString(c6496pe);
        Objects.toString(size);
        AbstractC0759Jm0.f("Recorder");
        if (c6496pe != C6496pe.j) {
            C1981Ze c1981ZeL = vg.l(c6496pe, cm);
            this.u = c1981ZeL;
            if (c1981ZeL == null) {
                throw new AssertionError("Camera advertised available quality but did not produce EncoderProfiles  for advertised quality.");
            }
        }
        C3572eO0 c3572eO0 = this.e0;
        if (c3572eO0 != null && !c3572eO0.d) {
            c3572eO0.d = true;
            ScheduledFuture scheduledFuture = c3572eO0.f;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                c3572eO0.f = null;
            }
        }
        C3572eO0 c3572eO02 = new C3572eO0(this, z61, enumC8011xa1, z ? r0 : 0);
        this.e0 = c3572eO02;
        Objects.toString(this.F);
        AbstractC0759Jm0.f("Recorder");
        C6557py0 c6557py0 = this.a0;
        c6557py0.a();
        AbstractC1500Sz1.l((InterfaceFutureC0750Jj0) c6557py0.k).d(new RunnableC1313Qp0(c3572eO02, z61, enumC8011xa1, 5), executorC5715lY0);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00c5 A[EDGE_INSN: B:110:0x00c5->B:32:0x00c5 BREAK  A[LOOP:0: B:29:0x00b9->B:31:0x00c1], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c1 A[LOOP:0: B:29:0x00b9->B:31:0x00c1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0158 A[Catch: all -> 0x0122, TryCatch #0 {all -> 0x0122, blocks: (B:45:0x00f5, B:47:0x00f9, B:48:0x0106, B:85:0x019f, B:52:0x0111, B:54:0x0115, B:56:0x011b, B:62:0x0126, B:63:0x0133, B:65:0x013d, B:66:0x0150, B:69:0x0154, B:71:0x0158, B:72:0x0169, B:74:0x016d, B:76:0x0173, B:80:0x017b, B:81:0x0187, B:83:0x018b, B:99:0x01c8, B:100:0x01cf), top: B:107:0x00f5 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0169 A[Catch: all -> 0x0122, TryCatch #0 {all -> 0x0122, blocks: (B:45:0x00f5, B:47:0x00f9, B:48:0x0106, B:85:0x019f, B:52:0x0111, B:54:0x0115, B:56:0x011b, B:62:0x0126, B:63:0x0133, B:65:0x013d, B:66:0x0150, B:69:0x0154, B:71:0x0158, B:72:0x0169, B:74:0x016d, B:76:0x0173, B:80:0x017b, B:81:0x0187, B:83:0x018b, B:99:0x01c8, B:100:0x01cf), top: B:107:0x00f5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(int r17, java.lang.Throwable r18) {
        /*
            Method dump skipped, instructions count: 500
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3954gO0.h(int, java.lang.Throwable):void");
    }

    public final void i(C6687qe c6687qe, int i, Throwable th) {
        Uri uri = Uri.EMPTY;
        c6687qe.a(uri);
        C6877re c6877reA = C6877re.a(0L, 0L, new C7444uc(1, ConfigValue.DOUBLE_DEFAULT_VALUE, this.W));
        AbstractC3377dM1.h(uri, "OutputUri cannot be null.");
        C3429de c3429de = new C3429de(uri);
        AbstractC3377dM1.d("An error type is required.", i != 0);
        c6687qe.g(new C0673Ij1(c6687qe.h, c6877reA, c3429de, i, th));
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.C6877re j() {
        /*
            r9 = this;
            long r0 = r9.L
            long r2 = r9.K
            int r4 = r9.h0
            int r5 = defpackage.AbstractC8235ym.x(r4)
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
            java.lang.String r1 = defpackage.AbstractC7209tN0.D(r4)
            java.lang.String r2 = "Invalid internal audio state: "
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        L29:
            r6 = r8
            goto L41
        L2b:
            qe r4 = r9.q
            if (r4 == 0) goto L39
            java.util.concurrent.atomic.AtomicBoolean r4 = r4.f
            boolean r4 = r4.get()
            if (r4 == 0) goto L39
            r6 = r7
            goto L41
        L39:
            boolean r4 = r9.X
            if (r4 == 0) goto L3e
            goto L41
        L3e:
            r6 = 0
            goto L41
        L40:
            r6 = 1
        L41:
            java.lang.Throwable r4 = r9.W
            double r7 = r9.c0
            uc r5 = new uc
            r5.<init>(r6, r7, r4)
            re r0 = defpackage.C6877re.a(r0, r2, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3954gO0.j():re");
    }

    public final boolean m() {
        return this.h0 == 4;
    }

    public final boolean n() {
        C6687qe c6687qe = this.q;
        return c6687qe != null && c6687qe.l;
    }

    public final C6687qe p(EnumC3763fO0 enumC3763fO0) {
        boolean z;
        if (enumC3763fO0 == EnumC3763fO0.c) {
            z = true;
        } else {
            if (enumC3763fO0 != EnumC3763fO0.b) {
                throw new AssertionError("makePendingRecordingActiveLocked() can only be called from a pending state.");
            }
            z = false;
        }
        if (this.n != null) {
            throw new AssertionError("Cannot make pending recording active because another recording is already active.");
        }
        C6687qe c6687qe = this.o;
        if (c6687qe == null) {
            throw new AssertionError("Pending recording should exist when in a PENDING state.");
        }
        this.n = c6687qe;
        c6687qe.g.a(QR1.a(), new EG0(1, this));
        this.o = null;
        if (z) {
            B(EnumC3763fO0.f);
        } else {
            B(EnumC3763fO0.e);
        }
        return c6687qe;
    }

    public final void r(C6687qe c6687qe, int i, Exception exc) throws Exception {
        boolean z;
        if (c6687qe != this.q) {
            throw new AssertionError("Internal error occurred on recording that is not the current in-progress recording.");
        }
        synchronized (this.h) {
            try {
                z = false;
                switch (this.k.ordinal()) {
                    case 0:
                    case 3:
                    case 8:
                        throw new AssertionError("In-progress recording error occurred while in unexpected state: " + this.k);
                    case 4:
                    case 5:
                        B(EnumC3763fO0.g);
                        z = true;
                    case 1:
                    case 2:
                    case 6:
                    case 7:
                        if (c6687qe != this.n) {
                            throw new AssertionError("Internal error occurred for recording but it is not the active recording.");
                        }
                        break;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            G(c6687qe, -1L, i, exc);
        }
    }

    public final void s(C6687qe c6687qe) {
        if (this.q != c6687qe || this.r) {
            return;
        }
        if (m()) {
            this.H.e();
        }
        this.F.e();
        C6687qe c6687qe2 = this.q;
        c6687qe2.g(new C0751Jj1(c6687qe2.h, j()));
    }

    public final void t() {
        int i = 1;
        C0644Ia c0644Ia = this.E;
        if (c0644Ia == null) {
            throw new AssertionError("Cannot release null audio source.");
        }
        this.E = null;
        String.format("Releasing audio source: 0x%x", Integer.valueOf(c0644Ia.hashCode()));
        AbstractC0759Jm0.f("Recorder");
        AbstractC1500Sz1.a(AbstractC8171yQ1.b(new B7(i, c0644Ia)), new C1562Tu0(25, c0644Ia), QR1.a());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void u(boolean z) {
        boolean z2;
        boolean z3;
        synchronized (this.h) {
            try {
                z2 = true;
                z3 = false;
                switch (this.k.ordinal()) {
                    case 0:
                    case 3:
                    case 8:
                        break;
                    case 1:
                    case 2:
                        J(EnumC3763fO0.h);
                        break;
                    case 4:
                    case 5:
                        AbstractC3377dM1.i(this.q != null, "In-progress recording shouldn't be null when in state " + this.k);
                        if (this.n != this.q) {
                            throw new AssertionError("In-progress recording does not match the active recording. Unable to reset encoder.");
                        }
                        if (!n()) {
                            B(EnumC3763fO0.h);
                            z3 = true;
                            z2 = false;
                        }
                        break;
                    case 6:
                        B(EnumC3763fO0.h);
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
                G(this.q, -1L, 4, null);
            }
        } else if (z) {
            w();
        } else {
            v();
        }
    }

    public final void v() {
        if (this.H != null) {
            AbstractC0759Jm0.f("Recorder");
            C7020sO c7020sO = this.H;
            c7020sO.getClass();
            c7020sO.h.execute(new RunnableC4335iO(c7020sO, 4));
            this.H = null;
            this.I = null;
        }
        if (this.E != null) {
            t();
        }
        y(1);
        w();
    }

    public final void w() {
        Z61 z61;
        boolean z = true;
        if (this.F != null) {
            AbstractC0759Jm0.f("Recorder");
            C6557py0 c6557py0 = this.b0;
            if (c6557py0 != null) {
                AbstractC3377dM1.i(((C7020sO) c6557py0.g) == this.F, null);
                Objects.toString(this.F);
                AbstractC0759Jm0.f("Recorder");
                this.b0.l();
                this.b0 = null;
                this.F = null;
                this.G = null;
                A(null);
            } else {
                Objects.toString(this.F);
                AbstractC0759Jm0.f("Recorder");
                C6557py0 c6557py02 = this.a0;
                c6557py02.a();
                AbstractC1500Sz1.l((InterfaceFutureC0750Jj0) c6557py02.k);
            }
        }
        synchronized (this.h) {
            try {
                switch (this.k.ordinal()) {
                    case 1:
                    case 2:
                        J(EnumC3763fO0.a);
                        break;
                    case 4:
                    case 5:
                    case 8:
                        if (n()) {
                            z = false;
                            break;
                        }
                    case 3:
                    case 6:
                    case 7:
                        B(EnumC3763fO0.a);
                        break;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.Z = false;
        if (!z || (z61 = this.y) == null || z61.a()) {
            return;
        }
        g(this.y, this.z, false);
    }

    public final void x() {
        if (j0.contains(this.k)) {
            B(this.l);
        } else {
            throw new AssertionError("Cannot restore non-pending state when in state " + this.k);
        }
    }

    public final void y(int i) {
        AbstractC0759Jm0.f("Recorder");
        this.h0 = i;
    }

    public final void z(C1123Oe c1123Oe) {
        Objects.toString(c1123Oe);
        AbstractC0759Jm0.f("Recorder");
        this.s = c1123Oe;
        synchronized (this.h) {
            this.a.e(new C0422Fe(this.m, l(this.k), c1123Oe));
        }
    }
}
