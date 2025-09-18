package p000;

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
public final class C8064Ol0 extends C0888O6 {

    /* renamed from: q */
    public static final C7804Jl0 f8596q = new C7804Jl0();

    /* renamed from: d */
    public final C8012Nl0 f8597d;

    /* renamed from: e */
    public final C8012Nl0 f8598e;

    /* renamed from: f */
    public InterfaceC10819qm0 f8599f;

    /* renamed from: g */
    public int f8600g;

    /* renamed from: h */
    public final C10307mm0 f8601h;

    /* renamed from: i */
    public String f8602i;

    /* renamed from: j */
    public int f8603j;

    /* renamed from: k */
    public boolean f8604k;

    /* renamed from: l */
    public boolean f8605l;

    /* renamed from: m */
    public boolean f8606m;

    /* renamed from: n */
    public final HashSet f8607n;

    /* renamed from: o */
    public final HashSet f8608o;

    /* renamed from: p */
    public C11331um0 f8609p;

    public C8064Ol0(S91 s91) {
        String string;
        super(s91);
        this.f8597d = new C8012Nl0(this, 1);
        this.f8598e = new C8012Nl0(this, 0);
        this.f8600g = 0;
        C10307mm0 c10307mm0 = new C10307mm0();
        this.f8601h = c10307mm0;
        this.f8604k = false;
        this.f8605l = false;
        this.f8606m = true;
        HashSet hashSet = new HashSet();
        this.f8607n = hashSet;
        this.f8608o = new HashSet();
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, LG0.f6584a, R.attr.lottieAnimationViewStyle, 0);
        this.f8606m = typedArrayObtainStyledAttributes.getBoolean(2, true);
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
            this.f8605l = true;
        }
        if (typedArrayObtainStyledAttributes.getBoolean(12, false)) {
            c10307mm0.f37888b.setRepeatCount(-1);
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
            hashSet.add(EnumC7960Ml0.f7321b);
        }
        c10307mm0.m22967v(f);
        m6131d(typedArrayObtainStyledAttributes.getBoolean(7, false));
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            c10307mm0.m22947a(new C7948Mf0("**"), InterfaceC10947rm0.f41863F, new ES1(new Q01(AbstractC3982eJ.m17900b(getContext(), typedArrayObtainStyledAttributes.getResourceId(5, -1)).getDefaultColor())));
        }
        if (typedArrayObtainStyledAttributes.hasValue(15)) {
            int i = typedArrayObtainStyledAttributes.getInt(15, 0);
            setRenderMode(XQ0.values()[i >= XQ0.values().length ? 0 : i]);
        }
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            int i2 = typedArrayObtainStyledAttributes.getInt(0, 0);
            setAsyncUpdates(EnumC7057w9.values()[i2 >= XQ0.values().length ? 0 : i2]);
        }
        setIgnoreDisabledSystemAnimations(typedArrayObtainStyledAttributes.getBoolean(10, false));
        if (typedArrayObtainStyledAttributes.hasValue(20)) {
            setUseCompositionFrameRate(typedArrayObtainStyledAttributes.getBoolean(20, false));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private void setCompositionTask(C11331um0 c11331um0) {
        C11075sm0 c11075sm0 = c11331um0.f43859d;
        C10307mm0 c10307mm0 = this.f8601h;
        if (c11075sm0 != null && c10307mm0 == getDrawable() && c10307mm0.f37887a == c11075sm0.f42591a) {
            return;
        }
        this.f8607n.add(EnumC7960Ml0.f7320a);
        this.f8601h.m22950d();
        m6130c();
        c11331um0.m25233b(this.f8597d);
        c11331um0.m25232a(this.f8598e);
        this.f8609p = c11331um0;
    }

    /* renamed from: c */
    public final void m6130c() {
        C11331um0 c11331um0 = this.f8609p;
        if (c11331um0 != null) {
            C8012Nl0 c8012Nl0 = this.f8597d;
            synchronized (c11331um0) {
                c11331um0.f43856a.remove(c8012Nl0);
            }
            this.f8609p.m25236e(this.f8598e);
        }
    }

    /* renamed from: d */
    public final void m6131d(boolean z) {
        EnumC10435nm0 enumC10435nm0 = EnumC10435nm0.f38501a;
        C10307mm0 c10307mm0 = this.f8601h;
        HashSet hashSet = (HashSet) c10307mm0.f37900n.f11590b;
        boolean zAdd = z ? hashSet.add(enumC10435nm0) : hashSet.remove(enumC10435nm0);
        if (c10307mm0.f37887a == null || !zAdd) {
            return;
        }
        c10307mm0.m22949c();
    }

    /* renamed from: e */
    public final void m6132e() {
        this.f8607n.add(EnumC7960Ml0.f7325f);
        this.f8601h.m22957l();
    }

    /* renamed from: f */
    public final void m6133f(InputStream inputStream, String str) {
        setCompositionTask(AbstractC9022cm0.m10855a(str, new CallableC7043vw(inputStream, 5, str), new RunnableC0204DE(22, inputStream)));
    }

    /* renamed from: g */
    public final void m6134g(ZipInputStream zipInputStream, String str) {
        setCompositionTask(AbstractC9022cm0.m10855a(str, new CallableC7043vw(zipInputStream, 6, str), new RunnableC0204DE(23, zipInputStream)));
    }

    public EnumC7057w9 getAsyncUpdates() {
        EnumC7057w9 enumC7057w9 = this.f8601h.f37880L;
        return enumC7057w9 != null ? enumC7057w9 : EnumC7057w9.f44698a;
    }

    public boolean getAsyncUpdatesEnabled() {
        EnumC7057w9 enumC7057w9 = this.f8601h.f37880L;
        if (enumC7057w9 == null) {
            enumC7057w9 = EnumC7057w9.f44698a;
        }
        return enumC7057w9 == EnumC7057w9.f44699b;
    }

    public boolean getClipTextToBoundingBox() {
        return this.f8601h.f37908v;
    }

    public boolean getClipToCompositionBounds() {
        return this.f8601h.f37902p;
    }

    public C8532Xl0 getComposition() {
        Drawable drawable = getDrawable();
        C10307mm0 c10307mm0 = this.f8601h;
        if (drawable == c10307mm0) {
            return c10307mm0.f37887a;
        }
        return null;
    }

    public long getDuration() {
        C8532Xl0 composition = getComposition();
        if (composition != null) {
            return (long) composition.m9111b();
        }
        return 0L;
    }

    public int getFrame() {
        return (int) this.f8601h.f37888b.f45090h;
    }

    public String getImageAssetsFolder() {
        return this.f8601h.f37894h;
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.f8601h.f37901o;
    }

    public float getMaxFrame() {
        return this.f8601h.f37888b.m25695e();
    }

    public float getMinFrame() {
        return this.f8601h.f37888b.m25696h();
    }

    public KA0 getPerformanceTracker() {
        C8532Xl0 c8532Xl0 = this.f8601h.f37887a;
        if (c8532Xl0 != null) {
            return c8532Xl0.f13947a;
        }
        return null;
    }

    public float getProgress() {
        return this.f8601h.f37888b.m25694a();
    }

    public XQ0 getRenderMode() {
        return this.f8601h.f37910x ? XQ0.f13753c : XQ0.f13752b;
    }

    public int getRepeatCount() {
        return this.f8601h.f37888b.getRepeatCount();
    }

    public int getRepeatMode() {
        return this.f8601h.f37888b.getRepeatMode();
    }

    public float getSpeed() {
        return this.f8601h.f37888b.f45086d;
    }

    /* renamed from: h */
    public final void m6135h(String str, String str2) {
        setCompositionTask(AbstractC9022cm0.m10855a(str2, new CallableC8636Zl0(getContext(), str, str2, 0), null));
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if (drawable instanceof C10307mm0) {
            boolean z = ((C10307mm0) drawable).f37910x;
            XQ0 xq0 = XQ0.f13753c;
            if ((z ? xq0 : XQ0.f13752b) == xq0) {
                this.f8601h.invalidateSelf();
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        C10307mm0 c10307mm0 = this.f8601h;
        if (drawable2 == c10307mm0) {
            super.invalidateDrawable(c10307mm0);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode() || !this.f8605l) {
            return;
        }
        this.f8601h.m22957l();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        int i;
        if (!(parcelable instanceof C7908Ll0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C7908Ll0 c7908Ll0 = (C7908Ll0) parcelable;
        super.onRestoreInstanceState(c7908Ll0.getSuperState());
        this.f8602i = c7908Ll0.f6828a;
        HashSet hashSet = this.f8607n;
        EnumC7960Ml0 enumC7960Ml0 = EnumC7960Ml0.f7320a;
        if (!hashSet.contains(enumC7960Ml0) && !TextUtils.isEmpty(this.f8602i)) {
            setAnimation(this.f8602i);
        }
        this.f8603j = c7908Ll0.f6829b;
        if (!hashSet.contains(enumC7960Ml0) && (i = this.f8603j) != 0) {
            setAnimation(i);
        }
        if (!hashSet.contains(EnumC7960Ml0.f7321b)) {
            this.f8601h.m22967v(c7908Ll0.f6830c);
        }
        if (!hashSet.contains(EnumC7960Ml0.f7325f) && c7908Ll0.f6831d) {
            m6132e();
        }
        if (!hashSet.contains(EnumC7960Ml0.f7324e)) {
            setImageAssetsFolder(c7908Ll0.f6832e);
        }
        if (!hashSet.contains(EnumC7960Ml0.f7322c)) {
            setRepeatMode(c7908Ll0.f6833f);
        }
        if (hashSet.contains(EnumC7960Ml0.f7323d)) {
            return;
        }
        setRepeatCount(c7908Ll0.f6834g);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z;
        C7908Ll0 c7908Ll0 = new C7908Ll0(super.onSaveInstanceState());
        c7908Ll0.f6828a = this.f8602i;
        c7908Ll0.f6829b = this.f8603j;
        C10307mm0 c10307mm0 = this.f8601h;
        c7908Ll0.f6830c = c10307mm0.f37888b.m25694a();
        boolean zIsVisible = c10307mm0.isVisible();
        ChoreographerFrameCallbackC11586wm0 choreographerFrameCallbackC11586wm0 = c10307mm0.f37888b;
        if (zIsVisible) {
            z = choreographerFrameCallbackC11586wm0.f45095m;
        } else {
            int i = c10307mm0.f37886R;
            z = i == 2 || i == 3;
        }
        c7908Ll0.f6831d = z;
        c7908Ll0.f6832e = c10307mm0.f37894h;
        c7908Ll0.f6833f = choreographerFrameCallbackC11586wm0.getRepeatMode();
        c7908Ll0.f6834g = choreographerFrameCallbackC11586wm0.getRepeatCount();
        return c7908Ll0;
    }

    public void setAnimation(final int i) {
        C11331um0 c11331um0M10855a;
        C11331um0 c11331um0;
        this.f8603j = i;
        final String str = null;
        this.f8602i = null;
        if (isInEditMode()) {
            c11331um0 = new C11331um0(new X50(this, i, 1), true);
        } else {
            if (this.f8606m) {
                Context context = getContext();
                final String strM10864j = AbstractC9022cm0.m10864j(context, i);
                final WeakReference weakReference = new WeakReference(context);
                final Context applicationContext = context.getApplicationContext();
                c11331um0M10855a = AbstractC9022cm0.m10855a(strM10864j, new Callable() { // from class: bm0
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        Context context2 = (Context) weakReference.get();
                        if (context2 == null) {
                            context2 = applicationContext;
                        }
                        return AbstractC9022cm0.m10859e(context2, i, strM10864j);
                    }
                }, null);
            } else {
                Context context2 = getContext();
                HashMap map = AbstractC9022cm0.f17734a;
                final WeakReference weakReference2 = new WeakReference(context2);
                final Context applicationContext2 = context2.getApplicationContext();
                c11331um0M10855a = AbstractC9022cm0.m10855a(null, new Callable() { // from class: bm0
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        Context context22 = (Context) weakReference2.get();
                        if (context22 == null) {
                            context22 = applicationContext2;
                        }
                        return AbstractC9022cm0.m10859e(context22, i, str);
                    }
                }, null);
            }
            c11331um0 = c11331um0M10855a;
        }
        setCompositionTask(c11331um0);
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        m6133f(new ByteArrayInputStream(str.getBytes()), null);
    }

    public void setAnimationFromUrl(String str) {
        C11331um0 c11331um0M10855a;
        if (this.f8606m) {
            Context context = getContext();
            HashMap map = AbstractC9022cm0.f17734a;
            String strM26245v = AbstractC7222ym.m26245v("url_", str);
            c11331um0M10855a = AbstractC9022cm0.m10855a(strM26245v, new CallableC8636Zl0(context, str, strM26245v, 0), null);
        } else {
            c11331um0M10855a = AbstractC9022cm0.m10855a(null, new CallableC8636Zl0(getContext(), str, null, 0), null);
        }
        setCompositionTask(c11331um0M10855a);
    }

    public void setApplyingOpacityToLayersEnabled(boolean z) {
        this.f8601h.f37907u = z;
    }

    public void setAsyncUpdates(EnumC7057w9 enumC7057w9) {
        this.f8601h.f37880L = enumC7057w9;
    }

    public void setCacheComposition(boolean z) {
        this.f8606m = z;
    }

    public void setClipTextToBoundingBox(boolean z) {
        C10307mm0 c10307mm0 = this.f8601h;
        if (z != c10307mm0.f37908v) {
            c10307mm0.f37908v = z;
            c10307mm0.invalidateSelf();
        }
    }

    public void setClipToCompositionBounds(boolean z) {
        C10307mm0 c10307mm0 = this.f8601h;
        if (z != c10307mm0.f37902p) {
            c10307mm0.f37902p = z;
            C4210hw c4210hw = c10307mm0.f37903q;
            if (c4210hw != null) {
                c4210hw.f28686J = z;
            }
            c10307mm0.invalidateSelf();
        }
    }

    public void setComposition(C8532Xl0 c8532Xl0) {
        C10307mm0 c10307mm0 = this.f8601h;
        c10307mm0.setCallback(this);
        boolean z = true;
        this.f8604k = true;
        if (c10307mm0.f37887a == c8532Xl0) {
            z = false;
        } else {
            c10307mm0.f37879K = true;
            c10307mm0.m22950d();
            c10307mm0.f37887a = c8532Xl0;
            c10307mm0.m22949c();
            ChoreographerFrameCallbackC11586wm0 choreographerFrameCallbackC11586wm0 = c10307mm0.f37888b;
            boolean z2 = choreographerFrameCallbackC11586wm0.f45094l == null;
            choreographerFrameCallbackC11586wm0.f45094l = c8532Xl0;
            if (z2) {
                choreographerFrameCallbackC11586wm0.m25702n(Math.max(choreographerFrameCallbackC11586wm0.f45092j, c8532Xl0.f13958l), Math.min(choreographerFrameCallbackC11586wm0.f45093k, c8532Xl0.f13959m));
            } else {
                choreographerFrameCallbackC11586wm0.m25702n((int) c8532Xl0.f13958l, (int) c8532Xl0.f13959m);
            }
            float f = choreographerFrameCallbackC11586wm0.f45090h;
            choreographerFrameCallbackC11586wm0.f45090h = 0.0f;
            choreographerFrameCallbackC11586wm0.f45089g = 0.0f;
            choreographerFrameCallbackC11586wm0.m25701m((int) f);
            choreographerFrameCallbackC11586wm0.m25699k();
            c10307mm0.m22967v(choreographerFrameCallbackC11586wm0.getAnimatedFraction());
            ArrayList arrayList = c10307mm0.f37892f;
            Iterator it = new ArrayList(arrayList).iterator();
            while (it.hasNext()) {
                InterfaceC10179lm0 interfaceC10179lm0 = (InterfaceC10179lm0) it.next();
                if (interfaceC10179lm0 != null) {
                    interfaceC10179lm0.run();
                }
                it.remove();
            }
            arrayList.clear();
            c8532Xl0.f13947a.f5927a = c10307mm0.f37905s;
            c10307mm0.m22951e();
            Drawable.Callback callback = c10307mm0.getCallback();
            if (callback instanceof ImageView) {
                ImageView imageView = (ImageView) callback;
                imageView.setImageDrawable(null);
                imageView.setImageDrawable(c10307mm0);
            }
        }
        if (this.f8605l) {
            c10307mm0.m22957l();
        }
        this.f8604k = false;
        if (getDrawable() != c10307mm0 || z) {
            if (!z) {
                boolean zM22955j = c10307mm0.m22955j();
                setImageDrawable(null);
                setImageDrawable(c10307mm0);
                if (zM22955j) {
                    c10307mm0.m22959n();
                }
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            Iterator it2 = this.f8608o.iterator();
            while (it2.hasNext()) {
                LottieAnimationViewManager.createViewInstance$lambda$1(((C8168Ql0) it2.next()).f9761a, c8532Xl0);
            }
        }
    }

    public void setDefaultFontFileExtension(String str) {
        C10307mm0 c10307mm0 = this.f8601h;
        c10307mm0.f37897k = str;
        U41 u41M22954i = c10307mm0.m22954i();
        if (u41M22954i != null) {
            u41M22954i.f11649f = str;
        }
    }

    public void setFailureListener(InterfaceC10819qm0 interfaceC10819qm0) {
        this.f8599f = interfaceC10819qm0;
    }

    public void setFallbackResource(int i) {
        this.f8600g = i;
    }

    public void setFontAssetDelegate(AbstractC1165SW abstractC1165SW) {
        C10307mm0 c10307mm0 = this.f8601h;
        c10307mm0.f37898l = abstractC1165SW;
        U41 u41 = c10307mm0.f37895i;
        if (u41 != null) {
            u41.f11648e = abstractC1165SW;
        }
    }

    public void setFontMap(Map<String, Typeface> map) {
        C10307mm0 c10307mm0 = this.f8601h;
        if (map == c10307mm0.f37896j) {
            return;
        }
        c10307mm0.f37896j = map;
        c10307mm0.invalidateSelf();
    }

    public void setFrame(int i) {
        this.f8601h.m22960o(i);
    }

    @Deprecated
    public void setIgnoreDisabledSystemAnimations(boolean z) {
        this.f8601h.f37890d = z;
    }

    public void setImageAssetDelegate(InterfaceC10863r60 interfaceC10863r60) {
        C10189lr0 c10189lr0 = this.f8601h.f37893g;
    }

    public void setImageAssetsFolder(String str) {
        this.f8601h.f37894h = str;
    }

    @Override // p000.C0888O6, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.f8603j = 0;
        this.f8602i = null;
        m6130c();
        super.setImageBitmap(bitmap);
    }

    @Override // p000.C0888O6, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.f8603j = 0;
        this.f8602i = null;
        m6130c();
        super.setImageDrawable(drawable);
    }

    @Override // p000.C0888O6, android.widget.ImageView
    public void setImageResource(int i) {
        this.f8603j = 0;
        this.f8602i = null;
        m6130c();
        super.setImageResource(i);
    }

    public void setMaintainOriginalImageBounds(boolean z) {
        this.f8601h.f37901o = z;
    }

    public void setMaxFrame(int i) {
        this.f8601h.m22961p(i);
    }

    public void setMaxProgress(float f) {
        C10307mm0 c10307mm0 = this.f8601h;
        C8532Xl0 c8532Xl0 = c10307mm0.f37887a;
        if (c8532Xl0 == null) {
            c10307mm0.f37892f.add(new C9795im0(c10307mm0, f, 0));
            return;
        }
        float fM10353e = AbstractC8778as0.m10353e(c8532Xl0.f13958l, c8532Xl0.f13959m, f);
        ChoreographerFrameCallbackC11586wm0 choreographerFrameCallbackC11586wm0 = c10307mm0.f37888b;
        choreographerFrameCallbackC11586wm0.m25702n(choreographerFrameCallbackC11586wm0.f45092j, fM10353e);
    }

    public void setMinAndMaxFrame(String str) {
        this.f8601h.m22964s(str);
    }

    public void setMinFrame(int i) {
        this.f8601h.m22965t(i);
    }

    public void setMinProgress(float f) {
        C10307mm0 c10307mm0 = this.f8601h;
        C8532Xl0 c8532Xl0 = c10307mm0.f37887a;
        if (c8532Xl0 == null) {
            c10307mm0.f37892f.add(new C9795im0(c10307mm0, f, 1));
        } else {
            c10307mm0.m22965t((int) AbstractC8778as0.m10353e(c8532Xl0.f13958l, c8532Xl0.f13959m, f));
        }
    }

    public void setOutlineMasksAndMattes(boolean z) {
        C10307mm0 c10307mm0 = this.f8601h;
        if (c10307mm0.f37906t == z) {
            return;
        }
        c10307mm0.f37906t = z;
        C4210hw c4210hw = c10307mm0.f37903q;
        if (c4210hw != null) {
            c4210hw.mo18917r(z);
        }
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        C10307mm0 c10307mm0 = this.f8601h;
        c10307mm0.f37905s = z;
        C8532Xl0 c8532Xl0 = c10307mm0.f37887a;
        if (c8532Xl0 != null) {
            c8532Xl0.f13947a.f5927a = z;
        }
    }

    public void setProgress(float f) {
        this.f8607n.add(EnumC7960Ml0.f7321b);
        this.f8601h.m22967v(f);
    }

    public void setRenderMode(XQ0 xq0) {
        C10307mm0 c10307mm0 = this.f8601h;
        c10307mm0.f37909w = xq0;
        c10307mm0.m22951e();
    }

    public void setRepeatCount(int i) {
        this.f8607n.add(EnumC7960Ml0.f7323d);
        this.f8601h.f37888b.setRepeatCount(i);
    }

    public void setRepeatMode(int i) {
        this.f8607n.add(EnumC7960Ml0.f7322c);
        this.f8601h.f37888b.setRepeatMode(i);
    }

    public void setSafeMode(boolean z) {
        this.f8601h.f37891e = z;
    }

    public void setSpeed(float f) {
        this.f8601h.f37888b.f45086d = f;
    }

    public void setTextDelegate(C9974k91 c9974k91) {
        this.f8601h.f37899m = c9974k91;
    }

    public void setUseCompositionFrameRate(boolean z) {
        this.f8601h.f37888b.f45096n = z;
    }

    @Override // android.view.View
    public final void unscheduleDrawable(Drawable drawable) {
        C10307mm0 c10307mm0;
        if (!this.f8604k && drawable == (c10307mm0 = this.f8601h) && c10307mm0.m22955j()) {
            this.f8605l = false;
            c10307mm0.m22956k();
        } else if (!this.f8604k && (drawable instanceof C10307mm0)) {
            C10307mm0 c10307mm02 = (C10307mm0) drawable;
            if (c10307mm02.m22955j()) {
                c10307mm02.m22956k();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    public void setMaxFrame(String str) {
        this.f8601h.m22962q(str);
    }

    public void setMinFrame(String str) {
        this.f8601h.m22966u(str);
    }

    public void setAnimation(String str) {
        C11331um0 c11331um0M10855a;
        C11331um0 c11331um0;
        this.f8602i = str;
        this.f8603j = 0;
        if (isInEditMode()) {
            c11331um0 = new C11331um0(new CallableC7043vw(this, 4, str), true);
        } else {
            if (this.f8606m) {
                Context context = getContext();
                HashMap map = AbstractC9022cm0.f17734a;
                String strM26245v = AbstractC7222ym.m26245v("asset_", str);
                c11331um0M10855a = AbstractC9022cm0.m10855a(strM26245v, new CallableC8636Zl0(context.getApplicationContext(), str, strM26245v, 1), null);
            } else {
                Context context2 = getContext();
                HashMap map2 = AbstractC9022cm0.f17734a;
                c11331um0M10855a = AbstractC9022cm0.m10855a(null, new CallableC8636Zl0(context2.getApplicationContext(), str, null, 1), null);
            }
            c11331um0 = c11331um0M10855a;
        }
        setCompositionTask(c11331um0);
    }
}
