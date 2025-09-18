package defpackage;

import android.os.Build;
import androidx.camera.video.internal.compat.quirk.AudioTimestampFramePositionIncorrectQuirk;

/* renamed from: vj */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC7656vj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ C8036xj b;

    public /* synthetic */ RunnableC7656vj(C8036xj c8036xj, int i) {
        this.a = i;
        this.b = c8036xj;
    }

    private final void a() throws IllegalStateException {
        C8036xj c8036xj = this.b;
        c8036xj.k.set(false);
        C1033Na c1033Na = c8036xj.g;
        c1033Na.a();
        if (c1033Na.d.getAndSet(false)) {
            c1033Na.a.stop();
            if (c1033Na.a.getRecordingState() != 1) {
                c1033Na.a.getRecordingState();
                AbstractC0759Jm0.f("AudioStreamImpl");
            }
            if (AbstractC7387uJ.a.z0(AudioTimestampFramePositionIncorrectQuirk.class) != null) {
                c1033Na.a.release();
                c1033Na.a = C1033Na.b(c1033Na.f, c1033Na.b, null);
            }
        }
        synchronized (c8036xj.e) {
            c8036xj.f = null;
            c8036xj.c.clear();
        }
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalStateException {
        C0955Ma c0955Ma;
        switch (this.a) {
            case 0:
                a();
                return;
            case 1:
                C8036xj c8036xj = this.b;
                c8036xj.getClass();
                try {
                    c8036xj.g.d();
                    if (c8036xj.k.getAndSet(true)) {
                        return;
                    }
                    c8036xj.b();
                    return;
                } catch (C0800Ka e) {
                    throw new RuntimeException(e);
                }
            case 2:
                this.b.b();
                return;
            default:
                C8036xj c8036xj2 = this.b;
                c8036xj2.k.set(false);
                C1033Na c1033Na = c8036xj2.g;
                if (!c1033Na.c.getAndSet(true)) {
                    if (Build.VERSION.SDK_INT >= 29 && (c0955Ma = c1033Na.k) != null) {
                        U5.d(c1033Na.a, c0955Ma);
                    }
                    c1033Na.a.release();
                }
                synchronized (c8036xj2.e) {
                    c8036xj2.f = null;
                    c8036xj2.c.clear();
                }
                return;
        }
    }
}
