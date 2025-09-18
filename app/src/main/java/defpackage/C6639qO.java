package defpackage;

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
public final class C6639qO extends MediaCodec.Callback {
    public final C7008sK a;
    public final boolean b;
    public boolean c = false;
    public boolean d = false;
    public boolean e = false;
    public long f = 0;
    public long g = 0;
    public boolean h = false;
    public boolean i = false;
    public boolean j = false;
    public boolean k;
    public final /* synthetic */ C7020sO l;

    public C6639qO(C7020sO c7020sO) {
        this.l = c7020sO;
        this.b = true;
        boolean z = c7020sO.c;
        this.k = z;
        if (z) {
            C5806m12 c5806m12 = c7020sO.q;
            EnumC8011xa1 enumC8011xa1 = c7020sO.p;
            CameraUseInconsistentTimebaseQuirk cameraUseInconsistentTimebaseQuirk = (CameraUseInconsistentTimebaseQuirk) AbstractC7387uJ.a.z0(CameraUseInconsistentTimebaseQuirk.class);
            C7008sK c7008sK = new C7008sK();
            c7008sK.a = -1L;
            c7008sK.b = c5806m12;
            c7008sK.c = enumC8011xa1;
            c7008sK.d = cameraUseInconsistentTimebaseQuirk;
            this.a = c7008sK;
        } else {
            this.a = null;
        }
        if (((CodecStuckOnFlushQuirk) AbstractC7387uJ.a.z0(CodecStuckOnFlushQuirk.class)) == null || !"video/mp4v-es".equals(c7020sO.d.getString("mime"))) {
            return;
        }
        this.b = false;
    }

