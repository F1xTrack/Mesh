package defpackage;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class PT0 extends RuntimeException {
    public final IOException a;
    public IOException b;

    public PT0(IOException iOException) {
        super(iOException);
        this.a = iOException;
        this.b = iOException;
    }
}
