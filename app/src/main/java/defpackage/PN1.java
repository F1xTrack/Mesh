package defpackage;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;

/* loaded from: classes.dex */
public abstract class PN1 {
    public static WritableMap a(R00 r00) {
        O90.f(r00, "handler");
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("handlerTag", r00.d);
        writableMapCreateMap.putInt("state", r00.f);
        writableMapCreateMap.putInt("numberOfTouches", r00.o);
        writableMapCreateMap.putInt("eventType", r00.n);
        writableMapCreateMap.putInt("pointerType", r00.D);
        WritableArray writableArray = r00.l;
        r00.l = null;
        if (writableArray != null) {
            writableMapCreateMap.putArray("changedTouches", writableArray);
        }
        WritableArray writableArray2 = r00.m;
        r00.m = null;
        if (writableArray2 != null) {
            writableMapCreateMap.putArray("allTouches", writableArray2);
        }
        if (r00.H && r00.f == 4) {
            writableMapCreateMap.putInt("state", 2);
        }
        return writableMapCreateMap;
    }

    public static boolean b(String str, String str2) {
        char c;
        int length = str.length();
        if (str == str2) {
            return true;
        }
        if (length != str2.length()) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) != str2.charAt(i) && ((c = (char) ((r4 | ' ') - 97)) >= 26 || c != ((char) ((r5 | ' ') - 97)))) {
                return false;
            }
        }
        return true;
    }

    public static String c(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt >= 'A' && cCharAt <= 'Z') {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (c >= 'A' && c <= 'Z') {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    public static String d(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt >= 'a' && cCharAt <= 'z') {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (c >= 'a' && c <= 'z') {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }
}