    public final boolean a(MediaCodec.BufferInfo bufferInfo) {
        boolean z;
        Executor executor;
        InterfaceC3571eO interfaceC3571eO;
        boolean z2;
        if (this.e) {
            AbstractC0759Jm0.f(this.l.a);
            return false;
        }
        if (bufferInfo.size <= 0) {
            AbstractC0759Jm0.f(this.l.a);
            return false;
        }
        if ((bufferInfo.flags & 2) != 0) {
            AbstractC0759Jm0.f(this.l.a);
            return false;
        }
        C7008sK c7008sK = this.a;
        if (c7008sK != null) {
            long j = bufferInfo.presentationTimeUs;
            EnumC8011xa1 enumC8011xa1 = (EnumC8011xa1) c7008sK.e;
            C5806m12 c5806m12 = (C5806m12) c7008sK.b;
            if (enumC8011xa1 == null) {
                CameraUseInconsistentTimebaseQuirk cameraUseInconsistentTimebaseQuirk = (CameraUseInconsistentTimebaseQuirk) c7008sK.d;
                EnumC8011xa1 enumC8011xa12 = (EnumC8011xa1) c7008sK.c;
                if (cameraUseInconsistentTimebaseQuirk != null) {
                    AbstractC0759Jm0.f("VideoTimebaseConverter");
                } else {
                    c5806m12.getClass();
                    z2 = TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos()) - C5806m12.h() > 3000000;
                    c7008sK.e = enumC8011xa12;
                }
                c5806m12.getClass();
                EnumC8011xa1 enumC8011xa13 = Math.abs(j - TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos())) < Math.abs(j - C5806m12.h()) ? EnumC8011xa1.b : EnumC8011xa1.a;
                if (!z2 || enumC8011xa13 == enumC8011xa12) {
                    enumC8011xa13.toString();
                    AbstractC0759Jm0.f("VideoTimebaseConverter");
                } else {
                    int i = Build.VERSION.SDK_INT;
                    String.format("Detected camera timebase inconsistent. Please file an issue at https://issuetracker.google.com/issues/new?component=618491&template=1257717 with this error message [Manufacturer: %s, Model: %s, Hardware: %s, API Level: %d%s].\nCamera timebase is inconsistent. The timebase reported by the camera is %s, but the actual timebase contained in the frame is detected as %s.", Build.MANUFACTURER, Build.MODEL, Build.HARDWARE, Integer.valueOf(i), i >= 31 ? ", SOC: " + Build.SOC_MODEL : "", (EnumC8011xa1) c7008sK.c, enumC8011xa13);
                    AbstractC0759Jm0.f("VideoTimebaseConverter");
                }
                enumC8011xa12 = enumC8011xa13;
                c7008sK.e = enumC8011xa12;
            }
            int iOrdinal = ((EnumC8011xa1) c7008sK.e).ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    throw new AssertionError("Unknown timebase: " + ((EnumC8011xa1) c7008sK.e));
                }
                if (c7008sK.a == -1) {
                    long j2 = Long.MAX_VALUE;
                    long j3 = 0;
                    for (int i2 = 0; i2 < 3; i2++) {
                        c5806m12.getClass();
                        long jH = C5806m12.h();
                        long j4 = j3;
                        long micros = TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos());
                        long jH2 = C5806m12.h();
                        long j5 = jH2 - jH;
                        if (i2 == 0 || j5 < j2) {
                            j3 = micros - ((jH + jH2) >> 1);
                            j2 = j5;
                        } else {
                            j3 = j4;
                        }
                    }
                    c7008sK.a = Math.max(0L, j3);
                    AbstractC0759Jm0.f("VideoTimebaseConverter");
                }
                j -= c7008sK.a;
            }
            bufferInfo.presentationTimeUs = j;
        }
        long j6 = bufferInfo.presentationTimeUs;
        if (j6 <= this.f) {
            AbstractC0759Jm0.f(this.l.a);
            return false;
        }
        this.f = j6;
        if (!this.l.t.contains((Range) Long.valueOf(j6))) {
            AbstractC0759Jm0.f(this.l.a);
            C7020sO c7020sO = this.l;
            if (!c7020sO.v || bufferInfo.presentationTimeUs < ((Long) c7020sO.t.getUpper()).longValue()) {
                return false;
            }
            ScheduledFuture scheduledFuture = this.l.x;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            this.l.w = Long.valueOf(bufferInfo.presentationTimeUs);
            this.l.j();
            this.l.v = false;
            return false;
        }
        C7020sO c7020sO2 = this.l;
        long j7 = bufferInfo.presentationTimeUs;
        while (true) {
            ArrayDeque arrayDeque = c7020sO2.o;
            if (arrayDeque.isEmpty()) {
                break;
            }
            Range range = (Range) arrayDeque.getFirst();
            if (j7 <= ((Long) range.getUpper()).longValue()) {
                break;
            }
            arrayDeque.removeFirst();
            long jLongValue = (((Long) range.getUpper()).longValue() - ((Long) range.getLower()).longValue()) + c7020sO2.u;
            c7020sO2.u = jLongValue;
            AbstractC7437uZ1.c(jLongValue);
            AbstractC0759Jm0.f(c7020sO2.a);
        }
        C7020sO c7020sO3 = this.l;
        long j8 = bufferInfo.presentationTimeUs;
        Iterator it = c7020sO3.o.iterator();
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
        boolean z3 = this.h;
        if (!z3 && z) {
            AbstractC0759Jm0.f(this.l.a);
            this.h = true;
            synchronized (this.l.b) {
                C7020sO c7020sO4 = this.l;
                executor = c7020sO4.s;
                interfaceC3571eO = c7020sO4.r;
            }
            Objects.requireNonNull(interfaceC3571eO);
            executor.execute(new RunnableC6448pO(interfaceC3571eO, 0));
            C7020sO c7020sO5 = this.l;
            if (c7020sO5.D == 3 && ((c7020sO5.c || AbstractC7387uJ.a.z0(AudioEncoderIgnoresInputTimestampQuirk.class) == null) && (!this.l.c || AbstractC7387uJ.a.z0(VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.class) == null))) {
                InterfaceC2124aO interfaceC2124aO = this.l.f;
                if (interfaceC2124aO instanceof C6257oO) {
                    ((C6257oO) interfaceC2124aO).b(false);
                }
                C7020sO c7020sO6 = this.l;
                c7020sO6.getClass();
                Bundle bundle = new Bundle();
                bundle.putInt("drop-input-frames", 1);
                c7020sO6.e.setParameters(bundle);
            }
            this.l.w = Long.valueOf(bufferInfo.presentationTimeUs);
            C7020sO c7020sO7 = this.l;
            if (c7020sO7.v) {
                ScheduledFuture scheduledFuture2 = c7020sO7.x;
                if (scheduledFuture2 != null) {
                    scheduledFuture2.cancel(true);
                }
                this.l.j();
                this.l.v = false;
            }
        } else if (z3 && !z) {
            AbstractC0759Jm0.f(this.l.a);
            this.h = false;
            if (this.l.c && (bufferInfo.flags & 1) == 0) {
                this.i = true;
            }
        }
        if (this.h) {
            AbstractC0759Jm0.f(this.l.a);
            return false;
        }
        C7020sO c7020sO8 = this.l;
        long j9 = c7020sO8.u;
        if ((j9 > 0 ? bufferInfo.presentationTimeUs - j9 : bufferInfo.presentationTimeUs) <= this.g) {
            AbstractC0759Jm0.f(c7020sO8.a);
            if (!this.l.c || (bufferInfo.flags & 1) == 0) {
                return false;
            }
            this.i = true;
            return false;
        }
        if (!this.d && !this.i && c7020sO8.c) {
            this.i = true;
        }
        if (this.i) {
            if ((bufferInfo.flags & 1) == 0) {
                AbstractC0759Jm0.f(c7020sO8.a);
                this.l.g();
                return false;
            }
            this.i = false;
        }
        return true;
    }

    public final void b() {
        C7020sO c7020sO;
        InterfaceC3571eO interfaceC3571eO;
        Executor executor;
        if (this.e) {
            return;
        }
        this.e = true;
        ScheduledFuture scheduledFuture = this.l.C;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.l.C = null;
        }
        synchronized (this.l.b) {
            c7020sO = this.l;
            interfaceC3571eO = c7020sO.r;
            executor = c7020sO.s;
        }
        c7020sO.l(new RunnableC1557Ts1(this, executor, interfaceC3571eO, 23));
    }

    public final void c(WN wn, InterfaceC3571eO interfaceC3571eO, Executor executor) {
        C7020sO c7020sO = this.l;
        c7020sO.n.add(wn);
        AbstractC1500Sz1.a(AbstractC1500Sz1.l(wn.e), new ES1(this, 10, wn), c7020sO.h);
        try {
            executor.execute(new RunnableC3529eA(interfaceC3571eO, 27, wn));
        } catch (RejectedExecutionException unused) {
            AbstractC0759Jm0.f(c7020sO.a);
            wn.close();
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        this.l.h.execute(new RunnableC3529eA(this, 24, codecException));
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        this.l.h.execute(new RunnableC5338ja(this, i, 6));
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        this.l.h.execute(new RunnableC5302jO(this, bufferInfo, mediaCodec, i));
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        this.l.h.execute(new RunnableC3529eA(this, 25, mediaFormat));
    }
}
