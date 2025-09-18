package defpackage;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;

/* loaded from: classes.dex */
public final class SA0 implements Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Promise b;
    public final /* synthetic */ String c;

    public /* synthetic */ SA0(int i, String str, Promise promise) {
        this.a = i;
        this.b = promise;
        this.c = str;
    }

    @Override // com.facebook.react.bridge.Callback
    public final void invoke(Object... objArr) {
        switch (this.a) {
            case 0:
                int[] iArr = (int[]) objArr[0];
                int length = iArr.length;
                Promise promise = this.b;
                if (length > 0 && iArr[0] == 0) {
                    promise.resolve("granted");
                    break;
                } else if (!((PA0) objArr[1]).shouldShowRequestPermissionRationale(this.c)) {
                    promise.resolve("never_ask_again");
                    break;
                } else {
                    promise.resolve("denied");
                    break;
                }
            default:
                int[] iArr2 = (int[]) objArr[0];
                int length2 = iArr2.length;
                Promise promise2 = this.b;
                if (length2 > 0 && iArr2[0] == 0) {
                    promise2.resolve("granted");
                    break;
                } else if (!((PA0) objArr[1]).shouldShowRequestPermissionRationale(this.c)) {
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
