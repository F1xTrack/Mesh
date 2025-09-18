package defpackage;

import com.vk.push.common.Logger;
import com.vk.push.core.base.AsyncCallback;
import com.vk.push.core.base.exception.SdkIsNotInitializedException;
import com.vk.push.core.base.exception.TransferredIpcDataException;
import com.vk.push.core.domain.model.CallingAppIds;
import com.vk.push.core.push.PushClient;
import com.vk.push.core.utils.AidlExtensionsKt;
import com.vk.push.core.utils.BinderExtensionsKt;
import com.vk.push.core.utils.StringExtensionsKt;
import java.util.List;

/* renamed from: fv1 */
/* loaded from: classes2.dex */
public final class BinderC3863fv1 extends PushClient.Stub {
    public final F71 a;
    public final F71 b;
    public final F71 g;

    public BinderC3863fv1(F71 f71, F71 f712, F71 f713) {
        O90.f(f71, "messagesIPCInteractorLazy");
        O90.f(f712, "clientServiceInteractorLazy");
        O90.f(f713, "loggerLazy");
        this.a = f71;
        this.b = f712;
        this.g = f713;
    }

    @Override // com.vk.push.core.push.PushClient
    public final void isPushTokenExist(String str, AsyncCallback asyncCallback) {
        if (C0781Jt1.v == null) {
            if (asyncCallback != null) {
                AidlExtensionsKt.safeOnResult(asyncCallback, new SdkIsNotInitializedException("Is push token exist called with client sdk not being initialized"), (Logger) this.g.getValue());
                return;
            }
            return;
        }
        if (asyncCallback == null || str == null) {
            Logger.DefaultImpls.warn$default((Logger) this.g.getValue(), "Token or callback argument is null for some reason", null, 2, null);
            if (asyncCallback != null) {
                AidlExtensionsKt.safeOnResult(asyncCallback, new TransferredIpcDataException("token is null"), (Logger) this.g.getValue());
                return;
            }
            return;
        }
        C6924rt1 c6924rt1 = (C6924rt1) this.b.getValue();
        CallingAppIds callingIds = BinderExtensionsKt.getCallingIds(this);
        c6924rt1.getClass();
        O90.f(callingIds, "callingAppIds");
        Logger.DefaultImpls.info$default(c6924rt1.g, "Checking is push token " + StringExtensionsKt.hideSensitive(str) + " exist...", null, 2, null);
        AbstractC3767fP1.b(c6924rt1.h, null, new C1947Ys1(c6924rt1, callingIds, asyncCallback, str, null), 3);
    }

    @Override // com.vk.push.core.push.PushClient
    public final void onDeletedMessages(AsyncCallback asyncCallback) {
        if (C0781Jt1.v == null) {
            if (asyncCallback != null) {
                AidlExtensionsKt.safeOnResult(asyncCallback, new SdkIsNotInitializedException("Delete messages called with client sdk not being initialized"), (Logger) this.g.getValue());
            }
        } else {
            if (asyncCallback == null) {
                Logger.DefaultImpls.warn$default((Logger) this.g.getValue(), "Callback is null for some reason", null, 2, null);
                return;
            }
            C6924rt1 c6924rt1 = (C6924rt1) this.b.getValue();
            CallingAppIds callingIds = BinderExtensionsKt.getCallingIds(this);
            c6924rt1.getClass();
            O90.f(callingIds, "callingAppIds");
            Logger.DefaultImpls.info$default(c6924rt1.g, "On delete messages has requested", null, 2, null);
            AbstractC3767fP1.b(c6924rt1.h, null, new C2410bt1(c6924rt1, callingIds, asyncCallback, null), 3);
        }
    }

    @Override // com.vk.push.core.push.PushClient
    public final void onMessagesReceived(List list, AsyncCallback asyncCallback) {
        if (C0781Jt1.v == null) {
            if (asyncCallback != null) {
                AidlExtensionsKt.safeOnResult(asyncCallback, new SdkIsNotInitializedException("Messages received called with client sdk not being initialized"), (Logger) this.g.getValue());
            }
        } else {
            if (list == null || list.isEmpty() || asyncCallback == null) {
                Logger.DefaultImpls.warn$default((Logger) this.g.getValue(), "Callback or messages is null for some reason", null, 2, null);
                if (asyncCallback != null) {
                    AidlExtensionsKt.safeOnResult(asyncCallback, new TransferredIpcDataException("messages is null"), (Logger) this.g.getValue());
                    return;
                }
                return;
            }
            C8071xu1 c8071xu1 = (C8071xu1) this.a.getValue();
            CallingAppIds callingIds = BinderExtensionsKt.getCallingIds(this);
            c8071xu1.getClass();
            O90.f(callingIds, "callingAppIds");
            AbstractC3767fP1.b(c8071xu1.h, null, new C7500uu1(c8071xu1, callingIds, asyncCallback, list, null), 3);
        }
    }

    @Override // com.vk.push.core.push.PushClient
    public final void onTokenInvalidated(AsyncCallback asyncCallback) {
        if (C0781Jt1.v == null) {
            if (asyncCallback != null) {
                AidlExtensionsKt.safeOnResult(asyncCallback, new SdkIsNotInitializedException("Token invalidated called with client sdk not being initialized"), (Logger) this.g.getValue());
            }
        } else {
            if (asyncCallback == null) {
                Logger.DefaultImpls.warn$default((Logger) this.g.getValue(), "Callback is null for some reason", null, 2, null);
                return;
            }
            C6924rt1 c6924rt1 = (C6924rt1) this.b.getValue();
            CallingAppIds callingIds = BinderExtensionsKt.getCallingIds(this);
            c6924rt1.getClass();
            O90.f(callingIds, "callingAppIds");
            Logger.DefaultImpls.info$default(c6924rt1.g, "Token invalidation has requested", null, 2, null);
            AbstractC3767fP1.b(c6924rt1.h, null, new C3666et1(c6924rt1, callingIds, asyncCallback, null), 3);
        }
    }
}
