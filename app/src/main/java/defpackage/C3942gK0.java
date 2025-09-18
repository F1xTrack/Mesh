package defpackage;

import java.io.IOException;

/* renamed from: gK0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3942gK0 extends C3547eG {
    public final int c;

    public C3942gK0(int i) {
        super(i, 0);
        this.c = i;
    }

    @Override // defpackage.C3547eG
    public final int d(int i) {
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.C3547eG
    public final long e(C1204Pf c1204Pf) {
        IOException iOException = (IOException) c1204Pf.c;
        String message = iOException.getMessage();
        if ((iOException instanceof C6961s40) && message != null && (message.equals("Unable to connect") || message.equals("Software caused connection abort"))) {
            return 1000L;
        }
        int i = this.c;
        if (c1204Pf.b < i) {
            return Math.min((r5 - 1) * 1000, 5000L);
        }
        return -9223372036854775807L;
    }
}
