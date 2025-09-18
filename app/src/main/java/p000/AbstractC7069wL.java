package p000;

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
public abstract class AbstractC7069wL extends ImageView {

    /* renamed from: g */
    public static boolean f44822g = false;

    /* renamed from: a */
    public final C11649xG0 f44823a;

    /* renamed from: b */
    public float f44824b;

    /* renamed from: c */
    public C6596p6 f44825c;

    /* renamed from: d */
    public boolean f44826d;

    /* renamed from: e */
    public boolean f44827e;

    /* renamed from: f */
    public Object f44828f;

    public AbstractC7069wL(S91 s91) {
        super(s91);
        this.f44823a = new C11649xG0(1);
        this.f44824b = 0.0f;
        this.f44826d = false;
        this.f44827e = false;
        this.f44828f = null;
        m25607a(s91);
    }

    public static void setGlobalLegacyVisibilityHandlingEnabled(boolean z) {
        f44822g = z;
    }

    /* renamed from: a */
    public final void m25607a(Context context) {
        try {
            AbstractC4250iZ.m19063b();
            if (this.f44826d) {
                AbstractC4250iZ.m19063b();
                return;
            }
            boolean z = true;
            this.f44826d = true;
            this.f44825c = new C6596p6(null);
            ColorStateList imageTintList = getImageTintList();
            if (imageTintList == null) {
                AbstractC4250iZ.m19063b();
                return;
            }
            setColorFilter(imageTintList.getDefaultColor());
            if (!f44822g || context.getApplicationInfo().targetSdkVersion < 24) {
                z = false;
            }
            this.f44827e = z;
            AbstractC4250iZ.m19063b();
        } catch (Throwable th) {
            AbstractC4250iZ.m19063b();
            throw th;
        }
    }

    /* renamed from: b */
    public final void m25608b() {
        Drawable drawable;
        if (!this.f44827e || (drawable = getDrawable()) == null) {
            return;
        }
        drawable.setVisible(getVisibility() == 0, false);
    }

    public float getAspectRatio() {
        return this.f44824b;
    }

    public InterfaceC6817sL getController() {
        return (InterfaceC6817sL) this.f44825c.f39833b;
    }

    public Object getExtraData() {
        return this.f44828f;
    }

    public InterfaceC7006vL getHierarchy() {
        InterfaceC7006vL interfaceC7006vL = (InterfaceC7006vL) this.f44825c.f39838g;
        interfaceC7006vL.getClass();
        return interfaceC7006vL;
    }

    public Drawable getTopLevelDrawable() {
        return this.f44825c.m23616f();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m25608b();
        C6596p6 c6596p6 = this.f44825c;
        ((C6943uL) c6596p6.f39834c).m25182a(EnumC6880tL.f43011o);
        c6596p6.f39836e = true;
        c6596p6.m23614d();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m25608b();
        C6596p6 c6596p6 = this.f44825c;
        ((C6943uL) c6596p6.f39834c).m25182a(EnumC6880tL.f43012p);
        c6596p6.f39836e = false;
        c6596p6.m23614d();
    }

    @Override // android.view.View
    public final void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        m25608b();
        C6596p6 c6596p6 = this.f44825c;
        ((C6943uL) c6596p6.f39834c).m25182a(EnumC6880tL.f43011o);
        c6596p6.f39836e = true;
        c6596p6.m23614d();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        C11649xG0 c11649xG0 = this.f44823a;
        c11649xG0.f45508b = i;
        c11649xG0.f45509c = i2;
        float f = this.f44824b;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (f > 0.0f && layoutParams != null) {
            int i3 = layoutParams.height;
            if (i3 == 0 || i3 == -2) {
                c11649xG0.f45509c = View.MeasureSpec.makeMeasureSpec(View.resolveSize((int) (((View.MeasureSpec.getSize(c11649xG0.f45508b) - paddingRight) / f) + paddingBottom), c11649xG0.f45509c), 1073741824);
            } else {
                int i4 = layoutParams.width;
                if (i4 == 0 || i4 == -2) {
                    c11649xG0.f45508b = View.MeasureSpec.makeMeasureSpec(View.resolveSize((int) (((View.MeasureSpec.getSize(c11649xG0.f45509c) - paddingBottom) * f) + paddingRight), c11649xG0.f45508b), 1073741824);
                }
            }
        }
        super.onMeasure(c11649xG0.f45508b, c11649xG0.f45509c);
    }

    @Override // android.view.View
    public final void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        m25608b();
        C6596p6 c6596p6 = this.f44825c;
        ((C6943uL) c6596p6.f39834c).m25182a(EnumC6880tL.f43012p);
        c6596p6.f39836e = false;
        c6596p6.m23614d();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C6596p6 c6596p6 = this.f44825c;
        if (c6596p6.m23617g()) {
            AbstractC0693L abstractC0693L = (AbstractC0693L) ((InterfaceC6817sL) c6596p6.f39833b);
            abstractC0693L.getClass();
            boolean zM18228o = AbstractC3929dS.f26114a.m18228o(2);
            Class cls = AbstractC0693L.f6427s;
            if (zM18228o) {
                AbstractC3929dS.m17679l(cls, "controller %x %s: onTouchEvent %s", Integer.valueOf(System.identityHashCode(abstractC0693L)), abstractC0693L.f6435h, motionEvent);
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        m25608b();
    }

    public void setAspectRatio(float f) {
        if (f == this.f44824b) {
            return;
        }
        this.f44824b = f;
        requestLayout();
    }

    public void setController(InterfaceC6817sL interfaceC6817sL) {
        this.f44825c.m23620j(interfaceC6817sL);
        super.setImageDrawable(this.f44825c.m23616f());
    }

    public void setExtraData(Object obj) {
        this.f44828f = obj;
    }

    public void setHierarchy(InterfaceC7006vL interfaceC7006vL) {
        this.f44825c.m23621k(interfaceC7006vL);
        super.setImageDrawable(this.f44825c.m23616f());
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageBitmap(Bitmap bitmap) {
        m25607a(getContext());
        this.f44825c.m23620j(null);
        super.setImageBitmap(bitmap);
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageDrawable(Drawable drawable) {
        m25607a(getContext());
        this.f44825c.m23620j(null);
        super.setImageDrawable(drawable);
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageResource(int i) {
        m25607a(getContext());
        this.f44825c.m23620j(null);
        super.setImageResource(i);
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageURI(Uri uri) {
        m25607a(getContext());
        this.f44825c.m23620j(null);
        super.setImageURI(uri);
    }

    public void setLegacyVisibilityHandlingEnabled(boolean z) {
        this.f44827e = z;
    }

    @Override // android.view.View
    public final String toString() {
        C8539Xo1 c8539Xo1M2121d = EI1.m2121d(this);
        C6596p6 c6596p6 = this.f44825c;
        c8539Xo1M2121d.m9143l(c6596p6 != null ? c6596p6.toString() : "<no holder set>", "holder");
        return c8539Xo1M2121d.toString();
    }
}
