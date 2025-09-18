package com.vk.push.core.utils;

import defpackage.C2512cQ0;
import defpackage.O90;
import defpackage.XS0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u0011\u0010\u0001\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0011\u0010\u0003\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0002¨\u0006\u0004"}, d2 = {"", "hideSensitive", "(Ljava/lang/String;)Ljava/lang/String;", "camelToSnakeCase", "core_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class StringExtensionsKt {
    public static final C2512cQ0 a = new C2512cQ0("(?<=[a-zA-Z])[A-Z]");

    public static final String camelToSnakeCase(String str) {
        O90.f(str, "<this>");
        return a.c(str, XS0.y);
    }

    public static final String hideSensitive(String str) {
        O90.f(str, "<this>");
        if (str.length() <= 8) {
            return "****";
        }
        int length = str.length();
        String strSubstring = str.substring(length - (4 > length ? length : 4));
        O90.e(strSubstring, "substring(...)");
        return "****".concat(strSubstring);
    }
}
