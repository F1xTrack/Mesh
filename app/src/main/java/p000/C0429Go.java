package p000;

/* renamed from: Go */
/* loaded from: classes.dex */
public final class C0429Go implements WS0 {

    /* renamed from: b */
    public final /* synthetic */ int f3905b;

    /* renamed from: c */
    public final WS0 f3906c;

    public C0429Go(long j, int i) {
        this.f3905b = i;
        switch (i) {
            case 1:
                this.f3906c = new C7679Ha1(j, new C0366Fo(j));
                break;
            default:
                this.f3906c = new C0429Go(j, 1);
                break;
        }
    }

    @Override // p000.WS0
    /* renamed from: a */
    public final long mo2782a() {
        switch (this.f3905b) {
            case 0:
                return ((C7679Ha1) ((C0429Go) this.f3906c).f3906c).f4354b;
            default:
                return ((C7679Ha1) this.f3906c).f4354b;
        }
    }

    @Override // p000.WS0
    /* renamed from: b */
    public final VS0 mo2783b(C0303Eo c0303Eo) {
        switch (this.f3905b) {
            case 0:
                if (((C7679Ha1) ((C0429Go) this.f3906c).f3906c).mo2783b(c0303Eo).f12583b) {
                    return VS0.f12580e;
                }
                Throwable th = (Throwable) c0303Eo.f2909c;
                if (th instanceof C1624Zo) {
                    AbstractC7806Jm0.m4412f("CameraX");
                    if (((C1624Zo) th).f15133a > 0) {
                        return VS0.f12581f;
                    }
                }
                return VS0.f12579d;
            default:
                return ((C7679Ha1) this.f3906c).mo2783b(c0303Eo);
        }
    }
}
