package p000;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.location.LocationRequest;

/* renamed from: gz1 */
/* loaded from: classes.dex */
public final class C9566gz1 extends AbstractC9336fA1 {

    /* renamed from: a */
    public final /* synthetic */ ListenerHolder f28141a;

    /* renamed from: b */
    public final /* synthetic */ LocationRequest f28142b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9566gz1(GoogleApiClient googleApiClient, ListenerHolder listenerHolder, LocationRequest locationRequest) {
        super(googleApiClient);
        this.f28141a = listenerHolder;
        this.f28142b = locationRequest;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) {
        ((C11900zE1) anyClient).m26344k(new C10226m71(8, this.f28141a), this.f28142b, C9976kA1.m22159a(this));
    }
}
