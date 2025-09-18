package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.common.api.internal.TaskUtil;

/* renamed from: ly1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC5794ly1 extends IStatusCallback.Stub {
    public final /* synthetic */ S81 a;

    public BinderC5794ly1(S81 s81) {
        this.a = s81;
    }

    @Override // com.google.android.gms.common.api.internal.IStatusCallback
    public final void onResult(Status status) {
        TaskUtil.setResultOrApiException(status, this.a);
    }
}
