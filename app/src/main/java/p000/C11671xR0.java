package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.bumptech.glide.ComponentCallbacks2C1874a;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* renamed from: xR0 */
/* loaded from: classes.dex */
public class C11671xR0 extends AbstractC0106Bg {
    protected static final PR0 DOWNLOAD_ONLY_OPTIONS = (PR0) ((PR0) ((PR0) new PR0().diskCacheStrategy(AbstractC4046fK.f27137b)).priority(EnumC11389vD0.f44275d)).skipMemoryCache(true);
    private final Context context;
    private C11671xR0 errorBuilder;
    private final ComponentCallbacks2C1874a glide;
    private final C11617x10 glideContext;
    private boolean isDefaultTransitionOptionsSet;
    private boolean isModelSet;
    private boolean isThumbnailBuilt;
    private Object model;
    private List<FR0> requestListeners;
    private final JR0 requestManager;
    private Float thumbSizeMultiplier;
    private C11671xR0 thumbnailBuilder;
    private final Class<Object> transcodeClass;
    private AbstractC7839Kc1 transitionOptions;

    public C11671xR0(ComponentCallbacks2C1874a componentCallbacks2C1874a, JR0 jr0, Class cls, Context context) {
        this.isDefaultTransitionOptionsSet = true;
        this.glide = componentCallbacks2C1874a;
        this.requestManager = jr0;
        this.transcodeClass = cls;
        this.context = context;
        this.transitionOptions = jr0.getDefaultTransitionOptions(cls);
        this.glideContext = componentCallbacks2C1874a.f17776d;
        Iterator<FR0> it = jr0.getDefaultRequestListeners().iterator();
        while (it.hasNext()) {
            addListener(it.next());
        }
        apply((AbstractC0106Bg) jr0.getDefaultRequestOptions());
    }

