package expo.modules.kotlin.exception;

import kotlin.Metadata;
import p000.AbstractC1374Vq;
import p000.AbstractC7222ym;

@Metadata(m22266d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m22267d2 = {"Lexpo/modules/kotlin/exception/InvalidArgsNumberException;", "Lexpo/modules/kotlin/exception/CodedException;", "expo-modules-core_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class InvalidArgsNumberException extends CodedException {
    public InvalidArgsNumberException(int i, int i2, int i3) {
        super(i3 < i2 ? AbstractC1374Vq.m8591j(AbstractC1374Vq.m8594m("Received ", " arguments, but ", i, i2, " was expected and at least "), i3, " is required") : AbstractC7222ym.m26233j("Received ", " arguments, but ", i, i2, " was expected"), null);
    }
}
