package p000;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Range;
import androidx.camera.video.internal.compat.quirk.AudioEncoderIgnoresInputTimestampQuirk;
import androidx.camera.video.internal.compat.quirk.CameraUseInconsistentTimebaseQuirk;
import androidx.camera.video.internal.compat.quirk.CodecStuckOnFlushQuirk;
import androidx.camera.video.internal.compat.quirk.VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: qO */
/* loaded from: classes.dex */
public final class C6677qO extends MediaCodec.Callback {

    /* renamed from: a */
    public final C6816sK f40843a;

    /* renamed from: b */
    public final boolean f40844b;

    /* renamed from: c */
    public boolean f40845c = false;

    /* renamed from: d */
    public boolean f40846d = false;

    /* renamed from: e */
    public boolean f40847e = false;

    /* renamed from: f */
    public long f40848f = 0;

    /* renamed from: g */
    public long f40849g = 0;

    /* renamed from: h */
    public boolean f40850h = false;

    /* renamed from: i */
    public boolean f40851i = false;

    /* renamed from: j */
    public boolean f40852j = false;

    /* renamed from: k */
    public boolean f40853k;

    /* renamed from: l */
    public final /* synthetic */ C6820sO f40854l;

    public C6677qO(C6820sO c6820sO) {
        this.f40854l = c6820sO;
        this.f40844b = true;
        boolean z = c6820sO.f42393c;
        this.f40853k = z;
        if (z) {
            C10212m12 c10212m12 = c6820sO.f42407q;
            EnumC11690xa1 enumC11690xa1 = c6820sO.f42406p;
            CameraUseInconsistentTimebaseQuirk cameraUseInconsistentTimebaseQuirk = (CameraUseInconsistentTimebaseQuirk) AbstractC6941uJ.f43644a.m17864z0(CameraUseInconsistentTimebaseQuirk.class);
            C6816sK c6816sK = new C6816sK();
            c6816sK.f42363a = -1L;
            c6816sK.f42364b = c10212m12;
            c6816sK.f42365c = enumC11690xa1;
            c6816sK.f42366d = cameraUseInconsistentTimebaseQuirk;
            this.f40843a = c6816sK;
        } else {
            this.f40843a = null;
        }
        if (((CodecStuckOnFlushQuirk) AbstractC6941uJ.f43644a.m17864z0(CodecStuckOnFlushQuirk.class)) == null || !"video/mp4v-es".equals(c6820sO.f42394d.getString("mime"))) {
            return;
        }
        this.f40844b = false;
    }

