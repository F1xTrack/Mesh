package defpackage;

import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.location.LocationSettingsResponse;
import com.google.android.gms.location.LocationSettingsResult;

/* loaded from: classes.dex */
public final class FD1 extends AbstractBinderC4262i02 {
    public final /* synthetic */ S81 a;

    public FD1(S81 s81) {
        this.a = s81;
    }

    @Override // defpackage.J02
    public final void f(LocationSettingsResult locationSettingsResult) {
        TaskUtil.setResultOrApiException(locationSettingsResult.getStatus(), new LocationSettingsResponse(locationSettingsResult), this.a);
    }
}
