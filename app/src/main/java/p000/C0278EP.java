package p000;

import android.os.SystemClock;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Locale;

/* renamed from: EP */
/* loaded from: classes.dex */
public final class C0278EP implements InterfaceC1577Z3 {

    /* renamed from: d */
    public static final NumberFormat f2690d;

    /* renamed from: a */
    public final C7367Ba1 f2691a = new C7367Ba1();

    /* renamed from: b */
    public final C7315Aa1 f2692b = new C7315Aa1();

    /* renamed from: c */
    public final long f2693c = SystemClock.elapsedRealtime();

    static {
        NumberFormat numberFormat = NumberFormat.getInstance(Locale.US);
        f2690d = numberFormat;
        numberFormat.setMinimumFractionDigits(2);
        numberFormat.setMaximumFractionDigits(2);
        numberFormat.setGroupingUsed(false);
    }

    /* renamed from: S */
    public static String m2214S(C0037Aa c0037Aa) {
        return c0037Aa.f250a + StringUtils.COMMA + c0037Aa.f252c + StringUtils.COMMA + c0037Aa.f251b + StringUtils.COMMA + c0037Aa.f253d + StringUtils.COMMA + c0037Aa.f254e + StringUtils.COMMA + c0037Aa.f255f;
    }

    /* renamed from: V */
    public static String m2215V(long j) {
        if (j == -9223372036854775807L) {
            return "?";
        }
        return f2690d.format(j / 1000.0f);
    }

    @Override // p000.InterfaceC1577Z3
    /* renamed from: A */
    public final void mo2216A(C1514Y3 c1514y3) {
        m2236W(c1514y3, "audioEnabled");
    }

    @Override // p000.InterfaceC1577Z3
    /* renamed from: B */
    public final void mo2217B(C1514Y3 c1514y3, int i) {
        m2237X(c1514y3, "drmSessionAcquired", "state=" + i);
    }

    @Override // p000.InterfaceC1577Z3
    /* renamed from: C */
    public final void mo2218C(C1514Y3 c1514y3) {
        m2236W(c1514y3, "audioDisabled");
    }

    @Override // p000.InterfaceC1577Z3
    /* renamed from: E */
    public final /* synthetic */ void mo2220E(IB0 ib0, C4238iN c4238iN) {
    }

    @Override // p000.InterfaceC1577Z3
    /* renamed from: F */
    public final void mo2221F(C1514Y3 c1514y3, float f) {
        m2237X(c1514y3, "volume", Float.toString(f));
    }

    @Override // p000.InterfaceC1577Z3
    /* renamed from: G */
    public final void mo2222G(C1514Y3 c1514y3, int i, long j, long j2) {
        AbstractC10872rA1.m24171d(m2234T(c1514y3, "audioTrackUnderrun", i + ", " + j + ", " + j2, null));
    }

    @Override // p000.InterfaceC1577Z3
    /* renamed from: H */
    public final void mo2223H(C1514Y3 c1514y3, C1398WD c1398wd) {
        m2236W(c1514y3, "videoDisabled");
    }

    @Override // p000.InterfaceC1577Z3
    /* renamed from: I */
    public final void mo2224I(int i, C1514Y3 c1514y3, HB0 hb0, HB0 hb02) {
        String str;
        StringBuilder sb = new StringBuilder("reason=");
        switch (i) {
            case 0:
                str = "AUTO_TRANSITION";
                break;
            case 1:
                str = "SEEK";
                break;
            case 2:
                str = "SEEK_ADJUSTMENT";
                break;
            case 3:
                str = "SKIP";
                break;
            case 4:
                str = "REMOVE";
                break;
            case 5:
                str = "INTERNAL";
                break;
            case 6:
                str = "SILENCE_SKIP";
                break;
            default:
                str = "?";
                break;
        }
        sb.append(str);
        sb.append(", PositionInfo:old [mediaItem=");
        sb.append(hb0.f4154b);
        sb.append(", period=");
        sb.append(hb0.f4157e);
        sb.append(", pos=");
        sb.append(hb0.f4158f);
        int i2 = hb0.f4160h;
        if (i2 != -1) {
            sb.append(", contentPos=");
            sb.append(hb0.f4159g);
            sb.append(", adGroup=");
            sb.append(i2);
            sb.append(", ad=");
            sb.append(hb0.f4161i);
        }
        sb.append("], PositionInfo:new [mediaItem=");
        sb.append(hb02.f4154b);
        sb.append(", period=");
        sb.append(hb02.f4157e);
        sb.append(", pos=");
        sb.append(hb02.f4158f);
        int i3 = hb02.f4160h;
        if (i3 != -1) {
            sb.append(", contentPos=");
            sb.append(hb02.f4159g);
            sb.append(", adGroup=");
            sb.append(i3);
            sb.append(", ad=");
            sb.append(hb02.f4161i);
        }
        sb.append("]");
        m2237X(c1514y3, "positionDiscontinuity", sb.toString());
    }