    /* renamed from: a */
    public final boolean m23994a(MediaCodec.BufferInfo bufferInfo) {
        boolean z;
        Executor executor;
        InterfaceC3987eO interfaceC3987eO;
        boolean z2;
        if (this.f40847e) {
            AbstractC7806Jm0.m4412f(this.f40854l.f42391a);
            return false;
        }
        if (bufferInfo.size <= 0) {
            AbstractC7806Jm0.m4412f(this.f40854l.f42391a);
            return false;
        }
        if ((bufferInfo.flags & 2) != 0) {
            AbstractC7806Jm0.m4412f(this.f40854l.f42391a);
            return false;
        }
        C6816sK c6816sK = this.f40843a;
        if (c6816sK != null) {
            long j = bufferInfo.presentationTimeUs;
            EnumC11690xa1 enumC11690xa1 = (EnumC11690xa1) c6816sK.f42367e;
            C10212m12 c10212m12 = (C10212m12) c6816sK.f42364b;
            if (enumC11690xa1 == null) {
                CameraUseInconsistentTimebaseQuirk cameraUseInconsistentTimebaseQuirk = (CameraUseInconsistentTimebaseQuirk) c6816sK.f42366d;
                EnumC11690xa1 enumC11690xa12 = (EnumC11690xa1) c6816sK.f42365c;
                if (cameraUseInconsistentTimebaseQuirk != null) {
                    AbstractC7806Jm0.m4412f("VideoTimebaseConverter");
                } else {
                    c10212m12.getClass();
                    z2 = TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos()) - C10212m12.m22629h() > 3000000;
                    c6816sK.f42367e = enumC11690xa12;
                }
                c10212m12.getClass();
                EnumC11690xa1 enumC11690xa13 = Math.abs(j - TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos())) < Math.abs(j - C10212m12.m22629h()) ? EnumC11690xa1.f45685b : EnumC11690xa1.f45684a;
                if (!z2 || enumC11690xa13 == enumC11690xa12) {
                    enumC11690xa13.toString();
                    AbstractC7806Jm0.m4412f("VideoTimebaseConverter");
                } else {
                    int i = Build.VERSION.SDK_INT;
                    String.format("Detected camera timebase inconsistent. Please file an issue at https://issuetracker.google.com/issues/new?component=618491&template=1257717 with this error message [Manufacturer: %s, Model: %s, Hardware: %s, API Level: %d%s].\nCamera timebase is inconsistent. The timebase reported by the camera is %s, but the actual timebase contained in the frame is detected as %s.", Build.MANUFACTURER, Build.MODEL, Build.HARDWARE, Integer.valueOf(i), i >= 31 ? ", SOC: " + Build.SOC_MODEL : "", (EnumC11690xa1) c6816sK.f42365c, enumC11690xa13);
                    AbstractC7806Jm0.m4412f("VideoTimebaseConverter");
                }
                enumC11690xa12 = enumC11690xa13;
                c6816sK.f42367e = enumC11690xa12;
            }
            int iOrdinal = ((EnumC11690xa1) c6816sK.f42367e).ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    throw new AssertionError("Unknown timebase: " + ((EnumC11690xa1) c6816sK.f42367e));
                }
                if (c6816sK.f42363a == -1) {
                    long j2 = Long.MAX_VALUE;
                    long j3 = 0;
                    for (int i2 = 0; i2 < 3; i2++) {
                        c10212m12.getClass();
                        long jM22629h = C10212m12.m22629h();
                        long j4 = j3;
                        long micros = TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos());
                        long jM22629h2 = C10212m12.m22629h();
                        long j5 = jM22629h2 - jM22629h;
                        if (i2 == 0 || j5 < j2) {
                            j3 = micros - ((jM22629h + jM22629h2) >> 1);
                            j2 = j5;
                        } else {
                            j3 = j4;
                        }
                    }
                    c6816sK.f42363a = Math.max(0L, j3);
                    AbstractC7806Jm0.m4412f("VideoTimebaseConverter");
                }
                j -= c6816sK.f42363a;
            }
            bufferInfo.presentationTimeUs = j;
        }
        long j6 = bufferInfo.presentationTimeUs;
        if (j6 <= this.f40848f) {
            AbstractC7806Jm0.m4412f(this.f40854l.f42391a);
            return false;
        }
        this.f40848f = j6;
        if (!this.f40854l.f42410t.contains((Range) Long.valueOf(j6))) {
            AbstractC7806Jm0.m4412f(this.f40854l.f42391a);
            C6820sO c6820sO = this.f40854l;
            if (!c6820sO.f42412v || bufferInfo.presentationTimeUs < ((Long) c6820sO.f42410t.getUpper()).longValue()) {
                return false;
            }
            ScheduledFuture scheduledFuture = this.f40854l.f42414x;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            this.f40854l.f42413w = Long.valueOf(bufferInfo.presentationTimeUs);
            this.f40854l.m24726j();
            this.f40854l.f42412v = false;
            return false;
        }
        C6820sO c6820sO2 = this.f40854l;
        long j7 = bufferInfo.presentationTimeUs;
        while (true) {
            ArrayDeque arrayDeque = c6820sO2.f42405o;
            if (arrayDeque.isEmpty()) {
                break;
            }
            Range range = (Range) arrayDeque.getFirst();
            if (j7 <= ((Long) range.getUpper()).longValue()) {
                break;
            }
            arrayDeque.removeFirst();
            long jLongValue = (((Long) range.getUpper()).longValue() - ((Long) range.getLower()).longValue()) + c6820sO2.f42411u;
            c6820sO2.f42411u = jLongValue;
            AbstractC11306uZ1.m25210c(jLongValue);
            AbstractC7806Jm0.m4412f(c6820sO2.f42391a);
        }
        C6820sO c6820sO3 = this.f40854l;
        long j8 = bufferInfo.presentationTimeUs;
        Iterator it = c6820sO3.f42405o.iterator();
        while (it.hasNext()) {
            Range range2 = (Range) it.next();
            if (range2.contains((Range) Long.valueOf(j8))) {
                z = true;
                break;
            }
            if (j8 < ((Long) range2.getLower()).longValue()) {
                break;
            }
        }
        z = false;
        boolean z3 = this.f40850h;
        if (!z3 && z) {
            AbstractC7806Jm0.m4412f(this.f40854l.f42391a);
            this.f40850h = true;
            synchronized (this.f40854l.f42392b) {
                C6820sO c6820sO4 = this.f40854l;
                executor = c6820sO4.f42409s;
                interfaceC3987eO = c6820sO4.f42408r;
            }
            Objects.requireNonNull(interfaceC3987eO);
            executor.execute(new RunnableC6614pO(interfaceC3987eO, 0));
            C6820sO c6820sO5 = this.f40854l;
            if (c6820sO5.f42390D == 3 && ((c6820sO5.f42393c || AbstractC6941uJ.f43644a.m17864z0(AudioEncoderIgnoresInputTimestampQuirk.class) == null) && (!this.f40854l.f42393c || AbstractC6941uJ.f43644a.m17864z0(VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.class) == null))) {
                InterfaceC1661aO interfaceC1661aO = this.f40854l.f42396f;
                if (interfaceC1661aO instanceof C6549oO) {
                    ((C6549oO) interfaceC1661aO).m23373b(false);
                }
                C6820sO c6820sO6 = this.f40854l;
                c6820sO6.getClass();
                Bundle bundle = new Bundle();
                bundle.putInt("drop-input-frames", 1);
                c6820sO6.f42395e.setParameters(bundle);
            }
            this.f40854l.f42413w = Long.valueOf(bufferInfo.presentationTimeUs);
            C6820sO c6820sO7 = this.f40854l;
            if (c6820sO7.f42412v) {
                ScheduledFuture scheduledFuture2 = c6820sO7.f42414x;
                if (scheduledFuture2 != null) {
                    scheduledFuture2.cancel(true);
                }
                this.f40854l.m24726j();
                this.f40854l.f42412v = false;
            }
        } else if (z3 && !z) {
            AbstractC7806Jm0.m4412f(this.f40854l.f42391a);
            this.f40850h = false;
            if (this.f40854l.f42393c && (bufferInfo.flags & 1) == 0) {
                this.f40851i = true;
            }
        }
        if (this.f40850h) {
            AbstractC7806Jm0.m4412f(this.f40854l.f42391a);
            return false;
        }
        C6820sO c6820sO8 = this.f40854l;
        long j9 = c6820sO8.f42411u;
        if ((j9 > 0 ? bufferInfo.presentationTimeUs - j9 : bufferInfo.presentationTimeUs) <= this.f40849g) {
            AbstractC7806Jm0.m4412f(c6820sO8.f42391a);
            if (!this.f40854l.f42393c || (bufferInfo.flags & 1) == 0) {
                return false;
            }
            this.f40851i = true;
            return false;
        }
        if (!this.f40846d && !this.f40851i && c6820sO8.f42393c) {
            this.f40851i = true;
        }
        if (this.f40851i) {
            if ((bufferInfo.flags & 1) == 0) {
                AbstractC7806Jm0.m4412f(c6820sO8.f42391a);
                this.f40854l.m24723g();
                return false;
            }
            this.f40851i = false;
        }
        return true;
    }

    /* renamed from: b */
    public final void m23995b() {
        C6820sO c6820sO;
        InterfaceC3987eO interfaceC3987eO;
        Executor executor;
        if (this.f40847e) {
            return;
        }
        this.f40847e = true;
        ScheduledFuture scheduledFuture = this.f40854l.f42389C;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.f40854l.f42389C = null;
        }
        synchronized (this.f40854l.f42392b) {
            c6820sO = this.f40854l;
            interfaceC3987eO = c6820sO.f42408r;
            executor = c6820sO.f42409s;
        }
        c6820sO.m24728l(new RunnableC8339Ts1(this, executor, interfaceC3987eO, 23));
    }

    /* renamed from: c */
    public final void m23996c(C1408WN c1408wn, InterfaceC3987eO interfaceC3987eO, Executor executor) {
        C6820sO c6820sO = this.f40854l;
        c6820sO.f42404n.add(c1408wn);
        AbstractC8301Sz1.m7478a(AbstractC8301Sz1.m7489l(c1408wn.f13152e), new ES1(this, 10, c1408wn), c6820sO.f42398h);
        try {
            executor.execute(new RunnableC3973eA(interfaceC3987eO, 27, c1408wn));
        } catch (RejectedExecutionException unused) {
            AbstractC7806Jm0.m4412f(c6820sO.f42391a);
            c1408wn.close();
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        this.f40854l.f42398h.execute(new RunnableC3973eA(this, 24, codecException));
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        this.f40854l.f42398h.execute(new RunnableC6246ja(this, i, 6));
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        this.f40854l.f42398h.execute(new RunnableC6234jO(this, bufferInfo, mediaCodec, i));
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        this.f40854l.f42398h.execute(new RunnableC3973eA(this, 25, mediaFormat));
    }
}
