package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import android.widget.TextView;
import java.util.ArrayList;

/* renamed from: p6 */
/* loaded from: classes.dex */
public final class C6394p6 {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public boolean d;
    public boolean e;
    public boolean f;
    public Object g;

    public /* synthetic */ C6394p6(TextView textView, int i) {
        this.a = i;
        this.b = null;
        this.c = null;
        this.d = false;
        this.e = false;
        this.g = textView;
    }

    public void a() {
        CompoundButton compoundButton = (CompoundButton) this.g;
        Drawable drawableA = AbstractC5595kw.a(compoundButton);
        if (drawableA != null) {
            if (this.d || this.e) {
                Drawable drawableMutate = drawableA.mutate();
                if (this.d) {
                    AbstractC4135hL.h(drawableMutate, (ColorStateList) this.b);
                }
                if (this.e) {
                    AbstractC4135hL.i(drawableMutate, (PorterDuff.Mode) this.c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(drawableMutate);
            }
        }
    }

    public void b() {
        C6203o6 c6203o6 = (C6203o6) this.g;
        Drawable checkMarkDrawable = c6203o6.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.d || this.e) {
                Drawable drawableMutate = checkMarkDrawable.mutate();
                if (this.d) {
                    AbstractC4135hL.h(drawableMutate, (ColorStateList) this.b);
                }
                if (this.e) {
                    AbstractC4135hL.i(drawableMutate, (PorterDuff.Mode) this.c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(c6203o6.getDrawableState());
                }
                c6203o6.setCheckMarkDrawable(drawableMutate);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c() {
        /*
            Method dump skipped, instructions count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6394p6.c():void");
    }

    public void d() {
        if (this.e && this.f) {
            c();
        } else {
            e();
        }
    }

    public void e() {
        if (this.d) {
            C7393uL c7393uL = (C7393uL) this.c;
            EnumC7202tL enumC7202tL = EnumC7202tL.h;
            c7393uL.a(enumC7202tL);
            this.d = false;
            if (g()) {
                L l = (L) ((InterfaceC7011sL) this.b);
                l.getClass();
                AbstractC4368iZ.b();
                if (AbstractC3393dS.a.o(2)) {
                    AbstractC3393dS.k(L.s, "controller %x %s: onDetach", Integer.valueOf(System.identityHashCode(l)), l.h);
                }
                l.a.a(enumC7202tL);
                l.j = false;
                C6045nH c6045nH = l.b;
                c6045nH.getClass();
                if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                    synchronized (c6045nH.a) {
                        try {
                            if (!((ArrayList) c6045nH.c).contains(l)) {
                                ((ArrayList) c6045nH.c).add(l);
                                boolean z = ((ArrayList) c6045nH.c).size() == 1;
                                if (z) {
                                    ((Handler) c6045nH.b).post((GR0) c6045nH.e);
                                }
                            }
                        } finally {
                        }
                    }
                } else {
                    l.m();
                }
                AbstractC4368iZ.b();
            }
        }
    }

    public C7036sT0 f() {
        InterfaceC7584vL interfaceC7584vL = (InterfaceC7584vL) this.g;
        if (interfaceC7584vL == null) {
            return null;
        }
        return ((F00) interfaceC7584vL).d;
    }

    public boolean g() {
        InterfaceC7011sL interfaceC7011sL = (InterfaceC7011sL) this.b;
        return interfaceC7011sL != null && ((L) interfaceC7011sL).f == ((InterfaceC7584vL) this.g);
    }

    public void h(AttributeSet attributeSet, int i) {
        int resourceId;
        int resourceId2;
        CompoundButton compoundButton = (CompoundButton) this.g;
        Context context = compoundButton.getContext();
        int[] iArr = AbstractC2104aH0.m;
        C1857Xo1 c1857Xo1J = C1857Xo1.J(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) c1857Xo1J.c;
        AbstractC6897rk1.m(compoundButton, compoundButton.getContext(), iArr, attributeSet, (TypedArray) c1857Xo1J.c, i, 0);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(AbstractC8352zN1.b(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                compoundButton.setButtonDrawable(AbstractC8352zN1.b(compoundButton.getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                AbstractC5404jw.c(compoundButton, c1857Xo1J.B(2));
            }
            if (typedArray.hasValue(3)) {
                AbstractC5404jw.d(compoundButton, AbstractC6820rL.c(typedArray.getInt(3, -1), null));
            }
        } finally {
            c1857Xo1J.M();
        }
    }

    public void i(boolean z) {
        if (this.f == z) {
            return;
        }
        ((C7393uL) this.c).a(z ? EnumC7202tL.q : EnumC7202tL.r);
        this.f = z;
        d();
    }

    public void j(InterfaceC7011sL interfaceC7011sL) {
        boolean z = this.d;
        if (z) {
            e();
        }
        boolean zG = g();
        C7393uL c7393uL = (C7393uL) this.c;
        if (zG) {
            c7393uL.a(EnumC7202tL.d);
            ((C4297iB0) ((InterfaceC7011sL) this.b)).r(null);
        }
        this.b = interfaceC7011sL;
        if (interfaceC7011sL != null) {
            c7393uL.a(EnumC7202tL.c);
            ((C4297iB0) ((InterfaceC7011sL) this.b)).r((InterfaceC7584vL) this.g);
        } else {
            c7393uL.a(EnumC7202tL.e);
        }
        if (z) {
            c();
        }
    }

    public void k(InterfaceC7584vL interfaceC7584vL) {
        ((C7393uL) this.c).a(EnumC7202tL.a);
        boolean zG = g();
        C7036sT0 c7036sT0F = f();
        if (c7036sT0F instanceof InterfaceC3836fm1) {
            c7036sT0F.e = null;
        }
        interfaceC7584vL.getClass();
        this.g = interfaceC7584vL;
        C7036sT0 c7036sT0 = ((F00) interfaceC7584vL).d;
        i(c7036sT0 == null || c7036sT0.isVisible());
        C7036sT0 c7036sT0F2 = f();
        if (c7036sT0F2 instanceof InterfaceC3836fm1) {
            c7036sT0F2.e = this;
        }
        if (zG) {
            ((C4297iB0) ((InterfaceC7011sL) this.b)).r(interfaceC7584vL);
        }
    }

    public String toString() {
        switch (this.a) {
            case 2:
                C1857Xo1 c1857Xo1D = EI1.d(this);
                c1857Xo1D.k("controllerAttached", this.d);
                c1857Xo1D.k("holderAttached", this.e);
                c1857Xo1D.k("drawableVisible", this.f);
                c1857Xo1D.l(((C7393uL) this.c).a.toString(), "events");
                return c1857Xo1D.toString();
            default:
                return super.toString();
        }
    }

    public C6394p6(F00 f00) {
        this.a = 2;
        this.d = false;
        this.e = false;
        this.f = true;
        this.b = null;
        this.c = C7393uL.c ? new C7393uL() : C7393uL.b;
        if (f00 != null) {
            k(f00);
        }
    }
}
