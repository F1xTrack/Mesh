package com.bumptech.glide;

import android.content.Context;
import android.graphics.Bitmap;
import com.dylanvann.fastimage.FastImageGlideModule;
import com.dylanvann.fastimage.FastImageOkHttpProgressGlideModule;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Set;
import p000.C11481vx0;
import p000.C11490w10;
import p000.C6314kf;
import p000.C6440mf;
import p000.C9158dn1;
import p000.C9239eQ0;
import p000.MR0;
import p000.OJ1;

/* loaded from: classes.dex */
final class GeneratedAppGlideModuleImpl extends GeneratedAppGlideModule {

    /* renamed from: a */
    public final FastImageGlideModule f17770a = new FastImageGlideModule();

    public GeneratedAppGlideModuleImpl(Context context) {
    }

    @Override // com.bumptech.glide.GeneratedAppGlideModule
    /* renamed from: a */
    public final Set mo10881a() {
        return Collections.emptySet();
    }

    @Override // p000.AbstractC0323F7
    public final void applyOptions(Context context, C11490w10 c11490w10) {
        this.f17770a.applyOptions(context, c11490w10);
    }

    @Override // com.bumptech.glide.GeneratedAppGlideModule
    /* renamed from: b */
    public final MR0 mo10882b() {
        return new OJ1(14);
    }

    @Override // p000.AbstractC0323F7
    public final boolean isManifestParsingEnabled() {
        return this.f17770a.isManifestParsingEnabled();
    }

    @Override // p000.AbstractC11705xi0
    public final void registerComponents(Context context, ComponentCallbacks2C1874a componentCallbacks2C1874a, C9239eQ0 c9239eQ0) {
        C6314kf c6314kf = new C6314kf(componentCallbacks2C1874a.f17774b);
        c9239eQ0.m17936j("legacy_prepend_all", ByteBuffer.class, Bitmap.class, c6314kf);
        c9239eQ0.m17936j("legacy_prepend_all", InputStream.class, Bitmap.class, new C6440mf(c9239eQ0.m17932f(), c6314kf, componentCallbacks2C1874a.f17777e));
        c9239eQ0.m17940n(new C11481vx0(0));
        new C9158dn1().registerComponents(context, componentCallbacks2C1874a, c9239eQ0);
        new FastImageOkHttpProgressGlideModule().registerComponents(context, componentCallbacks2C1874a, c9239eQ0);
        this.f17770a.registerComponents(context, componentCallbacks2C1874a, c9239eQ0);
    }
}
