package com.google.android.gms.common.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Response;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.tasks.Task;
import p000.S81;

@KeepForSdk
/* loaded from: classes.dex */
public class PendingResultUtil {
    private static final zas zaa = new zao();

    @KeepForSdk
    public interface ResultConverter<R extends Result, T> {
        @KeepForSdk
        T convert(R r);
    }

    @KeepForSdk
    public static <R extends Result, T extends Response<R>> Task toResponseTask(PendingResult<R> pendingResult, T t) {
        return toTask(pendingResult, new zaq(t));
    }

    @KeepForSdk
    public static <R extends Result, T> Task toTask(PendingResult<R> pendingResult, ResultConverter<R, T> resultConverter) {
        zas zasVar = zaa;
        S81 s81 = new S81();
        pendingResult.addStatusListener(new zap(pendingResult, s81, resultConverter, zasVar));
        return s81.f10598a;
    }

    @KeepForSdk
    public static <R extends Result> Task toVoidTask(PendingResult<R> pendingResult) {
        return toTask(pendingResult, new zar());
    }
}
