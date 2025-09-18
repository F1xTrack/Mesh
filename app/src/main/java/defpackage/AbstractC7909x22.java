package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.StrictMode;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/* renamed from: x22, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7909x22 {
    public static final void a(WritableArray writableArray, Object obj) {
        if (obj == null ? true : obj instanceof C1518Tf1) {
            writableArray.pushNull();
            return;
        }
        if (obj instanceof ReadableArray) {
            writableArray.pushArray((ReadableArray) obj);
            return;
        }
        if (obj instanceof ReadableMap) {
            writableArray.pushMap((ReadableMap) obj);
            return;
        }
        if (obj instanceof String) {
            writableArray.pushString((String) obj);
            return;
        }
        if (obj instanceof Integer) {
            writableArray.pushInt(((Number) obj).intValue());
            return;
        }
        if (obj instanceof Number) {
            writableArray.pushDouble(((Number) obj).doubleValue());
            return;
        }
        if (obj instanceof Boolean) {
            writableArray.pushBoolean(((Boolean) obj).booleanValue());
            return;
        }
        throw new IllegalArgumentException("Could not put '" + obj.getClass() + "' to WritableArray");
    }

    public static final void b(WritableMap writableMap, String str, Object obj) {
        O90.f(str, "key");
        if (obj == null ? true : obj instanceof C1518Tf1) {
            writableMap.putNull(str);
            return;
        }
        if (obj instanceof ReadableArray) {
            writableMap.putArray(str, (ReadableArray) obj);
            return;
        }
        if (obj instanceof ReadableMap) {
            writableMap.putMap(str, (ReadableMap) obj);
            return;
        }
        if (obj instanceof String) {
            writableMap.putString(str, (String) obj);
            return;
        }
        if (obj instanceof Integer) {
            writableMap.putInt(str, ((Number) obj).intValue());
            return;
        }
        if (obj instanceof Number) {
            writableMap.putDouble(str, ((Number) obj).doubleValue());
            return;
        }
        if (obj instanceof Boolean) {
            writableMap.putBoolean(str, ((Boolean) obj).booleanValue());
            return;
        }
        throw new IllegalArgumentException("Could not put '" + obj.getClass() + "' to WritableMap");
    }

    public static final WritableMap c(Bundle bundle, C3759fN c3759fN) {
        O90.f(bundle, "<this>");
        O90.f(c3759fN, "containerProvider");
        WritableMap writableMapCreateMap = Arguments.createMap();
        O90.e(writableMapCreateMap, "createMap(...)");
        for (String str : bundle.keySet()) {
            Object objL = S20.l(bundle.get(str), c3759fN);
            O90.c(str);
            b(writableMapCreateMap, str, objL);
        }
        return writableMapCreateMap;
    }

    public static AbstractC0093Ay0 d(Context context) {
        File file;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            StrictMode.allowThreadDiskWrites();
            AbstractC0093Ay0 c2092aD0 = C7707w.a;
            try {
                file = new File(context.getDir("phenotype_hermetic", 0), "overrides.txt");
            } catch (RuntimeException unused) {
            }
            AbstractC0093Ay0 c2092aD02 = file.exists() ? new C2092aD0(file) : c2092aD0;
            if (c2092aD02.b()) {
                c2092aD0 = new C2092aD0(e(context, (File) c2092aD02.a()));
            }
            return c2092aD0;
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    public static ON1 e(Context context, File file) throws IOException {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            try {
                L01 l01 = new L01();
                HashMap map = new HashMap();
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        String.valueOf(file);
                        context.getPackageName();
                        ON1 on1 = new ON1(l01);
                        bufferedReader.close();
                        return on1;
                    }
                    String[] strArrSplit = line.split(" ", 3);
                    if (strArrSplit.length == 3) {
                        String str = new String(strArrSplit[0]);
                        String strDecode = Uri.decode(new String(strArrSplit[1]));
                        String strDecode2 = (String) map.get(strArrSplit[2]);
                        if (strDecode2 == null) {
                            String str2 = new String(strArrSplit[2]);
                            strDecode2 = Uri.decode(str2);
                            if (strDecode2.length() < 1024 || strDecode2 == str2) {
                                map.put(str2, strDecode2);
                            }
                        }
                        L01 l012 = (L01) l01.getOrDefault(str, null);
                        if (l012 == null) {
                            l012 = new L01();
                            l01.put(str, l012);
                        }
                        l012.put(strDecode, strDecode2);
                    }
                }
            } finally {
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
