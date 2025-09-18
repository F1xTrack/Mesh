package p000;

import android.content.Context;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseBooleanArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.image.ImageOutput;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* renamed from: XQ */
/* loaded from: classes.dex */
public final class C1474XQ extends AbstractC1259U0 implements ExoPlayer {

    /* renamed from: A */
    public final X11 f13689A;

    /* renamed from: B */
    public final C6372la f13690B;

    /* renamed from: C */
    public final C10689pl0 f13691C;

    /* renamed from: D */
    public final C7408Bv0 f13692D;

    /* renamed from: E */
    public final long f13693E;

    /* renamed from: F */
    public int f13694F;

    /* renamed from: G */
    public boolean f13695G;

    /* renamed from: H */
    public int f13696H;

    /* renamed from: I */
    public int f13697I;

    /* renamed from: J */
    public boolean f13698J;

    /* renamed from: K */
    public final DX0 f13699K;

    /* renamed from: L */
    public C11869z01 f13700L;

    /* renamed from: M */
    public final C0720LQ f13701M;

    /* renamed from: N */
    public EB0 f13702N;

    /* renamed from: O */
    public C11337up0 f13703O;

    /* renamed from: P */
    public C6686qX f13704P;

    /* renamed from: Q */
    public AudioTrack f13705Q;

    /* renamed from: R */
    public Surface f13706R;

    /* renamed from: S */
    public Surface f13707S;

    /* renamed from: T */
    public SurfaceHolder f13708T;

    /* renamed from: U */
    public C10217m31 f13709U;

    /* renamed from: V */
    public boolean f13710V;

    /* renamed from: W */
    public TextureView f13711W;

    /* renamed from: X */
    public final int f13712X;

    /* renamed from: Y */
    public C8673a21 f13713Y;

    /* renamed from: Z */
    public final int f13714Z;

    /* renamed from: a0 */
    public C1017Q9 f13715a0;

    /* renamed from: b0 */
    public float f13716b0;

    /* renamed from: c */
    public final C8875bc1 f13717c;

    /* renamed from: c0 */
    public boolean f13718c0;

    /* renamed from: d */
    public final EB0 f13719d;

    /* renamed from: d0 */
    public final boolean f13720d0;

    /* renamed from: e */
    public final C0328FC f13721e;

    /* renamed from: e0 */
    public boolean f13722e0;

    /* renamed from: f */
    public final Context f13723f;

    /* renamed from: g */
    public final IB0 f13724g;

    /* renamed from: h */
    public final AbstractC0043Ag[] f13725h;

    /* renamed from: i */
    public final AbstractC10821qn0 f13726i;

    /* renamed from: j */
    public final R71 f13727j;

    /* renamed from: k */
    public final C1034QQ f13728k;

    /* renamed from: l */
    public final C3928dR f13729l;

    /* renamed from: m */
    public final C8372Uj0 f13730m;

    /* renamed from: n */
    public final CopyOnWriteArraySet f13731n;

    /* renamed from: o */
    public final C7315Aa1 f13732o;

    /* renamed from: p */
    public final ArrayList f13733p;

    /* renamed from: q */
    public final boolean f13734q;

    /* renamed from: q1 */
    public final int f13735q1;

    /* renamed from: r */
    public final C7251zE f13736r;

    /* renamed from: r1 */
    public boolean f13737r1;

    /* renamed from: s */
    public final Looper f13738s;

    /* renamed from: s1 */
    public C8321Tj1 f13739s1;

    /* renamed from: t */
    public final InterfaceC0168Cf f13740t;

    /* renamed from: t1 */
    public C11337up0 f13741t1;

    /* renamed from: u */
    public final long f13742u;

    /* renamed from: u1 */
    public BB0 f13743u1;

    /* renamed from: v */
    public final long f13744v;

    /* renamed from: v1 */
    public int f13745v1;

    /* renamed from: w */
    public final long f13746w;

    /* renamed from: w1 */
    public long f13747w1;

    /* renamed from: x */
    public final M71 f13748x;

    /* renamed from: y */
    public final SurfaceHolderCallbackC1285UQ f13749y;

    /* renamed from: z */
    public final C1348VQ f13750z;

    static {
        AbstractC10953rp0.m24489a("media3.exoplayer");
    }

