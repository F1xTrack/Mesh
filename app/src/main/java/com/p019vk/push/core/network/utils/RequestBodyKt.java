package com.p019vk.push.core.network.utils;

import java.util.regex.Pattern;
import kotlin.Metadata;
import p000.AbstractC11161tR0;
import p000.AbstractC11511wA1;
import p000.C10689pl0;
import p000.C8540Xp0;
import p000.O90;

@Metadata(m22266d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m22267d2 = {"", "LtR0;", "toJsonRequestBody", "(Ljava/lang/String;)LtR0;", "core-network_release"}, m22268k = 2, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class RequestBodyKt {
    public static final AbstractC11161tR0 toJsonRequestBody(String str) {
        O90.m5968f(str, "<this>");
        Pattern pattern = C8540Xp0.f13986d;
        return C10689pl0.m23864i(str, AbstractC11511wA1.m25569b("application/json; charset=utf-8"));
    }
}
