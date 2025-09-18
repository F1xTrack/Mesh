package p000;

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

/* renamed from: sO */
/* loaded from: classes.dex */
public final class C6820sO implements InterfaceC3925dO {

    /* renamed from: E */
    public static final Range f42386E = Range.create(Long.MAX_VALUE, Long.MAX_VALUE);

    /* renamed from: C */
    public ScheduledFuture f42389C;

    /* renamed from: D */
    public int f42390D;

    /* renamed from: a */
    public final String f42391a;

    /* renamed from: c */
    public final boolean f42393c;

    /* renamed from: d */
    public final MediaFormat f42394d;

    /* renamed from: e */
    public final MediaCodec f42395e;

    /* renamed from: f */
    public final InterfaceC1661aO f42396f;

    /* renamed from: g */
    public final AbstractC1259U0 f42397g;

    /* renamed from: h */
    public final ExecutorC10151lY0 f42398h;

    /* renamed from: i */
    public final InterfaceFutureC7800Jj0 f42399i;

    /* renamed from: j */
    public final C0300El f42400j;

    /* renamed from: p */
    public final EnumC11690xa1 f42406p;

    /* renamed from: b */
    public final Object f42392b = new Object();

    /* renamed from: k */
    public final ArrayDeque f42401k = new ArrayDeque();

    /* renamed from: l */
    public final ArrayDeque f42402l = new ArrayDeque();

    /* renamed from: m */
    public final HashSet f42403m = new HashSet();

    /* renamed from: n */
    public final HashSet f42404n = new HashSet();

    /* renamed from: o */
    public final ArrayDeque f42405o = new ArrayDeque();

    /* renamed from: q */
    public final C10212m12 f42407q = new C10212m12(21);

    /* renamed from: r */
    public InterfaceC3987eO f42408r = InterfaceC3987eO.f26686r0;

    /* renamed from: s */
    public Executor f42409s = QR1.m6703a();

    /* renamed from: t */
    public Range f42410t = f42386E;

    /* renamed from: u */
    public long f42411u = 0;

    /* renamed from: v */
    public boolean f42412v = false;

    /* renamed from: w */
    public Long f42413w = null;

    /* renamed from: x */
    public ScheduledFuture f42414x = null;

    /* renamed from: y */
    public C6677qO f42415y = null;

    /* renamed from: z */
    public boolean f42416z = false;

    /* renamed from: A */
    public boolean f42387A = false;

    /* renamed from: B */
    public boolean f42388B = false;

