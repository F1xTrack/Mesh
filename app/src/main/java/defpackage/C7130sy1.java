package defpackage;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.common.internal.Preconditions;

/* renamed from: sy1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7130sy1 implements BaseImplementation.ResultHolder {
    public final S81 a;

    public C7130sy1(S81 s81) {
        Preconditions.checkNotNull(s81);
        this.a = s81;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
    public final void setFailedResult(Status status) {
        if (status == null) {
            return;
        }
        this.a.a(new ApiException(status));
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
    public final /* synthetic */ void setResult(Object obj) {
        TaskUtil.setResultOrApiException((Status) obj, null, this.a);
    }
}
