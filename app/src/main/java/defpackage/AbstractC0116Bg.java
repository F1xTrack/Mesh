package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.util.Map;

/* renamed from: Bg */
/* loaded from: classes.dex */
public abstract class AbstractC0116Bg implements Cloneable {
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
    private AbstractC3750fK diskCacheStrategy = AbstractC3750fK.c;
    private EnumC7561vD0 priority = EnumC7561vD0.c;
    private boolean isCacheable = true;
    private int overrideHeight = -1;
    private int overrideWidth = -1;
    private InterfaceC0660If0 signature = TN.b;
    private boolean isTransformationAllowed = true;
    private C0795Jy0 options = new C0795Jy0();
    private Map<Class<?>, InterfaceC7446uc1> transformations = new C6135nl();
    private Class<?> resourceClass = Object.class;
    private boolean isScaleOnlyOrNoTransform = true;

    public static boolean a(int i, int i2) {
        return (i & i2) != 0;
    }

    public AbstractC0116Bg apply(AbstractC0116Bg abstractC0116Bg) {
        if (this.isAutoCloneEnabled) {
            return mo0clone().apply(abstractC0116Bg);
        }
        if (a(abstractC0116Bg.fields, 2)) {
            this.sizeMultiplier = abstractC0116Bg.sizeMultiplier;
        }
        if (a(abstractC0116Bg.fields, USE_UNLIMITED_SOURCE_GENERATORS_POOL)) {
            this.useUnlimitedSourceGeneratorsPool = abstractC0116Bg.useUnlimitedSourceGeneratorsPool;
        }
        if (a(abstractC0116Bg.fields, USE_ANIMATION_POOL)) {
            this.useAnimationPool = abstractC0116Bg.useAnimationPool;
        }
        if (a(abstractC0116Bg.fields, 4)) {
            this.diskCacheStrategy = abstractC0116Bg.diskCacheStrategy;
        }
        if (a(abstractC0116Bg.fields, 8)) {
            this.priority = abstractC0116Bg.priority;
        }
        if (a(abstractC0116Bg.fields, 16)) {
            this.errorPlaceholder = abstractC0116Bg.errorPlaceholder;
            this.errorId = 0;
            this.fields &= -33;
        }
        if (a(abstractC0116Bg.fields, 32)) {
            this.errorId = abstractC0116Bg.errorId;
            this.errorPlaceholder = null;
            this.fields &= -17;
        }
        if (a(abstractC0116Bg.fields, 64)) {
            this.placeholderDrawable = abstractC0116Bg.placeholderDrawable;
            this.placeholderId = 0;
            this.fields &= -129;
        }
        if (a(abstractC0116Bg.fields, PLACEHOLDER_ID)) {
            this.placeholderId = abstractC0116Bg.placeholderId;
            this.placeholderDrawable = null;
            this.fields &= -65;
        }
        if (a(abstractC0116Bg.fields, IS_CACHEABLE)) {
            this.isCacheable = abstractC0116Bg.isCacheable;
        }
        if (a(abstractC0116Bg.fields, OVERRIDE)) {
            this.overrideWidth = abstractC0116Bg.overrideWidth;
            this.overrideHeight = abstractC0116Bg.overrideHeight;
        }
        if (a(abstractC0116Bg.fields, SIGNATURE)) {
            this.signature = abstractC0116Bg.signature;
        }
        if (a(abstractC0116Bg.fields, 4096)) {
            this.resourceClass = abstractC0116Bg.resourceClass;
        }
        if (a(abstractC0116Bg.fields, FALLBACK)) {
            this.fallbackDrawable = abstractC0116Bg.fallbackDrawable;
            this.fallbackId = 0;
            this.fields &= -16385;
        }
        if (a(abstractC0116Bg.fields, FALLBACK_ID)) {
            this.fallbackId = abstractC0116Bg.fallbackId;
            this.fallbackDrawable = null;
            this.fields &= -8193;
        }
        if (a(abstractC0116Bg.fields, THEME)) {
            this.theme = abstractC0116Bg.theme;
        }
        if (a(abstractC0116Bg.fields, 65536)) {
            this.isTransformationAllowed = abstractC0116Bg.isTransformationAllowed;
        }
        if (a(abstractC0116Bg.fields, TRANSFORMATION_REQUIRED)) {
            this.isTransformationRequired = abstractC0116Bg.isTransformationRequired;
        }
        if (a(abstractC0116Bg.fields, TRANSFORMATION)) {
            this.transformations.putAll(abstractC0116Bg.transformations);
            this.isScaleOnlyOrNoTransform = abstractC0116Bg.isScaleOnlyOrNoTransform;
        }
        if (a(abstractC0116Bg.fields, ONLY_RETRIEVE_FROM_CACHE)) {
            this.onlyRetrieveFromCache = abstractC0116Bg.onlyRetrieveFromCache;
        }
        if (!this.isTransformationAllowed) {
            this.transformations.clear();
            int i = this.fields;
            this.isTransformationRequired = false;
            this.fields = i & (-133121);
            this.isScaleOnlyOrNoTransform = true;
        }
        this.fields |= abstractC0116Bg.fields;
        this.options.b.j(abstractC0116Bg.options.b);
        return selfOrThrowIfLocked();
    }

