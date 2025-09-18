package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Locale;

/* loaded from: classes.dex */
public final class EP implements Z3 {
    public static final NumberFormat d;
    public final C0100Ba1 a = new C0100Ba1();
    public final C0022Aa1 b = new C0022Aa1();
    public final long c = SystemClock.elapsedRealtime();

    static {
        NumberFormat numberFormat = NumberFormat.getInstance(Locale.US);
        d = numberFormat;
        numberFormat.setMinimumFractionDigits(2);
        numberFormat.setMaximumFractionDigits(2);
        numberFormat.setGroupingUsed(false);
    }

    public static String S(C0020Aa c0020Aa) {
        return c0020Aa.a + StringUtils.COMMA + c0020Aa.c + StringUtils.COMMA + c0020Aa.b + StringUtils.COMMA + c0020Aa.d + StringUtils.COMMA + c0020Aa.e + StringUtils.COMMA + c0020Aa.f;
    }

    public static String V(long j) {
        if (j == -9223372036854775807L) {
            return "?";
        }
        return d.format(j / 1000.0f);
    }

    @Override // defpackage.Z3
    public final void A(Y3 y3) {
        W(y3, "audioEnabled");
    }

    @Override // defpackage.Z3
    public final void B(Y3 y3, int i) {
        X(y3, "drmSessionAcquired", "state=" + i);
    }

    @Override // defpackage.Z3
    public final void C(Y3 y3) {
        W(y3, "audioDisabled");
    }

    @Override // defpackage.Z3
    public final /* synthetic */ void E(IB0 ib0, C4332iN c4332iN) {
    }

    @Override // defpackage.Z3
    public final void F(Y3 y3, float f) {
        X(y3, "volume", Float.toString(f));
    }

    @Override // defpackage.Z3
    public final void G(Y3 y3, int i, long j, long j2) {
        AbstractC6789rA1.d(T(y3, "audioTrackUnderrun", i + ", " + j + ", " + j2, null));
    }

    @Override // defpackage.Z3
    public final void H(Y3 y3, WD wd) {
        W(y3, "videoDisabled");
    }

    @Override // defpackage.Z3
    public final void I(int i, Y3 y3, HB0 hb0, HB0 hb02) {
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
        sb.append(hb0.b);
        sb.append(", period=");
        sb.append(hb0.e);
        sb.append(", pos=");
        sb.append(hb0.f);
        int i2 = hb0.h;
        if (i2 != -1) {
            sb.append(", contentPos=");
            sb.append(hb0.g);
            sb.append(", adGroup=");
            sb.append(i2);
            sb.append(", ad=");
            sb.append(hb0.i);
        }
        sb.append("], PositionInfo:new [mediaItem=");
        sb.append(hb02.b);
        sb.append(", period=");
        sb.append(hb02.e);
        sb.append(", pos=");
        sb.append(hb02.f);
        int i3 = hb02.h;
        if (i3 != -1) {
            sb.append(", contentPos=");
            sb.append(hb02.g);
            sb.append(", adGroup=");
            sb.append(i3);
            sb.append(", ad=");
            sb.append(hb02.i);
        }
        sb.append("]");
        X(y3, "positionDiscontinuity", sb.toString());
    }

    @Override // defpackage.Z3
    public final void J(Y3 y3, C7102sp0 c7102sp0) {
        X(y3, "downstreamFormat", C6666qX.d(c7102sp0.c));
    }

    @Override // defpackage.Z3
    public final void K(Y3 y3) {
        W(y3, "drmSessionReleased");
    }

    @Override // defpackage.Z3
    public final void L(Y3 y3, String str) {
        X(y3, "videoDecoderInitialized", str);
    }

    @Override // defpackage.Z3
    public final void M(Y3 y3, boolean z) {
        X(y3, "loading", Boolean.toString(z));
    }