    public C6820sO(Executor executor, InterfaceC4113gO interfaceC4113gO) throws IOException, U90 {
        executor.getClass();
        interfaceC4113gO.getClass();
        LruCache lruCache = AbstractC6203iu.f34795a;
        try {
            MediaCodec mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType(interfaceC4113gO.mo8528c());
            this.f42395e = mediaCodecCreateEncoderByType;
            MediaCodecInfo codecInfo = mediaCodecCreateEncoderByType.getCodecInfo();
            this.f42398h = new ExecutorC10151lY0(executor);
            MediaFormat mediaFormatMo8526a = interfaceC4113gO.mo8526a();
            this.f42394d = mediaFormatMo8526a;
            EnumC11690xa1 enumC11690xa1Mo8527b = interfaceC4113gO.mo8527b();
            this.f42406p = enumC11690xa1Mo8527b;
            if (interfaceC4113gO instanceof C6754rc) {
                this.f42391a = "AudioEncoder";
                this.f42393c = false;
                this.f42396f = new C6549oO(this);
                C4062fa c4062fa = new C4062fa(codecInfo, interfaceC4113gO.mo8528c());
                Objects.requireNonNull(((MediaCodecInfo.CodecCapabilities) c4062fa.f11615b).getAudioCapabilities());
                this.f42397g = c4062fa;
            } else {
                if (!(interfaceC4113gO instanceof C1362Ve)) {
                    throw new U90("Unknown encoder config type");
                }
                this.f42391a = "VideoEncoder";
                this.f42393c = true;
                this.f42396f = new C6740rO(this);
                C9017cj1 c9017cj1 = new C9017cj1(codecInfo, interfaceC4113gO.mo8528c());
                if (mediaFormatMo8526a.containsKey("bitrate")) {
                    int integer = mediaFormatMo8526a.getInteger("bitrate");
                    int iIntValue = ((Integer) c9017cj1.f17714c.getBitrateRange().clamp(Integer.valueOf(integer))).intValue();
                    if (integer != iIntValue) {
                        mediaFormatMo8526a.setInteger("bitrate", iIntValue);
                        AbstractC7806Jm0.m4412f("VideoEncoder");
                    }
                }
                this.f42397g = c9017cj1;
            }
            String str = this.f42391a;
            Objects.toString(enumC11690xa1Mo8527b);
            AbstractC7806Jm0.m4412f(str);
            String str2 = this.f42391a;
            Objects.toString(mediaFormatMo8526a);
            AbstractC7806Jm0.m4412f(str2);
            try {
                m24724h();
                AtomicReference atomicReference = new AtomicReference();
                this.f42399i = AbstractC8301Sz1.m7489l(AbstractC11797yQ1.m26149b(new C6698qj(atomicReference, 4)));
                C0300El c0300El = (C0300El) atomicReference.get();
                c0300El.getClass();
                this.f42400j = c0300El;
                m24725i(1);
            } catch (MediaCodec.CodecException e) {
                throw new U90(e);
            }
        } catch (IOException | IllegalArgumentException e2) {
            throw new U90(e2);
        }
    }

    /* renamed from: a */
    public final InterfaceFutureC7800Jj0 m24717a() {
        switch (AbstractC7222ym.m26247x(this.f42390D)) {
            case 0:
                return new F70(1, new IllegalStateException("Encoder is not started yet."));
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                AtomicReference atomicReference = new AtomicReference();
                C0489Hl c0489HlM26149b = AbstractC11797yQ1.m26149b(new C6698qj(atomicReference, 3));
                C0300El c0300El = (C0300El) atomicReference.get();
                c0300El.getClass();
                this.f42402l.offer(c0300El);
                c0300El.m2374a(new RunnableC3973eA(this, 19, c0300El), this.f42398h);
                m24719c();
                return c0489HlM26149b;
            case 7:
                return new F70(1, new IllegalStateException("Encoder is in error state."));
            case 8:
                return new F70(1, new IllegalStateException("Encoder is released."));
            default:
                throw new IllegalStateException("Unknown state: ".concat(AbstractC1374Vq.m8602u(this.f42390D)));
        }
    }

    /* renamed from: b */
    public final void m24718b(int i, String str, Throwable th) {
        switch (AbstractC7222ym.m26247x(this.f42390D)) {
            case 0:
                m24720d(i, str, th);
                m24724h();
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                m24725i(8);
                m24728l(new RunnableC6234jO(this, i, str, th));
                break;
            case 7:
                AbstractC7806Jm0.m4412f(this.f42391a);
                break;
        }
    }

    /* renamed from: c */
    public final void m24719c() {
        while (true) {
            ArrayDeque arrayDeque = this.f42402l;
            if (arrayDeque.isEmpty()) {
                return;
            }
            ArrayDeque arrayDeque2 = this.f42401k;
            if (arrayDeque2.isEmpty()) {
                return;
            }
            C0300El c0300El = (C0300El) arrayDeque.poll();
            Objects.requireNonNull(c0300El);
            Integer num = (Integer) arrayDeque2.poll();
            Objects.requireNonNull(num);
            try {
                C11506w80 c11506w80 = new C11506w80(this.f42395e, num.intValue());
                if (c0300El.m2375b(c11506w80)) {
                    this.f42403m.add(c11506w80);
                    AbstractC8301Sz1.m7489l(c11506w80.f44687d).mo2494d(new RunnableC3973eA(this, 20, c11506w80), this.f42398h);
                } else {
                    c11506w80.m25564a();
                }
            } catch (MediaCodec.CodecException e) {
                m24718b(1, e.getMessage(), e);
                return;
            }
        }
    }

