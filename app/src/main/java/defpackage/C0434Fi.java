package defpackage;

import com.reactnativecommunity.clipboard.ClipboardModule;
import java.util.List;

/* renamed from: Fi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0434Fi implements WR {
    public final /* synthetic */ int a;
    public final K11 b;

    public C0434Fi(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new K11(35152, 2, ClipboardModule.MIMETYPE_PNG);
                break;
            default:
                this.b = new K11(16973, 2, "image/bmp");
                break;
        }
    }

    @Override // defpackage.WR
    public final WR b() {
        int i = this.a;
        return this;
    }

    @Override // defpackage.WR
    public final int d(XR xr, SV sv) {
        switch (this.a) {
        }
        return this.b.d(xr, sv);
    }

    @Override // defpackage.WR
    public final boolean f(XR xr) {
        switch (this.a) {
        }
        return this.b.f(xr);
    }

    @Override // defpackage.WR
    public final void g(long j, long j2) {
        switch (this.a) {
            case 0:
                this.b.g(j, j2);
                break;
            default:
                this.b.g(j, j2);
                break;
        }
    }

    @Override // defpackage.WR
    public final List h() {
        switch (this.a) {
            case 0:
                N70 n70 = P70.b;
                break;
            default:
                N70 n702 = P70.b;
                break;
        }
        return C3769fQ0.e;
    }

    @Override // defpackage.WR
    public final void l(YR yr) {
        switch (this.a) {
            case 0:
                this.b.l(yr);
                break;
            default:
                this.b.l(yr);
                break;
        }
    }

    @Override // defpackage.WR
    public final void release() {
        int i = this.a;
    }

    private final void a() {
    }

    private final void c() {
    }
}
