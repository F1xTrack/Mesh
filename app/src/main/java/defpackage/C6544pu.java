package defpackage;

import java.io.IOException;

/* renamed from: pu, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6544pu extends IOException {
    public C6544pu(IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
    }
}