    /* renamed from: d */
    public final void m24720d(int i, String str, Throwable th) {
        InterfaceC3987eO interfaceC3987eO;
        Executor executor;
        synchronized (this.f42392b) {
            interfaceC3987eO = this.f42408r;
            executor = this.f42409s;
        }
        try {
            executor.execute(new RunnableC8339Ts1(interfaceC3987eO, i, str, th));
        } catch (RejectedExecutionException unused) {
            AbstractC7806Jm0.m4412f(this.f42391a);
        }
    }

    /* renamed from: e */
    public final void m24721e() {
        this.f42407q.getClass();
        this.f42398h.execute(new RunnableC4176hO(this, C10212m12.m22629h(), 0));
    }

    /* renamed from: f */
    public final void m24722f() {
        Surface surface;
        HashSet hashSet;
        if (this.f42416z) {
            this.f42395e.stop();
            this.f42416z = false;
        }
        this.f42395e.release();
        InterfaceC1661aO interfaceC1661aO = this.f42396f;
        if (interfaceC1661aO instanceof C6740rO) {
            C6740rO c6740rO = (C6740rO) interfaceC1661aO;
            synchronized (c6740rO.f41635a) {
                surface = c6740rO.f41636b;
                c6740rO.f41636b = null;
                hashSet = new HashSet(c6740rO.f41637c);
                c6740rO.f41637c.clear();
            }
            if (surface != null) {
                surface.release();
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((Surface) it.next()).release();
            }
        }
        m24725i(9);
        this.f42400j.m2375b(null);
    }

    /* renamed from: g */
    public final void m24723g() {
        Bundle bundle = new Bundle();
        bundle.putInt("request-sync", 0);
        this.f42395e.setParameters(bundle);
    }

