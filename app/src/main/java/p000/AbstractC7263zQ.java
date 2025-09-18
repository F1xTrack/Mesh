package p000;

import android.system.ErrnoException;
import android.system.Os;
import java.io.FileDescriptor;

/* renamed from: zQ */
/* loaded from: classes.dex */
public abstract class AbstractC7263zQ {
    /* renamed from: a */
    public static void m26433a(FileDescriptor fileDescriptor) throws ErrnoException {
        Os.close(fileDescriptor);
    }

    /* renamed from: b */
    public static FileDescriptor m26434b(FileDescriptor fileDescriptor) throws ErrnoException {
        return Os.dup(fileDescriptor);
    }

    /* renamed from: c */
    public static long m26435c(FileDescriptor fileDescriptor, long j, int i) throws ErrnoException {
        return Os.lseek(fileDescriptor, j, i);
    }
}
