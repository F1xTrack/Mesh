package defpackage;

import android.os.Build;
import android.widget.EdgeEffect;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;

/* renamed from: r02, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6756r02 {
    public static String a(String str) {
        int i = 0;
        if (str.length() > 0) {
            while (str.charAt(i) == '/') {
                i++;
            }
        }
        return "/" + str.substring(i);
    }

    public static float b(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return VM.b(edgeEffect);
        }
        return 0.0f;
    }

    public static C5798m c(String str, String str2) {
        C5798m c5798m = C5798m.c;
        C5798m c5798m2 = C5798m.d;
        C5798m c5798m3 = C5798m.e;
        C5798m c5798m4 = C5798m.f;
        C5798m c5798m5 = C5798m.b;
        if (str == null) {
            if (str2 != null) {
                if (str2.contains("connect-drcn")) {
                    return c5798m;
                }
                if (str2.contains("connect-dre")) {
                    return c5798m2;
                }
                if (str2.contains("connect-drru")) {
                    return c5798m3;
                }
                if (str2.contains("connect-dra")) {
                    return c5798m4;
                }
            }
            return c5798m5;
        }
        switch (str) {
            case "CN":
                return c5798m;
            case "DE":
                return c5798m2;
            case "RU":
                return c5798m3;
            case "SG":
                return c5798m4;
            default:
                return c5798m5;
        }
    }

    public static float d(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 31) {
            return VM.c(edgeEffect, f, f2);
        }
        UM.a(edgeEffect, f, f2);
        return f;
    }

    public static String e(InputStream inputStream) throws IOException {
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
