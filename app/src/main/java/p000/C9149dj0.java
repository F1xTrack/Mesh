package p000;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: dj0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9149dj0 implements Iterator, InterfaceC11315ue0 {

    /* renamed from: a */
    public String f26225a;

    /* renamed from: b */
    public boolean f26226b;

    /* renamed from: c */
    public final /* synthetic */ C0764M8 f26227c;

    public C9149dj0(C0764M8 c0764m8) {
        this.f26227c = c0764m8;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() throws IOException {
        if (this.f26225a == null && !this.f26226b) {
            String line = ((BufferedReader) this.f26227c.f6999b).readLine();
            this.f26225a = line;
            if (line == null) {
                this.f26226b = true;
            }
        }
        return this.f26225a != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        String str = this.f26225a;
        this.f26225a = null;
        O90.m5965c(str);
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
