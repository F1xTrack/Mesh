package expo.modules.kotlin.exception;

import kotlin.Metadata;
import p000.O90;

@Metadata(m22266d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m22267d2 = {"Lexpo/modules/kotlin/exception/UnexpectedException;", "Lexpo/modules/kotlin/exception/CodedException;", "expo-modules-core_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class UnexpectedException extends CodedException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnexpectedException(String str) {
        super(str, null);
        O90.m5968f(str, "message");
    }
}
