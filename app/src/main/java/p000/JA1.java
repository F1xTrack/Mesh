package p000;

import com.google.android.gms.common.internal.GmsLogger;
import com.google.mlkit.vision.common.internal.MobileVisionBase;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final /* synthetic */ class JA1 implements Callable {

    /* renamed from: b */
    public static final /* synthetic */ JA1 f5371b = new JA1(0);

    /* renamed from: a */
    public final /* synthetic */ int f5372a;

    public /* synthetic */ JA1(int i) {
        this.f5372a = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f5372a) {
            case 0:
                GmsLogger gmsLogger = MobileVisionBase.f18532e;
                return null;
            default:
                C8791ay1 c8791ay1 = new C8791ay1("internal.platform", 4);
                c8791ay1.f28711b.put("getVersion", new C8791ay1("getVersion", 0));
                return c8791ay1;
        }
    }
}