    public C11671xR0 addListener(FR0 fr0) {
        if (isAutoCloneEnabled()) {
            return mo26596clone().addListener(fr0);
        }
        if (fr0 != null) {
            if (this.requestListeners == null) {
                this.requestListeners = new ArrayList();
            }
            this.requestListeners.add(fr0);
        }
        return (C11671xR0) selfOrThrowIfLocked();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public final InterfaceC10905rR0 m25889c(int i, int i2, AbstractC0106Bg abstractC0106Bg, EnumC11389vD0 enumC11389vD0, InterfaceC11798yR0 interfaceC11798yR0, FR0 fr0, A81 a81, AbstractC7839Kc1 abstractC7839Kc1, Object obj, Executor executor) {
        C3926dP c3926dP;
        InterfaceC11798yR0 c3926dP2;
        J11 j11M25893g;
        if (this.errorBuilder != null) {
            c3926dP2 = new C3926dP(obj, interfaceC11798yR0);
            c3926dP = c3926dP2;
        } else {
            c3926dP = 0;
            c3926dP2 = interfaceC11798yR0;
        }
        C11671xR0 c11671xR0 = this.thumbnailBuilder;
        if (c11671xR0 != null) {
            if (this.isThumbnailBuilt) {
                throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
            }
            AbstractC7839Kc1 abstractC7839Kc12 = c11671xR0.isDefaultTransitionOptionsSet ? abstractC7839Kc1 : c11671xR0.transitionOptions;
            EnumC11389vD0 priority = c11671xR0.isPrioritySet() ? this.thumbnailBuilder.getPriority() : m25890d(enumC11389vD0);
            int overrideWidth = this.thumbnailBuilder.getOverrideWidth();
            int overrideHeight = this.thumbnailBuilder.getOverrideHeight();
            if (AbstractC7381Bh1.m811j(i, i2) && !this.thumbnailBuilder.isValidOverride()) {
                overrideWidth = abstractC0106Bg.getOverrideWidth();
                overrideHeight = abstractC0106Bg.getOverrideHeight();
            }
            C9772ia1 c9772ia1 = new C9772ia1(obj, c3926dP2);
            C9772ia1 c9772ia12 = c9772ia1;
            J11 j11M25893g2 = m25893g(i, i2, abstractC0106Bg, enumC11389vD0, c9772ia1, fr0, a81, abstractC7839Kc1, obj, executor);
            this.isThumbnailBuilt = true;
            C11671xR0 c11671xR02 = this.thumbnailBuilder;
            InterfaceC10905rR0 interfaceC10905rR0M25889c = c11671xR02.m25889c(overrideWidth, overrideHeight, c11671xR02, priority, c9772ia12, fr0, a81, abstractC7839Kc12, obj, executor);
            this.isThumbnailBuilt = false;
            c9772ia12.f29331c = j11M25893g2;
            c9772ia12.f29332d = interfaceC10905rR0M25889c;
            j11M25893g = c9772ia12;
        } else if (this.thumbSizeMultiplier != null) {
            C9772ia1 c9772ia13 = new C9772ia1(obj, c3926dP2);
            J11 j11M25893g3 = m25893g(i, i2, abstractC0106Bg, enumC11389vD0, c9772ia13, fr0, a81, abstractC7839Kc1, obj, executor);
            J11 j11M25893g4 = m25893g(i, i2, abstractC0106Bg.mo26596clone().sizeMultiplier(this.thumbSizeMultiplier.floatValue()), m25890d(enumC11389vD0), c9772ia13, fr0, a81, abstractC7839Kc1, obj, executor);
            c9772ia13.f29331c = j11M25893g3;
            c9772ia13.f29332d = j11M25893g4;
            j11M25893g = c9772ia13;
        } else {
            j11M25893g = m25893g(i, i2, abstractC0106Bg, enumC11389vD0, c3926dP2, fr0, a81, abstractC7839Kc1, obj, executor);
        }
        if (c3926dP == 0) {
            return j11M25893g;
        }
        int overrideWidth2 = this.errorBuilder.getOverrideWidth();
        int overrideHeight2 = this.errorBuilder.getOverrideHeight();
        if (AbstractC7381Bh1.m811j(i, i2) && !this.errorBuilder.isValidOverride()) {
            overrideWidth2 = abstractC0106Bg.getOverrideWidth();
            overrideHeight2 = abstractC0106Bg.getOverrideHeight();
        }
        int i3 = overrideHeight2;
        int i4 = overrideWidth2;
        C11671xR0 c11671xR03 = this.errorBuilder;
        InterfaceC10905rR0 interfaceC10905rR0M25889c2 = c11671xR03.m25889c(i4, i3, this.errorBuilder, c11671xR03.getPriority(), c3926dP, fr0, a81, c11671xR03.transitionOptions, obj, executor);
        c3926dP.f26016c = j11M25893g;
        c3926dP.f26017d = interfaceC10905rR0M25889c2;
        return c3926dP;
    }

    /* renamed from: d */
    public final EnumC11389vD0 m25890d(EnumC11389vD0 enumC11389vD0) {
        int iOrdinal = enumC11389vD0.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            return EnumC11389vD0.f44272a;
        }
        if (iOrdinal == 2) {
            return EnumC11389vD0.f44273b;
        }
        if (iOrdinal == 3) {
            return EnumC11389vD0.f44274c;
        }
        throw new IllegalArgumentException("unknown priority: " + getPriority());
    }

    @Deprecated
    public <Y extends A81> Y downloadOnly(Y y) {
        return (Y) getDownloadOnlyRequest().into((C11671xR0) y);
    }

