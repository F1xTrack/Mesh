package defpackage;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.yandex.varioqub.config.model.ConfigValue;
import io.sentry.transport.m;
import java.util.ArrayList;
import java.util.TimerTask;

/* loaded from: classes2.dex */
public final class JX extends TimerTask {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ JX(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                C5772lr0 c5772lr0 = (C5772lr0) this.b;
                C4034gp c4034gp = (C4034gp) c5772lr0.b;
                double dLongValue = (((Long) AbstractC8069xu.C((ArrayList) c5772lr0.c)) == null || ((Long) AbstractC8069xu.K((ArrayList) c5772lr0.c)) == null) ? ConfigValue.DOUBLE_DEFAULT_VALUE : 1000.0d / ((r3.longValue() - r2.longValue()) / (((ArrayList) c5772lr0.c).size() - 1));
                int iE = OZ1.e(c4034gp);
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putDouble("averageFps", dLongValue);
                ER1.e(c4034gp, new C3622ef(iE, c4034gp.getId(), writableMapCreateMap, 0));
                break;
            default:
                ((m) this.b).m();
                break;
        }
    }
}