    @Override // p000.InterfaceC1577Z3
    /* renamed from: J */
    public final void mo2225J(C1514Y3 c1514y3, C11081sp0 c11081sp0) {
        m2237X(c1514y3, "downstreamFormat", C6686qX.m24019d(c11081sp0.f42624c));
    }

    @Override // p000.InterfaceC1577Z3
    /* renamed from: K */
    public final void mo2226K(C1514Y3 c1514y3) {
        m2236W(c1514y3, "drmSessionReleased");
    }

    @Override // p000.InterfaceC1577Z3
    /* renamed from: L */
    public final void mo2227L(C1514Y3 c1514y3, String str) {
        m2237X(c1514y3, "videoDecoderInitialized", str);
    }

    @Override // p000.InterfaceC1577Z3
    /* renamed from: M */
    public final void mo2228M(C1514Y3 c1514y3, boolean z) {
        m2237X(c1514y3, "loading", Boolean.toString(z));
    }

    @Override // p000.InterfaceC1577Z3
    /* renamed from: N */
    public final void mo2229N(C1514Y3 c1514y3, boolean z, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(z);
        sb.append(", ");
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "?" : "END_OF_MEDIA_ITEM" : Core.NotificationType.REMOTE : "AUDIO_BECOMING_NOISY" : "AUDIO_FOCUS_LOSS" : "USER_REQUEST");
        m2237X(c1514y3, "playWhenReady", sb.toString());
    }

    @Override // p000.InterfaceC1577Z3
    /* renamed from: O */
    public final void mo2230O(C1514Y3 c1514y3, C9264ec1 c9264ec1) {
        C7660Gr0 c7660Gr0;
        AbstractC10872rA1.m24170c("tracks [" + m2235U(c1514y3));
        P70 p70 = c9264ec1.f26779a;
        for (int i = 0; i < p70.size(); i++) {
            C9136dc1 c9136dc1 = (C9136dc1) p70.get(i);
            AbstractC10872rA1.m24170c("  group [");
            for (int i2 = 0; i2 < c9136dc1.f26161a; i2++) {
                String str = c9136dc1.m17713b(i2) ? "[X]" : "[ ]";
                AbstractC10872rA1.m24170c("    " + str + " Track:" + i2 + ", " + C6686qX.m24019d(c9136dc1.m17712a(i2)) + ", supported=" + AbstractC7485Dh1.m1839x(c9136dc1.f26164d[i2]));
            }
            AbstractC10872rA1.m24170c("  ]");
        }
        boolean z = false;
        for (int i3 = 0; !z && i3 < p70.size(); i3++) {
            C9136dc1 c9136dc12 = (C9136dc1) p70.get(i3);
            for (int i4 = 0; !z && i4 < c9136dc12.f26161a; i4++) {
                if (c9136dc12.m17713b(i4) && (c7660Gr0 = c9136dc12.m17712a(i4).f40972k) != null && c7660Gr0.m3183c() > 0) {
                    AbstractC10872rA1.m24170c("  Metadata [");
                    m2238Y(c7660Gr0, "    ");
                    AbstractC10872rA1.m24170c("  ]");
                    z = true;
                }
            }
        }
        AbstractC10872rA1.m24170c("]");
    }

    @Override // p000.InterfaceC1577Z3
    /* renamed from: P */
    public final void mo2231P(C1514Y3 c1514y3, Exception exc) {
        AbstractC10872rA1.m24171d(m2234T(c1514y3, "internalError", "drmSessionManagerError", exc));
    }

    @Override // p000.InterfaceC1577Z3
    /* renamed from: Q */
    public final void mo2232Q(C1514Y3 c1514y3, int i) {
        m2237X(c1514y3, "playbackSuppressionReason", i != 0 ? i != 1 ? "?" : "TRANSIENT_AUDIO_FOCUS_LOSS" : "NONE");
    }

    @Override // p000.InterfaceC1577Z3
    /* renamed from: R */
    public final void mo2233R(C1514Y3 c1514y3) {
        m2236W(c1514y3, "drmKeysRestored");
    }

    /* renamed from: T */
    public final String m2234T(C1514Y3 c1514y3, String str, String str2, Exception exc) {
        StringBuilder sbM5762k = AbstractC0852NX.m5762k(str, " [");
        sbM5762k.append(m2235U(c1514y3));
        String string = sbM5762k.toString();
        if (exc instanceof AB0) {
            StringBuilder sbM5762k2 = AbstractC0852NX.m5762k(string, ", errorCode=");
            sbM5762k2.append(AB0.m102a(((AB0) exc).f104a));
            string = sbM5762k2.toString();
        }
        if (str2 != null) {
            string = AbstractC1374Vq.m8589h(string, ", ", str2);
        }
        String strM24173f = AbstractC10872rA1.m24173f(exc);
        if (!TextUtils.isEmpty(strM24173f)) {
            StringBuilder sbM5762k3 = AbstractC0852NX.m5762k(string, "\n  ");
            sbM5762k3.append(strM24173f.replace("\n", "\n  "));
            sbM5762k3.append('\n');
            string = sbM5762k3.toString();
        }
        return AbstractC7222ym.m26232i(string, "]");
    }

    /* renamed from: U */
    public final String m2235U(C1514Y3 c1514y3) {
        String string = "window=" + c1514y3.f14128c;
        C7604Fp0 c7604Fp0 = c1514y3.f14129d;
        if (c7604Fp0 != null) {
            StringBuilder sbM5762k = AbstractC0852NX.m5762k(string, ", period=");
            sbM5762k.append(c1514y3.f14127b.mo1245b(c7604Fp0.f3430a));
            string = sbM5762k.toString();
            if (c7604Fp0.m2791b()) {
                StringBuilder sbM5762k2 = AbstractC0852NX.m5762k(string, ", adGroup=");
                sbM5762k2.append(c7604Fp0.f3431b);
                StringBuilder sbM5762k3 = AbstractC0852NX.m5762k(sbM5762k2.toString(), ", ad=");
                sbM5762k3.append(c7604Fp0.f3432c);
                string = sbM5762k3.toString();
            }
        }
        return "eventTime=" + m2215V(c1514y3.f14126a - this.f2693c) + ", mediaPos=" + m2215V(c1514y3.f14130e) + ", " + string;
    }

    /* renamed from: W */
    public final void m2236W(C1514Y3 c1514y3, String str) {
        AbstractC10872rA1.m24170c(m2234T(c1514y3, str, null, null));
    }

    /* renamed from: X */
    public final void m2237X(C1514Y3 c1514y3, String str, String str2) {
        AbstractC10872rA1.m24170c(m2234T(c1514y3, str, str2, null));
    }

    /* renamed from: Y */
    public final void m2238Y(C7660Gr0 c7660Gr0, String str) {
        for (int i = 0; i < c7660Gr0.f3928a.length; i++) {
            StringBuilder sbM26238o = AbstractC7222ym.m26238o(str);
            sbM26238o.append(c7660Gr0.f3928a[i]);
            AbstractC10872rA1.m24170c(sbM26238o.toString());
        }
    }

    @Override // p000.InterfaceC1577Z3
    /* renamed from: a */
    public final void mo2239a(C1514Y3 c1514y3, boolean z) {
        m2237X(c1514y3, "shuffleModeEnabled", Boolean.toString(z));
    }

    @Override // p000.InterfaceC1577Z3
    /* renamed from: b */
    public final void mo2240b(C1514Y3 c1514y3) {
        m2236W(c1514y3, "drmKeysLoaded");
    }

    @Override // p000.InterfaceC1577Z3
    /* renamed from: c */
    public final void mo2241c(C1514Y3 c1514y3, boolean z) {
        m2237X(c1514y3, "isPlaying", Boolean.toString(z));
    }

    @Override // p000.InterfaceC1577Z3
    /* renamed from: d */
    public final void mo2242d(C1514Y3 c1514y3, String str) {
        m2237X(c1514y3, "audioDecoderReleased", str);
    }

    @Override // p000.InterfaceC1577Z3
    /* renamed from: e */
    public final void mo2243e(C1514Y3 c1514y3, boolean z) {
        m2237X(c1514y3, "skipSilenceEnabled", Boolean.toString(z));
    }

    @Override // p000.InterfaceC1577Z3
    /* renamed from: f */
    public final void mo2244f(C1514Y3 c1514y3, CB0 cb0) {
        m2237X(c1514y3, "playbackParameters", cb0.toString());
    }

    @Override // p000.InterfaceC1577Z3
    /* renamed from: g */
    public final void mo2245g(C1514Y3 c1514y3, String str) {
        m2237X(c1514y3, "audioDecoderInitialized", str);
    }

    @Override // p000.InterfaceC1577Z3
    /* renamed from: h */
    public final void mo2246h(C1514Y3 c1514y3, C7660Gr0 c7660Gr0) {
        AbstractC10872rA1.m24170c("metadata [" + m2235U(c1514y3));
        m2238Y(c7660Gr0, "  ");
        AbstractC10872rA1.m24170c("]");
    }

    @Override // p000.InterfaceC1577Z3
    /* renamed from: i */
    public final void mo2247i(C1514Y3 c1514y3, C11081sp0 c11081sp0, IOException iOException) {
        AbstractC10872rA1.m24171d(m2234T(c1514y3, "internalError", "loadError", iOException));
    }

    @Override // p000.InterfaceC1577Z3
    /* renamed from: j */
    public final void mo2248j(C1514Y3 c1514y3, int i) {
        m2237X(c1514y3, "state", i != 1 ? i != 2 ? i != 3 ? i != 4 ? "?" : "ENDED" : "READY" : "BUFFERING" : "IDLE");
    }

    @Override // p000.InterfaceC1577Z3
    /* renamed from: k */
    public final void mo2249k(C1514Y3 c1514y3, Object obj) {
        m2237X(c1514y3, "renderedFirstFrame", String.valueOf(obj));
    }

    @Override // p000.InterfaceC1577Z3
    /* renamed from: l */
    public final void mo2250l(C1514Y3 c1514y3, int i) {
        m2237X(c1514y3, "droppedFrames", Integer.toString(i));
    }

    @Override // p000.InterfaceC1577Z3
    /* renamed from: m */
    public final void mo2251m(C1514Y3 c1514y3, C0531IQ c0531iq) {
        AbstractC10872rA1.m24171d(m2234T(c1514y3, "playerFailed", null, c0531iq));
    }

    @Override // p000.InterfaceC1577Z3
    /* renamed from: n */
    public final void mo2252n(C1514Y3 c1514y3, C6686qX c6686qX) {
        m2237X(c1514y3, "audioInputFormat", C6686qX.m24019d(c6686qX));
    }

    @Override // p000.InterfaceC1577Z3
    /* renamed from: o */
    public final void mo2253o(C1514Y3 c1514y3, C11081sp0 c11081sp0) {
        m2237X(c1514y3, "upstreamDiscarded", C6686qX.m24019d(c11081sp0.f42624c));
    }

    @Override // p000.InterfaceC1577Z3
    /* renamed from: p */
    public final void mo2254p(C1514Y3 c1514y3, int i, int i2) {
        m2237X(c1514y3, "surfaceSize", i + ", " + i2);
    }

    @Override // p000.InterfaceC1577Z3
    /* renamed from: q */
    public final void mo2255q(C1514Y3 c1514y3, int i) {
        m2237X(c1514y3, "repeatMode", i != 0 ? i != 1 ? i != 2 ? "?" : "ALL" : "ONE" : "OFF");
    }

    @Override // p000.InterfaceC1577Z3
    /* renamed from: r */
    public final void mo2256r(C1514Y3 c1514y3, C1017Q9 c1017q9) {
        StringBuilder sb = new StringBuilder();
        sb.append(c1017q9.f9498a);
        sb.append(",0,");
        m2237X(c1514y3, "audioAttributes", AbstractC1374Vq.m8591j(sb, c1017q9.f9499b, ",1"));
    }

    @Override // p000.InterfaceC1577Z3
    /* renamed from: s */
    public final void mo2257s(C1514Y3 c1514y3, C0037Aa c0037Aa) {
        m2237X(c1514y3, "audioTrackInit", m2214S(c0037Aa));
    }

    @Override // p000.InterfaceC1577Z3
    /* renamed from: t */
    public final void mo2258t(C1514Y3 c1514y3) {
        m2236W(c1514y3, "videoEnabled");
    }

    @Override // p000.InterfaceC1577Z3
    /* renamed from: u */
    public final void mo2259u(C1514Y3 c1514y3, C8321Tj1 c8321Tj1) {
        m2237X(c1514y3, "videoSize", c8321Tj1.f11487a + ", " + c8321Tj1.f11488b);
    }

    @Override // p000.InterfaceC1577Z3
    /* renamed from: v */
    public final void mo2260v(C1514Y3 c1514y3, int i) {
        AbstractC7419Ca1 abstractC7419Ca1 = c1514y3.f14127b;
        int iMo1251h = abstractC7419Ca1.mo1251h();
        int iMo1258o = abstractC7419Ca1.mo1258o();
        StringBuilder sb = new StringBuilder("timeline [");
        sb.append(m2235U(c1514y3));
        sb.append(", periodCount=");
        sb.append(iMo1251h);
        sb.append(", windowCount=");
        sb.append(iMo1258o);
        sb.append(", reason=");
        sb.append(i != 0 ? i != 1 ? "?" : "SOURCE_UPDATE" : "PLAYLIST_CHANGED");
        AbstractC10872rA1.m24170c(sb.toString());
        for (int i2 = 0; i2 < Math.min(iMo1251h, 3); i2++) {
            C7315Aa1 c7315Aa1 = this.f2692b;
            abstractC7419Ca1.mo1249f(i2, c7315Aa1, false);
            AbstractC10872rA1.m24170c("  period [" + m2215V(AbstractC7485Dh1.m1819d0(c7315Aa1.f259d)) + "]");
        }
        if (iMo1251h > 3) {
            AbstractC10872rA1.m24170c("  ...");
        }
        for (int i3 = 0; i3 < Math.min(iMo1258o, 3); i3++) {
            C7367Ba1 c7367Ba1 = this.f2691a;
            abstractC7419Ca1.m1257n(i3, c7367Ba1);
            AbstractC10872rA1.m24170c("  window [" + m2215V(AbstractC7485Dh1.m1819d0(c7367Ba1.f926m)) + ", seekable=" + c7367Ba1.f921h + ", dynamic=" + c7367Ba1.f922i + "]");
        }
        if (iMo1258o > 3) {
            AbstractC10872rA1.m24170c("  ...");
        }
        AbstractC10872rA1.m24170c("]");
    }

    @Override // p000.InterfaceC1577Z3
    /* renamed from: w */
    public final void mo2261w(C1514Y3 c1514y3, C6686qX c6686qX) {
        m2237X(c1514y3, "videoInputFormat", C6686qX.m24019d(c6686qX));
    }

    @Override // p000.InterfaceC1577Z3
    /* renamed from: x */
    public final void mo2262x(C1514Y3 c1514y3, int i) {
        StringBuilder sb = new StringBuilder("mediaItem [");
        sb.append(m2235U(c1514y3));
        sb.append(", reason=");
        sb.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? "?" : "PLAYLIST_CHANGED" : "SEEK" : "AUTO" : "REPEAT");
        sb.append("]");
        AbstractC10872rA1.m24170c(sb.toString());
    }

    @Override // p000.InterfaceC1577Z3
    /* renamed from: y */
    public final void mo2263y(C1514Y3 c1514y3, String str) {
        m2237X(c1514y3, "videoDecoderReleased", str);
    }

    @Override // p000.InterfaceC1577Z3
    /* renamed from: z */
    public final void mo2264z(C1514Y3 c1514y3, C0037Aa c0037Aa) {
        m2237X(c1514y3, "audioTrackReleased", m2214S(c0037Aa));
    }

    @Override // p000.InterfaceC1577Z3
    /* renamed from: D */
    public final void mo2219D(int i, long j, C1514Y3 c1514y3) {
    }
}
