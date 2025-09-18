package p000;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.util.Map;

/* renamed from: Bg */
/* loaded from: classes.dex */
public abstract class AbstractC0106Bg implements Cloneable {
    private static final int DISK_CACHE_STRATEGY = 4;
    private static final int ERROR_ID = 32;
    private static final int ERROR_PLACEHOLDER = 16;
    private static final int FALLBACK = 8192;
    private static final int FALLBACK_ID = 16384;
    private static final int IS_CACHEABLE = 256;
    private static final int ONLY_RETRIEVE_FROM_CACHE = 524288;
    private static final int OVERRIDE = 512;
    private static final int PLACEHOLDER = 64;
    private static final int PLACEHOLDER_ID = 128;
    private static final int PRIORITY = 8;
    private static final int RESOURCE_CLASS = 4096;
    private static final int SIGNATURE = 1024;
    private static final int SIZE_MULTIPLIER = 2;
    private static final int THEME = 32768;
    private static final int TRANSFORMATION = 2048;
    private static final int TRANSFORMATION_ALLOWED = 65536;
    private static final int TRANSFORMATION_REQUIRED = 131072;
    private static final int UNSET = -1;
    private static final int USE_ANIMATION_POOL = 1048576;
    private static final int USE_UNLIMITED_SOURCE_GENERATORS_POOL = 262144;
    private int errorId;
    private Drawable errorPlaceholder;
    private Drawable fallbackDrawable;
    private int fallbackId;
    private int fields;
    private boolean isAutoCloneEnabled;
    private boolean isLocked;
    private boolean isTransformationRequired;
    private boolean onlyRetrieveFromCache;
    private Drawable placeholderDrawable;
    private int placeholderId;
    private Resources.Theme theme;
    private boolean useAnimationPool;
    private boolean useUnlimitedSourceGeneratorsPool;
    private float sizeMultiplier = 1.0f;
    private AbstractC4046fK diskCacheStrategy = AbstractC4046fK.f27138c;
    private EnumC11389vD0 priority = EnumC11389vD0.f44274c;
    private boolean isCacheable = true;
    private int overrideHeight = -1;
    private int overrideWidth = -1;
    private InterfaceC7740If0 signature = C1219TN.f11330b;
    private boolean isTransformationAllowed = true;
    private C7830Jy0 options = new C7830Jy0();
    private Map<Class<?>, InterfaceC11312uc1> transformations = new C6509nl();
    private Class<?> resourceClass = Object.class;
    private boolean isScaleOnlyOrNoTransform = true;

    /* renamed from: a */
    public static boolean m796a(int i, int i2) {
        return (i & i2) != 0;
    }

