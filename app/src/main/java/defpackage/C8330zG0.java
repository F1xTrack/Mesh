package defpackage;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: zG0 */
/* loaded from: classes.dex */
public final class C8330zG0 implements Closeable {
    public static final Logger g = Logger.getLogger(C8330zG0.class.getName());
    public final RandomAccessFile a;
    public int b;
    public int c;
    public C7950xG0 d;
    public C7950xG0 e;
    public final byte[] f;

    public C8330zG0(File file) throws IOException {
        byte[] bArr = new byte[16];
        this.f = bArr;
        if (!file.exists()) {
            File file2 = new File(file.getPath() + ".tmp");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rwd");
            try {
                randomAccessFile.setLength(4096L);
                randomAccessFile.seek(0L);
                byte[] bArr2 = new byte[16];
                int[] iArr = {4096, 0, 0, 0};
                int i = 0;
                for (int i2 = 0; i2 < 4; i2++) {
                    X(bArr2, i, iArr[i2]);
                    i += 4;
                }
                randomAccessFile.write(bArr2);
                randomAccessFile.close();
                if (!file2.renameTo(file)) {
                    throw new IOException("Rename failed!");
                }
            } catch (Throwable th) {
                randomAccessFile.close();
                throw th;
            }
        }
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rwd");
        this.a = randomAccessFile2;
        randomAccessFile2.seek(0L);
        randomAccessFile2.readFully(bArr);
        int iX = x(0, bArr);
        this.b = iX;
        if (iX > randomAccessFile2.length()) {
            throw new IOException("File is truncated. Expected length: " + this.b + ", Actual length: " + randomAccessFile2.length());
        }
        this.c = x(4, bArr);
        int iX2 = x(8, bArr);
        int iX3 = x(12, bArr);
        this.d = w(iX2);
        this.e = w(iX3);
    }

