package defpackage;

import android.content.Context;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.util.Pair;
import java.io.IOException;
import java.util.HashMap;

/* renamed from: xp0 */
/* loaded from: classes.dex */
public final class C8055xp0 implements Z3 {
    public boolean A;
    public final Context a;
    public final C7187tG b;
    public final PlaybackSession c;
    public String i;
    public PlaybackMetrics.Builder j;
    public int k;
    public IQ n;
    public VY o;
    public VY p;
    public VY q;
    public C6666qX r;
    public C6666qX s;
    public C6666qX t;
    public boolean u;
    public int v;
    public boolean w;
    public int x;
    public int y;
    public int z;
    public final C0100Ba1 e = new C0100Ba1();
    public final C0022Aa1 f = new C0022Aa1();
    public final HashMap h = new HashMap();
    public final HashMap g = new HashMap();
    public final long d = SystemClock.elapsedRealtime();
    public int l = 0;
    public int m = 0;

    public C8055xp0(Context context, PlaybackSession playbackSession) {
        this.a = context.getApplicationContext();
        this.c = playbackSession;
        C7187tG c7187tG = new C7187tG();
        this.b = c7187tG;
        c7187tG.d = this;
    }

    @Override // defpackage.Z3
    public final /* synthetic */ void A(Y3 y3) {
    }

    @Override // defpackage.Z3
    public final /* synthetic */ void B(Y3 y3, int i) {
    }

    @Override // defpackage.Z3
    public final /* synthetic */ void C(Y3 y3) {
    }

