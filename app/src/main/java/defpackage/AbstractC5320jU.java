package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.util.ArrayList;

/* renamed from: jU, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5320jU {
    static {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(1024L);
        bigIntegerValueOf.multiply(bigIntegerValueOf.multiply(bigIntegerValueOf.multiply(bigIntegerValueOf.multiply(bigIntegerValueOf.multiply(bigIntegerValueOf)))));
        bigIntegerValueOf.multiply(BigInteger.valueOf(1024L).multiply(BigInteger.valueOf(1152921504606846976L)));
    }

    public static void a(File file, File file2) throws FileNotFoundException {
        if (file.exists()) {
            return;
        }
        throw new FileNotFoundException("Source '" + file + "' does not exist");
    }

    public static void b(File file, File file2) throws IOException {
        ArrayList arrayList;
        File[] fileArrListFiles;
        a(file, file2);
        if (!file.isDirectory()) {
            throw new IOException("Source '" + file + "' exists but is not a directory");
        }
        if (file.getCanonicalPath().equals(file2.getCanonicalPath())) {
            throw new IOException("Source '" + file + "' and destination '" + file2 + "' are the same");
        }
        if (!file2.getCanonicalPath().startsWith(file.getCanonicalPath()) || (fileArrListFiles = file.listFiles()) == null || fileArrListFiles.length <= 0) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(fileArrListFiles.length);
            for (File file3 : fileArrListFiles) {
                arrayList.add(new File(file2, file3.getName()).getCanonicalPath());
            }
        }
        d(file, file2, arrayList);
    }

    public static void c(File file, File file2) throws IOException {
        a(file, file2);
        if (file.isDirectory()) {
            throw new IOException("Source '" + file + "' exists but is a directory");
        }
        if (file.getCanonicalPath().equals(file2.getCanonicalPath())) {
            throw new IOException("Source '" + file + "' and destination '" + file2 + "' are the same");
        }
        File parentFile = file2.getParentFile();
        if (parentFile != null && !parentFile.mkdirs() && !parentFile.isDirectory()) {
            throw new IOException("Destination '" + parentFile + "' directory cannot be created");
        }
        if (!file2.exists() || file2.canWrite()) {
            e(file, file2);
            return;
        }
        throw new IOException("Destination '" + file2 + "' exists but is read-only");
    }

    public static void d(File file, File file2, ArrayList arrayList) throws IOException {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            throw new IOException(AbstractC1705Vq.g(file, "Failed to list contents of "));
        }
        if (file2.exists()) {
            if (!file2.isDirectory()) {
                throw new IOException("Destination '" + file2 + "' exists but is not a directory");
            }
        } else if (!file2.mkdirs() && !file2.isDirectory()) {
            throw new IOException("Destination '" + file2 + "' directory cannot be created");
        }
        if (!file2.canWrite()) {
            throw new IOException("Destination '" + file2 + "' cannot be written to");
        }
        for (File file3 : fileArrListFiles) {
            File file4 = new File(file2, file3.getName());
            if (arrayList == null || !arrayList.contains(file3.getCanonicalPath())) {
                if (file3.isDirectory()) {
                    d(file3, file4, arrayList);
                } else {
                    e(file3, file4);
                }
            }
        }
        file2.setLastModified(file.lastModified());
    }

    public static void e(File file, File file2) throws IOException {
        if (file2.exists() && file2.isDirectory()) {
            throw new IOException("Destination '" + file2 + "' exists but is a directory");
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            FileChannel channel = fileInputStream.getChannel();
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                try {
                    FileChannel channel2 = fileOutputStream.getChannel();
                    try {
                        long size = channel.size();
                        long j = 0;
                        while (j < size) {
                            long j2 = size - j;
                            long jTransferFrom = channel2.transferFrom(channel, j, j2 > 31457280 ? 31457280L : j2);
                            if (jTransferFrom == 0) {
                                break;
                            } else {
                                j += jTransferFrom;
                            }
                        }
                        if (channel2 != null) {
                            channel2.close();
                        }
                        fileOutputStream.close();
                        channel.close();
                        fileInputStream.close();
                        long length = file.length();
                        long length2 = file2.length();
                        if (length == length2) {
                            file2.setLastModified(file.lastModified());
                            return;
                        }
                        throw new IOException("Failed to copy full contents from '" + file + "' to '" + file2 + "' Expected length: " + length + " Actual: " + length2);
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    public static void f(File file) throws IOException {
        if (!file.isDirectory()) {
            boolean zExists = file.exists();
            if (file.delete()) {
                return;
            }
            if (!zExists) {
                throw new FileNotFoundException(AbstractC1705Vq.g(file, "File does not exist: "));
            }
            throw new IOException(AbstractC1705Vq.g(file, "Unable to delete file: "));
        }
        if (file.exists()) {
            if (!Files.isSymbolicLink(file.toPath())) {
                if (!file.exists()) {
                    throw new IllegalArgumentException(file + " does not exist");
                }
                if (!file.isDirectory()) {
                    throw new IllegalArgumentException(file + " is not a directory");
                }
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles == null) {
                    throw new IOException(AbstractC1705Vq.g(file, "Failed to list contents of "));
                }
                IOException e = null;
                for (File file2 : fileArrListFiles) {
                    try {
                        f(file2);
                    } catch (IOException e2) {
                        e = e2;
                    }
                }
                if (e != null) {
                    throw e;
                }
            }
            if (file.delete()) {
                return;
            }
            throw new IOException("Unable to delete directory " + file + ".");
        }
    }
}
