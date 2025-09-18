package defpackage;

import java.io.IOException;

/* renamed from: nt, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6159nt extends IOException {
    public C6159nt(int i) {
        super("Illegal clipping: ".concat(i != 0 ? i != 1 ? i != 2 ? "unknown" : "start exceeds end" : "not seekable to start" : "invalid period count"));
    }
}
