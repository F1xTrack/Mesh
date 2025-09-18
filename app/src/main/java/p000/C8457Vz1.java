package p000;

import android.location.Location;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;

/* renamed from: Vz1 */
/* loaded from: classes.dex */
public final class C8457Vz1 extends AbstractC9336fA1 {

    /* renamed from: a */
    public final /* synthetic */ Location f12910a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8457Vz1(GoogleApiClient googleApiClient, Location location) {
        super(googleApiClient);
        this.f12910a = location;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) {
        ((C11900zE1) anyClient).m26349p(this.f12910a, C9976kA1.m22159a(this));
    }
}
