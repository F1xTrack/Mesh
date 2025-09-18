package p000;

import android.os.RemoteException;
import com.p019vk.push.core.base.AsyncCallback;
import com.p019vk.push.core.push.PushProvider;
import com.p019vk.push.core.test.TestPushPayload;
import com.p019vk.push.core.test.TestPushProvider;
import kotlin.jvm.functions.Function2;

/* renamed from: cI */
/* loaded from: classes2.dex */
public final class C1838cI extends AbstractC8418Vg0 implements Function2 {

    /* renamed from: e */
    public final /* synthetic */ int f17413e;

    /* renamed from: f */
    public final /* synthetic */ Object f17414f;

    /* renamed from: g */
    public final /* synthetic */ Object f17415g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1838cI(Object obj, int i, Object obj2) {
        super(2);
        this.f17413e = i;
        this.f17414f = obj;
        this.f17415g = obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws RemoteException {
        switch (this.f17413e) {
            case 0:
                break;
            case 1:
                PushProvider pushProvider = (PushProvider) obj;
                AsyncCallback asyncCallback = (AsyncCallback) obj2;
                O90.m5968f(pushProvider, "service");
                O90.m5968f(asyncCallback, "callback");
                pushProvider.registerForPushes((String) this.f17414f, ((C8597Yr1) this.f17415g).f14560m, asyncCallback);
                break;
            case 2:
                TestPushProvider testPushProvider = (TestPushProvider) obj;
                AsyncCallback asyncCallback2 = (AsyncCallback) obj2;
                O90.m5968f(testPushProvider, "service");
                O90.m5968f(asyncCallback2, "callback");
                testPushProvider.registerForPushes((String) this.f17414f, ((C10196lu1) this.f17415g).f37354m, asyncCallback2);
                break;
            default:
                TestPushProvider testPushProvider2 = (TestPushProvider) obj;
                AsyncCallback asyncCallback3 = (AsyncCallback) obj2;
                O90.m5968f(testPushProvider2, "service");
                O90.m5968f(asyncCallback3, "callback");
                testPushProvider2.sendTestPush((String) this.f17414f, (TestPushPayload) this.f17415g, asyncCallback3);
                break;
        }
        return C8313Tf1.f11463a;
    }
}
