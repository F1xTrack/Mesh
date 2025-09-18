package p000;

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
public final class C11903zG0 implements Closeable {

    /* renamed from: g */
    public static final Logger f46766g = Logger.getLogger(C11903zG0.class.getName());

    /* renamed from: a */
    public final RandomAccessFile f46767a;

    /* renamed from: b */
    public int f46768b;

    /* renamed from: c */
    public int f46769c;

    /* renamed from: d */
    public C11649xG0 f46770d;

    /* renamed from: e */
    public C11649xG0 f46771e;

    /* renamed from: f */
    public final byte[] f46772f;

    public C11903zG0(File file) throws IOException {
        byte[] bArr = new byte[16];
        this.f46772f = bArr;
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
                    m26354X(bArr2, i, iArr[i2]);
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
        this.f46767a = randomAccessFile2;
        randomAccessFile2.seek(0L);
        randomAccessFile2.readFully(bArr);
        int iM26355x = m26355x(0, bArr);
        this.f46768b = iM26355x;
        if (iM26355x > randomAccessFile2.length()) {
            throw new IOException("File is truncated. Expected length: " + this.f46768b + ", Actual length: " + randomAccessFile2.length());
        }
        this.f46769c = m26355x(4, bArr);
        int iM26355x2 = m26355x(8, bArr);
        int iM26355x3 = m26355x(12, bArr);
        this.f46770d = m26367w(iM26355x2);
        this.f46771e = m26367w(iM26355x3);
    }

