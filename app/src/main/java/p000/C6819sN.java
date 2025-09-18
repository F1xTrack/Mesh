package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: sN */
/* loaded from: classes.dex */
public final class C6819sN implements InterfaceC6676qN {

    /* renamed from: a */
    public InputStream f42379a;

    /* renamed from: b */
    public final ZipEntry f42380b;

    /* renamed from: c */
    public final ZipFile f42381c;

    /* renamed from: d */
    public final long f42382d;

    /* renamed from: e */
    public boolean f42383e = true;

    /* renamed from: f */
    public long f42384f = 0;

    public C6819sN(ZipFile zipFile, ZipEntry zipEntry) throws IOException {
        this.f42381c = zipFile;
        this.f42380b = zipEntry;
        this.f42382d = zipEntry.getSize();
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        this.f42379a = inputStream;
        if (inputStream != null) {
            return;
        }
        throw new IOException(zipEntry.getName() + "'s InputStream is null");
    }

    @Override // p000.InterfaceC6676qN
    /* renamed from: F */
    public final int mo23993F(ByteBuffer byteBuffer, long j) throws IOException {
        if (this.f42379a == null) {
            throw new IOException("InputStream is null");
        }
        int iRemaining = byteBuffer.remaining();
        long j2 = this.f42382d;
        long j3 = j2 - j;
        if (j3 <= 0) {
            return -1;
        }
        int i = (int) j3;
        if (iRemaining > i) {
            iRemaining = i;
        }
        InputStream inputStream = this.f42379a;
        ZipEntry zipEntry = this.f42380b;
        if (inputStream == null) {
            throw new IOException(zipEntry.getName() + "'s InputStream is null");
        }
        long j4 = this.f42384f;
        if (j != j4) {
            if (j > j2) {
                j = j2;
            }
            if (j >= j4) {
                inputStream.skip(j - j4);
            } else {
                inputStream.close();
                InputStream inputStream2 = this.f42381c.getInputStream(zipEntry);
                this.f42379a = inputStream2;
                if (inputStream2 == null) {
                    throw new IOException(zipEntry.getName() + "'s InputStream is null");
                }
                inputStream2.skip(j);
            }
            this.f42384f = j;
        }
        if (byteBuffer.hasArray()) {
            this.f42379a.read(byteBuffer.array(), 0, iRemaining);
            byteBuffer.position(byteBuffer.position() + iRemaining);
        } else {
            byte[] bArr = new byte[iRemaining];
            this.f42379a.read(bArr, 0, iRemaining);
            byteBuffer.put(bArr, 0, iRemaining);
        }
        this.f42384f += iRemaining;
        return iRemaining;
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        InputStream inputStream = this.f42379a;
        if (inputStream != null) {
            inputStream.close();
            this.f42383e = false;
        }
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return this.f42383e;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        return mo23993F(byteBuffer, this.f42384f);
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException("ElfZipFileChannel doesn't support write");
    }
}
