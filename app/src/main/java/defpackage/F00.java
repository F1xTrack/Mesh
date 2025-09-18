package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class F00 implements InterfaceC7584vL {
    public final ColorDrawable a;
    public final Resources b;
    public NT0 c;
    public final C7036sT0 d;
    public final C6269oS e;
    public final C7810wX f;

    public F00(G00 g00) {
        ColorDrawable colorDrawable = new ColorDrawable(0);
        this.a = colorDrawable;
        AbstractC4368iZ.b();
        this.b = g00.a;
        this.c = g00.g;
        C7810wX c7810wX = new C7810wX(colorDrawable);
        this.f = c7810wX;
        Drawable[] drawableArr = new Drawable[7];
        drawableArr[0] = a(null);
        drawableArr[1] = a(g00.b);
        C7042sV0 c7042sV0 = g00.f;
        c7810wX.setColorFilter(null);
        drawableArr[2] = AbstractC5385jp1.e(c7810wX, c7042sV0);
        drawableArr[3] = a(g00.e);
        drawableArr[4] = a(g00.c);
        drawableArr[5] = a(g00.d);
        C6269oS c6269oS = new C6269oS(drawableArr);
        this.e = c6269oS;
        c6269oS.l = 300;
        if (c6269oS.k == 1) {
            c6269oS.k = 0;
        }
        C7036sT0 c7036sT0 = new C7036sT0(AbstractC5385jp1.d(c6269oS, this.c));
        c7036sT0.d = null;
        this.d = c7036sT0;
        c7036sT0.mutate();
        g();
        AbstractC4368iZ.b();
    }

    public final Drawable a(C7042sV0 c7042sV0) {
        return AbstractC5385jp1.e(AbstractC5385jp1.c(null, this.c, this.b), c7042sV0);
    }

    public final void b(int i) {
        if (i >= 0) {
            C6269oS c6269oS = this.e;
            c6269oS.k = 0;
            c6269oS.q[i] = true;
            c6269oS.invalidateSelf();
        }
    }

    public final void c() {
        d(1);
        d(2);
        d(3);
        d(4);
        d(5);
    }

    public final void d(int i) {
        if (i >= 0) {
            C6269oS c6269oS = this.e;
            c6269oS.k = 0;
            c6269oS.q[i] = false;
            c6269oS.invalidateSelf();
        }
    }

    public final InterfaceC5293jL e(int i) {
        C6269oS c6269oS = this.e;
        c6269oS.getClass();
        ML1.a(Boolean.valueOf(i >= 0));
        InterfaceC5293jL[] interfaceC5293jLArr = c6269oS.d;
        ML1.a(Boolean.valueOf(i < interfaceC5293jLArr.length));
        if (interfaceC5293jLArr[i] == null) {
            interfaceC5293jLArr[i] = new C6209o8(c6269oS, i);
        }
        InterfaceC5293jL interfaceC5293jL = interfaceC5293jLArr[i];
        interfaceC5293jL.p();
        return interfaceC5293jL.p() instanceof C6851rV0 ? (C6851rV0) interfaceC5293jL.p() : interfaceC5293jL;
    }

    public final C6851rV0 f(int i) {
        InterfaceC5293jL interfaceC5293jLE = e(i);
        if (interfaceC5293jLE instanceof C6851rV0) {
            return (C6851rV0) interfaceC5293jLE;
        }
        Drawable drawableE = AbstractC5385jp1.e(interfaceC5293jLE.k(AbstractC5385jp1.a), C7042sV0.g);
        interfaceC5293jLE.k(drawableE);
        ML1.d(drawableE, "Parent has no child drawable!");
        return (C6851rV0) drawableE;
    }

    public final void g() {
        C6269oS c6269oS = this.e;
        if (c6269oS != null) {
            c6269oS.r++;
            c6269oS.k = 0;
            Arrays.fill(c6269oS.q, true);
            c6269oS.invalidateSelf();
            c();
            b(1);
            c6269oS.b();
            c6269oS.a();
        }
    }

    public final void h(Drawable drawable, int i) {
        if (drawable == null) {
            this.e.d(null, i);
        } else {
            e(i).k(AbstractC5385jp1.c(drawable, this.c, this.b));
        }
    }

    public final void i(Drawable drawable, float f, boolean z) {
        Drawable drawableC = AbstractC5385jp1.c(drawable, this.c, this.b);
        drawableC.mutate();
        this.f.u(drawableC);
        C6269oS c6269oS = this.e;
        c6269oS.r++;
        c();
        b(2);
        j(f);
        if (z) {
            c6269oS.b();
        }
        c6269oS.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j(float f) {
        Drawable drawableC = this.e.c(3);
        if (drawableC == 0) {
            return;
        }
        if (f >= 0.999f) {
            if (drawableC instanceof Animatable) {
                ((Animatable) drawableC).stop();
            }
            d(3);
        } else {
            if (drawableC instanceof Animatable) {
                ((Animatable) drawableC).start();
            }
            b(3);
        }
        drawableC.setLevel(Math.round(f * 10000.0f));
    }
}
