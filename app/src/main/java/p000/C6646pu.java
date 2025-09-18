package p000;

import java.io.IOException;

/* renamed from: pu */
/* loaded from: classes.dex */
public final class C6646pu extends IOException {
    public C6646pu(IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
    }
}
