package defpackage;

import android.webkit.ValueCallback;
import com.facebook.react.bridge.Promise;

/* renamed from: jz, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5413jz implements ValueCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Promise b;

    public /* synthetic */ C5413jz(int i, Promise promise) {
        this.a = i;
        this.b = promise;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        switch (this.a) {
            case 0:
                this.b.resolve((Boolean) obj);
                break;
            case 1:
                this.b.resolve((Boolean) obj);
                break;
            default:
                this.b.resolve((Boolean) obj);
                break;
        }
    }
}
