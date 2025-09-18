package p000;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import java.io.File;
import java.util.Collections;
import java.util.List;

/* renamed from: cP1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8977cP1 {
    /* renamed from: a */
    public static C7978Mu0 m10692a(ReactApplicationContext reactApplicationContext, ReadableMap readableMap) throws C6640po {
        File cacheDir;
        EnumC11454vj1 enumC11454vj1;
        EnumC8319Ti1 enumC8319Ti1;
        String str;
        O90.m5968f(readableMap, "map");
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
        if (readableMap.hasKey("fileType")) {
            C6914tt c6914tt = EnumC11454vj1.f44505b;
            String string2 = readableMap.getString("fileType");
            c6914tt.getClass();
            if (O90.m5963a(string2, "mov")) {
                enumC11454vj1 = EnumC11454vj1.f44506c;
            } else {
                if (!O90.m5963a(string2, "mp4")) {
                    if (string2 == null) {
                        string2 = "(null)";
                    }
                    throw new C6640po("fileType", string2);
                }
                enumC11454vj1 = EnumC11454vj1.f44507d;
            }
        } else {
            enumC11454vj1 = EnumC11454vj1.f44506c;
        }
        if (readableMap.hasKey("videoCodec")) {
            OL0 ol0 = EnumC8319Ti1.f11475b;
            String string3 = readableMap.getString("videoCodec");
            ol0.getClass();
            enumC8319Ti1 = (!O90.m5963a(string3, "h264") && O90.m5963a(string3, "h265")) ? EnumC8319Ti1.f11477d : EnumC8319Ti1.f11476c;
        } else {
            enumC8319Ti1 = EnumC8319Ti1.f11476c;
        }
        O90.m5965c(cacheDir);
        int iOrdinal = enumC11454vj1.ordinal();
        if (iOrdinal == 0) {
            str = ".mov";
        } else {
            if (iOrdinal != 1) {
                throw new C6838sg();
            }
            str = ".mp4";
        }
        return new C7978Mu0(new C9565gz0(reactApplicationContext, str, cacheDir), enumC8319Ti1);
    }

    /* renamed from: b */
    public static void m10693b(ReactApplicationContext reactApplicationContext, Intent intent) throws C11488w01 {
        List<ResolveInfo> listQueryBroadcastReceivers = reactApplicationContext.getPackageManager().queryBroadcastReceivers(intent, 0);
        if (listQueryBroadcastReceivers == null) {
            listQueryBroadcastReceivers = Collections.emptyList();
        }
        if (listQueryBroadcastReceivers.size() == 0) {
            throw new C11488w01("unable to resolve intent: " + intent.toString());
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
