package p000;

import android.util.SparseArray;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;

/* loaded from: classes2.dex */
public final class GH0 {

    /* renamed from: a */
    public final SparseArray f3662a = new SparseArray();

    /* renamed from: b */
    public final SparseArray f3663b = new SparseArray();

    /* renamed from: c */
    public final SparseArray f3664c = new SparseArray();

    /* renamed from: b */
    public static int[] m3021b(ReadableMap readableMap, String str) {
        ReadableArray array = readableMap.getArray(str);
        O90.m5965c(array);
        int size = array.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = array.getInt(i);
        }
        return iArr;
    }

    /* renamed from: a */
    public final void m3022a(R00 r00, ReadableMap readableMap) {
        O90.m5968f(readableMap, "config");
        r00.f9893C = this;
        if (readableMap.hasKey("waitFor")) {
            this.f3662a.put(r00.f9903d, m3021b(readableMap, "waitFor"));
        }
        if (readableMap.hasKey("simultaneousHandlers")) {
            this.f3663b.put(r00.f9903d, m3021b(readableMap, "simultaneousHandlers"));
        }
        if (readableMap.hasKey("blocksHandlers")) {
            this.f3664c.put(r00.f9903d, m3021b(readableMap, "blocksHandlers"));
        }
    }
}
