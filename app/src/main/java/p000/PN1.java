package p000;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;

/* loaded from: classes.dex */
public abstract class PN1 {
    /* renamed from: a */
    public static WritableMap m6355a(R00 r00) {
        O90.m5968f(r00, "handler");
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("handlerTag", r00.f9903d);
        writableMapCreateMap.putInt("state", r00.f9905f);
        writableMapCreateMap.putInt("numberOfTouches", r00.f9914o);
        writableMapCreateMap.putInt("eventType", r00.f9913n);
        writableMapCreateMap.putInt("pointerType", r00.f9894D);
        WritableArray writableArray = r00.f9911l;
        r00.f9911l = null;
        if (writableArray != null) {
            writableMapCreateMap.putArray("changedTouches", writableArray);
        }
        WritableArray writableArray2 = r00.f9912m;
        r00.f9912m = null;
        if (writableArray2 != null) {
            writableMapCreateMap.putArray("allTouches", writableArray2);
        }
        if (r00.f9898H && r00.f9905f == 4) {
            writableMapCreateMap.putInt("state", 2);
        }
        return writableMapCreateMap;
    }

    /* renamed from: b */
    public static boolean m6356b(String str, String str2) {
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

    /* renamed from: c */
    public static String m6357c(String str) {
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

    /* renamed from: d */
    public static String m6358d(String str) {
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
