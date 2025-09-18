package defpackage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class HD0 {
    public static final HashMap e = new HashMap();
    public final boolean a;
    public final File b;
    public final Lock c;
    public FileChannel d;

    public HD0(String str, File file, boolean z) {
        Lock lock;
        this.a = z;
        File file2 = new File(file, str.concat(".lck"));
        this.b = file2;
        String absolutePath = file2.getAbsolutePath();
        O90.e(absolutePath, "lockFile.absolutePath");
        HashMap map = e;
        synchronized (map) {
            try {
                Object reentrantLock = map.get(absolutePath);
                if (reentrantLock == null) {
                    reentrantLock = new ReentrantLock();
                    map.put(absolutePath, reentrantLock);
                }
                lock = (Lock) reentrantLock;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.c = lock;
    }

    public final void a(boolean z) throws IOException {
        this.c.lock();
        if (z) {
            File file = this.b;
            try {
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = new FileOutputStream(file).getChannel();
                channel.lock();
                this.d = channel;
            } catch (IOException unused) {
                this.d = null;
            }
        }
    }

    public final void b() throws IOException {
        try {
            FileChannel fileChannel = this.d;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.c.unlock();
    }
}
