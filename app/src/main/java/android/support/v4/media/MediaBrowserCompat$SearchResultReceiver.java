package android.support.v4.media;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import p000.AbstractC7500Dp0;
import p000.SS0;

/* loaded from: classes.dex */
class MediaBrowserCompat$SearchResultReceiver extends SS0 {
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
        if (i != 0 || bundle == null || !bundle.containsKey("search_results")) {
            throw null;
        }
        Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
        parcelableArray.getClass();
        ArrayList arrayList = new ArrayList(parcelableArray.length);
        for (Parcelable parcelable : parcelableArray) {
            arrayList.add((MediaBrowserCompat$MediaItem) parcelable);
        }
        throw null;
    }
}
