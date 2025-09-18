package com.p019vk.push.core.utils;

import android.os.Parcelable;
import android.os.RemoteException;
import com.huawei.hms.p015rn.push.constants.Core;
import com.p019vk.push.common.Logger;
import com.p019vk.push.core.base.AidlResult;
import com.p019vk.push.core.base.AsyncCallback;
import kotlin.Metadata;
import p000.InterfaceC6497nZ;
import p000.O90;

@Metadata(m22266d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aC\u0010\t\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a!\u0010\t\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\t\u0010\u000f\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0010"}, m22267d2 = {"Landroid/os/Parcelable;", "T", "Lcom/vk/push/core/base/AsyncCallback;", "Lcom/vk/push/core/base/AidlResult;", "result", "Lkotlin/Function1;", "Landroid/os/RemoteException;", "LTf1;", "onRemoteErrorAction", "safeOnResult", "(Lcom/vk/push/core/base/AsyncCallback;Lcom/vk/push/core/base/AidlResult;LnZ;)V", "Ljava/lang/Exception;", Core.Event.Result.EXCEPTION, "Lcom/vk/push/common/Logger;", "logger", "(Lcom/vk/push/core/base/AsyncCallback;Ljava/lang/Exception;Lcom/vk/push/common/Logger;)V", "core_release"}, m22268k = 2, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class AidlExtensionsKt {
    public static final <T extends Parcelable> void safeOnResult(AsyncCallback asyncCallback, AidlResult<T> aidlResult, InterfaceC6497nZ interfaceC6497nZ) {
        O90.m5968f(asyncCallback, "<this>");
        O90.m5968f(aidlResult, "result");
        O90.m5968f(interfaceC6497nZ, "onRemoteErrorAction");
        try {
            asyncCallback.onResult(aidlResult);
        } catch (RemoteException e) {
            interfaceC6497nZ.invoke(e);
        }
    }

    public static final void safeOnResult(AsyncCallback asyncCallback, Exception exc, Logger logger) {
        O90.m5968f(asyncCallback, "<this>");
        O90.m5968f(exc, Core.Event.Result.EXCEPTION);
        O90.m5968f(logger, "logger");
        try {
            asyncCallback.onResult(AidlResult.INSTANCE.failure(exc));
        } catch (RemoteException e) {
            logger.error("Error with message \"" + exc.getMessage() + "\" could not be returned by ipc", e);
        }
    }
}