    /* renamed from: X */
    public static void m26354X(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 >> 24);
        bArr[i + 1] = (byte) (i2 >> 16);
        bArr[i + 2] = (byte) (i2 >> 8);
        bArr[i + 3] = (byte) i2;
    }

    /* renamed from: x */
    public static int m26355x(int i, byte[] bArr) {
        return ((bArr[i] & 255) << 24) + ((bArr[i + 1] & 255) << 16) + ((bArr[i + 2] & 255) << 8) + (bArr[i + 3] & 255);
    }

    /* renamed from: A */
    public final synchronized void m26356A() {
        try {
            if (m26366p()) {
                throw new NoSuchElementException();
            }
            if (this.f46769c == 1) {
                m26363m();
            } else {
                C11649xG0 c11649xG0 = this.f46770d;
                int iM26360U = m26360U(c11649xG0.f45508b + 4 + c11649xG0.f45509c);
                m26357D(iM26360U, this.f46772f, 0, 4);
                int iM26355x = m26355x(0, this.f46772f);
                m26361W(this.f46768b, this.f46769c - 1, iM26360U, this.f46771e.f45508b);
                this.f46769c--;
                this.f46770d = new C11649xG0(iM26360U, iM26355x, 0);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: D */
    public final void m26357D(int i, byte[] bArr, int i2, int i3) throws IOException {
        int iM26360U = m26360U(i);
        int i4 = iM26360U + i3;
        int i5 = this.f46768b;
        RandomAccessFile randomAccessFile = this.f46767a;
        if (i4 <= i5) {
            randomAccessFile.seek(iM26360U);
            randomAccessFile.readFully(bArr, i2, i3);
            return;
        }
        int i6 = i5 - iM26360U;
        randomAccessFile.seek(iM26360U);
        randomAccessFile.readFully(bArr, i2, i6);
        randomAccessFile.seek(16L);
        randomAccessFile.readFully(bArr, i2 + i6, i3 - i6);
    }

    /* renamed from: J */
    public final void m26358J(byte[] bArr, int i, int i2) throws IOException {
        int iM26360U = m26360U(i);
        int i3 = iM26360U + i2;
        int i4 = this.f46768b;
        RandomAccessFile randomAccessFile = this.f46767a;
        if (i3 <= i4) {
            randomAccessFile.seek(iM26360U);
            randomAccessFile.write(bArr, 0, i2);
            return;
        }
        int i5 = i4 - iM26360U;
        randomAccessFile.seek(iM26360U);
        randomAccessFile.write(bArr, 0, i5);
        randomAccessFile.seek(16L);
        randomAccessFile.write(bArr, i5, i2 - i5);
    }

    /* renamed from: S */
    public final int m26359S() {
        if (this.f46769c == 0) {
            return 16;
        }
        C11649xG0 c11649xG0 = this.f46771e;
        int i = c11649xG0.f45508b;
        int i2 = this.f46770d.f45508b;
        return i >= i2 ? (i - i2) + 4 + c11649xG0.f45509c + 16 : (((i + 4) + c11649xG0.f45509c) + this.f46768b) - i2;
    }

    /* renamed from: U */
    public final int m26360U(int i) {
        int i2 = this.f46768b;
        return i < i2 ? i : (i + 16) - i2;
    }

    /* renamed from: W */
    public final void m26361W(int i, int i2, int i3, int i4) throws IOException {
        int[] iArr = {i, i2, i3, i4};
        byte[] bArr = this.f46772f;
        int i5 = 0;
        for (int i6 = 0; i6 < 4; i6++) {
            m26354X(bArr, i5, iArr[i6]);
            i5 += 4;
        }
        RandomAccessFile randomAccessFile = this.f46767a;
        randomAccessFile.seek(0L);
        randomAccessFile.write(bArr);
    }

    /* renamed from: a */
    public final void m26362a(byte[] bArr) {
        int iM26360U;
        int length = bArr.length;
        synchronized (this) {
            if (length >= 0) {
                if (length <= bArr.length) {
                    m26364n(length);
                    boolean zM26366p = m26366p();
                    if (zM26366p) {
                        iM26360U = 16;
                    } else {
                        C11649xG0 c11649xG0 = this.f46771e;
                        iM26360U = m26360U(c11649xG0.f45508b + 4 + c11649xG0.f45509c);
                    }
                    C11649xG0 c11649xG02 = new C11649xG0(iM26360U, length, 0);
                    m26354X(this.f46772f, 0, length);
                    m26358J(this.f46772f, iM26360U, 4);
                    m26358J(bArr, iM26360U + 4, length);
                    m26361W(this.f46768b, this.f46769c + 1, zM26366p ? iM26360U : this.f46770d.f45508b, iM26360U);
                    this.f46771e = c11649xG02;
                    this.f46769c++;
                    if (zM26366p) {
                        this.f46770d = c11649xG02;
                    }
                }
            }
            throw new IndexOutOfBoundsException();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f46767a.close();
    }

    /* renamed from: m */
    public final synchronized void m26363m() {
        m26361W(4096, 0, 0, 0);
        this.f46769c = 0;
        C11649xG0 c11649xG0 = C11649xG0.f45506d;
        this.f46770d = c11649xG0;
        this.f46771e = c11649xG0;
        if (this.f46768b > 4096) {
            RandomAccessFile randomAccessFile = this.f46767a;
            randomAccessFile.setLength(4096);
            randomAccessFile.getChannel().force(true);
        }
        this.f46768b = 4096;
    }

    /* renamed from: n */
    public final void m26364n(int i) throws IOException {
        int i2 = i + 4;
        int iM26359S = this.f46768b - m26359S();
        if (iM26359S >= i2) {
            return;
        }
        int i3 = this.f46768b;
        do {
            iM26359S += i3;
            i3 <<= 1;
        } while (iM26359S < i2);
        RandomAccessFile randomAccessFile = this.f46767a;
        randomAccessFile.setLength(i3);
        randomAccessFile.getChannel().force(true);
        C11649xG0 c11649xG0 = this.f46771e;
        int iM26360U = m26360U(c11649xG0.f45508b + 4 + c11649xG0.f45509c);
        if (iM26360U < this.f46770d.f45508b) {
            FileChannel channel = randomAccessFile.getChannel();
            channel.position(this.f46768b);
            long j = iM26360U - 4;
            if (channel.transferTo(16L, j, channel) != j) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        int i4 = this.f46771e.f45508b;
        int i5 = this.f46770d.f45508b;
        if (i4 < i5) {
            int i6 = (this.f46768b + i4) - 16;
            m26361W(i3, this.f46769c, i5, i6);
            this.f46771e = new C11649xG0(i6, this.f46771e.f45509c, 0);
        } else {
            m26361W(i3, this.f46769c, i5, i4);
        }
        this.f46768b = i3;
    }

    /* renamed from: o */
    public final synchronized void m26365o(InterfaceC11776yG0 interfaceC11776yG0) {
        int iM26360U = this.f46770d.f45508b;
        for (int i = 0; i < this.f46769c; i++) {
            C11649xG0 c11649xG0M26367w = m26367w(iM26360U);
            interfaceC11776yG0.mo2291d(new C9723iC0(this, c11649xG0M26367w), c11649xG0M26367w.f45509c);
            iM26360U = m26360U(c11649xG0M26367w.f45508b + 4 + c11649xG0M26367w.f45509c);
        }
    }

    /* renamed from: p */
    public final synchronized boolean m26366p() {
        return this.f46769c == 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C11903zG0.class.getSimpleName());
        sb.append("[fileLength=");
        sb.append(this.f46768b);
        sb.append(", size=");
        sb.append(this.f46769c);
        sb.append(", first=");
        sb.append(this.f46770d);
        sb.append(", last=");
        sb.append(this.f46771e);
        sb.append(", element lengths=[");
        try {
            m26365o(new C0926Oi(sb));
        } catch (IOException e) {
            f46766g.log(Level.WARNING, "read error", (Throwable) e);
        }
        sb.append("]]");
        return sb.toString();
    }

    /* renamed from: w */
    public final C11649xG0 m26367w(int i) throws IOException {
        if (i == 0) {
            return C11649xG0.f45506d;
        }
        RandomAccessFile randomAccessFile = this.f46767a;
        randomAccessFile.seek(i);
        return new C11649xG0(i, randomAccessFile.readInt(), 0);
    }
}
