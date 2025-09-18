package p000;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import java.io.File;

/* loaded from: classes.dex */
public abstract class TT1 {

    /* renamed from: a */
    public static float f11392a = 10.0f;

    /* renamed from: b */
    public static float f11393b = 1.0f;

    /* renamed from: a */
    public static C11761y81 m7695a(ReactApplicationContext reactApplicationContext, ReadableMap readableMap) throws C6640po {
        File cacheDir;
        O90.m5968f(readableMap, "map");
        int i = readableMap.hasKey("quality") ? readableMap.getInt("quality") : 100;
        if (readableMap.hasKey("path")) {
            String string = readableMap.getString("path");
            if (string == null) {
                throw new C6640po("null");
            }
            cacheDir = new File(string);
            if (!cacheDir.isDirectory()) {
                throw new C6640po(string);
            }
        } else {
            cacheDir = reactApplicationContext.getCacheDir();
        }
        O90.m5965c(cacheDir);
        return new C11761y81(new C9565gz0(reactApplicationContext, ".jpg", cacheDir), i);
    }
}
