package defpackage;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.util.LruCache;
import android.util.Range;
import android.view.Surface;
import androidx.camera.video.internal.compat.quirk.EncoderNotUsePersistentInputSurfaceQuirk;
import androidx.camera.video.internal.compat.quirk.SignalEosOutputBufferNotComeQuirk;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: sO, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7020sO implements InterfaceC3381dO {
    public static final Range E = Range.create(Long.MAX_VALUE, Long.MAX_VALUE);
    public ScheduledFuture C;
    public int D;
    public final String a;
    public final boolean c;
    public final MediaFormat d;
    public final MediaCodec e;
    public final InterfaceC2124aO f;
    public final U0 g;
    public final ExecutorC5715lY0 h;
    public final InterfaceFutureC0750Jj0 i;
    public final C0365El j;
    public final EnumC8011xa1 p;
    public final Object b = new Object();
    public final ArrayDeque k = new ArrayDeque();
    public final ArrayDeque l = new ArrayDeque();
    public final HashSet m = new HashSet();
    public final HashSet n = new HashSet();
    public final ArrayDeque o = new ArrayDeque();
    public final C5806m12 q = new C5806m12(21);
    public InterfaceC3571eO r = InterfaceC3571eO.r0;
    public Executor s = QR1.a();
    public Range t = E;
    public long u = 0;
    public boolean v = false;
    public Long w = null;
    public ScheduledFuture x = null;
    public C6639qO y = null;
    public boolean z = false;
    public boolean A = false;
    public boolean B = false;

    public C7020sO(Executor executor, InterfaceC3953gO interfaceC3953gO) throws IOException, U90 {
        executor.getClass();
        interfaceC3953gO.getClass();
        LruCache lruCache = AbstractC5207iu.a;
        try {
            MediaCodec mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType(interfaceC3953gO.c());
            this.e = mediaCodecCreateEncoderByType;
            MediaCodecInfo codecInfo = mediaCodecCreateEncoderByType.getCodecInfo();
            this.h = new ExecutorC5715lY0(executor);
            MediaFormat mediaFormatA = interfaceC3953gO.a();
            this.d = mediaFormatA;
            EnumC8011xa1 enumC8011xa1B = interfaceC3953gO.b();
            this.p = enumC8011xa1B;
            if (interfaceC3953gO instanceof C6871rc) {
                this.a = "AudioEncoder";
                this.c = false;
                this.f = new C6257oO(this);
                C3798fa c3798fa = new C3798fa(codecInfo, interfaceC3953gO.c());
                Objects.requireNonNull(((MediaCodecInfo.CodecCapabilities) c3798fa.b).getAudioCapabilities());
                this.g = c3798fa;
            } else {
                if (!(interfaceC3953gO instanceof C1669Ve)) {
                    throw new U90("Unknown encoder config type");
                }
                this.a = "VideoEncoder";
                this.c = true;
                this.f = new C6829rO(this);
                C2570cj1 c2570cj1 = new C2570cj1(codecInfo, interfaceC3953gO.c());
                if (mediaFormatA.containsKey("bitrate")) {
                    int integer = mediaFormatA.getInteger("bitrate");
                    int iIntValue = ((Integer) c2570cj1.c.getBitrateRange().clamp(Integer.valueOf(integer))).intValue();
                    if (integer != iIntValue) {
                        mediaFormatA.setInteger("bitrate", iIntValue);
                        AbstractC0759Jm0.f("VideoEncoder");
                    }
                }
                this.g = c2570cj1;
            }
            String str = this.a;
            Objects.toString(enumC8011xa1B);
            AbstractC0759Jm0.f(str);
            String str2 = this.a;
            Objects.toString(mediaFormatA);
            AbstractC0759Jm0.f(str2);
            try {
                h();
                AtomicReference atomicReference = new AtomicReference();
                this.i = AbstractC1500Sz1.l(AbstractC8171yQ1.b(new C6702qj(atomicReference, 4)));
                C0365El c0365El = (C0365El) atomicReference.get();
                c0365El.getClass();
                this.j = c0365El;
                i(1);
            } catch (MediaCodec.CodecException e) {
                throw new U90(e);
            }
        } catch (IOException | IllegalArgumentException e2) {
            throw new U90(e2);
        }
    }

    public final InterfaceFutureC0750Jj0 a() {
        switch (AbstractC8235ym.x(this.D)) {
            case 0:
                return new F70(1, new IllegalStateException("Encoder is not started yet."));
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                AtomicReference atomicReference = new AtomicReference();
                C0599Hl c0599HlB = AbstractC8171yQ1.b(new C6702qj(atomicReference, 3));
                C0365El c0365El = (C0365El) atomicReference.get();
                c0365El.getClass();
                this.l.offer(c0365El);
                c0365El.a(new RunnableC3529eA(this, 19, c0365El), this.h);
                c();
                return c0599HlB;
            case 7:
                return new F70(1, new IllegalStateException("Encoder is in error state."));
            case 8:
                return new F70(1, new IllegalStateException("Encoder is released."));
            default:
                throw new IllegalStateException("Unknown state: ".concat(AbstractC1705Vq.u(this.D)));
        }
    }

    public final void b(int i, String str, Throwable th) {
        switch (AbstractC8235ym.x(this.D)) {
            case 0:
                d(i, str, th);
                h();
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                i(8);
                l(new RunnableC5302jO(this, i, str, th));
                break;
            case 7:
                AbstractC0759Jm0.f(this.a);
                break;
        }
    }

    public final void c() {
        while (true) {
            ArrayDeque arrayDeque = this.l;
            if (arrayDeque.isEmpty()) {
                return;
            }
            ArrayDeque arrayDeque2 = this.k;
            if (arrayDeque2.isEmpty()) {
                return;
            }
            C0365El c0365El = (C0365El) arrayDeque.poll();
            Objects.requireNonNull(c0365El);
            Integer num = (Integer) arrayDeque2.poll();
            Objects.requireNonNull(num);
            try {
                C7736w80 c7736w80 = new C7736w80(this.e, num.intValue());
                if (c0365El.b(c7736w80)) {
                    this.m.add(c7736w80);
                    AbstractC1500Sz1.l(c7736w80.d).d(new RunnableC3529eA(this, 20, c7736w80), this.h);
                } else {
                    c7736w80.a();
                }
            } catch (MediaCodec.CodecException e) {
                b(1, e.getMessage(), e);
                return;
            }
        }
    }

    public final void d(int i, String str, Throwable th) {
        InterfaceC3571eO interfaceC3571eO;
        Executor executor;
        synchronized (this.b) {
            interfaceC3571eO = this.r;
            executor = this.s;
        }
        try {
            executor.execute(new RunnableC1557Ts1(interfaceC3571eO, i, str, th));
        } catch (RejectedExecutionException unused) {
            AbstractC0759Jm0.f(this.a);
        }
    }

    public final void e() {
        this.q.getClass();
        this.h.execute(new RunnableC4144hO(this, C5806m12.h(), 0));
    }

    public final void f() {
        Surface surface;
        HashSet hashSet;
        if (this.z) {
            this.e.stop();
            this.z = false;
        }
        this.e.release();
        InterfaceC2124aO interfaceC2124aO = this.f;
        if (interfaceC2124aO instanceof C6829rO) {
            C6829rO c6829rO = (C6829rO) interfaceC2124aO;
            synchronized (c6829rO.a) {
                surface = c6829rO.b;
                c6829rO.b = null;
                hashSet = new HashSet(c6829rO.c);
                c6829rO.c.clear();
            }
            if (surface != null) {
                surface.release();
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((Surface) it.next()).release();
            }
        }
        i(9);
        this.j.b(null);
    }

    public final void g() {
        Bundle bundle = new Bundle();
        bundle.putInt("request-sync", 0);
        this.e.setParameters(bundle);
    }

    public final void h() {
        C4290i9 c4290i9;
        ExecutorC5715lY0 executorC5715lY0;
        this.t = E;
        this.u = 0L;
        this.o.clear();
        this.k.clear();
        Iterator it = this.l.iterator();
        while (it.hasNext()) {
            ((C0365El) it.next()).c();
        }
        this.l.clear();
        this.e.reset();
        this.z = false;
        this.A = false;
        this.B = false;
        this.v = false;
        ScheduledFuture scheduledFuture = this.x;
        Surface surfaceCreateInputSurface = null;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.x = null;
        }
        ScheduledFuture scheduledFuture2 = this.C;
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(false);
            this.C = null;
        }
        C6639qO c6639qO = this.y;
        if (c6639qO != null) {
            c6639qO.j = true;
        }
        C6639qO c6639qO2 = new C6639qO(this);
        this.y = c6639qO2;
        this.e.setCallback(c6639qO2);
        this.e.configure(this.d, (Surface) null, (MediaCrypto) null, 1);
        InterfaceC2124aO interfaceC2124aO = this.f;
        if (interfaceC2124aO instanceof C6829rO) {
            C6829rO c6829rO = (C6829rO) interfaceC2124aO;
            c6829rO.getClass();
            EncoderNotUsePersistentInputSurfaceQuirk encoderNotUsePersistentInputSurfaceQuirk = (EncoderNotUsePersistentInputSurfaceQuirk) AbstractC7387uJ.a.z0(EncoderNotUsePersistentInputSurfaceQuirk.class);
            synchronized (c6829rO.a) {
                try {
                    if (encoderNotUsePersistentInputSurfaceQuirk == null) {
                        if (c6829rO.b == null) {
                            surfaceCreateInputSurface = MediaCodec.createPersistentInputSurface();
                            c6829rO.b = surfaceCreateInputSurface;
                        }
                        c6829rO.f.e.setInputSurface(c6829rO.b);
                    } else {
                        Surface surface = c6829rO.b;
                        if (surface != null) {
                            c6829rO.c.add(surface);
                        }
                        surfaceCreateInputSurface = c6829rO.f.e.createInputSurface();
                        c6829rO.b = surfaceCreateInputSurface;
                    }
                    c4290i9 = c6829rO.d;
                    executorC5715lY0 = c6829rO.e;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (surfaceCreateInputSurface == null || c4290i9 == null || executorC5715lY0 == null) {
                return;
            }
            try {
                executorC5715lY0.execute(new RunnableC3529eA(c4290i9, 28, surfaceCreateInputSurface));
            } catch (RejectedExecutionException unused) {
                AbstractC0759Jm0.f(c6829rO.f.a);
            }
        }
    }

    public final void i(int i) {
        if (this.D == i) {
            return;
        }
        AbstractC0759Jm0.f(this.a);
        this.D = i;
    }

    public final void j() {
        AbstractC0759Jm0.f(this.a);
        InterfaceC2124aO interfaceC2124aO = this.f;
        if (interfaceC2124aO instanceof C6257oO) {
            ((C6257oO) interfaceC2124aO).b(false);
            ArrayList arrayList = new ArrayList();
            Iterator it = this.m.iterator();
            while (it.hasNext()) {
                arrayList.add(AbstractC1500Sz1.l(((C7736w80) it.next()).d));
            }
            AbstractC1500Sz1.q(arrayList).d(new RunnableC4335iO(this, 0), this.h);
            return;
        }
        if (interfaceC2124aO instanceof C6829rO) {
            try {
                if (AbstractC7387uJ.a.z0(SignalEosOutputBufferNotComeQuirk.class) != null) {
                    C6639qO c6639qO = this.y;
                    ExecutorC5715lY0 executorC5715lY0 = this.h;
                    ScheduledFuture scheduledFuture = this.C;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.C = QR1.h().schedule(new RunnableC3529eA(executorC5715lY0, 18, c6639qO), 1000L, TimeUnit.MILLISECONDS);
                }
                this.e.signalEndOfInputStream();
                this.B = true;
            } catch (MediaCodec.CodecException e) {
                b(1, e.getMessage(), e);
            }
        }
    }

    public final void k() {
        this.q.getClass();
        this.h.execute(new RunnableC4144hO(this, C5806m12.h(), 1));
    }

    public final void l(Runnable runnable) {
        String str = this.a;
        AbstractC0759Jm0.f(str);
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = this.n;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC1500Sz1.l(((WN) it.next()).e));
        }
        HashSet hashSet2 = this.m;
        Iterator it2 = hashSet2.iterator();
        while (it2.hasNext()) {
            arrayList.add(AbstractC1500Sz1.l(((C7736w80) it2.next()).d));
        }
        if (!arrayList.isEmpty()) {
            hashSet.size();
            hashSet2.size();
            AbstractC0759Jm0.f(str);
        }
        AbstractC1500Sz1.q(arrayList).d(new RunnableC1557Ts1(this, arrayList, runnable), this.h);
    }
}
