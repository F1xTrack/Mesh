package p000;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.location.LocationRequest;

/* renamed from: Yy1 */
/* loaded from: classes.dex */
public final class C8611Yy1 extends AbstractC9336fA1 {

    /* renamed from: a */
    public final /* synthetic */ ListenerHolder f14626a;

    /* renamed from: b */
    public final /* synthetic */ LocationRequest f14627b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8611Yy1(GoogleApiClient googleApiClient, ListenerHolder listenerHolder, LocationRequest locationRequest) {
        super(googleApiClient);
        this.f14626a = listenerHolder;
        this.f14627b = locationRequest;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) {
        ((C11900zE1) anyClient).m26345l(new C10226m71(8, this.f14626a), this.f14627b, C9976kA1.m22159a(this));
    }
}
