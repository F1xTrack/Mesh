package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import p000.InterfaceC1319Uy;

/* loaded from: classes.dex */
final class zacx implements InterfaceC1319Uy {
    @Override // p000.InterfaceC1319Uy
    public final /* bridge */ /* synthetic */ Object then(Task task) throws Exception {
        if (((Boolean) task.mo11142i()).booleanValue()) {
            return null;
        }
        throw new ApiException(new Status(13, "listener already unregistered"));
    }
}