    /* renamed from: e */
    public final void m25891e(A81 a81, FR0 fr0, AbstractC0106Bg abstractC0106Bg, Executor executor) {
        IL1.m3829c(a81);
        if (!this.isModelSet) {
            throw new IllegalArgumentException("You must call #load() before calling #into()");
        }
        Object obj = new Object();
        AbstractC7839Kc1 abstractC7839Kc1 = this.transitionOptions;
        InterfaceC10905rR0 interfaceC10905rR0M25889c = m25889c(abstractC0106Bg.getOverrideWidth(), abstractC0106Bg.getOverrideHeight(), abstractC0106Bg, abstractC0106Bg.getPriority(), null, fr0, a81, abstractC7839Kc1, obj, executor);
        InterfaceC10905rR0 interfaceC10905rR0Mo83h = a81.mo83h();
        if (!interfaceC10905rR0M25889c.mo4117b(interfaceC10905rR0Mo83h) || (!abstractC0106Bg.isMemoryCacheable() && interfaceC10905rR0Mo83h.mo4126k())) {
            this.requestManager.clear(a81);
            a81.mo79c(interfaceC10905rR0M25889c);
            this.requestManager.track(a81, interfaceC10905rR0M25889c);
        } else {
            IL1.m3830d(interfaceC10905rR0Mo83h, "Argument must not be null");
            if (interfaceC10905rR0Mo83h.isRunning()) {
                return;
            }
            interfaceC10905rR0Mo83h.mo4125j();
        }
    }

    @Override // p000.AbstractC0106Bg
    public boolean equals(Object obj) {
        if (!(obj instanceof C11671xR0)) {
            return false;
        }
        C11671xR0 c11671xR0 = (C11671xR0) obj;
        return super.equals(c11671xR0) && Objects.equals(this.transcodeClass, c11671xR0.transcodeClass) && this.transitionOptions.equals(c11671xR0.transitionOptions) && Objects.equals(this.model, c11671xR0.model) && Objects.equals(this.requestListeners, c11671xR0.requestListeners) && Objects.equals(this.thumbnailBuilder, c11671xR0.thumbnailBuilder) && Objects.equals(this.errorBuilder, c11671xR0.errorBuilder) && Objects.equals(this.thumbSizeMultiplier, c11671xR0.thumbSizeMultiplier) && this.isDefaultTransitionOptionsSet == c11671xR0.isDefaultTransitionOptionsSet && this.isModelSet == c11671xR0.isModelSet;
    }

    public C11671xR0 error(C11671xR0 c11671xR0) {
        if (isAutoCloneEnabled()) {
            return mo26596clone().error(c11671xR0);
        }
        this.errorBuilder = c11671xR0;
        return (C11671xR0) selfOrThrowIfLocked();
    }

    /* renamed from: f */
    public final C11671xR0 m25892f(Object obj) {
        if (isAutoCloneEnabled()) {
            return mo26596clone().m25892f(obj);
        }
        this.model = obj;
        this.isModelSet = true;
        return (C11671xR0) selfOrThrowIfLocked();
    }

    /* renamed from: g */
    public final J11 m25893g(int i, int i2, AbstractC0106Bg abstractC0106Bg, EnumC11389vD0 enumC11389vD0, InterfaceC11798yR0 interfaceC11798yR0, FR0 fr0, A81 a81, AbstractC7839Kc1 abstractC7839Kc1, Object obj, Executor executor) {
        Context context = this.context;
        C11617x10 c11617x10 = this.glideContext;
        Object obj2 = this.model;
        Class<Object> cls = this.transcodeClass;
        List<FR0> list = this.requestListeners;
        C0277EO c0277eo = c11617x10.f45267g;
        abstractC7839Kc1.getClass();
        return new J11(context, c11617x10, obj, obj2, cls, abstractC0106Bg, i, i2, enumC11389vD0, a81, fr0, list, interfaceC11798yR0, c0277eo, executor);
    }

    public C11671xR0 getDownloadOnlyRequest() {
        return new C11671xR0(File.class, this).apply((AbstractC0106Bg) DOWNLOAD_ONLY_OPTIONS);
    }

    public JR0 getRequestManager() {
        return this.requestManager;
    }

