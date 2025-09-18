package defpackage;

import com.reactnativecommunity.clipboard.ClipboardModule;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;

/* renamed from: lf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5735lf implements WR {
    public final /* synthetic */ int a;
    public final C4103hA0 b;
    public final K11 c;

    public C5735lf(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new C4103hA0(4);
                this.c = new K11(-1, -1, ClipboardModule.MIMETYPE_HEIF);
                break;
            case 2:
                this.b = new C4103hA0(4);
                this.c = new K11(-1, -1, ClipboardModule.MIMETYPE_WEBP);
                break;
            default:
                this.b = new C4103hA0(4);
                this.c = new K11(-1, -1, "image/avif");
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
        return this.c.d(xr, sv);
    }

    @Override // defpackage.WR
    public final boolean f(XR xr) throws EOFException, InterruptedIOException {
        switch (this.a) {
            case 0:
                C7566vF c7566vF = (C7566vF) xr;
                c7566vF.a(4, false);
                C4103hA0 c4103hA0 = this.b;
                c4103hA0.D(4);
                c7566vF.f(c4103hA0.a, 0, 4, false);
                if (c4103hA0.w() == 1718909296) {
                    c4103hA0.D(4);
                    c7566vF.f(c4103hA0.a, 0, 4, false);
                    if (c4103hA0.w() == 1635150182) {
                    }
                }
                break;
            case 1:
                C7566vF c7566vF2 = (C7566vF) xr;
                c7566vF2.a(4, false);
                C4103hA0 c4103hA02 = this.b;
                c4103hA02.D(4);
                c7566vF2.f(c4103hA02.a, 0, 4, false);
                if (c4103hA02.w() == 1718909296) {
                    c4103hA02.D(4);
                    c7566vF2.f(c4103hA02.a, 0, 4, false);
                    if (c4103hA02.w() == 1751476579) {
                    }
                }
                break;
            default:
                C4103hA0 c4103hA03 = this.b;
                c4103hA03.D(4);
                C7566vF c7566vF3 = (C7566vF) xr;
                c7566vF3.f(c4103hA03.a, 0, 4, false);
                if (c4103hA03.w() == 1380533830) {
                    c7566vF3.a(4, false);
                    c4103hA03.D(4);
                    c7566vF3.f(c4103hA03.a, 0, 4, false);
                    if (c4103hA03.w() == 1464156752) {
                    }
                }
                break;
        }
        return false;
    }

    @Override // defpackage.WR
    public final void g(long j, long j2) {
        switch (this.a) {
            case 0:
                this.c.g(j, j2);
                break;
            case 1:
                this.c.g(j, j2);
                break;
            default:
                this.c.g(j, j2);
                break;
        }
    }

    @Override // defpackage.WR
    public final List h() {
        switch (this.a) {
            case 0:
                N70 n70 = P70.b;
                break;
            case 1:
                N70 n702 = P70.b;
                break;
            default:
                N70 n703 = P70.b;
                break;
        }
        return C3769fQ0.e;
    }

    @Override // defpackage.WR
    public final void l(YR yr) {
        switch (this.a) {
            case 0:
                this.c.l(yr);
                break;
            case 1:
                this.c.l(yr);
                break;
            default:
                this.c.l(yr);
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

    private final void e() {
    }
}
