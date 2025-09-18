package p000;

import android.content.res.Resources;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class F00 implements InterfaceC7006vL {

    /* renamed from: a */
    public final ColorDrawable f3005a;

    /* renamed from: b */
    public final Resources f3006b;

    /* renamed from: c */
    public NT0 f3007c;

    /* renamed from: d */
    public final C11037sT0 f3008d;

    /* renamed from: e */
    public final C6553oS f3009e;

    /* renamed from: f */
    public final C7081wX f3010f;

    public F00(G00 g00) {
        ColorDrawable colorDrawable = new ColorDrawable(0);
        this.f3005a = colorDrawable;
        AbstractC4250iZ.m19063b();
        this.f3006b = g00.f3517a;
        this.f3007c = g00.f3523g;
        C7081wX c7081wX = new C7081wX(colorDrawable);
        this.f3010f = c7081wX;
        Drawable[] drawableArr = new Drawable[7];
        drawableArr[0] = m2472a(null);
        drawableArr[1] = m2472a(g00.f3518b);
        C11041sV0 c11041sV0 = g00.f3522f;
        c7081wX.setColorFilter(null);
        drawableArr[2] = AbstractC9930jp1.m22113e(c7081wX, c11041sV0);
        drawableArr[3] = m2472a(g00.f3521e);
        drawableArr[4] = m2472a(g00.f3519c);
        drawableArr[5] = m2472a(g00.f3520d);
        C6553oS c6553oS = new C6553oS(drawableArr);
        this.f3009e = c6553oS;
        c6553oS.f39011l = 300;
        if (c6553oS.f39010k == 1) {
            c6553oS.f39010k = 0;
        }
        C11037sT0 c11037sT0 = new C11037sT0(AbstractC9930jp1.m22112d(c6553oS, this.f3007c));
        c11037sT0.f42445d = null;
        this.f3008d = c11037sT0;
        c11037sT0.mutate();
        m2478g();
        AbstractC4250iZ.m19063b();
    }

    /* renamed from: a */
    public final Drawable m2472a(C11041sV0 c11041sV0) {
        return AbstractC9930jp1.m22113e(AbstractC9930jp1.m22111c(null, this.f3007c, this.f3006b), c11041sV0);
    }

    /* renamed from: b */
    public final void m2473b(int i) {
        if (i >= 0) {
            C6553oS c6553oS = this.f3009e;
            c6553oS.f39010k = 0;
            c6553oS.f39016q[i] = true;
            c6553oS.invalidateSelf();
        }
    }

    /* renamed from: c */
    public final void m2474c() {
        m2475d(1);
        m2475d(2);
        m2475d(3);
        m2475d(4);
        m2475d(5);
    }

    /* renamed from: d */
    public final void m2475d(int i) {
        if (i >= 0) {
            C6553oS c6553oS = this.f3009e;
            c6553oS.f39010k = 0;
            c6553oS.f39016q[i] = false;
            c6553oS.invalidateSelf();
        }
    }

    /* renamed from: e */
    public final InterfaceC6231jL m2476e(int i) {
        C6553oS c6553oS = this.f3009e;
        c6553oS.getClass();
        ML1.m5334a(Boolean.valueOf(i >= 0));
        InterfaceC6231jL[] interfaceC6231jLArr = c6553oS.f39003d;
        ML1.m5334a(Boolean.valueOf(i < interfaceC6231jLArr.length));
        if (interfaceC6231jLArr[i] == null) {
            interfaceC6231jLArr[i] = new C6533o8(c6553oS, i);
        }
        InterfaceC6231jL interfaceC6231jL = interfaceC6231jLArr[i];
        interfaceC6231jL.mo22024p();
        return interfaceC6231jL.mo22024p() instanceof C10913rV0 ? (C10913rV0) interfaceC6231jL.mo22024p() : interfaceC6231jL;
    }

    /* renamed from: f */
    public final C10913rV0 m2477f(int i) {
        InterfaceC6231jL interfaceC6231jLM2476e = m2476e(i);
        if (interfaceC6231jLM2476e instanceof C10913rV0) {
            return (C10913rV0) interfaceC6231jLM2476e;
        }
        Drawable drawableM22113e = AbstractC9930jp1.m22113e(interfaceC6231jLM2476e.mo22023k(AbstractC9930jp1.f35416a), C11041sV0.f42464g);
        interfaceC6231jLM2476e.mo22023k(drawableM22113e);
        ML1.m5337d(drawableM22113e, "Parent has no child drawable!");
        return (C10913rV0) drawableM22113e;
    }

    /* renamed from: g */
    public final void m2478g() {
        C6553oS c6553oS = this.f3009e;
        if (c6553oS != null) {
            c6553oS.f39017r++;
            c6553oS.f39010k = 0;
            Arrays.fill(c6553oS.f39016q, true);
            c6553oS.invalidateSelf();
            m2474c();
            m2473b(1);
            c6553oS.m23406b();
            c6553oS.m23405a();
        }
    }

    /* renamed from: h */
    public final void m2479h(Drawable drawable, int i) {
        if (drawable == null) {
            this.f3009e.m23408d(null, i);
        } else {
            m2476e(i).mo22023k(AbstractC9930jp1.m22111c(drawable, this.f3007c, this.f3006b));
        }
    }

    /* renamed from: i */
    public final void m2480i(Drawable drawable, float f, boolean z) {
        Drawable drawableM22111c = AbstractC9930jp1.m22111c(drawable, this.f3007c, this.f3006b);
        drawableM22111c.mutate();
        this.f3010f.mo24392u(drawableM22111c);
        C6553oS c6553oS = this.f3009e;
        c6553oS.f39017r++;
        m2474c();
        m2473b(2);
        m2481j(f);
        if (z) {
            c6553oS.m23406b();
        }
        c6553oS.m23405a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: j */
    public final void m2481j(float f) {
        Drawable drawableM23407c = this.f3009e.m23407c(3);
        if (drawableM23407c == 0) {
            return;
        }
        if (f >= 0.999f) {
            if (drawableM23407c instanceof Animatable) {
                ((Animatable) drawableM23407c).stop();
            }
            m2475d(3);
        } else {
            if (drawableM23407c instanceof Animatable) {
                ((Animatable) drawableM23407c).start();
            }
            m2473b(3);
        }
        drawableM23407c.setLevel(Math.round(f * 10000.0f));
    }
}