    @Override // defpackage.Z3
    public final void N(Y3 y3, boolean z, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(z);
        sb.append(", ");
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "?" : "END_OF_MEDIA_ITEM" : Core.NotificationType.REMOTE : "AUDIO_BECOMING_NOISY" : "AUDIO_FOCUS_LOSS" : "USER_REQUEST");
        X(y3, "playWhenReady", sb.toString());
    }

    @Override // defpackage.Z3
    public final void O(Y3 y3, C3615ec1 c3615ec1) {
        C0540Gr0 c0540Gr0;
        AbstractC6789rA1.c("tracks [" + U(y3));
        P70 p70 = c3615ec1.a;
        for (int i = 0; i < p70.size(); i++) {
            C3425dc1 c3425dc1 = (C3425dc1) p70.get(i);
            AbstractC6789rA1.c("  group [");
            for (int i2 = 0; i2 < c3425dc1.a; i2++) {
                String str = c3425dc1.b(i2) ? "[X]" : "[ ]";
                AbstractC6789rA1.c("    " + str + " Track:" + i2 + ", " + C6666qX.d(c3425dc1.a(i2)) + ", supported=" + AbstractC0277Dh1.x(c3425dc1.d[i2]));
            }
            AbstractC6789rA1.c("  ]");
        }
        boolean z = false;
        for (int i3 = 0; !z && i3 < p70.size(); i3++) {
            C3425dc1 c3425dc12 = (C3425dc1) p70.get(i3);
            for (int i4 = 0; !z && i4 < c3425dc12.a; i4++) {
                if (c3425dc12.b(i4) && (c0540Gr0 = c3425dc12.a(i4).k) != null && c0540Gr0.c() > 0) {
                    AbstractC6789rA1.c("  Metadata [");
                    Y(c0540Gr0, "    ");
                    AbstractC6789rA1.c("  ]");
                    z = true;
                }
            }
        }
        AbstractC6789rA1.c("]");
    }

    @Override // defpackage.Z3
    public final void P(Y3 y3, Exception exc) {
        AbstractC6789rA1.d(T(y3, "internalError", "drmSessionManagerError", exc));
    }

    @Override // defpackage.Z3
    public final void Q(Y3 y3, int i) {
        X(y3, "playbackSuppressionReason", i != 0 ? i != 1 ? "?" : "TRANSIENT_AUDIO_FOCUS_LOSS" : "NONE");
    }

    @Override // defpackage.Z3
    public final void R(Y3 y3) {
        W(y3, "drmKeysRestored");
    }

    public final String T(Y3 y3, String str, String str2, Exception exc) {
        StringBuilder sbK = NX.k(str, " [");
        sbK.append(U(y3));
        String string = sbK.toString();
        if (exc instanceof AB0) {
            StringBuilder sbK2 = NX.k(string, ", errorCode=");
            sbK2.append(AB0.a(((AB0) exc).a));
            string = sbK2.toString();
        }
        if (str2 != null) {
            string = AbstractC1705Vq.h(string, ", ", str2);
        }
        String strF = AbstractC6789rA1.f(exc);
        if (!TextUtils.isEmpty(strF)) {
            StringBuilder sbK3 = NX.k(string, "\n  ");
            sbK3.append(strF.replace("\n", "\n  "));
            sbK3.append('\n');
            string = sbK3.toString();
        }
        return AbstractC8235ym.i(string, "]");
    }

    public final String U(Y3 y3) {
        String string = "window=" + y3.c;
        C0456Fp0 c0456Fp0 = y3.d;
        if (c0456Fp0 != null) {
            StringBuilder sbK = NX.k(string, ", period=");
            sbK.append(y3.b.b(c0456Fp0.a));
            string = sbK.toString();
            if (c0456Fp0.b()) {
                StringBuilder sbK2 = NX.k(string, ", adGroup=");
                sbK2.append(c0456Fp0.b);
                StringBuilder sbK3 = NX.k(sbK2.toString(), ", ad=");
                sbK3.append(c0456Fp0.c);
                string = sbK3.toString();
            }
        }
        return "eventTime=" + V(y3.a - this.c) + ", mediaPos=" + V(y3.e) + ", " + string;
    }

    public final void W(Y3 y3, String str) {
        AbstractC6789rA1.c(T(y3, str, null, null));
    }

    public final void X(Y3 y3, String str, String str2) {
        AbstractC6789rA1.c(T(y3, str, str2, null));
    }

    public final void Y(C0540Gr0 c0540Gr0, String str) {
        for (int i = 0; i < c0540Gr0.a.length; i++) {
            StringBuilder sbO = AbstractC8235ym.o(str);
            sbO.append(c0540Gr0.a[i]);
            AbstractC6789rA1.c(sbO.toString());
        }
    }

    @Override // defpackage.Z3
    public final void a(Y3 y3, boolean z) {
        X(y3, "shuffleModeEnabled", Boolean.toString(z));
    }

    @Override // defpackage.Z3
    public final void b(Y3 y3) {
        W(y3, "drmKeysLoaded");
    }

    @Override // defpackage.Z3
    public final void c(Y3 y3, boolean z) {
        X(y3, "isPlaying", Boolean.toString(z));
    }

    @Override // defpackage.Z3
    public final void d(Y3 y3, String str) {
        X(y3, "audioDecoderReleased", str);
    }

    @Override // defpackage.Z3
    public final void e(Y3 y3, boolean z) {
        X(y3, "skipSilenceEnabled", Boolean.toString(z));
    }

    @Override // defpackage.Z3
    public final void f(Y3 y3, CB0 cb0) {
        X(y3, "playbackParameters", cb0.toString());
    }

    @Override // defpackage.Z3
    public final void g(Y3 y3, String str) {
        X(y3, "audioDecoderInitialized", str);
    }

    @Override // defpackage.Z3
    public final void h(Y3 y3, C0540Gr0 c0540Gr0) {
        AbstractC6789rA1.c("metadata [" + U(y3));
        Y(c0540Gr0, "  ");
        AbstractC6789rA1.c("]");
    }

    @Override // defpackage.Z3
    public final void i(Y3 y3, C7102sp0 c7102sp0, IOException iOException) {
        AbstractC6789rA1.d(T(y3, "internalError", "loadError", iOException));
    }

    @Override // defpackage.Z3
    public final void j(Y3 y3, int i) {
        X(y3, "state", i != 1 ? i != 2 ? i != 3 ? i != 4 ? "?" : "ENDED" : "READY" : "BUFFERING" : "IDLE");
    }

    @Override // defpackage.Z3
    public final void k(Y3 y3, Object obj) {
        X(y3, "renderedFirstFrame", String.valueOf(obj));
    }

    @Override // defpackage.Z3
    public final void l(Y3 y3, int i) {
        X(y3, "droppedFrames", Integer.toString(i));
    }

    @Override // defpackage.Z3
    public final void m(Y3 y3, IQ iq) {
        AbstractC6789rA1.d(T(y3, "playerFailed", null, iq));
    }

    @Override // defpackage.Z3
    public final void n(Y3 y3, C6666qX c6666qX) {
        X(y3, "audioInputFormat", C6666qX.d(c6666qX));
    }

    @Override // defpackage.Z3
    public final void o(Y3 y3, C7102sp0 c7102sp0) {
        X(y3, "upstreamDiscarded", C6666qX.d(c7102sp0.c));
    }

    @Override // defpackage.Z3
    public final void p(Y3 y3, int i, int i2) {
        X(y3, "surfaceSize", i + ", " + i2);
    }

    @Override // defpackage.Z3
    public final void q(Y3 y3, int i) {
        X(y3, "repeatMode", i != 0 ? i != 1 ? i != 2 ? "?" : "ALL" : "ONE" : "OFF");
    }

    @Override // defpackage.Z3
    public final void r(Y3 y3, Q9 q9) {
        StringBuilder sb = new StringBuilder();
        sb.append(q9.a);
        sb.append(",0,");
        X(y3, "audioAttributes", AbstractC1705Vq.j(sb, q9.b, ",1"));
    }

    @Override // defpackage.Z3
    public final void s(Y3 y3, C0020Aa c0020Aa) {
        X(y3, "audioTrackInit", S(c0020Aa));
    }

    @Override // defpackage.Z3
    public final void t(Y3 y3) {
        W(y3, "videoEnabled");
    }

    @Override // defpackage.Z3
    public final void u(Y3 y3, C1530Tj1 c1530Tj1) {
        X(y3, "videoSize", c1530Tj1.a + ", " + c1530Tj1.b);
    }

    @Override // defpackage.Z3
    public final void v(Y3 y3, int i) {
        AbstractC0178Ca1 abstractC0178Ca1 = y3.b;
        int iH = abstractC0178Ca1.h();
        int iO = abstractC0178Ca1.o();
        StringBuilder sb = new StringBuilder("timeline [");
        sb.append(U(y3));
        sb.append(", periodCount=");
        sb.append(iH);
        sb.append(", windowCount=");
        sb.append(iO);
        sb.append(", reason=");
        sb.append(i != 0 ? i != 1 ? "?" : "SOURCE_UPDATE" : "PLAYLIST_CHANGED");
        AbstractC6789rA1.c(sb.toString());
        for (int i2 = 0; i2 < Math.min(iH, 3); i2++) {
            C0022Aa1 c0022Aa1 = this.b;
            abstractC0178Ca1.f(i2, c0022Aa1, false);
            AbstractC6789rA1.c("  period [" + V(AbstractC0277Dh1.d0(c0022Aa1.d)) + "]");
        }
        if (iH > 3) {
            AbstractC6789rA1.c("  ...");
        }
        for (int i3 = 0; i3 < Math.min(iO, 3); i3++) {
            C0100Ba1 c0100Ba1 = this.a;
            abstractC0178Ca1.n(i3, c0100Ba1);
            AbstractC6789rA1.c("  window [" + V(AbstractC0277Dh1.d0(c0100Ba1.m)) + ", seekable=" + c0100Ba1.h + ", dynamic=" + c0100Ba1.i + "]");
        }
        if (iO > 3) {
            AbstractC6789rA1.c("  ...");
        }
        AbstractC6789rA1.c("]");
    }

    @Override // defpackage.Z3
    public final void w(Y3 y3, C6666qX c6666qX) {
        X(y3, "videoInputFormat", C6666qX.d(c6666qX));
    }

    @Override // defpackage.Z3
    public final void x(Y3 y3, int i) {
        StringBuilder sb = new StringBuilder("mediaItem [");
        sb.append(U(y3));
        sb.append(", reason=");
        sb.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? "?" : "PLAYLIST_CHANGED" : "SEEK" : "AUTO" : "REPEAT");
        sb.append("]");
        AbstractC6789rA1.c(sb.toString());
    }

    @Override // defpackage.Z3
    public final void y(Y3 y3, String str) {
        X(y3, "videoDecoderReleased", str);
    }

    @Override // defpackage.Z3
    public final void z(Y3 y3, C0020Aa c0020Aa) {
        X(y3, "audioTrackReleased", S(c0020Aa));
    }

    @Override // defpackage.Z3
    public final void D(int i, long j, Y3 y3) {
    }
}