    public static void X(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 >> 24);
        bArr[i + 1] = (byte) (i2 >> 16);
        bArr[i + 2] = (byte) (i2 >> 8);
        bArr[i + 3] = (byte) i2;
    }

    public static int x(int i, byte[] bArr) {
        return ((bArr[i] & 255) << 24) + ((bArr[i + 1] & 255) << 16) + ((bArr[i + 2] & 255) << 8) + (bArr[i + 3] & 255);
    }

    public final synchronized void A() {
        try {
            if (p()) {
                throw new NoSuchElementException();
            }
            if (this.c == 1) {
                m();
            } else {
                C7950xG0 c7950xG0 = this.d;
                int iU = U(c7950xG0.b + 4 + c7950xG0.c);
                D(iU, this.f, 0, 4);
                int iX = x(0, this.f);
                W(this.b, this.c - 1, iU, this.e.b);
                this.c--;
                this.d = new C7950xG0(iU, iX, 0);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void D(int i, byte[] bArr, int i2, int i3) throws IOException {
        int iU = U(i);
        int i4 = iU + i3;
        int i5 = this.b;
        RandomAccessFile randomAccessFile = this.a;
        if (i4 <= i5) {
            randomAccessFile.seek(iU);
            randomAccessFile.readFully(bArr, i2, i3);
            return;
        }
        int i6 = i5 - iU;
        randomAccessFile.seek(iU);
        randomAccessFile.readFully(bArr, i2, i6);
        randomAccessFile.seek(16L);
        randomAccessFile.readFully(bArr, i2 + i6, i3 - i6);
    }

    public final void J(byte[] bArr, int i, int i2) throws IOException {
        int iU = U(i);
        int i3 = iU + i2;
        int i4 = this.b;
        RandomAccessFile randomAccessFile = this.a;
        if (i3 <= i4) {
            randomAccessFile.seek(iU);
            randomAccessFile.write(bArr, 0, i2);
            return;
        }
        int i5 = i4 - iU;
        randomAccessFile.seek(iU);
        randomAccessFile.write(bArr, 0, i5);
        randomAccessFile.seek(16L);
        randomAccessFile.write(bArr, i5, i2 - i5);
    }

    public final int S() {
        if (this.c == 0) {
            return 16;
        }
        C7950xG0 c7950xG0 = this.e;
        int i = c7950xG0.b;
        int i2 = this.d.b;
        return i >= i2 ? (i - i2) + 4 + c7950xG0.c + 16 : (((i + 4) + c7950xG0.c) + this.b) - i2;
    }

    public final int U(int i) {
        int i2 = this.b;
        return i < i2 ? i : (i + 16) - i2;
    }

    public final void W(int i, int i2, int i3, int i4) throws IOException {
        int[] iArr = {i, i2, i3, i4};
        byte[] bArr = this.f;
        int i5 = 0;
        for (int i6 = 0; i6 < 4; i6++) {
            X(bArr, i5, iArr[i6]);
            i5 += 4;
        }
        RandomAccessFile randomAccessFile = this.a;
        randomAccessFile.seek(0L);
        randomAccessFile.write(bArr);
    }

    public final void a(byte[] bArr) {
        int iU;
        int length = bArr.length;
        synchronized (this) {
            if (length >= 0) {
                if (length <= bArr.length) {
                    n(length);
                    boolean zP = p();
                    if (zP) {
                        iU = 16;
                    } else {
                        C7950xG0 c7950xG0 = this.e;
                        iU = U(c7950xG0.b + 4 + c7950xG0.c);
                    }
                    C7950xG0 c7950xG02 = new C7950xG0(iU, length, 0);
                    X(this.f, 0, length);
                    J(this.f, iU, 4);
                    J(bArr, iU + 4, length);
                    W(this.b, this.c + 1, zP ? iU : this.d.b, iU);
                    this.e = c7950xG02;
                    this.c++;
                    if (zP) {
                        this.d = c7950xG02;
                    }
                }
            }
            throw new IndexOutOfBoundsException();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.a.close();
    }

    public final synchronized void m() {
        W(4096, 0, 0, 0);
        this.c = 0;
        C7950xG0 c7950xG0 = C7950xG0.d;
        this.d = c7950xG0;
        this.e = c7950xG0;
        if (this.b > 4096) {
            RandomAccessFile randomAccessFile = this.a;
            randomAccessFile.setLength(4096);
            randomAccessFile.getChannel().force(true);
        }
        this.b = 4096;
    }

    public final void n(int i) throws IOException {
        int i2 = i + 4;
        int iS = this.b - S();
        if (iS >= i2) {
            return;
        }
        int i3 = this.b;
        do {
            iS += i3;
            i3 <<= 1;
        } while (iS < i2);
        RandomAccessFile randomAccessFile = this.a;
        randomAccessFile.setLength(i3);
        randomAccessFile.getChannel().force(true);
        C7950xG0 c7950xG0 = this.e;
        int iU = U(c7950xG0.b + 4 + c7950xG0.c);
        if (iU < this.d.b) {
            FileChannel channel = randomAccessFile.getChannel();
            channel.position(this.b);
            long j = iU - 4;
            if (channel.transferTo(16L, j, channel) != j) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        int i4 = this.e.b;
        int i5 = this.d.b;
        if (i4 < i5) {
            int i6 = (this.b + i4) - 16;
            W(i3, this.c, i5, i6);
            this.e = new C7950xG0(i6, this.e.c, 0);
        } else {
            W(i3, this.c, i5, i4);
        }
        this.b = i3;
    }

    public final synchronized void o(InterfaceC8140yG0 interfaceC8140yG0) {
        int iU = this.d.b;
        for (int i = 0; i < this.c; i++) {
            C7950xG0 c7950xG0W = w(iU);
            interfaceC8140yG0.d(new C4300iC0(this, c7950xG0W), c7950xG0W.c);
            iU = U(c7950xG0W.b + 4 + c7950xG0W.c);
        }
    }

    public final synchronized boolean p() {
        return this.c == 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C8330zG0.class.getSimpleName());
        sb.append("[fileLength=");
        sb.append(this.b);
        sb.append(", size=");
        sb.append(this.c);
        sb.append(", first=");
        sb.append(this.d);
        sb.append(", last=");
        sb.append(this.e);
        sb.append(", element lengths=[");
        try {
            o(new C1135Oi(sb));
        } catch (IOException e) {
            g.log(Level.WARNING, "read error", (Throwable) e);
        }
        sb.append("]]");
        return sb.toString();
    }

    public final C7950xG0 w(int i) throws IOException {
        if (i == 0) {
            return C7950xG0.d;
        }
        RandomAccessFile randomAccessFile = this.a;
        randomAccessFile.seek(i);
        return new C7950xG0(i, randomAccessFile.readInt(), 0);
    }
}
