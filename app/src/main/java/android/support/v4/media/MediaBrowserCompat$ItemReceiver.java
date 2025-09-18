package android.support.v4.media;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import p000.AbstractC7500Dp0;
import p000.SS0;

/* loaded from: classes.dex */
class MediaBrowserCompat$ItemReceiver extends SS0 {
    @Override // p000.SS0
    /* renamed from: a */
    public final void mo7371a(int i, Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(AbstractC7500Dp0.class.getClassLoader());
            try {
                bundle.isEmpty();
            } catch (BadParcelableException unused) {
                bundle = null;
            }
        }
        if (i != 0 || bundle == null || !bundle.containsKey("media_item")) {
            throw null;
        }
        Parcelable parcelable = bundle.getParcelable("media_item");
        if (parcelable != null && !(parcelable instanceof MediaBrowserCompat$MediaItem)) {
            throw null;
        }
        throw null;
    }
}
