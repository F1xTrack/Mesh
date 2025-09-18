package p000;

import java.util.ArrayList;

/* renamed from: h20 */
/* loaded from: classes.dex */
public final class C9573h20 extends C3960dy {

    /* renamed from: d0 */
    public float f28169d0 = -1.0f;

    /* renamed from: e0 */
    public int f28170e0 = -1;

    /* renamed from: f0 */
    public int f28171f0 = -1;

    /* renamed from: g0 */
    public C0627Jx f28172g0 = this.f26455y;

    /* renamed from: h0 */
    public int f28173h0 = 0;

    public C9573h20() {
        this.f26408G.clear();
        this.f26408G.add(this.f28172g0);
        int length = this.f26407F.length;
        for (int i = 0; i < length; i++) {
            this.f26407F[i] = this.f28172g0;
        }
    }

    @Override // p000.C3960dy
    /* renamed from: A */
    public final void mo17779A(C9016cj0 c9016cj0) {
        if (this.f26410I == null) {
            return;
        }
        C0627Jx c0627Jx = this.f28172g0;
        c9016cj0.getClass();
        int iM10834m = C9016cj0.m10834m(c0627Jx);
        if (this.f28173h0 == 1) {
            this.f26415N = iM10834m;
            this.f26416O = 0;
            m17799v(this.f26410I.m17786i());
            m17802y(0);
            return;
        }
        this.f26415N = 0;
        this.f26416O = iM10834m;
        m17802y(this.f26410I.m17789l());
        m17799v(0);
    }

    /* renamed from: B */
    public final void m18700B(int i) {
        if (this.f28173h0 == i) {
            return;
        }
        this.f28173h0 = i;
        ArrayList arrayList = this.f26408G;
        arrayList.clear();
        if (this.f28173h0 == 1) {
            this.f28172g0 = this.f26454x;
        } else {
            this.f28172g0 = this.f26455y;
        }
        arrayList.add(this.f28172g0);
        C0627Jx[] c0627JxArr = this.f26407F;
        int length = c0627JxArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            c0627JxArr[i2] = this.f28172g0;
        }
    }

    @Override // p000.C3960dy
    /* renamed from: a */
    public final void mo4383a(C9016cj0 c9016cj0) {
        C4023ey c4023ey = (C4023ey) this.f26410I;
        if (c4023ey == null) {
            return;
        }
        C0627Jx c0627JxMo17784g = c4023ey.mo17784g(2);
        C0627Jx c0627JxMo17784g2 = c4023ey.mo17784g(4);
        C3960dy c3960dy = this.f26410I;
        boolean z = c3960dy != null && c3960dy.f26433c0[0] == 2;
        if (this.f28173h0 == 0) {
            c0627JxMo17784g = c4023ey.mo17784g(3);
            c0627JxMo17784g2 = c4023ey.mo17784g(5);
            C3960dy c3960dy2 = this.f26410I;
            z = c3960dy2 != null && c3960dy2.f26433c0[1] == 2;
        }
        if (this.f28170e0 != -1) {
            P21 p21M10844j = c9016cj0.m10844j(this.f28172g0);
            c9016cj0.m10839e(p21M10844j, c9016cj0.m10844j(c0627JxMo17784g), this.f28170e0, 8);
            if (z) {
                c9016cj0.m10840f(c9016cj0.m10844j(c0627JxMo17784g2), p21M10844j, 0, 5);
                return;
            }
            return;
        }
        if (this.f28171f0 != -1) {
            P21 p21M10844j2 = c9016cj0.m10844j(this.f28172g0);
            P21 p21M10844j3 = c9016cj0.m10844j(c0627JxMo17784g2);
            c9016cj0.m10839e(p21M10844j2, p21M10844j3, -this.f28171f0, 8);
            if (z) {
                c9016cj0.m10840f(p21M10844j2, c9016cj0.m10844j(c0627JxMo17784g), 0, 5);
                c9016cj0.m10840f(p21M10844j3, p21M10844j2, 0, 5);
                return;
            }
            return;
        }
        if (this.f28169d0 != -1.0f) {
            P21 p21M10844j4 = c9016cj0.m10844j(this.f28172g0);
            P21 p21M10844j5 = c9016cj0.m10844j(c0627JxMo17784g2);
            float f = this.f28169d0;
            C0072B8 c0072b8M10845k = c9016cj0.m10845k();
            c0072b8M10845k.f583d.mo76k(p21M10844j4, -1.0f);
            c0072b8M10845k.f583d.mo76k(p21M10844j5, f);
            c9016cj0.m10837c(c0072b8M10845k);
        }
    }

    @Override // p000.C3960dy
    /* renamed from: b */
    public final boolean mo4384b() {
        return true;
    }

    @Override // p000.C3960dy
    /* renamed from: g */
    public final C0627Jx mo17784g(int i) {
        switch (AbstractC7222ym.m26247x(i)) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
            case 3:
                if (this.f28173h0 == 1) {
                    return this.f28172g0;
                }
                break;
            case 2:
            case 4:
                if (this.f28173h0 == 0) {
                    return this.f28172g0;
                }
                break;
        }
        throw new AssertionError(AbstractC1374Vq.m8600s(i));
    }
}