    public AbstractC0106Bg apply(AbstractC0106Bg abstractC0106Bg) {
        if (this.isAutoCloneEnabled) {
            return mo26596clone().apply(abstractC0106Bg);
        }
        if (m796a(abstractC0106Bg.fields, 2)) {
            this.sizeMultiplier = abstractC0106Bg.sizeMultiplier;
        }
        if (m796a(abstractC0106Bg.fields, USE_UNLIMITED_SOURCE_GENERATORS_POOL)) {
            this.useUnlimitedSourceGeneratorsPool = abstractC0106Bg.useUnlimitedSourceGeneratorsPool;
        }
        if (m796a(abstractC0106Bg.fields, USE_ANIMATION_POOL)) {
            this.useAnimationPool = abstractC0106Bg.useAnimationPool;
        }
        if (m796a(abstractC0106Bg.fields, 4)) {
            this.diskCacheStrategy = abstractC0106Bg.diskCacheStrategy;
        }
        if (m796a(abstractC0106Bg.fields, 8)) {
            this.priority = abstractC0106Bg.priority;
        }
        if (m796a(abstractC0106Bg.fields, 16)) {
            this.errorPlaceholder = abstractC0106Bg.errorPlaceholder;
            this.errorId = 0;
            this.fields &= -33;
        }
        if (m796a(abstractC0106Bg.fields, 32)) {
            this.errorId = abstractC0106Bg.errorId;
            this.errorPlaceholder = null;
            this.fields &= -17;
        }
        if (m796a(abstractC0106Bg.fields, 64)) {
            this.placeholderDrawable = abstractC0106Bg.placeholderDrawable;
            this.placeholderId = 0;
            this.fields &= -129;
        }
        if (m796a(abstractC0106Bg.fields, PLACEHOLDER_ID)) {
            this.placeholderId = abstractC0106Bg.placeholderId;
            this.placeholderDrawable = null;
            this.fields &= -65;
        }
        if (m796a(abstractC0106Bg.fields, IS_CACHEABLE)) {
            this.isCacheable = abstractC0106Bg.isCacheable;
        }
        if (m796a(abstractC0106Bg.fields, OVERRIDE)) {
            this.overrideWidth = abstractC0106Bg.overrideWidth;
            this.overrideHeight = abstractC0106Bg.overrideHeight;
        }
        if (m796a(abstractC0106Bg.fields, SIGNATURE)) {
            this.signature = abstractC0106Bg.signature;
        }
        if (m796a(abstractC0106Bg.fields, 4096)) {
            this.resourceClass = abstractC0106Bg.resourceClass;
        }
        if (m796a(abstractC0106Bg.fields, FALLBACK)) {
            this.fallbackDrawable = abstractC0106Bg.fallbackDrawable;
            this.fallbackId = 0;
            this.fields &= -16385;
        }
        if (m796a(abstractC0106Bg.fields, FALLBACK_ID)) {
            this.fallbackId = abstractC0106Bg.fallbackId;
            this.fallbackDrawable = null;
            this.fields &= -8193;
        }
        if (m796a(abstractC0106Bg.fields, THEME)) {
            this.theme = abstractC0106Bg.theme;
        }
        if (m796a(abstractC0106Bg.fields, 65536)) {
            this.isTransformationAllowed = abstractC0106Bg.isTransformationAllowed;
        }
        if (m796a(abstractC0106Bg.fields, TRANSFORMATION_REQUIRED)) {
            this.isTransformationRequired = abstractC0106Bg.isTransformationRequired;
        }
        if (m796a(abstractC0106Bg.fields, TRANSFORMATION)) {
            this.transformations.putAll(abstractC0106Bg.transformations);
            this.isScaleOnlyOrNoTransform = abstractC0106Bg.isScaleOnlyOrNoTransform;
        }
        if (m796a(abstractC0106Bg.fields, ONLY_RETRIEVE_FROM_CACHE)) {
            this.onlyRetrieveFromCache = abstractC0106Bg.onlyRetrieveFromCache;
        }
        if (!this.isTransformationAllowed) {
            this.transformations.clear();
            int i = this.fields;
            this.isTransformationRequired = false;
            this.fields = i & (-133121);
            this.isScaleOnlyOrNoTransform = true;
        }
        this.fields |= abstractC0106Bg.fields;
        this.options.f5819b.mo4828j(abstractC0106Bg.options.f5819b);
        return selfOrThrowIfLocked();
    }

