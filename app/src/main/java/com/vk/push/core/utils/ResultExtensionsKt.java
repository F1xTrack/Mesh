package com.vk.push.core.utils;

import android.os.Parcelable;
import com.vk.push.core.base.AidlException;
import com.vk.push.core.base.AidlResult;
import com.vk.push.core.base.exception.HostIsNotMasterException;
import com.vk.push.core.base.exception.SdkIsNotInitializedException;
import com.vk.push.core.base.exception.TransferredIpcDataException;
import defpackage.AbstractC7538v51;
import defpackage.InterfaceC5908mZ;
import defpackage.InterfaceC6099nZ;
import defpackage.O90;
import defpackage.OS0;
import defpackage.RQ1;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000F\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a/\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a(\u0010\f\u001a\u0006\u0012\u0002\b\u00030\b\"\b\b\u0000\u0010\u0005*\u00020\u0004*\b\u0012\u0004\u0012\u00028\u00000\u000bø\u0001\u0001¢\u0006\u0004\b\f\u0010\r\u001aY\u0010\u0014\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000e\"\b\b\u0001\u0010\u0005*\u00020\u0004*\b\u0012\u0004\u0012\u00028\u00010\b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u000f2\u0016\u0010\u0013\u001a\u0012\u0012\b\u0012\u00060\u0011j\u0002`\u0012\u0012\u0004\u0012\u00028\u00000\u000fH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001a\u0010\u0018\u001a\u00020\u0017*\b\u0012\u0004\u0012\u00020\u00160\u000bø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u0082\u0002\u000b\n\u0005\b\u009920\u0001\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"", "Lcom/vk/push/core/base/AidlException;", "toAidlException", "(Ljava/lang/Throwable;)Lcom/vk/push/core/base/AidlException;", "Landroid/os/Parcelable;", "T", "Lkotlin/Function0;", "block", "Lcom/vk/push/core/base/AidlResult;", "runCatchingResult", "(LmZ;)Lcom/vk/push/core/base/AidlResult;", "LPS0;", "toAidlResult", "(Ljava/lang/Object;)Lcom/vk/push/core/base/AidlResult;", "R", "Lkotlin/Function1;", "onSuccess", "Ljava/lang/Exception;", "Lkotlin/Exception;", "onFailure", "fold", "(Lcom/vk/push/core/base/AidlResult;LnZ;LnZ;)Ljava/lang/Object;", "", "", "isValid", "(Ljava/lang/Object;)Z", "core_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class ResultExtensionsKt {
    public static final <R, T extends Parcelable> R fold(AidlResult<T> aidlResult, InterfaceC6099nZ interfaceC6099nZ, InterfaceC6099nZ interfaceC6099nZ2) {
        O90.f(aidlResult, "<this>");
        O90.f(interfaceC6099nZ, "onSuccess");
        O90.f(interfaceC6099nZ2, "onFailure");
        Exception excExceptionOrNull = aidlResult.exceptionOrNull();
        return excExceptionOrNull == null ? (R) interfaceC6099nZ.invoke(aidlResult.getData()) : (R) interfaceC6099nZ2.invoke(excExceptionOrNull);
    }

    public static final boolean isValid(Object obj) {
        boolean z = obj instanceof OS0;
        if (!z) {
            if (z) {
                obj = null;
            }
            CharSequence charSequence = (CharSequence) obj;
            if (charSequence != null && !AbstractC7538v51.C(charSequence)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T extends Parcelable> AidlResult<?> runCatchingResult(InterfaceC5908mZ interfaceC5908mZ) {
        O90.f(interfaceC5908mZ, "block");
        try {
            return AidlResult.INSTANCE.success((Parcelable) interfaceC5908mZ.invoke());
        } catch (Exception e) {
            return AidlResult.INSTANCE.failure(e);
        }
    }

    public static final AidlException toAidlException(Throwable th) {
        O90.f(th, "<this>");
        String strValueOf = String.valueOf(th.getMessage());
        return th instanceof HostIsNotMasterException ? new AidlException(AidlException.HOST_IS_NOT_MASTER, strValueOf) : th instanceof SdkIsNotInitializedException ? new AidlException(104, strValueOf) : th instanceof TransferredIpcDataException ? new AidlException(105, strValueOf) : th instanceof IllegalStateException ? new AidlException(102, strValueOf) : th instanceof IllegalArgumentException ? new AidlException(AidlException.ILLEGAL_ARGUMENT_EXCEPTION, strValueOf) : th instanceof RuntimeException ? new AidlException(100, strValueOf) : new AidlException(0, strValueOf);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T extends Parcelable> AidlResult<?> toAidlResult(Object obj) {
        try {
            AidlResult.Companion companion = AidlResult.INSTANCE;
            RQ1.d(obj);
            return companion.success((Parcelable) obj);
        } catch (Exception e) {
            return AidlResult.INSTANCE.failure(e);
        }
    }
}
