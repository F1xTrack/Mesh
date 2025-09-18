package p000;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* renamed from: bE0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8826bE0 {

    /* renamed from: a */
    public final int f16874a;

    /* renamed from: b */
    public final int f16875b;

    /* renamed from: c */
    public final long f16876c;

    /* renamed from: d */
    public final long f16877d;

    public C8826bE0(int i, int i2, long j, long j2) {
        this.f16874a = i;
        this.f16875b = i2;
        this.f16876c = j;
        this.f16877d = j2;
    }

    /* renamed from: a */
    public static C8826bE0 m10435a(File file) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            C8826bE0 c8826bE0 = new C8826bE0(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return c8826bE0;
        } catch (Throwable th) {
            try {
                dataInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: b */
    public final void m10436b(File file) throws IOException {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f16874a);
            dataOutputStream.writeInt(this.f16875b);
            dataOutputStream.writeLong(this.f16876c);
            dataOutputStream.writeLong(this.f16877d);
            dataOutputStream.close();
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C8826bE0)) {
            return false;
        }
        C8826bE0 c8826bE0 = (C8826bE0) obj;
        return this.f16875b == c8826bE0.f16875b && this.f16876c == c8826bE0.f16876c && this.f16874a == c8826bE0.f16874a && this.f16877d == c8826bE0.f16877d;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f16875b), Long.valueOf(this.f16876c), Integer.valueOf(this.f16874a), Long.valueOf(this.f16877d));
    }
}
