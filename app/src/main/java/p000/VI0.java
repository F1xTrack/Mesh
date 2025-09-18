package p000;

import com.facebook.react.bridge.Callback;
import ru.vvdev.yamap.RNYamapModule;

/* loaded from: classes2.dex */
public final /* synthetic */ class VI0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f12507a;

    /* renamed from: b */
    public final /* synthetic */ Callback f12508b;

    public /* synthetic */ VI0(int i, Callback callback) {
        this.f12507a = i;
        this.f12508b = callback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12507a) {
            case 0:
                RNYamapModule.resetLocale$lambda$3(this.f12508b);
                break;
            default:
                RNYamapModule.getLocale$lambda$2(this.f12508b);
                break;
        }
    }
}
