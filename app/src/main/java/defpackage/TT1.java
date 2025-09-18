package defpackage;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import java.io.File;

/* loaded from: classes.dex */
public abstract class TT1 {
    public static float a = 10.0f;
    public static float b = 1.0f;

    public static C8117y81 a(ReactApplicationContext reactApplicationContext, ReadableMap readableMap) throws C6526po {
        File cacheDir;
        O90.f(readableMap, "map");
        int i = readableMap.hasKey("quality") ? readableMap.getInt("quality") : 100;
        if (readableMap.hasKey("path")) {
            String string = readableMap.getString("path");
            if (string == null) {
                throw new C6526po("null");
            }
            cacheDir = new File(string);
            if (!cacheDir.isDirectory()) {
                throw new C6526po(string);
            }
        } else {
            cacheDir = reactApplicationContext.getCacheDir();
        }
        O90.c(cacheDir);
        return new C8117y81(new C4065gz0(reactApplicationContext, ".jpg", cacheDir), i);
    }
}
