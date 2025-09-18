package p000;

import com.huawei.hms.p015rn.push.constants.Core;
import com.p019vk.push.common.Logger;
import com.p019vk.push.core.backoff.BackOff;
import com.p019vk.push.core.base.exception.HostIsNotMasterException;
import com.p019vk.push.core.ipc.NoHostsToBindException;
import com.p019vk.push.core.network.exception.VkpnsRequestException;
import com.p019vk.push.core.retry.RequestRetryComponent;
import java.io.IOException;

/* renamed from: Es1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7559Es1 extends RequestRetryComponent {

    /* renamed from: d */
    public final /* synthetic */ int f2936d = 1;

    /* renamed from: e */
    public final Logger f2937e;

    /* JADX WARN: Illegal instructions before constructor call */
    public C7559Es1(Logger logger) {
        BackOff backOffCreateDefaultBackOffForRequest = RequestRetryComponent.INSTANCE.createDefaultBackOffForRequest();
        O90.m5968f(logger, "logger");
        O90.m5968f(backOffCreateDefaultBackOffForRequest, "backOff");
        super(backOffCreateDefaultBackOffForRequest);
        this.f2937e = logger.createLogger("PushTokenRequestRetryComponent");
    }

    @Override // com.p019vk.push.core.retry.RequestRetryComponent
    public final Logger getLogger() {
        switch (this.f2936d) {
        }
        return this.f2937e;
    }

    @Override // com.p019vk.push.core.retry.RequestRetryComponent
    public final boolean isRetryableError(Throwable th) {
        int httpStatusCode;
        switch (this.f2936d) {
            case 0:
                O90.m5968f(th, Core.Event.Result.EXCEPTION);
                if (th instanceof HostIsNotMasterException) {
                    return true;
                }
                return th instanceof NoHostsToBindException;
            default:
                O90.m5968f(th, Core.Event.Result.EXCEPTION);
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
    public C7559Es1(Logger logger, BackOff backOff) {
        super(backOff);
        O90.m5968f(logger, "logger");
        O90.m5968f(backOff, "backOff");
        this.f2937e = logger.createLogger("IPCClientRetryComponent");
    }
}
