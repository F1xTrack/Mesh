package p000;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.yandex.varioqub.config.model.ConfigValue;
import io.sentry.transport.C6161m;
import java.util.ArrayList;
import java.util.TimerTask;

/* renamed from: JX */
/* loaded from: classes2.dex */
public final class C0601JX extends TimerTask {

    /* renamed from: a */
    public final /* synthetic */ int f5577a;

    /* renamed from: b */
    public final /* synthetic */ Object f5578b;

    public /* synthetic */ C0601JX(int i, Object obj) {
        this.f5577a = i;
        this.f5578b = obj;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        switch (this.f5577a) {
            case 0:
                C10189lr0 c10189lr0 = (C10189lr0) this.f5578b;
                C4140gp c4140gp = (C4140gp) c10189lr0.f37323b;
                double dLongValue = (((Long) AbstractC7167xu.m25957C((ArrayList) c10189lr0.f37324c)) == null || ((Long) AbstractC7167xu.m25965K((ArrayList) c10189lr0.f37324c)) == null) ? ConfigValue.DOUBLE_DEFAULT_VALUE : 1000.0d / ((r3.longValue() - r2.longValue()) / (((ArrayList) c10189lr0.f37324c).size() - 1));
                int iM6094e = OZ1.m6094e(c4140gp);
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putDouble("averageFps", dLongValue);
                ER1.m2274e(c4140gp, new C4004ef(iM6094e, c4140gp.getId(), writableMapCreateMap, 0));
                break;
            default:
                ((C6161m) this.f5578b).m21874m();
                break;
        }
    }
}
