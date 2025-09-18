package p000;

import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;

/* renamed from: ky */
/* loaded from: classes2.dex */
public final class C6333ky implements InterfaceC8294Sw0 {

    /* renamed from: a */
    public final String f36789a;

    public C6333ky(String str, int i) {
        switch (i) {
            case 1:
                str.getClass();
                this.f36789a = str;
                break;
            default:
                this.f36789a = str;
                break;
        }
    }

    /* renamed from: a */
    public void m22321a(StringBuilder sb, Iterator it) {
        try {
            if (it.hasNext()) {
                Object next = it.next();
                Objects.requireNonNull(next);
                sb.append(next instanceof CharSequence ? (CharSequence) next : next.toString());
                while (it.hasNext()) {
                    sb.append((CharSequence) this.f36789a);
                    Object next2 = it.next();
                    Objects.requireNonNull(next2);
                    sb.append(next2 instanceof CharSequence ? (CharSequence) next2 : next2.toString());
                }
            }
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    @Override // p000.InterfaceC8294Sw0
    /* renamed from: c */
    public Object mo386c() {
        throw new C10799qc0(this.f36789a);
    }
}
