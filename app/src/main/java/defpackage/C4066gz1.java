package defpackage;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.location.LocationRequest;

/* renamed from: gz1 */
/* loaded from: classes.dex */
public final class C4066gz1 extends AbstractC3722fA1 {
    public final /* synthetic */ ListenerHolder a;
    public final /* synthetic */ LocationRequest b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4066gz1(GoogleApiClient googleApiClient, ListenerHolder listenerHolder, LocationRequest locationRequest) {
        super(googleApiClient);
        this.a = listenerHolder;
        this.b = locationRequest;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) {
        ((C8325zE1) anyClient).k(new C5826m71(8, this.a), this.b, C5453kA1.a(this));
    }
}
