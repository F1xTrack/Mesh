package defpackage;

import expo.modules.filesystem.DownloadOptions;
import expo.modules.filesystem.FileSystemUploadOptions;
import expo.modules.filesystem.InfoOptions;
import expo.modules.filesystem.ReadingOptions;
import expo.modules.filesystem.WritingOptions;

/* loaded from: classes2.dex */
public final class ST extends AbstractC1676Vg0 implements InterfaceC5908mZ {
    public final /* synthetic */ int e;
    public static final ST f = new ST(0, 0);
    public static final ST g = new ST(0, 1);
    public static final ST h = new ST(0, 2);
    public static final ST i = new ST(0, 3);
    public static final ST j = new ST(0, 4);
    public static final ST k = new ST(0, 5);
    public static final ST l = new ST(0, 6);
    public static final ST m = new ST(0, 7);
    public static final ST n = new ST(0, 8);
    public static final ST o = new ST(0, 9);
    public static final ST p = new ST(0, 10);
    public static final ST q = new ST(0, 11);
    public static final ST r = new ST(0, 12);
    public static final ST s = new ST(0, 13);
    public static final ST t = new ST(0, 14);
    public static final ST u = new ST(0, 15);
    public static final ST v = new ST(0, 16);
    public static final ST w = new ST(0, 17);
    public static final ST x = new ST(0, 18);
    public static final ST y = new ST(0, 19);
    public static final ST z = new ST(0, 20);
    public static final ST A = new ST(0, 21);
    public static final ST B = new ST(0, 22);
    public static final ST C = new ST(0, 23);
    public static final ST D = new ST(0, 24);
    public static final ST E = new ST(0, 25);
    public static final ST F = new ST(0, 26);
    public static final ST G = new ST(0, 27);
    public static final ST H = new ST(0, 28);
    public static final ST I = new ST(0, 29);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ST(int i2, int i3) {
        super(i2);
        this.e = i3;
    }

    @Override // defpackage.InterfaceC5908mZ
    public final Object invoke() {
        switch (this.e) {
            case 0:
                return BP0.b(String.class);
            case 1:
                return BP0.c(String.class);
            case 2:
                return BP0.c(InfoOptions.class);
            case 3:
                return BP0.c(String.class);
            case 4:
                return BP0.c(String.class);
            case 5:
                return BP0.c(String.class);
            case 6:
                return BP0.c(String.class);
            case 7:
                return BP0.c(String.class);
            case 8:
                return BP0.c(String.class);
            case 9:
                return BP0.c(String.class);
            case 10:
                return BP0.c(String.class);
            case 11:
                return BP0.c(String.class);
            case 12:
                return BP0.c(ReadingOptions.class);
            case 13:
                return BP0.c(String.class);
            case 14:
                return BP0.c(String.class);
            case 15:
                return BP0.c(WritingOptions.class);
            case 16:
                return BP0.c(FileSystemUploadOptions.class);
            case 17:
                return BP0.c(String.class);
            case 18:
                return BP0.b(String.class);
            case 19:
                return BP0.c(DownloadOptions.class);
            case 20:
                return BP0.c(String.class);
            case 21:
                return BP0.c(String.class);
            case 22:
                return BP0.c(String.class);
            case 23:
                return BP0.c(DownloadOptions.class);
            case 24:
                return BP0.b(String.class);
            case 25:
                return BP0.b(String.class);
            case 26:
                return BP0.c(String.class);
            case 27:
                return BP0.c(String.class);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return BP0.c(FileSystemUploadOptions.class);
            default:
                return BP0.c(String.class);
        }
    }
}