    public AbstractC0106Bg autoClone() {
        if (this.isLocked && !this.isAutoCloneEnabled) {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        this.isAutoCloneEnabled = true;
        return lock();
    }

    /* renamed from: b */
    public final AbstractC0106Bg m797b(AbstractC1841cL abstractC1841cL, AbstractC6569oi abstractC6569oi, boolean z) {
        AbstractC0106Bg abstractC0106BgTransform = z ? transform(abstractC1841cL, abstractC6569oi) : optionalTransform(abstractC1841cL, abstractC6569oi);
        abstractC0106BgTransform.isScaleOnlyOrNoTransform = true;
        return abstractC0106BgTransform;
    }

    public AbstractC0106Bg decode(Class cls) {
        if (this.isAutoCloneEnabled) {
            return mo26596clone().decode(cls);
        }
        IL1.m3830d(cls, "Argument must not be null");
        this.resourceClass = cls;
        this.fields |= 4096;
        return selfOrThrowIfLocked();
    }

    public AbstractC0106Bg diskCacheStrategy(AbstractC4046fK abstractC4046fK) {
        if (this.isAutoCloneEnabled) {
            return mo26596clone().diskCacheStrategy(abstractC4046fK);
        }
        IL1.m3830d(abstractC4046fK, "Argument must not be null");
        this.diskCacheStrategy = abstractC4046fK;
        this.fields |= 4;
        return selfOrThrowIfLocked();
    }

    public AbstractC0106Bg dontTransform() {
        if (this.isAutoCloneEnabled) {
            return mo26596clone().dontTransform();
        }
        this.transformations.clear();
        int i = this.fields;
        this.isTransformationRequired = false;
        this.isTransformationAllowed = false;
        this.fields = (i & (-133121)) | 65536;
        this.isScaleOnlyOrNoTransform = true;
        return selfOrThrowIfLocked();
    }

    public AbstractC0106Bg downsample(AbstractC1841cL abstractC1841cL) {
        C11864yy0 c11864yy0 = AbstractC1841cL.f17437f;
        IL1.m3830d(abstractC1841cL, "Argument must not be null");
        return set(c11864yy0, abstractC1841cL);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AbstractC0106Bg)) {
            return false;
        }
        AbstractC0106Bg abstractC0106Bg = (AbstractC0106Bg) obj;
        return Float.compare(abstractC0106Bg.sizeMultiplier, this.sizeMultiplier) == 0 && this.errorId == abstractC0106Bg.errorId && AbstractC7381Bh1.m803b(this.errorPlaceholder, abstractC0106Bg.errorPlaceholder) && this.placeholderId == abstractC0106Bg.placeholderId && AbstractC7381Bh1.m803b(this.placeholderDrawable, abstractC0106Bg.placeholderDrawable) && this.fallbackId == abstractC0106Bg.fallbackId && AbstractC7381Bh1.m803b(this.fallbackDrawable, abstractC0106Bg.fallbackDrawable) && this.isCacheable == abstractC0106Bg.isCacheable && this.overrideHeight == abstractC0106Bg.overrideHeight && this.overrideWidth == abstractC0106Bg.overrideWidth && this.isTransformationRequired == abstractC0106Bg.isTransformationRequired && this.isTransformationAllowed == abstractC0106Bg.isTransformationAllowed && this.useUnlimitedSourceGeneratorsPool == abstractC0106Bg.useUnlimitedSourceGeneratorsPool && this.onlyRetrieveFromCache == abstractC0106Bg.onlyRetrieveFromCache && this.diskCacheStrategy.equals(abstractC0106Bg.diskCacheStrategy) && this.priority == abstractC0106Bg.priority && this.options.equals(abstractC0106Bg.options) && this.transformations.equals(abstractC0106Bg.transformations) && this.resourceClass.equals(abstractC0106Bg.resourceClass) && AbstractC7381Bh1.m803b(this.signature, abstractC0106Bg.signature) && AbstractC7381Bh1.m803b(this.theme, abstractC0106Bg.theme);
    }

    public AbstractC0106Bg error(Drawable drawable) {
        if (this.isAutoCloneEnabled) {
            return mo26596clone().error(drawable);
        }
        this.errorPlaceholder = drawable;
        int i = this.fields | 16;
        this.errorId = 0;
        this.fields = i & (-33);
        return selfOrThrowIfLocked();
    }

    public AbstractC0106Bg fallback(Drawable drawable) {
        if (this.isAutoCloneEnabled) {
            return mo26596clone().fallback(drawable);
        }
        this.fallbackDrawable = drawable;
        int i = this.fields | FALLBACK;
        this.fallbackId = 0;
        this.fields = i & (-16385);
        return selfOrThrowIfLocked();
    }

    public final AbstractC4046fK getDiskCacheStrategy() {
        return this.diskCacheStrategy;
    }

    public final int getErrorId() {
        return this.errorId;
    }

    public final Drawable getErrorPlaceholder() {
        return this.errorPlaceholder;
    }

    public final Drawable getFallbackDrawable() {
        return this.fallbackDrawable;
    }

    public final int getFallbackId() {
        return this.fallbackId;
    }

    public final boolean getOnlyRetrieveFromCache() {
        return this.onlyRetrieveFromCache;
    }

    public final C7830Jy0 getOptions() {
        return this.options;
    }

    public final int getOverrideHeight() {
        return this.overrideHeight;
    }

    public final int getOverrideWidth() {
        return this.overrideWidth;
    }

    public final Drawable getPlaceholderDrawable() {
        return this.placeholderDrawable;
    }

    public final int getPlaceholderId() {
        return this.placeholderId;
    }

    public final EnumC11389vD0 getPriority() {
        return this.priority;
    }

    public final Class<?> getResourceClass() {
        return this.resourceClass;
    }

    public final InterfaceC7740If0 getSignature() {
        return this.signature;
    }

    public final float getSizeMultiplier() {
        return this.sizeMultiplier;
    }

    public final Resources.Theme getTheme() {
        return this.theme;
    }

    public final Map<Class<?>, InterfaceC11312uc1> getTransformations() {
        return this.transformations;
    }

    public final boolean getUseAnimationPool() {
        return this.useAnimationPool;
    }

    public final boolean getUseUnlimitedSourceGeneratorsPool() {
        return this.useUnlimitedSourceGeneratorsPool;
    }

    public int hashCode() {
        float f = this.sizeMultiplier;
        char[] cArr = AbstractC7381Bh1.f976a;
        return AbstractC7381Bh1.m809h(AbstractC7381Bh1.m809h(AbstractC7381Bh1.m809h(AbstractC7381Bh1.m809h(AbstractC7381Bh1.m809h(AbstractC7381Bh1.m809h(AbstractC7381Bh1.m809h(AbstractC7381Bh1.m808g(this.onlyRetrieveFromCache ? 1 : 0, AbstractC7381Bh1.m808g(this.useUnlimitedSourceGeneratorsPool ? 1 : 0, AbstractC7381Bh1.m808g(this.isTransformationAllowed ? 1 : 0, AbstractC7381Bh1.m808g(this.isTransformationRequired ? 1 : 0, AbstractC7381Bh1.m808g(this.overrideWidth, AbstractC7381Bh1.m808g(this.overrideHeight, AbstractC7381Bh1.m808g(this.isCacheable ? 1 : 0, AbstractC7381Bh1.m809h(AbstractC7381Bh1.m808g(this.fallbackId, AbstractC7381Bh1.m809h(AbstractC7381Bh1.m808g(this.placeholderId, AbstractC7381Bh1.m809h(AbstractC7381Bh1.m808g(this.errorId, AbstractC7381Bh1.m808g(Float.floatToIntBits(f), 17)), this.errorPlaceholder)), this.placeholderDrawable)), this.fallbackDrawable)))))))), this.diskCacheStrategy), this.priority), this.options), this.transformations), this.resourceClass), this.signature), this.theme);
    }

    public final boolean isAutoCloneEnabled() {
        return this.isAutoCloneEnabled;
    }

    public final boolean isDiskCacheStrategySet() {
        return m796a(this.fields, 4);
    }

    public final boolean isLocked() {
        return this.isLocked;
    }

    public final boolean isMemoryCacheable() {
        return this.isCacheable;
    }

    public final boolean isPrioritySet() {
        return m796a(this.fields, 8);
    }

    public boolean isScaleOnlyOrNoTransform() {
        return this.isScaleOnlyOrNoTransform;
    }

    public final boolean isSkipMemoryCacheSet() {
        return m796a(this.fields, IS_CACHEABLE);
    }

    public final boolean isTransformationAllowed() {
        return this.isTransformationAllowed;
    }

    public final boolean isTransformationRequired() {
        return this.isTransformationRequired;
    }

    public final boolean isTransformationSet() {
        return m796a(this.fields, TRANSFORMATION);
    }

    public final boolean isValidOverride() {
        return AbstractC7381Bh1.m811j(this.overrideWidth, this.overrideHeight);
    }

    public AbstractC0106Bg lock() {
        this.isLocked = true;
        return this;
    }

    public AbstractC0106Bg onlyRetrieveFromCache(boolean z) {
        if (this.isAutoCloneEnabled) {
            return mo26596clone().onlyRetrieveFromCache(z);
        }
        this.onlyRetrieveFromCache = z;
        this.fields |= ONLY_RETRIEVE_FROM_CACHE;
        return selfOrThrowIfLocked();
    }

    public AbstractC0106Bg optionalCenterCrop() {
        return optionalTransform(AbstractC1841cL.f17434c, new C1437Wq());
    }

    public AbstractC0106Bg optionalCenterInside() {
        return m797b(AbstractC1841cL.f17433b, new C1500Xq(), false);
    }

    public AbstractC0106Bg optionalFitCenter() {
        return m797b(AbstractC1841cL.f17432a, new C0536IV(), false);
    }

    public final AbstractC0106Bg optionalTransform(AbstractC1841cL abstractC1841cL, InterfaceC11312uc1 interfaceC11312uc1) {
        if (this.isAutoCloneEnabled) {
            return mo26596clone().optionalTransform(abstractC1841cL, interfaceC11312uc1);
        }
        downsample(abstractC1841cL);
        return transform(interfaceC11312uc1, false);
    }

    public AbstractC0106Bg override(int i, int i2) {
        if (this.isAutoCloneEnabled) {
            return mo26596clone().override(i, i2);
        }
        this.overrideWidth = i;
        this.overrideHeight = i2;
        this.fields |= OVERRIDE;
        return selfOrThrowIfLocked();
    }

    public AbstractC0106Bg placeholder(Drawable drawable) {
        if (this.isAutoCloneEnabled) {
            return mo26596clone().placeholder(drawable);
        }
        this.placeholderDrawable = drawable;
        int i = this.fields | 64;
        this.placeholderId = 0;
        this.fields = i & (-129);
        return selfOrThrowIfLocked();
    }

    public AbstractC0106Bg priority(EnumC11389vD0 enumC11389vD0) {
        if (this.isAutoCloneEnabled) {
            return mo26596clone().priority(enumC11389vD0);
        }
        IL1.m3830d(enumC11389vD0, "Argument must not be null");
        this.priority = enumC11389vD0;
        this.fields |= 8;
        return selfOrThrowIfLocked();
    }

    public final AbstractC0106Bg selfOrThrowIfLocked() {
        if (this.isLocked) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
        return this;
    }

    public AbstractC0106Bg set(C11864yy0 c11864yy0, Object obj) {
        if (this.isAutoCloneEnabled) {
            return mo26596clone().set(c11864yy0, obj);
        }
        IL1.m3829c(c11864yy0);
        IL1.m3829c(obj);
        this.options.f5819b.put(c11864yy0, obj);
        return selfOrThrowIfLocked();
    }

    public AbstractC0106Bg signature(InterfaceC7740If0 interfaceC7740If0) {
        if (this.isAutoCloneEnabled) {
            return mo26596clone().signature(interfaceC7740If0);
        }
        IL1.m3830d(interfaceC7740If0, "Argument must not be null");
        this.signature = interfaceC7740If0;
        this.fields |= SIGNATURE;
        return selfOrThrowIfLocked();
    }

    public AbstractC0106Bg sizeMultiplier(float f) {
        if (this.isAutoCloneEnabled) {
            return mo26596clone().sizeMultiplier(f);
        }
        if (f < 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        this.sizeMultiplier = f;
        this.fields |= 2;
        return selfOrThrowIfLocked();
    }

    public AbstractC0106Bg skipMemoryCache(boolean z) {
        if (this.isAutoCloneEnabled) {
            return mo26596clone().skipMemoryCache(true);
        }
        this.isCacheable = !z;
        this.fields |= IS_CACHEABLE;
        return selfOrThrowIfLocked();
    }

    public AbstractC0106Bg theme(Resources.Theme theme) {
        if (this.isAutoCloneEnabled) {
            return mo26596clone().theme(theme);
        }
        IL1.m3829c(theme);
        this.theme = theme;
        this.fields |= THEME;
        return set(C10651pS0.f40083b, theme);
    }

    public final AbstractC0106Bg transform(AbstractC1841cL abstractC1841cL, InterfaceC11312uc1 interfaceC11312uc1) {
        if (this.isAutoCloneEnabled) {
            return mo26596clone().transform(abstractC1841cL, interfaceC11312uc1);
        }
        downsample(abstractC1841cL);
        return transform(interfaceC11312uc1);
    }

    public AbstractC0106Bg useAnimationPool(boolean z) {
        if (this.isAutoCloneEnabled) {
            return mo26596clone().useAnimationPool(z);
        }
        this.useAnimationPool = z;
        this.fields |= USE_ANIMATION_POOL;
        return selfOrThrowIfLocked();
    }

    public AbstractC0106Bg useUnlimitedSourceGeneratorsPool(boolean z) {
        if (this.isAutoCloneEnabled) {
            return mo26596clone().useUnlimitedSourceGeneratorsPool(z);
        }
        this.useUnlimitedSourceGeneratorsPool = z;
        this.fields |= USE_UNLIMITED_SOURCE_GENERATORS_POOL;
        return selfOrThrowIfLocked();
    }

    @Override // 
    /* renamed from: clone */
    public AbstractC0106Bg mo26596clone() {
        try {
            AbstractC0106Bg abstractC0106Bg = (AbstractC0106Bg) super.clone();
            C7830Jy0 c7830Jy0 = new C7830Jy0();
            abstractC0106Bg.options = c7830Jy0;
            c7830Jy0.f5819b.mo4828j(this.options.f5819b);
            C6509nl c6509nl = new C6509nl();
            abstractC0106Bg.transformations = c6509nl;
            c6509nl.putAll(this.transformations);
            abstractC0106Bg.isLocked = false;
            abstractC0106Bg.isAutoCloneEnabled = false;
            return abstractC0106Bg;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public AbstractC0106Bg transform(InterfaceC11312uc1 interfaceC11312uc1) {
        return transform(interfaceC11312uc1, true);
    }

    public AbstractC0106Bg transform(InterfaceC11312uc1 interfaceC11312uc1, boolean z) {
        if (this.isAutoCloneEnabled) {
            return mo26596clone().transform(interfaceC11312uc1, z);
        }
        C6357lL c6357lL = new C6357lL(interfaceC11312uc1, z);
        transform(Bitmap.class, interfaceC11312uc1, z);
        transform(Drawable.class, c6357lL, z);
        transform(BitmapDrawable.class, c6357lL, z);
        transform(C9186e10.class, new C9442g10(interfaceC11312uc1), z);
        return selfOrThrowIfLocked();
    }

    public AbstractC0106Bg error(int i) {
        if (this.isAutoCloneEnabled) {
            return mo26596clone().error(i);
        }
        this.errorId = i;
        int i2 = this.fields | 32;
        this.errorPlaceholder = null;
        this.fields = i2 & (-17);
        return selfOrThrowIfLocked();
    }

    public AbstractC0106Bg fallback(int i) {
        if (this.isAutoCloneEnabled) {
            return mo26596clone().fallback(i);
        }
        this.fallbackId = i;
        int i2 = this.fields | FALLBACK_ID;
        this.fallbackDrawable = null;
        this.fields = i2 & (-8193);
        return selfOrThrowIfLocked();
    }

    public AbstractC0106Bg placeholder(int i) {
        if (this.isAutoCloneEnabled) {
            return mo26596clone().placeholder(i);
        }
        this.placeholderId = i;
        int i2 = this.fields | PLACEHOLDER_ID;
        this.placeholderDrawable = null;
        this.fields = i2 & (-65);
        return selfOrThrowIfLocked();
    }

    public <Y> AbstractC0106Bg transform(Class<Y> cls, InterfaceC11312uc1 interfaceC11312uc1, boolean z) {
        if (this.isAutoCloneEnabled) {
            return mo26596clone().transform(cls, interfaceC11312uc1, z);
        }
        IL1.m3829c(cls);
        IL1.m3829c(interfaceC11312uc1);
        this.transformations.put(cls, interfaceC11312uc1);
        int i = this.fields;
        this.isTransformationAllowed = true;
        this.fields = 67584 | i;
        this.isScaleOnlyOrNoTransform = false;
        if (z) {
            this.fields = i | 198656;
            this.isTransformationRequired = true;
        }
        return selfOrThrowIfLocked();
    }
}
