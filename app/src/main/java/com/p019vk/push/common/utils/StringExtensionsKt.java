package com.p019vk.push.common.utils;

import kotlin.Metadata;
import p000.AbstractC11374v51;
import p000.O90;

@Metadata(m22266d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0001\u001a\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004\u001a.\u0010\u0005\u001a\u0002H\u0006\"\u0010\b\u0000\u0010\u0006\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00060\u0007*\u0004\u0018\u00010\u00012\u0006\u0010\b\u001a\u0002H\u0006H\u0086\b¢\u0006\u0002\u0010\t¨\u0006\n"}, m22267d2 = {"nullIfBlank", "", "takeSafe", "n", "", "toEnum", "T", "", "defaultEnum", "(Ljava/lang/String;Ljava/lang/Enum;)Ljava/lang/Enum;", "common_release"}, m22268k = 2, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class StringExtensionsKt {
    public static final String nullIfBlank(String str) {
        O90.m5968f(str, "<this>");
        if (AbstractC11374v51.m25328C(str)) {
            return null;
        }
        return str;
    }

    public static final String takeSafe(String str, int i) {
        O90.m5968f(str, "<this>");
        if (str.length() < i) {
            return null;
        }
        return AbstractC11374v51.m25349X(i, str);
    }

    public static final /* synthetic */ <T extends Enum<T>> T toEnum(String str, T t) {
        O90.m5968f(t, "defaultEnum");
        if (str != null) {
            try {
                O90.m5974l();
                throw null;
            } catch (IllegalArgumentException unused) {
            }
        }
        return t;
    }
}
