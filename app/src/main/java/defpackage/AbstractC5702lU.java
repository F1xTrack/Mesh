package defpackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: lU */
/* loaded from: classes2.dex */
public abstract class AbstractC5702lU extends AbstractC2246b12 {
    public static void b(File file, File file2, boolean z, int i) throws C6353ou {
        if ((i & 2) != 0) {
            z = false;
        }
        O90.f(file, "<this>");
        O90.f(file2, "target");
        if (!file.exists()) {
            throw new C5508kT("The source file doesn't exist.", file, null);
        }
        if (file2.exists()) {
            if (!z) {
                throw new C5508kT("The destination file already exists.", file, file2);
            }
            if (!file2.delete()) {
                throw new C5508kT("Tried to overwrite the destination, but failed to delete it.", file, file2);
            }
        }
        if (file.isDirectory()) {
            if (!file2.mkdirs()) {
                throw new C6353ou("Failed to create target directory.", file, file2);
            }
            return;
        }
        File parentFile = file2.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            try {
                NP1.a(fileInputStream, fileOutputStream, 8192);
                AbstractC2141aT1.a(fileOutputStream, null);
                AbstractC2141aT1.a(fileInputStream, null);
            } finally {
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC2141aT1.a(fileInputStream, th);
                throw th2;
            }
        }
    }

    public static boolean c(File file) {
        O90.f(file, "<this>");
        EnumC5511kU enumC5511kU = EnumC5511kU.a;
        C3399dU c3399dU = new C3399dU(new C3780fU(file));
        while (true) {
            boolean z = true;
            while (c3399dU.hasNext()) {
                File file2 = (File) c3399dU.next();
                if (!file2.delete() && file2.exists()) {
                    z = false;
                } else {
                    if (z) {
                        break;
                    }
                    z = false;
                }
            }
            return z;
        }
    }

    public static byte[] d(File file) {
        O90.f(file, "<this>");
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new OutOfMemoryError("File " + file + " is too big (" + length + " bytes) to fit in memory.");
            }
            int i = (int) length;
            byte[] bArrCopyOf = new byte[i];
            int i2 = i;
            int i3 = 0;
            while (i2 > 0) {
                int i4 = fileInputStream.read(bArrCopyOf, i3, i2);
                if (i4 < 0) {
                    break;
                }
                i2 -= i4;
                i3 += i4;
            }
            if (i2 > 0) {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i3);
                O90.e(bArrCopyOf, "copyOf(...)");
            } else {
                int i5 = fileInputStream.read();
                if (i5 != -1) {
                    C7029sR c7029sR = new C7029sR(8193);
                    c7029sR.write(i5);
                    NP1.a(fileInputStream, c7029sR, 8192);
                    int size = c7029sR.size() + i;
                    if (size < 0) {
                        throw new OutOfMemoryError("File " + file + " is too big to fit in memory.");
                    }
                    byte[] bArrM = c7029sR.m();
                    bArrCopyOf = Arrays.copyOf(bArrCopyOf, size);
                    O90.e(bArrCopyOf, "copyOf(...)");
                    J8.h(bArrM, i, 0, bArrCopyOf, c7029sR.size());
                }
            }
            AbstractC2141aT1.a(fileInputStream, null);
            return bArrCopyOf;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC2141aT1.a(fileInputStream, th);
                throw th2;
            }
        }
    }

    public static ArrayList e(File file) {
        Charset charset = AbstractC7680vr.a;
        O90.f(file, "<this>");
        O90.f(charset, "charset");
        ArrayList arrayList = new ArrayList();
        C5893mU c5893mU = new C5893mU(arrayList, 0);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), charset));
        try {
            Iterator it = ((C0713Ix) AbstractC4175hY0.e(new M8(2, bufferedReader))).iterator();
            while (it.hasNext()) {
                c5893mU.invoke(it.next());
            }
            AbstractC2141aT1.a(bufferedReader, null);
            return arrayList;
        } finally {
        }
    }

    public static String f(File file) {
        Charset charset = AbstractC7680vr.a;
        O90.f(file, "<this>");
        O90.f(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            String strD = AbstractC7803wU1.d(inputStreamReader);
            AbstractC2141aT1.a(inputStreamReader, null);
            return strD;
        } finally {
        }
    }

    public static File g(File file, String str) {
        int length;
        File file2;
        int iZ;
        O90.f(file, "<this>");
        O90.f(str, "relative");
        File file3 = new File(str);
        String path = file3.getPath();
        O90.e(path, "getPath(...)");
        char c = File.separatorChar;
        int iZ2 = AbstractC7538v51.z(path, c, 0, false, 4);
        if (iZ2 != 0) {
            length = (iZ2 <= 0 || path.charAt(iZ2 + (-1)) != ':') ? (iZ2 == -1 && AbstractC7538v51.v(path, ':')) ? path.length() : 0 : iZ2 + 1;
        } else if (path.length() <= 1 || path.charAt(1) != c || (iZ = AbstractC7538v51.z(path, c, 2, false, 4)) < 0) {
            length = 1;
        } else {
            int iZ3 = AbstractC7538v51.z(path, c, iZ + 1, false, 4);
            length = iZ3 >= 0 ? iZ3 + 1 : path.length();
        }
        if (length > 0) {
            return file3;
        }
        String string = file.toString();
        O90.e(string, "toString(...)");
        if ((string.length() == 0) || AbstractC7538v51.v(string, c)) {
            file2 = new File(string + file3);
        } else {
            file2 = new File(string + c + file3);
        }
        return file2;
    }

    public static void h(File file, String str) {
        Charset charset = AbstractC7680vr.a;
        O90.f(file, "<this>");
        O90.f(str, "text");
        O90.f(charset, "charset");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            i(fileOutputStream, str, charset);
            AbstractC2141aT1.a(fileOutputStream, null);
        } finally {
        }
    }

    public static final void i(FileOutputStream fileOutputStream, String str, Charset charset) throws IOException {
        O90.f(str, "text");
        if (str.length() < 16384) {
            byte[] bytes = str.getBytes(charset);
            O90.e(bytes, "getBytes(...)");
            fileOutputStream.write(bytes);
            return;
        }
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        CharsetEncoder charsetEncoderOnUnmappableCharacter = charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        CharBuffer charBufferAllocate = CharBuffer.allocate(8192);
        O90.c(charsetEncoderOnUnmappableCharacter);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8192 * ((int) Math.ceil(charsetEncoderOnUnmappableCharacter.maxBytesPerChar())));
        O90.e(byteBufferAllocate, "allocate(...)");
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            int iMin = Math.min(8192 - i2, str.length() - i);
            int i3 = i + iMin;
            char[] cArrArray = charBufferAllocate.array();
            O90.e(cArrArray, "array(...)");
            str.getChars(i, i3, cArrArray, i2);
            charBufferAllocate.limit(iMin + i2);
            i2 = 1;
            if (!charsetEncoderOnUnmappableCharacter.encode(charBufferAllocate, byteBufferAllocate, i3 == str.length()).isUnderflow()) {
                throw new IllegalStateException("Check failed.");
            }
            fileOutputStream.write(byteBufferAllocate.array(), 0, byteBufferAllocate.position());
            if (charBufferAllocate.position() != charBufferAllocate.limit()) {
                charBufferAllocate.put(0, charBufferAllocate.get());
            } else {
                i2 = 0;
            }
            charBufferAllocate.clear();
            byteBufferAllocate.clear();
            i = i3;
        }
    }
}
