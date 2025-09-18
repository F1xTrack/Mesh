package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* renamed from: rN, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6826rN implements InterfaceC6636qN {
    public File a;
    public FileInputStream b;
    public FileChannel c;

    @Override // defpackage.InterfaceC6636qN
    public final int F(ByteBuffer byteBuffer, long j) {
        return this.c.read(byteBuffer, j);
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.b.close();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return this.c.isOpen();
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        return this.c.read(byteBuffer);
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        return this.c.write(byteBuffer);
    }
}
