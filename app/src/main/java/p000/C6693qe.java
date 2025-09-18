package p000;

import android.content.Context;
import android.media.MediaMuxer;
import android.net.Uri;
import android.os.Build;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: qe */
/* loaded from: classes.dex */
public final class C6693qe implements AutoCloseable {

    /* renamed from: a */
    public final C7621Fx1 f41077a;

    /* renamed from: b */
    public final AtomicBoolean f41078b;

    /* renamed from: c */
    public final AtomicReference f41079c;

    /* renamed from: d */
    public final AtomicReference f41080d;

    /* renamed from: e */
    public final AtomicReference f41081e;

    /* renamed from: f */
    public final AtomicBoolean f41082f;

    /* renamed from: g */
    public final C0611Jh f41083g;

    /* renamed from: h */
    public final C0093BT f41084h;

    /* renamed from: i */
    public final ExecutorService f41085i;

    /* renamed from: j */
    public final C1120Ro f41086j;

    /* renamed from: k */
    public final boolean f41087k;

    /* renamed from: l */
    public final boolean f41088l;

    /* renamed from: m */
    public final long f41089m;

    public C6693qe(C0093BT c0093bt, ExecutorService executorService, C1120Ro c1120Ro, boolean z, long j) {
        this.f41077a = Build.VERSION.SDK_INT >= 30 ? new C7621Fx1(new C6977ut()) : new C7621Fx1(new C7616Fv0(9));
        this.f41078b = new AtomicBoolean(false);
        this.f41079c = new AtomicReference(null);
        this.f41080d = new AtomicReference(null);
        this.f41081e = new AtomicReference(new C6735rJ(5));
        this.f41082f = new AtomicBoolean(false);
        this.f41083g = new C0611Jh(Boolean.FALSE);
        this.f41084h = c0093bt;
        this.f41085i = executorService;
        this.f41086j = c1120Ro;
        this.f41087k = z;
        this.f41088l = true;
        this.f41089m = j;
    }

    /* renamed from: a */
    public final void m24032a(Uri uri) {
        if (this.f41078b.get()) {
            m24033c((InterfaceC6650py) this.f41081e.getAndSet(null), uri);
        }
    }

