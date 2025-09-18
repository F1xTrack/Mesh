package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.common.api.internal.TaskUtil;

/* renamed from: ly1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC10204ly1 extends IStatusCallback.Stub {

    /* renamed from: a */
    public final /* synthetic */ S81 f37370a;

    public BinderC10204ly1(S81 s81) {
        this.f37370a = s81;
    }

    @Override // com.google.android.gms.common.api.internal.IStatusCallback
    public final void onResult(Status status) {
        TaskUtil.setResultOrApiException(status, this.f37370a);
    }
}
