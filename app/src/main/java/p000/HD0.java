package p000;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class HD0 {

    /* renamed from: e */
    public static final HashMap f4173e = new HashMap();

    /* renamed from: a */
    public final boolean f4174a;

    /* renamed from: b */
    public final File f4175b;

    /* renamed from: c */
    public final Lock f4176c;

    /* renamed from: d */
    public FileChannel f4177d;

    public HD0(String str, File file, boolean z) {
        Lock lock;
        this.f4174a = z;
        File file2 = new File(file, str.concat(".lck"));
        this.f4175b = file2;
        String absolutePath = file2.getAbsolutePath();
        O90.m5967e(absolutePath, "lockFile.absolutePath");
        HashMap map = f4173e;
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
        this.f4176c = lock;
    }

    /* renamed from: a */
    public final void m3330a(boolean z) throws IOException {
        this.f4176c.lock();
        if (z) {
            File file = this.f4175b;
            try {
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = new FileOutputStream(file).getChannel();
                channel.lock();
                this.f4177d = channel;
            } catch (IOException unused) {
                this.f4177d = null;
            }
        }
    }

    /* renamed from: b */
    public final void m3331b() throws IOException {
        try {
            FileChannel fileChannel = this.f4177d;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.f4176c.unlock();
    }
}
