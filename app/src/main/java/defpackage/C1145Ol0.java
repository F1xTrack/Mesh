package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.widget.ImageView;
import com.airbnb.android.react.lottie.LottieAnimationViewManager;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.zip.ZipInputStream;
import ru.mes.dnevnik.R;

/* renamed from: Ol0 */
/* loaded from: classes.dex */
public final class C1145Ol0 extends O6 {
    public static final C0756Jl0 q = new C0756Jl0();
    public final C1067Nl0 d;
    public final C1067Nl0 e;
    public InterfaceC6712qm0 f;
    public int g;
    public final C5948mm0 h;
    public String i;
    public int j;
    public boolean k;
    public boolean l;
    public boolean m;
    public final HashSet n;
    public final HashSet o;
    public C7475um0 p;

    public C1145Ol0(S91 s91) {
        String string;
        super(s91);
        this.d = new C1067Nl0(this, 1);
        this.e = new C1067Nl0(this, 0);
        this.g = 0;
        C5948mm0 c5948mm0 = new C5948mm0();
        this.h = c5948mm0;
        this.k = false;
        this.l = false;
        this.m = true;
        HashSet hashSet = new HashSet();
        this.n = hashSet;
        this.o = new HashSet();
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, LG0.a, R.attr.lottieAnimationViewStyle, 0);
        this.m = typedArrayObtainStyledAttributes.getBoolean(2, true);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(14);
        boolean zHasValue2 = typedArrayObtainStyledAttributes.hasValue(9);
        boolean zHasValue3 = typedArrayObtainStyledAttributes.hasValue(19);
        if (zHasValue && zHasValue2) {
            throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
        }
        if (zHasValue) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(14, 0);
            if (resourceId != 0) {
                setAnimation(resourceId);
            }
        } else if (zHasValue2) {
            String string2 = typedArrayObtainStyledAttributes.getString(9);
            if (string2 != null) {
                setAnimation(string2);
            }
        } else if (zHasValue3 && (string = typedArrayObtainStyledAttributes.getString(19)) != null) {
            setAnimationFromUrl(string);
        }
        setFallbackResource(typedArrayObtainStyledAttributes.getResourceId(8, 0));
        if (typedArrayObtainStyledAttributes.getBoolean(1, false)) {
            this.l = true;
        }
        if (typedArrayObtainStyledAttributes.getBoolean(12, false)) {
            c5948mm0.b.setRepeatCount(-1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(17)) {
            setRepeatMode(typedArrayObtainStyledAttributes.getInt(17, 1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(16)) {
            setRepeatCount(typedArrayObtainStyledAttributes.getInt(16, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(18)) {
            setSpeed(typedArrayObtainStyledAttributes.getFloat(18, 1.0f));
        }
        if (typedArrayObtainStyledAttributes.hasValue(4)) {
            setClipToCompositionBounds(typedArrayObtainStyledAttributes.getBoolean(4, true));
        }
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            setClipTextToBoundingBox(typedArrayObtainStyledAttributes.getBoolean(3, false));
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            setDefaultFontFileExtension(typedArrayObtainStyledAttributes.getString(6));
        }
        setImageAssetsFolder(typedArrayObtainStyledAttributes.getString(11));
        boolean zHasValue4 = typedArrayObtainStyledAttributes.hasValue(13);
        float f = typedArrayObtainStyledAttributes.getFloat(13, 0.0f);
        if (zHasValue4) {
            hashSet.add(EnumC0989Ml0.b);
        }
        c5948mm0.v(f);
        d(typedArrayObtainStyledAttributes.getBoolean(7, false));
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            c5948mm0.a(new C0971Mf0("**"), InterfaceC6902rm0.F, new ES1(new Q01(AbstractC3556eJ.b(getContext(), typedArrayObtainStyledAttributes.getResourceId(5, -1)).getDefaultColor())));
        }
        if (typedArrayObtainStyledAttributes.hasValue(15)) {
            int i = typedArrayObtainStyledAttributes.getInt(15, 0);
            setRenderMode(XQ0.values()[i >= XQ0.values().length ? 0 : i]);
        }
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            int i2 = typedArrayObtainStyledAttributes.getInt(0, 0);
            setAsyncUpdates(EnumC7738w9.values()[i2 >= XQ0.values().length ? 0 : i2]);
        }
        setIgnoreDisabledSystemAnimations(typedArrayObtainStyledAttributes.getBoolean(10, false));
        if (typedArrayObtainStyledAttributes.hasValue(20)) {
            setUseCompositionFrameRate(typedArrayObtainStyledAttributes.getBoolean(20, false));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private void setCompositionTask(C7475um0 c7475um0) {
        C7093sm0 c7093sm0 = c7475um0.d;
        C5948mm0 c5948mm0 = this.h;
        if (c7093sm0 != null && c5948mm0 == getDrawable() && c5948mm0.a == c7093sm0.a) {
            return;
        }
        this.n.add(EnumC0989Ml0.a);
        this.h.d();
        c();
        c7475um0.b(this.d);
        c7475um0.a(this.e);
        this.p = c7475um0;
    }

    public final void c() {
        C7475um0 c7475um0 = this.p;
        if (c7475um0 != null) {
            C1067Nl0 c1067Nl0 = this.d;
            synchronized (c7475um0) {
                c7475um0.a.remove(c1067Nl0);
            }
            this.p.e(this.e);
        }
    }

    public final void d(boolean z) {
        EnumC6139nm0 enumC6139nm0 = EnumC6139nm0.a;
        C5948mm0 c5948mm0 = this.h;
        HashSet hashSet = (HashSet) c5948mm0.n.b;
        boolean zAdd = z ? hashSet.add(enumC6139nm0) : hashSet.remove(enumC6139nm0);
        if (c5948mm0.a == null || !zAdd) {
            return;
        }
        c5948mm0.c();
    }

    public final void e() {
        this.n.add(EnumC0989Ml0.f);
        this.h.l();
    }

    public final void f(InputStream inputStream, String str) {
        setCompositionTask(AbstractC2578cm0.a(str, new CallableC7695vw(inputStream, 5, str), new DE(22, inputStream)));
    }

    public final void g(ZipInputStream zipInputStream, String str) {
        setCompositionTask(AbstractC2578cm0.a(str, new CallableC7695vw(zipInputStream, 6, str), new DE(23, zipInputStream)));
    }

    public EnumC7738w9 getAsyncUpdates() {
        EnumC7738w9 enumC7738w9 = this.h.L;
        return enumC7738w9 != null ? enumC7738w9 : EnumC7738w9.a;
    }

    public boolean getAsyncUpdatesEnabled() {
        EnumC7738w9 enumC7738w9 = this.h.L;
        if (enumC7738w9 == null) {
            enumC7738w9 = EnumC7738w9.a;
        }
        return enumC7738w9 == EnumC7738w9.b;
    }

    public boolean getClipTextToBoundingBox() {
        return this.h.v;
    }

    public boolean getClipToCompositionBounds() {
        return this.h.p;
    }

    public C1847Xl0 getComposition() {
        Drawable drawable = getDrawable();
        C5948mm0 c5948mm0 = this.h;
        if (drawable == c5948mm0) {
            return c5948mm0.a;
        }
        return null;
    }

    public long getDuration() {
        C1847Xl0 composition = getComposition();
        if (composition != null) {
            return (long) composition.b();
        }
        return 0L;
    }

    public int getFrame() {
        return (int) this.h.b.h;
    }

    public String getImageAssetsFolder() {
        return this.h.h;
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.h.o;
    }

    public float getMaxFrame() {
        return this.h.b.e();
    }

    public float getMinFrame() {
        return this.h.b.h();
    }

    public KA0 getPerformanceTracker() {
        C1847Xl0 c1847Xl0 = this.h.a;
        if (c1847Xl0 != null) {
            return c1847Xl0.a;
        }
        return null;
    }

    public float getProgress() {
        return this.h.b.a();
    }

    public XQ0 getRenderMode() {
        return this.h.x ? XQ0.c : XQ0.b;
    }

    public int getRepeatCount() {
        return this.h.b.getRepeatCount();
    }

    public int getRepeatMode() {
        return this.h.b.getRepeatMode();
    }

    public float getSpeed() {
        return this.h.b.d;
    }

    public final void h(String str, String str2) {
        setCompositionTask(AbstractC2578cm0.a(str2, new CallableC2003Zl0(getContext(), str, str2, 0), null));
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if (drawable instanceof C5948mm0) {
            boolean z = ((C5948mm0) drawable).x;
            XQ0 xq0 = XQ0.c;
            if ((z ? xq0 : XQ0.b) == xq0) {
                this.h.invalidateSelf();
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        C5948mm0 c5948mm0 = this.h;
        if (drawable2 == c5948mm0) {
            super.invalidateDrawable(c5948mm0);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode() || !this.l) {
            return;
        }
        this.h.l();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        int i;
        if (!(parcelable instanceof C0912Ll0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0912Ll0 c0912Ll0 = (C0912Ll0) parcelable;
        super.onRestoreInstanceState(c0912Ll0.getSuperState());
        this.i = c0912Ll0.a;
        HashSet hashSet = this.n;
        EnumC0989Ml0 enumC0989Ml0 = EnumC0989Ml0.a;
        if (!hashSet.contains(enumC0989Ml0) && !TextUtils.isEmpty(this.i)) {
            setAnimation(this.i);
        }
        this.j = c0912Ll0.b;
        if (!hashSet.contains(enumC0989Ml0) && (i = this.j) != 0) {
            setAnimation(i);
        }
        if (!hashSet.contains(EnumC0989Ml0.b)) {
            this.h.v(c0912Ll0.c);
        }
        if (!hashSet.contains(EnumC0989Ml0.f) && c0912Ll0.d) {
            e();
        }
        if (!hashSet.contains(EnumC0989Ml0.e)) {
            setImageAssetsFolder(c0912Ll0.e);
        }
        if (!hashSet.contains(EnumC0989Ml0.c)) {
            setRepeatMode(c0912Ll0.f);
        }
        if (hashSet.contains(EnumC0989Ml0.d)) {
            return;
        }
        setRepeatCount(c0912Ll0.g);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z;
        C0912Ll0 c0912Ll0 = new C0912Ll0(super.onSaveInstanceState());
        c0912Ll0.a = this.i;
        c0912Ll0.b = this.j;
        C5948mm0 c5948mm0 = this.h;
        c0912Ll0.c = c5948mm0.b.a();
        boolean zIsVisible = c5948mm0.isVisible();
        ChoreographerFrameCallbackC7856wm0 choreographerFrameCallbackC7856wm0 = c5948mm0.b;
        if (zIsVisible) {
            z = choreographerFrameCallbackC7856wm0.m;
        } else {
            int i = c5948mm0.R;
            z = i == 2 || i == 3;
        }
        c0912Ll0.d = z;
        c0912Ll0.e = c5948mm0.h;
        c0912Ll0.f = choreographerFrameCallbackC7856wm0.getRepeatMode();
        c0912Ll0.g = choreographerFrameCallbackC7856wm0.getRepeatCount();
        return c0912Ll0;
    }

    public void setAnimation(final int i) {
        C7475um0 c7475um0A;
        C7475um0 c7475um0;
        this.j = i;
        final String str = null;
        this.i = null;
        if (isInEditMode()) {
            c7475um0 = new C7475um0(new X50(this, i, 1), true);
        } else {
            if (this.m) {
                Context context = getContext();
                final String strJ = AbstractC2578cm0.j(context, i);
                final WeakReference weakReference = new WeakReference(context);
                final Context applicationContext = context.getApplicationContext();
                c7475um0A = AbstractC2578cm0.a(strJ, new Callable() { // from class: bm0
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        Context context2 = (Context) weakReference.get();
                        if (context2 == null) {
                            context2 = applicationContext;
                        }
                        return AbstractC2578cm0.e(context2, i, strJ);
                    }
                }, null);
            } else {
                Context context2 = getContext();
                HashMap map = AbstractC2578cm0.a;
                final WeakReference weakReference2 = new WeakReference(context2);
                final Context applicationContext2 = context2.getApplicationContext();
                c7475um0A = AbstractC2578cm0.a(null, new Callable() { // from class: bm0
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        Context context22 = (Context) weakReference2.get();
                        if (context22 == null) {
                            context22 = applicationContext2;
                        }
                        return AbstractC2578cm0.e(context22, i, str);
                    }
                }, null);
            }
            c7475um0 = c7475um0A;
        }
        setCompositionTask(c7475um0);
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        f(new ByteArrayInputStream(str.getBytes()), null);
    }

    public void setAnimationFromUrl(String str) {
        C7475um0 c7475um0A;
        if (this.m) {
            Context context = getContext();
            HashMap map = AbstractC2578cm0.a;
            String strV = AbstractC8235ym.v("url_", str);
            c7475um0A = AbstractC2578cm0.a(strV, new CallableC2003Zl0(context, str, strV, 0), null);
        } else {
            c7475um0A = AbstractC2578cm0.a(null, new CallableC2003Zl0(getContext(), str, null, 0), null);
        }
        setCompositionTask(c7475um0A);
    }

    public void setApplyingOpacityToLayersEnabled(boolean z) {
        this.h.u = z;
    }

    public void setAsyncUpdates(EnumC7738w9 enumC7738w9) {
        this.h.L = enumC7738w9;
    }

    public void setCacheComposition(boolean z) {
        this.m = z;
    }

    public void setClipTextToBoundingBox(boolean z) {
        C5948mm0 c5948mm0 = this.h;
        if (z != c5948mm0.v) {
            c5948mm0.v = z;
            c5948mm0.invalidateSelf();
        }
    }

    public void setClipToCompositionBounds(boolean z) {
        C5948mm0 c5948mm0 = this.h;
        if (z != c5948mm0.p) {
            c5948mm0.p = z;
            C4246hw c4246hw = c5948mm0.q;
            if (c4246hw != null) {
                c4246hw.J = z;
            }
            c5948mm0.invalidateSelf();
        }
    }

    public void setComposition(C1847Xl0 c1847Xl0) {
        C5948mm0 c5948mm0 = this.h;
        c5948mm0.setCallback(this);
        boolean z = true;
        this.k = true;
        if (c5948mm0.a == c1847Xl0) {
            z = false;
        } else {
            c5948mm0.K = true;
            c5948mm0.d();
            c5948mm0.a = c1847Xl0;
            c5948mm0.c();
            ChoreographerFrameCallbackC7856wm0 choreographerFrameCallbackC7856wm0 = c5948mm0.b;
            boolean z2 = choreographerFrameCallbackC7856wm0.l == null;
            choreographerFrameCallbackC7856wm0.l = c1847Xl0;
            if (z2) {
                choreographerFrameCallbackC7856wm0.n(Math.max(choreographerFrameCallbackC7856wm0.j, c1847Xl0.l), Math.min(choreographerFrameCallbackC7856wm0.k, c1847Xl0.m));
            } else {
                choreographerFrameCallbackC7856wm0.n((int) c1847Xl0.l, (int) c1847Xl0.m);
            }
            float f = choreographerFrameCallbackC7856wm0.h;
            choreographerFrameCallbackC7856wm0.h = 0.0f;
            choreographerFrameCallbackC7856wm0.g = 0.0f;
            choreographerFrameCallbackC7856wm0.m((int) f);
            choreographerFrameCallbackC7856wm0.k();
            c5948mm0.v(choreographerFrameCallbackC7856wm0.getAnimatedFraction());
            ArrayList arrayList = c5948mm0.f;
            Iterator it = new ArrayList(arrayList).iterator();
            while (it.hasNext()) {
                InterfaceC5757lm0 interfaceC5757lm0 = (InterfaceC5757lm0) it.next();
                if (interfaceC5757lm0 != null) {
                    interfaceC5757lm0.run();
                }
                it.remove();
            }
            arrayList.clear();
            c1847Xl0.a.a = c5948mm0.s;
            c5948mm0.e();
            Drawable.Callback callback = c5948mm0.getCallback();
            if (callback instanceof ImageView) {
                ImageView imageView = (ImageView) callback;
                imageView.setImageDrawable(null);
                imageView.setImageDrawable(c5948mm0);
            }
        }
        if (this.l) {
            c5948mm0.l();
        }
        this.k = false;
        if (getDrawable() != c5948mm0 || z) {
            if (!z) {
                boolean zJ = c5948mm0.j();
                setImageDrawable(null);
                setImageDrawable(c5948mm0);
                if (zJ) {
                    c5948mm0.n();
                }
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            Iterator it2 = this.o.iterator();
            while (it2.hasNext()) {
                LottieAnimationViewManager.createViewInstance$lambda$1(((C1301Ql0) it2.next()).a, c1847Xl0);
            }
        }
    }

    public void setDefaultFontFileExtension(String str) {
        C5948mm0 c5948mm0 = this.h;
        c5948mm0.k = str;
        U41 u41I = c5948mm0.i();
        if (u41I != null) {
            u41I.f = str;
        }
    }

    public void setFailureListener(InterfaceC6712qm0 interfaceC6712qm0) {
        this.f = interfaceC6712qm0;
    }

    public void setFallbackResource(int i) {
        this.g = i;
    }

    public void setFontAssetDelegate(SW sw) {
        C5948mm0 c5948mm0 = this.h;
        c5948mm0.l = sw;
        U41 u41 = c5948mm0.i;
        if (u41 != null) {
            u41.e = sw;
        }
    }

    public void setFontMap(Map<String, Typeface> map) {
        C5948mm0 c5948mm0 = this.h;
        if (map == c5948mm0.j) {
            return;
        }
        c5948mm0.j = map;
        c5948mm0.invalidateSelf();
    }

    public void setFrame(int i) {
        this.h.o(i);
    }

    @Deprecated
    public void setIgnoreDisabledSystemAnimations(boolean z) {
        this.h.d = z;
    }

    public void setImageAssetDelegate(InterfaceC6776r60 interfaceC6776r60) {
        C5772lr0 c5772lr0 = this.h.g;
    }

    public void setImageAssetsFolder(String str) {
        this.h.h = str;
    }

    @Override // defpackage.O6, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.j = 0;
        this.i = null;
        c();
        super.setImageBitmap(bitmap);
    }

    @Override // defpackage.O6, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.j = 0;
        this.i = null;
        c();
        super.setImageDrawable(drawable);
    }

    @Override // defpackage.O6, android.widget.ImageView
    public void setImageResource(int i) {
        this.j = 0;
        this.i = null;
        c();
        super.setImageResource(i);
    }

    public void setMaintainOriginalImageBounds(boolean z) {
        this.h.o = z;
    }

    public void setMaxFrame(int i) {
        this.h.p(i);
    }

    public void setMaxProgress(float f) {
        C5948mm0 c5948mm0 = this.h;
        C1847Xl0 c1847Xl0 = c5948mm0.a;
        if (c1847Xl0 == null) {
            c5948mm0.f.add(new C4407im0(c5948mm0, f, 0));
            return;
        }
        float fE = AbstractC2215as0.e(c1847Xl0.l, c1847Xl0.m, f);
        ChoreographerFrameCallbackC7856wm0 choreographerFrameCallbackC7856wm0 = c5948mm0.b;
        choreographerFrameCallbackC7856wm0.n(choreographerFrameCallbackC7856wm0.j, fE);
    }

    public void setMinAndMaxFrame(String str) {
        this.h.s(str);
    }

    public void setMinFrame(int i) {
        this.h.t(i);
    }

    public void setMinProgress(float f) {
        C5948mm0 c5948mm0 = this.h;
        C1847Xl0 c1847Xl0 = c5948mm0.a;
        if (c1847Xl0 == null) {
            c5948mm0.f.add(new C4407im0(c5948mm0, f, 1));
        } else {
            c5948mm0.t((int) AbstractC2215as0.e(c1847Xl0.l, c1847Xl0.m, f));
        }
    }

    public void setOutlineMasksAndMattes(boolean z) {
        C5948mm0 c5948mm0 = this.h;
        if (c5948mm0.t == z) {
            return;
        }
        c5948mm0.t = z;
        C4246hw c4246hw = c5948mm0.q;
        if (c4246hw != null) {
            c4246hw.r(z);
        }
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        C5948mm0 c5948mm0 = this.h;
        c5948mm0.s = z;
        C1847Xl0 c1847Xl0 = c5948mm0.a;
        if (c1847Xl0 != null) {
            c1847Xl0.a.a = z;
        }
    }

    public void setProgress(float f) {
        this.n.add(EnumC0989Ml0.b);
        this.h.v(f);
    }

    public void setRenderMode(XQ0 xq0) {
        C5948mm0 c5948mm0 = this.h;
        c5948mm0.w = xq0;
        c5948mm0.e();
    }

    public void setRepeatCount(int i) {
        this.n.add(EnumC0989Ml0.d);
        this.h.b.setRepeatCount(i);
    }

    public void setRepeatMode(int i) {
        this.n.add(EnumC0989Ml0.c);
        this.h.b.setRepeatMode(i);
    }

    public void setSafeMode(boolean z) {
        this.h.e = z;
    }

    public void setSpeed(float f) {
        this.h.b.d = f;
    }

    public void setTextDelegate(C5450k91 c5450k91) {
        this.h.m = c5450k91;
    }

    public void setUseCompositionFrameRate(boolean z) {
        this.h.b.n = z;
    }

    @Override // android.view.View
    public final void unscheduleDrawable(Drawable drawable) {
        C5948mm0 c5948mm0;
        if (!this.k && drawable == (c5948mm0 = this.h) && c5948mm0.j()) {
            this.l = false;
            c5948mm0.k();
        } else if (!this.k && (drawable instanceof C5948mm0)) {
            C5948mm0 c5948mm02 = (C5948mm0) drawable;
            if (c5948mm02.j()) {
                c5948mm02.k();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    public void setMaxFrame(String str) {
        this.h.q(str);
    }

    public void setMinFrame(String str) {
        this.h.u(str);
    }

    public void setAnimation(String str) {
        C7475um0 c7475um0A;
        C7475um0 c7475um0;
        this.i = str;
        this.j = 0;
        if (isInEditMode()) {
            c7475um0 = new C7475um0(new CallableC7695vw(this, 4, str), true);
        } else {
            if (this.m) {
                Context context = getContext();
                HashMap map = AbstractC2578cm0.a;
                String strV = AbstractC8235ym.v("asset_", str);
                c7475um0A = AbstractC2578cm0.a(strV, new CallableC2003Zl0(context.getApplicationContext(), str, strV, 1), null);
            } else {
                Context context2 = getContext();
                HashMap map2 = AbstractC2578cm0.a;
                c7475um0A = AbstractC2578cm0.a(null, new CallableC2003Zl0(context2.getApplicationContext(), str, null, 1), null);
            }
            c7475um0 = c7475um0A;
        }
        setCompositionTask(c7475um0);
    }
}
