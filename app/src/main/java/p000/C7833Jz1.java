package p000;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.location.LocationCallback;

/* renamed from: Jz1 */
/* loaded from: classes.dex */
public final class C7833Jz1 extends AbstractC9336fA1 {

    /* renamed from: a */
    public final /* synthetic */ LocationCallback f5830a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7833Jz1(GoogleApiClient googleApiClient, LocationCallback locationCallback) {
        super(googleApiClient);
        this.f5830a = locationCallback;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) {
        ((C11900zE1) anyClient).m26337d(ListenerHolders.createListenerKey(this.f5830a, "LocationCallback"), true, C9976kA1.m22159a(this));
    }
}
