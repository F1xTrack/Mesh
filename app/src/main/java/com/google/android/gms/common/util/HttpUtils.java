package com.google.android.gms.common.util;

import com.google.android.gms.common.annotation.KeepForSdk;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import p000.C0926Oi;
import p000.C10525oT0;
import p000.C8805b32;
import p000.C9126dX1;

@KeepForSdk
/* loaded from: classes.dex */
public class HttpUtils {
    private static final Pattern zza = Pattern.compile("^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$");
    private static final Pattern zzb = Pattern.compile("^(?:[0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}$");
    private static final Pattern zzc = Pattern.compile("^((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)::((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)$");

    private HttpUtils() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.HashMap] */
    @KeepForSdk
    public static Map<String, String> parse(URI uri, String str) {
        ?? EmptyMap = Collections.emptyMap();
        String rawQuery = uri.getRawQuery();
        if (rawQuery != null && rawQuery.length() > 0) {
            EmptyMap = new HashMap();
            C0926Oi c0926Oi = new C0926Oi(new C10525oT0(new C9126dX1('=')), false, 14);
            C0926Oi c0926Oi2 = new C0926Oi(new C10525oT0(new C9126dX1('&')), true, 14);
            C8805b32 c8805b32 = new C8805b32(c0926Oi2, rawQuery, (C9126dX1) ((C10525oT0) c0926Oi2.f8576c).f39025a);
            while (c8805b32.hasNext()) {
                String str2 = (String) c8805b32.next();
                str2.getClass();
                C8805b32 c8805b322 = new C8805b32(c0926Oi, str2, (C9126dX1) ((C10525oT0) c0926Oi.f8576c).f39025a);
                ArrayList arrayList = new ArrayList();
                while (c8805b322.hasNext()) {
                    arrayList.add((String) c8805b322.next());
                }
                List listUnmodifiableList = Collections.unmodifiableList(arrayList);
                if (listUnmodifiableList.isEmpty() || listUnmodifiableList.size() > 2) {
                    throw new IllegalArgumentException("bad parameter");
                }
                EmptyMap.put(zza((String) listUnmodifiableList.get(0), str), listUnmodifiableList.size() == 2 ? zza((String) listUnmodifiableList.get(1), str) : null);
            }
        }
        return EmptyMap;
    }

    private static String zza(String str, String str2) {
        if (str2 == null) {
            str2 = "ISO-8859-1";
        }
        try {
            return URLDecoder.decode(str, str2);
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
