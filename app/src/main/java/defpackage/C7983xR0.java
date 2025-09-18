package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.bumptech.glide.a;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* renamed from: xR0 */
/* loaded from: classes.dex */
public class C7983xR0 extends AbstractC0116Bg {
    protected static final PR0 DOWNLOAD_ONLY_OPTIONS = (PR0) ((PR0) ((PR0) new PR0().diskCacheStrategy(AbstractC3750fK.b)).priority(EnumC7561vD0.d)).skipMemoryCache(true);
    private final Context context;
    private C7983xR0 errorBuilder;
    private final a glide;
    private final C7903x10 glideContext;
    private boolean isDefaultTransitionOptionsSet;
    private boolean isModelSet;
    private boolean isThumbnailBuilt;
    private Object model;
    private List<FR0> requestListeners;
    private final JR0 requestManager;
    private Float thumbSizeMultiplier;
    private C7983xR0 thumbnailBuilder;
    private final Class<Object> transcodeClass;
    private AbstractC0808Kc1 transitionOptions;

    public C7983xR0(a aVar, JR0 jr0, Class cls, Context context) {
        this.isDefaultTransitionOptionsSet = true;
        this.glide = aVar;
        this.requestManager = jr0;
        this.transcodeClass = cls;
        this.context = context;
        this.transitionOptions = jr0.getDefaultTransitionOptions(cls);
        this.glideContext = aVar.d;
        Iterator<FR0> it = jr0.getDefaultRequestListeners().iterator();
        while (it.hasNext()) {
            addListener(it.next());
        }
        apply((AbstractC0116Bg) jr0.getDefaultRequestOptions());
    }

