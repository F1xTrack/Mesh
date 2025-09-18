package defpackage;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.location.LocationListener;

/* renamed from: uz1 */
/* loaded from: classes.dex */
public final class C7515uz1 extends AbstractC3722fA1 {
    public final /* synthetic */ LocationListener a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7515uz1(GoogleApiClient googleApiClient, LocationListener locationListener) {
        super(googleApiClient);
        this.a = locationListener;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) {
        ((C8325zE1) anyClient).e(ListenerHolders.createListenerKey(this.a, "LocationListener"), true, C5453kA1.a(this));
    }
}
