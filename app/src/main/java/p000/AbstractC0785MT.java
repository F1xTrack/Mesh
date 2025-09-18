package p000;

import expo.modules.filesystem.FileSystemUploadType;

/* renamed from: MT */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC0785MT {

    /* renamed from: a */
    public static final /* synthetic */ int[] f7171a;

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
        f7171a = iArr;
    }
}
