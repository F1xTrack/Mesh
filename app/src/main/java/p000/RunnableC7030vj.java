package p000;

import android.os.Build;
import androidx.camera.video.internal.compat.quirk.AudioTimestampFramePositionIncorrectQuirk;

/* renamed from: vj */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC7030vj implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f44503a;

    /* renamed from: b */
    public final /* synthetic */ C7156xj f44504b;

    public /* synthetic */ RunnableC7030vj(C7156xj c7156xj, int i) {
        this.f44503a = i;
        this.f44504b = c7156xj;
    }

    /* renamed from: a */
    private final void m25477a() throws IllegalStateException {
        C7156xj c7156xj = this.f44504b;
        c7156xj.f45756k.set(false);
        C0855Na c0855Na = c7156xj.f45752g;
        c0855Na.m5780a();
        if (c0855Na.f7883d.getAndSet(false)) {
            c0855Na.f7880a.stop();
            if (c0855Na.f7880a.getRecordingState() != 1) {
                c0855Na.f7880a.getRecordingState();
                AbstractC7806Jm0.m4412f("AudioStreamImpl");
            }
            if (AbstractC6941uJ.f43644a.m17864z0(AudioTimestampFramePositionIncorrectQuirk.class) != null) {
                c0855Na.f7880a.release();
                c0855Na.f7880a = C0855Na.m5779b(c0855Na.f7885f, c0855Na.f7881b, null);
            }
        }
        synchronized (c7156xj.f45750e) {
            c7156xj.f45751f = null;
            c7156xj.f45748c.clear();
        }
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalStateException {
        C0792Ma c0792Ma;
        switch (this.f44503a) {
            case 0:
                m25477a();
                return;
            case 1:
                C7156xj c7156xj = this.f44504b;
                c7156xj.getClass();
                try {
                    c7156xj.f45752g.m5782d();
                    if (c7156xj.f45756k.getAndSet(true)) {
                        return;
                    }
                    c7156xj.m25930b();
                    return;
                } catch (C0667Ka e) {
                    throw new RuntimeException(e);
                }
            case 2:
                this.f44504b.m25930b();
                return;
            default:
                C7156xj c7156xj2 = this.f44504b;
                c7156xj2.f45756k.set(false);
                C0855Na c0855Na = c7156xj2.f45752g;
                if (!c0855Na.f7882c.getAndSet(true)) {
                    if (Build.VERSION.SDK_INT >= 29 && (c0792Ma = c0855Na.f7890k) != null) {
                        AbstractC1264U5.m7895d(c0855Na.f7880a, c0792Ma);
                    }
                    c0855Na.f7880a.release();
                }
                synchronized (c7156xj2.f45750e) {
                    c7156xj2.f45751f = null;
                    c7156xj2.f45748c.clear();
                }
                return;
        }
    }
}
