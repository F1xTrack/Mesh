package com.p019vk.push.core.utils;

import kotlin.Metadata;
import p000.C8978cQ0;
import p000.O90;
import p000.XS0;

@Metadata(m22266d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u0011\u0010\u0001\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0011\u0010\u0003\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0002¨\u0006\u0004"}, m22267d2 = {"", "hideSensitive", "(Ljava/lang/String;)Ljava/lang/String;", "camelToSnakeCase", "core_release"}, m22268k = 2, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class StringExtensionsKt {

    /* renamed from: a */
    public static final C8978cQ0 f20602a = new C8978cQ0("(?<=[a-zA-Z])[A-Z]");

    public static final String camelToSnakeCase(String str) {
        O90.m5968f(str, "<this>");
        return f20602a.m10698c(str, XS0.f13789y);
    }

    public static final String hideSensitive(String str) {
        O90.m5968f(str, "<this>");
        if (str.length() <= 8) {
            return "****";
        }
        int length = str.length();
        String strSubstring = str.substring(length - (4 > length ? length : 4));
        O90.m5967e(strSubstring, "substring(...)");
        return "****".concat(strSubstring);
    }
}
