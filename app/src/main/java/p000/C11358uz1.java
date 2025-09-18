package p000;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.location.LocationListener;

/* renamed from: uz1 */
/* loaded from: classes.dex */
public final class C11358uz1 extends AbstractC9336fA1 {

    /* renamed from: a */
    public final /* synthetic */ LocationListener f44062a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11358uz1(GoogleApiClient googleApiClient, LocationListener locationListener) {
        super(googleApiClient);
        this.f44062a = locationListener;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) {
        ((C11900zE1) anyClient).m26338e(ListenerHolders.createListenerKey(this.f44062a, "LocationListener"), true, C9976kA1.m22159a(this));
    }
}