    @Override // p000.AbstractC0106Bg
    public int hashCode() {
        return AbstractC7381Bh1.m808g(this.isModelSet ? 1 : 0, AbstractC7381Bh1.m808g(this.isDefaultTransitionOptionsSet ? 1 : 0, AbstractC7381Bh1.m809h(AbstractC7381Bh1.m809h(AbstractC7381Bh1.m809h(AbstractC7381Bh1.m809h(AbstractC7381Bh1.m809h(AbstractC7381Bh1.m809h(AbstractC7381Bh1.m809h(super.hashCode(), this.transcodeClass), this.transitionOptions), this.model), this.requestListeners), this.thumbnailBuilder), this.errorBuilder), this.thumbSizeMultiplier)));
    }

    public <Y extends A81> Y into(Y y) {
        return (Y) into(y, null, AbstractC11984zu1.f47092b);
    }

    public C11671xR0 listener(FR0 fr0) {
        if (isAutoCloneEnabled()) {
            return mo26596clone().listener(fr0);
        }
        this.requestListeners = null;
        return addListener(fr0);
    }

    /* renamed from: load */
    public C11671xR0 m26632load(Object obj) {
        return m25892f(obj);
    }

    public A81 preload(int i, int i2) {
        return into((C11671xR0) new ZC0(this.requestManager, i, i2));
    }