    /* renamed from: h */
    public final void m24724h() {
        C4224i9 c4224i9;
        ExecutorC10151lY0 executorC10151lY0;
        this.f42410t = f42386E;
        this.f42411u = 0L;
        this.f42405o.clear();
        this.f42401k.clear();
        Iterator it = this.f42402l.iterator();
        while (it.hasNext()) {
            ((C0300El) it.next()).m2376c();
        }
        this.f42402l.clear();
        this.f42395e.reset();
        this.f42416z = false;
        this.f42387A = false;
        this.f42388B = false;
        this.f42412v = false;
        ScheduledFuture scheduledFuture = this.f42414x;
        Surface surfaceCreateInputSurface = null;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.f42414x = null;
        }
        ScheduledFuture scheduledFuture2 = this.f42389C;
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(false);
            this.f42389C = null;
        }
        C6677qO c6677qO = this.f42415y;
        if (c6677qO != null) {
            c6677qO.f40852j = true;
        }
        C6677qO c6677qO2 = new C6677qO(this);
        this.f42415y = c6677qO2;
        this.f42395e.setCallback(c6677qO2);
        this.f42395e.configure(this.f42394d, (Surface) null, (MediaCrypto) null, 1);
        InterfaceC1661aO interfaceC1661aO = this.f42396f;
        if (interfaceC1661aO instanceof C6740rO) {
            C6740rO c6740rO = (C6740rO) interfaceC1661aO;
            c6740rO.getClass();
            EncoderNotUsePersistentInputSurfaceQuirk encoderNotUsePersistentInputSurfaceQuirk = (EncoderNotUsePersistentInputSurfaceQuirk) AbstractC6941uJ.f43644a.m17864z0(EncoderNotUsePersistentInputSurfaceQuirk.class);
            synchronized (c6740rO.f41635a) {
                try {
                    if (encoderNotUsePersistentInputSurfaceQuirk == null) {
                        if (c6740rO.f41636b == null) {
                            surfaceCreateInputSurface = MediaCodec.createPersistentInputSurface();
                            c6740rO.f41636b = surfaceCreateInputSurface;
                        }
                        c6740rO.f41640f.f42395e.setInputSurface(c6740rO.f41636b);
                    } else {
                        Surface surface = c6740rO.f41636b;
                        if (surface != null) {
                            c6740rO.f41637c.add(surface);
                        }
                        surfaceCreateInputSurface = c6740rO.f41640f.f42395e.createInputSurface();
                        c6740rO.f41636b = surfaceCreateInputSurface;
                    }
                    c4224i9 = c6740rO.f41638d;
                    executorC10151lY0 = c6740rO.f41639e;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (surfaceCreateInputSurface == null || c4224i9 == null || executorC10151lY0 == null) {
                return;
            }
            try {
                executorC10151lY0.execute(new RunnableC3973eA(c4224i9, 28, surfaceCreateInputSurface));
            } catch (RejectedExecutionException unused) {
                AbstractC7806Jm0.m4412f(c6740rO.f41640f.f42391a);
            }
        }
    }

    /* renamed from: i */
    public final void m24725i(int i) {
        if (this.f42390D == i) {
            return;
        }
        AbstractC7806Jm0.m4412f(this.f42391a);
        this.f42390D = i;
    }

    /* renamed from: j */
    public final void m24726j() {
        AbstractC7806Jm0.m4412f(this.f42391a);
        InterfaceC1661aO interfaceC1661aO = this.f42396f;
        if (interfaceC1661aO instanceof C6549oO) {
            ((C6549oO) interfaceC1661aO).m23373b(false);
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f42403m.iterator();
            while (it.hasNext()) {
                arrayList.add(AbstractC8301Sz1.m7489l(((C11506w80) it.next()).f44687d));
            }
            AbstractC8301Sz1.m7494q(arrayList).mo2494d(new RunnableC4239iO(this, 0), this.f42398h);
            return;
        }
        if (interfaceC1661aO instanceof C6740rO) {
            try {
                if (AbstractC6941uJ.f43644a.m17864z0(SignalEosOutputBufferNotComeQuirk.class) != null) {
                    C6677qO c6677qO = this.f42415y;
                    ExecutorC10151lY0 executorC10151lY0 = this.f42398h;
                    ScheduledFuture scheduledFuture = this.f42389C;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.f42389C = QR1.m6710h().schedule(new RunnableC3973eA(executorC10151lY0, 18, c6677qO), 1000L, TimeUnit.MILLISECONDS);
                }
                this.f42395e.signalEndOfInputStream();
                this.f42388B = true;
            } catch (MediaCodec.CodecException e) {
                m24718b(1, e.getMessage(), e);
            }
        }
    }

    /* renamed from: k */
    public final void m24727k() {
        this.f42407q.getClass();
        this.f42398h.execute(new RunnableC4176hO(this, C10212m12.m22629h(), 1));
    }

    /* renamed from: l */
    public final void m24728l(Runnable runnable) {
        String str = this.f42391a;
        AbstractC7806Jm0.m4412f(str);
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = this.f42404n;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC8301Sz1.m7489l(((C1408WN) it.next()).f13152e));
        }
        HashSet hashSet2 = this.f42403m;
        Iterator it2 = hashSet2.iterator();
        while (it2.hasNext()) {
            arrayList.add(AbstractC8301Sz1.m7489l(((C11506w80) it2.next()).f44687d));
        }
        if (!arrayList.isEmpty()) {
            hashSet.size();
            hashSet2.size();
            AbstractC7806Jm0.m4412f(str);
        }
        AbstractC8301Sz1.m7494q(arrayList).mo2494d(new RunnableC8339Ts1(this, arrayList, runnable), this.f42398h);
    }
}
