package com.dylanvann.fastimage;

import java.net.MalformedURLException;
import java.net.URL;

/* loaded from: classes.dex */
public class FastImageUrlUtils {
    private static final String TAG = "FastImageUrlUtils";

    public static String getFileExtensionFromUrl(String str) {
        try {
            String path = new URL(str).getPath();
            int iLastIndexOf = path.lastIndexOf(46);
            if (iLastIndexOf != -1 && iLastIndexOf != path.length() - 1) {
                return path.substring(iLastIndexOf + 1).toLowerCase();
            }
        } catch (MalformedURLException unused) {
        }
        return null;
    }
}
