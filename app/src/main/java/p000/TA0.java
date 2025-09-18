package p000;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.WritableNativeMap;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class TA0 implements Callback {

    /* renamed from: a */
    public final /* synthetic */ int f11186a;

    /* renamed from: b */
    public final /* synthetic */ ArrayList f11187b;

    /* renamed from: c */
    public final /* synthetic */ WritableNativeMap f11188c;

    /* renamed from: d */
    public final /* synthetic */ Promise f11189d;

    public /* synthetic */ TA0(ArrayList arrayList, WritableNativeMap writableNativeMap, Promise promise, int i) {
        this.f11186a = i;
        this.f11187b = arrayList;
        this.f11188c = writableNativeMap;
        this.f11189d = promise;
    }

    @Override // com.facebook.react.bridge.Callback
    public final void invoke(Object... objArr) {
        switch (this.f11186a) {
            case 0:
                int i = 0;
                int[] iArr = (int[]) objArr[0];
                PA0 pa0 = (PA0) objArr[1];
                while (true) {
                    ArrayList arrayList = this.f11187b;
                    int size = arrayList.size();
                    WritableNativeMap writableNativeMap = this.f11188c;
                    if (i >= size) {
                        this.f11189d.resolve(writableNativeMap);
                        break;
                    } else {
                        String str = (String) arrayList.get(i);
                        if (iArr.length > 0 && iArr[i] == 0) {
                            writableNativeMap.putString(str, "granted");
                        } else if (pa0.shouldShowRequestPermissionRationale(str)) {
                            writableNativeMap.putString(str, "denied");
                        } else {
                            writableNativeMap.putString(str, "never_ask_again");
                        }
                        i++;
                    }
                }
                break;
            default:
                int i2 = 0;
                int[] iArr2 = (int[]) objArr[0];
                PA0 pa02 = (PA0) objArr[1];
                while (true) {
                    ArrayList arrayList2 = this.f11187b;
                    int size2 = arrayList2.size();
                    WritableNativeMap writableNativeMap2 = this.f11188c;
                    if (i2 >= size2) {
                        this.f11189d.resolve(writableNativeMap2);
                        break;
                    } else {
                        String str2 = (String) arrayList2.get(i2);
                        if (iArr2.length > 0 && iArr2[i2] == 0) {
                            writableNativeMap2.putString(str2, "granted");
                        } else if (pa02.shouldShowRequestPermissionRationale(str2)) {
                            writableNativeMap2.putString(str2, "denied");
                        } else {
                            writableNativeMap2.putString(str2, "blocked");
                        }
                        i2++;
                    }
                }
                break;
        }
    }
}
