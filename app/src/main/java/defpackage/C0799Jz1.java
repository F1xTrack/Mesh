package defpackage;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.location.LocationCallback;

/* renamed from: Jz1 */
/* loaded from: classes.dex */
public final class C0799Jz1 extends AbstractC3722fA1 {
    public final /* synthetic */ LocationCallback a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0799Jz1(GoogleApiClient googleApiClient, LocationCallback locationCallback) {
        super(googleApiClient);
        this.a = locationCallback;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) {
        ((C8325zE1) anyClient).d(ListenerHolders.createListenerKey(this.a, "LocationCallback"), true, C5453kA1.a(this));
    }
}
