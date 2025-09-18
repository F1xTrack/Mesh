package defpackage;

/* renamed from: Go */
/* loaded from: classes.dex */
public final class C0530Go implements WS0 {
    public final /* synthetic */ int b;
    public final WS0 c;

    public C0530Go(long j, int i) {
        this.b = i;
        switch (i) {
            case 1:
                this.c = new C0568Ha1(j, new C0452Fo(j));
                break;
            default:
                this.c = new C0530Go(j, 1);
                break;
        }
    }

    @Override // defpackage.WS0
    public final long a() {
        switch (this.b) {
            case 0:
                return ((C0568Ha1) ((C0530Go) this.c).c).b;
            default:
                return ((C0568Ha1) this.c).b;
        }
    }

    @Override // defpackage.WS0
    public final VS0 b(C0374Eo c0374Eo) {
        switch (this.b) {
            case 0:
                if (((C0568Ha1) ((C0530Go) this.c).c).b(c0374Eo).b) {
                    return VS0.e;
                }
                Throwable th = (Throwable) c0374Eo.c;
                if (th instanceof C2011Zo) {
                    AbstractC0759Jm0.f("CameraX");
                    if (((C2011Zo) th).a > 0) {
                        return VS0.f;
                    }
                }
                return VS0.d;
            default:
                return ((C0568Ha1) this.c).b(c0374Eo);
        }
    }
}
