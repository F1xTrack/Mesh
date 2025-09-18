package p000;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;

/* renamed from: UG */
/* loaded from: classes.dex */
public final class C1275UG implements Spatializer$OnSpatializerStateChangedListener {

    /* renamed from: a */
    public final /* synthetic */ C1654aH f11708a;

    public C1275UG(C1654aH c1654aH) {
        this.f11708a = c1654aH;
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z) {
        C1654aH c1654aH = this.f11708a;
        AbstractC7986My0 abstractC7986My0 = C1654aH.f15413k;
        c1654aH.m9695g();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z) {
        C1654aH c1654aH = this.f11708a;
        AbstractC7986My0 abstractC7986My0 = C1654aH.f15413k;
        c1654aH.m9695g();
    }
}
