package defpackage;

import android.location.Location;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;

/* renamed from: Vz1 */
/* loaded from: classes.dex */
public final class C1734Vz1 extends AbstractC3722fA1 {
    public final /* synthetic */ Location a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1734Vz1(GoogleApiClient googleApiClient, Location location) {
        super(googleApiClient);
        this.a = location;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) {
        ((C8325zE1) anyClient).p(this.a, C5453kA1.a(this));
    }
}
