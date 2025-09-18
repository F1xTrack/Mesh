package defpackage;

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

/* renamed from: qe, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6687qe implements AutoCloseable {
    public final C0481Fx1 a;
    public final AtomicBoolean b;
    public final AtomicReference c;
    public final AtomicReference d;
    public final AtomicReference e;
    public final AtomicBoolean f;
    public final C0743Jh g;
    public final BT h;
    public final ExecutorService i;
    public final C1387Ro j;
    public final boolean k;
    public final boolean l;
    public final long m;

    public C6687qe(BT bt, ExecutorService executorService, C1387Ro c1387Ro, boolean z, long j) {
        this.a = Build.VERSION.SDK_INT >= 30 ? new C0481Fx1(new C7495ut()) : new C0481Fx1(new C0474Fv0(9));
        this.b = new AtomicBoolean(false);
        this.c = new AtomicReference(null);
        this.d = new AtomicReference(null);
        this.e = new AtomicReference(new C6814rJ(5));
        this.f = new AtomicBoolean(false);
        this.g = new C0743Jh(Boolean.FALSE);
        this.h = bt;
        this.i = executorService;
        this.j = c1387Ro;
        this.k = z;
        this.l = true;
        this.m = j;
    }

    public final void a(Uri uri) {
        if (this.b.get()) {
            c((InterfaceC6556py) this.e.getAndSet(null), uri);
        }
    }

    public final void c(InterfaceC6556py interfaceC6556py, Uri uri) {
        if (interfaceC6556py != null) {
            ((InterfaceC7686vt) this.a.a).close();
            interfaceC6556py.b(uri);
        } else {
            throw new AssertionError("Recording " + this + " has already been finalized");
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        a(Uri.EMPTY);
    }

    public final void e(Context context) {
        if (this.b.getAndSet(true)) {
            throw new AssertionError("Recording " + this + " has already been initialized");
        }
        ((InterfaceC7686vt) this.a.a).m("finalizeRecording");
        this.c.set(new C2125aO0(this.h));
        if (this.k) {
            int i = Build.VERSION.SDK_INT;
            AtomicReference atomicReference = this.d;
            if (i >= 31) {
                atomicReference.set(new C2316bO0(this, context));
            } else {
                atomicReference.set(new C2506cO0(this));
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6687qe)) {
            return false;
        }
        C6687qe c6687qe = (C6687qe) obj;
        if (this.h.equals(c6687qe.h)) {
            ExecutorService executorService = c6687qe.i;
            ExecutorService executorService2 = this.i;
            if (executorService2 != null ? executorService2.equals(executorService) : executorService == null) {
                C1387Ro c1387Ro = c6687qe.j;
                C1387Ro c1387Ro2 = this.j;
                if (c1387Ro2 != null ? c1387Ro2.equals(c1387Ro) : c1387Ro == null) {
                    if (this.k == c6687qe.k && this.l == c6687qe.l && this.m == c6687qe.m) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final MediaMuxer f(int i, WN0 wn0) throws IOException {
        if (!this.b.get()) {
            throw new AssertionError("Recording " + this + " has not been initialized");
        }
        C2125aO0 c2125aO0 = (C2125aO0) this.c.getAndSet(null);
        if (c2125aO0 == null) {
            throw new AssertionError("One-time media muxer creation has already occurred for recording " + this);
        }
        try {
            return c2125aO0.a(i, wn0);
        } catch (RuntimeException e) {
            throw new IOException("Failed to create MediaMuxer by " + e, e);
        }
    }

    public final void finalize() throws Throwable {
        try {
            ((InterfaceC7686vt) this.a.a).a();
            InterfaceC6556py interfaceC6556py = (InterfaceC6556py) this.e.getAndSet(null);
            if (interfaceC6556py != null) {
                c(interfaceC6556py, Uri.EMPTY);
            }
        } finally {
            super.finalize();
        }
    }

    public final void g(AbstractC1062Nj1 abstractC1062Nj1) {
        int i;
        BT bt = abstractC1062Nj1.a;
        BT bt2 = this.h;
        if (!Objects.equals(bt, bt2)) {
            throw new AssertionError("Attempted to update event listener with event from incorrect recording [Recording: " + bt + ", Expected: " + bt2 + "]");
        }
        "Sending VideoRecordEvent ".concat(abstractC1062Nj1.getClass().getSimpleName());
        boolean z = abstractC1062Nj1 instanceof C0673Ij1;
        if (z && (i = ((C0673Ij1) abstractC1062Nj1).d) != 0) {
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
        AbstractC0759Jm0.f("Recorder");
        boolean z2 = abstractC1062Nj1 instanceof C0907Lj1;
        C0743Jh c0743Jh = this.g;
        if (z2 || (abstractC1062Nj1 instanceof C0829Kj1)) {
            c0743Jh.e(Boolean.TRUE);
        } else if ((abstractC1062Nj1 instanceof C0751Jj1) || z) {
            c0743Jh.e(Boolean.FALSE);
        }
        ExecutorService executorService = this.i;
        if (executorService == null || this.j == null) {
            return;
        }
        try {
            executorService.execute(new MD0(this, 17, abstractC1062Nj1));
        } catch (RejectedExecutionException unused) {
            AbstractC0759Jm0.f("Recorder");
        }
    }

    public final int hashCode() {
        int iHashCode = (this.h.b.hashCode() ^ 1000003) * 1000003;
        ExecutorService executorService = this.i;
        int iHashCode2 = (iHashCode ^ (executorService == null ? 0 : executorService.hashCode())) * 1000003;
        C1387Ro c1387Ro = this.j;
        int iHashCode3 = (((iHashCode2 ^ (c1387Ro != null ? c1387Ro.hashCode() : 0)) * 1000003) ^ (this.k ? 1231 : 1237)) * 1000003;
        int i = this.l ? 1231 : 1237;
        long j = this.m;
        return ((iHashCode3 ^ i) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecordingRecord{getOutputOptions=");
        sb.append(this.h);
        sb.append(", getCallbackExecutor=");
        sb.append(this.i);
        sb.append(", getEventListener=");
        sb.append(this.j);
        sb.append(", hasAudioEnabled=");
        sb.append(this.k);
        sb.append(", isPersistent=");
        sb.append(this.l);
        sb.append(", getRecordingId=");
        return NX.i(sb, this.m, "}");
    }
}