    public AbstractC0116Bg autoClone() {
        if (this.isLocked && !this.isAutoCloneEnabled) {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        this.isAutoCloneEnabled = true;
        return lock();
    }

    public final AbstractC0116Bg b(AbstractC2496cL abstractC2496cL, AbstractC6317oi abstractC6317oi, boolean z) {
        AbstractC0116Bg abstractC0116BgTransform = z ? transform(abstractC2496cL, abstractC6317oi) : optionalTransform(abstractC2496cL, abstractC6317oi);
        abstractC0116BgTransform.isScaleOnlyOrNoTransform = true;
        return abstractC0116BgTransform;
    }

    public AbstractC0116Bg decode(Class cls) {
        if (this.isAutoCloneEnabled) {
            return mo0clone().decode(cls);
        }
        IL1.d(cls, "Argument must not be null");
        this.resourceClass = cls;
        this.fields |= 4096;
        return selfOrThrowIfLocked();
    }

    public AbstractC0116Bg diskCacheStrategy(AbstractC3750fK abstractC3750fK) {
        if (this.isAutoCloneEnabled) {
            return mo0clone().diskCacheStrategy(abstractC3750fK);
        }
        IL1.d(abstractC3750fK, "Argument must not be null");
        this.diskCacheStrategy = abstractC3750fK;
        this.fields |= 4;
        return selfOrThrowIfLocked();
    }

    public AbstractC0116Bg dontTransform() {
        if (this.isAutoCloneEnabled) {
            return mo0clone().dontTransform();
        }
        this.transformations.clear();
        int i = this.fields;
        this.isTransformationRequired = false;
        this.isTransformationAllowed = false;
        this.fields = (i & (-133121)) | 65536;
        this.isScaleOnlyOrNoTransform = true;
        return selfOrThrowIfLocked();
    }

    public AbstractC0116Bg downsample(AbstractC2496cL abstractC2496cL) {
        C8272yy0 c8272yy0 = AbstractC2496cL.f;
        IL1.d(abstractC2496cL, "Argument must not be null");
        return set(c8272yy0, abstractC2496cL);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AbstractC0116Bg)) {
            return false;
        }
        AbstractC0116Bg abstractC0116Bg = (AbstractC0116Bg) obj;
        return Float.compare(abstractC0116Bg.sizeMultiplier, this.sizeMultiplier) == 0 && this.errorId == abstractC0116Bg.errorId && AbstractC0121Bh1.b(this.errorPlaceholder, abstractC0116Bg.errorPlaceholder) && this.placeholderId == abstractC0116Bg.placeholderId && AbstractC0121Bh1.b(this.placeholderDrawable, abstractC0116Bg.placeholderDrawable) && this.fallbackId == abstractC0116Bg.fallbackId && AbstractC0121Bh1.b(this.fallbackDrawable, abstractC0116Bg.fallbackDrawable) && this.isCacheable == abstractC0116Bg.isCacheable && this.overrideHeight == abstractC0116Bg.overrideHeight && this.overrideWidth == abstractC0116Bg.overrideWidth && this.isTransformationRequired == abstractC0116Bg.isTransformationRequired && this.isTransformationAllowed == abstractC0116Bg.isTransformationAllowed && this.useUnlimitedSourceGeneratorsPool == abstractC0116Bg.useUnlimitedSourceGeneratorsPool && this.onlyRetrieveFromCache == abstractC0116Bg.onlyRetrieveFromCache && this.diskCacheStrategy.equals(abstractC0116Bg.diskCacheStrategy) && this.priority == abstractC0116Bg.priority && this.options.equals(abstractC0116Bg.options) && this.transformations.equals(abstractC0116Bg.transformations) && this.resourceClass.equals(abstractC0116Bg.resourceClass) && AbstractC0121Bh1.b(this.signature, abstractC0116Bg.signature) && AbstractC0121Bh1.b(this.theme, abstractC0116Bg.theme);
    }

    public AbstractC0116Bg error(Drawable drawable) {
        if (this.isAutoCloneEnabled) {
            return mo0clone().error(drawable);
        }
        this.errorPlaceholder = drawable;
        int i = this.fields | 16;
        this.errorId = 0;
        this.fields = i & (-33);
        return selfOrThrowIfLocked();
    }

    public AbstractC0116Bg fallback(Drawable drawable) {
        if (this.isAutoCloneEnabled) {
            return mo0clone().fallback(drawable);
        }
        this.fallbackDrawable = drawable;
        int i = this.fields | FALLBACK;
        this.fallbackId = 0;
        this.fields = i & (-16385);
        return selfOrThrowIfLocked();
    }

    public final AbstractC3750fK getDiskCacheStrategy() {
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

    public final C0795Jy0 getOptions() {
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

    public final EnumC7561vD0 getPriority() {
        return this.priority;
    }

    public final Class<?> getResourceClass() {
        return this.resourceClass;
    }

    public final InterfaceC0660If0 getSignature() {
        return this.signature;
    }

    public final float getSizeMultiplier() {
        return this.sizeMultiplier;
    }

    public final Resources.Theme getTheme() {
        return this.theme;
    }

    public final Map<Class<?>, InterfaceC7446uc1> getTransformations() {
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
        char[] cArr = AbstractC0121Bh1.a;
        return AbstractC0121Bh1.h(AbstractC0121Bh1.h(AbstractC0121Bh1.h(AbstractC0121Bh1.h(AbstractC0121Bh1.h(AbstractC0121Bh1.h(AbstractC0121Bh1.h(AbstractC0121Bh1.g(this.onlyRetrieveFromCache ? 1 : 0, AbstractC0121Bh1.g(this.useUnlimitedSourceGeneratorsPool ? 1 : 0, AbstractC0121Bh1.g(this.isTransformationAllowed ? 1 : 0, AbstractC0121Bh1.g(this.isTransformationRequired ? 1 : 0, AbstractC0121Bh1.g(this.overrideWidth, AbstractC0121Bh1.g(this.overrideHeight, AbstractC0121Bh1.g(this.isCacheable ? 1 : 0, AbstractC0121Bh1.h(AbstractC0121Bh1.g(this.fallbackId, AbstractC0121Bh1.h(AbstractC0121Bh1.g(this.placeholderId, AbstractC0121Bh1.h(AbstractC0121Bh1.g(this.errorId, AbstractC0121Bh1.g(Float.floatToIntBits(f), 17)), this.errorPlaceholder)), this.placeholderDrawable)), this.fallbackDrawable)))))))), this.diskCacheStrategy), this.priority), this.options), this.transformations), this.resourceClass), this.signature), this.theme);
    }

    public final boolean isAutoCloneEnabled() {
        return this.isAutoCloneEnabled;
    }

    public final boolean isDiskCacheStrategySet() {
        return a(this.fields, 4);
    }

    public final boolean isLocked() {
        return this.isLocked;
    }

    public final boolean isMemoryCacheable() {
        return this.isCacheable;
    }

    public final boolean isPrioritySet() {
        return a(this.fields, 8);
    }

    public boolean isScaleOnlyOrNoTransform() {
        return this.isScaleOnlyOrNoTransform;
    }

    public final boolean isSkipMemoryCacheSet() {
        return a(this.fields, IS_CACHEABLE);
    }

    public final boolean isTransformationAllowed() {
        return this.isTransformationAllowed;
    }

    public final boolean isTransformationRequired() {
        return this.isTransformationRequired;
    }

    public final boolean isTransformationSet() {
        return a(this.fields, TRANSFORMATION);
    }

    public final boolean isValidOverride() {
        return AbstractC0121Bh1.j(this.overrideWidth, this.overrideHeight);
    }

    public AbstractC0116Bg lock() {
        this.isLocked = true;
        return this;
    }

    public AbstractC0116Bg onlyRetrieveFromCache(boolean z) {
        if (this.isAutoCloneEnabled) {
            return mo0clone().onlyRetrieveFromCache(z);
        }
        this.onlyRetrieveFromCache = z;
        this.fields |= ONLY_RETRIEVE_FROM_CACHE;
        return selfOrThrowIfLocked();
    }

    public AbstractC0116Bg optionalCenterCrop() {
        return optionalTransform(AbstractC2496cL.c, new C1783Wq());
    }

    public AbstractC0116Bg optionalCenterInside() {
        return b(AbstractC2496cL.b, new C1861Xq(), false);
    }

    public AbstractC0116Bg optionalFitCenter() {
        return b(AbstractC2496cL.a, new IV(), false);
    }

    public final AbstractC0116Bg optionalTransform(AbstractC2496cL abstractC2496cL, InterfaceC7446uc1 interfaceC7446uc1) {
        if (this.isAutoCloneEnabled) {
            return mo0clone().optionalTransform(abstractC2496cL, interfaceC7446uc1);
        }
        downsample(abstractC2496cL);
        return transform(interfaceC7446uc1, false);
    }

    public AbstractC0116Bg override(int i, int i2) {
        if (this.isAutoCloneEnabled) {
            return mo0clone().override(i, i2);
        }
        this.overrideWidth = i;
        this.overrideHeight = i2;
        this.fields |= OVERRIDE;
        return selfOrThrowIfLocked();
    }

    public AbstractC0116Bg placeholder(Drawable drawable) {
        if (this.isAutoCloneEnabled) {
            return mo0clone().placeholder(drawable);
        }
        this.placeholderDrawable = drawable;
        int i = this.fields | 64;
        this.placeholderId = 0;
        this.fields = i & (-129);
        return selfOrThrowIfLocked();
    }

    public AbstractC0116Bg priority(EnumC7561vD0 enumC7561vD0) {
        if (this.isAutoCloneEnabled) {
            return mo0clone().priority(enumC7561vD0);
        }
        IL1.d(enumC7561vD0, "Argument must not be null");
        this.priority = enumC7561vD0;
        this.fields |= 8;
        return selfOrThrowIfLocked();
    }

    public final AbstractC0116Bg selfOrThrowIfLocked() {
        if (this.isLocked) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
        return this;
    }

    public AbstractC0116Bg set(C8272yy0 c8272yy0, Object obj) {
        if (this.isAutoCloneEnabled) {
            return mo0clone().set(c8272yy0, obj);
        }
        IL1.c(c8272yy0);
        IL1.c(obj);
        this.options.b.put(c8272yy0, obj);
        return selfOrThrowIfLocked();
    }

    public AbstractC0116Bg signature(InterfaceC0660If0 interfaceC0660If0) {
        if (this.isAutoCloneEnabled) {
            return mo0clone().signature(interfaceC0660If0);
        }
        IL1.d(interfaceC0660If0, "Argument must not be null");
        this.signature = interfaceC0660If0;
        this.fields |= SIGNATURE;
        return selfOrThrowIfLocked();
    }

    public AbstractC0116Bg sizeMultiplier(float f) {
        if (this.isAutoCloneEnabled) {
            return mo0clone().sizeMultiplier(f);
        }
        if (f < 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        this.sizeMultiplier = f;
        this.fields |= 2;
        return selfOrThrowIfLocked();
    }

    public AbstractC0116Bg skipMemoryCache(boolean z) {
        if (this.isAutoCloneEnabled) {
            return mo0clone().skipMemoryCache(true);
        }
        this.isCacheable = !z;
        this.fields |= IS_CACHEABLE;
        return selfOrThrowIfLocked();
    }

    public AbstractC0116Bg theme(Resources.Theme theme) {
        if (this.isAutoCloneEnabled) {
            return mo0clone().theme(theme);
        }
        IL1.c(theme);
        this.theme = theme;
        this.fields |= THEME;
        return set(C6461pS0.b, theme);
    }

    public final AbstractC0116Bg transform(AbstractC2496cL abstractC2496cL, InterfaceC7446uc1 interfaceC7446uc1) {
        if (this.isAutoCloneEnabled) {
            return mo0clone().transform(abstractC2496cL, interfaceC7446uc1);
        }
        downsample(abstractC2496cL);
        return transform(interfaceC7446uc1);
    }

    public AbstractC0116Bg useAnimationPool(boolean z) {
        if (this.isAutoCloneEnabled) {
            return mo0clone().useAnimationPool(z);
        }
        this.useAnimationPool = z;
        this.fields |= USE_ANIMATION_POOL;
        return selfOrThrowIfLocked();
    }

    public AbstractC0116Bg useUnlimitedSourceGeneratorsPool(boolean z) {
        if (this.isAutoCloneEnabled) {
            return mo0clone().useUnlimitedSourceGeneratorsPool(z);
        }
        this.useUnlimitedSourceGeneratorsPool = z;
        this.fields |= USE_UNLIMITED_SOURCE_GENERATORS_POOL;
        return selfOrThrowIfLocked();
    }

    @Override // 
    /* renamed from: clone */
    public AbstractC0116Bg mo0clone() {
        try {
            AbstractC0116Bg abstractC0116Bg = (AbstractC0116Bg) super.clone();
            C0795Jy0 c0795Jy0 = new C0795Jy0();
            abstractC0116Bg.options = c0795Jy0;
            c0795Jy0.b.j(this.options.b);
            C6135nl c6135nl = new C6135nl();
            abstractC0116Bg.transformations = c6135nl;
            c6135nl.putAll(this.transformations);
            abstractC0116Bg.isLocked = false;
            abstractC0116Bg.isAutoCloneEnabled = false;
            return abstractC0116Bg;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public AbstractC0116Bg transform(InterfaceC7446uc1 interfaceC7446uc1) {
        return transform(interfaceC7446uc1, true);
    }

    public AbstractC0116Bg transform(InterfaceC7446uc1 interfaceC7446uc1, boolean z) {
        if (this.isAutoCloneEnabled) {
            return mo0clone().transform(interfaceC7446uc1, z);
        }
        C5675lL c5675lL = new C5675lL(interfaceC7446uc1, z);
        transform(Bitmap.class, interfaceC7446uc1, z);
        transform(Drawable.class, c5675lL, z);
        transform(BitmapDrawable.class, c5675lL, z);
        transform(C3500e10.class, new C3882g10(interfaceC7446uc1), z);
        return selfOrThrowIfLocked();
    }

    public AbstractC0116Bg error(int i) {
        if (this.isAutoCloneEnabled) {
            return mo0clone().error(i);
        }
        this.errorId = i;
        int i2 = this.fields | 32;
        this.errorPlaceholder = null;
        this.fields = i2 & (-17);
        return selfOrThrowIfLocked();
    }

    public AbstractC0116Bg fallback(int i) {
        if (this.isAutoCloneEnabled) {
            return mo0clone().fallback(i);
        }
        this.fallbackId = i;
        int i2 = this.fields | FALLBACK_ID;
        this.fallbackDrawable = null;
        this.fields = i2 & (-8193);
        return selfOrThrowIfLocked();
    }

    public AbstractC0116Bg placeholder(int i) {
        if (this.isAutoCloneEnabled) {
            return mo0clone().placeholder(i);
        }
        this.placeholderId = i;
        int i2 = this.fields | PLACEHOLDER_ID;
        this.placeholderDrawable = null;
        this.fields = i2 & (-65);
        return selfOrThrowIfLocked();
    }

    public <Y> AbstractC0116Bg transform(Class<Y> cls, InterfaceC7446uc1 interfaceC7446uc1, boolean z) {
        if (this.isAutoCloneEnabled) {
            return mo0clone().transform(cls, interfaceC7446uc1, z);
        }
        IL1.c(cls);
        IL1.c(interfaceC7446uc1);
        this.transformations.put(cls, interfaceC7446uc1);
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
