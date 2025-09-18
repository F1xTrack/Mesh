package p000;

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
public abstract class AbstractC6366lU extends AbstractC8799b12 {
    /* renamed from: b */
    public static void m22432b(File file, File file2, boolean z, int i) throws C6583ou {
        if ((i & 2) != 0) {
            z = false;
        }
        O90.m5968f(file, "<this>");
        O90.m5968f(file2, "target");
        if (!file.exists()) {
            throw new C6302kT("The source file doesn't exist.", file, null);
        }
        if (file2.exists()) {
            if (!z) {
                throw new C6302kT("The destination file already exists.", file, file2);
            }
            if (!file2.delete()) {
                throw new C6302kT("Tried to overwrite the destination, but failed to delete it.", file, file2);
            }
        }
        if (file.isDirectory()) {
            if (!file2.mkdirs()) {
                throw new C6583ou("Failed to create target directory.", file, file2);
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
                NP1.m5671a(fileInputStream, fileOutputStream, 8192);
                AbstractC8729aT1.m9749a(fileOutputStream, null);
                AbstractC8729aT1.m9749a(fileInputStream, null);
            } finally {
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC8729aT1.m9749a(fileInputStream, th);
                throw th2;
            }
        }
    }

    /* renamed from: c */
    public static boolean m22433c(File file) {
        O90.m5968f(file, "<this>");
        EnumC6303kU enumC6303kU = EnumC6303kU.f36507a;
        C3931dU c3931dU = new C3931dU(new C4056fU(file));
        while (true) {
            boolean z = true;
            while (c3931dU.hasNext()) {
                File file2 = (File) c3931dU.next();
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

    /* renamed from: d */
    public static byte[] m22434d(File file) {
        O90.m5968f(file, "<this>");
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
                O90.m5967e(bArrCopyOf, "copyOf(...)");
            } else {
                int i5 = fileInputStream.read();
                if (i5 != -1) {
                    C6823sR c6823sR = new C6823sR(8193);
                    c6823sR.write(i5);
                    NP1.m5671a(fileInputStream, c6823sR, 8192);
                    int size = c6823sR.size() + i;
                    if (size < 0) {
                        throw new OutOfMemoryError("File " + file + " is too big to fit in memory.");
                    }
                    byte[] bArrM24742m = c6823sR.m24742m();
                    bArrCopyOf = Arrays.copyOf(bArrCopyOf, size);
                    O90.m5967e(bArrCopyOf, "copyOf(...)");
                    AbstractC0576J8.m4181h(bArrM24742m, i, 0, bArrCopyOf, c6823sR.size());
                }
            }
            AbstractC8729aT1.m9749a(fileInputStream, null);
            return bArrCopyOf;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC8729aT1.m9749a(fileInputStream, th);
                throw th2;
            }
        }
    }

    /* renamed from: e */
    public static ArrayList m22435e(File file) {
        Charset charset = AbstractC7038vr.f44561a;
        O90.m5968f(file, "<this>");
        O90.m5968f(charset, "charset");
        ArrayList arrayList = new ArrayList();
        C6429mU c6429mU = new C6429mU(arrayList, 0);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), charset));
        try {
            Iterator it = ((C0564Ix) AbstractC9639hY0.m18826e(new C0764M8(2, bufferedReader))).iterator();
            while (it.hasNext()) {
                c6429mU.invoke(it.next());
            }
            AbstractC8729aT1.m9749a(bufferedReader, null);
            return arrayList;
        } finally {
        }
    }

    /* renamed from: f */
    public static String m22436f(File file) {
        Charset charset = AbstractC7038vr.f44561a;
        O90.m5968f(file, "<this>");
        O90.m5968f(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            String strM25640d = AbstractC11551wU1.m25640d(inputStreamReader);
            AbstractC8729aT1.m9749a(inputStreamReader, null);
            return strM25640d;
        } finally {
        }
    }

    /* renamed from: g */
    public static File m22437g(File file, String str) {
        int length;
        File file2;
        int iM25361z;
        O90.m5968f(file, "<this>");
        O90.m5968f(str, "relative");
        File file3 = new File(str);
        String path = file3.getPath();
        O90.m5967e(path, "getPath(...)");
        char c = File.separatorChar;
        int iM25361z2 = AbstractC11374v51.m25361z(path, c, 0, false, 4);
        if (iM25361z2 != 0) {
            length = (iM25361z2 <= 0 || path.charAt(iM25361z2 + (-1)) != ':') ? (iM25361z2 == -1 && AbstractC11374v51.m25357v(path, ':')) ? path.length() : 0 : iM25361z2 + 1;
        } else if (path.length() <= 1 || path.charAt(1) != c || (iM25361z = AbstractC11374v51.m25361z(path, c, 2, false, 4)) < 0) {
            length = 1;
        } else {
            int iM25361z3 = AbstractC11374v51.m25361z(path, c, iM25361z + 1, false, 4);
            length = iM25361z3 >= 0 ? iM25361z3 + 1 : path.length();
        }
        if (length > 0) {
            return file3;
        }
        String string = file.toString();
        O90.m5967e(string, "toString(...)");
        if ((string.length() == 0) || AbstractC11374v51.m25357v(string, c)) {
            file2 = new File(string + file3);
        } else {
            file2 = new File(string + c + file3);
        }
        return file2;
    }

    /* renamed from: h */
    public static void m22438h(File file, String str) {
        Charset charset = AbstractC7038vr.f44561a;
        O90.m5968f(file, "<this>");
        O90.m5968f(str, "text");
        O90.m5968f(charset, "charset");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            m22439i(fileOutputStream, str, charset);
            AbstractC8729aT1.m9749a(fileOutputStream, null);
        } finally {
        }
    }

    /* renamed from: i */
    public static final void m22439i(FileOutputStream fileOutputStream, String str, Charset charset) throws IOException {
        O90.m5968f(str, "text");
        if (str.length() < 16384) {
            byte[] bytes = str.getBytes(charset);
            O90.m5967e(bytes, "getBytes(...)");
            fileOutputStream.write(bytes);
            return;
        }
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        CharsetEncoder charsetEncoderOnUnmappableCharacter = charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        CharBuffer charBufferAllocate = CharBuffer.allocate(8192);
        O90.m5965c(charsetEncoderOnUnmappableCharacter);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8192 * ((int) Math.ceil(charsetEncoderOnUnmappableCharacter.maxBytesPerChar())));
        O90.m5967e(byteBufferAllocate, "allocate(...)");
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            int iMin = Math.min(8192 - i2, str.length() - i);
            int i3 = i + iMin;
            char[] cArrArray = charBufferAllocate.array();
            O90.m5967e(cArrArray, "array(...)");
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
