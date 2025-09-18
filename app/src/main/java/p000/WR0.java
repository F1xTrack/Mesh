package p000;

import android.media.MediaActionSound;

/* loaded from: classes.dex */
public final class WR0 {

    /* renamed from: a */
    public final C1110Re f13179a;

    /* renamed from: b */
    public final C11507w81 f13180b;

    /* renamed from: c */
    public final C0489Hl f13181c;

    /* renamed from: d */
    public final C0489Hl f13182d;

    /* renamed from: e */
    public C0300El f13183e;

    /* renamed from: f */
    public C0300El f13184f;

    /* renamed from: g */
    public boolean f13185g = false;

    /* renamed from: h */
    public boolean f13186h = false;

    /* renamed from: i */
    public RunnableC3953dr f13187i;

    public WR0(C1110Re c1110Re, C11507w81 c11507w81) {
        this.f13179a = c1110Re;
        this.f13180b = c11507w81;
        final int i = 0;
        this.f13181c = AbstractC11797yQ1.m26149b(new InterfaceC0363Fl(this) { // from class: VR0

            /* renamed from: b */
            public final /* synthetic */ WR0 f12566b;

            {
                this.f12566b = this;
            }

            @Override // p000.InterfaceC0363Fl
            /* renamed from: h0 */
            public final Object mo411h0(C0300El c0300El) {
                switch (i) {
                    case 0:
                        this.f12566b.f13183e = c0300El;
                        return "CaptureCompleteFuture";
                    default:
                        this.f12566b.f13184f = c0300El;
                        return "RequestCompleteFuture";
                }
            }
        });
        final int i2 = 1;
        this.f13182d = AbstractC11797yQ1.m26149b(new InterfaceC0363Fl(this) { // from class: VR0

            /* renamed from: b */
            public final /* synthetic */ WR0 f12566b;

            {
                this.f12566b = this;
            }

            @Override // p000.InterfaceC0363Fl
            /* renamed from: h0 */
            public final Object mo411h0(C0300El c0300El) {
                switch (i2) {
                    case 0:
                        this.f12566b.f13183e = c0300El;
                        return "CaptureCompleteFuture";
                    default:
                        this.f12566b.f13184f = c0300El;
                        return "RequestCompleteFuture";
                }
            }
        });
    }

    /* renamed from: a */
    public final void m8760a() {
        C1110Re c1110Re = this.f13179a;
        boolean z = c1110Re.f10357k;
        if (!z || c1110Re.m7052a()) {
            if (!z) {
                AbstractC9104dM1.m17550i(!this.f13182d.f4484b.isDone(), "The callback can only complete once.");
            }
            this.f13184f.m2375b(null);
        }
    }

    /* renamed from: b */
    public final void m8761b() {
        MediaActionSound mediaActionSound;
        DV1.m1716a();
        if (this.f13185g || this.f13186h) {
            return;
        }
        this.f13186h = true;
        C1753aw c1753aw = this.f13179a.f10350d;
        if (c1753aw != null) {
            if (c1753aw.f16683c && (mediaActionSound = (MediaActionSound) c1753aw.f16682b) != null) {
                mediaActionSound.play(0);
            }
            ((C4140gp) c1753aw.f16684d).m18650c(A01.f5b);
        }
    }
}
