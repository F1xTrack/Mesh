package defpackage;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;

/* loaded from: classes.dex */
public final class UG implements Spatializer$OnSpatializerStateChangedListener {
    public final /* synthetic */ C2103aH a;

    public UG(C2103aH c2103aH) {
        this.a = c2103aH;
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z) {
        C2103aH c2103aH = this.a;
        AbstractC1028My0 abstractC1028My0 = C2103aH.k;
        c2103aH.g();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z) {
        C2103aH c2103aH = this.a;
        AbstractC1028My0 abstractC1028My0 = C2103aH.k;
        c2103aH.g();
    }
}
