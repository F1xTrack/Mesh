package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;

/* renamed from: p51 */
/* loaded from: classes.dex */
public final class C6393p51 extends ByteArrayOutputStream {
    public final /* synthetic */ C6584q51 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6393p51(C6584q51 c6584q51, int i) {
        super(i);
        this.a = c6584q51;
    }

    @Override // java.io.ByteArrayOutputStream
    public final String toString() {
        int i = ((ByteArrayOutputStream) this).count;
        if (i > 0 && ((ByteArrayOutputStream) this).buf[i - 1] == 13) {
            i--;
        }
        try {
            return new String(((ByteArrayOutputStream) this).buf, 0, i, this.a.b.name());
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }
}
