package p000;

import io.invertase.firebase.messaging.ReactNativeFirebaseMessagingModule;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final /* synthetic */ class JL0 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ int f5489a;

    /* renamed from: b */
    public final /* synthetic */ Boolean f5490b;

    public /* synthetic */ JL0(int i, Boolean bool) {
        this.f5489a = i;
        this.f5490b = bool;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f5489a) {
            case 0:
                return ReactNativeFirebaseMessagingModule.lambda$setAutoInitEnabled$0(this.f5490b);
            case 1:
                return ReactNativeFirebaseMessagingModule.lambda$setDeliveryMetricsExportToBigQuery$12(this.f5490b);
            default:
                Boolean bool = this.f5490b;
                C6367lV c6367lVM22440a = C6367lV.m22440a();
                synchronized (c6367lVM22440a) {
                    try {
                        C0786MU.m5375d();
                        if (c6367lVM22440a.f37082b.m5145g().booleanValue()) {
                            C6989v4 c6989v4 = C6367lV.f37080d;
                            if (c6989v4.f44133b) {
                                c6989v4.f44132a.getClass();
                            }
                        } else {
                            C0751Lw c0751Lw = c6367lVM22440a.f37082b;
                            if (!c0751Lw.m5145g().booleanValue()) {
                                C1191Sw.m7468d().getClass();
                                if (bool != null) {
                                    c0751Lw.f6934c.m18424g("isEnabled", Boolean.TRUE.equals(bool));
                                } else {
                                    c0751Lw.f6934c.f27666a.edit().remove("isEnabled").apply();
                                }
                            }
                            if (bool != null) {
                                c6367lVM22440a.f37083c = bool;
                            } else {
                                c6367lVM22440a.f37083c = c6367lVM22440a.f37082b.m5146h();
                            }
                            if (Boolean.TRUE.equals(c6367lVM22440a.f37083c)) {
                                C6989v4 c6989v42 = C6367lV.f37080d;
                                if (c6989v42.f44133b) {
                                    c6989v42.f44132a.getClass();
                                }
                            } else if (Boolean.FALSE.equals(c6367lVM22440a.f37083c)) {
                                C6989v4 c6989v43 = C6367lV.f37080d;
                                if (c6989v43.f44133b) {
                                    c6989v43.f44132a.getClass();
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
