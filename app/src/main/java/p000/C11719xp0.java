package p000;

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
public final class C11719xp0 implements InterfaceC1577Z3 {

    /* renamed from: A */
    public boolean f45816A;

    /* renamed from: a */
    public final Context f45817a;

    /* renamed from: b */
    public final C6875tG f45818b;

    /* renamed from: c */
    public final PlaybackSession f45819c;

    /* renamed from: i */
    public String f45825i;

    /* renamed from: j */
    public PlaybackMetrics.Builder f45826j;

    /* renamed from: k */
    public int f45827k;

    /* renamed from: n */
    public C0531IQ f45830n;

    /* renamed from: o */
    public C1356VY f45831o;

    /* renamed from: p */
    public C1356VY f45832p;

    /* renamed from: q */
    public C1356VY f45833q;

    /* renamed from: r */
    public C6686qX f45834r;

    /* renamed from: s */
    public C6686qX f45835s;

    /* renamed from: t */
    public C6686qX f45836t;

    /* renamed from: u */
    public boolean f45837u;

    /* renamed from: v */
    public int f45838v;

    /* renamed from: w */
    public boolean f45839w;

    /* renamed from: x */
    public int f45840x;

    /* renamed from: y */
    public int f45841y;

    /* renamed from: z */
    public int f45842z;

    /* renamed from: e */
    public final C7367Ba1 f45821e = new C7367Ba1();

    /* renamed from: f */
    public final C7315Aa1 f45822f = new C7315Aa1();

    /* renamed from: h */
    public final HashMap f45824h = new HashMap();

    /* renamed from: g */
    public final HashMap f45823g = new HashMap();

    /* renamed from: d */
    public final long f45820d = SystemClock.elapsedRealtime();

    /* renamed from: l */
    public int f45828l = 0;

    /* renamed from: m */
    public int f45829m = 0;

    public C11719xp0(Context context, PlaybackSession playbackSession) {
        this.f45817a = context.getApplicationContext();
        this.f45819c = playbackSession;
        C6875tG c6875tG = new C6875tG();
        this.f45818b = c6875tG;
        c6875tG.f42978d = this;
    }

    @Override // p000.InterfaceC1577Z3
    /* renamed from: A */
    public final /* synthetic */ void mo2216A(C1514Y3 c1514y3) {
    }

    @Override // p000.InterfaceC1577Z3
    /* renamed from: B */
    public final /* synthetic */ void mo2217B(C1514Y3 c1514y3, int i) {
    }

    @Override // p000.InterfaceC1577Z3
    /* renamed from: C */
    public final /* synthetic */ void mo2218C(C1514Y3 c1514y3) {
    }

