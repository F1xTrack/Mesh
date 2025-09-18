package defpackage;

import android.os.RemoteException;
import com.vk.push.core.base.AsyncCallback;
import com.vk.push.core.push.PushProvider;
import com.vk.push.core.test.TestPushPayload;
import com.vk.push.core.test.TestPushProvider;
import kotlin.jvm.functions.Function2;

/* renamed from: cI, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2487cI extends AbstractC1676Vg0 implements Function2 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2487cI(Object obj, int i, Object obj2) {
        super(2);
        this.e = i;
        this.f = obj;
        this.g = obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws RemoteException {
        switch (this.e) {
            case 0:
                break;
            case 1:
                PushProvider pushProvider = (PushProvider) obj;
                AsyncCallback asyncCallback = (AsyncCallback) obj2;
                O90.f(pushProvider, "service");
                O90.f(asyncCallback, "callback");
                pushProvider.registerForPushes((String) this.f, ((C1944Yr1) this.g).m, asyncCallback);
                break;
            case 2:
                TestPushProvider testPushProvider = (TestPushProvider) obj;
                AsyncCallback asyncCallback2 = (AsyncCallback) obj2;
                O90.f(testPushProvider, "service");
                O90.f(asyncCallback2, "callback");
                testPushProvider.registerForPushes((String) this.f, ((C5782lu1) this.g).m, asyncCallback2);
                break;
            default:
                TestPushProvider testPushProvider2 = (TestPushProvider) obj;
                AsyncCallback asyncCallback3 = (AsyncCallback) obj2;
                O90.f(testPushProvider2, "service");
                O90.f(asyncCallback3, "callback");
                testPushProvider2.sendTestPush((String) this.f, (TestPushPayload) this.g, asyncCallback3);
                break;
        }
        return C1518Tf1.a;
    }
}