    /* renamed from: c */
    public final void m24033c(InterfaceC6650py interfaceC6650py, Uri uri) {
        if (interfaceC6650py != null) {
            ((InterfaceC7040vt) this.f41077a.f3494a).close();
            interfaceC6650py.mo3020b(uri);
        } else {
            throw new AssertionError("Recording " + this + " has already been finalized");
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        m24032a(Uri.EMPTY);
    }

    /* renamed from: e */
    public final void m24034e(Context context) {
        if (this.f41078b.getAndSet(true)) {
            throw new AssertionError("Recording " + this + " has already been initialized");
        }
        ((InterfaceC7040vt) this.f41077a.f3494a).mo2832m("finalizeRecording");
        this.f41079c.set(new C8718aO0(this.f41084h));
        if (this.f41087k) {
            int i = Build.VERSION.SDK_INT;
            AtomicReference atomicReference = this.f41080d;
            if (i >= 31) {
                atomicReference.set(new C8846bO0(this, context));
            } else {
                atomicReference.set(new C8974cO0(this));
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6693qe)) {
            return false;
        }
        C6693qe c6693qe = (C6693qe) obj;
        if (this.f41084h.equals(c6693qe.f41084h)) {
            ExecutorService executorService = c6693qe.f41085i;
            ExecutorService executorService2 = this.f41085i;
            if (executorService2 != null ? executorService2.equals(executorService) : executorService == null) {
                C1120Ro c1120Ro = c6693qe.f41086j;
                C1120Ro c1120Ro2 = this.f41086j;
                if (c1120Ro2 != null ? c1120Ro2.equals(c1120Ro) : c1120Ro == null) {
                    if (this.f41087k == c6693qe.f41087k && this.f41088l == c6693qe.f41088l && this.f41089m == c6693qe.f41089m) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public final MediaMuxer m24035f(int i, WN0 wn0) throws IOException {
        if (!this.f41078b.get()) {
            throw new AssertionError("Recording " + this + " has not been initialized");
        }
        C8718aO0 c8718aO0 = (C8718aO0) this.f41079c.getAndSet(null);
        if (c8718aO0 == null) {
            throw new AssertionError("One-time media muxer creation has already occurred for recording " + this);
        }
        try {
            return c8718aO0.m9727a(i, wn0);
        } catch (RuntimeException e) {
            throw new IOException("Failed to create MediaMuxer by " + e, e);
        }
    }

    public final void finalize() throws Throwable {
        try {
            ((InterfaceC7040vt) this.f41077a.f3494a).mo2826a();
            InterfaceC6650py interfaceC6650py = (InterfaceC6650py) this.f41081e.getAndSet(null);
            if (interfaceC6650py != null) {
                m24033c(interfaceC6650py, Uri.EMPTY);
            }
        } finally {
            super.finalize();
        }
    }

    /* renamed from: g */
    public final void m24036g(AbstractC8009Nj1 abstractC8009Nj1) {
        int i;
        C0093BT c0093bt = abstractC8009Nj1.f7975a;
        C0093BT c0093bt2 = this.f41084h;
        if (!Objects.equals(c0093bt, c0093bt2)) {
            throw new AssertionError("Attempted to update event listener with event from incorrect recording [Recording: " + c0093bt + ", Expected: " + c0093bt2 + "]");
        }
        "Sending VideoRecordEvent ".concat(abstractC8009Nj1.getClass().getSimpleName());
        boolean z = abstractC8009Nj1 instanceof C7749Ij1;
        if (z && (i = ((C7749Ij1) abstractC8009Nj1).f5114d) != 0) {
            switch (i) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    break;
                default:
                    StringBuilder sb = new StringBuilder("Unknown(");
                    sb.append(i);
                    sb.append(")");
                    break;
            }
        }
        AbstractC7806Jm0.m4412f("Recorder");
        boolean z2 = abstractC8009Nj1 instanceof C7905Lj1;
        C0611Jh c0611Jh = this.f41083g;
        if (z2 || (abstractC8009Nj1 instanceof C7853Kj1)) {
            c0611Jh.m4389e(Boolean.TRUE);
        } else if ((abstractC8009Nj1 instanceof C7801Jj1) || z) {
            c0611Jh.m4389e(Boolean.FALSE);
        }
        ExecutorService executorService = this.f41085i;
        if (executorService == null || this.f41086j == null) {
            return;
        }
        try {
            executorService.execute(new MD0(this, 17, abstractC8009Nj1));
        } catch (RejectedExecutionException unused) {
            AbstractC7806Jm0.m4412f("Recorder");
        }
    }

    public final int hashCode() {
        int iHashCode = (this.f41084h.f829b.hashCode() ^ 1000003) * 1000003;
        ExecutorService executorService = this.f41085i;
        int iHashCode2 = (iHashCode ^ (executorService == null ? 0 : executorService.hashCode())) * 1000003;
        C1120Ro c1120Ro = this.f41086j;
        int iHashCode3 = (((iHashCode2 ^ (c1120Ro != null ? c1120Ro.hashCode() : 0)) * 1000003) ^ (this.f41087k ? 1231 : 1237)) * 1000003;
        int i = this.f41088l ? 1231 : 1237;
        long j = this.f41089m;
        return ((iHashCode3 ^ i) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecordingRecord{getOutputOptions=");
        sb.append(this.f41084h);
        sb.append(", getCallbackExecutor=");
        sb.append(this.f41085i);
        sb.append(", getEventListener=");
        sb.append(this.f41086j);
        sb.append(", hasAudioEnabled=");
        sb.append(this.f41087k);
        sb.append(", isPersistent=");
        sb.append(this.f41088l);
        sb.append(", getRecordingId=");
        return AbstractC0852NX.m5760i(sb, this.f41089m, "}");
    }
}
