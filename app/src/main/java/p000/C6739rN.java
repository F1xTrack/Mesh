package p000;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* renamed from: rN */
/* loaded from: classes.dex */
public final class C6739rN implements InterfaceC6676qN {

    /* renamed from: a */
    public File f41620a;

    /* renamed from: b */
    public FileInputStream f41621b;

    /* renamed from: c */
    public FileChannel f41622c;

    @Override // p000.InterfaceC6676qN
    /* renamed from: F */
    public final int mo23993F(ByteBuffer byteBuffer, long j) {
        return this.f41622c.read(byteBuffer, j);
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f41621b.close();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return this.f41622c.isOpen();
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        return this.f41622c.read(byteBuffer);
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        return this.f41622c.write(byteBuffer);
    }
}
