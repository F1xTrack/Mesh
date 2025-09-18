package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ApiExceptionUtil;
import com.google.android.gms.tasks.Task;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import p000.C9450g32;
import p000.S81;
import p000.Y81;

@KeepForSdk
/* loaded from: classes.dex */
public class TaskUtil {
    @KeepForSdk
    public static void setResultOrApiException(Status status, S81 s81) {
        setResultOrApiException(status, null, s81);
    }

    @KeepForSdk
    @Deprecated
    public static Task toVoidTaskThatFailsOnFalse(Task task) {
        zacx zacxVar = new zacx();
        C9450g32 c9450g32 = (C9450g32) task;
        c9450g32.getClass();
        return c9450g32.mo11139f(Y81.f14171a, zacxVar);
    }

    @ResultIgnorabilityUnspecified
    @KeepForSdk
    public static <ResultT> boolean trySetResultOrApiException(Status status, ResultT resultt, S81 s81) {
        return status.isSuccess() ? s81.f10598a.m18391r(resultt) : s81.m7185c(ApiExceptionUtil.fromStatus(status));
    }

    @KeepForSdk
    public static <ResultT> void setResultOrApiException(Status status, ResultT resultt, S81 s81) {
        if (status.isSuccess()) {
            s81.m7184b(resultt);
        } else {
            s81.m7183a(ApiExceptionUtil.fromStatus(status));
        }
    }
}
