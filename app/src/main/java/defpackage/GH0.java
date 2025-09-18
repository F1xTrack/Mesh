package defpackage;

import android.util.SparseArray;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;

/* loaded from: classes2.dex */
public final class GH0 {
    public final SparseArray a = new SparseArray();
    public final SparseArray b = new SparseArray();
    public final SparseArray c = new SparseArray();

    public static int[] b(ReadableMap readableMap, String str) {
        ReadableArray array = readableMap.getArray(str);
        O90.c(array);
        int size = array.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = array.getInt(i);
        }
        return iArr;
    }

    public final void a(R00 r00, ReadableMap readableMap) {
        O90.f(readableMap, "config");
        r00.C = this;
        if (readableMap.hasKey("waitFor")) {
            this.a.put(r00.d, b(readableMap, "waitFor"));
        }
        if (readableMap.hasKey("simultaneousHandlers")) {
            this.b.put(r00.d, b(readableMap, "simultaneousHandlers"));
        }
        if (readableMap.hasKey("blocksHandlers")) {
            this.c.put(r00.d, b(readableMap, "blocksHandlers"));
        }
    }
}
