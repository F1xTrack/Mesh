package defpackage;

import android.media.MediaCodec;
import android.os.Bundle;
import android.util.Range;
import androidx.camera.video.internal.compat.quirk.AudioEncoderIgnoresInputTimestampQuirk;
import androidx.camera.video.internal.compat.quirk.VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk;

/* renamed from: hO */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC4144hO implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ C7020sO b;
    public final /* synthetic */ long c;

    public /* synthetic */ RunnableC4144hO(C7020sO c7020sO, long j, int i) {
        this.a = i;
        this.b = c7020sO;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                C7020sO c7020sO = this.b;
                switch (AbstractC8235ym.x(c7020sO.D)) {
                    case 0:
                    case 2:
                    case 3:
                    case 5:
                    case 7:
                        return;
                    case 1:
                        long j = this.c;
                        AbstractC7437uZ1.c(j);
                        AbstractC0759Jm0.f(c7020sO.a);
                        c7020sO.o.addLast(Range.create(Long.valueOf(j), Long.MAX_VALUE));
                        c7020sO.i(3);
                        return;
                    case 4:
                        c7020sO.i(6);
                        return;
                    case 6:
                    case 8:
                        throw new IllegalStateException("Encoder is released");
                    default:
                        throw new IllegalStateException("Unknown state: ".concat(AbstractC1705Vq.u(c7020sO.D)));
                }
            default:
                C7020sO c7020sO2 = this.b;
                long j2 = this.c;
                switch (AbstractC8235ym.x(c7020sO2.D)) {
                    case 0:
                        c7020sO2.w = null;
                        String str = c7020sO2.a;
                        AbstractC7437uZ1.c(j2);
                        AbstractC0759Jm0.f(str);
                        try {
                            if (c7020sO2.z) {
                                c7020sO2.h();
                            }
                            c7020sO2.t = Range.create(Long.valueOf(j2), Long.MAX_VALUE);
                            c7020sO2.e.start();
                            InterfaceC2124aO interfaceC2124aO = c7020sO2.f;
                            if (interfaceC2124aO instanceof C6257oO) {
                                ((C6257oO) interfaceC2124aO).b(true);
                            }
                            c7020sO2.i(2);
                            return;
                        } catch (MediaCodec.CodecException e) {
                            c7020sO2.b(1, e.getMessage(), e);
                            return;
                        }
                    case 1:
                    case 4:
                    case 7:
                        return;
                    case 2:
                        c7020sO2.w = null;
                        Range range = (Range) c7020sO2.o.removeLast();
                        AbstractC3377dM1.i(range != null && ((Long) range.getUpper()).longValue() == Long.MAX_VALUE, "There should be a \"pause\" before \"resume\"");
                        Long l = (Long) range.getLower();
                        long jLongValue = l.longValue();
                        c7020sO2.o.addLast(Range.create(l, Long.valueOf(j2)));
                        String str2 = c7020sO2.a;
                        AbstractC7437uZ1.c(j2);
                        AbstractC7437uZ1.c(j2 - jLongValue);
                        AbstractC0759Jm0.f(str2);
                        if ((c7020sO2.c || AbstractC7387uJ.a.z0(AudioEncoderIgnoresInputTimestampQuirk.class) == null) && (!c7020sO2.c || AbstractC7387uJ.a.z0(VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.class) == null)) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("drop-input-frames", 0);
                            c7020sO2.e.setParameters(bundle);
                            InterfaceC2124aO interfaceC2124aO2 = c7020sO2.f;
                            if (interfaceC2124aO2 instanceof C6257oO) {
                                ((C6257oO) interfaceC2124aO2).b(true);
                            }
                        }
                        if (c7020sO2.c) {
                            c7020sO2.g();
                        }
                        c7020sO2.i(2);
                        return;
                    case 3:
                    case 5:
                        c7020sO2.i(5);
                        return;
                    case 6:
                    case 8:
                        throw new IllegalStateException("Encoder is released");
                    default:
                        throw new IllegalStateException("Unknown state: ".concat(AbstractC1705Vq.u(c7020sO2.D)));
                }
        }
    }
}
