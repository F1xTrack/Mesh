package org.aomedia.avif.android;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public abstract class AvifDecoder {

    public static class Info {
        public int depth;
        public int height;
        public int width;
    }

    static {
        try {
            System.loadLibrary("avif_android");
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static boolean m23565a(ByteBuffer byteBuffer) {
        return isAvifImage(byteBuffer, byteBuffer.remaining());
    }

    public static native boolean decode(ByteBuffer byteBuffer, int i, Bitmap bitmap);

    public static native boolean getInfo(ByteBuffer byteBuffer, int i, Info info);

    private static native boolean isAvifImage(ByteBuffer byteBuffer, int i);
}
