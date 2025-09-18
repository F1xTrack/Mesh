package defpackage;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.WritableNativeMap;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class TA0 implements Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ WritableNativeMap c;
    public final /* synthetic */ Promise d;

    public /* synthetic */ TA0(ArrayList arrayList, WritableNativeMap writableNativeMap, Promise promise, int i) {
        this.a = i;
        this.b = arrayList;
        this.c = writableNativeMap;
        this.d = promise;
    }

    @Override // com.facebook.react.bridge.Callback
    public final void invoke(Object... objArr) {
        switch (this.a) {
            case 0:
                int i = 0;
                int[] iArr = (int[]) objArr[0];
                PA0 pa0 = (PA0) objArr[1];
                while (true) {
                    ArrayList arrayList = this.b;
                    int size = arrayList.size();
                    WritableNativeMap writableNativeMap = this.c;
                    if (i >= size) {
                        this.d.resolve(writableNativeMap);
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
                    ArrayList arrayList2 = this.b;
                    int size2 = arrayList2.size();
                    WritableNativeMap writableNativeMap2 = this.c;
                    if (i2 >= size2) {
                        this.d.resolve(writableNativeMap2);
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
