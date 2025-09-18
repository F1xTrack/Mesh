package defpackage;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import java.io.File;
import java.util.Collections;
import java.util.List;

/* renamed from: cP1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2510cP1 {
    public static C1016Mu0 a(ReactApplicationContext reactApplicationContext, ReadableMap readableMap) throws C6526po {
        File cacheDir;
        EnumC7658vj1 enumC7658vj1;
        EnumC1527Ti1 enumC1527Ti1;
        String str;
        O90.f(readableMap, "map");
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
        if (readableMap.hasKey("fileType")) {
            C7304tt c7304tt = EnumC7658vj1.b;
            String string2 = readableMap.getString("fileType");
            c7304tt.getClass();
            if (O90.a(string2, "mov")) {
                enumC7658vj1 = EnumC7658vj1.c;
            } else {
                if (!O90.a(string2, "mp4")) {
                    if (string2 == null) {
                        string2 = "(null)";
                    }
                    throw new C6526po("fileType", string2);
                }
                enumC7658vj1 = EnumC7658vj1.d;
            }
        } else {
            enumC7658vj1 = EnumC7658vj1.c;
        }
        if (readableMap.hasKey("videoCodec")) {
            OL0 ol0 = EnumC1527Ti1.b;
            String string3 = readableMap.getString("videoCodec");
            ol0.getClass();
            enumC1527Ti1 = (!O90.a(string3, "h264") && O90.a(string3, "h265")) ? EnumC1527Ti1.d : EnumC1527Ti1.c;
        } else {
            enumC1527Ti1 = EnumC1527Ti1.c;
        }
        O90.c(cacheDir);
        int iOrdinal = enumC7658vj1.ordinal();
        if (iOrdinal == 0) {
            str = ".mov";
        } else {
            if (iOrdinal != 1) {
                throw new C7074sg();
            }
            str = ".mp4";
        }
        return new C1016Mu0(new C4065gz0(reactApplicationContext, str, cacheDir), enumC1527Ti1);
    }

    public static void b(ReactApplicationContext reactApplicationContext, Intent intent) throws C7710w01 {
        List<ResolveInfo> listQueryBroadcastReceivers = reactApplicationContext.getPackageManager().queryBroadcastReceivers(intent, 0);
        if (listQueryBroadcastReceivers == null) {
            listQueryBroadcastReceivers = Collections.emptyList();
        }
        if (listQueryBroadcastReceivers.size() == 0) {
            throw new C7710w01("unable to resolve intent: " + intent.toString());
        }
        for (ResolveInfo resolveInfo : listQueryBroadcastReceivers) {
            Intent intent2 = new Intent(intent);
            if (resolveInfo != null) {
                intent2.setPackage(resolveInfo.resolvePackageName);
                reactApplicationContext.sendBroadcast(intent2);
            }
        }
    }
}
