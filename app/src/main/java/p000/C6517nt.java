package p000;

import java.io.IOException;

/* renamed from: nt */
/* loaded from: classes.dex */
public final class C6517nt extends IOException {
    public C6517nt(int i) {
        super("Illegal clipping: ".concat(i != 0 ? i != 1 ? i != 2 ? "unknown" : "start exceeds end" : "not seekable to start" : "invalid period count"));
    }
}
