package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/* renamed from: wL */
/* loaded from: classes.dex */
public abstract class AbstractC7774wL extends ImageView {
    public static boolean g = false;
    public final C7950xG0 a;
    public float b;
    public C6394p6 c;
    public boolean d;
    public boolean e;
    public Object f;

    public AbstractC7774wL(S91 s91) {
        super(s91);
        this.a = new C7950xG0(1);
        this.b = 0.0f;
        this.d = false;
        this.e = false;
        this.f = null;
        a(s91);
    }

    public static void setGlobalLegacyVisibilityHandlingEnabled(boolean z) {
        g = z;
    }

    public final void a(Context context) {
        try {
            AbstractC4368iZ.b();
            if (this.d) {
                AbstractC4368iZ.b();
                return;
            }
            boolean z = true;
            this.d = true;
            this.c = new C6394p6(null);
            ColorStateList imageTintList = getImageTintList();
            if (imageTintList == null) {
                AbstractC4368iZ.b();
                return;
            }
            setColorFilter(imageTintList.getDefaultColor());
            if (!g || context.getApplicationInfo().targetSdkVersion < 24) {
                z = false;
            }
            this.e = z;
            AbstractC4368iZ.b();
        } catch (Throwable th) {
            AbstractC4368iZ.b();
            throw th;
        }
    }

    public final void b() {
        Drawable drawable;
        if (!this.e || (drawable = getDrawable()) == null) {
            return;
        }
        drawable.setVisible(getVisibility() == 0, false);
    }

    public float getAspectRatio() {
        return this.b;
    }

    public InterfaceC7011sL getController() {
        return (InterfaceC7011sL) this.c.b;
    }

    public Object getExtraData() {
        return this.f;
    }

    public InterfaceC7584vL getHierarchy() {
        InterfaceC7584vL interfaceC7584vL = (InterfaceC7584vL) this.c.g;
        interfaceC7584vL.getClass();
        return interfaceC7584vL;
    }

    public Drawable getTopLevelDrawable() {
        return this.c.f();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b();
        C6394p6 c6394p6 = this.c;
        ((C7393uL) c6394p6.c).a(EnumC7202tL.o);
        c6394p6.e = true;
        c6394p6.d();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
        C6394p6 c6394p6 = this.c;
        ((C7393uL) c6394p6.c).a(EnumC7202tL.p);
        c6394p6.e = false;
        c6394p6.d();
    }

    @Override // android.view.View
    public final void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        b();
        C6394p6 c6394p6 = this.c;
        ((C7393uL) c6394p6.c).a(EnumC7202tL.o);
        c6394p6.e = true;
        c6394p6.d();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        C7950xG0 c7950xG0 = this.a;
        c7950xG0.b = i;
        c7950xG0.c = i2;
        float f = this.b;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (f > 0.0f && layoutParams != null) {
            int i3 = layoutParams.height;
            if (i3 == 0 || i3 == -2) {
                c7950xG0.c = View.MeasureSpec.makeMeasureSpec(View.resolveSize((int) (((View.MeasureSpec.getSize(c7950xG0.b) - paddingRight) / f) + paddingBottom), c7950xG0.c), 1073741824);
            } else {
                int i4 = layoutParams.width;
                if (i4 == 0 || i4 == -2) {
                    c7950xG0.b = View.MeasureSpec.makeMeasureSpec(View.resolveSize((int) (((View.MeasureSpec.getSize(c7950xG0.c) - paddingBottom) * f) + paddingRight), c7950xG0.b), 1073741824);
                }
            }
        }
        super.onMeasure(c7950xG0.b, c7950xG0.c);
    }

    @Override // android.view.View
    public final void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        b();
        C6394p6 c6394p6 = this.c;
        ((C7393uL) c6394p6.c).a(EnumC7202tL.p);
        c6394p6.e = false;
        c6394p6.d();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C6394p6 c6394p6 = this.c;
        if (c6394p6.g()) {
            L l = (L) ((InterfaceC7011sL) c6394p6.b);
            l.getClass();
            boolean zO = AbstractC3393dS.a.o(2);
            Class cls = L.s;
            if (zO) {
                AbstractC3393dS.l(cls, "controller %x %s: onTouchEvent %s", Integer.valueOf(System.identityHashCode(l)), l.h, motionEvent);
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        b();
    }

    public void setAspectRatio(float f) {
        if (f == this.b) {
            return;
        }
        this.b = f;
        requestLayout();
    }

    public void setController(InterfaceC7011sL interfaceC7011sL) {
        this.c.j(interfaceC7011sL);
        super.setImageDrawable(this.c.f());
    }

    public void setExtraData(Object obj) {
        this.f = obj;
    }

    public void setHierarchy(InterfaceC7584vL interfaceC7584vL) {
        this.c.k(interfaceC7584vL);
        super.setImageDrawable(this.c.f());
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageBitmap(Bitmap bitmap) {
        a(getContext());
        this.c.j(null);
        super.setImageBitmap(bitmap);
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageDrawable(Drawable drawable) {
        a(getContext());
        this.c.j(null);
        super.setImageDrawable(drawable);
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageResource(int i) {
        a(getContext());
        this.c.j(null);
        super.setImageResource(i);
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageURI(Uri uri) {
        a(getContext());
        this.c.j(null);
        super.setImageURI(uri);
    }

    public void setLegacyVisibilityHandlingEnabled(boolean z) {
        this.e = z;
    }

    @Override // android.view.View
    public final String toString() {
        C1857Xo1 c1857Xo1D = EI1.d(this);
        C6394p6 c6394p6 = this.c;
        c1857Xo1D.l(c6394p6 != null ? c6394p6.toString() : "<no holder set>", "holder");
        return c1857Xo1D.toString();
    }
}
