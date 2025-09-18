package com.vk.push.core.ipc;

import android.os.RemoteException;
import com.vk.push.common.AppInfo;
import com.vk.push.common.Logger;
import com.vk.push.core.base.AidlResult;
import com.vk.push.core.base.AsyncCallback;
import com.vk.push.core.ipc.IpcRequest;
import com.vk.push.core.utils.CoroutineExtensionsKt;
import defpackage.C5284jI;
import defpackage.InterfaceC0611Hp;
import defpackage.InterfaceC6099nZ;
import defpackage.O90;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.ok.tracer.base.ucum.UcumUtils;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003:\u0002\"#JA\u0010\n\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u00052 \b\u0002\u0010\t\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000\u0012\u0004\u0012\u00020\b0\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\b2\n\u0010\u000e\u001a\u00060\fj\u0002`\r¢\u0006\u0004\b\u000f\u0010\u0010R*\u0010\u0015\u001a\u0012\u0012\b\u0012\u00060\fj\u0002`\r\u0012\u0004\u0012\u00028\u00010\u00078\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R \u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00168\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010!\u001a\u00020\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \u0082\u0001\u0002$%¨\u0006&"}, d2 = {"Lcom/vk/push/core/ipc/IpcRequest;", "T", "V", "", "service", "Lcom/vk/push/common/AppInfo;", "host", "Lkotlin/Function1;", "LTf1;", "onRequestFinished", "execute", "(Ljava/lang/Object;Lcom/vk/push/common/AppInfo;LnZ;)V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "onError", "(Ljava/lang/Exception;)V", "a", "LnZ;", "getTransformErrorResult", "()LnZ;", "transformErrorResult", "LHp;", "b", "LHp;", "getContinuation", "()LHp;", "continuation", "", "c", "Ljava/lang/String;", "getIpcCallName", "()Ljava/lang/String;", "ipcCallName", "AsyncRequest", "SimpleRequest", "Lcom/vk/push/core/ipc/IpcRequest$AsyncRequest;", "Lcom/vk/push/core/ipc/IpcRequest$SimpleRequest;", "core_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public abstract class IpcRequest<T, V> {

    /* renamed from: a, reason: from kotlin metadata */
    public final InterfaceC6099nZ transformErrorResult;

    /* renamed from: b, reason: from kotlin metadata */
    public final InterfaceC0611Hp continuation;

    /* renamed from: c, reason: from kotlin metadata */
    public final String ipcCallName;

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0003Bu\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u001c\u0010\f\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00028\u00030\u0004\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0016\u0010\u0012\u001a\u0012\u0012\b\u0012\u00060\u0010j\u0002`\u0011\u0012\u0004\u0012\u00028\u00030\u000f\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00030\u0013¢\u0006\u0004\b\u0015\u0010\u0016J?\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00028\u00022\u0006\u0010\u0018\u001a\u00020\u000b2\u001e\u0010\u0019\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0003\u0012\u0004\u0012\u00020\u00060\u000fH\u0016¢\u0006\u0004\b\u001a\u0010\u001bR)\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R-\u0010\f\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00028\u00030\u00048\u0006¢\u0006\f\n\u0004\b$\u0010\u001d\u001a\u0004\b%\u0010\u001fR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lcom/vk/push/core/ipc/IpcRequest$AsyncRequest;", "T", "V", "Lcom/vk/push/core/ipc/IpcRequest;", "Lkotlin/Function2;", "Lcom/vk/push/core/base/AsyncCallback;", "LTf1;", "ipcCall", "", "ipcCallName", "Lcom/vk/push/core/base/AidlResult;", "Lcom/vk/push/common/AppInfo;", "transformSuccessResult", "Lcom/vk/push/common/Logger;", "logger", "Lkotlin/Function1;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "transformErrorResult", "LHp;", "continuation", "<init>", "(Lkotlin/jvm/functions/Function2;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lcom/vk/push/common/Logger;LnZ;LHp;)V", "service", "host", "onRequestFinished", "execute", "(Ljava/lang/Object;Lcom/vk/push/common/AppInfo;LnZ;)V", UcumUtils.UCUM_DAYS, "Lkotlin/jvm/functions/Function2;", "getIpcCall", "()Lkotlin/jvm/functions/Function2;", "e", "Ljava/lang/String;", "getIpcCallName", "()Ljava/lang/String;", "f", "getTransformSuccessResult", "g", "Lcom/vk/push/common/Logger;", "getLogger", "()Lcom/vk/push/common/Logger;", "core_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class AsyncRequest<T, V> extends IpcRequest<T, V> {

        /* renamed from: d, reason: from kotlin metadata */
        public final Function2 ipcCall;

        /* renamed from: e, reason: from kotlin metadata */
        public final String ipcCallName;

        /* renamed from: f, reason: from kotlin metadata */
        public final Function2 transformSuccessResult;

        /* renamed from: g, reason: from kotlin metadata */
        public final Logger logger;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AsyncRequest(Function2 function2, String str, Function2 function22, Logger logger, InterfaceC6099nZ interfaceC6099nZ, InterfaceC0611Hp interfaceC0611Hp) {
            super(interfaceC6099nZ, interfaceC0611Hp, str, null);
            O90.f(function2, "ipcCall");
            O90.f(str, "ipcCallName");
            O90.f(function22, "transformSuccessResult");
            O90.f(logger, "logger");
            O90.f(interfaceC6099nZ, "transformErrorResult");
            O90.f(interfaceC0611Hp, "continuation");
            this.ipcCall = function2;
            this.ipcCallName = str;
            this.transformSuccessResult = function22;
            this.logger = logger;
        }

        @Override // com.vk.push.core.ipc.IpcRequest
        public void execute(T service, final AppInfo host, final InterfaceC6099nZ onRequestFinished) {
            O90.f(host, "host");
            O90.f(onRequestFinished, "onRequestFinished");
            Logger.DefaultImpls.info$default(this.logger, getIpcCallName() + " ipc request is starting", null, 2, null);
            this.ipcCall.invoke(service, new AsyncCallback.Stub() { // from class: com.vk.push.core.ipc.IpcRequest$AsyncRequest$execute$1
                @Override // com.vk.push.core.base.AsyncCallback
                public void onResult(AidlResult<?> result) {
                    Object objInvoke;
                    O90.f(result, "result");
                    Exception excExceptionOrNull = result.exceptionOrNull();
                    IpcRequest.AsyncRequest asyncRequest = this.a;
                    if (excExceptionOrNull == null) {
                        result.getData();
                        Logger.DefaultImpls.info$default(asyncRequest.getLogger(), asyncRequest.getIpcCallName() + " ipc request is success", null, 2, null);
                        objInvoke = asyncRequest.getTransformSuccessResult().invoke(result, host);
                    } else {
                        Logger.DefaultImpls.info$default(asyncRequest.getLogger(), asyncRequest.getIpcCallName() + " ipc request is failure", null, 2, null);
                        objInvoke = asyncRequest.getTransformErrorResult().invoke(excExceptionOrNull);
                    }
                    CoroutineExtensionsKt.safeResume(asyncRequest.getContinuation(), objInvoke);
                    onRequestFinished.invoke(asyncRequest);
                }
            });
        }

        public final Function2 getIpcCall() {
            return this.ipcCall;
        }

        @Override // com.vk.push.core.ipc.IpcRequest
        public String getIpcCallName() {
            return this.ipcCallName;
        }

        public final Logger getLogger() {
            return this.logger;
        }

        public final Function2 getTransformSuccessResult() {
            return this.transformSuccessResult;
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0003BW\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00030\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0016\u0010\u000e\u001a\u0012\u0012\b\u0012\u00060\fj\u0002`\r\u0012\u0004\u0012\u00028\u00030\u000b\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00030\u000f¢\u0006\u0004\b\u0011\u0010\u0012J?\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00028\u00022\u0006\u0010\u0014\u001a\u00020\u00052\u001e\u0010\u0016\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0003\u0012\u0004\u0012\u00020\u00150\u000bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R)\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00030\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lcom/vk/push/core/ipc/IpcRequest$SimpleRequest;", "T", "V", "Lcom/vk/push/core/ipc/IpcRequest;", "Lkotlin/Function2;", "Lcom/vk/push/common/AppInfo;", "ipcCall", "", "ipcCallName", "Lcom/vk/push/common/Logger;", "logger", "Lkotlin/Function1;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "transformErrorResult", "LHp;", "continuation", "<init>", "(Lkotlin/jvm/functions/Function2;Ljava/lang/String;Lcom/vk/push/common/Logger;LnZ;LHp;)V", "service", "host", "LTf1;", "onRequestFinished", "execute", "(Ljava/lang/Object;Lcom/vk/push/common/AppInfo;LnZ;)V", UcumUtils.UCUM_DAYS, "Lkotlin/jvm/functions/Function2;", "getIpcCall", "()Lkotlin/jvm/functions/Function2;", "e", "Ljava/lang/String;", "getIpcCallName", "()Ljava/lang/String;", "f", "Lcom/vk/push/common/Logger;", "getLogger", "()Lcom/vk/push/common/Logger;", "core_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class SimpleRequest<T, V> extends IpcRequest<T, V> {

        /* renamed from: d, reason: from kotlin metadata */
        public final Function2 ipcCall;

        /* renamed from: e, reason: from kotlin metadata */
        public final String ipcCallName;

        /* renamed from: f, reason: from kotlin metadata */
        public final Logger logger;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SimpleRequest(Function2 function2, String str, Logger logger, InterfaceC6099nZ interfaceC6099nZ, InterfaceC0611Hp interfaceC0611Hp) {
            super(interfaceC6099nZ, interfaceC0611Hp, str, null);
            O90.f(function2, "ipcCall");
            O90.f(str, "ipcCallName");
            O90.f(logger, "logger");
            O90.f(interfaceC6099nZ, "transformErrorResult");
            O90.f(interfaceC0611Hp, "continuation");
            this.ipcCall = function2;
            this.ipcCallName = str;
            this.logger = logger;
        }

        @Override // com.vk.push.core.ipc.IpcRequest
        public void execute(T service, AppInfo host, InterfaceC6099nZ onRequestFinished) {
            O90.f(host, "host");
            O90.f(onRequestFinished, "onRequestFinished");
            Logger.DefaultImpls.info$default(this.logger, getIpcCallName() + " ipc request is starting", null, 2, null);
            CoroutineExtensionsKt.safeResume(getContinuation(), this.ipcCall.invoke(service, host));
            onRequestFinished.invoke(this);
        }

        public final Function2 getIpcCall() {
            return this.ipcCall;
        }

        @Override // com.vk.push.core.ipc.IpcRequest
        public String getIpcCallName() {
            return this.ipcCallName;
        }

        public final Logger getLogger() {
            return this.logger;
        }
    }

    public IpcRequest(InterfaceC6099nZ interfaceC6099nZ, InterfaceC0611Hp interfaceC0611Hp, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this.transformErrorResult = interfaceC6099nZ;
        this.continuation = interfaceC0611Hp;
        this.ipcCallName = str;
    }

    public static /* synthetic */ void execute$default(IpcRequest ipcRequest, Object obj, AppInfo appInfo, InterfaceC6099nZ interfaceC6099nZ, int i, Object obj2) throws RemoteException {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: execute");
        }
        if ((i & 4) != 0) {
            interfaceC6099nZ = C5284jI.F;
        }
        ipcRequest.execute(obj, appInfo, interfaceC6099nZ);
    }

    public abstract void execute(T service, AppInfo host, InterfaceC6099nZ onRequestFinished) throws RemoteException;

    public final InterfaceC0611Hp getContinuation() {
        return this.continuation;
    }

    public String getIpcCallName() {
        return this.ipcCallName;
    }

    public final InterfaceC6099nZ getTransformErrorResult() {
        return this.transformErrorResult;
    }

    public final void onError(Exception e) {
        O90.f(e, "e");
        CoroutineExtensionsKt.safeResume(this.continuation, this.transformErrorResult.invoke(e));
    }
}
