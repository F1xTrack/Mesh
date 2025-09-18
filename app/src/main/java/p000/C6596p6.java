package p000;

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
public final class C6596p6 {

    /* renamed from: a */
    public final /* synthetic */ int f39832a;

    /* renamed from: b */
    public Object f39833b;

    /* renamed from: c */
    public Object f39834c;

    /* renamed from: d */
    public boolean f39835d;

    /* renamed from: e */
    public boolean f39836e;

    /* renamed from: f */
    public boolean f39837f;

    /* renamed from: g */
    public Object f39838g;

    public /* synthetic */ C6596p6(TextView textView, int i) {
        this.f39832a = i;
        this.f39833b = null;
        this.f39834c = null;
        this.f39835d = false;
        this.f39836e = false;
        this.f39838g = textView;
    }

    /* renamed from: a */
    public void m23611a() {
        CompoundButton compoundButton = (CompoundButton) this.f39838g;
        Drawable drawableM22312a = AbstractC6331kw.m22312a(compoundButton);
        if (drawableM22312a != null) {
            if (this.f39835d || this.f39836e) {
                Drawable drawableMutate = drawableM22312a.mutate();
                if (this.f39835d) {
                    AbstractC4173hL.m18806h(drawableMutate, (ColorStateList) this.f39833b);
                }
                if (this.f39836e) {
                    AbstractC4173hL.m18807i(drawableMutate, (PorterDuff.Mode) this.f39834c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(drawableMutate);
            }
        }
    }

    /* renamed from: b */
    public void m23612b() {
        C6531o6 c6531o6 = (C6531o6) this.f39838g;
        Drawable checkMarkDrawable = c6531o6.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f39835d || this.f39836e) {
                Drawable drawableMutate = checkMarkDrawable.mutate();
                if (this.f39835d) {
                    AbstractC4173hL.m18806h(drawableMutate, (ColorStateList) this.f39833b);
                }
                if (this.f39836e) {
                    AbstractC4173hL.m18807i(drawableMutate, (PorterDuff.Mode) this.f39834c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(c6531o6.getDrawableState());
                }
                c6531o6.setCheckMarkDrawable(drawableMutate);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0098  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m23613c() {
        /*
            Method dump skipped, instructions count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C6596p6.m23613c():void");
    }

    /* renamed from: d */
    public void m23614d() {
        if (this.f39836e && this.f39837f) {
            m23613c();
        } else {
            m23615e();
        }
    }

    /* renamed from: e */
    public void m23615e() {
        if (this.f39835d) {
            C6943uL c6943uL = (C6943uL) this.f39834c;
            EnumC6880tL enumC6880tL = EnumC6880tL.f43004h;
            c6943uL.m25182a(enumC6880tL);
            this.f39835d = false;
            if (m23617g()) {
                AbstractC0693L abstractC0693L = (AbstractC0693L) ((InterfaceC6817sL) this.f39833b);
                abstractC0693L.getClass();
                AbstractC4250iZ.m19063b();
                if (AbstractC3929dS.f26114a.m18228o(2)) {
                    AbstractC3929dS.m17678k(AbstractC0693L.f6427s, "controller %x %s: onDetach", Integer.valueOf(System.identityHashCode(abstractC0693L)), abstractC0693L.f6435h);
                }
                abstractC0693L.f6428a.m25182a(enumC6880tL);
                abstractC0693L.f6437j = false;
                C6479nH c6479nH = abstractC0693L.f6429b;
                c6479nH.getClass();
                if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                    synchronized (c6479nH.f38227a) {
                        try {
                            if (!((ArrayList) c6479nH.f38229c).contains(abstractC0693L)) {
                                ((ArrayList) c6479nH.f38229c).add(abstractC0693L);
                                boolean z = ((ArrayList) c6479nH.f38229c).size() == 1;
                                if (z) {
                                    ((Handler) c6479nH.f38228b).post((GR0) c6479nH.f38231e);
                                }
                            }
                        } finally {
                        }
                    }
                } else {
                    abstractC0693L.m4815m();
                }
                AbstractC4250iZ.m19063b();
            }
        }
    }

    /* renamed from: f */
    public C11037sT0 m23616f() {
        InterfaceC7006vL interfaceC7006vL = (InterfaceC7006vL) this.f39838g;
        if (interfaceC7006vL == null) {
            return null;
        }
        return ((F00) interfaceC7006vL).f3008d;
    }

    /* renamed from: g */
    public boolean m23617g() {
        InterfaceC6817sL interfaceC6817sL = (InterfaceC6817sL) this.f39833b;
        return interfaceC6817sL != null && ((AbstractC0693L) interfaceC6817sL).f6433f == ((InterfaceC7006vL) this.f39838g);
    }

    /* renamed from: h */
    public void m23618h(AttributeSet attributeSet, int i) {
        int resourceId;
        int resourceId2;
        CompoundButton compoundButton = (CompoundButton) this.f39838g;
        Context context = compoundButton.getContext();
        int[] iArr = AbstractC8704aH0.f15435m;
        C8539Xo1 c8539Xo1M9117J = C8539Xo1.m9117J(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) c8539Xo1M9117J.f13982c;
        AbstractC10944rk1.m24481m(compoundButton, compoundButton.getContext(), iArr, attributeSet, (TypedArray) c8539Xo1M9117J.f13982c, i, 0);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(AbstractC11918zN1.m26394b(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                compoundButton.setButtonDrawable(AbstractC11918zN1.m26394b(compoundButton.getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                AbstractC6268jw.m22123c(compoundButton, c8539Xo1M9117J.m9120B(2));
            }
            if (typedArray.hasValue(3)) {
                AbstractC6268jw.m22124d(compoundButton, AbstractC6737rL.m24317c(typedArray.getInt(3, -1), null));
            }
        } finally {
            c8539Xo1M9117J.m9130M();
        }
    }

    /* renamed from: i */
    public void m23619i(boolean z) {
        if (this.f39837f == z) {
            return;
        }
        ((C6943uL) this.f39834c).m25182a(z ? EnumC6880tL.f43013q : EnumC6880tL.f43014r);
        this.f39837f = z;
        m23614d();
    }

    /* renamed from: j */
    public void m23620j(InterfaceC6817sL interfaceC6817sL) {
        boolean z = this.f39835d;
        if (z) {
            m23615e();
        }
        boolean zM23617g = m23617g();
        C6943uL c6943uL = (C6943uL) this.f39834c;
        if (zM23617g) {
            c6943uL.m25182a(EnumC6880tL.f43000d);
            ((C9721iB0) ((InterfaceC6817sL) this.f39833b)).m18980r(null);
        }
        this.f39833b = interfaceC6817sL;
        if (interfaceC6817sL != null) {
            c6943uL.m25182a(EnumC6880tL.f42999c);
            ((C9721iB0) ((InterfaceC6817sL) this.f39833b)).m18980r((InterfaceC7006vL) this.f39838g);
        } else {
            c6943uL.m25182a(EnumC6880tL.f43001e);
        }
        if (z) {
            m23613c();
        }
    }

    /* renamed from: k */
    public void m23621k(InterfaceC7006vL interfaceC7006vL) {
        ((C6943uL) this.f39834c).m25182a(EnumC6880tL.f42997a);
        boolean zM23617g = m23617g();
        C11037sT0 c11037sT0M23616f = m23616f();
        if (c11037sT0M23616f instanceof InterfaceC9412fm1) {
            c11037sT0M23616f.f42446e = null;
        }
        interfaceC7006vL.getClass();
        this.f39838g = interfaceC7006vL;
        C11037sT0 c11037sT0 = ((F00) interfaceC7006vL).f3008d;
        m23619i(c11037sT0 == null || c11037sT0.isVisible());
        C11037sT0 c11037sT0M23616f2 = m23616f();
        if (c11037sT0M23616f2 instanceof InterfaceC9412fm1) {
            c11037sT0M23616f2.f42446e = this;
        }
        if (zM23617g) {
            ((C9721iB0) ((InterfaceC6817sL) this.f39833b)).m18980r(interfaceC7006vL);
        }
    }

    public String toString() {
        switch (this.f39832a) {
            case 2:
                C8539Xo1 c8539Xo1M2121d = EI1.m2121d(this);
                c8539Xo1M2121d.m9142k("controllerAttached", this.f39835d);
                c8539Xo1M2121d.m9142k("holderAttached", this.f39836e);
                c8539Xo1M2121d.m9142k("drawableVisible", this.f39837f);
                c8539Xo1M2121d.m9143l(((C6943uL) this.f39834c).f43671a.toString(), "events");
                return c8539Xo1M2121d.toString();
            default:
                return super.toString();
        }
    }

    public C6596p6(F00 f00) {
        this.f39832a = 2;
        this.f39835d = false;
        this.f39836e = false;
        this.f39837f = true;
        this.f39833b = null;
        this.f39834c = C6943uL.f43670c ? new C6943uL() : C6943uL.f43669b;
        if (f00 != null) {
            m23621k(f00);
        }
    }
}
