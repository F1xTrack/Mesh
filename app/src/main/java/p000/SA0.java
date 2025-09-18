package p000;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;

/* loaded from: classes.dex */
public final class SA0 implements Callback {

    /* renamed from: a */
    public final /* synthetic */ int f10604a;

    /* renamed from: b */
    public final /* synthetic */ Promise f10605b;

    /* renamed from: c */
    public final /* synthetic */ String f10606c;

    public /* synthetic */ SA0(int i, String str, Promise promise) {
        this.f10604a = i;
        this.f10605b = promise;
        this.f10606c = str;
    }

    @Override // com.facebook.react.bridge.Callback
    public final void invoke(Object... objArr) {
        switch (this.f10604a) {
            case 0:
                int[] iArr = (int[]) objArr[0];
                int length = iArr.length;
                Promise promise = this.f10605b;
                if (length > 0 && iArr[0] == 0) {
                    promise.resolve("granted");
                    break;
                } else if (!((PA0) objArr[1]).shouldShowRequestPermissionRationale(this.f10606c)) {
                    promise.resolve("never_ask_again");
                    break;
                } else {
                    promise.resolve("denied");
                    break;
                }
            default:
                int[] iArr2 = (int[]) objArr[0];
                int length2 = iArr2.length;
                Promise promise2 = this.f10605b;
                if (length2 > 0 && iArr2[0] == 0) {
                    promise2.resolve("granted");
                    break;
                } else if (!((PA0) objArr[1]).shouldShowRequestPermissionRationale(this.f10606c)) {
                    promise2.resolve("blocked");
                    break;
                } else {
                    promise2.resolve("denied");
                    break;
                }
                break;
        }
    }
}