    public C1474XQ(C0657KQ c0657kq) {
        super(4);
        this.f13721e = new C0328FC();
        try {
            AbstractC10872rA1.m24174g("Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.4.1] [" + AbstractC7485Dh1.f2170e + "]");
            Context context = c0657kq.f6073a;
            Looper looper = c0657kq.f6080h;
            this.f13723f = context.getApplicationContext();
            M71 m71 = c0657kq.f6074b;
            this.f13736r = new C7251zE(m71);
            this.f13735q1 = c0657kq.f6081i;
            this.f13715a0 = c0657kq.f6082j;
            this.f13712X = c0657kq.f6083k;
            this.f13718c0 = false;
            this.f13693E = c0657kq.f6091s;
            SurfaceHolderCallbackC1285UQ surfaceHolderCallbackC1285UQ = new SurfaceHolderCallbackC1285UQ(this);
            this.f13749y = surfaceHolderCallbackC1285UQ;
            this.f13750z = new C1348VQ();
            Handler handler = new Handler(looper);
            AbstractC0043Ag[] abstractC0043AgArrM8919m = ((X11) c0657kq.f6075c.f35013b).m8919m(handler, surfaceHolderCallbackC1285UQ, surfaceHolderCallbackC1285UQ, surfaceHolderCallbackC1285UQ, surfaceHolderCallbackC1285UQ);
            this.f13725h = abstractC0043AgArrM8919m;
            YN1.m9281f(abstractC0043AgArrM8919m.length > 0);
            this.f13726i = (AbstractC10821qn0) c0657kq.f6077e.get();
            this.f13740t = (InterfaceC0168Cf) c0657kq.f6079g.get();
            this.f13734q = c0657kq.f6084l;
            this.f13699K = c0657kq.f6085m;
            this.f13742u = c0657kq.f6086n;
            this.f13744v = c0657kq.f6087o;
            this.f13746w = c0657kq.f6088p;
            this.f13738s = looper;
            this.f13748x = m71;
            this.f13724g = this;
            this.f13730m = new C8372Uj0(looper, m71, new C1034QQ(this));
            this.f13731n = new CopyOnWriteArraySet();
            this.f13733p = new ArrayList();
            this.f13700L = new C11869z01();
            this.f13701M = C0720LQ.f6629a;
            this.f13717c = new C8875bc1(new ZQ0[abstractC0043AgArrM8919m.length], new InterfaceC6237jR[abstractC0043AgArrM8919m.length], C9264ec1.f26778b, (C4218i3) null);
            this.f13732o = new C7315Aa1();
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            int[] iArr = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32};
            for (int i = 0; i < 20; i++) {
                int i2 = iArr[i];
                YN1.m9281f(!false);
                sparseBooleanArray.append(i2, true);
            }
            this.f13726i.getClass();
            YN1.m9281f(!false);
            sparseBooleanArray.append(29, true);
            YN1.m9281f(!false);
            C1353VV c1353vv = new C1353VV(sparseBooleanArray);
            this.f13719d = new EB0(c1353vv);
            SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
            for (int i3 = 0; i3 < c1353vv.f12594a.size(); i3++) {
                int iM8443a = c1353vv.m8443a(i3);
                YN1.m9281f(!false);
                sparseBooleanArray2.append(iM8443a, true);
            }
            YN1.m9281f(!false);
            sparseBooleanArray2.append(4, true);
            YN1.m9281f(!false);
            sparseBooleanArray2.append(10, true);
            YN1.m9281f(!false);
            this.f13702N = new EB0(new C1353VV(sparseBooleanArray2));
            this.f13727j = this.f13748x.m5274a(this.f13738s, null);
            C1034QQ c1034qq = new C1034QQ(this);
            this.f13728k = c1034qq;
            this.f13743u1 = BB0.m544i(this.f13717c);
            this.f13736r.m26335R(this.f13724g, this.f13738s);
            int i4 = AbstractC7485Dh1.f2166a;
            String str = c0657kq.f6094v;
            this.f13729l = new C3928dR(this.f13725h, this.f13726i, this.f13717c, (C3917dG) c0657kq.f6078f.get(), this.f13740t, this.f13694F, this.f13695G, this.f13736r, this.f13699K, c0657kq.f6089q, c0657kq.f6090r, this.f13738s, this.f13748x, c1034qq, i4 < 31 ? new NB0(str) : AbstractC1222TQ.m7693a(this.f13723f, this, c0657kq.f6092t, str), this.f13701M);
            this.f13716b0 = 1.0f;
            this.f13694F = 0;
            C11337up0 c11337up0 = C11337up0.f43931A;
            this.f13703O = c11337up0;
            this.f13741t1 = c11337up0;
            this.f13745v1 = -1;
            if (i4 < 21) {
                AudioTrack audioTrack = this.f13705Q;
                if (audioTrack != null && audioTrack.getAudioSessionId() != 0) {
                    this.f13705Q.release();
                    this.f13705Q = null;
                }
                if (this.f13705Q == null) {
                    this.f13705Q = new AudioTrack(3, 4000, 4, 2, 2, 0, 0);
                }
                this.f13714Z = this.f13705Q.getAudioSessionId();
            } else {
                AudioManager audioManager = (AudioManager) this.f13723f.getSystemService("audio");
                this.f13714Z = audioManager == null ? -1 : audioManager.generateAudioSessionId();
            }
            int i5 = C6996vB.f44235b;
            this.f13720d0 = true;
            C7251zE c7251zE = this.f13736r;
            c7251zE.getClass();
            this.f13730m.m8129a(c7251zE);
            InterfaceC0168Cf interfaceC0168Cf = this.f13740t;
            Handler handler2 = new Handler(this.f13738s);
            C7251zE c7251zE2 = this.f13736r;
            C0959PE c0959pe = (C0959PE) interfaceC0168Cf;
            c0959pe.getClass();
            c7251zE2.getClass();
            QQ0 qq0 = c0959pe.f8918b;
            qq0.getClass();
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) qq0.f9619a;
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                C0042Af c0042Af = (C0042Af) it.next();
                if (c0042Af.f302b == c7251zE2) {
                    c0042Af.f303c = true;
                    copyOnWriteArrayList.remove(c0042Af);
                }
            }
            copyOnWriteArrayList.add(new C0042Af(handler2, c7251zE2));
            this.f13731n.add(this.f13749y);
            X11 x11 = new X11(context, handler, this.f13749y);
            this.f13689A = x11;
            x11.m8921r();
            C6372la c6372la = new C6372la(context, handler, this.f13749y);
            this.f13690B = c6372la;
            c6372la.m22507b(null);
            C10689pl0 c10689pl0 = new C10689pl0(23);
            context.getApplicationContext();
            this.f13691C = c10689pl0;
            this.f13692D = new C7408Bv0(context);
            C11649xG0 c11649xG0 = new C11649xG0(3);
            c11649xG0.f45508b = 0;
            c11649xG0.f45509c = 0;
            new C6672qJ(c11649xG0);
            this.f13739s1 = C8321Tj1.f11486e;
            this.f13713Y = C8673a21.f15291c;
            this.f13726i.mo9693b(this.f13715a0);
            m9023U1(1, 10, Integer.valueOf(this.f13714Z));
            m9023U1(2, 10, Integer.valueOf(this.f13714Z));
            m9023U1(1, 3, this.f13715a0);
            m9023U1(2, 4, Integer.valueOf(this.f13712X));
            m9023U1(2, 5, 0);
            m9023U1(1, 9, Boolean.valueOf(this.f13718c0));
            m9023U1(2, 7, this.f13750z);
            m9023U1(6, 8, this.f13750z);
            m9023U1(-1, 16, Integer.valueOf(this.f13735q1));
            this.f13721e.m2551g();
        } catch (Throwable th) {
            this.f13721e.m2551g();
            throw th;
        }
    }

    /* renamed from: L1 */
    public static long m9003L1(BB0 bb0) {
        C7367Ba1 c7367Ba1 = new C7367Ba1();
        C7315Aa1 c7315Aa1 = new C7315Aa1();
        bb0.f623a.mo1250g(bb0.f624b.f3430a, c7315Aa1);
        long j = bb0.f625c;
        if (j != -9223372036854775807L) {
            return c7315Aa1.f260e + j;
        }
        return bb0.f623a.mo1256m(c7315Aa1.f258c, c7367Ba1, 0L).f925l;
    }

    /* renamed from: A1 */
    public final long m9004A1(BB0 bb0) {
        if (!bb0.f624b.m2791b()) {
            return AbstractC7485Dh1.m1819d0(m9009F1(bb0));
        }
        Object obj = bb0.f624b.f3430a;
        AbstractC7419Ca1 abstractC7419Ca1 = bb0.f623a;
        C7315Aa1 c7315Aa1 = this.f13732o;
        abstractC7419Ca1.mo1250g(obj, c7315Aa1);
        long j = bb0.f625c;
        return j == -9223372036854775807L ? AbstractC7485Dh1.m1819d0(abstractC7419Ca1.mo1256m(m9011H1(bb0), (C7367Ba1) this.f11615b, 0L).f925l) : AbstractC7485Dh1.m1819d0(c7315Aa1.f260e) + AbstractC7485Dh1.m1819d0(j);
    }

    /* renamed from: B1 */
    public final int m9005B1() {
        m9035g2();
        if (m9015M1()) {
            return this.f13743u1.f624b.f3431b;
        }
        return -1;
    }

    /* renamed from: C1 */
    public final int m9006C1() {
        m9035g2();
        if (m9015M1()) {
            return this.f13743u1.f624b.f3432c;
        }
        return -1;
    }

    /* renamed from: D1 */
    public final int m9007D1() {
        m9035g2();
        int iM9011H1 = m9011H1(this.f13743u1);
        if (iM9011H1 == -1) {
            return 0;
        }
        return iM9011H1;
    }

    /* renamed from: E1 */
    public final long m9008E1() {
        m9035g2();
        return AbstractC7485Dh1.m1819d0(m9009F1(this.f13743u1));
    }

    /* renamed from: F1 */
    public final long m9009F1(BB0 bb0) {
        if (bb0.f623a.m1259p()) {
            return AbstractC7485Dh1.m1802Q(this.f13747w1);
        }
        long jM553j = bb0.f638p ? bb0.m553j() : bb0.f641s;
        if (bb0.f624b.m2791b()) {
            return jM553j;
        }
        AbstractC7419Ca1 abstractC7419Ca1 = bb0.f623a;
        Object obj = bb0.f624b.f3430a;
        C7315Aa1 c7315Aa1 = this.f13732o;
        abstractC7419Ca1.mo1250g(obj, c7315Aa1);
        return jM553j + c7315Aa1.f260e;
    }

    /* renamed from: G1 */
    public final AbstractC7419Ca1 m9010G1() {
        m9035g2();
        return this.f13743u1.f623a;
    }

    /* renamed from: H1 */
    public final int m9011H1(BB0 bb0) {
        if (bb0.f623a.m1259p()) {
            return this.f13745v1;
        }
        return bb0.f623a.mo1250g(bb0.f624b.f3430a, this.f13732o).f258c;
    }

    /* renamed from: I1 */
    public final long m9012I1() {
        m9035g2();
        if (!m9015M1()) {
            AbstractC7419Ca1 abstractC7419Ca1M9010G1 = m9010G1();
            if (abstractC7419Ca1M9010G1.m1259p()) {
                return -9223372036854775807L;
            }
            return AbstractC7485Dh1.m1819d0(abstractC7419Ca1M9010G1.mo1256m(m9007D1(), (C7367Ba1) this.f11615b, 0L).f926m);
        }
        BB0 bb0 = this.f13743u1;
        C7604Fp0 c7604Fp0 = bb0.f624b;
        AbstractC7419Ca1 abstractC7419Ca1 = bb0.f623a;
        Object obj = c7604Fp0.f3430a;
        C7315Aa1 c7315Aa1 = this.f13732o;
        abstractC7419Ca1.mo1250g(obj, c7315Aa1);
        return AbstractC7485Dh1.m1819d0(c7315Aa1.m236a(c7604Fp0.f3431b, c7604Fp0.f3432c));
    }

    /* renamed from: J1 */
    public final boolean m9013J1() {
        m9035g2();
        return this.f13743u1.f634l;
    }

    /* renamed from: K1 */
    public final int m9014K1() {
        m9035g2();
        return this.f13743u1.f627e;
    }

    /* renamed from: M1 */
    public final boolean m9015M1() {
        m9035g2();
        return this.f13743u1.f624b.m2791b();
    }

    /* renamed from: N1 */
    public final BB0 m9016N1(BB0 bb0, AbstractC7419Ca1 abstractC7419Ca1, Pair pair) {
        List list;
        YN1.m9278c(abstractC7419Ca1.m1259p() || pair != null);
        AbstractC7419Ca1 abstractC7419Ca12 = bb0.f623a;
        long jM9004A1 = m9004A1(bb0);
        BB0 bb0M552h = bb0.m552h(abstractC7419Ca1);
        if (abstractC7419Ca1.m1259p()) {
            C7604Fp0 c7604Fp0 = BB0.f622u;
            long jM1802Q = AbstractC7485Dh1.m1802Q(this.f13747w1);
            BB0 bb0M546b = bb0M552h.m547c(c7604Fp0, jM1802Q, jM1802Q, jM1802Q, 0L, C8201Rb1.f10320d, this.f13717c, C9367fQ0.f27184e).m546b(c7604Fp0);
            bb0M546b.f639q = bb0M546b.f641s;
            return bb0M546b;
        }
        Object obj = bb0M552h.f624b.f3430a;
        boolean zEquals = obj.equals(pair.first);
        C7604Fp0 c7604Fp02 = !zEquals ? new C7604Fp0(pair.first) : bb0M552h.f624b;
        long jLongValue = ((Long) pair.second).longValue();
        long jM1802Q2 = AbstractC7485Dh1.m1802Q(jM9004A1);
        if (!abstractC7419Ca12.m1259p()) {
            jM1802Q2 -= abstractC7419Ca12.mo1250g(obj, this.f13732o).f260e;
        }
        if (!zEquals || jLongValue < jM1802Q2) {
            YN1.m9281f(!c7604Fp02.m2791b());
            C8201Rb1 c8201Rb1 = !zEquals ? C8201Rb1.f10320d : bb0M552h.f630h;
            C8875bc1 c8875bc1 = !zEquals ? this.f13717c : bb0M552h.f631i;
            if (zEquals) {
                list = bb0M552h.f632j;
            } else {
                N70 n70 = P70.f8867b;
                list = C9367fQ0.f27184e;
            }
            BB0 bb0M546b2 = bb0M552h.m547c(c7604Fp02, jLongValue, jLongValue, jLongValue, 0L, c8201Rb1, c8875bc1, list).m546b(c7604Fp02);
            bb0M546b2.f639q = jLongValue;
            return bb0M546b2;
        }
        if (jLongValue != jM1802Q2) {
            YN1.m9281f(!c7604Fp02.m2791b());
            long jMax = Math.max(0L, bb0M552h.f640r - (jLongValue - jM1802Q2));
            long j = bb0M552h.f639q;
            if (bb0M552h.f633k.equals(bb0M552h.f624b)) {
                j = jLongValue + jMax;
            }
            BB0 bb0M547c = bb0M552h.m547c(c7604Fp02, jLongValue, jLongValue, jLongValue, jMax, bb0M552h.f630h, bb0M552h.f631i, bb0M552h.f632j);
            bb0M547c.f639q = j;
            return bb0M547c;
        }
        int iMo1245b = abstractC7419Ca1.mo1245b(bb0M552h.f633k.f3430a);
        if (iMo1245b != -1 && abstractC7419Ca1.mo1249f(iMo1245b, this.f13732o, false).f258c == abstractC7419Ca1.mo1250g(c7604Fp02.f3430a, this.f13732o).f258c) {
            return bb0M552h;
        }
        abstractC7419Ca1.mo1250g(c7604Fp02.f3430a, this.f13732o);
        long jM236a = c7604Fp02.m2791b() ? this.f13732o.m236a(c7604Fp02.f3431b, c7604Fp02.f3432c) : this.f13732o.f259d;
        BB0 bb0M546b3 = bb0M552h.m547c(c7604Fp02, bb0M552h.f641s, bb0M552h.f641s, bb0M552h.f626d, jM236a - bb0M552h.f641s, bb0M552h.f630h, bb0M552h.f631i, bb0M552h.f632j).m546b(c7604Fp02);
        bb0M546b3.f639q = jM236a;
        return bb0M546b3;
    }

    /* renamed from: O1 */
    public final Pair m9017O1(AbstractC7419Ca1 abstractC7419Ca1, int i, long j) {
        if (abstractC7419Ca1.m1259p()) {
            this.f13745v1 = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.f13747w1 = j;
            return null;
        }
        if (i == -1 || i >= abstractC7419Ca1.mo1258o()) {
            i = abstractC7419Ca1.mo1244a(this.f13695G);
            j = AbstractC7485Dh1.m1819d0(abstractC7419Ca1.mo1256m(i, (C7367Ba1) this.f11615b, 0L).f925l);
        }
        return abstractC7419Ca1.m1252i((C7367Ba1) this.f11615b, this.f13732o, i, AbstractC7485Dh1.m1802Q(j));
    }

    /* renamed from: P1 */
    public final void m9018P1(final int i, final int i2) {
        C8673a21 c8673a21 = this.f13713Y;
        if (i == c8673a21.f15292a && i2 == c8673a21.f15293b) {
            return;
        }
        this.f13713Y = new C8673a21(i, i2);
        this.f13730m.m8134f(24, new InterfaceC8216Rj0() { // from class: OQ
            @Override // p000.InterfaceC8216Rj0
            public final void invoke(Object obj) {
                ((GB0) obj).mo2946H(i, i2);
            }
        });
        m9023U1(2, 14, new C8673a21(i, i2));
    }

    /* renamed from: Q1 */
    public final void m9019Q1() {
        m9035g2();
        boolean zM9013J1 = m9013J1();
        int iM22509d = this.f13690B.m22509d(2, zM9013J1);
        m9032d2(iM22509d, iM22509d == -1 ? 2 : 1, zM9013J1);
        BB0 bb0 = this.f13743u1;
        if (bb0.f627e != 1) {
            return;
        }
        BB0 bb0M549e = bb0.m549e(null);
        BB0 bb0M551g = bb0M549e.m551g(bb0M549e.f623a.m1259p() ? 4 : 2);
        this.f13696H++;
        R71 r71 = this.f13729l.f26088h;
        r71.getClass();
        Q71 q71M6903b = R71.m6903b();
        q71M6903b.f9486a = r71.f10020a.obtainMessage(29);
        q71M6903b.m6576b();
        m9033e2(bb0M551g, 1, false, 5, -9223372036854775807L, -1, false);
    }

    /* renamed from: R1 */
    public final void m9020R1(GB0 gb0) {
        m9035g2();
        gb0.getClass();
        this.f13730m.m8133e(gb0);
    }

    /* renamed from: S1 */
    public final void m9021S1(int i) {
        for (int i2 = i - 1; i2 >= 0; i2--) {
            this.f13733p.remove(i2);
        }
        C11869z01 c11869z01 = this.f13700L;
        int[] iArr = c11869z01.f46568b;
        int[] iArr2 = new int[iArr.length - i];
        int i3 = 0;
        for (int i4 = 0; i4 < iArr.length; i4++) {
            int i5 = iArr[i4];
            if (i5 < 0 || i5 >= i) {
                int i6 = i4 - i3;
                if (i5 >= 0) {
                    i5 -= i;
                }
                iArr2[i6] = i5;
            } else {
                i3++;
            }
        }
        this.f13700L = new C11869z01(iArr2, new Random(c11869z01.f46567a.nextLong()));
    }

    /* renamed from: T1 */
    public final void m9022T1() {
        C10217m31 c10217m31 = this.f13709U;
        SurfaceHolderCallbackC1285UQ surfaceHolderCallbackC1285UQ = this.f13749y;
        if (c10217m31 != null) {
            QB0 qb0M9038y1 = m9038y1(this.f13750z);
            YN1.m9281f(!qb0M9038y1.f9523g);
            qb0M9038y1.f9520d = 10000;
            YN1.m9281f(!qb0M9038y1.f9523g);
            qb0M9038y1.f9521e = null;
            qb0M9038y1.m6597c();
            this.f13709U.f37437a.remove(surfaceHolderCallbackC1285UQ);
            this.f13709U = null;
        }
        TextureView textureView = this.f13711W;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != surfaceHolderCallbackC1285UQ) {
                AbstractC10872rA1.m24175h("SurfaceTextureListener already unset or replaced.");
            } else {
                this.f13711W.setSurfaceTextureListener(null);
            }
            this.f13711W = null;
        }
        SurfaceHolder surfaceHolder = this.f13708T;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(surfaceHolderCallbackC1285UQ);
            this.f13708T = null;
        }
    }

    /* renamed from: U1 */
    public final void m9023U1(int i, int i2, Object obj) {
        for (AbstractC0043Ag abstractC0043Ag : this.f13725h) {
            if (i == -1 || abstractC0043Ag.f307b == i) {
                QB0 qb0M9038y1 = m9038y1(abstractC0043Ag);
                YN1.m9281f(!qb0M9038y1.f9523g);
                qb0M9038y1.f9520d = i2;
                YN1.m9281f(!qb0M9038y1.f9523g);
                qb0M9038y1.f9521e = obj;
                qb0M9038y1.m6597c();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e1  */
    /* renamed from: V1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m9024V1(java.util.List r17, int r18, long r19, boolean r21) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1474XQ.m9024V1(java.util.List, int, long, boolean):void");
    }

    /* renamed from: W1 */
    public final void m9025W1(boolean z) {
        m9035g2();
        int iM22509d = this.f13690B.m22509d(m9014K1(), z);
        m9032d2(iM22509d, iM22509d == -1 ? 2 : 1, z);
    }

    /* renamed from: X1 */
    public final void m9026X1(CB0 cb0) {
        m9035g2();
        if (this.f13743u1.f637o.equals(cb0)) {
            return;
        }
        BB0 bb0M550f = this.f13743u1.m550f(cb0);
        this.f13696H++;
        this.f13729l.f26088h.m6904a(4, cb0).m6576b();
        m9033e2(bb0M550f, 0, false, 5, -9223372036854775807L, -1, false);
    }

    /* renamed from: Y1 */
    public final void m9027Y1(final int i) {
        m9035g2();
        if (this.f13694F != i) {
            this.f13694F = i;
            R71 r71 = this.f13729l.f26088h;
            r71.getClass();
            Q71 q71M6903b = R71.m6903b();
            q71M6903b.f9486a = r71.f10020a.obtainMessage(11, i, 0);
            q71M6903b.m6576b();
            InterfaceC8216Rj0 interfaceC8216Rj0 = new InterfaceC8216Rj0() { // from class: PQ
                @Override // p000.InterfaceC8216Rj0
                public final void invoke(Object obj) {
                    ((GB0) obj).mo2963w(i);
                }
            };
            C8372Uj0 c8372Uj0 = this.f13730m;
            c8372Uj0.m8131c(8, interfaceC8216Rj0);
            m9031c2();
            c8372Uj0.m8130b();
        }
    }

    /* renamed from: Z1 */
    public final void m9028Z1(Surface surface) {
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (AbstractC0043Ag abstractC0043Ag : this.f13725h) {
            if (abstractC0043Ag.f307b == 2) {
                QB0 qb0M9038y1 = m9038y1(abstractC0043Ag);
                YN1.m9281f(!qb0M9038y1.f9523g);
                qb0M9038y1.f9520d = 1;
                YN1.m9281f(true ^ qb0M9038y1.f9523g);
                qb0M9038y1.f9521e = surface;
                qb0M9038y1.m6597c();
                arrayList.add(qb0M9038y1);
            }
        }
        Surface surface2 = this.f13706R;
        if (surface2 != null && surface2 != surface) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((QB0) it.next()).m6595a(this.f13693E);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                z = true;
            }
            Surface surface3 = this.f13706R;
            Surface surface4 = this.f13707S;
            if (surface3 == surface4) {
                surface4.release();
                this.f13707S = null;
            }
        }
        this.f13706R = surface;
        if (z) {
            m9030b2(new C0531IQ(2, new C6838sg("Detaching surface timed out."), 1003));
        }
    }

    /* renamed from: a2 */
    public final void m9029a2(float f) {
        m9035g2();
        final float fM1824i = AbstractC7485Dh1.m1824i(f, 0.0f, 1.0f);
        if (this.f13716b0 == fM1824i) {
            return;
        }
        this.f13716b0 = fM1824i;
        m9023U1(1, 2, Float.valueOf(this.f13690B.f37161g * fM1824i));
        this.f13730m.m8134f(22, new InterfaceC8216Rj0() { // from class: NQ
            @Override // p000.InterfaceC8216Rj0
            public final void invoke(Object obj) {
                ((GB0) obj).mo2953i(fM1824i);
            }
        });
    }

    /* renamed from: b2 */
    public final void m9030b2(C0531IQ c0531iq) {
        BB0 bb0 = this.f13743u1;
        BB0 bb0M546b = bb0.m546b(bb0.f624b);
        bb0M546b.f639q = bb0M546b.f641s;
        bb0M546b.f640r = 0L;
        BB0 bb0M551g = bb0M546b.m551g(1);
        if (c0531iq != null) {
            bb0M551g = bb0M551g.m549e(c0531iq);
        }
        BB0 bb02 = bb0M551g;
        this.f13696H++;
        R71 r71 = this.f13729l.f26088h;
        r71.getClass();
        Q71 q71M6903b = R71.m6903b();
        q71M6903b.f9486a = r71.f10020a.obtainMessage(6);
        q71M6903b.m6576b();
        m9033e2(bb02, 0, false, 5, -9223372036854775807L, -1, false);
    }

    /* renamed from: c2 */
    public final void m9031c2() {
        int iMo1254k;
        int iMo1248e;
        EB0 eb0 = this.f13702N;
        int i = AbstractC7485Dh1.f2166a;
        C1474XQ c1474xq = (C1474XQ) this.f13724g;
        boolean zM9015M1 = c1474xq.m9015M1();
        boolean zM7843l1 = c1474xq.m7843l1();
        AbstractC7419Ca1 abstractC7419Ca1M9010G1 = c1474xq.m9010G1();
        if (abstractC7419Ca1M9010G1.m1259p()) {
            iMo1254k = -1;
        } else {
            int iM9007D1 = c1474xq.m9007D1();
            c1474xq.m9035g2();
            int i2 = c1474xq.f13694F;
            if (i2 == 1) {
                i2 = 0;
            }
            c1474xq.m9035g2();
            iMo1254k = abstractC7419Ca1M9010G1.mo1254k(iM9007D1, i2, c1474xq.f13695G);
        }
        boolean z = iMo1254k != -1;
        AbstractC7419Ca1 abstractC7419Ca1M9010G12 = c1474xq.m9010G1();
        if (abstractC7419Ca1M9010G12.m1259p()) {
            iMo1248e = -1;
        } else {
            int iM9007D12 = c1474xq.m9007D1();
            c1474xq.m9035g2();
            int i3 = c1474xq.f13694F;
            if (i3 == 1) {
                i3 = 0;
            }
            c1474xq.m9035g2();
            iMo1248e = abstractC7419Ca1M9010G12.mo1248e(iM9007D12, i3, c1474xq.f13695G);
        }
        boolean z2 = iMo1248e != -1;
        boolean zM7842k1 = c1474xq.m7842k1();
        boolean zM7841j1 = c1474xq.m7841j1();
        boolean zM1259p = c1474xq.m9010G1().m1259p();
        C7391Bm1 c7391Bm1 = new C7391Bm1(26);
        C1353VV c1353vv = this.f13719d.f2534a;
        C0926Oi c0926Oi = (C0926Oi) c7391Bm1.f1022b;
        c0926Oi.getClass();
        for (int i4 = 0; i4 < c1353vv.f12594a.size(); i4++) {
            c0926Oi.m6120e(c1353vv.m8443a(i4));
        }
        boolean z3 = !zM9015M1;
        c7391Bm1.m870o(4, z3);
        c7391Bm1.m870o(5, zM7843l1 && !zM9015M1);
        c7391Bm1.m870o(6, z && !zM9015M1);
        c7391Bm1.m870o(7, !zM1259p && (z || !zM7842k1 || zM7843l1) && !zM9015M1);
        c7391Bm1.m870o(8, z2 && !zM9015M1);
        c7391Bm1.m870o(9, !zM1259p && (z2 || (zM7842k1 && zM7841j1)) && !zM9015M1);
        c7391Bm1.m870o(10, z3);
        c7391Bm1.m870o(11, zM7843l1 && !zM9015M1);
        c7391Bm1.m870o(12, zM7843l1 && !zM9015M1);
        EB0 eb02 = new EB0(c0926Oi.m6121g());
        this.f13702N = eb02;
        if (eb02.equals(eb0)) {
            return;
        }
        this.f13730m.m8131c(13, new C1034QQ(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* renamed from: d2 */
    public final void m9032d2(int i, int i2, boolean z) {
        ?? r14 = (!z || i == -1) ? 0 : 1;
        int i3 = i == 0 ? 1 : 0;
        BB0 bb0 = this.f13743u1;
        if (bb0.f634l == r14 && bb0.f636n == i3 && bb0.f635m == i2) {
            return;
        }
        this.f13696H++;
        BB0 bb02 = this.f13743u1;
        boolean z2 = bb02.f638p;
        BB0 bb0M545a = bb02;
        if (z2) {
            bb0M545a = bb02.m545a();
        }
        BB0 bb0M548d = bb0M545a.m548d(i2, i3, r14);
        int i4 = (i3 << 4) | i2;
        R71 r71 = this.f13729l.f26088h;
        r71.getClass();
        Q71 q71M6903b = R71.m6903b();
        q71M6903b.f9486a = r71.f10020a.obtainMessage(1, r14, i4);
        q71M6903b.m6576b();
        m9033e2(bb0M548d, 0, false, 5, -9223372036854775807L, -1, false);
    }

    /* renamed from: e2 */
    public final void m9033e2(final BB0 bb0, int i, boolean z, int i2, long j, int i3, boolean z2) {
        Pair pair;
        int i4;
        C10825qp0 c10825qp0;
        boolean z3;
        boolean z4;
        int i5;
        Object obj;
        C10825qp0 c10825qp02;
        Object obj2;
        int i6;
        long j2;
        long j3;
        long jM9003L1;
        long jM9003L12;
        Object obj3;
        C10825qp0 c10825qp03;
        Object obj4;
        int i7;
        BB0 bb02 = this.f13743u1;
        this.f13743u1 = bb0;
        boolean zEquals = bb02.f623a.equals(bb0.f623a);
        AbstractC7419Ca1 abstractC7419Ca1 = bb02.f623a;
        AbstractC7419Ca1 abstractC7419Ca12 = bb0.f623a;
        if (abstractC7419Ca12.m1259p() && abstractC7419Ca1.m1259p()) {
            pair = new Pair(Boolean.FALSE, -1);
        } else if (abstractC7419Ca12.m1259p() != abstractC7419Ca1.m1259p()) {
            pair = new Pair(Boolean.TRUE, 3);
        } else {
            C7604Fp0 c7604Fp0 = bb02.f624b;
            Object obj5 = c7604Fp0.f3430a;
            C7315Aa1 c7315Aa1 = this.f13732o;
            int i8 = abstractC7419Ca1.mo1250g(obj5, c7315Aa1).f258c;
            C7367Ba1 c7367Ba1 = (C7367Ba1) this.f11615b;
            Object obj6 = abstractC7419Ca1.mo1256m(i8, c7367Ba1, 0L).f914a;
            C7604Fp0 c7604Fp02 = bb0.f624b;
            if (obj6.equals(abstractC7419Ca12.mo1256m(abstractC7419Ca12.mo1250g(c7604Fp02.f3430a, c7315Aa1).f258c, c7367Ba1, 0L).f914a)) {
                pair = (z && i2 == 0 && c7604Fp0.f3433d < c7604Fp02.f3433d) ? new Pair(Boolean.TRUE, 0) : (z && i2 == 1 && z2) ? new Pair(Boolean.TRUE, 2) : new Pair(Boolean.FALSE, -1);
            } else {
                if (z && i2 == 0) {
                    i4 = 1;
                } else if (z && i2 == 1) {
                    i4 = 2;
                } else {
                    if (zEquals) {
                        throw new IllegalStateException();
                    }
                    i4 = 3;
                }
                pair = new Pair(Boolean.TRUE, Integer.valueOf(i4));
            }
        }
        boolean zBooleanValue = ((Boolean) pair.first).booleanValue();
        int iIntValue = ((Integer) pair.second).intValue();
        if (zBooleanValue) {
            c10825qp0 = !bb0.f623a.m1259p() ? bb0.f623a.mo1256m(bb0.f623a.mo1250g(bb0.f624b.f3430a, this.f13732o).f258c, (C7367Ba1) this.f11615b, 0L).f916c : null;
            this.f13741t1 = C11337up0.f43931A;
        } else {
            c10825qp0 = null;
        }
        if (zBooleanValue || !bb02.f632j.equals(bb0.f632j)) {
            C11209tp0 c11209tp0M25248a = this.f13741t1.m25248a();
            List list = bb0.f632j;
            for (int i9 = 0; i9 < list.size(); i9++) {
                C7660Gr0 c7660Gr0 = (C7660Gr0) list.get(i9);
                int i10 = 0;
                while (true) {
                    InterfaceC7556Er0[] interfaceC7556Er0Arr = c7660Gr0.f3928a;
                    if (i10 < interfaceC7556Er0Arr.length) {
                        interfaceC7556Er0Arr[i10].mo31d0(c11209tp0M25248a);
                        i10++;
                    }
                }
            }
            this.f13741t1 = new C11337up0(c11209tp0M25248a);
        }
        C11337up0 c11337up0M9036w1 = m9036w1();
        boolean zEquals2 = c11337up0M9036w1.equals(this.f13703O);
        this.f13703O = c11337up0M9036w1;
        boolean z5 = bb02.f634l != bb0.f634l;
        boolean z6 = bb02.f627e != bb0.f627e;
        if (z6 || z5) {
            m9034f2();
        }
        boolean z7 = bb02.f629g != bb0.f629g;
        if (!zEquals) {
            this.f13730m.m8131c(0, new C0804Mm(bb0, i, 2));
        }
        if (z) {
            C7315Aa1 c7315Aa12 = new C7315Aa1();
            if (bb02.f623a.m1259p()) {
                z3 = z6;
                z4 = z7;
                i5 = i3;
                obj = null;
                c10825qp02 = null;
                obj2 = null;
                i6 = -1;
            } else {
                Object obj7 = bb02.f624b.f3430a;
                bb02.f623a.mo1250g(obj7, c7315Aa12);
                int i11 = c7315Aa12.f258c;
                int iMo1245b = bb02.f623a.mo1245b(obj7);
                z3 = z6;
                z4 = z7;
                obj = bb02.f623a.mo1256m(i11, (C7367Ba1) this.f11615b, 0L).f914a;
                c10825qp02 = ((C7367Ba1) this.f11615b).f916c;
                i5 = i11;
                i6 = iMo1245b;
                obj2 = obj7;
            }
            if (i2 == 0) {
                if (bb02.f624b.m2791b()) {
                    C7604Fp0 c7604Fp03 = bb02.f624b;
                    jM9003L1 = c7315Aa12.m236a(c7604Fp03.f3431b, c7604Fp03.f3432c);
                    jM9003L12 = m9003L1(bb02);
                } else if (bb02.f624b.f3434e != -1) {
                    jM9003L1 = m9003L1(this.f13743u1);
                    jM9003L12 = jM9003L1;
                } else {
                    j2 = c7315Aa12.f260e;
                    j3 = c7315Aa12.f259d;
                    jM9003L1 = j2 + j3;
                    jM9003L12 = jM9003L1;
                }
            } else if (bb02.f624b.m2791b()) {
                jM9003L1 = bb02.f641s;
                jM9003L12 = m9003L1(bb02);
            } else {
                j2 = c7315Aa12.f260e;
                j3 = bb02.f641s;
                jM9003L1 = j2 + j3;
                jM9003L12 = jM9003L1;
            }
            long jM1819d0 = AbstractC7485Dh1.m1819d0(jM9003L1);
            long jM1819d02 = AbstractC7485Dh1.m1819d0(jM9003L12);
            C7604Fp0 c7604Fp04 = bb02.f624b;
            HB0 hb0 = new HB0(obj, i5, c10825qp02, obj2, i6, jM1819d0, jM1819d02, c7604Fp04.f3431b, c7604Fp04.f3432c);
            int iM9007D1 = m9007D1();
            if (this.f13743u1.f623a.m1259p()) {
                obj3 = null;
                c10825qp03 = null;
                obj4 = null;
                i7 = -1;
            } else {
                BB0 bb03 = this.f13743u1;
                Object obj8 = bb03.f624b.f3430a;
                bb03.f623a.mo1250g(obj8, this.f13732o);
                int iMo1245b2 = this.f13743u1.f623a.mo1245b(obj8);
                AbstractC7419Ca1 abstractC7419Ca13 = this.f13743u1.f623a;
                C7367Ba1 c7367Ba12 = (C7367Ba1) this.f11615b;
                i7 = iMo1245b2;
                obj3 = abstractC7419Ca13.mo1256m(iM9007D1, c7367Ba12, 0L).f914a;
                c10825qp03 = c7367Ba12.f916c;
                obj4 = obj8;
            }
            long jM1819d03 = AbstractC7485Dh1.m1819d0(j);
            long jM1819d04 = this.f13743u1.f624b.m2791b() ? AbstractC7485Dh1.m1819d0(m9003L1(this.f13743u1)) : jM1819d03;
            C7604Fp0 c7604Fp05 = this.f13743u1.f624b;
            this.f13730m.m8131c(11, new C0867Nm(i2, hb0, new HB0(obj3, iM9007D1, c10825qp03, obj4, i7, jM1819d03, jM1819d04, c7604Fp05.f3431b, c7604Fp05.f3432c)));
        } else {
            z3 = z6;
            z4 = z7;
        }
        if (zBooleanValue) {
            this.f13730m.m8131c(1, new C0804Mm(c10825qp0, iIntValue, 3));
        }
        if (bb02.f628f != bb0.f628f) {
            final int i12 = 7;
            this.f13730m.m8131c(10, new InterfaceC8216Rj0() { // from class: MQ
                @Override // p000.InterfaceC8216Rj0
                public final void invoke(Object obj9) {
                    GB0 gb0 = (GB0) obj9;
                    switch (i12) {
                        case 0:
                            BB0 bb04 = bb0;
                            boolean z8 = bb04.f629g;
                            gb0.getClass();
                            gb0.mo2951g(bb04.f629g);
                            break;
                        case 1:
                            BB0 bb05 = bb0;
                            gb0.mo2941B(bb05.f627e, bb05.f634l);
                            break;
                        case 2:
                            gb0.mo2954j(bb0.f627e);
                            break;
                        case 3:
                            BB0 bb06 = bb0;
                            gb0.mo2952h(bb06.f635m, bb06.f634l);
                            break;
                        case 4:
                            gb0.mo2948a(bb0.f636n);
                            break;
                        case 5:
                            gb0.mo2947I(bb0.m554k());
                            break;
                        case 6:
                            gb0.mo2942C(bb0.f637o);
                            break;
                        case 7:
                            gb0.mo2962u(bb0.f628f);
                            break;
                        case 8:
                            gb0.mo2964x(bb0.f628f);
                            break;
                        default:
                            gb0.mo2957p((C9264ec1) bb0.f631i.f17091d);
                            break;
                    }
                }
            });
            if (bb0.f628f != null) {
                final int i13 = 8;
                this.f13730m.m8131c(10, new InterfaceC8216Rj0() { // from class: MQ
                    @Override // p000.InterfaceC8216Rj0
                    public final void invoke(Object obj9) {
                        GB0 gb0 = (GB0) obj9;
                        switch (i13) {
                            case 0:
                                BB0 bb04 = bb0;
                                boolean z8 = bb04.f629g;
                                gb0.getClass();
                                gb0.mo2951g(bb04.f629g);
                                break;
                            case 1:
                                BB0 bb05 = bb0;
                                gb0.mo2941B(bb05.f627e, bb05.f634l);
                                break;
                            case 2:
                                gb0.mo2954j(bb0.f627e);
                                break;
                            case 3:
                                BB0 bb06 = bb0;
                                gb0.mo2952h(bb06.f635m, bb06.f634l);
                                break;
                            case 4:
                                gb0.mo2948a(bb0.f636n);
                                break;
                            case 5:
                                gb0.mo2947I(bb0.m554k());
                                break;
                            case 6:
                                gb0.mo2942C(bb0.f637o);
                                break;
                            case 7:
                                gb0.mo2962u(bb0.f628f);
                                break;
                            case 8:
                                gb0.mo2964x(bb0.f628f);
                                break;
                            default:
                                gb0.mo2957p((C9264ec1) bb0.f631i.f17091d);
                                break;
                        }
                    }
                });
            }
        }
        C8875bc1 c8875bc1 = bb02.f631i;
        C8875bc1 c8875bc12 = bb0.f631i;
        if (c8875bc1 != c8875bc12) {
            AbstractC10821qn0 abstractC10821qn0 = this.f13726i;
            C4218i3 c4218i3 = (C4218i3) c8875bc12.f17092e;
            abstractC10821qn0.getClass();
            abstractC10821qn0.f41155c = c4218i3;
            final int i14 = 9;
            this.f13730m.m8131c(2, new InterfaceC8216Rj0() { // from class: MQ
                @Override // p000.InterfaceC8216Rj0
                public final void invoke(Object obj9) {
                    GB0 gb0 = (GB0) obj9;
                    switch (i14) {
                        case 0:
                            BB0 bb04 = bb0;
                            boolean z8 = bb04.f629g;
                            gb0.getClass();
                            gb0.mo2951g(bb04.f629g);
                            break;
                        case 1:
                            BB0 bb05 = bb0;
                            gb0.mo2941B(bb05.f627e, bb05.f634l);
                            break;
                        case 2:
                            gb0.mo2954j(bb0.f627e);
                            break;
                        case 3:
                            BB0 bb06 = bb0;
                            gb0.mo2952h(bb06.f635m, bb06.f634l);
                            break;
                        case 4:
                            gb0.mo2948a(bb0.f636n);
                            break;
                        case 5:
                            gb0.mo2947I(bb0.m554k());
                            break;
                        case 6:
                            gb0.mo2942C(bb0.f637o);
                            break;
                        case 7:
                            gb0.mo2962u(bb0.f628f);
                            break;
                        case 8:
                            gb0.mo2964x(bb0.f628f);
                            break;
                        default:
                            gb0.mo2957p((C9264ec1) bb0.f631i.f17091d);
                            break;
                    }
                }
            });
        }
        if (!zEquals2) {
            this.f13730m.m8131c(14, new C0267EE(5, this.f13703O));
        }
        if (z4) {
            final int i15 = 0;
            this.f13730m.m8131c(3, new InterfaceC8216Rj0() { // from class: MQ
                @Override // p000.InterfaceC8216Rj0
                public final void invoke(Object obj9) {
                    GB0 gb0 = (GB0) obj9;
                    switch (i15) {
                        case 0:
                            BB0 bb04 = bb0;
                            boolean z8 = bb04.f629g;
                            gb0.getClass();
                            gb0.mo2951g(bb04.f629g);
                            break;
                        case 1:
                            BB0 bb05 = bb0;
                            gb0.mo2941B(bb05.f627e, bb05.f634l);
                            break;
                        case 2:
                            gb0.mo2954j(bb0.f627e);
                            break;
                        case 3:
                            BB0 bb06 = bb0;
                            gb0.mo2952h(bb06.f635m, bb06.f634l);
                            break;
                        case 4:
                            gb0.mo2948a(bb0.f636n);
                            break;
                        case 5:
                            gb0.mo2947I(bb0.m554k());
                            break;
                        case 6:
                            gb0.mo2942C(bb0.f637o);
                            break;
                        case 7:
                            gb0.mo2962u(bb0.f628f);
                            break;
                        case 8:
                            gb0.mo2964x(bb0.f628f);
                            break;
                        default:
                            gb0.mo2957p((C9264ec1) bb0.f631i.f17091d);
                            break;
                    }
                }
            });
        }
        if (z3 || z5) {
            final int i16 = 1;
            this.f13730m.m8131c(-1, new InterfaceC8216Rj0() { // from class: MQ
                @Override // p000.InterfaceC8216Rj0
                public final void invoke(Object obj9) {
                    GB0 gb0 = (GB0) obj9;
                    switch (i16) {
                        case 0:
                            BB0 bb04 = bb0;
                            boolean z8 = bb04.f629g;
                            gb0.getClass();
                            gb0.mo2951g(bb04.f629g);
                            break;
                        case 1:
                            BB0 bb05 = bb0;
                            gb0.mo2941B(bb05.f627e, bb05.f634l);
                            break;
                        case 2:
                            gb0.mo2954j(bb0.f627e);
                            break;
                        case 3:
                            BB0 bb06 = bb0;
                            gb0.mo2952h(bb06.f635m, bb06.f634l);
                            break;
                        case 4:
                            gb0.mo2948a(bb0.f636n);
                            break;
                        case 5:
                            gb0.mo2947I(bb0.m554k());
                            break;
                        case 6:
                            gb0.mo2942C(bb0.f637o);
                            break;
                        case 7:
                            gb0.mo2962u(bb0.f628f);
                            break;
                        case 8:
                            gb0.mo2964x(bb0.f628f);
                            break;
                        default:
                            gb0.mo2957p((C9264ec1) bb0.f631i.f17091d);
                            break;
                    }
                }
            });
        }
        if (z3) {
            final int i17 = 2;
            this.f13730m.m8131c(4, new InterfaceC8216Rj0() { // from class: MQ
                @Override // p000.InterfaceC8216Rj0
                public final void invoke(Object obj9) {
                    GB0 gb0 = (GB0) obj9;
                    switch (i17) {
                        case 0:
                            BB0 bb04 = bb0;
                            boolean z8 = bb04.f629g;
                            gb0.getClass();
                            gb0.mo2951g(bb04.f629g);
                            break;
                        case 1:
                            BB0 bb05 = bb0;
                            gb0.mo2941B(bb05.f627e, bb05.f634l);
                            break;
                        case 2:
                            gb0.mo2954j(bb0.f627e);
                            break;
                        case 3:
                            BB0 bb06 = bb0;
                            gb0.mo2952h(bb06.f635m, bb06.f634l);
                            break;
                        case 4:
                            gb0.mo2948a(bb0.f636n);
                            break;
                        case 5:
                            gb0.mo2947I(bb0.m554k());
                            break;
                        case 6:
                            gb0.mo2942C(bb0.f637o);
                            break;
                        case 7:
                            gb0.mo2962u(bb0.f628f);
                            break;
                        case 8:
                            gb0.mo2964x(bb0.f628f);
                            break;
                        default:
                            gb0.mo2957p((C9264ec1) bb0.f631i.f17091d);
                            break;
                    }
                }
            });
        }
        if (z5 || bb02.f635m != bb0.f635m) {
            final int i18 = 3;
            this.f13730m.m8131c(5, new InterfaceC8216Rj0() { // from class: MQ
                @Override // p000.InterfaceC8216Rj0
                public final void invoke(Object obj9) {
                    GB0 gb0 = (GB0) obj9;
                    switch (i18) {
                        case 0:
                            BB0 bb04 = bb0;
                            boolean z8 = bb04.f629g;
                            gb0.getClass();
                            gb0.mo2951g(bb04.f629g);
                            break;
                        case 1:
                            BB0 bb05 = bb0;
                            gb0.mo2941B(bb05.f627e, bb05.f634l);
                            break;
                        case 2:
                            gb0.mo2954j(bb0.f627e);
                            break;
                        case 3:
                            BB0 bb06 = bb0;
                            gb0.mo2952h(bb06.f635m, bb06.f634l);
                            break;
                        case 4:
                            gb0.mo2948a(bb0.f636n);
                            break;
                        case 5:
                            gb0.mo2947I(bb0.m554k());
                            break;
                        case 6:
                            gb0.mo2942C(bb0.f637o);
                            break;
                        case 7:
                            gb0.mo2962u(bb0.f628f);
                            break;
                        case 8:
                            gb0.mo2964x(bb0.f628f);
                            break;
                        default:
                            gb0.mo2957p((C9264ec1) bb0.f631i.f17091d);
                            break;
                    }
                }
            });
        }
        if (bb02.f636n != bb0.f636n) {
            final int i19 = 4;
            this.f13730m.m8131c(6, new InterfaceC8216Rj0() { // from class: MQ
                @Override // p000.InterfaceC8216Rj0
                public final void invoke(Object obj9) {
                    GB0 gb0 = (GB0) obj9;
                    switch (i19) {
                        case 0:
                            BB0 bb04 = bb0;
                            boolean z8 = bb04.f629g;
                            gb0.getClass();
                            gb0.mo2951g(bb04.f629g);
                            break;
                        case 1:
                            BB0 bb05 = bb0;
                            gb0.mo2941B(bb05.f627e, bb05.f634l);
                            break;
                        case 2:
                            gb0.mo2954j(bb0.f627e);
                            break;
                        case 3:
                            BB0 bb06 = bb0;
                            gb0.mo2952h(bb06.f635m, bb06.f634l);
                            break;
                        case 4:
                            gb0.mo2948a(bb0.f636n);
                            break;
                        case 5:
                            gb0.mo2947I(bb0.m554k());
                            break;
                        case 6:
                            gb0.mo2942C(bb0.f637o);
                            break;
                        case 7:
                            gb0.mo2962u(bb0.f628f);
                            break;
                        case 8:
                            gb0.mo2964x(bb0.f628f);
                            break;
                        default:
                            gb0.mo2957p((C9264ec1) bb0.f631i.f17091d);
                            break;
                    }
                }
            });
        }
        if (bb02.m554k() != bb0.m554k()) {
            final int i20 = 5;
            this.f13730m.m8131c(7, new InterfaceC8216Rj0() { // from class: MQ
                @Override // p000.InterfaceC8216Rj0
                public final void invoke(Object obj9) {
                    GB0 gb0 = (GB0) obj9;
                    switch (i20) {
                        case 0:
                            BB0 bb04 = bb0;
                            boolean z8 = bb04.f629g;
                            gb0.getClass();
                            gb0.mo2951g(bb04.f629g);
                            break;
                        case 1:
                            BB0 bb05 = bb0;
                            gb0.mo2941B(bb05.f627e, bb05.f634l);
                            break;
                        case 2:
                            gb0.mo2954j(bb0.f627e);
                            break;
                        case 3:
                            BB0 bb06 = bb0;
                            gb0.mo2952h(bb06.f635m, bb06.f634l);
                            break;
                        case 4:
                            gb0.mo2948a(bb0.f636n);
                            break;
                        case 5:
                            gb0.mo2947I(bb0.m554k());
                            break;
                        case 6:
                            gb0.mo2942C(bb0.f637o);
                            break;
                        case 7:
                            gb0.mo2962u(bb0.f628f);
                            break;
                        case 8:
                            gb0.mo2964x(bb0.f628f);
                            break;
                        default:
                            gb0.mo2957p((C9264ec1) bb0.f631i.f17091d);
                            break;
                    }
                }
            });
        }
        if (!bb02.f637o.equals(bb0.f637o)) {
            final int i21 = 6;
            this.f13730m.m8131c(12, new InterfaceC8216Rj0() { // from class: MQ
                @Override // p000.InterfaceC8216Rj0
                public final void invoke(Object obj9) {
                    GB0 gb0 = (GB0) obj9;
                    switch (i21) {
                        case 0:
                            BB0 bb04 = bb0;
                            boolean z8 = bb04.f629g;
                            gb0.getClass();
                            gb0.mo2951g(bb04.f629g);
                            break;
                        case 1:
                            BB0 bb05 = bb0;
                            gb0.mo2941B(bb05.f627e, bb05.f634l);
                            break;
                        case 2:
                            gb0.mo2954j(bb0.f627e);
                            break;
                        case 3:
                            BB0 bb06 = bb0;
                            gb0.mo2952h(bb06.f635m, bb06.f634l);
                            break;
                        case 4:
                            gb0.mo2948a(bb0.f636n);
                            break;
                        case 5:
                            gb0.mo2947I(bb0.m554k());
                            break;
                        case 6:
                            gb0.mo2942C(bb0.f637o);
                            break;
                        case 7:
                            gb0.mo2962u(bb0.f628f);
                            break;
                        case 8:
                            gb0.mo2964x(bb0.f628f);
                            break;
                        default:
                            gb0.mo2957p((C9264ec1) bb0.f631i.f17091d);
                            break;
                    }
                }
            });
        }
        m9031c2();
        this.f13730m.m8130b();
        if (bb02.f638p != bb0.f638p) {
            Iterator it = this.f13731n.iterator();
            while (it.hasNext()) {
                ((SurfaceHolderCallbackC1285UQ) it.next()).f11780a.m9034f2();
            }
        }
    }

    /* renamed from: f2 */
    public final void m9034f2() {
        int iM9014K1 = m9014K1();
        C7408Bv0 c7408Bv0 = this.f13692D;
        C10689pl0 c10689pl0 = this.f13691C;
        if (iM9014K1 != 1) {
            if (iM9014K1 == 2 || iM9014K1 == 3) {
                m9035g2();
                boolean z = this.f13743u1.f638p;
                m9013J1();
                c10689pl0.getClass();
                m9013J1();
                c7408Bv0.getClass();
                return;
            }
            if (iM9014K1 != 4) {
                throw new IllegalStateException();
            }
        }
        c10689pl0.getClass();
        c7408Bv0.getClass();
    }

    /* renamed from: g2 */
    public final void m9035g2() {
        C0328FC c0328fc = this.f13721e;
        synchronized (c0328fc) {
            boolean z = false;
            while (!c0328fc.f3086a) {
                try {
                    c0328fc.wait();
                } catch (InterruptedException unused) {
                    z = true;
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
        if (Thread.currentThread() != this.f13738s.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = this.f13738s.getThread().getName();
            int i = AbstractC7485Dh1.f2166a;
            Locale locale = Locale.US;
            String strM24912x = AbstractC11153tN0.m24912x("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread");
            if (this.f13720d0) {
                throw new IllegalStateException(strM24912x);
            }
            AbstractC10872rA1.m24176i(strM24912x, this.f13722e0 ? null : new IllegalStateException());
            this.f13722e0 = true;
        }
    }

    @Override // p000.AbstractC1259U0
    /* renamed from: o1 */
    public final void mo7846o1(int i, long j, boolean z) {
        m9035g2();
        if (i == -1) {
            return;
        }
        YN1.m9278c(i >= 0);
        AbstractC7419Ca1 abstractC7419Ca1 = this.f13743u1.f623a;
        if (abstractC7419Ca1.m1259p() || i < abstractC7419Ca1.mo1258o()) {
            C7251zE c7251zE = this.f13736r;
            if (!c7251zE.f46739i) {
                C1514Y3 c1514y3M26329J = c7251zE.m26329J();
                c7251zE.f46739i = true;
                c7251zE.m26334Q(c1514y3M26329J, -1, new C6730rE(c1514y3M26329J, 1));
            }
            this.f13696H++;
            if (m9015M1()) {
                AbstractC10872rA1.m24175h("seekTo ignored because an ad is playing");
                C1664aR c1664aR = new C1664aR(this.f13743u1);
                c1664aR.m9737f(1);
                C1474XQ c1474xq = this.f13728k.f9617a;
                c1474xq.f13727j.m6905c(new RunnableC1096RQ(c1474xq, 0, c1664aR));
                return;
            }
            BB0 bb0M551g = this.f13743u1;
            int i2 = bb0M551g.f627e;
            if (i2 == 3 || (i2 == 4 && !abstractC7419Ca1.m1259p())) {
                bb0M551g = this.f13743u1.m551g(2);
            }
            int iM9007D1 = m9007D1();
            BB0 bb0M9016N1 = m9016N1(bb0M551g, abstractC7419Ca1, m9017O1(abstractC7419Ca1, i, j));
            this.f13729l.f26088h.m6904a(3, new C1847cR(abstractC7419Ca1, i, AbstractC7485Dh1.m1802Q(j))).m6576b();
            m9033e2(bb0M9016N1, 0, true, 1, m9009F1(bb0M9016N1), iM9007D1, z);
        }
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setImageOutput(ImageOutput imageOutput) {
        m9035g2();
        m9023U1(4, 15, imageOutput);
    }

    /* renamed from: w1 */
    public final C11337up0 m9036w1() {
        AbstractC7419Ca1 abstractC7419Ca1M9010G1 = m9010G1();
        if (abstractC7419Ca1M9010G1.m1259p()) {
            return this.f13741t1;
        }
        C10825qp0 c10825qp0 = abstractC7419Ca1M9010G1.mo1256m(m9007D1(), (C7367Ba1) this.f11615b, 0L).f916c;
        C11209tp0 c11209tp0M25248a = this.f13741t1.m25248a();
        C11337up0 c11337up0 = c10825qp0.f41188d;
        if (c11337up0 != null) {
            CharSequence charSequence = c11337up0.f43932a;
            if (charSequence != null) {
                c11209tp0M25248a.f43325a = charSequence;
            }
            CharSequence charSequence2 = c11337up0.f43933b;
            if (charSequence2 != null) {
                c11209tp0M25248a.f43326b = charSequence2;
            }
            CharSequence charSequence3 = c11337up0.f43934c;
            if (charSequence3 != null) {
                c11209tp0M25248a.f43327c = charSequence3;
            }
            CharSequence charSequence4 = c11337up0.f43935d;
            if (charSequence4 != null) {
                c11209tp0M25248a.f43328d = charSequence4;
            }
            CharSequence charSequence5 = c11337up0.f43936e;
            if (charSequence5 != null) {
                c11209tp0M25248a.f43329e = charSequence5;
            }
            CharSequence charSequence6 = c11337up0.f43937f;
            if (charSequence6 != null) {
                c11209tp0M25248a.f43330f = charSequence6;
            }
            byte[] bArr = c11337up0.f43938g;
            Uri uri = c11337up0.f43940i;
            if (uri != null || bArr != null) {
                c11209tp0M25248a.f43333i = uri;
                c11209tp0M25248a.f43331g = bArr == null ? null : (byte[]) bArr.clone();
                c11209tp0M25248a.f43332h = c11337up0.f43939h;
            }
            Integer num = c11337up0.f43941j;
            if (num != null) {
                c11209tp0M25248a.f43334j = num;
            }
            Integer num2 = c11337up0.f43942k;
            if (num2 != null) {
                c11209tp0M25248a.f43335k = num2;
            }
            Integer num3 = c11337up0.f43943l;
            if (num3 != null) {
                c11209tp0M25248a.f43336l = num3;
            }
            Boolean bool = c11337up0.f43944m;
            if (bool != null) {
                c11209tp0M25248a.f43337m = bool;
            }
            Integer num4 = c11337up0.f43945n;
            if (num4 != null) {
                c11209tp0M25248a.f43338n = num4;
            }
            Integer num5 = c11337up0.f43946o;
            if (num5 != null) {
                c11209tp0M25248a.f43338n = num5;
            }
            Integer num6 = c11337up0.f43947p;
            if (num6 != null) {
                c11209tp0M25248a.f43339o = num6;
            }
            Integer num7 = c11337up0.f43948q;
            if (num7 != null) {
                c11209tp0M25248a.f43340p = num7;
            }
            Integer num8 = c11337up0.f43949r;
            if (num8 != null) {
                c11209tp0M25248a.f43341q = num8;
            }
            Integer num9 = c11337up0.f43950s;
            if (num9 != null) {
                c11209tp0M25248a.f43342r = num9;
            }
            Integer num10 = c11337up0.f43951t;
            if (num10 != null) {
                c11209tp0M25248a.f43343s = num10;
            }
            CharSequence charSequence7 = c11337up0.f43952u;
            if (charSequence7 != null) {
                c11209tp0M25248a.f43344t = charSequence7;
            }
            CharSequence charSequence8 = c11337up0.f43953v;
            if (charSequence8 != null) {
                c11209tp0M25248a.f43345u = charSequence8;
            }
            CharSequence charSequence9 = c11337up0.f43954w;
            if (charSequence9 != null) {
                c11209tp0M25248a.f43346v = charSequence9;
            }
            CharSequence charSequence10 = c11337up0.f43955x;
            if (charSequence10 != null) {
                c11209tp0M25248a.f43347w = charSequence10;
            }
            CharSequence charSequence11 = c11337up0.f43956y;
            if (charSequence11 != null) {
                c11209tp0M25248a.f43348x = charSequence11;
            }
            Integer num11 = c11337up0.f43957z;
            if (num11 != null) {
                c11209tp0M25248a.f43349y = num11;
            }
        }
        return new C11337up0(c11209tp0M25248a);
    }

    /* renamed from: x1 */
    public final void m9037x1() {
        m9035g2();
        m9022T1();
        m9028Z1(null);
        m9018P1(0, 0);
    }

    /* renamed from: y1 */
    public final QB0 m9038y1(PB0 pb0) {
        int iM9011H1 = m9011H1(this.f13743u1);
        AbstractC7419Ca1 abstractC7419Ca1 = this.f13743u1.f623a;
        if (iM9011H1 == -1) {
            iM9011H1 = 0;
        }
        C3928dR c3928dR = this.f13729l;
        return new QB0(c3928dR, pb0, abstractC7419Ca1, iM9011H1, this.f13748x, c3928dR.f26090j);
    }

    /* renamed from: z1 */
    public final long m9039z1() {
        m9035g2();
        if (this.f13743u1.f623a.m1259p()) {
            return this.f13747w1;
        }
        BB0 bb0 = this.f13743u1;
        long j = 0;
        if (bb0.f633k.f3433d != bb0.f624b.f3433d) {
            return AbstractC7485Dh1.m1819d0(bb0.f623a.mo1256m(m9007D1(), (C7367Ba1) this.f11615b, 0L).f926m);
        }
        long j2 = bb0.f639q;
        if (this.f13743u1.f633k.m2791b()) {
            BB0 bb02 = this.f13743u1;
            bb02.f623a.mo1250g(bb02.f633k.f3430a, this.f13732o).m239d(this.f13743u1.f633k.f3431b);
        } else {
            j = j2;
        }
        BB0 bb03 = this.f13743u1;
        AbstractC7419Ca1 abstractC7419Ca1 = bb03.f623a;
        Object obj = bb03.f633k.f3430a;
        C7315Aa1 c7315Aa1 = this.f13732o;
        abstractC7419Ca1.mo1250g(obj, c7315Aa1);
        return AbstractC7485Dh1.m1819d0(j + c7315Aa1.f260e);
    }
}