    public C7983xR0 addListener(FR0 fr0) {
        if (isAutoCloneEnabled()) {
            return mo0clone().addListener(fr0);
        }
        if (fr0 != null) {
            if (this.requestListeners == null) {
                this.requestListeners = new ArrayList();
            }
            this.requestListeners.add(fr0);
        }
        return (C7983xR0) selfOrThrowIfLocked();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final InterfaceC6839rR0 c(int i, int i2, AbstractC0116Bg abstractC0116Bg, EnumC7561vD0 enumC7561vD0, InterfaceC8173yR0 interfaceC8173yR0, FR0 fr0, A81 a81, AbstractC0808Kc1 abstractC0808Kc1, Object obj, Executor executor) {
        C3384dP c3384dP;
        InterfaceC8173yR0 c3384dP2;
        J11 j11G;
        if (this.errorBuilder != null) {
            c3384dP2 = new C3384dP(obj, interfaceC8173yR0);
            c3384dP = c3384dP2;
        } else {
            c3384dP = 0;
            c3384dP2 = interfaceC8173yR0;
        }
        C7983xR0 c7983xR0 = this.thumbnailBuilder;
        if (c7983xR0 != null) {
            if (this.isThumbnailBuilt) {
                throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
            }
            AbstractC0808Kc1 abstractC0808Kc12 = c7983xR0.isDefaultTransitionOptionsSet ? abstractC0808Kc1 : c7983xR0.transitionOptions;
            EnumC7561vD0 priority = c7983xR0.isPrioritySet() ? this.thumbnailBuilder.getPriority() : d(enumC7561vD0);
            int overrideWidth = this.thumbnailBuilder.getOverrideWidth();
            int overrideHeight = this.thumbnailBuilder.getOverrideHeight();
            if (AbstractC0121Bh1.j(i, i2) && !this.thumbnailBuilder.isValidOverride()) {
                overrideWidth = abstractC0116Bg.getOverrideWidth();
                overrideHeight = abstractC0116Bg.getOverrideHeight();
            }
            C4373ia1 c4373ia1 = new C4373ia1(obj, c3384dP2);
            C4373ia1 c4373ia12 = c4373ia1;
            J11 j11G2 = g(i, i2, abstractC0116Bg, enumC7561vD0, c4373ia1, fr0, a81, abstractC0808Kc1, obj, executor);
            this.isThumbnailBuilt = true;
            C7983xR0 c7983xR02 = this.thumbnailBuilder;
            InterfaceC6839rR0 interfaceC6839rR0C = c7983xR02.c(overrideWidth, overrideHeight, c7983xR02, priority, c4373ia12, fr0, a81, abstractC0808Kc12, obj, executor);
            this.isThumbnailBuilt = false;
            c4373ia12.c = j11G2;
            c4373ia12.d = interfaceC6839rR0C;
            j11G = c4373ia12;
        } else if (this.thumbSizeMultiplier != null) {
            C4373ia1 c4373ia13 = new C4373ia1(obj, c3384dP2);
            J11 j11G3 = g(i, i2, abstractC0116Bg, enumC7561vD0, c4373ia13, fr0, a81, abstractC0808Kc1, obj, executor);
            J11 j11G4 = g(i, i2, abstractC0116Bg.mo0clone().sizeMultiplier(this.thumbSizeMultiplier.floatValue()), d(enumC7561vD0), c4373ia13, fr0, a81, abstractC0808Kc1, obj, executor);
            c4373ia13.c = j11G3;
            c4373ia13.d = j11G4;
            j11G = c4373ia13;
        } else {
            j11G = g(i, i2, abstractC0116Bg, enumC7561vD0, c3384dP2, fr0, a81, abstractC0808Kc1, obj, executor);
        }
        if (c3384dP == 0) {
            return j11G;
        }
        int overrideWidth2 = this.errorBuilder.getOverrideWidth();
        int overrideHeight2 = this.errorBuilder.getOverrideHeight();
        if (AbstractC0121Bh1.j(i, i2) && !this.errorBuilder.isValidOverride()) {
            overrideWidth2 = abstractC0116Bg.getOverrideWidth();
            overrideHeight2 = abstractC0116Bg.getOverrideHeight();
        }
        int i3 = overrideHeight2;
        int i4 = overrideWidth2;
        C7983xR0 c7983xR03 = this.errorBuilder;
        InterfaceC6839rR0 interfaceC6839rR0C2 = c7983xR03.c(i4, i3, this.errorBuilder, c7983xR03.getPriority(), c3384dP, fr0, a81, c7983xR03.transitionOptions, obj, executor);
        c3384dP.c = j11G;
        c3384dP.d = interfaceC6839rR0C2;
        return c3384dP;
    }

    public final EnumC7561vD0 d(EnumC7561vD0 enumC7561vD0) {
        int iOrdinal = enumC7561vD0.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            return EnumC7561vD0.a;
        }
        if (iOrdinal == 2) {
            return EnumC7561vD0.b;
        }
        if (iOrdinal == 3) {
            return EnumC7561vD0.c;
        }
        throw new IllegalArgumentException("unknown priority: " + getPriority());
    }

    @Deprecated
    public <Y extends A81> Y downloadOnly(Y y) {
        return (Y) getDownloadOnlyRequest().into((C7983xR0) y);
    }

    public final void e(A81 a81, FR0 fr0, AbstractC0116Bg abstractC0116Bg, Executor executor) {
        IL1.c(a81);
        if (!this.isModelSet) {
            throw new IllegalArgumentException("You must call #load() before calling #into()");
        }
        Object obj = new Object();
        AbstractC0808Kc1 abstractC0808Kc1 = this.transitionOptions;
        InterfaceC6839rR0 interfaceC6839rR0C = c(abstractC0116Bg.getOverrideWidth(), abstractC0116Bg.getOverrideHeight(), abstractC0116Bg, abstractC0116Bg.getPriority(), null, fr0, a81, abstractC0808Kc1, obj, executor);
        InterfaceC6839rR0 interfaceC6839rR0H = a81.h();
        if (!interfaceC6839rR0C.b(interfaceC6839rR0H) || (!abstractC0116Bg.isMemoryCacheable() && interfaceC6839rR0H.k())) {
            this.requestManager.clear(a81);
            a81.c(interfaceC6839rR0C);
            this.requestManager.track(a81, interfaceC6839rR0C);
        } else {
            IL1.d(interfaceC6839rR0H, "Argument must not be null");
            if (interfaceC6839rR0H.isRunning()) {
                return;
            }
            interfaceC6839rR0H.j();
        }
    }