    public InterfaceFutureC1105RZ submit() {
        return submit(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public C11671xR0 thumbnail(C11671xR0 c11671xR0) {
        if (isAutoCloneEnabled()) {
            return mo26596clone().thumbnail(c11671xR0);
        }
        this.thumbnailBuilder = c11671xR0;
        return (C11671xR0) selfOrThrowIfLocked();
    }

    public C11671xR0 transition(AbstractC7839Kc1 abstractC7839Kc1) {
        if (isAutoCloneEnabled()) {
            return mo26596clone().transition(abstractC7839Kc1);
        }
        IL1.m3830d(abstractC7839Kc1, "Argument must not be null");
        this.transitionOptions = abstractC7839Kc1;
        this.isDefaultTransitionOptionsSet = false;
        return (C11671xR0) selfOrThrowIfLocked();
    }

    @Override // p000.AbstractC0106Bg
    public C11671xR0 apply(AbstractC0106Bg abstractC0106Bg) {
        IL1.m3829c(abstractC0106Bg);
        return (C11671xR0) super.apply(abstractC0106Bg);
    }

    @Deprecated
    public InterfaceFutureC1105RZ downloadOnly(int i, int i2) {
        return getDownloadOnlyRequest().submit(i, i2);
    }

    public <Y extends A81> Y into(Y y, FR0 fr0, Executor executor) {
        m25891e(y, fr0, this, executor);
        return y;
    }

    /* renamed from: load */
    public C11671xR0 m26627load(Bitmap bitmap) {
        return m25892f(bitmap).apply((AbstractC0106Bg) PR0.diskCacheStrategyOf(AbstractC4046fK.f27136a));
    }

    public InterfaceFutureC1105RZ submit(int i, int i2) {
        BR0 br0 = new BR0(i, i2);
        return (InterfaceFutureC1105RZ) into(br0, br0, AbstractC11984zu1.f47093c);
    }

    @Override // p000.AbstractC0106Bg
    /* renamed from: clone */
    public C11671xR0 mo26596clone() {
        C11671xR0 c11671xR0 = (C11671xR0) super.mo26596clone();
        c11671xR0.transitionOptions = c11671xR0.transitionOptions.clone();
        if (c11671xR0.requestListeners != null) {
            c11671xR0.requestListeners = new ArrayList(c11671xR0.requestListeners);
        }
        C11671xR0 c11671xR02 = c11671xR0.thumbnailBuilder;
        if (c11671xR02 != null) {
            c11671xR0.thumbnailBuilder = c11671xR02.mo26596clone();
        }
        C11671xR0 c11671xR03 = c11671xR0.errorBuilder;
        if (c11671xR03 != null) {
            c11671xR0.errorBuilder = c11671xR03.mo26596clone();
        }
        return c11671xR0;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p000.AbstractC11458vl1 into(android.widget.ImageView r4) {
        /*
            r3 = this;
            p000.AbstractC7381Bh1.m802a()
            p000.IL1.m3829c(r4)
            boolean r0 = r3.isTransformationSet()
            if (r0 != 0) goto L4c
            boolean r0 = r3.isTransformationAllowed()
            if (r0 == 0) goto L4c
            android.widget.ImageView$ScaleType r0 = r4.getScaleType()
            if (r0 == 0) goto L4c
            int[] r0 = p000.AbstractC11417vR0.f44375a
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
            Bg r0 = r3.mo26596clone()
            Bg r0 = r0.optionalCenterInside()
            goto L4d
        L31:
            Bg r0 = r3.mo26596clone()
            Bg r0 = r0.optionalFitCenter()
            goto L4d
        L3a:
            Bg r0 = r3.mo26596clone()
            Bg r0 = r0.optionalCenterInside()
            goto L4d
        L43:
            Bg r0 = r3.mo26596clone()
            Bg r0 = r0.optionalCenterCrop()
            goto L4d
        L4c:
            r0 = r3
        L4d:
            x10 r1 = r3.glideContext
            java.lang.Class<java.lang.Object> r2 = r3.transcodeClass
            OJ1 r1 = r1.f45263c
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
            TJ r4 = p000.AbstractC11984zu1.f47092b
            r2 = 0
            r3.m25891e(r1, r2, r0, r4)
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
        throw new UnsupportedOperationException("Method not decompiled: p000.C11671xR0.into(android.widget.ImageView):vl1");
    }

    /* renamed from: load */
    public C11671xR0 m26628load(Drawable drawable) {
        return m25892f(drawable).apply((AbstractC0106Bg) PR0.diskCacheStrategyOf(AbstractC4046fK.f27136a));
    }

    /* renamed from: load */
    public C11671xR0 m26633load(String str) {
        return m25892f(str);
    }

    public A81 preload() {
        return preload(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    /* renamed from: load */
    public C11671xR0 m26629load(Uri uri) {
        return m25892f(uri);
    }

    public C11671xR0 thumbnail(float f) {
        if (isAutoCloneEnabled()) {
            return mo26596clone().thumbnail(f);
        }
        if (f >= 0.0f && f <= 1.0f) {
            this.thumbSizeMultiplier = Float.valueOf(f);
            return (C11671xR0) selfOrThrowIfLocked();
        }
        throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
    }

    /* renamed from: load */
    public C11671xR0 m26630load(File file) {
        return m25892f(file);
    }

    /* renamed from: load */
    public C11671xR0 m26631load(Integer num) throws PackageManager.NameNotFoundException {
        C11671xR0 c11671xR0M25892f = m25892f(num);
        Context context = this.context;
        return c11671xR0M25892f.apply((AbstractC0106Bg) PR0.signatureOf(new C0131C4(context.getResources().getConfiguration().uiMode & 48, AbstractC4034f8.m18192a(context))));
    }

    /* renamed from: load */
    public C11671xR0 m26634load(URL url) {
        return m25892f(url);
    }

    /* renamed from: load */
    public C11671xR0 m26635load(byte[] bArr) {
        C11671xR0 c11671xR0M25892f = m25892f(bArr);
        if (!c11671xR0M25892f.isDiskCacheStrategySet()) {
            c11671xR0M25892f = c11671xR0M25892f.apply((AbstractC0106Bg) PR0.diskCacheStrategyOf(AbstractC4046fK.f27136a));
        }
        return !c11671xR0M25892f.isSkipMemoryCacheSet() ? c11671xR0M25892f.apply((AbstractC0106Bg) PR0.skipMemoryCacheOf(true)) : c11671xR0M25892f;
    }

    public C11671xR0(Class cls, C11671xR0 c11671xR0) {
        this(c11671xR0.glide, c11671xR0.requestManager, cls, c11671xR0.context);
        this.model = c11671xR0.model;
        this.isModelSet = c11671xR0.isModelSet;
        apply((AbstractC0106Bg) c11671xR0);
    }

    @Deprecated
    public InterfaceFutureC1105RZ into(int i, int i2) {
        return submit(i, i2);
    }
}
