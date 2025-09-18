package p000;

import java.io.File;
import java.io.IOException;
import java.util.Locale;

/* renamed from: ou */
/* loaded from: classes.dex */
public class C6583ou extends IOException {
    public /* synthetic */ C6583ou(IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C6583ou(int i, int i2, int i3, IndexOutOfBoundsException indexOutOfBoundsException) {
        Locale locale = Locale.US;
        StringBuilder sbM26239p = AbstractC7222ym.m26239p("Pos: ", i, ", limit: ");
        sbM26239p.append(i2);
        sbM26239p.append(", len: ");
        sbM26239p.append(i3);
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(sbM26239p.toString()), indexOutOfBoundsException);
    }

    public C6583ou(String str, File file, File file2) {
        O90.m5968f(file, "file");
        StringBuilder sb = new StringBuilder(file.toString());
        if (file2 != null) {
            sb.append(" -> " + file2);
        }
        if (str != null) {
            sb.append(": ".concat(str));
        }
        String string = sb.toString();
        O90.m5967e(string, "toString(...)");
        super(string);
    }

    public C6583ou(int i, IOException iOException, String str) {
        super(str + ", status code: " + i, iOException);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6583ou(String str, IndexOutOfBoundsException indexOutOfBoundsException, int i) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(str), indexOutOfBoundsException);
        switch (i) {
            case 16:
                super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(str), indexOutOfBoundsException);
                break;
            case 17:
                super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(str), indexOutOfBoundsException);
                break;
            default:
                break;
        }
    }
}
