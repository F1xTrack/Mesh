package defpackage;

import io.invertase.firebase.messaging.ReactNativeFirebaseMessagingModule;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final /* synthetic */ class JL0 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Boolean b;

    public /* synthetic */ JL0(int i, Boolean bool) {
        this.a = i;
        this.b = bool;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
            case 0:
                return ReactNativeFirebaseMessagingModule.lambda$setAutoInitEnabled$0(this.b);
            case 1:
                return ReactNativeFirebaseMessagingModule.lambda$setDeliveryMetricsExportToBigQuery$12(this.b);
            default:
                Boolean bool = this.b;
                C5705lV c5705lVA = C5705lV.a();
                synchronized (c5705lVA) {
                    try {
                        MU.d();
                        if (c5705lVA.b.g().booleanValue()) {
                            C7533v4 c7533v4 = C5705lV.d;
                            if (c7533v4.b) {
                                c7533v4.a.getClass();
                            }
                        } else {
                            C0943Lw c0943Lw = c5705lVA.b;
                            if (!c0943Lw.g().booleanValue()) {
                                C1489Sw.d().getClass();
                                if (bool != null) {
                                    c0943Lw.c.g("isEnabled", Boolean.TRUE.equals(bool));
                                } else {
                                    c0943Lw.c.a.edit().remove("isEnabled").apply();
                                }
                            }
                            if (bool != null) {
                                c5705lVA.c = bool;
                            } else {
                                c5705lVA.c = c5705lVA.b.h();
                            }
                            if (Boolean.TRUE.equals(c5705lVA.c)) {
                                C7533v4 c7533v42 = C5705lV.d;
                                if (c7533v42.b) {
                                    c7533v42.a.getClass();
                                }
                            } else if (Boolean.FALSE.equals(c5705lVA.c)) {
                                C7533v4 c7533v43 = C5705lV.d;
                                if (c7533v43.b) {
                                    c7533v43.a.getClass();
                                }
                            }
                        }
                    } catch (IllegalStateException unused) {
                    }
                }
                return bool;
        }
    }
}
