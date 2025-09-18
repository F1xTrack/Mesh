package com.google.android.gms.common.images;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Objects;
import java.lang.ref.WeakReference;
import p000.C10074kx1;
import p000.C9690hx1;
import p000.C9818ix1;

/* loaded from: classes.dex */
public final class zae extends zag {
    private final WeakReference zac;

    public zae(ImageView imageView, int i) {
        super(Uri.EMPTY, i);
        Asserts.checkNotNull(imageView);
        this.zac = new WeakReference(imageView);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zae)) {
            return false;
        }
        ImageView imageView = (ImageView) this.zac.get();
        ImageView imageView2 = (ImageView) ((zae) obj).zac.get();
        return (imageView2 == null || imageView == null || !Objects.equal(imageView2, imageView)) ? false : true;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // com.google.android.gms.common.images.zag
    public final void zaa(Drawable drawable, boolean z, boolean z2, boolean z3) {
        ImageView imageView = (ImageView) this.zac.get();
        if (imageView != null) {
            boolean z4 = (z2 || z) ? false : true;
            if (z4) {
                Drawable drawable2 = imageView.getDrawable();
                if (drawable2 == null) {
                    drawable2 = null;
                } else if (drawable2 instanceof C10074kx1) {
                    drawable2 = ((C10074kx1) drawable2).f36784k;
                }
                C10074kx1 c10074kx1 = new C10074kx1(null);
                if (drawable2 == null) {
                    drawable2 = C9690hx1.f28695a;
                }
                c10074kx1.f36783j = drawable2;
                drawable2.setCallback(c10074kx1);
                C9818ix1 c9818ix1 = c10074kx1.f36782i;
                c9818ix1.f34818b = drawable2.getChangingConfigurations() | c9818ix1.f34818b;
                if (drawable == null) {
                    drawable = C9690hx1.f28695a;
                }
                c10074kx1.f36784k = drawable;
                drawable.setCallback(c10074kx1);
                C9818ix1 c9818ix12 = c10074kx1.f36782i;
                c9818ix12.f34818b = drawable.getChangingConfigurations() | c9818ix12.f34818b;
                drawable = c10074kx1;
            }
            imageView.setImageDrawable(drawable);
            if (drawable == null || !z4) {
                return;
            }
            C10074kx1 c10074kx12 = (C10074kx1) drawable;
            c10074kx12.f36776c = c10074kx12.f36777d;
            c10074kx12.f36779f = 0;
            c10074kx12.f36778e = 250;
            c10074kx12.f36774a = 1;
            c10074kx12.invalidateSelf();
        }
    }

    public zae(ImageView imageView, Uri uri) {
        super(uri, 0);
        Asserts.checkNotNull(imageView);
        this.zac = new WeakReference(imageView);
    }
}
