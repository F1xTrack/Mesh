package p000;

import java.io.IOException;

/* renamed from: gK0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9483gK0 extends C3979eG {

    /* renamed from: c */
    public final int f27677c;

    public C9483gK0(int i) {
        super(i, 0);
        this.f27677c = i;
    }

    @Override // p000.C3979eG
    /* renamed from: d */
    public final int mo17891d(int i) {
        return Integer.MAX_VALUE;
    }

    @Override // p000.C3979eG
    /* renamed from: e */
    public final long mo17892e(C0986Pf c0986Pf) {
        IOException iOException = (IOException) c0986Pf.f9217c;
        String message = iOException.getMessage();
        if ((iOException instanceof C10987s40) && message != null && (message.equals("Unable to connect") || message.equals("Software caused connection abort"))) {
            return 1000L;
        }
        int i = this.f27677c;
        if (c0986Pf.f9216b < i) {
            return Math.min((r5 - 1) * 1000, 5000L);
        }
        return -9223372036854775807L;
    }
}