    @Override // defpackage.AbstractC0116Bg
    public boolean equals(Object obj) {
        if (!(obj instanceof C7983xR0)) {
            return false;
        }
        C7983xR0 c7983xR0 = (C7983xR0) obj;
        return super.equals(c7983xR0) && Objects.equals(this.transcodeClass, c7983xR0.transcodeClass) && this.transitionOptions.equals(c7983xR0.transitionOptions) && Objects.equals(this.model, c7983xR0.model) && Objects.equals(this.requestListeners, c7983xR0.requestListeners) && Objects.equals(this.thumbnailBuilder, c7983xR0.thumbnailBuilder) && Objects.equals(this.errorBuilder, c7983xR0.errorBuilder) && Objects.equals(this.thumbSizeMultiplier, c7983xR0.thumbSizeMultiplier) && this.isDefaultTransitionOptionsSet == c7983xR0.isDefaultTransitionOptionsSet && this.isModelSet == c7983xR0.isModelSet;
    }

    public C7983xR0 error(C7983xR0 c7983xR0) {
        if (isAutoCloneEnabled()) {
            return mo0clone().error(c7983xR0);
        }
        this.errorBuilder = c7983xR0;
        return (C7983xR0) selfOrThrowIfLocked();
    }

    public final C7983xR0 f(Object obj) {
        if (isAutoCloneEnabled()) {
            return mo0clone().f(obj);
        }
        this.model = obj;
        this.isModelSet = true;
        return (C7983xR0) selfOrThrowIfLocked();
    }

    public final J11 g(int i, int i2, AbstractC0116Bg abstractC0116Bg, EnumC7561vD0 enumC7561vD0, InterfaceC8173yR0 interfaceC8173yR0, FR0 fr0, A81 a81, AbstractC0808Kc1 abstractC0808Kc1, Object obj, Executor executor) {
        Context context = this.context;
        C7903x10 c7903x10 = this.glideContext;
        Object obj2 = this.model;
        Class<Object> cls = this.transcodeClass;
        List<FR0> list = this.requestListeners;
        EO eo = c7903x10.g;
        abstractC0808Kc1.getClass();
        return new J11(context, c7903x10, obj, obj2, cls, abstractC0116Bg, i, i2, enumC7561vD0, a81, fr0, list, interfaceC8173yR0, eo, executor);
    }

    public C7983xR0 getDownloadOnlyRequest() {
        return new C7983xR0(File.class, this).apply((AbstractC0116Bg) DOWNLOAD_ONLY_OPTIONS);
    }

    public JR0 getRequestManager() {
        return this.requestManager;
    }

    @Override // defpackage.AbstractC0116Bg
    public int hashCode() {
        return AbstractC0121Bh1.g(this.isModelSet ? 1 : 0, AbstractC0121Bh1.g(this.isDefaultTransitionOptionsSet ? 1 : 0, AbstractC0121Bh1.h(AbstractC0121Bh1.h(AbstractC0121Bh1.h(AbstractC0121Bh1.h(AbstractC0121Bh1.h(AbstractC0121Bh1.h(AbstractC0121Bh1.h(super.hashCode(), this.transcodeClass), this.transitionOptions), this.model), this.requestListeners), this.thumbnailBuilder), this.errorBuilder), this.thumbSizeMultiplier)));
    }

    public <Y extends A81> Y into(Y y) {
        return (Y) into(y, null, AbstractC8451zu1.b);
    }

