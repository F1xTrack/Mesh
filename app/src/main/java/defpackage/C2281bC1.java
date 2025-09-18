package defpackage;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;

/* renamed from: bC1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2281bC1 extends AbstractC4110hC1 {
    public final /* synthetic */ PendingIntent a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2281bC1(GoogleApiClient googleApiClient, PendingIntent pendingIntent) {
        super(googleApiClient);
        this.a = pendingIntent;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final void doExecute(Api.AnyClient anyClient) {
        S81 s81 = new S81();
        s81.a.b(new C6446pN0(15, this));
        ((C8325zE1) anyClient).n(this.a, s81);
    }
}