    @Override // defpackage.Z3
    public final void D(int i, long j, Y3 y3) {
        C0456Fp0 c0456Fp0 = y3.d;
        if (c0456Fp0 != null) {
            String strD = this.b.d(y3.b, c0456Fp0);
            HashMap map = this.h;
            Long l = (Long) map.get(strD);
            HashMap map2 = this.g;
            Long l2 = (Long) map2.get(strD);
            map.put(strD, Long.valueOf((l == null ? 0L : l.longValue()) + j));
            map2.put(strD, Long.valueOf((l2 != null ? l2.longValue() : 0L) + i));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:615:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:633:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:634:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:642:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:643:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:730:0x05e1 A[PHI: r3
  0x05e1: PHI (r3v78 int) = (r3v77 int), (r3v76 int), (r3v76 int), (r3v76 int) binds: [B:737:0x05f5, B:719:0x05c3, B:720:0x05c5, B:721:0x05c7] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.Z3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void E(defpackage.IB0 r25, defpackage.C4332iN r26) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 1652
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8055xp0.E(IB0, iN):void");
    }

    @Override // defpackage.Z3
    public final /* synthetic */ void F(Y3 y3, float f) {
    }

    @Override // defpackage.Z3
    public final /* synthetic */ void G(Y3 y3, int i, long j, long j2) {
    }

    @Override // defpackage.Z3
    public final void H(Y3 y3, WD wd) {
        this.x += wd.g;
        this.y += wd.e;
    }

    @Override // defpackage.Z3
    public final void I(int i, Y3 y3, HB0 hb0, HB0 hb02) {
        if (i == 1) {
            this.u = true;
        }
        this.k = i;
    }

    @Override // defpackage.Z3
    public final void J(Y3 y3, C7102sp0 c7102sp0) {
        C0456Fp0 c0456Fp0 = y3.d;
        if (c0456Fp0 == null) {
            return;
        }
        C6666qX c6666qX = c7102sp0.c;
        c6666qX.getClass();
        c0456Fp0.getClass();
        VY vy = new VY(c6666qX, c7102sp0.d, this.b.d(y3.b, c0456Fp0), 11);
        int i = c7102sp0.b;
        if (i != 0) {
            if (i == 1) {
                this.p = vy;
                return;
            } else if (i != 2) {
                if (i != 3) {
                    return;
                }
                this.q = vy;
                return;
            }
        }
        this.o = vy;
    }

    @Override // defpackage.Z3
    public final /* synthetic */ void K(Y3 y3) {
    }

    @Override // defpackage.Z3
    public final /* synthetic */ void L(Y3 y3, String str) {
    }

    @Override // defpackage.Z3
    public final /* synthetic */ void M(Y3 y3, boolean z) {
    }

    @Override // defpackage.Z3
    public final /* synthetic */ void N(Y3 y3, boolean z, int i) {
    }

    @Override // defpackage.Z3
    public final /* synthetic */ void O(Y3 y3, C3615ec1 c3615ec1) {
    }

    @Override // defpackage.Z3
    public final /* synthetic */ void P(Y3 y3, Exception exc) {
    }

    @Override // defpackage.Z3
    public final /* synthetic */ void Q(Y3 y3, int i) {
    }

    @Override // defpackage.Z3
    public final /* synthetic */ void R(Y3 y3) {
    }

    public final boolean S(VY vy) {
        String str;
        if (vy != null) {
            String str2 = (String) vy.d;
            C7187tG c7187tG = this.b;
            synchronized (c7187tG) {
                str = c7187tG.f;
            }
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public final void T() {
        PlaybackMetrics.Builder builder = this.j;
        if (builder != null && this.A) {
            builder.setAudioUnderrunCount(this.z);
            this.j.setVideoFramesDropped(this.x);
            this.j.setVideoFramesPlayed(this.y);
            Long l = (Long) this.g.get(this.i);
            this.j.setNetworkTransferDurationMillis(l == null ? 0L : l.longValue());
            Long l2 = (Long) this.h.get(this.i);
            this.j.setNetworkBytesRead(l2 == null ? 0L : l2.longValue());
            this.j.setStreamSource((l2 == null || l2.longValue() <= 0) ? 0 : 1);
            this.c.reportPlaybackMetrics(this.j.build());
        }
        this.j = null;
        this.i = null;
        this.z = 0;
        this.x = 0;
        this.y = 0;
        this.r = null;
        this.s = null;
        this.t = null;
        this.A = false;
    }

    public final void U(AbstractC0178Ca1 abstractC0178Ca1, C0456Fp0 c0456Fp0) {
        int iB;
        int i = 3;
        int iJ = 0;
        PlaybackMetrics.Builder builder = this.j;
        if (c0456Fp0 == null || (iB = abstractC0178Ca1.b(c0456Fp0.a)) == -1) {
            return;
        }
        C0022Aa1 c0022Aa1 = this.f;
        abstractC0178Ca1.f(iB, c0022Aa1, false);
        int i2 = c0022Aa1.c;
        C0100Ba1 c0100Ba1 = this.e;
        abstractC0178Ca1.n(i2, c0100Ba1);
        C5957mp0 c5957mp0 = c0100Ba1.c.b;
        if (c5957mp0 == null) {
            i = 0;
        } else {
            String str = c5957mp0.b;
            if (str != null) {
                switch (str) {
                    case "application/x-mpegURL":
                        iJ = 2;
                        break;
                    case "application/vnd.ms-sstr+xml":
                        iJ = 1;
                        break;
                    case "application/dash+xml":
                        break;
                    case "application/x-rtsp":
                        iJ = 3;
                        break;
                    default:
                        iJ = 4;
                        break;
                }
            } else {
                iJ = AbstractC0277Dh1.J(c5957mp0.a);
            }
            if (iJ != 0) {
                i = iJ != 1 ? iJ != 2 ? 1 : 4 : 5;
            }
        }
        builder.setStreamType(i);
        if (c0100Ba1.m != -9223372036854775807L && !c0100Ba1.k && !c0100Ba1.i && !c0100Ba1.a()) {
            builder.setMediaDurationMillis(AbstractC0277Dh1.d0(c0100Ba1.m));
        }
        builder.setPlaybackType(c0100Ba1.a() ? 2 : 1);
        this.A = true;
    }

    public final void V(Y3 y3, String str) {
        C0456Fp0 c0456Fp0 = y3.d;
        if ((c0456Fp0 == null || !c0456Fp0.b()) && str.equals(this.i)) {
            T();
        }
        this.g.remove(str);
        this.h.remove(str);
    }

    public final void W(int i, long j, C6666qX c6666qX, int i2) {
        int i3;
        TrackChangeEvent.Builder timeSinceCreatedMillis = AbstractC6275oU.l(i).setTimeSinceCreatedMillis(j - this.d);
        if (c6666qX != null) {
            timeSinceCreatedMillis.setTrackState(1);
            if (i2 != 1) {
                i3 = 3;
                if (i2 != 2) {
                    i3 = i2 != 3 ? 1 : 4;
                }
            } else {
                i3 = 2;
            }
            timeSinceCreatedMillis.setTrackChangeReason(i3);
            String str = c6666qX.l;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = c6666qX.m;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = c6666qX.j;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i4 = c6666qX.i;
            if (i4 != -1) {
                timeSinceCreatedMillis.setBitrate(i4);
            }
            int i5 = c6666qX.s;
            if (i5 != -1) {
                timeSinceCreatedMillis.setWidth(i5);
            }
            int i6 = c6666qX.t;
            if (i6 != -1) {
                timeSinceCreatedMillis.setHeight(i6);
            }
            int i7 = c6666qX.A;
            if (i7 != -1) {
                timeSinceCreatedMillis.setChannelCount(i7);
            }
            int i8 = c6666qX.B;
            if (i8 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i8);
            }
            String str4 = c6666qX.d;
            if (str4 != null) {
                int i9 = AbstractC0277Dh1.a;
                String[] strArrSplit = str4.split("-", -1);
                Pair pairCreate = Pair.create(strArrSplit[0], strArrSplit.length >= 2 ? strArrSplit[1] : null);
                timeSinceCreatedMillis.setLanguage((String) pairCreate.first);
                Object obj = pairCreate.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f = c6666qX.u;
            if (f != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.A = true;
        this.c.reportTrackChangeEvent(timeSinceCreatedMillis.build());
    }

    @Override // defpackage.Z3
    public final /* synthetic */ void a(Y3 y3, boolean z) {
    }

    @Override // defpackage.Z3
    public final /* synthetic */ void b(Y3 y3) {
    }

    @Override // defpackage.Z3
    public final /* synthetic */ void c(Y3 y3, boolean z) {
    }

    @Override // defpackage.Z3
    public final /* synthetic */ void d(Y3 y3, String str) {
    }

    @Override // defpackage.Z3
    public final /* synthetic */ void e(Y3 y3, boolean z) {
    }

    @Override // defpackage.Z3
    public final /* synthetic */ void f(Y3 y3, CB0 cb0) {
    }

    @Override // defpackage.Z3
    public final /* synthetic */ void g(Y3 y3, String str) {
    }

    @Override // defpackage.Z3
    public final /* synthetic */ void h(Y3 y3, C0540Gr0 c0540Gr0) {
    }

    @Override // defpackage.Z3
    public final void i(Y3 y3, C7102sp0 c7102sp0, IOException iOException) {
        this.v = c7102sp0.a;
    }

    @Override // defpackage.Z3
    public final /* synthetic */ void j(Y3 y3, int i) {
    }

    @Override // defpackage.Z3
    public final /* synthetic */ void k(Y3 y3, Object obj) {
    }

    @Override // defpackage.Z3
    public final /* synthetic */ void l(Y3 y3, int i) {
    }

    @Override // defpackage.Z3
    public final void m(Y3 y3, IQ iq) {
        this.n = iq;
    }

    @Override // defpackage.Z3
    public final /* synthetic */ void n(Y3 y3, C6666qX c6666qX) {
    }

    @Override // defpackage.Z3
    public final /* synthetic */ void o(Y3 y3, C7102sp0 c7102sp0) {
    }

    @Override // defpackage.Z3
    public final /* synthetic */ void p(Y3 y3, int i, int i2) {
    }

    @Override // defpackage.Z3
    public final /* synthetic */ void q(Y3 y3, int i) {
    }

    @Override // defpackage.Z3
    public final /* synthetic */ void r(Y3 y3, Q9 q9) {
    }

    @Override // defpackage.Z3
    public final /* synthetic */ void s(Y3 y3, C0020Aa c0020Aa) {
    }

    @Override // defpackage.Z3
    public final /* synthetic */ void t(Y3 y3) {
    }

    @Override // defpackage.Z3
    public final void u(Y3 y3, C1530Tj1 c1530Tj1) {
        VY vy = this.o;
        if (vy != null) {
            C6666qX c6666qX = (C6666qX) vy.c;
            if (c6666qX.t == -1) {
                C6475pX c6475pXA = c6666qX.a();
                c6475pXA.r = c1530Tj1.a;
                c6475pXA.s = c1530Tj1.b;
                this.o = new VY(new C6666qX(c6475pXA), vy.b, (String) vy.d, 11);
            }
        }
    }

    @Override // defpackage.Z3
    public final /* synthetic */ void v(Y3 y3, int i) {
    }

    @Override // defpackage.Z3
    public final /* synthetic */ void w(Y3 y3, C6666qX c6666qX) {
    }

    @Override // defpackage.Z3
    public final /* synthetic */ void x(Y3 y3, int i) {
    }

    @Override // defpackage.Z3
    public final /* synthetic */ void y(Y3 y3, String str) {
    }

    @Override // defpackage.Z3
    public final /* synthetic */ void z(Y3 y3, C0020Aa c0020Aa) {
    }
}
