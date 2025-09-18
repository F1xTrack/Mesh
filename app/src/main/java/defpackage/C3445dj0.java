package defpackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: dj0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3445dj0 implements Iterator, InterfaceC7451ue0 {
    public String a;
    public boolean b;
    public final /* synthetic */ M8 c;

    public C3445dj0(M8 m8) {
        this.c = m8;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() throws IOException {
        if (this.a == null && !this.b) {
            String line = ((BufferedReader) this.c.b).readLine();
            this.a = line;
            if (line == null) {
                this.b = true;
            }
        }
        return this.a != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        String str = this.a;
        this.a = null;
        O90.c(str);
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
