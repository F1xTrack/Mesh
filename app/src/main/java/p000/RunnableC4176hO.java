package p000;

import android.media.MediaCodec;
import android.os.Bundle;
import android.util.Range;
import androidx.camera.video.internal.compat.quirk.AudioEncoderIgnoresInputTimestampQuirk;
import androidx.camera.video.internal.compat.quirk.VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk;

/* renamed from: hO */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC4176hO implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f28398a;

    /* renamed from: b */
    public final /* synthetic */ C6820sO f28399b;

    /* renamed from: c */
    public final /* synthetic */ long f28400c;

    public /* synthetic */ RunnableC4176hO(C6820sO c6820sO, long j, int i) {
        this.f28398a = i;
        this.f28399b = c6820sO;
        this.f28400c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f28398a) {
            case 0:
                C6820sO c6820sO = this.f28399b;
                switch (AbstractC7222ym.m26247x(c6820sO.f42390D)) {
                    case 0:
                    case 2:
                    case 3:
                    case 5:
                    case 7:
                        return;
                    case 1:
                        long j = this.f28400c;
                        AbstractC11306uZ1.m25210c(j);
                        AbstractC7806Jm0.m4412f(c6820sO.f42391a);
                        c6820sO.f42405o.addLast(Range.create(Long.valueOf(j), Long.MAX_VALUE));
                        c6820sO.m24725i(3);
                        return;
                    case 4:
                        c6820sO.m24725i(6);
                        return;
                    case 6:
                    case 8:
                        throw new IllegalStateException("Encoder is released");
                    default:
                        throw new IllegalStateException("Unknown state: ".concat(AbstractC1374Vq.m8602u(c6820sO.f42390D)));
                }
            default:
                C6820sO c6820sO2 = this.f28399b;
                long j2 = this.f28400c;
                switch (AbstractC7222ym.m26247x(c6820sO2.f42390D)) {
                    case 0:
                        c6820sO2.f42413w = null;
                        String str = c6820sO2.f42391a;
                        AbstractC11306uZ1.m25210c(j2);
                        AbstractC7806Jm0.m4412f(str);
                        try {
                            if (c6820sO2.f42416z) {
                                c6820sO2.m24724h();
                            }
                            c6820sO2.f42410t = Range.create(Long.valueOf(j2), Long.MAX_VALUE);
                            c6820sO2.f42395e.start();
                            InterfaceC1661aO interfaceC1661aO = c6820sO2.f42396f;
                            if (interfaceC1661aO instanceof C6549oO) {
                                ((C6549oO) interfaceC1661aO).m23373b(true);
                            }
                            c6820sO2.m24725i(2);
                            return;
                        } catch (MediaCodec.CodecException e) {
                            c6820sO2.m24718b(1, e.getMessage(), e);
                            return;
                        }
                    case 1:
                    case 4:
                    case 7:
                        return;
                    case 2:
                        c6820sO2.f42413w = null;
                        Range range = (Range) c6820sO2.f42405o.removeLast();
                        AbstractC9104dM1.m17550i(range != null && ((Long) range.getUpper()).longValue() == Long.MAX_VALUE, "There should be a \"pause\" before \"resume\"");
                        Long l = (Long) range.getLower();
                        long jLongValue = l.longValue();
                        c6820sO2.f42405o.addLast(Range.create(l, Long.valueOf(j2)));
                        String str2 = c6820sO2.f42391a;
                        AbstractC11306uZ1.m25210c(j2);
                        AbstractC11306uZ1.m25210c(j2 - jLongValue);
                        AbstractC7806Jm0.m4412f(str2);
                        if ((c6820sO2.f42393c || AbstractC6941uJ.f43644a.m17864z0(AudioEncoderIgnoresInputTimestampQuirk.class) == null) && (!c6820sO2.f42393c || AbstractC6941uJ.f43644a.m17864z0(VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.class) == null)) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("drop-input-frames", 0);
                            c6820sO2.f42395e.setParameters(bundle);
                            InterfaceC1661aO interfaceC1661aO2 = c6820sO2.f42396f;
                            if (interfaceC1661aO2 instanceof C6549oO) {
                                ((C6549oO) interfaceC1661aO2).m23373b(true);
                            }
                        }
                        if (c6820sO2.f42393c) {
                            c6820sO2.m24723g();
                        }
                        c6820sO2.m24725i(2);
                        return;
                    case 3:
                    case 5:
                        c6820sO2.m24725i(5);
                        return;
                    case 6:
                    case 8:
                        throw new IllegalStateException("Encoder is released");
                    default:
                        throw new IllegalStateException("Unknown state: ".concat(AbstractC1374Vq.m8602u(c6820sO2.f42390D)));
                }
        }
    }
}