    @Override // p000.InterfaceC1577Z3
    /* renamed from: D */
    public final void mo2219D(int i, long j, C1514Y3 c1514y3) {
        C7604Fp0 c7604Fp0 = c1514y3.f14129d;
        if (c7604Fp0 != null) {
            String strM24860d = this.f45818b.m24860d(c1514y3.f14127b, c7604Fp0);
            HashMap map = this.f45824h;
            Long l = (Long) map.get(strM24860d);
            HashMap map2 = this.f45823g;
            Long l2 = (Long) map2.get(strM24860d);
            map.put(strM24860d, Long.valueOf((l == null ? 0L : l.longValue()) + j));
            map2.put(strM24860d, Long.valueOf((l2 != null ? l2.longValue() : 0L) + i));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:615:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:633:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:634:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:642:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:643:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:730:0x05e1 A[PHI: r3
  0x05e1: PHI (r3v78 int) = (r3v77 int), (r3v76 int), (r3v76 int), (r3v76 int) binds: [B:737:0x05f5, B:719:0x05c3, B:720:0x05c5, B:721:0x05c7] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p000.InterfaceC1577Z3
    /* renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo2220E(p000.IB0 r25, p000.C4238iN r26) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 1652
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C11719xp0.mo2220E(IB0, iN):void");
    }

    @Override // p000.InterfaceC1577Z3
    /* renamed from: F */
    public final /* synthetic */ void mo2221F(C1514Y3 c1514y3, float f) {
    }

    @Override // p000.InterfaceC1577Z3
    /* renamed from: G */
    public final /* synthetic */ void mo2222G(C1514Y3 c1514y3, int i, long j, long j2) {
    }

    @Override // p000.InterfaceC1577Z3
    /* renamed from: H */
    public final void mo2223H(C1514Y3 c1514y3, C1398WD c1398wd) {
        this.f45840x += c1398wd.f13071g;
        this.f45841y += c1398wd.f13069e;
    }

    @Override // p000.InterfaceC1577Z3
    /* renamed from: I */
    public final void mo2224I(int i, C1514Y3 c1514y3, HB0 hb0, HB0 hb02) {
        if (i == 1) {
            this.f45837u = true;
        }
        this.f45827k = i;
    }

    @Override // p000.InterfaceC1577Z3
    /* renamed from: J */
    public final void mo2225J(C1514Y3 c1514y3, C11081sp0 c11081sp0) {
        C7604Fp0 c7604Fp0 = c1514y3.f14129d;
        if (c7604Fp0 == null) {
            return;
        }
        C6686qX c6686qX = c11081sp0.f42624c;
        c6686qX.getClass();
        c7604Fp0.getClass();
        C1356VY c1356vy = new C1356VY(c6686qX, c11081sp0.f42625d, this.f45818b.m24860d(c1514y3.f14127b, c7604Fp0), 11);
        int i = c11081sp0.f42623b;
        if (i != 0) {
            if (i == 1) {
                this.f45832p = c1356vy;
                return;
            } else if (i != 2) {
                if (i != 3) {
                    return;
                }
                this.f45833q = c1356vy;
                return;
            }
        }
        this.f45831o = c1356vy;
    }

    @Override // p000.InterfaceC1577Z3
    /* renamed from: K */
    public final /* synthetic */ void mo2226K(C1514Y3 c1514y3) {
    }

    @Override // p000.InterfaceC1577Z3
    /* renamed from: L */
    public final /* synthetic */ void mo2227L(C1514Y3 c1514y3, String str) {
    }

    @Override // p000.InterfaceC1577Z3
    /* renamed from: M */
    public final /* synthetic */ void mo2228M(C1514Y3 c1514y3, boolean z) {
    }

    @Override // p000.InterfaceC1577Z3
    /* renamed from: N */
    public final /* synthetic */ void mo2229N(C1514Y3 c1514y3, boolean z, int i) {
    }

    @Override // p000.InterfaceC1577Z3
    /* renamed from: O */
    public final /* synthetic */ void mo2230O(C1514Y3 c1514y3, C9264ec1 c9264ec1) {
    }

    @Override // p000.InterfaceC1577Z3
    /* renamed from: P */
    public final /* synthetic */ void mo2231P(C1514Y3 c1514y3, Exception exc) {
    }

    @Override // p000.InterfaceC1577Z3
    /* renamed from: Q */
    public final /* synthetic */ void mo2232Q(C1514Y3 c1514y3, int i) {
    }

    @Override // p000.InterfaceC1577Z3
    /* renamed from: R */
    public final /* synthetic */ void mo2233R(C1514Y3 c1514y3) {
    }

    /* renamed from: S */
    public final boolean m25946S(C1356VY c1356vy) {
        String str;
        if (c1356vy != null) {
            String str2 = (String) c1356vy.f12613d;
            C6875tG c6875tG = this.f45818b;
            synchronized (c6875tG) {
                str = c6875tG.f42980f;
            }
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: T */
    public final void m25947T() {
        PlaybackMetrics.Builder builder = this.f45826j;
        if (builder != null && this.f45816A) {
            builder.setAudioUnderrunCount(this.f45842z);
            this.f45826j.setVideoFramesDropped(this.f45840x);
            this.f45826j.setVideoFramesPlayed(this.f45841y);
            Long l = (Long) this.f45823g.get(this.f45825i);
            this.f45826j.setNetworkTransferDurationMillis(l == null ? 0L : l.longValue());
            Long l2 = (Long) this.f45824h.get(this.f45825i);
            this.f45826j.setNetworkBytesRead(l2 == null ? 0L : l2.longValue());
            this.f45826j.setStreamSource((l2 == null || l2.longValue() <= 0) ? 0 : 1);
            this.f45819c.reportPlaybackMetrics(this.f45826j.build());
        }
        this.f45826j = null;
        this.f45825i = null;
        this.f45842z = 0;
        this.f45840x = 0;
        this.f45841y = 0;
        this.f45834r = null;
        this.f45835s = null;
        this.f45836t = null;
        this.f45816A = false;
    }

    /* renamed from: U */
    public final void m25948U(AbstractC7419Ca1 abstractC7419Ca1, C7604Fp0 c7604Fp0) {
        int iMo1245b;
        int i = 3;
        int iM1795J = 0;
        PlaybackMetrics.Builder builder = this.f45826j;
        if (c7604Fp0 == null || (iMo1245b = abstractC7419Ca1.mo1245b(c7604Fp0.f3430a)) == -1) {
            return;
        }
        C7315Aa1 c7315Aa1 = this.f45822f;
        abstractC7419Ca1.mo1249f(iMo1245b, c7315Aa1, false);
        int i2 = c7315Aa1.f258c;
        C7367Ba1 c7367Ba1 = this.f45821e;
        abstractC7419Ca1.m1257n(i2, c7367Ba1);
        C10313mp0 c10313mp0 = c7367Ba1.f916c.f41186b;
        if (c10313mp0 == null) {
            i = 0;
        } else {
            String str = c10313mp0.f37952b;
            if (str != null) {
                switch (str) {
                    case "application/x-mpegURL":
                        iM1795J = 2;
                        break;
                    case "application/vnd.ms-sstr+xml":
                        iM1795J = 1;
                        break;
                    case "application/dash+xml":
                        break;
                    case "application/x-rtsp":
                        iM1795J = 3;
                        break;
                    default:
                        iM1795J = 4;
                        break;
                }
            } else {
                iM1795J = AbstractC7485Dh1.m1795J(c10313mp0.f37951a);
            }
            if (iM1795J != 0) {
                i = iM1795J != 1 ? iM1795J != 2 ? 1 : 4 : 5;
            }
        }
        builder.setStreamType(i);
        if (c7367Ba1.f926m != -9223372036854775807L && !c7367Ba1.f924k && !c7367Ba1.f922i && !c7367Ba1.m772a()) {
            builder.setMediaDurationMillis(AbstractC7485Dh1.m1819d0(c7367Ba1.f926m));
        }
        builder.setPlaybackType(c7367Ba1.m772a() ? 2 : 1);
        this.f45816A = true;
    }

    /* renamed from: V */
    public final void m25949V(C1514Y3 c1514y3, String str) {
        C7604Fp0 c7604Fp0 = c1514y3.f14129d;
        if ((c7604Fp0 == null || !c7604Fp0.m2791b()) && str.equals(this.f45825i)) {
            m25947T();
        }
        this.f45823g.remove(str);
        this.f45824h.remove(str);
    }

    /* renamed from: W */
    public final void m25950W(int i, long j, C6686qX c6686qX, int i2) {
        int i3;
        TrackChangeEvent.Builder timeSinceCreatedMillis = AbstractC6555oU.m23453l(i).setTimeSinceCreatedMillis(j - this.f45820d);
        if (c6686qX != null) {
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
            String str = c6686qX.f40973l;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = c6686qX.f40974m;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = c6686qX.f40971j;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i4 = c6686qX.f40970i;
            if (i4 != -1) {
                timeSinceCreatedMillis.setBitrate(i4);
            }
            int i5 = c6686qX.f40980s;
            if (i5 != -1) {
                timeSinceCreatedMillis.setWidth(i5);
            }
            int i6 = c6686qX.f40981t;
            if (i6 != -1) {
                timeSinceCreatedMillis.setHeight(i6);
            }
            int i7 = c6686qX.f40951A;
            if (i7 != -1) {
                timeSinceCreatedMillis.setChannelCount(i7);
            }
            int i8 = c6686qX.f40952B;
            if (i8 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i8);
            }
            String str4 = c6686qX.f40965d;
            if (str4 != null) {
                int i9 = AbstractC7485Dh1.f2166a;
                String[] strArrSplit = str4.split("-", -1);
                Pair pairCreate = Pair.create(strArrSplit[0], strArrSplit.length >= 2 ? strArrSplit[1] : null);
                timeSinceCreatedMillis.setLanguage((String) pairCreate.first);
                Object obj = pairCreate.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f = c6686qX.f40982u;
            if (f != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.f45816A = true;
        this.f45819c.reportTrackChangeEvent(timeSinceCreatedMillis.build());
    }

    @Override // p000.InterfaceC1577Z3
    /* renamed from: a */
    public final /* synthetic */ void mo2239a(C1514Y3 c1514y3, boolean z) {
    }

    @Override // p000.InterfaceC1577Z3
    /* renamed from: b */
    public final /* synthetic */ void mo2240b(C1514Y3 c1514y3) {
    }

    @Override // p000.InterfaceC1577Z3
    /* renamed from: c */
    public final /* synthetic */ void mo2241c(C1514Y3 c1514y3, boolean z) {
    }

    @Override // p000.InterfaceC1577Z3
    /* renamed from: d */
    public final /* synthetic */ void mo2242d(C1514Y3 c1514y3, String str) {
    }

    @Override // p000.InterfaceC1577Z3
    /* renamed from: e */
    public final /* synthetic */ void mo2243e(C1514Y3 c1514y3, boolean z) {
    }

    @Override // p000.InterfaceC1577Z3
    /* renamed from: f */
    public final /* synthetic */ void mo2244f(C1514Y3 c1514y3, CB0 cb0) {
    }

    @Override // p000.InterfaceC1577Z3
    /* renamed from: g */
    public final /* synthetic */ void mo2245g(C1514Y3 c1514y3, String str) {
    }

    @Override // p000.InterfaceC1577Z3
    /* renamed from: h */
    public final /* synthetic */ void mo2246h(C1514Y3 c1514y3, C7660Gr0 c7660Gr0) {
    }

    @Override // p000.InterfaceC1577Z3
    /* renamed from: i */
    public final void mo2247i(C1514Y3 c1514y3, C11081sp0 c11081sp0, IOException iOException) {
        this.f45838v = c11081sp0.f42622a;
    }

    @Override // p000.InterfaceC1577Z3
    /* renamed from: j */
    public final /* synthetic */ void mo2248j(C1514Y3 c1514y3, int i) {
    }

    @Override // p000.InterfaceC1577Z3
    /* renamed from: k */
    public final /* synthetic */ void mo2249k(C1514Y3 c1514y3, Object obj) {
    }

    @Override // p000.InterfaceC1577Z3
    /* renamed from: l */
    public final /* synthetic */ void mo2250l(C1514Y3 c1514y3, int i) {
    }

    @Override // p000.InterfaceC1577Z3
    /* renamed from: m */
    public final void mo2251m(C1514Y3 c1514y3, C0531IQ c0531iq) {
        this.f45830n = c0531iq;
    }

    @Override // p000.InterfaceC1577Z3
    /* renamed from: n */
    public final /* synthetic */ void mo2252n(C1514Y3 c1514y3, C6686qX c6686qX) {
    }

    @Override // p000.InterfaceC1577Z3
    /* renamed from: o */
    public final /* synthetic */ void mo2253o(C1514Y3 c1514y3, C11081sp0 c11081sp0) {
    }

    @Override // p000.InterfaceC1577Z3
    /* renamed from: p */
    public final /* synthetic */ void mo2254p(C1514Y3 c1514y3, int i, int i2) {
    }

    @Override // p000.InterfaceC1577Z3
    /* renamed from: q */
    public final /* synthetic */ void mo2255q(C1514Y3 c1514y3, int i) {
    }

    @Override // p000.InterfaceC1577Z3
    /* renamed from: r */
    public final /* synthetic */ void mo2256r(C1514Y3 c1514y3, C1017Q9 c1017q9) {
    }

    @Override // p000.InterfaceC1577Z3
    /* renamed from: s */
    public final /* synthetic */ void mo2257s(C1514Y3 c1514y3, C0037Aa c0037Aa) {
    }

    @Override // p000.InterfaceC1577Z3
    /* renamed from: t */
    public final /* synthetic */ void mo2258t(C1514Y3 c1514y3) {
    }

    @Override // p000.InterfaceC1577Z3
    /* renamed from: u */
    public final void mo2259u(C1514Y3 c1514y3, C8321Tj1 c8321Tj1) {
        C1356VY c1356vy = this.f45831o;
        if (c1356vy != null) {
            C6686qX c6686qX = (C6686qX) c1356vy.f12612c;
            if (c6686qX.f40981t == -1) {
                C6623pX c6623pXM24020a = c6686qX.m24020a();
                c6623pXM24020a.f40167r = c8321Tj1.f11487a;
                c6623pXM24020a.f40168s = c8321Tj1.f11488b;
                this.f45831o = new C1356VY(new C6686qX(c6623pXM24020a), c1356vy.f12611b, (String) c1356vy.f12613d, 11);
            }
        }
    }

    @Override // p000.InterfaceC1577Z3
    /* renamed from: v */
    public final /* synthetic */ void mo2260v(C1514Y3 c1514y3, int i) {
    }

    @Override // p000.InterfaceC1577Z3
    /* renamed from: w */
    public final /* synthetic */ void mo2261w(C1514Y3 c1514y3, C6686qX c6686qX) {
    }

    @Override // p000.InterfaceC1577Z3
    /* renamed from: x */
    public final /* synthetic */ void mo2262x(C1514Y3 c1514y3, int i) {
    }

    @Override // p000.InterfaceC1577Z3
    /* renamed from: y */
    public final /* synthetic */ void mo2263y(C1514Y3 c1514y3, String str) {
    }

    @Override // p000.InterfaceC1577Z3
    /* renamed from: z */
    public final /* synthetic */ void mo2264z(C1514Y3 c1514y3, C0037Aa c0037Aa) {
    }
}
