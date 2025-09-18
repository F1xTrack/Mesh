package defpackage;

import android.media.MediaActionSound;

/* loaded from: classes.dex */
public final class WR0 {
    public final C1357Re a;
    public final C7737w81 b;
    public final C0599Hl c;
    public final C0599Hl d;
    public C0365El e;
    public C0365El f;
    public boolean g = false;
    public boolean h = false;
    public RunnableC3467dr i;

    public WR0(C1357Re c1357Re, C7737w81 c7737w81) {
        this.a = c1357Re;
        this.b = c7737w81;
        final int i = 0;
        this.c = AbstractC8171yQ1.b(new InterfaceC0443Fl(this) { // from class: VR0
            public final /* synthetic */ WR0 b;

            {
                this.b = this;
            }

            @Override // defpackage.InterfaceC0443Fl
            public final Object h0(C0365El c0365El) {
                switch (i) {
                    case 0:
                        this.b.e = c0365El;
                        return "CaptureCompleteFuture";
                    default:
                        this.b.f = c0365El;
                        return "RequestCompleteFuture";
                }
            }
        });
        final int i2 = 1;
        this.d = AbstractC8171yQ1.b(new InterfaceC0443Fl(this) { // from class: VR0
            public final /* synthetic */ WR0 b;

            {
                this.b = this;
            }

            @Override // defpackage.InterfaceC0443Fl
            public final Object h0(C0365El c0365El) {
                switch (i2) {
                    case 0:
                        this.b.e = c0365El;
                        return "CaptureCompleteFuture";
                    default:
                        this.b.f = c0365El;
                        return "RequestCompleteFuture";
                }
            }
        });
    }

    public final void a() {
        C1357Re c1357Re = this.a;
        boolean z = c1357Re.k;
        if (!z || c1357Re.a()) {
            if (!z) {
                AbstractC3377dM1.i(!this.d.b.isDone(), "The callback can only complete once.");
            }
            this.f.b(null);
        }
    }

    public final void b() {
        MediaActionSound mediaActionSound;
        DV1.a();
        if (this.g || this.h) {
            return;
        }
        this.h = true;
        C2226aw c2226aw = this.a.d;
        if (c2226aw != null) {
            if (c2226aw.c && (mediaActionSound = (MediaActionSound) c2226aw.b) != null) {
                mediaActionSound.play(0);
            }
            ((C4034gp) c2226aw.d).c(A01.b);
        }
    }
}
