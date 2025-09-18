package defpackage;

import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;

/* renamed from: ky, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5601ky implements InterfaceC1490Sw0 {
    public final String a;

    public C5601ky(String str, int i) {
        switch (i) {
            case 1:
                str.getClass();
                this.a = str;
                break;
            default:
                this.a = str;
                break;
        }
    }

    public void a(StringBuilder sb, Iterator it) {
        try {
            if (it.hasNext()) {
                Object next = it.next();
                Objects.requireNonNull(next);
                sb.append(next instanceof CharSequence ? (CharSequence) next : next.toString());
                while (it.hasNext()) {
                    sb.append((CharSequence) this.a);
                    Object next2 = it.next();
                    Objects.requireNonNull(next2);
                    sb.append(next2 instanceof CharSequence ? (CharSequence) next2 : next2.toString());
                }
            }
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.InterfaceC1490Sw0
    public Object c() {
        throw new C6682qc0(this.a);
    }
}
