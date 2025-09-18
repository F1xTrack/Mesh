package defpackage;

import com.facebook.react.bridge.Callback;
import ru.vvdev.yamap.RNYamapModule;

/* loaded from: classes2.dex */
public final /* synthetic */ class VI0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Callback b;

    public /* synthetic */ VI0(int i, Callback callback) {
        this.a = i;
        this.b = callback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                RNYamapModule.resetLocale$lambda$3(this.b);
                break;
            default:
                RNYamapModule.getLocale$lambda$2(this.b);
                break;
        }
    }
}
