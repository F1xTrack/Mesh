package p000;

import com.p019vk.push.common.Logger;
import com.p019vk.push.core.base.AsyncCallback;
import com.p019vk.push.core.base.exception.SdkIsNotInitializedException;
import com.p019vk.push.core.base.exception.TransferredIpcDataException;
import com.p019vk.push.core.domain.model.CallingAppIds;
import com.p019vk.push.core.push.PushClient;
import com.p019vk.push.core.utils.AidlExtensionsKt;
import com.p019vk.push.core.utils.BinderExtensionsKt;
import com.p019vk.push.core.utils.StringExtensionsKt;
import java.util.List;

/* renamed from: fv1 */
/* loaded from: classes2.dex */
public final class BinderC9430fv1 extends PushClient.Stub {

    /* renamed from: a */
    public final F71 f27463a;

    /* renamed from: b */
    public final F71 f27464b;

    /* renamed from: g */
    public final F71 f27465g;

    public BinderC9430fv1(F71 f71, F71 f712, F71 f713) {
        O90.m5968f(f71, "messagesIPCInteractorLazy");
        O90.m5968f(f712, "clientServiceInteractorLazy");
        O90.m5968f(f713, "loggerLazy");
        this.f27463a = f71;
        this.f27464b = f712;
        this.f27465g = f713;
    }

    @Override // com.p019vk.push.core.push.PushClient
    public final void isPushTokenExist(String str, AsyncCallback asyncCallback) {
        if (C7821Jt1.f5775v == null) {
            if (asyncCallback != null) {
                AidlExtensionsKt.safeOnResult(asyncCallback, new SdkIsNotInitializedException("Is push token exist called with client sdk not being initialized"), (Logger) this.f27465g.getValue());
                return;
            }
            return;
        }
        if (asyncCallback == null || str == null) {
            Logger.DefaultImpls.warn$default((Logger) this.f27465g.getValue(), "Token or callback argument is null for some reason", null, 2, null);
            if (asyncCallback != null) {
                AidlExtensionsKt.safeOnResult(asyncCallback, new TransferredIpcDataException("token is null"), (Logger) this.f27465g.getValue());
                return;
            }
            return;
        }
        C10962rt1 c10962rt1 = (C10962rt1) this.f27464b.getValue();
        CallingAppIds callingIds = BinderExtensionsKt.getCallingIds(this);
        c10962rt1.getClass();
        O90.m5968f(callingIds, "callingAppIds");
        Logger.DefaultImpls.info$default(c10962rt1.f41949g, "Checking is push token " + StringExtensionsKt.hideSensitive(str) + " exist...", null, 2, null);
        AbstractC9366fP1.m18230b(c10962rt1.f41950h, null, new C8599Ys1(c10962rt1, callingIds, asyncCallback, str, null), 3);
    }

    @Override // com.p019vk.push.core.push.PushClient
    public final void onDeletedMessages(AsyncCallback asyncCallback) {
        if (C7821Jt1.f5775v == null) {
            if (asyncCallback != null) {
                AidlExtensionsKt.safeOnResult(asyncCallback, new SdkIsNotInitializedException("Delete messages called with client sdk not being initialized"), (Logger) this.f27465g.getValue());
            }
        } else {
            if (asyncCallback == null) {
                Logger.DefaultImpls.warn$default((Logger) this.f27465g.getValue(), "Callback is null for some reason", null, 2, null);
                return;
            }
            C10962rt1 c10962rt1 = (C10962rt1) this.f27464b.getValue();
            CallingAppIds callingIds = BinderExtensionsKt.getCallingIds(this);
            c10962rt1.getClass();
            O90.m5968f(callingIds, "callingAppIds");
            Logger.DefaultImpls.info$default(c10962rt1.f41949g, "On delete messages has requested", null, 2, null);
            AbstractC9366fP1.m18230b(c10962rt1.f41950h, null, new C8909bt1(c10962rt1, callingIds, asyncCallback, null), 3);
        }
    }

    @Override // com.p019vk.push.core.push.PushClient
    public final void onMessagesReceived(List list, AsyncCallback asyncCallback) {
        if (C7821Jt1.f5775v == null) {
            if (asyncCallback != null) {
                AidlExtensionsKt.safeOnResult(asyncCallback, new SdkIsNotInitializedException("Messages received called with client sdk not being initialized"), (Logger) this.f27465g.getValue());
            }
        } else {
            if (list == null || list.isEmpty() || asyncCallback == null) {
                Logger.DefaultImpls.warn$default((Logger) this.f27465g.getValue(), "Callback or messages is null for some reason", null, 2, null);
                if (asyncCallback != null) {
                    AidlExtensionsKt.safeOnResult(asyncCallback, new TransferredIpcDataException("messages is null"), (Logger) this.f27465g.getValue());
                    return;
                }
                return;
            }
            C11730xu1 c11730xu1 = (C11730xu1) this.f27463a.getValue();
            CallingAppIds callingIds = BinderExtensionsKt.getCallingIds(this);
            c11730xu1.getClass();
            O90.m5968f(callingIds, "callingAppIds");
            AbstractC9366fP1.m18230b(c11730xu1.f45890h, null, new C11348uu1(c11730xu1, callingIds, asyncCallback, list, null), 3);
        }
    }

    @Override // com.p019vk.push.core.push.PushClient
    public final void onTokenInvalidated(AsyncCallback asyncCallback) {
        if (C7821Jt1.f5775v == null) {
            if (asyncCallback != null) {
                AidlExtensionsKt.safeOnResult(asyncCallback, new SdkIsNotInitializedException("Token invalidated called with client sdk not being initialized"), (Logger) this.f27465g.getValue());
            }
        } else {
            if (asyncCallback == null) {
                Logger.DefaultImpls.warn$default((Logger) this.f27465g.getValue(), "Callback is null for some reason", null, 2, null);
                return;
            }
            C10962rt1 c10962rt1 = (C10962rt1) this.f27464b.getValue();
            CallingAppIds callingIds = BinderExtensionsKt.getCallingIds(this);
            c10962rt1.getClass();
            O90.m5968f(callingIds, "callingAppIds");
            Logger.DefaultImpls.info$default(c10962rt1.f41949g, "Token invalidation has requested", null, 2, null);
            AbstractC9366fP1.m18230b(c10962rt1.f41950h, null, new C9298et1(c10962rt1, callingIds, asyncCallback, null), 3);
        }
    }
}
