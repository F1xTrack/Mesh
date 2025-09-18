package p000;

import android.webkit.ValueCallback;
import com.facebook.react.bridge.Promise;

/* renamed from: jz */
/* loaded from: classes2.dex */
public final class C6271jz implements ValueCallback {

    /* renamed from: a */
    public final /* synthetic */ int f35468a;

    /* renamed from: b */
    public final /* synthetic */ Promise f35469b;

    public /* synthetic */ C6271jz(int i, Promise promise) {
        this.f35468a = i;
        this.f35469b = promise;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        switch (this.f35468a) {
            case 0:
                this.f35469b.resolve((Boolean) obj);
                break;
            case 1:
                this.f35469b.resolve((Boolean) obj);
                break;
            default:
                this.f35469b.resolve((Boolean) obj);
                break;
        }
    }
}
