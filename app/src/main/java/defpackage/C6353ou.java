package defpackage;

import java.io.File;
import java.io.IOException;
import java.util.Locale;

/* renamed from: ou, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6353ou extends IOException {
    public /* synthetic */ C6353ou(IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C6353ou(int i, int i2, int i3, IndexOutOfBoundsException indexOutOfBoundsException) {
        Locale locale = Locale.US;
        StringBuilder sbP = AbstractC8235ym.p("Pos: ", i, ", limit: ");
        sbP.append(i2);
        sbP.append(", len: ");
        sbP.append(i3);
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(sbP.toString()), indexOutOfBoundsException);
    }

    public C6353ou(String str, File file, File file2) {
        O90.f(file, "file");
        StringBuilder sb = new StringBuilder(file.toString());
        if (file2 != null) {
            sb.append(" -> " + file2);
        }
        if (str != null) {
            sb.append(": ".concat(str));
        }
        String string = sb.toString();
        O90.e(string, "toString(...)");
        super(string);
    }

    public C6353ou(int i, IOException iOException, String str) {
        super(str + ", status code: " + i, iOException);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6353ou(String str, IndexOutOfBoundsException indexOutOfBoundsException, int i) {
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