    public C7983xR0 listener(FR0 fr0) {
        if (isAutoCloneEnabled()) {
            return mo0clone().listener(fr0);
        }
        this.requestListeners = null;
        return addListener(fr0);
    }

    /* renamed from: load */
    public C7983xR0 m38load(Object obj) {
        return f(obj);
    }

    public A81 preload(int i, int i2) {
        return into((C7983xR0) new ZC0(this.requestManager, i, i2));
    }

    public RZ submit() {
        return submit(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public C7983xR0 thumbnail(C7983xR0 c7983xR0) {
        if (isAutoCloneEnabled()) {
            return mo0clone().thumbnail(c7983xR0);
        }
        this.thumbnailBuilder = c7983xR0;
        return (C7983xR0) selfOrThrowIfLocked();
    }

    public C7983xR0 transition(AbstractC0808Kc1 abstractC0808Kc1) {
        if (isAutoCloneEnabled()) {
            return mo0clone().transition(abstractC0808Kc1);
        }
        IL1.d(abstractC0808Kc1, "Argument must not be null");
        this.transitionOptions = abstractC0808Kc1;
        this.isDefaultTransitionOptionsSet = false;
        return (C7983xR0) selfOrThrowIfLocked();
    }

    @Override // defpackage.AbstractC0116Bg
    public C7983xR0 apply(AbstractC0116Bg abstractC0116Bg) {
        IL1.c(abstractC0116Bg);
        return (C7983xR0) super.apply(abstractC0116Bg);
    }

    @Deprecated
    public RZ downloadOnly(int i, int i2) {
        return getDownloadOnlyRequest().submit(i, i2);
    }

    public <Y extends A81> Y into(Y y, FR0 fr0, Executor executor) {
        e(y, fr0, this, executor);
        return y;
    }

    /* renamed from: load */
    public C7983xR0 m33load(Bitmap bitmap) {
        return f(bitmap).apply((AbstractC0116Bg) PR0.diskCacheStrategyOf(AbstractC3750fK.a));
    }

    public RZ submit(int i, int i2) {
        BR0 br0 = new BR0(i, i2);
        return (RZ) into(br0, br0, AbstractC8451zu1.c);
    }

    @Override // defpackage.AbstractC0116Bg
    /* renamed from: clone */
    public C7983xR0 mo0clone() {
        C7983xR0 c7983xR0 = (C7983xR0) super.mo0clone();
        c7983xR0.transitionOptions = c7983xR0.transitionOptions.clone();
        if (c7983xR0.requestListeners != null) {
            c7983xR0.requestListeners = new ArrayList(c7983xR0.requestListeners);
        }
        C7983xR0 c7983xR02 = c7983xR0.thumbnailBuilder;
        if (c7983xR02 != null) {
            c7983xR0.thumbnailBuilder = c7983xR02.mo0clone();
        }
        C7983xR0 c7983xR03 = c7983xR0.errorBuilder;
        if (c7983xR03 != null) {
            c7983xR0.errorBuilder = c7983xR03.mo0clone();
        }
        return c7983xR0;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public defpackage.AbstractC7664vl1 into(android.widget.ImageView r4) {
        /*
            r3 = this;
            defpackage.AbstractC0121Bh1.a()
            defpackage.IL1.c(r4)
            boolean r0 = r3.isTransformationSet()
            if (r0 != 0) goto L4c
            boolean r0 = r3.isTransformationAllowed()
            if (r0 == 0) goto L4c
            android.widget.ImageView$ScaleType r0 = r4.getScaleType()
            if (r0 == 0) goto L4c
            int[] r0 = defpackage.AbstractC7603vR0.a
            android.widget.ImageView$ScaleType r1 = r4.getScaleType()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L43;
                case 2: goto L3a;
                case 3: goto L31;
                case 4: goto L31;
                case 5: goto L31;
                case 6: goto L28;
                default: goto L27;
            }
        L27:
            goto L4c
        L28:
            Bg r0 = r3.mo0clone()
            Bg r0 = r0.optionalCenterInside()
            goto L4d
        L31:
            Bg r0 = r3.mo0clone()
            Bg r0 = r0.optionalFitCenter()
            goto L4d
        L3a:
            Bg r0 = r3.mo0clone()
            Bg r0 = r0.optionalCenterInside()
            goto L4d
        L43:
            Bg r0 = r3.mo0clone()
            Bg r0 = r0.optionalCenterCrop()
            goto L4d
        L4c:
            r0 = r3
        L4d:
            x10 r1 = r3.glideContext
            java.lang.Class<java.lang.Object> r2 = r3.transcodeClass
            OJ1 r1 = r1.c
            r1.getClass()
            java.lang.Class<android.graphics.Bitmap> r1 = android.graphics.Bitmap.class
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L65
            ci r1 = new ci
            r2 = 0
            r1.<init>(r4, r2)
            goto L73
        L65:
            java.lang.Class<android.graphics.drawable.Drawable> r1 = android.graphics.drawable.Drawable.class
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 == 0) goto L7a
            ci r1 = new ci
            r2 = 1
            r1.<init>(r4, r2)
        L73:
            TJ r4 = defpackage.AbstractC8451zu1.b
            r2 = 0
            r3.e(r1, r2, r0, r4)
            return r1
        L7a:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unhandled class: "
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r1 = ", try .as*(Class).transcode(ResourceTranscoder)"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7983xR0.into(android.widget.ImageView):vl1");
    }

    /* renamed from: load */
    public C7983xR0 m34load(Drawable drawable) {
        return f(drawable).apply((AbstractC0116Bg) PR0.diskCacheStrategyOf(AbstractC3750fK.a));
    }

    /* renamed from: load */
    public C7983xR0 m39load(String str) {
        return f(str);
    }

    public A81 preload() {
        return preload(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    /* renamed from: load */
    public C7983xR0 m35load(Uri uri) {
        return f(uri);
    }

    public C7983xR0 thumbnail(float f) {
        if (isAutoCloneEnabled()) {
            return mo0clone().thumbnail(f);
        }
        if (f >= 0.0f && f <= 1.0f) {
            this.thumbSizeMultiplier = Float.valueOf(f);
            return (C7983xR0) selfOrThrowIfLocked();
        }
        throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
    }

    /* renamed from: load */
    public C7983xR0 m36load(File file) {
        return f(file);
    }

    /* renamed from: load */
    public C7983xR0 m37load(Integer num) throws PackageManager.NameNotFoundException {
        C7983xR0 c7983xR0F = f(num);
        Context context = this.context;
        return c7983xR0F.apply((AbstractC0116Bg) PR0.signatureOf(new C4(context.getResources().getConfiguration().uiMode & 48, AbstractC3714f8.a(context))));
    }

    /* renamed from: load */
    public C7983xR0 m40load(URL url) {
        return f(url);
    }

    /* renamed from: load */
    public C7983xR0 m41load(byte[] bArr) {
        C7983xR0 c7983xR0F = f(bArr);
        if (!c7983xR0F.isDiskCacheStrategySet()) {
            c7983xR0F = c7983xR0F.apply((AbstractC0116Bg) PR0.diskCacheStrategyOf(AbstractC3750fK.a));
        }
        return !c7983xR0F.isSkipMemoryCacheSet() ? c7983xR0F.apply((AbstractC0116Bg) PR0.skipMemoryCacheOf(true)) : c7983xR0F;
    }

    public C7983xR0(Class cls, C7983xR0 c7983xR0) {
        this(c7983xR0.glide, c7983xR0.requestManager, cls, c7983xR0.context);
        this.model = c7983xR0.model;
        this.isModelSet = c7983xR0.isModelSet;
        apply((AbstractC0116Bg) c7983xR0);
    }

    @Deprecated
    public RZ into(int i, int i2) {
        return submit(i, i2);
    }
}
