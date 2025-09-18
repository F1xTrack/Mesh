package defpackage;

import expo.modules.filesystem.FileSystemUploadType;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class MT {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[FileSystemUploadType.values().length];
        try {
            iArr[FileSystemUploadType.BINARY_CONTENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[FileSystemUploadType.MULTIPART.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
