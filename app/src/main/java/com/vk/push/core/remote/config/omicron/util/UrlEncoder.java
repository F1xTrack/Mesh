package com.vk.push.core.remote.config.omicron.util;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/* loaded from: classes2.dex */
public class UrlEncoder {
    public static String encodeUtf8(Object obj) {
        try {
            return URLEncoder.encode(obj.toString(), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
}
