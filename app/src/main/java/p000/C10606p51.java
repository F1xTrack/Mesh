package p000;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;

/* renamed from: p51 */
/* loaded from: classes.dex */
public final class C10606p51 extends ByteArrayOutputStream {

    /* renamed from: a */
    public final /* synthetic */ C10734q51 f39831a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10606p51(C10734q51 c10734q51, int i) {
        super(i);
        this.f39831a = c10734q51;
    }

    @Override // java.io.ByteArrayOutputStream
    public final String toString() {
        int i = ((ByteArrayOutputStream) this).count;
        if (i > 0 && ((ByteArrayOutputStream) this).buf[i - 1] == 13) {
            i--;
        }
        try {
            return new String(((ByteArrayOutputStream) this).buf, 0, i, this.f39831a.f40597b.name());
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }
}
