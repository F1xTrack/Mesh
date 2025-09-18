package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: sN, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7017sN implements InterfaceC6636qN {
    public InputStream a;
    public final ZipEntry b;
    public final ZipFile c;
    public final long d;
    public boolean e = true;
    public long f = 0;

    public C7017sN(ZipFile zipFile, ZipEntry zipEntry) throws IOException {
        this.c = zipFile;
        this.b = zipEntry;
        this.d = zipEntry.getSize();
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        this.a = inputStream;
        if (inputStream != null) {
            return;
        }
        throw new IOException(zipEntry.getName() + "'s InputStream is null");
    }

    @Override // defpackage.InterfaceC6636qN
    public final int F(ByteBuffer byteBuffer, long j) throws IOException {
        if (this.a == null) {
            throw new IOException("InputStream is null");
        }
        int iRemaining = byteBuffer.remaining();
        long j2 = this.d;
        long j3 = j2 - j;
        if (j3 <= 0) {
            return -1;
        }
        int i = (int) j3;
        if (iRemaining > i) {
            iRemaining = i;
        }
        InputStream inputStream = this.a;
        ZipEntry zipEntry = this.b;
        if (inputStream == null) {
            throw new IOException(zipEntry.getName() + "'s InputStream is null");
        }
        long j4 = this.f;
        if (j != j4) {
            if (j > j2) {
                j = j2;
            }
            if (j >= j4) {
                inputStream.skip(j - j4);
            } else {
                inputStream.close();
                InputStream inputStream2 = this.c.getInputStream(zipEntry);
                this.a = inputStream2;
                if (inputStream2 == null) {
                    throw new IOException(zipEntry.getName() + "'s InputStream is null");
                }
                inputStream2.skip(j);
            }
            this.f = j;
        }
        if (byteBuffer.hasArray()) {
            this.a.read(byteBuffer.array(), 0, iRemaining);
            byteBuffer.position(byteBuffer.position() + iRemaining);
        } else {
            byte[] bArr = new byte[iRemaining];
            this.a.read(bArr, 0, iRemaining);
            byteBuffer.put(bArr, 0, iRemaining);
        }
        this.f += iRemaining;
        return iRemaining;
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        InputStream inputStream = this.a;
        if (inputStream != null) {
            inputStream.close();
            this.e = false;
        }
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return this.e;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        return F(byteBuffer, this.f);
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException("ElfZipFileChannel doesn't support write");
    }
}
