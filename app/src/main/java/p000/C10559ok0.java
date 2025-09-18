package p000;

import java.io.IOException;

/* renamed from: ok0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10559ok0 extends IOException {
    public C10559ok0(Throwable th) {
        String str;
        StringBuilder sb = new StringBuilder("Unexpected ");
        sb.append(th.getClass().getSimpleName());
        if (th.getMessage() != null) {
            str = ": " + th.getMessage();
        } else {
            str = "";
        }
        sb.append(str);
        super(sb.toString(), th);
    }
}
