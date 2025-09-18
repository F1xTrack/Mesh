package defpackage;

import com.google.android.gms.common.internal.GmsLogger;
import com.google.mlkit.vision.common.internal.MobileVisionBase;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final /* synthetic */ class JA1 implements Callable {
    public static final /* synthetic */ JA1 b = new JA1(0);
    public final /* synthetic */ int a;

    public /* synthetic */ JA1(int i) {
        this.a = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
            case 0:
                GmsLogger gmsLogger = MobileVisionBase.e;
                return null;
            default:
                C2234ay1 c2234ay1 = new C2234ay1("internal.platform", 4);
                c2234ay1.b.put("getVersion", new C2234ay1("getVersion", 0));
                return c2234ay1;
        }
    }
}
