package com.vk.push.core.network.utils;

import defpackage.AbstractC7221tR0;
import defpackage.AbstractC7743wA1;
import defpackage.C1859Xp0;
import defpackage.C6518pl0;
import defpackage.O90;
import java.util.regex.Pattern;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"", "LtR0;", "toJsonRequestBody", "(Ljava/lang/String;)LtR0;", "core-network_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class RequestBodyKt {
    public static final AbstractC7221tR0 toJsonRequestBody(String str) {
        O90.f(str, "<this>");
        Pattern pattern = C1859Xp0.d;
        return C6518pl0.i(str, AbstractC7743wA1.b("application/json; charset=utf-8"));
    }
}
