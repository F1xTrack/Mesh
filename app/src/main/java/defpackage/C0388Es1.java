package defpackage;

import com.vk.push.common.Logger;
import com.vk.push.core.backoff.BackOff;
import com.vk.push.core.base.exception.HostIsNotMasterException;
import com.vk.push.core.ipc.NoHostsToBindException;
import com.vk.push.core.network.exception.VkpnsRequestException;
import com.vk.push.core.retry.RequestRetryComponent;
import java.io.IOException;

/* renamed from: Es1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0388Es1 extends RequestRetryComponent {
    public final /* synthetic */ int d = 1;
    public final Logger e;

    /* JADX WARN: Illegal instructions before constructor call */
    public C0388Es1(Logger logger) {
        BackOff backOffCreateDefaultBackOffForRequest = RequestRetryComponent.INSTANCE.createDefaultBackOffForRequest();
        O90.f(logger, "logger");
        O90.f(backOffCreateDefaultBackOffForRequest, "backOff");
        super(backOffCreateDefaultBackOffForRequest);
        this.e = logger.createLogger("PushTokenRequestRetryComponent");
    }

    @Override // com.vk.push.core.retry.RequestRetryComponent
    public final Logger getLogger() {
        switch (this.d) {
        }
        return this.e;
    }

    @Override // com.vk.push.core.retry.RequestRetryComponent
    public final boolean isRetryableError(Throwable th) {
        int httpStatusCode;
        switch (this.d) {
            case 0:
                O90.f(th, Core.Event.Result.EXCEPTION);
                if (th instanceof HostIsNotMasterException) {
                    return true;
                }
                return th instanceof NoHostsToBindException;
            default:
                O90.f(th, Core.Event.Result.EXCEPTION);
                if (!(th instanceof IOException)) {
                    if (th instanceof VkpnsRequestException) {
                        VkpnsRequestException vkpnsRequestException = (VkpnsRequestException) th;
                        if (vkpnsRequestException.getHttpStatusCode() == 429 || (500 <= (httpStatusCode = vkpnsRequestException.getHttpStatusCode()) && httpStatusCode < 600)) {
                        }
                    }
                    return false;
                }
                return true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0388Es1(Logger logger, BackOff backOff) {
        super(backOff);
        O90.f(logger, "logger");
        O90.f(backOff, "backOff");
        this.e = logger.createLogger("IPCClientRetryComponent");
    }
}
