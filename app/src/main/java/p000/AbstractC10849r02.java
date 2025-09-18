package p000;

import android.os.Build;
import android.widget.EdgeEffect;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;

/* renamed from: r02, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10849r02 {
    /* renamed from: a */
    public static String m24143a(String str) {
        int i = 0;
        if (str.length() > 0) {
            while (str.charAt(i) == '/') {
                i++;
            }
        }
        return "/" + str.substring(i);
    }

    /* renamed from: b */
    public static float m24144b(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return AbstractC1344VM.m8423b(edgeEffect);
        }
        return 0.0f;
    }

    /* renamed from: c */
    public static C6398m m24145c(String str, String str2) {
        C6398m c6398m = C6398m.f37372c;
        C6398m c6398m2 = C6398m.f37373d;
        C6398m c6398m3 = C6398m.f37374e;
        C6398m c6398m4 = C6398m.f37375f;
        C6398m c6398m5 = C6398m.f37371b;
        if (str == null) {
            if (str2 != null) {
                if (str2.contains("connect-drcn")) {
                    return c6398m;
                }
                if (str2.contains("connect-dre")) {
                    return c6398m2;
                }
                if (str2.contains("connect-drru")) {
                    return c6398m3;
                }
                if (str2.contains("connect-dra")) {
                    return c6398m4;
                }
            }
            return c6398m5;
        }
        switch (str) {
            case "CN":
                return c6398m;
            case "DE":
                return c6398m2;
            case "RU":
                return c6398m3;
            case "SG":
                return c6398m4;
            default:
                return c6398m5;
        }
    }

    /* renamed from: d */
    public static float m24146d(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 31) {
            return AbstractC1344VM.m8424c(edgeEffect, f, f2);
        }
        AbstractC1281UM.m7990a(edgeEffect, f, f2);
        return f;
    }

    /* renamed from: e */
    public static String m24147e(InputStream inputStream) throws IOException {
        StringWriter stringWriter = new StringWriter();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "UTF-8");
        char[] cArr = new char[4096];
        while (true) {
            int i = inputStreamReader.read(cArr);
            if (-1 == i) {
                return stringWriter.toString();
            }
            stringWriter.write(cArr, 0, i);
        }
    }
}
